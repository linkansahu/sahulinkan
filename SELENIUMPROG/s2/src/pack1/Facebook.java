package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {

	
			
	     WebDriver	driver=new FirefoxDriver();
		  driver.manage().window().maximize();
	  driver.get("http://www.facebook.com");
	driver.findElement(By.xpath(".//*[@id='emailasdasdas']")).sendKeys("Learn Automation");


	}

}
