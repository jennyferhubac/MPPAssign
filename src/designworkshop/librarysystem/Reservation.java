package designworkshop.librarysystem;

import java.util.*;

public class Reservation {
	private AItem item;
	private Member member;
	private Date reservationDate;
	
	private boolean isActiveReservation;
	
	Reservation(AItem item, Member member, Date reservationDate)
	{
		this.item = item;
		this.member = member;
		this.reservationDate = reservationDate;
		isActiveReservation = true;
	}

	public AItem getItem() {
		return item;
	}

	public void setItem(AItem item) {
		this.item = item;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Date getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	public boolean isActiveReservation() {
		return isActiveReservation;
	}

	public void setActiveReservation(boolean isActiveReservation) {
		this.isActiveReservation = isActiveReservation;
	}
}
