/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import model.Booking;
import model.BookingExpert;
import model.ExpenseExpert;
import model.ModelPackage;
import model.PromotionExpert;
import model.ReceiptExpert;
import model.ReceptionistController;
import model.ReceptionistInterface;
import model.Resident;
import model.Room;
import model.RoomExpert;
import model.UserExpert;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receptionist Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.ReceptionistControllerImpl#getExpenseExpert <em>Expense Expert</em>}</li>
 *   <li>{@link model.impl.ReceptionistControllerImpl#getUserExpert <em>User Expert</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceptionistControllerImpl extends BookingControllerImpl implements ReceptionistController {
	/**
	 * The cached value of the '{@link #getExpenseExpert() <em>Expense Expert</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpenseExpert()
	 * @generated
	 * @ordered
	 */
	protected ExpenseExpert expenseExpert;

	/**
	 * The cached value of the '{@link #getUserExpert() <em>User Expert</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserExpert()
	 * @generated
	 * @ordered
	 */
	protected UserExpert userExpert;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceptionistControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RECEPTIONIST_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpenseExpert getExpenseExpert() {
		if (expenseExpert != null && expenseExpert.eIsProxy()) {
			InternalEObject oldExpenseExpert = (InternalEObject)expenseExpert;
			expenseExpert = (ExpenseExpert)eResolveProxy(oldExpenseExpert);
			if (expenseExpert != oldExpenseExpert) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.RECEPTIONIST_CONTROLLER__EXPENSE_EXPERT, oldExpenseExpert, expenseExpert));
			}
		}
		return expenseExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpenseExpert basicGetExpenseExpert() {
		return expenseExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpenseExpert(ExpenseExpert newExpenseExpert) {
		ExpenseExpert oldExpenseExpert = expenseExpert;
		expenseExpert = newExpenseExpert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RECEPTIONIST_CONTROLLER__EXPENSE_EXPERT, oldExpenseExpert, expenseExpert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserExpert getUserExpert() {
		if (userExpert != null && userExpert.eIsProxy()) {
			InternalEObject oldUserExpert = (InternalEObject)userExpert;
			userExpert = (UserExpert)eResolveProxy(oldUserExpert);
			if (userExpert != oldUserExpert) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.RECEPTIONIST_CONTROLLER__USER_EXPERT, oldUserExpert, userExpert));
			}
		}
		return userExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserExpert basicGetUserExpert() {
		return userExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserExpert(UserExpert newUserExpert) {
		UserExpert oldUserExpert = userExpert;
		userExpert = newUserExpert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RECEPTIONIST_CONTROLLER__USER_EXPERT, oldUserExpert, userExpert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resident createResident(String firstName, String surname, String passportNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		Resident r = new ResidentImpl();
		r.Resident(firstName, surname, passportNumber);
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> viewAllBookings(Date fromDate, Date toDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<Booking> blist = bookingExpert.getAllBooking(fromDate, toDate);
		return blist;
		
	}
//	public EList<Booking> viewAllBookings() {
//		// TODO: implement this method
//		// Ensure that you remove @generated or mark it @generated NOT
//		EList<Booking> blist = bookingExpert.getAllBookings();
//		return blist;
//		
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking getBooking(String bookingNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		Booking b = bookingExpert.getBooking(bookingNumber);
		return b;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking getBooking(String surname, Date dateFrom, Date dateTo) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<Booking> b  = bookingExpert.getAllBookings(dateFrom,dateTo,surname);
		return b;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> viewUnOccupiedRooms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<Room> rlist = room.getUnoccupiedRooms();
		return rlist;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> viewUnOccupiedRooms(String roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<Room> roomlist = room.getUnoccupiedRooms();
		EList<Room> resultlist = null;
		for (Room r : roomlist) {
			if (r.getType().matches(roomType)) {
				resultlist.add(r);
			}
		}
		return resultlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkIn(Booking booking, Room[] room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<String> bookedTypes =  booking.getRoomTypes();
		EList<Room> availableTypes = viewUnOccupiedRooms();
		for (Room r : room) {
			databaseInterface.send("INSERT INTO tblStays(BookingID,RoomID) VALUES (" +booking.getBookingID() + "," +r.getNumber() +");" );
			for (Resident res : r.getResident()){
				databaseInterface.send("INSERT INTO tblResidents VALUES ('"+res.getPassportNumber()+"','"+res.getFirstName() +"','" +res.getSurname() +"');" );
				databaseInterface.query("SELECT StayID FROM tblStays WHERE BookingID='"+booking.getBookingID()+"' AND WHERE RoomID='"+r.getNumber()+"'");
			}
		}
		databaseInterface.send("UPDATE tblBookings SET CheckedIn=true WHERE BookingID='" + booking.getBookingID() + "';");
		return true;
	}
	
//	public boolean checkIn(Room[] room) {
//		// TODO: implement this method
//		// Ensure that you remove @generated or mark it @generated NOT
//		EList<String> bookedTypes =  booking.getRoomTypes();
//		EList<Room> availableTypes = viewUnOccupiedRooms();
//		for(String bt : bookedTypes) {
//			for(Room r : availableTypes) {
//				if (bt.matches(r.getType())) {
//					room.updateRoom(r); 
//				}
//			}
//		}
//		
//		databaseInterface.update("UPDATE tblBookings SET CheckedIn=true WHERE BookingID=" + booking.getBookingID() +";");
//		throw new UnsupportedOperationException();
//	}

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
	public void ReceptionistController(ReceiptExpert receiptExpert, ExpenseExpert expenseExpert, RoomExpert roomExpert, BookingExpert bookingExpert, PromotionExpert promotionExpert, UserExpert userExpert) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		receiptExpert = receiptExpert;
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
			case ModelPackage.RECEPTIONIST_CONTROLLER__EXPENSE_EXPERT:
				if (resolve) return getExpenseExpert();
				return basicGetExpenseExpert();
			case ModelPackage.RECEPTIONIST_CONTROLLER__USER_EXPERT:
				if (resolve) return getUserExpert();
				return basicGetUserExpert();
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
			case ModelPackage.RECEPTIONIST_CONTROLLER__EXPENSE_EXPERT:
				setExpenseExpert((ExpenseExpert)newValue);
				return;
			case ModelPackage.RECEPTIONIST_CONTROLLER__USER_EXPERT:
				setUserExpert((UserExpert)newValue);
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
			case ModelPackage.RECEPTIONIST_CONTROLLER__EXPENSE_EXPERT:
				setExpenseExpert((ExpenseExpert)null);
				return;
			case ModelPackage.RECEPTIONIST_CONTROLLER__USER_EXPERT:
				setUserExpert((UserExpert)null);
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
			case ModelPackage.RECEPTIONIST_CONTROLLER__EXPENSE_EXPERT:
				return expenseExpert != null;
			case ModelPackage.RECEPTIONIST_CONTROLLER__USER_EXPERT:
				return userExpert != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ReceptionistInterface.class) {
			switch (baseOperationID) {
				case ModelPackage.RECEPTIONIST_INTERFACE___CREATE_RESIDENT__STRING_STRING_STRING: return ModelPackage.RECEPTIONIST_CONTROLLER___CREATE_RESIDENT__STRING_STRING_STRING;
				case ModelPackage.RECEPTIONIST_INTERFACE___VIEW_ALL_BOOKINGS__DATE_DATE: return ModelPackage.RECEPTIONIST_CONTROLLER___VIEW_ALL_BOOKINGS__DATE_DATE;
				case ModelPackage.RECEPTIONIST_INTERFACE___GET_BOOKING__STRING: return ModelPackage.RECEPTIONIST_CONTROLLER___GET_BOOKING__STRING;
				case ModelPackage.RECEPTIONIST_INTERFACE___VIEW_UN_OCCUPIED_ROOMS: return ModelPackage.RECEPTIONIST_CONTROLLER___VIEW_UN_OCCUPIED_ROOMS;
				case ModelPackage.RECEPTIONIST_INTERFACE___GET_BOOKING__STRING_DATE_DATE: return ModelPackage.RECEPTIONIST_CONTROLLER___GET_BOOKING__STRING_DATE_DATE;
				case ModelPackage.RECEPTIONIST_INTERFACE___VIEW_UN_OCCUPIED_ROOMS__STRING: return ModelPackage.RECEPTIONIST_CONTROLLER___VIEW_UN_OCCUPIED_ROOMS__STRING;
				case ModelPackage.RECEPTIONIST_INTERFACE___CHECK_IN__BOOKING: return ModelPackage.RECEPTIONIST_CONTROLLER___CHECK_IN__BOOKING;
				case ModelPackage.RECEPTIONIST_INTERFACE___CHECK_OUT__BOOKING: return ModelPackage.RECEPTIONIST_CONTROLLER___CHECK_OUT__BOOKING;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.RECEPTIONIST_CONTROLLER___CREATE_RESIDENT__STRING_STRING_STRING:
				return createResident((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case ModelPackage.RECEPTIONIST_CONTROLLER___VIEW_ALL_BOOKINGS__DATE_DATE:
				return viewAllBookings((Date)arguments.get(0), (Date)arguments.get(1));
			case ModelPackage.RECEPTIONIST_CONTROLLER___GET_BOOKING__STRING:
				return getBooking((String)arguments.get(0));
			case ModelPackage.RECEPTIONIST_CONTROLLER___VIEW_UN_OCCUPIED_ROOMS:
				return viewUnOccupiedRooms();
			case ModelPackage.RECEPTIONIST_CONTROLLER___GET_BOOKING__STRING_DATE_DATE:
				return getBooking((String)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
			case ModelPackage.RECEPTIONIST_CONTROLLER___VIEW_UN_OCCUPIED_ROOMS__STRING:
				return viewUnOccupiedRooms((String)arguments.get(0));
			case ModelPackage.RECEPTIONIST_CONTROLLER___CHECK_IN__BOOKING:
				return checkIn((Booking)arguments.get(0));
			case ModelPackage.RECEPTIONIST_CONTROLLER___CHECK_OUT__BOOKING:
				return checkOut((Booking)arguments.get(0));
			case ModelPackage.RECEPTIONIST_CONTROLLER___RECEPTIONIST_CONTROLLER__RECEIPTEXPERT_EXPENSEEXPERT_ROOMEXPERT_BOOKINGEXPERT_PROMOTIONEXPERT_USEREXPERT:
				ReceptionistController((ReceiptExpert)arguments.get(0), (ExpenseExpert)arguments.get(1), (RoomExpert)arguments.get(2), (BookingExpert)arguments.get(3), (PromotionExpert)arguments.get(4), (UserExpert)arguments.get(5));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReceptionistControllerImpl