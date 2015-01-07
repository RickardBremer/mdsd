package model.senario;

import java.awt.image.RescaleOp;
import java.util.Calendar;
import java.util.Date;

import model.Booking;
import model.BookingController;
import model.DatabaseInterface;
import model.ExpenseExpert;
import model.ModelFactory;
import model.PromotionExpert;
import model.ReceptionistController;
import model.Room;
import model.RoomExpert;
import model.UserExpert;
import model.impl.ModelFactoryImpl;

public class CustomerChecksIn {
	public static void main(String[] args) {
		ModelFactory mf = ModelFactoryImpl.init();
		DatabaseInterface db = mf.createMSAccessDB();
		
		ExpenseExpert expenseExpert = mf.createExpenseExpert();
		expenseExpert.ExpenseExpert(db);
		
		RoomExpert roomExpert = mf.createRoomExpert();
		roomExpert.RoomExpert(db);
		
		UserExpert userExpert = mf.createUserExpert();
		userExpert.UserExpert(db);
		
		PromotionExpert promotionExpert = mf.createPromotionExpert();
		promotionExpert.PromotionExpert(db);
		
		ReceptionistController receptionistController = mf.createReceptionistController();
		
		BookingController bookingController = mf.createBookingController();
		
		//Receptionist Login
		
		//Get booking, searches for all bookings made today, under the surname "Greenman"
		//Calendar morning = Calendar.getInstance();
		//Calendar night = Calendar.getInstance();
		Date morning = new Date();
		Date night = new Date();
		morning.setHours(0);
		night.setHours(24);
		
//		morning.set(Calendar.HOUR_OF_DAY, 0);
//		night.set(Calendar.HOUR_OF_DAY, 24);
		
		Booking booking = receptionistController.viewAllBookings("Greenman", morning, night).get(0);
		booking.getRoom().get(0).getBeds();
		Resident 
		
		//Get available rooms 
		
		//Fill rooms with residents
		
		//Check in booking
		
		
	}

}