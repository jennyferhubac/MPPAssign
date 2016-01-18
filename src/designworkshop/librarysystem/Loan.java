package designworkshop.librarysystem;

import java.util.*;

public class Loan {
	private ItemCopy itemCopy;
	private Member member;
	private Date checkoutDate;
	private Date returnDate;
	
	Loan(ItemCopy itemCopy, Member member, Date checkoutDate)
	{
		this.itemCopy = itemCopy;
		this.member = member;
		this.checkoutDate = checkoutDate;
	}

	public ItemCopy getItemCopy() {
		return itemCopy;
	}

	public void setItemCopy(ItemCopy itemCopy) {
		this.itemCopy = itemCopy;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Date getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

}
