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

	/** ����� ��� ��������� ���� ��� ������� ��
	 * @apiNote switch
	 */
	void fraction_menu() {

		if(true) {

			System.out.println("������� ���� �� ������ ����: ");
			System.out.println("������ ������� - 1");
			System.out.println("�������� ������� - 2");
			System.out.println("������� �� �������- 3");
			System.out.println("������� ��������� ������� - 4");
			System.out.println("������ �������� �� ��������� ������� - 5");
			System.out.println("�������� �������� �� ��������� ������� - 6");
			System.out.println("������� ��� ��������� � ������� - 7");
			System.out.println("������� ���������� ��������� � ������� - 8");
			System.out.println("������� ��� �������� �������- 9");

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

	/** ����� ��� ��������� ������� � �� (���� - 1)
	 * @apiNote .add()
	 */
	void add_fraction() {
		System.out.println("������ ����� ���� �������");

		Scanner sc1 = new Scanner(System.in);
		String name_fraction = sc1.nextLine();
		Fraction fraction = new Fraction(name_fraction);
		fraction_group.add(fraction);
	}

	/** ����� ��� ��������� ������� � �� (���� - 2)
	 * @apiNote .remove()
	 */
	void dell_fraction() {
		System.out.println("������ ����� �������, ��� ������ ��������: ");
		Scanner sc1 = new Scanner(System.in);
		name_fraction = sc1.nextLine();

		ListIterator<Fraction> listiterator = fraction_group.listIterator();
		while(listiterator.hasNext()) {
			Fraction next = listiterator.next();

			if(next.getName_fraction().equalsIgnoreCase(name_fraction))
				listiterator.remove();
		}
	}

	/** ����� ��� ��������� ��� ������� (���� - 3) */
	void print_fraction_group() {
		for (Fraction fraction:  fraction_group) {
			System.out.println(fraction.toString());
		}	
	}
	
	/** ����� ��� ��������� ��������� ������� (���� - 4)
	 * @apiNote .equalsIgnoreCase()
	 */
	void print_fraction_for_name() {
		System.out.println("��� ������� ������ ��������?");
		Scanner sc1 = new Scanner(System.in);
		name_fraction = sc1.nextLine();

		for (Fraction fraction:  fraction_group) {
			if(fraction.getName_fraction().equalsIgnoreCase(name_fraction)) {			
				System.out.println(fraction);
			} 			
		}
	}

	/** ����� ��� ��������� �������� � ������� (���� - 5)
	 * @apiNote ����� .add_Deputy()
	 */
	void add_deputy_to_fraction() {
		System.out.println("�� ��� ������� ������ ������ ������ ��������?");
		Scanner sc1 = new Scanner(System.in);
		name_fraction = sc1.nextLine();

		for (Fraction fraction:  fraction_group) {
			if(fraction.getName_fraction().equalsIgnoreCase(name_fraction)) {			
				fraction.add_Deputy();
			} 			
		}
	}

	/** ����� ��� ��������� �������� � ��������� ������� (���� - 6)
	 * @apiNote ����� .dell_Deputy()
	 */
	void dell_deputy_from_fraction() {
		System.out.println("� ��� ������� ������ �������� ��������?");
		Scanner sc1 = new Scanner(System.in);
		name_fraction = sc1.nextLine();

		for (Fraction fraction:  fraction_group) {
			if(fraction.getName_fraction().equalsIgnoreCase(name_fraction)) {			
				fraction.dell_Deputy();
			} 			
		}
	}

	/** ����� ��� ��������� ��� ��������� �� ������� (���� - 7)
	 * @apiNote ����� .dell_Deputy()
	 */
	void print_bribe_to_fraction() {
		System.out.println("� ��� ������� ������ �������� �������� ���������?");
		Scanner sc1 = new Scanner(System.in);
		name_fraction = sc1.nextLine();

		for (Fraction fraction:  fraction_group) {
			if(fraction.getName_fraction().equalsIgnoreCase(name_fraction)) {			
				fraction.display_bribe();
			} 			
		}
	}

	/** ����� ��� ������ ���������� ��������� � ������� (���� - 8)
	 * @apiNote ����� .biggest_bribe()
	 */
	void biggest_bribe_to_fraction() {
		System.out.println("� ��� ������� ������ �������� ���������� ���������?");
		Scanner sc1 = new Scanner(System.in);
		name_fraction = sc1.nextLine();

		for (Fraction fraction:  fraction_group) {
			if(fraction.getName_fraction().equalsIgnoreCase(name_fraction)) {			
				fraction.biggest_bribe();
			} 			
		}
	}

	/** ����� ��� ��������� ��� �������� �� ������� (���� - 9) */
	void print_fraction() {
		System.out.println("����� ��� ������� ������ ��������?");
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

	/** ����� ��� �������� ��� �������� �� ������� */
	void dell_oll_deputy_from_fraction() {
		System.out.println("������ ����� �������, ��� ������ ��������? ");
		Scanner sc1 = new Scanner(System.in);
		name_fraction = sc1.nextLine();

		ListIterator<Fraction> listiterator = fraction_group.listIterator();
		while(listiterator.hasNext()) {
			Fraction next = listiterator.next();
			next.oll_Deputy();
		}
	}

}