package assignment04;

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
		
	}
	
	//public Paycheck calcCompensation()
	

}
