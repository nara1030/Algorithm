package chap02_1;

import java.util.Scanner;

/*
 * - ReverseArray
 *   - 배열 요소의 값을 읽어들여 역순으로 정렬
 *   - 배열 안의 두 요소를 교환하는 것은 자주 사용하므로 독립적인 메서드로 구현
 * - Ex_06
 *   - 작은 모집단을 사용 과정 생각
 *     - for(i=0; i<n/2; i++)
 *         // a[i]와 a[n-i-1]의 값을 교환
 *   - 교환 횟수 = 요소 개수 / 2
 *     - '정수/정수' 연산: 나머지 버리기에 좋음
 *     - 7/2 -> 3
 *   - 인덱스
 *     - 좌측 요소: i
 *     - 우측 요소: n-1-i
 *   - 매개변수
 *     - main 메서드에서 생성한 배열에 대한 참조 x를 reverse에 전달
 *     - 호출된 reverse는 매개변수 a로 전달받은 참조를 그대로 swap에 전달
 *     - 따라서 메서드 reverse의 매개변수 a와 swap의 매개변수 a는 둘 다
 *       main 메서드에서 x로 생성한 배열 본체를 참조
 */
public class Ex_06 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요소수 : ");
		int num = stdIn.nextInt(); // 요소수

		int[] x = new int[num]; // 요소수가 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		reverse(x); // 배열 a 의 요소를 역순으로 정렬

		System.out.println("요소를 역순으로 정렬했습니다.");
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
		stdIn.close();
	}

	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}
}
