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
	private int siz�fTheBribe;

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

			System.out.println("������� ���� �� ������ ����: ");
			System.out.println("������ �������� - 1");
			System.out.println("�������� �������� - 2");
			System.out.println("������� ��� ��������� � ������� - 3");
			System.out.println("������� ���������� ��������� � ������� - 4");
			System.out.println("������� ��� �������� ������� - 5");
			System.out.println("�������� ��� ������� �� �������� - 6");
			System.out.println("����� �� ���� �� ���������� ��������");

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

	/** ����� ��� ��������� ������ �������� (���� - 1)
	 * @param siz�fTheBribe 
	 * 
	 **/
	@SuppressWarnings("unused")
	void add_Deputy() {

			System.out.println("������ ��'� ������ ��������: ");
			Scanner sc1 = new Scanner(System.in);
			String new_surname_deputy = sc1.nextLine();

			System.out.println("������ �� ������ ��������: ");
			sc1 = new Scanner(System.in);
			int age_new_deputy = sc1.nextInt();

			System.out.println("������ ���� ������ ��������: ");
			sc1 = new Scanner(System.in);
			int weigth_new_deputy = sc1.nextInt();

			System.out.println("������ ���� ������ ��������: ");
			sc1 = new Scanner(System.in);
			int gain_new_deputy = sc1.nextInt();

			System.out.println("�� ���� ������� �����? ��� - true, ͳ - false ");
			sc1 = new Scanner(System.in);
			boolean grafter_new_deputy = sc1.nextBoolean();

			if (grafter_new_deputy) {
				System.out.println("������ ����� ������: ");
				sc1 = new Scanner(System.in);
				siz�fTheBribe = sc1.nextInt();

			}if(!grafter_new_deputy) {
				siz�fTheBribe = 0;
			}

			deputyGroup.add(new Deputy(gain_new_deputy, gain_new_deputy, new_surname_deputy, gain_new_deputy, grafter_new_deputy, siz�fTheBribe));
			System.out.println(deputyGroup.toString());
	}

	/** ����� ��� ��������� �������� (���� - 2) 
	 * 
	 **/
	void dell_Deputy() {
		System.out.println("������ �������� ��'� ��������, ��� ������ ��������: ");
		Scanner sc1 = new Scanner(System.in);
		String new_surname_deputy = sc1.nextLine();
		ListIterator<Deputy> listiterator = deputyGroup.listIterator();
		while(listiterator.hasNext()) {
			Deputy next = listiterator.next();

			if(next.getSurname().equalsIgnoreCase(new_surname_deputy)) {
				listiterator.remove();
				System.out.println(" �������� �������� - " + next.toString());
			}
		}
	}

	/** ����� ��� ��������� ��� ��������� (���� - 3)
	 * 
	 **/
	void display_bribe() {

		for(Deputy deputy : deputyGroup) {
			if(deputy.isGrafter()) {
				System.out.println(deputy.toString());
			}
		}
	}		

	/** ����� ��� ��������� ���������� ��������� (���� - 4)
	 * 
	 **/
	void biggest_bribe() {

		int index1 = 0;
		int index2 = -1;

		for (int i = 0; i<deputyGroup.size(); i++) {

			if(deputyGroup.get(i).isGrafter()) {
				if(deputyGroup.get(i).getSiz�fTheBribe()>index1) {
					index1 = deputyGroup.get(i).getSiz�fTheBribe();
					index2 = deputyGroup.indexOf(deputyGroup.get(i));
				}
			}		  
		}
		if(index2>=0) {
			System.out.println(deputyGroup.get(index2).toString());
		} else {
			System.out.println("���������� ��� �����!");
		}
	}

	/** ����� ��� ������ ��� �������� (���� - 5)
	 * 
	 **/
	void print() {
		ListIterator<Deputy> listiterator = deputyGroup.listIterator();

		while(listiterator.hasNext()) {
			People next = listiterator.next();
			System.out.println(next);
		}
	}

	/** ����� ��� ��������� ��� �������� (���� - 6)
	 * 
	 **/
	void oll_Deputy() {
		ListIterator<Deputy> listiterator = deputyGroup.listIterator();
		while(listiterator.hasNext()) {
			Deputy next = listiterator.next();
			listiterator.remove();
			System.out.println("�������� ��� ��������.");
		}
	}

	@Override
	public String toString() {
		return "����� ������� - " + name_fraction;
	}

}
