 /* @author Scherbatyuk*/

package Les17.Inner_class;

public class Main {

	public static void main(String[] args) {

		Number []array = {5,17,62,85,25,12,36,45,12,10,1};

		Collection c = new Collection(array);

		System.out.println("Завдання 1:");
		Iterator createOne = c.createOne();

		while (createOne.hasNext()) {
			System.out.println(createOne.next());		
		}

		System.out.println();

		for (Number number : array) {
			if(number.intValue()%2==1){
				number=0;
			}
			System.out.println(number);
		}

		System.out.println();
		System.out.println("Завдання 2:");

		Iterator createTwo = c.createTwo();

		for (int i = 0; i < array.length; i++) {

			if(i%2==0) {
				Number number = array[i];
				System.out.println(number);
			}
		}

		System.out.println();
		System.out.println("Завдання 3 - анонімний клас:");

		Iterator anonimus = c.anonimus();
		while(anonimus.hasNext()) {
			System.out.println(anonimus.next());
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {

			if(i%3==1) {
				Number number = array[i];
				System.out.println(number);
			}
		}

		System.out.println();
		System.out.println("Завдання 4 - анонімний клас:");

		Iterator local = c.local();

		for (int i = 0; i < array.length; i++) {

			if(i%5==0) {
				Number number = array[i];
				number = number.intValue()-100;
				System.out.println(number);
			}
		}

		System.out.println();
		System.out.println("Завдання 5 - анонімний клас:");

		Iterator new_static = c.new_static();

		while (new_static.hasNext()) {
			System.out.println(new_static.next());		
		}

		System.out.println();

		for (int i = 0; i < array.length; i++) {
			Number number = array[i];

			if(i%2==1 && number.intValue()%2==0) {

				number = number.intValue()-1;	
			}
			System.out.println(number);

		}
	}
}



















