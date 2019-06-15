package week_3.queue;

import week_3.queue.Node;

/*
 *  큐(FIFO) - 링크드 리스트 이용 구현
 *  - 구현상 특이사항 
 *    1. 중복 클래스 사용 X 
 *    2. 제네릭 사용 X 
 *  - 로직 
 *    -
 *  - 피드백 
 *    1. 의도 반영 네이밍(ex. data -> newData)
 */
public class QueueTest {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.add("엄홍준");
		queue.add("김윤성");
		queue.add("정원준");

		System.out.println(queue.toString());
		try {
			queue.remove();
		} catch (Exception e) {
		}

		System.out.println(queue.toString());
	}
}

/**
 * @author : 엄홍준
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
			System.out.println("큐가 비어 있습니다.");
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