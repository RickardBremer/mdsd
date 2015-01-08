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
import model.Receipt;
import model.ReceiptExpert;
import model.ReceptionistController;
import model.ReceptionistInterface;
import model.Resident;
import model.Room;
import model.RoomExpert;
import model.User;
import model.UserExpert;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
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
 *   <li>{@link model.impl.ReceptionistControllerImpl#getUserExpert <em>User Expert</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceptionistControllerImpl extends BookingControllerImpl implements ReceptionistController {
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
	 * @generated NOT
	 */
	public Resident createResident(String firstName, String surname, String passportNumber) {
		// Done - Creates a new resident object
		Resident r = new ResidentImpl();
		r.Resident(passportNumber,firstName, surname);
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Booking> viewAllBookings(Date fromDate, Date toDate) {
		// Done - Fetches all bookings betweeen certain dates
		EList<Booking> blist = bookingExpert.getAllBookings(fromDate, toDate);
		return blist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking getBooking(int bookingNumber) {
		// Done - Fetches a certain booking by its identification number
		Booking b = bookingExpert.getBooking(bookingNumber);
		return b;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room> viewUnOccupiedRooms() {
		// Done - fetches all unoccupied rooms
		EList<Room> rlist = room.getUnoccupiedRooms();
		return rlist;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Booking> viewAllBookings(String surname, Date dateFrom, Date dateTo) {
		// Done - Finds all bookings within a certain date range and with a certain surname
		EList<Booking> b = bookingExpert.getAllBookings(dateFrom,dateTo,surname);
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room> viewUnOccupiedRooms(String roomType) {
		EList<Room> roomlist = room.getUnoccupiedRooms();
		EList<Room> resultlist = new BasicEList<Room>();
		for (Room r : roomlist) {
			if (r.getType().toLowerCase().matches(roomType.toLowerCase())) {
				resultlist.add(r);
			}
		}
		return resultlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean checkIn(Booking booking, EList<Room> rooms) {
		// Done - uses bookingExpert to check in a booking
		boolean checkedin = bookingExpert.checkIn(booking, rooms);
		if (!checkedin) {
			System.out.println("Failed to check in, maybe youre already checked in?");
		} else {
			System.out.println("Check in succesful");
		}
		return checkedin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean checkOut(Booking booking) {
		// Done - Checks out a booking
		EList<Receipt> receiptList = new BasicEList<Receipt>(); 
		receiptList.add(receiptExpert.getReceipt(booking.getReceipt().getId()));
		for (Room r : booking.getRoom()) {
			receiptList.add(r.getReceipt());
		}
		Receipt combinedreceipt = getReceiptExpert().combine(receiptList);
		System.out.println(combinedreceipt.getTotalCost());
		if(pay(booking.getCustomer(), combinedreceipt)){
			if(bookingExpert.checkOut(booking)){
				return true; 
			}else{
				System.out.println("Payment succeded but Check out failed.");
				return false; 
			}
		}else{
			System.out.println("Payment failed, check out was not performed.");
			return false; 
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean login(String name, String password) {
		boolean isReceptionist = false;
		EList<User> userList = userExpert.getAllUsers();
		for (User u : userList) {
			if(u.getFirstName().equals(name) && u.getPassword().equals(password) && u.isReceptionist()) {
				isReceptionist = true;
			}
		}
		isReceptionist = userExpert.login(name, password);
		return isReceptionist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void ReceptionistController(ReceiptExpert receiptExpert, ExpenseExpert expenseExpert, RoomExpert roomExpert, BookingExpert bookingExpert, PromotionExpert promotionExpert, UserExpert userExpert) {
		this.receiptExpert = receiptExpert;
		this.expenseExpert = expenseExpert;
		this.room = roomExpert;
		this.bookingExpert = bookingExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
				case ModelPackage.RECEPTIONIST_INTERFACE___GET_BOOKING__INT: return ModelPackage.RECEPTIONIST_CONTROLLER___GET_BOOKING__INT;
				case ModelPackage.RECEPTIONIST_INTERFACE___VIEW_UN_OCCUPIED_ROOMS: return ModelPackage.RECEPTIONIST_CONTROLLER___VIEW_UN_OCCUPIED_ROOMS;
				case ModelPackage.RECEPTIONIST_INTERFACE___VIEW_ALL_BOOKINGS__STRING_DATE_DATE: return ModelPackage.RECEPTIONIST_CONTROLLER___VIEW_ALL_BOOKINGS__STRING_DATE_DATE;
				case ModelPackage.RECEPTIONIST_INTERFACE___VIEW_UN_OCCUPIED_ROOMS__STRING: return ModelPackage.RECEPTIONIST_CONTROLLER___VIEW_UN_OCCUPIED_ROOMS__STRING;
				case ModelPackage.RECEPTIONIST_INTERFACE___CHECK_IN__BOOKING_ELIST: return ModelPackage.RECEPTIONIST_CONTROLLER___CHECK_IN__BOOKING_ELIST;
				case ModelPackage.RECEPTIONIST_INTERFACE___CHECK_OUT__BOOKING: return ModelPackage.RECEPTIONIST_CONTROLLER___CHECK_OUT__BOOKING;
				case ModelPackage.RECEPTIONIST_INTERFACE___LOGIN__STRING_STRING: return ModelPackage.RECEPTIONIST_CONTROLLER___LOGIN__STRING_STRING;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.RECEPTIONIST_CONTROLLER___CREATE_RESIDENT__STRING_STRING_STRING:
				return createResident((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case ModelPackage.RECEPTIONIST_CONTROLLER___VIEW_ALL_BOOKINGS__DATE_DATE:
				return viewAllBookings((Date)arguments.get(0), (Date)arguments.get(1));
			case ModelPackage.RECEPTIONIST_CONTROLLER___GET_BOOKING__INT:
				return getBooking((Integer)arguments.get(0));
			case ModelPackage.RECEPTIONIST_CONTROLLER___VIEW_UN_OCCUPIED_ROOMS:
				return viewUnOccupiedRooms();
			case ModelPackage.RECEPTIONIST_CONTROLLER___VIEW_ALL_BOOKINGS__STRING_DATE_DATE:
				return viewAllBookings((String)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
			case ModelPackage.RECEPTIONIST_CONTROLLER___VIEW_UN_OCCUPIED_ROOMS__STRING:
				return viewUnOccupiedRooms((String)arguments.get(0));
			case ModelPackage.RECEPTIONIST_CONTROLLER___CHECK_IN__BOOKING_ELIST:
				return checkIn((Booking)arguments.get(0), (EList<Room>)arguments.get(1));
			case ModelPackage.RECEPTIONIST_CONTROLLER___CHECK_OUT__BOOKING:
				return checkOut((Booking)arguments.get(0));
			case ModelPackage.RECEPTIONIST_CONTROLLER___LOGIN__STRING_STRING:
				return login((String)arguments.get(0), (String)arguments.get(1));
			case ModelPackage.RECEPTIONIST_CONTROLLER___RECEPTIONIST_CONTROLLER__RECEIPTEXPERT_EXPENSEEXPERT_ROOMEXPERT_BOOKINGEXPERT_PROMOTIONEXPERT_USEREXPERT:
				ReceptionistController((ReceiptExpert)arguments.get(0), (ExpenseExpert)arguments.get(1), (RoomExpert)arguments.get(2), (BookingExpert)arguments.get(3), (PromotionExpert)arguments.get(4), (UserExpert)arguments.get(5));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReceptionistControllerImpl
