
public class LoopingDemo {

	public static void main(String[] args) {
		
		for (int i = 1; i < 36; i++) {
			System.out.println(i);
		}
		
		for (int i = 0; i < 51; i += 2) {
			System.out.println(i);
		}
		
		for (int i = 0; i < 100; i++) {
			if ( i % 2 == 0) {
				System.out.println(i + ":even");
			} else {
				System.out.println(i + ":odd");
			}
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
