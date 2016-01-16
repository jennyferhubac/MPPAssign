package designworkshop.ordertrackingsystem;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.*;
import java.text.*;

public class OrderTrackingSystemApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		HealthPoints healthPoints = new HealthPoints();
		ComputerPoints compPoints = new ComputerPoints();
		AudioVideoPoints audVidPoints = new AudioVideoPoints();
		OtherPoints otherPoints = new OtherPoints();
			
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		PersonalCust jennyCust = new PersonalCust("Jennyfer", "Fairfield, IA", "641-451-3333", "1234 4567 8900");
		
		Order jenOrd1 = new Order("001-001", sdf.parse("2015-12-23"));
		jenOrd1.setCustomer(jennyCust);
		
		jennyCust.addOrder(jenOrd1);
		
		Product bbCream = new Product("001", "BB Cream",  3.5, healthPoints);
		Product eyebrowPencil = new Product("002","Eyebrow Pencil", 1.5, healthPoints);
		
		Orderline ord1 = new Orderline(1, bbCream);
		Orderline ord2 = new Orderline(1, eyebrowPencil);
		
		ord1.setShipDate(sdf.parse("2015-12-26"));
		ord2.setShipDate(sdf.parse("2015-12-26"));
		
		ord1.setStatus("SHIPPED");
		ord2.setStatus("ON DELIVERY");
		
		jenOrd1.addOrderline(ord1);
		jenOrd1.addOrderline(ord2);
		
		jennyCust.print();
		jennyCust.printOrders();
		
		}
		catch(ParseException ex)
		{
			ex.printStackTrace();
		}
		

	}

}
