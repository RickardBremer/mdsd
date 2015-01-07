/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import javax.xml.soap.SOAPException;

import model.Customer;
import model.ModelPackage;
import model.Payment;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PaymentImpl extends MinimalEObjectImpl.Container implements Payment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PAYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean makePayment(Customer customer, double amount) {
		CustomerRequires cr;
		try {
			cr = CustomerRequires.instance();
			return cr.makePayment(customer.getCcNumber(), customer.getCcv(), customer.getExpiringMonth(), customer.getExpiringYear(), customer.getFirstName(), customer.getSurname(), amount);
		} catch (SOAPException e) {
			return false;
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isCreditCardValid(Customer customer) {
		CustomerRequires cr;
		try {
			cr = CustomerRequires.instance();
		} catch (SOAPException e1) {
			return false;
		}
		try {
			return cr.isCreditCardValid(customer.getCcNumber(), customer.getCcv(), customer.getExpiringMonth(), customer.getExpiringYear(), customer.getFirstName(), customer.getSurname());
		} catch (SOAPException e) {
			return false;
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
			case ModelPackage.PAYMENT___MAKE_PAYMENT__CUSTOMER_DOUBLE:
				return makePayment((Customer)arguments.get(0), (Double)arguments.get(1));
			case ModelPackage.PAYMENT___IS_CREDIT_CARD_VALID__CUSTOMER:
				return isCreditCardValid((Customer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PaymentImpl
