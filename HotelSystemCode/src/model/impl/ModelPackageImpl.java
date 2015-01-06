/**
 */
package model.impl;

import model.Admin;
import model.AdminController;
import model.AdminInterface;
import model.BankComponent;
import model.BankInterface;
import model.Booking;
import model.BookingController;
import model.BookingExpert;
import model.Customer;
import model.CustomerInterface;
import model.Customers;
import model.DatabaseInterface;
import model.EmailSender;
import model.Expense;
import model.ExpenseExpert;
import model.HotelComponent;
import model.MSAccessDB;
import model.ModelFactory;
import model.ModelPackage;
import model.Payment;
import model.Promotion;
import model.PromotionExpert;
import model.Receipt;
import model.ReceiptExpert;
import model.Receptionist;
import model.ReceptionistController;
import model.ReceptionistInterface;
import model.Resident;
import model.Room;
import model.RoomExpert;
import model.User;
import model.UserExpert;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bankComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotelComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receptionistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bankInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass residentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receptionistInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass promotionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomExpertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expenseExpertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userExpertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass promotionExpertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingExpertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiptExpertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emailSenderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receptionistControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass msAccessDBEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theModelPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBankComponent() {
		return bankComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotelComponent() {
		return hotelComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceptionist() {
		return receptionistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomers() {
		return customersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdmin() {
		return adminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBankInterface() {
		return bankInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerInterface() {
		return customerInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomerInterface__SearchRooms__Date_Date_int_int() {
		return customerInterfaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomerInterface__CreateCustomer__String_String_String_String_String_String_int_int() {
		return customerInterfaceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomerInterface__Pay__Customer_Receipt() {
		return customerInterfaceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomerInterface__ValidateCard__Customer() {
		return customerInterfaceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomerInterface__CreateBooking__Date_Date_String_Customer_String_Receipt_EList() {
		return customerInterfaceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Number() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Description() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Clean() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Type() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Price() {
		return (EReference)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Beds() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Receipt() {
		return (EReference)roomEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Residents() {
		return (EReference)roomEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Status() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoom__Room__int_String_String_Expense_int_String() {
		return roomEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpense() {
		return expenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpense_Price() {
		return (EAttribute)expenseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpense_Name() {
		return (EAttribute)expenseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpense_Description() {
		return (EAttribute)expenseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpense_Date() {
		return (EAttribute)expenseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpense_Id() {
		return (EAttribute)expenseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpense_Fixed() {
		return (EAttribute)expenseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpense__Expense__int_String_Date_String_double_boolean() {
		return expenseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceipt() {
		return receiptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceipt_TotalCost() {
		return (EAttribute)receiptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceipt_Date() {
		return (EAttribute)receiptEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceipt_Id() {
		return (EAttribute)receiptEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceipt_Expenses() {
		return (EReference)receiptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceipt__AddExpense__Expense() {
		return receiptEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceipt__RemoveExpense__Expense() {
		return receiptEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceipt__GetAllExpenses() {
		return receiptEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceipt__Receipt__int_Date_EList() {
		return receiptEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_FirstName() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Surname() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Password() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Id() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Receptionist() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Administrator() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__User__String_String_String_boolean_boolean_int() {
		return userEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResident() {
		return residentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResident_FirstName() {
		return (EAttribute)residentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResident_Surname() {
		return (EAttribute)residentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResident_Id() {
		return (EAttribute)residentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResident__Resident__String_String_String() {
		return residentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_FirstName() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Surname() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Email() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Adress() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_CcNumber() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Ccv() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_ExpiringMonth() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_ExpiringYear() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__Customer__String_String_String_String_String_String_int_int() {
		return customerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceptionistInterface() {
		return receptionistInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceptionistInterface__CreateResident__String_String_String() {
		return receptionistInterfaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceptionistInterface__ViewAllBookings__Date_Date() {
		return receptionistInterfaceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceptionistInterface__GetBooking__int() {
		return receptionistInterfaceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceptionistInterface__ViewUnOccupiedRooms() {
		return receptionistInterfaceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceptionistInterface__ViewAllBookings__String_Date_Date() {
		return receptionistInterfaceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceptionistInterface__ViewUnOccupiedRooms__String() {
		return receptionistInterfaceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceptionistInterface__CheckIn__Booking_EList() {
		return receptionistInterfaceEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceptionistInterface__CheckOut__Booking() {
		return receptionistInterfaceEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooking() {
		return bookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Customer() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_FromDate() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_ToDate() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Wishes() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Promotion() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_RoomTypes() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_CheckedIn() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Id() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Receipt() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Room() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__Booking__Date_Date_String_Customer_EList_String_int_EList() {
		return bookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdminInterface() {
		return adminInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminInterface__Login__String_String() {
		return adminInterfaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminInterface__CreateRoom__int_String_String_int_int() {
		return adminInterfaceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminInterface__RemoveRoom__Room() {
		return adminInterfaceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminInterface__UpdateRoom__Room() {
		return adminInterfaceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminInterface__CreateUser__String_String_String_boolean_boolean() {
		return adminInterfaceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminInterface__RemoveUser__User() {
		return adminInterfaceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminInterface__UpdateUser__User() {
		return adminInterfaceEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminInterface__CreatePromotion__String_String_int_Date() {
		return adminInterfaceEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminInterface__RemovePromotion__Promotion() {
		return adminInterfaceEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminInterface__UpdatePromotion__Promotion() {
		return adminInterfaceEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminInterface__CreateExpense__int_String_String_Date() {
		return adminInterfaceEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminInterface__RemoveExpense__Expense() {
		return adminInterfaceEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminInterface__UpdateExpense__Expense() {
		return adminInterfaceEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminInterface__ViewRooms() {
		return adminInterfaceEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminInterface__ViewPromotions() {
		return adminInterfaceEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminInterface__ViewUsers() {
		return adminInterfaceEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminInterface__ViewExpenses() {
		return adminInterfaceEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminInterface__AdminController__RoomExpert_ExpenseExpert_UserExpert_PromotionExpert() {
		return adminInterfaceEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPromotion() {
		return promotionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPromotion_Code() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPromotion_Description() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPromotion_Percentage() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPromotion_ValidFrom() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPromotion_ValidTo() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPromotion_RoomType() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPromotion_ExpirationDate() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPromotion__CalculateDiscount__Room() {
		return promotionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPromotion__Promotion__String_String_int_Date_Date_String_Date() {
		return promotionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomExpert() {
		return roomExpertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomExpert_Database() {
		return (EReference)roomExpertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomExpert__GetAllRooms() {
		return roomExpertEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomExpert__GetAvailableRoomTypes__Date_Date_int_int() {
		return roomExpertEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomExpert__GetUnoccupiedRooms() {
		return roomExpertEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomExpert__AddRoom__Room() {
		return roomExpertEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomExpert__RemoveRoom__Room() {
		return roomExpertEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomExpert__UpdateRoom__Room() {
		return roomExpertEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomExpert__GetRoom__int() {
		return roomExpertEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomExpert__RoomExpert__DatabaseInterface() {
		return roomExpertEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseInterface() {
		return databaseInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDatabaseInterface__Query__String() {
		return databaseInterfaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDatabaseInterface__Send__String() {
		return databaseInterfaceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpenseExpert() {
		return expenseExpertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpenseExpert_Database() {
		return (EReference)expenseExpertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpenseExpert__GetExpense__int() {
		return expenseExpertEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpenseExpert__GetAllExpense() {
		return expenseExpertEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpenseExpert__AddExpense__Expense() {
		return expenseExpertEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpenseExpert__RemoveExpense__int() {
		return expenseExpertEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpenseExpert__UpdateExpense__Expense() {
		return expenseExpertEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpenseExpert__ExpenseExpert__DatabaseInterface() {
		return expenseExpertEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserExpert() {
		return userExpertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserExpert_Database() {
		return (EReference)userExpertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserExpert__GetUser__int() {
		return userExpertEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserExpert__GetAllUsers() {
		return userExpertEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserExpert__AddUser__User() {
		return userExpertEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserExpert__RemoveUser__int() {
		return userExpertEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserExpert__UpdateUser__User() {
		return userExpertEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserExpert__Login__String_String() {
		return userExpertEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserExpert__UserExpert__DatabaseInterface() {
		return userExpertEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPromotionExpert() {
		return promotionExpertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPromotionExpert_Database() {
		return (EReference)promotionExpertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPromotionExpert__GetPromotion__String() {
		return promotionExpertEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPromotionExpert__GetAllPromotions() {
		return promotionExpertEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPromotionExpert__RemovePromotion__String() {
		return promotionExpertEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPromotionExpert__UpdatePromotion__Promotion() {
		return promotionExpertEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPromotionExpert__PromotionExpert__DatabaseInterface() {
		return promotionExpertEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPromotionExpert__AddPromotion__Promotion() {
		return promotionExpertEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingExpert() {
		return bookingExpertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingExpert_Database() {
		return (EReference)bookingExpertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingExpert__GetBooking__int() {
		return bookingExpertEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingExpert__GetAllBookings__Date_Date() {
		return bookingExpertEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingExpert__AddBooking__Booking() {
		return bookingExpertEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingExpert__RemoveBooking__Booking() {
		return bookingExpertEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingExpert__UpdateBooking__Booking() {
		return bookingExpertEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingExpert__GetAllBookings__Date_Date_String() {
		return bookingExpertEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingExpert__BookingExpert__DatabaseInterface() {
		return bookingExpertEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingExpert__CheckIn__Booking_EList() {
		return bookingExpertEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingExpert__CheckOut__Booking() {
		return bookingExpertEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiptExpert() {
		return receiptExpertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiptExpert_Database() {
		return (EReference)receiptExpertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceiptExpert__GetReceipt__int() {
		return receiptExpertEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceiptExpert__GetReceipt__Booking() {
		return receiptExpertEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceiptExpert__GetReceipt__Room() {
		return receiptExpertEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceiptExpert__GetAllReceipt() {
		return receiptExpertEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceiptExpert__Combine__EList() {
		return receiptExpertEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceiptExpert__AddReceipt__Receipt() {
		return receiptExpertEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceiptExpert__RemoveReceipt__Receipt() {
		return receiptExpertEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceiptExpert__UpdateReceipt__Receipt() {
		return receiptExpertEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceiptExpert__ReceiptExpert__DatabaseInterface() {
		return receiptExpertEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmailSender() {
		return emailSenderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmailSender__Send__Booking() {
		return emailSenderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayment() {
		return paymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayment__MakePayment__Customer_double() {
		return paymentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayment__IsCreditCardValid__Customer() {
		return paymentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingController() {
		return bookingControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingController_Room() {
		return (EReference)bookingControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingController_BookingExpert() {
		return (EReference)bookingControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingController_PromotionExpert() {
		return (EReference)bookingControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingController_DatabaseInterface() {
		return (EReference)bookingControllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingController_ExpenseExpert() {
		return (EReference)bookingControllerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingController_ReceiptExpert() {
		return (EReference)bookingControllerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingController__BookingController__RoomExpert_BookingExpert_PromotionExpert() {
		return bookingControllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdminController() {
		return adminControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdminController_UserExpert() {
		return (EReference)adminControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdminController_ExpenseExpert() {
		return (EReference)adminControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdminController_PromoExpert() {
		return (EReference)adminControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdminController_DatabaseInterface() {
		return (EReference)adminControllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdminController__AdminController__ExpenseExpert_PromotionExpert_UserExpert_RoomExpert() {
		return adminControllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceptionistController() {
		return receptionistControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceptionistController_UserExpert() {
		return (EReference)receptionistControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceptionistController__ReceptionistController__ReceiptExpert_ExpenseExpert_RoomExpert_BookingExpert_PromotionExpert_UserExpert() {
		return receptionistControllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSAccessDB() {
		return msAccessDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bankComponentEClass = createEClass(BANK_COMPONENT);

		hotelComponentEClass = createEClass(HOTEL_COMPONENT);

		receptionistEClass = createEClass(RECEPTIONIST);

		customersEClass = createEClass(CUSTOMERS);

		adminEClass = createEClass(ADMIN);

		bankInterfaceEClass = createEClass(BANK_INTERFACE);

		customerInterfaceEClass = createEClass(CUSTOMER_INTERFACE);
		createEOperation(customerInterfaceEClass, CUSTOMER_INTERFACE___SEARCH_ROOMS__DATE_DATE_INT_INT);
		createEOperation(customerInterfaceEClass, CUSTOMER_INTERFACE___CREATE_CUSTOMER__STRING_STRING_STRING_STRING_STRING_STRING_INT_INT);
		createEOperation(customerInterfaceEClass, CUSTOMER_INTERFACE___PAY__CUSTOMER_RECEIPT);
		createEOperation(customerInterfaceEClass, CUSTOMER_INTERFACE___VALIDATE_CARD__CUSTOMER);
		createEOperation(customerInterfaceEClass, CUSTOMER_INTERFACE___CREATE_BOOKING__DATE_DATE_STRING_CUSTOMER_STRING_RECEIPT_ELIST);

		roomEClass = createEClass(ROOM);
		createEReference(roomEClass, ROOM__PRICE);
		createEAttribute(roomEClass, ROOM__NUMBER);
		createEAttribute(roomEClass, ROOM__DESCRIPTION);
		createEAttribute(roomEClass, ROOM__CLEAN);
		createEAttribute(roomEClass, ROOM__TYPE);
		createEAttribute(roomEClass, ROOM__BEDS);
		createEReference(roomEClass, ROOM__RECEIPT);
		createEReference(roomEClass, ROOM__RESIDENTS);
		createEAttribute(roomEClass, ROOM__STATUS);
		createEOperation(roomEClass, ROOM___ROOM__INT_STRING_STRING_EXPENSE_INT_STRING);

		expenseEClass = createEClass(EXPENSE);
		createEAttribute(expenseEClass, EXPENSE__PRICE);
		createEAttribute(expenseEClass, EXPENSE__NAME);
		createEAttribute(expenseEClass, EXPENSE__DESCRIPTION);
		createEAttribute(expenseEClass, EXPENSE__DATE);
		createEAttribute(expenseEClass, EXPENSE__ID);
		createEAttribute(expenseEClass, EXPENSE__FIXED);
		createEOperation(expenseEClass, EXPENSE___EXPENSE__INT_STRING_DATE_STRING_DOUBLE_BOOLEAN);

		receiptEClass = createEClass(RECEIPT);
		createEReference(receiptEClass, RECEIPT__EXPENSES);
		createEAttribute(receiptEClass, RECEIPT__TOTAL_COST);
		createEAttribute(receiptEClass, RECEIPT__DATE);
		createEAttribute(receiptEClass, RECEIPT__ID);
		createEOperation(receiptEClass, RECEIPT___ADD_EXPENSE__EXPENSE);
		createEOperation(receiptEClass, RECEIPT___REMOVE_EXPENSE__EXPENSE);
		createEOperation(receiptEClass, RECEIPT___GET_ALL_EXPENSES);
		createEOperation(receiptEClass, RECEIPT___RECEIPT__INT_DATE_ELIST);

		residentEClass = createEClass(RESIDENT);
		createEAttribute(residentEClass, RESIDENT__FIRST_NAME);
		createEAttribute(residentEClass, RESIDENT__SURNAME);
		createEAttribute(residentEClass, RESIDENT__ID);
		createEOperation(residentEClass, RESIDENT___RESIDENT__STRING_STRING_STRING);

		customerEClass = createEClass(CUSTOMER);
		createEAttribute(customerEClass, CUSTOMER__FIRST_NAME);
		createEAttribute(customerEClass, CUSTOMER__SURNAME);
		createEAttribute(customerEClass, CUSTOMER__EMAIL);
		createEAttribute(customerEClass, CUSTOMER__ADRESS);
		createEAttribute(customerEClass, CUSTOMER__CC_NUMBER);
		createEAttribute(customerEClass, CUSTOMER__CCV);
		createEAttribute(customerEClass, CUSTOMER__EXPIRING_MONTH);
		createEAttribute(customerEClass, CUSTOMER__EXPIRING_YEAR);
		createEOperation(customerEClass, CUSTOMER___CUSTOMER__STRING_STRING_STRING_STRING_STRING_STRING_INT_INT);

		receptionistInterfaceEClass = createEClass(RECEPTIONIST_INTERFACE);
		createEOperation(receptionistInterfaceEClass, RECEPTIONIST_INTERFACE___CREATE_RESIDENT__STRING_STRING_STRING);
		createEOperation(receptionistInterfaceEClass, RECEPTIONIST_INTERFACE___VIEW_ALL_BOOKINGS__DATE_DATE);
		createEOperation(receptionistInterfaceEClass, RECEPTIONIST_INTERFACE___GET_BOOKING__INT);
		createEOperation(receptionistInterfaceEClass, RECEPTIONIST_INTERFACE___VIEW_UN_OCCUPIED_ROOMS);
		createEOperation(receptionistInterfaceEClass, RECEPTIONIST_INTERFACE___VIEW_ALL_BOOKINGS__STRING_DATE_DATE);
		createEOperation(receptionistInterfaceEClass, RECEPTIONIST_INTERFACE___VIEW_UN_OCCUPIED_ROOMS__STRING);
		createEOperation(receptionistInterfaceEClass, RECEPTIONIST_INTERFACE___CHECK_IN__BOOKING_ELIST);
		createEOperation(receptionistInterfaceEClass, RECEPTIONIST_INTERFACE___CHECK_OUT__BOOKING);

		bookingEClass = createEClass(BOOKING);
		createEReference(bookingEClass, BOOKING__CUSTOMER);
		createEAttribute(bookingEClass, BOOKING__FROM_DATE);
		createEAttribute(bookingEClass, BOOKING__TO_DATE);
		createEAttribute(bookingEClass, BOOKING__WISHES);
		createEAttribute(bookingEClass, BOOKING__PROMOTION);
		createEAttribute(bookingEClass, BOOKING__ROOM_TYPES);
		createEAttribute(bookingEClass, BOOKING__CHECKED_IN);
		createEAttribute(bookingEClass, BOOKING__ID);
		createEReference(bookingEClass, BOOKING__RECEIPT);
		createEReference(bookingEClass, BOOKING__ROOM);
		createEOperation(bookingEClass, BOOKING___BOOKING__DATE_DATE_STRING_CUSTOMER_ELIST_STRING_INT_ELIST);

		adminInterfaceEClass = createEClass(ADMIN_INTERFACE);
		createEOperation(adminInterfaceEClass, ADMIN_INTERFACE___LOGIN__STRING_STRING);
		createEOperation(adminInterfaceEClass, ADMIN_INTERFACE___CREATE_ROOM__INT_STRING_STRING_INT_INT);
		createEOperation(adminInterfaceEClass, ADMIN_INTERFACE___REMOVE_ROOM__ROOM);
		createEOperation(adminInterfaceEClass, ADMIN_INTERFACE___UPDATE_ROOM__ROOM);
		createEOperation(adminInterfaceEClass, ADMIN_INTERFACE___CREATE_USER__STRING_STRING_STRING_BOOLEAN_BOOLEAN);
		createEOperation(adminInterfaceEClass, ADMIN_INTERFACE___REMOVE_USER__USER);
		createEOperation(adminInterfaceEClass, ADMIN_INTERFACE___UPDATE_USER__USER);
		createEOperation(adminInterfaceEClass, ADMIN_INTERFACE___CREATE_PROMOTION__STRING_STRING_INT_DATE);
		createEOperation(adminInterfaceEClass, ADMIN_INTERFACE___REMOVE_PROMOTION__PROMOTION);
		createEOperation(adminInterfaceEClass, ADMIN_INTERFACE___UPDATE_PROMOTION__PROMOTION);
		createEOperation(adminInterfaceEClass, ADMIN_INTERFACE___CREATE_EXPENSE__INT_STRING_STRING_DATE);
		createEOperation(adminInterfaceEClass, ADMIN_INTERFACE___REMOVE_EXPENSE__EXPENSE);
		createEOperation(adminInterfaceEClass, ADMIN_INTERFACE___UPDATE_EXPENSE__EXPENSE);
		createEOperation(adminInterfaceEClass, ADMIN_INTERFACE___VIEW_ROOMS);
		createEOperation(adminInterfaceEClass, ADMIN_INTERFACE___VIEW_PROMOTIONS);
		createEOperation(adminInterfaceEClass, ADMIN_INTERFACE___VIEW_USERS);
		createEOperation(adminInterfaceEClass, ADMIN_INTERFACE___VIEW_EXPENSES);
		createEOperation(adminInterfaceEClass, ADMIN_INTERFACE___ADMIN_CONTROLLER__ROOMEXPERT_EXPENSEEXPERT_USEREXPERT_PROMOTIONEXPERT);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__FIRST_NAME);
		createEAttribute(userEClass, USER__SURNAME);
		createEAttribute(userEClass, USER__PASSWORD);
		createEAttribute(userEClass, USER__ID);
		createEAttribute(userEClass, USER__RECEPTIONIST);
		createEAttribute(userEClass, USER__ADMINISTRATOR);
		createEOperation(userEClass, USER___USER__STRING_STRING_STRING_BOOLEAN_BOOLEAN_INT);

		promotionEClass = createEClass(PROMOTION);
		createEAttribute(promotionEClass, PROMOTION__CODE);
		createEAttribute(promotionEClass, PROMOTION__DESCRIPTION);
		createEAttribute(promotionEClass, PROMOTION__PERCENTAGE);
		createEAttribute(promotionEClass, PROMOTION__VALID_FROM);
		createEAttribute(promotionEClass, PROMOTION__VALID_TO);
		createEAttribute(promotionEClass, PROMOTION__ROOM_TYPE);
		createEAttribute(promotionEClass, PROMOTION__EXPIRATION_DATE);
		createEOperation(promotionEClass, PROMOTION___CALCULATE_DISCOUNT__ROOM);
		createEOperation(promotionEClass, PROMOTION___PROMOTION__STRING_STRING_INT_DATE_DATE_STRING_DATE);

		roomExpertEClass = createEClass(ROOM_EXPERT);
		createEReference(roomExpertEClass, ROOM_EXPERT__DATABASE);
		createEOperation(roomExpertEClass, ROOM_EXPERT___GET_ALL_ROOMS);
		createEOperation(roomExpertEClass, ROOM_EXPERT___GET_AVAILABLE_ROOM_TYPES__DATE_DATE_INT_INT);
		createEOperation(roomExpertEClass, ROOM_EXPERT___GET_UNOCCUPIED_ROOMS);
		createEOperation(roomExpertEClass, ROOM_EXPERT___ADD_ROOM__ROOM);
		createEOperation(roomExpertEClass, ROOM_EXPERT___REMOVE_ROOM__ROOM);
		createEOperation(roomExpertEClass, ROOM_EXPERT___UPDATE_ROOM__ROOM);
		createEOperation(roomExpertEClass, ROOM_EXPERT___GET_ROOM__INT);
		createEOperation(roomExpertEClass, ROOM_EXPERT___ROOM_EXPERT__DATABASEINTERFACE);

		databaseInterfaceEClass = createEClass(DATABASE_INTERFACE);
		createEOperation(databaseInterfaceEClass, DATABASE_INTERFACE___QUERY__STRING);
		createEOperation(databaseInterfaceEClass, DATABASE_INTERFACE___SEND__STRING);

		expenseExpertEClass = createEClass(EXPENSE_EXPERT);
		createEReference(expenseExpertEClass, EXPENSE_EXPERT__DATABASE);
		createEOperation(expenseExpertEClass, EXPENSE_EXPERT___GET_EXPENSE__INT);
		createEOperation(expenseExpertEClass, EXPENSE_EXPERT___GET_ALL_EXPENSE);
		createEOperation(expenseExpertEClass, EXPENSE_EXPERT___ADD_EXPENSE__EXPENSE);
		createEOperation(expenseExpertEClass, EXPENSE_EXPERT___REMOVE_EXPENSE__INT);
		createEOperation(expenseExpertEClass, EXPENSE_EXPERT___UPDATE_EXPENSE__EXPENSE);
		createEOperation(expenseExpertEClass, EXPENSE_EXPERT___EXPENSE_EXPERT__DATABASEINTERFACE);

		userExpertEClass = createEClass(USER_EXPERT);
		createEReference(userExpertEClass, USER_EXPERT__DATABASE);
		createEOperation(userExpertEClass, USER_EXPERT___GET_USER__INT);
		createEOperation(userExpertEClass, USER_EXPERT___GET_ALL_USERS);
		createEOperation(userExpertEClass, USER_EXPERT___ADD_USER__USER);
		createEOperation(userExpertEClass, USER_EXPERT___REMOVE_USER__INT);
		createEOperation(userExpertEClass, USER_EXPERT___UPDATE_USER__USER);
		createEOperation(userExpertEClass, USER_EXPERT___LOGIN__STRING_STRING);
		createEOperation(userExpertEClass, USER_EXPERT___USER_EXPERT__DATABASEINTERFACE);

		promotionExpertEClass = createEClass(PROMOTION_EXPERT);
		createEReference(promotionExpertEClass, PROMOTION_EXPERT__DATABASE);
		createEOperation(promotionExpertEClass, PROMOTION_EXPERT___GET_PROMOTION__STRING);
		createEOperation(promotionExpertEClass, PROMOTION_EXPERT___GET_ALL_PROMOTIONS);
		createEOperation(promotionExpertEClass, PROMOTION_EXPERT___REMOVE_PROMOTION__STRING);
		createEOperation(promotionExpertEClass, PROMOTION_EXPERT___UPDATE_PROMOTION__PROMOTION);
		createEOperation(promotionExpertEClass, PROMOTION_EXPERT___PROMOTION_EXPERT__DATABASEINTERFACE);
		createEOperation(promotionExpertEClass, PROMOTION_EXPERT___ADD_PROMOTION__PROMOTION);

		bookingExpertEClass = createEClass(BOOKING_EXPERT);
		createEReference(bookingExpertEClass, BOOKING_EXPERT__DATABASE);
		createEOperation(bookingExpertEClass, BOOKING_EXPERT___GET_BOOKING__INT);
		createEOperation(bookingExpertEClass, BOOKING_EXPERT___GET_ALL_BOOKINGS__DATE_DATE);
		createEOperation(bookingExpertEClass, BOOKING_EXPERT___ADD_BOOKING__BOOKING);
		createEOperation(bookingExpertEClass, BOOKING_EXPERT___REMOVE_BOOKING__BOOKING);
		createEOperation(bookingExpertEClass, BOOKING_EXPERT___UPDATE_BOOKING__BOOKING);
		createEOperation(bookingExpertEClass, BOOKING_EXPERT___GET_ALL_BOOKINGS__DATE_DATE_STRING);
		createEOperation(bookingExpertEClass, BOOKING_EXPERT___BOOKING_EXPERT__DATABASEINTERFACE);
		createEOperation(bookingExpertEClass, BOOKING_EXPERT___CHECK_IN__BOOKING_ELIST);
		createEOperation(bookingExpertEClass, BOOKING_EXPERT___CHECK_OUT__BOOKING);

		receiptExpertEClass = createEClass(RECEIPT_EXPERT);
		createEReference(receiptExpertEClass, RECEIPT_EXPERT__DATABASE);
		createEOperation(receiptExpertEClass, RECEIPT_EXPERT___GET_RECEIPT__INT);
		createEOperation(receiptExpertEClass, RECEIPT_EXPERT___GET_RECEIPT__BOOKING);
		createEOperation(receiptExpertEClass, RECEIPT_EXPERT___GET_RECEIPT__ROOM);
		createEOperation(receiptExpertEClass, RECEIPT_EXPERT___GET_ALL_RECEIPT);
		createEOperation(receiptExpertEClass, RECEIPT_EXPERT___COMBINE__ELIST);
		createEOperation(receiptExpertEClass, RECEIPT_EXPERT___ADD_RECEIPT__RECEIPT);
		createEOperation(receiptExpertEClass, RECEIPT_EXPERT___REMOVE_RECEIPT__RECEIPT);
		createEOperation(receiptExpertEClass, RECEIPT_EXPERT___UPDATE_RECEIPT__RECEIPT);
		createEOperation(receiptExpertEClass, RECEIPT_EXPERT___RECEIPT_EXPERT__DATABASEINTERFACE);

		emailSenderEClass = createEClass(EMAIL_SENDER);
		createEOperation(emailSenderEClass, EMAIL_SENDER___SEND__BOOKING);

		paymentEClass = createEClass(PAYMENT);
		createEOperation(paymentEClass, PAYMENT___MAKE_PAYMENT__CUSTOMER_DOUBLE);
		createEOperation(paymentEClass, PAYMENT___IS_CREDIT_CARD_VALID__CUSTOMER);

		bookingControllerEClass = createEClass(BOOKING_CONTROLLER);
		createEReference(bookingControllerEClass, BOOKING_CONTROLLER__ROOM);
		createEReference(bookingControllerEClass, BOOKING_CONTROLLER__BOOKING_EXPERT);
		createEReference(bookingControllerEClass, BOOKING_CONTROLLER__PROMOTION_EXPERT);
		createEReference(bookingControllerEClass, BOOKING_CONTROLLER__DATABASE_INTERFACE);
		createEReference(bookingControllerEClass, BOOKING_CONTROLLER__EXPENSE_EXPERT);
		createEReference(bookingControllerEClass, BOOKING_CONTROLLER__RECEIPT_EXPERT);
		createEOperation(bookingControllerEClass, BOOKING_CONTROLLER___BOOKING_CONTROLLER__ROOMEXPERT_BOOKINGEXPERT_PROMOTIONEXPERT);

		adminControllerEClass = createEClass(ADMIN_CONTROLLER);
		createEReference(adminControllerEClass, ADMIN_CONTROLLER__USER_EXPERT);
		createEReference(adminControllerEClass, ADMIN_CONTROLLER__EXPENSE_EXPERT);
		createEReference(adminControllerEClass, ADMIN_CONTROLLER__PROMO_EXPERT);
		createEReference(adminControllerEClass, ADMIN_CONTROLLER__DATABASE_INTERFACE);
		createEOperation(adminControllerEClass, ADMIN_CONTROLLER___ADMIN_CONTROLLER__EXPENSEEXPERT_PROMOTIONEXPERT_USEREXPERT_ROOMEXPERT);

		receptionistControllerEClass = createEClass(RECEPTIONIST_CONTROLLER);
		createEReference(receptionistControllerEClass, RECEPTIONIST_CONTROLLER__USER_EXPERT);
		createEOperation(receptionistControllerEClass, RECEPTIONIST_CONTROLLER___RECEPTIONIST_CONTROLLER__RECEIPTEXPERT_EXPENSEEXPERT_ROOMEXPERT_BOOKINGEXPERT_PROMOTIONEXPERT_USEREXPERT);

		msAccessDBEClass = createEClass(MS_ACCESS_DB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bookingControllerEClass.getESuperTypes().add(this.getCustomerInterface());
		adminControllerEClass.getESuperTypes().add(this.getAdminInterface());
		receptionistControllerEClass.getESuperTypes().add(this.getBookingController());
		receptionistControllerEClass.getESuperTypes().add(this.getReceptionistInterface());
		msAccessDBEClass.getESuperTypes().add(this.getDatabaseInterface());

		// Initialize classes, features, and operations; add parameters
		initEClass(bankComponentEClass, BankComponent.class, "BankComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hotelComponentEClass, HotelComponent.class, "HotelComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(receptionistEClass, Receptionist.class, "Receptionist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customersEClass, Customers.class, "Customers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adminEClass, Admin.class, "Admin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bankInterfaceEClass, BankInterface.class, "BankInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customerInterfaceEClass, CustomerInterface.class, "CustomerInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getCustomerInterface__SearchRooms__Date_Date_int_int(), this.getRoom(), "searchRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "dateFrom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "dateTo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numberOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numberOfRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCustomerInterface__CreateCustomer__String_String_String_String_String_String_int_int(), this.getCustomer(), "createCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "surname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "address", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiringMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expriningYear", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCustomerInterface__Pay__Customer_Receipt(), ecorePackage.getEBoolean(), "pay", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getReceipt(), "receipt", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCustomerInterface__ValidateCard__Customer(), ecorePackage.getEBoolean(), "validateCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCustomerInterface__CreateBooking__Date_Date_String_Customer_String_Receipt_EList(), ecorePackage.getEBoolean(), "createBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fromDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "toDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "wishes", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "promotion", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getReceipt(), "receipt", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoom_Price(), this.getExpense(), null, "price", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Number(), theTypesPackage.getInteger(), "number", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Description(), theTypesPackage.getString(), "description", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Clean(), theTypesPackage.getBoolean(), "clean", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Type(), theTypesPackage.getString(), "type", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Beds(), theTypesPackage.getInteger(), "beds", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_Receipt(), this.getReceipt(), null, "receipt", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_Residents(), this.getResident(), null, "residents", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Status(), theTypesPackage.getString(), "status", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRoom__Room__int_String_String_Expense_int_String(), null, "Room", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "number", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "type", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExpense(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "beds", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "status", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(expenseEClass, Expense.class, "Expense", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpense_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, Expense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExpense_Name(), theTypesPackage.getString(), "name", null, 1, 1, Expense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExpense_Description(), theTypesPackage.getString(), "description", null, 1, 1, Expense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExpense_Date(), ecorePackage.getEDate(), "date", null, 1, 1, Expense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExpense_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Expense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExpense_Fixed(), ecorePackage.getEBoolean(), "fixed", null, 1, 1, Expense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getExpense__Expense__int_String_Date_String_double_boolean(), null, "Expense", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isFixed", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(receiptEClass, Receipt.class, "Receipt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceipt_Expenses(), this.getExpense(), null, "expenses", null, 0, -1, Receipt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReceipt_TotalCost(), ecorePackage.getEDouble(), "totalCost", null, 1, 1, Receipt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReceipt_Date(), ecorePackage.getEDate(), "Date", null, 1, 1, Receipt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReceipt_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Receipt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getReceipt__AddExpense__Expense(), ecorePackage.getEBoolean(), "addExpense", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExpense(), "expense", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReceipt__RemoveExpense__Expense(), ecorePackage.getEBoolean(), "removeExpense", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExpense(), "expense", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReceipt__GetAllExpenses(), this.getExpense(), "getAllExpenses", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReceipt__Receipt__int_Date_EList(), null, "Receipt", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExpense(), "expenses", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(residentEClass, Resident.class, "Resident", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResident_FirstName(), theTypesPackage.getString(), "firstName", null, 1, 1, Resident.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResident_Surname(), theTypesPackage.getString(), "surname", null, 1, 1, Resident.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResident_Id(), theTypesPackage.getString(), "id", null, 1, 1, Resident.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getResident__Resident__String_String_String(), null, "Resident", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "surname", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomer_FirstName(), theTypesPackage.getString(), "firstName", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_Surname(), theTypesPackage.getString(), "surname", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_Email(), theTypesPackage.getString(), "email", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_Adress(), theTypesPackage.getString(), "adress", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_CcNumber(), theTypesPackage.getString(), "ccNumber", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_Ccv(), theTypesPackage.getString(), "ccv", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_ExpiringMonth(), theTypesPackage.getInteger(), "expiringMonth", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_ExpiringYear(), theTypesPackage.getInteger(), "expiringYear", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getCustomer__Customer__String_String_String_String_String_String_int_int(), null, "Customer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "surname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "address", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "ccExpiringMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "ccExpiringYear", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(receptionistInterfaceEClass, ReceptionistInterface.class, "ReceptionistInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getReceptionistInterface__CreateResident__String_String_String(), this.getResident(), "createResident", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "surname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "passportNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReceptionistInterface__ViewAllBookings__Date_Date(), this.getBooking(), "viewAllBookings", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fromDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "toDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReceptionistInterface__GetBooking__int(), this.getBooking(), "getBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReceptionistInterface__ViewUnOccupiedRooms(), this.getRoom(), "viewUnOccupiedRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReceptionistInterface__ViewAllBookings__String_Date_Date(), this.getBooking(), "viewAllBookings", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "surname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "dateFrom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "dateTo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReceptionistInterface__ViewUnOccupiedRooms__String(), this.getRoom(), "viewUnOccupiedRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReceptionistInterface__CheckIn__Booking_EList(), ecorePackage.getEBoolean(), "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "rooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReceptionistInterface__CheckOut__Booking(), ecorePackage.getEBoolean(), "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooking_Customer(), this.getCustomer(), null, "customer", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_ToDate(), ecorePackage.getEDate(), "toDate", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_Wishes(), theTypesPackage.getString(), "wishes", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_Promotion(), theTypesPackage.getString(), "promotion", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_RoomTypes(), theTypesPackage.getString(), "roomTypes", null, 0, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_CheckedIn(), theTypesPackage.getBoolean(), "checkedIn", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Receipt(), this.getReceipt(), null, "receipt", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Room(), this.getRoom(), null, "room", null, 0, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getBooking__Booking__Date_Date_String_Customer_EList_String_int_EList(), null, "Booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fromDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "toDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "wishes", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "promotionCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "rooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(adminInterfaceEClass, AdminInterface.class, "AdminInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAdminInterface__Login__String_String(), theTypesPackage.getBoolean(), "login", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminInterface__CreateRoom__int_String_String_int_int(), theTypesPackage.getBoolean(), "createRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomNo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "type", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "beds", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminInterface__RemoveRoom__Room(), theTypesPackage.getBoolean(), "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminInterface__UpdateRoom__Room(), ecorePackage.getEBoolean(), "updateRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminInterface__CreateUser__String_String_String_boolean_boolean(), theTypesPackage.getBoolean(), "createUser", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "surname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "receptionist", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "admin", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminInterface__RemoveUser__User(), theTypesPackage.getBoolean(), "removeUser", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUser(), "user", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminInterface__UpdateUser__User(), theTypesPackage.getBoolean(), "updateUser", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUser(), "user", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminInterface__CreatePromotion__String_String_int_Date(), ecorePackage.getEBoolean(), "createPromotion", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "code", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "percentage", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "validFrom", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminInterface__RemovePromotion__Promotion(), theTypesPackage.getBoolean(), "removePromotion", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPromotion(), "promotion", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminInterface__UpdatePromotion__Promotion(), theTypesPackage.getBoolean(), "updatePromotion", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPromotion(), "promotion", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminInterface__CreateExpense__int_String_String_Date(), theTypesPackage.getBoolean(), "createExpense", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminInterface__RemoveExpense__Expense(), theTypesPackage.getBoolean(), "removeExpense", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExpense(), "expense", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminInterface__UpdateExpense__Expense(), theTypesPackage.getBoolean(), "updateExpense", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExpense(), "expense", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAdminInterface__ViewRooms(), this.getRoom(), "viewRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAdminInterface__ViewPromotions(), this.getPromotion(), "viewPromotions", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAdminInterface__ViewUsers(), this.getUser(), "viewUsers", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAdminInterface__ViewExpenses(), this.getExpense(), "viewExpenses", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdminInterface__AdminController__RoomExpert_ExpenseExpert_UserExpert_PromotionExpert(), null, "AdminController", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomExpert(), "roomExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExpenseExpert(), "expenseExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUserExpert(), "userExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPromotionExpert(), "promotionExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_FirstName(), theTypesPackage.getString(), "firstName", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_Surname(), theTypesPackage.getString(), "surname", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_Password(), theTypesPackage.getString(), "password", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_Id(), theTypesPackage.getInteger(), "id", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_Receptionist(), theTypesPackage.getBoolean(), "receptionist", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_Administrator(), theTypesPackage.getBoolean(), "administrator", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getUser__User__String_String_String_boolean_boolean_int(), null, "User", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "surname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "receptionist", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "administrator", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(promotionEClass, Promotion.class, "Promotion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPromotion_Code(), theTypesPackage.getString(), "code", null, 1, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPromotion_Description(), theTypesPackage.getString(), "description", null, 1, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPromotion_Percentage(), theTypesPackage.getInteger(), "percentage", null, 1, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPromotion_ValidFrom(), ecorePackage.getEDate(), "validFrom", null, 1, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPromotion_ValidTo(), ecorePackage.getEDate(), "validTo", null, 1, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPromotion_RoomType(), theTypesPackage.getString(), "roomType", null, 1, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPromotion_ExpirationDate(), ecorePackage.getEDate(), "expirationDate", null, 1, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPromotion__CalculateDiscount__Room(), ecorePackage.getEDouble(), "calculateDiscount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPromotion__Promotion__String_String_int_Date_Date_String_Date(), null, "Promotion", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "code", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "percentage", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "vaildFrom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "vaildTo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "expirationDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomExpertEClass, RoomExpert.class, "RoomExpert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomExpert_Database(), this.getDatabaseInterface(), null, "database", null, 1, 1, RoomExpert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getRoomExpert__GetAllRooms(), this.getRoom(), "getAllRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomExpert__GetAvailableRoomTypes__Date_Date_int_int(), this.getRoom(), "getAvailableRoomTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "numberOfRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "numberOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomExpert__GetUnoccupiedRooms(), this.getRoom(), "getUnoccupiedRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomExpert__AddRoom__Room(), this.getRoom(), "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomExpert__RemoveRoom__Room(), ecorePackage.getEBoolean(), "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomExpert__UpdateRoom__Room(), ecorePackage.getEBoolean(), "updateRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomExpert__GetRoom__int(), this.getRoom(), "getRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomExpert__RoomExpert__DatabaseInterface(), null, "RoomExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDatabaseInterface(), "database", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(databaseInterfaceEClass, DatabaseInterface.class, "DatabaseInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getDatabaseInterface__Query__String(), theTypesPackage.getString(), "query", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "query", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getDatabaseInterface__Send__String(), ecorePackage.getEBoolean(), "send", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "query", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(expenseExpertEClass, ExpenseExpert.class, "ExpenseExpert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpenseExpert_Database(), this.getDatabaseInterface(), null, "database", null, 1, 1, ExpenseExpert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getExpenseExpert__GetExpense__int(), this.getExpense(), "getExpense", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getExpenseExpert__GetAllExpense(), this.getExpense(), "getAllExpense", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getExpenseExpert__AddExpense__Expense(), this.getExpense(), "addExpense", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExpense(), "expense", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getExpenseExpert__RemoveExpense__int(), ecorePackage.getEBoolean(), "removeExpense", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getExpenseExpert__UpdateExpense__Expense(), ecorePackage.getEBoolean(), "updateExpense", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExpense(), "expense", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getExpenseExpert__ExpenseExpert__DatabaseInterface(), null, "ExpenseExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDatabaseInterface(), "database", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(userExpertEClass, UserExpert.class, "UserExpert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserExpert_Database(), this.getDatabaseInterface(), null, "database", null, 1, 1, UserExpert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getUserExpert__GetUser__int(), this.getUser(), "getUser", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUserExpert__GetAllUsers(), this.getUser(), "getAllUsers", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getUserExpert__AddUser__User(), this.getUser(), "addUser", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUser(), "user", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getUserExpert__RemoveUser__int(), ecorePackage.getEBoolean(), "removeUser", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getUserExpert__UpdateUser__User(), ecorePackage.getEBoolean(), "updateUser", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUser(), "user", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getUserExpert__Login__String_String(), ecorePackage.getEBoolean(), "login", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getUserExpert__UserExpert__DatabaseInterface(), null, "UserExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDatabaseInterface(), "database", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(promotionExpertEClass, PromotionExpert.class, "PromotionExpert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPromotionExpert_Database(), this.getDatabaseInterface(), null, "database", null, 1, 1, PromotionExpert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPromotionExpert__GetPromotion__String(), this.getPromotion(), "getPromotion", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "promotionCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPromotionExpert__GetAllPromotions(), this.getPromotion(), "getAllPromotions", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPromotionExpert__RemovePromotion__String(), ecorePackage.getEBoolean(), "removePromotion", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "code", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPromotionExpert__UpdatePromotion__Promotion(), ecorePackage.getEBoolean(), "updatePromotion", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPromotion(), "promotion", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPromotionExpert__PromotionExpert__DatabaseInterface(), null, "PromotionExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDatabaseInterface(), "database", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPromotionExpert__AddPromotion__Promotion(), this.getPromotion(), "addPromotion", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPromotion(), "promotion", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingExpertEClass, BookingExpert.class, "BookingExpert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookingExpert_Database(), this.getDatabaseInterface(), null, "database", null, 1, 1, BookingExpert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getBookingExpert__GetBooking__int(), this.getBooking(), "getBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingExpert__GetAllBookings__Date_Date(), this.getBooking(), "getAllBookings", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "dateFrom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "dateTo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingExpert__AddBooking__Booking(), this.getBooking(), "addBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingExpert__RemoveBooking__Booking(), ecorePackage.getEBoolean(), "removeBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingExpert__UpdateBooking__Booking(), ecorePackage.getEBoolean(), "updateBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingExpert__GetAllBookings__Date_Date_String(), this.getBooking(), "getAllBookings", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "dateFrom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "dateTo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "surname", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingExpert__BookingExpert__DatabaseInterface(), null, "BookingExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDatabaseInterface(), "database", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingExpert__CheckIn__Booking_EList(), ecorePackage.getEBoolean(), "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "rooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingExpert__CheckOut__Booking(), ecorePackage.getEBoolean(), "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(receiptExpertEClass, ReceiptExpert.class, "ReceiptExpert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceiptExpert_Database(), this.getDatabaseInterface(), null, "database", null, 1, 1, ReceiptExpert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getReceiptExpert__GetReceipt__int(), this.getReceipt(), "getReceipt", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReceiptExpert__GetReceipt__Booking(), this.getReceipt(), "getReceipt", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReceiptExpert__GetReceipt__Room(), this.getReceipt(), "getReceipt", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReceiptExpert__GetAllReceipt(), this.getReceipt(), "getAllReceipt", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReceiptExpert__Combine__EList(), this.getReceipt(), "combine", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getReceipt(), "receiptList", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReceiptExpert__AddReceipt__Receipt(), this.getReceipt(), "addReceipt", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getReceipt(), "receipt", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReceiptExpert__RemoveReceipt__Receipt(), ecorePackage.getEBoolean(), "removeReceipt", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getReceipt(), "receipt", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReceiptExpert__UpdateReceipt__Receipt(), ecorePackage.getEBoolean(), "updateReceipt", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getReceipt(), "receipt", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReceiptExpert__ReceiptExpert__DatabaseInterface(), null, "ReceiptExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDatabaseInterface(), "database", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(emailSenderEClass, EmailSender.class, "EmailSender", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getEmailSender__Send__Booking(), ecorePackage.getEBoolean(), "send", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(paymentEClass, Payment.class, "Payment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPayment__MakePayment__Customer_double(), ecorePackage.getEBoolean(), "makePayment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPayment__IsCreditCardValid__Customer(), ecorePackage.getEBoolean(), "isCreditCardValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingControllerEClass, BookingController.class, "BookingController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookingController_Room(), this.getRoomExpert(), null, "room", null, 1, 1, BookingController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingController_BookingExpert(), this.getBookingExpert(), null, "bookingExpert", null, 1, 1, BookingController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingController_PromotionExpert(), this.getPromotionExpert(), null, "promotionExpert", null, 1, 1, BookingController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingController_DatabaseInterface(), this.getDatabaseInterface(), null, "databaseInterface", null, 1, 1, BookingController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingController_ExpenseExpert(), this.getExpenseExpert(), null, "expenseExpert", null, 1, 1, BookingController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingController_ReceiptExpert(), this.getReceiptExpert(), null, "receiptExpert", null, 1, 1, BookingController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getBookingController__BookingController__RoomExpert_BookingExpert_PromotionExpert(), null, "BookingController", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomExpert(), "roomExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBookingExpert(), "bookingExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPromotionExpert(), "promotionExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(adminControllerEClass, AdminController.class, "AdminController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdminController_UserExpert(), this.getUserExpert(), null, "userExpert", null, 1, 1, AdminController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdminController_ExpenseExpert(), this.getExpenseExpert(), null, "expenseExpert", null, 1, 1, AdminController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdminController_PromoExpert(), this.getPromotionExpert(), null, "promoExpert", null, 1, 1, AdminController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdminController_DatabaseInterface(), this.getDatabaseInterface(), null, "databaseInterface", null, 1, 1, AdminController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getAdminController__AdminController__ExpenseExpert_PromotionExpert_UserExpert_RoomExpert(), null, "AdminController", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExpenseExpert(), "expenseExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPromotionExpert(), "promotionExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUserExpert(), "userExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomExpert(), "roomExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(receptionistControllerEClass, ReceptionistController.class, "ReceptionistController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceptionistController_UserExpert(), this.getUserExpert(), null, "userExpert", null, 1, 1, ReceptionistController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getReceptionistController__ReceptionistController__ReceiptExpert_ExpenseExpert_RoomExpert_BookingExpert_PromotionExpert_UserExpert(), null, "ReceptionistController", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getReceiptExpert(), "receiptExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExpenseExpert(), "expenseExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomExpert(), "roomExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBookingExpert(), "bookingExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPromotionExpert(), "promotionExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUserExpert(), "userExpert", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(msAccessDBEClass, MSAccessDB.class, "MSAccessDB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
