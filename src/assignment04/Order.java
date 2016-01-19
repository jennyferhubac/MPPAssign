package assignment04;

import java.util.*;
import java.time.*;

public class Order {
	private int orderNo;
	private LocalDate orderDate;
	private double orderAmount;
	
	Commissioned commissioned;
	
	Order()
	{
		commissioned = new Commissioned();
	}
	
	Order(int orderNo, LocalDate orderDate, double orderAmount, Commissioned commissioned)
	{
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		this.commissioned = commissioned;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Commissioned getCommissioned() {
		return commissioned;
	}

	public void setCommissioned(Commissioned commissioned) {
		this.commissioned = commissioned;
	}
	
}
