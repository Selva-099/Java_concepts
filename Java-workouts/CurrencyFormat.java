package workouts;


import java.util.*;
import java.text.*;


public class CurrencyFormat {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
  
        NumberFormat usdFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usdFormat.format(payment); 
        
        NumberFormat inrFormat = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String india = inrFormat.format(payment); 
        
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormat.format(payment); 
        
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceFormat.format(payment); 
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}


