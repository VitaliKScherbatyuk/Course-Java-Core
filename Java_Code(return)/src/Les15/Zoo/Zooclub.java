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

	/** ����� ��� ��������� ����
	 *@apiNote switch
	 **/
	static void menu() {	

		System.out.println("������� ���� �� ������ ����:");
		System.out.println();
		System.out.println("������ �������� ����� - ������� 1:");
		System.out.println("������ �������� �� �������� ����� - ������� 2:");
		System.out.println("�������� �������� � �������� ����� - ������� 3:");
		System.out.println("�������� �������� � ����� - ������� 4:");
		System.out.println("�������� ��������� �������� � ��� �������� - ������� 5:");
		System.out.println("������� �� ����� ������� - ������� 6:");
		System.out.println("����� � �������� - ������� 7:");

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
				System.err.println("�� �������� ��������!");
				System.exit(number);
				break;
			}
		}
	}

	/** ����� ��� ��������� ������ �������� �� �����
	 *@apiNote .put()
	 *@param Person(name, age)
	 **/
	static void add_club_member() {

		Scanner sc = new Scanner (System.in);
		System.out.println("������ ��'� ������ �������� �����: ");  
		String name = sc.next();
		System.out.println("������ �� ������ �������� �����: "); 
		int age = sc.nextInt();

		map.put(new Person(name, age ),new ArrayList<>());
		menu();  
	}

	/** ����� ��� ��������� �������� �� ����������� �������� �����
	 * @apiNote Iterator, .add()
	 * @param Pet(type, name_pet), Person(name, age)
	 **/
	static void add_pet() {	

		Scanner sc = new Scanner (System.in);

		System.out.println("�� ����� �������� �� ������ ��������? ");  
		String name = sc.next();

		System.out.println("������ �� ������� �����, �� ����� ������ ���� ��������: "); 
		int age = sc.nextInt();

		System.out.println("��� �������� �� ������ (���): ");  
		String type = sc.next();

		System.out.println("������ ��'� ��������: "); 
		String name_pet = sc.next();

		Pet pet = new Pet(type, name_pet);
		Iterator<Entry<Person, ArrayList<Pet>>> iterator2 = map.entrySet().iterator();

		while (iterator2.hasNext()) {
			Entry<Person, ArrayList<Pet>> next = iterator2.next();
			if (next.getKey().getName().equalsIgnoreCase(name) && next.getKey().getAge()== age ) {	
				ArrayList<Pet> value = next.getValue();						
				value.add(pet);
				System.out.println("�������� " + next.toString() + " ������ �� �������� "+ next.getKey().getName());
			} else {
				System.out.println("��������� �������� �� ����, �������� ������! ");
			}		
		}
		menu();  
	}

	/** ����� ��� ��������� �������� �� �������� �����
	 * @apiNote Iterator, .remove()
	 * @param Pet(type, name_pet), Person(name, age)
	 **/
	static void dell_pet() {	

		Scanner sc = new Scanner (System.in);

		System.out.println("³� ����� �������� �� ��������� ��������? ");  
		String name = sc.next();

		System.out.println("������ �� ��������, �� ����� ����������� ��������: "); 
		int age = sc.nextInt();

		System.out.println("��� �������� �� ��������� (���): ");  
		String type = sc.next();

		System.out.println("������ ��'� ��������, ��� ���������: "); 
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
						System.out.println("�������� " + pet2.toString() + " �������� �� �������� " + next.getKey().getName() );
					} else {
						System.out.println("������� �������� �� ����, �������� ������! ");
					}
				}		
			} else {
				System.out.println("��������� �������� �� ����, �������� ������! ");
			}	
		}
		menu();  
	}

	/** ����� ��� ��������� �������� �����
	 *@apiNote Iterator, .remove()
	 *@param Person(name, age)
	 **/
	static void dell_club_member() {

		Scanner sc = new Scanner (System.in);
		System.out.println("������ ��'� �������� �����, �� ������ ��������: ");  
		String name = sc.next();
		System.out.println("������ �� �������� �����, �� ������ ��������: "); 
		int age = sc.nextInt();

		Iterator<Entry<Person, ArrayList<Pet>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Pet>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(name) && next.getKey().getAge()== age ) {	
				ArrayList<Pet> value = next.getValue();						
				iterator.remove();
				System.out.println("��������� ������� ����� - " + next.toString());
			} else {
				System.out.println("��������� �������� �� ����, �������� ������! ");
			}	
		}
		menu();  
	}

	/** ����� ��� ��������� ��������� �������� �� ��� �������� �����
	 *@apiNote Iterator, .remove()
	 *@param Pet(type)
	 **/
	static void dell_pet_from_oll() {	

		Scanner sc = new Scanner (System.in);

		System.out.println("������ ��������, ��� ������ �������� �� ��� �������� �����: ");  
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
					System.out.println("�������� " + pet2.toString() + " �������� �� ��� ��������");
				} else {
					System.out.println("������� �������� �� ����, �������� ������! ");
				}
			}		
		}
		menu();  	
	}

	/** ����� ��� ��������� ��� �������� �����
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
