
public class Main {

	public static void main(String[] args) {
		
		// array = used to store multiple values in a single variable
		// each value in the array is called an element
		
//		String[] cars = {"Camero", "Corvette", "Tesla", "BMW"};
//
//		cars[0] = "Mustang";
//		
//		System.out.println(cars[2]);
		
		String[] cars = new String[3];
		
		cars[0] = "Camero";
		cars[1] = "Corvette";
		cars[2] = "Tesla";
		
//		System.out.println(cars[0]);
		
		
		// to access all the elements use a for loop to loop over each element
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
	}

}
