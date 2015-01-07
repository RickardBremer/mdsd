package model.senario;

import java.util.Calendar;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import model.Booking;
import model.BookingController;
import model.BookingExpert;
import model.Customer;
import model.DatabaseInterface;
import model.ModelFactory;
import model.Receipt;
import model.Room;
import model.impl.ModelFactoryImpl;

public class CustomerMakesBooking {
	public static void main(String[] args){
	
	ModelFactory mf = ModelFactoryImpl.init();
	DatabaseInterface db = mf.createMSAccessDB();
	
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
	
	BookingExpert bookingExpert = mf.createBookingExpert();
	bookingExpert.BookingExpert(db);
	
	System.out.println(tDate.getTime());
	
	booking.Booking(fDate.getTime(), tDate.getTime(), "Extra peanuts", customer, roomTypes, promotion, id, rooms);
	
	booking = bookingExpert.addBooking(booking);
	
	System.out.println("Booking succeded, booking id: " + booking.getId());
	
	//BookingController bookingController = mf.createBookingController();
	//Receipt r = mf.createReceipt();
	
	//customer = bookingController.createCustomer("Hulken", "Greenman", "nlarsson32@gmail.com", "Hisingen", "2100 0000 0000 0000", "000", 12, 17);
	//boolean success = bookingController.createBooking(fDate.getTime(), tDate.getTime(), "Extra peanuts", customer, promotion, r, roomTypes);
	
	//System.out.println(success);
	}
	
}
