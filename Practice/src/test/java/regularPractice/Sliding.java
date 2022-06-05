package regularPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sliding {
	WebDriver driver;
	@Test
	public void Drop() throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement fram = driver.findElement(By.id("//html[@lang='en']"));
		driver.switchTo().frame(fram);
		WebElement drag = driver.findElement(By.xpath("//span[@style='left: 54.902%;']"));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(drag, 100, 125).perform();
		Thread.sleep(3000);
		driver.quit();
		

}
}