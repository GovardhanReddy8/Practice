package SmallTestexams;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot {
	public WebDriver driver;
	
	@Test
	public void screenshoot() throws IOException, Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement pic = driver.findElement(By.xpath("//img[@title='Show details for Apple MacBook Pro 13-inch']"));
		File src = pic.getScreenshotAs(OutputType.FILE);
		File file = new File(".\\photo.png");
		FileUtils.copyFile(src, file);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
