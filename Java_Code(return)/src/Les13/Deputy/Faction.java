package Les13.Deputy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Faction {

	List<Deputy> faction = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void addDeputy() {
		System.out.println("������ ������� ������ ��������:");
		String lastName = sc.nextLine();
		System.out.println("������ ��'� ������ ��������:");
		String name = sc.nextLine();
		System.out.println("������ �� ������ ��������:");
		int age = sc.nextInt();
		System.out.println("������ ���� ������ ��������:");
		int mass = sc.nextInt();
		System.out.println("������ ���� ������ ��������:");
		int height = sc.nextInt();
		System.out.println("������� ����� ���� �����? ");
		boolean grafter = sc.nextBoolean();

		Deputy deputy = new Deputy(lastName, name, age, mass, height, grafter);

		if (deputy.isGrafter()) {
			deputy.putBride();
		}
		faction.add(deputy);
	}

	public void deleteDeputy() {
		System.out.println("������ ������� ��������, ����� ������ ��������:");
		String inputLastName = sc.nextLine();
		System.out.println("������ ��'� ��������, ����� ������ ��������:");
		String inputName = sc.nextLine();

		for (Deputy deputy : faction) {
			if (inputLastName.equalsIgnoreCase(deputy.getLastName()) && inputName.equalsIgnoreCase(deputy.getName())) {

				faction.remove(deputy);
				System.out.println("������� " + deputy + " ������ ���������!");
			}
		}
	}

	public void showAllGrafter() {
		System.out.println("������������ ��� ��������� �������: ");
		for (Deputy deputy : faction) {
			if (deputy.isGrafter()) {
				System.out.println(deputy.toString());
			}
		}
	}

//	public void showBigGrafter() {
//		System.out.println("������������ ���������� ��������� �������: ");
//		for (Iterator iterator = faction.iterator(); iterator.hasNext();) {
//			Deputy deputy = (Deputy) iterator.next();
//			if (deputy.isGrafter()) {
//				// ����������� ���������
//			
//			}
//		}
//		
//	}
}
