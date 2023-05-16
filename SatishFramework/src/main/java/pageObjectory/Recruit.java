package pageObjectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseclass.declarations;

public class Recruit extends declarations {
	
public Recruit(WebDriver driver) {
		
		declarations.driver= driver;
		PageFactory.initElements(driver,this);
		
		}

  @FindBy (xpath= "//ul[@class='oxd-main-menu']//li[5]")
 
 private WebElement RecruitTab;
 public void RecruitTab(){
	  
	  RecruitTab.click();
 }
 
 @FindBy(xpath="//*[@class='oxd-button oxd-button--medium oxd-button--secondary']")
 private WebElement AddBtn;
	
 public void AddBtn() {
		AddBtn.click();
 }
 
 @FindBy(xpath ="//*[@placeholder='First Name']")
	private WebElement FirstName;
	
	public void FirstName(String Value) {
		FirstName.sendKeys(Value);	}
	
	@FindBy(xpath ="//*[@placeholder='Middle Name']")
	private WebElement MiddleName;
	
	public void MiddleName(String Value) {
		MiddleName.sendKeys(Value);	}
	
	@FindBy(xpath ="//*[@placeholder='Last Name']")
	private WebElement LastName;
	
	public void LastName(String Value) {
		LastName.sendKeys(Value);
	}

	@FindBy(xpath ="//*[@class='oxd-select-text-input']")
	private WebElement Vacancy;
	
	public void Vacancy() {
		Vacancy.click();
	}
	
	@FindBy(xpath ="(//*[@role='listbox']/div/span)[1]")
	private List<WebElement> VacancyValue;
	
	public List<WebElement> VacancyValue(){
		return VacancyValue;
	}
	
	@FindBy(xpath ="(//*[@placeholder='Type here'])[1]")
	private WebElement Email;
	
	public void Email(String Value) {
		Email.sendKeys(Value);
	}
	
	@FindBy(xpath ="(//*[@placeholder='Type here'])[2]")
	private WebElement Contact;
	
	public void Contact(String Value) {
		Contact.sendKeys(Value);
	}
 
	@FindBy(xpath ="//*[@class='oxd-file-div oxd-file-div--active']")
	private WebElement Browse;
	
	public void Browse() {
		Browse.click();
	}
	
	@FindBy(xpath ="//*[@class='oxd-icon bi-calendar oxd-date-input-icon']")
	private WebElement Date;
	
	public void Date(String Num) {
		Date.sendKeys(Num);
	}
}
