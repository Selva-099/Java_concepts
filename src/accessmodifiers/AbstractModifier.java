package accessmodifiers;

abstract class abstractParent{
	
	public abstract void m1();
	
}

 public class AbstractModifier extends abstractParent {

	
	
	
	public static void main(String[] args) {

		AbstractModifier am = new AbstractModifier();
		am.m1();

	}

	@Override
	public void m1() {
		
		System.out.println("M1 from AbstractModifier");
		
	}

}
