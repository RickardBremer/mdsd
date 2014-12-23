/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Room#getExpense <em>Expense</em>}</li>
 *   <li>{@link model.Room#getNumber <em>Number</em>}</li>
 *   <li>{@link model.Room#getDescription <em>Description</em>}</li>
 *   <li>{@link model.Room#isClean <em>Clean</em>}</li>
 *   <li>{@link model.Room#getType <em>Type</em>}</li>
 *   <li>{@link model.Room#getPrice <em>Price</em>}</li>
 *   <li>{@link model.Room#getBeds <em>Beds</em>}</li>
 *   <li>{@link model.Room#getReceipt <em>Receipt</em>}</li>
 *   <li>{@link model.Room#getResident <em>Resident</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Expense</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expense</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expense</em>' reference.
	 * @see #setExpense(Expense)
	 * @see model.ModelPackage#getRoom_Expense()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expense getExpense();

	/**
	 * Sets the value of the '{@link model.Room#getExpense <em>Expense</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expense</em>' reference.
	 * @see #getExpense()
	 * @generated
	 */
	void setExpense(Expense value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see model.ModelPackage#getRoom_Number()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link model.Room#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see model.ModelPackage#getRoom_Description()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link model.Room#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Clean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clean</em>' attribute.
	 * @see #setClean(boolean)
	 * @see model.ModelPackage#getRoom_Clean()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isClean();

	/**
	 * Sets the value of the '{@link model.Room#isClean <em>Clean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clean</em>' attribute.
	 * @see #isClean()
	 * @generated
	 */
	void setClean(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see model.ModelPackage#getRoom_Type()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link model.Room#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' reference.
	 * @see #setPrice(Expense)
	 * @see model.ModelPackage#getRoom_Price()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expense getPrice();

	/**
	 * Sets the value of the '{@link model.Room#getPrice <em>Price</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' reference.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(Expense value);

	/**
	 * Returns the value of the '<em><b>Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beds</em>' attribute.
	 * @see #setBeds(int)
	 * @see model.ModelPackage#getRoom_Beds()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getBeds();

	/**
	 * Sets the value of the '{@link model.Room#getBeds <em>Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beds</em>' attribute.
	 * @see #getBeds()
	 * @generated
	 */
	void setBeds(int value);

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
	 * @see model.ModelPackage#getRoom_Receipt()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Receipt getReceipt();

	/**
	 * Sets the value of the '{@link model.Room#getReceipt <em>Receipt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receipt</em>' reference.
	 * @see #getReceipt()
	 * @generated
	 */
	void setReceipt(Receipt value);

	/**
	 * Returns the value of the '<em><b>Resident</b></em>' reference list.
	 * The list contents are of type {@link model.Resident}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resident</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resident</em>' reference list.
	 * @see model.ModelPackage#getRoom_Resident()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Resident> getResident();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model numberDataType="org.eclipse.uml2.types.Integer" numberRequired="true" numberOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false" typeDataType="org.eclipse.uml2.types.String" typeRequired="true" typeOrdered="false" priceRequired="true" priceOrdered="false" bedsDataType="org.eclipse.uml2.types.Integer" bedsRequired="true" bedsOrdered="false"
	 * @generated
	 */
	void Room(int number, String description, String type, Expense price, int beds);

} // Room
