package assignment01;

import java.util.*;

public class Faculty extends Person{
	private double salary;
	private ArrayList<Course> alCourse;
	
	Faculty(String name, String phone, int age, double salary)
	{
		super(name, phone, age);
		this.salary = salary;
		
		alCourse = new ArrayList<Course>();
	}
	
	public int getTotalUnits()
	{
		int totUnits = 0;
		
		return totUnits;
	}

	public double getSalary() {
		return salary;
	}
	
	public void addCourse(Course course)
	{
		alCourse.add(course);
	}
	
	public ArrayList<Course> getAllCoursesByFaculty()
	{
		ArrayList<Course> arrCourses = new ArrayList<Course>();
		
		for(Course course : alCourse)
		{
			if(course.getFaculty() == faculty)
			{
				arrCourses.add(course);
			}
		}
		
		return arrCourses;
	}
	


}
