package chap02_1;

import java.util.Random;
import java.util.Scanner;

/*
 * - MaxOfArrayRand
 * - Ex_05: 난수 사용해 배열의 요소값 설정
 *   - nextInt(n)이 반환하는 것은 0부터 n-1까지의 난수
 *   - 의사 난수: 컴퓨터에서 생성하는 난수는 진짜 난수가 아님
 *     -
 */
public class Ex_05 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = stdIn.nextInt();

		int[] height = new int[num];

		System.out.println("키 값은 아래와 같습니다.");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "]: " + height[i]);
		}

		System.out.println("최대값은 " + maxOf(height) + "입니다.");
		stdIn.close();
	}

	// 배열 a의 최대값을 구하여 반환
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
}
