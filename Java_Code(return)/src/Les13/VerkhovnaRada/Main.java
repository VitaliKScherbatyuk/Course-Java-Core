/**
 *@author Scherbatyuk
 **/

package Les13.VerkhovnaRada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List<People> people = new ArrayList<>();

		people.add(new Deputy(98, 172, "Тищенко", 52, getRandom(), give_a_bribe()));
		people.add(new Deputy(83, 176, "Фролов", 49, getRandom(), give_a_bribe()));
		people.add(new Deputy(120, 173, "Стефанчук", 51, getRandom(), give_a_bribe()));
		people.add(new Deputy(109, 168, "Павліш", 26, getRandom(), give_a_bribe()));
		people.add(new Deputy(79, 186, "Нагорняк", 38, getRandom(), give_a_bribe()));
		people.add(new Deputy(81, 170, "Лаба", 41, getRandom(), give_a_bribe()));
		people.add(new Deputy(104, 167, "Кицак", 50, getRandom(),give_a_bribe()));
		people.add(new Deputy(76, 179, "Дунда", 67, getRandom(), give_a_bribe()));
		people.add(new Deputy(76, 168, "Ватрас", 65, getRandom(), give_a_bribe()));
		people.add(new Deputy(75, 172, "Арахамія", 39, getRandom(), give_a_bribe()));


		//		System.out.println("Завдання 1");
		//		System.out.println();
		//		ListIterator<People> listiterator = people.listIterator();
		//
		//		while(listiterator.hasNext()) {
		//			People next = listiterator.next();
		//			System.out.println(next);
		//			((Deputy) next).give_a_bribe();	
		//		}
		//		

		//      System.out.println("Завдання 2");
		//      System.out.println();
		//	 	Fraction fraction = new Fraction();
		//		fraction.menu();
		//		
		//		 System.out.println("Завдання 3");
		//	     System.out.println();
		//	     VerkhovnaRada vr = new VerkhovnaRada();
		//         vr.fraction_menu();  

		totalMenu();
	}
	
	static VerkhovnaRada vr = new VerkhovnaRada();
	
	static void totalMenu() {
		if(true) {
			System.out.println("Завдання мінімуму та максимуму: ");
			System.out.println();
			System.out.println("Введіть 1 щоб додати фракцію");
			System.out.println("Введіть 2 щоб видалити конкретну фракцію");
			System.out.println("Введіть 3 щоб вивести усі фракції");
			System.out.println("Введіть 4 щоб очистити конкретну фракцію");
			System.out.println("Введіть 5 щоб вивести конкретну фракцію"); 
			System.out.println("Введіть 6 щоб додати депутата в фракцію"); 
			System.out.println("Введіть 7 щоб видалити депутата з фракції");
			System.out.println("Введіть 8 щоб вивести список хабарників");
			System.out.println("Введіть 9 щоб вивести найбільшого хабарника");

			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();

			switch(number) {
			case 1:	vr.add_fraction();
			break;
			case 2: vr.dell_fraction(); 
			break;
			case 3: vr.print_fraction_group();
			break;
			case 4: vr.dell_oll_deputy_from_fraction();               
			break;
			case 5: vr.print_fraction_for_name();
			break;
			case 6:	vr.add_deputy_to_fraction();                      
			break;
			case 7:	vr.dell_deputy_from_fraction();                               
			break;
			case 8:	vr.print_bribe_to_fraction(); 
			break;
			case 9:	vr.biggest_bribe_to_fraction();
			break;
			}
			totalMenu();	
		}
	}

	private static int give_a_bribe() {	
		return 0;
	}

	/**Метод для автоматичного визначення хабарника (true або false)
	 *@apiNote Random
	 **/
	static boolean getRandom() {

		Random rm = new Random();
		return rm.nextBoolean() ;
	}

}

