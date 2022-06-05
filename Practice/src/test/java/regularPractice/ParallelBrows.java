package regularPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelBrows {
	WebDriver driver;

	@Test
	public void set() {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.quit();

	}
	
	@Test
	public void name() {
		
		System.setProperty("webdriver.gecko.driver", "Drivers//geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.quit();
		
	}
	
	
}