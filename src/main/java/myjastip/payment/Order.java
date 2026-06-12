package myjastip.payment;

public class Order {
	private String orderId;
	private String orderStatus;
//	private Location location;
	private double totalItemPrice;
	private double transportationFee;
	private double serviceFee;
	private double totalBill;
	
	public double calculateTotalBill() {
                totalBill = totalItemPrice + transportationFee + serviceFee;
		return totalBill;
	}
	
}
