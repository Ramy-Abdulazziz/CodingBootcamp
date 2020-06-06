package operations;

public class VariableOperations {

	public static void main(String[] args) {

		// doing mathematical operations on variables
//		int isIncremented = 0; 
//				
////		isIncremented++;
////		++isIncremented;
////
////		isIncremented = isIncremented + 1;
//		
//		//post increment 
//		int x = isIncremented++;
//		System.out.println(isIncremented);
//		
//		//pre increment 
//		int y = ++isIncremented;
//		
//		System.out.println(x);
//		System.out.println(y);

		// addition
		int x = 5;
		int y = 7;

		int result = x + y;
		System.out.println(result);

		// subtraction
		int a = 5;
		int b = 7;

		int resultSub = a - b;
		System.out.println(resultSub);

		// multiply

		int c = 10;
		int d = 20;

		int resultMult = c * d;
		System.out.println(resultMult);

		int e = 10;
		double f = 10.5;

		System.out.println(e * f);

		// division
		int g = 100;
		int h = 10;

		System.out.println(g / h);

		// decrement

		// post decrement
		int isDeceremented = 10;
		System.out.println(isDeceremented--);
		System.out.println(isDeceremented);

		// pre decremented
		int preDecrement = 10;
		System.out.println(--preDecrement);
		System.out.println(preDecrement);

		// exponents
		int z = 10;
		double resultPow = Math.pow(z, 2);
		System.out.println(resultPow);

		// addition

		// short hand for sum = sum + i
		int sum = 0;

		for (int i = 0; i < 10; i++) {

			sum += i;
		}

		
		//subtraction 
		int difference = 0; 
		
		for ( int i = 0; i < 10; i++) {
			
			difference -= i;
		}
		
		//remainder
		//we have the modulo operator which gives us the remainder
		int myNumber = 10; 
		int myRemainder = (10 % 10);
		
		System.out.println(myRemainder);
		
		//can use to check if something is even or odd
		for ( int i = 0; i < 100; i++) {
			
			
		}
		
		
		
		
	}

}
