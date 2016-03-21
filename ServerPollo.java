// Author: Kyle Stucki
// Works with ClientMarco.java class

import java.net.*; // Provides the classes for implementing networking applications. Addresses, Sockets, Interfaces.
import java.io.*; // Provides nearly every class you might ever need to perform input and output (I/O) in Java.

public class ServerPollo {
	
	// MAIN - Driver for ServerMarco
	public static void main(String[] args) throws IOException {
		
		// Declare a socket for our server and set it to null
		ServerSocket socket4Server = null;

		// Try catch for creating a new socket
		// Will print an error if something else is using the port we told it to use 
		try {
			
			socket4Server = new ServerSocket(7777);
			
		} catch (IOException e) {
			
			// Let them know the bad news
			System.err.println("[ServerMarco] ERROR - Port 7777 is in use.");
			System.exit(1);
		}

		// Time to set things up for our client
		// Declare a socket for our client and set it to null
		Socket socket4Client = null;
		
		// Let the admin know that the server is awaiting a connection 
		System.out.println("[ServerMarco] WAITING - For connection...");

		// Try to see if we have a client inbound to establish a socket connection with
		try {
			
			socket4Client = socket4Server.accept();
			
		} catch (IOException e) {
			
			// Bad news time if exception is caught
			System.err.println("[ServerMarco] FAILED ACCEPT - Between client and server socket.");
			System.exit(1);
		}

		// If we have a client inbound let the admin know
		System.out.println("[ServerMarco] SUCCESS ACCEPT - Between client and server socket.");
		System.out.println("[ServerMarco] WAITING - For input...");

		// Open a output stream
		PrintWriter out = new PrintWriter(socket4Client.getOutputStream(), true);
		
		// Open a input stream
		BufferedReader in = new BufferedReader(new InputStreamReader(socket4Client.getInputStream()));

		// String to use for input
		String inputLine;

		// Loop for input that is received and displayed - Echo back what they send
		while ((inputLine = in.readLine()) != null) {
			
			System.out.println("Server: " + inputLine);
			out.println(inputLine);

			// Check to see if its time to part ways with our client
			if (inputLine.equals("Bye"))
				break;
		}

		// Clean up time
		// Close our streams and sockets
		out.close();
		in.close();
		socket4Client.close();
		socket4Server.close();
	}
}