package ProjectS.adactinhotelapp;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Loging {
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

	}
	

	@Test
	public void openApp() {
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Govardhan");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Kgreddy88");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		driver.findElement(By.xpath("//select[@name='location']")).sendKeys("Brisbane");
		driver.findElement(By.xpath("//select[@name='hotels']")).sendKeys("Hotel Sunshine");
		driver.findElement(By.xpath("//select[@name='room_type']")).sendKeys("Double");
		driver.findElement(By.xpath("//select[@name='room_nos']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@value='22/04/2022']"));
		driver.findElement(By.xpath("//input[@value='23/04/2022']"));
		driver.findElement(By.xpath("//select[@name='adult_room']")).sendKeys("2");
		driver.findElement(By.xpath("//select[@name='child_room']")).sendKeys("0");
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Govardhan");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Reddy");
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("2/22,NJ,Paramus,Pampono beach");
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("8898123476541234");
		driver.findElement(By.xpath("//select[@name='cc_type']")).sendKeys("VISA");
		driver.findElement(By.xpath("//select[@name='cc_exp_month']")).sendKeys("June");
		driver.findElement(By.xpath("//select[@name='cc_exp_year']")).sendKeys("2022");
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		
	}

}
