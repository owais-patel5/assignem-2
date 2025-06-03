package Q1;

class Mythread extends Thread{
		@Override
		public void run() {
			System.out.println("running");
		}
	}

	public class Main {
		public static void main(String[] args) {
			Mythread mythread = new Mythread();
			mythread.start();
			
			Thread thread = new Thread(mythread); // containment
			thread.start();
			
			new Thread() { 
				public void run() {
					System.out.println("thread running");
					
				}
			}.start();
			
	new Thread(new Runnable() { 
		
			
			@Override
			public void run() {
				System.out.println("th1 runn");
				
			}
		}).start();
	}
	}


