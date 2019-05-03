package operator.bitwise;

/*
 * - AND 연산자
 *   && 또는 &
 */
public class And {
	public static void main(String[] args) {
		System.out.println("1 & 1: " + (1 & 1));
		System.out.println("0 & 1: " + (0 & 1));
		System.out.println("1 & 0: " + (1 & 0));
		System.out.println("0 & 0: " + (0 & 0));
		
		System.out.println("===============");
		
		System.out.println("true & true: " + (true & true));
		System.out.println("true & false: " + (true & false));
		System.out.println("false & true: " + (false & true));
		System.out.println("false & false: " + (false & false));
	}
}
