/**
 */
package model.util;

import model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.BANK_COMPONENT: {
				BankComponent bankComponent = (BankComponent)theEObject;
				T result = caseBankComponent(bankComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.HOTEL_COMPONENT: {
				HotelComponent hotelComponent = (HotelComponent)theEObject;
				T result = caseHotelComponent(hotelComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RECEPTIONIST: {
				Receptionist receptionist = (Receptionist)theEObject;
				T result = caseReceptionist(receptionist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CUSTOMERS: {
				Customers customers = (Customers)theEObject;
				T result = caseCustomers(customers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ADMIN: {
				Admin admin = (Admin)theEObject;
				T result = caseAdmin(admin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BANK_INTERFACE: {
				BankInterface bankInterface = (BankInterface)theEObject;
				T result = caseBankInterface(bankInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CUSTOMER_INTERFACE: {
				CustomerInterface customerInterface = (CustomerInterface)theEObject;
				T result = caseCustomerInterface(customerInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ROOM: {
				Room room = (Room)theEObject;
				T result = caseRoom(room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EXPENSE: {
				Expense expense = (Expense)theEObject;
				T result = caseExpense(expense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RECEIPT: {
				Receipt receipt = (Receipt)theEObject;
				T result = caseReceipt(receipt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RESIDENT: {
				Resident resident = (Resident)theEObject;
				T result = caseResident(resident);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CUSTOMER: {
				Customer customer = (Customer)theEObject;
				T result = caseCustomer(customer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RECEPTIONIST_INTERFACE: {
				ReceptionistInterface receptionistInterface = (ReceptionistInterface)theEObject;
				T result = caseReceptionistInterface(receptionistInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BOOKING: {
				Booking booking = (Booking)theEObject;
				T result = caseBooking(booking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ADMIN_INTERFACE: {
				AdminInterface adminInterface = (AdminInterface)theEObject;
				T result = caseAdminInterface(adminInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PROMOTION: {
				Promotion promotion = (Promotion)theEObject;
				T result = casePromotion(promotion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ROOM_EXPERT: {
				RoomExpert roomExpert = (RoomExpert)theEObject;
				T result = caseRoomExpert(roomExpert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DATABASE_INTERFACE: {
				DatabaseInterface databaseInterface = (DatabaseInterface)theEObject;
				T result = caseDatabaseInterface(databaseInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EXPENSE_EXPERT: {
				ExpenseExpert expenseExpert = (ExpenseExpert)theEObject;
				T result = caseExpenseExpert(expenseExpert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.USER_EXPERT: {
				UserExpert userExpert = (UserExpert)theEObject;
				T result = caseUserExpert(userExpert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PROMOTION_EXPERT: {
				PromotionExpert promotionExpert = (PromotionExpert)theEObject;
				T result = casePromotionExpert(promotionExpert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BOOKING_EXPERT: {
				BookingExpert bookingExpert = (BookingExpert)theEObject;
				T result = caseBookingExpert(bookingExpert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RECEIPT_EXPERT: {
				ReceiptExpert receiptExpert = (ReceiptExpert)theEObject;
				T result = caseReceiptExpert(receiptExpert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EMAIL: {
				email email = (email)theEObject;
				T result = caseemail(email);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PAYMENT: {
				Payment payment = (Payment)theEObject;
				T result = casePayment(payment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BOOKING_CONTROLLER: {
				BookingController bookingController = (BookingController)theEObject;
				T result = caseBookingController(bookingController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ADMIN_CONTROLLER: {
				AdminController adminController = (AdminController)theEObject;
				T result = caseAdminController(adminController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RECEPTIONIST_CONTROLLER: {
				ReceptionistController receptionistController = (ReceptionistController)theEObject;
				T result = caseReceptionistController(receptionistController);
				if (result == null) result = caseBookingController(receptionistController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MS_ACCESS_DB: {
				MSAccessDB msAccessDB = (MSAccessDB)theEObject;
				T result = caseMSAccessDB(msAccessDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bank Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bank Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBankComponent(BankComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotelComponent(HotelComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receptionist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receptionist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceptionist(Receptionist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomers(Customers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmin(Admin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bank Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bank Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBankInterface(BankInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInterface(CustomerInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom(Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expense</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expense</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpense(Expense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receipt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receipt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceipt(Receipt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resident</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resident</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResident(Resident object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomer(Customer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receptionist Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receptionist Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceptionistInterface(ReceptionistInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooking(Booking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admin Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdminInterface(AdminInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Promotion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Promotion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePromotion(Promotion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Expert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Expert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomExpert(RoomExpert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseInterface(DatabaseInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expense Expert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expense Expert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpenseExpert(ExpenseExpert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Expert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Expert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserExpert(UserExpert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Promotion Expert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Promotion Expert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePromotionExpert(PromotionExpert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Expert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Expert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingExpert(BookingExpert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receipt Expert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receipt Expert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiptExpert(ReceiptExpert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>email</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>email</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseemail(email object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayment(Payment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingController(BookingController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admin Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdminController(AdminController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receptionist Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receptionist Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceptionistController(ReceptionistController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MS Access DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MS Access DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSAccessDB(MSAccessDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
