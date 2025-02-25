package accessmodifiers;

//Floating-point expressions are always strictly evaluated from source level 17. Keyword 'strictfp' is not required.
strictfp class  StrictFPModifierParent{
	
	public void floatingCalculation() {
		System.out.println(10/3);
	}
}



public class StrictFPModifier extends StrictFPModifierParent {

	public static void main(String[] args) {
		StrictFPModifierParent sp = new StrictFPModifierParent();
		sp.floatingCalculation();
		
		System.out.println(20/3);

	}

}
