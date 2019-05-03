package operator.bitwise;

/*
 * - Signed Right Shift
 *   The right shift operator >> shifts a bit pattern to the right 
 *   by certain number of specified bits.
 * 
 * - Example
 *   212 (In binary: 11010100)
 *   212 >> 1        --------
 *                   01101010 = 106 (In decimal)
 */
public class RightShift {
	public static void main(String[] args) {
		int number = 212;

		System.out.println(number >> 1);
		System.out.println(number >> 0);
		System.out.println(number >> 8);
	}
}
