package assignment02;

import java.util.*;
import java.text.DecimalFormat;
import java.time.*;

public class CompanyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company company = new Company("Avanade Asia Pte Ltd");
		
		Department itDept = new Department("IT Department","31-A Raffles City Tower");
		Department salesDept = new Department("Sales Department","31-B Raffles City Tower");
		
		company.addDepartment(itDept);
		company.addDepartment(salesDept);
		
		Position seniorAnalyst = new Position("Senior Analyst", "A Senior Analyst should have at least 5 years working experience in .NET.");
		Position consultant = new Position("Consultant", "A consultant should have at least 10 years working experience in .NET");
		Position itManager = new Position("IT Manager", "A manager should have at least 5 years experience of leading a team.");
		
		itDept.addPostion(seniorAnalyst);
		itDept.addPostion(consultant);
		itDept.addPostion(itManager);
		
		Employee markCheng = new Employee("1000-0001", "Mark", "U", "Cheng", LocalDate.of(1982, 9, 24), "456-5678", 10500.00, itManager);
		Employee cyDavid = new Employee("1000-0002", "Cyrus", "C", "David", LocalDate.of(1982, 10, 18), "477-3225", 6500.00, consultant);
		
		itManager.addEmployee(markCheng);
		consultant.addEmployee(cyDavid);
		
		Position salesManager = new Position("Sales Manager", "A Sales Manager should have at least 5 years managerial experience in Sales.");
		Position assistantSales = new Position("Assistant Sales Personnel", "An Assistant Sales Person should be able to cover the main sales person if not around.");
		Position salesPerson = new Position("Sales Personnel", "A Sales Personnel should be able to handle customers.");
		
		salesDept.addPostion(salesManager);
		salesDept.addPostion(assistantSales);
		salesDept.addPostion(salesPerson);
		
		Employee amandaPaige = new Employee("1000-0002", "Amanda", "C", "Paige", LocalDate.of(1980, 12, 18), "451-3335", 11500.85, salesManager);
		Employee lizaSmith = new Employee("1000-0002", "Liza", "M", "Smith", LocalDate.of(1985, 9, 18), "453-3348", 4675.00, salesPerson);
		
		salesManager.addEmployee(amandaPaige);
		salesPerson.addEmployee(lizaSmith);
		
		company.print();
		
		System.out.println("\n========================================\n");
        DecimalFormat dFormat = new DecimalFormat("####,###,###.00");
        System.out.println("The company total salary: " + "$" + dFormat.format(company.getSalary()));

	}

}
