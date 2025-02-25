package accessmodifiers;

public class FinalModifier {
	
	private static final String val1 = "Value - 1";
	private final String val2 = "Value - 2";
	
	

	public static void main(String[] args) {
		
		final String val3 = "value - 3";
		FinalModifier fm = new FinalModifier();
		
		System.out.println(val1 +" :: "+ fm.val2 +" :: "+ val3);
		
		fm.displayName("Inside method A", "Inside method A");

	}
	
	public void displayName(final String a, String b) {
		
		
		b = "Inside method B";
		
		System.out.println(a+":"+b);
		
		System.out.println(val2);
		
	}

}
