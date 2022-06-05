package regularPractice;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScroolBar {
	public static WebDriver driver;
	
	@Test
	public void scroll() throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/angularJs-protractor/Scrollable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,5000)","");
		Thread.sleep(8000);
		
	}

}
