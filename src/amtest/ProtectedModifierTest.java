package amtest;

import accessmodifiers.ProtectedModifier;

public class ProtectedModifierTest extends ProtectedModifier {

	public static void main(String[] args) {

		ProtectedModifierTest pmt = new ProtectedModifierTest();
		pmt.protectedMethodFromMain("PMT");// Only access protected member from outside package with child class reference		
		
	}

}
