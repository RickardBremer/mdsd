/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import model.Booking;
import model.ModelPackage;
import model.email;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.sun.mail.smtp.SMTPTransport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>email</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class emailImpl extends MinimalEObjectImpl.Container implements email {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected emailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EMAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void send(Booking booking) {
		String toAddress = booking.getCustomer().getEmail(); 
		String fromAddress = "mddhotelbooking@gmail.com"; 
		final String username = "mddhotelbooking@gmail.com";
		final String password = "mercury<3";
		final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
		final String port = "465";
		final String host = "smtp.gmail.com";

		Properties props = System.getProperties();
		props.setProperty("mail.smtps.host", host);
		props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		props.setProperty("mail.smtp.socketFactory.fallback", "false");
		props.setProperty("mail.smtp.port", port);
		props.setProperty("mail.smtp.socketFactory.port", port);
		props.setProperty("mail.smtps.auth", "true");

		Session session = Session.getInstance(props); 

		try {

			Message msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(fromAddress));
			msg.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(toAddress));

			msg.setSubject("Hotel booking verification");
			msg.setText("Congratulation " + booking.getCustomer().getFirstName()+" "+ booking.getCustomer().getSurname()+
					"! You have successfully booked a stay at our hotell \n"
					+ "From: " + booking.getFromDate() + " \n"
							+ "to: "+ booking.getToDate() + "\n"
							+ "Your booking ID is: " + booking.getBookingID() + 
							"\nHave a nice stay! \n\n "
							+ "Kind Regards, \n //The hotel staff");
			msg.setSentDate(new Date());

			SMTPTransport transport = (SMTPTransport) session.getTransport("smtps");
			transport.connect("smtp.gmail.com", username, password);
			transport.sendMessage(msg, msg.getAllRecipients());
			transport.close();

			System.out.println("Email sent");

		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.EMAIL___SEND__BOOKING:
				send((Booking)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //emailImpl
