package assignment03;

public class UPS extends Carrier{
	
	UPS(String name, Package paCkage)
	{
		super(name, paCkage);
	}
	
	public double getPrice()
	{
		return  (getPaCkage().getWeight() * 0.45) - discountOff();
	}

}
