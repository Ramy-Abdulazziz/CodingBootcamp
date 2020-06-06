package display;

public class DisplayElementsToConsole {

	public static void main(String[] args) {

		//integer %d
		//floating point %f
		//string %s
		// \n new line
		
		
		System.out.printf("%-10s %-10s\n", "number", "price");
		for ( int i = 0; i < 10; i++) {
			
			System.out.printf("%-10d %.2f\n", i, i * 1.5);
		}
		
		
		
	}

}
