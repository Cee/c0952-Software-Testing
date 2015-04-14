import static org.junit.Assert.*;

import org.junit.Test;


public class DateTest {

	@Test
	public void test() {
		Day pDay;
		Month pMonth;
		Year pYear;
		
		// Invalid
		try {
			// Day Test
			pYear = new Year(0);
			pMonth = new Month(13, pYear);
			pDay = new Day(32, pMonth);
			pDay.isValid();
			pMonth.isValid();
			pYear.isValid();
			
			pYear = new Year(1);
			pMonth = new Month(2, pYear);
			pDay = new Day(32, pMonth);
			pDay.isValid();
			pMonth.isValid();
			pYear.isValid();
			
			pMonth = new Month(2, pYear);
			pDay = new Day(32, pMonth);
			pDay.isValid();
			pMonth.isValid();
			pYear.isValid();
			
			pDay = new Day(2, pMonth);
			pDay.isValid();
			pMonth.isValid();
			pYear.isValid();
			
			pYear = new Year(-1);
			pYear.increment();
			
			pMonth = new Month(0, pYear);
			pMonth.increment();
			
			pDay = new Day(32, pMonth);
			pDay.increment();
		} catch (Exception e) {
			
		}

		// increase
		int day, month, year;
		day = 1;
		month = 1;
		year = 2000;
		Date date = new Date(month, day, year);
		date.increment();
		
		for (int i = 0; i < 20000; i++) {
			date.printDate();
			date.increment();
		}
		
		// Date equals
		Date date1 = new Date(2, 3, 5);
		Date date2 = new Date(2, 3, 5);
		date1.equals(date2);
		
		date2 = new Date(3, 3, 5);
		date1.equals(date2);
		date1.toString();
		
		// Year
		// isLeap >0 & <0
		Year year1 = new Year(2000);
		year1.isLeap();
		year1 = new Year(2001);
		year1.isLeap();
		year1 = new Year(2002);
		year1.isLeap();
		year1 = new Year(2003);
		year1.isLeap();
		year1 = new Year(2004);
		year1.isLeap();
		year1 = new Year(-1999);
		year1.isLeap();
		year1 = new Year(-2000);
		year1.isLeap();
		year1 = new Year(-2001);
		year1.isLeap();
		year1 = new Year(-2002);
		year1.isLeap();
		year1 = new Year(-2003);
		year1.isLeap();
		year1 = new Year(-2004);
		year1.isLeap();
		
		// isEqual
		Year year2 = new Year(-2004);
		year1.equals(year2);
		year2 = new Year(-2003);
		year1.equals(year2);
		year1.equals(month);
		year1 = new Year(-1);
		year1.increment();
		
		// Month
		Month month1 = new Month(1, year1);
		month1.equals(month1);
		Month month2 = new Month(2, year1);
		month1.equals(month2);
		year1 = new Year(2000);
		month1 = new Month(2, year1);
		month1.getMonthSize();
		year1 = new Year(2001);
		month1 = new Month(2, year1);
		month1.getMonthSize();
		month1 = new Month(12, year1);
		month1.increment();
		month1.equals(year1);
		
		// Day
		Day day1 = new Day(1, month1);
		day1.equals(day1);
		Day day2 = new Day(2, month2);
		day2.equals(day1);
		day2 = new Day(32, month2);
		day2.increment();
		day1.equals(month1);
		
		// Next Day
		Date nextday = Nextday.nextDay(date);
		nextday.toString();
		
		
	}

}
