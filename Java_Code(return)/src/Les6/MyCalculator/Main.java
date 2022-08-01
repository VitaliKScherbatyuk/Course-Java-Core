package Les6.MyCalculator;

public class Main {

	public static void main(String[] args) {

		/*
		 * Створіть інтерфейс Plus, з методoм : додати; Minus, з методoм : відняти;
		 * Multiply з методoм : помножити; Devide з методoм : поділити. Створіть
		 * інтерфейс Numerable, який наслідуватиметься від інтерфейсів Plus, Minus,
		 * Multiply, Devide в пакеті com.lgs.lab.interface1. Створіть пакет
		 * com.lgs.lab.interface2 в якому створіть клас MyCalculator і заімплементіть
		 * даному класу інтерфейс Numerable та задайте реалізацію всім методам даного
		 * інтерфейсу. Створіть метод мейн де створіть об’єкт класу MyCalculator , до
		 * якого викличте всі його методи. Результати арифметичних операцій виведіть на
		 * консоль.
		 */

		MyCalculator myCalculator = new MyCalculator(23, 45);
		myCalculator.plus();
		myCalculator.minus();
		myCalculator.multiply();
		myCalculator.devide();

	}

}
