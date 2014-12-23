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
	 * @model required="true" ordered="false" customerRequired="true" customerOrdered="false" amountDataType="org.eclipse.uml2.types.Integer" amountRequired="true" amountOrdered="false"
	 * @generated
	 */
	boolean makePayment(Customer customer, int amount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='isCreditCardValid(customer : Bool)'"
	 * @generated
	 */
	void isCreditCardValidcustomerBool();

} // Payment
