package model.senario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
	
	// Create a Database interface and
	// all experts.
		
	ModelFactory mf = ModelFactoryImpl.init();
	DatabaseInterface db = mf.createMSAccessDB();
	
	ExpenseExpert expenseExpert = mf.createExpenseExpert();
	expenseExpert.ExpenseExpert(db);
	
	RoomExpert roomExpert = mf.createRoomExpert();
	roomExpert.RoomExpert(db);
	
	BookingExpert bookingExpert = mf.createBookingExpert();
	bookingExpert.BookingExpert(db);
	
	PromotionExpert promotionExpert = mf.createPromotionExpert();
	promotionExpert.PromotionExpert(db);
	
	ReceiptExpert receiptExpert = mf.createReceiptExpert();
	receiptExpert.ReceiptExpert(db);
	
	// create a customer for booking.
	Customer customer = mf.createCustomer();
	customer.Customer("Hulken", "Greenman", "nlarsson0@gmail.com", "Hisingen", "2100000000000000", "000", 12, 17);
	
	// create a list of roomTypes
	EList<String> roomTypes = new BasicEList<String>(); 
	// create a list of Rooms
	EList<Room> rooms = new BasicEList<Room>();
	// promotionCode
	String promotion = "";
	// BookingId , will not be used after booking has been created.
	int id = 1;
	
	// Create calendar objects to know between which dates a booking shall be valid.
	Calendar fDate = Calendar.getInstance();	
	Calendar myCalendar = new GregorianCalendar(2015, 1, 20);
	Date tDate = myCalendar.getTime();
	
	// Create booking controller and initialize.
	BookingController bookingController = mf.createBookingController();
	bookingController.BookingController(roomExpert, bookingExpert, promotionExpert, expenseExpert, receiptExpert);
	// Create receipt.
	Receipt r = mf.createReceipt();
	
	// Search for rooms and place available rooms in a list of rooms.
	rooms = bookingController.searchRooms(fDate.getTime(), tDate, 1, 1);
	for(int i = 0; i < rooms.size(); i++){
		System.out.println(rooms.get(i).getType()); // Debug code
		if(rooms.get(i).getType().matches("single")){
			roomTypes.add(rooms.get(i).getType());
			System.out.println(roomTypes.get(i)); // Debug code
			i = rooms.size();
		}
	}
	
	// Create a booking.
	customer = bookingController.createCustomer("Hulken", "Greenman", "nlarsson10@gmail.com", "Hisingen", "2100 0000 0000 0000", "000", 12, 17);
	
	// Perform Booking.
	boolean success = bookingController.createBooking(fDate.getTime(), tDate, "Extra peanuts", customer, promotion, r, roomTypes);
	
	// Print if the booking was a success or not.
	System.out.println(success); 
	
	}
	
}
