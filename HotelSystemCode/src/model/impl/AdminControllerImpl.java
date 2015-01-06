/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;
import model.AdminController;
import model.DatabaseInterface;
import model.Expense;
import model.ExpenseExpert;
import model.ModelPackage;
import model.Promotion;
import model.PromotionExpert;
import model.Room;
import model.RoomExpert;
import model.User;
import model.UserExpert;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link model.impl.AdminControllerImpl#getRoomExpert <em>Room Expert</em>}</li>
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
	public RoomExpert getRoomExpert() {
		if (roomExpert != null && roomExpert.eIsProxy()) {
			InternalEObject oldRoomExpert = (InternalEObject)roomExpert;
			roomExpert = (RoomExpert)eResolveProxy(oldRoomExpert);
			if (roomExpert != oldRoomExpert) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ADMIN_CONTROLLER__ROOM_EXPERT, oldRoomExpert, roomExpert));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ADMIN_CONTROLLER__ROOM_EXPERT, oldRoomExpert, roomExpert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean login(String name, String password) {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		return userExpert.login(name, password);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	
	public Room createRoom(Room room) {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		return roomExpert.addRoom(room);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeRoom(Room room) {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		
		return roomExpert.removeRoom(room);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean updateRoom(Room room) {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		
		return roomExpert.updateRoom(room);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public User createUser(User user) {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		return userExpert.addUser(user);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeUser(User user) {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		return userExpert.removeUser(user.getId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	
	public boolean updateUser(User user) {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		return userExpert.updateUser(user);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Promotion createPromotion(Promotion promotion) {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		return promoExpert.addPromotion(promotion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removePromotion(Promotion promotion) {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		return promoExpert.removePromotion(promotion.getCode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean updatePromotion(Promotion promotion) {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		return promoExpert.updatePromotion(promotion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expense createExpense(Expense expense) {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		return expenseExpert.addExpense(expense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeExpense(Expense expense) {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		return expenseExpert.removeExpense(expense.getId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean updateExpense(Expense expense) {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		return expenseExpert.updateExpense(expense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room> viewRooms() {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		
		return roomExpert.getAllRooms();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Promotion> viewPromotions() {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		return promoExpert.getAllPromotions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<User> viewUsers() {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		return userExpert.getAllUsers();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Expense> viewExpenses() {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		return expenseExpert.getAllExpense();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	public void AdminController(RoomExpert roomExpert, ExpenseExpert expenseExpert, UserExpert userExpert, PromotionExpert promotionExpert) {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		// throw new UnsupportedOperationException();
		
		this.roomExpert = roomExpert;
		this.expenseExpert = expenseExpert;
		this.userExpert = userExpert;
		this.promoExpert = promotionExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
/*
	public void AdminController(RoomExpert roomExpert, ExpenseExpert expenseExpert, UserExpert userExpert, PromotionExpert promotionExpert) {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		this.roomExpert = roomExpert;
		this.expenseExpert = expenseExpert;
		this.userExpert = userExpert;
		this.promoExpert = promotionExpert;
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	public void AdminController(ExpenseExpert expenseExpert, PromotionExpert promotionExpert, UserExpert userExpert, RoomExpert roomExpert) {
		// Rickard
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		
		this.roomExpert = roomExpert;
		this.expenseExpert = expenseExpert;
		this.userExpert = userExpert;
		this.promoExpert = promotionExpert;
		
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
			case ModelPackage.ADMIN_CONTROLLER__ROOM_EXPERT:
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
			case ModelPackage.ADMIN_CONTROLLER__ROOM_EXPERT:
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
			case ModelPackage.ADMIN_CONTROLLER__ROOM_EXPERT:
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
			case ModelPackage.ADMIN_CONTROLLER__USER_EXPERT:
				return userExpert != null;
			case ModelPackage.ADMIN_CONTROLLER__EXPENSE_EXPERT:
				return expenseExpert != null;
			case ModelPackage.ADMIN_CONTROLLER__PROMO_EXPERT:
				return promoExpert != null;
			case ModelPackage.ADMIN_CONTROLLER__DATABASE_INTERFACE:
				return databaseInterface != null;
			case ModelPackage.ADMIN_CONTROLLER__ROOM_EXPERT:
				return roomExpert != null;
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
			case ModelPackage.ADMIN_CONTROLLER___LOGIN__STRING_STRING:
				return login((String)arguments.get(0), (String)arguments.get(1));
			case ModelPackage.ADMIN_CONTROLLER___CREATE_ROOM__ROOM:
				return createRoom((Room)arguments.get(0));
			case ModelPackage.ADMIN_CONTROLLER___REMOVE_ROOM__ROOM:
				return removeRoom((Room)arguments.get(0));
			case ModelPackage.ADMIN_CONTROLLER___UPDATE_ROOM__ROOM:
				return updateRoom((Room)arguments.get(0));
			case ModelPackage.ADMIN_CONTROLLER___CREATE_USER__USER:
				return createUser((User)arguments.get(0));
			case ModelPackage.ADMIN_CONTROLLER___REMOVE_USER__USER:
				return removeUser((User)arguments.get(0));
			case ModelPackage.ADMIN_CONTROLLER___UPDATE_USER__USER:
				return updateUser((User)arguments.get(0));
			case ModelPackage.ADMIN_CONTROLLER___CREATE_PROMOTION__PROMOTION:
				return createPromotion((Promotion)arguments.get(0));
			case ModelPackage.ADMIN_CONTROLLER___REMOVE_PROMOTION__PROMOTION:
				return removePromotion((Promotion)arguments.get(0));
			case ModelPackage.ADMIN_CONTROLLER___UPDATE_PROMOTION__PROMOTION:
				return updatePromotion((Promotion)arguments.get(0));
			case ModelPackage.ADMIN_CONTROLLER___CREATE_EXPENSE__EXPENSE:
				return createExpense((Expense)arguments.get(0));
			case ModelPackage.ADMIN_CONTROLLER___REMOVE_EXPENSE__EXPENSE:
				return removeExpense((Expense)arguments.get(0));
			case ModelPackage.ADMIN_CONTROLLER___UPDATE_EXPENSE__EXPENSE:
				return updateExpense((Expense)arguments.get(0));
			case ModelPackage.ADMIN_CONTROLLER___VIEW_ROOMS:
				return viewRooms();
			case ModelPackage.ADMIN_CONTROLLER___VIEW_PROMOTIONS:
				return viewPromotions();
			case ModelPackage.ADMIN_CONTROLLER___VIEW_USERS:
				return viewUsers();
			case ModelPackage.ADMIN_CONTROLLER___VIEW_EXPENSES:
				return viewExpenses();
			case ModelPackage.ADMIN_CONTROLLER___ADMIN_CONTROLLER__ROOMEXPERT_EXPENSEEXPERT_USEREXPERT_PROMOTIONEXPERT:
				AdminController((RoomExpert)arguments.get(0), (ExpenseExpert)arguments.get(1), (UserExpert)arguments.get(2), (PromotionExpert)arguments.get(3));
				return null;
			case ModelPackage.ADMIN_CONTROLLER___ADMIN_CONTROLLER__EXPENSEEXPERT_PROMOTIONEXPERT_USEREXPERT_ROOMEXPERT:
				AdminController((ExpenseExpert)arguments.get(0), (PromotionExpert)arguments.get(1), (UserExpert)arguments.get(2), (RoomExpert)arguments.get(3));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AdminControllerImpl
