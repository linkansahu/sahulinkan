package pac1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Mailbook {
	 WebDriver d;
	 
  @Test
  public void mailVerifyTest() throws Throwable
  { String expMsg="your password";
	    d=new FirefoxDriver();
		d.get("https://accounts.google.com/");
		
		Mailbook.captureScreenShot(d);
		d.findElement(By.name("Email")).sendKeys("linkankumar90");
		Mailbook.captureScreenShot(d);
	    d.findElement(By.xpath("//*[@id='next']")).click();
	    Mailbook.captureScreenShot(d);
	    Thread.sleep(2000);
	    
		d.findElement(By.xpath("//input[@value='Sign in']")).click();
		Mailbook.captureScreenShot(d);
  }
  public static void captureScreenShot(WebDriver driver)
  {
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  try{
		File dest=new File("D:\\LKSAHU\\lksreports\\bitu\\gmail"+System.currentTimeMillis()+".png"); 
		FileUtils.copyFile(src, dest);
		 System.out.println("ScreenShot Taken");
	  }
	 catch(Exception e)
	  {
		 System.out.println(e.getMessage());
	  }
	  
	  }
  
  }

