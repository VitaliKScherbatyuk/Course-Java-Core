package Les8.Enums;

import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

import javax.xml.ws.FaultAction;

public class ConsoleMenu {

	Months[] months = Months.values();
	Scanner sc = new Scanner(System.in);

	void menu() {

        System.out.println();
		System.out.println("¬ибер≥ть один ≥з пункт≥ меню календар€:");
		System.out.println("ѕерев≥рити чи Ї такий м≥с€ць - 1");
		System.out.println("¬ивести вс≥ м≥с€ц≥ з такою ж порою року - 2");
		System.out.println("¬ивести вс≥ м≥с€ц≥ €к≥ мають таку саму к≥льк≥сть дн≥в - 3");
		System.out.println("¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають меншу к≥льк≥сть дн≥в - 4");
		System.out.println("¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в - 5");
		System.out.println("¬ивести на екран наступну пору року - 6");
		System.out.println("¬ивести на екран попередню пору року - 7");
		System.out.println("¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають парну к≥льк≥сть дн≥в - 8");
		System.out.println("¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають непарну к≥льк≥сть дн≥в - 9");
		System.out.println("¬ивести на екран чи введений з консол≥ м≥с€ць маЇ парну к≥льк≥сть дн≥в - 10");
		System.out.println("¬ийти ≥з меню - 0");

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
				System.out.println("¬их≥д з програми");
				sc.close();
				break;
			}
		}
	}

	// ћеню - 1
	private void auditMonths() {
		System.out.println("¬вед≥ть м≥с€ць:");
		String input = sc.next();
		boolean marker = false;
		for (Months months2 : months) {
			if (months2.name().equalsIgnoreCase(input)) {
				System.out.println("“акий м≥с€ць ≥снуЇ");
				marker = true;
			}
		}
		if (!marker) {
			System.out.println("“акого м≥с€ц€ не ≥снуЇ");
		}
		menu();
	}

	// ћеню - 2
	private void allMonthsFromSeasons() {
		System.out.println("¬вед≥ть сезон року:");
		String input = sc.next();
		for (Months months2 : months) {
			if (months2.seasons.name().equalsIgnoreCase(input)) {
				System.out.println(months2.name());
			}
		}
		menu();
	}

	// ћеню - 3
	private void allMonthsFromDays() {
		System.out.println("¬вед≥ть к≥льк≥сть дн≥в у м≥с€цю:");
		int input = sc.nextInt();
		for (Months months2 : months) {
			if (months2.getDays() == input) {
				System.out.println(months2.name());
			}
		}
		System.out.println("ћ≥с€ц≥в з такою к≥льк≥стю дн≥в не ≥снуЇ");
		menu();
	}

	// ћеню - 4
	private void allMonthsMinDays() {
		System.out.println("¬вед≥ть к≥льк≥сть дн≥в у м≥с€цю:");
		int input = sc.nextInt();
		boolean marker = false;
		for (Months months2 : months) {
			if (months2.getDays() < input) {
				System.out.println(months2.name() + " --> " + months2.getDays() + " день");
				marker = true;
			}
		}
		if (!marker) {
			System.out.println("ћ≥с€ц≥в з меншою к≥льк≥стю дн≥в не ≥снуЇ");
		}
		menu();
	}

	// ћеню - 5
	private void allMonthsMaxDays() {
		System.out.println("¬вед≥ть к≥льк≥сть дн≥в у м≥с€цю:");
		int input = sc.nextInt();
		boolean marker = false;
		for (Months months2 : months) {
			if (months2.getDays() > input) {
				System.out.println(months2.name() + " --> " + months2.getDays() + " день");
				marker = true;
			}
		}
		if (!marker) {
			System.out.println("ћ≥с€ц≥в з б≥льшою к≥льк≥стю дн≥в не ≥снуЇ");
		}
		menu();
	}

	// ћеню - 6
	private void monthsNextSeasons() {
		System.out.println("¬вед≥ть сезон року:");
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
			System.out.println("“ака пора року в≥дсутн€");
		}
		menu();
	}

	// ћеню - 7
	private void monthsPreviousSeasons() {
		System.out.println("¬вед≥ть сезон року:");
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
				System.out.println("“ака пора року в≥дсутн€");
			}
		}
		menu();
	}

	// ћеню - 8
	private void evenDays() {
		for (Months months2 : months) {
			if (months2.getDays() % 2 == 0) {
				System.out.println(months2.name() + " --> " + months2.getDays() + " день");
			}
		}
		menu();
	}

	// ћеню - 9
	private void noEvenDays() {
		for (Months months2 : months) {
			if (months2.getDays() % 2 != 0) {
				System.out.println(months2.name() + " --> " + months2.getDays() + " день");
			}
		}
		menu();
	}

	// ћеню - 10
	private void evenDaysFromConsole() {
		System.out.println("¬вед≥ть м≥с€ць:");
		String input = sc.next();
		boolean marker = false;
		for (Months months2 : months) {
			if (months2.name().equalsIgnoreCase(input)) {
				if (months2.getDays() % 2 == 0) {
					System.out.println("¬ведений м≥с€ць маЇ парну к≥льк≥сть дн≥в.");
					marker = true;
				}
			}
		}
		if (!marker) {
			System.out.println("ћ≥с€ць не ≥снуЇ або маЇ не парну к≥льк≥сть дн≥в");
		}
		menu();
	}
}