/**
 *@author Scherbatyuk
 **/

package Les20.Threads;

import java.util.Scanner;

public class MyThread extends Thread{

	int number;

	public MyThread(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		super.run();
		System.out.println("Введіть кількість чисел Фібоначі: ");
		Scanner sc = new Scanner (System.in);
		int key = sc.nextInt();

		int n0 = 1;
		int n1 = 1;
		int n2;
		System.out.print("Потік Thread: " +n0+" "+n1+" ");
		for(int i = 3; i <= key; i++){
			n2=n0+n1;
			System.out.print(n2+" ");
			n0=n1;
			n1=n2;
			try {
				Thread.sleep(number);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n");
	}

}
