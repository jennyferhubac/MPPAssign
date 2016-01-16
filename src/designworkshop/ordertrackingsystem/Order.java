package designworkshop.ordertrackingsystem;

import java.text.SimpleDateFormat;
import java.util.*;

public class Order {
	private String orderNumber;
	private boolean isPrepaid;
	private double orderPrice;
	private Date orderDate;
	private String status;
	private double points;
	private double custPoints;
	
	private ACustomer customer;
	
	ArrayList<Orderline> arrOrderline;
	
	Order()
	{
		arrOrderline = new ArrayList<Orderline>();
	}
	
	Order(String orderNumber, Date orderDate)
	{
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		
		arrOrderline = new ArrayList<Orderline>();
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public boolean isPrepaid() {
		return isPrepaid;
	}

	public void setPrepaid(boolean isPrepaid) {
		this.isPrepaid = isPrepaid;
	}

	public double getOrderPrice() {
		for(Orderline ordline : arrOrderline)
		{
			orderPrice = orderPrice + ordline.computePrice();
		}
		
		orderPrice = addDiscount(orderPrice);
		
		return orderPrice;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		status = "SHIPPED";
		for(Orderline ordline : arrOrderline)
		{
			if(!ordline.getStatus().equals("SHIPPED"))
			{
				status = "PENDING DELIVERY";
			}
		}
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ArrayList<Orderline> getArrOrderline() {
		return arrOrderline;
	}
	
	public void addOrderline(Orderline orderline)
	{
		arrOrderline.add(orderline);
	}
	
	public void print()
	{
		SimpleDateFormat dtFmt = new SimpleDateFormat("yyyy-mm-dd");
		System.out.println("\n\n");
		System.out.println("=====================================================\n");
		System.out.println("Order Number: " + orderNumber + "\tOrder Date: " + dtFmt.format(orderDate));
		System.out.printf("Total Order Price:\t $%,.2f \n", getOrderPrice());
		System.out.println("Order Points:\t" + getOrderPoints());
		System.out.println("Order Status:\t" + getStatus());
		System.out.println("=====================================================\n");
		System.out.println("Item\t\tQty\tPrice\tShipping Status");
		for(Orderline ordline : arrOrderline)
		{
			ordline.print();
		}
	}

	public ACustomer getCustomer() {
		return customer;
	}

	public void setCustomer(ACustomer customer) {
		this.customer = customer;
	}

	public double getOrderPoints()
	{
		points = 0; 
		for(Orderline ordline : arrOrderline)
		{
			points = points + ordline.getPoints();
		}
		
		return points;
	}
	
	public void setOrderPoints(double points)
	{
		this.points = points;
	}
	
	public double getCustomerPoints()
	{
		return customer.getAccumulatedPoints() + getOrderPoints();
	}
	
	public void setCustomerPoints(double points)
	{
		this.points = points;
	}
	
	private double addDiscount(double ordPrice)
	{
		if(getCustomerPoints() >= 25)
		{
			ordPrice = ordPrice - (ordPrice * 0.4);
			customer.setPoints(0);
		}
		
		return ordPrice;
	}
}
