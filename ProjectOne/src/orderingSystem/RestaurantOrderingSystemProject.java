package orderingSystem;

import java.util.Random;
import java.util.Scanner;

public class RestaurantOrderingSystemProject {

	public static void main(String[] args) {
		
		letsOrder();
		
	}
	
	public static void letsOrder () {
		
		String[] itemArray = genItemArray(10);
		double[] priceArray = genPriceArray(10);
		int[] orderedItems;
		boolean isOrdering = true;

		while (isOrdering) {
			genHeader("My Restaurant", "123 nowhere lane", "123 456 7890");
			genMenu(itemArray, priceArray);
			orderedItems = takeOrder(itemArray, priceArray, 10);
			genHeader("My Restaurant", "123 nowhere lane", "123 456 7890");
			genReceipt(orderedItems, itemArray, priceArray);
			isOrdering = askAnotherOrder();

		}
	}

	public static void genHeader(String restName, String address, String phone) {
		String decoration = "-_-_--_-_--_-_--_-_--_-_--_-_--_-_--_-_--_-_--_-_-_-_--_-_--_-_--_-_--_-_--_-_--";
		System.out.printf("%35s\n%37s\n%35s\n", restName, address, phone);
		System.out.println(decoration);

	}

	public static void genMenu(String[] itemArray, double[] priceArray) {
		String decoration = "-_-_--_-_--_-_--_-_--_-_--_-_--_-_--_-_--_-_--_-_-_-_--_-_--_-_--_-_--_-_--_-_--";

		for (int i = 0; i < itemArray.length; i++) {

			System.out.printf("%-15d%-25s%.2f\n", (i + 1), itemArray[i], priceArray[i]);

		}

		System.out.println(decoration);
	}

	public static String[] genItemArray(int length) {
		String[] items = new String[length];

		for (int i = 0; i < items.length; i++) {

			items[i] = String.valueOf(genRandomChars());
		}

		return items;
	}

	public static char[] genRandomChars() {

		char[] randomChars = new char[genRandomInt(5, 10)];

		for (int i = 0; i < randomChars.length; i++) {

			randomChars[i] = (char) genRandomInt(65, 90);

		}
		return randomChars;

	}

	private static int genRandomInt(int min, int max) {

		int randomNumber;
		Random random = new Random();

		randomNumber = min + random.nextInt(max - min + 1);

		return randomNumber;
	}

	public static double genRandomDouble(double min, double max) {
		double randomDouble;
		Random random = new Random();

		randomDouble = min + random.nextDouble() * (max - min + 1);

		return randomDouble;

	}

	public static double[] genPriceArray(int length) {
		double[] prices = new double[length];

		for (int i = 0; i < prices.length; i++) {

			prices[i] = genRandomDouble(10, 100);
		}

		return prices;

	}

	public static int[] takeOrder(String[] itemArray, double[] priceArray, int maxOrderSize) {
		int[] orderedItems = new int[maxOrderSize * 2];
		int itemNumber = 0;
		int itemQuant = 0;
		int itemCount = 0;
		int index = 0;
		Scanner scanner = new Scanner(System.in);

		while (itemCount != (maxOrderSize)) {
			System.out.println("You may add " + (maxOrderSize - itemCount) + " items to your order");
			System.out.println("What would you like to order");

			itemNumber = scanner.nextInt();

			while (itemNumber > itemArray.length || itemNumber < 1) {

				System.out.println("Thats not a valid item please try again");
				itemNumber = scanner.nextInt();

			}

			System.out.println("How many would you like? (Max 10)");
			itemQuant = scanner.nextInt();

			while (itemQuant > 10 || itemQuant < 1) {

				System.out.println("Please enter a valid quantity");
				itemQuant = scanner.nextInt();
			}
			
			orderedItems[index++] = itemNumber;
			orderedItems[index] = itemQuant;
			System.out.println("Would you like something else? 1) yes 2)no ");
			int yesNo = scanner.nextInt();

			if (yesNo == 1) {
				index++;
				itemCount++;

			} else if (yesNo == 2) {

				break;
			}

		}

		if (itemCount == maxOrderSize) {
			System.out.println("Max order size Reached");
		}
		System.out.println("Generating Receipt");
		
		System.out.println(orderedItems.toString());
		return orderedItems;
	}

	private static void genReceipt(int[] orderedItems, String[] itemArray, double[] priceArray) {

		String decoration = "-_-_--_-_--_-_--_-_--_-_--_-_--_-_--_-_--_-_--_-_-_-_--_-_--_-_--_-_--_-_--_-_--";
		System.out.println();
		System.out.printf("%-20s%-20s%-20s%s\n", "Item Number", "Item Name", "Quantity", "Price");
		System.out.println(decoration);

		double price;
		double subTotal = 0;
		double total = 0;

		final double TAX = 0.08;

		for (int i = 0; i < orderedItems.length; i++) {

			if (orderedItems[i] != 0) {

				price = (priceArray[(orderedItems[i]) - 1] * orderedItems[i + 1]);
				subTotal += price;
				System.out.printf("%-20d%-23s%-17d$%.2f\n", orderedItems[i++], itemArray[orderedItems[i - 1] - 1],
						orderedItems[i], price);
			}

		}

		System.out.println(decoration);
		total = subTotal + (subTotal * TAX);
		System.out.printf("%-60s$%.2f\n%-61s$%.2f\n%-60s$%.2f\n", "SUBTOTAL", subTotal, "TAX", (subTotal * TAX),
				"TOTAL", total);
		System.out.println(decoration);

	}

	public static boolean askAnotherOrder() {

		Scanner scanner = new Scanner(System.in);
		int yesNo;
		System.out.println();
		System.out.println("Would someone else like to order 1) yes 2) no");
		yesNo = scanner.nextInt();
		if (yesNo == 1) {

			return true;

		} else {
			System.out.println("Have A Nice Day");
			return false;
		}
	}
	

}
