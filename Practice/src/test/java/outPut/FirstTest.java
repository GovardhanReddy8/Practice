package outPut;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.BasePage;

public class FirstTest extends BasePage {

	@Test
	public void openApp() throws IOException, Exception {
		driver.findElement(By.xpath("//a[normalize-space()='Windows']")).click();
		driver.findElement(By.xpath(
				"//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//a[@class='button e.g. button_hilite button_pale small_button'][normalize-space()='Click Here']"))
				.click();
		Set<String> allwin = driver.getWindowHandles();
		for (String child : allwin) {
			driver.switchTo().window(child);
			Thread.sleep(3000);
			
		}

	}

}
