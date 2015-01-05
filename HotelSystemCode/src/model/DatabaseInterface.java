/**
 */
package model;

import org.eclipse.emf.common.util.EList;
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
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" queryDataType="org.eclipse.uml2.types.String" queryRequired="true" queryOrdered="false"
	 * @generated
	 */
	EList<String> query(String query);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" queryDataType="org.eclipse.uml2.types.String" queryRequired="true" queryOrdered="false"
	 * @generated
	 */
	boolean send(String query);

} // DatabaseInterface
