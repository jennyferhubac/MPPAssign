package assignment02;

import java.util.*;

public class Company {
	private String name;
	private ArrayList<Department> arrDepartment;
	
	Company(String name)
	{
		this.name = name;
		arrDepartment = new ArrayList<Department>();
	}
	
	public void print()
	{
		System.out.println("Company Name: " + name);
		System.out.println("========================================\n");
		if(arrDepartment.size() > 0)
		{
			for(Department dp : arrDepartment)
			{
				dp.print();
			}
		}
	}
	
	public double getSalary()
	{
		double totSalary = 0.0;
		
		for(Department dept : arrDepartment)
		{
			totSalary = totSalary + dept.getSalary();
		}
		
		return totSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addDepartment(Department department)
	{
		arrDepartment.add(department);
	}

}
