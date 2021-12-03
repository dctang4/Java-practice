import java.io.Serializable;

public class User implements Serializable {

	// adding your own specific serialVersionUID
	private static final long serialVersionUID = 1;
	
	String name;
	transient String password;
	
	public void sayHello() {
		System.out.println("Hello " + name);
	}
	  
}
