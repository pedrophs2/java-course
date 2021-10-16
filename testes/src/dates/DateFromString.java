package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateFromString {
	public static void main(String args[]) throws ParseException {
        GregorianCalendar calendar = stringToCalendar();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        
        System.out.printf("%d/%d/%d", day, month + 1, year);
    }
    
    public static GregorianCalendar stringToCalendar() throws ParseException {
        String dateXml = "20201221";
        GregorianCalendar dt = new GregorianCalendar();
      
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        Date date = formatter.parse(dateXml);
      
        dt.setTimeInMillis(date.getTime());
        return dt;
    }
}
