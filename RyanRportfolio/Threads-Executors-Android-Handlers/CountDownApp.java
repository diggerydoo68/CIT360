package threads;
import java.util.ArrayList;

interface TimeMonitor
{
	int getTime();
}

class CountDownClock extends Thread implements TimeMonitor
{
	private int t;
	
	public CountDownClock(int start)
	{
		this.t = start;
	}
	
	public void run()
	{
		for (; t >= 0; t--)
		{
			System.out.println("T minus " + t);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{}
		}
	}
	
	public int getTime()
	{
		return t;
	}
}

class LaunchEvent implements Runnable
{
	private int start;
	private String message;
	TimeMonitor tm;
	
	public LaunchEvent(int start, String message, TimeMonitor monitor)
	{
		this.start = start;
		this.message = message;
		this.tm = monitor;
	}
	
	public void run()
	{
		boolean eventDone = false;
		while (!eventDone)
		{
			try
			{
				Thread.sleep(10);
			}
			catch (InterruptedException e)
			{}
			if (tm.getTime() <= start)
			{
				System.out.println(this.message);
				eventDone = true;
			}
		}
	}
}

public class CountDownApp {
	public static void main(String[] args)
	{
		CountDownClock clock = new CountDownClock(20); // the constructer for the CountDownClock class start time at 20 second
		ArrayList<Runnable> events = 
				new ArrayList<Runnable>(); // the ArrayList is used to store each launch event
		
		events.add(new LaunchEvent(16, 
				"Flood the pad!", clock)); // the line that creates the LaunchEvent Object passes the CountDownClock object as a parameter
		events.add(new LaunchEvent(6,
				"Start engines!", clock));
		events.add(new LaunchEvent(0,
				"Liftoff!", clock));
		
		clock.start(); // the clock is started
		
		for (Runnable e : events) // an enhanced for loop starts threads to run the launchevent objects
			new Thread(e).start();
	}

}
