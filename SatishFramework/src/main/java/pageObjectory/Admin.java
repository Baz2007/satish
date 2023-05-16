package pageObjectory;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseclass.declarations;

public class Admin extends declarations {
	
	public Admin(WebDriver driver) {
		
		declarations.driver= driver;
		PageFactory.initElements(driver,this);
		
		}
	 
	@FindBy(xpath = "//ul[@class='oxd-main-menu']//li[3]")
	private WebElement ADMINTab;
	
	public void ADMINTab() {
		ADMINTab.click();
	}
	
	@FindBy(xpath ="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement Username;
	
	public void Username(String value) {
    Username.sendKeys(value);
} 
	
	
	//Add Admin User
//	@FindBy(xpath ="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	//private WebElement Add;
	
	//Select dropdownlist = new Select(driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")));
	
	//@FindBy(driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"))).SendKeys()
	
	//@FindBy(driver.findElement(By.xpath("//button[@type='submit'and @value='save']"))).click();
	
	@FindBy(xpath ="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement AddBtn;
	
	public void AddBtn() {
		AddBtn.click();
	}
	
	@FindBy(xpath ="(//*[@class='oxd-select-text oxd-select-text--active'])[1]")
	private WebElement UserRole;
	
	public void UserRole() {
		UserRole.click();
	}
	
	
	@FindBy(xpath ="//*[@role='listbox']/div/span")
	private List<WebElement> UserRoleDropdownValue;
	
	public List<WebElement> UserRoleDropdownValue(){
		return UserRoleDropdownValue;
	}
	
	@FindBy(xpath ="//input[@placeholder='Type for hints...']")
	private WebElement EmployeeName;
	
	public void EmployeeName(String value) {
		EmployeeName.sendKeys(value);
	}

	
	@FindBy(xpath ="(//*[@class='oxd-select-text oxd-select-text--active'])[2]")
	private WebElement Status;
	
	public void Status() {
		Status.click();
	}
	
	@FindBy(xpath ="(//*[@role='option'])")
	private List<WebElement> StatusValue;
	
	
	public List<WebElement> StatusValue(){
		return StatusValue;
	}
	
	
	
	@FindBy(xpath ="//label[contains(text(),'Username')]//ancestor::div/div/input")
	private WebElement UserName;
	
	public void UserName(String value) {
		UserName.sendKeys(value);
	}
	
	
	
	@FindBy(xpath ="(//label[contains(text(),'Password')]//ancestor::div/div/input)[1]")
	private WebElement Password;
	
	public void Password(String value) {
		Password.sendKeys(value);
	}
	
	
	@FindBy(xpath ="(//label[contains(text(),'Password')]//ancestor::div/div/input)[2]")
	private WebElement ConfirmPassword;
	
	public void ConfirmPassword(String value) {
		ConfirmPassword.sendKeys(value);
	}
	
	@FindBy(xpath ="//*[@type='submit']")
	private WebElement SaveBtn;
	
	public void SaveBtn() {
		SaveBtn.click();
	}
	
	
}
