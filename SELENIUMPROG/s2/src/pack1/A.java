package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {

	public static void main(String[] args) {
	WebDriver d=new FirefoxDriver();
	  d.manage().window().maximize();
	  d.get("https://accounts.google.com/");
	  d.findElement(By.xpath(""));
	}

}
