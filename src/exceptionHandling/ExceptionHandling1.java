package exceptionHandling;

public class ExceptionHandling1 {
	
	static ExceptionHandling1 eh = new ExceptionHandling1();
	public static void main(String[] args) {
		
			eh.doStuff();
		
		
	}
	
	public void doStuff() {
		
			eh.doMoreStuff();
		
	}
	
	public void doMoreStuff() {
		try {
			System.out.println(10/0);
		}catch(ArithmeticException ae) {
			System.out.println(ae.toString());
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
	}

}
