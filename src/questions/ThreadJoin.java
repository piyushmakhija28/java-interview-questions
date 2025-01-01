package questions;

public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 5; i++) {
			final int indexOfPerson = i;
			System.out.println("Person " + i + " is going for liscence");
			Thread thread1 = new Thread(() -> {
				System.out.println(indexOfPerson + ": Medical Karwane Jara Hun.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
			thread1.setName("Medical Thread");
			Thread thread2 = new Thread(() -> {
				try {
					thread1.join();
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(indexOfPerson + ": Medical Karwalia Test Drive Ke Liye Jara Hun.");
			});
			thread2.setName("Test Drive Thread");
			Thread thread3 = new Thread(() -> {
				try {
					thread2.join();
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(indexOfPerson + ": Test Drive Ho Gayi Officer Ke Pass Jara Hun.");
			});
			thread3.setName("Officer Thread");
			thread1.start();
			thread2.start();
			thread3.start();
		}
	}

}
