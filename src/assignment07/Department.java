package assignment07;

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
	
	Department()
	{
		arrPosition = new ArrayList<Position>();
	}
	
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

	public ArrayList<Position> getArrPosition() {
		return arrPosition;
	}

	public void setArrPosition(ArrayList<Position> arrPosition) {
		this.arrPosition = arrPosition;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public int hashCode() {
		final int prime = 19;
		int result = 1;
		result = prime * result + ((arrPosition == null) ? 0 : arrPosition.hashCode());
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Department dept = (Department) o;
		if (arrPosition == null) {
			if (dept.arrPosition != null)
				return false;
		} else if (!arrPosition.equals(dept.arrPosition))
			return false;
		if (company == null) {
			if (dept.company != null)
				return false;
		} else if (!company.equals(dept.company))
			return false;
		if (location == null) {
			if (dept.location != null)
				return false;
		} else if (!location.equals(dept.location))
			return false;
		if (name == null) {
			if (dept.name != null)
				return false;
		} else if (!name.equals(dept.name))
			return false;
		return true;
	}

	

}
