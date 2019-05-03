package operator.bitwise;

/*
 * - Signed Left Shift
 *   The left shift operator << shifts a bit pattern to the left by certain number of specified bits,
 *   and zero bits are shifted into the low-order positions.
 *   
 * - Example
 *   212 (In binary: 11010100)
 *   
 *   212 << 1        --------
 *                  110101000 = 424 (In decimal) 
 */
public class LeftShift {
	public static void main(String[] args) {
		int number = 212;

		System.out.println(number << 1);
		System.out.println(number << 0);
		System.out.println(number << 4);
	}
}
