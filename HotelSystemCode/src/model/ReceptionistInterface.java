/**
 */
package model;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receptionist Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see model.ModelPackage#getReceptionistInterface()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ReceptionistInterface extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" surnameDataType="org.eclipse.uml2.types.String" surnameRequired="true" surnameOrdered="false" passportNumberDataType="org.eclipse.uml2.types.String" passportNumberRequired="true" passportNumberOrdered="false"
	 * @generated
	 */
	Resident createResident(String firstName, String surname, String passportNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" fromDateRequired="true" fromDateOrdered="false" toDateRequired="true" toDateOrdered="false"
	 * @generated
	 */
	EList<Booking> viewAllBookings(Date fromDate, Date toDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingNumberRequired="true" bookingNumberOrdered="false"
	 * @generated
	 */
	Booking getBooking(int bookingNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Room> viewUnOccupiedRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" surnameDataType="org.eclipse.uml2.types.String" surnameRequired="true" surnameOrdered="false" dateFromRequired="true" dateFromOrdered="false" dateToRequired="true" dateToOrdered="false"
	 * @generated
	 */
	EList<Booking> viewAllBookings(String surname, Date dateFrom, Date dateTo);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	EList<Room> viewUnOccupiedRooms(String roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false" roomsMany="true" roomsOrdered="false"
	 * @generated
	 */
	boolean checkIn(Booking booking, EList<Room> rooms);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	boolean checkOut(Booking booking);

} // ReceptionistInterface
