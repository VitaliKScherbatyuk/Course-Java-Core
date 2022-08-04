package Les16.Salary;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Worker {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException {

		/*
		 * Min:
		 * 1. Створити довільний клас , описати його. Створити в мейн його екземпляр, дослідити всю інформацію про цього.=
		 * 
		 * Max:
		 * 2. Перезапишіть значення поля класу за допомогою рефлексії. 
		 * 3. Створіть в класі і викличте за допомогою рефлексії методи  myMethod(String a, int ... args) та  myMethod(String … args) 
		 */
		
		System.out.println("Завдання №1:");
		Class pc = Hourly.class;
		String nameOfClass = pc.getName();
		System.out.println("Ім'я з пакетом - " + nameOfClass);

		String simpleName = pc.getSimpleName();
		System.out.println("Ім'я без пакету - " + simpleName);

		int modifiers = pc.getModifiers();
		String modiferText = Modifier.toString(modifiers);
		System.out.println("Чи клас є abstract - " + Modifier.isAbstract(modifiers));
		System.out.println("Чи клас є final - " + Modifier.isFinal(modifiers));
		System.out.println("Чи клас є interface - " + Modifier.isInterface(modifiers));
		System.out.println("Чи клас є private - " + Modifier.isPrivate(modifiers));
		System.out.println("Чи клас є public - " + Modifier.isPublic(modifiers));

		Package package1 = pc.getPackage();
		System.out.println("Назва пакету - " + package1);

		Class superclass = pc.getSuperclass();
		System.out.println("Назва суперкласу - " + superclass);

		Class[] interfaces = pc.getInterfaces();
		System.out.println("Інтерфейс - " + Arrays.toString(interfaces));

		Constructor[] constructors = pc.getConstructors();
		for (int i = 0; i < constructors.length; i++) {
			Constructor constructor = constructors[i];
			System.out.println("Конструктор - " + i + " " + Arrays.toString(constructors));
			System.out.println("Кількість конструкторів - " + constructors.length);
		}

		Constructor constructor = pc.getConstructor(int.class);
		System.out.println("Параметр конструктора Hourly -  " + constructor);

		Field[] fields = pc.getFields();
		fields = pc.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println("Викликаємо філди конструктора - " + field);
		}

		Method[] methods = pc.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			System.out.println("Витягуємо методи класу Hourly №" + i+ " " + method);
		}

		System.out.println("Завдання №2:");

		Constructor constructor1 = pc.getConstructor(int.class);
		Hourly newHourly = new Hourly(modifiers);
		newHourly.setHourly(600);

		System.out.println("Створено новий об'єкт із значенням - " + newHourly);


//
//		Hourly hourly = new Hourly(150);
//		hourly.salary();
//
//		Monthly monthly = new Monthly(26000);
//		monthly.salary();
	}

}
