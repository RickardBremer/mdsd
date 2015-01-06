/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import model.ModelPackage;
import model.User;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.UserImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link model.impl.UserImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link model.impl.UserImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link model.impl.UserImpl#getId <em>Id</em>}</li>
 *   <li>{@link model.impl.UserImpl#isReceptionist <em>Receptionist</em>}</li>
 *   <li>{@link model.impl.UserImpl#isAdministrator <em>Administrator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected static final String SURNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected String surname = SURNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isReceptionist() <em>Receptionist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReceptionist()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECEPTIONIST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReceptionist() <em>Receptionist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReceptionist()
	 * @generated
	 * @ordered
	 */
	protected boolean receptionist = RECEPTIONIST_EDEFAULT;

	/**
	 * The default value of the '{@link #isAdministrator() <em>Administrator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdministrator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADMINISTRATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAdministrator() <em>Administrator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdministrator()
	 * @generated
	 * @ordered
	 */
	protected boolean administrator = ADMINISTRATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USER__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurname(String newSurname) {
		String oldSurname = surname;
		surname = newSurname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USER__SURNAME, oldSurname, surname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReceptionist() {
		return receptionist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceptionist(boolean newReceptionist) {
		boolean oldReceptionist = receptionist;
		receptionist = newReceptionist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USER__RECEPTIONIST, oldReceptionist, receptionist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAdministrator() {
		return administrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdministrator(boolean newAdministrator) {
		boolean oldAdministrator = administrator;
		administrator = newAdministrator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USER__ADMINISTRATOR, oldAdministrator, administrator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void User(String firstName, String surname, String password, boolean receptionist, boolean administrator, int id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void User(String firstName, String surname, String password, boolean receptionist, boolean administrator, int id) {
		this.firstName = firstName;
		this.surname = surname;
		this.password = password;
		this.receptionist = receptionist;
		this.administrator = administrator;
		this.id =  id;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.USER__FIRST_NAME:
				return getFirstName();
			case ModelPackage.USER__SURNAME:
				return getSurname();
			case ModelPackage.USER__PASSWORD:
				return getPassword();
			case ModelPackage.USER__ID:
				return getId();
			case ModelPackage.USER__RECEPTIONIST:
				return isReceptionist();
			case ModelPackage.USER__ADMINISTRATOR:
				return isAdministrator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.USER__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case ModelPackage.USER__SURNAME:
				setSurname((String)newValue);
				return;
			case ModelPackage.USER__PASSWORD:
				setPassword((String)newValue);
				return;
			case ModelPackage.USER__ID:
				setId((Integer)newValue);
				return;
			case ModelPackage.USER__RECEPTIONIST:
				setReceptionist((Boolean)newValue);
				return;
			case ModelPackage.USER__ADMINISTRATOR:
				setAdministrator((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.USER__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case ModelPackage.USER__SURNAME:
				setSurname(SURNAME_EDEFAULT);
				return;
			case ModelPackage.USER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case ModelPackage.USER__ID:
				setId(ID_EDEFAULT);
				return;
			case ModelPackage.USER__RECEPTIONIST:
				setReceptionist(RECEPTIONIST_EDEFAULT);
				return;
			case ModelPackage.USER__ADMINISTRATOR:
				setAdministrator(ADMINISTRATOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.USER__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case ModelPackage.USER__SURNAME:
				return SURNAME_EDEFAULT == null ? surname != null : !SURNAME_EDEFAULT.equals(surname);
			case ModelPackage.USER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case ModelPackage.USER__ID:
				return id != ID_EDEFAULT;
			case ModelPackage.USER__RECEPTIONIST:
				return receptionist != RECEPTIONIST_EDEFAULT;
			case ModelPackage.USER__ADMINISTRATOR:
				return administrator != ADMINISTRATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.USER___USER__STRING_STRING_STRING_BOOLEAN_BOOLEAN_INT:
				User((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (Boolean)arguments.get(3), (Boolean)arguments.get(4), (Integer)arguments.get(5));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", surname: ");
		result.append(surname);
		result.append(", password: ");
		result.append(password);
		result.append(", id: ");
		result.append(id);
		result.append(", receptionist: ");
		result.append(receptionist);
		result.append(", administrator: ");
		result.append(administrator);
		result.append(')');
		return result.toString();
	}

} //UserImpl
