package week_1;

import java.util.Comparator;

/*
 * - �Է� ����
 *   - ù ��: 7 5(�Ĺ��� �� ������ ��)
 *   - �ι�° ��: ACDBB
 *   - ����° ��: �Ĺ� ��ǥ
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

		// Ȯ�� ���� �߰�
		public E getNode() {
			return position;
		}

		// Ȯ�� ���� �߰�
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
		Node<E> pointer = head;
		head = selectedNode = new Node(obj, pointer);
	}

	/** ������ ��� ���� */
	public void addLast(E obj) {
		if (head == null) { // ����Ʈ�� ��������� �Ӹ��� ����
			addFirst(obj);
		} else {
			Node<E> pointer = head;
			while (pointer.next != null) { // while�� ���� ��, pointer�� ���� ��带 ����Ŵ
				pointer = pointer.next;
			}
			pointer.next = selectedNode = new Node(obj, null);
		}
	}

	// Ȯ�� ���� �߰�
	public Node<E> getHead() {
		return head;
	}

	/** ��� �˻�(��ȸ) */
	public E search(E obj, Comparator<? super E> c) {
		Node<E> pointer = head; // ���� ��ĵ ���� ���

		while (pointer != null) {
			if (c.compare(obj, pointer.position) == 0) { // �˻� ����
				selectedNode = pointer;
				return pointer.position;
			}
			pointer = pointer.next; // ���� ��带 ����
		}
		return null; // �˻� ����
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