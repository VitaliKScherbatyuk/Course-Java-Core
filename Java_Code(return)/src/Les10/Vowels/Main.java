package Les10.Vowels;

public class Main {

	public static void main(String[] args) {

		/*
		 * 2 ������ �� ������ ����� � ������ �� ���� (������ �������).
		 * 
		 * ��������:
		 * 
		 * 3. ���������� ������� ��� � ������. (������� �������)
		 * 
		 * 4. ������ ����� ��� ��������� ����������� � ������.
		 */

		System.out.println("������ �������: ");
		Word word = new Word();
		word.changeSimbol();
		word.toCount();
		System.out.println("��������� ����� ��������� - " + word.oftenWord() + " ����/����.");
	}
}
