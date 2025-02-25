package accessmodifiers;


public class StaticModifier {

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
	}
	
}

class StaticModifierChild2 extends StaticModifier{
	
	// Parent main method available by default
}
