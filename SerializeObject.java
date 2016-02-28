// Author: Kyle Stucki
// Uses the BankAccount.java class

import java.io.*;
import java.util.Scanner;

public class SerializeObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Create the scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("JSON Serialize System Active\n");

		String choice = null;
		boolean keepLooping = true;
		
		// Main menu
		while (keepLooping) {

			System.out.print("\nPlease choose an option: SerializeAccount | DeSerializeAccount | Exit");
			System.out.print("\nOption: ");
			try {
				choice = input.next();
			} catch (Exception e) {

			}

			switch (choice) {

			case "SerializeAccount":
				serialize();
				break;

			case "DeSerializeAccount":
				deserialize();
				break;

			case "Exit":
				keepLooping = false;
				break;

			default:
				System.out.print("\nInvalid Input\n");
				break;
			}
		}

		System.out.print("\nGoodbye\n");
	}

	private static void deserialize() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		// Create the scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Get the filename
		System.out.print("\nPlease enter a filename: ");
		String filename = input.next();
		
		// Attempt to deserialize
		System.out.print("\nDeSerializing...\n");
		
		// Import the file through a fileinputstream into a objectinputstream deserialize
		// Create an object based upon the deserialized object
		FileInputStream fin = new FileInputStream(filename);
		ObjectInputStream in = new ObjectInputStream(fin);
		BankAccount account1 = (BankAccount)in.readObject();
		
		// Close streams
		in.close();
		fin.close();
		
		// Deserialization complete
		System.out.print("\nSuccess!\n");
		
		// Print out the objects datatype so we can see if the deserialization was a success or not
		System.out.println("\nFirst Name - [" + account1.firstName + "] Last Name - [" + account1.lastName
							+ "] Route Code - [" + account1.routeCode + "] Account Number - [" + account1.accountNum + "]");
		
	}

	private static void serialize() throws IOException {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Prompt for input to create our bank account object with
		System.out.print("\nPlease enter your first name: ");
		String firstName = input.next();

		System.out.print("Please enter your last name: ");
		String lastName = input.next();

		System.out.print("Please enter your routing code: ");
		int routeCode = input.nextInt();

		System.out.print("Please enter your account number: ");
		int accountNum = input.nextInt();

		System.out.print("Please enter a filename: ");
		String filename = input.next();

		// Create the bank account object using the gathered input
		BankAccount account1 = new BankAccount(firstName, lastName, routeCode, accountNum);

		// Begin serialization
		System.out.print("\nSerializing...\n");

		// Open up the output for our file
		FileOutputStream fout = new FileOutputStream(filename);
		
		// Serialize object and output to specified file
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(account1);
		
		// Close streams
		out.close();
        fout.close();

        // Notify of success
		System.out.print("\nSuccess!\n");
	}

}
