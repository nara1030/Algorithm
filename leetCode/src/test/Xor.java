package test;

/*
 * - 자바 XOR 연산자 ^
 *   비트 연산자(배타적 논리합)
 * 
 * - 출처
 *   https://zetawiki.com/wiki/%EC%9E%90%EB%B0%94_XOR_%EC%97%B0%EC%82%B0%EC%9E%90_%5E
 */
public class Xor {
	public static void main(String[] args) {
		System.out.println("true: " + true);
		System.out.println("false: " + false);
		System.out.println("1: " + 1);
		System.out.println("0: " + 0);

		System.out.println("=========");

		System.out.println("true ^ true: " + (true ^ true));
		System.out.println("true ^ false: " + (true ^ false));
		System.out.println("false ^ true: " + (false ^ true));
		System.out.println("false ^ false: " + (false ^ false));

		System.out.println("==========");

		System.out.println("1 ^ 1: " + (1 ^ 1));
		System.out.println("1 ^ 0: " + (1 ^ 0));
		System.out.println("0 ^ 1: " + (0 ^ 1));
		System.out.println("0 ^ 0: " + (0 ^ 0));

		System.out.println("==========");

		// 101 ^ 110 -> 011
		System.out.println("5 ^ 6: " + (5 ^ 6));
	}
}
