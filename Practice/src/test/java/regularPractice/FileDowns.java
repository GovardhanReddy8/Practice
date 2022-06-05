package regularPractice;

import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class FileDowns {
	public static WebDriver driver;
	
	@Test
	public void downloadfile() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		HashMap<String, Object> hm = new HashMap<String,Object>();
		hm.put("download.default_directory", "C:\\Users\\Govardhan Reddy\\OneDrive\\Desktop\\java basics\\sel");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", hm);
		driver=new ChromeDriver(options);
		driver.get("https://www.w3schools.com/tags/att_a_download.asp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@id='main']//div[2]//a[1]")).click();
		Set<String> allwins = driver.getWindowHandles();
		Iterator<String> wins = allwins.iterator();
		String parent = wins.next();
		String child = wins.next();
		driver.switchTo().window(child);
		WebElement fram = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(fram);
		driver.findElement(By.xpath("//img[@alt='W3Schools']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
