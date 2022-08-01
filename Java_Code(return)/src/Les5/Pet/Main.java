package Les5.Pet;

public class Main {

	public static void main(String[] args) {
		/* Створити абстрактний клас Pet , в якому оголосити абстрактний метод voice(). 
		 * Створити класи Cow, Cat, Dog, які наслідуються від Pet. Перевизначити в них метод voice(), 
		 * так, щоб викликаючи його в методі main, на консоль виводилось : “Я кіт- Мяууу-Мяууу”, 
		 * “Я пес - Гаууу-Гаууу”, “Я корова- Мууу-Мууу”.
		 */

		Cow cow = new Cow();
		cow.voice();
		Cat cat = new Cat();
		cat.voice();
		Dog dog = new Dog();
		dog.voice();
		
	}

}
