package SmallTestexams;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FileDownLoad2 {
	public WebDriver driver;

	@Test
	public void filedown() throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		HashMap<String, Object> hmap = new HashMap<String, Object>();
		hmap.put("download.default_directory", "C:\\Users\\Govardhan Reddy\\OneDrive\\Desktop\\java basics\\sel");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", hmap);
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://file-examples.com/");
		driver.findElement(By.xpath(
				"//a[@href='https://file-examples.com/index.php/sample-documents-download/'][normalize-space()='Browse']"))
				.click();
		driver.findElement(By.xpath(
				"//a[@href='https://file-examples.com/index.php/sample-documents-download/sample-doc-download/']"))
				.click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
