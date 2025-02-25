package accessmodifiers;

public class FinalModifer {

	private final int value = 100;

	public final void printValue() {
		System.out.println(value);
	}

	public void printFinalValue() {
		System.out.println(value);
	}

	public static void main(String[] args) {

		FinalModifer fm = new FinalModifer();
		fm.printValue();

	}

}

class childFinalModifier extends FinalModifer {

	private final int values = 200;

	public final void printFinalValue() {
		System.out.println(values+200);
	}
	
	public static void main(String[] args) {

		childFinalModifier fm = new childFinalModifier();
		fm.printFinalValue();

	}
	
}
