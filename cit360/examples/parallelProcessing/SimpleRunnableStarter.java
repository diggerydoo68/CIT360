package cit360.examples.parallelProcessing;

public class SimpleRunnableStarter {

    public static void main(String[] args) throws InterruptedException {

    	//task 1
    	Thread thread1 = new Thread(new SimpleRunnable(1,3));
    	thread1.start();
    	
    	//task 2
    	Thread thread2 = new Thread(new SimpleRunnable(2,2));
    	thread2.start();
    	
    	System.out.println("I can continue while waiting for the longer tasks.");
    	
    }

}
