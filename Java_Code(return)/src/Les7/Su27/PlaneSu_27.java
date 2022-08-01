package Les7.Su27;

public class PlaneSu_27 extends Plane implements PropertiesTurbo, PropertiesStels, PropertiesNuclearStrike {

	private int speedPlane;
	private String color;

	public PlaneSu_27(int length, int width, int weight, int speedPlane, String color) {
		super(length, width, weight);
		this.speedPlane = speedPlane;
		this.color = color;
	}

	@Override
	public void nuclearStrike() {
		System.out.println("��������� ������� ����. ������� - " + distance(1, 10) + " ���������.");
	}

	@Override
	public void stels() {
		System.out.println("�������� ����� Stels. ˳��� �� ����� �� ����� �������� - " + distance(10, 20) + " ��.");
	}

	@Override
	public void turbo() {
		System.out.println(
				"�������� ����������������, �������� ����� ��������� - " + distance(speedPlane, speedPlane * 2) + " ��/���.");
	}

	@Override
	void startingTheEngines() {
		super.startingTheEngines();
	}

	@Override
	void airplaneTakeOff() {
		super.airplaneTakeOff();
	}

	@Override
	void landingThePlane() {
		super.landingThePlane();
	}

	@Override
	int distance(int a, int b) {
		return super.distance(a, b);
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

	@Override
	public String toString() {
		return "�������� �����: " + speedPlane + " ��/���, ���� �����: " + color + ", " + super.toString();
	}

}
