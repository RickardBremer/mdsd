package model.senario;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.eclipse.emf.common.util.EList;

import model.AdminController;
import model.DatabaseInterface;
import model.Expense;
import model.ExpenseExpert;
import model.ModelFactory;
import model.Promotion;
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
		adminController.removeUser(admin);
		admin = adminController.createUser(admin);
		//Create a receptionist
		User receptionist = mf.createUser();
		String receptionistPassword = "iamgod";
		receptionist.User("Morgan", "Freeman", receptionistPassword, true, false, -1);
		adminController.removeUser(receptionist);
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
		//Test admin login
		System.out.println("Admin tries to login: " + adminController.login("John", adminPassword));
		System.out.println("Receiptionist tries to login: " + adminController.login("Morgan", receptionistPassword));
		
		//Create the rooms. Removes them first if they exists
		int amountSingleRooms = 3;
		int floor = 1;
		for (int i = 0; i < amountSingleRooms; i++) {
			Room room = mf.createRoom();
			room.Room(Integer.parseInt("" + floor + "" + i), "Nice single bed room", singleRoomExpense.getName(), singleRoomExpense, 1, "unouccupied", mf.createReceipt());
			roomExpert.removeRoom(room);
			roomExpert.addRoom(room);
		}
		
		int amountDoubleRooms = 2;
		floor = 2;
		for (int i = 0; i < amountDoubleRooms; i++) {
			Room room = mf.createRoom();
			room.Room(Integer.parseInt("" + floor + "" + i), "HUGE room with double room", doubleRoomExpense.getName(), doubleRoomExpense, 2, "unouccupied", mf.createReceipt());
			roomExpert.removeRoom(room);
			roomExpert.addRoom(room);
		}
		
		displayDatabaseResult(db.query("SELECT * FROM tblRooms"));
		
		//Create a promotion. Removes the promotion if it already exists
		Promotion promotion = mf.createPromotion();
		Calendar cal = Calendar.getInstance();
		cal.set(2015, 04, 01);
		Date vaildFrom = cal.getTime();
		cal.set(2015, 04, 30);
		Date vaildTo = cal.getTime();
		cal.set(2015, 01, 31);
		Date expirationDate = cal.getTime();
		promotion.Promotion("VinterSales", "10 percent off on single rooms", 10, vaildFrom, vaildTo, "Single", expirationDate);
		promotionExpert.removePromotion(promotion.getCode());
		promotionExpert.addPromotion(promotion);
	}
	
	private static void displayDatabaseResult(EList<String> input) {
		for (String rowFull : input) {
			String[] row = rowFull.split(";", -1);
			for (int i = 0; i < row.length; i++) {
				System.out.print(row[i] + "\t");
			}
			System.out.println();
		}
	}
}
