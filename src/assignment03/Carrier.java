package assignment03;

public abstract class Carrier implements Comparable <Carrier>{
	
	private String name;
	private Package paCkage;
	private double price;
	private Sender sender;
	
	public Sender getSender() {
		return sender;
	}

	public void setSender(Sender sender) {
		this.sender = sender;
	}

	public Carrier(String name, Package paCkage)
	{
		this.name = name;
		this.setPaCkage(paCkage);
	}

	public String getName() {
		return name;
	}

	abstract double getPrice();
	
	public void setPrice()
	{
		price = getPrice();
	}

	public Package getPaCkage() {
		return paCkage;
	}

	public void setPaCkage(Package paCkage) {
		this.paCkage = paCkage;
	}
	
	public double discountOff()
	{
		return price * sender.getDiscountRate();
	}
	
	public int compareTo(Carrier o)
	{
		if(this.price < o.price)
			return -1;
		else if(this.price > o.price)
			return 1;
		else
			return 0;
	}

}
