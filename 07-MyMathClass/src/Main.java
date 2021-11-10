import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		double x = 3.14;
//		double y = -10;
		
//		double z = Math.max(x, y);	// find the max value
//		double z = Math.min(x, y);  // find the min value
//		double z = Math.pow(x, y); 	// find the value of x raised to power of y
//		double z = Math.abs(y);		// find absolute value
//		double z = Math.sqrt(x);	// find the square root value
//		double z = Math.round(x);	// round to nearest integer
//		double z = Math.ceil(x);	// round up to nearest integer
//		double z = Math.floor(x);	// round down to nearest integer
		
//		System.out.println(z);
		
		
		
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("The hypotenuse is: " + z);
		
		scanner.close();

	}

}
