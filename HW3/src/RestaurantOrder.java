import java.util.Scanner;

public class RestaurantOrder {

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
		
		int quantity = 0;
		int index = 0;

		int[] orderedItems = new int[100];

		while (isOrdering) {

			System.out.println("What would you like?");
			itemNumber = takeOrder.nextInt();
			System.out.println("How many would you like?");
			quantity = takeOrder.nextInt();

			while (itemNumber > 3 || itemNumber < 1) {

				System.out.println("Please enter a valid item");
				itemNumber = takeOrder.nextInt();

			}
			
			orderedItems[index++] = itemNumber;
			orderedItems[index] = quantity;

			System.out.println("Would you like something else 1) Yes 2)No");
			wouldLikeMore = takeOrder.nextInt();

			if (wouldLikeMore == 1) {
				index++;
				isOrdering = true;
			} else if (wouldLikeMore == 2) {
				
				takeOrder.close();
				isOrdering = false;
				System.out.printf("%30s\n%32s\n%30s\n", restName, address, phoneNumber);
				System.out.println(decoration);

				System.out.printf("%-20s%-20s%s\n", "Item Number", "Quantity", "Price");
				System.out.println(decoration);

				double price;
				double subTotal = 0; 
				double total = 0; 
				
				//will prevent value from ever being changed
				final double TAX = 0.08;
				
				for (int i = 0; i < orderedItems.length; i++) {

					if (orderedItems[i] != 0) {

						price = (prices[(orderedItems[i]) - 1] * orderedItems[i + 1]);
						subTotal += price;
						System.out.printf("%-20d%-20d%.2f\n", orderedItems[i++], orderedItems[i], price);
					}

				}
			
				System.out.println(decoration);
				total = subTotal + (subTotal * TAX);
				System.out.printf("%s%41.2f\n%s%46.2f\n%s%44.2f", "SUBTOTAL", subTotal,"TAX", (subTotal * TAX), "TOTAL", total);
				
			}
		}
	}

}
