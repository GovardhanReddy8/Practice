package SmallTestexams;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UpLoadingFile {
	
	public WebDriver driver;
	
	
	@Test
	public void upload() throws AWTException, Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
		WebElement button = driver.findElement(By.xpath("//input[@id='file-upload'][@type='file'][1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button);
		
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection file = new StringSelection("C:\\Users\\Govardhan Reddy\\OneDrive\\Desktop\\java basics\\sel\\info.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	

}
