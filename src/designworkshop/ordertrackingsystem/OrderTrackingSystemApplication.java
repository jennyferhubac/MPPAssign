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
		
		/*Product lists*/
		Product bbCream = new Product("001", "BB Cream",  3.5, healthPoints);
		Product eyebrowPencil = new Product("002","Eyebrow Pencil", 1.5, healthPoints);
		Product vitaminC = new Product("003", "Vitamin C 500mg", 12.50, healthPoints);
		
		Product modem = new Product("123", "Modem", 10.75, compPoints);
		Product mousePad = new Product("435", "Mouse Pad", 3.25, compPoints);
		Product router = new Product("564", "D-link Router", 20.45, compPoints);
		Product usbFlash = new Product("345", "USB Flashdrive", 12.50, compPoints);
		
		Product oreo = new Product("237", "Oreo Cookies", 2.75, otherPoints);
		
		
		//PersonalCust jennyCust = new PersonalCust("Jennyfer", "Fairfield, IA", "641-451-3333", "1234 4567 8900");
		
		CorporateCust jennyCust = new CorporateCust("Jennyfer", "Fairfield, IA", "641-451-3333");
		jennyCust.setCreditLimit(500.00);
		
		//----------------------------------------------
		//Order #1
		Order jenOrd1 = new Order("001-001", sdf.parse("2015-12-23"));
		jenOrd1.setCustomer(jennyCust);
		
		jennyCust.addOrder(jenOrd1);
	
		Orderline ord1 = new Orderline(2, bbCream);
		Orderline ord2 = new Orderline(3, eyebrowPencil);
		
		ord1.setShipDate(sdf.parse("2015-12-26"));
		ord2.setShipDate(sdf.parse("2015-12-26"));
		
		ord1.setStatus("SHIPPED");
		ord2.setStatus("SHIPPED");
		
		jenOrd1.addOrderline(ord1);
		jenOrd1.addOrderline(ord2);
		
		jennyCust.getPaymentMethod();
		
		//------------------------------------------------
		
		Order jenOrd2 = new Order("001-002", sdf.parse("2016-01-14"));
		jenOrd2.setCustomer(jennyCust);
		
		jennyCust.addOrder(jenOrd2);
		
		Orderline ord3 = new Orderline(3, oreo);
		Orderline ord4 = new Orderline(12, usbFlash);
		Orderline ord5 = new Orderline(2, router);
		
		jenOrd2.addOrderline(ord3);
		jenOrd2.addOrderline(ord4);
		jenOrd2.addOrderline(ord5);
		
		ord3.setShipDate(sdf.parse("2016-01-15"));
		ord3.setStatus("SHIPPED");
		
		ord3.setShipDate(sdf.parse("2016-01-15"));
		ord4.setStatus("ON DELIVERY");
		
		ord5.setStatus("OUT OF STOCK");
		
		jennyCust.getPaymentMethod();
		
		//------------------------------------------------
		
		Order jenOrd3 = new Order("001-003", sdf.parse("2016-01-14"));
		jenOrd3.setCustomer(jennyCust);
	
		jennyCust.addOrder(jenOrd3);
		
		Orderline ord6 = new Orderline(2, mousePad);
		Orderline ord7 = new Orderline(3, bbCream);
		Orderline ord8 = new Orderline(2, modem);
		
		jenOrd3.addOrderline(ord6);
		jenOrd3.addOrderline(ord7);
		jenOrd3.addOrderline(ord8);
		
		ord6.setStatus("OUT OF STOCK");
		ord7.setStatus("OUT OF STOCK");
		ord8.setStatus("OUT OF STOCK");
		
		jennyCust.getPaymentMethod();
		
		//------------------------------------------------
		//print
		jennyCust.print();
		//jennyCust.printOrders();
		jennyCust.generateMonthlyBill();
		
		}
		catch(ParseException ex)
		{
			ex.printStackTrace();
		}
		

	}

}
