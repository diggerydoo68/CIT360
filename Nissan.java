// Author Kyle Stucki
// This program implements the use of 4 classes
// Owner.java
// Car.java
// Ferrar.java
// Nissan.java
public class Nissan extends Car {
	
	protected int year;
	
	Nissan() {
		
	}
	
	Nissan(String make, String model, int year) {
		super(make, model);
		this.year = year;
	}
	// Getters for Nissan
	public int getYear() {
		return year;
	}
	
	// Setters for Nissan
	public void setYear(int year) {
		this.year = year;
	}
	
	//to string is used to pull and print
	public String toString() {
		return "Make - [" + make + "]  Model - [" + model + 
			"]       Year - [" + year + "]";
	}
}
