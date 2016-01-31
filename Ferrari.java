public class Ferrari extends Car {
	
	protected int year;
	
	Ferrari() {
		
	}
	
	Ferrari(String make, String model, int year) {
		super(make, model);
		this.year = year;
	}
	
	// Getters for Ferrari
	public int getYear() {
		return year;
	}
	
	// Setters for Ferrari
	public void setYear(int year) {
		this.year = year;
	}
	
	//to string is used to pull and print
	public String toString() {
		return "Make - [" + make + "] Model - [" + model + 
			"] Year - [" + year + "]";
	}
}
