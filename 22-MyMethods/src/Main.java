
public class Main {

	public static void main(String[] args) {
		
		// method = a block of code that is executed whenever it is called upon
		
//		String name = "Chun";
//		int age = 31;
		
//		hello();
//		hello(name, age); // name is a argument for the hello method
		
		
		int x = 3;
		int y = 4;
		
		int z = add(x,y);
		
		System.out.println(z);
		
	}
	
	
	// if nothing is returned void is used
//	static void hello() {
//		System.out.println("Hello");
//	}
	
	// String name and int age are the parameters for this method
//	static void hello(String name, int age) {
//		System.out.println("Hello " + name);
//		System.out.println("You are " + age);
//	}

	// an integer is returned so int is used
	static int add(int x, int y) {
		
		int z = x + y;
		return z;
	}
	
}
