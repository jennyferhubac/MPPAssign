package designworkshop.ordertrackingsystem;

public abstract class ACustomer implements ICustomer{
private String name;
private String address;
private String phone;
private double points;

public ACustomer()
{
	
}

public ACustomer(String name, String address, String phone)
{
	this.name = name;
	this.address = address;
	this.phone = phone;
	
	points = 0;
}

public abstract CreditRating getCreditRating();

public abstract void print();

public abstract void printOrders();

public abstract double getAccumulatedPoints();

public abstract PaymentMethod getPaymentMethod();

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

public double getPoints() {
	return points;
}

public void setPoints(double points) {
	this.points = points;
}
}
