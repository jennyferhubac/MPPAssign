package assignment04;

public class Hourly extends Employee{
	private double hourlyWage;
	private double hoursPerWeek;
	
	Hourly()
	{
		
	}
	Hourly(String empId,String name, double hourlyWage, double hoursPerWeek)
	{
		super(empId, name);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	public double getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	public double getHoursPerWeek() {
		return hoursPerWeek;
	}
	public void setHoursPerWeek(double hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	public double calcGrossPay(DateRange dr)
	{
		return hoursPerWeek * hourlyWage * 4;
	}

}
