import java.util.*;

public class MethodDemo {
	
	//Variables
	static String firstName = "";
	static String lastName = "";
	static String address = "";
	static String city = "";
	static String state = "";
	static int zip = 0;
	static int employeeID = 0;

	public static void main(String[] args) {

		userInputStatements();
		
		outputMailingLabel();
		
		outputRoster();
		
		outputIDBadge();
		

	}
	
	public static void outputMailingLabel() {
		
		System.out.println();
		System.out.println(lastName + ", " + firstName);
		System.out.println(address);
		System.out.println(city + ", " + state + " " + zip);
		System.out.println();
		
	}
	
	public static void outputRoster() {
		
		System.out.println();
		System.out.println(firstName + " " + lastName);
		System.out.println();
		
	}
	
	public static void outputIDBadge() {
		
		System.out.println();
		System.out.println("ID #: " + employeeID);
		System.out.println();
		
	}

	public static void userInputStatements() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your first name.");
		firstName = in.nextLine();
		System.out.println("Please enter your last name.");
		lastName = in.nextLine();
		System.out.println("Please enter your street address.");
		address = in.nextLine();
		System.out.println("Please enter your city of residence.");
		city = in.nextLine();
		System.out.println("Please enter your state of residence.");
		state = in.nextLine();
		System.out.println("Please enter your postal zip code.");
		zip = in.nextInt();
		System.out.println("Please enter your employee ID");
		employeeID = in.nextInt();
		
	}

}
