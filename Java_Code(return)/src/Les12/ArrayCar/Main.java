package Les12.ArrayCar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Використовуючи Домашнє завдання до попереднього уроку (де ми створювали
		 * машину), замінити всі контейнери на ArrayList,
		 * 
		 * та переписати програму таким чином щоб вона успішно з ним працювала.
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

	@SuppressWarnings("unchecked")
	static void allElements() {

		ArrayList<Car> car = new ArrayList<>();
		for (int i = 0; i < getlenght(0, 10); i++) {
			ArrayList<Car> car1 = new ArrayList<>();
			for (int j = 0; j < getlenght(0, 10); j++) {
				car1.add(new Car(getlenght(50, 95), getlenght(2000, 2022), new Engine(getlenght(4, 16)),
						new Helm(getlenght(36, 38), materials[getlenght(0, materials.length - 1)].toString())));
			}
			car.addAll(car1);
		}
		System.out.println(car);
	}

	static void autoFill() {

		Car car = new Car(getlenght(50, 95), getlenght(2000, 2022), new Engine(getlenght(4, 16)),
				new Helm(getlenght(36, 38), materials[getlenght(0, materials.length - 1)].toString()));

		ArrayList<Car> autoCar = new ArrayList<>();
		for (int i = 0; i < getlenght(0, 10); i++) {
			autoCar.add(car);
		}

		System.out.println(autoCar.toString());
	}
}
