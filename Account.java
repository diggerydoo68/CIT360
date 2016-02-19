
// Author: Kyle Stucki
// This file uses ATM.java

public class Account {
	private int id = 0;
	private int pin = 0;
	private double balance = 0.0;

	// Non Default Constructor
	Account(int newId, int newPin, double newBalance) {
		id = newId;
		pin = newPin;
		balance = newBalance;
	}

	// Get for ID
	public int getId() {
		return id;
	}

	// Get for PIN
	public int getPin() {
		return pin;
	}

	// Get for BALANCE
	public double getBalance() {
		return balance;
	}

	// Withdraw and deposit
	public void withdraw(double amount) {
		balance -= amount;
	}

	public void deposit(double amount) {
		balance += amount;
	}
}
