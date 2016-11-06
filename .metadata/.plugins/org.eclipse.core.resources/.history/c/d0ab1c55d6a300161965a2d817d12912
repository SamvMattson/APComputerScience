import java.util.*;

public class Test {
	
	static String character;
	static int integer;
	
	public static void main(String[] args) {
		
		getInput();
		output();

	}
	
	public static void getInput() {
		Scanner in  = new Scanner(System.in);
		
		do { 
			System.out.println("Please enter a character.");
			character = in.nextLine();
		} while (character.length() > 1);
		
		do {
			System.out.println("Please enter an integer between 1 and 10.");
			integer = in.nextInt();
		} while (integer < 1 || integer > 10);
		
		in.close();
	}
	
	public static void output() {
		for (int i = 0; i < integer; i++) {
			System.out.print(character);
		}
	}

}