/**
 *@author Scherbatyuk
 **/

package Les13.VerkhovnaRada;

import java.util.ListIterator;
import java.util.Scanner;

public class Deputy extends People implements Comparable<People>  {

	private String surname;
	private int age;
	private boolean grafter;
	private int siz�fTheBribe;

	public Deputy(int weight, int gain, String surname, int age, boolean grafter, int siz�fTheBribe) {
		super(weight, gain);
		this.surname = surname;
		this.age = age;
		this.grafter = grafter;
		this.siz�fTheBribe = siz�fTheBribe;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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

	public int getSiz�fTheBribe() {
		return siz�fTheBribe;
	}

	public void setSiz�fTheBribe(int siz�fTheBribe) {
		this.siz�fTheBribe = siz�fTheBribe;
	}

	@Override
	public String toString() {
		return "�������: " + surname + ", �� - " + age + ", ���� - " + getGain() + " ��, ���� - " + getWeight() + " ��, ����������� - "
				+ grafter + ", c��� ������ - " + getSiz�fTheBribe(); 
	}

	public void give_a_bribe() {

		if (isGrafter()==false) {

			siz�fTheBribe = 0;
			System.out.println("��� ������� �� ���� ������");

		}  else if (isGrafter()==true) {
			System.out.println("������ ���� ������, ��� �� ���� ��������, � ���: ");
			Scanner scan = new Scanner (System.in);
			siz�fTheBribe = scan.nextInt();

			if (siz�fTheBribe>5000){
				System.err.println("���� ������ "+ siz�fTheBribe+" ������ �� ���������� �����������, ������� ������ ��'�������! ");
			}  		
		}  System.out.println();	   		        
	}

	@Override
	public int compareTo(People o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}




