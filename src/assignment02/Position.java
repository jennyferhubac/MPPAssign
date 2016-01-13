package assignment02;

import java.util.*;
public class Position {
	private String title;
	private String description;
	private ArrayList<Employee> arrEmployee;
	private ArrayList<Position> arrInferiorPosition;
	private boolean isSuperior = false;
	
	Position()
	{
		
	}
	
	Position(String title, String description)
	{
		this.title = title;
		this.description = description;
		arrEmployee = new ArrayList<Employee>();
		arrInferiorPosition = new ArrayList<Position>();
	}

	public boolean isSuperior() {
		return isSuperior;
	}

	public void setSuperior(boolean isSuperior) {
		this.isSuperior = isSuperior;
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
	
	public void addDirectInferiorPosition(Position position)
	{
		arrInferiorPosition.add(position);
	}
	
	public void printDownLine()
	{
		print();
		
		String whiteSpace = "";
		
		if(!isSuperior)
		{
			if(arrInferiorPosition.size() > 0)
				whiteSpace = "\t\t";
			else
				whiteSpace = "\t\t\t";
		}
		System.out.println(whiteSpace + "Position " + title + " has the following downline: ");
		System.out.println(whiteSpace + "---------------------------------------------------\n");
		
		
		if(arrInferiorPosition.size() > 0)
		{
			for(Position pos : arrInferiorPosition)
			{
				pos.printDownLine();
			}
		}
		else
		{
			System.out.println("\n" + whiteSpace + "Currently there is no downline for " + title + " position. \n");
		}
	}
	
	public void print()
	{
		String whiteSpace = "";
		
		if(!isSuperior)
		{
			if(arrInferiorPosition.size() > 0)
				whiteSpace = "\t\t";
			else
				whiteSpace = "\t\t\t";
		}
		System.out.println(whiteSpace + "Position: " + title.toUpperCase());
		System.out.println(whiteSpace + "Description: " + description + "\n");
		
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
			System.out.println(whiteSpace + "Currently " + title + " is vacant.\n");
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
