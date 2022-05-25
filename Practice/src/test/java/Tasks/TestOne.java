package Tasks;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOne {
	WebDriver driver;
	@Test
	public void guru99() throws Exception {
		String expectedate="05 july 2022";
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/");
		driver.findElement(By.xpath("(//span[@class='sc-kfPuZi dprjVP fswDownArrow'])[1]")).click();
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Tue Jul 05 2022']")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	}

}
