package pac1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleDynamicRadio {

	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.get("https://www.facebook.com/");
		List<WebElement> lst=d.findElements(By.xpath("//input[@name='sex' and @type='radio']"));
		System.out.println(lst.size());
		for(int i=0;i<=lst.size()-1;i++)
		{
		String str=	lst.get(i).getAttribute("value");
		System.out.println(str);
		}
	

	}

}
