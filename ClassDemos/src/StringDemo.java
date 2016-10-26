
public class StringDemo {

	public static void main(String[] args) {
		
		String firstName, lastName;
		firstName = "Mychal";
		lastName = "Sampson";
		
		System.out.println(lastName + ", " + firstName);
		
		String fullName = firstName + " " + lastName;
		
		System.out.println(fullName);
		System.out.println();
		
		String alphabet;
		alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		System.out.println(alphabet.substring(alphabet.length() - 4, alphabet.length()));

		
	}

}
