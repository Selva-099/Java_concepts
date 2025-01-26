package multiThreading;

public class DeadLockOperationMethodA {
	
	synchronized public void d1(DeadLockOperationMethodB db) throws InterruptedException {
		System.out.println("DeadLockOperationMethodA d1 method Called");
		//Thread.sleep(6000);
		db.BClassLastMethod();
	}
	
	synchronized public void AClassLastMethod() {
		System.out.println("AClassLastMethod Called");
	}

}
