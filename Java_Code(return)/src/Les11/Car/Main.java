package Les11.Car;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * �������� ���������� ����, �����, ������.
		 * 
		 * ���� ����䳺 ������ : ʳ������ ������� ���, �� �������.
		 * 
		 * ����� ����䳺 ������ : ĳ����� ������, ������� � ����� �������� �����
		 * (����, ����������).
		 * 
		 * ������ ����䳺 ������ : ������� �������.
		 * 
		 * - �������� ���������� �����, �������� ����� ������������ ��������.
		 * 
		 * - ��������� ����� ����� ��`������ ����, �� �������� ������������ �����
		 * ������������ ��������.
		 * 
		 * - �������� ��������� ����, ��� ���� ���� ������� �������� :
		 * 
		 * �) ������� toString() ����� �������� ������ �� �������. ( deepToString() )
		 * 
		 * �) ��� ��� ��`���� ������ ������ �������� ���������� ��`��� ����� ����
		 * (fill())
		 */

		while (true) {
			Scanner sc = new Scanner(System.in);
			int key = sc.nextInt();
			
			switch (key) {
			case 1:
				
				break;
            case 2:
				
				break;

			default:
				break;
			}
		}
		
		
	

		
	}

	static int getlenght(int a, int b) {
		Random rand = new Random();
		return rand.nextInt((b - a) - a);
	}

	void allElements() {

		Car[][] car = new Car[getlenght(0, 10)][getlenght(0, 10)];
	}
}
