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
			Scanner sc = new Scanner(System.in);
			int key = sc.nextInt();
			
			switch (key) {
			case 1:
				
				break;
            case 2:
				
				break;

			default:
				break;
			}
		}
		
		
	

		
	}

	static int getlenght(int a, int b) {
		Random rand = new Random();
		return rand.nextInt((b - a) - a);
	}

	void allElements() {

		Car[][] car = new Car[getlenght(0, 10)][getlenght(0, 10)];
	}
}
