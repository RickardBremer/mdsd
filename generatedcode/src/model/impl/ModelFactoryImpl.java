/**
 */
package model.impl;

import model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.BANK_COMPONENT: return createBankComponent();
			case ModelPackage.HOTEL_COMPONENT: return createHotelComponent();
			case ModelPackage.RECEPTIONIST: return createReceptionist();
			case ModelPackage.CUSTOMERS: return createCustomers();
			case ModelPackage.ADMIN: return createAdmin();
			case ModelPackage.ROOM: return createRoom();
			case ModelPackage.EXPENSE: return createExpense();
			case ModelPackage.RECEIPT: return createReceipt();
			case ModelPackage.USER: return createUser();
			case ModelPackage.RESIDENT: return createResident();
			case ModelPackage.CUSTOMER: return createCustomer();
			case ModelPackage.BOOKING: return createBooking();
			case ModelPackage.PROMOTION: return createPromotion();
			case ModelPackage.ROOM_EXPERT: return createRoomExpert();
			case ModelPackage.EXPENSE_EXPERT: return createExpenseExpert();
			case ModelPackage.USER_EXPERT: return createUserExpert();
			case ModelPackage.PROMOTION_EXPERT: return createPromotionExpert();
			case ModelPackage.BOOKING_EXPERT: return createBookingExpert();
			case ModelPackage.RECEIPT_EXPERT: return createReceiptExpert();
			case ModelPackage.EMAIL: return createemail();
			case ModelPackage.PAYMENT: return createPayment();
			case ModelPackage.BOOKING_CONTROLLER: return createBookingController();
			case ModelPackage.ADMIN_CONTROLLER: return createAdminController();
			case ModelPackage.RECEPTIONIST_CONTROLLER: return createReceptionistController();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankComponent createBankComponent() {
		BankComponentImpl bankComponent = new BankComponentImpl();
		return bankComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelComponent createHotelComponent() {
		HotelComponentImpl hotelComponent = new HotelComponentImpl();
		return hotelComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receptionist createReceptionist() {
		ReceptionistImpl receptionist = new ReceptionistImpl();
		return receptionist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customers createCustomers() {
		CustomersImpl customers = new CustomersImpl();
		return customers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Admin createAdmin() {
		AdminImpl admin = new AdminImpl();
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expense createExpense() {
		ExpenseImpl expense = new ExpenseImpl();
		return expense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receipt createReceipt() {
		ReceiptImpl receipt = new ReceiptImpl();
		return receipt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resident createResident() {
		ResidentImpl resident = new ResidentImpl();
		return resident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking createBooking() {
		BookingImpl booking = new BookingImpl();
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Promotion createPromotion() {
		PromotionImpl promotion = new PromotionImpl();
		return promotion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomExpert createRoomExpert() {
		RoomExpertImpl roomExpert = new RoomExpertImpl();
		return roomExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpenseExpert createExpenseExpert() {
		ExpenseExpertImpl expenseExpert = new ExpenseExpertImpl();
		return expenseExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserExpert createUserExpert() {
		UserExpertImpl userExpert = new UserExpertImpl();
		return userExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PromotionExpert createPromotionExpert() {
		PromotionExpertImpl promotionExpert = new PromotionExpertImpl();
		return promotionExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingExpert createBookingExpert() {
		BookingExpertImpl bookingExpert = new BookingExpertImpl();
		return bookingExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiptExpert createReceiptExpert() {
		ReceiptExpertImpl receiptExpert = new ReceiptExpertImpl();
		return receiptExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public email createemail() {
		emailImpl email = new emailImpl();
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Payment createPayment() {
		PaymentImpl payment = new PaymentImpl();
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingController createBookingController() {
		BookingControllerImpl bookingController = new BookingControllerImpl();
		return bookingController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdminController createAdminController() {
		AdminControllerImpl adminController = new AdminControllerImpl();
		return adminController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceptionistController createReceptionistController() {
		ReceptionistControllerImpl receptionistController = new ReceptionistControllerImpl();
		return receptionistController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
