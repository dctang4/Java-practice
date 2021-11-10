import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// while loop = executes a block of code as long as it's condition remains true
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
//		while(name=="") {
//		while(name.isBlank()) {
//			System.out.print("Enter your name: ");
//			name = scanner.nextLine();
//		}
		
		// a variation of the while loop where you execute the block of code once first 
		// before checking the conditions
		do{
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}while(name.isBlank());
		
		
		System.out.println("Hello " + name);
		
		scanner.close();
		

	}

}
