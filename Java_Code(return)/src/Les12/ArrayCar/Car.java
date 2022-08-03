package Les12.ArrayCar;

public class Car {

	private int power;
	private int year;
	private Engine engine;
	private Helm helm;
	
	public Car(int power, int year, Engine engine, Helm helm) {
		super();
		this.power = power;
		this.year = year;
		this.engine = engine;
		this.helm = helm;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	@Override
	public String toString() {
		return "Car [power=" + power + ", year=" + year + ", engine=" + engine + ", helm=" + helm + ", toString()="
				+ super.toString() + "]";
	}
	
	

	
	
	
	
	

	

}
