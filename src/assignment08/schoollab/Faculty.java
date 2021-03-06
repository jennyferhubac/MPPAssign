package assignment08.schoollab;

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
		/*
		for(Course course : alCourse)
		{
			totUnits = totUnits + course.getUnits();
		}
		*/
		totUnits = alCourse.stream()
		        .mapToInt(Course::getUnits)
		        .reduce(0, (a,b) -> a + b);
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
		return alCourse;
	}
	


}
