/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import model.DatabaseInterface;
import model.Expense;
import model.ExpenseExpert;
import model.ModelPackage;
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
		//TODO hämta expenses och residents
		EList<String[]> queryResult = database.query("SELECT * FROM tblRooms");
		if (queryResult != null) {
			for (String[] row : queryResult) {
				Room room = new RoomImpl();
				ExpenseExpert ee = new ExpenseExpertImpl();
				ee.ExpenseExpert(database);
				Expense price = ee.getExpense(Integer.parseInt(row[7]));
				room.Room(number, description, type, price, beds); // TODO: lägg till rätt grejor
				//Get the residents if there is someone occupying the room at the moment
				if (room.getStatus().equals("occupied")) {
					EList<String[]> queryResult = database.query("SELECT tblResidents.IDNumber, tblResidents.FirstName, tblResidents.LastName FROM tblStays "
						    + "LEFT JOIN tblStayResidents ON tblStays.StayID=tblStayResidents.StayID "
						    + "LEFT JOIN tblResidents ON tblStayResidents.ResidentID=tblResidents.IDNumber "
						    + "WHERE tblStays.RoomID=" + room.getNumber() + " and tblStays.StayID=("
						    + "SELECT MAX(StayID) FROM tblStays WHERE tblStays.RoomID=" + room.getNumber() + ") "
						    + "GROUP BY tblResidents.IDNumber");
					for (String resident[] : queryResult) {
						Resident res = new ResidentImpl();
						res.Resident(resident[1], resident[2], resident[0]);
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
		EList<String> availableTypes = new BasicEList<String>();
		HashMap<String, Integer> bookedTypes = new HashMap<String, Integer>();
		HashMap<String, Integer> totalTypes = new HashMap<String, Integer>();
		// Convert date object to milliseconds from the "epoch"
		Calendar cal = Calendar.getInstance();
		cal.setTime(from);
		long fromMillis = cal.getTimeInMillis();
		cal.setTime(to);
		long toMillis = cal.getTimeInMillis();
		
		// Connect to database and get all calendar bookings regarding the desired dates
		// TODO: change for the dates to make sense
		EList<String[]> queryResult = database.query("SELECT RoomType, COUNT(RoomType) FROM tblCalendar WHERE "
				+ "(FromDate < " + fromMillis + " AND ToDate < " + fromMillis + ") OR "
				+ "(FromDate > " + fromMillis + " AND ToDate > " + toMillis + ") OR "
				+ "(FromDate < " + toMillis + " AND ToDate > " + to + ") "
				+ "GROUP BY RoomType");
		if (queryResult != null) {
			for (String[] row : queryResult) {
				bookedTypes.put(row[0], Integer.parseInt(row[1]));
			}
		}
		// Get the room types and the amount of them
		queryResult = database.query("SELECT RoomType, COUNT(RoomType) FROM tblRooms WHERE Beds >= " + numberOfGuests + " GROUP BY RoomType");
		if (queryResult != null) {
			for (String[] row : queryResult) {
				totalTypes.put(row[0], Integer.parseInt(row[1]));
			}
		}
		
		for (String type : totalTypes.keySet()) {
			int numBooked = (bookedTypes.get(type) != null) ? bookedTypes.get(type) : 0;
			int numAvailable = totalTypes.get(type) - numBooked;
			if (numAvailable >= numberOfRooms) {
				availableTypes.add(type);
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
		
		EList<String[]> queryResult = database.query("SELECT * FROM tblRooms WHERE Status='unoccupied'");
		if (queryResult != null) {
			for (String[] roomSpec : queryResult) {
				Room room = new RoomImpl();
				ExpenseExpert ee = new ExpenseExpertImpl();
				ee.ExpenseExpert(database);
				Expense price = ee.getExpense(Integer.parseInt(roomSpec[7]));
				room.Room(Integer.parseInt(roomSpec[0]), roomSpec[1], roomSpec[4], price, Integer.parseInt(roomSpec[6])); //TODO: add status
				result.add(room);
			}
		}
		
		//TODO: Hämta och lägg till residents för rummet
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addRoom(Room room) {
		boolean result = false;
		
		// TODO: what are the value types? will this work with expense??
		result = database.send("INSERT into tblRooms('RoomNumber', 'RoomDescription', 'Maintenance', 'RoomIsClean', 'RoomType', 'Status', 'Beds', 'ExpenseID') "
				+ "VALUES(" + room.getNumber() + ", " + room.getDescription() + ", " + false +", " + false + ", " + room.getType() + ", "
						+ room.getStatus() + ", " + room.getBeds() + ", " + room.getPrice().getID() + ")");
		
		return result;
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
		
		// TODO
		result = database.send("UPDATE tblRooms SET ExpenseID=" + room.getPrice().getID() + ","
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
		 
		 EList<String[]> queryResult = database.query("SELECT * FROM tblRooms WHERE RoomNumber=" + roomNumber);
		 if (queryResult != null) {
			 result = new RoomImpl();
			 String[] roomSpec = queryResult.get(0);
			 ExpenseExpert ee = new ExpenseExpertImpl();
			 ee.ExpenseExpert(database);
			 Expense price = ee.getExpense(Integer.parseInt(roomSpec[7]));
			 result.Room(Integer.parseInt(roomSpec[0]), roomSpec[1], roomSpec[4], price, Integer.parseInt(roomSpec[6])); //TODO: add status
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
