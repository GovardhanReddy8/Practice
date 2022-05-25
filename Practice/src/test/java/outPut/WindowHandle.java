package outPut;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle {
	public WebDriver driver;

	@Test
	private void window() throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[normalize-space()='Windows']")).click();
		driver.findElement(By.xpath(
				"//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//a[@class='button e.g. button_hilite button_pale small_button'][normalize-space()='Click Here']"))
				.click();
		Set<String> wb = driver.getWindowHandles();
		for (String child : wb) {
			driver.switchTo().window(child);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[normalize-space()='Sortable']")).click();
			Thread.sleep(3000);
			driver.switchTo().window(child).close();
			
			
		}

	}

}
