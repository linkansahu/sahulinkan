package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GmailLoginVerification {
	ExtentReports report;
	ExtentTest logger; 
	WebDriver driver;
	
	
  @Test
  public void VerifyGmail() 
  {
	  report=new ExtentReports("D:\\LKSAHU\\REPORTS\\RepRes\\gmail.html");
	  logger=report.startTest("VerifyGmail");
	  driver=new FirefoxDriver();
	  
	  driver.manage().window().maximize();
	  logger.log(LogStatus.INFO,"browser is started");
	  driver.get("http://www.learn-automation.com");
	  logger.log(LogStatus.INFO,"Application is started");
	  String title=driver.getTitle();
	  System.out.println(title);
	  Assert.assertTrue(title.contains("Google "));
	  logger.log(LogStatus.PASS, "Title verified");
	 //logger.addScreenCapture("");
	
	  
  }
  @AfterMethod
  public void cofigAfterMtd(ITestResult result) throws Throwable
  {
	  if(result.getStatus()==ITestResult.FAILURE)
      {
	  
	  String screenshot_path=Reportvr.captureScreenshot(driver, result.getName());
	  String image= logger.addScreenCapture(screenshot_path);
	  logger.log(LogStatus.FAIL, "Title verification", image);
	   }
	  report.endTest(logger);
	  report.flush();
	  driver.get("D:\\LKSAHU\\REPORTS\\RepRes\\gmail.html");
	  
  }
  
}
