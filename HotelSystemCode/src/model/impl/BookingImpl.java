/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import model.Booking;
import model.Customer;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.BookingImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link model.impl.BookingImpl#getBookingID <em>Booking ID</em>}</li>
 *   <li>{@link model.impl.BookingImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link model.impl.BookingImpl#getToDate <em>To Date</em>}</li>
 *   <li>{@link model.impl.BookingImpl#getWishes <em>Wishes</em>}</li>
 *   <li>{@link model.impl.BookingImpl#getPromotion <em>Promotion</em>}</li>
 *   <li>{@link model.impl.BookingImpl#getRoomTypes <em>Room Types</em>}</li>
 *   <li>{@link model.impl.BookingImpl#isCheckedIn <em>Checked In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The default value of the '{@link #getBookingID() <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingID()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOKING_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBookingID() <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingID()
	 * @generated
	 * @ordered
	 */
	protected String bookingID = BOOKING_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToDate() <em>To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date TO_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToDate() <em>To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDate()
	 * @generated
	 * @ordered
	 */
	protected Date toDate = TO_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWishes() <em>Wishes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWishes()
	 * @generated
	 * @ordered
	 */
	protected static final String WISHES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWishes() <em>Wishes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWishes()
	 * @generated
	 * @ordered
	 */
	protected String wishes = WISHES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPromotion() <em>Promotion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromotion()
	 * @generated
	 * @ordered
	 */
	protected static final String PROMOTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPromotion() <em>Promotion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromotion()
	 * @generated
	 * @ordered
	 */
	protected String promotion = PROMOTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomTypes() <em>Room Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> roomTypes;

	/**
	 * The default value of the '{@link #isCheckedIn() <em>Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKED_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckedIn() <em>Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedIn()
	 * @generated
	 * @ordered
	 */
	protected boolean checkedIn = CHECKED_IN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BOOKING__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBookingID() {
		return bookingID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingID(String newBookingID) {
		String oldBookingID = bookingID;
		bookingID = newBookingID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__BOOKING_ID, oldBookingID, bookingID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getToDate() {
		return toDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDate(Date newToDate) {
		Date oldToDate = toDate;
		toDate = newToDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__TO_DATE, oldToDate, toDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWishes() {
		return wishes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWishes(String newWishes) {
		String oldWishes = wishes;
		wishes = newWishes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__WISHES, oldWishes, wishes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPromotion() {
		return promotion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPromotion(String newPromotion) {
		String oldPromotion = promotion;
		promotion = newPromotion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__PROMOTION, oldPromotion, promotion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRoomTypes() {
		if (roomTypes == null) {
			roomTypes = new EDataTypeUniqueEList<String>(String.class, this, ModelPackage.BOOKING__ROOM_TYPES);
		}
		return roomTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckedIn() {
		return checkedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckedIn(boolean newCheckedIn) {
		boolean oldCheckedIn = checkedIn;
		checkedIn = newCheckedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__CHECKED_IN, oldCheckedIn, checkedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Booking(String bookingID, Date fromDate, Date toDate, String wishes, Customer customer, EList<String> roomTypes, String promotionCode) {
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
			case ModelPackage.BOOKING__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case ModelPackage.BOOKING__BOOKING_ID:
				return getBookingID();
			case ModelPackage.BOOKING__FROM_DATE:
				return getFromDate();
			case ModelPackage.BOOKING__TO_DATE:
				return getToDate();
			case ModelPackage.BOOKING__WISHES:
				return getWishes();
			case ModelPackage.BOOKING__PROMOTION:
				return getPromotion();
			case ModelPackage.BOOKING__ROOM_TYPES:
				return getRoomTypes();
			case ModelPackage.BOOKING__CHECKED_IN:
				return isCheckedIn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.BOOKING__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case ModelPackage.BOOKING__BOOKING_ID:
				setBookingID((String)newValue);
				return;
			case ModelPackage.BOOKING__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case ModelPackage.BOOKING__TO_DATE:
				setToDate((Date)newValue);
				return;
			case ModelPackage.BOOKING__WISHES:
				setWishes((String)newValue);
				return;
			case ModelPackage.BOOKING__PROMOTION:
				setPromotion((String)newValue);
				return;
			case ModelPackage.BOOKING__ROOM_TYPES:
				getRoomTypes().clear();
				getRoomTypes().addAll((Collection<? extends String>)newValue);
				return;
			case ModelPackage.BOOKING__CHECKED_IN:
				setCheckedIn((Boolean)newValue);
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
			case ModelPackage.BOOKING__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case ModelPackage.BOOKING__BOOKING_ID:
				setBookingID(BOOKING_ID_EDEFAULT);
				return;
			case ModelPackage.BOOKING__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case ModelPackage.BOOKING__TO_DATE:
				setToDate(TO_DATE_EDEFAULT);
				return;
			case ModelPackage.BOOKING__WISHES:
				setWishes(WISHES_EDEFAULT);
				return;
			case ModelPackage.BOOKING__PROMOTION:
				setPromotion(PROMOTION_EDEFAULT);
				return;
			case ModelPackage.BOOKING__ROOM_TYPES:
				getRoomTypes().clear();
				return;
			case ModelPackage.BOOKING__CHECKED_IN:
				setCheckedIn(CHECKED_IN_EDEFAULT);
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
			case ModelPackage.BOOKING__CUSTOMER:
				return customer != null;
			case ModelPackage.BOOKING__BOOKING_ID:
				return BOOKING_ID_EDEFAULT == null ? bookingID != null : !BOOKING_ID_EDEFAULT.equals(bookingID);
			case ModelPackage.BOOKING__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case ModelPackage.BOOKING__TO_DATE:
				return TO_DATE_EDEFAULT == null ? toDate != null : !TO_DATE_EDEFAULT.equals(toDate);
			case ModelPackage.BOOKING__WISHES:
				return WISHES_EDEFAULT == null ? wishes != null : !WISHES_EDEFAULT.equals(wishes);
			case ModelPackage.BOOKING__PROMOTION:
				return PROMOTION_EDEFAULT == null ? promotion != null : !PROMOTION_EDEFAULT.equals(promotion);
			case ModelPackage.BOOKING__ROOM_TYPES:
				return roomTypes != null && !roomTypes.isEmpty();
			case ModelPackage.BOOKING__CHECKED_IN:
				return checkedIn != CHECKED_IN_EDEFAULT;
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
			case ModelPackage.BOOKING___BOOKING__STRING_DATE_DATE_STRING_CUSTOMER_ELIST_STRING:
				Booking((String)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (String)arguments.get(3), (Customer)arguments.get(4), (EList<String>)arguments.get(5), (String)arguments.get(6));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bookingID: ");
		result.append(bookingID);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", toDate: ");
		result.append(toDate);
		result.append(", wishes: ");
		result.append(wishes);
		result.append(", promotion: ");
		result.append(promotion);
		result.append(", roomTypes: ");
		result.append(roomTypes);
		result.append(", checkedIn: ");
		result.append(checkedIn);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
