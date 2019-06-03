package week_1;

/*
 * - �Է� ����
 *   - ù ��: 7 5(�Ĺ��� �� ������ ��)
 *   - �ι�° ��: ACDBB
 *   - ����° ��: �Ĺ� ��ǥ
 * 
 * - ����
 *   - �ܰ躰 ����(TDD)
 *     - �Է°� ���� ���� �ϵ� �ڵ����� Ȯ��
 *   - ��Ÿ
 *     - ���� ��� ������ setNode�� �������ִ���, �����ڷ� ���ִ���
 *     - ���� Ŭ���� static ����
 *       - ���� ����(static) vs. ��ũ�� ����Ʈ(non-static)
 * 
 * - �ڵ� ����
 *   A. �Է¹��� �Ĺ� ��ǥ�� �ܹ��� ���� ��� ����
 *     - ��ǥ�� ��� ����
 *       - setNode �޼ҵ�(addLast) ����
 *     - �˻� ����
 *       - Comparator
 *     - ���� ����
 *   B. �׽�Ʈ
 *     - ��� ������ ���� Ŭ������ �������� ����
 */

public class B_2983 {
	public static void main(String[] args) {
		/** �׽�Ʈ */
		LinkedList<Plant> linkedList = new LinkedList<>();
		linkedList.addLast(new Plant(5, 6));
		linkedList.addLast(new Plant(8, 9));

		/** ���̽� */
		System.out.println("ù��° ���: " + linkedList.getHead().getNode().getXY());
		System.out.println("�ι�° ���: " + linkedList.getHead().getNextNode().getNode().getXY());
	}
}

/** ��ũ�帮��Ʈ: ��ȸ */
class LinkedList<E> {
	/** ���: �Ĺ� */
	class Node<E> {
		private E position; // �Ĺ� ��ġ(x, y)
		private Node<E> next; // ���� ��� ����

		// ������
		Node(E position, Node<E> next) {
			this.position = position;
			this.next = next;
		}

		/** Ȯ�� ���� �߰� */
		public E getNode() {
			return position;
		}

		/** Ȯ�� ���� �߰� */
		public Node<E> getNextNode() {
			return next;
		}
	}

	private Node<E> head; // �Ӹ� ���
	private Node<E> selectedNode; // ���� ���

	// ������
	public LinkedList() {
		head = selectedNode = null;
	}

	// ����: ���� �� �Ӹ�, ������ ����
	/** �Ӹ��� ��� ���� */
	public void addFirst(E obj) {
		Node<E> ptr = head;
		head = selectedNode = new Node(obj, ptr);
	}

	/** ������ ��� ���� */
	public void addLast(E obj) {
		if (head == null) { // ����Ʈ�� ��������� �Ӹ��� ����
			addFirst(obj);
		} else {
			Node<E> ptr = head;
			while (ptr.next != null) { // while�� ���� ��, ptr�� ���� ��带 ����Ŵ
				ptr = ptr.next;
			}
			ptr.next = selectedNode = new Node(obj, null);
		}
	}

	/** Ȯ�� ���� �߰� */
	public Node<E> getHead() {
		return head;
	}
}

class Plant {
	private int x;
	private int y;

	// ������
	public Plant(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/** Ȯ�� ���� �߰� */
	public String getXY() {
		return x + ", " + y;
	}
}