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
	}

	public double getGpa() {
		return gpa;
	}

	public LocalDate getDtStartOfCourse() {
		return dtStartOfCourse;
	}
}
