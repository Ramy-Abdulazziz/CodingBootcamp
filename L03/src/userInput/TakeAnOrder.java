package userInput;

import java.util.Scanner;

public class TakeAnOrder {

	public static void main(String[] args) {
		// print out a menu
		// take someones order
		// print out a recieipt

		String restName = "My Restaurant";
		String address = " 123 nowhere lane";
		String phoneNumber = "123 456 7890";
		String decoration = "-_--_-_--_-_--_-_-_-_--_-_--_-_--_-_--_-_--_-_--_";

		System.out.printf("%30s\n%32s\n%30s\n", restName, address, phoneNumber);
		System.out.println(decoration);

		String itemOne = "Hamburger";
		String itemTwo = "Pizza";
		String itemThree = "HotDog";

		// array holds more than one item of teh same data type
		// arrays are 0 indexed
		// first item is at 0
		// second item is at 1
		// etc..
//		String [] items = new String [3];
//	
//		items[0] = itemOne;
//		items[1] = itemTwo;
//		items[2] = itemThree;
//		

		String[] items = { itemOne, itemTwo, itemThree };
		Double[] prices = new Double[3];

		for (int j = 0; j < prices.length; j++) {

			prices[j] = Math.random() * 100;

		}

		for (int i = 0; i < 3; i++) {

			System.out.printf("%-18d%-18s%10.2f\n", (i + 1), items[i], prices[i]);
		}

		System.out.println(decoration);

		// take user input
		Scanner takeOrder = new Scanner(System.in);

		int itemNumber = 0;
		int wouldLikeMore = 0; 
		boolean isOrdering = true;

		while (isOrdering)  {
			System.out.println("What would you like?");
			takeOrder = new Scanner(System.in);
			itemNumber = takeOrder.nextInt();
			
			if ( itemNumber < 1 || itemNumber > 3) {
				
				System.out.println("you fucked up");
				itemNumber = takeOrder.nextInt();
			}
			System.out.println("Would you like something else enter 1 for yes and enter 2 for no");
			wouldLikeMore = takeOrder.nextInt();
			
			if ( wouldLikeMore == 1) {
				
				isOrdering = true;
				
			}
			else if ( wouldLikeMore == 2) {
				
				isOrdering = false;
			}
		}
	}

}
