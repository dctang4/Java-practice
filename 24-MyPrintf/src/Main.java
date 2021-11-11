
public class Main {

	public static void main(String[] args) {
		
		// printf() =	an optional method to control, format, and display text to the console window
		//				two arguments = format string + (object/variable/value)
		//				% [flags] [width] [precision] [conversion-character]
		//				[conversion-character] corresponds to the data type you trying to add
		
		
		// the format specifier indicates where the object/variable/value will be placed
//		System.out.printf("%d This is a format string ", 123);
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Chun";
		int myInt = 50;
		double myDouble = 1000;
		
		// [conversion-character]
//		System.out.printf("%b", myBoolean);
//		System.out.printf("%c", myChar);
//		System.out.printf("%s", myString);
//		System.out.printf("%d", myInt);
//		System.out.printf("%f", myDouble);
		
		// [width]
		// minimum number of characters to be written as output (add white space before string)
//		System.out.printf("Hello %10s", myString);
		
		// [precision]
		// sets number of digits of precision when outputting floating-point values
//		System.out.printf("You have this much money %.2f", myDouble);
		
		// [flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000
		
//		System.out.printf("You have this much money %-20f", myDouble); // left justify
//		System.out.printf("You have this much money %+f", myDouble); // output plus/minus sign
//		System.out.printf("You have this much money %020f", myDouble); // zero padded
		System.out.printf("You have this much money %,f", myDouble); // comma separator
		
	}

}
