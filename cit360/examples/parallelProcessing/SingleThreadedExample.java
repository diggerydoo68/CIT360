package cit360.examples.parallelProcessing;

public class SingleThreadedExample {

	public static void main(String[] args) throws InterruptedException {

		new SimpleRunnable(1,3).run();
		
		new SimpleRunnable(2,2).run();
    	
    	System.out.println("I have to wait for the long tasks before I can continue.");
    	
    }
	
}
