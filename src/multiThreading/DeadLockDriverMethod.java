package multiThreading;

public class DeadLockDriverMethod extends Thread {
	
	DeadLockOperationMethodA da = new DeadLockOperationMethodA();
	DeadLockOperationMethodB db = new DeadLockOperationMethodB();
	
	public void m1() throws InterruptedException {
		this.start();
		da.d1(db);
	}
	
	public void run() {
		try {
			db.d1(da);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		DeadLockDriverMethod ddm = new DeadLockDriverMethod();
		ddm.m1();

	}

}
