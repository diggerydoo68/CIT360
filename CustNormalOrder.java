// Author: Kyle Stucki
// This class uses CustSpecialOrder.java && CustOrder.java

public class CustNormalOrder extends CustOrder{
	
	protected String description;
	
	CustNormalOrder() {
		
	}
	
	CustNormalOrder(String foodItem, String orderType, String description) {
		super(foodItem, orderType);
		this.description = description;
	}
	
	//to string is used to pull and print
	public String toString() {
		return "[" +foodItem + "][" + orderType + "][" + description + "]"; 
	}
}
