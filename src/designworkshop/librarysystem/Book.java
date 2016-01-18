package designworkshop.librarysystem;

import java.util.*;

public class Book extends AItem{
	private String isbn;
	private ArrayList<String> arrAuthor;
	
	Book()
	{
		
	}
	
	Book(int itemNo, String title,String isbn, int limit, ArrayList<String> arrAuthor)
	{
		super(itemNo, title, limit);
		this.isbn = isbn;
		this.arrAuthor = arrAuthor;
	}
	
	public boolean checkAvailability()
	{
		boolean isAvailable = false;
		for(ItemCopy itemCopy : this.arrCopies)
		{
			if(itemCopy.isAvailable())
			{
				isAvailable = true;
				break;
			}
		}
		return isAvailable;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public ArrayList<String> getArrAuthor() {
		return arrAuthor;
	}

	public void setArrAuthor(ArrayList<String> arrAuthor) {
		this.arrAuthor = arrAuthor;
	}
	
	public void addAuthor(String author)
	{
		if(!arrAuthor.contains(author))
		{
			arrAuthor.add(author);
		}
	}
	
	public String toString()
	{
		return this.getTitle() + "\t" + arrAuthor.toString() + "\t" + this.isbn;
	}

}
