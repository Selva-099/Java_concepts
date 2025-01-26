package multiThreading;

public class DeadLockOperationMethodB {
	
	synchronized public void d1(DeadLockOperationMethodA da) throws InterruptedException {
		System.out.println("DeadLockOperationMethodB d1 method Called");
		//Thread.sleep(5000);
		da.AClassLastMethod();
	}
	
	synchronized public void BClassLastMethod() {
		System.out.println("BClassLastMethod Called");
	}

}
