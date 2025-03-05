package accessmodifiers;

public class FinalModifer {

	public int value = 100;

	public final void printValue() {

		//value = 200;
		System.out.println(value);
	}

	public void printFinalValue() {
		System.out.println(value);
	}

	public static void main(String[] args) {

		FinalModifer fm = new FinalModifer();
		fm.printValue();
		
		fm.printValue("Selva");

	}

	public void printValue(String a) {

		//value = 200;
		System.out.println(value);
	}

}

class childFinalModifier extends FinalModifer {

	//private final int value = 200;
	
	FinalModifer fm1 = new FinalModifer();

	public final void printFinalValue() {
		
		System.out.println(fm1.value+200);
	}
	
	public static void main(String[] args) {

		childFinalModifier fm = new childFinalModifier();
		fm.printFinalValue();

	}
	
}
