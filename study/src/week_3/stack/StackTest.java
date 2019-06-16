package week_3.stack;

/*
 *  ����(LIFO) - ��ũ�� ����Ʈ �̿� ����
 *  - ������ Ư�̻��� 
 *    1. �ߺ� Ŭ���� ��� O 
 *    2. ���׸� ��� O
 *    3. ���� ������ �ݿ� X
 *    4. Queue�� �ٸ��� next�� �ƴ� previous �̿� ����
 *  - �̺����
 *    1. ���� ����� �� ����ó�� �ʿ�
 *    2. ���� �б⹮ ��� �ʰ� ���� �ʿ�
 */
public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.add("��ȫ��");
		stack.add("������");
		stack.add("������");

		System.out.println(stack.toString());
		stack.remove();
		System.out.println(stack.toString());
		stack.remove();
		System.out.println(stack.toString());
		// ���� ���� ó�� Ȯ��
		try {
			stack.remove();
			System.out.println(stack.toString());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage() + "�Դϴ�.");
		}
	}
}

/**
 * @author : ��ȫ��
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
		} else { // ù ��° ���
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
