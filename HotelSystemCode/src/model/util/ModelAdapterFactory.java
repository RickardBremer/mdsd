/**
 */
package model.util;

import model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseBankComponent(BankComponent object) {
				return createBankComponentAdapter();
			}
			@Override
			public Adapter caseHotelComponent(HotelComponent object) {
				return createHotelComponentAdapter();
			}
			@Override
			public Adapter caseReceptionist(Receptionist object) {
				return createReceptionistAdapter();
			}
			@Override
			public Adapter caseCustomers(Customers object) {
				return createCustomersAdapter();
			}
			@Override
			public Adapter caseAdmin(Admin object) {
				return createAdminAdapter();
			}
			@Override
			public Adapter caseBankInterface(BankInterface object) {
				return createBankInterfaceAdapter();
			}
			@Override
			public Adapter caseCustomerInterface(CustomerInterface object) {
				return createCustomerInterfaceAdapter();
			}
			@Override
			public Adapter caseRoom(Room object) {
				return createRoomAdapter();
			}
			@Override
			public Adapter caseExpense(Expense object) {
				return createExpenseAdapter();
			}
			@Override
			public Adapter caseReceipt(Receipt object) {
				return createReceiptAdapter();
			}
			@Override
			public Adapter caseResident(Resident object) {
				return createResidentAdapter();
			}
			@Override
			public Adapter caseCustomer(Customer object) {
				return createCustomerAdapter();
			}
			@Override
			public Adapter caseReceptionistInterface(ReceptionistInterface object) {
				return createReceptionistInterfaceAdapter();
			}
			@Override
			public Adapter caseBooking(Booking object) {
				return createBookingAdapter();
			}
			@Override
			public Adapter caseAdminInterface(AdminInterface object) {
				return createAdminInterfaceAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter casePromotion(Promotion object) {
				return createPromotionAdapter();
			}
			@Override
			public Adapter caseRoomExpert(RoomExpert object) {
				return createRoomExpertAdapter();
			}
			@Override
			public Adapter caseDatabaseInterface(DatabaseInterface object) {
				return createDatabaseInterfaceAdapter();
			}
			@Override
			public Adapter caseExpenseExpert(ExpenseExpert object) {
				return createExpenseExpertAdapter();
			}
			@Override
			public Adapter caseUserExpert(UserExpert object) {
				return createUserExpertAdapter();
			}
			@Override
			public Adapter casePromotionExpert(PromotionExpert object) {
				return createPromotionExpertAdapter();
			}
			@Override
			public Adapter caseBookingExpert(BookingExpert object) {
				return createBookingExpertAdapter();
			}
			@Override
			public Adapter caseReceiptExpert(ReceiptExpert object) {
				return createReceiptExpertAdapter();
			}
			@Override
			public Adapter caseEmailSender(EmailSender object) {
				return createEmailSenderAdapter();
			}
			@Override
			public Adapter casePayment(Payment object) {
				return createPaymentAdapter();
			}
			@Override
			public Adapter caseBookingController(BookingController object) {
				return createBookingControllerAdapter();
			}
			@Override
			public Adapter caseAdminController(AdminController object) {
				return createAdminControllerAdapter();
			}
			@Override
			public Adapter caseReceptionistController(ReceptionistController object) {
				return createReceptionistControllerAdapter();
			}
			@Override
			public Adapter caseMSAccessDB(MSAccessDB object) {
				return createMSAccessDBAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link model.BankComponent <em>Bank Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BankComponent
	 * @generated
	 */
	public Adapter createBankComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.HotelComponent <em>Hotel Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.HotelComponent
	 * @generated
	 */
	public Adapter createHotelComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Receptionist <em>Receptionist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Receptionist
	 * @generated
	 */
	public Adapter createReceptionistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Customers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Customers
	 * @generated
	 */
	public Adapter createCustomersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Admin
	 * @generated
	 */
	public Adapter createAdminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BankInterface <em>Bank Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BankInterface
	 * @generated
	 */
	public Adapter createBankInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.CustomerInterface <em>Customer Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.CustomerInterface
	 * @generated
	 */
	public Adapter createCustomerInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Expense <em>Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Expense
	 * @generated
	 */
	public Adapter createExpenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Receipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Receipt
	 * @generated
	 */
	public Adapter createReceiptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Resident <em>Resident</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Resident
	 * @generated
	 */
	public Adapter createResidentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ReceptionistInterface <em>Receptionist Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ReceptionistInterface
	 * @generated
	 */
	public Adapter createReceptionistInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Booking
	 * @generated
	 */
	public Adapter createBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.AdminInterface <em>Admin Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.AdminInterface
	 * @generated
	 */
	public Adapter createAdminInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Promotion <em>Promotion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Promotion
	 * @generated
	 */
	public Adapter createPromotionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.RoomExpert <em>Room Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.RoomExpert
	 * @generated
	 */
	public Adapter createRoomExpertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DatabaseInterface <em>Database Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DatabaseInterface
	 * @generated
	 */
	public Adapter createDatabaseInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ExpenseExpert <em>Expense Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ExpenseExpert
	 * @generated
	 */
	public Adapter createExpenseExpertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.UserExpert <em>User Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.UserExpert
	 * @generated
	 */
	public Adapter createUserExpertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.PromotionExpert <em>Promotion Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.PromotionExpert
	 * @generated
	 */
	public Adapter createPromotionExpertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BookingExpert <em>Booking Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BookingExpert
	 * @generated
	 */
	public Adapter createBookingExpertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ReceiptExpert <em>Receipt Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ReceiptExpert
	 * @generated
	 */
	public Adapter createReceiptExpertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.EmailSender <em>Email Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.EmailSender
	 * @generated
	 */
	public Adapter createEmailSenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Payment
	 * @generated
	 */
	public Adapter createPaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BookingController <em>Booking Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BookingController
	 * @generated
	 */
	public Adapter createBookingControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.AdminController <em>Admin Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.AdminController
	 * @generated
	 */
	public Adapter createAdminControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ReceptionistController <em>Receptionist Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ReceptionistController
	 * @generated
	 */
	public Adapter createReceptionistControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.MSAccessDB <em>MS Access DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.MSAccessDB
	 * @generated
	 */
	public Adapter createMSAccessDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
