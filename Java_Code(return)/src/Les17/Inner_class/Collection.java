 /* @author Scherbatyuk*/

package Les17.Inner_class;

public class Collection {

	private static Number [] array;

	public Collection(Number[] array) {
		super();
		this.array = array;
	}

	public Number[] getArray() {
		return array;
	}

	public void setArray(Number[] array) {
		this.array = array;
	}

	/**�������������� ������ ����*/
	class One implements Iterator{

		private int counter = 0;

		@Override
		public boolean hasNext() {

			return counter < array.length;
		}

		@Override
		public Number next() {

			return array[counter++];
		}
	} 
	
	One createOne() {
		return new One();  
	}
	
    /**�������������� ������ ����*/
	class Two implements Iterator{
		int counter = array.length -1;

		@Override
		public boolean hasNext() {

			return counter>=0;
		}

		@Override
		public Number next() {

			return array[counter--];
		}
	}
	Two createTwo() {
		return new Two();
	}

	/**�������� ����*/
	public Iterator anonimus() {
		return new Iterator() {

			int counter = array.length -1;

			@Override
			public boolean hasNext() {

				return counter>=0;
			}

			@Override
			public Number next() {

				return array[counter--];
			}
		};
	}

	/**��������� ����*/
	public Iterator local() {
		class Local implements Iterator{

			private int counter = 0;

			@Override
			public boolean hasNext() {
				return counter < array.length;
			}

			@Override
			public Number next() {		
				return array[counter++];
			}
		}
		return new Local();
	}

	/**������������ ����*/
	private static class static_class implements Iterator{

		private int counter = 0;

		@Override
		public boolean hasNext() {	
			return counter<array.length;				
		}

		@Override
		public Number next() {
			return array[counter++];
		}
	}

	public static static_class new_static() {
		return new static_class();
	}

}
