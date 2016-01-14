package assignment03;

public enum Zone {
	
	IA(0.35), MT(0.35), OR(0.35), CA(0.35), TX(0.30), UT(0.30), FL(0.55), MA(0.55), OH(0.55), OTHERS(0.43);
	
	private double zoneRate;
	
	private Zone(double zoneRate)
	{
		this.zoneRate = zoneRate;
	}
	
	public double getZoneRate()
	{
		return zoneRate;
	}

}
