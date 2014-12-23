/**
 */
package model;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receipt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Receipt#getExpense <em>Expense</em>}</li>
 *   <li>{@link model.Receipt#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link model.Receipt#getDate <em>Date</em>}</li>
 *   <li>{@link model.Receipt#getExpenses <em>Expenses</em>}</li>
 *   <li>{@link model.Receipt#getID <em>ID</em>}</li>
 *   <li>{@link model.Receipt#getCashier <em>Cashier</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getReceipt()
 * @model
 * @generated
 */
public interface Receipt extends EObject {
	/**
	 * Returns the value of the '<em><b>Expense</b></em>' reference list.
	 * The list contents are of type {@link model.Expense}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expense</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expense</em>' reference list.
	 * @see model.ModelPackage#getReceipt_Expense()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Expense> getExpense();

	/**
	 * Returns the value of the '<em><b>Total Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Cost</em>' attribute.
	 * @see #setTotalCost(int)
	 * @see model.ModelPackage#getReceipt_TotalCost()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getTotalCost();

	/**
	 * Sets the value of the '{@link model.Receipt#getTotalCost <em>Total Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cost</em>' attribute.
	 * @see #getTotalCost()
	 * @generated
	 */
	void setTotalCost(int value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see model.ModelPackage#getReceipt_Date()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link model.Receipt#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Expenses</b></em>' reference list.
	 * The list contents are of type {@link model.Expense}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expenses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expenses</em>' reference list.
	 * @see model.ModelPackage#getReceipt_Expenses()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Expense> getExpenses();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see model.ModelPackage#getReceipt_ID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link model.Receipt#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Cashier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cashier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cashier</em>' reference.
	 * @see #setCashier(User)
	 * @see model.ModelPackage#getReceipt_Cashier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	User getCashier();

	/**
	 * Sets the value of the '{@link model.Receipt#getCashier <em>Cashier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cashier</em>' reference.
	 * @see #getCashier()
	 * @generated
	 */
	void setCashier(User value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" expenseRequired="true" expenseOrdered="false"
	 * @generated
	 */
	boolean addExpense(Expense expense);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" expenseRequired="true" expenseOrdered="false"
	 * @generated
	 */
	boolean removeExpense(Expense expense);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Expense> getAllExpenses();

} // Receipt
