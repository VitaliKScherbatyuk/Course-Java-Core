package Les5.Pet;

public class Main {

	public static void main(String[] args) {
		/* �������� ����������� ���� Pet , � ����� ��������� ����������� ����� voice(). 
		 * �������� ����� Cow, Cat, Dog, �� ����������� �� Pet. ������������� � ��� ����� voice(), 
		 * ���, ��� ���������� ���� � ����� main, �� ������� ���������� : �� ��- �����-�����, 
		 * �� ��� - �����-�����, �� ������- ����-����.
		 */

		Cow cow = new Cow();
		cow.voice();
		Cat cat = new Cat();
		cat.voice();
		Dog dog = new Dog();
		dog.voice();
		
	}

}
