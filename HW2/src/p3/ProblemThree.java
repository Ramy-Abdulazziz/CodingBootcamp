package p3;

public class ProblemThree {

	public static void main(String[] args) {

		// we need doubles here to store the result bc numbers will have a decimal
		int myNumber = 1;
		double x = 0;

		// we also need to keep track of how many numbers are printed to a line with
		// another variable
		int numberCount = 0;
		
		// good practice to use a string variable for this kind of border so if we want to change we can just change in one place
		String decoration = "-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_";

		//use print format to print our header
		System.out.printf("%45s\n", "Ramy Likes To Watch Us Suffer");
		
		//use println to print our decoration (much better than throwing all that into a println, now we can just throw the variable in
		System.out.println(decoration);

		//use a do while loop to iterate through myNumber up to 500
		//we can also use other loops for this but do while is ideal here
		// for loop works, and while loop also work here 
		do {
			
			//use our shorthand for x = x + something 
			//impelement our equation
			x += (Math.pow(myNumber, 2) + (3 * myNumber + 7)) / (myNumber + 1);

			//we print out x with printf so we can cut off decimal point and space out neatly
			System.out.printf("%-20.2f", x);
			
			//we increment nyNumber and numberCount
			myNumber++;
			numberCount++;

			//check to see if three numbers are printed if they are go to a new line
			//we need to reset numberCount to 0 after otherwise it will stay at three for the whole iteration
			if (numberCount == 3) {

				System.out.println();
				numberCount = 0;
			}
		} while (myNumber <= 500);

	}
}