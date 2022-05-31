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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class YouTubeParallel {

	public WebDriver driver;

	@Test
	public void setOne() throws IOException {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("so so ga unna nanne");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		WebElement src = driver.findElement(By.xpath("//img[@id='thumbnail']"));
		File file = new File(".//song.png");
		FileUtils.copyFile((File) src, file);
		driver.quit();

	}
	
	@Test
	public void setTwo() throws IOException {
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.hotstar.com/in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement pic = driver.findElement(By.xpath("//div[@class='slick-slide slick-active slick-current']"
				+ "//div//div//div[@class='masthead-item-container']"
				+ "//div[@role='presentation']//div//img[@alt='Qualifier 2: RR vs RCB']"));
		File src = pic.getScreenshotAs(OutputType.FILE);
		File file = new File(".//match.png");
		FileUtils.copyFile(src, file);
		driver.quit();
		
	}

}
