package p1;

public class HW1 {

	public static void main(String[] args) {

		//initialize variables as 0
		int x = 0;
		double y = 0.0;
		int result = 0;

		//initialize boolean to false
		boolean isMultipled = false;

		//reassign variables
		x = 10;
		y = 5.0;

		//assign result as the product of x and y casted to an integer type 
		// if we dont cast here we will get an error
		//result expects a integer type with four bytes and has set aside that much memory in the stack 
		//remember that the product of a floating point number and an integer is always a float
		//therefore if we dont cast here we get an error, we would be trying to put an 8 byte double 
		//into a spot reserved for a 4 byte integer in memory, this cannot work
		result = (int)(x * y);
		
		//assign our boolean isMultipled to true
		isMultipled = true;
		
		//print to the console as all integers ( we must again cast here) 
		System.out.println(x + " multipled by " + (int)y + " is " + result);
		
	}

}
