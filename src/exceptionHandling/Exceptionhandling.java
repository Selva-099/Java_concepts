package exceptionHandling;

public class Exceptionhandling {
	
	static Exceptionhandling eh = new Exceptionhandling();
	public static void main(String[] args) {
		try {
			eh.doStuff();
		}catch(ArithmeticException ae) {
			throw new ArithmeticException("Impossible calculation exception");
		}
		
	}
	
	public void doStuff() {
		try {
			eh.doMoreStuff();
		}catch(ArithmeticException ae) {
			throw ae;
		}
	}
	
	public void doMoreStuff() throws ArithmeticException {
		System.out.println(10/0);
	}

}
