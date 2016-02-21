import java.util.Scanner;

// Author: Kyle Stucki
// Uses the Order.java class

public class Bamazon {

	public static void main(String[] args) {

		// Bamazon Order System Start
		
		// Create the scanner.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Create Order
		System.out.print("Welcome to Bamazon!\n");
		System.out.print("\nCheckout Cart: Tube Socks / $4.95 / Standard Shipping\n");
		System.out.print("1 = Yes (OR) 2 = No\n");
		System.out.print("Submit order? : ");
		int submit = input.nextInt();
		
		if (submit == 1)
		{
			// Create Order
			Order Order1 = new Order("Tube Socks", 4.95, 1);
			System.out.print("\nSystem Feedback: Order Created.\n");
			System.out.println(Order1);
			
			// Send Invoice
			String item = Order1.getOrderItem();
			double price = Order1.getOrderCost();
			System.out.print("\nInvoice: Item - \"" + item + "\" Cost - $" + price + "\n");
			System.out.print("\nSystem Feedback: Order Invoiced.\n");
			
			// Prompt for Payment
			System.out.print("\nDue Now: Total = $" + price + "\n");
			System.out.print("\nSystem Feedback: Prompted for Payment.\n");
			
			// Order Payment Processing
			System.out.print("\nVISA on file: Kyle Stucki ************3456");
			System.out.print("\nCharge to card? 1 = Yes (OR) 2 = No");
			System.out.print("\nResponse: ");
			int charge = input.nextInt();
			
			if (charge == 1)
			{
				System.out.print("\nSystem Feedback: Payment Success!\n");
				Order1.setOrderPaid(true);
				System.out.println(Order1);
				System.out.print("\nOrder Submitted.\n");
				System.out.print("\nSystem Feedback: Send Order Receipt.\n");
				System.out.print("\nBamazon Order Receipt For: \"" + item + "\" Total Charged - $" + price);
				System.out.print("\nBilled to: Kyle Stucki VISA ************3456");
				System.out.print("\nThank You for your order!\n");
				
				System.out.print("\nSystem Feedback: Send Order to Fullfillment.\n");
				System.out.print("\nOrder has been filled.\n");
				Order1.setOrderFilled(true);
				System.out.println(Order1);
				
				int shippingType = Order1.getOrderShippingType();
				if (shippingType == 1)
				{
					System.out.print("\nOrder Standard Shipping.\n");
				}
				else
				{
					System.out.print("\nOrder Expedited Shipping.\n");
				}
				
				System.out.print("\nSystem Feedback: Order has been dropped off to local UPS carrier.\n");
				Order1.setOrderShipped(true);
				System.out.print("\nOrder Shipped.\n");
				System.out.println(Order1);
				System.out.print("\nSystem Feedback: Sent Shipping Confirmation.\n");
				System.out.print("\nYour Bamazon Order Has Shipped: \"" + item + "\"\n");
				
				Order1.setOrderFinalized(true);
				System.out.print("\nSystem Feedback: Order Finalized.\n");
				System.out.println(Order1);
				System.out.print("\nOrder Closed. Have a nice day.\n");
				Order1.setOrderClosed(true);
				System.out.print("\nSystem Feedback: Order Archived.\n");
				System.out.println(Order1);
			}
			else
			{
				System.out.print("\nSystem Feedback: Payment Failed.\n");
				System.out.print("\nOrder Canceled.\n");
				Order1.setOrderFinalized(true);
				System.out.print("\nSystem Feedback: Order Finalized.\n");
				System.out.println(Order1);
				System.out.print("\nOrder Closed. Have a nice day.\n");
				Order1.setOrderClosed(true);
				System.out.println(Order1);
				
				System.out.print("\nSystem Feedback: Order Archived.\n");
			}
		}
		else
		{
			System.out.print("\nSystem Feedback: No order created.");
		}
		
	}
}
