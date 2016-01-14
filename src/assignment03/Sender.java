package assignment03;

public enum Sender {
	
	STUDENT(0.10), SENIOR(0.15), OTHERS(0.0);
	
	private double discountRate;
	
	private Sender(double discountRate)
	{
		this.discountRate = discountRate;
	}
	
	public double getDiscountRate()
	{
		return discountRate;
	}

}
