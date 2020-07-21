package p1;

public class ArraysReview {

	public static void main(String[] args) {

		//an array can store multiple values of the same data type
		
		
		String [] cars = {"Volvo", "BMW", "FORD"};
		
		//arrays are a reference type and stored in heap
		//the heap does not know how much data is in the array at this point
		//8 bytes are reserved for the memory address of the array
		//arrays are referenced by memory address where first bit of data is stored 
		
		
		String [] otherCars;
		otherCars = new String [10];
		
		for ( int i = 0; i < otherCars.length; i++) {
			
			otherCars[i] = "BMW";
		}
		
		//we can create an array of all primitive types
		
		char [] myChars = new char[10];
		
		int [] myIntArray = new int [10];
		
		// all arrays are 0 indexed 
		// first entry is always at "0"
		// last index of array of length n is n - 1
		
		int someNumber = 5;
		
		for ( int i = 0 ; i < myIntArray.length; i++) {
			
			myIntArray[i] = someNumber++;
		
		}
		
		
	    
	
	
	}

}
