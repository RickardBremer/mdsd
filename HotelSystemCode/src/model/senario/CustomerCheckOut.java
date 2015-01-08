package model.senario;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.emf.common.util.EList;

import model.Booking;
import model.BookingExpert;
import model.Customer;
import model.DatabaseInterface;
import model.Expense;
import model.ExpenseExpert;
import model.ModelFactory;
import model.Payment;
import model.PromotionExpert;
import model.ReceiptExpert;
import model.ReceptionistController;
import model.Resident;
import model.Room;
import model.RoomExpert;
import model.User;
import model.UserExpert;
import model.impl.ModelFactoryImpl;
import model.impl.ReceptionistControllerImpl;

public class CustomerCheckOut {

	public static void main(String[] args) {
		
		// Create ModelFactory and DatabaseInterface
		ModelFactory mf = ModelFactoryImpl.init();
		DatabaseInterface db = mf.createMSAccessDB();
		
		// Create Experts
		ExpenseExpert expenseExpert = mf.createExpenseExpert();
		expenseExpert.ExpenseExpert(db);
		
		RoomExpert roomExpert = mf.createRoomExpert();
		roomExpert.RoomExpert(db);
		
		PromotionExpert promotionExpert = mf.createPromotionExpert();
		promotionExpert.PromotionExpert(db);
		
		ReceiptExpert receiptExpert = mf.createReceiptExpert();
		receiptExpert.ReceiptExpert(db);
		
		BookingExpert bookingExpert = mf.createBookingExpert();
		bookingExpert.BookingExpert(db);
		
		ReceptionistController rc = mf.createReceptionistController();
		rc.BookingController(roomExpert, bookingExpert, promotionExpert, expenseExpert, receiptExpert);
		
		Calendar frDate = Calendar.getInstance();
		Calendar myCalendar = new GregorianCalendar(2015, 1, 20);
		Date greenToDate = myCalendar.getTime();
	
		myCalendar = new GregorianCalendar(2015, 1, 25);
		Date brownToDate = myCalendar.getTime();
		myCalendar = new GregorianCalendar(2015, 1, 17);
		Date brownFromDate = myCalendar.getTime();
		
		// get the already checked in booking (should succeed)
		Booking bookingCheckedIN = rc.viewAllBookings("Greenman", frDate.getTime(), greenToDate).get(0);
		
		Booking bookingNotCheckedIN = rc.viewAllBookings("Brown", brownFromDate, brownToDate).get(0);
		
		System.out.println("Receptionist will now try to check you out in with your provided credentials");
		if(rc.checkOut(bookingCheckedIN)){
			System.out.println("The booking of " +bookingCheckedIN.getCustomer().getFirstName() +" "+bookingCheckedIN.getCustomer().getSurname()+ " was checked out");
		}
		
		if(rc.checkOut(bookingNotCheckedIN)){
			System.out.println("The booking of " +bookingNotCheckedIN.getCustomer().getFirstName() +" "+bookingNotCheckedIN.getCustomer().getSurname()+ " was checked out");
		}
		
	}
	
}
