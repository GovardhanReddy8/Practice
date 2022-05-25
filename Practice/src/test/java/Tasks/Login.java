package Tasks;

import org.testng.annotations.Test;

public class Login  extends Pageclass{
	@Test
	
	public void tasksOpen() throws InterruptedException {
		openBrowser("chrome");
		waitTime();
		loginFun("//input[@name='username']", "Govardhan");
		loginFun("//input[@name='password']", "Kgreddy88");
		loginFun("//input[@name='login']", "click");
		
		inputValue("//select[@name='location']", "Brisbane");
		inputValue("//select[@name='hotels']", "Hotel Sunshine");
		inputValue("//select[@name='room_type']", "Double");
		inputValue("//select[@name='room_nos']", "2");
		inputValue("//input[@name='datepick_in']", "23/04/2022");
		inputValue("//input[@name='datepick_out']", "24/04/2022");
		inputValue("//select[@name='adult_room']", "2");
		inputValue(" //select[@name='child_room']", "0");
		loginFun(" //input[@name='Submit']", "click");
		
		loginFun(" //input[@name='radiobutton_0']", "click");
		loginFun(" //input[@name='continue']", "click");
		
		inputValue("//input[@name='first_name']", "Govardhan");
		inputValue("//input[@name='last_name']", "Reddy");
		
		
		
		Thread.sleep(5000);
		tearDown();
		
		
		
	}
	
	

}
