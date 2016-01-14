package designworkshop.ordertrackingsystem;

public class CorporateCust extends ACustomer{
	
	private CreditRating creditRating;

	CorporateCust(String name, String address, String phone)
	{
		super(name, address, phone);
	}
	
	public CreditRating getCreditRating()
	{
		return creditRating;
	}
	
	public void setCreditRating(CreditRating creditRating)
	{
		this.creditRating = creditRating;
	}
}
