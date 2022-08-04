package Les16.Salary;

public class Hourly implements Salary {

	private int hourly;

	public Hourly(int hourly) {
		super();
		this.hourly = hourly;
	}

	public int getHourly() {
		return hourly;
	}

	public void setHourly(int hourly) {
		this.hourly = hourly;
	}

	@Override
	public void salary() {
		System.out.println("Погодинна оплата працівника становить - " + hourly + " грн/год.");
		
	}	
	
	
}
