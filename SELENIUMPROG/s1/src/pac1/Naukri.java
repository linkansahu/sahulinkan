package pac1;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.naukri.com");
		  String parentId=  driver.getWindowHandle();
          ArrayList<String>childId=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(childId.get(1));
        System.out.println(driver.getTitle());
        driver.close();
	}

}
