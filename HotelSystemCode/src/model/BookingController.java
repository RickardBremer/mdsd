/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.BookingController#getRoom <em>Room</em>}</li>
 *   <li>{@link model.BookingController#getBookingExpert <em>Booking Expert</em>}</li>
 *   <li>{@link model.BookingController#getPromotionExpert <em>Promotion Expert</em>}</li>
 *   <li>{@link model.BookingController#getDatabaseInterface <em>Database Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getBookingController()
 * @model
 * @generated
 */
public interface BookingController extends CustomerInterface {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(RoomExpert)
	 * @see model.ModelPackage#getBookingController_Room()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomExpert getRoom();

	/**
	 * Sets the value of the '{@link model.BookingController#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(RoomExpert value);

	/**
	 * Returns the value of the '<em><b>Booking Expert</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking Expert</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Expert</em>' reference.
	 * @see #setBookingExpert(BookingExpert)
	 * @see model.ModelPackage#getBookingController_BookingExpert()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BookingExpert getBookingExpert();

	/**
	 * Sets the value of the '{@link model.BookingController#getBookingExpert <em>Booking Expert</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Expert</em>' reference.
	 * @see #getBookingExpert()
	 * @generated
	 */
	void setBookingExpert(BookingExpert value);

	/**
	 * Returns the value of the '<em><b>Promotion Expert</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Promotion Expert</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promotion Expert</em>' reference.
	 * @see #setPromotionExpert(PromotionExpert)
	 * @see model.ModelPackage#getBookingController_PromotionExpert()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PromotionExpert getPromotionExpert();

	/**
	 * Sets the value of the '{@link model.BookingController#getPromotionExpert <em>Promotion Expert</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promotion Expert</em>' reference.
	 * @see #getPromotionExpert()
	 * @generated
	 */
	void setPromotionExpert(PromotionExpert value);

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
	 * @see model.ModelPackage#getBookingController_DatabaseInterface()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DatabaseInterface getDatabaseInterface();

	/**
	 * Sets the value of the '{@link model.BookingController#getDatabaseInterface <em>Database Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Interface</em>' reference.
	 * @see #getDatabaseInterface()
	 * @generated
	 */
	void setDatabaseInterface(DatabaseInterface value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomExpertRequired="true" roomExpertOrdered="false" bookingExpertRequired="true" bookingExpertOrdered="false" promotionExpertRequired="true" promotionExpertOrdered="false"
	 * @generated
	 */
	void BookingController(RoomExpert roomExpert, BookingExpert bookingExpert, PromotionExpert promotionExpert);

} // BookingController
