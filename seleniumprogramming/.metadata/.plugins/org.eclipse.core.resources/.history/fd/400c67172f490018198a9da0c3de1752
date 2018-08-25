package com.Qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTestNew {
	WebDriver driver;
	@Parameters({"browser","url"})
	@Test(priority=1)
	public void launchUrlTest(String browser,String url)
	{
		if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.firefox.marionette","D:\\STUDY SOFTWARE\\gecko\\"
					+ "geckodriver-v0.16.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\STUDY SOFTWARE\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.get("https://www.freecrm.com/index.html");
	}
	
	@Parameters({" username","password"}) 
	@Test(priority=2)
	public void LoginTest(String username,String password)
	{
	System.out.println(username+"=="+password);
		driver.findElement(By.name("username")).sendKeys("username");
		driver.findElement(By.name("password")).sendKeys("password");
	}

}
