/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receipt Expert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.ReceiptExpert#getReceipt <em>Receipt</em>}</li>
 *   <li>{@link model.ReceiptExpert#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getReceiptExpert()
 * @model
 * @generated
 */
public interface ReceiptExpert extends EObject {
	/**
	 * Returns the value of the '<em><b>Receipt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipt</em>' reference.
	 * @see #setReceipt(Receipt)
	 * @see model.ModelPackage#getReceiptExpert_Receipt()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Receipt getReceipt();

	/**
	 * Sets the value of the '{@link model.ReceiptExpert#getReceipt <em>Receipt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receipt</em>' reference.
	 * @see #getReceipt()
	 * @generated
	 */
	void setReceipt(Receipt value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' reference.
	 * @see #setDatabase(DatabaseInterface)
	 * @see model.ModelPackage#getReceiptExpert_Database()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DatabaseInterface getDatabase();

	/**
	 * Sets the value of the '{@link model.ReceiptExpert#getDatabase <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(DatabaseInterface value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" IDDataType="org.eclipse.uml2.types.Integer" IDRequired="true" IDOrdered="false"
	 * @generated
	 */
	Receipt getReceipt(int ID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	Receipt getReceipt(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Receipt getAllReceipt();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" receiptListRequired="true" receiptListOrdered="false"
	 * @generated
	 */
	Receipt combine(Receipt receiptList);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" receiptRequired="true" receiptOrdered="false"
	 * @generated
	 */
	boolean addReceipt(Receipt receipt);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" receiptRequired="true" receiptOrdered="false"
	 * @generated
	 */
	boolean removeReceipt(Receipt receipt);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" receiptRequired="true" receiptOrdered="false"
	 * @generated
	 */
	boolean updateReceipt(Receipt receipt);

} // ReceiptExpert
