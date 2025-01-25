package multiThreading;

/*
 * Two threads are executed simultaneously the value of the variables will be inconsistent
 * To avoid this inconsistency we can use the synchronized key word.
 * But need conscious while using synchronized 
 * Remove the synchronized
 */

class Brackets{
	synchronized void printBrackets() {
		for(int i=1; i<=20;i++) {
			if(i<=10)
				System.out.print("[");
			else
				System.out.print("]");
		}
		System.out.println();
	}
}


public class SynchronizedKeyWord {
	
	

	public static void main(String[] args) {
		Brackets brackets = new Brackets();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++)
					brackets.printBrackets();
				
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++)
					brackets.printBrackets();
				
			}
		}).start();;
	}

}

//[[[[[]]]]]
//[[[[[]]]]]


