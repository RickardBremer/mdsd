package model.senario;

import java.awt.image.RescaleOp;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import model.Booking;
import model.BookingController;
import model.BookingExpert;
import model.DatabaseInterface;
import model.ExpenseExpert;
import model.ModelFactory;
import model.PromotionExpert;
import model.ReceiptExpert;
import model.ReceptionistController;
import model.Resident;
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
		
		ReceiptExpert receiptExpert = mf.createReceiptExpert();
		receiptExpert.ReceiptExpert(db);
		
		BookingExpert bookingExpert = mf.createBookingExpert();
		bookingExpert.BookingExpert(db);
		
		ReceptionistController receptionistController = mf.createReceptionistController();
		receptionistController.ReceptionistController(receiptExpert, expenseExpert, roomExpert, bookingExpert, promotionExpert, userExpert);
		
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
		EList<Room> bookedrooms = new BasicEList<Room>();
		EList<Resident> resList = new BasicEList<Resident>();
		Resident resOne = receptionistController.createResident("Magne" , "Herne", "8918286545");
		Resident resTwo = receptionistController.createResident("Alex" , "Herne", "8314286545");
		Resident resThree = receptionistController.createResident("Joel" , "Herne", "8518286545");
		resList.add(resOne);
		resList.add(resTwo);
		resList.add(resThree);
		Map<String, Integer> freq = new HashMap<String, Integer>();
		for (String roomType : booking.getRoomTypes()) {
			if (freq.containsKey(roomType)) {
				freq.put(roomType, freq.get(roomType) + 1);
			} else {
				freq.put(roomType, 1);
			}
		}
		//Get available rooms 
		boolean isfirst = true;
		for (Map.Entry<String, Integer> entry : freq.entrySet()) {
			System.out.println(entry.getKey());
			if (isfirst == false) {
			EList<Room> room = receptionistController.viewUnOccupiedRooms(entry.getKey());
			System.out.println(room.size());
			for (int i = 0; i<entry.getValue();i++) {
				System.out.println(entry.getValue());
				bookedrooms.add(room.get(i));
				booking.getRoom().add(bookedrooms.get(i));
				//Fill rooms with residents
				for (int j = 0; j < bookedrooms.get(i).getBeds();j++) {
					bookedrooms.get(i).getResidents().add(resList.get(i));
				}
			}
			}
			isfirst = false;
		}
		
		//Check in booking
		System.out.println("Room size " +booking.getRoomTypes().size());
		System.out.println(receptionistController.checkIn(booking, bookedrooms));
	}
}
