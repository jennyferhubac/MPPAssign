package designworkshop.librarysystem;

import java.util.*;

public abstract class AItem implements IItem{
	private int itemNo;
	private String title;
	private int limit;
	
	ArrayList<ItemCopy> arrCopies;
	
	AItem()
	{
		
	}
	
	AItem(int itemNo, String title, int limit)
	{
		this.itemNo = itemNo;
		this.title = title;
		this.limit = limit;
		
		arrCopies = new ArrayList<ItemCopy>();
	}
	public abstract boolean checkAvailability();
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public ArrayList<ItemCopy> getArrCopies() {
		return arrCopies;
	}
	public void setArrCopies(ArrayList<ItemCopy> arrCopies) {
		this.arrCopies = arrCopies;
	}
	
	public void addItemCopy(ItemCopy itemCopy)
	{
		arrCopies.add(itemCopy);
	}

}
