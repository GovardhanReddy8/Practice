package regressions;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import common.BasePage;
import pages.LoginPage;
import utils.UtilKit;

public class ValidateLogin extends BasePage{
	
	@Test(dataProvider = "getTest")
	public void login(String username, String password) {
		LoginPage lp = new LoginPage(driver);
		lp.doLogin(username, password);
		
	}
	
	@DataProvider
	Object[][] getTest() throws IOException{
		return UtilKit.getData("TestData", "Login");
		
	}

}
