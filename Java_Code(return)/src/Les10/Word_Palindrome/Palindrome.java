package Les10.Word_Palindrome;

import java.util.Scanner;

public class Palindrome {

	Scanner sc = new Scanner(System.in);
	String word = sc.nextLine();
	String[] simbol = word.split("");

	void check() {

		if (word.length() == 5) {
			if (simbol[0].equalsIgnoreCase(simbol[4]) || simbol[1].equalsIgnoreCase(simbol[3])) {
				System.out.println("���� ����� � ����������!");
			} else {
				System.out.println("���� ����� �� � ����������!");
			}
		}
		MyException();
	}

	void MyException() {
		try {
			if (word.length() != 5) {
				throw new MyException();
			}
		} catch (MyException o) {
			System.err.println("������� ����� �� ���������� �� 5 ����");
		}
	}
}