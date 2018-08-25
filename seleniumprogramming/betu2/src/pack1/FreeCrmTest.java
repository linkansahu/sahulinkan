package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeCrmTest {
 static WebDriver driver;
String credentilas;
String credentilasInfo[];
@BeforeMethod
public void setUp()
{
		System.setProperty("webdriver.firefox.marionette","D:\\STUDY SOFTWARE\\gecko\\"
				+ "geckodriver-v0.19.0-win64 (1)\\geckodriver.exe");
		driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.freecrm.com/index.html");
	   
}
@Test(priority=1)
 public void loginWithAdminTest() throws Throwable
   {
	credentilas=Data.getUserLoginInfo().get("admin");
	credentilasInfo= credentilas.split("_");
    driver.findElement(By.name("username")).sendKeys(credentilasInfo[0]);
	driver.findElement(By.name("password")).sendKeys(credentilasInfo[1]);

	WebElement loginbtn1=driver.findElement(By.xpath("//input[@type='submit']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;

	js.executeScript("arguments[0].click();",loginbtn1);
	
	//driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(3000);
	driver.switchTo().frame("mainpanel");
	Select sel =new Select(driver.findElement(By.name("slctMonth")));
	sel.selectByVisibleText(Data.monthMapInfo().get(10));
	

		
}
@Test(priority=-1)
public void loginWithCustomerTest() throws Throwable
{
	credentilas=Data.getUserLoginInfo().get("customer");
	credentilasInfo= credentilas.split("_");
	driver.findElement(By.name("username")).sendKeys(credentilasInfo[0]);
	driver.findElement(By.name("password")).sendKeys(credentilasInfo[1]);
	//driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	WebElement loginbtn=driver.findElement(By.xpath("//input[@type='submit']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;

	js.executeScript("arguments[0].click();",loginbtn);
	Thread.sleep(3000);
	}
@AfterMethod
public void tearDown()
{
	//driver.close();
}
}
