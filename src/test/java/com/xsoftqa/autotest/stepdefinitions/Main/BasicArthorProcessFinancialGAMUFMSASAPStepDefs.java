/**
 * 
 */
package com.xsoftqa.autotest.stepdefinitions.Main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.xsoftqa.autotest.pageobjects.search.SearchPage;
import com.xsoftqa.autotest.stepdefinitions.StepDefinitionsBase;
import com.xsoftqa.autotest.stepdefinitions.TestScenarioSession;
import junit.framework.Assert;

/**
 * @author tahiraka
 *
 */
public class BasicArthorProcessFinancialGAMUFMSASAPStepDefs extends StepDefinitionsBase{

	private static final Logger log = LogManager.getLogger(BasicArthorProcessFinancialGAMUFMSASAPStepDefs.class);
	private TestScenarioSession testScenarioSession = TestScenarioSession.getInstance();
	
//	WebDriver webDriver = null;
//	BasicAPCommunicationGAMUFMSASAPPage basicAPFinancialCommunication = null;
//	
//	public BasicArthorProcessFinancialGAMUFMSASAPStepDefs() throws Throwable  {
//		webDriver = getWebDriver();
//		basicAPFinancialCommunication = new BasicAPCommunicationGAMUFMSASAPPage(webDriver);
//		SearchPage searchBox = new SearchPage(webDriver);
//      
//	}
//	
//	@After("@basic-authorization-process")
//	public void tearDown(Scenario scenario) throws Throwable {
//		super.tearDownTest(scenario);
//	}
//	
//	// ************************************** BEGINING OF SCENARIO FOR SPRINT 4.4 ************************************************
//	@Given("^a user has submitted a GAM for test-seq-one$")
//	public void a_user_has_submitted_a_GAM_for_test_seq_one() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsManagementReviewerUser, super.getContextSUPERNOVAUserPassword());
//	    
//	}
//
//	@When("^a GAM is in \"([^\"]*)\" for test-seq-one$")
//	public void a_GAM_is_in_for_test_seq_one(String firstProgramaticReview) throws Throwable {
//	    // a GAM is in "First Programmatic Review"
//	    throw new PendingException();
//	}
//
//	@Then("^the \"([^\"]*)\" reviewer should be able to for test-seq-one$")
//	public void the_reviewer_should_be_able_to_for_test_seq_one(String arg1, DataTable arg2) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//	
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^a user has submitted a GAM for test-seq-two$")
//	public void a_user_has_submitted_a_GAM_for_test_seq_two() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^a GAM is in \"([^\"]*)\" for test-seq-two$")
//	public void a_GAM_is_in_for_test_seq_two(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the Second Programmatic Review reviewer should be able to approve or send back to \"([^\"]*)\" for test-seq-two$")
//	public void the_Second_Programmatic_Review_reviewer_should_be_able_to_approve_or_send_back_to_for_test_seq_two(String arg1, DataTable arg2) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^a user has submitted a GAM for test-seq-three$")
//	public void a_user_has_submitted_a_GAM_for_test_seq_three() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^a GAM is in \"([^\"]*)\" for test-seq-three$")
//	public void a_GAM_is_in_for_test_seq_three(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the First Financial Review reviewer should be able to approve or send back to \"([^\"]*)\" for test-seq-three$")
//	public void the_First_Financial_Review_reviewer_should_be_able_to_approve_or_send_back_to_for_test_seq_three(String arg1, DataTable arg2) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^a user has submitted a GAM for test-seq-four$")
//	public void a_user_has_submitted_a_GAM_for_test_seq_four() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^a GAM is in \"([^\"]*)\" for test-seq-four$")
//	public void a_GAM_is_in_for_test_seq_four(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the Second Financial Review reviewer should be able to approve or send back to \"([^\"]*)\" for test-seq-four$")
//	public void the_Second_Financial_Review_reviewer_should_be_able_to_approve_or_send_back_to_for_test_seq_four(String arg1, DataTable arg2) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am an internal/external user for test-seq-five$")
//	public void i_am_an_internal_external_user_for_test_seq_five() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I select the GAM that I would like to view for test-seq-five$")
//	public void i_select_the_GAM_that_I_would_like_to_view_for_test_seq_five() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the GAM should open up in full screen for test-seq-five$")
//	public void the_GAM_should_open_up_in_full_screen_for_test_seq_five() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^a user has submitted a GAM for Mini Authorization Process one$")
//	public void a_user_has_submitted_a_GAM_for_Mini_Authorization_Process_one() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^a GAM is in \"([^\"]*)\" for Mini Authorization Process one$")
//	public void a_GAM_is_in_for_Mini_Authorization_Process_one(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the \"([^\"]*)\" reviewer should be able to approve for Mini Authorization Process one$")
//	public void the_reviewer_should_be_able_to_approve_for_Mini_Authorization_Process_one(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the GAM will move to \"([^\"]*)\" for Mini Authorization Process one$")
//	public void the_GAM_will_move_to_for_Mini_Authorization_Process_one(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^a user has submitted a GAM for Mini Authorization Process two$")
//	public void a_user_has_submitted_a_GAM_for_Mini_Authorization_Process_two() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^a GAM is in \"([^\"]*)\" for Mini Authorization Process two$")
//	public void a_GAM_is_in_for_Mini_Authorization_Process_two(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the \"([^\"]*)\" reviewer should be able to approve for Mini Authorization Process two$")
//	public void the_reviewer_should_be_able_to_approve_for_Mini_Authorization_Process_two(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the GAM will move to \"([^\"]*)\" for Mini Authorization Process two$")
//	public void the_GAM_will_move_to_for_Mini_Authorization_Process_two(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^a user has submitted a GAM for Mini Authorization Process three$")
//	public void a_user_has_submitted_a_GAM_for_Mini_Authorization_Process_three() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^a GAM is in \"([^\"]*)\" for Mini Authorization Process three$")
//	public void a_GAM_is_in_for_Mini_Authorization_Process_three(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the \"([^\"]*)\" reviewer should be able to approve and the GAM will move to \"([^\"]*)\" for Mini Authorization Process three$")
//	public void the_reviewer_should_be_able_to_approve_and_the_GAM_will_move_to_for_Mini_Authorization_Process_three(String arg1, String arg2) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^a user has submitted a GAM for Mini Authorization Process four$")
//	public void a_user_has_submitted_a_GAM_for_Mini_Authorization_Process_four() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^a GAM is in \"([^\"]*)\" for Mini Authorization Process four$")
//	public void a_GAM_is_in_for_Mini_Authorization_Process_four(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the \"([^\"]*)\" reviewer should be able to approve for Mini Authorization Process four$")
//	public void the_reviewer_should_be_able_to_approve_for_Mini_Authorization_Process_four(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the GAM will be initially approved and ready for UFMSfor Mini Authorization Process four$")
//	public void the_GAM_will_be_initially_approved_and_ready_for_UFMSfor_Mini_Authorization_Process_four() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am the initiator of the GAM for Draft Change Requested$")
//	public void i_am_the_initiator_of_the_GAM_for_Draft_Change_Requested() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the GAM is in a \"([^\"]*)\" or \"([^\"]*)\" for Draft Change Requested$")
//	public void the_GAM_is_in_a_or_for_Draft_Change_Requested(String arg1, String arg2) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I select a GAM that I would like to view for Draft Change Requested$")
//	public void i_select_a_GAM_that_I_would_like_to_view_for_Draft_Change_Requested() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the GAM should open up in full screen for Draft Change Requested$")
//	public void the_GAM_should_open_up_in_full_screen_for_Draft_Change_Requested() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I should be able to Edit it for Draft Change Requested$")
//	public void i_should_be_able_to_Edit_it_for_Draft_Change_Requested() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am the initiator of the GAM for Not Draft$")
//	public void i_am_the_initiator_of_the_GAM_for_Not_Draft() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the GAM is not in a Draft Status for Not Draft$")
//	public void the_GAM_is_not_in_a_Draft_Status_for_Not_Draft() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I select the GAM that I would like to view for Not Draft$")
//	public void i_select_the_GAM_that_I_would_like_to_view_for_Not_Draft() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the GAM should open up in full screen as Read Only for Not Draft$")
//	public void the_GAM_should_open_up_in_full_screen_as_Read_Only_for_Not_Draft() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am an initiator or reviewer for Not Initiate$")
//	public void i_am_an_initiator_or_reviewer_for_Not_Initiate() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I select the GAM that I would like to view for Not Initiate$")
//	public void i_select_the_GAM_that_I_would_like_to_view_for_Not_Initiate() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the GAM should open up in full screen as Read Only for Not Initiate$")
//	public void the_GAM_should_open_up_in_full_screen_as_Read_Only_for_Not_Initiate() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am an internal user for Resolved/Closed Modifications$")
//	public void i_am_an_internal_user_for_Resolved_Closed_Modifications() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I select to View History for an award modification that is in a status for Resolved/Closed Modifications$")
//	public void i_select_to_View_History_for_an_award_modification_that_is_in_a_status_for_Resolved_Closed_Modifications(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	@Then("^I'll see the Audit History for this Award for Resolved/Closed Modifications$")
//	public void i_ll_see_the_Audit_History_for_this_Award_for_Resolved_Closed_Modifications() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I'm any of the internal/external roles for Submit award modification request$")
//	public void i_m_any_of_the_internal_external_roles_for_Submit_award_modification_request() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I've provided required information for Submit award modification request$")
//	public void i_ve_provided_required_information_for_Submit_award_modification_request() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I select \"([^\"]*)\" for Submit award modification request$")
//	public void i_select_for_Submit_award_modification_request(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^My award modification request will be submitted for review for Submit award modification request$")
//	public void my_award_modification_request_will_be_submitted_for_review_for_Submit_award_modification_request() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I will see \"([^\"]*)\" appear for Submit award modification request$")
//	public void i_will_see_appear_for_Submit_award_modification_request(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'll see the award modification request in \"([^\"]*)\" for Submit award modification request$")
//	public void i_ll_see_the_award_modification_request_in_for_Submit_award_modification_request(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I'm any of the internal/external roles for Validation on Submit$")
//	public void i_m_any_of_the_internal_external_roles_for_Validation_on_Submit() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I have not provided required information for Validation on Submit$")
//	public void i_have_not_provided_required_information_for_Validation_on_Submit() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I select \"([^\"]*)\" for Validation on Submit$")
//	public void i_select_for_Validation_on_Submit(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I will see a message \"([^\"]*)\" for Validation on Submit$")
//	public void i_will_see_a_message_for_Validation_on_Submit(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I'm any of the internal/external roles for Only one active GAM$")
//	public void i_m_any_of_the_internal_external_roles_for_Only_one_active_GAM() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^there is already an In-Progress GAM for an Award for Only one active GAM$")
//	public void there_is_already_an_In_Progress_GAM_for_an_Award_for_Only_one_active_GAM(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	@When("^I go to the GAM tab on that Award Page for Only one active GAM$")
//	public void i_go_to_the_GAM_tab_on_that_Award_Page_for_Only_one_active_GAM() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should not be able to select to create another GAM of the same GAM type for Only one active GAM$")
//	public void i_should_not_be_able_to_select_to_create_another_GAM_of_the_same_GAM_type_for_Only_one_active_GAM() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I'm any of the internal/external roles for Can create a GAM$")
//	public void i_m_any_of_the_internal_external_roles_for_Can_create_a_GAM() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^there are no In-Progress GAM for the Award for Can create a GAM$")
//	public void there_are_no_In_Progress_GAM_for_the_Award_for_Can_create_a_GAM(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	@When("^I go to the GAM tab on that Award Page for Can create a GAM$")
//	public void i_go_to_the_GAM_tab_on_that_Award_Page_for_Can_create_a_GAM() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should be able to select to create a GAM with that GAM type for Can create a GAM$")
//	public void i_should_be_able_to_select_to_create_a_GAM_with_that_GAM_type_for_Can_create_a_GAM() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am an external user for Project Period Extension$")
//	public void i_am_an_external_user_for_Project_Period_Extension() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I have a project period end date that is less than (\\d+) days from today for Project Period Extension$")
//	public void i_have_a_project_period_end_date_that_is_less_than_days_from_today_for_Project_Period_Extension(int arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should not be able to do a Project Period Extension for Project Period Extension$")
//	public void i_should_not_be_able_to_do_a_Project_Period_Extension_for_Project_Period_Extension() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am an internal/external user for View available statuses$")
//	public void i_am_an_internal_external_user_for_View_available_statuses() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantManagementInitiatorEditorUser, super.getContextCommonUserPassword());
//	}
//
//	@When("^I navigate to the Status column, in the Resolved/Closed Modification section for View available statuses$")
//	public void i_navigate_to_the_Status_column_in_the_Resolved_Closed_Modification_section_for_View_available_statuses() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I'll see one of the following statuses for View available statuses$")
//	public void i_ll_see_one_of_the_following_statuses_for_View_available_statuses(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^a user has submitted a GAM for MAP Change Request$")
//	public void a_user_has_submitted_a_GAM_for_MAP_Change_Request() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^a GAM is in Queue \"([^\"]*)\" for MAP Change Request$")
//	public void a_GAM_is_in_Queue_for_MAP_Change_Request(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^The Queue \"([^\"]*)\" reviewer should be able to send it to the initiator for changes or additional information for MAP Change Request$")
//	public void the_Queue_reviewer_should_be_able_to_send_it_to_the_initiator_for_changes_or_additional_information_for_MAP_Change_Request(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^The status of the GAM will change to \"([^\"]*)\" for MAP Change Request$")
//	public void the_status_of_the_GAM_will_change_to_for_MAP_Change_Request(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^a user has submitted a GAM for Sendback one$")
//	public void a_user_has_submitted_a_GAM_for_Sendback_one() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^a GAM is in Queue \"([^\"]*)\" for Sendback one$")
//	public void a_GAM_is_in_Queue_for_Sendback_one(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the Queue \"([^\"]*)\" reviewer should be able to send back the request to Queue \"([^\"]*)\" for Sendback one$")
//	public void the_Queue_reviewer_should_be_able_to_send_back_the_request_to_Queue_for_Sendback_one(String arg1, String arg2) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^a user has submitted a GAM for Sendback two$")
//	public void a_user_has_submitted_a_GAM_for_Sendback_two() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^a GAM is in Queue \"([^\"]*)\" for Sendback two$")
//	public void a_GAM_is_in_Queue_for_Sendback_two(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the Queue \"([^\"]*)\" reviewer should be able to send back the request to Queue \"([^\"]*)\" for Sendback two$")
//	public void the_Queue_reviewer_should_be_able_to_send_back_the_request_to_Queue_for_Sendback_two(String arg1, String arg2) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^a user has submitted a GAM for Sendback three$")
//	public void a_user_has_submitted_a_GAM_for_Sendback_three() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^a GAM is in Queue \"([^\"]*)\" for Sendback three$")
//	public void a_GAM_is_in_Queue_for_Sendback_three(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the Queue \"([^\"]*)\" reviewer should be able to send back the request to Queue \"([^\"]*)\" for Sendback three$")
//	public void the_Queue_reviewer_should_be_able_to_send_back_the_request_to_Queue_for_Sendback_three(String arg1, String arg2) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am an internal/external user for Resolved Closed Section$")
//	public void i_am_an_internal_external_user_for_Resolved_Closed_Section() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I go to the Grant Award Modification tab for Resolved Closed Section$")
//	public void i_go_to_the_Grant_Award_Modification_tab_for_Resolved_Closed_Section() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^there will be a section labeled Resolved/Closed Modifications for Resolved Closed Section$")
//	public void there_will_be_a_section_labeled_Resolved_Closed_Modifications_for_Resolved_Closed_Section() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am an internal/external user for Columns$")
//	public void i_am_an_internal_external_user_for_Columns() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I go to the section labeled Resolved/Closed Modifications for Columns$")
//	public void i_go_to_the_section_labeled_Resolved_Closed_Modifications_for_Columns() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I'll see the following Columns for Columns$")
//	public void i_ll_see_the_following_Columns_for_Columns(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I'm one of the internal user for Create Internal User$")
//	public void i_m_one_of_the_internal_user_for_Create_Internal_User() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'm viewing an award modification with one of the following statuses for Create Internal User$")
//	public void i_m_viewing_an_award_modification_with_one_of_the_following_statuses_for_Create_Internal_User(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	@When("^I select \"([^\"]*)\" for Create Internal User$")
//	public void i_select_for_Create_Internal_User(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I'll see a space for a description of the award modification's current status for Create Internal User$")
//	public void i_ll_see_a_space_for_a_description_of_the_award_modification_s_current_status_for_Create_Internal_User() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'll be able to see the following columns for Create Internal User$")
//	public void i_ll_be_able_to_see_the_following_columns_for_Create_Internal_User(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I'm an one of the internal user roles for GAM Submitted Status$")
//	public void i_m_an_one_of_the_internal_user_roles_for_GAM_Submitted_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'm viewing an award modification request of interest that is in \"([^\"]*)\" Status for GAM Submitted Status$")
//	public void i_m_viewing_an_award_modification_request_of_interest_that_is_in_Status_for_GAM_Submitted_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I select \"([^\"]*)\" for GAM Submitted Status$")
//	public void i_select_for_GAM_Submitted_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I'll be taken to the audit history for GAM Submitted Status$")
//	public void i_ll_be_taken_to_the_audit_history_for_GAM_Submitted_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'll see the following message: \"([^\"]*)\" for GAM Submitted Status$")
//	public void i_ll_see_the_following_message_for_GAM_Submitted_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be populated for GAM Submitted Status$")
//	public void the_following_columns_will_be_populated_for_GAM_Submitted_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be blank for GAM Submitted Status$")
//	public void the_following_columns_will_be_blank_for_GAM_Submitted_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I'm an one of the internal user roles for GAM Change Requested Status$")
//	public void i_m_an_one_of_the_internal_user_roles_for_GAM_Change_Requested_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'm viewing an award modification request of interest that is in \"([^\"]*)\" Status for GAM Change Requested Status$")
//	public void i_m_viewing_an_award_modification_request_of_interest_that_is_in_Status_for_GAM_Change_Requested_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I select \"([^\"]*)\" for GAM Change Requested Status$")
//	public void i_select_for_GAM_Change_Requested_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I'll be taken to the audit history for the award modification request$")
//	public void i_ll_be_taken_to_the_audit_history_for_the_award_modification_request() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'll see the following message: \"([^\"]*)\" for the award modification request$")
//	public void i_ll_see_the_following_message_for_the_award_modification_request(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be populated for GAM Change Requested Status$")
//	public void the_following_columns_will_be_populated_for_GAM_Change_Requested_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be blank for GAM Change Requested Status$")
//	public void the_following_columns_will_be_blank_for_GAM_Change_Requested_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I'm one of the internal user roles for GAM Approved Status$")
//	public void i_m_one_of_the_internal_user_roles_for_GAM_Approved_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'm viewing an award modification request of interest that is in \"([^\"]*)\"  Status for GAM Approved Status$")
//	public void i_m_viewing_an_award_modification_request_of_interest_that_is_in_Status_for_GAM_Approved_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I select \"([^\"]*)\" for GAM Approved Status$")
//	public void i_select_for_GAM_Approved_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I'll be taken to the audit history for the award modification request for GAM Approved Status$")
//	public void i_ll_be_taken_to_the_audit_history_for_the_award_modification_request_for_GAM_Approved_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'll see the message: \"([^\"]*)\" for GAM Approved Status$")
//	public void i_ll_see_the_message_for_GAM_Approved_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be populated for GAM Approved Status$")
//	public void the_following_columns_will_be_populated_for_GAM_Approved_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be blank for GAM Approved Status$")
//	public void the_following_columns_will_be_blank_for_GAM_Approved_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I'm one of the internal user roles for GAM Withdrawn Status$")
//	public void i_m_one_of_the_internal_user_roles_for_GAM_Withdrawn_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'm viewing an award modification request of interest that is in \"([^\"]*)\"  Status for GAM Withdrawn Status$")
//	public void i_m_viewing_an_award_modification_request_of_interest_that_is_in_Status_for_GAM_Withdrawn_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I select \"([^\"]*)\" for GAM Withdrawn Status$")
//	public void i_select_for_GAM_Withdrawn_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I'll be taken to the audit history for the award modification request for GAM Withdrawn Status$")
//	public void i_ll_be_taken_to_the_audit_history_for_the_award_modification_request_for_GAM_Withdrawn_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'll see the following message: \"([^\"]*)\" for GAM Withdrawn Status$")
//	public void i_ll_see_the_following_message_for_GAM_Withdrawn_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be populated for GAM Withdrawn Status$")
//	public void the_following_columns_will_be_populated_for_GAM_Withdrawn_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be blank for GAM Withdrawn Status$")
//	public void the_following_columns_will_be_blank_for_GAM_Withdrawn_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I'm one of the internal user roles for GAM Denied Status$")
//	public void i_m_one_of_the_internal_user_roles_for_GAM_Denied_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Given("^I'm viewing an award modification request of interest that is in \"([^\"]*)\" Status for GAM Denied Status$")
//	public void i_m_viewing_an_award_modification_request_of_interest_that_is_in_Status_for_GAM_Denied_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I select \"([^\"]*)\" for GAM Denied Status$")
//	public void i_select_for_GAM_Denied_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I'll be taken to the audit history for the award modification request for GAM Denied Status$")
//	public void i_ll_be_taken_to_the_audit_history_for_the_award_modification_request_for_GAM_Denied_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'll see the following message: \"([^\"]*)\" for GAM Denied Status$")
//	public void i_ll_see_the_following_message_for_GAM_Denied_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be populated for GAM Denied Status$")
//	public void the_following_columns_will_be_populated_for_GAM_Denied_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be blank for GAM Denied Status$")
//	public void the_following_columns_will_be_blank_for_GAM_Denied_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I'm one of the internal user roles for GAM Deleted Draft Status$")
//	public void i_m_one_of_the_internal_user_roles_for_GAM_Deleted_Draft_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'm viewing an award modification request of interest that is in \"([^\"]*)\" Status for GAM Deleted Draft Status$")
//	public void i_m_viewing_an_award_modification_request_of_interest_that_is_in_Status_for_GAM_Deleted_Draft_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I select \"([^\"]*)\" for GAM Deleted Draft Status$")
//	public void i_select_for_GAM_Deleted_Draft_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I'll be taken to the audit history for the award modification request for GAM Deleted Draft Status$")
//	public void i_ll_be_taken_to_the_audit_history_for_the_award_modification_request_for_GAM_Deleted_Draft_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'll see the following message: \"([^\"]*)\" for GAM Deleted Draft Status$")
//	public void i_ll_see_the_following_message_for_GAM_Deleted_Draft_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be populated for GAM Deleted Draft Status$")
//	public void the_following_columns_will_be_populated_for_GAM_Deleted_Draft_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be blank for GAM Deleted Draft Status$")
//	public void the_following_columns_will_be_blank_for_GAM_Deleted_Draft_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I'm one of the internal user for GAM On Hold Status$")
//	public void i_m_one_of_the_internal_user_for_GAM_On_Hold_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'm viewing an award modification request of interest that is in \"([^\"]*)\" Status for GAM On Hold Status$")
//	public void i_m_viewing_an_award_modification_request_of_interest_that_is_in_Status_for_GAM_On_Hold_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I select \"([^\"]*)\" for GAM On Hold Status$")
//	public void i_select_for_GAM_On_Hold_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I'll be taken to the audit history for the award modification request for GAM On Hold Status$")
//	public void i_ll_be_taken_to_the_audit_history_for_the_award_modification_request_for_GAM_On_Hold_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'll see the following message: \"([^\"]*)\" for GAM On Hold Status$")
//	public void i_ll_see_the_following_message_for_GAM_On_Hold_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be populated for GAM On Hold Status$")
//	public void the_following_columns_will_be_populated_for_GAM_On_Hold_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be blank for GAM On Hold Status$")
//	public void the_following_columns_will_be_blank_for_GAM_On_Hold_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO FOR SPRINT 4.5 ************************************************
//	@Given("^I am an internal user for Internal$")
//	public void i_am_an_internal_user_for_Internal() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//		System.out.println("Hey am here now");
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantManagementInitiatorEditorUser, super.getContextCommonUserPassword());
//	    
//	}
//
//	@When("^I put a GAM On Hold for Internal$")
//	public void i_put_a_GAM_On_Hold_for_Internal() throws Throwable {
//	    try {
//			// Click on the "Award" menu from the left navigation bar.
//			basicAPFinancialCommunication.selectAwardMenu();
//			// Select "Funded Award" from the grid or Search for it by entering it into the search box and press the enter key on your keyboard.
//			basicAPFinancialCommunication.selectFundedAward();
//			// Navigate to the GAM page. by clicking on the GAM Tab
//			basicAPFinancialCommunication.navigateToAwardReviewScreen();
//			// Select the GAM Case number from the GAM ID column of the In Progress GAMs Table or Search for it by entering it into the Search box 
//			basicAPFinancialCommunication.selectGAMCaseNumber();
//			// Put a GAM On Hold
//			basicAPFinancialCommunication.putGAMOnHold();
//		} catch (AssertionError | Exception error) {
//			String exception = error.toString();
//			log.debug(error);
//			fail(exception);
//		}
//	}
//
//	@Then("^the internal user status should be \"([^\"]*)\" for Internal$")
//	public void the_internal_user_status_should_be_for_Internal(String expectedInternalUserStatus) throws Throwable {
//	    // Internal user status should be "On Hold"
//		try {
//			assertEquals("The expected Internal User Status of On Hold does not matched the actual Internal User Status", expectedInternalUserStatus, 
//					basicAPFinancialCommunication.verifyInternalUserStatus());
//		} catch (AssertionError | Exception error) {
//			String exception = error.toString();
//			log.debug(error);
//			fail(exception);
//		}
//	}
//
//	@And("^the external user status should be \"([^\"]*)\" for Internal$")
//	public void the_external_user_status_should_be_for_Internal(String expectedExternalUserStatus) throws Throwable {
//	    // Internal user status should be "On Hold"
//		try {
//			assertEquals("The expected Internal User Status of On Hold does not matched the actual Internal User Status", expectedExternalUserStatus, 
//					basicAPFinancialCommunication.verifyExternalUserStatus());
//		} catch (AssertionError | Exception error) {
//			String exception = error.toString();
//			log.debug(error);
//			fail(exception);
//		}
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am an internal user for Comment$")
//	public void i_am_an_internal_user_for_Comment() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsManagementReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@When("^I put a GAM On Hold for Comment$")
//	public void i_put_a_GAM_On_Hold_for_Comment() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I am required to add a comment for Comment$")
//	public void i_am_required_to_add_a_comment_for_Comment() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am an internal user for Internal user$")
//	public void i_am_an_internal_user_for_Internal_user() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsManagementReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@When("^I View a GAM for Internal user$")
//	public void i_View_a_GAM_for_Internal_user() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I am not able to put it on hold for Internal user$")
//	public void i_am_not_able_to_put_it_on_hold_for_Internal_user() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I'm any of the internal/external Grant Award Administrator roles that initiate a GAM for Submit Withdraw Request$")
//	public void i_m_any_of_the_internal_external_Grant_Award_Administrator_roles_that_initiate_a_GAM_for_Submit_Withdraw_Request() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextEXTERNALGrantAwardAdminUser, super.getContextCommonExternalUserPassword());
//	}
//
//	@And("^I want to withdraw a Change Requested award modification request for Submit Withdraw Request$")
//	public void i_want_to_withdraw_a_Change_Requested_award_modification_request_for_Submit_Withdraw_Request() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I select select to Withdraw the request for Submit Withdraw Request$")
//	public void i_select_select_to_Withdraw_the_request_for_Submit_Withdraw_Request() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the award modification request will be removed from the review and approval workflow for Submit Withdraw Request$")
//	public void the_award_modification_request_will_be_removed_from_the_review_and_approval_workflow_for_Submit_Withdraw_Request() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I will see withdrawn award modification in the Closed/Resolved GAMs for Submit Withdraw Request$")
//	public void i_will_see_withdrawn_award_modification_in_the_Closed_Resolved_GAMs_for_Submit_Withdraw_Request() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I'm any of the internal/external Alternate Grant Award Administrator roles that initiate a GAM for Submit Withdraw Request$")
//	public void i_m_any_of_the_internal_external_Alternate_Grant_Award_Administrator_roles_that_initiate_a_GAM_for_Submit_Withdraw_Request() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextEXTERNALAltGrantAwardAdminUser, super.getContextCommonExternalUserPassword());
//	}
//
//	@Given("^I am an internal Grants Management Reviewer user for Taking off On Hold$")
//	public void i_am_an_internal_Grants_Management_Reviewer_user_for_Taking_off_On_Hold() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsManagementReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@When("^I have resolved the issue that caused the GAM to be put On Hold for Taking off On Hold$")
//	public void i_have_resolved_the_issue_that_caused_the_GAM_to_be_put_On_Hold_for_Taking_off_On_Hold() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should be able to take it off the On Hold status for Taking off On Hold$")
//	public void i_should_be_able_to_take_it_off_the_On_Hold_status_for_Taking_off_On_Hold() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am an internal Supervision Reviewer user for Taking off On Hold$")
//	public void i_am_an_internal_Supervision_Reviewer_user_for_Taking_off_On_Hold() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsManagementSupervisionReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@Given("^I am an internal Grants Financial Management Reviewer user for Taking off On Hold$")
//	public void i_am_an_internal_Grants_Financial_Management_Reviewer_user_for_Taking_off_On_Hold() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsFinancialManagementReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@Given("^I am an internal Grants Financial Management Approver user for Taking off On Hold$")
//	public void i_am_an_internal_Grants_Financial_Management_Approver_user_for_Taking_off_On_Hold() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsFinancialManagementApproverUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@Given("^I am an internal Grants Management Reviewer user for Comment Required$")
//	public void i_am_an_internal_Grants_Management_Reviewer_user_for_Comment_Required() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsManagementReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@When("^I take a GAM off Hold for Comment Required$")
//	public void i_take_a_GAM_off_Hold_for_Comment_Required() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should be required to enter a comment for Comment Required$")
//	public void i_should_be_required_to_enter_a_comment_for_Comment_Required() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am an internal Supervision Reviewer user for Comment Required$")
//	public void i_am_an_internal_Supervision_Reviewer_user_for_Comment_Required() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsManagementSupervisionReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@Given("^I am an internal Grants Financial Management Reviewer user for Comment Required$")
//	public void i_am_an_internal_Grants_Financial_Management_Reviewer_user_for_Comment_Required() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsFinancialManagementReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@Given("^I am an internal Grants Financial Management Approver user for Comment Required$")
//	public void i_am_an_internal_Grants_Financial_Management_Approver_user_for_Comment_Required() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsFinancialManagementApproverUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@Given("^I am an internal Grants Management Reviewer user for Return to prior status$")
//	public void i_am_an_internal_Grants_Management_Reviewer_user_for_Return_to_prior_status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsManagementReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@When("^I take a GAM off On Hold for Return to prior status$")
//	public void i_take_a_GAM_off_On_Hold_for_Return_to_prior_status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the status of the GAM should revert back to the status it was before it was put On Hold$")
//	public void the_status_of_the_GAM_should_revert_back_to_the_status_it_was_before_it_was_put_On_Hold() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am an internal Supervision Reviewer user for Return to prior status$")
//	public void i_am_an_internal_Supervision_Reviewer_user_for_Return_to_prior_status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsManagementSupervisionReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@Given("^I am an internal Grants Financial Management Reviewer user for Return to prior status$")
//	public void i_am_an_internal_Grants_Financial_Management_Reviewer_user_for_Return_to_prior_status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsFinancialManagementReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@Given("^I am an internal Grants Financial Management Approver user for Return to prior status$")
//	public void i_am_an_internal_Grants_Financial_Management_Approver_user_for_Return_to_prior_status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsFinancialManagementApproverUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@Given("^I am an internal Grants Management Reviewer user for Comment$")
//	public void i_am_an_internal_Grants_Management_Reviewer_user_for_Comment() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsManagementReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@When("^I take a GAM off On Hold for Comment$")
//	public void i_take_a_GAM_off_On_Hold_for_Comment() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should be required to add a comment for Comment$")
//	public void i_should_be_required_to_add_a_comment_for_Comment() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am an internal Supervision Reviewer user for Comment$")
//	public void i_am_an_internal_Supervision_Reviewer_user_for_Comment() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsManagementSupervisionReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@And("^I am an internal Grants Financial Management Reviewer user for Comment$")
//	public void i_am_an_internal_Grants_Financial_Management_Reviewer_user_for_Comment() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Given("^I am an internal Grants Financial Management Approver user for Comment$")
//	public void i_am_an_internal_Grants_Financial_Management_Approver_user_for_Comment() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Given("^I am an internal Grants Management Reviewer user for Internal user not listed$")
//	public void i_am_an_internal_Grants_Management_Reviewer_user_for_Internal_user_not_listed() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I look at a GAM that is On Hold for Internal user not listed$")
//	public void i_look_at_a_GAM_that_is_On_Hold_for_Internal_user_not_listed() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should not be able to add a comment for Internal user not listed$")
//	public void i_should_not_be_able_to_add_a_comment_for_Internal_user_not_listed() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I will not be able to update the status for Internal user not listed$")
//	public void i_will_not_be_able_to_update_the_status_for_Internal_user_not_listed() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am an internal Supervision Reviewer user for Internal user not listed$")
//	public void i_am_an_internal_Supervision_Reviewer_user_for_Internal_user_not_listed() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsManagementSupervisionReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@And("^I am an internal Grants Financial Management Reviewer user for Internal user not listed$")
//	public void i_am_an_internal_Grants_Financial_Management_Reviewer_user_for_Internal_user_not_listed() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Given("^I am an internal Grants Financial Management Approver user for Internal user not listed$")
//	public void i_am_an_internal_Grants_Financial_Management_Approver_user_for_Internal_user_not_listed() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Given("^I have put a GAM request \"([^\"]*)\" for Internal$")
//	public void i_have_put_a_GAM_request_for_Internal(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I look at the in progress GAMS for Internal$")
//	public void i_look_at_the_in_progress_GAMS_for_Internal() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I will see the status of \"([^\"]*)\" status for Internal$")
//	public void i_will_see_the_status_of_status_for_Internal(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am an internal user for Internal - not$")
//	public void i_am_an_internal_user_for_Internal_not() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsManagementReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@And("^I see a GAM \"([^\"]*)\" for Internal - not$")
//	public void i_see_a_GAM_for_Internal_not(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I look at the in progress GAMS for Internal - not$")
//	public void i_look_at_the_in_progress_GAMS_for_Internal_not() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I will see the status of \"([^\"]*)\" status for Internal - not$")
//	public void i_will_see_the_status_of_status_for_Internal_not(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am an external user for External$")
//	public void i_am_an_external_user_for_External() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextFinancialGrantsManagementInitiatorEditorUser, super.getContextCommonUserPassword());
//	}
//
//	@And("^I look at the GAMS that have been submitted for External$")
//	public void i_look_at_the_GAMS_that_have_been_submitted_for_External() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^a GAM is put On Hold for External$")
//	public void a_GAM_is_put_On_Hold_for_External() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the I will see the status of \"([^\"]*)\" for External$")
//	public void the_I_will_see_the_status_of_for_External(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO  SPRING 4.5 ************************************************
//	@Given("^I'm one of the external user roles for Create External User$")
//	public void i_m_one_of_the_external_user_roles_for_Create_External_User() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextFinancialGrantsManagementInitiatorEditorUser, super.getContextCommonUserPassword());
//	}
//
//	@Given("^I'm viewing an award modification with one of the following statuses for Create External User$")
//	public void i_m_viewing_an_award_modification_with_one_of_the_following_statuses_for_Create_External_User(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextFinancialGrantsManagementInitiatorEditorUser, super.getContextCommonUserPassword());
//	    
//	}
//
//	@When("^I select \"([^\"]*)\" for Create External User$")
//	public void i_select_for_Create_External_User(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I'll see a space for a description of the award modification's current status for Create External User$")
//	public void i_ll_see_a_space_for_a_description_of_the_award_modification_s_current_status_for_Create_External_User() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'll be able to see the following columns for Create External User:$")
//	public void i_ll_be_able_to_see_the_following_columns_for_Create_External_User(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I'm an one of the external user roles for Submitted Status$")
//	public void i_m_an_one_of_the_external_user_roles_for_Submitted_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextFinancialGrantsManagementInitiatorEditorUser, super.getContextCommonUserPassword());
//	}
//
//	@Given("^I'm viewing an award modification request of interest that is in \"([^\"]*)\" Status for Submitted Status$")
//	public void i_m_viewing_an_award_modification_request_of_interest_that_is_in_Status_for_Submitted_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I select View History for Submitted Status$")
//	public void i_select_View_History_for_Submitted_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I'll be taken to the audit history for the award modification for Submitted Status$")
//	public void i_ll_be_taken_to_the_audit_history_for_the_award_modification_for_Submitted_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'll see the following message: \"([^\"]*)\" for Submitted Status$")
//	public void i_ll_see_the_following_message_for_Submitted_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be populated for Submitted Status$")
//	public void the_following_columns_will_be_populated_for_Submitted_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be blank for Submitted Status:$")
//	public void the_following_columns_will_be_blank_for_Submitted_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I'm an one of the external user roles for Sent Back Status$")
//	public void i_m_an_one_of_the_external_user_roles_for_Sent_Back_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextFinancialGrantsManagementInitiatorEditorUser, super.getContextCommonUserPassword());
//	}
//
//	@And("^I'm viewing an award modification request of interest that is in \"([^\"]*)\" Status for Sent Back Status$")
//	public void i_m_viewing_an_award_modification_request_of_interest_that_is_in_Status_for_Sent_Back_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I select \"([^\"]*)\" for Sent Back Status$")
//	public void i_select_for_Sent_Back_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I'll be taken to the audit history for the award modification request for Sent Back Status$")
//	public void i_ll_be_taken_to_the_audit_history_for_the_award_modification_request_for_Sent_Back_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'll see the following message: \"([^\"]*)\" for Sent Back Status$")
//	public void i_ll_see_the_following_message_for_Sent_Back_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be populated for Sent Back Status$")
//	public void the_following_columns_will_be_populated_for_Sent_Back_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be blank for Sent Back Status:$")
//	public void the_following_columns_will_be_blank_for_Sent_Back_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I'm an one of the external user roles for Approved Status$")
//	public void i_m_an_one_of_the_external_user_roles_for_Approved_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextFinancialGrantsManagementInitiatorEditorUser, super.getContextCommonUserPassword());
//	}
//
//	@Given("^I'm viewing an award modification request of interest that is in \"([^\"]*)\" Status for Approved Status$")
//	public void i_m_viewing_an_award_modification_request_of_interest_that_is_in_Status_for_Approved_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I select \"([^\"]*)\" for Approved Status$")
//	public void i_select_for_Approved_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I'll be taken to the audit history for the award modification request for Approved Status$")
//	public void i_ll_be_taken_to_the_audit_history_for_the_award_modification_request_for_Approved_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I\"([^\"]*)\"This request has been approved\\.  View the modification and approval history below\\.\" for Approved Status$")
//	public void i_This_request_has_been_approved_View_the_modification_and_approval_history_below_for_Approved_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be populated for Approved Status$")
//	public void the_following_columns_will_be_populated_for_Approved_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be blank for Approved Status:$")
//	public void the_following_columns_will_be_blank_for_Approved_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I'm an one of the external user roles for Withdrawn Status$")
//	public void i_m_an_one_of_the_external_user_roles_for_Withdrawn_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextFinancialGrantsManagementInitiatorEditorUser, super.getContextCommonUserPassword());
//	}
//
//	@And("^I'm viewing an award modification request of interest that is in \"([^\"]*)\" Status for Withdrawn Status$")
//	public void i_m_viewing_an_award_modification_request_of_interest_that_is_in_Status_for_Withdrawn_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I select \"([^\"]*)\" for Withdrawn Status$")
//	public void i_select_for_Withdrawn_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I'll be taken to the audit history for the award modification request for Withdrawn Status$")
//	public void i_ll_be_taken_to_the_audit_history_for_the_award_modification_request_for_Withdrawn_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'll see the following message: \"([^\"]*)\" for Withdrawn Status$")
//	public void i_ll_see_the_following_message_for_Withdrawn_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be populated for Withdrawn Status$")
//	public void the_following_columns_will_be_populated_for_Withdrawn_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be blank for Withdrawn Status:$")
//	public void the_following_columns_will_be_blank_for_Withdrawn_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I'm an one of the external user roles for Denied Status$")
//	public void i_m_an_one_of_the_external_user_roles_for_Denied_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextFinancialGrantsManagementInitiatorEditorUser, super.getContextCommonUserPassword());
//	}
//
//	@And("^I'm viewing an award modification request of interest that is in \"([^\"]*)\" Status for Denied Status$")
//	public void i_m_viewing_an_award_modification_request_of_interest_that_is_in_Status_for_Denied_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I select \"([^\"]*)\" for Denied Status$")
//	public void i_select_for_Denied_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I'll be taken to the audit history for the award modification request for Denied Status$")
//	public void i_ll_be_taken_to_the_audit_history_for_the_award_modification_request_for_Denied_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'll see the following message: \"([^\"]*)\" for Denied Status$")
//	public void i_ll_see_the_following_message_for_Denied_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be populated for Denied Status$")
//	public void the_following_columns_will_be_populated_for_Denied_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be blank for Denied Status:$")
//	public void the_following_columns_will_be_blank_for_Denied_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I'm an one of the external user roles for Deleted Draft Status$")
//	public void i_m_an_one_of_the_external_user_roles_for_Deleted_Draft_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextFinancialGrantsManagementInitiatorEditorUser, super.getContextCommonUserPassword());
//	}
//
//	@And("^I'm viewing an award modification request of interest that is in \"([^\"]*)\" Status for Deleted Draft Status$")
//	public void i_m_viewing_an_award_modification_request_of_interest_that_is_in_Status_for_Deleted_Draft_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^I select \"([^\"]*)\" for Deleted Draft Status$")
//	public void i_select_for_Deleted_Draft_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I'll be taken to the audit history for the award modification request for Deleted Draft Status$")
//	public void i_ll_be_taken_to_the_audit_history_for_the_award_modification_request_for_Deleted_Draft_Status() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I'll see the following message: \"([^\"]*)\" for Deleted Draft Status$")
//	public void i_ll_see_the_following_message_for_Deleted_Draft_Status(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be populated for Deleted Draft Status$")
//	public void the_following_columns_will_be_populated_for_Deleted_Draft_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	@And("^the following columns will be blank for Deleted Draft Status:$")
//	public void the_following_columns_will_be_blank_for_Deleted_Draft_Status(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    throw new PendingException();
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am an external user for Connect Award Modification$")
//	public void i_am_an_external_user_for_Connect_Award_Modification() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextFinancialGrantsManagementInitiatorEditorUser, super.getContextCommonUserPassword());
//	}
//
//	@When("^I go to the Award Task List for Connect Award Modification$")
//	public void i_go_to_the_Award_Task_List_for_Connect_Award_Modification() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I should see my Award Modification tasks for Connect Award Modification$")
//	public void i_should_see_my_Award_Modification_tasks_for_Connect_Award_Modification() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//	
//	// ************************************** BEGINING OF SCENARIO 5.2 ************************************************
//	@Given("^I am Grants Management Editor/Reviewer for Hold confirmation reason one$")
//	public void i_am_Grants_Management_Editor_Reviewer_for_Hold_confirmation_reason_one() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextFinancialGrantsManagementInitiatorEditorUser, super.getContextCommonUserPassword());
//	}
//
//	@When("^I select to put a GAM on hold for Hold confirmation reason one$")
//	public void i_select_to_put_a_GAM_on_hold_for_Hold_confirmation_reason_one() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I haven't entered a comment for Hold confirmation reason one$")
//	public void i_haven_t_entered_a_comment_for_Hold_confirmation_reason_one() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I will get the error message as a popup that says: \"([^\"]*)\" for Hold confirmation reason one$")
//	public void i_will_get_the_error_message_as_a_popup_that_says_for_Hold_confirmation_reason_one(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the GAM will not proceed to Hold until a reason has been entered for Hold confirmation reason one$")
//	public void the_GAM_will_not_proceed_to_Hold_until_a_reason_has_been_entered_for_Hold_confirmation_reason_one() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the Hold Reason will be recorded in the Internal Comments area of the GAM record and will not be editable for Hold confirmation reason one$")
//	public void the_Hold_Reason_will_be_recorded_in_the_Internal_Comments_area_of_the_GAM_record_and_will_not_be_editable_for_Hold_confirmation_reason_one() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Given("^I am Grants Management First Supervisory Editor/Reviewer for Hold confirmation reason one$")
//	public void i_am_Grants_Management_First_Supervisory_Editor_Reviewer_for_Hold_confirmation_reason_one() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsManagementSupervisionReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@Given("^I am Grants Management Programmatic Approver for Hold confirmation reason one$")
//	public void i_am_Grants_Management_Programmatic_Approver_for_Hold_confirmation_reason_one() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantManagementInitiatorEditorUser, super.getContextCommonUserPassword());
//	}
//
//	@Given("^I am Financial Grants Management Editor/Reviewer for Hold confirmation reason one$")
//	public void i_am_Financial_Grants_Management_Editor_Reviewer_for_Hold_confirmation_reason_one() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextFinancialGrantsManagementInitiatorEditorUser, super.getContextCommonUserPassword());
//	}
//
//	@Given("^I am Financial Grants Management Supervision Editor/Reviewer for Hold confirmation reason one$")
//	public void i_am_Financial_Grants_Management_Supervision_Editor_Reviewer_for_Hold_confirmation_reason_one() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsManagementSupervisionReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@Given("^I am Financial Grants Management Approver for Hold confirmation reason one$")
//	public void i_am_Financial_Grants_Management_Approver_for_Hold_confirmation_reason_one() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsFinancialManagementApproverUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am Grants Management Editor/Reviewer for Hold confirmation reason two$")
//	public void i_am_Grants_Management_Editor_Reviewer_for_Hold_confirmation_reason_two() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantManagementInitiatorEditorUser, super.getContextCommonUserPassword());
//	}
//
//	@When("^I select to remove a hold from a GAM currently on hold for Hold confirmation reason two$")
//	public void i_select_to_remove_a_hold_from_a_GAM_currently_on_hold_for_Hold_confirmation_reason_two() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I haven't entered a comment for Hold confirmation reason two$")
//	public void i_haven_t_entered_a_comment_for_Hold_confirmation_reason_two() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^I will get the error message as a popup that says: \"([^\"]*)\" for Hold confirmation reason two$")
//	public void i_will_get_the_error_message_as_a_popup_that_says_for_Hold_confirmation_reason_two(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the GAM will not proceed to Hold until a reason has been entered for Hold confirmation reason two$")
//	public void the_GAM_will_not_proceed_to_Hold_until_a_reason_has_been_entered_for_Hold_confirmation_reason_two() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the Hold Reason will be recorded in the Internal Comments area of the GAM record and will not be editable for Hold confirmation reason two$")
//	public void the_Hold_Reason_will_be_recorded_in_the_Internal_Comments_area_of_the_GAM_record_and_will_not_be_editable_for_Hold_confirmation_reason_two() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Given("^I am Grants Management First Supervisory Editor/Reviewer for Hold confirmation reason two$")
//	public void i_am_Grants_Management_First_Supervisory_Editor_Reviewer_for_Hold_confirmation_reason_two() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsManagementSupervisionReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@Given("^I am Grants Management Programmatic Approver for Hold confirmation reason two$")
//	public void i_am_Grants_Management_Programmatic_Approver_for_Hold_confirmation_reason_two() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsFinancialManagementApproverUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@Given("^I am Financial Grants Management Editor/Reviewer for Hold confirmation reason two$")
//	public void i_am_Financial_Grants_Management_Editor_Reviewer_for_Hold_confirmation_reason_two() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextFinancialGrantsManagementInitiatorEditorUser, super.getContextCommonUserPassword());
//	}
//
//	@Given("^I am Financial Grants Management Supervision Editor/Reviewer for Hold confirmation reason two$")
//	public void i_am_Financial_Grants_Management_Supervision_Editor_Reviewer_for_Hold_confirmation_reason_two() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsManagementSupervisionReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@Given("^I am Financial Grants Management Approver for Hold confirmation reason two$")
//	public void i_am_Financial_Grants_Management_Approver_for_Hold_confirmation_reason_two() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsFinancialManagementApproverUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am Grants Management Editor/Reviewer for Hold confirmation reason three$")
//	public void i_am_Grants_Management_Editor_Reviewer_for_Hold_confirmation_reason_three() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextFinancialGrantsManagementInitiatorEditorUser, super.getContextCommonUserPassword());
//	}
//
//	@When("^I select to remove a hold from a GAM currently on hold for Hold confirmation reason three$")
//	public void i_select_to_remove_a_hold_from_a_GAM_currently_on_hold_for_Hold_confirmation_reason_three() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I will get a blank text box to enter the reason to remove the GAM from on Hold for Hold confirmation reason three$")
//	public void i_will_get_a_blank_text_box_to_enter_the_reason_to_remove_the_GAM_from_on_Hold_for_Hold_confirmation_reason_three() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^the Hold Reason will be recorded in the Internal Comments area of the GAM record and will not be editable for Hold confirmation reason three$")
//	public void the_Hold_Reason_will_be_recorded_in_the_Internal_Comments_area_of_the_GAM_record_and_will_not_be_editable_for_Hold_confirmation_reason_three() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Given("^I am Grants Management First Supervisory Editor/Reviewer for Hold confirmation reason three$")
//	public void i_am_Grants_Management_First_Supervisory_Editor_Reviewer_for_Hold_confirmation_reason_three() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsManagementSupervisionReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@Given("^I am Grants Management Programmatic Approver for Hold confirmation reason three$")
//	public void i_am_Grants_Management_Programmatic_Approver_for_Hold_confirmation_reason_three() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsFinancialManagementApproverUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@Given("^I am Financial Grants Management Editor/Reviewer for Hold confirmation reason three$")
//	public void i_am_Financial_Grants_Management_Editor_Reviewer_for_Hold_confirmation_reason_three() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextFinancialGrantsManagementInitiatorEditorUser, super.getContextCommonUserPassword());
//	}
//
//	@Given("^I am Financial Grants Management Supervision Editor/Reviewer for Hold confirmation reason three$")
//	public void i_am_Financial_Grants_Management_Supervision_Editor_Reviewer_for_Hold_confirmation_reason_three() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsManagementSupervisionReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@Given("^I am Financial Grants Management Approver for Hold confirmation reason three$")
//	public void i_am_Financial_Grants_Management_Approver_for_Hold_confirmation_reason_three() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsFinancialManagementApproverUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	// ************************************** BEGINING OF SCENARIO ************************************************
//	@Given("^I am Grants Management Editor/Reviewer for Hold confirmation reason four$")
//	public void i_am_Grants_Management_Editor_Reviewer_for_Hold_confirmation_reason_four() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextFinancialGrantsManagementInitiatorEditorUser, super.getContextCommonUserPassword());
//	}
//
//	@When("^I select to place a GAM on hold for Hold confirmation reason four$")
//	public void i_select_to_place_a_GAM_on_hold_for_Hold_confirmation_reason_four() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@And("^I have entered a comment \"([^\"]*)\" for Hold confirmation reason four$")
//	public void i_have_entered_a_comment_for_Hold_confirmation_reason_four(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^the reason for the hold will be recorded in the Internal Comments area of the GAM record and will not be editable for Hold confirmation reason four$")
//	public void the_reason_for_the_hold_will_be_recorded_in_the_Internal_Comments_area_of_the_GAM_record_and_will_not_be_editable_for_Hold_confirmation_reason_four() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Given("^I am Grants Management First Supervisory Editor/Reviewer for Hold confirmation reason four$")
//	public void i_am_Grants_Management_First_Supervisory_Editor_Reviewer_for_Hold_confirmation_reason_four() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsManagementSupervisionReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@Given("^I am Grants Management Programmatic Approver for Hold confirmation reason four$")
//	public void i_am_Grants_Management_Programmatic_Approver_for_Hold_confirmation_reason_four() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsFinancialManagementApproverUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@Given("^I am Financial Grants Management Editor/Reviewer for Hold confirmation reason four$")
//	public void i_am_Financial_Grants_Management_Editor_Reviewer_for_Hold_confirmation_reason_four() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextFinancialGrantsManagementInitiatorEditorUser, super.getContextCommonUserPassword());
//	}
//
//	@Given("^I am Financial Grants Management Supervision Editor/Reviewer for Hold confirmation reason four$")
//	public void i_am_Financial_Grants_Management_Supervision_Editor_Reviewer_for_Hold_confirmation_reason_four() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsManagementSupervisionReviewerUser, super.getContextSUPERNOVAUserPassword());
//	}
//
//	@Given("^I am Financial Grants Management Approver for Hold confirmation reason four$")
//	public void i_am_Financial_Grants_Management_Approver_for_Hold_confirmation_reason_four() throws Throwable {
//		// Get the main JGITS URL
//	    webDriver.get(super.getContextRoot());
//	      
//	    // Enter your login details 	
//	    basicAPFinancialCommunication.login(contextGrantsFinancialManagementApproverUser, super.getContextSUPERNOVAUserPassword());
//	}

	

}
