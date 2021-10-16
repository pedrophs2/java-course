package dates;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class HowToGetYear {
	public static void main(String[] args) {
		Date dt = new Date();
		System.out.println(dt.getYear() + 1900);
		int year = Calendar.getInstance().get(Calendar.YEAR);		
		System.out.println(year);
	}
}
