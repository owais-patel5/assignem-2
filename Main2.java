package Q1;


class Th extends Thread{
	@Override
	public void run() {
	 System.out.println(
		"name" + Thread.currentThread().getName()+ "priority" + Thread.currentThread().getPriority());
	
	}
}

public class Main2 {
   public static void main(String[] args) {
	
	   Th t1 = new Th();
	   Th t2 = new Th();
	   Th t3 = new Th();
   
       t1.setPriority(Thread.MIN_PRIORITY);
       t2.setPriority(Thread.NORM_PRIORITY);
       t3.setPriority(Thread.MAX_PRIORITY);
       
       t1.start();
       t2.start();
       t3.start();
       
       
   
   
   
   }
}
