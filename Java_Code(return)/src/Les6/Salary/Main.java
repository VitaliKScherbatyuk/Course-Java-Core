package Les6.Salary;

public class Main {

	public static void main(String[] args) {

		/*�������� interface ��������, � ����� ����������� ����� ��������(). �������� ����
		��������� � ���������� ���������, �� ��������� � ���������� ������� ��������� .
		���������� ������ ���������� � ������: ��������� � ���������� ���������, ��
		��������� � ���������� ������� ��������� . ������� ���������� �������� ���������� �
		��������. ������� �� ����� ������ ���������� ������ � ������ ����������.
		*/

		WorkerHours workerHours = new WorkerHours(25, 22, 8);
		workerHours.salaries();
		WorkerMonth workerMonth = new WorkerMonth(25, 22);
		workerMonth.salaries();
	}

}
