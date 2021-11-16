import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		// file = An abstract representation of file and directory pathnames
		
//		File file = new File("secret_message.txt"); // if file is in project folder
		File file = new File("/home/chun/Desktop/secret_message.txt"); // if file is anywhere else
		
		if(file.exists()) {
			System.out.println("This file exists!");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			file.delete();
		}
		else {
			System.out.println("This file doesn't exist");
		}

	}

}
