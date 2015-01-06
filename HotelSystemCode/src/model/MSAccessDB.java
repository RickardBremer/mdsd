/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MS Access DB</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see model.ModelPackage#getMSAccessDB()
 * @model
 * @generated
 */
public interface MSAccessDB extends DatabaseInterface {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean openConnection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void closeConnection();
} // MSAccessDB
