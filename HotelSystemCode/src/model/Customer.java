/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Customer#getFirstName <em>First Name</em>}</li>
 *   <li>{@link model.Customer#getSurname <em>Surname</em>}</li>
 *   <li>{@link model.Customer#getEmail <em>Email</em>}</li>
 *   <li>{@link model.Customer#getAdress <em>Adress</em>}</li>
 *   <li>{@link model.Customer#getCcNumber <em>Cc Number</em>}</li>
 *   <li>{@link model.Customer#getCcv <em>Ccv</em>}</li>
 *   <li>{@link model.Customer#getExpiringMonth <em>Expiring Month</em>}</li>
 *   <li>{@link model.Customer#getExpiringYear <em>Expiring Year</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends EObject {
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
	 * @see model.ModelPackage#getCustomer_FirstName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link model.Customer#getFirstName <em>First Name</em>}' attribute.
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
	 * @see model.ModelPackage#getCustomer_Surname()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSurname();

	/**
	 * Sets the value of the '{@link model.Customer#getSurname <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' attribute.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see model.ModelPackage#getCustomer_Email()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link model.Customer#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adress</em>' attribute.
	 * @see #setAdress(String)
	 * @see model.ModelPackage#getCustomer_Adress()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAdress();

	/**
	 * Sets the value of the '{@link model.Customer#getAdress <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adress</em>' attribute.
	 * @see #getAdress()
	 * @generated
	 */
	void setAdress(String value);

	/**
	 * Returns the value of the '<em><b>Cc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Number</em>' attribute.
	 * @see #setCcNumber(String)
	 * @see model.ModelPackage#getCustomer_CcNumber()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCcNumber();

	/**
	 * Sets the value of the '{@link model.Customer#getCcNumber <em>Cc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Number</em>' attribute.
	 * @see #getCcNumber()
	 * @generated
	 */
	void setCcNumber(String value);

	/**
	 * Returns the value of the '<em><b>Ccv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ccv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ccv</em>' attribute.
	 * @see #setCcv(String)
	 * @see model.ModelPackage#getCustomer_Ccv()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCcv();

	/**
	 * Sets the value of the '{@link model.Customer#getCcv <em>Ccv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ccv</em>' attribute.
	 * @see #getCcv()
	 * @generated
	 */
	void setCcv(String value);

	/**
	 * Returns the value of the '<em><b>Expiring Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiring Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiring Month</em>' attribute.
	 * @see #setExpiringMonth(int)
	 * @see model.ModelPackage#getCustomer_ExpiringMonth()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getExpiringMonth();

	/**
	 * Sets the value of the '{@link model.Customer#getExpiringMonth <em>Expiring Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiring Month</em>' attribute.
	 * @see #getExpiringMonth()
	 * @generated
	 */
	void setExpiringMonth(int value);

	/**
	 * Returns the value of the '<em><b>Expiring Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiring Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiring Year</em>' attribute.
	 * @see #setExpiringYear(int)
	 * @see model.ModelPackage#getCustomer_ExpiringYear()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getExpiringYear();

	/**
	 * Sets the value of the '{@link model.Customer#getExpiringYear <em>Expiring Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiring Year</em>' attribute.
	 * @see #getExpiringYear()
	 * @generated
	 */
	void setExpiringYear(int value);

} // Customer
