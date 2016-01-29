package assignment08.schoollab;

public class Staff extends Person{
	private double salary;
	
	Staff(String name, String phone, int age, double salary)
	{
		super(name, phone, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

}
