package SmallTestexams;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FileDownWinSwitch {
	
	public WebDriver driver;
	
	@Test
	public void fileDown() throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		HashMap<String, Object> hmap = new HashMap<String, Object>();
		hmap.put("download.default_directory", "C:\\Users\\Govardhan Reddy\\OneDrive\\Desktop\\java basics\\sel");
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", hmap);
		driver=new ChromeDriver(options);
		driver.get("https://www.w3schools.com/tags/att_a_download.asp");
		driver.findElement(By.xpath("//div[@id='main']//div[2]//a[1]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Set<String> allwins = driver.getWindowHandles();
		Iterator<String> iterator = allwins.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);
		WebElement fram = driver.findElement(By.name("iframeResult"));
		driver.switchTo().frame(fram);
		driver.findElement(By.xpath("//img[@alt='W3Schools']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}