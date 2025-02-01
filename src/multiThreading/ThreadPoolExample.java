package multiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyRunnable implements Runnable{
	String name;
	public MyRunnable(String name) {
		this.name = name;
	}
	
	public void run() {
		try {
			System.out.println(name+" is started by "+Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println(name+" is Completed by "+Thread.currentThread().getName());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MyCallable implements Callable{
	int number;
	public MyCallable(int number) {
		this.number = number;
	}
	
	public Object call() {
		int sum = 0;
		try {
			Thread.sleep(2000);
			sum = number*number;
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		return sum;
	}
}


public class ThreadPoolExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyRunnable[] myRunnable = {new MyRunnable("Selva"), new MyRunnable("Arun"), new MyRunnable("Kumar"),new MyRunnable("Mani")};
		
		ExecutorService service = Executors.newFixedThreadPool(2);// Two threads are responsible for execute 3 runnable. Single thread will resuse in this case
		
		for(MyRunnable mr : myRunnable) {
			service.submit(mr);
//			System.out.println(r.get().toString());
		}
		
		service.shutdown();
		
		
		MyCallable[] myCallable = {new MyCallable(5), new MyCallable(6), new MyCallable(7),new MyCallable(8)};
		
		ExecutorService callService = Executors.newFixedThreadPool(2);// Two threads are responsible for execute 3 runnable. Single thread will resuse in this case
		
		for(MyCallable mr : myCallable) {
			Future r = callService.submit(mr);
			System.out.println("The square Values are "+r.get().toString());
		}
		
		callService.shutdown();
		

	}

}
