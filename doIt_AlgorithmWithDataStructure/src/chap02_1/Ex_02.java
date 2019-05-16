package chap02_1;

/*
 * - IntArrayInit
 *   - 값을 대입하지 않은 지역 변수
 *     - 배열의 구성 요소와 클래스의 필드는 초기값으로 초기화되나,
 *       메서드 안에서 선언한 지역 변수는 초기값으로 초기화되지 않음
 *     - 자바에서는 초기화나 대입에 의해 값이 넣어져 있지 않은 변수로부터는 값을 꺼낼 수 없음
 */
public class Ex_02 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		// 좀 더 명시적인 방법
		// int[] a = new int[] { 1, 2, 3, 4, 5 };

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
