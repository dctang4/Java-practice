import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//		Steps to Deserialize
		//		-------------------------------------------------------------------------
		//		1. Declare your object (don't instantiate)
		//		2. Your class should implement Serializable interface
		//		3. add import java.io.Serializable;
		//		4. FileInputStream fileIn = new FileInputStream(file.path);
		//		5. ObjectInputStrea, in = new ObjectInputStream(fileIn);
		//		6. objectName = (class) in.readObject();
		//		7. in.close(); fileIn.close();
		//		-------------------------------------------------------------------------
		
		// important notes	1. children classes of a parent class that implements Serializable will do so as well
		//					2. static fields are not serialized (they belong to the class, not an individual object)
		//					3. the class's definition ("class file") itself is not recorded, cast it as the object type
		//					4. Fields declared as "transient" aren't serialized, they're ignored
		//					5. serialVersionUID is a unique version ID
		

		User user;
		FileInputStream fileIn = new FileInputStream("/home/chun/eclipse-workspace/75-MySerialization/UserInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		user = (User) in.readObject();
		in.close();
		fileIn.close();
		
		System.out.println(user.name);
		System.out.println(user.password);
		user.sayHello();
		
		// if serialVersionUID doesn't match an error will occur
		// for the serialVersionUID to match, the classes in this case the 2 User class must match exactly
		long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println(serialVersionUID);
		
	}

}
