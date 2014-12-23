/**
 */
package model;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see model.ModelPackage#getCustomerInterface()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CustomerInterface extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" dateFromRequired="true" dateFromOrdered="false" dateToRequired="true" dateToOrdered="false" numberOfGuestsRequired="true" numberOfGuestsOrdered="false" numberOfRoomsRequired="true" numberOfRoomsOrdered="false"
	 * @generated
	 */
	EList<Room> searchRooms(Date dateFrom, Date dateTo, int numberOfGuests, int numberOfRooms);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" surnameDataType="org.eclipse.uml2.types.String" surnameRequired="true" surnameOrdered="false" emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false" addressDataType="org.eclipse.uml2.types.String" addressRequired="true" addressOrdered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiringMonthRequired="true" expiringMonthOrdered="false" expriningYearRequired="true" expriningYearOrdered="false"
	 * @generated
	 */
	Customer createCustomer(String firstName, String surname, String email, String address, String ccNumber, String ccv, int expiringMonth, int expriningYear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" customerRequired="true" customerOrdered="false" receiptRequired="true" receiptOrdered="false"
	 * @generated
	 */
	boolean pay(Customer customer, Receipt receipt);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiringMonthRequired="true" expiringMonthOrdered="false" expiringYearRequired="true" expiringYearOrdered="false"
	 * @generated
	 */
	boolean validateCard(String ccNumber, String ccv, int expiringMonth, int expiringYear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" fromDateRequired="true" fromDateOrdered="false" toDateRequired="true" toDateOrdered="false" wishesDataType="org.eclipse.uml2.types.String" wishesRequired="true" wishesOrdered="false" customerRequired="true" customerOrdered="false" promotionDataType="org.eclipse.uml2.types.String" promotionRequired="true" promotionOrdered="false" receiptRequired="true" receiptOrdered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	boolean createBooking(Date fromDate, Date toDate, String wishes, Customer customer, String promotion, Receipt receipt, String roomType);

} // CustomerInterface
