package chap09_1;

import java.util.Comparator;

/*
 * - ���� ����Ʈ Ŭ����(Ex_01<E>)
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

	private Node<E> head; // �Ӹ� ���
	private Node<E> crnt; // ���� ���

	public Ex_01() {
		head = crnt = null;
	}

	/** ��� �˻� */
	public E search(E obj, Comparator<? super E> c) {
		Node<E> ptr = head; // ���� ��ĵ ���� ���

		while (ptr != null) {
			if (c.compare(obj, ptr.data) == 0) {
				crnt = ptr;
				return ptr.data;
			}
			ptr = ptr.next;
		}
		return null; // �˻� ����
	}

	/**
	 * �Ӹ��� ��� ����
	 * 
	 * @etc ��� �ְ� ä���� �ְ� ���� ����
	 */
	public void addFirst(E obj) {
		head = crnt = new Node<E>(obj, head);

		// Node<E> ptr = head; // ���� ���� �Ӹ� ���
		// head = crnt = new Node<E>(obj, ptr);
	}

	/** ������ ��� ���� */
	public void addLast(E obj) {
		if (head == null) { // ����Ʈ�� ��� ������
			addFirst(obj); // �Ӹ��� ����
		} else {
			Node<E> ptr = head;
			while (ptr.next != null) {
				ptr = ptr.next;
			}
			ptr.next = crnt = new Node<E>(obj, null);
		}
	}

	/** �Ӹ� ��带 ���� */
	public void removeFirst() {
		if (head != null) { // ����Ʈ�� ��� ���� ������
			head = crnt = head.next;
		}
	}

	/** ���� ��带 ���� */
	public void removeLast() {
		if (head != null) {
			if (head.next == null) { // ��尡 �ϳ��� ������
				removeFirst();
			}
		} else {
			Node<E> ptr = head; // ��ĵ ���� ���
			Node<E> pre = head; // ��ĵ ���� ����� ���� ���

			while (ptr.next != null) {
				pre = ptr;
				ptr = ptr.next;
			}
			pre.next = null; // pre�� ���� ���� ���� ���
			crnt = pre;
		}
	}

}
