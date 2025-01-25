package multiThreading;

public class WeddingInvitation {

	public static void main(String[] args) throws InterruptedException {

		Thread dateTimeBooking = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					
					System.out.println("Date and Time Booking...");
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});

		Thread weddingHallBooking = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					dateTimeBooking.join();
					Thread.sleep(2000);
					System.out.println("Wedding Hall Booking...");
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread cateringServiceBooking = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					weddingHallBooking.join();
					Thread.sleep(2000);
					System.out.println("Catering Service Booking...");
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread invitationPrinting = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					cateringServiceBooking.join();
					Thread.sleep(2000);
					System.out.println("Invitation Printing...");
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		dateTimeBooking.start();
		weddingHallBooking.start();
		cateringServiceBooking.start();
		invitationPrinting.start();
		
		Thread.sleep(2000);
		invitationPrinting.join();
		System.out.println("Welcome To Wedding.. !!");
	}

}
