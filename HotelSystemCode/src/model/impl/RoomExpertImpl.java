/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import model.DatabaseInterface;
import model.Expense;
import model.ExpenseExpert;
import model.ModelPackage;
import model.Receipt;
import model.ReceiptExpert;
import model.Resident;
import model.Room;
import model.RoomExpert;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Expert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.RoomExpertImpl#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomExpertImpl extends MinimalEObjectImpl.Container implements RoomExpert {
	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected DatabaseInterface database;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomExpertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ROOM_EXPERT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseInterface getDatabase() {
		if (database != null && database.eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject)database;
			database = (DatabaseInterface)eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ROOM_EXPERT__DATABASE, oldDatabase, database));
			}
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseInterface basicGetDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(DatabaseInterface newDatabase) {
		DatabaseInterface oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM_EXPERT__DATABASE, oldDatabase, database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room> getAllRooms() {
		EList<Room> result = new BasicEList<Room>();
		EList<String> queryResult = database.query("SELECT RoomNumber, RoomDescription, RoomType, ExpenseID, Beds, Status FROM tblRooms");
		if (queryResult != null) {
			for (String rowFull : queryResult) {
				String[] row = rowFull.split(";", -1);
				String receiptID = database.query("SELECT tblStays.ReceiptID FROM tblRooms LEFT JOIN tblStays ON "
				 		+ "tblRooms.RoomNumber=tblStays.RoomID WHERE RoomNumber=" + row[0] + " ORDER BY tblStays.StayID DESC LIMIT 0,1").get(0);
				Room room = new RoomImpl();
				ExpenseExpert ee = new ExpenseExpertImpl();
				ee.ExpenseExpert(database);
				Expense price = ee.getExpense(Integer.parseInt(row[3]));
				ReceiptExpert re = new ReceiptExpertImpl();
				re.ReceiptExpert(database);
				Receipt receipt = new ReceiptImpl();
				if (receiptID.length() > 0) {
					receipt = re.getReceipt(Integer.parseInt(receiptID));
				}
				room.Room(Integer.parseInt(row[0]), row[1], row[2], price, Integer.parseInt(row[4]), row[5], receipt);
				//Get the residents if there is someone occupying the room at the moment
				if (room.getStatus().equals("occupied")) {
					EList<String> queryResult2 = database.query("SELECT tblResidents.IDNumber, tblResidents.FirstName, tblResidents.LastName FROM tblStays "
						    + "LEFT JOIN tblStayResidents ON tblStays.StayID=tblStayResidents.StayID "
						    + "LEFT JOIN tblResidents ON tblStayResidents.ResidentID=tblResidents.IDNumber "
						    + "WHERE tblStays.RoomID=" + room.getNumber() + " and tblStays.StayID=("
						    + "SELECT MAX(StayID) FROM tblStays WHERE tblStays.RoomID=" + room.getNumber() + ") "
						    + "GROUP BY tblResidents.IDNumber");
					for (String residentFull : queryResult2) {
						String[] resident = residentFull.split(";", -1);
						Resident res = new ResidentImpl();
						res.Resident(resident[1], resident[2], resident[0]);
						room.getResidents().add(res);
					}
				}
				result.add(room);
			}
		}
		
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room> getAvailableRoomTypes(Date from, Date to, int numberOfRooms, int numberOfGuests) {
		EList<Room> availableTypes = new BasicEList<Room>();
		HashMap<String, Integer> bookedTypes = new HashMap<String, Integer>();
		HashMap<String, Integer> totalTypes = new HashMap<String, Integer>();
		SimpleDateFormat dateFormat = new SimpleDateFormat("#dd/MM/yyyy#");
		//long fromMillis = from.getTime(); //TODO remove this when all is working
		//long toMillis = to.getTime();
		
		// Connect to database and get all calendar bookings regarding the desired dates
		EList<String> queryResult = database.query("SELECT RoomType, COUNT(RoomType) FROM tblCalendar WHERE "
				+ "(FromDate < " + dateFormat.format(from) + " AND ToDate < " + dateFormat.format(from) + ") OR "
				+ "(FromDate > " + dateFormat.format(from) + " AND ToDate > " + dateFormat.format(to) + ") OR "
				+ "(FromDate < " + dateFormat.format(to) + " AND ToDate > " + dateFormat.format(to) + ") "
				+ "GROUP BY RoomType");
		if (queryResult != null) {
			for (String rowFull : queryResult) {
				String[] row = rowFull.split(";", -1);
				bookedTypes.put(row[0], Integer.parseInt(row[1]));
			}
		}
		// Get the room types and the amount of them
		queryResult = database.query("SELECT RoomType, COUNT(RoomType) FROM tblRooms WHERE Beds >= " + numberOfGuests + " GROUP BY RoomType");
		if (queryResult != null) {
			for (String rowFull : queryResult) {
				String[] row = rowFull.split(";", -1);
				totalTypes.put(row[0], Integer.parseInt(row[1]));
			}
		}
		
		for (String type : totalTypes.keySet()) {
			int numBooked = (bookedTypes.get(type) != null) ? bookedTypes.get(type) : 0;
			int numAvailable = totalTypes.get(type) - numBooked;
			if (numAvailable >= numberOfRooms) {
				EList<String> queryResult2 = database.query("SELECT RoomNumber, RoomDescription, RoomType, ExpenseID, Beds, Status FROM tblRooms WHERE RoonType=" + type + " LIMIT 0,1");
				if (queryResult2 != null) {
					String[] roomSpec = queryResult2.get(0).split(";", -1);
					Room room = new RoomImpl();
					ExpenseExpert ee = new ExpenseExpertImpl();
					ee.ExpenseExpert(database);
					Expense price = ee.getExpense(Integer.parseInt(roomSpec[7]));
					room.Room(Integer.parseInt(roomSpec[0]), roomSpec[1], roomSpec[2], price, Integer.parseInt(roomSpec[4]), roomSpec[5], new ReceiptImpl());
					availableTypes.add(room);
				}
			}
		}
		return availableTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room> getUnoccupiedRooms() {
		EList<Room> result = new BasicEList<Room>();
		EList<String> queryResult = database.query("SELECT RoomNumber, RoomDescription, RoomType, ExpenseID, Beds, Status FROM tblRooms WHERE Status='unoccupied'");
		if (queryResult != null) {
			for (String roomSpecFull : queryResult) {
				String[] roomSpec = roomSpecFull.split(";", -1);
				Room room = new RoomImpl();
				ExpenseExpert ee = new ExpenseExpertImpl();
				ee.ExpenseExpert(database);
				Expense price = ee.getExpense(Integer.parseInt(roomSpec[3]));
				room.Room(Integer.parseInt(roomSpec[0]), roomSpec[1], roomSpec[2], price, Integer.parseInt(roomSpec[4]), roomSpec[5], new ReceiptImpl());
				result.add(room);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Room addRoom(Room room) {
		boolean result = false;
		
		ExpenseExpert ee = new ExpenseExpertImpl();
		ee.ExpenseExpert(database);
		
		Expense newExpense = ee.addExpense(room.getPrice());
		
		result = database.send("INSERT into tblRooms(RoomNumber, RoomDescription, Maintenance, RoomIsClean, RoomType, Status, Beds, ExpenseID) "
				+ "VALUES(" + room.getNumber() + ", '" + room.getDescription() + "', " + false +", " + false + ", '" + room.getType() + "', '"
						+ room.getStatus() + "', " + room.getBeds() + ", " + newExpense.getId() + ")");
		if (!result) {
			return null;
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeRoom(Room room) {
		boolean result = false;
		
		result = database.send("DELETE FROM tblRooms WHERE RoomNumber=" + room.getNumber());
		
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean updateRoom(Room room) {
		boolean result = false;
		
		result = database.send("UPDATE tblRooms SET ExpenseID=" + room.getPrice().getId() + ","
				+ "RoomDescription='" + room.getDescription() + "',"
				+ "RoomIsClean=" + room.isClean() +","
				+ "RoomType='" + room.getType() +"',"
				+ "Status='" + room.getStatus() +"',"
				+ "Beds=" + room.getBeds() + " WHERE RoomNumber=" + room.getNumber());
		
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Room getRoom(int roomNumber) {
		 Room result = null;
		 EList<String> queryResult = database.query("SELECT RoomNumber, RoomDescription, Maintenance, RoomIsClean, RoomType, Status, Beds, ExpenseID, tblStays.ReceiptID FROM tblRooms LEFT JOIN tblStays ON "
		 		+ "tblRooms.RoomNumber=tblStays.RoomID WHERE RoomNumber=" + roomNumber + " ORDER BY tblStays.StayID DESC LIMIT 0,1");
		 if (queryResult != null) {
			 result = new RoomImpl();
			 String[] roomSpec = queryResult.get(0).split(";", -1);
			 ExpenseExpert ee = new ExpenseExpertImpl();
			 ee.ExpenseExpert(database);
			 Expense price = ee.getExpense(Integer.parseInt(roomSpec[7]));
			 ReceiptExpert re = new ReceiptExpertImpl();
			 re.ReceiptExpert(database);
			 Receipt receipt = re.getReceipt(Integer.parseInt(roomSpec[8]));
			 result.Room(Integer.parseInt(roomSpec[0]), roomSpec[1], roomSpec[4], price, Integer.parseInt(roomSpec[6]), roomSpec[5], receipt);
		 }
		 return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void RoomExpert(DatabaseInterface database) {
		this.database = database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ROOM_EXPERT__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.ROOM_EXPERT__DATABASE:
				setDatabase((DatabaseInterface)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.ROOM_EXPERT__DATABASE:
				setDatabase((DatabaseInterface)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.ROOM_EXPERT__DATABASE:
				return database != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.ROOM_EXPERT___GET_ALL_ROOMS:
				return getAllRooms();
			case ModelPackage.ROOM_EXPERT___GET_AVAILABLE_ROOM_TYPES__DATE_DATE_INT_INT:
				return getAvailableRoomTypes((Date)arguments.get(0), (Date)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ModelPackage.ROOM_EXPERT___GET_UNOCCUPIED_ROOMS:
				return getUnoccupiedRooms();
			case ModelPackage.ROOM_EXPERT___ADD_ROOM__ROOM:
				return addRoom((Room)arguments.get(0));
			case ModelPackage.ROOM_EXPERT___REMOVE_ROOM__ROOM:
				return removeRoom((Room)arguments.get(0));
			case ModelPackage.ROOM_EXPERT___UPDATE_ROOM__ROOM:
				return updateRoom((Room)arguments.get(0));
			case ModelPackage.ROOM_EXPERT___GET_ROOM__INT:
				return getRoom((Integer)arguments.get(0));
			case ModelPackage.ROOM_EXPERT___ROOM_EXPERT__DATABASEINTERFACE:
				RoomExpert((DatabaseInterface)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomExpertImpl
