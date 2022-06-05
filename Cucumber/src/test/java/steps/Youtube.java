package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class Youtube {
	WebDriver driver;
	
	@Given("Browser should need to luach")
	public void browser_should_need_to_luach() {
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
	    
	}

	@Given("url should need ti pass")
	public void url_should_need_ti_pass() {
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	}

	@When("when browser is lauched title should need to verify")
	public void when_browser_is_lauched_title_should_need_to_verify() {
		String title = driver.getTitle();
		System.out.println(title);
	    
	}

	@When("enter some value in search box")
	public void enter_some_value_in_search_box() {
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("churu churu chinukai kurisave song");
	   
	}

	@Then("click the seach button")
	public void click_the_seach_button() {
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']")).click();
	    
	}

	@Then("and click the song")
	public void and_lick_the_song() {
		driver.findElement(By.id("title-wrapper")).click();
	  
	}

}
