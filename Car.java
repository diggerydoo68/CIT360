public class Car {
	
	protected String make;
	protected String model;
	
	// Default or no arg constructor
	public Car() {
			
	}
	
	// Primary constructor with make, model.
	public Car(String make, String model) {
		this.make = make;
		this.model = model;
	}
	
	// Getters for Car
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	// Setters for Car
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	//to string is used to pull and print
	public String toString() {
		return "Make - [" + make + "] Model - [" + model + "]";
	}
}
