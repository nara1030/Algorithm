package week_1;

import java.util.Comparator;

/*
 * - �Է� ����
 *   - ù ��: 7 5(�Ĺ��� �� ������ ��)
 *   - �ι�° ��: ACDBB
 *   - ����° ��: �Ĺ� ��ǥ
 *   
 * - ��� ����
 *   - �Ĺ� ��, ���� ��: int
 *   - �Ĺ� ��ǥ: int
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

	/** ���� �Ǵ� */
	public String getDirection(Plant fromPosition, Plant toPosition) {
		int fromX = fromPosition.x;
		int fromY = fromPosition.y;
		int toX = toPosition.x;
		int toY = toPosition.y;
		int diffX = toX - fromX;
		int diffY = toY - fromY;

		if (diffX > 0 && diffY > 0) {
			return "A";
		} else if (diffX > 0 && diffY < 0) {
			return "B";
		} else if (diffX < 0 && diffY > 0) {
			return "C";
		} else if (diffX < 0 && diffY < 0) {
			return "D";
		} else {
			return "N";
		}
	}

	/** �Ÿ� �Ǵ� */
	public int getDistance(Plant fromPosition, Plant toPosition) {
		int squareX = (toPosition.x - fromPosition.x) * (toPosition.x - fromPosition.x);
		int squareY = (toPosition.y - fromPosition.y) * (toPosition.y - fromPosition.y);
		return (squareX + squareY);
	}
}