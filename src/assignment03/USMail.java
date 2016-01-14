package assignment03;

public class USMail extends Carrier{
	
	USMail(String name, Package paCkage)
	{
		super(name, paCkage);
	}
	
	public double getPrice()
	{
		if(getPaCkage().getWeight() <= 3.0)
			return 1.0 - discountOff();
		else
			return (getPaCkage().getWeight() * 0.55) - discountOff();
	}

}
