/**
 *@author Scherbatyuk
 **/
package Les20.Threads;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Мінімум:
		 * 
		 * 1) Створити клас MyThread наслідувати його від класу Thread. Перевизначити
		 * метод run(), так щоб можна було вивести введену з консолі кількість чисел
		 * Фібоначі. Для цього використовуємо в методі run() клас Scanner. Тобто ми
		 * вводимо з консолі скільки ми хочемо бачити чисел Фібоначі і ми їх виводимо з
		 * затримкою в 1 секунду.
		 * 
		 * Створити клас RunnableThread імплементувати його від інтерфейсу Runnable.
		 * Метод run() перевизначити таким чином, щоб числа Фібоначі виводились в
		 * зворотньому порядку. Тобто Спершу ввели через Scanner скільки ми хочемо
		 * бачити чисел Фібоначі, потім з затримкою в 1 секунду вивести їх від
		 * останнього до першого значення.
		 * 
		 * Перший і другий потоки повинні виводити в один рядок числа. Вигляд на консолі
		 * : Потік Thread : 1 1 2 3 5 . . . Потік Runnable: . . .5 3 2 1 1
		 * 
		 * Максимум:
		 * 
		 * 2) Виконайте попереднє завдання використовуючи різні типи ExecutorServices 
		 */
		
		/** Завдання 1: */
		MyThread myThread = new MyThread(1000);
		myThread.start();
		myThread.join();

		RunnableThread runnableThread = new RunnableThread(1000);

		/** Завдання 2: */

//		
//		MyThread myThread = new MyThread(1000);
//		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
//		System.out.println(".newFixedThreadPool():");
//		newFixedThreadPool.execute(myThread);
//		newFixedThreadPool.shutdown();
//
//		ExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(10);
//		System.out.println(".newScheduledThreadPool()");
//		newScheduledThreadPool.execute(new MyThread(1000));
//		newScheduledThreadPool.shutdown();

	}
}
