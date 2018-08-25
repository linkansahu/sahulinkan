package pac.crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	
	public  void test1() {
	 
	
	 
	WebDriver driver=new FirefoxDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("http://www.facebook.com");
	
	 
	}
@Test
public  void test2(){
	 
	System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM INS\\chromedriver.exe");
	 
	WebDriver driver=new ChromeDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("http://www.gmail.com");
	 

	}
	}

