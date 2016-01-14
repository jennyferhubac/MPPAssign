package assignment03;

import java.util.*;

public class USPostApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Package> arrPackage = new ArrayList<Package>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hi! Welcome to MUM Post.");
		System.out.println("Please enter type of Sender: (Student, Senior, Others) ");
		Sender sender = setSender(sc.nextLine());
		
		System.out.println("Please enter total number of packages.");
		int totPackage = Integer.parseInt(sc.nextLine());
		
		String packageDesc = "";
		double weight = 0.0;
		Zone zone = Zone.OTHERS;
		
		Package pack;
		
		for(int i = 0; i < totPackage; i++)
		{
			System.out.println("Enter package description: ");
			packageDesc = sc.nextLine();
			System.out.println("Enter package weight in pounds(lbs): ");
			weight = Double.valueOf(sc.nextLine()).doubleValue();
			System.out.println("Enter package zone: (IA, MT, OR, CA, TX, UT, FL, MA, OH, OTHERS) ");
			zone = setZone(sc.nextLine());
			
			pack = new Package(packageDesc, weight, zone);
			
			arrPackage.add(pack);
		}
		
		setLowestPrice(arrPackage, sender);
		
		//sc.close();

	}
	
	private static Zone setZone(String zone)
	{
		switch(zone.toUpperCase().trim())
		{
		case "IA": return Zone.IA;
		case "MT": return Zone.MT;
		case "OR": return Zone.OR;
		case "CA": return Zone.CA;
		case "TX": return Zone.TX;
		case "UT": return Zone.UT;
		case "FL": return Zone.FL;
		case "MA": return Zone.MA;
		case "OH": return Zone.OH;
		default:
			return Zone.OTHERS;
		}
	}
	
	private static Sender setSender(String sender)
	{
		switch(sender.toUpperCase().trim())
		{
		case "STUDENT": return Sender.STUDENT;
		case "SENIOR" : return Sender.SENIOR;
		default:
			return Sender.OTHERS;
		}
	}
	
	private static void setLowestPrice(ArrayList<Package> arrPackage, Sender sender)
	{
		ArrayList<Carrier> arrCarrier;
		
		UPS ups;
		USMail usMail;
		FedEx fedEx;
		
		Carrier carrier;
		
		for(Package pack : arrPackage)
		{
			arrCarrier = new ArrayList<Carrier>();
			
			ups = new UPS("UPS", pack);
			ups.setSender(sender);
			ups.setPrice();
			arrCarrier.add(ups);
			
			usMail = new USMail("US Mail", pack);
			usMail.setSender(sender);
			usMail.setPrice();
			arrCarrier.add(usMail);
			
			fedEx = new FedEx("FedEx", pack);
			fedEx.setSender(sender);
			fedEx.setPrice();
			arrCarrier.add(fedEx);
			
			carrier = getLowestPriceCarrier(arrCarrier);
			
			
			System.out.printf(pack.getPackageDesc() + "\t$%,.2f" + "\t" + carrier.getName() + "\n", carrier.getPrice());

		}
	}
	
	private static double getLowestPrice(ArrayList<Double> arrPrice)
	{
		if(arrPrice.size() > 0)
		{
			Collections.sort(arrPrice);
			return arrPrice.get(0);
		}
		else
		{
			return 0.0;
		}
	}
	
	private static Carrier getLowestPriceCarrier(ArrayList<Carrier> arrCarrier)
	{
		if(arrCarrier.size() > 0)
		{
			Collections.sort(arrCarrier);
			return arrCarrier.get(0);
		}
		else
			return null;
		
	}
	

}
