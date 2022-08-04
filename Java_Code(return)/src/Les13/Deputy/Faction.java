package Les13.Deputy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Faction {

	List<Deputy> faction = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void addDeputy() {
		System.out.println("Введіть призвіще нового депутата:");
		String lastName = sc.nextLine();
		System.out.println("Введіть ім'я нового депутата:");
		String name = sc.nextLine();
		System.out.println("Введіть вік нового депутата:");
		int age = sc.nextInt();
		System.out.println("Введіть вагу нового депутата:");
		int mass = sc.nextInt();
		System.out.println("Введіть зріст нового депутата:");
		int height = sc.nextInt();
		System.out.println("Депутат раніше брав хабарі? ");
		boolean grafter = sc.nextBoolean();

		Deputy deputy = new Deputy(lastName, name, age, mass, height, grafter);

		if (deputy.isGrafter()) {
			deputy.putBride();
		}
		faction.add(deputy);
	}

	public void deleteDeputy() {
		System.out.println("Введіть призвіще депутата, якого бажаєте вилучити:");
		String inputLastName = sc.nextLine();
		System.out.println("Введіть ім'я депутата, якого бажаєте вилучити:");
		String inputName = sc.nextLine();

		for (Deputy deputy : faction) {
			if (inputLastName.equalsIgnoreCase(deputy.getLastName()) && inputName.equalsIgnoreCase(deputy.getName())) {

				faction.remove(deputy);
				System.out.println("Депутат " + deputy + " успішно вилучений!");
			}
		}
	}

	public void showAllGrafter() {
		System.out.println("Оприлюднюємо всіх хабарників фракції: ");
		for (Deputy deputy : faction) {
			if (deputy.isGrafter()) {
				System.out.println(deputy.toString());
			}
		}
	}

//	public void showBigGrafter() {
//		System.out.println("Оприлюднюємо найбільшого хабарника фракції: ");
//		for (Iterator iterator = faction.iterator(); iterator.hasNext();) {
//			Deputy deputy = (Deputy) iterator.next();
//			if (deputy.isGrafter()) {
//				// бульбашкове порівняння
//			
//			}
//		}
//		
//	}
}
