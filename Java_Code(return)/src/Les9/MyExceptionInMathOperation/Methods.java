package Les9.MyExceptionInMathOperation;

import Les9.ExceptionForBeforeTask.WrongInputConsoleParametersException;

public class Methods {

	private int a;
	private int b;

	public Methods(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void add() throws Exception {
		myException();
		System.out.println("���� ������� � - " + a + " �� b - " + b + " = " + (a + b));
	}

	public void subtraction() throws Exception {
		myException();
		System.out.println("г����� ������� � - " + a + " �� b - " + b + " = " + (a - b));
	}

	public void multiplication() throws Exception {
		myException();
		System.out.println("������� ������� � - " + a + " �� b - " + b + " = " + (a * b));
	}

	public void division() throws Exception {
		myException();
		System.out.println("ĳ����� ������� � - " + a + " �� b - " + b + " = " + (a / b));
	}

	public void myException() throws Exception {
		try {
			if (a < 0 || b < 0) {
				throw new IllegalArgumentException("a<0 � b<0");
			} else if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
				throw new ArithmeticException("a=0 � b!=0 ��� a!=0 � b=0");
			} else if (a == 0 && b == 0) {
				throw new IllegalAccessException("a=0 � b=0");
			} else if (a > 0 && b > 0) {
				throw new MyException();
			}
		} catch (MyException o) {
			System.err.println("������� ��������!");
		}
	}
}
