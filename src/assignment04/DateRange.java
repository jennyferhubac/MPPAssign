package assignment04;

import java.time.*;
import java.util.*;
import static java.time.temporal.TemporalAdjusters.*;

public class DateRange {
	private LocalDate  startDate;
	private LocalDate endDate;
	
	DateRange()
	{
		
	}
	DateRange(LocalDate startDate, LocalDate endDate)
	{
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public boolean isinRange(LocalDate date)
	{
		boolean isRange = false;
		if(startDate.isBefore(date) && endDate.isAfter(date))
		{
			isRange = true;
		}
		return false;
	}
	
	public String toString()
	{
		return startDate.toString() + " to " + endDate.toString();
	}
	
	public static LocalDate getFirstDayOfMonth(LocalDate date)
	{
		return date.withDayOfMonth(1);
	}
	
	public static LocalDate getLastDayOfMonth(LocalDate date)
	{
		return date.with(lastDayOfMonth());
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

}
