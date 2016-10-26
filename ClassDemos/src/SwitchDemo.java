import java.util.*;

public class SwitchDemo {

	public static void main(String[] args) {
		
		pollingPlace();
		
	}
	
	public static void pollingPlace() {
		Scanner in = new Scanner(System.in);
		int choice;
		
		System.out.println("Welcome to your polling place\n\n");
		System.out.println("Choose the option that applies to you:\n");
		System.out.println("1 - I am registered to vote and live in Ward 23");
		System.out.println("2 - I am registered to vote and live in Ward 22");
		System.out.println("3 - I am registered to vote and live in Ward 21");
		System.out.println("4 - I am registered not registered, but I have proper ID");
		System.out.println("5 - I am not registered and have no ID\n");
		choice = in.nextInt();
		
		switch (choice) {
		case 1:	System.out.println("Report to Room 106 to vote");	break;
		case 2:	System.out.println("Report to Room 110 to vote");	break;
		case 3:	System.out.println("Report to Room 207 to vote");	break;
		case 4:	System.out.println("Report to Room 333 to register");	break;
		case 5:	System.out.println("Report to Room 401 to complete a provisional ballot");	break;
		default: System.out.println("\n\nError\n\n"); pollingPlace();
		}
	}

}
