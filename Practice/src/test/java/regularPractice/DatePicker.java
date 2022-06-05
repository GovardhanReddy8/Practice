package regularPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePicker {
	public static WebDriver driver;
	@Test
	public void date() throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//label[@for='onward_cal']")).click();
		
		String exyear="2023";
		String exmonth="July";
		String exday="29";
		
		String monthyear = driver.findElement(By.xpath("(//td[@class='monthTitle'])[2]")).getText();
		System.out.println(monthyear);
		String month = monthyear.split(" ")[0];
		String year = monthyear.split(" ")[1];
		
		while (!(month.equals(exmonth)&&year.equals(exyear))) {
			driver.findElement(By.xpath("(//td[@class='next'])[2]")).click();
			monthyear = driver.findElement(By.xpath("(//td[@class='monthTitle'])[2]")).getText();
			System.out.println(monthyear);
			month = monthyear.split(" ")[0];
			year = monthyear.split(" ")[1];
		}
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		for (WebElement date : alldates) {
			String dt = date.getText();
			if (dt.equals(exday)) {
				date.click();
				Thread.sleep(3000);
			}
		}
		driver.quit();
		
	}

}
