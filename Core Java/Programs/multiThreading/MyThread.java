package multiThreading;

class MyThread1 extends Thread {
	
	public void run() {
		System.out.println("Thread created using Thread Class");
		System.out.println("Thread1 is running by " + Thread.currentThread().getName());
	}

}

class MyThread2 implements Runnable {

	public void run() {
		System.out.println("Thread created using Runnable Interface");
		System.out.println("Thread2 is running by " + Thread.currentThread().getName());
	}	
}

public class MyThread {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Start iteration of ============> "+i);
			try {
				Thread t1 = new MyThread1();
				t1.setName("Thread "+ i);
				Runnable obj = new MyThread2();
				Thread t2 = new Thread(obj,"Runnable Thread "+i);
				t1.start();
				t1.join();
				t2.start();
				t2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("End iteration of ============> "+i);
		}
	}
}
