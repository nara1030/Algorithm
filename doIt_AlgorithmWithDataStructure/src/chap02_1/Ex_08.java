package chap02_1;

/*
 * - CardConvRev
 *   - 입력받은 10진수를 2진수 ~ 36진수로 기수 변환하여 나타냄
 */
public class Ex_08 {
	// 정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어주고 자리수 반환
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0; // 변환 후의 자리수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장
			x /= r;
		} while (x != 0);
		return digits;
	}
}
