package regularPractice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	WebDriver driver;
	@Test
	public void Drop() throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement drop = driver.findElement(By.xpath("//select"));
		Select select = new Select(drop);
		select.selectByIndex(6);
		Thread.sleep(2000);
		driver.quit();
	}

}
