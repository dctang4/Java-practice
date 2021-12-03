import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// Serialization =	The process of converting an object into a byte stream.
		//					Persists (save the state) the object after program exits
		//					Thus byte stream can be saved as a file or sent over a network
		//					Can be sent to a different machine
		//					Byte stream can be saved as a file (.ser) which is platform independent
		//					(Think of this as if you're saving a file with the object's information)
		
		// Deserialization =	The reverse process of converting a byte stream into an object
		//						(Think of this as if you're loading a saved file)
		
		//		Steps to Serialize
		//		------------------------------------------------------------------------------------------
		//		1. Your object class should implement Serializable interface 
		//		2. add import java.io.Serializable;
		//		3. FileOutputStream fileOut = new FileOutputStream(file path);
		//		4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
		//		5. out.writeObject(objectName);
		//		6. out.close(); fileOut.close();
		//		------------------------------------------------------------------------------------------
		
		// serialVersionUID =	serialVersionUID is a unique ID that functions like a version #
		//						verifies that the sender and receiver of a serialized object,
		//						have loaded classes for that object that match
		//						Ensures object will be compatible between machines
		//						Number must match. Otherwise this will cause InvalidClassExemption
		//						A serialVersionUID will be calculated based on class properties, members, etc.
		//						A serializable class can declare it's own serialVersionUID explicitly (recommended)
		
		User user = new User();
		
		user.name = "Chun";
		user.password = "I<3Pizza";
		
//		user.sayHello();
		
		FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
		
		System.out.println("object info saved");
		
		long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println(serialVersionUID);


	}

}
