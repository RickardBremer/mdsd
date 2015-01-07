/**
 */
package model.impl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import model.Booking;
import model.BookingExpert;
import model.Customer;
import model.DatabaseInterface;
import model.Expense;
import model.ModelPackage;
import model.ReceiptExpert;
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
 * An implementation of the model object '<em><b>Booking Expert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.BookingExpertImpl#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingExpertImpl extends MinimalEObjectImpl.Container implements BookingExpert {
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
	protected BookingExpertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BOOKING_EXPERT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BOOKING_EXPERT__DATABASE, oldDatabase, database));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING_EXPERT__DATABASE, oldDatabase, database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking getBooking(int ID) {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		String[] response = database.query("SELECT 'BookingID', 'DateFrom', 'DateTo', 'ClientRequests', 'CustomerMail', 'PromotionCode' , 'ReceiptID' FROM tblBookings WHERE BookingID =" + ID + ";").get(0).split(";",-1);
		String[] roomtype = database.query("SELECT 'RoomType' FROM tblCalender, tblBookings WHERE tblBookings.BookingID = tblCalender.BookingID AND tblBookings.BookingID = " + ID  + ";").get(0).split(";",-1);
		String[] customer = database.query("SELECT 'FirstName' , 'EMail', 'LastName' , 'Address', 'CCNumber' , 'CCV' , 'ExpiringMonth' , 'ExpiringYear' FROM tblCostumer WHERE Email = " + response[4] + ";").get(0).split(";",-1);
				
		if(response != null && roomtype != null && customer != null){
			
			EList<String> rooms = new BasicEList<String>();
					
			for(int i = 0; i < roomtype.length; i++){
					rooms.add(roomtype[i]);
				}
			
			Customer c = new CustomerImpl();
			c.Customer(customer[0], customer[1], customer[2], customer[3], customer[4], customer[5], Integer.parseInt(customer[5]), Integer.parseInt(customer[6]));
			
			Booking b = new BookingImpl();
			
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(Long.parseLong(response[0]));
			Date d = cal.getTime();
			cal.setTimeInMillis(Long.parseLong(response[1]));
			Date e = cal.getTime();
					
			ReceiptExpert r = new ReceiptExpertImpl();
			r.ReceiptExpert(database);
			
			b.Booking( d, e, response[2], c, rooms, response[4], Integer.parseInt(response[5]), null, r.getReceipt(Integer.parseInt(response[6])));
			
			return b; 
			
		}
				return null;
		
		
	//	throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	Michael
	public EList<Booking> getAllBookings(Date dateFrom, Date dateTo) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList <String> responseResult; 
		EList <String> roomType;
		EList <String> roomId;
		EList <Room> rooms = new BasicEList<Room>();
		EList<Booking> returnedBookingList = new BasicEList<Booking>(); 
		String customerMail;
		Calendar cal = Calendar.getInstance();
		Date convertDateTo;
		Date convertDateFrom;
		SimpleDateFormat dateFormat = new SimpleDateFormat("#MM/dd/yyyy#");
		
		responseResult = database.query("SELECT 'tblBookings.BookingID','tblBookings.CustomerMail', 'tblBookings.ClientRequest', 'tblBookings.PromotionCode',  'tblCalendar.DateFrom', 'tblCalendar.DateTo'  FROM tblBookings LEFT JOIN tblCalendar"
				+ "WHERE tblCalendar.DateTo <" + dateFormat.format(dateTo) + "AND tblCalendar.DateFrom >" + dateFormat.format(dateFrom) + ";");
			
			for(String booking: responseResult) {
				
					
				
				String[] newList = booking.split(";", -1);
				Booking searchBooking = new BookingImpl();
				
//				searchBooking.Booking(fromDate, toDate, wishes, customer, roomTypes, promotionCode, id, rooms);
				customerMail= database.query("SELECT * FROM tblCustomer WHERE tblCustomer.EMail='" + newList[1] + "';").get(0);
				Customer newCustomer = new CustomerImpl();
				String[] oneCustomer = customerMail.split(";");
				
				newCustomer.Customer(oneCustomer[0], oneCustomer[1], oneCustomer[2], oneCustomer[3], oneCustomer[4], oneCustomer[5], Integer.valueOf(oneCustomer[6]), Integer.valueOf(oneCustomer[7]));
				roomType = database.query("SELECT 'RoomType' FROM tblCalendar WHERE BookingID=" + newList[0] + ";" );
				
				  cal.setTimeInMillis(Long.parseLong(newList[5]));
				  convertDateTo = cal.getTime();
				  cal.setTimeInMillis(Long.parseLong(newList[4]));
				  convertDateFrom =cal.getTime();
						  
				roomId = database.query("SELECT 'RoomId FROM tblStays WHERE BookingID=" + newList[0] + ";");
				
				
				
				for(String resultRoomId:roomId) {
					
					RoomExpert newRoom = new RoomExpertImpl();
					rooms.add(newRoom.getRoom(Integer.valueOf(resultRoomId)));
				}
				 
				ReceiptExpert r = new ReceiptExpertImpl();
				r.ReceiptExpert(database);
				
				searchBooking.Booking(convertDateFrom, convertDateTo, newList[2], newCustomer, roomType, newList[3], Integer.valueOf(newList[0]), rooms, r.getReceipt(0));
				returnedBookingList.add(searchBooking);
				
			}
			
			
			return returnedBookingList;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking addBooking(Booking booking) {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		SimpleDateFormat dateFormat = new SimpleDateFormat("#MM/dd/yyyy#");
	
		boolean customer = database.send("INSERT INTO tblCustomers (FirstName, LastName, EMail, Address, CCNumber, CCV, ExpiringMonth, ExpiringYear) VALUES('"
				+ booking.getCustomer().getFirstName()
				+ "','"
				+ booking.getCustomer().getSurname()
				+ "','"
				+ booking.getCustomer().getEmail()
				+ "','"
				+ booking.getCustomer().getAdress()
				+ "','"
				+ booking.getCustomer().getCcNumber()
				+ "','"
				+ booking.getCustomer().getCcv()
				+ "',"
				+ booking.getCustomer().getExpiringMonth()
				+ ","
				+ booking.getCustomer().getExpiringYear()
				+ ");");
		
		boolean value = database.send("INSERT INTO tblBookings (CustomerMail, ClientRequests, PromotionCode) VALUES('"
				+ booking.getCustomer().getEmail()
				+ "','"
				+ booking.getWishes()
				+ "','"
				+ booking.getPromotion()
				+ "');");

		if(value){
			
			String[] ID = database.query("SELECT BookingID,ReceiptID FROM tblBookings WHERE CustomerMail = '" + booking.getCustomer().getEmail() + "' AND ClientRequests = '"
		    + booking.getWishes() + "' AND PromotionCode = '" + booking.getPromotion() + "' ORDER BY BookingID DESC"
		    + ";").get(0).split(";",-1);
			ReceiptExpert re = new ReceiptExpertImpl();
			re.ReceiptExpert(database);
			booking.setReceipt(re.getReceipt(Integer.valueOf(ID[1])));
			
		int BookingID = Integer.valueOf(ID[0]);
		booking.setId(BookingID);
		
		
		boolean value1 = false;
		for(int i = 0; i < booking.getRoomTypes().size(); i++){
		value1 = database.send("INSERT INTO tblCalendar (RoomType, DateFrom, DateTo, BookingID) VALUES('"
				+ booking.getRoomTypes().get(i)
				+ "',"
				+ dateFormat.format(booking.getFromDate().getTime())
				+ ","
				+ dateFormat.format(booking.getToDate().getTime())
				+ ","
				+ booking.getId()
				+ ");");
	}
		
		if(value1)
			System.out.println("True\n");
	 
		return booking;
		}
		
		return null;
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeBooking(Booking booking) {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		boolean removeTblBookings = database.send("DELETE FROM tblBookings Where BookingID=" + booking.getId() + ";");
		boolean removeTblCalender = database.send("DELETE FROM tblCalender WHERE BookingID=" + booking.getId() + ";" );
		if(removeTblBookings && removeTblCalender){
			return true;
		}
		else{
			return false;
		}
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean updateBooking(Booking booking) {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		SimpleDateFormat dateFormat = new SimpleDateFormat("#MM/dd/yyyy#");
		String Mail[] = database.query("SELECT CustomerMail FROM tblBookings WHERE BookingID =" + booking.getId() + ";").get(0).split(";",-1);
		
		
		boolean updateTblCustomer = database.send("UPDATE tblBookins SET 'FirstName'=" + booking.getCustomer().getFirstName() 
			+ ", 'LastName'=" + booking.getCustomer().getSurname() + ", 'Adress'=" + booking.getCustomer().getAdress() + ", 'CCNumber'=" 
			+ booking.getCustomer().getCcNumber() + ", 'CCV'=" + booking.getCustomer().getCcv() + ", 'ExpiringMonth'=" 
			+ booking.getCustomer().getExpiringMonth() + ", 'ExpiringYear'=" + booking.getCustomer().getExpiringYear() + " WHERE 'Email'=" + Mail[0] + ";");
		
		boolean updateTblBookings = database.send("UPDATE tblBookings SET customerMail=" + booking.getCustomer().getEmail()
			+ "clientRequests='" + booking.getWishes() + " , PromotionCode='"
			+ booking.getPromotion() + " , CheckedIn='" + booking.isCheckedIn() + " , ReceiptID='" 
			+ booking.getReceipt().getId() + "' WHERE BookingID =" + booking.getId() + ";");
		
		String[] CalenderID =  database.query("SELECT CalenderID FROM tblCalender WHERE BookingID =" + booking.getId() + ";").get(0).split(";",-1);
		
		boolean updateTblCalender = false;
		
		for(int i = 0; i < CalenderID.length; i++){
			updateTblCalender = database.send("UPDATE tblCalender SET RoomType=" + booking.getRoomTypes().get(i) + " DateFrom=" + dateFormat.format(booking.getFromDate()) 
			+ "DateTo=" + dateFormat.format(booking.getToDate()) + "WHERE CalenderID=" + CalenderID[i] + ";" );
			if(!updateTblCalender){
				i = CalenderID.length;
			}
		}
		
		if(updateTblCustomer){
			if(updateTblBookings){
				if(updateTblCalender){
					return true;
				}		
			}
		}
		
		return false;
		//throw new UnsupportedOperationException();		
	
	/*	CheckedOut */
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	Michael
	public EList<Booking> getAllBookings(Date dateFrom, Date dateTo, String surname) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		SimpleDateFormat sdf = new SimpleDateFormat("#MM/dd/yyyy#");
		EList <String> responseResult; 
		EList <String> roomType;
		EList <String> roomId;
		EList <Room> rooms = new BasicEList <Room>();
		EList<Booking> returnedBookingList = new BasicEList <Booking>(); 
		String customerMail;
		Date convertDateFrom; 
		Date convertDateTo; 
		Calendar cal = Calendar.getInstance();
		responseResult = database.query("SELECT tblBookings.BookingID,tblBookings.CustomerMail, tblBookings.ClientRequests, tblBookings.PromotionCode,  tblCalendar.DateFrom, tblCalendar.DateTo  FROM tblBookings"
			    + " INNER JOIN tblCalendar ON tblBookings.BookingID=tblCalendar.BookingID INNER JOIN tblCustomers ON tblBookings.CustomerMail = tblCustomers.EMail "
			    + "WHERE "
//			    + "tblCalendar.DateTo <" + sdf.format(dateTo) + " AND tblCalendar.DateFrom >" + sdf.format(dateFrom) + " AND "
			    		+ "tblCustomers.LastName='" + surname + "';");
	
		for(String booking: responseResult) {
			
			
			
			String[] newList = booking.split(";", -1);
			Booking searchBooking = new BookingImpl();
			
//			searchBooking.Booking(fromDate, toDate, wishes, customer, roomTypes, promotionCode, id, rooms);
			customerMail= database.query("SELECT * FROM tblCustomers WHERE tblCustomers.EMail='" + newList[1] + "';").get(0);
			Customer newCustomer = new CustomerImpl();
			String[] oneCustomer = customerMail.split(";");
			
			newCustomer.Customer(oneCustomer[0], oneCustomer[1], oneCustomer[2], oneCustomer[3], oneCustomer[4], oneCustomer[5], Integer.valueOf(oneCustomer[6]), Integer.valueOf(oneCustomer[7]));
			roomType = database.query("SELECT RoomType FROM tblCalendar WHERE BookingID=" + newList[0] + ";" );
			
			
			  
			  String[] splitArr = newList[5].substring(0, 10).split("-", -1);
			  cal.set(Integer.parseInt(splitArr[0]), Integer.parseInt(splitArr[1])-1, Integer.parseInt(splitArr[2]));
			  convertDateTo = cal.getTime();
			  String[] splitArr2 = newList[4].substring(0, 10).split("-", -1);
			  cal.set(Integer.parseInt(splitArr[0]), Integer.parseInt(splitArr[1])-1, Integer.parseInt(splitArr[2]));
			   convertDateFrom = cal.getTime();
					  
			roomId = database.query("SELECT RoomId FROM tblStays WHERE BookingID=" + Integer.valueOf(newList[0]) + ";");
			
			
			
			for(String resultRoomId:roomId) {
				
				RoomExpert newRoom = new RoomExpertImpl();
				newRoom.RoomExpert(database);
				rooms.add(newRoom.getRoom(Integer.valueOf(resultRoomId)));
			}
			
			ReceiptExpert r = new ReceiptExpertImpl();
			r.ReceiptExpert(database);
			
			searchBooking.Booking(convertDateFrom, convertDateTo, newList[2], newCustomer, roomType, newList[3], Integer.valueOf(newList[0]), rooms, r.getReceipt(0));
			returnedBookingList.add(searchBooking);
			
		}
		
		
		return returnedBookingList;
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void BookingExpert(DatabaseInterface database) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		this.database=database;
	//	throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	Michael
	public boolean checkIn(Booking booking, EList<Room> rooms) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList <String> newResident;
		System.out.println("BookingExpert Checkin \n");
		System.out.println("Room size " +rooms.size());
		for(int i = 0; i < rooms.size(); i++) {
			database.send("INSERT INTO tblStays(RoomId, BookingID)  VALUES ("+rooms.get(i).getNumber() + "," + booking.getId() + ");");
			String Stay = database.query("SELECT StayId FROM tblStays WHERE BookingID=" +booking.getId() +" ORDER BY StayId DESC").get(0);
			database.send("UPDATE tblRooms SET Status = 'occupied' WHERE roomnumber=" + rooms.get(i).getNumber() );
//				Add all residents required for booking.
				
			for(int j = 0; j < rooms.get(i).getResidents().size(); i++) {
//						Add new people to the database
				
//					String resident = database.query("SELECT ResidentID FROM tblStaysResident WHERE StayId=" + Stay + ";").get(0);
					System.out.println("Testing id print \n " + "SELECT IDNumber FROM tblResidents WHERE IDNumber='" + rooms.get(i).getResidents().get(j).getId() + "';");
					newResident= database.query("SELECT IDNumber FROM tblResidents WHERE IDNumber='" + rooms.get(i).getResidents().get(j).getId() + "';");
					
					if(newResident.size() < 1 ) {
						database.send("INSERT INTO tblResidents(IDNumber, FirstName, LastName) VALUES ('" +rooms.get(i).getResidents().get(j).getId() + "','"  +rooms.get(i).getResidents().get(j).getFirstName() + "','"  +rooms.get(i).getResidents().get(j).getSurname() + "')" );
						
					}
						
					database.send("INSERT INTO tblStayResidents(StayID,ResidentID) VALUES  (" + Stay + ",'"  +  rooms.get(i).getResidents().get(j).getId() +  "')");
					}
			
					}
		
	return	database.send("UPDATE tblBookings SET CheckedIn =true AND CheckedOut = false WHERE BookingID=" + booking.getId() + ";");
		
//		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	Michael
	public boolean checkOut(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<String> currentRooms;
		
		currentRooms = database.query("SELECT 'RoomID' FROM tblStays WHERE BookingID=" +booking.getId() + ";");
		
		for(String loop: currentRooms) {
			database.query("UPDATE tblRooms SET RoomIsClean=false AND Status='unoccupied' WHERE RoomNumber=" + Integer.parseInt(loop) + ";" );
			}
		
		return database.send("UPDATE tblBookings SET CheckedOut=true AND CheckedIn=false WHERE BookingID=" + booking.getId()+";");
		


		
//		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.BOOKING_EXPERT__DATABASE:
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
			case ModelPackage.BOOKING_EXPERT__DATABASE:
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
			case ModelPackage.BOOKING_EXPERT__DATABASE:
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
			case ModelPackage.BOOKING_EXPERT__DATABASE:
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.BOOKING_EXPERT___GET_BOOKING__INT:
				return getBooking((Integer)arguments.get(0));
			case ModelPackage.BOOKING_EXPERT___GET_ALL_BOOKINGS__DATE_DATE:
				return getAllBookings((Date)arguments.get(0), (Date)arguments.get(1));
			case ModelPackage.BOOKING_EXPERT___ADD_BOOKING__BOOKING:
				return addBooking((Booking)arguments.get(0));
			case ModelPackage.BOOKING_EXPERT___REMOVE_BOOKING__BOOKING:
				return removeBooking((Booking)arguments.get(0));
			case ModelPackage.BOOKING_EXPERT___UPDATE_BOOKING__BOOKING:
				return updateBooking((Booking)arguments.get(0));
			case ModelPackage.BOOKING_EXPERT___GET_ALL_BOOKINGS__DATE_DATE_STRING:
				return getAllBookings((Date)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2));
			case ModelPackage.BOOKING_EXPERT___BOOKING_EXPERT__DATABASEINTERFACE:
				BookingExpert((DatabaseInterface)arguments.get(0));
				return null;
			case ModelPackage.BOOKING_EXPERT___CHECK_IN__BOOKING_ELIST:
				return checkIn((Booking)arguments.get(0), (EList<Room>)arguments.get(1));
			case ModelPackage.BOOKING_EXPERT___CHECK_OUT__BOOKING:
				return checkOut((Booking)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingExpertImpl
