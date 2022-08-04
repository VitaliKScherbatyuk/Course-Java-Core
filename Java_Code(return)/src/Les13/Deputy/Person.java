package Les13.Deputy;

public class Person {

	private int mass;
	private int height;

	public Person(int mass, int height) {
		this.mass = mass;
		this.height = height;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [mass=" + mass + ", height=" + height + "]";
	}

}
