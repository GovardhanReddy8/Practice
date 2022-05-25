package Tasks;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import TaskOne.pageOne;

public class TestCase extends Pageclass{
	@Test
	public void doLogin() {
		openBrowser("chrome");
		waitTime();
		loginFun("//input[@name='username']", "Govardhan");
		loginFun("//input[@name='password']", "Kgreddy88");
		loginFun("//input[@name='login']", "click");
		
		inputValue("//select[@name='location']", "Brisbane");
		inputValue("//select[@name='hotels']", "Hotel Sunshine");
		inputValue("//select[@name='room_type']", "Double");
		inputValue("//select[@name='room_nos']", "2");
		inputValue("//input[@name='datepick_in']", "26/04/2022");
		inputValue("//input[@name='datepick_out']", "27/04/2022");
		inputValue("//select[@name='adult_room']", "2");
		inputValue(" //select[@name='child_room']", "0");
		loginFun(" //input[@name='Submit']", "click");
		
		List<WebElement> fl = driver.findElements(By.tagName("tr"));
		fl=driver.findElements(By.xpath("//input[@name='hotel_name_0']"));
		WebElement wb;
		for (int i = 0; i < fl.size(); i++) {
			wb=fl.get(i);
			System.out.println(wb.getText());
			
		}
		
		
	}
	

}
