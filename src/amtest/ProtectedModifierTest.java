package amtest;

import java.util.ArrayList;
import java.util.List;

import accessmodifiers.ProtectedModifier;

public class ProtectedModifierTest extends ProtectedModifier {

	public static void main(String[] args) {

		ProtectedModifierTest pmt = new ProtectedModifierTest();
		pmt.protectedMethodFromMain("PMT");// Only access protected member from outside package with child class reference	
		
		ProtectedModifier ps = new ProtectedModifier();
		
		ProtectedModifier ps1 = new ProtectedModifierTest();
		
		List<String> ls = new ArrayList<String>();
		
		
		
	}

}
