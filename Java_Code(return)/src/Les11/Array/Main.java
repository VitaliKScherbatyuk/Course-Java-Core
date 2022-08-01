package Les11.Array;

import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		/*
		 * Створити масив Integer, заповнити його рандомними числовими значеннями.
		 * Відсортувати його в порядку спадання та в порядку зростання значень.
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
