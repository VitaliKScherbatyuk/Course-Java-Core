package Les11.Car;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Створити сутністності Авто, Кермо, Двигун.
		 * 
		 * Авто володіє полями : Кількість кінських сил, рік випуску.
		 * 
		 * Кермо володіє полями : Діаметр колеса, матеріал з якого зроблено кермо
		 * (шкіра, алькантара).
		 * 
		 * Двигун володіє полями : кількість циліндрів.
		 * 
		 * - Створити двовимірний масив, величина якого вираховується рандомно.
		 * 
		 * - Заповнити даний масив об`єктами авто, всі значення конструктора якого
		 * заповнюються рандомно.
		 * 
		 * - Створити консольне меню, яке буде мати наступні елементи :
		 * 
		 * а) Вивести toString() даних елементів масиву на консоль. ( deepToString() )
		 * 
		 * б) Для всіх об`єктів даного масиву засетити одинаковий об`єкт класу Авто
		 * (fill())
		 */

		while (true) {
			System.out.println("Виберіть з меню:");
			System.out.println("Вивести toString() даних елементів масиву на консоль. - 1");
			System.out.println("Для всіх об`єктів даного масиву засетити одинаковий об`єкт класу Авто(fill()) - 2");

			Scanner sc = new Scanner(System.in);
			int key = sc.nextInt();

			switch (key) {
			case 1:
				allElements();
				break;
			case 2:
				autoFill();
				break;
			default: {
				System.out.println("Виберіть один із пунктів меню. ");
			}
			}
		}
	}

	static Material[] materials = Material.values();

	static int getlenght(int a, int b) {
		Random rand = new Random();
		return rand.nextInt((b - a + 1) + a);
	}

	static void allElements() {

		Car[][] car = new Car[getlenght(0, 10)][getlenght(0, 10)];
		for (int i = 0; i < car.length; i++) {
			for (int j = 0; j < car.length; j++) {

				car[i][j] = new Car(getlenght(50, 95), getlenght(2000, 2022), new Engine(getlenght(4, 16)),
						new Helm(getlenght(36, 38), materials[getlenght(0, materials.length - 1)].toString()));
			}
			System.out.println(Arrays.deepToString(car));
		}
	}

	static void autoFill() {

		Car car = new Car(getlenght(50, 95), getlenght(2000, 2022), new Engine(getlenght(4, 16)),
				new Helm(getlenght(36, 38), materials[getlenght(0, materials.length - 1)].toString()));
		Car[] autoCar = new Car[getlenght(0, 10)];
		Arrays.fill(autoCar, car);

		System.out.println(Arrays.deepToString(autoCar));
	}
}
