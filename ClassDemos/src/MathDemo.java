
public class MathDemo {

	public static void main(String[] args) {
		
		int x, y, z;
		x = 2;
		y = 3;
		z = 4;
		
		double a, b;
		a = 1.5;
		b = 3;
		
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		System.out.println("z is " + z);
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		System.out.println();
		
		System.out.println("x + y is " + (x + y));
		System.out.println("x - y is " + (x - y));
		System.out.println("x * y is " + (x * y));
		System.out.println("x / y is " + (x / y));
		System.out.println("x % y is " + (x % y));
		System.out.println();
		
		System.out.println("x / y is " + ((double)x / y));
		System.out.println();
		
		
		int j, k, l;
		j = 1;
		k = 2;
		l = 3;
		
		System.out.println(j);
		j = j + k;
		System.out.println(j);
		System.out.println();
		
		j = 1;
		System.out.println(j);
		j += k;
		System.out.println(j);
		System.out.println();
		
		
		int count = 0;
		
		count = count + 1;
		System.out.println(count);
		count += 1;
		System.out.println(count);
		count++;
		System.out.println(count);
		count--;
		System.out.println(count);
		System.out.println(count++);
		System.out.println(count);
		System.out.println(++count);
		System.out.println(count--);
		System.out.println(count);
		System.out.println(--count);
		System.out.println();
		
		
		String statement = "Hello";
		int timesStatementHasBeenOutput = 0;
		
		System.out.println(statement + " has been output " + timesStatementHasBeenOutput++ + " time before.");
		System.out.println(statement + " has been output " + timesStatementHasBeenOutput++ + " time before.");
		
	}

}
