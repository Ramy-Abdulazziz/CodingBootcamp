package p2;

public class RamyLikesToMakeUsSuffer {

	public static void main(String[] args) {

		int myNumber = 1;
		double x = 0;	
		int numberCount = 0; 
		String decoration = " -_-_-_-_-_--_-_-_-_-_-__-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_";
		
		System.out.printf("%45s\n", "Ramy Likes To Make Us Suffer");
		System.out.println(decoration);
		do {
			
			x += 3 * ( myNumber + 7);
		
			System.out.printf("%20.2f", x);
			
			myNumber++;
			numberCount++; 
			
			if ( numberCount == 3) {
				
				System.out.println();
				numberCount = 0; 
			}
			
		} while (myNumber < 500);
	}

}
