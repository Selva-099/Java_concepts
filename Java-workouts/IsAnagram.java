package workouts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsAnagram {

	public static void main(String[] args) {
		
		String str1 = "selvaa";
		String str2 = "sevaag";
		boolean isAnagram = false;
		
		StringBuilder  str3 = new StringBuilder(str2);
		
		
		if(str1.length()==str2.length()){
            for(int i=0; i<str1.length();i++){
                for(int j=0; j<str3.length();j++){
                    if(str1.charAt(i)==str3.charAt(j)){
                    	str3.deleteCharAt(j);
                        if(i==str1.length()-1 && str3.length()==0){
                        	isAnagram=true;
                            break;
                        }
                        break;
                    }
                }
            }
		}
		
		
//		char char1[] = str1.toCharArray();
//		char char2[] = str2.toCharArray();
//		
//		int char1Length = char1.length;
//		int char2Length = char2.length;
//		
//		boolean isAnagram = true;
//		
//		if(char1Length != char2Length) {
//			isAnagram = false;
//		}
//		
//		Arrays.sort(char1);
//		Arrays.sort(char2);
//		
//		for (int i = 0; i < char1Length; i++) {
//            if (char1[i] != char2[i]) {
//            	isAnagram = false;
//            }
//		}
//		
		if(isAnagram) {
			System.out.println("Is Anagram");
		}else {
			System.out.println("Is not Anagram");
		}
 
		
		//arrayList.remove('a');
		//arrayList.remove(str1.charAt(4));
		//System.out.println(arrayList);
//		
//		int stringLength = str1.length();
//		for(int i = 0; i< stringLength; i++) {
//			arrayList.add(str1.charAt(i));
//		}
//		
//		stringLength = str2.length();
//		
//		for(int i = 0; i< stringLength; i++) {
//			arrayList.remove(str2.charAt(i));
//		}
	}

}
