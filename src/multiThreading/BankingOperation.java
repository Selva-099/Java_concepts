package multiThreading;

public class BankingOperation {

	private int balance = 0;

	synchronized public  void withdraw(int amount) throws InterruptedException {

		if (balance >= amount) {
			balance = balance - amount;
			System.out.println("Withdraw completed");
		} else {
			System.out.println("Waiting for Deposit....");
			wait();
			System.out.println("Balance Before withdraw"+balance);
			balance = balance - amount;
			System.out.println("Withdraw completed");
			System.out.println("Balance After withdraw"+balance);
		}

	}

	synchronized public  void deposit(int amount) throws InterruptedException {

		
			balance = balance + amount;
			System.out.println("Deposit completed");
			notify();
		

	}

}
