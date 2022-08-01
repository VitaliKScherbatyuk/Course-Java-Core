package Les9.MyExceptionInMathOperation;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * —творити св≥й Exception(MyException). —творити клас Methods, ќписати в ньому
		 * методи , €к≥ б
		 * 
		 * розраховували додаванн€, в≥дн≥манн€, множенн€, д≥ленн€ двох зм≥нних . ѕри
		 * цьому врахувати :
		 * 
		 * Ч якщо a<0 ≥ b<0 викидаЇмо IllegalArgumentException
		 * 
		 * Ч якщо a=0 ≥ b!=0 або a!=0 ≥ b=0 викидаЇмо ArithmeticException
		 * 
		 * Ч якщо a=0 ≥ b=0 викидаЇмо IllegalAccessException
		 * 
		 * Ч якщо a>0 ≥ b>0 викидаЇмо MyException
		 * 
		 * ѕротестувати вс≥ можлив≥ вар≥анти, ≥ вивести все на консоль.
		 */

		Methods methods = new Methods(0, 3);
		methods.add();
		methods.subtraction();
		methods.multiplication();
		methods.division();
	}

}
