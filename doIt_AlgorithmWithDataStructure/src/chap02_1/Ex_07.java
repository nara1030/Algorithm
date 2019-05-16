package chap02_1;

import java.util.Scanner;

/*
 * - ArrayEqual
 *   - �� �迭�� ��: �ϳ��� �迭�� �ƴ� ���� �迭�� ó���ϴ� �˰���
 *     - �� �迭�� �������� �Ǵ� 
 * - Ex_07
 *   - if-else���� if�� ���� ���� ��ü�ϴ� ���: return ���
 */
public class Ex_07 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("�迭  a�� ��Ҽ�: ");
		int na = stdIn.nextInt(); // �迭 a�� ��Ҽ�

		int[] a = new int[na]; // ��Ҽ��� na�� �迭

		for (int i = 0; i < na; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = stdIn.nextInt();
		}

		System.out.print("�迭  b�� ��Ҽ�: ");
		int nb = stdIn.nextInt(); // �迭 b�� ��Ҽ�

		int[] b = new int[nb]; // ��Ҽ��� nb�� �迭

		for (int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "]: ");
			b[i] = stdIn.nextInt();
		}

		System.out.println("�迭 a�� b�� " + (equals(a, b) ? "�����ϴ�." : "���� �ʽ��ϴ�."));

		stdIn.close();
	}

	// �� �迭 a, b�� ��� ��Ұ� ������?
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
