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
		System.out.println("Проведено ядерний удар. Скинуто - " + distance(1, 10) + " боєголовок.");
	}

	@Override
	public void stels() {
		System.out.println("Включено режим Stels. Літак не видно на радарі протягом - " + distance(10, 20) + " хв.");
	}

	@Override
	public void turbo() {
		System.out.println(
				"Включено турбоприскорення, швидксть літака становить - " + distance(speedPlane, speedPlane * 2) + " км/год.");
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
		return "Швидкість літака: " + speedPlane + " км/год, колір літака: " + color + ", " + super.toString();
	}

}
