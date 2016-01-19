package assignment04;

import java.time.*;

public abstract class Employee {
	private String empId;
	private String name;
	
	Employee()
	{
		
	}
	
	Employee(String empId, String name)
	{
		this.empId = empId;
		this.name = name;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void print()
	{
		System.out.println("Employee ID:\t" + empId);
		System.out.print("Name:\t" + name);
	}
	
	
	public Paycheck calcCompensation(int month, int year)
	{
		LocalDate startDate = LocalDate.of(year, month, 1);
		LocalDate endDate = DateRange.getLastDayOfMonth(startDate);
		
		DateRange dr = new DateRange(startDate, endDate);
		
		Paycheck payCheck = new Paycheck(calcGrossPay(dr), Tax.FICA.getTaxRate(),
				Tax.STATE.getTaxRate(), Tax.LOCAL.getTaxRate(), Tax.MEDICARE.getTaxRate(),
				Tax.SOCIAL_SECURITY.getTaxRate(),dr);
		
		return payCheck;
		
	}
	
	public abstract double calcGrossPay(DateRange dr);
}
