package Les9.MyExceptionInMathOperation;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * �������� ��� Exception(MyException). �������� ���� Methods, ������� � �����
		 * ������ , �� �
		 * 
		 * ������������� ���������, ��������, ��������, ������ ���� ������ . ���
		 * ����� ��������� :
		 * 
		 * � ���� a<0 � b<0 �������� IllegalArgumentException
		 * 
		 * � ���� a=0 � b!=0 ��� a!=0 � b=0 �������� ArithmeticException
		 * 
		 * � ���� a=0 � b=0 �������� IllegalAccessException
		 * 
		 * � ���� a>0 � b>0 �������� MyException
		 * 
		 * ������������ �� ������ �������, � ������� ��� �� �������.
		 */

		Methods methods = new Methods(0, 3);
		methods.add();
		methods.subtraction();
		methods.multiplication();
		methods.division();
	}

}
