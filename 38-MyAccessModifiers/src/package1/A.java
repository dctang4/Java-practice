package package1;

import package2.*;

public class A {

	public static void main(String[] args) {
		
		C c = new C();
//		System.out.println(c.defaultMessage);
		System.out.println(c.publicMessage);
		

	}
	
	// can only be accessed in other packages if it is a subclass of this class
	protected String protectedMessage = "This is protected";

}


// Access Levels

// Modifier			// Class	// Package	// Subclass	// World
// public			// Y		// Y		// Y		// Y
// protected 		// Y		// Y		// Y		// N
// *no modifier*	// Y		// Y		// N		// N
// private	 		// Y		// N		// N		// N
