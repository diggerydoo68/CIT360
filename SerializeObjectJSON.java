// Author: Kyle Stucki
// Uses the BankAccount.java class

import java.io.*;
import java.util.Scanner;
import com.google.gson.Gson;

public class SerializeObjectJSON {

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
		System.out.print("\nReading file...\n");

		// Open up the input for our file
		FileInputStream fin = new FileInputStream(filename);

		System.out.print("\nDeSerializing...\n");
		
		// DeSerialize input
		ObjectInputStream in = new ObjectInputStream(fin);
		
		// Store input into a string - JSON string
		String json = (String)in.readObject();
		
		System.out.print("\nConverting from JSON string to BankAccount object...\n");
		
		// Convert back from JSON to BankAccount Object
		Gson gsonObject = new Gson();
		BankAccount account1 = gsonObject.fromJson(json, BankAccount.class);
		
		// Close streams
		in.close();
		fin.close();

		// Deserialization complete
		System.out.print("\nSuccess!\n");

		// Print out the objects datatype so we can see if the deserialization
		// was a success or not
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

		// Convert object to json string
		System.out.print("\nConverting object BankAccount to JSON string...\n");
		
		// Create our gson object
		Gson gsonObject = new Gson();

		// Convert java object to JSON format returned as a string
		String json = gsonObject.toJson(account1);

		// Begin serialization
		System.out.print("\nSerializing...\n");
		System.out.print("\nWriting to file...\n");

		// Open up the output for our file
		FileOutputStream fout = new FileOutputStream(filename);
		
		// Serialize object and output to specified file
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(json);

		// Close streams
		out.close();
		fout.close();

		// Notify of success
		System.out.print("\nSuccess!\n");
	}

}
