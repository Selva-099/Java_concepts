package workouts;

import java.util.Scanner;

public class PrintPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int iterator = 2;
		boolean isPrime = true; 
		if(number != 1 && number != 2) {
			while(iterator < number) {
				if(number % iterator == 0) {
					isPrime = false;
					break;
				}
				iterator++;
			}
		
			if(isPrime) {
				System.out.println("Is Prime");
			}else {
				System.out.println("Is not Prime");
			}
		}else {
			System.out.println("Is not Prime");
		}

	}

}
