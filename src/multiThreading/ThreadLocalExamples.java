package multiThreading;


class CustomerThread extends Thread{
	static Integer custId = 0;
	
	private static ThreadLocal tl = new ThreadLocal() {
		protected Integer initialValue() {
			return ++custId;
		}
	};
	
	 CustomerThread(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Executing with Cust ID "+tl.get());
	}
	
	
}


public class ThreadLocalExamples {

	public static void main(String[] args) {
		
		CustomerThread ct1 = new CustomerThread("Selvan");
		CustomerThread ct2 = new CustomerThread("Arun Kumar");
		CustomerThread ct3 = new CustomerThread("Thiru");
		
		ct1.start();
		ct2.start();
		ct3.start();
		
		
		
		ThreadLocal tl1 = new ThreadLocal(){
			public Object initialValue() {
				return "Arun";
			}
		};
		
		System.out.println(tl1.get());
		tl1.set("Selva");
		System.out.println(tl1.get());
		tl1.remove();
		System.out.println(tl1.get());
		
		

	}

}
