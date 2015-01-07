package model.senario;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import javax.xml.soap.SOAPException;

import org.eclipse.emf.common.util.BasicEList;
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
import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires;
import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;

public class AdministratorCreatesRooms {
	public static void main(String[] args) {
		//Administrate creditcard
		AdministratorRequires cashAdmin;
		CustomerRequires cashCustomer;
		try {
			cashAdmin = AdministratorRequires.instance();
			cashCustomer = CustomerRequires.instance();
			
			if (!cashCustomer.isCreditCardValid("2100000000000000", "000", 12, 17, "Hulken", "Greenman")) {
				cashAdmin.addCreditCard("2100000000000000", "000", 12, 17, "Hulken", "Greenman");
			}
			if (cashAdmin.getBalance("2100000000000000", "000", 12, 17, "Hulken", "Greenman") < 1000) {
				cashAdmin.makeDeposit("2100000000000000", "000", 12, 17, "Hulken", "Greenman", 120000);
			}
		} catch (SOAPException e) {
			System.out.println("Cash setup failed!");
		}
		
		//Create necessary components
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
		
		//Delete all users, rooms, expenses, and promotions
		db.send("DELETE FROM tblUsers");
		db.send("DELETE FROM tblRooms");
		db.send("DELETE FROM tblExpenses");
		db.send("DELETE FROM tblPromotions");
		
		//Create an administrator
		User admin = mf.createUser();
		String adminPassword = "doctor";
		admin.User("John", "Zoidberg", adminPassword, false, true, -1);
		admin = adminController.createUser(admin);
		//Create a receptionist
		User receptionist = mf.createUser();
		String receptionistPassword = "iamgod";
		receptionist.User("Morgan", "Freeman", receptionistPassword, true, true, -1);
		receptionist = adminController.createUser(receptionist);
		
		EList<User> listOfUsers = adminController.viewUsers();
		
		//remove the last added user
		receptionist = listOfUsers.get(1);
		adminController.removeUser(receptionist);
		//add it again to have two users
		receptionist = adminController.createUser(receptionist);
		//change so the latest user is only receptionist
		receptionist.setAdministrator(false);
		listOfUsers = adminController.viewUsers();
		
		//show users in the database
		EList<String> usersAsStrings = new BasicEList<String>();
		System.out.println("Number of users: " + listOfUsers.size());
		for (User user : listOfUsers) {
			usersAsStrings.add(
					user.getId() + ";"
					+ user.getFirstName() + ";"
					+ user.getSurname() + ";"
					+ user.getPassword() + ";"
					+ user.isReceptionist() + ";"
					+ user.isAdministrator());
		}
		displayDatabaseResult(usersAsStrings);
		System.out.println();
		
		//Test admin login
		System.out.println("Admin tries to login: " + adminController.login("John", adminPassword));
		System.out.println("Receiptionist tries to login: " + adminController.login("Morgan", receptionistPassword));
		System.out.println("Random tries to login: " + adminController.login("Alex", "h4xx0r"));
		System.out.println();
		
		// Create the room expenses
		Expense singleRoomExpense = mf.createExpense();
		singleRoomExpense.Expense(-1, "single", new Date(), "Single Room", 200, true, -1);
		singleRoomExpense = adminController.createExpense(singleRoomExpense);
		singleRoomExpense.setFixed(false);
		
		Expense doubleRoomExpense = mf.createExpense();
		doubleRoomExpense.Expense(-1, "double", new Date(), "Double Room", 350, true, -1);
		doubleRoomExpense = adminController.createExpense(doubleRoomExpense);
		doubleRoomExpense.setFixed(false);
		
		Expense tripleRoomExpense = mf.createExpense();
		tripleRoomExpense.Expense(-1, "triple", new Date(), "Triple Room", 500, true, -1);
		tripleRoomExpense = adminController.createExpense(tripleRoomExpense);
		
		//Create the rooms
		int amountSingleRooms = 4;
		int floor = 1;
		for (int i = 0; i < amountSingleRooms; i++) {
			Room room = mf.createRoom();
			room.Room(Integer.parseInt("" + floor + "" + i), "Nice single bed room", singleRoomExpense.getName(), singleRoomExpense, 1, "unoccupied", mf.createReceipt());
			roomExpert.addRoom(room);
			roomExpert.removeRoom(room);
			roomExpert.addRoom(room);
		}
		
		int amountDoubleRooms = 2;
		floor = 2;
		for (int i = 0; i < amountDoubleRooms; i++) {
			Room room = mf.createRoom();
			room.Room(Integer.parseInt("" + floor + "" + i), "HUGE room with a double bed", doubleRoomExpense.getName(), doubleRoomExpense, 2, "unoccupied", mf.createReceipt());
			roomExpert.addRoom(room);
			roomExpert.removeRoom(room);
			roomExpert.addRoom(room);
		}

		EList<Room> listOfRooms = adminController.viewRooms();
		//Update the first room in the list
		Room updateRoom = listOfRooms.get(0);
		updateRoom.setDescription(updateRoom.getDescription() + " UPDATED");
		adminController.updateRoom(updateRoom);
		
		//remove the fourth room
		adminController.removeRoom(listOfRooms.get(3));
		listOfRooms = adminController.viewRooms();
		
		//show rooms
		EList<String> roomsAsStrings = new BasicEList<String>();
		System.out.println("Number of rooms: " + listOfRooms.size());
		for (Room room : listOfRooms) {
			roomsAsStrings.add(
					room.getNumber() + ";"
					+ room.getDescription() + ";"
					+ room.isClean() + ";"
					+ room.getType() + ";"
					+ room.getStatus() + ";"
					+ room.getBeds() + ";"
					+ room.getPrice().getId());
		}
		displayDatabaseResult(roomsAsStrings);
		System.out.println();
		
		EList<Expense> listOfExpenses = adminController.viewExpenses();
		//update the single room expense
		singleRoomExpense = listOfExpenses.get(0);
		singleRoomExpense.setDescription(singleRoomExpense.getDescription() + " UPDATED");
		adminController.updateExpense(singleRoomExpense);
		
		//remove the triple room 
		adminController.removeExpense(tripleRoomExpense);
		
		//show expenses, these are just the ones that are fixed
		listOfExpenses = adminController.viewExpenses();
		EList<String> ExpensesAsStrings = new BasicEList<String>();
		System.out.println("Number of Expenses: " + listOfExpenses.size());
		for (Expense Expense : listOfExpenses) {
			ExpensesAsStrings.add(
					Expense.getId() + ";"
					+ Expense.getName() + ";"
					+ Expense.getDescription() + ";"
					+ Expense.getPrice() + ";"
					+ Expense.isFixed() + ";"
					+ Expense.getDate());
		}
		displayDatabaseResult(ExpensesAsStrings);
		System.out.println();
		
		//Create a promotion. Removes the promotion if it already exists
		Promotion promotion = mf.createPromotion();
		Calendar cal = Calendar.getInstance();
		cal.set(2015, 04, 01);
		Date vaildFrom = cal.getTime();
		cal.set(2015, 04, 30);
		Date vaildTo = cal.getTime();
		cal.set(2015, 01, 31);
		Date expirationDate = cal.getTime();
		promotion.Promotion("VinterSales", "10 percent off on single rooms", 10, vaildFrom, vaildTo, "single", expirationDate);
		promotionExpert.addPromotion(promotion);
		
		//Create a second promotion that should be removed
		promotion = mf.createPromotion();
		promotion.Promotion("SummerSales", "THIS SHOULD NOT EXIST", 90, vaildFrom, vaildTo, "double", expirationDate);
		promotionExpert.addPromotion(promotion);
		
		//show all promotions
		EList<Promotion> listOfPromotions = adminController.viewPromotions();
		EList<String> PromotionsAsStrings = new BasicEList<String>();
		
		//here we remove the second promotion, and get the new list of promotions
		adminController.removePromotion(listOfPromotions.get(0));
		listOfPromotions = adminController.viewPromotions();
		
		//update the one existing promotion
		promotion = listOfPromotions.get(0);
		promotion.setDescription(promotion.getDescription() + " UPDATED");
		adminController.updatePromotion(promotion);
		listOfPromotions = adminController.viewPromotions();
		
		System.out.println("Number of Promotions: " + listOfPromotions.size());
		for (Promotion Promotion : listOfPromotions) {
			PromotionsAsStrings.add(
					Promotion.getCode() + ";"
					+ Promotion.getDescription() + ";"
					+ Promotion.getPercentage() + ";"
					+ Promotion.getRoomType() + ";"
					+ Promotion.getValidFrom() + ";"
					+ Promotion.getValidTo() + ";"
					+ Promotion.getExpirationDate());
		}
		displayDatabaseResult(PromotionsAsStrings);
		System.out.println();
	}
	
	private static void displayDatabaseResult(EList<String> input) {
		int[] maxSize = new int[input.get(0).split(";", -1).length];
		Arrays.fill(maxSize, 0);
		for (String rowFull : input) {
			String[] row = rowFull.split(";", -1);
			for (int i = 0; i < row.length; i++) {
				if (row[i].length() > maxSize[i]) {
					maxSize[i] = row[i].length();
				}
			}
		}
		for (String rowFull : input) {
			String[] row = rowFull.split(";", -1);
			for (int i = 0; i < row.length; i++) {
				System.out.print(String.format("%-" + (maxSize[i] + 3) + "s", row[i]));
			}
			System.out.println();
		}
	}
}
