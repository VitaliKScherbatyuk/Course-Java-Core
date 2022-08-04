/*
 *@author Scherbatyuk
 */

package Les19.Serializable;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {

		/*
		 * Створити клас Employee, описати даний клас наступними полями: name, id,
		 * salary. Дані поля повинні бути private. Описати getters and setters. Створити
		 * клас Methods де описати всього два методи serialize() and deserealize(). В
		 * даних методах повинно бути бути використано FileInputStream/FileOutputStream
		 * , ObjectInputStream/ObjectOutputStream. Створити метод Main створити
		 * екземпляр класу Employee і провести сереалізацію та десереалізацію. Результат
		 * Десереалізації вивести на консоль. Помітити поле salary модифікатором
		 * transient і провести серіалізацію і десеріалізацію. Результат вивести на
		 * екран. Створити колекцію об’єктів Employee, провести серіалізацію та
		 * десеріалізацю колекції
		 */

		File file = new File("Serializable_employee.txt");
		Employee employee = new Employee("Martin", 005, 2500);
		System.out.println(employee.toString());

		Metods metod = new Metods();
		metod.serialize(file, employee);

		Employee employee2 = (Employee) metod.deserealize(file);
		System.out.println(employee2);

		System.out.println();

		ArrayList array = new ArrayList();
		array.add(new Employee("Дмитро", 1, 2630));
		array.add(new Employee("Тарас", 2, 1587));
		array.add(new Employee("Віталік", 3, 3207));
		array.add(new Employee("Петро", 4, 1963));
		array.add(new Employee("Артем", 5, 2784));
		array.add(new Employee("Сергій", 6, 1988));
		array.add(new Employee("Іван", 7, 2695));
		array.add(new Employee("Микола", 8, 2641));
		array.add(new Employee("Роман", 9, 2800));
		array.add(new Employee("Теодор", 10, 2405));

		System.out.println("Створення колекції об'єктів: \n" + array.toString());

		File file1 = new File("Serializable_array_employee.txt");
		metod.serialize(file1, array);

		Serializable employee3 = metod.deserealize(file1);
		System.out.println("Читання колекції об'єктів із файлу: \n" + employee3);

	}

}
