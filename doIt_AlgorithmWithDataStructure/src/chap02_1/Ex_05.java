package chap02_1;

import java.util.Random;
import java.util.Scanner;

/*
 * - MaxOfArrayRand
 * - Ex_05: ���� ����� �迭�� ��Ұ� ����
 *   - nextInt(n)�� ��ȯ�ϴ� ���� 0���� n-1������ ����
 *   - �ǻ� ����: ��ǻ�Ϳ��� �����ϴ� ������ ��¥ ������ �ƴ�
 *     -
 */
public class Ex_05 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.println("Ű�� �ִ��� ���մϴ�.");
		System.out.print("��� �� : ");
		int num = stdIn.nextInt();

		int[] height = new int[num];

		System.out.println("Ű ���� �Ʒ��� �����ϴ�.");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "]: " + height[i]);
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
