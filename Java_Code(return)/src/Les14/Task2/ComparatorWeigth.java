/*
 * @author Scherbatyuk
 */

package Les14.Task2;

import java.util.Comparator;

public class ComparatorWeigth implements Comparator<Commodity> {

	/** Метод для сортування за шириною товару 
	 *@apiNote compare
	 **/
	@Override
	public int compare(Commodity o1, Commodity o2) {
		if (o1.getWeigth()>o2.getWeigth()) {
			return 0;
		} else if (o1.getWeigth()<o2.getWeigth()) {
			return -1;
		}
		
		return 0;
	}

}
