package operator.bitwise;

/*
 * - Bitwise XOR
 *   Bitwise XOR is a binary operator(operates on two operands).
 *   It's denoted by ^.
 *   
 *   The ^ operator compares corresponding bits of two operands.
 *   If corresponding bits are different, it gives 1.
 *   If corresponding bits are same, it gives 0.
 * 
 * - Example
 *   12 = 00001100 (In Binary)
 *   25 = 00011001 (In Binary)
 *        --------
 *        00010101 = 21 (In decimal)
 */
public class BitwiseXOR {
	public static void main(String[] args) {
		int number1 = 12;
		int number2 = 25;
		int result;

		result = number1 ^ number2;
		System.out.println(result);
	}
}
