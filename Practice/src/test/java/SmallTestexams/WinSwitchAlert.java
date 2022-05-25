package SmallTestexams;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WinSwitchAlert {
	public static WebDriver driver;
	@Test
	public void winhandle() throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/met_win_alert.asp");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='w3-btn'][normalize-space()='Try it Yourself »']")).click();
		Set<String> allwins = driver.getWindowHandles();
		Iterator<String> winid = allwins.iterator();
		String parent = winid.next();
		String child = winid.next();
		driver.switchTo().window(child);
		WebElement fram1 = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(fram1);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
