package assignment07;

import java.util.*;
public class Position {
	private String title;
	private String description;
	
	private Department department;

	private Employee employee;
	private ArrayList<Position> arrInferiorPosition;
	private boolean isSuperior = false;
	
	Position()
	{
		employee = new Employee();
		department = new Department();
		arrInferiorPosition = new ArrayList<Position>();
	}
	
	Position(String title, String description)
	{
		this.title = title;
		this.description = description;
		employee = new Employee();
		department = new Department();
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
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
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
		
		if(!employee.getEmployeeID().isEmpty())
		{
			employee.print();
			System.out.println("");
		}
		else
		{
			System.out.println(whiteSpace + "Currently " + title + " is vacant.\n");
		}
	}
	
	public double getSalary()
	{
		return employee.getSalary();
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public ArrayList<Position> getArrInferiorPosition() {
		return arrInferiorPosition;
	}

	@Override
	public int hashCode() {
		final int prime = 19;
		int result = 1;
		result = prime * result + ((arrInferiorPosition == null) ? 0 : arrInferiorPosition.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + (isSuperior ? 1 : 0);
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Position pos = (Position) o;
		if (arrInferiorPosition == null) {
			if (pos.arrInferiorPosition != null)
				return false;
		} else if (!arrInferiorPosition.equals(pos.arrInferiorPosition))
			return false;
		if (department == null) {
			if (pos.department != null)
				return false;
		} else if (!department.equals(pos.department))
			return false;
		if (description == null) {
			if (pos.description != null)
				return false;
		} else if (!description.equals(pos.description))
			return false;
		if (employee == null) {
			if (pos.employee != null)
				return false;
		} else if (!employee.equals(pos.employee))
			return false;
		if (isSuperior != pos.isSuperior)
			return false;
		if (title == null) {
			if (pos.title != null)
				return false;
		} else if (!title.equals(pos.title))
			return false;
		return true;
	}
	
	@Override
	public String toString()
	{
		return "";
	}

	
	
	



}
