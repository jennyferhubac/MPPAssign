package designworkshop.ordertrackingsystem;

import java.util.*;

public class CorporateCust extends ACustomer{
	
	private CreditRating creditRating;
	private double creditLimit;
	
	ArrayList<Order> arrOrders;
	
	Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
	Date firstDateOfPreviousMonth;
	Date lastDateOfPreviousMonth;

	 
	CorporateCust(String name, String address, String phone)
	{
		super(name, address, phone);
		
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
	
	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	public void generateMonthlyBill()
	{
		double totalOrder = 0.0;
		for(Order order : arrOrders)
		{
			if(!order.isPrepaid())
			{
			if(!order.getOrderDate().before(firstDateOfPreviousMonth) && order.getOrderDate().after(lastDateOfPreviousMonth))
			{
				order.print();
				for(Orderline ordline : order.getArrOrderline())
				{
					ordline.print();
					totalOrder = totalOrder + ordline.computePrice();
				}
			}
			}
		}
		System.out.println("=====================================================");
		System.out.printf("\n GRAND TOTAL:\t $%,.2f" + totalOrder);
	}
	
	public void print()
	{
		System.out.println("Customer type:\tCorporate Customer");
		System.out.println("Name:\t" + this.getName());
		System.out.println("Address:\t" + this.getAddress());
		System.out.println("Phone:\t" + this.getPhone());
		System.out.println("Credit limit:\t" + this.getCreditLimit());
		System.out.println("Credit Rating:\t" + this.getCreditRating());
		System.out.println("=====================================================\n");
	}
	
	private void setPreviousMonth()
	{
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));

		calendar.add(Calendar.MONTH, -1);
		calendar.set(Calendar.DATE, 1);

		firstDateOfPreviousMonth = calendar.getTime();

		calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE)); // changed calendar to cal

		lastDateOfPreviousMonth = calendar.getTime();
		
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
			totPoints = totPoints + order.getOrderPoints();
		}
		
		return totPoints;
	}
}
