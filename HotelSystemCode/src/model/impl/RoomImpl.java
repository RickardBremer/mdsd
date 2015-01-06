/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import model.Expense;
import model.ModelPackage;
import model.Receipt;
import model.Resident;
import model.Room;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.RoomImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link model.impl.RoomImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link model.impl.RoomImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link model.impl.RoomImpl#isClean <em>Clean</em>}</li>
 *   <li>{@link model.impl.RoomImpl#getType <em>Type</em>}</li>
 *   <li>{@link model.impl.RoomImpl#getBeds <em>Beds</em>}</li>
 *   <li>{@link model.impl.RoomImpl#getReceipt <em>Receipt</em>}</li>
 *   <li>{@link model.impl.RoomImpl#getResidents <em>Residents</em>}</li>
 *   <li>{@link model.impl.RoomImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected Expense price;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isClean() <em>Clean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClean()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLEAN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClean() <em>Clean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClean()
	 * @generated
	 * @ordered
	 */
	protected boolean clean = CLEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeds() <em>Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeds()
	 * @generated
	 * @ordered
	 */
	protected static final int BEDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBeds() <em>Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeds()
	 * @generated
	 * @ordered
	 */
	protected int beds = BEDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReceipt() <em>Receipt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceipt()
	 * @generated
	 * @ordered
	 */
	protected Receipt receipt;

	/**
	 * The cached value of the '{@link #getResidents() <em>Residents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidents()
	 * @generated
	 * @ordered
	 */
	protected EList<Resident> residents;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClean() {
		return clean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClean(boolean newClean) {
		boolean oldClean = clean;
		clean = newClean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM__CLEAN, oldClean, clean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expense getPrice() {
		if (price != null && price.eIsProxy()) {
			InternalEObject oldPrice = (InternalEObject)price;
			price = (Expense)eResolveProxy(oldPrice);
			if (price != oldPrice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ROOM__PRICE, oldPrice, price));
			}
		}
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expense basicGetPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(Expense newPrice) {
		Expense oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBeds() {
		return beds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeds(int newBeds) {
		int oldBeds = beds;
		beds = newBeds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM__BEDS, oldBeds, beds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receipt getReceipt() {
		if (receipt != null && receipt.eIsProxy()) {
			InternalEObject oldReceipt = (InternalEObject)receipt;
			receipt = (Receipt)eResolveProxy(oldReceipt);
			if (receipt != oldReceipt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ROOM__RECEIPT, oldReceipt, receipt));
			}
		}
		return receipt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receipt basicGetReceipt() {
		return receipt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceipt(Receipt newReceipt) {
		Receipt oldReceipt = receipt;
		receipt = newReceipt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM__RECEIPT, oldReceipt, receipt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resident> getResidents() {
		if (residents == null) {
			residents = new EObjectResolvingEList<Resident>(Resident.class, this, ModelPackage.ROOM__RESIDENTS);
		}
		return residents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void Room(int number, String description, String type, Expense price, int beds, String status, Receipt receipt) {
		this.number = number;
		this.description = description;
		this.type = type;
		this.price = price;
		this.beds = beds;
		this.status = status;
		this.receipt = receipt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ROOM__PRICE:
				if (resolve) return getPrice();
				return basicGetPrice();
			case ModelPackage.ROOM__NUMBER:
				return getNumber();
			case ModelPackage.ROOM__DESCRIPTION:
				return getDescription();
			case ModelPackage.ROOM__CLEAN:
				return isClean();
			case ModelPackage.ROOM__TYPE:
				return getType();
			case ModelPackage.ROOM__BEDS:
				return getBeds();
			case ModelPackage.ROOM__RECEIPT:
				if (resolve) return getReceipt();
				return basicGetReceipt();
			case ModelPackage.ROOM__RESIDENTS:
				return getResidents();
			case ModelPackage.ROOM__STATUS:
				return getStatus();
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
			case ModelPackage.ROOM__PRICE:
				setPrice((Expense)newValue);
				return;
			case ModelPackage.ROOM__NUMBER:
				setNumber((Integer)newValue);
				return;
			case ModelPackage.ROOM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ModelPackage.ROOM__CLEAN:
				setClean((Boolean)newValue);
				return;
			case ModelPackage.ROOM__TYPE:
				setType((String)newValue);
				return;
			case ModelPackage.ROOM__BEDS:
				setBeds((Integer)newValue);
				return;
			case ModelPackage.ROOM__RECEIPT:
				setReceipt((Receipt)newValue);
				return;
			case ModelPackage.ROOM__RESIDENTS:
				getResidents().clear();
				getResidents().addAll((Collection<? extends Resident>)newValue);
				return;
			case ModelPackage.ROOM__STATUS:
				setStatus((String)newValue);
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
			case ModelPackage.ROOM__PRICE:
				setPrice((Expense)null);
				return;
			case ModelPackage.ROOM__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case ModelPackage.ROOM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ModelPackage.ROOM__CLEAN:
				setClean(CLEAN_EDEFAULT);
				return;
			case ModelPackage.ROOM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ModelPackage.ROOM__BEDS:
				setBeds(BEDS_EDEFAULT);
				return;
			case ModelPackage.ROOM__RECEIPT:
				setReceipt((Receipt)null);
				return;
			case ModelPackage.ROOM__RESIDENTS:
				getResidents().clear();
				return;
			case ModelPackage.ROOM__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case ModelPackage.ROOM__PRICE:
				return price != null;
			case ModelPackage.ROOM__NUMBER:
				return number != NUMBER_EDEFAULT;
			case ModelPackage.ROOM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ModelPackage.ROOM__CLEAN:
				return clean != CLEAN_EDEFAULT;
			case ModelPackage.ROOM__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ModelPackage.ROOM__BEDS:
				return beds != BEDS_EDEFAULT;
			case ModelPackage.ROOM__RECEIPT:
				return receipt != null;
			case ModelPackage.ROOM__RESIDENTS:
				return residents != null && !residents.isEmpty();
			case ModelPackage.ROOM__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
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
			case ModelPackage.ROOM___ROOM__INT_STRING_STRING_EXPENSE_INT_STRING_RECEIPT:
				Room((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (Expense)arguments.get(3), (Integer)arguments.get(4), (String)arguments.get(5), (Receipt)arguments.get(6));
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
		result.append(" (number: ");
		result.append(number);
		result.append(", description: ");
		result.append(description);
		result.append(", clean: ");
		result.append(clean);
		result.append(", type: ");
		result.append(type);
		result.append(", beds: ");
		result.append(beds);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
