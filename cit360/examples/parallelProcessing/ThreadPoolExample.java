package cit360.examples.parallelProcessing;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

	public static void main(String[] args) throws InterruptedException {

		Executor myExecutor = Executors.newFixedThreadPool(2);
    	//task 1
    	myExecutor.execute(new SimpleRunnable(1,5));
    	
    	//task 2
    	myExecutor.execute(new SimpleRunnable(2,4));
    	
    	//task 3
    	myExecutor.execute(new SimpleRunnable(3,3));
    	
    	System.out.println("I can continue while waiting for the longer tasks.");
    	
    }
}
