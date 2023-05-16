package pageObjectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.declarations;

public class PIMPage extends declarations{
	
	public PIMPage(WebDriver driver) {
		declarations.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li[2]")
	private WebElement PIMTab;
	
	public void PIMTab() {
		PIMTab.click();
	}
	
	//@FindBy(xpath = "(//*[@placeholder='Type for hints...'])[1]")
	//private WebElement EmployeeName;
	//public void EmployeeName(String value) {
		//EmployeeName.sendKeys(value);
	
	@FindBy(xpath ="//*[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement AddBtnn;
	
	public void AddBtnn() {
		AddBtnn.click();
	}
	
	@FindBy(xpath ="//*[@placeholder='First Name']")
	private WebElement FirstName;
	
	public void FirstName(String Value) {
		FirstName.sendKeys(Value);
	}
	
	@FindBy(xpath ="//*[@placeholder='Middle Name']")
	private WebElement MidName;
	
	public void MidName(String Value) {
		MidName.sendKeys(Value);
	}
	
	@FindBy(xpath ="//*[@placeholder='Last Name']")
	private WebElement LastName;
	
	public void LastName(String Value) {
		LastName.sendKeys(Value);
	}
	
	@FindBy(xpath ="//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement SaveBtnn;
	
	public void SaveBtnn() {
		SaveBtnn.click();
		System.out.println("Save button cliked successfully");
	}
	
	
	
	
//if(value!= null) {
	//System.out.println("No matches found");
		
	//}
//else {
	//System.out.println("Matches found");

//}
	
	//employee list

}

