/**
 */
package model;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Booking#getCustomer <em>Customer</em>}</li>
 *   <li>{@link model.Booking#getBookingID <em>Booking ID</em>}</li>
 *   <li>{@link model.Booking#getFromDate <em>From Date</em>}</li>
 *   <li>{@link model.Booking#getToDate <em>To Date</em>}</li>
 *   <li>{@link model.Booking#getWishes <em>Wishes</em>}</li>
 *   <li>{@link model.Booking#getPromotion <em>Promotion</em>}</li>
 *   <li>{@link model.Booking#getRoomTypes <em>Room Types</em>}</li>
 *   <li>{@link model.Booking#isCheckedIn <em>Checked In</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see model.ModelPackage#getBooking_Customer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link model.Booking#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking ID</em>' attribute.
	 * @see #setBookingID(String)
	 * @see model.ModelPackage#getBooking_BookingID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBookingID();

	/**
	 * Sets the value of the '{@link model.Booking#getBookingID <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking ID</em>' attribute.
	 * @see #getBookingID()
	 * @generated
	 */
	void setBookingID(String value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see model.ModelPackage#getBooking_FromDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link model.Booking#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Date</em>' attribute.
	 * @see #setToDate(Date)
	 * @see model.ModelPackage#getBooking_ToDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getToDate();

	/**
	 * Sets the value of the '{@link model.Booking#getToDate <em>To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Date</em>' attribute.
	 * @see #getToDate()
	 * @generated
	 */
	void setToDate(Date value);

	/**
	 * Returns the value of the '<em><b>Wishes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wishes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wishes</em>' attribute.
	 * @see #setWishes(String)
	 * @see model.ModelPackage#getBooking_Wishes()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getWishes();

	/**
	 * Sets the value of the '{@link model.Booking#getWishes <em>Wishes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wishes</em>' attribute.
	 * @see #getWishes()
	 * @generated
	 */
	void setWishes(String value);

	/**
	 * Returns the value of the '<em><b>Promotion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Promotion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promotion</em>' attribute.
	 * @see #setPromotion(String)
	 * @see model.ModelPackage#getBooking_Promotion()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPromotion();

	/**
	 * Sets the value of the '{@link model.Booking#getPromotion <em>Promotion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promotion</em>' attribute.
	 * @see #getPromotion()
	 * @generated
	 */
	void setPromotion(String value);

	/**
	 * Returns the value of the '<em><b>Room Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Types</em>' attribute list.
	 * @see model.ModelPackage#getBooking_RoomTypes()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getRoomTypes();

	/**
	 * Returns the value of the '<em><b>Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checked In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked In</em>' attribute.
	 * @see #setCheckedIn(boolean)
	 * @see model.ModelPackage#getBooking_CheckedIn()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isCheckedIn();

	/**
	 * Sets the value of the '{@link model.Booking#isCheckedIn <em>Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked In</em>' attribute.
	 * @see #isCheckedIn()
	 * @generated
	 */
	void setCheckedIn(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false" fromDateRequired="true" fromDateOrdered="false" toDateRequired="true" toDateOrdered="false" wishesDataType="org.eclipse.uml2.types.String" wishesRequired="true" wishesOrdered="false" customerRequired="true" customerOrdered="false" roomTypesDataType="org.eclipse.uml2.types.String" roomTypesMany="true" roomTypesOrdered="false" promotionCodeDataType="org.eclipse.uml2.types.String" promotionCodeRequired="true" promotionCodeOrdered="false"
	 * @generated
	 */
	void Booking(String bookingID, Date fromDate, Date toDate, String wishes, Customer customer, EList<String> roomTypes, String promotionCode);

} // Booking
