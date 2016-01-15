package designworkshop.ordertrackingsystem;

public class HealthPoints extends ACompPoints{
private double points;
	
	public HealthPoints()
	{
		points = 1.0;
	}

	public double getPoints()
	{
		return points;
	}

	public void setPoints(double points)
	{
		this.points = points;
	}
}
