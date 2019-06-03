package week_1;

import java.util.Comparator;

/*
 * - 입력 참고
 *   - 첫 줄: 7 5(식물의 수 점프의 수)
 *   - 두번째 줄: ACDBB
 *   - 세번째 줄: 식물 좌표
 *   
 * - 고려 사항
 *   - 식물 수, 점프 수: int
 *   - 식물 좌표: int
 */

public class B_2983 {
	public static void main(String[] args) {
		/** 테스트 */
		LinkedList<Plant> linkedList = new LinkedList<>();
		linkedList.addLast(new Plant(5, 6));
		linkedList.addLast(new Plant(8, 9));

		/** 케이스 */
		System.out.println("첫번째 노드: " + linkedList.getHead().getNode().getXY());
		System.out.println("두번째 노드: " + linkedList.getHead().getNextNode().getNode().getXY());
	}
}

/** 링크드리스트: 순회 */
class LinkedList<E> {
	/** 노드: 식물 */
	class Node<E> {
		private E position; // 식물 위치(x, y)
		private Node<E> next; // 다음 노드 참조

		// 생성자
		Node(E position, Node<E> next) {
			this.position = position;
			this.next = next;
		}

		// 확인 위해 추가
		public E getNode() {
			return position;
		}

		// 확인 위해 추가
		public Node<E> getNextNode() {
			return next;
		}
	}

	private Node<E> head; // 머리 노드
	private Node<E> selectedNode; // 선택 노드

	// 생성자
	public LinkedList() {
		head = selectedNode = null;
	}

	// 삽입: 없을 땐 머리, 있으면 꼬리
	/** 머리에 노드 삽입 */
	public void addFirst(E obj) {
		Node<E> pointer = head;
		head = selectedNode = new Node(obj, pointer);
	}

	/** 꼬리에 노드 삽입 */
	public void addLast(E obj) {
		if (head == null) { // 리스트가 비어있으면 머리에 삽입
			addFirst(obj);
		} else {
			Node<E> pointer = head;
			while (pointer.next != null) { // while문 종료 시, pointer은 꼬리 노드를 가리킴
				pointer = pointer.next;
			}
			pointer.next = selectedNode = new Node(obj, null);
		}
	}

	// 확인 위해 추가
	public Node<E> getHead() {
		return head;
	}

	/** 노드 검색(순회) */
	public E search(E obj, Comparator<? super E> c) {
		Node<E> pointer = head; // 현재 스캔 중인 노드

		while (pointer != null) {
			if (c.compare(obj, pointer.position) == 0) { // 검색 성공
				selectedNode = pointer;
				return pointer.position;
			}
			pointer = pointer.next; // 다음 노드를 선택
		}
		return null; // 검색 실패
	}
}

class Plant {
	private int x;
	private int y;

	// 생성자
	public Plant(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/** 확인 위해 추가 */
	public String getXY() {
		return x + ", " + y;
	}

	/** 방향 판단 */
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

	/** 거리 판단 */
	public int getDistance(Plant fromPosition, Plant toPosition) {
		int squareX = (toPosition.x - fromPosition.x) * (toPosition.x - fromPosition.x);
		int squareY = (toPosition.y - fromPosition.y) * (toPosition.y - fromPosition.y);
		return (squareX + squareY);
	}
}