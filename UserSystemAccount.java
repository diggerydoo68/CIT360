
// Author: Kyle Stucki
// Uses the UserSystem.java class

public class UserSystemAccount {

	protected String username;
	protected int password;

	public UserSystemAccount() {

	}

	// Primary constructor with username, password.
	public UserSystemAccount(String username, int password) {
		this.username = username;
		this.password = password;
	}

	// Getters for UserSystemAccount
	public String getUsername() {
		return username;
	}
	
	public int getPassword() {
		return password;
	}
	
	// Setters for UserSystemAccount
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	// to string is used to pull and print
	public String toString() {
		return "Account User - [" + username + "] Account Password - [" + password + "]";
	}

}
