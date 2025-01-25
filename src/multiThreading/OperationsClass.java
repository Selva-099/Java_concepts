package multiThreading;

public class OperationsClass {
	
	synchronized public static void method1() throws InterruptedException {
		System.out.println("Static Sync1");
		Thread.sleep(5000);
	}
	
	synchronized public void method2() throws InterruptedException {
		System.out.println("Noraml Sync1");
		Thread.sleep(10000);
	}
	
	 public void method3() {
		System.out.println("Noraml Method");
	}
	 
	 synchronized public void method4() {
			System.out.println("Noraml Sync2");
		}
	 
	 synchronized public static void method5() throws InterruptedException {
			System.out.println("Static Sync2");
		}


}
