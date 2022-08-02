package Les10.Vowels;

import java.util.Arrays;
import java.util.Scanner;

public class Word {

	Scanner sc = new Scanner(System.in);
	String word = sc.nextLine();
	String[] sentence = word.split(" ");
	String[] simbol = word.split("");

	void changeSimbol() {
		MyException();
		System.out.println("Початкове речення: ");
		System.out.println(Arrays.asList(simbol));

		char[] vowels = { 'а', 'е', 'є', 'і', 'и', 'ї', 'о', 'у', 'ю', 'я' };
		char[] simbol1 = word.toCharArray();
		for (int i = 0; i < simbol1.length; i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (simbol1[i] == vowels[j]) {
					simbol1[i] = '*';
				}
			}
		}
		System.out.println("Речення після заміни голосних літер: ");
		System.out.println(Arrays.toString(simbol1));
	}

	void toCount() {
		System.out.println();
		System.out.println("В речені нараховано - " + sentence.length + " слова.");
	}

	int oftenWord() {
		System.out.println();
		int counter = 0;
		for (int i = 0; i < sentence.length; i++) {
			if (sentence[i].length() > 1) {
				counter++;
			}
		}
		return counter;
	}

	void MyException() {
		try {
			if (word.length() <= 1) {
				throw new MyException();
			}
		} catch (MyException o) {
			System.err.println("Введене слово занадто мале");
		}
	}
}