package week_1;

/*
 * - ����
 *   - https://www.acmicpc.net/problem/2983
 * - ����
 *   - 
 * - ��Ÿ
 *   - �������� �����ϱ� ���� ���׸� ���
 *     - Plant ��� Coordinate ���
 */
public class B_2983 {
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

		/** ��ȸ */
		int temp;
		for (int i = 0; i < direction.length(); i++) {
			temp = 0;
			linkedList.print();
			System.out.print(" �� ");
			/** ���� */
			while (linkedList.check != null) {
				linkedList.getSameDirectionNode(direction.charAt(i));

				linkedList.check = linkedList.check.next;
			}
			linkedList.check = linkedList.first;
			/** �ִ� */
			while (linkedList.check != null) {
				if (linkedList.check.data.direction_node == direction.charAt(i)) {
					linkedList.getCloseDistanceNode(linkedList.check);
				}
				linkedList.check = linkedList.check.next;
			}
			linkedList.check = linkedList.first;
			/** �̵� �� ���� */
			while (linkedList.check != null) {
				if (linkedList.check.data.direction_node == direction.charAt(i)) {
					if (temp == 0) {
						temp = linkedList.check.data.distance_node;
					} else {
						if (linkedList.check.data.distance_node < temp) {
							temp = linkedList.check.data.distance_node;
							linkedList.moveTo = linkedList.check;
						}
					}
				}
				linkedList.check = linkedList.check.next;
			}
			linkedList.current = linkedList.moveTo;

			/** �ʱ�ȭ */
			linkedList.setDefault();
		}

	}
}

class LinkedList<Coordinate> {
	class Node<Coordinate> {
		Coordinate data;
		Node<Coordinate> next;

		Node(Coordinate data) {
			this.data = data;
		}
	}

	Node<Coordinate> first;
	Node<Coordinate> last;
	Node<Coordinate> current;
	Node<Coordinate> check;
	Node<Coordinate> moveTo;

	void add(Coordinate data) {
		Node<Coordinate> newNode = new Node<>(data);
		if (last != null) {
			last.next = newNode;
		}
		last = newNode;
		if (first == null) {
			moveTo = check = current = first = last;
		}
	}

	/** ���� ���� ��� üũ */
	void getSameDirectionNode(char direction) {
		Node<Coordinate> cursor = first;
		while (cursor != null) {
			cursor = cursor.next;
			if (direction == ((week_1.Plant) current.data).getDirection((week_1.Plant) cursor.data)) {
				if (((week_1.Plant) cursor.data).direction_check == false) {
					((week_1.Plant) cursor.data).direction_check = true;
					((week_1.Plant) cursor.data).direction_node = direction;

				}
			}
		}
	}

	/** ���� ���� �� �Ÿ� ����� ��� üũ */
	void getCloseDistanceNode(Node<Coordinate> node) {
		Node<Coordinate> cursor = node;
		if (((week_1.Plant) cursor.data).distance_check == false) {
			if (((week_1.Plant) current.data).getDistance((week_1.Plant) cursor.data) == 0) {
				((week_1.Plant) cursor.data).distance_check = true;
			} else {
				if (((week_1.Plant) cursor.data).distance_node > ((week_1.Plant) current.data)
						.getDistance((week_1.Plant) cursor.data)) {
					((week_1.Plant) cursor.data).distance_node = ((week_1.Plant) current.data)
							.getDistance((week_1.Plant) cursor.data);
					((week_1.Plant) cursor.data).distance_check = true;
				}
			}
		}
	}

	/** �ʵ� �ʱ�ȭ */
	void setDefault() {
		Node<Coordinate> cursor = first;
		while (cursor != null) {
			((week_1.Plant) cursor.data).direction_check = false;
			((week_1.Plant) cursor.data).direction_node = 'N';
			((week_1.Plant) cursor.data).distance_check = false;
			((week_1.Plant) cursor.data).direction_node = 0;

			cursor = cursor.next;
		}
	}

	/** �α� */
	void print() {
		System.out.println(current.data.toString());
	}
}

class Plant extends Coordinate {
	boolean direction_check = false;
	char direction_node = 'N';
	boolean distance_check = false;
	int distance_node = 0;

	Plant(int x, int y) {
		super(x, y);
	}
}
