package methods;

import java.util.Random;

public class CreatingMethods {

	public static void main(String[] args) {

//		int randomNumber;
//		randomNumber = genRandomNumber(5, 10);
//		String myString = genRandomString(randomNumber, true);
//		
//		System.out.println(myString);
		
//		genMenu();
		
		genMenu(1000);
		

	}

	public static int genRandomNumber(int min, int max) {
		int randomNumber;
		Random random = new Random();

		randomNumber = min + random.nextInt(max - min + 1);

		return randomNumber;

	}

	public static String genRandomString (int length, boolean isUpper) {
		
		String myString;
		char [] myCharArray = new char [length];
		
		if ( isUpper) {
			for ( int i = 0; i < myCharArray.length; i++) {
			
				myCharArray[i] = (char) genRandomNumber( 65, 90);
			}
		
		}
		else if (!isUpper) {
			
			for ( int i = 0;  i < myCharArray.length; i++) {
				
				myCharArray[i] = (char) genRandomNumber (97, 122 );
				
			}
		}
	
		myString = String.valueOf(myCharArray);
	//	String string = new String (myCharArray);
	//	StringBuilder myOtherString = new StringBuilder();
   //	myOtherString.append(myCharArray);
		
		return myString;
	
	}
	
	public static double genRandomPrice (int min , int max) {
		Random random = new Random (); 
		
		double myRandomNum = min +  random.nextDouble() * ( max - min + 1); 
		
		return myRandomNum; 
	}

	public static void genMenu ( ) {
		
		
		for ( int i = 0; i < 10; i++) {
			
			System.out.printf ("%-10d%-10s%15.2f\n", (i + 1), genRandomString((genRandomNumber ( 5, 10)), true), genRandomPrice(10, 100));
		}
		
	}
	
	//we can also overload a method we just need to specify different arguments
	public static void genMenu(int menuLength) {
			
		for ( int i = 0; i < menuLength; i++) {
			
			System.out.printf ("%-10d%-10s%15.2f\n", (i + 1), genRandomString((genRandomNumber ( 5, 10)), true), genRandomPrice(10, 100));
		}
		
	}



}
