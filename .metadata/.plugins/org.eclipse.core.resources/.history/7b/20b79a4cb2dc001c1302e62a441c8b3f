package SmallTestexams;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FileDownload {
	public WebDriver driver;
	@Test
	public void donload() throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		HashMap<String, Object> hmap = new HashMap<String, Object>();
		hmap.put("download.default_directory", "C:\\Users\\Govardhan Reddy\\OneDrive\\Desktop\\java basics\\sel");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", hmap);
		driver=new ChromeDriver(options);
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("my name is Govardhan");
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();
		driver.findElement(By.xpath("//a[@id='link-to-download']")).click();
		Thread.sleep(3000);	
		driver.quit();
	}

}
