package assignment03;

public class Package {
	private String packageDesc;
	private double weight;
	private Zone zone;
	
	Package(String packageDesc, double weight, Zone zone)
	{
		this.packageDesc = packageDesc;
		this.weight = weight;
		this.zone = zone;
	}
	
	public String getPackageDesc() {
		return packageDesc;
	}
	public void setPackageDesc(String packageDesc) {
		this.packageDesc = packageDesc;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Zone getZone() {
		return zone;
	}
	public void setZone(Zone zone) {
		this.zone = zone;
	}

}
