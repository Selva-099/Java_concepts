package workouts;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagChecker {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0 && in.hasNextLine()) {
			String line = in.nextLine();
			String[] lines = line.split("\n");
			for (String string : lines) {
				String regex = "<(.+)>([^<>]+)</\\1>";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(string);
				while (matcher.find()) {
					String match = matcher.group(2);
					System.out.println(match);
				}

				matcher.reset();

				if (matcher.find() == false) {
					System.out.println("None");
				}
			}
			testCases--;
		}
		in.close();
	}
//}

//	public static void main(String[] args){
//
//	    Scanner in = new Scanner(System.in);
//	    int testCases = Integer.parseInt(in.nextLine());
//	    while(testCases>0){
//	        String line = in.nextLine();
//	        Matcher matcher = Pattern.compile("<(.+)>(([^<>]+))</\\1>").matcher(line);  
//	        if (matcher.find() == false) {  
//	            System.out.println("None");  
//	            continue;  
//	        }  
//	        matcher.reset();  
//	        while (matcher.find() == true){  
//	            System.out.println(matcher.group(2));  
//	        }   
//
//	        testCases--;
//	    }
//	}
}
