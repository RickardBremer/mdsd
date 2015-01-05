/**
 * Author: Alexander Ask
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;

import model.DatabaseInterface;
import model.Expense;
import model.ExpenseExpert;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Expense Expert</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.ExpenseExpertImpl#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpenseExpertImpl extends MinimalEObjectImpl.Container implements
		ExpenseExpert {
	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected DatabaseInterface database;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpenseExpertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EXPENSE_EXPERT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseInterface getDatabase() {
		if (database != null && database.eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject)database;
			database = (DatabaseInterface)eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EXPENSE_EXPERT__DATABASE, oldDatabase, database));
			}
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseInterface basicGetDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(DatabaseInterface newDatabase) {
		DatabaseInterface oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXPENSE_EXPERT__DATABASE, oldDatabase, database));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Expense getExpense(int ID) {	
		String[] response = database.query("SELECT 'ExpenseID', 'ExpenseName', 'ExpenseDate', 'ExpenseDescription', 'Price', 'IsFixed' "
		+ "FROM tblExpense WHERE ExpenseID =" + ID + ";").get(0).split(";");		
		Calendar cal = Calendar.getInstance();
		if(response != null){
			ExpenseImpl e = new ExpenseImpl();
			cal.setTimeInMillis(Long.valueOf(response[2]));
			e.Expense(Integer.valueOf(response[0]), response[1], cal.getTime(), response[3], Double.valueOf(response[4]), Boolean.parseBoolean(response[5]));
			return e; 
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Expense> getAllExpense() {
		EList<String> strExpenses = database
				.query("SELECT 'ExpenseID', 'ExpenseName', 'ExpenseDate', 'ExpenseDescription', 'Price', 'IsFixed' FROM tblExpense;");
		EList<Expense> expenses = new BasicEList<Expense>();
		Calendar cal = Calendar.getInstance();
		if (strExpenses != null) {
			for (String response : strExpenses) {
				String[] splitResponse = response.split(";");
				Expense e = new ExpenseImpl();
				cal.setTimeInMillis(Long.valueOf(splitResponse[2]));
				e.Expense(Integer.valueOf(splitResponse[0]), splitResponse[1], cal.getTime(), splitResponse[3], Double.valueOf(splitResponse[4]), Boolean.parseBoolean(splitResponse[5]));
				expenses.add(e);
			}
		}
		return expenses;
	}


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Expense addExpense(Expense expense) {
		boolean check = database
				.send("INSERT INTO tblExpense ('ExpenseName', 'ExpenseDate', 'ExpenseDescription', 'Price', 'IsFixed') VALUES("
						+ expense.getName()
						+ ", '"
						+ expense.getDate().getTime()
						+ "', '"
						+ expense.getDescription()
						+ "', "
						+ expense.getPrice()  
						+","
						+ expense.isFixed()  
						+ ");");
		
		if(check){
			String[] response = database.query("SELECT 'ExpenseID', 'ExpenseName', "
					+ "'ExpenseDate', 'ExpenseDescription', 'Price', 'IsFixed' "
					+ "FROM tblExpense WHERE ExpenseName='" 
					+ expense.getName() + "' AND ExpenseDate='" 
					+ expense.getDate().getTime() + "' AND ExpenseDescription='" 
					+ expense.getDescription() + "' AND Price ="
					+ expense.getPrice() + " AND IsFixed=" 
					+ expense.isFixed() + "ORDER BY desc;").get(0).split(";");
			
			Calendar cal = Calendar.getInstance();
			if(response != null){
				ExpenseImpl e = new ExpenseImpl();
				cal.setTimeInMillis(Long.valueOf(response[2]));
				e.Expense(Integer.valueOf(response[0]), response[1], cal.getTime(), response[3], Double.valueOf(response[4]), Boolean.parseBoolean(response[5]));
				return e; 
			}			
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean removeExpense(int ID) {
		return database.send("DELETTE FROM tblExpense Where ExpenseID=" + ID
				+ ";");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean updateExpense(Expense expense) {
		return database.send("UPDATE tblExpense SET Price=" + expense.getPrice() + ","
				+ " ExpenseName='" + expense.getName() + "',"
				+ " ExpenseDescription='" + expense.getDescription() + "',"
				+ " ExpenseDate='" + expense.getDate().getTime()
				+ "' WHERE ID =" + expense.getId() + ";");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.EXPENSE_EXPERT__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.EXPENSE_EXPERT__DATABASE:
				setDatabase((DatabaseInterface)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.EXPENSE_EXPERT__DATABASE:
				setDatabase((DatabaseInterface)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.EXPENSE_EXPERT__DATABASE:
				return database != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.EXPENSE_EXPERT___GET_EXPENSE__INT:
				return getExpense((Integer)arguments.get(0));
			case ModelPackage.EXPENSE_EXPERT___GET_ALL_EXPENSE:
				return getAllExpense();
			case ModelPackage.EXPENSE_EXPERT___ADD_EXPENSE__EXPENSE:
				return addExpense((Expense)arguments.get(0));
			case ModelPackage.EXPENSE_EXPERT___REMOVE_EXPENSE__INT:
				return removeExpense((Integer)arguments.get(0));
			case ModelPackage.EXPENSE_EXPERT___UPDATE_EXPENSE__EXPENSE:
				return updateExpense((Expense)arguments.get(0));
			case ModelPackage.EXPENSE_EXPERT___EXPENSE_EXPERT__DATABASEINTERFACE:
				ExpenseExpert((DatabaseInterface)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public void ExpenseExpert(DatabaseInterface database) {
		this.database = database;
	}

} // ExpenseExpertImpl
