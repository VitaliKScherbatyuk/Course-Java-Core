package Les5.ReturnConstructor;

public class Main {

	public static void main(String[] args) {
		
		/*Створіть клас із двома перевантаженими конструкторами. Використовуючи ключове слово this, 
		 * викличте один конструктор в іншому
		 */
		
      class One{
    	  int number1;
    	  int number2;
    	  int number3;
		
        public One(int number1, int number2) {
			this.number1 = number1;
			this.number2 = number2;
		}

		public One(int number1, int number2, int number3) {
			this(number1, number2);
			this.number3 = number3;
		}
		void print() {
	         System.out.println("Resalt sum = " + (number1+number2+number3));
        }
      }
      
      One one = new One(5,1,5);
      one.print();
   
       }
       
	}



