package random;

import java.util.Random;

import methods.CreatingMethods;

public class RandomNumbers {

	public static void main(String[] args) {

		int myRandom; 
		
		myRandom =(int)(5 +  ( (Math.random() * ( 10 - 5 + 1))));
		
		//(int) min +  Math.random ( max - min + 1)
		
		System.out.println(myRandom);
		
		Random random = new Random ();
		
		// min + random.nextInt( max - min + 1)
		//this is the ideal way 
		//i know the range and teh next person knows the range too 
		System.out.println( 5 + random.nextInt(10 - 5 + 1));
		
		// creating a char array of size ten 
		char [] charArray = new char [10];
		
		//generates random upper case letters 
		for ( int i = 0; i < charArray.length; i++) {
			
			charArray[i] =((char) (65 + random.nextInt(90 - 65 + 1)));
			//System.out.println(charArray[i]);
		}
		
		//genereate random lower case letters
		for ( int i = 0; i < charArray.length; i++) {
			
			charArray[i] = ((char)(97 + random.nextInt( 122 - 97 + 1)));
			System.out.println(charArray[i]);
		}
		
		
		CreatingMethods.genRandomNumber(10, 5);
		
 		
		
		
	}


}
