package SmallTestexams;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePicker {

	public WebDriver driver;

	@Test
	public void calender() throws InterruptedException {

		String monthyear = "July 2022";
		String day = "29";
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.booking.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body/div[@class='xpi__content__wrapper xpi__content__wrappergray xpi__"
				+ "content_hero_banner ']/div[@class='hero-banner-searchbox']/div[1]/form[1]/div[1]/div[2]"
				+ "/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]")).click();
		
		while (true) {
			String text = driver.findElement(By.xpath("(//div[@class='bui-calendar__month'])[1]")).getText();
			if (text.equals(monthyear)) {
				break;
				
			}else {
				driver.findElement(By.xpath("//div[@class='bui-calendar__control bui-calendar__control--next']"
						+ "//*[name()='svg']")).click();
			}
			List<WebElement> elements = driver.findElements(By.xpath("(//tbody)[1]//tr//td/span"));
			for (WebElement picker : elements) {
				String date = picker.getText();
				if (date.equals(day)) {
					picker.click();
					
				}
				
			}
			
		}
		
		
		
	}

}
