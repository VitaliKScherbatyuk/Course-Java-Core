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
		 * 1. �������� �������� ���� , ������� ����. �������� � ���� ���� ���������, �������� ��� ���������� ��� �����.=
		 * 
		 * Max:
		 * 2. ������������ �������� ���� ����� �� ��������� �������. 
		 * 3. ������� � ���� � �������� �� ��������� ������� ������  myMethod(String a, int ... args) ��  myMethod(String � args) 
		 */
		
		System.out.println("�������� �1:");
		Class pc = Hourly.class;
		String nameOfClass = pc.getName();
		System.out.println("��'� � ������� - " + nameOfClass);

		String simpleName = pc.getSimpleName();
		System.out.println("��'� ��� ������ - " + simpleName);

		int modifiers = pc.getModifiers();
		String modiferText = Modifier.toString(modifiers);
		System.out.println("�� ���� � abstract - " + Modifier.isAbstract(modifiers));
		System.out.println("�� ���� � final - " + Modifier.isFinal(modifiers));
		System.out.println("�� ���� � interface - " + Modifier.isInterface(modifiers));
		System.out.println("�� ���� � private - " + Modifier.isPrivate(modifiers));
		System.out.println("�� ���� � public - " + Modifier.isPublic(modifiers));

		Package package1 = pc.getPackage();
		System.out.println("����� ������ - " + package1);

		Class superclass = pc.getSuperclass();
		System.out.println("����� ���������� - " + superclass);

		Class[] interfaces = pc.getInterfaces();
		System.out.println("��������� - " + Arrays.toString(interfaces));

		Constructor[] constructors = pc.getConstructors();
		for (int i = 0; i < constructors.length; i++) {
			Constructor constructor = constructors[i];
			System.out.println("����������� - " + i + " " + Arrays.toString(constructors));
			System.out.println("ʳ������ ������������ - " + constructors.length);
		}

		Constructor constructor = pc.getConstructor(int.class);
		System.out.println("�������� ������������ Hourly -  " + constructor);

		Field[] fields = pc.getFields();
		fields = pc.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println("��������� ����� ������������ - " + field);
		}

		Method[] methods = pc.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			System.out.println("�������� ������ ����� Hourly �" + i+ " " + method);
		}

		System.out.println("�������� �2:");

		Constructor constructor1 = pc.getConstructor(int.class);
		Hourly newHourly = new Hourly(modifiers);
		newHourly.setHourly(600);

		System.out.println("�������� ����� ��'��� �� ��������� - " + newHourly);


//
//		Hourly hourly = new Hourly(150);
//		hourly.salary();
//
//		Monthly monthly = new Monthly(26000);
//		monthly.salary();
	}

}
