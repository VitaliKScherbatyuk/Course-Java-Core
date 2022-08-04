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
		 * 1) Зробіть так, щоб в List<Integer> можна було додати об’єкт типу String. І
		 * поясніть (в коментарі) чому так можна зробити, якщо це взагалі можливо? (Це
		 * слід зробити виключно використовуючи джавівський List та його generics)
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
