/**
 */
package model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bank Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bank Component</em>'.
	 * @generated
	 */
	BankComponent createBankComponent();

	/**
	 * Returns a new object of class '<em>Hotel Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel Component</em>'.
	 * @generated
	 */
	HotelComponent createHotelComponent();

	/**
	 * Returns a new object of class '<em>Receptionist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receptionist</em>'.
	 * @generated
	 */
	Receptionist createReceptionist();

	/**
	 * Returns a new object of class '<em>Customers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customers</em>'.
	 * @generated
	 */
	Customers createCustomers();

	/**
	 * Returns a new object of class '<em>Admin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admin</em>'.
	 * @generated
	 */
	Admin createAdmin();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Expense</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expense</em>'.
	 * @generated
	 */
	Expense createExpense();

	/**
	 * Returns a new object of class '<em>Receipt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receipt</em>'.
	 * @generated
	 */
	Receipt createReceipt();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Resident</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resident</em>'.
	 * @generated
	 */
	Resident createResident();

	/**
	 * Returns a new object of class '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer</em>'.
	 * @generated
	 */
	Customer createCustomer();

	/**
	 * Returns a new object of class '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking</em>'.
	 * @generated
	 */
	Booking createBooking();

	/**
	 * Returns a new object of class '<em>Promotion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Promotion</em>'.
	 * @generated
	 */
	Promotion createPromotion();

	/**
	 * Returns a new object of class '<em>Room Expert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Expert</em>'.
	 * @generated
	 */
	RoomExpert createRoomExpert();

	/**
	 * Returns a new object of class '<em>Expense Expert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expense Expert</em>'.
	 * @generated
	 */
	ExpenseExpert createExpenseExpert();

	/**
	 * Returns a new object of class '<em>User Expert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Expert</em>'.
	 * @generated
	 */
	UserExpert createUserExpert();

	/**
	 * Returns a new object of class '<em>Promotion Expert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Promotion Expert</em>'.
	 * @generated
	 */
	PromotionExpert createPromotionExpert();

	/**
	 * Returns a new object of class '<em>Booking Expert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Expert</em>'.
	 * @generated
	 */
	BookingExpert createBookingExpert();

	/**
	 * Returns a new object of class '<em>Receipt Expert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receipt Expert</em>'.
	 * @generated
	 */
	ReceiptExpert createReceiptExpert();

	/**
	 * Returns a new object of class '<em>email</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>email</em>'.
	 * @generated
	 */
	email createemail();

	/**
	 * Returns a new object of class '<em>Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment</em>'.
	 * @generated
	 */
	Payment createPayment();

	/**
	 * Returns a new object of class '<em>Booking Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Controller</em>'.
	 * @generated
	 */
	BookingController createBookingController();

	/**
	 * Returns a new object of class '<em>Admin Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admin Controller</em>'.
	 * @generated
	 */
	AdminController createAdminController();

	/**
	 * Returns a new object of class '<em>Receptionist Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receptionist Controller</em>'.
	 * @generated
	 */
	ReceptionistController createReceptionistController();

	/**
	 * Returns a new object of class '<em>MS Access DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MS Access DB</em>'.
	 * @generated
	 */
	MSAccessDB createMSAccessDB();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
