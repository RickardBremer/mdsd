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
 *   <li>{@link model.Receipt#getExpenses <em>Expenses</em>}</li>
 *   <li>{@link model.Receipt#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link model.Receipt#getDate <em>Date</em>}</li>
 *   <li>{@link model.Receipt#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getReceipt()
 * @model
 * @generated
 */
public interface Receipt extends EObject {
	/**
	 * Returns the value of the '<em><b>Total Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Cost</em>' attribute.
	 * @see #setTotalCost(double)
	 * @see model.ModelPackage#getReceipt_TotalCost()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getTotalCost();

	/**
	 * Sets the value of the '{@link model.Receipt#getTotalCost <em>Total Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cost</em>' attribute.
	 * @see #getTotalCost()
	 * @generated
	 */
	void setTotalCost(double value);

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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see model.ModelPackage#getReceipt_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link model.Receipt#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idRequired="true" idOrdered="false" dateRequired="true" dateOrdered="false" expensesMany="true" expensesOrdered="false"
	 * @generated
	 */
	void Receipt(int id, Date date, EList<Expense> expenses);

} // Receipt
