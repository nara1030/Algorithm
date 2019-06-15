package week_3.queue;

import week_3.queue.Node;

/*
 *  ť(FIFO) - ��ũ�� ����Ʈ �̿� ����
 *  - ������ Ư�̻��� 
 *    1. �ߺ� Ŭ���� ��� X 
 *    2. ���׸� ��� X 
 *  - ���� 
 *    -
 *  - �ǵ�� 
 *    1. �ǵ� �ݿ� ���̹�(ex. data -> newData)
 */
public class QueueTest {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.add("��ȫ��");
		queue.add("������");
		queue.add("������");

		System.out.println(queue.toString());
		try {
			queue.remove();
		} catch (Exception e) {
		}

		System.out.println(queue.toString());
	}
}

/**
 * @author : ��ȫ��
 * @date : 2019. 06. 15.
 */
class Queue {
	Node first;
	Node last;

	void add(String newData) {
		Node newNode = new Node(newData);
		if (last != null) {
			last.next = newNode;
		}
		last = newNode;
		if (first == null) {
			// last = newNode;
			first = last;
		}
	}

	String remove() throws Exception {
		if (first == null) {
			System.out.println("ť�� ��� �ֽ��ϴ�.");
			throw new Exception();
		} else {
			String removeData = first.data;
			first = first.next;
			return removeData;
		}
	}

	public String toString() {
		return first.data;
	}

}

class Node {
	String data;
	Node next;

	Node(String data) {
		this.data = data;
	}
}