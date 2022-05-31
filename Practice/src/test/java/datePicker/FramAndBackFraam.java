package datePicker;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramAndBackFraam {
	
	public WebDriver driver;
	
	
	@Test
	public void framsback() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryhtml_iframe_height_width']")).click();
		Set<String> allwins = driver.getWindowHandles();
		Iterator<String> wins = allwins.iterator();
		String parent = wins.next();
		String child = wins.next();
		driver.switchTo().window(child);
		WebElement fram = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(fram);
		String text = driver.findElement(By.xpath("//h2[text()]")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		String text2 = driver.findElement(By.xpath("(//span[@style='padding-right: 0.1px;'])[3]")).getText();
		System.out.println(text2);
		Thread.sleep(3000);
		driver.quit();
	}

}
