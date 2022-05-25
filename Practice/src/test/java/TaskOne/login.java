package TaskOne;

import org.testng.annotations.Test;

import TaskOne.pageOne;

public class login extends pageOne{
	@Test
	public void taseCase() throws InterruptedException {
		openBrowser("chrome");
		waitTime();
		inputValue("//input[@placeholder='Search AJIO']", "shirts");
		inputValue("//span[@class='ic-search']", "click");
		Thread.sleep(5000);
		tearDown();
		
	}

}
