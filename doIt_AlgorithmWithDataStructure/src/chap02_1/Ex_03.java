package chap02_1;

/*
 * - CloneArray
 *   - �迭 �̸�.clone()
 *   - �迭�� ������ ��ó�� clone �޼��带 ȣ���Ͽ� ���� �� ����
 * - Ex_03
 *   - �迭 ���� b�� ������ �迭 a�� ��ü�� �ƴ϶� �� �������� Ȯ���� �� ����
 */
public class Ex_03 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = a.clone(); // b�� a�� ������ ����

		b[3] = 0; // �� ��ҿ��� 0�� ����

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
