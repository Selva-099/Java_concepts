package workouts;

import java.util.Scanner;

public class StringPalindrome {

public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int lengthOfA = A.length();
        boolean isPalindrome = false;
        for (int i = 0 ;i<=lengthOfA/2; i++){
            if(A.charAt(i) == A.charAt(lengthOfA - i-1)){
            	isPalindrome = true;
            }else {
            	isPalindrome = false;
            	break;
            }
        }
        
        if(isPalindrome)
        	System.out.println("Yes");
        else
        	System.out.println("No");
    }
}
