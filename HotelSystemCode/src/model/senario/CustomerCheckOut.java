package model.senario;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import model.Booking;
import model.DatabaseInterface;
import model.Expense;
import model.ExpenseExpert;
import model.ModelFactory;
import model.ReceptionistController;
import model.Resident;
import model.RoomExpert;
import model.User;
import model.UserExpert;
import model.impl.ModelFactoryImpl;

public class CustomerCheckOut {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ModelFactory mf = ModelFactoryImpl.init();
		DatabaseInterface db = mf.createMSAccessDB();
		
		Date morning = new Date();
		Date night = new Date();
		// this needs to be fixed
		morning.setHours(0);
		night.setHours(24);
		
		ReceptionistController receptionistController = mf.createReceptionistController();
		Booking booking = receptionistController.viewAllBookings("Charles", morning, night).get(0);
		//booking.getId();
		
		receptionistController.checkOut(booking);
		
		System.out.println(booking);
		/*
		 * call checkout method
		 */
	}
	

}
