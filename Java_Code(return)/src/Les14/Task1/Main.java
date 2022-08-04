package Les14.Task1;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		/*
		 * �������� ���� (������� ����), ������� � ����� ����� ��� ����, ���� � ����
		 * String, ���� ������� (������� ���). �������� � ���� ����� Set.
		 * 
		 * ��������� ���� ��"������ ������ �����. ����������� Comparator � Comparable
		 * ��� ���������� �� ���� ������. ������� ������ �������������� ������, ����
		 * ������������ �� �������.
		 */
		
		
		/** �������������� ������ */
		Set<Cat> setCat = new HashSet<>();

		/** ³����������� ����� Comparator */
		// TreeSet<Cat> setCat = new TreeSet<>(new CatComparator());

		/** ³����������� ����� Comparable */
		// TreeSet<Cat> setCat = new TreeSet<>();

		setCat.add(new Cat("Murka", 4));
		setCat.add(new Cat("Murka", 1));
		setCat.add(new Cat("Pliamchuk", 5));
		setCat.add(new Cat("Bilosnizhka", 3));
		setCat.add(new Cat("Karamelka", 4));
		setCat.add(new Cat("Mimay", 3));

		for (Cat cat : setCat) {
			System.out.println(cat);
		}
	}

}
