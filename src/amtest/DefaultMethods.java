package amtest;

public class DefaultMethods {
	
	public void method() {
		System.out.println("DefaultMethods public method");
	}

	// If we not specifying the modifier "default" modifier will assign. 
	//But we cannot include default keyword on method signature except interface
	
	void m1() {
		System.out.println("DefaultMethods M1");
	}

}
