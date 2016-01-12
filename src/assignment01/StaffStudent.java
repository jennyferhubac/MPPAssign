package assignment01;

import java.time.LocalDate;
import java.util.ArrayList;

public class StaffStudent extends Staff{
	private double gpa;
	LocalDate dtStartOfCourse;
	
	ArrayList<Course> alCourse;
	
	StaffStudent(String name, String phone, int age, double salary, double gpa, LocalDate dtStartOfCourse)
	{
		super(name, phone, age, salary);
		this.gpa = gpa;
		this.dtStartOfCourse = dtStartOfCourse;
		alCourse = new ArrayList<Course>();
	}

	public double getGpa() {
		return gpa;
	}

	public LocalDate getDtStartOfCourse() {
		return dtStartOfCourse;
	}
	
	public int getTotalUnits()
	{
		int totUnit = 0;
		for(Course course : alCourse)
		{
			totUnit = totUnit + course.getUnits();
		}
		return totUnit;
	}
	
	public void addCourse(Course course)
	{
		if(!alCourse.contains(course))
		{
			alCourse.add(course);
		}
	}

	public ArrayList<Course> getAlCourse() {
		return alCourse;
	}
}
