package steps;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class FirstTest {
	
	public WebDriver driver;
	
	
	@Given("User should need to open the browser first")
	public void user_should_need_to_open_the_browser_first() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	    
	}

	@Then("Need to provide the proper url")
	public void need_to_provide_the_proper_url() {
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
	    
	}

	@Then("Loading browser timer")
	public void loading_browser_timer() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}

	@Then("click on the link")
	public void click_on_the_link() {
		driver.findElement(By.xpath("//a[@class='w3-btn'][normalize-space()='Try it Yourself »']")).click();
	   
	}

	@Then("switch the to new Window")
	public void switch_the_to_new_window() throws Exception {
		Set<String> allwins = driver.getWindowHandles();
		Iterator<String> windows = allwins.iterator();
		String parent = windows.next();
		String child = windows.next();
		driver.switchTo().window(child);
		Thread.sleep(3000);
	   
	}

	@Then("Go to the Ifram")
	public void go_to_the_ifram() throws Exception {
		WebElement fram1 = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(fram1);
		Thread.sleep(3000);
	    
	}

	@Then("Click the try on button")
	public void click_the_try_on_button() {
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	    
	}

	@Then("change the third Windoow")
	public void change_the_third_windoow() throws Exception {
		 Set<String> wb = driver.getWindowHandles();
		 Iterator<String> it = wb.iterator();
		 String child = it.next();
		 String thirs = it.next();
		 Thread.sleep(3000);
		 driver.switchTo().window(thirs);
		 
		
	    
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.quit();
	   
	}


}
