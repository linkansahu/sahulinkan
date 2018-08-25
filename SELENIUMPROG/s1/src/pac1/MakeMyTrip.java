package pac1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTrip {
 static WebDriver driver; 
	public static void main(String[] args) throws Throwable
	{
		driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/flights?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|93065476688&s_kwcid=AL!1631!3!93065476688!e!!g!!makemytrip&depDate=&ef_id=VvAGkAAABHLbwRCi:20161201095602:s");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
        String date="6-December 2016";
        String []splitter=date.split("-");
        String  checkin_day=splitter[0];
        String checkinmonth_year=splitter[1];
       System.out.println(checkinmonth_year);
       System.out.println(checkin_day);
        driver.findElement(By.xpath("//*[@id='from_typeahead1']")).sendKeys("Bangalore, India (BLR)");
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        driver.findElement(By.xpath(".//*[@id='to_typeahead1']")).sendKeys("New Delhi, India (DEL)");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='start_date_sec']//span[contains(text(),'Select Date')]")).click();
        List<WebElement>lst1= driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div/div/div"));//*[@id='ui-datepicker-div']/div/div
	      //  List<WebElement>lst1=driver.findElements(By.xpath("//div[@class='calendar']/div[@class='month']/table/thead/tr/th[@class='caption']"));

	        for(int i=0;i<lst1.size();i++)
	        {

		    if(lst1.get(i).getText().equals(checkinmonth_year))
		      {
		    	 System.out.println("..................");
		         List<WebElement>days=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div["+i+2+"]/table/tbody/tr/td/a"));
		       for(WebElement wb:days)
		         { if(wb.getText().equals(checkin_day))
		          {
		        	wb.click();
		          break;
		          }
		        }
		     }
		 }
	}
	
}
