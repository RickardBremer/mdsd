package model.senario;

import java.util.Calendar;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import model.Booking;
import model.BookingController;
import model.BookingExpert;
import model.Customer;
import model.DatabaseInterface;
import model.ExpenseExpert;
import model.ModelFactory;
import model.PromotionExpert;
import model.Receipt;
import model.ReceiptExpert;
import model.Room;
import model.RoomExpert;
import model.UserExpert;
import model.impl.ModelFactoryImpl;

public class CustomerMakesBooking {
	public static void main(String[] args){
	
	ModelFactory mf = ModelFactoryImpl.init();
	DatabaseInterface db = mf.createMSAccessDB();
	
	ExpenseExpert expenseExpert = mf.createExpenseExpert();
	expenseExpert.ExpenseExpert(db);
	
	RoomExpert roomExpert = mf.createRoomExpert();
	roomExpert.RoomExpert(db);
	
	//UserExpert userExpert = mf.createUserExpert();
	//userExpert.UserExpert(db);
	
	BookingExpert bookingExpert = mf.createBookingExpert();
	bookingExpert.BookingExpert(db);
	
	PromotionExpert promotionExpert = mf.createPromotionExpert();
	promotionExpert.PromotionExpert(db);
	
	ReceiptExpert receiptExpert = mf.createReceiptExpert();
	receiptExpert.ReceiptExpert(db);
	
	// create a customer
	Customer customer = mf.createCustomer();
	customer.Customer("Hulken", "Greenman", "nlarsson0@gmail.com", "Hisingen", "2100 0000 0000 0000", "000", 12, 17);
	
	// create roomTypes
	EList<String> roomTypes = new BasicEList<String>(); 
	
	roomTypes.add("Single");
	roomTypes.add("Double");
	
	// promotionCode
	String promotion = "";
	
	// id
	int id = 1;
	
	// rooms
	EList<Room> rooms = new BasicEList<Room>();
	
	// bookings
	Booking booking = mf.createBooking();
	
	Calendar fDate = Calendar.getInstance();
	Calendar tDate = Calendar.getInstance();
	
//	BookingExpert bookingExpert = mf.createBookingExpert();
//	bookingExpert.BookingExpert(db);
	
//	System.out.println(tDate.getTime());
	
//	booking.Booking(fDate.getTime(), tDate.getTime(), "Extra peanuts", customer, roomTypes, promotion, id, rooms);
	
//	booking = bookingExpert.addBooking(booking);
	
//	System.out.println("Booking succeded, booking id: " + booking.getId());
	
	BookingController bookingController = mf.createBookingController();
	bookingController.BookingController(roomExpert, bookingExpert, promotionExpert, expenseExpert, receiptExpert);
	Receipt r = mf.createReceipt();
	
	customer = bookingController.createCustomer("Hulken", "Greenman", "nlarsson1@gmail.com", "Hisingen", "2100 0000 0000 0000", "000", 12, 17);
	boolean success = bookingController.createBooking(fDate.getTime(), tDate.getTime(), "Extra peanuts", customer, promotion, r, roomTypes);
	
	System.out.println(success); 
	}
	
}
