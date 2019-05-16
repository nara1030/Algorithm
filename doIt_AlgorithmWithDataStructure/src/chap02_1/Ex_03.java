package chap02_1;

/*
 * - CloneArray
 *   - 배열 이름.clone()
 *   - 배열의 복제는 위처럼 clone 메서드를 호출하여 만들 수 있음
 * - Ex_03
 *   - 배열 변수 b의 참조가 배열 a의 본체가 아니라 그 복제임을 확인할 수 있음
 */
public class Ex_03 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = a.clone(); // b는 a의 복제를 참조

		b[3] = 0; // 한 요소에만 0을 대입

		System.out.print("a =");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}

		System.out.print("\nb =");
		for (int i = 0; i < b.length; i++) {
			System.out.print(" " + b[i]);
		}
	}
}
