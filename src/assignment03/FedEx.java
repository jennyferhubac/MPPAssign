package assignment03;

public class FedEx extends Carrier{
	
	FedEx(String name, Package paCkage)
	{
		super(name, paCkage);
	}
	
	public double getPrice()
	{
		return (getPaCkage().getWeight() * getPaCkage().getZone().getZoneRate()) - discountOff();
	}

}
