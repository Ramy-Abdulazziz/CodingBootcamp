package userInput;

import java.util.Scanner;

public class TakeAnOrrder {

	public static void main(String[] args) {

		String restName = "My Restaurant";
		String address = " 123 nowhere lane";
		String phoneNumber = "123 456 7890";
		String decoration = "-_--_-_--_-_--_-_-_-_--_-_--_-_--_-_--_-_--_-_--_";

		System.out.printf("%30s\n%32s\n%30s\n", restName, address, phoneNumber);
		System.out.println(decoration);

		String itemOne = "Hamburger";
		String itemTwo = "Pizza";
		String itemThree = "HotDog";

		String[] items = { itemOne, itemTwo, itemThree };
		Double[] prices = new Double[3];

		for (int j = 0; j < prices.length; j++) {

			prices[j] = Math.random() * 100;

		}

		for (int i = 0; i < 3; i++) {

			System.out.printf("%-18d%-18s%10.2f\n", (i + 1), items[i], prices[i]);
		}

		System.out.println(decoration);

		Scanner takeOrder = new Scanner(System.in);

		int itemNumber = 0;
		int wouldLikeMore = 0;
		boolean isOrdering = true;
		
		
		// you need to store what they order in a new array
		//create an integer array 
		//int orderedItems = new int [500] (give a large size so you wont run out of room)
		//create  another int variable to index the array
		//increment the index by one everytime someone ordered
		//create the recept by referencing the ordered item array with the two others you created
		while (isOrdering) {

			System.out.println("What would you like?");
			itemNumber = takeOrder.nextInt();

			while (itemNumber > 4 || itemNumber < 1) {

				System.out.println("Please enter a valid item");
				itemNumber = takeOrder.nextInt();
				
			}

			System.out.println("Would you like something else 1) Yes 2)No");
			wouldLikeMore = takeOrder.nextInt();

			if (wouldLikeMore == 1) {

				isOrdering = true;
			} else if (wouldLikeMore == 2) {

				isOrdering = false;
			}
		
		}
		
		
		
		
	}

}
