package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class SimpleLogin {
	public WebDriver driver;
	
	@Given("I want to open the browser")
	public void i_want_to_open_the_browser() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	    
	}

	@Given("I want to pass the url")
	public void i_want_to_pass_the_url() {
		driver.get("http://adactinhotelapp.com/");
	    
	}

	@Then("User should need to enter username")
	public void user_should_need_to_enter_username() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Govardhan");
	    
	}

	@Then("User should need to enter the password")
	public void user_should_need_to_enter_the_password() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Kgreddy88");
	  
	}

	@Then("I want to login")
	public void i_want_to_login() {
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
	
	}

	@When("page is login need to close the browser")
	public void page_is_login_need_to_close_the_browser() {
		driver.quit();
	    
	}

}
