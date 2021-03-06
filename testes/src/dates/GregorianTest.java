package dates;

import java.util.GregorianCalendar;

public class GregorianTest {
	public static void main(String[] args) {
		GregorianCalendar date = new GregorianCalendar();
		printDate(date);
		
		date.add(GregorianCalendar.DAY_OF_YEAR, -30);
		printDate(date);
	}
	
	private static void printDate(GregorianCalendar date) {
		System.out.println(date.get(GregorianCalendar.DAY_OF_MONTH) + "/" + (date.get(GregorianCalendar.MONTH) + 1) + "/" + (date.get(GregorianCalendar.YEAR)));
	}

}
