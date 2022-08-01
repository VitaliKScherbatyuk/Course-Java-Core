package Les11.Array;

import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		/*
		 * �������� ����� Integer, ��������� ���� ���������� ��������� ����������.
		 * ³���������� ���� � ������� �������� �� � ������� ��������� �������.
		 */

		Integer[] array = { num(), num(), num(), num(), num(), num(), num(), num(), num(), num() };

		System.out.println(Arrays.toString(array));
		System.out.println("---------------------------------");
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
	}

	static int num() {
		int numb = (int) (Math.random() * 1000);
		return numb;
	}
}
