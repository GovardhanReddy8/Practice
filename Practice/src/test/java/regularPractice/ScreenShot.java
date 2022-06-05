package regularPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class ScreenShot {
	WebDriver driver;
	public void name() throws IOException {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement pic = driver.findElement(By.xpath("(//img[@title='Resume Writing'])"));
		File src = pic.getScreenshotAs(OutputType.FILE);
		File file = new File(".//photo.png");
		FileUtils.copyFile(src, file);
		driver.quit();
		
	
		
		
	}

}
