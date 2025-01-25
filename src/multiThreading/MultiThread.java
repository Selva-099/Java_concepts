package multiThreading;


class CounterClass extends Thread{
	
	private int threadNumber;
	
	public CounterClass(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	@Override
	public void run() {
		try {
			countme();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void countme() throws InterruptedException {
		for (int i=0; i<10;i++) {
			sleep(500);
			System.out.println("Thread Number - "+threadNumber+" on Iteration - "+i);
		}
	}
}


class CounterRunnableClass implements Runnable{
	
	private int threadNumber;
	
	public CounterRunnableClass(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	@Override
	public void run() {
		try {
			countme();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void countme() throws InterruptedException {
		for (int i=0; i<10;i++) {
			Thread.sleep(500);
			System.out.println("Thread Number - "+threadNumber+" on Iteration - "+i);
		}
	}
}


public class MultiThread {

	public static void main(String[] args) {
//		CounterClass counter1 = new CounterClass(1);
//		CounterClass counter2 = new CounterClass(2);
//		CounterClass counter3 = new CounterClass(3);
//		
//		// We can call the run method directly. But when calling the run method then it will act as normal process not a Multithreading process 
//		
//		counter1.run();
//		System.out.println("---------------");
//		counter2.run();
//		System.out.println("---------------");
//		counter3.run();
//		
//		counter1.start();
//		System.out.println("---------------");
//		counter2.start();
//		System.out.println("---------------");
//		counter3.start();
		
		
		Thread thread1 = new Thread(new CounterClass(1));
		Thread thread2 = new Thread(new CounterClass(2));
		Thread thread3 = new Thread(new CounterClass(3));
		
		// We can call the run method directly. But when calling the run method then it will act as normal process not a Multithreading process 
		
		thread1.run();
		System.out.println("---------------");
		thread2.run();
		System.out.println("---------------");
		thread3.run();
		
		thread1.start();
		System.out.println("---------------");
		thread2.start();
		System.out.println("---------------");
		thread3.start();

	}

}
