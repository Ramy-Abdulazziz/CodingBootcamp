package iteration1;

public class RamyLikesToMakeUsSuffer {

	public static void main(String[] args) {

		int myNumber = 1;
		int x = 0;
		int resultFun = (x = 3 * (myNumber + 7));
		do {
			System.out.println(resultFun);

		} while (myNumber < 500);
		++myNumber;
	}

}
