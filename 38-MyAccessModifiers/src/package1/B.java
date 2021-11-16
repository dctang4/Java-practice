package package1;

import package2.*;

public class B {
	
	// can only be accessed from within the class itself
	private String privateMessage = "This is private";
	
	public static void main(String[] args) {
		
		B b = new B();
		System.out.println(b.privateMessage);
	}

}
