package assignment04;

public enum Tax {
	FICA(0.23), STATE(0.05), LOCAL(0.01), MEDICARE(0.03), SOCIAL_SECURITY(0.075);
	
	private double taxRate;
	
	private Tax(double taxRate)
	{
		this.taxRate = taxRate;
	}
	
	public double getTaxRate()
	{
		return taxRate;
	}
}
