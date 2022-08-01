package Les6.Salary;

public class Main {

	public static void main(String[] args) {

		/*Створити interface Зарплата, в якому передбачити метод зарплата(). Створити клас
		Працівник з погодинною зарплатою, та Працівник з фіксованою місячною зарплатою .
		Реалізувати методи інтерфейсу в класах: Працівник з погодинною зарплатою, та
		Працівник з фіксованою місячною зарплатою . Формула розрахунку зарплати працівника є
		довільною. Вивести на екран скільки заробляють перший і другий працівники.
		*/

		WorkerHours workerHours = new WorkerHours(25, 22, 8);
		workerHours.salaries();
		WorkerMonth workerMonth = new WorkerMonth(25, 22);
		workerMonth.salaries();
	}

}
