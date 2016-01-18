package designworkshop.librarysystem;

public class Magazine extends AItem{
	private int issue;
	
	Magazine()
	{
		
	}
	
	Magazine(int itemNo, String title, int issue, int limit)
	{
		super(itemNo, title, limit);
		this.issue = issue;
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

	public int getIssue() {
		return issue;
	}

	public void setIssue(int issue) {
		this.issue = issue;
	}
	
	public String toString()
	{
		return this.getTitle() + "\tIssue#: " + this.issue;
	}

}
