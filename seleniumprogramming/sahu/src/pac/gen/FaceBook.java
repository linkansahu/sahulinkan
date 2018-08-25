package pac.gen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook {
	public static void main(String[] args) {
System.setProperty("webdriver.firefox.marionette","D:\\STUDY SOFTWARE\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	     WebDriver	driver=new FirefoxDriver();
		  driver.manage().window().maximize();
	  driver.get("http://www.facebook.com");
	driver.findElement(By.xpath(".//*[@id='emailasdasdas']")).sendKeys("Learn Automation");

	

}

}
