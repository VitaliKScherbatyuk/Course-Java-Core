package Les14.Task1;

import java.util.Comparator;

public class CatComparator implements Comparator<Cat>{

	@Override
	public int compare(Cat o1, Cat o2) {
		if (o1.getName().compareTo(o2.getName())>0) {
			return 1;
		}else if (o1.getName().compareTo(o2.getName())<0) {
			return -1;
		}else if (o1.getAge()> o2.getAge()){
			return 1;
		}else if (o1.getAge()< o2.getAge()){
			return -1;
		}
			return 0;
	}

}
