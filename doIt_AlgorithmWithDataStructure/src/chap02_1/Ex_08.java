package chap02_1;

/*
 * - CardConvRev
 *   - �Է¹��� 10������ 2���� ~ 36������ ��� ��ȯ�Ͽ� ��Ÿ��
 */
public class Ex_08 {
	// ������ x�� r������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ����� �־��ְ� �ڸ��� ��ȯ
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0; // ��ȯ ���� �ڸ���
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r); // r�� ���� �������� ����
			x /= r;
		} while (x != 0);
		return digits;
	}
}
