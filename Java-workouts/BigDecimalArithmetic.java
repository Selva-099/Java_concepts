package workouts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BigDecimalArithmetic {

	public static void main(String[] args) {
		        Scanner sc= new Scanner(System.in);
		        int n=sc.nextInt();
		        String []s=new String[n+2];
		        for(int i=0;i<n;i++){
		            s[i]=sc.next();
		        }
		        sc.close();
		        
		        BigDecimal[] val = new BigDecimal[s.length];
		        for(int i=0; i<n; i++) {
		        	val[i] = new BigDecimal(s[i]);
		        }
		        Arrays.sort(val);
		        System.out.println(val);
		        
		        for(int i=0; i<n; i++) {
		        	for(int j=i+1; j<n; j++) {
		        	BigDecimal aBigDecimal = new BigDecimal(s[i]);
			          BigDecimal bBigDecimal = new BigDecimal(s[j]);
			          System.out.println(bBigDecimal.compareTo(aBigDecimal));
		        }}

		        Arrays.sort(s, 0, n, (a, b) -> {
		          BigDecimal aBigDecimal = new BigDecimal(a);
		          BigDecimal bBigDecimal = new BigDecimal(b);
		          return bBigDecimal.compareTo(aBigDecimal);
		      });
		        
		        for(int i=0;i<n;i++)
		          {
		              System.out.println(s[i]);
		          }
	}

}




//import java.math.BigDecimal;
//import java.util.*;
//class Solution{
//    public static void main(String []args){
//        //Input
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        String []s=new String[n+2];
//        for(int i=0;i<n;i++){
//            s[i]=sc.next();
//        }
//        sc.close();
//
//      Arrays.sort(s, 0, n, (a, b) -> {
//        BigDecimal aBigDecimal = new BigDecimal(a);
//        BigDecimal bBigDecimal = new BigDecimal(b);
//        return bBigDecimal.compareTo(aBigDecimal);
//    });
//
//        //Output
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(s[i]);
//        }
//    }
//}