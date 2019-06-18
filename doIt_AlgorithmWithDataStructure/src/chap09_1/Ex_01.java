package chap09_1;

import java.util.Comparator;

/*
 * - 연결 리스트 클래스(Ex_01<E>)
 *   : LinkedList<E>
 */
public class Ex_01<E> {
	class Node<E> {
		private E data;
		private Node<E> next;

		Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node<E> head; // 머리 노드
	private Node<E> crnt; // 선택 노드

	public Ex_01() {
		head = crnt = null;
	}

	/** 노드 검색 */
	public E search(E obj, Comparator<? super E> c) {
		Node<E> ptr = head; // 현재 스캔 중인 노드

		while (ptr != null) {
			if (c.compare(obj, ptr.data) == 0) {
				crnt = ptr;
				return ptr.data;
			}
			ptr = ptr.next;
		}
		return null; // 검색 실패
	}

	/**
	 * 머리에 노드 삽입
	 * 
	 * @etc 비어 있건 채워져 있건 관계 없음
	 */
	public void addFirst(E obj) {
		head = crnt = new Node<E>(obj, head);

		// Node<E> ptr = head; // 삽입 전의 머리 노드
		// head = crnt = new Node<E>(obj, ptr);
	}

	/** 꼬리에 노드 삽입 */
	public void addLast(E obj) {
		if (head == null) { // 리스트가 비어 있으면
			addFirst(obj); // 머리에 삽입
		} else {
			Node<E> ptr = head;
			while (ptr.next != null) {
				ptr = ptr.next;
			}
			ptr.next = crnt = new Node<E>(obj, null);
		}
	}

	/** 머리 노드를 삭제 */
	public void removeFirst() {
		if (head != null) { // 리스트가 비어 있지 않으면
			head = crnt = head.next;
		}
	}

	/** 꼬리 노드를 삭제 */
	public void removeLast() {
		if (head != null) {
			if (head.next == null) { // 노드가 하나만 있으면
				removeFirst();
			}
		} else {
			Node<E> ptr = head; // 스캔 중인 노드
			Node<E> pre = head; // 스캔 중인 노드의 앞쪽 노드

			while (ptr.next != null) {
				pre = ptr;
				ptr = ptr.next;
			}
			pre.next = null; // pre는 삭제 후의 꼬리 노드
			crnt = pre;
		}
	}

}
