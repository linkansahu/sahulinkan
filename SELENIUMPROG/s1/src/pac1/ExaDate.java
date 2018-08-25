package pac1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExaDate {

	public static void main(String[] args) {
		DateFormat dateformat=new SimpleDateFormat();
		
          Date date=new Date();
          String sysdate=dateformat.format(date);
          System.out.println(sysdate);
	}

}
