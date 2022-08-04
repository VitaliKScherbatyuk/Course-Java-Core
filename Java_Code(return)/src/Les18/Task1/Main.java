/*
 * @author Scherbatyuk
 */

package Les18.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		/*
		 * Minimum
		 * 
		 * 1) ������ ���, ��� � List<Integer> ����� ���� ������ �ᒺ�� ���� String. �
		 * ������� (� ��������) ���� ��� ����� �������, ���� �� ������ �������? (��
		 * ��� ������� �������� �������������� ���������� List �� ���� generics)
		 */
		
		List<String> string = Arrays.asList("One", "Two", "Three", "Four", "Five");
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
		ArrayList array = new ArrayList();
		array.addAll(number);
		array.addAll(string);

		System.out.println("Integer elements: " + number + ",\nString elements: " + string);
		System.out.println("Total array: " + array);

	}

}
