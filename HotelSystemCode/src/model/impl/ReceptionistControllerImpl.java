/**
 */
package model.impl;

import model.ExpenseExpert;
import model.ModelPackage;
import model.ReceptionistController;
import model.RoomExpert;

import org.eclipse.emf.common.notify.Notification;

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
 *   <li>{@link model.impl.ReceptionistControllerImpl#getRoomExpert <em>Room Expert</em>}</li>
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
	 * The cached value of the '{@link #getRoomExpert() <em>Room Expert</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomExpert()
	 * @generated
	 * @ordered
	 */
	protected RoomExpert roomExpert;

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
	public RoomExpert getRoomExpert() {
		if (roomExpert != null && roomExpert.eIsProxy()) {
			InternalEObject oldRoomExpert = (InternalEObject)roomExpert;
			roomExpert = (RoomExpert)eResolveProxy(oldRoomExpert);
			if (roomExpert != oldRoomExpert) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.RECEPTIONIST_CONTROLLER__ROOM_EXPERT, oldRoomExpert, roomExpert));
			}
		}
		return roomExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomExpert basicGetRoomExpert() {
		return roomExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomExpert(RoomExpert newRoomExpert) {
		RoomExpert oldRoomExpert = roomExpert;
		roomExpert = newRoomExpert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RECEPTIONIST_CONTROLLER__ROOM_EXPERT, oldRoomExpert, roomExpert));
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
			case ModelPackage.RECEPTIONIST_CONTROLLER__ROOM_EXPERT:
				if (resolve) return getRoomExpert();
				return basicGetRoomExpert();
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
			case ModelPackage.RECEPTIONIST_CONTROLLER__ROOM_EXPERT:
				setRoomExpert((RoomExpert)newValue);
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
			case ModelPackage.RECEPTIONIST_CONTROLLER__ROOM_EXPERT:
				setRoomExpert((RoomExpert)null);
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
			case ModelPackage.RECEPTIONIST_CONTROLLER__ROOM_EXPERT:
				return roomExpert != null;
		}
		return super.eIsSet(featureID);
	}

} //ReceptionistControllerImpl
