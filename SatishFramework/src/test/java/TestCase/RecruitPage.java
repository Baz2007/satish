package TestCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import baseclass.declarations;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjectory.Admin;
import pageObjectory.LoginPage;
import pageObjectory.PIMPage;
import pageObjectory.Recruit;
import utilities.util;

public class RecruitPage extends declarations{

	
	Recruit rr;
	util ut;
	
	public RecruitPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	@Given("User is logged and Navigated to Recruitment")
	public void user_is_logged_and_navigated_to_recruitment() {
	    
	}
	
	@Then("User click on Recruitment Tab")
	public void user_click_on_recruitment_tab() {
	     
		   rr = new Recruit(driver);
           rr.RecruitTab();
           rr.AddBtn();
	
	}
	
	@Then("user enters the Firstname {string}")
	public void user_enters_the_firstname(String FirstName) {
	    rr.FirstName(FirstName);

		
	}
	
	
	@Then("user enters the Midname {string}")
	public void user_enters_the_midname(String MidName) {
	    rr.MiddleName(MidName);
	}

	
	@Then("User enters the lastname {string}")
	public void user_enters_the_lastname(String LastName) {
         rr.LastName(LastName);
	}
	
	
	@Then("User select valid VacancyValue  {string}")
	public void user_select_valid_vacancy_value(String Vacancy) throws InterruptedException {
		rr.VacancyValue();
		Thread.sleep(2000);
		ut= new util(driver);
		ut.selectdropdownvalue(rr.VacancyValue(), Vacancy);
		Thread.sleep(2000);
			
	}
	
	
	@Then("User enters the Email_id  {string}")
	public void user_enters_the_email_id(String Email) {
	    rr.Email(Email);
	}
	
	@Then("user enters the Contact number  {string}")
	public void user_enters_the_contact_number(String Contact) {
	   rr.Contact(Contact);
	}
	
	@Then("user upload the file  {string}")
	public void user_upload_the_file(String string) {
	  
	}
	
	@Then("user enters the valid date  {string}")
	public void user_enters_the_valid_date(String Date) {
	    rr.Date(Date);
	}
	
	
}
