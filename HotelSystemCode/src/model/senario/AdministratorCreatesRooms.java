package model.senario;

import java.util.Date;

import model.AdminController;
import model.DatabaseInterface;
import model.Expense;
import model.ExpenseExpert;
import model.ModelFactory;
import model.PromotionExpert;
import model.Room;
import model.RoomExpert;
import model.User;
import model.UserExpert;
import model.impl.ModelFactoryImpl;

public class AdministratorCreatesRooms {
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
		
		AdminController adminController = mf.createAdminController();
		adminController.AdminController(roomExpert, expenseExpert, userExpert, promotionExpert);
		//Create an administrator
		User admin = mf.createUser();
		String adminPassword = "doctor";
		admin.User("John", "Zoidberg", adminPassword, false, true, -1);
		admin = adminController.createUser(admin);
		//Create a receptionist
		User receptionist = mf.createUser();
		String receptionistPassword = "iamgod";
		receptionist.User("Morgan", "Freeman", receptionistPassword, true, false, -1);
		receptionist = adminController.createUser(receptionist);
		
		// Create the room expenses
		Expense singleRoomExpense = mf.createExpense();
		singleRoomExpense.Expense(-1, "Single", new Date(), "Single Room", 200, true, -1);
		singleRoomExpense = adminController.createExpense(singleRoomExpense);
		singleRoomExpense.setFixed(false);
		
		Expense doubleRoomExpense = mf.createExpense();
		doubleRoomExpense.Expense(-1, "Double", new Date(), "Double Room", 350, true, -1);
		doubleRoomExpense = adminController.createExpense(doubleRoomExpense);
		doubleRoomExpense.setFixed(false);
		
		//Create the rooms
		int amountSingleRooms = 3;
		int floor = 1;
		for (int i = 0; i < amountSingleRooms; i++) {
			Room room = mf.createRoom();
			room.Room(Integer.parseInt("" + floor + "" + i), "Nice single bed room", singleRoomExpense.getName(), singleRoomExpense, 1, "unouccupied", mf.createReceipt());
			roomExpert.addRoom(room);
		}
		
		int amountDoubleRooms = 2;
		floor = 2;
		for (int i = 0; i < amountDoubleRooms; i++) {
			Room room = mf.createRoom();
			room.Room(Integer.parseInt("" + floor + "" + i), "HUGE room with double room", doubleRoomExpense.getName(), doubleRoomExpense, 1, "unouccupied", mf.createReceipt());
			roomExpert.addRoom(room);
		}
		
		System.out.println("Total unused rooms in database: " + roomExpert.getAllRooms().size());
	}
}
