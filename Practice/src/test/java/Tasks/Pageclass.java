package Tasks;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pageclass {
	WebDriver driver;
	
	public void openBrowser(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://adactinhotelapp.com/");
			
		}{

		}
		
	}
	public void loginFun(String xpath, String value) {
		driver.findElement(By.xpath(xpath)).sendKeys(value);
		driver.findElement(By.xpath(xpath)).click();
		
	}
	@SuppressWarnings("deprecation")
	public void waitTime() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	public void tearDown() throws InterruptedException {
		driver.quit();
		
	}
	public void inputValue(String add, String det) {
		driver.findElement(By.xpath(add)).sendKeys(det);	
		
		
		
	}
	
	
	
}
