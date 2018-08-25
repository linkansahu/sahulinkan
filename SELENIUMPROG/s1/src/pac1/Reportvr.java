package pac1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Reportvr {

	public static String captureScreenshot(WebDriver driver, String name) throws Throwable 
 {
	
		TakesScreenshot ts=(TakesScreenshot)driver;
	       File src=ts.getScreenshotAs(OutputType.FILE);
	    String dest="D:\\LKSAHU\\REPORTS\\RepRes\\ScrShot"+name+".png";
		 File destination= new File(dest);
		 FileUtils.copyFile(src, destination);
		System.out.println("ScreenShot is taken");
        
		
		return dest;
		}
}
