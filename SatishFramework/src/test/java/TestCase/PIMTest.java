package TestCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseclass.browserSetup;
import baseclass.declarations;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjectory.LoginPage;
import pageObjectory.PIMPage;

public class PIMTest extends declarations{
	
	LoginPage lp;
	PIMPage pp;
	
	static Properties prop;
	static FileInputStream fileInput;
	static File file = new File(System.getProperty("user.dir") + "\\config\\file.properties");
	
	
	@Before
	public void ConfigurationSetup(){
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	
	@Given("User is logged and Navigated to PIM page")
	public void user_is_logged_and_navigated_to_pim_page() throws InterruptedException {
		 ConfigurationSetup();
		 driver = browserSetup.StartBrowser(prop.getProperty("browsername"), prop.getProperty("url"));
		 Thread.sleep(5000);
		 lp= new LoginPage(driver);
		 lp.setusername(prop.getProperty("username"));
		 lp.setPassword(prop.getProperty("password"));
		 lp.LoginBtn();
		 Thread.sleep(5000);
	}
	
	@Then("User click on PIM Tab")
	public void user_click_on_pim_tab() throws InterruptedException {
		 pp= new PIMPage(driver);
		 pp.PIMTab();
		 Thread.sleep(5000);
	}

	//@Then("User enter valid Employee Name {string}")
	//public void user_enter_valid_employee_name(String EmployeeName) throws InterruptedException {
	  //pp.EmployeeName(EmployeeName);
	  //Thread.sleep(5000);
	//}
	
	@Then("User click on the add button")
	public void user_click_on_the_add_button() {
	    pp = new PIMPage(driver);
	    pp.PIMTab();
	    pp.AddBtnn();
	}
	
	@Then("user enters the firstname {string}")
	public void user_enters_the_first_name(String FirstName) {
	    pp.FirstName(FirstName);
	}
	
	
	@Then("user enters the Midname  {string}")
	public void user_enters_the_midname(String MidName) {
		pp.MidName(MidName);
	}

	@Then("User enters the lastname  {string}")
	public void user_enters_the_lastname(String LastName ) {
	    pp.LastName(LastName);
	}

	@Then("user clicks on the save button")
	public void user_clicks_on_the_save_button() {
		pp.SaveBtnn();
	}
}
