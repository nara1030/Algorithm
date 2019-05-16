package chap02_1;

import java.util.Scanner;

/*
 * - MaxOfArray
 *   - �迭 ����� �ִ밪 ��Ÿ��(���� �Է¹���)
 * - Ex_04
 *   - ��ó�� �迭�� ��Ҹ� �ϳ��� ���ʷ� ���캸�� ������ �˰��� ����
 *     ��ĵ(traverse)�̶�� ��
 *   - �޼����� �Ű������� �迭 ����ϱ�: maxOf(height)
 *     - �μ� height�� �迭 ��ü�� �����ϴ� �迭 ����
 *     - ȣ���� �޼��� maxOf������ �迭 ������ �Ű����� a�� ���޹��� ������ �ʱ�ȭ
 *       - �� �迭���� a�� �迭 height�� ��ü�� ����
 *     - ��, �޼��� maxOf ���� �迭 a�� ��ǻ� main �޼����� �迭 height��
 */
public class Ex_04 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("Ű�� �ִ밪�� ���մϴ�.");
		System.out.print("��� �� : ");
		int num = stdIn.nextInt(); // �迭�� ��Ҽ��� �Է¹���

		int[] height = new int[num]; // ��Ҽ��� num�� �迭�� ����

		for (int i = 0; i < num; i++) {
			System.out.print("height[" + i + "] : ");
			height[i] = stdIn.nextInt();
		}

		System.out.println("�ִ밪�� " + maxOf(height) + "�Դϴ�.");
		stdIn.close();
	}

	// �迭 a�� �ִ밪�� ���Ͽ� ��ȯ
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
