package Les6.MyCalculator;

public class Main {

	public static void main(String[] args) {

		/*
		 * ������� ��������� Plus, � �����o� : ������; Minus, � �����o� : ������;
		 * Multiply � �����o� : ���������; Devide � �����o� : �������. �������
		 * ��������� Numerable, ���� ���������������� �� ���������� Plus, Minus,
		 * Multiply, Devide � ����� com.lgs.lab.interface1. ������� �����
		 * com.lgs.lab.interface2 � ����� ������� ���� MyCalculator � ������������
		 * ������ ����� ��������� Numerable �� ������� ��������� ��� ������� ������
		 * ����������. ������� ����� ���� �� ������� �ᒺ�� ����� MyCalculator , ��
		 * ����� �������� �� ���� ������. ���������� ������������ �������� ������� ��
		 * �������.
		 */

		MyCalculator myCalculator = new MyCalculator(23, 45);
		myCalculator.plus();
		myCalculator.minus();
		myCalculator.multiply();
		myCalculator.devide();

	}

}
