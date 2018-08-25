package pac.grid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridExa {
		public static final String USERNAME = "linkankumarsahu1";
		  public static final String AUTOMATE_KEY = "qYmRo1kUtoVyECji1D8c";
		  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

		  public static void main(String[] args) throws Exception {

		    DesiredCapabilities caps = DesiredCapabilities.firefox();
		    caps.setPlatform( Platform.XP);
		    //caps.setCapability("browser_version", "7.0");
		    //caps.setCapability("os", "Windows");
		    //caps.setCapability("os_version", "XP");
		    caps.setCapability("browserstack.debug", "true");

		    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		    driver.get("http://www.facebook.com");
		   // WebElement element = driver.findElement(By.name("q"));

		    //element.sendKeys("BrowserStack");
		    //element.submit();

		    System.out.println(driver.getTitle());
		    driver.quit();

		  }
}
