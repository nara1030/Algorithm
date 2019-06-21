package week_1;

/*
 * - 문제
 *   - https://www.acmicpc.net/problem/2983
 * - 참고
 *   - 
 * - 기타
 *   - 다형성을 구현하기 위해 제네릭 사용
 *     - Plant 대신 Coordinate 사용
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

		/** 순회 */
		int temp;
		for (int i = 0; i < direction.length(); i++) {
			temp = 0;
			linkedList.print();
			System.out.print(" → ");
			/** 방향 */
			while (linkedList.check != null) {
				linkedList.getSameDirectionNode(direction.charAt(i));

				linkedList.check = linkedList.check.next;
			}
			linkedList.check = linkedList.first;
			/** 최단 */
			while (linkedList.check != null) {
				if (linkedList.check.data.direction_node == direction.charAt(i)) {
					linkedList.getCloseDistanceNode(linkedList.check);
				}
				linkedList.check = linkedList.check.next;
			}
			linkedList.check = linkedList.first;
			/** 이동 및 제거 */
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

			/** 초기화 */
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

	/** 방향 동일 노드 체크 */
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

	/** 방향 동일 中 거리 가까운 노드 체크 */
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

	/** 필드 초기화 */
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

	/** 로그 */
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
