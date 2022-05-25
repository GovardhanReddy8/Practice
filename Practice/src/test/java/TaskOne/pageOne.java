package TaskOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pageOne {

	WebDriver driver;
	
	public void openBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.ajio.com/");
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", "Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://www.ajio.com/");
		}{

		}
	}

	
	public void inputValue(String path,String value) {
		driver.findElement(By.xpath(path)).sendKeys(value);
		driver.findElement(By.xpath(path)).click();
		
	}
	
	public void waitTime() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	public void tearDown() {
		driver.quit();
		
	}
	
	
}
