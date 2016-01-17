package designworkshop.ordertrackingsystem;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CorporateCust extends ACustomer{
	
	private CreditRating creditRating;
	private double creditLimit;
	
	ArrayList<Order> arrOrders;
	 
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
		//current month		
		/*Collections.sort(arrOrders, new Comparator<Order>() {
		    @Override
		    public int compare(Order or1, Order or2) {
		        return or1.getOrderDate().compareTo(or2.getOrderDate());
		    }
		}); */
		
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		
		Date today = new Date();  

        //Calendar calendar = Calendar.getInstance();  
        calendar.setTime(today);  
        
        calendar.add(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 1); 
        Date firstDayOfMonth = calendar.getTime();

        calendar.add(Calendar.MONTH, 1);  
        calendar.set(Calendar.DAY_OF_MONTH, 1);  
        
        calendar.add(Calendar.DATE, -1);  

        Date lastDayOfMonth = calendar.getTime();  

        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
        System.out.println("Today            : " + sdf.format(today));  
        System.out.println("First Day of Month: " + sdf.format(firstDayOfMonth)); 
        System.out.println("Last Day of Month: " + sdf.format(lastDayOfMonth)); 
        
        System.out.println("Billing Period: " + sdf.format(firstDayOfMonth) + " to " + sdf.format(lastDayOfMonth));
        System.out.println("========================================================\n");
		double totalOrder = 0.0;
		for(Order order : arrOrders)
		{
			if(!order.isPrepaid())
			{
			if(order.getOrderDate().after(firstDayOfMonth) && order.getOrderDate().before(lastDayOfMonth))
			{
				order.print();
				for(Orderline ordline : order.getArrOrderline())
				{
					totalOrder = totalOrder + ordline.computePrice();
				}
			}
			}
		}
		System.out.println("\n=====================================================");
		System.out.printf("\n GRAND TOTAL:\t $%,.2f", totalOrder);
		
		
	}
	
	public void print()
	{
		System.out.println("------------------------------------------------------");
		System.out.println("Customer type:\tCorporate Customer");
		System.out.println("Name:\t" + this.getName());
		System.out.println("Address:\t" + this.getAddress());
		System.out.println("Phone:\t" + this.getPhone());
		System.out.println("Credit limit:\t" + this.getCreditLimit());
		System.out.println("Credit Rating:\t" + this.getCreditRating());
		System.out.println("Payment Method:\t" + this.getPaymentMethod().getPaymentMethod());
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
			if(arrOrders.size() > 0)
			{
				if(arrOrders.get(arrOrders.size()-1).getOrderPrice() > creditLimit)
					return PaymentMethod.PREPAID;
				else
					return PaymentMethod.POSTPAID;
			}
			else
			{
				return PaymentMethod.POSTPAID;	
			}
		}
	}
}
