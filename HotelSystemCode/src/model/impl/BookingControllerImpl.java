/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import model.Booking;
import model.BookingController;
import model.BookingExpert;
import model.Customer;
import model.DatabaseInterface;
import model.Expense;
import model.ModelPackage;
import model.Payment;
import model.PromotionExpert;
import model.Receipt;
import model.Room;
import model.RoomExpert;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.BookingControllerImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link model.impl.BookingControllerImpl#getBookingExpert <em>Booking Expert</em>}</li>
 *   <li>{@link model.impl.BookingControllerImpl#getPromotionExpert <em>Promotion Expert</em>}</li>
 *   <li>{@link model.impl.BookingControllerImpl#getDatabaseInterface <em>Database Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingControllerImpl extends MinimalEObjectImpl.Container implements BookingController {
	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected RoomExpert room;

	/**
	 * The cached value of the '{@link #getBookingExpert() <em>Booking Expert</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingExpert()
	 * @generated
	 * @ordered
	 */
	protected BookingExpert bookingExpert;

	/**
	 * The cached value of the '{@link #getPromotionExpert() <em>Promotion Expert</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromotionExpert()
	 * @generated
	 * @ordered
	 */
	protected PromotionExpert promotionExpert;

	/**
	 * The cached value of the '{@link #getDatabaseInterface() <em>Database Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseInterface()
	 * @generated
	 * @ordered
	 */
	protected DatabaseInterface databaseInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BOOKING_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomExpert getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject)room;
			room = (RoomExpert)eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BOOKING_CONTROLLER__ROOM, oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomExpert basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(RoomExpert newRoom) {
		RoomExpert oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING_CONTROLLER__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingExpert getBookingExpert() {
		if (bookingExpert != null && bookingExpert.eIsProxy()) {
			InternalEObject oldBookingExpert = (InternalEObject)bookingExpert;
			bookingExpert = (BookingExpert)eResolveProxy(oldBookingExpert);
			if (bookingExpert != oldBookingExpert) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BOOKING_CONTROLLER__BOOKING_EXPERT, oldBookingExpert, bookingExpert));
			}
		}
		return bookingExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingExpert basicGetBookingExpert() {
		return bookingExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingExpert(BookingExpert newBookingExpert) {
		BookingExpert oldBookingExpert = bookingExpert;
		bookingExpert = newBookingExpert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING_CONTROLLER__BOOKING_EXPERT, oldBookingExpert, bookingExpert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PromotionExpert getPromotionExpert() {
		if (promotionExpert != null && promotionExpert.eIsProxy()) {
			InternalEObject oldPromotionExpert = (InternalEObject)promotionExpert;
			promotionExpert = (PromotionExpert)eResolveProxy(oldPromotionExpert);
			if (promotionExpert != oldPromotionExpert) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BOOKING_CONTROLLER__PROMOTION_EXPERT, oldPromotionExpert, promotionExpert));
			}
		}
		return promotionExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PromotionExpert basicGetPromotionExpert() {
		return promotionExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPromotionExpert(PromotionExpert newPromotionExpert) {
		PromotionExpert oldPromotionExpert = promotionExpert;
		promotionExpert = newPromotionExpert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING_CONTROLLER__PROMOTION_EXPERT, oldPromotionExpert, promotionExpert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseInterface getDatabaseInterface() {
		if (databaseInterface != null && databaseInterface.eIsProxy()) {
			InternalEObject oldDatabaseInterface = (InternalEObject)databaseInterface;
			databaseInterface = (DatabaseInterface)eResolveProxy(oldDatabaseInterface);
			if (databaseInterface != oldDatabaseInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BOOKING_CONTROLLER__DATABASE_INTERFACE, oldDatabaseInterface, databaseInterface));
			}
		}
		return databaseInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseInterface basicGetDatabaseInterface() {
		return databaseInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseInterface(DatabaseInterface newDatabaseInterface) {
		DatabaseInterface oldDatabaseInterface = databaseInterface;
		databaseInterface = newDatabaseInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING_CONTROLLER__DATABASE_INTERFACE, oldDatabaseInterface, databaseInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> searchRooms(Date dateFrom, Date dateTo, int numberOfGuests, int numberOfRooms) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer(String firstName, String surname, String email, String address, String ccNumber, String ccv, int expiringMonth, int expriningYear) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean pay(Customer customer, Receipt receipt) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCard(Customer customer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generate
	 */
	public boolean validateCard(String ccNumber, String ccv, int expiringMonth, int expiringYear) {
		Payment pay = new PaymentImpl();
		return pay.isCreditCardVaild(customer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean createBooking(Date fromDate, Date toDate, String wishes, Customer customer, String promotion, Receipt receipt, EList<String> roomTypes) {
		Payment pay = new PaymentImpl();
		if (!pay.isCreditCardValid(customer)) {
			return false;
		}
		Booking booking = new BookingImpl();
		booking.Booking(-1, fromDate, toDate, wishes, customer, roomTypes, promotion);
		bookingExpert.addBooking(booking);
		Receipt rec = booking.getReceipt();
		double total = rec.getTotalCost();
		double fee = total * -0.1;
		ex.Expense(fee, "Booking-fee " + fee, "", new Date());
		ex = expenseExpert.add(ex);
		rec.addExpense(ex);
		receiptExpert.updateReceipt(rec);
		
		if (!pay.makePayment(customer, -fee)) {
			bookingExpert.removeBooking(booking);
			return false;
		};
		//TODO: send email här
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void BookingController(RoomExpert roomExpert, BookingExpert bookingExpert, PromotionExpert promotionExpert) {
		this.room = roomExpert;
		this.bookingExpert = bookingExpert;
		this.promotionExpert = promotionExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.BOOKING_CONTROLLER__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
			case ModelPackage.BOOKING_CONTROLLER__BOOKING_EXPERT:
				if (resolve) return getBookingExpert();
				return basicGetBookingExpert();
			case ModelPackage.BOOKING_CONTROLLER__PROMOTION_EXPERT:
				if (resolve) return getPromotionExpert();
				return basicGetPromotionExpert();
			case ModelPackage.BOOKING_CONTROLLER__DATABASE_INTERFACE:
				if (resolve) return getDatabaseInterface();
				return basicGetDatabaseInterface();
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
			case ModelPackage.BOOKING_CONTROLLER__ROOM:
				setRoom((RoomExpert)newValue);
				return;
			case ModelPackage.BOOKING_CONTROLLER__BOOKING_EXPERT:
				setBookingExpert((BookingExpert)newValue);
				return;
			case ModelPackage.BOOKING_CONTROLLER__PROMOTION_EXPERT:
				setPromotionExpert((PromotionExpert)newValue);
				return;
			case ModelPackage.BOOKING_CONTROLLER__DATABASE_INTERFACE:
				setDatabaseInterface((DatabaseInterface)newValue);
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
			case ModelPackage.BOOKING_CONTROLLER__ROOM:
				setRoom((RoomExpert)null);
				return;
			case ModelPackage.BOOKING_CONTROLLER__BOOKING_EXPERT:
				setBookingExpert((BookingExpert)null);
				return;
			case ModelPackage.BOOKING_CONTROLLER__PROMOTION_EXPERT:
				setPromotionExpert((PromotionExpert)null);
				return;
			case ModelPackage.BOOKING_CONTROLLER__DATABASE_INTERFACE:
				setDatabaseInterface((DatabaseInterface)null);
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
			case ModelPackage.BOOKING_CONTROLLER__ROOM:
				return room != null;
			case ModelPackage.BOOKING_CONTROLLER__BOOKING_EXPERT:
				return bookingExpert != null;
			case ModelPackage.BOOKING_CONTROLLER__PROMOTION_EXPERT:
				return promotionExpert != null;
			case ModelPackage.BOOKING_CONTROLLER__DATABASE_INTERFACE:
				return databaseInterface != null;
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
			case ModelPackage.BOOKING_CONTROLLER___SEARCH_ROOMS__DATE_DATE_INT_INT:
				return searchRooms((Date)arguments.get(0), (Date)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ModelPackage.BOOKING_CONTROLLER___CREATE_CUSTOMER__STRING_STRING_STRING_STRING_STRING_STRING_INT_INT:
				return createCustomer((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (Integer)arguments.get(6), (Integer)arguments.get(7));
			case ModelPackage.BOOKING_CONTROLLER___PAY__CUSTOMER_RECEIPT:
				return pay((Customer)arguments.get(0), (Receipt)arguments.get(1));
			case ModelPackage.BOOKING_CONTROLLER___VALIDATE_CARD__CUSTOMER:
				return validateCard((Customer)arguments.get(0));
			case ModelPackage.BOOKING_CONTROLLER___CREATE_BOOKING__DATE_DATE_STRING_CUSTOMER_STRING_RECEIPT_ELIST:
				return createBooking((Date)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2), (Customer)arguments.get(3), (String)arguments.get(4), (Receipt)arguments.get(5), (EList<String>)arguments.get(6));
			case ModelPackage.BOOKING_CONTROLLER___BOOKING_CONTROLLER__ROOMEXPERT_BOOKINGEXPERT_PROMOTIONEXPERT:
				BookingController((RoomExpert)arguments.get(0), (BookingExpert)arguments.get(1), (PromotionExpert)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingControllerImpl
