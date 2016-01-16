package designworkshop.ordertrackingsystem;

public class Product implements IProduct{
	private String description;
	private String productNumber;
	private double price;
	
	private ACompPoints compPoints;
	
	Product()
	{
		
	}
	
	Product( String productNumber, String description, double price, ACompPoints compPoints)
	{
		this.productNumber = productNumber;
		this.description = description;
		this.price = price;
		this.compPoints = compPoints;
	}
	
	public double getPrice()
	{
		return price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public ACompPoints getCompPoints() {
		return compPoints;
	}

	public void setCompPoints(ACompPoints compPoints) {
		this.compPoints = compPoints;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
