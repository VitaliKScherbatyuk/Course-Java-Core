package Les7.Su27;

public class AircraftControl {

	void up() {
		System.out.println("Лечу вверх - " + distance() + " м.");
	}

	void down() {
		System.out.println("Лечу вниз - " + distance() + " м.");
	}

	void right() {
		System.out.println("Лечу в право - " + distance() + " м.");
	}

	void left() {
		System.out.println("Лечу в ліво - " + distance() + " м.");
	}

	int distance() {
		return (int) (Math.random()*10000);
	}
}
