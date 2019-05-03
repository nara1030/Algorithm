package operator.bitwise;

/*
 * - Unsigned Right Shift
 *   The unsigned right shift operator >>> shifts zero into the leftmost position.
 */
public class UnsignedRightShift {
	public static void main(String[] args) {
		int number1 = 5;
		int number2 = -5;

		// Signed right shift
		System.out.println(number1 >> 1);
		// Unsigned right shift
		System.out.println(number1 >>> 1);
		// Signed right shift
		System.out.println(number2 >> 1);
		// Unsigned right shift
		System.out.println(number2 >>> 1);
	}
}
