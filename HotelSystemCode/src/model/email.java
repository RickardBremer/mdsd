/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>email</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see model.ModelPackage#getemail()
 * @model
 * @generated
 */
public interface email extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	boolean send(Booking booking);

} // email
