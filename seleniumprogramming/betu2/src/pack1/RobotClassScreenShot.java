package pack1;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClassScreenShot {
	public static void main(String[] args) throws Exception {
		// set the geckodriver.exe property
		System.setProperty("webdriver.firefox.marionette","D:\\STUDY SOFTWARE\\gecko\\geckodriver-v0.16.0-win64\\geckodriver.exe");
		// open firefox
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		// open webpage
		driver.get("http://www.facebook.com");
		Robot robot = new Robot();
		int x = 10;
		int y = 10;
		int width = 500;
		int height = 200;
		Rectangle area = new Rectangle(x, y, width, height);
		BufferedImage bufferedImage = robot.createScreenCapture(area);
		File imageFile = new File("D:\\Robot.png");
		ImageIO.write(bufferedImage, "png", imageFile);
	}
}
