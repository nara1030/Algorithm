package week_1;

/*
 * - 입력 참고
 *   - 첫 줄: 7 5(식물의 수 점프의 수)
 *   - 두번째 줄: ACDBB
 *   - 세번째 줄: 식물 좌표
 * 
 * - 토의
 *   - 단계별 개발(TDD)
 *     - 입력값 받지 말고 하드 코딩으로 확인
 *   - 기타
 *     - 다음 노드 참조를 setNode로 설정해주느냐, 생성자로 해주느냐
 *     - 내부 클래스 static 여부
 *       - 빌더 패턴(static) vs. 링크드 리스트(non-static)
 * 
 * - 코드 생성
 *   A. 입력받은 식물 좌표로 단방향 연결 노드 생성
 *     - 좌표로 노드 생성
 *       - setNode 메소드(addLast) 구현
 *     - 검색 구현
 *       - Comparator
 *     - 삭제 구현
 *   B. 테스트
 *     - 노드 생성시 내부 클래스에 접근하진 않음
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

		/** 확인 위해 추가 */
		public E getNode() {
			return position;
		}

		/** 확인 위해 추가 */
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
		Node<E> ptr = head;
		head = selectedNode = new Node(obj, ptr);
	}

	/** 꼬리에 노드 삽입 */
	public void addLast(E obj) {
		if (head == null) { // 리스트가 비어있으면 머리에 삽입
			addFirst(obj);
		} else {
			Node<E> ptr = head;
			while (ptr.next != null) { // while문 종료 시, ptr은 꼬리 노드를 가리킴
				ptr = ptr.next;
			}
			ptr.next = selectedNode = new Node(obj, null);
		}
	}

	/** 확인 위해 추가 */
	public Node<E> getHead() {
		return head;
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
}