package regularPractice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WinFramAlert {
	
	 public static WebDriver driver;
	 
	 @Test
	 public void winswitch() throws Exception {
		 System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.w3schools.com/jsref/met_win_alert.asp");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//a[@class='w3-btn'][normalize-space()='Try it Yourself »']")).click();
		 Set<String> allwins = driver.getWindowHandles();
		 Iterator<String> wins = allwins.iterator();
		 String parent = wins.next();
		 String child = wins.next();
		 driver.switchTo().window(child);
		 WebElement fram = driver.findElement(By.id("iframeResult"));
		 driver.switchTo().frame(fram);
		 driver.findElement(By.xpath("//button[text()='Try it']")).click();
		 String text = driver.switchTo().alert().getText();
		 System.out.println(text);
		 driver.switchTo().alert().accept();
		 Thread.sleep(3000);
		driver.switchTo().defaultContent();
		String text2 = driver.findElement(By.xpath("//span[text()='body']")).getText();
		System.out.println(text2);
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		String text3 = driver.findElement(By.xpath("//p[text()='More examples below.']")).getText();
		System.out.println(text3);
		Thread.sleep(3000);
		driver.quit();
	}

}
