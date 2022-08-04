/*
 *@author Scherbatyuk
 */

package Les19.Serializable;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {

		/*
		 * �������� ���� Employee, ������� ����� ���� ���������� ������: name, id,
		 * salary. ��� ���� ������ ���� private. ������� getters and setters. ��������
		 * ���� Methods �� ������� ������ ��� ������ serialize() and deserealize(). �
		 * ����� ������� ������� ���� ���� ����������� FileInputStream/FileOutputStream
		 * , ObjectInputStream/ObjectOutputStream. �������� ����� Main ��������
		 * ��������� ����� Employee � �������� ����������� �� �������������. ���������
		 * ������������� ������� �� �������. ������� ���� salary �������������
		 * transient � �������� ���������� � ������������. ��������� ������� ��
		 * �����. �������� �������� �ᒺ��� Employee, �������� ���������� ��
		 * ����������� ��������
		 */

		File file = new File("Serializable_employee.txt");
		Employee employee = new Employee("Martin", 005, 2500);
		System.out.println(employee.toString());

		Metods metod = new Metods();
		metod.serialize(file, employee);

		Employee employee2 = (Employee) metod.deserealize(file);
		System.out.println(employee2);

		System.out.println();

		ArrayList array = new ArrayList();
		array.add(new Employee("������", 1, 2630));
		array.add(new Employee("�����", 2, 1587));
		array.add(new Employee("³����", 3, 3207));
		array.add(new Employee("�����", 4, 1963));
		array.add(new Employee("�����", 5, 2784));
		array.add(new Employee("�����", 6, 1988));
		array.add(new Employee("����", 7, 2695));
		array.add(new Employee("������", 8, 2641));
		array.add(new Employee("�����", 9, 2800));
		array.add(new Employee("������", 10, 2405));

		System.out.println("��������� �������� ��'����: \n" + array.toString());

		File file1 = new File("Serializable_array_employee.txt");
		metod.serialize(file1, array);

		Serializable employee3 = metod.deserealize(file1);
		System.out.println("������� �������� ��'���� �� �����: \n" + employee3);

	}

}
