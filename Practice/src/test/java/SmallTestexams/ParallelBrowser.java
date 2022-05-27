package SmallTestexams;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelBrowser {

	WebDriver driver;

	@Test

	public void parallel() throws IOException {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		WebElement pic = driver.findElement(By.xpath("//img[@title='Show details for Apple MacBook Pro 13-inch']"));
		File src = pic.getScreenshotAs(OutputType.FILE);
		File file = new File(".\\photo.png");
		FileUtils.copyFile(src, file);
		driver.quit();
	}

	@Test
	public void test() throws IOException {
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/");
		WebElement pic1 = driver.findElement(By.xpath("//img[@title='Show details for HTC One M8 Android L 5.0 Lollipop']"));
		File src = pic1.getScreenshotAs(OutputType.FILE);
		File file = new File(".\\phone.png");
		FileUtils.copyFile(src, file);
		driver.quit();
		
		

	}

}
