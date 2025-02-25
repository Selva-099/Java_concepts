package declarations;

public class SourceStructure {

	public void sourceMethod() {
		System.out.println("Public class method");
	}
}

class SourceStructures {

	public static void main(String args[]) {
		SourceStructure ss = new SourceStructure();
		System.out.println("Private method Main method");
		
		ss.sourceMethod();

	}
}
