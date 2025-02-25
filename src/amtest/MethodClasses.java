package amtest;

public class MethodClasses {
	
	public void displaySomeValue() {
		System.out.println("Method class in amtest package");
	}
	
	public static void main(String[] args) {
		System.out.println("Method class in amtest package");
		
		DefaultMethods dm = new DefaultMethods();
		dm.m1();// It is default method available only within the package
		
	}
	

}
