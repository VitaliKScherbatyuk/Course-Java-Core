/*
 * @author Scherbatyuk
 */

package Les15.Zoo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Створити клас Зооклуб , як поле прописати в ньому Map. Створити клас Person ,
		 * який описати
		 * 
		 * двома полями : імя , вік. Створити клас Animal , який описати двома полями :
		 * тип тваринки (кіт,
		 * 
		 * пес), імя тваринки. В класі Зооклуб як поле прописати наступне:
		 * 
		 * Map<Person, List<Pet>> map;
		 * 
		 * Реалізувати консольне меню, таким чином щоб можна було:
		 * 
		 * Додати учасника клубу Додати тваринку до учасника клубу Видалити тваринку з
		 * учасника клубу Видалити учасника з клубу Видалити конкретну тваринку зі всіх
		 * власників Вивести на екран зооклуб Вийти з програми Використати для побудови
		 * меню Switch.
		 */
		
		Zooclub zooclub = new Zooclub();
		zooclub.menu();
	}

}
