package week_1;

class Coordinate {
	int x;
	int y;

	Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/** 방향 선별 */
	char getDirection(Coordinate toPosition) {
		int deltaX = (toPosition.x - x);
		int deltaY = (toPosition.y - y);

		if (deltaX > 0 && deltaY > 0) {
			return 'A';
		} else if (deltaX > 0 && deltaY < 0) {
			return 'B';
		} else if (deltaX < 0 && deltaY > 0) {
			return 'C';
		} else if (deltaX < 0 && deltaY < 0) {
			return 'D';
		} else { // 위 경우 외엔 이동 X
			return 'N';
		}
	}

	/** 거리 판단 */
	int getDistance(Coordinate toPosition) {
		int squareX = (toPosition.x - x) * (toPosition.x - x);
		int squareY = (toPosition.y - y) * (toPosition.y - y);
		return (squareX + squareY);
	}

	@Override
	public String toString() {
		return "x: " + x + ", y: " + y;
	}
}
