package TestCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import baseclass.declarations;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import pageObjectory.Admin;
import pageObjectory.LoginPage;
import pageObjectory.PIMPage;
import utilities.util;

public class AdminTest extends declarations{
	
	
	Admin pp;
	util ut;
	
	
	
	
	@Then("User click on Admin Tab")
	public void user_click_on_admin_tab() {
	   pp= new Admin(driver);
	   pp.ADMINTab();
	   pp.AddBtn();
	}

	
	
	@Then("User enter valid UserName {string}")
	public void user_enter_valid_user_name(String UserName) {
		 pp.UserName(UserName);
	}
	
	@Then("User close the browser")
	public void user_close_the_browser() {
	   driver.close();
	}

	
	@Then("User select valid User Role {string}")
	public void user_select_valid_user_role(String UserRole) throws InterruptedException {
	   pp.UserRole();
	   Thread.sleep(2000);
	   ut= new util(driver);
	   ut.selectdropdownvalue(pp.UserRoleDropdownValue(), UserRole);
	   Thread.sleep(2000);
	}
	
	@Then("User enter valid Employee Name for Add User {string}")
	public void user_enter_valid_employee_name_for_add_user(String EmployeeName) {
	   pp.EmployeeName(EmployeeName);
	}
	
	
	
	@Then("User enter valid Status {string}")
	public void user_enter_valid_status(String Status) throws InterruptedException {
	pp.Status();
	Thread.sleep(2000);
	ut= new util(driver);
	ut.selectdropdownvalue(pp.UserRoleDropdownValue(), Status);
	Thread.sleep(2000);
		
	}
	
	
	
	@Then("User enter valid  Password {string}")
	public void user_enter_valid_password(String Password) {
	    pp.Password(Password);
	}
	
	@Then("User enter valid  ConfirmPassword {string}")
	public void user_enter_valid_confirm_password(String ConfirmPassword) {
	pp.ConfirmPassword(ConfirmPassword);
	}
	
	
	@Then("User clicks on the submit button")
	public void user_clicks_on_the_submit_button() {
	   pp.SaveBtn();
	}


}
