package Les6.Salary;

public class WorkerMonth implements Salary{

	int salaryForHours;
	int day;
	int timeOnDay = 8;
	
	public WorkerMonth(int salaryForHours, int day) {
		this.salaryForHours = salaryForHours;
		this.day = day;
	}

	@Override
	public void salaries() {
		
		System.out.println("Зарплата помісячна для робітника становить: " + salaryForHours * timeOnDay * day); 
		
	}

}
