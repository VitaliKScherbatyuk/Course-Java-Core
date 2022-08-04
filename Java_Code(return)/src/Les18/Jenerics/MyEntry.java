/*
 * @author Scherbatyuk
 */

package Les18.Jenerics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MyEntry<K, V> {

	K obj1;
	V obj2;

	public MyEntry(K obj1, V obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public MyEntry() {
	}

	public K getObj1() {
		return obj1;
	}
	public void setObj1(K obj1) {
		this.obj1 = obj1;
	}
	public V getObj2() {
		return obj2;
	}
	public void setObj2(V obj2) {
		this.obj2 = obj2;
	}
	@Override
	public String toString() {
		return "MyEntry [obj1=" + obj1 + ", obj2=" + obj2 + "]";
	}


	Map <K,V> maps = new HashMap<>();

	/** Метод для додавання об'єкту*/
	void add( K Obj1,  V Obj2) {
		maps.put(Obj1, Obj2);
		System.out.println(maps.toString());
	}

	/** Метод для видалення об'єкту за ключем */
	void dell_Key(K Obj1) {
		maps.remove(Obj1);
		System.out.println(maps.toString());
	}

	/** Метод для видалення об'єкту за значенням */
	void dell_value(V Obj2) {
		Iterator<Entry<K, V>> iterator = maps.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			if(next.getValue().equals(Obj2)) {
				next.setValue(null);
				System.out.println(maps.toString());
			}	
		}
	}	

	/** Метод для виведення Set ключів */	
	void Keys() {
		System.out.println("Містяться наступні ключі: ");
		Iterator<Entry<K, V>> iterator = maps.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			System.out.println(next.getKey());
		}
	}

	/** Метод для виведення List значень */
	void List_value() {
		System.out.println("Міститься наступний List значень: ");
		Iterator<Entry<K, V>> iterator = maps.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			if(next.getValue()!=null) {
				System.out.println(next.getValue());
			}	
		}
	}

	/** Метод для виведення на екран цілої мапи*/
	void display() {
		Iterator<Entry<K, V>> iterator = maps.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			if(next.getValue()!=null) {
				System.out.println("Key - " + next.getKey().toString() + " , Value - " + next.getValue().toString());
			}	
		}
	}

}
















