package pack1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCal {
	public static void main(String[] args)
	{
		DateFormat dateformat=new SimpleDateFormat("yyyy//mm//dd//hh/mm/ss");
		Date currentdate=new Date();
	String curdate=dateformat.format(currentdate);
	System.out.println(curdate);
   Calendar cal=Calendar.getInstance();
   cal.setTime(currentdate);
   cal.add(Calendar.YEAR, 1);
   cal.add(Calendar.MONTH, 1);
   cal.add(Calendar.DATE, 1);
   cal.add(Calendar.HOUR, 1);
   cal.add(Calendar.MINUTE, 1);
   cal.add(Calendar.SECOND, 1);
   Date latestdate=cal.getTime();
   System.out.println(latestdate);
   
	}
}
