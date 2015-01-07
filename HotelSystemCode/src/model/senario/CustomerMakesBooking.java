package model.senario;

import java.util.Calendar;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import model.Booking;
import model.BookingExpert;
import model.Customer;
import model.DatabaseInterface;
import model.ModelFactory;
import model.Room;
import model.impl.ModelFactoryImpl;

public class CustomerMakesBooking {
	public static void main(String[] args){
	
	ModelFactory mf = ModelFactoryImpl.init();
	DatabaseInterface db = mf.createMSAccessDB();
	
	// create a customer
	Customer customer = mf.createCustomer();
	customer.Customer("Hulken", "Greenman", "nlarsson0@gmail.com ", "Hisingen", "0000 0000 0000 0000", "000", 12, 17);
	
	// create roomTypes
	EList<String> roomTypes = new BasicEList<String>(); 
	
	// promotionCode
	String promotionCode = null;
	
	// id
	int id = 0;
	
	// rooms
	EList<Room> rooms = new BasicEList<Room>();
	
	// bookings
	Booking booking = mf.createBooking();
	
	Calendar fDate = Calendar.getInstance();
	Calendar tDate = Calendar.getInstance();
	
	BookingExpert bookingExpert = mf.createBookingExpert();
	bookingExpert.BookingExpert(db);
	
	booking.Booking(fDate.getTime(), tDate.getTime(), "Extra peanuts", customer, roomTypes, promotionCode, id, rooms);
	
	booking = bookingExpert.addBooking(booking);
	
	System.out.println("Didnt crash, but what happened?");
	
	}
	
}
