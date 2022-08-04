/*
 * @author Scherbatyuk
 */

package Les14.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Metods {

	static ArrayList <Commodity> commodityList = new ArrayList();

	/** Метод меню */
	static void menu() {
		if(true) {   

			System.out.println("Виберіть один із пунктів меню:");
			System.out.println();
			System.out.println("Додати товар - виберіть 1");
			System.out.println("Видалити товар - виберіть 2");
			System.out.println("Замінити товар - виберіть 3");
			System.out.println("Сортувати за назвою - вибіріть 4");
			System.out.println("Сортувати за довжиною - вибиріть 5");
			System.out.println("Сортувати за шириною - вибиріть 6");
			System.out.println("Сортувати за вагою - вибиріть 7");
			System.out.println("Виводимо і-тий елемент колекції - вибиріть 8");
			System.out.println("Вийти з програми - вибиріть 9");
			System.out.println("Переглянути наявність товару - виберіть 10");

			Scanner sc = new Scanner(System.in);
			int key = sc.nextInt();

			switch (key) {
			case 1:	add(); 		
			break ;		
			case 2: dell();		
			break;
			case 3: change();
			break;
			case 4: sort_name();
			break;
			case 5: sort_lenght();
			break;
			case 6: sort_weigth();
			break;
			case 7: sort_mass();
			break;
			case 8: display_element();
			break;
			case 9: 
				System.err.println("Ви покидаєте програму!");
				System.exit(key);
				break;
			case 10: display();
			break;
			}
		}
	}

	/** Метод для додавання товару 
	 *@apiNote .add()
	 **/
	static void add() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введіть групу товару англійською мовою:");	
		String goods = sc.next();

		System.out.println("Введіть назву товару англійською мовою:");
		String name = sc.next();

		System.out.println("Введіть довжину товару (число):");
		int lenght = sc.nextInt();

		System.out.println("Введіть ширину товару (число):");
		int weight = sc.nextInt();

		System.out.println("Введіть вагу товару (число):");
		int mass = sc.nextInt();

		commodityList.add(new Commodity(goods, name, lenght, weight, mass));
		System.out.println(commodityList.toString());
		menu();
	}

	/** Метод для видалення товару 
	 *@apiNote .remove()
	 **/
	static void dell() { 

		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть товар, який бажаєте видалити: ");
		String goods = sc.next();

		System.out.println("Введіть назву товару, який бажаєте видалити: ");
		String name = sc.next();

		System.out.println("Введіть довжину товару (число):");
		int lenght = sc.nextInt();

		System.out.println("Введіть ширину товару (число):");
		int weight = sc.nextInt();

		System.out.println("Введіть вагу товару (число):");
		int mass = sc.nextInt();

		Iterator<Commodity> listiterator = commodityList.iterator();
		while(listiterator.hasNext()) {
			Commodity next = listiterator.next();

			if(next.getGoods().equalsIgnoreCase(goods) && next.getName().equalsIgnoreCase(name) 
					&& next.getLength() == lenght
					&& next.getWeigth() == weight && next.getMass() == mass) {
				listiterator.remove();

			}
		}
		menu();
	}

	/** Метод для заміни товару 
	 *@apiNote .set()
	 **/
	static void change() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введіть товар, який бажаєте змінити: ");
		String goods = sc.next();

		System.out.println("Введіть назву товару, який бажаєте змінити: ");
		String name = sc.next();

		System.out.println("Введіть довжину товару (число):");
		int lenght = sc.nextInt();

		System.out.println("Введіть ширину товару (число):");
		int weight = sc.nextInt();

		System.out.println("Введіть вагу товару (число):");
		int mass = sc.nextInt();

		for (Commodity commodity : commodityList) {
			if(commodity.getGoods().equalsIgnoreCase(goods) && commodity.getName().equalsIgnoreCase(name) && commodity.getLength() == lenght
					&& commodity.getWeigth() == weight && commodity.getMass() == mass) {

				System.out.println("Введіть новий товар: ");
				String goods1 = sc.next();

				System.out.println("Введіть нову назву товару: ");
				String name1 = sc.next();

				System.out.println("Введіть нову довжину товару (число):");
				int lenght1 = sc.nextInt();

				System.out.println("Введіть нову ширину товару (число):");
				int weight1 = sc.nextInt();

				System.out.println("Введіть нову вагу товару (число):");
				int mass1 = sc.nextInt();

				commodity.setGoods(goods1);
				commodity.setName(name1);
				commodity.setLength(lenght1);
				commodity.setWeigth(weight1);
				commodity.setMass(mass1);
			}
		}	
		menu();
	}

	/** Метод для сортування товару за назвою
	 *@apiNote Collections.sort()
	 **/
	static void sort_name() {
		System.out.println("До сортування: ");
		for (Commodity commodity : commodityList) {
			System.out.println(commodity );
		}

		System.out.println("Після сортування: ");
		Collections.sort(commodityList , new ComparatorName());
		for (Commodity commodity : commodityList) {
			System.out.println(commodity );
		}
		menu();
	}

	/** Метод для сортування товару за довжиною
	 *@apiNote Collections.sort()
	 **/
	static void sort_lenght() {
		System.out.println("До сортування: ");
		for (Commodity commodity : commodityList) {
			System.out.println(commodity );
		}

		System.out.println("Після сортування: ");
		Collections.sort(commodityList , new ComparatorLength());
		for (Commodity commodity : commodityList) {
			System.out.println(commodity );
		}
		menu();	
	}

	/** Метод для сортування товару за шириною
	 *@apiNote Collections.sort()
	 **/
	static void sort_weigth() { 
		System.out.println("До сортування: ");
		for (Commodity commodity : commodityList) {
			System.out.println(commodity );
		}

		System.out.println("Після сортування: ");
		Collections.sort(commodityList , new ComparatorWeigth());
		for (Commodity commodity : commodityList) {
			System.out.println(commodity );
		}
		menu();	
	}

	/** Метод для сортування товару за вагою
	 *@apiNote Collections.sort()
	 **/
	static void sort_mass() { 
		System.out.println("До сортування: ");
		for (Commodity commodity : commodityList) {
			System.out.println(commodity );
		}

		System.out.println("Після сортування: ");
		Collections.sort(commodityList , new ComparatorMass());
		for (Commodity commodity : commodityList) {
			System.out.println(commodity );
		}
		menu();	
	}

	/** Метод для відображення елемента за індексом
	 *@apiNote .get(i)
	 **/
	static void display_element() {
		int index = commodityList.size();
		index = index - 1;
		System.out.println("Кількість елементів від 0 до " + index + " , виберіть індекс елементу: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(commodityList.get(i).toString());
	}

	/** Додатковий метод для відображення всього товару */
	static void display() {
		for (Commodity commodity : commodityList) {
			System.out.println(commodity.toString());
		}
		menu();
	}
	
}

