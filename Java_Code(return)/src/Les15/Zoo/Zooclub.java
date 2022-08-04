/*
 * @author Scherbatyuk
 */

package Les15.Zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Zooclub {

	static Map<Person, ArrayList<Pet>> map = new HashMap<>();	

	/** Метод для виведення меню
	 *@apiNote switch
	 **/
	static void menu() {	

		System.out.println("Виберіть один із пунктів меню:");
		System.out.println();
		System.out.println("Додати учасника клубу - виберіть 1:");
		System.out.println("Додати тваринку до учасника клубу - виберіть 2:");
		System.out.println("Видалити тваринку з учасника клубу - вибрати 3:");
		System.out.println("Видалити учасника з клубу - вибрати 4:");
		System.out.println("Видалити конкретну тваринку зі всіх власників - вибрати 5:");
		System.out.println("Вивести на екран зооклуб - вибрати 6:");
		System.out.println("Вийти з програми - вибрати 7:");

		Scanner sc = new Scanner (System.in);
		int number = sc.nextInt();

		if(true) {
			switch (number) {
			case 1: add_club_member();
			break;
			case 2: add_pet();
			break;
			case 3: dell_pet();
			break;
			case 4: dell_club_member();
			break;
			case 5: dell_pet_from_oll();
			break;
			case 6: print();
			break;
			case 7:
				System.err.println("Ви покидаєте програму!");
				System.exit(number);
				break;
			}
		}
	}

	/** Метод для додавання нового учасника до клубу
	 *@apiNote .put()
	 *@param Person(name, age)
	 **/
	static void add_club_member() {

		Scanner sc = new Scanner (System.in);
		System.out.println("Введіть ім'я нового учасника клубу: ");  
		String name = sc.next();
		System.out.println("Введіть вік нового учасника клубу: "); 
		int age = sc.nextInt();

		map.put(new Person(name, age ),new ArrayList<>());
		menu();  
	}

	/** Метод для додавання тваринки до конкретного учасника клубу
	 * @apiNote Iterator, .add()
	 * @param Pet(type, name_pet), Person(name, age)
	 **/
	static void add_pet() {	

		Scanner sc = new Scanner (System.in);

		System.out.println("До якого учасника Ви додаєте тваринку? ");  
		String name = sc.next();

		System.out.println("Введіть вік часника клубу, до якого додаєте нову тваринку: "); 
		int age = sc.nextInt();

		System.out.println("Яку тваринку Ви додаєте (вид): ");  
		String type = sc.next();

		System.out.println("Введіть ім'я тваринки: "); 
		String name_pet = sc.next();

		Pet pet = new Pet(type, name_pet);
		Iterator<Entry<Person, ArrayList<Pet>>> iterator2 = map.entrySet().iterator();

		while (iterator2.hasNext()) {
			Entry<Person, ArrayList<Pet>> next = iterator2.next();
			if (next.getKey().getName().equalsIgnoreCase(name) && next.getKey().getAge()== age ) {	
				ArrayList<Pet> value = next.getValue();						
				value.add(pet);
				System.out.println("Тваринка " + next.toString() + " додана до учасника "+ next.getKey().getName());
			} else {
				System.out.println("Введеного учасника не існує, повторіть спробу! ");
			}		
		}
		menu();  
	}

	/** Метод для видалення тваринки від учаснику клубу
	 * @apiNote Iterator, .remove()
	 * @param Pet(type, name_pet), Person(name, age)
	 **/
	static void dell_pet() {	

		Scanner sc = new Scanner (System.in);

		System.out.println("Від якого учасника ви видаляєте тваринку? ");  
		String name = sc.next();

		System.out.println("Введіть вік учасника, від якого видаляється тваринка: "); 
		int age = sc.nextInt();

		System.out.println("Яку тваринку Ви видаляєте (вид): ");  
		String type = sc.next();

		System.out.println("Введіть ім'я тваринки, яку видаляєте: "); 
		String name_pet = sc.next();

		Pet pet = new Pet(type, name_pet);
		Iterator<Entry<Person, ArrayList<Pet>>> iterator2 = map.entrySet().iterator();

		while (iterator2.hasNext()) {
			Entry<Person, ArrayList<Pet>> next = iterator2.next();
			if (next.getKey().getName().equalsIgnoreCase(name) && next.getKey().getAge()== age ) {	
				ArrayList<Pet> value = next.getValue();	

				Iterator<Pet> iterator3 = value.iterator();
				while(iterator3.hasNext()) {
					Pet pet2 = iterator3.next();
					if(pet2.getType().equalsIgnoreCase(type)&& pet2.getName().equalsIgnoreCase(name_pet)) {
						iterator3.remove();
						System.out.println("Тваринка " + pet2.toString() + " видалена від учасника " + next.getKey().getName() );
					} else {
						System.out.println("Введеної тваринки не існує, повторіть спробу! ");
					}
				}		
			} else {
				System.out.println("Введеного учасника не існує, повторіть спробу! ");
			}	
		}
		menu();  
	}

	/** Метод для видалення учасника клубу
	 *@apiNote Iterator, .remove()
	 *@param Person(name, age)
	 **/
	static void dell_club_member() {

		Scanner sc = new Scanner (System.in);
		System.out.println("Введіть ім'я учасника клубу, що хочете видалити: ");  
		String name = sc.next();
		System.out.println("Введіть вік учасника клубу, що хочете видалити: "); 
		int age = sc.nextInt();

		Iterator<Entry<Person, ArrayList<Pet>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Pet>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(name) && next.getKey().getAge()== age ) {	
				ArrayList<Pet> value = next.getValue();						
				iterator.remove();
				System.out.println("Видалений учасник клубу - " + next.toString());
			} else {
				System.out.println("Введеного учасника не існує, повторіть спробу! ");
			}	
		}
		menu();  
	}

	/** Метод для видалення конкретної тваринки від всіх учасників клубу
	 *@apiNote Iterator, .remove()
	 *@param Pet(type)
	 **/
	static void dell_pet_from_oll() {	

		Scanner sc = new Scanner (System.in);

		System.out.println("Введіть тваринку, яку хочете видалити від всіх учасників клубу: ");  
		String type = sc.next();

		Iterator<Entry<Person, ArrayList<Pet>>> iterator = map.entrySet().iterator();

		while(iterator.hasNext()) {
			Entry<Person, ArrayList<Pet>> next = iterator.next();
			ArrayList<Pet> value = next.getValue();
			Iterator<Pet> iterator3 = value.iterator();
			while(iterator3.hasNext()) {
				Pet pet2 = iterator3.next();
				if(pet2.getType().equalsIgnoreCase(type)) {
					iterator3.remove();
					System.out.println("Тваринка " + pet2.toString() + " видалена від всіх учасників");
				} else {
					System.out.println("Введеної тваринки не існує, повторіть спробу! ");
				}
			}		
		}
		menu();  	
	}

	/** Метод для виведення всіх учасників клубу
	 * @apiNote for()
	 **/
	static void print() {
		Set<Entry<Person, ArrayList<Pet>>> map_numbers = map.entrySet();

		for (Entry<Person, ArrayList<Pet>> entry : map_numbers) {

			System.out.println(entry.toString());
		}
		menu();  
	}

}
