/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receptionist Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.ReceptionistController#getUserExpert <em>User Expert</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getReceptionistController()
 * @model
 * @generated
 */
public interface ReceptionistController extends BookingController, ReceptionistInterface {
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
	 * @see model.ModelPackage#getReceptionistController_UserExpert()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UserExpert getUserExpert();

	/**
	 * Sets the value of the '{@link model.ReceptionistController#getUserExpert <em>User Expert</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Expert</em>' reference.
	 * @see #getUserExpert()
	 * @generated
	 */
	void setUserExpert(UserExpert value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model receiptExpertRequired="true" receiptExpertOrdered="false" expenseExpertRequired="true" expenseExpertOrdered="false" roomExpertRequired="true" roomExpertOrdered="false" bookingExpertRequired="true" bookingExpertOrdered="false" promotionExpertRequired="true" promotionExpertOrdered="false" userExpertRequired="true" userExpertOrdered="false"
	 * @generated
	 */
	void ReceptionistController(ReceiptExpert receiptExpert, ExpenseExpert expenseExpert, RoomExpert roomExpert, BookingExpert bookingExpert, PromotionExpert promotionExpert, UserExpert userExpert);

} // ReceptionistController
