package operator.bitwise;

/*
 * - Bitwise Complement
 *   Bitwise complement is an unary operator(works on only one operand).
 *   It is denoted by ~.
 *   
 *   The ~ operator inverts the bit pattern.
 *   It makes every 0 to 1, and every 1 to 0.
 * 
 * - Example
 *   35 = 00100011 (In Binary)
 *      ~
 *        --------
 *        11011100 = 220 (In decimal)
 * 
 * - Console result: -36
 *   Why are we getting output -36 instead of 220?
 *   
 *   It's because the compiler is showing 2's complement of that number(220).
 * 
 * - Summary
 *   The bitwise complement of 35 is 220 (in decimal).
 *   The 2's complement of 220 is -36.
 *   Hence, the output is -36 instead of 220.
 *   
 * - How to get 2's complement
 *   For any integer n, 2's complement of n will be -(n+1).
 *   
 */
public class BitwiseComplement {
	public static void main(String[] args) {
		int number1 = 35;
		int result;

		result = ~number1;
		System.out.println(result);

		// 2의 보수 구하기
		// -
	}
}
