/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see model.ModelPackage#getPayment()
 * @model
 * @generated
 */
public interface Payment extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" customerRequired="true" customerOrdered="false" amountRequired="true" amountOrdered="false"
	 * @generated
	 */
	boolean makePayment(Customer customer, double amount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" customerRequired="true" customerOrdered="false"
	 * @generated
	 */
	boolean isCreditCardValid(Customer customer);

} // Payment
