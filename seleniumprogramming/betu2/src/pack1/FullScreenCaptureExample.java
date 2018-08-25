package pack1;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FullScreenCaptureExample {
@Test
public void mytest()throws Throwable {
		System.setProperty("webdriver.firefox.marionette","D:\\STUDY SOFTWARE\\gecko\\geckodriver-v0.16.0-win64\\geckodriver.exe");
		// open firefox
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		// open webpage
		driver.get("http://chercher.tech/java/practice-pop-ups-selenium-webdriver");
		// create object to robt class
		Robot robot = new Robot();
		// create rectangle for full screenshot
		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		// capture screen of the desktop
		BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
		// save the screenshot to local system
		ImageIO.write(screenFullImage, "png", new File("D:\\FullScreenshotRobot.png"));

		System.out.println("Full Desktop screenshot saved!");

	}

}
