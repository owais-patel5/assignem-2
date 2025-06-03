package Q1;

class OP extends Thread {
    @Override
    public void run() {
        // Print the name of the new thread (OP)
        System.out.println("name of OP thread: " + Thread.currentThread().getName());
    }
}

public class Main3 {
    public static void main(String[] args) {
        // Create an instance of OP thread
        OP op = new OP();
        
        // Set the name of the thread
        op.setName("new thread");
        
        // Start the OP thread
        op.start();
        
        // Print the name of the main thread
        System.out.println("name of main thread: " + Thread.currentThread().getName());
    }
}
