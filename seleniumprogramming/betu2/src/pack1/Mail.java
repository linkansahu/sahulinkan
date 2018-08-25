package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mail {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","D:\\STUDY SOFTWARE\\gecko\\geckodriver-v0.16.0-win64\\geckodriver.exe");
				     WebDriver	driver=new FirefoxDriver();
					  driver.manage().window().maximize();
				  driver.get("http://www.facebook.com");
				driver.findElement(By.xpath(".//*[@id='emailasdasdas']")).sendKeys("Learn Automation");

	}	
}
