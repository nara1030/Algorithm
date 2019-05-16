package chap02_1;

import java.util.Scanner;

/*
 * - MaxOfArray
 *   - 배열 요소의 최대값 나타냄(값을 입력받음)
 * - Ex_04
 *   - 이처럼 배열의 요소를 하나씩 차례로 살펴보는 과정을 알고리즘 용어로
 *     스캔(traverse)이라고 함
 *   - 메서드의 매개변수로 배열 사용하기: maxOf(height)
 *     - 인수 height는 배열 본체를 참조하는 배열 변수
 *     - 호출한 메서드 maxOf에서는 배열 변수인 매개변수 a가 전달받은 참조로 초기화
 *       - 즉 배열변수 a는 배열 height의 본체를 참조
 *     - 즉, 메서드 maxOf 안의 배열 a는 사실상 main 메서드의 배열 height임
 */
public class Ex_04 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("키의 최대값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = stdIn.nextInt(); // 배열의 요소수를 입력받음

		int[] height = new int[num]; // 요소수가 num인 배열을 생성

		for (int i = 0; i < num; i++) {
			System.out.print("height[" + i + "] : ");
			height[i] = stdIn.nextInt();
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
