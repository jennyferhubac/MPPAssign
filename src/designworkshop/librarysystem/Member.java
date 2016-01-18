package designworkshop.librarysystem;

import java.util.*;

public class Member implements IMember{
	private String id;
	private String name;
	private String address;
	private String phone;
	
	ArrayList<Loan> arrLoan;
	ArrayList<Reservation> arrReservation;
	
	Member()
	{
		
	}
	Member(String id, String name, String address, String phone)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		
		arrLoan = new ArrayList<Loan>();
		arrReservation = new ArrayList<Reservation>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public ArrayList<Loan> getArrLoan() {
		return arrLoan;
	}

	public void setArrLoan(ArrayList<Loan> arrLoan) {
		this.arrLoan = arrLoan;
	}

	public ArrayList<Reservation> getArrReservation() {
		return arrReservation;
	}

	public void setArrReservation(ArrayList<Reservation> arrReservation) {
		this.arrReservation = arrReservation;
	}
	
	
	public void Borrow(Loan loan)
	{
		arrLoan.add(loan);
		loan.getItemCopy().setAvailable(false);
	}
	
	public void Reserve(Reservation reservation)
	{
		arrReservation.add(reservation);
	}
	
	public void Return(Loan loan)
	{
		for(Loan aloan : arrLoan)
		{
			if((aloan.getCheckoutDate().compareTo(loan.getCheckoutDate()) == 0) &&
					(aloan.getItemCopy().getItem().getTitle().equals(loan.getItemCopy().getItem().getTitle())) &&
					(aloan.getItemCopy().getCopyID().equals(loan.getItemCopy().getCopyID())))
			{
				aloan.setReturnDate(new Date());
				aloan.getItemCopy().setAvailable(true);
			}
		}
	}

}
