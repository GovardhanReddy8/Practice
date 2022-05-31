package datePicker;

import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DooubleClick {
	
	public WebDriver driver;
	@Test
	public void doubleCicli() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/event_ondblclick.asp");
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjsref_ondblclick_html']")).click();
		Set<String> allwins = driver.getWindowHandles();
		Iterator<String> wins = allwins.iterator();
		String parent = wins.next();
		String child = wins.next();
		driver.switchTo().window(child);
		WebElement fram = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(fram);
		WebElement doublek = driver.findElement(By.xpath("//p[text()='Double-click me.']"));
		Actions acts = new Actions(driver);
		acts.doubleClick(doublek).perform();
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
