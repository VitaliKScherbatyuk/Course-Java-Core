package Les8.Enums;

import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

import javax.xml.ws.FaultAction;

public class ConsoleMenu {

	Months[] months = Months.values();
	Scanner sc = new Scanner(System.in);

	void menu() {

        System.out.println();
		System.out.println("������� ���� �� ����� ���� ���������:");
		System.out.println("��������� �� � ����� ����� - 1");
		System.out.println("������� �� ����� � ����� � ����� ���� - 2");
		System.out.println("������� �� ����� �� ����� ���� ���� ������� ��� - 3");
		System.out.println("������� �� ����� �� ����� �� ����� ����� ������� ��� - 4");
		System.out.println("������� �� ����� �� ����� �� ����� ����� ������� ��� - 5");
		System.out.println("������� �� ����� �������� ���� ���� - 6");
		System.out.println("������� �� ����� ��������� ���� ���� - 7");
		System.out.println("������� �� ����� �� ����� �� ����� ����� ������� ��� - 8");
		System.out.println("������� �� ����� �� ����� �� ����� ������� ������� ��� - 9");
		System.out.println("������� �� ����� �� �������� � ������ ����� �� ����� ������� ��� - 10");
		System.out.println("����� �� ���� - 0");

		while (true) {

			switch (sc.next()) {
			case "1":
				auditMonths();
				break;
			case "2":
				allMonthsFromSeasons();
				break;
			case "3":
				allMonthsFromDays();
				break;
			case "4":
				allMonthsMinDays();
				break;
			case "5":
				allMonthsMaxDays();
				break;
			case "6":
				monthsNextSeasons();
				break;
			case "7":
				monthsPreviousSeasons();
				break;
			case "8":
				evenDays();
				break;
			case "9":
				noEvenDays();
				break;
			case "10":
				evenDaysFromConsole();
				break;
			case "0":
				System.out.println("����� � ��������");
				sc.close();
				break;
			}
		}
	}

	// ���� - 1
	private void auditMonths() {
		System.out.println("������ �����:");
		String input = sc.next();
		boolean marker = false;
		for (Months months2 : months) {
			if (months2.name().equalsIgnoreCase(input)) {
				System.out.println("����� ����� ����");
				marker = true;
			}
		}
		if (!marker) {
			System.out.println("������ ����� �� ����");
		}
		menu();
	}

	// ���� - 2
	private void allMonthsFromSeasons() {
		System.out.println("������ ����� ����:");
		String input = sc.next();
		for (Months months2 : months) {
			if (months2.seasons.name().equalsIgnoreCase(input)) {
				System.out.println(months2.name());
			}
		}
		menu();
	}

	// ���� - 3
	private void allMonthsFromDays() {
		System.out.println("������ ������� ��� � �����:");
		int input = sc.nextInt();
		for (Months months2 : months) {
			if (months2.getDays() == input) {
				System.out.println(months2.name());
			}
		}
		System.out.println("̳����� � ����� ������� ��� �� ����");
		menu();
	}

	// ���� - 4
	private void allMonthsMinDays() {
		System.out.println("������ ������� ��� � �����:");
		int input = sc.nextInt();
		boolean marker = false;
		for (Months months2 : months) {
			if (months2.getDays() < input) {
				System.out.println(months2.name() + " --> " + months2.getDays() + " ����");
				marker = true;
			}
		}
		if (!marker) {
			System.out.println("̳����� � ������ ������� ��� �� ����");
		}
		menu();
	}

	// ���� - 5
	private void allMonthsMaxDays() {
		System.out.println("������ ������� ��� � �����:");
		int input = sc.nextInt();
		boolean marker = false;
		for (Months months2 : months) {
			if (months2.getDays() > input) {
				System.out.println(months2.name() + " --> " + months2.getDays() + " ����");
				marker = true;
			}
		}
		if (!marker) {
			System.out.println("̳����� � ������ ������� ��� �� ����");
		}
		menu();
	}

	// ���� - 6
	private void monthsNextSeasons() {
		System.out.println("������ ����� ����:");
		String input = sc.next();
		boolean marker = false;
		Seasons[] seasons = Seasons.values();
		for (Seasons seasons2 : seasons) {
			if (seasons2.name().equalsIgnoreCase(input)) {
				if (seasons2.ordinal() < seasons.length - 1) {
					int next = seasons2.ordinal() + 1;
					System.out.println(seasons[next]);
				}
				if (seasons2.ordinal() == seasons.length - 1) {
					int next = seasons2.ordinal() - seasons.length + 1;
					System.out.println(seasons[next]);
				}
				marker = true;
			}
		}
		if (!marker) {
			System.out.println("���� ���� ���� �������");
		}
		menu();
	}

	// ���� - 7
	private void monthsPreviousSeasons() {
		System.out.println("������ ����� ����:");
		String input = sc.next();
		boolean marker = false;
		Seasons[] seasons = Seasons.values();
		for (Seasons seasons2 : seasons) {
			if (seasons2.name().equalsIgnoreCase(input)) {
				if (seasons2.ordinal() != 0) {
					int next = seasons2.ordinal() - 1;
					System.out.println(seasons[next]);
				}
				if (seasons2.ordinal() == 0) {
					int next1 = seasons.length - 1;
					System.out.println(seasons[next1]);
				}
				marker = true;
			}
			if (!marker) {
				System.out.println("���� ���� ���� �������");
			}
		}
		menu();
	}

	// ���� - 8
	private void evenDays() {
		for (Months months2 : months) {
			if (months2.getDays() % 2 == 0) {
				System.out.println(months2.name() + " --> " + months2.getDays() + " ����");
			}
		}
		menu();
	}

	// ���� - 9
	private void noEvenDays() {
		for (Months months2 : months) {
			if (months2.getDays() % 2 != 0) {
				System.out.println(months2.name() + " --> " + months2.getDays() + " ����");
			}
		}
		menu();
	}

	// ���� - 10
	private void evenDaysFromConsole() {
		System.out.println("������ �����:");
		String input = sc.next();
		boolean marker = false;
		for (Months months2 : months) {
			if (months2.name().equalsIgnoreCase(input)) {
				if (months2.getDays() % 2 == 0) {
					System.out.println("�������� ����� �� ����� ������� ���.");
					marker = true;
				}
			}
		}
		if (!marker) {
			System.out.println("̳���� �� ���� ��� �� �� ����� ������� ���");
		}
		menu();
	}
}