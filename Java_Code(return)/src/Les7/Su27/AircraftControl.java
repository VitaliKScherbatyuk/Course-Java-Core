package Les7.Su27;

public class AircraftControl {

	void up() {
		System.out.println("���� ����� - " + distance() + " �.");
	}

	void down() {
		System.out.println("���� ���� - " + distance() + " �.");
	}

	void right() {
		System.out.println("���� � ����� - " + distance() + " �.");
	}

	void left() {
		System.out.println("���� � ��� - " + distance() + " �.");
	}

	int distance() {
		return (int) (Math.random()*10000);
	}
}
