package designworkshop.ordertrackingsystem;

import java.util.ArrayList;

public class PersonalCust extends ACustomer{
	private CreditRating creditRating;
	private String creditCardNum;
	
	ArrayList<Order> arrOrders;
	
	PersonalCust(String name, String address, String phone, String creditCardNum)
	{
		super(name, address, phone);
		
		this.creditCardNum = creditCardNum;
		
		creditRating = CreditRating.POOR;
		
		arrOrders = new ArrayList<Order>();
	}
	
	public CreditRating getCreditRating()
	{
		return creditRating;
	}
	
	public void setCreditRating(CreditRating creditRating)
	{
		this.creditRating = creditRating;
	}

	public String getCreditCardNum() {
		return creditCardNum;
	}

	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNum = creditCardNum;
	}

	public ArrayList<Order> getArrOrders() {
		return arrOrders;
	}
	
	public void print()
	{
		System.out.println("------------------------------------------------------");
		System.out.println("Customer type:\tPersonal Customer");
		System.out.println("Name:\t" + this.getName());
		System.out.println("Address:\t" + this.getAddress());
		System.out.println("Phone:\t" + this.getPhone());
		System.out.println("Credit number:\t" + this.getCreditCardNum());
		System.out.println("Credit Rating:\t" + this.getCreditRating());
		System.out.println("Payment Method:\t" + this.getPaymentMethod().toString());
		System.out.println("Accumulated points:\t" + this.getAccumulatedPoints());
		System.out.println("------------------------------------------------------\n");
	}
	
	public void printOrders()
	{
		for(Order order : arrOrders)
		{
			order.print();
		}
	}
	
	public void addOrder(Order order)
	{
		arrOrders.add(order);
	}
	
	public double getAccumulatedPoints()
	{
		double totPoints = 0;
		for(Order order : arrOrders)
		{
			if(totPoints <= 25)
			{
				totPoints = totPoints + order.getOrderPoints();
				this.setPoints(totPoints);
			}
			else
			{
				totPoints = 0;
				totPoints = totPoints + order.getOrderPoints();
				this.setPoints(0);
			}
		}
		
		//double check if points greater than 25 
		//normally if last order has accumulated more than 25 points
		
		if(totPoints <= 25)
		{
			this.setPoints(totPoints);
		}
		else
		{
			totPoints = 0;
			this.setPoints(0);
		}
		
		return totPoints;
		
	}
	
	public PaymentMethod getPaymentMethod()
	{
		if(creditRating == CreditRating.POOR)
		{
			return PaymentMethod.PREPAID;
		}
		else
		{
			return PaymentMethod.POSTPAID;
		}
	}

}
