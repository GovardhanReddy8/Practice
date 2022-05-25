package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
	WebDriver driver;

	
	public void openBrowser(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://www.amazon.in/");
			
		}{

		}

	}
	public void testfun(String xpath) {
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptops");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
	}
}


