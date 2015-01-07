/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import model.Booking;
import model.DatabaseInterface;
import model.Expense;
import model.ExpenseExpert;
import model.ModelPackage;
import model.Receipt;
import model.ReceiptExpert;
import model.Room;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receipt Expert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.ReceiptExpertImpl#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceiptExpertImpl extends MinimalEObjectImpl.Container implements ReceiptExpert {
	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected DatabaseInterface database;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiptExpertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RECEIPT_EXPERT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseInterface getDatabase() {
		if (database != null && database.eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject)database;
			database = (DatabaseInterface)eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.RECEIPT_EXPERT__DATABASE, oldDatabase, database));
			}
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseInterface basicGetDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(DatabaseInterface newDatabase) {
		DatabaseInterface oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RECEIPT_EXPERT__DATABASE, oldDatabase, database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	//Stefania
	public Receipt getReceipt(int ID) {
		ExpenseExpert eExpert = new ExpenseExpertImpl(); 
		eExpert.ExpenseExpert(database);
		EList<String> result =  database.query("SELECT * FROM tlbReceipts WHERE ReceiptID = " + ID);
		if(result != null){
			EList<Expense> expenses = eExpert.getAllExpense(ID); 
			Calendar date = Calendar.getInstance();
			Receipt r1 = new ReceiptImpl();
			Expense ex = new ExpenseImpl();

			for (String e: result){
				String[] s = e.split(";", -1);
				String[] splitArr = s[3].substring(0, 10).split("-");
				date.set(Integer.parseInt(splitArr[0]), Integer.parseInt(splitArr[1])-1, Integer.parseInt(splitArr[2]));
				r1.Receipt(Integer.parseInt(s[0]), date.getTime(), expenses);
			}
			
			return r1;
		}
		return null; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	//Stefania
	public EList<Receipt> getAllReceipt() {
		EList<String> receipt = database.query("SELECT * FROM tblReceipts");
		if(receipt != null){
			ExpenseExpert eExpert = new ExpenseExpertImpl();
			eExpert.ExpenseExpert(database);
			EList<Receipt> mylist = new BasicEList<Receipt>();
			Calendar date = Calendar.getInstance();
			for(String r : receipt){
				String[] s = r.split(";", -1);
				EList<Expense> expenses = eExpert.getAllExpense(Integer.parseInt(s[0])); 
				Receipt rp = new ReceiptImpl();
				
				String[] splitArr = s[3].substring(0, 10).split("-");
				date.set(Integer.parseInt(splitArr[0]), Integer.parseInt(splitArr[1])-1, Integer.parseInt(splitArr[2]));
				
				rp.Receipt(Integer.parseInt(s[0]), date.getTime(), expenses);
				mylist.add(rp);
			}
			
			return mylist;
		}
		return null; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	//Stefania
	public Receipt combine(EList<Receipt> receiptList) {
		// id, Date date, EList<Expense> expenses
		Receipt r = new ReceiptImpl();
		EList<Expense> exp = new BasicEList<Expense>();
		int total = 0; 
		for(int i= 0; i < receiptList.size(); i++){
			 r = receiptList.get(i);
			 exp.addAll(r.getExpenses());
			 
			//database.send("UPDATE tblExpenses SET ReceiptID = " + r.getId() + "WHERE ReceiptID = " 
				//	+ r2.getId());
			total += r.getTotalCost(); 
			//removeReceipt(r2);
		}
		
		r.setTotalCost(total);
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	//Stefania
	public Receipt addReceipt(Receipt receipt) {
		Receipt r = receipt;
		SimpleDateFormat dateFormat = new SimpleDateFormat("#MM/dd/yyyy#"); 
		database.send("INSERT INTO tblReceipts (ReceiptID, ReceiptDescription, "
					+ "TotalCost, ReceiptDate)  VALUES (" + r.getId() + ", " + 
					r.getExpenses() + ", " + r.getTotalCost() + ", " + 
					dateFormat.format(r.getDate()));
		 r.setId(Integer.parseInt(database.query("SELECT max(ReceiptID) FROM tblReceipt").get(0)));
		 
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	//Stefania
	public boolean removeReceipt(Receipt receipt) {
		return database.send("DELETE * FROM tblReceipts WHERE ReceiptID = " 
				+ receipt.getId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	//Stefania
	public boolean updateReceipt(Receipt receipt) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("#MM/dd/yyyy#");
		return database.send("UPDATE tblReceipts WHERE ReceiptID = " + receipt.getId() + 
				"SET ReceiptDescription = " + receipt.getExpenses() + "TotalCost = " +
				receipt.getTotalCost() + "ReceiptDate" + dateFormat.format(receipt.getDate()));	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	//Stefania
	public void ReceiptExpert(DatabaseInterface database) {
		this.database = database; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.RECEIPT_EXPERT__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
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
			case ModelPackage.RECEIPT_EXPERT__DATABASE:
				setDatabase((DatabaseInterface)newValue);
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
			case ModelPackage.RECEIPT_EXPERT__DATABASE:
				setDatabase((DatabaseInterface)null);
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
			case ModelPackage.RECEIPT_EXPERT__DATABASE:
				return database != null;
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
			case ModelPackage.RECEIPT_EXPERT___GET_RECEIPT__INT:
				return getReceipt((Integer)arguments.get(0));
			case ModelPackage.RECEIPT_EXPERT___GET_ALL_RECEIPT:
				return getAllReceipt();
			case ModelPackage.RECEIPT_EXPERT___COMBINE__ELIST:
				return combine((EList<Receipt>)arguments.get(0));
			case ModelPackage.RECEIPT_EXPERT___ADD_RECEIPT__RECEIPT:
				return addReceipt((Receipt)arguments.get(0));
			case ModelPackage.RECEIPT_EXPERT___REMOVE_RECEIPT__RECEIPT:
				return removeReceipt((Receipt)arguments.get(0));
			case ModelPackage.RECEIPT_EXPERT___UPDATE_RECEIPT__RECEIPT:
				return updateReceipt((Receipt)arguments.get(0));
			case ModelPackage.RECEIPT_EXPERT___RECEIPT_EXPERT__DATABASEINTERFACE:
				ReceiptExpert((DatabaseInterface)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReceiptExpertImpl
