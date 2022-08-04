package Les14.Task1;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		/*
		 * Створити клас (довільно який), описати в ньому мінімум два поля, одне з яких
		 * String, інше числове (довільно яке). Створити в мейн методі Set.
		 * 
		 * Наповнити його об"єктами даного класу. Використати Comparator і Comparable
		 * для сортування за цими полями. Вивести спершу невідсортований список, потім
		 * відсортований на консоль.
		 */
		
		
		/** Невідсортований список */
		Set<Cat> setCat = new HashSet<>();

		/** Відсортований через Comparator */
		// TreeSet<Cat> setCat = new TreeSet<>(new CatComparator());

		/** Відсортований через Comparable */
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
