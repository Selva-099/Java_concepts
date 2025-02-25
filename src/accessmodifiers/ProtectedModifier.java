package accessmodifiers;

class parentProtected {

	protected void protectedMethod(String name) {

		System.out.println("Parent class protected method from method " + name);
	}

}

public class ProtectedModifier extends parentProtected {

	public static void main(String[] args) {

		parentProtected pp = new parentProtected();
		pp.protectedMethod("PP");

		ProtectedModifier pm = new ProtectedModifier();
		pm.protectedMethod("PM");

		parentProtected pp1 = new ProtectedModifier();
		pp1.protectedMethod("PP1");

	}

	protected void protectedMethodFromMain(String name) {

		System.out.println("Parent class protected method from method " + name);
	}

}
