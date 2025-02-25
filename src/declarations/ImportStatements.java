package declarations;

import java.util.*; // Implicit import (Importing all classes present in the Util package)
import java.util.ArrayList;// Explicit import (Importing particular class the Util package)

//import accessmodifiers.MethodClasses; // Comment this line and test the output
import amtest.*;

import static accessmodifiers.MethodClasses.bigValue;
import static java.lang.System.out;

//import static java.lang.Integer.MAX_VALUE; // Comment this line and test the output
import static java.lang.Byte.*;




public class ImportStatements {
	
	//public static int MAX_VALUE = 999; // Comment this line and test the output

	public static void main(String[] args) {
		
		java.util.ArrayList<String> al = new java.util.ArrayList<>(); // Fully qualified name
		al.add("Selva");
		
		System.out.println(al);
		
		ArrayList<String> aln = new ArrayList<>(); // After import
		aln.add("Selvan");
		System.out.println(aln);
		
		List<String> all = new ArrayList<>(); // After import
		all.add("List Selvan");
		System.out.println(all);
		
		MethodClasses mc = new MethodClasses();
		mc.displaySomeValue();
		
		System.out.println(bigValue);
		
		out.println("Out static import");
		
		out.println(MAX_VALUE);
		
		
	}

}
