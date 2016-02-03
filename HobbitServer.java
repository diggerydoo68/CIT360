package softwareDev;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class HobbitServer {
	public static void main(String[] args)
	{
		int port = 1234; // The port the server will be listening on
		
		HobbitName hobbit = new HobbitName(); //creating a new object
		
		try
		{
			System.out.println("Hobbit Database"); //Banner up top
			System.out.println("Listening on Port " + port);
			ServerSocket ss = new ServerSocket(port); // Creates a new socket to connect
			while (true)
			{
				Socket s = ss.accept();
				System.out.println(
						"Connection established!"); // If connection is established server states so
				Thread t = new Thread(
						new HobbitThread(s, hobbit));
				t.start();
			}
		}
		catch (Exception e)
		{
			System.out.println("System exception!"); // Throws an exception if connection is refused. 
		}
	}
}
class HobbitThread implements Runnable{ // Runnable interface is executed by the HobbitThread which creates a private socket and a new object named hobbit
		private Socket s;
		private HobbitName hobbit;
		
		public HobbitThread(Socket socket, HobbitName hobbit) //In this block we are specifying that the object hobbit will be represented as a serial of bytes
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
				Scanner in = new Scanner(s.getInputStream()); //A simple text scanner which can parse primitive types and strings using regular expressions.
				PrintWriter out;
				out = new PrintWriter(s.getOutputStream(), true); // getOutputStream method is parsing the outcoming stream 
										  // from the byte stream in this connection in this 
										  // case it will get the Welcome to hobbit server and 
										  // Enter BYE to exit in the printstream
				
				out.println("Welcome to the Hobbit Server");
				out.println("Enter BYE to exit.");
				
				while (true) //While the scanner is recieving the stream the following constraints will take place
						// Avoid all words except bye and get.
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
				out.println("Cheers!"); // when bye is used this displays and the connection is refused
				s.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("Closed connection to " + client);
		}
	}
