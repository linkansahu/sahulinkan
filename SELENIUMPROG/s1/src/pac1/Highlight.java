package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Highlight {

	public static void main(String[] args) {
		 WebDriver driver=new FirefoxDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("http://www.facebook.com");
		  
		 // Create the  JavascriptExecutor object
		  JavascriptExecutor js=(JavascriptExecutor)driver; 
		  
		 // find element using id attribute
		  WebElement username= driver.findElement(By.name("email"));  
		  
		  js.executeScript("arguments[0].style.border='3px solid red'", username);

	}

}
