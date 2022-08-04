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
	private int sizÎfTheBribe;

	public Deputy(int weight, int gain, String surname, int age, boolean grafter, int sizÎfTheBribe) {
		super(weight, gain);
		this.surname = surname;
		this.age = age;
		this.grafter = grafter;
		this.sizÎfTheBribe = sizÎfTheBribe;
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

	public int getSizÎfTheBribe() {
		return sizÎfTheBribe;
	}

	public void setSizÎfTheBribe(int sizÎfTheBribe) {
		this.sizÎfTheBribe = sizÎfTheBribe;
	}

	@Override
	public String toString() {
		return "Äåïóòàò: " + surname + ", â³ê - " + age + ", çğ³ñò - " + getGain() + " ñì, âàãà - " + getWeight() + " êã, õàáàğíèöòâî - "
				+ grafter + ", cóìà õàáàğÿ - " + getSizÎfTheBribe(); 
	}

	public void give_a_bribe() {

		if (isGrafter()==false) {

			sizÎfTheBribe = 0;
			System.out.println("Öåé äåïóòàò íå áåğå õàáàğ³â");

		}  else if (isGrafter()==true) {
			System.out.println("Âêàæ³òü ñóìó õàáàğÿ, ÿêó âè äàºòå äåïóòàòó, â ãğí: ");
			Scanner scan = new Scanner (System.in);
			sizÎfTheBribe = scan.nextInt();

			if (sizÎfTheBribe>5000){
				System.err.println("Ñóìà õàáàğà "+ sizÎfTheBribe+" ï³äïàäàº ï³ä êğèì³íàëüíå ïğîâàäæåííÿ, äåïóòàò ï³äëÿãàº óâ'ÿçíåííş! ");
			}  		
		}  System.out.println();	   		        
	}

	@Override
	public int compareTo(People o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}




