package Q1;

class Mythread1 extends Thread{
	@Override
	public void run() {
	   
		try {
			System.out.println("thread sleep");
			Thread.sleep(5000);
			System.out.println("thread awake");
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	
		
		
	}
} 
public class main1 {
	 public static void main(String[] args) {
		Mythread1 mythread = new Mythread1();
		mythread.start();
	}
}
