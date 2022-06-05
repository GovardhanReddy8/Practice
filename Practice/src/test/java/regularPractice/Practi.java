package regularPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practi {
	
	public static WebDriver driver;
	
	@Test
	public void furu() {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.guru99.com/live-selenium-project.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElements(By.tagName("//h5"));
		List<WebElement> names = driver.findElements(By.xpath("//h5[@class='kt-blocks-info-box-title']"));
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i).getText());
			
		}
		driver.quit();
		
	}

}
