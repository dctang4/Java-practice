
public class Main {

	public static void main(String[] args) {
		
		// String = a reference data type that can store one or more characters
		//			reference data types have access to useful methods
		
		String name = "Chun";
		
//		boolean result = name.equals("Chun");
		boolean result = name.equalsIgnoreCase("chun");
//		boolean result = name.isEmpty();
//		int result = name.length();
//		int result = name.indexOf("u");
//		char result = name.charAt(0);
//		String result = name.toUpperCase();
//		String result = name.toLowerCase();
//		String result = name.trim();  // removes white spaces at two ends
//		String result = name.replace("u", "a");
		
		System.out.println(result);
		

	}

}
