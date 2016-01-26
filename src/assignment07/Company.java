package assignment07;

import java.util.*;

public class Company {
	private String name;
	private ArrayList<Department> arrDepartment;
	final Department execDept = new Department("Executive", "34 Raffles City");
	
	Company()
	{
		arrDepartment = new ArrayList<Department>();
	}
	
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
	
	public ArrayList<Department> getArrDepartment() {
		return arrDepartment;
	}

	public void setArrDepartment(ArrayList<Department> arrDepartment) {
		this.arrDepartment = arrDepartment;
	}

	public Department getExecDept() {
		return execDept;
	}
	
	public void addDepartment(Department department)
	{
		arrDepartment.add(department);
	}
	
	public void printReportingHierarchy()
	{
		getTopExecutive().print();
		System.out.println("\n===================================================\n");
		if(arrDepartment.size() > 0)
		{
			for(Department dept : arrDepartment)
			{
				if(!dept.equals(execDept))
					dept.printReportingHierarchy();
			}
		}
	}
	
	public Position getTopExecutive()
	{
		Position topExec = new Position();
		boolean isTopExecFound = false;
		
		if(arrDepartment.size() > 0)
		{
			for(Department dept : arrDepartment)
			{
				if(dept.equals(execDept))
				{
					topExec = dept.getDepartmentHead();
					isTopExecFound = true;
					break;
				}
			}
		}
		
		if(!isTopExecFound)
			topExec = null;
		
		return topExec;
	}

	@Override
	public int hashCode() {
		final int prime = 19;
		int result = 1;
		result = prime * result + ((arrDepartment == null) ? 0 : arrDepartment.hashCode());
		result = prime * result + ((execDept == null) ? 0 : execDept.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object o)
	{
		if(o == null) return false;
		if(getClass() != o.getClass()) return false;
		Company comp = (Company)o;
		if(comp.getArrDepartment() == null)
		{
			if(arrDepartment != null)
				return false;
		}
		if(comp.getName().equals(name) && 
				comp.getArrDepartment().equals(arrDepartment) &&
				comp.getExecDept().equals(execDept))
			return true;
		else
			return false;
	}

}
