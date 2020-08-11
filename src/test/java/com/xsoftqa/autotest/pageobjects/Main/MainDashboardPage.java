/**
 * 
 */
package com.xsoftqa.autotest.pageobjects.Main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.xsoftqa.autotest.pageobjects.PageObjectBase;

/**
 * @author Gadotey
 *
 */
public class MainDashboardPage extends PageObjectBase {

	public MainDashboardPage(WebDriver driver) {
		super(driver);
		// wait for the dialog to appear
		//waitNormal.until(ExpectedConditions.visibilityOfElementLocated(dialogBy));
	}


	//ADMIN
	//-----------

	private By calendarLeftNavMenuBy = By.ByXPath.xpath("//a[@id='cal0']");

	private By flowboardLeftNavMenuBy = By.ByXPath.xpath("//a[@id='pfb0']");

	private By recallboardLeftNavMenuBy = By.ByXPath.xpath("//a[@id='rcb0']");

	private By messagesLeftNavMenuBy = By.ByXPath.xpath("//a[@id='msg0']");

	private By patientclientLeftNavMenuBy = By.ByXPath.xpath("//span[contains(text(),'Patient')]");

	private By feesLeftNavMenuBy = By.ByXPath.xpath("//span[contains(text(),'Fees')]");

	private By modulesLeftNavMenuBy = By.ByXPath.xpath("//span[contains(text(),'Modules')]");

	private By proceduresLeftNavMenuBy = By.ByXPath.xpath("//a[@id='proimg']//span[contains(text(),'Procedures')]");

	private By administrationLeftNavMenuBy = By.ByXPath.xpath("//span[contains(text(),'Administration')]");

	private By reportsLeftNavMenuBy = By.ByXPath.xpath("//span[contains(text(),'Reports')]");

	private By miscellaneousLeftNavMenuBy = By.ByXPath.xpath("//span[contains(text(),'Miscellaneous')]");



	private By calendarMenuBy = By.ByXPath.xpath("//span[@class='tabTitle']");
	@FindBy(how = How.XPATH, using = "//span[@class='tabTitle']")
	private WebElement calendarMenuElement;

	private By usernameBy = By.ByXPath.xpath("//div[@class='menuSection userSection']//div[@id='username']");
	@FindBy (how = How.XPATH, using = "//div[@class='menuSection userSection']//div[@id='username']")
	private WebElement usernameElement;

	private By addStageBy = By.ByXPath.xpath("//div[contains(text(),'Calendar')]");
	private By dialogBy = By.ByXPath.xpath("//div[contains(text(),'Calendar')]");

	private By firstNameBy = By.ByXPath.xpath("//span[contains(text(),'Billy')]");
	@FindBy (how = How.XPATH, using = "//span[contains(text(),'Billy')]")
	private WebElement firstNameElement;

	private By lastNameBy = By.ByXPath.xpath("//span[contains(text(),'Smith')]");
	@FindBy (how = How.XPATH, using = "//span[contains(text(),'Smith')]")
	private WebElement lastNameElement;

	private By pageTitleBy = By.ByXPath.xpath("//div[contains(text(),'Patient:')]");
	@FindBy (how = How.XPATH, using = "//div[contains(text(),'Patient:')]")
	private WebElement pageTitleElement;

	private By calendarBy = By.ByXPath.xpath("//span[@id='menu_logo']//span[1]//div[1]");
	@FindBy (how = How.XPATH, using = "//span[@id='menu_logo']//span[1]//div[1]")
	private WebElement calendarElement;

	private By flowBoardBy = By.ByXPath.xpath("//span[2]//div[1]");
	@FindBy (how = How.XPATH, using = "//span[2]//div[1]" )
	private WebElement flowBoardElement;

	private By recallBoardBy = By.ByXPath.xpath("//div[contains(text(),'Recall Board')]");
	@FindBy (how = How.XPATH, using = "//div[contains(text(),'Recall Board')]" )
	private WebElement recallBoardElement;

	private By messagesBy = By.ByXPath.xpath("//div[contains(text(),'Messages')]");
	@FindBy (how = How.XPATH, using = "//div[contains(text(),'Messages')]" )
	private WebElement messagesElement;

	private By patientClientBy = By.ByXPath.xpath("//body/div[@id='mainBox']/div[@id='body_top_div']/div[@id='menu_items']/span[@id='menu_logo']/div/div[@class='appMenu']/span[5]/div[1]/div[1]");

	private By feesBy = By.ByXPath.xpath("//div[contains(text(),'Fees')]");

	private By modulesBy = By.ByXPath.xpath("//body/div[@id='mainBox']/div[@id='body_top_div']/div[@id='menu_items']/span[@id='menu_logo']/div/div[@class='appMenu']/span[7]/div[1]/div[1]");

	private By proceduresBy = By.ByXPath.xpath("//body/div[@id='mainBox']/div[@id='body_top_div']/div[@id='menu_items']/span[@id='menu_logo']/div/div[@class='appMenu']/span[8]/div[1]/div[1]");
	private By proceduresBy1 = By.ByXPath.xpath("//body/div[@id='mainBox']/div[@id='body_top_div']/div[@id='menu_items']/span[@id='menu_logo']/div/div[@class='appMenu']/span[7]/div[1]/div[1]");


	private By administrationBy = By.ByXPath.xpath("//div[contains(text(),'Administration')]");

	private By reportsBy = By.ByXPath.xpath("//div[contains(text(),'Reports')]");
	private By reportsBy1 = By.ByXPath.xpath("//div[contains(text(),'Reports')]");



	private By miscellaneousBy = By.ByXPath.xpath("//div[contains(text(),'Miscellaneous')]");

	private By popupsBy = By.ByXPath.xpath("//div[contains(text(),'Popups')]");

	private By aboutBy = By.ByXPath.xpath("//div[contains(text(),'About')]");


	public String getFirstName(){
		if (verifyElementDisplayed(firstNameBy)){
			//highLightElement(firstNameElement);
			//return actualText = readValueFromElement(firstNameElement);
			log.debug("The actual value of firstname is..: " + firstNameElement.getText());
			return actualText = firstNameElement.getText();
		}		
		return actualText;		
	}

	public String isElementDisplay(String menuItem){
		switch (menuItem){
		case "Calendar":
			if (verifyElementDisplayed(calendarBy)){
				System.out.println("This is the Calendar");
				WebElement calendarElement = webDriver.findElement(calendarBy);
				return actualText = calendarElement.getText();
			} 
			else if (verifyElementDisplayed(calendarLeftNavMenuBy)){
				WebElement calendarElement = webDriver.findElement(calendarLeftNavMenuBy);
				return actualText = calendarElement.getText();

			}
			break;
		case "Flow Board":
			if (verifyElementDisplayed(flowBoardBy)){
				System.out.println("This is the Flow Board");
				WebElement flowBoardElement = webDriver.findElement(flowBoardBy);
				return actualText = flowBoardElement.getText();
			}

			else if (verifyElementDisplayed(flowboardLeftNavMenuBy)){
				WebElement calendarElement = webDriver.findElement(flowboardLeftNavMenuBy);
				return actualText = calendarElement.getText();

			}

			break;
		case "Recall Board":
			if (verifyElementDisplayed(recallBoardBy)){
				WebElement recallBoardElement = webDriver.findElement(recallBoardBy);
				return actualText = recallBoardElement.getText();
				//menuItem//return true;
			}

			else if (verifyElementDisplayed(recallboardLeftNavMenuBy)){
				WebElement calendarElement = webDriver.findElement(recallboardLeftNavMenuBy);
				return actualText = calendarElement.getText();

			}
			break;
		case "Messages":
			if (verifyElementDisplayed(messagesBy)){
				WebElement messagesElement = webDriver.findElement(messagesBy);
				return actualText = messagesElement.getText();
				//return actualText = "Messages";

				//return true; 
			}

			else if (verifyElementDisplayed(messagesLeftNavMenuBy)){
				WebElement calendarElement = webDriver.findElement(messagesLeftNavMenuBy);
				return actualText = calendarElement.getText();

			}
			break;
		case "Patient/Client":
			if (verifyElementDisplayed(patientClientBy)){
				WebElement patientClientElement = webDriver.findElement(patientClientBy);
				return actualText = patientClientElement.getText();
				//return true;
			}

			else if (verifyElementDisplayed(patientclientLeftNavMenuBy)){
				WebElement calendarElement = webDriver.findElement(patientclientLeftNavMenuBy);
				return actualText = calendarElement.getText();

			}
			break;
		case "Fees":
			if (verifyElementDisplayed(feesBy)){
				WebElement feesElement = webDriver.findElement(feesBy);
				return actualText = feesElement.getText();
				//return true;
			}

			else if (verifyElementDisplayed(feesLeftNavMenuBy)){
				WebElement calendarElement = webDriver.findElement(feesLeftNavMenuBy);
				return actualText = calendarElement.getText();

			}
			break;
		case "Modules":
			if (verifyElementDisplayed(modulesBy)){
				WebElement modulesElement = webDriver.findElement(modulesBy);
				return actualText = modulesElement.getText();
				//return true;
			}

			else if (verifyElementDisplayed(modulesLeftNavMenuBy)){
				WebElement calendarElement = webDriver.findElement(modulesLeftNavMenuBy);
				return actualText = calendarElement.getText();

			}
			break;
		case "Procedures":
			if (verifyElementDisplayed(proceduresBy)){
				WebElement proceduresElement = webDriver.findElement(proceduresBy);
				return actualText = proceduresElement.getText();
				//return true;
			}

			else if (verifyElementDisplayed(proceduresLeftNavMenuBy)){
				WebElement calendarElement = webDriver.findElement(proceduresLeftNavMenuBy);
				return actualText = calendarElement.getText();

			}

			break;
		case "Procedures1":
			if (verifyElementDisplayed(proceduresBy1)){
				WebElement proceduresElement = webDriver.findElement(proceduresBy1);
				return actualText = proceduresElement.getText();
				//return true;
			}

			else if (verifyElementDisplayed(proceduresLeftNavMenuBy)){
				WebElement calendarElement = webDriver.findElement(proceduresLeftNavMenuBy);
				return actualText = calendarElement.getText();

			}


			break;


		case "Administration":
			if (verifyElementDisplayed(administrationBy)){
				WebElement administrationElement = webDriver.findElement(administrationBy);
				return actualText = administrationElement.getText();
				//return true;
			}

			else if (verifyElementDisplayed(administrationLeftNavMenuBy)){
				WebElement calendarElement = webDriver.findElement(administrationLeftNavMenuBy);
				return actualText = calendarElement.getText();

			}
			break;
		case "Reports":
			if (verifyElementDisplayed(reportsBy)){
				WebElement reportsElement = webDriver.findElement(reportsBy);
				return actualText = reportsElement.getText();
				//return true;
			}
			else if (verifyElementDisplayed(reportsLeftNavMenuBy)){
				WebElement calendarElement = webDriver.findElement(reportsLeftNavMenuBy);
				return actualText = calendarElement.getText();

			}

			break;
		case "Miscellaneous":
			if (verifyElementDisplayed(miscellaneousBy)){
				WebElement miscellaneousElement = webDriver.findElement(miscellaneousBy);
				return actualText = miscellaneousElement.getText();
				//return true;
			}

			else if (verifyElementDisplayed(miscellaneousLeftNavMenuBy)){
				WebElement calendarElement = webDriver.findElement(miscellaneousLeftNavMenuBy);
				return actualText = calendarElement.getText();

			}
			break;
		case "Popups":
			if (verifyElementDisplayed(popupsBy)){
				WebElement popupsElement = webDriver.findElement(popupsBy);
				return actualText = popupsElement.getText();
				//return true;
			}

			break;
		case "About":
			if (verifyElementDisplayed(aboutBy)){
				WebElement aboutElement = webDriver.findElement(aboutBy);
				return actualText = aboutElement.getText();
				//return true;
			}
			break;
		default:
			break;

		}		
		return actualText;		
	}



	/**
	 * @usage Assert.assertNotEquals("The Administration is not visible", adminMenu.get(i), mainDashboard.isElementDisplay1(adminMenu.get(i)));
	 * @param menuItem
	 * @return
	 */
	public String isElementDisplay1(String menuItem){
		switch (menuItem){
		case "Calendar":
			if (verifyElementDisplayed(calendarBy)){
				System.out.println("This is the Calendar");
				WebElement calendarElement = webDriver.findElement(calendarBy);
				return actualText = calendarElement.getText();
				//return actualText = "Calendar";
				//return true;
			} 
			break;
		case "Flow Board":
			if (verifyElementDisplayed(flowBoardBy)){
				System.out.println("This is the Flow Board");
				WebElement flowBoardElement = webDriver.findElement(flowBoardBy);
				return actualText = flowBoardElement.getText();
				//return actualText = "Flow Board";
				//return true;
			}
			break;
		case "Recall Board":
			if (verifyElementDisplayed(recallBoardBy)){
				WebElement recallBoardElement = webDriver.findElement(recallBoardBy);
				return actualText = recallBoardElement.getText();
				//menuItem//return true;
			}
			break;
		case "Messages":
			if (verifyElementDisplayed(messagesBy)){
				WebElement messagesElement = webDriver.findElement(messagesBy);
				return actualText = messagesElement.getText();
				//return actualText = "Messages";

				//return true; 
			}
			break;
		case "Patient/Client":
			if (verifyElementDisplayed(patientClientBy)){
				WebElement patientClientElement = webDriver.findElement(patientClientBy);
				return actualText = patientClientElement.getText();
				//return true;
			}
			break;
		case "Fees":
			if (verifyElementDisplayed(feesBy)){
				WebElement feesElement = webDriver.findElement(feesBy);
				return actualText = feesElement.getText();
				//return true;
			}
			break;
		case "Modules":
			if (verifyElementDisplayed(modulesBy)){
				WebElement modulesElement = webDriver.findElement(modulesBy);
				return actualText = modulesElement.getText();
				//return true;
			}
			break;
		case "Procedures":
			if (verifyElementDisplayed(proceduresBy1)){
				WebElement proceduresElement = webDriver.findElement(proceduresBy1);
				return actualText = proceduresElement.getText();
				//return true;
			}

			break;
		case "Reports":
			if (verifyElementDisplayed(reportsBy)){
				WebElement reportsElement = webDriver.findElement(reportsBy);
				return actualText = reportsElement.getText();
				//return true;
			}
			break;
		case "Miscellaneous":
			if (verifyElementDisplayed(miscellaneousBy)){
				WebElement miscellaneousElement = webDriver.findElement(miscellaneousBy);
				return actualText = miscellaneousElement.getText();
				//return true;
			}
			break;
		case "Popups":
			if (verifyElementDisplayed(popupsBy)){
				WebElement popupsElement = webDriver.findElement(popupsBy);
				return actualText = popupsElement.getText();
				//return true;
			}
			break;
		case "About":
			if (verifyElementDisplayed(aboutBy)){
				WebElement aboutElement = webDriver.findElement(aboutBy);
				return actualText = aboutElement.getText();
				//return true;
			}
			break;
		default:
			break;

		}		
		return actualText;		
	}














	public String getFlowBoard(String menuItem){
		if (verifyElementDisplayed(recallBoardBy)){
			return actualText = recallBoardElement.getText();
			//menuItem//return true;
		}
		return actualText;
	}

	public String getLastName(){
		if (verifyElementDisplayed(lastNameBy)){
			//highLightElement(lastNameElement);
			//return actualText = readValueFromElement(lastNameElement);
			WebElement lastNameElement = webDriver.findElement(lastNameBy);
			log.debug("The actual value of lastname is..: " + lastNameElement.getText());
			return actualText = lastNameElement.getText();
		}		
		return actualText;		
	}

	public boolean iscalendarMenuDisplay(){
		if (verifyElementDisplayed(calendarMenuBy)){
			//highLightElement(calendarMenuElement);
			return true;
		}
		return false;
	}

	public boolean isUsernameDisplay(){
		if (verifyElementDisplayed(usernameBy)){
			highLightElement(usernameElement);
			return true;
		}
		return false;
	}

	public void clickAddStage() {
		webDriver.findElement(addStageBy).click();
	}

	public String setVisibleAction(String actualActionMenu) {
		if (webDriver.findElement(calendarMenuBy).isDisplayed()){
			actualActionMenu = calendarMenuElement.getText();
		}
		return actualActionMenu;
	}

	public String setNotVisibleAction(String actualNotVisibleMenu) {
		if (webDriver.findElement(calendarMenuBy).isDisplayed()){
			actualNotVisibleMenu = calendarMenuElement.getText();
		}
		return actualNotVisibleMenu;
	}

	public void clickMenu() {
		webDriver.findElement(calendarMenuBy).click();
	}

	public String getTitle(){
		return webDriver.findElement(pageTitleBy).getText(); 		  
	}
}
