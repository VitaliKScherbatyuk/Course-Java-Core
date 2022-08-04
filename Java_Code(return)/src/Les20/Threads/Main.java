/**
 *@author Scherbatyuk
 **/
package Les20.Threads;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * ̳����:
		 * 
		 * 1) �������� ���� MyThread ���������� ���� �� ����� Thread. �������������
		 * ����� run(), ��� ��� ����� ���� ������� ������� � ������ ������� �����
		 * Գ������. ��� ����� ������������� � ����� run() ���� Scanner. ����� ��
		 * ������� � ������ ������ �� ������ ������ ����� Գ������ � �� �� �������� �
		 * ��������� � 1 �������.
		 * 
		 * �������� ���� RunnableThread �������������� ���� �� ���������� Runnable.
		 * ����� run() ������������� ����� �����, ��� ����� Գ������ ���������� �
		 * ����������� �������. ����� ������ ����� ����� Scanner ������ �� ������
		 * ������ ����� Գ������, ���� � ��������� � 1 ������� ������� �� ��
		 * ���������� �� ������� ��������.
		 * 
		 * ������ � ������ ������ ������ �������� � ���� ����� �����. ������ �� ������
		 * : ���� Thread : 1 1 2 3 5 . . . ���� Runnable: . . .5 3 2 1 1
		 * 
		 * ��������:
		 * 
		 * 2) ��������� �������� �������� �������������� ��� ���� ExecutorServices 
		 */
		
		/** �������� 1: */
		MyThread myThread = new MyThread(1000);
		myThread.start();
		myThread.join();

		RunnableThread runnableThread = new RunnableThread(1000);

		/** �������� 2: */

//		
//		MyThread myThread = new MyThread(1000);
//		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
//		System.out.println(".newFixedThreadPool():");
//		newFixedThreadPool.execute(myThread);
//		newFixedThreadPool.shutdown();
//
//		ExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(10);
//		System.out.println(".newScheduledThreadPool()");
//		newScheduledThreadPool.execute(new MyThread(1000));
//		newScheduledThreadPool.shutdown();

	}
}
