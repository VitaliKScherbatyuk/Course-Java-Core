package Les12.MyArrayList;

public class Main {

	public static void main(String[] args) {

		/*
		 * Max:
		 * 
		 * 3. �������� ������ ArrayList , ������� ��� ������� ArrayList , ���� ����
		 * �������� ����������� � ���� ���� ��� ������:
		 * 
		 * -add() ������ � ����� ������
		 * 
		 * -remove(index) �������� �� ��������
		 * 
		 * -������� main() ����� �� �������� ������ �������������� ����� add() �����
		 * ������� ArrayList �
		 * 
		 * ���������� ���� ����� ��������� remove(index)
		 */

		MyArrayList my = new MyArrayList();
		
		System.out.println("������ ������� � ����� ������.");
		my.add(10);
		my.add(11);
		my.add(12);
		
		my.remove(1);
	}
}