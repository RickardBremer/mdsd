/**
 */
package model;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Expert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.BookingExpert#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getBookingExpert()
 * @model
 * @generated
 */
public interface BookingExpert extends EObject {
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
	 * @see model.ModelPackage#getBookingExpert_Database()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DatabaseInterface getDatabase();

	/**
	 * Sets the value of the '{@link model.BookingExpert#getDatabase <em>Database</em>}' reference.
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
	 * @model required="true" ordered="false" IDDataType="org.eclipse.uml2.types.Integer" IDRequired="true" IDOrdered="false"
	 * @generated
	 */
	Booking getBooking(int ID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" dateFromRequired="true" dateFromOrdered="false" dateToRequired="true" dateToOrdered="false"
	 * @generated
	 */
	EList<Booking> getAllBookings(Date dateFrom, Date dateTo);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	Booking addBooking(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	boolean removeBooking(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	boolean updateBooking(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" dateFromRequired="true" dateFromOrdered="false" dateToRequired="true" dateToOrdered="false" surnameDataType="org.eclipse.uml2.types.String" surnameRequired="true" surnameOrdered="false"
	 * @generated
	 */
	EList<Booking> getAllBookings(Date dateFrom, Date dateTo, String surname);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model databaseRequired="true" databaseOrdered="false"
	 * @generated
	 */
	void BookingExpert(DatabaseInterface database);

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

} // BookingExpert
