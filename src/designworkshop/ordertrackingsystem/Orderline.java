package designworkshop.ordertrackingsystem;

import java.util.*;

public class Orderline {
	private int quantity;
	private double price;
	private String status;
	private Date shipDate;
	private double  points;
	
	Order order;
	
	ArrayList<Product> arrProduct;
	
	public Orderline()
	{
		arrProduct = new ArrayList<Product>();
	}
	
	public Orderline(int quantity, Product product)
	{
		arrProduct = new ArrayList<Product>();
		this.quantity = quantity;
		addProduct(product, quantity);
	}

	public double computePrice()
	{
		price = 0;
		for(Product prod : arrProduct)
		{
			price = price + prod.getPrice();
		}
		
		return price;
	}
	
	public double computePoints()
	{
		for(Product prod : arrProduct)
		{
			points = points + prod.getCompPoints().getPoints();
		}
		
		return points;
	}

	public ArrayList<Product> getArrProduct() {
		return arrProduct;
	}

	public void addProduct(Product product, int quantity)
	{
		for(int i = 0; i < quantity; i++)
		{
			arrProduct.add(product);
		}
	}
	
	public void print()
	{
		if(arrProduct.size() > 0)
		{
			System.out.printf("\n" + arrProduct.get(0).getDescription() + "\t" + quantity + "\t$%,.2f\t" + status, computePrice());
		}
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getShipDate() {
		return shipDate;
	}

	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	public double getPoints() {
		points = 0;
		if(arrProduct.size() > 0)
		{
			for(Product prod : arrProduct)
			{
				points = points + prod.getCompPoints().getPoints();
			}
		}
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	public void setArrProduct(ArrayList<Product> arrProduct) {
		this.arrProduct = arrProduct;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}
