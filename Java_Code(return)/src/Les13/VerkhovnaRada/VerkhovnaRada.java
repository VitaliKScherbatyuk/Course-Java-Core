/**
 *@author Scherbatyuk
 */

package Les13.VerkhovnaRada;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;
import java.util.Scanner;

public class VerkhovnaRada{

	private  String name_fraction;

	ArrayList<Fraction> fraction_group = new ArrayList<>(); 

	/** Метод для виведення меню про фракції ВР
	 * @apiNote switch
	 */
	void fraction_menu() {

		if(true) {

			System.out.println("Виберіть один із пунктів меню: ");
			System.out.println("Додати фракцію - 1");
			System.out.println("Видалити фракцію - 2");
			System.out.println("Вивести всі фракції- 3");
			System.out.println("Вивести конкретну фракцію - 4");
			System.out.println("Додати депутата до конкретної фракції - 5");
			System.out.println("Видалити депутата із конкретної фракції - 6");
			System.out.println("Вивести всіх хабарників у фракції - 7");
			System.out.println("Вивести найбільшого хабарника у фракції - 8");
			System.out.println("Вивести всіх депутатів фракції- 9");

			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();

			switch(number) {
			case 1: add_fraction(); 
			break;
			case 2: dell_fraction() ; 
			break;
			case 3: print_fraction_group() ;
			break;
			case 4: print_fraction_for_name();
			break;
			case 5: add_deputy_to_fraction();
			break;
			case 6:	dell_deputy_from_fraction(); 
			break;
			case 7:	print_bribe_to_fraction(); 
			break;
			case 8:	biggest_bribe_to_fraction(); 
			break;
			case 9:	print_fraction(); 
			break;
			}
		} 
		System.out.println();
		fraction_menu();
	}

	/** Метод для додавання фракції у ВР (меню - 1)
	 * @apiNote .add()
	 */
	void add_fraction() {
		System.out.println("Введіть назву нової фракції");

		Scanner sc1 = new Scanner(System.in);
		String name_fraction = sc1.nextLine();
		Fraction fraction = new Fraction(name_fraction);
		fraction_group.add(fraction);
	}

	/** Метод для видалення фракції з ВР (меню - 2)
	 * @apiNote .remove()
	 */
	void dell_fraction() {
		System.out.println("Введіть назву фракції, яку бажаєте видалити: ");
		Scanner sc1 = new Scanner(System.in);
		name_fraction = sc1.nextLine();

		ListIterator<Fraction> listiterator = fraction_group.listIterator();
		while(listiterator.hasNext()) {
			Fraction next = listiterator.next();

			if(next.getName_fraction().equalsIgnoreCase(name_fraction))
				listiterator.remove();
		}
	}

	/** Метод для виведення всіх фракції (меню - 3) */
	void print_fraction_group() {
		for (Fraction fraction:  fraction_group) {
			System.out.println(fraction.toString());
		}	
	}
	
	/** Метод для виведення конкретної фракції (меню - 4)
	 * @apiNote .equalsIgnoreCase()
	 */
	void print_fraction_for_name() {
		System.out.println("Яку фракцію бажаєте побачити?");
		Scanner sc1 = new Scanner(System.in);
		name_fraction = sc1.nextLine();

		for (Fraction fraction:  fraction_group) {
			if(fraction.getName_fraction().equalsIgnoreCase(name_fraction)) {			
				System.out.println(fraction);
			} 			
		}
	}

	/** Метод для додавання депутатів у фракцію (меню - 5)
	 * @apiNote метод .add_Deputy()
	 */
	void add_deputy_to_fraction() {
		System.out.println("До якої фракції бажаєте додати нового депутата?");
		Scanner sc1 = new Scanner(System.in);
		name_fraction = sc1.nextLine();

		for (Fraction fraction:  fraction_group) {
			if(fraction.getName_fraction().equalsIgnoreCase(name_fraction)) {			
				fraction.add_Deputy();
			} 			
		}
	}

	/** Метод для видалення депутата з конкретної фракції (меню - 6)
	 * @apiNote метод .dell_Deputy()
	 */
	void dell_deputy_from_fraction() {
		System.out.println("З якої фракції бажаєте видалити депутата?");
		Scanner sc1 = new Scanner(System.in);
		name_fraction = sc1.nextLine();

		for (Fraction fraction:  fraction_group) {
			if(fraction.getName_fraction().equalsIgnoreCase(name_fraction)) {			
				fraction.dell_Deputy();
			} 			
		}
	}

	/** Метод для виведення всіх хабарників із фракції (меню - 7)
	 * @apiNote метод .dell_Deputy()
	 */
	void print_bribe_to_fraction() {
		System.out.println("З якої фракції бажаєте побачити наявність хабарників?");
		Scanner sc1 = new Scanner(System.in);
		name_fraction = sc1.nextLine();

		for (Fraction fraction:  fraction_group) {
			if(fraction.getName_fraction().equalsIgnoreCase(name_fraction)) {			
				fraction.display_bribe();
			} 			
		}
	}

	/** Метод для виводу найбільшлго хабарника у фракції (меню - 8)
	 * @apiNote метод .biggest_bribe()
	 */
	void biggest_bribe_to_fraction() {
		System.out.println("З якої фракції бажаєте побачити найбільшого хабарника?");
		Scanner sc1 = new Scanner(System.in);
		name_fraction = sc1.nextLine();

		for (Fraction fraction:  fraction_group) {
			if(fraction.getName_fraction().equalsIgnoreCase(name_fraction)) {			
				fraction.biggest_bribe();
			} 			
		}
	}

	/** Метод для виведення всіх депутатів із фракції (меню - 9) */
	void print_fraction() {
		System.out.println("Склад якої фракції бажаєте побачити?");
		Scanner sc1 = new Scanner(System.in);
		name_fraction = sc1.nextLine();

		for (Fraction fraction:  fraction_group) {
			if(fraction.getName_fraction().equalsIgnoreCase(name_fraction)) {
				System.out.println( fraction.toString());
				fraction.print();	
			}
		}
		fraction_menu();
	}

	/** Метод для очищення всіх депутатів із фракції */
	void dell_oll_deputy_from_fraction() {
		System.out.println("Введіть назву фракції, яку бажаєте очистити? ");
		Scanner sc1 = new Scanner(System.in);
		name_fraction = sc1.nextLine();

		ListIterator<Fraction> listiterator = fraction_group.listIterator();
		while(listiterator.hasNext()) {
			Fraction next = listiterator.next();
			next.oll_Deputy();
		}
	}

}