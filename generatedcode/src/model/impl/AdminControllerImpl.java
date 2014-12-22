/**
 */
package model.impl;

import model.AdminController;
import model.DatabaseInterface;
import model.ExpenseExpert;
import model.ModelPackage;
import model.PromotionExpert;
import model.UserExpert;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admin Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.AdminControllerImpl#getUserExpert <em>User Expert</em>}</li>
 *   <li>{@link model.impl.AdminControllerImpl#getExpenseExpert <em>Expense Expert</em>}</li>
 *   <li>{@link model.impl.AdminControllerImpl#getPromoExpert <em>Promo Expert</em>}</li>
 *   <li>{@link model.impl.AdminControllerImpl#getDatabaseInterface <em>Database Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdminControllerImpl extends MinimalEObjectImpl.Container implements AdminController {
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
	 * The cached value of the '{@link #getExpenseExpert() <em>Expense Expert</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpenseExpert()
	 * @generated
	 * @ordered
	 */
	protected ExpenseExpert expenseExpert;

	/**
	 * The cached value of the '{@link #getPromoExpert() <em>Promo Expert</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromoExpert()
	 * @generated
	 * @ordered
	 */
	protected PromotionExpert promoExpert;

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
	protected AdminControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ADMIN_CONTROLLER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ADMIN_CONTROLLER__USER_EXPERT, oldUserExpert, userExpert));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ADMIN_CONTROLLER__USER_EXPERT, oldUserExpert, userExpert));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ADMIN_CONTROLLER__EXPENSE_EXPERT, oldExpenseExpert, expenseExpert));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ADMIN_CONTROLLER__EXPENSE_EXPERT, oldExpenseExpert, expenseExpert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PromotionExpert getPromoExpert() {
		if (promoExpert != null && promoExpert.eIsProxy()) {
			InternalEObject oldPromoExpert = (InternalEObject)promoExpert;
			promoExpert = (PromotionExpert)eResolveProxy(oldPromoExpert);
			if (promoExpert != oldPromoExpert) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ADMIN_CONTROLLER__PROMO_EXPERT, oldPromoExpert, promoExpert));
			}
		}
		return promoExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PromotionExpert basicGetPromoExpert() {
		return promoExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPromoExpert(PromotionExpert newPromoExpert) {
		PromotionExpert oldPromoExpert = promoExpert;
		promoExpert = newPromoExpert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ADMIN_CONTROLLER__PROMO_EXPERT, oldPromoExpert, promoExpert));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ADMIN_CONTROLLER__DATABASE_INTERFACE, oldDatabaseInterface, databaseInterface));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ADMIN_CONTROLLER__DATABASE_INTERFACE, oldDatabaseInterface, databaseInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ADMIN_CONTROLLER__USER_EXPERT:
				if (resolve) return getUserExpert();
				return basicGetUserExpert();
			case ModelPackage.ADMIN_CONTROLLER__EXPENSE_EXPERT:
				if (resolve) return getExpenseExpert();
				return basicGetExpenseExpert();
			case ModelPackage.ADMIN_CONTROLLER__PROMO_EXPERT:
				if (resolve) return getPromoExpert();
				return basicGetPromoExpert();
			case ModelPackage.ADMIN_CONTROLLER__DATABASE_INTERFACE:
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
			case ModelPackage.ADMIN_CONTROLLER__USER_EXPERT:
				setUserExpert((UserExpert)newValue);
				return;
			case ModelPackage.ADMIN_CONTROLLER__EXPENSE_EXPERT:
				setExpenseExpert((ExpenseExpert)newValue);
				return;
			case ModelPackage.ADMIN_CONTROLLER__PROMO_EXPERT:
				setPromoExpert((PromotionExpert)newValue);
				return;
			case ModelPackage.ADMIN_CONTROLLER__DATABASE_INTERFACE:
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
			case ModelPackage.ADMIN_CONTROLLER__USER_EXPERT:
				setUserExpert((UserExpert)null);
				return;
			case ModelPackage.ADMIN_CONTROLLER__EXPENSE_EXPERT:
				setExpenseExpert((ExpenseExpert)null);
				return;
			case ModelPackage.ADMIN_CONTROLLER__PROMO_EXPERT:
				setPromoExpert((PromotionExpert)null);
				return;
			case ModelPackage.ADMIN_CONTROLLER__DATABASE_INTERFACE:
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
			case ModelPackage.ADMIN_CONTROLLER__USER_EXPERT:
				return userExpert != null;
			case ModelPackage.ADMIN_CONTROLLER__EXPENSE_EXPERT:
				return expenseExpert != null;
			case ModelPackage.ADMIN_CONTROLLER__PROMO_EXPERT:
				return promoExpert != null;
			case ModelPackage.ADMIN_CONTROLLER__DATABASE_INTERFACE:
				return databaseInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //AdminControllerImpl
