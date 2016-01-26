package assignment07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Employee implements Cloneable{
	private String employeeID;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private LocalDate birthDate;
	private String SSN;
	private double salary;
	private Position position;
	
	Employee()
	{

	}
	
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
	
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public void print()
	{
		//DateTimeFormatter dtFmt = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		System.out.println("\t\t\tEmployee ID: " + employeeID);
		System.out.println("\t\t\tEmployee Name: " + firstName + " " + middleInitial + " " + lastName);
		System.out.println("\t\t\tDate of Birth: " + birthDate.toString());
		System.out.println("\t\t\tSSN: " + SSN);
		System.out.printf("\t\t\tSalary: $%,.2f \n", salary);
		System.out.println("\t\t\tPosition: " + position.getTitle() + "\n");
		
	}

	@Override
	public int hashCode() {
		final int prime = 19;
		int result = 1;
		result = prime * result + ((SSN == null) ? 0 : SSN.hashCode());
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((employeeID == null) ? 0 : employeeID.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleInitial == null) ? 0 : middleInitial.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Employee emp = (Employee) o;
		if (SSN == null) {
			if (emp.SSN != null)
				return false;
		} else if (!SSN.equals(emp.SSN))
			return false;
		if (birthDate == null) {
			if (emp.birthDate != null)
				return false;
		} else if (!birthDate.equals(emp.birthDate))
			return false;
		if (employeeID == null) {
			if (emp.employeeID != null)
				return false;
		} else if (!employeeID.equals(emp.employeeID))
			return false;
		if (firstName == null) {
			if (emp.firstName != null)
				return false;
		} else if (!firstName.equals(emp.firstName))
			return false;
		if (lastName == null) {
			if (emp.lastName != null)
				return false;
		} else if (!lastName.equals(emp.lastName))
			return false;
		if (middleInitial == null) {
			if (emp.middleInitial != null)
				return false;
		} else if (!middleInitial.equals(emp.middleInitial))
			return false;
		if (position == null) {
			if (emp.position != null)
				return false;
		} else if (!position.equals(emp.position))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(emp.salary))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "ID:      " + employeeID + "\n" +
			   "Name:    " + firstName + " " + middleInitial + " " + lastName + "\n" +
			   "DOB:     " + birthDate.toString() + "\n" +
			   "SSN:     " + SSN + "\n" +
			   "Salary:  $" + String.format("%,.2f", salary) + "\n" +
			   "Position:" + position.getTitle() + "\n";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		Employee empCloned = (Employee) super.clone();
		empCloned.setPosition((Position)empCloned.getPosition().clone());
		return empCloned;
	}
	
	
	
}
