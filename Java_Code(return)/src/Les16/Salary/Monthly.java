package Les16.Salary;

public class Monthly implements Salary {

	private int monthly;

	public Monthly(int monthly) {
		super();
		this.monthly = monthly;
	}

	public int getMonthly() {
		return monthly;
	}

	public void setMonthly(int monthly) {
		this.monthly = monthly;
	}

	@Override
	public void salary() {
		System.out.println("Помісячна оплата працівника становить - " + monthly + " грн/міс.");
		
	}
		
}
