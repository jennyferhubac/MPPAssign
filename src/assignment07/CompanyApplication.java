package assignment07;

import java.util.*;

import java.text.DecimalFormat;
import java.time.*;
import java.util.*;

public class CompanyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company comp1 = new Company("Avanade Asia Pte Ltd");
		Company comp2 = new Company("Avanade Asia Pte Ltd");
		
		Department dep1 = new Department("IT Department", "Raffles 33-B");
		Department dep2 = new Department("IT Department", "Raffles 33-B");
		
		Position pos1 = new Position("Senior Analyst","Developer");
		Position pos2 = new Position("Consultant","Developer");
		
		Employee emp1 = new Employee("001", "Cyrus", "C", "David",LocalDate.of(1982, 10, 18), "477-3225", 3500.00, pos1);
		Employee emp2 = new Employee("001", "Cyrus", "C", "David",LocalDate.of(1982, 10, 18), "477-3225", 3500.00, pos1);
		//Employee(String employeeID, String firstName, String middleInitial, String lastName, LocalDate birthDate, String SSN, double salary, Position position)
		//Employee cyDavid = new Employee("1000-0002", "Cyrus", "C", "David", LocalDate.of(1982, 10, 18), "477-3225", 6500.00, consultant);
	
		
		comp1.addDepartment(dep1);
		comp2.addDepartment(dep2);
		
		dep1.addPostion(pos1);
		dep2.addPostion(pos1);
		
		//System.out.println(comp1.equals(comp2));
		
		//System.out.println(dep1.equals(dep2));
		
		//System.out.println(pos1.equals(pos2));
		
		//System.out.println(emp1.equals(emp2));
		
		//System.out.println(emp1.hashCode());
		//System.out.println(emp2.hashCode());
		
		System.out.println(dep1.hashCode());
		System.out.println(dep2.hashCode());
		
		System.out.println(emp1.toString());
	}

}
