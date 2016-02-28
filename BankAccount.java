// Author: Kyle Stucki
// Uses the SerializeObject.java class

import java.io.Serializable;

@SuppressWarnings("serial")
// class BankAccount is serializable because of import and implements serializable
public class BankAccount implements Serializable {
	
	String firstName;
	String lastName;
	int routeCode;
	int accountNum;
	// If we don't want something serialized you can use transient
	// Example: transient int accountNum;
	
	// Non-Default Constructor
	public BankAccount(String firstName, String lastName, int routeCode, int accountNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.routeCode = routeCode;
		this.accountNum = accountNum;
	}
}
