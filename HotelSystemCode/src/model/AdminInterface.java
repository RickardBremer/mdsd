/**
 */
package model;

import java.util.Date;

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
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" roomNoDataType="org.eclipse.uml2.types.Integer" roomNoRequired="true" roomNoOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false" typeDataType="org.eclipse.uml2.types.String" typeRequired="true" typeOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" bedsDataType="org.eclipse.uml2.types.Integer" bedsRequired="true" bedsOrdered="false"
	 * @generated
	 */
	boolean createRoom(int roomNo, String description, String type, int price, int beds);

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
	 * @model roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void updateRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" surnameDataType="org.eclipse.uml2.types.String" surnameRequired="true" surnameOrdered="false" passwordDataType="org.eclipse.uml2.types.String" passwordRequired="true" passwordOrdered="false" receptionistDataType="org.eclipse.uml2.types.Boolean" receptionistRequired="true" receptionistOrdered="false" adminDataType="org.eclipse.uml2.types.Boolean" adminRequired="true" adminOrdered="false"
	 * @generated
	 */
	boolean createUser(String firstName, String surname, String password, boolean receptionist, boolean admin);

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
	 * @model codeDataType="org.eclipse.uml2.types.String" codeRequired="true" codeOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false" percentageDataType="org.eclipse.uml2.types.Integer" percentageRequired="true" percentageOrdered="false" validFromRequired="true" validFromOrdered="false"
	 * @generated
	 */
	void createPromotion(String code, String description, int percentage, Date validFrom);

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
	 * @model priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false" dateRequired="true" dateOrdered="false" _DataType="org.eclipse.uml2.types.Boolean" _Required="true" _Ordered="false"
	 * @generated
	 */
	void createExpense(int price, String name, String description, Date date, boolean _);

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
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Room viewRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Promotion viewPromotions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	User viewUsers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expense viewExpenses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomExpertRequired="true" roomExpertOrdered="false" expenseExpertRequired="true" expenseExpertOrdered="false" userExpertRequired="true" userExpertOrdered="false" promotionExpertRequired="true" promotionExpertOrdered="false"
	 * @generated
	 */
	void AdminController(RoomExpert roomExpert, ExpenseExpert expenseExpert, UserExpert userExpert, PromotionExpert promotionExpert);

} // AdminInterface
