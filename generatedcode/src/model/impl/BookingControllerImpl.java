/**
 */
package model.impl;

import model.BookingController;
import model.BookingExpert;
import model.DatabaseInterface;
import model.ModelPackage;
import model.PromotionExpert;
import model.RoomExpert;

import org.eclipse.emf.common.notify.Notification;

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

} //BookingControllerImpl
