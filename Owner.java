// Author Kyle Stucki
// This program implements the use of 4 classes
// Owner.java
// Car.java
// Ferrar.java
// Nissan.java
public class Owner {
	public static void main(String[] args) {
		
		Car Car1 = new Ferrari("Ferrari", "458 Italia", 2012);
		Car Car2 = new Nissan("Nissan", "GT-R", 2009);

		System.out.println(Car1);
		System.out.println(Car2);
	}
}
