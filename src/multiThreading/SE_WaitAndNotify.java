package multiThreading;

public class SE_WaitAndNotify {

	public static void main(String[] args) {
		
		SE_WaitAndNotify main = new SE_WaitAndNotify();
		Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    main.withdraw(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                main.deposit(2000);
            }
        });

        thread1.start();
        thread2.start();

	}
	
	public static int balance = 0;

    synchronized public void withdraw(int amount) throws InterruptedException {
        if (balance <= 0) {
            System.out.println("Waiting for balance update after withdrawal of $" + amount);
            wait();
        }
        balance = balance - amount;
        System.out.println("Current balance after withdrawal: $" + balance);
    }

    public void deposit(int amount) {
        synchronized(this) {
            System.out.println("Depositing $" + amount + " to the account.");
            balance = balance + amount;
            notify();
        }
    }

}
