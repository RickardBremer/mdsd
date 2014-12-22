/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resident</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Resident#getFirstName <em>First Name</em>}</li>
 *   <li>{@link model.Resident#getSurname <em>Surname</em>}</li>
 *   <li>{@link model.Resident#getPassportNumber <em>Passport Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getResident()
 * @model
 * @generated
 */
public interface Resident extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see model.ModelPackage#getResident_FirstName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link model.Resident#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surname</em>' attribute.
	 * @see #setSurname(String)
	 * @see model.ModelPackage#getResident_Surname()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSurname();

	/**
	 * Sets the value of the '{@link model.Resident#getSurname <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' attribute.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(String value);

	/**
	 * Returns the value of the '<em><b>Passport Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passport Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passport Number</em>' attribute.
	 * @see #setPassportNumber(String)
	 * @see model.ModelPackage#getResident_PassportNumber()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPassportNumber();

	/**
	 * Sets the value of the '{@link model.Resident#getPassportNumber <em>Passport Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passport Number</em>' attribute.
	 * @see #getPassportNumber()
	 * @generated
	 */
	void setPassportNumber(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" surnameDataType="org.eclipse.uml2.types.String" surnameRequired="true" surnameOrdered="false" passportNumberDataType="org.eclipse.uml2.types.String" passportNumberRequired="true" passportNumberOrdered="false"
	 * @generated
	 */
	void Resident(String firstName, String surname, String passportNumber);

} // Resident
