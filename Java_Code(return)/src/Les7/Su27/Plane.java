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
		return "˳��� �� ��������: ������� - " + length + " �., ������ - " + width + " �., ���� - " + weight + " ��.";
	}

	void startingTheEngines() {
		System.out.println("�o ����� ����� ���������� - " + distance(20, 88) + " �.");
	}

	void airplaneTakeOff() {
		System.out.println("˳��� �� ������ �� �������� ������� - " + distance(0, 1000) + " ��.");
	}

	void landingThePlane() {
		System.out.println("˳��� ������� �������� �� ��� �� �������!");
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
