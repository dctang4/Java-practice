
public class Main {

	public static void main(String[] args) {
		
		// matrix = 2D array = an array of arrays
		
		String[][] cars = 	{
								{"Camero", "Corvette", "Silverado"},
								{"Mustang", "Ranger", "F-150"},
								{"Ferrari", "Lambo", "Tesla"}
							};
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println();
			for (int j = 0; j < cars[0].length; j++) {
				System.out.print(cars[i][j] + " ");
			}
		}

	}

}
