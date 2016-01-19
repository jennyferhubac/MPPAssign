package assignment04;

public class Salaried extends Employee{
	private double salary;
	
	Salaried()
	{
		
	}
	
	Salaried(String empId, String name, double salary)
	{
		super(empId, name);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double calcGrossPay(DateRange dr)
	{
		return salary;
	}

}
