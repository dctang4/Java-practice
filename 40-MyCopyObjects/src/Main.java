
public class Main {

	public static void main(String[] args) {
		
		Car car1 = new Car("Chevrolet", "Camaro", 2021);
//		Car car2 = new Car("Ford", "Mustang", 2022);
//		car2.copy(car1);
		
		
//		// this way of copying in essence creates two variable names for the same thing
//		// the stored address is the same for both car2 and car1 which means there is only one object
//		// example:  	instead of have two computers that are exactly the same,
//		//				we have one computer with two different names.
//		car2 = car1;
		

		Car car2 = new Car(car1);
		
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());	

	}

}
