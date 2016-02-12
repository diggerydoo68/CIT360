// Author: Kyle Stucki
// This class uses CustOrder.java && CustNormalOrder.java

public class CustSpecialOrder extends CustOrder{
	
	protected String description;
	protected String instruct;
	
	CustSpecialOrder() {
		
	}
	
	CustSpecialOrder(String foodItem, String orderType, String instruct, String description) {
		super(foodItem, orderType);
		this.instruct = instruct;
		this.description = description;
	}
	
	//to string is used to pull and print
	public String toString() {
		return "[" +foodItem + "][" + orderType + "] " + instruct + " [" + description + "]"; 
	}
}
