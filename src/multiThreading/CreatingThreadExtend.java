package multiThreading;


class CreatingThread extends Thread{
	
	
	@Override
	public void start() {
		super.start();
		System.out.println("Overrided Start method");
	}
	
	@Override
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("Child Thread");
		}
	}
	
}



public class CreatingThreadExtend {

	public static void main(String[] args) {
		CreatingThread ct = new CreatingThread();
		System.out.println("Creating Thread");
		ct.start();
		
		System.out.println("Calling Run method without creating new thread");
		ct.run();
		
		for(int i=0; i<10;i++) {
			System.out.println("Main Thread");
		}

	}

}
