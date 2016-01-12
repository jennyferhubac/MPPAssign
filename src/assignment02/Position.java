package assignment02;

import java.util.*;
public class Position {
	private String title;
	private String description;
	private ArrayList<Employee> arrEmployee;
	
	Position(String title, String description)
	{
		this.title = title;
		this.description = description;
		arrEmployee = new ArrayList<Employee>();
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}
	
	public void addEmployee(Employee employee)
	{
		arrEmployee.add(employee);
	}
	
	public void print()
	{
		System.out.println("Position: " + title.toUpperCase());
		System.out.println("Description: " + description + "\n");
		
		if(arrEmployee.size() > 0)
		{
			for(Employee emp : arrEmployee)
			{
				emp.print();
			}
			System.out.println("");
		}
		else
		{
			System.out.println("Currently " + title + " is vacant.\n");
		}
	}
	
	public double getSalary()
	{
		double totSalary = 0.0;
		
		for(Employee emp : arrEmployee)
		{
			totSalary = totSalary + emp.getSalary();
		}
		
		return totSalary;
	}

}
