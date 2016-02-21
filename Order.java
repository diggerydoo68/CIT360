// Author: Kyle Stucki
// Uses the Bamazon.java class

public class Order {

	// Data types
	private String orderItem;
	private double orderCost;
	private Boolean orderPaid;
	private Boolean orderFilled;
	private int orderShippingType;
	private Boolean orderShipped;
	private Boolean orderFinalized;
	private Boolean orderClosed;

	// Non Default Constructor
	Order(String XorderItem, double XorderCost, int XorderShippingType) {

		orderItem = XorderItem;
		orderCost = XorderCost;
		orderPaid = false;
		orderFilled = false;
		orderShippingType = XorderShippingType;
		orderShipped = false;
		orderFinalized = false;
		orderClosed = false;
	}

	// Get for orderItem
	public String getOrderItem() {
		return orderItem;
	}

	// Setter for orderItem
	public void setOrderItem(String TorderItem) {
		orderItem = TorderItem;
	}

	// Get for orderCost
	public double getOrderCost() {
		return orderCost;
	}

	// Setter for orderCost
	public void setOrderCost(double TorderCost) {
		orderCost = TorderCost;
	}

	// Get for orderPaid
	public Boolean getOrderPaid() {
		return orderPaid;
	}

	// Setter for orderPaid
	public void setOrderPaid(Boolean TorderPaid) {
		orderPaid = TorderPaid;
	}

	// Get for orderFilled
	public Boolean getOrderFilled() {
		return orderFilled;
	}

	// Setter for orderFilled
	public void setOrderFilled(Boolean TorderFilled) {
		orderFilled = TorderFilled;
	}

	// Get for orderShippingType
	public int getOrderShippingType() {
		return orderShippingType;
	}

	// Setter for orderShippingType
	public void setOrderShippingType(int TorderShippingType) {
		orderShippingType = TorderShippingType;
	}

	// Get for orderShipped
	public Boolean getOrderShipped() {
		return orderShipped;
	}

	// Setter for orderShipped
	public void setOrderShipped(Boolean TorderShipped) {
		orderShipped = TorderShipped;
	}

	// Get for orderFinalized
	public Boolean getOrderFinalized() {
		return orderFinalized;
	}

	// Setter for orderItem
	public void setOrderFinalized(Boolean TorderFinalized) {
		orderFinalized = TorderFinalized;
	}

	// Get for orderClosed
	public Boolean getOrderClosed() {
		return orderClosed;
	}

	// Setter for orderItem
	public void setOrderClosed(Boolean TorderClosed) {
		orderClosed = TorderClosed;
	}

	// to string to print stats on order
	public String toString() {
		return "\nItem -----------[" + orderItem + "]\nCost -----------[" + orderCost + "]\nPaid For -------["
				+ orderPaid + "]\nOrder Filled ---[" + orderFilled + "]" + "\nShipping Type - [" + orderShippingType
				+ "]\nShipped --------[" + orderShipped + "]\nFinalized ------[" + orderFinalized + "]\nClosed ---------["
				+ orderClosed + "]";
	}
}
