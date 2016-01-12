package assignment02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Employee {
	private String employeeID;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private LocalDate birthDate;
	private String SSN;
	private double salary;
	private Position position;
	
	Employee(String employeeID, String firstName, String middleInitial, String lastName, LocalDate birthDate, String SSN, double salary, Position position)
	{
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.SSN = SSN;
		this.salary = salary;
		this.position = position;
	}
	
	public String getEmployeeID() {
		return employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public String getSSN() {
		return SSN;
	}

	public double getSalary() {
		return salary;
	}

	public Position getPosition() {
		return position;
	}

	public void print()
	{
		//DateTimeFormatter dtFmt = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Employee Name: " + firstName + " " + middleInitial + " " + lastName);
		System.out.println("Date of Birth: " + birthDate.toString());
		System.out.println("SSN: " + SSN);
		System.out.println("Salary: " + salary);
		System.out.println("Position: " + position.getTitle() + "\n");
		
	}

}
