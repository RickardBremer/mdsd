/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import model.DatabaseInterface;
import model.ModelPackage;
import model.User;
import model.UserExpert;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Expert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.UserExpertImpl#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserExpertImpl extends MinimalEObjectImpl.Container implements UserExpert {
	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected DatabaseInterface database;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserExpertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.USER_EXPERT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseInterface getDatabase() {
		if (database != null && database.eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject)database;
			database = (DatabaseInterface)eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.USER_EXPERT__DATABASE, oldDatabase, database));
			}
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseInterface basicGetDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(DatabaseInterface newDatabase) {
		DatabaseInterface oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USER_EXPERT__DATABASE, oldDatabase, database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	//Helen
	public User getUser(int ID) {
		String myResult = database.query("SELECT FROM user WHERE ID = "+ ID).get(0);
		String[] MyArray = myResult.split(";", -1);
		if(MyArray != null){
				User u = new UserImpl();
				u.User(MyArray[0], MyArray[1], MyArray[2], Boolean.parseBoolean(MyArray[3]), Boolean.parseBoolean(MyArray[4]), Integer.parseInt(MyArray[5]));
		return  u;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	//Helen
	public EList<User> getAllUsers() {
		
		EList<String> userResult = database.query("SELECT * FROM tblUser;");// selects all users from the user table
		EList<User> myUser = new BasicEList<User>(); // create a basic list(since we cannot use ArrayList)
		
		if(userResult != null){
	 for(String e: userResult){
		 String[] MyArray = e.split(";", -1);
	
				User u = new UserImpl();
				u.User(MyArray[0],MyArray[1],MyArray[2],Boolean.parseBoolean(MyArray[3]), Boolean.parseBoolean(MyArray[4]),  Integer.parseInt(MyArray[5]));
			myUser.add(u);
			}
		}
	
		return  myUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	//Helen
	public User addUser(User user) {
		database.send("INSERT INTO tblUsers (FirstName, LastName, Password, Receptionist, Administrator) VALUES('"+ user.getFirstName() + "','" + user.getSurname()
				+ "','"
				+ user.getPassword()
				+ "',"
				+ user.isReceptionist() 
				+ ","
				+ user.isAdministrator()
				+ ");");

	 EList<String> addedUser = database.query("SELECT * FROM tblUsers WHERE FirstName = '" + user.getFirstName() + "' AND LastName = '"
	+ user.getSurname() + "' AND Password = '" + user.getPassword() +"' AND Receptionist = "+ user.isReceptionist() + " AND Administrator = "+ user.isAdministrator() + 
	" ORDER BY UserID DESC");
	 
	 String newUser = addedUser.get(0);
	 String[] MyArray = newUser.split(";", -1);
	 if(MyArray != null){
			User u = new UserImpl();
			u.User(MyArray[1], MyArray[2], MyArray[3], Boolean.parseBoolean(MyArray[4]), Boolean.parseBoolean(MyArray[5]), Integer.parseInt(MyArray[0]));
	return  u;
	}
	return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	//Helen
	public boolean removeUser(int ID) {
		return database.send("DELETE FROM tblUsers WHERE ID = " + ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	//Helen
	public boolean updateUser(User user) {
		return database.send("Update tblUsers SET FirstName = " + user.getFirstName() + ", LastName = " + user.getSurname() + ", Password = " + 
				user.getPassword() +", Receptionist = "+ user.isReceptionist() + ", Adiministrator = "+ user.isAdministrator());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	//Helen
	public boolean login(String name, String password) {
		return database.query("SELECT FROM tblUsers WHERE name =" + name + " && password =" + password) != null;	

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void UserExpert(DatabaseInterface database) {
		this.database =  database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.USER_EXPERT__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
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
			case ModelPackage.USER_EXPERT__DATABASE:
				setDatabase((DatabaseInterface)newValue);
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
			case ModelPackage.USER_EXPERT__DATABASE:
				setDatabase((DatabaseInterface)null);
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
			case ModelPackage.USER_EXPERT__DATABASE:
				return database != null;
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
			case ModelPackage.USER_EXPERT___GET_USER__INT:
				return getUser((Integer)arguments.get(0));
			case ModelPackage.USER_EXPERT___GET_ALL_USERS:
				return getAllUsers();
			case ModelPackage.USER_EXPERT___ADD_USER__USER:
				return addUser((User)arguments.get(0));
			case ModelPackage.USER_EXPERT___REMOVE_USER__INT:
				return removeUser((Integer)arguments.get(0));
			case ModelPackage.USER_EXPERT___UPDATE_USER__USER:
				return updateUser((User)arguments.get(0));
			case ModelPackage.USER_EXPERT___LOGIN__STRING_STRING:
				return login((String)arguments.get(0), (String)arguments.get(1));
			case ModelPackage.USER_EXPERT___USER_EXPERT__DATABASEINTERFACE:
				UserExpert((DatabaseInterface)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //UserExpertImpl
