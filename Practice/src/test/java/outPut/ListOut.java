package outPut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.Listeners.class)
public class ListOut {
	public WebDriver driver;
	
	@Test
	public void setright() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	}

}
