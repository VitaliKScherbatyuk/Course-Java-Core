/*
 * @author Scherbatyuk
 */

package Les15.Zoo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * �������� ���� ������� , �� ���� ��������� � ����� Map. �������� ���� Person ,
		 * ���� �������
		 * 
		 * ����� ������ : ��� , ��. �������� ���� Animal , ���� ������� ����� ������ :
		 * ��� �������� (��,
		 * 
		 * ���), ��� ��������. � ���� ������� �� ���� ��������� ��������:
		 * 
		 * Map<Person, List<Pet>> map;
		 * 
		 * ���������� ��������� ����, ����� ����� ��� ����� ����:
		 * 
		 * ������ �������� ����� ������ �������� �� �������� ����� �������� �������� �
		 * �������� ����� �������� �������� � ����� �������� ��������� �������� � ���
		 * �������� ������� �� ����� ������� ����� � �������� ����������� ��� ��������
		 * ���� Switch.
		 */
		
		Zooclub zooclub = new Zooclub();
		zooclub.menu();
	}

}
