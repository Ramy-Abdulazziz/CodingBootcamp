package loops;

public class ControlStatements {

	public static void main(String[] args) {

		// for loop
		// <= inclusive , < exclusive
		// we use this when we know how many times we want to go through our loop
////		for (int i = 0; i < 100; i++) {
//
//			System.out.println(i);
//
//		}

		// while loop
		// when dont know how many times we want to go through our loop
		for (int j = 0; j < 100; j++) {

			while ((j / 10) == 1) {

				System.out.println(j);
				System.out.println(j / 10);
				j++;

			}

		}
		int x = 0;

		// will perform the check after it does the statement
		do {

			x = x + 2;
			System.out.println(x);
		} while (x < 10);

		// if statement
		// conditional statement
		for (int i = 0; i < 1000; i++) {

			// checks if number is even
			if (i % 2 == 0) {

				// prints out if even
				System.out.println(i);
			} else if ((i % 3) == 0) {

				System.out.println(i);
			} else {

				System.out.println("number is not divisible by 2 or 3");
			}

		}

		// switch
		int dayOfWeek = 9;
		String day;

		switch (dayOfWeek) {

		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wedneday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		default:
			day = "dickBalls";
			break;

		}

		System.out.println(day);

		int sum = 10;
		int count = 1;

		switch (count) {

		case 1:
			sum += 10;
		case 2:
			sum += 20;
		case 3:
			sum += 30;

		}
		System.out.println(sum);
	}
}