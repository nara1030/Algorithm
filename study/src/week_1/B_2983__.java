package week_1;

import java.util.ArrayList;

/*
 * - 문제
 *   - https://www.acmicpc.net/problem/2983
 * - 의문
 *   - 제네릭을 활용할 순 없을까(확장성)
 */
public class B_2983__ {
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

		/** 순회 */
		while (linkedList.current != null) {
			linkedList.print();
			linkedList.current = linkedList.current.next;
		}

		/** 방향 */
		System.out.println(linkedList.jump_and_remove("A").get(0).data.toString());
		System.out.println(linkedList.jump_and_remove("A").get(1).data.toString());

	}
}

class LinkedList<Plant> {
	class Node<Plant> {
		Plant data;
		Node<Plant> next;

		Node(Plant data) {
			this.data = data;
		}
	}

	Node<Plant> first;
	Node<Plant> last;
	Node<Plant> current;

	void add(Plant data) {
		Node<Plant> newNode = new Node<>(data);
		if (last != null) {
			last.next = newNode;
		}
		last = newNode;
		if (first == null) {
			current = first = last;
		}
	}

	/** 점프 및 이전 노드 제거 */
	ArrayList<Node> jump_and_remove(String direction) {
		ArrayList<Node> returnList = new ArrayList<>();
		Node<Plant> cursor = first;
		while (cursor != null) {
			if (direction.equals(((week_1.Plant) current.data).getDirection((week_1.Plant) cursor.data))) {
				returnList.add(cursor);
				cursor = cursor.next;
			}
		}
		return returnList;
	}

	/** 로그 */
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

	/** 방향 선별 */
	String getDirection(Plant toPosition) {
		int deltaX = (toPosition.x - x);
		int deltaY = (toPosition.y - y);

		if (deltaX > 0 && deltaY > 0) {
			return "A";
		} else if (deltaX > 0 && deltaY < 0) {
			return "B";
		} else if (deltaX < 0 && deltaY > 0) {
			return "C";
		} else if (deltaX < 0 && deltaY < 0) {
			return "D";
		} else { // 위 경우 외엔 이동 X
			return "N";
		}
	}

	/** 거리 판단 */
	int getDistance(Plant toPosition) {
		int squareX = (toPosition.x - x) * (toPosition.x - x);
		int squareY = (toPosition.y - y) * (toPosition.y - y);
		return (squareX + squareY);
	}

	@Override
	public String toString() {
		return "x: " + x + ", y: " + y;
	}
}
