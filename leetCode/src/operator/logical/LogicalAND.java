package operator.logical;

/* 
 * - Logical AND Operator
 *   The result will be a boolean type.
 *   This operator is represented by the symbol "&&".
 * 
 *   1. "true" only if both operand1 and operand2 are "true"
 *   2. "false" if any of the operands(operand1 or operand2) is "false"
 *       or both the operands (operand1 or operand2) are "false"
 */
public class LogicalAND {
	public static void main(String[] args) {
		int value1 = 10;
		int value2 = 20;
		int value3 = 30;

		boolean result1 = value2 > value1 && value2 < value3;
		boolean result2 = value2 < value1 && value2 < value3;
		boolean result3 = value2 > value1 && value2 > value3;
		boolean result4 = value2 < value1 && value2 > value3;

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}
