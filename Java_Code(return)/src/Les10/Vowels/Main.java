package Les10.Vowels;

public class Main {

	public static void main(String[] args) {

		/*
		 * 2 Замініть всі голосні букви в строці на тире (строка довільна).
		 * 
		 * Максимум:
		 * 
		 * 3. Порахувати кількість слів у реченні. (Речення довільне)
		 * 
		 * 4. Знайти слово яке найчастіше зустрічається в реченні.
		 */

		System.out.println("Введіть речення: ");
		Word word = new Word();
		word.changeSimbol();
		word.toCount();
		System.out.println("Найчастше слово вживається - " + word.oftenWord() + " рази/разів.");
	}
}
