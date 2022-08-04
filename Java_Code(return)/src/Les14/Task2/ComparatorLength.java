/*
 * @author Scherbatyuk
 */

package Les14.Task2;

import java.util.Comparator;

public class ComparatorLength implements Comparator<Commodity> {

	/** Метод для сортування за довжиною товару 
	 *@apiNote compare
	 **/
	@Override
	public int compare(Commodity o1, Commodity o2) {
		if (o1.getLength()>o2.getLength()) {
			return 0;
		} else if (o1.getLength()<o2.getLength()) {
			return -1;
		}		
		return 0;
	}

}
