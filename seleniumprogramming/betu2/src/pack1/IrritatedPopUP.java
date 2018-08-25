package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class IrritatedPopUP {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","D:\\STUDY SOFTWARE\\gecko\\geckodriver-v0.16.0-win64\\geckodriver.exe");
	     WebDriver	driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.freecrm.com/");
		  //intercom-borderless-frame
		  driver.switchTo().frame(driver.findElement(By.name("intercom-borderless-frame")));
		  Actions act=new Actions(driver);
		  act.moveToElement(driver.findElement(By.xpath("//div[contains(@name,'intercom-chat-card-author')]"))).build().perform();
		  driver.findElement(By.xpath("//div[contains(@class,'intercom-borderless-dismiss-button//span')]")).click();
			

	}

}
