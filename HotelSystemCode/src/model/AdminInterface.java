/**
 */
package model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see model.ModelPackage#getAdminInterface()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AdminInterface extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" passwordDataType="org.eclipse.uml2.types.String" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	boolean login(String name, String password);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	Room createRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	boolean removeRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	boolean updateRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" userRequired="true" userOrdered="false"
	 * @generated
	 */
	User createUser(User user);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" userRequired="true" userOrdered="false"
	 * @generated
	 */
	boolean removeUser(User user);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" userRequired="true" userOrdered="false"
	 * @generated
	 */
	boolean updateUser(User user);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" promotionRequired="true" promotionOrdered="false"
	 * @generated
	 */
	Promotion createPromotion(Promotion promotion);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" promotionRequired="true" promotionOrdered="false"
	 * @generated
	 */
	boolean removePromotion(Promotion promotion);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" promotionRequired="true" promotionOrdered="false"
	 * @generated
	 */
	boolean updatePromotion(Promotion promotion);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" expenseRequired="true" expenseOrdered="false"
	 * @generated
	 */
	Expense createExpense(Expense expense);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" expenseRequired="true" expenseOrdered="false"
	 * @generated
	 */
	boolean removeExpense(Expense expense);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" expenseRequired="true" expenseOrdered="false"
	 * @generated
	 */
	boolean updateExpense(Expense expense);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Room> viewRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Promotion> viewPromotions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<User> viewUsers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Expense> viewExpenses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomExpertRequired="true" roomExpertOrdered="false" expenseExpertRequired="true" expenseExpertOrdered="false" userExpertRequired="true" userExpertOrdered="false" promotionExpertRequired="true" promotionExpertOrdered="false"
	 * @generated
	 */
	void AdminController(RoomExpert roomExpert, ExpenseExpert expenseExpert, UserExpert userExpert, PromotionExpert promotionExpert);

} // AdminInterface
