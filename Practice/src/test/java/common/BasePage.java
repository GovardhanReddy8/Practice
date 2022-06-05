package common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {

	public static WebDriver driver;
	
     @BeforeMethod
	public void setUp() throws IOException {
    	 FileInputStream fis = new FileInputStream("Properties\\Config.properties");
    	 Properties prs = new Properties();
    	 prs.load(fis);
    	 prs.getProperty("Browse");
    	 System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
    	 driver=new ChromeDriver();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(prs.getProperty("implicitywait"))));
    	 driver.get(prs.getProperty("url"));
   
	}
     @AfterMethod
     public void tearDown() {
    	 driver.quit();
     }

}
