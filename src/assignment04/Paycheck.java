package assignment04;

import java.util.*;

public class Paycheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	private DateRange payPeriod;
	
	Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity, DateRange payPeriod)
	{
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
		this.payPeriod = payPeriod;
	}

	public double getGrossPay() {
		return grossPay;
	}

	public double getFica() {
		return fica;
	}

	public double getState() {
		return state;
	}

	public double getLocal() {
		return local;
	}

	public double getMedicare() {
		return medicare;
	}

	public double getSocialSecurity() {
		return socialSecurity;
	}

	public DateRange getPayPeriod() {
		return payPeriod;
	}
	
	public void print()
	{
		System.out.println("\n-------------------------------------------");
		System.out.println("Pay period:\t" + payPeriod.toString());
		System.out.printf("\nGross Pay:\t$%,.2f", grossPay);
		System.out.println("\nTaxes:");
		System.out.printf("\nFICA:\t%.2f", fica);
		System.out.printf("\nState:\t%.2f", state);
		System.out.printf("\nLocal:\t%.2f", local);
		System.out.printf("\nMedicare:\t%.2f", medicare);
		System.out.printf("\nSocial Security:\t%.2f", socialSecurity);
		System.out.printf("\n\nGross Pay:\t$%,.2f",getNetPay());
		System.out.println("\n-------------------------------------------");
	}
	
	public double getNetPay()
	{
		double totTax = fica + state + local + medicare + socialSecurity;
		return grossPay - (grossPay * totTax);
	}

}
