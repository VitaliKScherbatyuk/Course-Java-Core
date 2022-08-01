package Les11.Car;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * �������� ���������� ����, �����, ������.
		 * 
		 * ���� ����䳺 ������ : ʳ������ ������� ���, �� �������.
		 * 
		 * ����� ����䳺 ������ : ĳ����� ������, ������� � ����� �������� �����
		 * (����, ����������).
		 * 
		 * ������ ����䳺 ������ : ������� �������.
		 * 
		 * - �������� ���������� �����, �������� ����� ������������ ��������.
		 * 
		 * - ��������� ����� ����� ��`������ ����, �� �������� ������������ �����
		 * ������������ ��������.
		 * 
		 * - �������� ��������� ����, ��� ���� ���� ������� �������� :
		 * 
		 * �) ������� toString() ����� �������� ������ �� �������. ( deepToString() )
		 * 
		 * �) ��� ��� ��`���� ������ ������ �������� ���������� ��`��� ����� ����
		 * (fill())
		 */

		while (true) {
			System.out.println("������� � ����:");
			System.out.println("������� toString() ����� �������� ������ �� �������. - 1");
			System.out.println("��� ��� ��`���� ������ ������ �������� ���������� ��`��� ����� ����(fill()) - 2");

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
				System.out.println("������� ���� �� ������ ����. ");
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
