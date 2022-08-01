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
		System.out.println("Сума "+a+" та "+b+" дорінює: " + (a+b));		
	}

	@Override
	public void minus() {
		System.out.println("Різниця "+a+" та "+b+" дорінює: " + (a-b));		
	}

	@Override
	public void multiply() {
		System.out.println("Добуток "+a+" та "+b+" дорінює: " + (a*b));	
	}

	@Override
	public void devide() {
		System.out.println("Дільник "+a+" та "+b+" дорінює: " + (a/b));	
	}

}
