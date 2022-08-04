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

	/** ����� ���� */
	static void menu() {
		if(true) {   

			System.out.println("������� ���� �� ������ ����:");
			System.out.println();
			System.out.println("������ ����� - ������� 1");
			System.out.println("�������� ����� - ������� 2");
			System.out.println("������� ����� - ������� 3");
			System.out.println("��������� �� ������ - ������ 4");
			System.out.println("��������� �� �������� - ������� 5");
			System.out.println("��������� �� ������� - ������� 6");
			System.out.println("��������� �� ����� - ������� 7");
			System.out.println("�������� �-��� ������� �������� - ������� 8");
			System.out.println("����� � �������� - ������� 9");
			System.out.println("����������� �������� ������ - ������� 10");

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
				System.err.println("�� �������� ��������!");
				System.exit(key);
				break;
			case 10: display();
			break;
			}
		}
	}

	/** ����� ��� ��������� ������ 
	 *@apiNote .add()
	 **/
	static void add() {

		Scanner sc = new Scanner(System.in);

		System.out.println("������ ����� ������ ���������� �����:");	
		String goods = sc.next();

		System.out.println("������ ����� ������ ���������� �����:");
		String name = sc.next();

		System.out.println("������ ������� ������ (�����):");
		int lenght = sc.nextInt();

		System.out.println("������ ������ ������ (�����):");
		int weight = sc.nextInt();

		System.out.println("������ ���� ������ (�����):");
		int mass = sc.nextInt();

		commodityList.add(new Commodity(goods, name, lenght, weight, mass));
		System.out.println(commodityList.toString());
		menu();
	}

	/** ����� ��� ��������� ������ 
	 *@apiNote .remove()
	 **/
	static void dell() { 

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �����, ���� ������ ��������: ");
		String goods = sc.next();

		System.out.println("������ ����� ������, ���� ������ ��������: ");
		String name = sc.next();

		System.out.println("������ ������� ������ (�����):");
		int lenght = sc.nextInt();

		System.out.println("������ ������ ������ (�����):");
		int weight = sc.nextInt();

		System.out.println("������ ���� ������ (�����):");
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

	/** ����� ��� ����� ������ 
	 *@apiNote .set()
	 **/
	static void change() {

		Scanner sc = new Scanner(System.in);

		System.out.println("������ �����, ���� ������ ������: ");
		String goods = sc.next();

		System.out.println("������ ����� ������, ���� ������ ������: ");
		String name = sc.next();

		System.out.println("������ ������� ������ (�����):");
		int lenght = sc.nextInt();

		System.out.println("������ ������ ������ (�����):");
		int weight = sc.nextInt();

		System.out.println("������ ���� ������ (�����):");
		int mass = sc.nextInt();

		for (Commodity commodity : commodityList) {
			if(commodity.getGoods().equalsIgnoreCase(goods) && commodity.getName().equalsIgnoreCase(name) && commodity.getLength() == lenght
					&& commodity.getWeigth() == weight && commodity.getMass() == mass) {

				System.out.println("������ ����� �����: ");
				String goods1 = sc.next();

				System.out.println("������ ���� ����� ������: ");
				String name1 = sc.next();

				System.out.println("������ ���� ������� ������ (�����):");
				int lenght1 = sc.nextInt();

				System.out.println("������ ���� ������ ������ (�����):");
				int weight1 = sc.nextInt();

				System.out.println("������ ���� ���� ������ (�����):");
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

	/** ����� ��� ���������� ������ �� ������
	 *@apiNote Collections.sort()
	 **/
	static void sort_name() {
		System.out.println("�� ����������: ");
		for (Commodity commodity : commodityList) {
			System.out.println(commodity );
		}

		System.out.println("ϳ��� ����������: ");
		Collections.sort(commodityList , new ComparatorName());
		for (Commodity commodity : commodityList) {
			System.out.println(commodity );
		}
		menu();
	}

	/** ����� ��� ���������� ������ �� ��������
	 *@apiNote Collections.sort()
	 **/
	static void sort_lenght() {
		System.out.println("�� ����������: ");
		for (Commodity commodity : commodityList) {
			System.out.println(commodity );
		}

		System.out.println("ϳ��� ����������: ");
		Collections.sort(commodityList , new ComparatorLength());
		for (Commodity commodity : commodityList) {
			System.out.println(commodity );
		}
		menu();	
	}

	/** ����� ��� ���������� ������ �� �������
	 *@apiNote Collections.sort()
	 **/
	static void sort_weigth() { 
		System.out.println("�� ����������: ");
		for (Commodity commodity : commodityList) {
			System.out.println(commodity );
		}

		System.out.println("ϳ��� ����������: ");
		Collections.sort(commodityList , new ComparatorWeigth());
		for (Commodity commodity : commodityList) {
			System.out.println(commodity );
		}
		menu();	
	}

	/** ����� ��� ���������� ������ �� �����
	 *@apiNote Collections.sort()
	 **/
	static void sort_mass() { 
		System.out.println("�� ����������: ");
		for (Commodity commodity : commodityList) {
			System.out.println(commodity );
		}

		System.out.println("ϳ��� ����������: ");
		Collections.sort(commodityList , new ComparatorMass());
		for (Commodity commodity : commodityList) {
			System.out.println(commodity );
		}
		menu();	
	}

	/** ����� ��� ����������� �������� �� ��������
	 *@apiNote .get(i)
	 **/
	static void display_element() {
		int index = commodityList.size();
		index = index - 1;
		System.out.println("ʳ������ �������� �� 0 �� " + index + " , ������� ������ ��������: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(commodityList.get(i).toString());
	}

	/** ���������� ����� ��� ����������� ������ ������ */
	static void display() {
		for (Commodity commodity : commodityList) {
			System.out.println(commodity.toString());
		}
		menu();
	}
	
}

