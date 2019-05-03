package operator.bitwise;

/*
 * - Bitwise AND
 *   Bitwise AND is a binary operator(operates on two operands).
 *   It's denoted by &.
 *   
 *   The & operator compares corresponding bits of two operands.
 *   If both bits are 1, it gives 1.
 *   If either of the bits is not 1, it gives 0.
 * 
 * - Example
 *   12 = 00001100 (In Binary)
 *   25 = 00011001 (In Binary)
 *        --------
 *        00001000 = 8 (In decimal)
 *   
 */
public class BitwiseAND {
	public static void main(String[] args) {
		int number1 = 12;
		int number2 = 25;
		int result;

		result = number1 & number2;
		System.out.println(result);
	}
}
