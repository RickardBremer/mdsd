/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;

import model.Booking;
import model.DatabaseInterface;
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
	public Receipt getReceipt(int ID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		String[] result =  database.query("SELECT * FROM tlbReceipts WHERE ID = " + ID);
		Calendar date = Calendar.getInstance();
		if (result != null){
			Receipt r1 = new ReceiptImpl();
			date.setTimeInMillis(Long.valueOf(result[1]));
			r1.Receipt(Integer.parseInt(result[0]), date.getTime(), result[2]);
		
		
			return r1;
		//throw new UnsupportedOperationException();
		}else{
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Receipt getReceipt(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		String[] receipt1 = database.query("SELECT * FROM tblReceipts WHERE ReceiptID = (SELECT ReceiptID FROM tlbBooking WHERE BookingID = " + booking.getBookingID() + ")");
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receipt getReceipt(Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public EList<Receipt> getAllReceipt() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		EList<String[]> receipt = database.query("SELECT * FROM tblReceipts");
		EList<Receipt> mylist = new BasicEList<Receipt>();
		Calendar date = Calendar.getInstance();
		if( receipt != null){
			for (String[] re: receipt){
				Receipt rp = new ReceiptImpl();
				date.setTimeInMillis(Long.valueOf(re[2]));
				rp.Receipt(Integer.parseInt(re[0]), date.getTime(), re[2]);
				mylist.add(rp);
			}
		}
		//throw new UnsupportedOperationException();
		return mylist;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receipt combine(EList<Receipt> receiptList) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Receipt combine(Receipt receiptList) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
			
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addReceipt(Receipt receipt) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return  database.send("INSERT INTO tblReceipts (ReceiptID, ReceiptDescription, TotalCost, ReceiptDate)  VALUES (" + receipt.getID() + ", " + receipt.getExpenses() + ", " + receipt.getTotalCost() + ", " + receipt.getDate() + ";");
		
	
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeReceipt(Receipt receipt) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return database.send("DELETE * FROM tblReceipts WHERE ReceiptID = " + receipt.getID() + ";");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean updateReceipt(Receipt receipt) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		return database.send("UPDATE tblReceipts WHERE ReceiptID = " + receipt.getID() + "SET ReceiptDescription =" + receipt.getExpense() + "TotalCost = " + receipt.getTotalCost() + "ReceiptDate" + receipt.getDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void ReceiptExpert(DatabaseInterface database) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
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
			case ModelPackage.RECEIPT_EXPERT___GET_RECEIPT__BOOKING:
				return getReceipt((Booking)arguments.get(0));
			case ModelPackage.RECEIPT_EXPERT___GET_RECEIPT__ROOM:
				return getReceipt((Room)arguments.get(0));
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
