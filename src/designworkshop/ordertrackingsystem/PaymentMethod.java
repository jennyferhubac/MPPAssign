package designworkshop.ordertrackingsystem;

public enum PaymentMethod {
	PREPAID("PREPAID"), POSTPAID("POSTPAID");

	private String paymentMethod;
	
	private PaymentMethod(String paymentMethod)
	{
		this.paymentMethod = paymentMethod;
	}
	
	public String getPaymentMethod()
	{
		return paymentMethod;
	}
}
