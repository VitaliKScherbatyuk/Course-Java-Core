/*
 * @author Scherbatyuk
 */

package Les14.Task2;

import java.util.Comparator;

public class ComparatorName implements Comparator<Commodity> {

	/** Метод для сортування за назвою товару 
	 *@apiNote compare
	 **/
	@Override
	public int compare(Commodity o1, Commodity o2) {
		if (o1.getName().compareTo(o2.getName())>0) {
			return 0;
		}else if (o1.getName().compareTo(o2.getName())<0) {
			return -1;
		}
		return 0;
	}
}

