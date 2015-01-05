/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import model.DatabaseInterface;
import model.ModelPackage;
import model.User;
import model.UserExpert;
import model.impl.UserImpl;

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
	public User getUser(int ID) {
		// TODO: implement this method
				// Ensure that you remove @generated or mark it @generated NO
				//EList<String[]> result = database.Query("SELECT FROM user WHERE ID = "+ ID).get(0);
				
				String[] myResult = database.query("SELECT FROM user WHERE ID = "+ ID).get(0);
			
				if(myResult != null){
						User u = new UserImpl();
						u.User(myResult[0], myResult[1], myResult[2], Boolean.parseBoolean(myResult[3]), Boolean.parseBoolean(myResult[4]));
				return  u;
				}
				return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<User> getAllUsers() {
		// TODO: implement this method
				// Ensure that you remove @generated or mark it @generated NOT
				EList<String[]> userResult = database.query("SELECT * FROM tblUser;");// selects all users from the user table
				EList<User> myUser = new BasicEList<User>(); // create a basic list(since we cannot use ArrayList)
				if(userResult != null){
					for(String[] st : userResult){
						User u = new UserImpl();
						u.User(st[0],st[1],st[2],Boolean.parseBoolean(st[3]), Boolean.parseBoolean(st[4]));
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
	public User addUser(User user){
		
		 database.send("INSERT INTO tblUsers SET FirstName = " + user.getFirstName() + ", LastName = " + user.getSurname() + ", Password = " + 
					user.getPassword() +", Receptionist = "+ user.isReceptionist() + ", Adiministrator = "+ user.isAdministrator());
		
		 
		 EList<String[]> addedUser = database.query("SELECT * FROM tblUsers WHERE FirstName = " + user.getFirstName() + ", LastName = "
		+ user.getSurname() + ", Password = " + user.getPassword() +", Receptionist = "+ user.isReceptionist() + ", Adiministrator = "+ user.isAdministrator() + 
		"ORDER BY DESC");
		 
		 String[] newUser = addedUser.get(0);
		 
		 if(newUser != null){
				User u = new UserImpl();
				u.User(newUser[0], newUser[1], newUser[2], Boolean.parseBoolean(newUser[3]), Boolean.parseBoolean(newUser[4]));
		return  u;
		}
		return null;
			
		}
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeUser(int ID) {
		// TODO: implement this method
				// Ensure that you remove @generated or mark it @generated NOT
				return database.remove("DELETE FROM tblUsers WHERE ID = " + ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean updateUser(User user) {
		// TODO: implement this method
				// Ensure that you remove @generated or mark it @generated NOT
				return database.update("Update tblUsers SET FirstName = " + user.getFirstName() + ", LastName = " + user.getSurname() + ", Password = " + 
						user.getPassword() +", Receptionist = "+ user.isReceptionist() + ", Adiministrator = "+ user.isAdministrator());
							
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean login(String name, String password) {
		// TODO: implement this method
				// Ensure that you remove @generated or mark it @generated NOT
				/**
				 * Strings n and p for testing purposes only. name and password attributes must be fetched from storage
				 */

				/** Query database to get name and password
				 * login = true
				 */
				return database.query("SELECT FROM tblUsers WHERE name =" + name + " && password =" + password) != null;	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void UserExpert(DatabaseInterface database) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
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
