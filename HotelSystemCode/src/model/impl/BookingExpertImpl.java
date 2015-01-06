/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import model.Booking;
import model.BookingExpert;
import model.DatabaseInterface;
import model.Expense;
import model.ModelPackage;
import model.Room;

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
		String[] response = database.query("SELECT 'BookingID', 'DateFrom', 'DateTo', 'ClientRequests', 'CustomerMail', 'PromotionCode' FROM tblBookings WHERE BookingID =" + ID + ";").get(0).split(";");
		String[] roomtype = database.query("SELECT 'RoomType' FROM tblCalender, tblBookings WHERE tblBookings.BookingID = tblCalender.BookingID AND tblBookings.BookingID = " + ID  + ";").get(0).split(";");
		String[] Customer = database.query("SELECT 'FirstName' , 'LastName' , 'Address', 'CCNumber' , 'CCV' , 'ExpiringMonth' , 'ExpiringYear' FROM tblCostumer WHERE Email = " + response[4] + ";").get(0).split(";");
				if(response != null && roomtype != null){
					EList<String> rooms = new BasicEList<String>();
					for(int i = 0; i < roomtype.length; i++){
						rooms.add(roomtype[i]);
					}
					Booking b = new BookingImpl();
					b.Booking(response[0], response[1], response[2], response[3], response[4], rooms, response[5]);
					return b; 
				}
				return null;
		
		
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getAllBookings(Date dateFrom, Date dateTo) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addBooking(Booking booking) {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		return database.send("INSERT INTO tblBookings ('BookingID', 'DateFrom', 'DateTo', 'CustomerMail', 'ClientRequests', 'CheckedIn') VALUES("
						+ booking.getBookingID()
						+ ", "
						+ booking.getFromDate().getTime()
						+ ","
						+ booking.getToDate().getTime()
						+ ",'"
						+ booking.getCustomer().getEmail() 
						+ "','"
						+ booking.getWishes()
						+ "',"
						+ booking.isCheckedIn()
						+ ");");
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
		boolean removeTblCalender = database.send("DELETE FROM tblCalender WHERE BookingID="+ booking.getId() + ";" );
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
		return database.send("UPDATE tblBookings SET DateFrom=" + booking.getFromDate() + ", DateTo='" + booking.getToDate() + "' WHERE BookingID =" + booking.getId() + ";");
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getAllBookings(Date dateFrom, Date dateTo, String surname) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void BookingExpert(DatabaseInterface database) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkIn(Booking booking, EList<Room> rooms) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkOut(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
