package assignment02;

import java.util.*;

public class Department {
	private String name;
	private String location;
	
	private Company company;
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	private ArrayList<Position> arrPosition;
	
	Department(String name, String location)
	{
		this.name = name;
		this.location = location;
		
		arrPosition = new ArrayList<Position>();
	}
	
	public void print()
	{
		System.out.println("Department Name: " + name);
		System.out.println("----------------------------------------\n");

		if(arrPosition.size() > 0)
		{
			for(Position pos : arrPosition)
			{
				pos.print();
			}
		}
	}
	
	public double getSalary()
	{
		double totSalary = 0.0;
		
		for(Position pos : arrPosition)
		{
			totSalary = totSalary + pos.getSalary();
		}
		
		return totSalary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}
	
	public void addPostion(Position position)
	{
		arrPosition.add(position);
	}
	
	public Position getDepartmentHead()
	{
		Position deptHead = new Position();
		boolean isDeptHeadFound = false;
		
		if(arrPosition.size() > 0)
		{
			for(Position pos : arrPosition)
			{
				if(pos.isSuperior())
				{
					deptHead = pos;
					isDeptHeadFound = true;
					break;
				}
			}
		}
		
		if(!isDeptHeadFound)
			deptHead = null;
		
		return deptHead;
	}
	
	public void printReportingHierarchy()
	{
		System.out.println("Department Name: " + name);
		System.out.println("----------------------------------------\n");
		
		Position deptHead = getDepartmentHead();
		deptHead.printDownLine();
	}

}
