package Les4.Robot;

public class Main {

	public static void main(String[] args) {

		/* �������� ���� Robot i ����� CoffeRobot, RobotDancer, RobotCoocker, �� ������
		 * ��������� Robot. ��� Robot, ��� �� ������� ��������� ����� �� Robot � � ������ �������. 
		 * ��� CoffeRobot, ��� �� ������� ��������� ����� �� CoffeRobot � � ���� ����. ���
		 * RobotDancer, ��� �� ������� ��������� ����� �� RobotDancer � � ������
		 * �������. ��� RobotCoocker, ��� �� ������� ��������� ����� �� RobotCoocker � �
		 * ������ ������. �������� � Main ���� ���������� ������������ ����� �
		 * ��������� �� ������� � ��� ����� work().
		 * �������� � Main ���� ����� ����� Robot , ��������� ����� ������������
		 * ������������ �����. �������� ���� for , �������� �� ��� ��������� ������ �
		 * ��������� ��� ������� ������� ������ ����� work().
		 */
		
		Robot robot = new Robot();
		robot.work();
		CoffeRobot coffeRobot = new CoffeRobot();
		coffeRobot.work();
		RobotDancer robotDancer = new RobotDancer();
		robotDancer.work();
		RobotCoocker robotCoocker = new RobotCoocker();
		robotCoocker.work();
	}

}
