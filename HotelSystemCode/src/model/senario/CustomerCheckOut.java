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
		Date toDate = myCalendar.getTime();
		
		Booking booking = rc.viewAllBookings("Greenman", frDate.getTime(), toDate).get(0);
		
		if(booking.isCheckedIn()){
			if(rc.checkOut(booking)){
				System.out.println("The booking of " +booking.getCustomer().getFirstName() +" "+booking.getCustomer().getSurname()+ " was checked out");
			}else{
				System.out.println("Checkout failed");
			}
		}else{
			System.out.println("Booking was not checked in");
		}
		
	}
	
}
