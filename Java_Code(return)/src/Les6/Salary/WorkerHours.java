package Les6.Salary;

public class WorkerHours implements Salary{

	int salaryForHours;
	int day;
	int timeOnDay;
	
	public WorkerHours(int salaryForHours, int day, int timeOnDay) {
		this.salaryForHours = salaryForHours;
		this.day = day;
		this.timeOnDay = timeOnDay;
	}

	@Override
	public void salaries() {
		
		System.out.println("Зарплата погодинна для робітника становить: " + salaryForHours * timeOnDay * day);
	}

}
