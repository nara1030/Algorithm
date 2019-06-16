package week_3.stack;

/*
 *  스택(LIFO) - 링크드 리스트 이용 구현
 *  - 구현상 특이사항 
 *    1. 중복 클래스 사용 O 
 *    2. 제네릭 사용 O
 *    3. 접근 제한자 반영 X
 *    4. Queue와 다르게 next가 아닌 previous 이용 구현
 *  - 미비사항
 *    1. 스택 비었을 시 예외처리 필요
 *    2. 내부 분기문 사용 않고 구현 필요
 */
public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.add("엄홍준");
		stack.add("김윤성");
		stack.add("정원준");

		System.out.println(stack.toString());
		stack.remove();
		System.out.println(stack.toString());
		stack.remove();
		System.out.println(stack.toString());
		// 이하 예외 처리 확인
		try {
			stack.remove();
			System.out.println(stack.toString());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage() + "입니다.");
		}
	}
}

/**
 * @author : 엄홍준
 * @date : 2019. 06. 16.
 */
class Stack<T> {
	class Node<T> {
		T data;
		Node<T> previous;

		Node(T data) {
			this.data = data;
		}
	}

	Node<T> first;
	Node<T> last;

	void add(T data) {
		Node<T> newNode = new Node<T>(data);
		if (last != null) {
			newNode.previous = last;
		}
		last = newNode;
		if (first == null) {
			first = last;
		}
	}

	T remove() throws NullPointerException {
		if (last.previous != null) {
			T removeData = last.data;
			last = last.previous;
			return removeData;
		} else { // 첫 번째 노드
			T removeData = last.data;
			first = last = null;
			return removeData;
		}
	}

	@Override
	public String toString() {
		return last.data.toString();
	}
}
