/*
 * @author Scherbatyuk
 */

package Les18.Jenerics;

public class Main {

	public static void main(String[] args) {

		/*
		 * Maximum
		 * 
		 * 2) Створити клас MyEntry<K,V>.
		 * 
		 * Описати в ньому дженеріками поля, гетери/сетери, toString.
		 * 
		 * Створити клас Map<K,V>. Реалізувати в даному класі методи, які б:
		 * 
		 * Додавали новий об’єкт в мапу Видаляли об’єкт мапи за ключем Видаляли об’єкт
		 * мапи за значенням Виводили на екран Set ключів Виводили на екран List значень
		 * Виводили на екран цілу мапу
		 */
		
		MyEntry myEntry = new MyEntry();
		myEntry.add(1, "Petro");
		myEntry.add(2, "Denis");
		myEntry.add(3, "Ivan");
		myEntry.add(4, "Timur");
		myEntry.add(5, "Ruslan");

		System.out.println();
		myEntry.dell_Key(1);

		System.out.println();
		myEntry.dell_value("Ruslan");
		System.out.println();

		myEntry.Keys();
		System.out.println();

		myEntry.List_value();
		System.out.println();

		myEntry.display();
	}

}
