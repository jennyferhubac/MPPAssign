package designworkshop.librarysystem;

import java.util.*;

public class ItemCopy implements IITemCopy{
	private String copyID;
	private AItem item;
	private boolean available;
	
	ItemCopy()
	{
		
	}
	
	ItemCopy(String copyID, AItem item)
	{
		this.copyID = copyID;
		this.item = item;
		available = true;
	}

	public String getCopyID() {
		return copyID;
	}

	public void setCopyID(String copyID) {
		this.copyID = copyID;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public AItem getItem() {
		return item;
	}

	public void setItem(AItem item) {
		this.item = item;
	}
	
	public String toString()
	{
		String avail = "AVAILABLE";
		if(!isAvailable())
		{
			avail = "NOT AVAILABLE";
		}
		return copyID +"\t" + item.toString() + "\t" + avail;
	}

}
