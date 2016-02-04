package cit360.examples.parallelProcessing;


public class SimpleRunnable implements Runnable{
    int taskNum;
    int delay;
    
    public SimpleRunnable(){
        taskNum = 0;
    }
    
    public SimpleRunnable(int taskNum){
        this.taskNum = taskNum;
        delay = 0;
    }
    
    public SimpleRunnable(int taskNum, int delay){
    	this(taskNum);
    	this.delay = delay;
    }
       
    public void run(){
    	System.out.println("Starting task "+taskNum+".");
    	try {
			Thread.sleep((delay*1000));
		} catch (InterruptedException e) {}
        System.out.println("Task "+taskNum+" completed after "+delay+" seconds.");
    }
    
}
