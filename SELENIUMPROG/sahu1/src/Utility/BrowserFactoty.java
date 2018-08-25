package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactoty 
{
  static WebDriver driver;
  public static  WebDriver StartBrowser(String browserName,String Url)
  {
	  if(browserName.equalsIgnoreCase("firefox"))
		  
	  {
		  driver=new FirefoxDriver();
	 }
	  else if(browserName.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM INS\\chromedriverServer.exe");
		  driver=new ChromeDriver();
	  }
	  driver.get(Url);
	  
	return driver;
	  
  }

}
