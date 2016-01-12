package assignment01;

import java.util.ArrayList;

public class Student extends Person{
	private double gpa;
	
	ArrayList<Course> alCourse;
	
	Student(String name, String phone, int age, double gpa)
	{
		super(name, phone, age);
		this.gpa = gpa;
		alCourse = new ArrayList<Course>();
	}
	
	public double getGpa() {
		return gpa;
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
