// Author: Kyle Stucki
// This class uses CustSpecialOrder.java && CustNormalOrder.java

import java.util.Scanner;

public class CustOrder {

	public static void main(String[] args) {

		// Create the scanner.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Welcome to Burgers R Us\n");
		System.out.print("\nPlease order whenever you're ready: 1 = Hamburger, 2 = Cheeseburger\n");

		int orderType = 0;
		boolean keepLooping = true;

		while (keepLooping)
		{

			System.out.print("Please enter a category number: ");
			orderType = input.nextInt();

			switch (orderType) {

			case 1:
				// Hamburger
				orderHamburger();
				keepLooping = false;
				break;

			case 2:
				// Cheeseburger
				orderCheeseburger();
				keepLooping = false;
				break;

			default:
				System.out.print("\nPlease choose either 1 or 2.\n");

			}
		}
	}

	// Hamburger Method
	private static void orderHamburger() {

		// Create the scanner.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.print("\n[Hamburger] Order Types: Regular order = 1, Special order = 2\n");

		int orderType1 = 0;
		boolean keepLooping = true;

		while (keepLooping) {
			System.out.print("Enter order type: ");
			orderType1 = input.nextInt();

			switch (orderType1) {

			case 1:
				// Regular hamburger
				CustOrder Order = new CustNormalOrder("Hamburger", "Regular Order", "All topings included");
				keepLooping = false;
				System.out.print("\nYou have ordered a " + Order + "\n");
				System.out.print("Please pull forward. Thank You.");
				break;

			case 2:
				// Special order hamburger
				String desc;
				input.nextLine();
				System.out.print("\nDescribe special order please: ");
				desc = input.nextLine();
				
				CustOrder Order2 = new CustSpecialOrder("Hamburger", "Special Order", "Instructions:", desc);
				keepLooping = false;
				System.out.print("\nYou have ordered a " + Order2 + "\n");
				System.out.print("Please pull forward. Thank You.");
				break;

			default:
				System.out.print("\nPlease either 1 or 2.\n");

			}
		}
	}

	// Cheeseburger Method
	private static void orderCheeseburger() {

		// Create the scanner.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.print("\n[Cheeseburger] Order Types: Regular order = 1, Special order = 2\n");

		int orderType2 = 0;
		boolean keepLooping = true;

		while (keepLooping) {
			System.out.print("Enter order type: ");
			orderType2 = input.nextInt();

			switch (orderType2) {

			case 1:
				// Regular cheeseburger
				CustOrder Order = new CustNormalOrder("Cheeseburger", "Regular Order", "All Toppings");
				keepLooping = false;
				System.out.print("\nYou have ordered a " + Order + "\n");
				System.out.print("Please pull forward. Thank You.");
				break;
			case 2:
				// Special order cheeseburger
				String desc;
				input.nextLine();
				System.out.print("\nDescribe special order please: ");
				desc = input.nextLine();
				
				CustOrder Order2 = new CustSpecialOrder("Cheeseburger", "Special Order", "Instructions:", desc);
				keepLooping = false;
				System.out.print("\nYou have ordered a " + Order2 + "\n");
				System.out.print("Please pull forward. Thank You.");
				break;
				
			default:
				System.out.print("\nPlease choose either 1 or 2.\n");

			}
		}
	}
	
	protected String foodItem;
	protected String orderType;
	
	// Default or no arg constructor
	public CustOrder() {
			
	}
	
	// Primary constructor
	public CustOrder(String foodItem, String orderType) {
		this.foodItem = foodItem;
		this.orderType = orderType;
	}
	
	// Getters for CustOrder
	public String getFoodItem() {
		return foodItem;
	}
	
	public String getOrderType() {
		return orderType;
	}
	
	// Setters for CustOrder
	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}
	
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	
	//to string is used to pull and print
	public String toString() {
		return "[" +foodItem + "][" + orderType + "]";
	}
}
