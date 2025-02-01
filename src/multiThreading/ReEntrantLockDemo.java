package multiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class ReMyThread extends Thread{
	
	static ReentrantLock l = new ReentrantLock();
	ReMyThread(String name){
		super(name);
	}
	
	
	public void run() {
		try{
		do {
			if(l.tryLock(3000, TimeUnit.MILLISECONDS)) {
				try {
					System.out.println(Thread.currentThread().getName()+" got the lock and running ");
					Thread.sleep(10000);
					System.out.println(Thread.currentThread().getName()+" Releases the lock ");
					l.unlock();
					break;
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				System.out.println(Thread.currentThread().getName()+" cannot get the lock and will try again ");
			}
		}while(true);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}


public class ReEntrantLockDemo {

	public static void main(String[] args) {
		
		ReMyThread t1 = new ReMyThread("First Thread");
		ReMyThread t2 = new ReMyThread("Second Thread");
		
		t1.start();
		t2.start();

	}

}
