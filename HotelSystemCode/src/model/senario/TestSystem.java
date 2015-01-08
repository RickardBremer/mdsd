package model.senario;

public class TestSystem {
	public static void main(String[] args) {
		System.out.println("A complete run of the scenarios.");
		System.out.println("All the scenarios can be run separatly as well.");
		System.out.println ("First the base of the system will be set up.");
		SystemSetup.main(args);
		System.out.println("Press Enter To Continue...");
        new java.util.Scanner(System.in).nextLine();
		System.out.println();
		
		System.out.println("Couple of bookings will be carried out.");
		CustomerMakesBooking.main(args);
		System.out.println("Press Enter To Continue...");
        new java.util.Scanner(System.in).nextLine();
		System.out.println();
		
		System.out.println("Customers check in at the hotel");
		CustomerChecksIn.main(args);
		System.out.println("Press Enter To Continue...");
        new java.util.Scanner(System.in).nextLine();
		System.out.println();
        
		System.out.println("Customers check out from the hotel");
		CustomerCheckOut.main(args);
	}
}
