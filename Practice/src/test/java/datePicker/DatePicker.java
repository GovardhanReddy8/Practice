package datePicker;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String exyear="2022";
		String exmonth="July";
		String exday="29";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String manthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

		System.out.println(manthyear);
		String month = manthyear.split(" ")[0];
		String year = manthyear.split(" ")[1];

		while (!(month.equals(exmonth) && year.equals(exyear))) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			manthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

			System.out.println(manthyear);
			month = manthyear.split(" ")[0];
			year = manthyear.split(" ")[1];
			

		}
		driver.findElement(By.xpath("//a[text()='"+exday+"']")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
