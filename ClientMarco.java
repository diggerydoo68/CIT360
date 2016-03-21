// Author: Kyle Stucki
// Works with ServerPollo.java class

import java.io.*; // Provides the classes for implementing networking applications. Addresses, Sockets, Interfaces.
import java.net.*; // Provides nearly every class you might ever need to perform input and output (I/O) in Java.

public class ClientMarco {
	
	// MAIN - driver for our clientMarco
	public static void main(String[] args) throws IOException {

		// String for storing the Server IP address - Server is local so just use loopback address
		String serverIPv4 = new String("127.0.0.1");

		if (args.length > 0)
			
			serverIPv4 = args[0];
		
		// Notify user to we are attepting a connection with ServerPollo
		System.out.println("[ClientMarco] CONNECTING - To ServerPollo at " + serverIPv4 + " on port 7777.");

		// Various tools we need and setting them to null for the time being
		Socket socket4Server = null;
		PrintWriter out = null;
		BufferedReader in = null;

		// Try catch for attempting to make a connection to ServerPollo
		try {
			
			// Socket for ServerPollo
			socket4Server = new Socket(serverIPv4, 7777);
			
			// Input and Output streams
			out = new PrintWriter(socket4Server.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(socket4Server.getInputStream()));
			
		} catch (UnknownHostException e) {
			
			// Bad news time
			System.err.println("[ClientMarco] ERROR - Can't establish connection with ServerPollo at: " + serverIPv4);
			System.exit(1);
			
		} catch (IOException e) {
			
			// More bad news time
			System.err.println("[ClientMarco] ERROR - Couldn't get I/O for the connection to ServerPollo at: " + serverIPv4);
			System.exit(1);
			
		}

		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String userInput;

		// Let user know its time to tango!
		System.out.println("[ClientMarco] SUCCESS! - Connected to ServerPollo at " + serverIPv4 + " on port 7777.");
		
		// Lets chat with ServerPollo
		System.out.print("\nMarco says: ");
		
		while ((userInput = stdIn.readLine()) != null) {
			
			out.println(userInput);
			System.out.println("Pollo says: " + in.readLine());
			
			if (userInput.equals("Bye"))
				break;
			
			System.out.print("Marco says: ");
			
		}

		// Let user know its time to settle down
	    System.out.println("\n[ClientMarco] DISCONNECTED - ServerPollo at " + serverIPv4 + " on port 7777 has disconnected.");
		
		// Clean up time
		// Close out the open streams and sockets
		out.close();
		in.close();
		stdIn.close();
		socket4Server.close();
	}
}
