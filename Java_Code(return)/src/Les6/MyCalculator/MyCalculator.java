package Les6.MyCalculator;

public class MyCalculator implements Numerable {

	int a;
	int b;
	
	public MyCalculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void plus() {
		System.out.println("���� "+a+" �� "+b+" ������: " + (a+b));		
	}

	@Override
	public void minus() {
		System.out.println("г����� "+a+" �� "+b+" ������: " + (a-b));		
	}

	@Override
	public void multiply() {
		System.out.println("������� "+a+" �� "+b+" ������: " + (a*b));	
	}

	@Override
	public void devide() {
		System.out.println("ĳ����� "+a+" �� "+b+" ������: " + (a/b));	
	}

}
