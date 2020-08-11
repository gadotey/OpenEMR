
package com.xsoftqa.autotest.stepdefinitions.Main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;

/**
 * @author Abdul
 *
 */

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.xsoftqa.autotest.pageobjects.Main.LoginPage;
import com.xsoftqa.autotest.pageobjects.Main.MainDashboardPage;
import com.xsoftqa.autotest.stepdefinitions.StepDefinitionsBase;
import com.xsoftqa.autotest.stepdefinitions.TestScenarioSession;

public class LoginStepDefs2 extends StepDefinitionsBase{
	
		private static final Logger log = LogManager.getLogger(LoginStepDefs2.class);
		private TestScenarioSession testScenarioSession = TestScenarioSession.getInstance();
		
		WebDriver webDriver = null;
		LoginPage loginPage= null;
		
		// Creating the Constructor for the step definition
		public LoginStepDefs2() throws Throwable{
			webDriver = getWebDriver();
			loginPage = new LoginPage(webDriver);
		
		}
		
		@After("@login-dashboard")
		public void tearDown(Scenario scenario) {     
			super.tearDownTest(scenario);
		}
		
		
		
		@Given("^I navigate to the OpenEMR login page$")
		public void i_navigate_to_the_OpenEMR_login_page() throws Throwable {
			webDriver.get(super.getContextRoot());
		}

		@When("^I enter the admin and pass$")
		public void i_enter_the_admin_and_pass() throws Throwable {
		    loginPage.sendUsername();
		    loginPage.sendPassword();
		    
		}

		@When("^I click on the submit button$")
		public void i_click_on_the_submit_button() throws Throwable {
		    loginPage.clickLoginBtn();
		}

		@Then("^I verify the  dash board have the following items$")
		public void i_verify_the_dash_board_have_the_following_items() throws Throwable {
		    // Verify admin account name that is logged in
		    loginPage.isAdminNameDisplay();
		}
		
	
		
		
		
		
//		@Given("^I navigate to the OpenEMR login page$")
//		public void i_navigate_to_the_OpenEMR_login_page() throws Throwable {
//			webDriver.get(super.getContextRoot());
//			// Enter username as "admin" and password as "123456789"
//			}
//
//		@When("^I enter the name(\\d+) and (\\d+)$")
//		public void i_enter_the_name_and(int arg1, int arg2) throws Throwable {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new PendingException();
//		}
//
//		@When("^I click on the submit button$")
//		public void i_click_on_the_submit_button() throws Throwable {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new PendingException();
//		}
//
//		
//		@Then("^I verify the Fail in step$")
//		public void i_verify_the_Fail_in_step() throws Throwable {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new PendingException();
//		}
//		
//		@When("^I enter the admin and pass$")
//		public void i_enter_the_admin_and_pass() throws Throwable {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new PendingException();
//		}
//
//		@Then("^I verify the  dash board have the following items$")
//		public void i_verify_the_dash_board_have_the_following_items() throws Throwable {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new PendingException();
//		}
//
//

	

}
