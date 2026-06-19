package multiThreading;

class CookingTask extends Thread {
	private String task;

	CookingTask(String task) {
		this.task = task;
	}

	public void run() {
		System.out.println("Before sleep " + task + " is being prepared by " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			System.out.println("After sleep " + task + " is being prepared by " + Thread.currentThread().getName());

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Restaurant {
	public static void main(String[] args) {
		Thread t1 = new CookingTask("Dosa");
		Thread t2 = new CookingTask("Idly");
		Thread t3 = new CookingTask("Vada");
		CookingTask t4 = new CookingTask("Puri");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
