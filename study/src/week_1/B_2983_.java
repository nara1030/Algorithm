package week_1;

import java.util.ArrayList;

/*
 * - ����
 *   - https://www.acmicpc.net/problem/2983
 * - ����
 *   1. �Է� ��ǥ�� ���� ����Ʈ ����
 *     - while�� ����
 *   2. ��ȸ �޼ҵ� ����
 *   3. ���ǿ� �°� ��� �̵� �� �� ��� ����
 */
public class B_2983_ {
	public static void main(String[] args) {
		String direction = "ACD";
		LinkedList<Plant> linkedList = new LinkedList<>();
		linkedList.add(new Plant(5, 6));
		linkedList.add(new Plant(8, 9));
		linkedList.add(new Plant(4, 13));
		linkedList.add(new Plant(1, 10));
		linkedList.add(new Plant(7, 4));
		linkedList.add(new Plant(10, 9));
		linkedList.add(new Plant(3, 7));

		/** ��ȸ */
		while (linkedList.current != null) {
			linkedList.print();
			linkedList.current = linkedList.current.next;
		}
	}
}

class LinkedList<E> {
	class Node<E> {
		E data;
		Node<E> next;

		Node(E data) {
			this.data = data;
		}
	}

	Node<E> first;
	Node<E> last;
	Node<E> current;
	Node<E> cursor;

	void add(E data) {
		Node<E> newNode = new Node<>(data);
		if (last != null) {
			last.next = newNode;
		}
		last = newNode;
		if (first == null) {
			current = first = last;
		}
	}

	/** ���� �� ���� ��� ���� */
	ArrayList<E> jump_and_remove(String direction) {
		ArrayList<E> returnList = new ArrayList<E>();
		cursor = first;
		while (cursor != null) {
			if (direction.equals(cursor.data.getD)) {

			}
		}
	}

	/** �α� */
	void print() {
		System.out.println(current.data.toString());
	}
}

class Plant {
	int x;
	int y;

	Plant(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * ���� ����
	 * 
	 * @return: One or List
	 * @param: from �ʿ� ����
	 * @etc: Plant ����̸� ���׸� Ȱ�� ����
	 */
	String getDirection(Plant fromPosition, Plant toPosition) {
		int deltaX = (toPosition.x - fromPosition.x);
		int deltaY = (toPosition.y - fromPosition.y);

		if (deltaX > 0 && deltaY > 0) {
			return "A";
		} else if (deltaX > 0 && deltaY < 0) {
			return "B";
		} else if (deltaX < 0 && deltaY > 0) {
			return "C";
		} else if (deltaX < 0 && deltaY < 0) {
			return "D";
		} else { // �� ��� �ܿ� �̵� X
			return "N";
		}
	}

	/** �Ÿ� �Ǵ� */
	public int getDistance(Plant fromPosition, Plant toPosition) {
		int squareX = (toPosition.x - fromPosition.x) * (toPosition.x - fromPosition.x);
		int squareY = (toPosition.y - fromPosition.y) * (toPosition.y - fromPosition.y);
		return (squareX + squareY);
	}

	@Override
	public String toString() {
		return "x: " + x + ", y: " + y;
	}
}
