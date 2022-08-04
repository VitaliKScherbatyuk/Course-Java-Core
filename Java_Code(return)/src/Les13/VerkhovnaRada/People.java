/**
 *@author Scherbatyuk
 **/

package Les13.VerkhovnaRada;

import java.util.ListIterator;
import java.util.Scanner;

public class People {

	private int weight;
	private int gain;

	public People(int weight, int gain) {
		super();
		this.weight = weight;
		this.gain = gain;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getGain() {
		return gain;
	}

	public void setGain(int gain) {
		this.gain = gain;
	}

	@Override
	public String toString() {
		return "People [weight=" + weight + ", gain=" + gain + "]";
	}



}





