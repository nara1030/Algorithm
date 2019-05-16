package chap02_1;

import java.util.Scanner;

/*
 * - ReverseArray
 *   - �迭 ����� ���� �о�鿩 �������� ����
 *   - �迭 ���� �� ��Ҹ� ��ȯ�ϴ� ���� ���� ����ϹǷ� �������� �޼���� ����
 * - Ex_06
 *   - ���� �������� ��� ���� ����
 *     - for(i=0; i<n/2; i++)
 *         // a[i]�� a[n-i-1]�� ���� ��ȯ
 *   - ��ȯ Ƚ�� = ��� ���� / 2
 *     - '����/����' ����: ������ �����⿡ ����
 *     - 7/2 -> 3
 *   - �ε���
 *     - ���� ���: i
 *     - ���� ���: n-1-i
 *   - �Ű�����
 *     - main �޼��忡�� ������ �迭�� ���� ���� x�� reverse�� ����
 *     - ȣ��� reverse�� �Ű����� a�� ���޹��� ������ �״�� swap�� ����
 *     - ���� �޼��� reverse�� �Ű����� a�� swap�� �Ű����� a�� �� ��
 *       main �޼��忡�� x�� ������ �迭 ��ü�� ����
 */
public class Ex_06 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("��Ҽ� : ");
		int num = stdIn.nextInt(); // ��Ҽ�

		int[] x = new int[num]; // ��Ҽ��� num�� �迭

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		reverse(x); // �迭 a �� ��Ҹ� �������� ����

		System.out.println("��Ҹ� �������� �����߽��ϴ�.");
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
		stdIn.close();
	}

	// �迭 ��� a[idx1]�� a[idx2]�� ���� �ٲ�
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// �迭 a�� ��Ҹ� �������� ����
	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}
}
