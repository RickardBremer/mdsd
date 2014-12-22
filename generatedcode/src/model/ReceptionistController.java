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
 *   <li>{@link model.ReceptionistController#getExpenseExpert <em>Expense Expert</em>}</li>
 *   <li>{@link model.ReceptionistController#getRoomExpert <em>Room Expert</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getReceptionistController()
 * @model
 * @generated
 */
public interface ReceptionistController extends BookingController {
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
	 * @see model.ModelPackage#getReceptionistController_ExpenseExpert()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ExpenseExpert getExpenseExpert();

	/**
	 * Sets the value of the '{@link model.ReceptionistController#getExpenseExpert <em>Expense Expert</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expense Expert</em>' reference.
	 * @see #getExpenseExpert()
	 * @generated
	 */
	void setExpenseExpert(ExpenseExpert value);

	/**
	 * Returns the value of the '<em><b>Room Expert</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Expert</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Expert</em>' reference.
	 * @see #setRoomExpert(RoomExpert)
	 * @see model.ModelPackage#getReceptionistController_RoomExpert()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomExpert getRoomExpert();

	/**
	 * Sets the value of the '{@link model.ReceptionistController#getRoomExpert <em>Room Expert</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Expert</em>' reference.
	 * @see #getRoomExpert()
	 * @generated
	 */
	void setRoomExpert(RoomExpert value);

} // ReceptionistController
