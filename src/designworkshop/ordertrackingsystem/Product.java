package designworkshop.ordertrackingsystem;

public class Product implements IProduct{
	private String description;
	private String productnumber;
	private double price;
	
	public double getPrice()
	{
		return price;
	}

}
