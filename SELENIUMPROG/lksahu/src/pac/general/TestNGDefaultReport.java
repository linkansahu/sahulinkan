package pac.general;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDefaultReport {

	
  @Test
  public void realTest() throws Throwable {
	 WebDriver driver;
		
		
			driver = new FirefoxDriver();
			driver.get("http://google.com");
		    System.out.println("I am Test method and I am searching for cars");
		    driver.findElement(By.className("gsfi")).sendKeys("Cars");
		    Thread.sleep(3000);
		    driver.findElement(By.name("btnG")).click();
		   //Wait for the results to appear
		  Thread.sleep(3000);
		 
		  if(driver.findElement(By.partialLinkText("car")).isDisplayed()){
		  Assert.assertTrue(true); 
		  }
		  else{
		  Assert.assertTrue(false);
		  }
	String timeStamp;
	File screenShotName;
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//The below method will save the screen shot in d drive with name "screenshot.png"
	timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()); 
	screenShotName = new File("D:\\MyTest\\Screenshots\\"+timeStamp+".png");
	FileUtils.copyFile(scrFile, screenShotName);
	 System.out.println("screen shot taken");
	String filePath = screenShotName.toString();
	String path = "<img src=\"file://" + filePath + "\" alt=\"\"/>";;
	Reporter.log(path);
	}

 

}
