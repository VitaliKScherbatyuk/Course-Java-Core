package Les12.MyArrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

	List list = new ArrayList();

	public void add(int number) {
		int count = 0;

		if (list.isEmpty()) {
			list.add(0, number);
		} else {
			for (int i = 0; i < list.size(); i++) {
				count++;
			}
			list.add(count, number);
		}
		System.out.println(list.toString());
	}
	
	public void remove(int index) {
		list.remove(index);
		System.out.println("Видалення за індексом - " + index);
		System.out.println(list.toString());
	}

	@Override
	public String toString() {
		return "MyArrayList [" + list + "]";
	}

}