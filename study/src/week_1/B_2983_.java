package week_1;

import java.util.ArrayList;

/*
 * - 문제
 *   - https://www.acmicpc.net/problem/2983
 * - 구현
 *   1. 입력 좌표로 연결 리스트 생성
 *     - while문 검증
 *   2. 순회 메소드 구현
 *   3. 조건에 맞게 노드 이동 및 전 노드 제거
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

		/** 순회 */
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

	/** 점프 및 이전 노드 제거 */
	ArrayList<E> jump_and_remove(String direction) {
		ArrayList<E> returnList = new ArrayList<E>();
		cursor = first;
		while (cursor != null) {
			if (direction.equals(cursor.data.getD)) {

			}
		}
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

	/**
	 * 방향 선별
	 * 
	 * @return: One or List
	 * @param: from 필요 여부
	 * @etc: Plant 멤버이면 제네릭 활용 힘듦
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
		} else { // 위 경우 외엔 이동 X
			return "N";
		}
	}

	/** 거리 판단 */
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
