package datePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBusDatePicker {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.abhibus.com/");
		
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		
		String xpyear="2022";
		String xpmonth="July";
		String xpday="02";
		
		String monthyear = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText();
		String month = monthyear.split(" ")[0];
		String year = monthyear.split(" ")[1];
		
		while (!(month.equals(xpmonth)&&year.equals(xpyear))) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
//			WebElement button = driver.findElement(By.xpath("//span[text()='Next']"));
//			JavascriptExecutor js=(JavascriptExecutor)driver;
//			js.executeScript("arguments[0].click();", button);
			
			monthyear = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText();
			month = monthyear.split(" ")[0];
			year = monthyear.split(" ")[1];
		}
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for (WebElement date : alldates) {
			String dt = date.getText();
			if (dt.equals(xpday)) {
				date.click();
				
			}
			
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
