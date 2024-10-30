package studio7;

public class Rectangle {
	private double length;
	private double width;
	private double area;
	private double perimeter;
	private boolean isSquare;

	public Rectangle(int initLength, int initWidth) {
		length = initLength;
		width = initWidth;
		area = length * width;
		perimeter = 2 * length + 2 * width;

		if (length == width) {
			isSquare = true;
		}
		else {
			isSquare = false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}