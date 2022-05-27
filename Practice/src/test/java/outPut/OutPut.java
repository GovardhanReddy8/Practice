package outPut;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.LoginPage;
import util.UtilKit;

public class OutPut extends BasePage{
	
	@Test(dataProvider = "getform")
	public void login(String username, String password) {
		LoginPage lp = new LoginPage(driver);
		lp.doLogin(username, password);
		
	}
	@DataProvider
	Object[][] getform() throws IOException{
		return UtilKit.getData("TestData", "Login");
		
	}

}
