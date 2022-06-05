package regularPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	WebDriver driver;
	@Test
	public void Drop() throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement fram = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(fram);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop).perform();
		Thread.sleep(3000);
		driver.quit();

}
}
