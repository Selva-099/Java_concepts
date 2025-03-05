package accessmodifiers;


public class StaticModifier {
	
	static {
		System.out.println("This is static block");
	}

	public static void main(String[] args) {
		System.out.println("JVM invoked main method");
	}

	public static void main(int[] args) {
		System.out.println("Method overloading");
	}

}

class StaticModifierChild extends StaticModifier{
	
	public static void main(String[] args) {
		System.out.println("Method Hidding not overriding");
		
		StaticModifierChild sm = new StaticModifierChild();
		
		StaticModifierChild.overthinker innerObj = sm.new overthinker();
		innerObj.m1();
		
	}
	
	protected class overthinker{
		public void m1() {
			System.out.println("This is inner class");
		}
	};	
	
}

class StaticModifierChild2 extends StaticModifier{
	
	// Parent main method available by default
}
