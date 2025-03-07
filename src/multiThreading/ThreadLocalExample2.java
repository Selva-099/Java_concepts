package multiThreading;


class ParentThread extends Thread{
	public static InheritableThreadLocal tl = new InheritableThreadLocal<>() {
		
		public Object childValue(Object p) {
			return "CC";
		}
	};
	
	public void run() {
		tl.set("PP");
		System.out.println("Parent Thread Value "+tl.get());
		ChildThread ct = new ChildThread();
		Thread t = new Thread(ct);
		t.start();
		
	}
}

class ChildThread implements Runnable{
	
	public void run() {
		System.out.println("Child Thread Value "+ParentThread.tl.get());
	}
}


public class ThreadLocalExample2 {

	public static void main(String[] args) {
		ParentThread pt = new ParentThread();
		pt.start();

	}

}
