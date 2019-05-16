package chap02_1;

import java.util.Scanner;

/*
 * - ArrayEqual
 *   - 두 배열의 비교: 하나의 배열이 아닌 여러 배열을 처리하는 알고리즘
 *     - 두 배열이 같은가를 판단 
 * - Ex_07
 *   - if-else문을 if문 여러 개로 대체하는 방법: return 사용
 */
public class Ex_07 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("배열  a의 요소수: ");
		int na = stdIn.nextInt(); // 배열 a의 요소수

		int[] a = new int[na]; // 요소수가 na인 배열

		for (int i = 0; i < na; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = stdIn.nextInt();
		}

		System.out.print("배열  b의 요소수: ");
		int nb = stdIn.nextInt(); // 배열 b의 요소수

		int[] b = new int[nb]; // 요소수가 nb인 배열

		for (int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "]: ");
			b[i] = stdIn.nextInt();
		}

		System.out.println("배열 a와 b는 " + (equals(a, b) ? "같습니다." : "같지 않습니다."));

		stdIn.close();
	}

	// 두 배열 a, b의 모든 요소가 같은가?
	static boolean equals(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
}
