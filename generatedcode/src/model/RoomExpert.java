/**
 */
package model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Expert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.RoomExpert#getRoom <em>Room</em>}</li>
 *   <li>{@link model.RoomExpert#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getRoomExpert()
 * @model
 * @generated
 */
public interface RoomExpert extends EObject {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see model.ModelPackage#getRoomExpert_Room()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link model.RoomExpert#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' reference.
	 * @see #setDatabase(DatabaseInterface)
	 * @see model.ModelPackage#getRoomExpert_Database()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DatabaseInterface getDatabase();

	/**
	 * Sets the value of the '{@link model.RoomExpert#getDatabase <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(DatabaseInterface value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Room getAllRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" numberOfRoomsDataType="org.eclipse.uml2.types.Integer" numberOfRoomsRequired="true" numberOfRoomsOrdered="false" numberOfGuestsDataType="org.eclipse.uml2.types.Integer" numberOfGuestsRequired="true" numberOfGuestsOrdered="false" _Required="true" _Ordered="false"
	 * @generated
	 */
	void getAvailableRoomTypes(Date from, Date to, int numberOfRooms, int numberOfGuests, Room _);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Room getUnoccupiedRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	boolean addRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	boolean removeRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	boolean updateRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNumberDataType="org.eclipse.uml2.types.Integer" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	Room getRoom(int roomNumber);

} // RoomExpert
