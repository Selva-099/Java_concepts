/*Static synchronization and Non-static synchronization and normal method calls
 * 
 * 
 * 
 */



package multiThreading;

public class DriverCalss {

	public static void main(String[] args) {

		OperationsClass oc = new OperationsClass();
		OperationsClass oc1 = new OperationsClass();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					OperationsClass.method1();// static sync method
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(10);
					oc.method2();// Normal sync method
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(20);
					oc.method3();// Normal method
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		});

		Thread t4 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					
					Thread.sleep(15);
					oc1.method5(); // Static sync
					oc.method4();// Normal sync method
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
