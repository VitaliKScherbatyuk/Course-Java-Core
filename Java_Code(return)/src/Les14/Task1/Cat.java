package Les14.Task1;

import java.util.Comparator;
import java.util.TreeSet;

public class Cat implements Comparable<Cat> {

	public String name;
	public int age;
	
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}


	@Override
	public int compareTo(Cat o) {
		
		return this.name.compareTo(o.getName());
	}

	
	
}
