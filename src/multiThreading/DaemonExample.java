package multiThreading;

class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1);
				System.out.println("Child Thread");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}

public class DaemonExample {

	public static void main(String[] args) {
		MyThread m = new MyThread();
		m.setDaemon(true);
		m.start();
		System.out.println("End of Main thread");

	}

}
