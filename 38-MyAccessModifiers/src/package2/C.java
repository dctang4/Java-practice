package package2;

import package1.*;

public class C {

	// can be access by in other packages
	public String publicMessage = "This is public";
	
//	// can only be accessed in other packages if it is a subclass of this class
//	protected String protectedMessage = "This is protected";
	
	// can only be accessed within the package
	String defaultMessage = "This is the default";
	
//	// can only be accessed from within the class itself
//	private String privateMessage = "This is private";
	
}
