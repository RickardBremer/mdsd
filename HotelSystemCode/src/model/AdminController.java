/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.AdminController#getUserExpert <em>User Expert</em>}</li>
 *   <li>{@link model.AdminController#getExpenseExpert <em>Expense Expert</em>}</li>
 *   <li>{@link model.AdminController#getPromoExpert <em>Promo Expert</em>}</li>
 *   <li>{@link model.AdminController#getDatabaseInterface <em>Database Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getAdminController()
 * @model
 * @generated
 */
public interface AdminController extends EObject {
	/**
	 * Returns the value of the '<em><b>User Expert</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Expert</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Expert</em>' reference.
	 * @see #setUserExpert(UserExpert)
	 * @see model.ModelPackage#getAdminController_UserExpert()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UserExpert getUserExpert();

	/**
	 * Sets the value of the '{@link model.AdminController#getUserExpert <em>User Expert</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Expert</em>' reference.
	 * @see #getUserExpert()
	 * @generated
	 */
	void setUserExpert(UserExpert value);

	/**
	 * Returns the value of the '<em><b>Expense Expert</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expense Expert</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expense Expert</em>' reference.
	 * @see #setExpenseExpert(ExpenseExpert)
	 * @see model.ModelPackage#getAdminController_ExpenseExpert()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ExpenseExpert getExpenseExpert();

	/**
	 * Sets the value of the '{@link model.AdminController#getExpenseExpert <em>Expense Expert</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expense Expert</em>' reference.
	 * @see #getExpenseExpert()
	 * @generated
	 */
	void setExpenseExpert(ExpenseExpert value);

	/**
	 * Returns the value of the '<em><b>Promo Expert</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Promo Expert</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promo Expert</em>' reference.
	 * @see #setPromoExpert(PromotionExpert)
	 * @see model.ModelPackage#getAdminController_PromoExpert()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PromotionExpert getPromoExpert();

	/**
	 * Sets the value of the '{@link model.AdminController#getPromoExpert <em>Promo Expert</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promo Expert</em>' reference.
	 * @see #getPromoExpert()
	 * @generated
	 */
	void setPromoExpert(PromotionExpert value);

	/**
	 * Returns the value of the '<em><b>Database Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Interface</em>' reference.
	 * @see #setDatabaseInterface(DatabaseInterface)
	 * @see model.ModelPackage#getAdminController_DatabaseInterface()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DatabaseInterface getDatabaseInterface();

	/**
	 * Sets the value of the '{@link model.AdminController#getDatabaseInterface <em>Database Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Interface</em>' reference.
	 * @see #getDatabaseInterface()
	 * @generated
	 */
	void setDatabaseInterface(DatabaseInterface value);

} // AdminController
