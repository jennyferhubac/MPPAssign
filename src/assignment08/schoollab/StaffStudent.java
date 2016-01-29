package assignment08.schoollab;

import java.time.LocalDate;
import java.util.ArrayList;

public class StaffStudent extends Student implements IEmployee{
	private double salary;
	LocalDate dtStartOfCourse;
	
	ArrayList<Course> alCourse;
	
	StaffStudent(String name, String phone, int age, double salary, double gpa, LocalDate dtStartOfCourse)
	{
		super(name, phone, age, gpa);
		setSalary(salary);
		this.dtStartOfCourse = dtStartOfCourse;
		alCourse = new ArrayList<Course>();
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public double getSalary()
	{
		return salary;
	}

	public LocalDate getDtStartOfCourse() {
		return dtStartOfCourse;
	}
}
