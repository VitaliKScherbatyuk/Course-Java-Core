package Les13.Deputy;

import java.util.Scanner;

public class Deputy extends Person{

	private String lastName;
	private String name;
	private int age;
	private boolean grafter;
	private int bribe;
	
	public Deputy(String lastName, String name, int age, int mass, int height, boolean grafter) {
		super(mass, height);
		this.lastName = lastName;
		this.name = name;
		this.age = age;
		this.grafter = grafter;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGrafter() {
		return grafter;
	}

	public void setGrafter(boolean grafter) {
		this.grafter = grafter;
	}

	public int getBribe() {
		return bribe;
	}

	public void setBribe(int bribe) {
		this.bribe = bribe;
	}

	@Override
	public String toString() {
		return "Deputy [lastName=" + lastName + ", name=" + name + ", age=" + age + ", grafter=" + grafter + ", bribe="
				+ bribe + ", toString()=" + super.toString() + "]";
	}
	
	public void putBride() {
	Scanner sc = new Scanner(System.in);
	
		if(grafter == false) {
			System.out.println("Цей депутат не хабарник!");
		}else {
			System.out.println("Вітаю, Вам попався хабарник. Вкажіть суму хабаря: ");
			int takeBribe = sc.nextInt();
			if(takeBribe > 5000) {
				System.out.println("Хабар "+takeBribe+" перевищує прожитковий мінімум, терміново викликайте поліцію!");
			}else {
				bribe = takeBribe;
			}
		}
	}
	
}
