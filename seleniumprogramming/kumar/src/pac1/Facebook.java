package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.firefox.marionette","D:\\STUDY SOFTWARE\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	     WebDriver	driver=new FirefoxDriver();
		  driver.manage().window().maximize();
	  driver.get("http://www.facebook.com");
	  Thread.sleep(2000);
	  
	
	}

}
