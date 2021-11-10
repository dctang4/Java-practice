import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random random = new Random();
		
//		int x = random.nextInt();  // random.nextInt() gives values from around - 2 billion to 2 billion
//		double y = random.nextDouble();
//		boolean z = random.nextBoolean();
		
		int x = random.nextInt(6)+1;  // random.nextInt(6) gives a random int from 0 to 5
		
		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);

	}

}
