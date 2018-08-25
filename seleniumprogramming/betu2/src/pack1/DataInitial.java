package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataInitial 
{
 private static DataInitial instancedriver=null;
 private static WebDriver driver;
 public DataInitial()
 {
	 
 }
 public static WebDriver startBrowser()
 {
	 System.setProperty("webdriver.firefox.marionette","D:\\STUDY SOFTWARE\\gecko\\"
				+ "geckodriver-v0.16.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
return driver;
 }
 public static DataInitial getInstance()
 {
	          if(instancedriver==null)
	        	  instancedriver  =new DataInitial();
	        return instancedriver;
 }
}
