package assignment04;

import java.util.*;
import java.time.*;

public class PayrollApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hourly annaSmith = new Hourly("001", "Anna Smith", 12, 40);
		Salaried benJones = new Salaried("002", "Ben Jones", 4525.00);
		Commissioned dennyKing = new Commissioned("003", "Denny King", 0.07, 2525.00);
		
		Order order1 = new Order(1, LocalDate.of(2016, 1, 4), 1250.50, dennyKing);
		Order order2 = new Order(2, LocalDate.of(2016, 1, 6), 3250.75, dennyKing);
		
		dennyKing.addOrder(order1);
		dennyKing.addOrder(order2);
		
		annaSmith.print();
		annaSmith.calcCompensation(1, 2016).print();
		
		benJones.print();
		benJones.calcCompensation(1, 2016).print();
		
		dennyKing.print();
		dennyKing.calcCompensation(1, 2016).print();

	}

}
