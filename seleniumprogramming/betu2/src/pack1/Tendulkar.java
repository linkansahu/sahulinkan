package pack1;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Tendulkar {

	public static void main(String[] args) {
		int cnt=0;
		boolean flag=true;
			System.setProperty("webdriver.firefox.marionette","D:\\STUDY SOFTWARE\\gecko\\"
					+ "geckodriver-v0.16.0-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.google.co.in/");
			driver.findElement(By.id("lst-ib")).sendKeys("Tendulkar",Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);



Wait wait = new FluentWait<WebDriver>(driver)
.withTimeout(45, TimeUnit.SECONDS)
.pollingEvery(5, TimeUnit.SECONDS)
.ignoring(NoSuchElementException.class);
			 
		while(flag)
		{
			try
			{
				driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,400)");
				Thread.sleep(3000);
				cnt++;
			}
			catch(Exception e)
			{
				System.out.println("no more links");
				flag=false;
				break;
			}
		}
		System.out.println("tendulkar links are found:"+cnt);
	}

}
