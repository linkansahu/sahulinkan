package pack1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Pagetest {
	static WebDriver driver;
@Test
public void mytest1()
{
	  DataInitial instancedriver= DataInitial.getInstance();
	  driver= instancedriver.startBrowser();
	  driver.get("https://www.google.co.in/");
}
}
