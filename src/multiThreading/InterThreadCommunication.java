package multiThreading;

public class InterThreadCommunication {
	
	public static void main(String[] args) {

		System.out.println("Main Thread start");
		BankingOperation bo = new BankingOperation();// Same object for both the threads
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread T1 started");
				try {
					bo.withdraw(100);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread T2 started");
				try {
					Thread.sleep(10);
					bo.deposit(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});
		
		t1.start();
		t2.start();
		
		System.out.println("Main Thread Completed");

	}

}
