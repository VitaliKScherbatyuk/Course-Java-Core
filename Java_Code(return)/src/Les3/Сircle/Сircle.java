package Les3.Ñircle;

public class Ñircle {

	private int radius;
	private int diameter;
	
	public Ñircle(int radius, int diameter) {
		this.radius = radius;
		this.diameter = diameter;
	}
	
	void AreaAndLength() {
		final double Pi = 3.14;
		double area = Pi*radius*2;
		double leangth = Pi*diameter;
		System.out.println("Area = " + area + ", leangth = " + leangth);
	}
	
	

}
