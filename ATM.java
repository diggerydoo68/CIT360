import java.util.Scanner;

// Author: Kyle Stucki
// This file uses Account.java

public class ATM {

	public static void main(String[] args) {

		// Setup and create accounts to use
		Account Account1 = new Account(777, 1234, 1000.00);

		// Create the scanner.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("River Credit Union\n");
		System.out.print("\nPlease enter Account: ");
		int accountInput = input.nextInt();
		int compareAcct = Account1.getId();

		if (accountInput == compareAcct) {
			
			System.out.print("\nPlease enter PIN: ");
			int accountPin = input.nextInt();
			int comparePin = Account1.getPin();

			if (accountPin == comparePin) {	
				
				System.out.print("\nLogin Success!\n");
				
				int option = 0;
				boolean keepLooping = true;

				while (keepLooping) {
					
					System.out.print("\nPlease choose an option: 1 = Check Balance | 2 = Withdraw | 3 = Deposit | 4 = Logout\n");
					System.out.print("Option: ");
					option = input.nextInt();

					switch (option) {

					case 1:
						// Get Account Balance
						double tempBalance = Account1.getBalance();
						System.out.printf("\nYour balance is: $%.2f",tempBalance);
						System.out.print("\n");
						break;

					case 2:
						// Account Withdraw
						System.out.print("\nAmount to withdraw: $");
						double withdrawAmmount = input.nextDouble();
						double tempBalance2 = Account1.getBalance();
						if (withdrawAmmount <= 0)
						{
							System.out.print("\nWithdraw can't be zero or negative.\n");
						}
						else if (tempBalance2 < withdrawAmmount)
						{
							System.out.print("\nWithdraw can't exceed account balance.\n");
						}
						else
						{
							Account1.withdraw(withdrawAmmount);
							System.out.print("\nWithdraw Success!\n");
						}
						break;
						
					case 3:
						// Account Deposit
						System.out.print("\nAmount to deposit: $");
						double depositAmmount = input.nextDouble();
						if (depositAmmount <= 0)
						{
							System.out.print("\nDeposit can't be zero or negative.\n");
						}
						else
						{
							Account1.deposit(depositAmmount);
							System.out.print("\nDeposit Success!\n");
						}
						break;

					case 4:
						// Logout
						keepLooping = false;
						System.out.print("\nLogout Success!\n");
						System.out.print("Thank you for your business.");
						break;
						
					default:
						System.out.print("\nPlease choose a valid entry.\n");
					}
				}
			} else {
				System.out.print("\nPin invalid. Good Bye.");
			}
		} else 
		{
			System.out.print("\nNo account found. Good Bye.");
		}
	}
}
