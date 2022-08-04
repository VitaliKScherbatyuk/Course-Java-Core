/**
 *@author Scherbatyuk
 **/

package Les13.VerkhovnaRada;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Fraction{

	ArrayList<Deputy> deputyGroup = new ArrayList<>(); 

	private String name_fraction;
	private int sizОfTheBribe;

	public Fraction(String name_fraction) {
		super();
		this.name_fraction = name_fraction;
	}

	public Fraction() {
		// TODO Auto-generated constructor stub
	}

	public String getName_fraction() {
		return name_fraction;
	}

	public void setName_fraction() {
		this.name_fraction = name_fraction;
	}

	void menu() {

		if(true) {

			System.out.println("Виберіть один із пунктів меню: ");
			System.out.println("Додати депутата - 1");
			System.out.println("Видалити депутата - 2");
			System.out.println("Вивести всіх хабарників у фракції - 3");
			System.out.println("Вивести найбільшого хабарника у фракції - 4");
			System.out.println("Вивести всіх депутатів фракції - 5");
			System.out.println("Очистити всю фракцію від депутатів - 6");
			System.out.println("Вийти із меню до наступного завдання");

			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();

			switch(number) {
			case 1: add_Deputy(); 
			break;
			case 2: dell_Deputy(); 
			break;
			case 3: display_bribe();
			break;
			case 4: biggest_bribe(); 
			break;
			case 5: print();
			break;
			case 6:	oll_Deputy(); 
			break;		
			}
		} 
		System.out.println();
		menu();
	}

	/** Метод для додавання нового депутата (меню - 1)
	 * @param sizОfTheBribe 
	 * 
	 **/
	@SuppressWarnings("unused")
	void add_Deputy() {

			System.out.println("Введіть ім'я нового депутата: ");
			Scanner sc1 = new Scanner(System.in);
			String new_surname_deputy = sc1.nextLine();

			System.out.println("Введіть вік нового депутата: ");
			sc1 = new Scanner(System.in);
			int age_new_deputy = sc1.nextInt();

			System.out.println("Введіть вагу нового депутата: ");
			sc1 = new Scanner(System.in);
			int weigth_new_deputy = sc1.nextInt();

			System.out.println("Введіть зріст нового депутата: ");
			sc1 = new Scanner(System.in);
			int gain_new_deputy = sc1.nextInt();

			System.out.println("Чи бере депутат хабарі? Так - true, Ні - false ");
			sc1 = new Scanner(System.in);
			boolean grafter_new_deputy = sc1.nextBoolean();

			if (grafter_new_deputy) {
				System.out.println("Введіть розмір хабаря: ");
				sc1 = new Scanner(System.in);
				sizОfTheBribe = sc1.nextInt();

			}if(!grafter_new_deputy) {
				sizОfTheBribe = 0;
			}

			deputyGroup.add(new Deputy(gain_new_deputy, gain_new_deputy, new_surname_deputy, gain_new_deputy, grafter_new_deputy, sizОfTheBribe));
			System.out.println(deputyGroup.toString());
	}

	/** Метод для видалення депутата (меню - 2) 
	 * 
	 **/
	void dell_Deputy() {
		System.out.println("Введіть депутата ім'я депутата, яко бажаєте видалити: ");
		Scanner sc1 = new Scanner(System.in);
		String new_surname_deputy = sc1.nextLine();
		ListIterator<Deputy> listiterator = deputyGroup.listIterator();
		while(listiterator.hasNext()) {
			Deputy next = listiterator.next();

			if(next.getSurname().equalsIgnoreCase(new_surname_deputy)) {
				listiterator.remove();
				System.out.println(" Видалено депутата - " + next.toString());
			}
		}
	}

	/** Метод для виведення всіх хабарників (меню - 3)
	 * 
	 **/
	void display_bribe() {

		for(Deputy deputy : deputyGroup) {
			if(deputy.isGrafter()) {
				System.out.println(deputy.toString());
			}
		}
	}		

	/** Метод для виведення найбільшого хабарника (меню - 4)
	 * 
	 **/
	void biggest_bribe() {

		int index1 = 0;
		int index2 = -1;

		for (int i = 0; i<deputyGroup.size(); i++) {

			if(deputyGroup.get(i).isGrafter()) {
				if(deputyGroup.get(i).getSizОfTheBribe()>index1) {
					index1 = deputyGroup.get(i).getSizОfTheBribe();
					index2 = deputyGroup.indexOf(deputyGroup.get(i));
				}
			}		  
		}
		if(index2>=0) {
			System.out.println(deputyGroup.get(index2).toString());
		} else {
			System.out.println("Хабариники тут відстні!");
		}
	}

	/** Метод для виводу всіх депутатів (меню - 5)
	 * 
	 **/
	void print() {
		ListIterator<Deputy> listiterator = deputyGroup.listIterator();

		while(listiterator.hasNext()) {
			People next = listiterator.next();
			System.out.println(next);
		}
	}

	/** Метод для видалення всіх депутатів (меню - 6)
	 * 
	 **/
	void oll_Deputy() {
		ListIterator<Deputy> listiterator = deputyGroup.listIterator();
		while(listiterator.hasNext()) {
			Deputy next = listiterator.next();
			listiterator.remove();
			System.out.println("Видалено всіх депутатів.");
		}
	}

	@Override
	public String toString() {
		return "Назва фракції - " + name_fraction;
	}

}
