/*
 * @author Scherbatyuk
 */

package Les18.Jenerics;

public class Main {

	public static void main(String[] args) {

		/*
		 * Maximum
		 * 
		 * 2) �������� ���� MyEntry<K,V>.
		 * 
		 * ������� � ����� ���������� ����, ������/������, toString.
		 * 
		 * �������� ���� Map<K,V>. ���������� � ������ ���� ������, �� �:
		 * 
		 * �������� ����� �ᒺ�� � ���� �������� �ᒺ�� ���� �� ������ �������� �ᒺ��
		 * ���� �� ��������� �������� �� ����� Set ������ �������� �� ����� List �������
		 * �������� �� ����� ���� ����
		 */
		
		MyEntry myEntry = new MyEntry();
		myEntry.add(1, "Petro");
		myEntry.add(2, "Denis");
		myEntry.add(3, "Ivan");
		myEntry.add(4, "Timur");
		myEntry.add(5, "Ruslan");

		System.out.println();
		myEntry.dell_Key(1);

		System.out.println();
		myEntry.dell_value("Ruslan");
		System.out.println();

		myEntry.Keys();
		System.out.println();

		myEntry.List_value();
		System.out.println();

		myEntry.display();
	}

}
