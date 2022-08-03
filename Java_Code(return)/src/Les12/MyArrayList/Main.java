package Les12.MyArrayList;

public class Main {

	public static void main(String[] args) {

		/*
		 * Max:
		 * 
		 * 3. Вивчивши будову ArrayList , створіть свій власний ArrayList , який буде
		 * динамічно розширятись і мати лише два методи:
		 * 
		 * -add() додати в кінець списку
		 * 
		 * -remove(index) видалити за індексом
		 * 
		 * -створіть main() метод де заповніть даними використовуючи метод add() даний
		 * власний ArrayList і
		 * 
		 * потестуйте його метод видалення remove(index)
		 */

		MyArrayList my = new MyArrayList();
		
		System.out.println("Додаємо елемент в кінець масиву.");
		my.add(10);
		my.add(11);
		my.add(12);
		
		my.remove(1);
	}
}