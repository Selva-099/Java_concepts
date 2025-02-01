package multiThreading;

class ThreadGroupThread1 extends Thread {
	@Override
	public void run() {
		try {
			sleep(3000);
			System.out.println("I am Thread 1");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ThreadGroupThread2 extends Thread {
	@Override
	public void run() {
		try {
			sleep(3000);
			System.out.println("I am Thread 2");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ThreadGroupThread3 extends Thread {

	@Override
	public void run() {
		try {
			sleep(3000);
			System.out.println("I am Thread 3");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadGroupExamples {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] systemThreadArray = new Thread[system.activeCount()];
		system.enumerate(systemThreadArray);
		for (Thread st : systemThreadArray) {
			System.out.println(st.getName()+"....."+st.isDaemon());
		}
		
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

		ThreadGroup g = new ThreadGroup("My Group");
		System.out.println(g.getParent().getName());
		ThreadGroup cg = new ThreadGroup(g, "Child Group");
		System.out.println(cg.getParent().getName());

		System.out.println(g.getMaxPriority());

		Thread t1 = new Thread(cg, new ThreadGroupThread1(), "First Thread");
		Thread t2 = new Thread(cg, new ThreadGroupThread2(), "Second Thread");
		g.setMaxPriority(3);
		Thread t3 = new Thread(cg, new ThreadGroupThread3(), "Third Thread");
		System.out.println(g.getMaxPriority());
		System.out.println(t1.getPriority());

		t1.start();
		t2.start();
		t3.start();

		cg.list();

		Thread[] t = new Thread[cg.activeCount()];

		cg.enumerate(t);// Counts only active threads

		for (Thread ts : t) {
			System.out.println(ts.getName());
		}
		//Thread.sleep(5000);
		System.out.println(g.activeCount());//Counts child group threads also
		System.out.println(cg.activeGroupCount());
		
		

	}

}
