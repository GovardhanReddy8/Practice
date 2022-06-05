package regularPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectData {
	
	public static WebDriver driver;
	
	@Test
	public void getData() {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.officedepot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Folders");
		driver.findElement(By.xpath("//button[@class='od-header-search-icon']")).click();
		
		driver.findElements(By.tagName("div"));
		List<WebElement> folders = driver.findElements(By.xpath("//div[@class='item_sku gray med_txt']"));
		for (int i = 0; i < folders.size(); i++) {
			System.out.println(folders.get(i).getText());
			
			
		}
		driver.quit();
		
	}
	

}
