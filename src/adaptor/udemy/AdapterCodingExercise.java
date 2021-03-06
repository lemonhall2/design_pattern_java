package adaptor.udemy;

class Square {
	public int side;

	public Square(int side) {
		this.side = side;
	}
}

interface Rectangle {
	int getWidth();

	int getHeight();

	default int getArea() {
		return getWidth() * getHeight();
	}
}

class SquareToRectangleAdapter implements Rectangle {
	private int width;
	private int height;
	
	public SquareToRectangleAdapter(Square square) {
		// todo
		this.width = square.side;
		this.height = square.side;
	}

	@Override
	public int getWidth() {
		return this.width;
	}

	@Override
	public int getHeight() {
		return this.height;
	}
}

public class AdapterCodingExercise {

}
