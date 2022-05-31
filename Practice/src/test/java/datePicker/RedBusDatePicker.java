package datePicker;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RedBusDatePicker {
	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//label[@for='onward_cal']")).click();
		
		String exptyear="2023";
		String exptmonth="Aug";
		String exptday="29";
		
		String monthyear = driver.findElement(By.xpath("(//td[@class='monthTitle'])[2]")).getText();
		String month = monthyear.split(" ")[0];
		String year = monthyear.split(" ")[1];
		
		while (!(month.equals(exptmonth)&&year.equals(exptyear))) {
			driver.findElement(By.xpath("(//td[@class='next'])[2]")).click();
			monthyear = driver.findElement(By.xpath("(//td[@class='monthTitle'])[2]")).getText();
			month = monthyear.split(" ")[0];
			year = monthyear.split(" ")[1];
		}
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		for (WebElement dt : alldates) {
			String date = dt.getText();
			if (date.equals(exptday)) {
				dt.click();
				Thread.sleep(3000);
			}
		}
		driver.quit();
	
	}


	}
