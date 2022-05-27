package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='username']")
	WebElement username;

	public void username(String text) {
		username.sendKeys(text);

	}

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	public void password(String text0) {
		password.sendKeys(text0);

	}

	@FindBy(xpath = "//input[@id='login']")
	WebElement login;

	public void login() {
		login.click();

	}

	public void doLogin(String text, String text0) {
		username.sendKeys(text);
		password.sendKeys(text0);
		login.click();
	}

}
