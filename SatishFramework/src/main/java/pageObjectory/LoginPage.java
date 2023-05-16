package pageObjectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.declarations;

public class LoginPage extends declarations{
	
	public LoginPage(WebDriver driver) {
		declarations.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement username;
	
	public void setusername(String value) {
		username.sendKeys(value);
	}
	
	@FindBy(name = "password")
	private WebElement Password;
	
	public void setPassword(String value) {
		Password.sendKeys(value);
	}
	
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement LoginBtn;
	
	public void LoginBtn() {
		LoginBtn.click();
	}
	
}
