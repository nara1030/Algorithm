package chap02_1;

/*
 * - IntArray
 *   - ���� ����� �ڷ����� int���� �迭(���� ��Ҽ��� 5: new�� ���� ��ü�� ����)
 *   - �迭�� ���� ��Ҵ� �ڵ����� 0���� �ʱ�ȭ
 */
public class Ex_01 {
	public static void main(String[] args) {
		int[] a = new int[5]; // �迭�� ����

		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2;

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
