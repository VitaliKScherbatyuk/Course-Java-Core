package Les4.Robot;

public class Main {

	public static void main(String[] args) {

		/* Створити клас Robot i класи CoffeRobot, RobotDancer, RobotCoocker, які будуть
		 * нащадками Robot. Для Robot, щоб на консоль виводився текст «Я Robot – я просто працюю». 
		 * Для CoffeRobot, щоб на консоль виводився текст «Я CoffeRobot – я варю каву». Для
		 * RobotDancer, щоб на консоль виводився текст «Я RobotDancer – я просто
		 * танцюю». Для RobotCoocker, щоб на консоль виводився текст «Я RobotCoocker – я
		 * просто готую». Створити в Main класі екземпляри вищеописаних класів і
		 * викликати до кожного з них метод work().
		 * Створити в Main класі масив класу Robot , заповнити масив екземплярами
		 * вищеописаних класів. Створити цикл for , пройтись по всіх елементах масиву і
		 * викликати для кожного елемент масиву метод work().
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
