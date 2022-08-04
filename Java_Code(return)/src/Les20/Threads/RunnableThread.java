/**
 *@author Scherbatyuk
 **/

package Les20.Threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunnableThread implements Runnable {

	int number;
	private Thread thread;

	public RunnableThread(int number) {
		this.number = number;
		this.thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("Введіть кількість чисел Фібоначі для зворотнього порядку: ");
		Scanner sc = new Scanner (System.in);
		int key = sc.nextInt();

		List<Integer> list = new ArrayList<>();

		int n0 = 1;
		int n1 = 1;
		int n2;

		list.add(n0);
		list.add(n1);

		for(int i = 3; i <= key; i++){
			n2=n0+n1;			
			n0=n1;
			n1=n2;
			list.add(n2);
		}
		System.out.print("Потік Runnable: ");
		for(int i = list.size()-1; i>=0;i--) {
			try {
				Thread.sleep(number);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(list.get(i)+" ");
		}
	}
}
