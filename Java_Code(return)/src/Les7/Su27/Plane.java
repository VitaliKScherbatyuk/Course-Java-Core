package Les7.Su27;

public abstract class Plane extends AircraftControl {

	private int length;
	private int width;
	private int weight;

	public Plane(int length, int width, int weight) {
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Літак має габарити: довжина - " + length + " м., ширина - " + width + " м., вага - " + weight + " кг.";
	}

	void startingTheEngines() {
		System.out.println("Дo взліту літака залишилось - " + distance(20, 88) + " с.");
	}

	void airplaneTakeOff() {
		System.out.println("Літак має палива на дальність польоту - " + distance(0, 1000) + " км.");
	}

	void landingThePlane() {
		System.out.println("Літак виконав завдання та йде на посадку!");
	}

	int distance(int a, int b) {
		return (int) (Math.random() * (b - a) + a);
	}

	@Override
	void up() {
		super.up();
	}

	@Override
	void down() {
		super.down();
	}

	@Override
	void right() {
		super.right();
	}

	@Override
	void left() {
		super.left();
	}

	@Override
	int distance() {
		return super.distance();
	}
}
