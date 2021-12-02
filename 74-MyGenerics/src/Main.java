import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// generics =	enable types (classes and interfaces) to be parameters when defining:
		//				classes, interfaces and methods
		//				a benefit is to eliminate the need to create multiple versions
		//				of methods or classes for various data types.
		//				Use 1 version for all reference data types
		
		// bounded types =	you can create the objects of a generic class to have data
		//					of specific derived types ex.Number
		
		MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1,9);
		MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14,1.01);
		MyGenericClass<Character, Character> myChar = new MyGenericClass<>('@','$');
		MyGenericClass<String, Character> myString = new MyGenericClass<>("Hello",'!');

//		// ArrayList is an example of a generic class
//		ArrayList<String> myFriends = new ArrayList<>();
		
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());
		
//		Integer[] intArray = {1, 2, 3, 4, 5};
//		Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
//		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
//		String[] stringArray = {"B", "Y", "E"};
//		
//		displayArray(intArray);
//		displayArray(doubleArray);
//		displayArray(charArray);
//		displayArray(stringArray);
//		
//		System.out.println(getFirst(intArray));
//		System.out.println(getFirst(doubleArray));
//		System.out.println(getFirst(charArray));
//		System.out.println(getFirst(stringArray));
		
		
//		// An example. Not fully setup
//		Player player = new Player();
//		Enemy enemy = new Enemy();
//		Item item = new Item();
//		Tree tree = new Tree();
//		
//		draw(player);
//		draw(enemy);
//		draw(item);
//		draw(tree);
	}
	
//	public static <T> void draw(T x) {
//		x.draw();
//	}
	
//	// The generic method
//	public static <T> void displayArray(T[] array) {
//		
//		for(T x : array) {
//			System.out.print(x+" ");
//		}
//		System.out.println();
//	}
//	
//	public static <T> T getFirst(T[] array) {
//		
//		return array[0];
//	}

	
	
	
//	// The overloaded method.  Not practical
//	public static void displayArray(Integer[] array) {
//		
//		for(Integer x : array) {
//			System.out.print(x+" ");
//		}
//		System.out.println();
//	}
//	
//	public static void displayArray(Double[] array) {
//		
//		for(Double x : array) {
//			System.out.print(x+" ");
//		}
//		System.out.println();
//	}
//
//	public static void displayArray(Character[] array) {
//	
//		for(Character x : array) {
//			System.out.print(x+" ");
//		}
//		System.out.println();
//	}
//
//	public static void displayArray(String[] array) {
//	
//		for(String x : array) {
//			System.out.print(x+" ");
//		}
//		System.out.println();
//	}

}
