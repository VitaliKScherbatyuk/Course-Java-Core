package Les3.Rectangle;

public class Rectangle {

	private int width;
	private int length;

	public Rectangle() {
		this.width = 50;
		this.length = 30;
	}

	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}

	void area() {
		System.out.println("Area = " + width * length);
	}
	void perimeter() {
		System.out.println("Perimeter = " + (width + length)*2 );
	}
	
}
