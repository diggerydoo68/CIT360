package softwareDev;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class HobbitServer {
	public static void main(String[] args)
	{
		int port = 1234;
		
		HobbitName hobbit = new HobbitName();
		
		try
		{
			System.out.println("Hobbit Database");
			System.out.println("Listening on Port " + port);
			ServerSocket ss = new ServerSocket(port);
			while (true)
			{
				Socket s = ss.accept();
				System.out.println(
						"Connection established!");
				Thread t = new Thread(
						new HobbitThread(s, hobbit));
				t.start();
			}
		}
		catch (Exception e)
		{
			System.out.println("System exception!");
		}
	}
}
class HobbitThread implements Runnable{
		private Socket s;
		private HobbitName hobbit;
		
		public HobbitThread(Socket socket, HobbitName hobbit)
		{
			this.s = socket;
			this.hobbit = hobbit;
		}
		public void run()
		{
			String client = s.getInetAddress().toString();
			System.out.println("Connected to " + client);
			try
			{
				Scanner in = new Scanner(s.getInputStream());
				PrintWriter out;
				out = new PrintWriter(s.getOutputStream(), true);
				
				out.println("Welcome to the Hobbit Server");
				out.println("Enter BYE to exit.");
				
				while (true)
				{
					String input = in.nextLine();
					if (input.equalsIgnoreCase("bye"))
						break;
					else if (input.equalsIgnoreCase("get"))
					{
						out.println(hobbit.getQuote());
						System.out.println("Serving " + client);
					}
					else
						out.println("Merlins Beard! No!");
				}
				out.println("Cheers!");
				s.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("Closed connection to " + client);
		}
	}
