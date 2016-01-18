package designworkshop.librarysystem;

import java.util.*;

public class Libary {
	
	static ArrayList<Member> arrMember = new ArrayList<Member>();
	static ArrayList<ItemCopy> arrItemCopy = new ArrayList<ItemCopy>();
	static ArrayList<AItem> arrItem = new ArrayList<AItem>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isMember = false;
		
		Member jennyHubac = new Member("001","Jennyfer Hubac", "MR 608 N 4th st Fairfield", "6414513333");
		Member alizaConde = new Member("002","Aliza Conde", "MR 609 N 4th st Fairfield", "6414513332");
		Member vanessaVargas = new Member("003","Vanessa Vargas", "MR 610 N 4th st Fairfield", "6414513235");
		
		arrMember.add(jennyHubac);
		arrMember.add(alizaConde);
		arrMember.add(vanessaVargas);
		
		Book theMartian = new Book(1, "The Martian", "ISBN 001", 21, new ArrayList<String>(Arrays.asList("Andy Weir")));
		Book theAlchemist = new Book(2, "The Alchemist", "ISBN 002", 7, new ArrayList<String>(Arrays.asList("Paolo Coelho")));
		Book theNotebook = new Book(3, "The Notebook", "ISBN 003", 12, new ArrayList<String>(Arrays.asList("Nicholas Sparks")));
		
		Magazine chalk = new Magazine(4, "Chalk Mag", 1, 3);
		Magazine cosmo = new Magazine(5, "Cosmopolitan", 1, 7);
		
		arrItem.add(theMartian);
		arrItem.add(theAlchemist);
		arrItem.add(theNotebook);
		
		arrItem.add(chalk);
		arrItem.add(cosmo);
		
		ItemCopy theMartianCopy1 = new ItemCopy("001", theMartian);
		ItemCopy theMartianCopy2 = new ItemCopy("002", theMartian);
		ItemCopy theMartianCopy3 = new ItemCopy("003", theMartian);
		
		theMartian.addItemCopy(theMartianCopy1);
		theMartian.addItemCopy(theMartianCopy2);
		theMartian.addItemCopy(theMartianCopy3);
		
		ItemCopy theAlchemistCopy1 = new ItemCopy("001", theAlchemist);
		ItemCopy theAlchemistCopy2 = new ItemCopy("002", theAlchemist);
		
		theAlchemist.addItemCopy(theAlchemistCopy1);
		theAlchemist.addItemCopy(theAlchemistCopy2);
		
		ItemCopy theNotebookCopy1 = new ItemCopy("001", theNotebook);
		
		theNotebook.addItemCopy(theNotebookCopy1);
		
		ItemCopy chalkCopy1 = new ItemCopy("001", chalk);
		
		chalk.addItemCopy(chalkCopy1);
		
		ItemCopy cosmoCopy1 = new ItemCopy("001", cosmo);
		
		cosmo.addItemCopy(cosmoCopy1);
		
		arrItemCopy.add(theMartianCopy1);
		arrItemCopy.add(theMartianCopy2);
		arrItemCopy.add(theMartianCopy3);
		
		arrItemCopy.add(theAlchemistCopy1);
		arrItemCopy.add(theAlchemistCopy2);
		
		arrItemCopy.add(theNotebookCopy1);
		
		arrItemCopy.add(chalkCopy1);
		arrItemCopy.add(cosmoCopy1);
		
		
		//==================================================================
		Member mem = new Member();
		System.out.println("Hi! Welcome to MUM Library ");
		System.out.println("Please enter Member ID: ");
		Scanner sc = new Scanner(System.in);
		String memID = sc.nextLine();
		
		for(Member member : arrMember)
		{
			if(member.getId().equals(memID))
			{
				isMember = true;
				mem = member;
				break;
			}
		}
		
		if(!isMember)
		{
			System.out.print("You are currently not in the member's list.  Please contact school admin for this matter.");		
		}
		else
		{
			System.out.println("Hi " + mem.getName() + "!");
			while(true)
			{
			System.out.println("\nPlease enter your choice of actions.\n" +
					"(G)et all list of available books\n" +
					"(B)orrow book(s)\n" +
					"(R)eturn book(s)\n" +
					"(RES)erve book(s)\n" +
					"(L)oan History\n" +
					"(RE)servation History\n" +
					"(Q)uit\n");
			String action = sc.nextLine();
			getAction(action, mem);
			}
		}
		

	}
	
	private static void getAction(String action, Member member)
	{
		switch(action.toUpperCase())
		{
		case "G":
			getListOfAvailBooks();
			break;
		case "B":
			borrowBook(member);
			break;
		case "R":
			returnBook(member);
			break;
		case "RES":
			reserveBook(member);
			break;
		case "L":
			getLoanHistory(member);
			break;
		case "RE":
			getReservationHistory(member);
			break;
		case "Q":
			System.exit(0);
		default:
			Scanner sc = new Scanner(System.in);
			System.out.println("Wrong selection.");
			System.out.println("Please enter your choice of actions.\n" +
					"(G)et all list of available books\n" +
					"(B)orrow book(s)\n" +
					"(R)eturn book(s)\n" +
					"(RES)erve book(s)\n" +
					"(L)oan History\n" +
					"(RE)servation History");
			String ac = sc.nextLine();
			getAction(ac,member);
			break;
		}
	}
	
	private static void getListOfAvailBooks()
	{
		System.out.println("List of available books as of date:");
		System.out.println("================================================================================");
		for(ItemCopy itemcopy : arrItemCopy)
		{
			if(itemcopy.getItem() instanceof Book)
			{
				if(itemcopy.isAvailable())
				{
					System.out.println(itemcopy.toString());
				}
			}
			
		}
		
		System.out.println("List of available magazines as of date:");
		System.out.println("================================================================================");
		for(ItemCopy itemcopy : arrItemCopy)
		{
			if(itemcopy.getItem() instanceof Magazine)
			{
				if(itemcopy.isAvailable())
				{
					System.out.println(itemcopy.toString());
				}
			}
			
		}
	}
	
	private static void borrowBook(Member member)throws NumberFormatException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the item no: ");
		int itemNo = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the copy id no: ");
		String copyid = sc.nextLine();
		AItem item;
		ItemCopy itemCopy = new ItemCopy();
		Loan loan;
		
		for(AItem aitem : arrItem)
		{
			if(aitem.getItemNo() == itemNo)
			{
				if(aitem instanceof Book)
				{
					item = (Book)aitem;
				}
				else
				{
					item = (Magazine)aitem;;
				}
				
				for(ItemCopy itemcopy : arrItemCopy)
				{
					if(itemcopy.getCopyID().equals(copyid) && itemcopy.getItem().getTitle().equals(item.getTitle()))
					{
						itemCopy =itemcopy;
					}
				}
			}
		}
		if(!(itemCopy.getCopyID()==null))
		{
			loan = new Loan(itemCopy, member, new Date());
			member.Borrow(loan);
			System.out.println("Successful loan.");
			System.out.println("Please return " + itemCopy.getItem().getTitle() + " after " + itemCopy.getItem().getLimit() + " day(s)");
		}
		
		
	}
	
	private static void returnBook(Member member)
	{
		
	}
	
	private static void reserveBook(Member member)
	{
		
	}
	
	private static void getLoanHistory(Member member)
	{
		
	}
	
	private static void getReservationHistory(Member member)
	{
		
	}

}
