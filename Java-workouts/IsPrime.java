package workouts;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		int iterator = 2;
		boolean isPrime = true; 
		if(inputNumber != 1 && inputNumber != 2) {
			while(iterator < inputNumber) {
				if(inputNumber % iterator == 0) {
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
