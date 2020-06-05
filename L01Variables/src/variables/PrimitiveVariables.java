package variables;

public class PrimitiveVariables {

	public static void main(String[] args) {

		// 8 primitive variables

		int x;
		System.out.println(Integer.MAX_VALUE + " -- " + Integer.MIN_VALUE);
		x = 10;

		System.out.println(x);
		System.out.println(x + 1);

		System.out.println(Integer.SIZE);
		double y = 3.5;

		System.out.println(Double.MAX_VALUE + " -- " + Double.MIN_VALUE);
		System.out.println(Double.SIZE);
		float f = 4.5f;

		System.out.println(Float.MAX_VALUE + " -- " + Float.MIN_VALUE);
		System.out.println(Float.SIZE);

		long l = 1234l;
		System.out.println(Long.MAX_VALUE + " -- " + Long.MIN_VALUE);
		System.out.println(Long.SIZE);

		char ch = 'A';
		char a = 65;

		boolean bool = true;
		boolean bool2 = false;

		boolean isOrdering = true;

		short isShort = 2;

		System.out.println(Short.MAX_VALUE + " -- " + Short.MIN_VALUE);
		System.out.println(Short.SIZE);

		byte b;
		b = 127;
		byte bb = -128;

		System.out.println();

		System.out.println(x * y);
		System.out.println((int) (x * y));
		System.out.println((int) y);

		
	}

}
