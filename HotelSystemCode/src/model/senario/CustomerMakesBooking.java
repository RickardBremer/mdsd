package model.senario;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

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
	customer = bookingController.createCustomer("Hulken", "Greenman", "nlarsson10@gmail.com", "Hisingen", "2100000000000000", "000", 12, 17);
	makeBooking(customer, fDate.getTime(),tDate,"Much Peanuts", "", 1,1,bookingController,r);
	customer = bookingController.createCustomer("Björne", "Brown", "goran@gmail.com", "Stockolm", "2100000000000002", "000", 12, 17);
	myCalendar = new GregorianCalendar(2015, 1, 25);
	tDate = myCalendar.getTime();
	myCalendar = new GregorianCalendar(2015, 1, 17);
	Date fromDate = myCalendar.getTime();
	makeBooking(customer, fromDate,tDate,"Absolutely no peanuts", "", 2,4,bookingController,r);
	customer = bookingController.createCustomer("Gula", "Gubben", "gula@gmail.com", "Stockolm", "2100000000000001", "000", 12, 17);
	myCalendar = new GregorianCalendar(2015, 1, 18);
	tDate = myCalendar.getTime();
	myCalendar = new GregorianCalendar(2015, 1, 13);
	fromDate = myCalendar.getTime();
	makeBooking(customer, fromDate,tDate,"Hide some peanuts in the room", "", 2,4,bookingController,r);
	// Search for rooms and place available rooms in a list of rooms.
	
	}
	
	private static boolean makeBooking(Customer customer, Date fDate, Date tDate, String wishes,String promotion, int desiredrooms, int guest, BookingController bookingController, Receipt r) {
		System.out.println("\nCreating a booking for, " +customer.getFirstName() +" " +customer.getSurname() + "\nwho wishes to book " +desiredrooms +" rooms for " +guest +" people" );
		boolean success = false;
		EList<String> roomTypes = new BasicEList<String>(); 
		EList<Room> rooms = new BasicEList<Room>();
		rooms = bookingController.searchRooms(fDate, tDate, guest,desiredrooms);
		if(rooms.size() > 0) {
			for(int i = 0; i < desiredrooms; i++){
				System.out.println("Adding one room of type " +rooms.get(0).getType() + " to booking");
				roomTypes.add(rooms.get(0).getType());		
			}
			
			// Create a booking
			 success = bookingController.createBooking(fDate, tDate, wishes, customer, promotion, r, roomTypes);
			// Print if the booking was a success or not.
			if (!success) {
				System.out.println("The booking could not be performed, are the details correct?");
			} else {
				System.out.println("The booking is successful");
			}
		} else {
			System.out.println("There are not enough rooms available");
		}
		return success;
	}
}
