package assignment04;

import java.util.*;

public class Commissioned extends Employee{
	private double commission;
	private double baseSalary;
	
	ArrayList<Order> arrOrder;
	
	Commissioned()
	{
		arrOrder = new ArrayList<Order>();
	}
	Commissioned(String empId, String name, double commission, double baseSalary)
	{
		super(empId, name);
		this.commission = commission;
		this.baseSalary = baseSalary;
		
		arrOrder = new ArrayList<Order>();
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public ArrayList<Order> getArrOrder() {
		return arrOrder;
	}
	public void setArrOrder(ArrayList<Order> arrOrder) {
		this.arrOrder = arrOrder;
	}
	public void addOrder(Order order)
	{
		arrOrder.add(order);
	}
	public double calcGrossPay(DateRange dr)
	{
		double totOrder = 0.0;
		
		for(Order order : arrOrder)
		{
			if(dr.getStartDate().isBefore(order.getOrderDate()) && dr.getEndDate().isAfter(order.getOrderDate()))
			{
				totOrder = totOrder + order.getOrderAmount();
			}
		}
		
		return baseSalary + (totOrder * commission);
	}
	

}
