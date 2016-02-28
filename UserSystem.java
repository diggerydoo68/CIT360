import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Author: Kyle Stucki
// Uses the UserSystemAccount.java class

public class UserSystem {

	// Create blank account
	static UserSystemAccount Account1 = new UserSystemAccount("default", 999999);

	public static void main(String[] args) {

		// Create the scanner.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("User System Active\n");
		String choice = null;
		boolean keepLooping = true;

		while (keepLooping) {

			System.out.print("\nPlease choose an option: Login | CreateAccount | Exit");
			System.out.print("\nOption: ");
			try {
				choice = input.next();
			}
			catch (Exception e)
			{

			}

			switch (choice) {

			case "Login":
				userLogin();
				break;

			case "CreateAccount":
				userCreate();
				break;

			case "Exit":
				keepLooping = false;
				break;

			default:
				System.out.print("\nInvalid Input\n");
				break;
			}
		}
		System.out.print("\nGoodbye");
	}

	private static void userCreate() {

		System.out.print("\nUser System - Create Account\n");
		System.out.print("\nPlease enter the account username (No digits or special chars): ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String username;
		username = input.next();

		int password;

		try {
			System.out.print("Please enter the account password (6-digits): ");
			password = input.nextInt();
		} catch (Exception e) {
			System.out.print("\nPassword cannot have characters\n");
			System.out.print("\nAccount Creation Failed\n");
			return;
		}

		System.out.print("\nSubmit for creation (Yes / No): ");
		String submit = input.next();
		switch (submit) {
		case "Yes":
			System.out.print("\nProcessing...\n");
			boolean result = validate(username, password);

			if (result == true) {
				createAccount(username, password);
				System.out.print("\n\nAccount Creation Success!\n");

			} else {
				System.out.print("\nAccount Creation Failed\n");
			}
			break;

		case "No":
			System.out.print("\nCanceling Account Creation\n");
			break;

		default:
			System.out.print("\nInvalid input: Canceling Account Creation");
		}
	}

	private static boolean validate(String username, int password) {

		boolean result = true;

		// validate username - check for digits
		if (username != null && !username.isEmpty()) {
			for (char c : username.toCharArray()) {
				if (Character.isDigit(c)) {
					result = false;
					System.out.println("No digits allowed in creation of username");
					break;
				}
			}
		}

		// validate username - check for special char
		Pattern p = Pattern.compile("[^A-Za-z0-9]");
		Matcher m = p.matcher(username);
		// boolean b = m.matches();
		boolean match = m.find();

		if (match == true) {
			result = false;
			System.out.println("No special characters allowed in creation of username");
		}

		// validate password - check length
		int length = (int) Math.log10(password) + 1;
		if (length != 6) {
			result = false;
			System.out.println("Password much be 6 digits long");
		}

		// validate password - check for zero or negative number
		if (password <= 0) {
			result = false;
			System.out.println("Password cannot be zero or negative");
		}

		return result;
	}

	private static void userLogin() {

		boolean success = true;

		System.out.print("\nUser System - Login to Account\n");
		System.out.print("\nUsername: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String usernameLogin;
		usernameLogin = input.next();

		int passwordLogin;

		try {
			System.out.print("Password: ");
			passwordLogin = input.nextInt();
		} catch (Exception e) {
			System.out.print("\nInvalid Username or Password\n");
			return;
		}

		String usernameAccount = Account1.getUsername();
		int passwordAccount = Account1.getPassword();

		// Validate Login
		if (usernameAccount.equals(usernameLogin) && passwordAccount == passwordLogin) {
			System.out.print("\nLogin Success!\n\n");
		} else {
			System.out.print("\nInvalid Username or Password\n");
			success = false;
		}

		if (success == true) {
			System.out.print(Account1);
			System.out.println("\n\nLogging out");
		}

	}

	private static void createAccount(String username, int password) {

		Account1.setUsername(username);
		Account1.setPassword(password);
	}
}
