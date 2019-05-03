package operator.bitwise;

/*
 * - Bitwise OR
 *   Bitwise OR is a binary operator(operates on two operands).
 *   It's denoted by |.
 *   
 *   The | operator compares corresponding bits of two operands.
 *   If either of the bits is 1, it gives 1.
 *   If not, it gives 0.
 *   
 * - Example
 *   12 = 00001100 (In Binary)
 *   25 = 00011001 (In Binary)
 *        --------
 *        00011101 = 29 ( In decimal)
 * 
 */
public class BitwiseOR {
	public static void main(String[] args) {
		int number1 = 12;
		int number2 = 25;
		int result;

		result = number1 | number2;
		System.out.println(result);
	}
}
