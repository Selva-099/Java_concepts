package workouts;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
			Pattern patterned = null;
			try {
				patterned = Pattern.compile(pattern);
				System.out.println(patterned);
				System.out.println("Valid");
				--testCases;
			}catch(Exception e) {
				System.out.println("Invalid");
				--testCases;
			}
		}
	}

}
