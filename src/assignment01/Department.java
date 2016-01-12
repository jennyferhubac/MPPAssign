package assignment01;

import java.util.*;

public class Department {
	
	static double totSalary = 0;
	private String name;
	private ArrayList<Person> alPerson;

	
	Department(String name)
	{
		this.name = name;
		alPerson = new ArrayList<Person>();
		
	}
	
	public String getName() {
		return name;
	}

	public double getTotalSalary()
	{

		alPerson.forEach(person -> {if(person instanceof Faculty) 
			{
			Faculty faculty = (Faculty)person;
			totSalary = totSalary + faculty.getSalary();
			}
		else if(!(person instanceof Student))
		{
			Staff staff = (Staff)person;
			totSalary = totSalary + staff.getSalary();
		}
		});
		
		return totSalary;
	}
	
	public void showAllMembers()
	{
		alPerson.forEach(person -> {System.out.println(person.toString());});
	}
	
	public void unitsPerFaculty()
	{
		alPerson.forEach(person -> {
			if(person instanceof Faculty)
			{
				Faculty faculty = (Faculty)person;
				System.out.println("Name: " + faculty.getName() + " Total Units: " + faculty.getTotalUnits());
			}
			});
	}
	
	public void addPerson(Person person)
	{
		alPerson.add(person);
	}
	
	public void printAllStudentsByFaculty(Faculty faculty)
	{
		ArrayList<Course> alCourse = getAllCoursesByFaculty(faculty);
		
		for(Course course : alCourse)
		{
			for(Person person : alPerson)
			{
				if(person instanceof Student)
				{
					Student stud = (Student) person;
					if(stud.getAlCourse().contains(course))
					{
						System.out.println(stud.getName());
					}
				}
			}
		}
		
		
	}
	
	

}
