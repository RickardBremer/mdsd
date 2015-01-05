/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import model.Expense;
import model.ModelPackage;
import model.Receipt;
import model.DatabaseInterface;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receipt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.ReceiptImpl#getExpense <em>Expense</em>}</li>
 *   <li>{@link model.impl.ReceiptImpl#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link model.impl.ReceiptImpl#getDate <em>Date</em>}</li>
 *   <li>{@link model.impl.ReceiptImpl#getExpenses <em>Expenses</em>}</li>
 *   <li>{@link model.impl.ReceiptImpl#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceiptImpl extends MinimalEObjectImpl.Container implements Receipt {
	/**
	 * The cached value of the '{@link #getExpense() <em>Expense</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpense()
	 * @generated
	 * @ordered
	 */
	protected EList<Expense> expense;
	protected DatabaseInterface database;

	/**
	 * The default value of the '{@link #getTotalCost() <em>Total Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCost()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalCost() <em>Total Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCost()
	 * @generated
	 * @ordered
	 */
	protected int totalCost = TOTAL_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpenses() <em>Expenses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpenses()
	 * @generated
	 * @ordered
	 */
	protected EList<Expense> expenses;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RECEIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expense> getExpense() {
		if (expense == null) {
			expense = new EObjectResolvingEList<Expense>(Expense.class, this, ModelPackage.RECEIPT__EXPENSE);
		}
		return expense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalCost() {
		return totalCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCost(int newTotalCost) {
		int oldTotalCost = totalCost;
		totalCost = newTotalCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RECEIPT__TOTAL_COST, oldTotalCost, totalCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RECEIPT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expense> getExpenses() {
		if (expenses == null) {
			expenses = new EObjectResolvingEList<Expense>(Expense.class, this, ModelPackage.RECEIPT__EXPENSES);
			
		}
		return expenses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(int newID) {
		int oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RECEIPT__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addExpense(Expense expense) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		
		this.expenses.add(expense);
		ExpenseExpert e = new ExpenseExpertImpl();
		
		 e.addExpense(expense);
		
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeExpense(Expense expense) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		for (int i = 0; i < expenses.size(); i++){
			if(expense.getID() == expenses.get(i).getID()){
				expenses.remove(expense);
			}
		}
		return database.send("DELETE * FROM tlbExpenses WHERE ExpenseID = " + expense.getID());
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Expense> getAllExpenses() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		EList<String[]> expenses = database.query("SELECT * FROM tblExpenses WHERE ReceiptID = " + this.id);
		EList<Expense> mylist = new BasicEList<Expense>();
		Calendar date = Calendar.getInstance();
		if( expenses != null){
			for (String[] ex: expenses){
				Expense rp = new ExpenseImpl();
				date.setTimeInMillis(Long.valueOf(ex[3]));
				rp.Expense(Integer.parseInt(ex[0]), ex[1], ex[2], date.getTime());
				mylist.add(rp);
			}
		}
		//throw new UnsupportedOperationException();
		return mylist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void Receipt() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
	
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.RECEIPT__EXPENSE:
				return getExpense();
			case ModelPackage.RECEIPT__TOTAL_COST:
				return getTotalCost();
			case ModelPackage.RECEIPT__DATE:
				return getDate();
			case ModelPackage.RECEIPT__EXPENSES:
				return getExpenses();
			case ModelPackage.RECEIPT__ID:
				return getID();
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
			case ModelPackage.RECEIPT__EXPENSE:
				getExpense().clear();
				getExpense().addAll((Collection<? extends Expense>)newValue);
				return;
			case ModelPackage.RECEIPT__TOTAL_COST:
				setTotalCost((Integer)newValue);
				return;
			case ModelPackage.RECEIPT__DATE:
				setDate((Date)newValue);
				return;
			case ModelPackage.RECEIPT__EXPENSES:
				getExpenses().clear();
				getExpenses().addAll((Collection<? extends Expense>)newValue);
				return;
			case ModelPackage.RECEIPT__ID:
				setID((Integer)newValue);
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
			case ModelPackage.RECEIPT__EXPENSE:
				getExpense().clear();
				return;
			case ModelPackage.RECEIPT__TOTAL_COST:
				setTotalCost(TOTAL_COST_EDEFAULT);
				return;
			case ModelPackage.RECEIPT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ModelPackage.RECEIPT__EXPENSES:
				getExpenses().clear();
				return;
			case ModelPackage.RECEIPT__ID:
				setID(ID_EDEFAULT);
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
			case ModelPackage.RECEIPT__EXPENSE:
				return expense != null && !expense.isEmpty();
			case ModelPackage.RECEIPT__TOTAL_COST:
				return totalCost != TOTAL_COST_EDEFAULT;
			case ModelPackage.RECEIPT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ModelPackage.RECEIPT__EXPENSES:
				return expenses != null && !expenses.isEmpty();
			case ModelPackage.RECEIPT__ID:
				return id != ID_EDEFAULT;
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
			case ModelPackage.RECEIPT___ADD_EXPENSE__EXPENSE:
				return addExpense((Expense)arguments.get(0));
			case ModelPackage.RECEIPT___REMOVE_EXPENSE__EXPENSE:
				return removeExpense((Expense)arguments.get(0));
			case ModelPackage.RECEIPT___GET_ALL_EXPENSES:
				return getAllExpenses();
			case ModelPackage.RECEIPT___RECEIPT:
				Receipt();
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
		result.append(" (totalCost: ");
		result.append(totalCost);
		result.append(", Date: ");
		result.append(date);
		result.append(", ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ReceiptImpl
