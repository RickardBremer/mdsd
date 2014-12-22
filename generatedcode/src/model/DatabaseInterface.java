/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see model.ModelPackage#getDatabaseInterface()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DatabaseInterface extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='query(string): row[]/ArrayLst'"
	 * @generated
	 */
	void querystringrowArrayLst();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='update(string):boolean'"
	 * @generated
	 */
	void updatestringboolean();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='create(string):boolean'"
	 * @generated
	 */
	void createstringboolean();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='remove(string):boolean'"
	 * @generated
	 */
	void removestringboolean();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" _DataType="org.eclipse.uml2.types.String" _Required="true" _Ordered="false"
	 * @generated
	 */
	String query(String _);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" _DataType="org.eclipse.uml2.types.String" _Required="true" _Ordered="false"
	 * @generated
	 */
	boolean update(String _);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" _DataType="org.eclipse.uml2.types.String" _Required="true" _Ordered="false"
	 * @generated
	 */
	boolean create(String _);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" _DataType="org.eclipse.uml2.types.String" _Required="true" _Ordered="false"
	 * @generated
	 */
	boolean remove(String _);

} // DatabaseInterface
