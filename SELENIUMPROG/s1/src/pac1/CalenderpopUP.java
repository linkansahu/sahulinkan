package pac1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderpopUP {

	public static void main(String[] args) throws Throwable 
	{
	WebDriver d=new FirefoxDriver();
	d.get("https://www.redbus.in/");
	WebDriverWait wait=new WebDriverWait(d,20);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='onward_cal']")));
	//d.findElement(By.xpath("//label[text()='Onward Date']")).click();
	//d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	List<WebElement>lst=d.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
	System.out.println(lst.size());
	
	System.out.println("----------------------");
	for(int i=0;i<=lst.size()-1;i++)
	{
	String actText=lst.get(i).getText();
	System.out.println(actText);
	if(actText.contains("29"))
	{
		lst.get(i).click();
		break;
	}
	}
	}

}
