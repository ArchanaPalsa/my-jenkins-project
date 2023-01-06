package com.focus.Pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;
import com.sun.tools.xjc.Driver;

public class UserRestrictionsPage extends BaseEngine
{

	private static int cSize;

	public static boolean checkRestoreCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
	{
		BaseEngine.restoreCompany("UserRestrictions","UserRestrictions");
		
		Thread.sleep(5000);
		
		String actUserInfo1=userNameTxt.getText();

		System.out.println("User Info  : "+actUserInfo1);

		System.out.println("User Info Capture Text  :  "+userNameTxt.getText());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogoImg));
		companyLogoImg.click();

		String getCompanyTxt1=companyName.getText();
		String getLoginCompanyName1=getCompanyTxt1.substring(0, 17);
		System.out.println("company name  :  "+ getLoginCompanyName1);
		companyLogoImg.click();

		String expUserInfo1           ="SU";
		String expLoginCompanyName1   ="UserRestrictions";

		System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
		System.out.println("LoginCompanyName1     : "+getLoginCompanyName1    +" Value Expected : "+expLoginCompanyName1);

		if(actUserInfo1.equalsIgnoreCase(expUserInfo1) && getLoginCompanyName1.contains(expLoginCompanyName1))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	

	public static String checkValidationMessage(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	        try
	        {
	                getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
	                String actErrorMessage=errorMessage.getText();
	                String expErrorMessage=ExpMessage;

	                try
	                {
	                
		                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
		                errorMessageCloseBtn.click();
	                	
		                System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);
		                
		                return actErrorMessage;
	                }
	                catch(Exception ee)
	                {
	                	
	                	System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);
	                	
	                	return actErrorMessage;
	                }
	        }
	        catch(Exception e)
	        {
	                System.err.println("Error Message NOT Found or NOT Clickable");
	                System.err.println(e.getMessage());
	                
	                String Exception=e.getMessage();
	            
	                return Exception;
	        }
	}
	
	


	public static boolean checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		Thread.sleep(3000);

		getDriver().navigate().refresh();

		LoginPageOld lp=new LoginPageOld(getDriver()); 

		String unamelt="su";

		String pawslt="su";

		boolean qflag=true;

		lp.enterUserName(unamelt);

		lp.enterPassword(pawslt);

		Thread.sleep(2000);

		String compname = "UserRestrictions";

		Select oSelect = new Select(companyDropDownList);

		List<WebElement> elementCount = oSelect.getOptions();

		int cqSize = elementCount.size();

		System.out.println("CompanyDropdownList Count :" + cqSize);

		int i;

		for (i = 0; i < elementCount.size(); i++) {

			elementCount.get(i).getText();

			String optionName = elementCount.get(i).getText();
			if (optionName.toUpperCase().startsWith(compname.toUpperCase())) {
				System.out.println("q" + elementCount.get(i).getText());
				elementCount.get(i).click();
			}

		}

		Thread.sleep(2000);

		lp.clickOnSignInBtn();


		//Thread.sleep(60000);

		try 
		{
			if (reindexingPopup.isDisplayed()) 
			{
				System.out.println("Reindexing Log is Displaying in Restore Company");

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reindexingPopupCancelBtn));
				reindexingPopupCancelBtn.click();

				Thread.sleep(2000);

				lp.clickOnSignInBtn();
			}
			else
			{
				System.out.println("Reindexing Log is Not Displaying in Restore Company");
			}

			Thread.sleep(2000);

			String actUserInfo1=userNameDisplay.getText();

			System.out.println("User Info  : "+actUserInfo1);

			System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
			companyLogo.click();

			String getCompanyTxt1=companyName.getText();
			String getLoginCompanyName1=getCompanyTxt1.substring(0, 17);
			System.out.println("company name  :  "+ getLoginCompanyName1);
			companyLogo.click();

			String expUserInfo1           ="SU";
			String expLoginCompanyName1   ="UserRestrictions";

			System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
			System.out.println("LoginCompanyName1     : "+getLoginCompanyName1    +" Value Expected : "+expLoginCompanyName1);

			if(actUserInfo1.equalsIgnoreCase(expUserInfo1)/* && getLoginCompanyName1.contains(expLoginCompanyName1)*/)
			{
				qflag=true;
			}
			else
			{
				qflag=false;
			}
		} 
		catch (Exception e) 
		{
			System.err.println(e.getMessage());

			Thread.sleep(2000);

			String actUserInfo1=userNameDisplay.getText();

			System.out.println("User Info  : "+actUserInfo1);

			System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
			companyLogo.click();

			String getCompanyTxt1=companyName.getText();
			String getLoginCompanyName1=getCompanyTxt1.substring(0, 17);
			System.out.println("company name  :  "+ getLoginCompanyName1);
			companyLogo.click();

			String expUserInfo1           ="SU";
			String expLoginCompanyName1   ="UserRestrictions";

			System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
			System.out.println("LoginCompanyName1     : "+getLoginCompanyName1    +" Value Expected : "+expLoginCompanyName1);

			if(actUserInfo1.equalsIgnoreCase(expUserInfo1) && getLoginCompanyName1.contains(expLoginCompanyName1))
			{
				qflag=true;
			}
			else
			{
				qflag=false;
			}
		}
		return qflag;
	}

	@FindBy(xpath="//span[contains(text(),'Security')]")
	private static WebElement securitymenu ;

	@FindBy(xpath="//span[contains(text(),'Create Role')]")
	private static WebElement createRoleMenu;

	@FindBy(xpath="//input[@id='roleName']")
	private static WebElement createRoleRoleNameCombo; 

	@FindBy(xpath="//tbody[@id='roleName_table_body']/tr/td[2]")
	private static List<WebElement> createRoleRoleNameComboList;

	@FindBy(xpath="//select[@id='passwordPolicy']")
	private static WebElement  createRolePasswordPolicyDropdown; 

	@FindBy(xpath="//span[contains(text(),'Save')]")
	private static WebElement  createRoleSaveicon; 

	@FindBy(xpath="//i[@class='icon-delete icon-font6']")
	private static WebElement  createRoleDeleteIcon; 

	@FindBy(xpath="//i[@class='icon-close icon-font6']")
	private static WebElement  createRoleCloseIcon; 

	@FindBy(xpath="//span[2]//span[1]")
	private static WebElement  createRoleMOveFiledsFronLeftSideToRightSide; 

	@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div/div[1]/nav/div/div[2]/ul/li/span[2]")
	private static WebElement CreateRoleDeleteButtonImage; 

	@FindBy(xpath="//div[@id='RestrictionForEntryMasters']//ul[@id='RestrictionEntryMasters']//li")
	private static List<WebElement> restrictionsMastersList;

	@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']//td[2]")
	private static List<WebElement> restrictionsEntryTableList;

	@FindBy(xpath="//div[@id='RestrictionForEntryMasters']//*[text()='Branch']")
	private static WebElement  branchMaster; 

	@FindBy(xpath="//*[@id='restrictionEntryTable_col_1-1']")
	private static WebElement  tableRow1; 


	public static boolean checkValidateRestrictionsGivenInRERRoleInSu() throws InterruptedException
	{
		Thread.sleep(2500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securitymenu));
		securitymenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMenu));
		createRoleMenu.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.click();
		createRoleRoleNameCombo.sendKeys("RER");
		Thread.sleep(2000);
		createRoleRoleNameCombo.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRestrictionForEntryTab));
		createRoleRestrictionForEntryTab.click();

		Thread.sleep(2000);

		int count = restrictionsMastersList.size();
		System.err.println("count::::::::"+count);


		for (int i = 0; i <count; i++) 
		{
			String data = restrictionsMastersList.get(i).getText();

			if (data.equalsIgnoreCase("Account")) 
			{
				restrictionsMastersList.get(i).click();
				break;
			}
		}

		int count1 = restrictionsEntryTableList.size();
		System.err.println("count::::::::"+count);
		ArrayList<String> AccountNames = new ArrayList<String>();

		for (int i = 0; i <count1; i++) 
		{
			String data = restrictionsEntryTableList.get(i).getText().trim();
			if (data.isEmpty() == false) 
			{
				AccountNames.add(data);
			}

		}

		for (int i = 0; i <count; i++) 
		{
			String data = restrictionsMastersList.get(i).getText();
			if (data.equalsIgnoreCase("Item")) 
			{
				restrictionsMastersList.get(i).click();
				break;
			}

		}	

		ArrayList<String> ItemNames = new ArrayList<String>();

		for (int i = 0; i <count1; i++) 
		{
			String data = restrictionsEntryTableList.get(i).getText().trim();
			if (data.isEmpty() == false) 
			{
				ItemNames.add(data);
			}

		}

		for (int i = 0; i <count; i++) 
		{
			String data = restrictionsMastersList.get(i).getText();
			if (data.equalsIgnoreCase("Department")) 
			{
				restrictionsMastersList.get(i).click();
				break;
			}


		}	
		ArrayList<String> DeptNames = new ArrayList<String>();

		for (int i = 0; i <count1; i++) 
		{
			String data = restrictionsEntryTableList.get(i).getText().trim();
			if (data.isEmpty() == false) 
			{
				DeptNames.add(data);
			}

		}

		for (int i = 0; i <count; i++) 
		{
			String data = restrictionsMastersList.get(i).getText();

			if (data.equalsIgnoreCase("Warehouse")) 
			{
				restrictionsMastersList.get(i).click();
				break;
			}

		}	

		ArrayList<String> warehouseNames = new ArrayList<String>();

		for (int i = 0; i <count1; i++) 
		{
			String data = restrictionsEntryTableList.get(i).getText().trim();
			if (data.isEmpty() == false) 
			{
				warehouseNames.add(data);
			}

		}

		ArrayList<String> BranchNames = new ArrayList<String>();


		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);",branchMaster);

		if (branchMaster.isDisplayed()) 
		{
			branchMaster.click();

		}

		String InclusionBranch = tableRow1.getText();

		BranchNames.add(InclusionBranch);

		String actAccountsList = AccountNames.toString();
		String expAccountsList = "[Opening Balances Control A/C, A, D, E, H, SalesACC, CustomerACC, PurchaseACC, VendorACC, CashACC, BankACC]";

		String actItemList = ItemNames.toString();
		String expItemList = "[A, D, APPLE]";

		String actDeptNameList = DeptNames.toString();
		String expDeptNameList = "[A, D, INV]";

		String actWarehouseList = warehouseNames.toString();
		String expWarehouseList = "[A, D, HYD]";

		String actBranchList = BranchNames.toString();
		String expBranchList = "[BR-HYD]";

		System.out.println("actAccountsList: "+actAccountsList);
		System.out.println("expAccountsList: "+expAccountsList);

		System.out.println("actItemList: "+actItemList);
		System.out.println("expItemList: "+expItemList);

		System.out.println("actDeptNameList: "+actDeptNameList);
		System.out.println("expDeptNameList: "+expDeptNameList);

		System.out.println("actWarehouseList: "+actWarehouseList);
		System.out.println("expWarehouseList: "+expWarehouseList);

		System.out.println("actBranchList: "+actBranchList);
		System.out.println("expBranchList: "+expBranchList);

		if (actAccountsList.equalsIgnoreCase(expAccountsList) && actItemList.equalsIgnoreCase(expItemList)
				&& actDeptNameList.equalsIgnoreCase(expDeptNameList) && actWarehouseList.equalsIgnoreCase(expWarehouseList)
				&& actBranchList.equalsIgnoreCase(expBranchList))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}

	public static boolean checkLoginWithERR() throws InterruptedException
	{	
		Thread.sleep(2500);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(LogoutDropdown));
		LogoutDropdown.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		Thread.sleep(4000);
		
		
		LoginPageOld lp=new LoginPageOld(getDriver()); 

		String unamelt="RER";

		String pawslt="su";

		boolean qflag=true;

		lp.enterUserName(unamelt);

		lp.enterPassword(pawslt);

		Thread.sleep(2000);

		String compname = "UserRestrictions";

		Select oSelect = new Select(companyDropDownList);

		List<WebElement> elementCount = oSelect.getOptions();

		int cqSize = elementCount.size();

		System.out.println("CompanyDropdownList Count :" + cqSize);

		int i;

		for (i = 0; i < elementCount.size(); i++) {

			elementCount.get(i).getText();

			String optionName = elementCount.get(i).getText();
			if (optionName.toUpperCase().startsWith(compname.toUpperCase())) {
				System.out.println("q" + elementCount.get(i).getText());
				elementCount.get(i).click();
			}

		}

		Thread.sleep(2000);

		lp.clickOnSignInBtn();

		Thread.sleep(2000);

		String actUserInfo1=userNameDisplay.getText();

		System.out.println("User Info  : "+actUserInfo1);

		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		companyLogo.click();

		String getCompanyTxt1=companyName.getText();
		String getLoginCompanyName1=getCompanyTxt1.substring(0, 17);
		System.out.println("company name  :  "+ getLoginCompanyName1);
		companyLogo.click();

		String expUserInfo1           ="RER";
		String expLoginCompanyName1   ="UserRestrictions";

		System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
		System.out.println("LoginCompanyName1     : "+getLoginCompanyName1    +" Value Expected : "+expLoginCompanyName1);

		if(actUserInfo1.equalsIgnoreCase(expUserInfo1)/* && getLoginCompanyName1.contains(expLoginCompanyName1)*/)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean checkLoginWithRERInFA() throws InterruptedException
	{
		
		
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		
		Thread.sleep(4000);
		
		
		LoginPageOld lp=new LoginPageOld(getDriver()); 

		String unamelt="RER";

		String pawslt="su";

		boolean qflag=true;

		lp.enterUserName(unamelt);

		lp.enterPassword(pawslt);

		Thread.sleep(2000);

		String compname = "UserRestrictions";

		Select oSelect = new Select(companyDropDownList);

		List<WebElement> elementCount = oSelect.getOptions();

		int cqSize = elementCount.size();

		System.out.println("CompanyDropdownList Count :" + cqSize);

		int i;

		for (i = 0; i < elementCount.size(); i++) {

			elementCount.get(i).getText();

			String optionName = elementCount.get(i).getText();
			if (optionName.toUpperCase().startsWith(compname.toUpperCase())) {
				System.out.println("q" + elementCount.get(i).getText());
				elementCount.get(i).click();
			}

		}

		Thread.sleep(2000);

		lp.clickOnSignInBtn();

		Thread.sleep(2000);

		String actUserInfo1=userNameDisplay.getText();

		System.out.println("User Info  : "+actUserInfo1);

		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		companyLogo.click();

		String getCompanyTxt1=companyName.getText();
		String getLoginCompanyName1=getCompanyTxt1.substring(0, 17);
		System.out.println("company name  :  "+ getLoginCompanyName1);
		companyLogo.click();

		String expUserInfo1           ="RER";
		String expLoginCompanyName1   ="UserRestrictions";

		System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
		System.out.println("LoginCompanyName1     : "+getLoginCompanyName1    +" Value Expected : "+expLoginCompanyName1);

		if(actUserInfo1.equalsIgnoreCase(expUserInfo1)/* && getLoginCompanyName1.contains(expLoginCompanyName1)*/)
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
	

	@FindBy(xpath="//div[@id='divTreeMenu']//ul//a[1]")
	private static List<WebElement> treeAccountsList;

	public static boolean checkAccountMasterWhetherShowingOnlyRestrictedAccountsInList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
		mastersMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
		accounts.click();

		Thread.sleep(2000);


		int count = masterGridBodyName.size();

		ArrayList<String> AccountNames = new ArrayList<String>();

		for (int i = 1; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);
		}

		String actAccountList = AccountNames.toString();
		String expAccountList = "[BankACC, CashACC, CONTROL ACCOUNTS, CustomerACC, PurchaseACC, A, SalesACC, E, VendorACC]";

		System.out.println("actAccountList: "+actAccountList);
		System.out.println("expAccountList: "+expAccountList);



		int count2 = treeAccountsList.size();

		ArrayList<String> AccountNamesinTree = new ArrayList<String>();

		for (int i = 0; i < count2; i++) 
		{
			String data = treeAccountsList.get(i).getText();
			AccountNamesinTree.add(data);
		}

		String actAccountNamesinTree = AccountNamesinTree.toString();
		String expAccountNamesinTree = "[CONTROL ACCOUNTS, H, A, B, E, F, D]";

		System.out.println("actAccountNamesinTree: "+actAccountNamesinTree);
		System.out.println("expAccountNamesinTree: "+expAccountNamesinTree);

		if (actAccountList.equalsIgnoreCase(expAccountList) && actAccountNamesinTree.equalsIgnoreCase(expAccountNamesinTree)) 
		{
			return true;
		}
		else 
		{
			return false;
		}

	}

	@FindBy(xpath="//*[@id='ol_treeNavigation']/li[1]/span")
	private static WebElement accountNvgtn;

	public static boolean checkChildAccountsInsideTheGroupAccountsIndivdually() throws InterruptedException
	{
		int count = masterGridBodyName.size();

		Thread.sleep(2000);
		
		/*for (int i = 0; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			if (data.equalsIgnoreCase("CONTROL ACCOUNTS"))
			{
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
				break;
			}

		}

		Thread.sleep(2000);
		int count2 = masterGridBodyName.size();
		ArrayList<String> AccountNames = new ArrayList<String>();

		for (int i = 0; i < count2; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);
		}

		String actAccountList = AccountNames.toString();
		String expAccountList = "[Opening Balances Control A/C]";

		System.out.println("actAccountList:"+actAccountList);
		System.out.println("expAccountList:"+expAccountList);

		Thread.sleep(2000);
		accountNvgtn.click();
		Thread.sleep(2000);
*/
		for (int i = 0; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			if (data.equalsIgnoreCase("A"))
			{
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
				break;
			}
		}
		Thread.sleep(2000);
		int count3 = masterGridBodyName.size();
		ArrayList<String> childAccountsInA = new ArrayList<String>();

		for (int i = 0; i < count3; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			childAccountsInA.add(data);
		}
		Thread.sleep(2000);

		String actchildAccountsInA = childAccountsInA.toString();
		String expchildAccountsInA = "[A1, A2, B]";

		System.out.println("actchildAccountsInA:"+actchildAccountsInA);
		System.out.println("expchildAccountsInA:"+expchildAccountsInA);
		Thread.sleep(2000);

		for (int i = 0; i < count3; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			if (data.equalsIgnoreCase("B"))
			{
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
				break;
			}
		}
		Thread.sleep(2000);

		int count4 = masterGridBodyName.size();
		ArrayList<String> childAccountsInB = new ArrayList<String>();

		for (int i = 0; i < count4; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			childAccountsInB.add(data);
		}

		String actchildAccountsInB = childAccountsInB.toString();
		String expchildAccountsInB = "[B1, B2]";

		System.out.println("actchildAccountsInB:"+actchildAccountsInB);
		System.out.println("expchildAccountsInB:"+expchildAccountsInB);

		Thread.sleep(2000);
		accountNvgtn.click();
		Thread.sleep(2000);

		for (int i = 0; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			if (data.equalsIgnoreCase("E"))
			{
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
				break;
			}
		}

		Thread.sleep(2000);
		int count5 = masterGridBodyName.size();
		ArrayList<String> childAccountsInE = new ArrayList<String>();

		for (int i = 0; i < count5; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			childAccountsInE.add(data);
		}

		String actchildAccountsInE = childAccountsInE.toString();
		String expchildAccountsInE = "[E1, E2, F]";

		System.out.println("actchildAccountsInE:"+actchildAccountsInE);
		System.out.println("expchildAccountsInE:"+expchildAccountsInE);

		Thread.sleep(2000);

		for (int i = 0; i < count5; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			if (data.equalsIgnoreCase("F"))
			{
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
				break;
			}
		}

		Thread.sleep(2000);

		int count6 = masterGridBodyName.size();
		ArrayList<String> childAccountsInF= new ArrayList<String>();

		for (int i = 0; i < count6; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			childAccountsInF.add(data);
		}

		String actchildAccountsInF = childAccountsInF.toString();
		String expchildAccountsInF = "[F1, F2]";

		System.out.println("actchildAccountsInF:"+actchildAccountsInF);
		System.out.println("expchildAccountsInF:"+expchildAccountsInF);
		Thread.sleep(2000);
		accountNvgtn.click();


		if (/*actAccountList.equalsIgnoreCase(expAccountList) && */actchildAccountsInA.equalsIgnoreCase(expchildAccountsInA)&& 
				actchildAccountsInB.equalsIgnoreCase(expchildAccountsInB) && actchildAccountsInE.equalsIgnoreCase(expchildAccountsInE) &&
				actchildAccountsInF.equalsIgnoreCase(expchildAccountsInF))
		{
			return true;
		} 
		else 
		{
			return false;
		}


	}

	@FindBy(xpath="//input[@id='cmbUserTypeMaster']")
	private static WebElement searchAccount;

	@FindBy(xpath="//tbody[@ID='cmbUserTypeMaster_table_body']//tr//td[2]")
	private static List<WebElement> searchAccountList;

	public static boolean checkSearchAccountsWhetherNonRestrictedAccountsAreDisplaying() throws InterruptedException
	{
		Thread.sleep(3000);
		searchAccount.click();
		Thread.sleep(2000);
		searchAccount.sendKeys(Keys.SPACE);
		Thread.sleep(2000);

		int count = searchAccountList.size();
		ArrayList<String> accountList = new ArrayList<String>();

		for (int i = 0; i < count; i++) 
		{
			String data = searchAccountList.get(i).getText();
			accountList.add(data);
		}

		String actaccountList = accountList.toString();
		String expaccountList = "[A, A1, A2, B, B1, B2, BankACC, CashACC, CustomerACC, D, D1, D2, E, E1, E2, F, F1, F2, H, H1, H2, Opening Balances Control A/C, PurchaseACC, SalesACC, VendorACC]";

		System.out.println("actaccountList:  "+actaccountList);
		System.out.println("expaccountList:  "+expaccountList);

		searchAccount.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		searchAccount.sendKeys("Vendor");
		Thread.sleep(1500);
		searchAccount.sendKeys(Keys.ENTER);

		int count2 = searchAccountList.size();
		ArrayList<String> accountList2 = new ArrayList<String>();

		for (int i = 0; i < count2; i++) 
		{
			String data = searchAccountList.get(i).getText();
			accountList2.add(data);
			break;
		}

		String actvendorAccount = accountList2.toString();
		String expvendorAccount = "[VendorACC]";


		System.out.println("actvendorAccount:  "+actvendorAccount);
		System.out.println("expvendorAccount:  "+expvendorAccount);
		Thread.sleep(4000);
		searchAccount.click();
		searchAccount.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		searchAccount.sendKeys("Purchase");
		Thread.sleep(1500);
		searchAccount.sendKeys(Keys.ENTER);

		int count3 = searchAccountList.size();
		ArrayList<String> accountList3 = new ArrayList<String>();

		for (int i = 0; i < count3; i++) 
		{
			String data = searchAccountList.get(i).getText();
			accountList3.add(data);
			break;
		}

		String actPurchaseAccount = accountList3.toString();
		String expPurchaseAccount = "[PurchaseACC]";

		System.out.println("actPurchaseAccount:  "+actPurchaseAccount);
		System.out.println("expPurchaseAccount:  "+expPurchaseAccount);

		if (actaccountList.equalsIgnoreCase(expaccountList) && actvendorAccount.equalsIgnoreCase(expvendorAccount) && actPurchaseAccount.equalsIgnoreCase(expPurchaseAccount)) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	public static boolean checkItemMasterWhetherShowingOnlyRestrictedItemsInList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
		homeMasterItemMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
		homeMasterItem_ItemMenu.click();

		Thread.sleep(3000);
		int itemCount= itemNameList.size();


		ArrayList<String> itemList = new ArrayList<String>();

		for (int i = 0; i < itemCount; i++)
		{
			String data = itemNameList.get(i).getText();
			itemList.add(data);
		}


		String actItemList = itemList.toString();
		String expItemList = "[APPLE, A]";

		System.out.println("actItemList:"+actItemList);
		System.out.println("expItemList:"+expItemList);

		Thread.sleep(2000);

		int count2 = treeAccountsList.size();

		ArrayList<String> ItemNamesinTree = new ArrayList<String>();

		for (int i = 1; i < count2; i++) 
		{
			String data = treeAccountsList.get(i).getText();
			ItemNamesinTree.add(data);
		}

		String actItemNamesinTree = ItemNamesinTree.toString();
		String expItemNamesinTree = "[A, B, C, D]";

		System.out.println("actItemNamesinTree: "+actItemNamesinTree);
		System.out.println("expItemNamesinTree: "+expItemNamesinTree);


		for (int i = 0; i < itemCount; i++) 
		{
			String data = itemNameList.get(i).getText();
			if (data.equalsIgnoreCase("A"))
			{
				getAction().doubleClick(itemNameList.get(i)).build().perform();
				break;
			}
		}


		Thread.sleep(2000);
		int itemCount2 = itemNameList.size();
		ArrayList<String> AccountListInA = new ArrayList<String>();

		for (int i = 0; i < itemCount2; i++) 
		{
			String data = itemNameList.get(i).getText();
			AccountListInA.add(data);
		}

		String actItemListInA = AccountListInA.toString();
		String expItemListInA = "[A1, A2, B]";

		System.out.println("actItemListInA:"+actItemListInA);
		System.out.println("expItemListInA:"+expItemListInA);

		Thread.sleep(2000);

		for (int i = 0; i < itemCount2; i++) 
		{
			String data = itemNameList.get(i).getText();
			if (data.equalsIgnoreCase("B"))
			{
				getAction().doubleClick(itemNameList.get(i)).build().perform();
				break;
			}
		}


		Thread.sleep(2000);
		int itemCount3 = itemNameList.size();
		ArrayList<String> AccountListInB = new ArrayList<String>();

		for (int i = 0; i < itemCount3; i++) 
		{
			String data = itemNameList.get(i).getText();
			AccountListInB.add(data);
		}

		String actItemListInB = AccountListInB.toString();
		String expItemListInB = "[B1, B2]";

		System.out.println("actItemListInB:"+actItemListInB);
		System.out.println("expItemListInB:"+expItemListInB);

		Thread.sleep(2000);


		if (actItemList.equalsIgnoreCase(expItemList) && actItemNamesinTree.equalsIgnoreCase(expItemNamesinTree)&& 
				actItemListInA.equalsIgnoreCase(expItemListInA) &&
				actItemListInB.equalsIgnoreCase(expItemListInB))
		{
			return true;

		}
		else
		{
			return false;
		}


	}

	public static boolean checkSearchItemsWhetherNonRestrictedItemsAreDisplaying() throws InterruptedException
	{
		searchAccount.click();
		Thread.sleep(2000);
		searchAccount.sendKeys(Keys.SPACE);
		Thread.sleep(2000);

		int count = searchAccountList.size();
		ArrayList<String> itemsList = new ArrayList<String>();

		for (int i = 0; i < count; i++) 
		{
			String data = searchAccountList.get(i).getText();
			itemsList.add(data);
		}

		String actitemsList = itemsList.toString();
		String expitemsList = "[A, A1, A2, APPLE, B, B1, B2, D, D1, D2]";

		System.out.println("actitemsList:  "+actitemsList);
		System.out.println("expitemsList:  "+expitemsList);

		searchAccount.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		searchAccount.sendKeys("Ball");
		Thread.sleep(1500);
		searchAccount.sendKeys(Keys.ENTER);

		int count2 = searchAccountList.size();
		ArrayList<String> ItemList2 = new ArrayList<String>();

		for (int i = 0; i < count2; i++) 
		{
			String data = searchAccountList.get(i).getText();
			ItemList2.add(data);
			break;
		}

		String actItemListsWithB = ItemList2.toString();
		String expItemListsWithB = "[]";


		System.out.println("actItemListsWithB:  "+actItemListsWithB);
		System.out.println("expItemListsWithB:  "+expItemListsWithB);

		if (actitemsList.equalsIgnoreCase(expitemsList) && actItemListsWithB.equalsIgnoreCase(expItemListsWithB)) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static boolean checkDepartmentMasterWhetherShowingOnlyRestrictedDepartmentInList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));

		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));

		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentMenu));

		departmentMenu.click();


		Thread.sleep(3000);

		int deptCount= departmentNameList.size();
		boolean dept=false;

		ArrayList<String> deptList = new ArrayList<String>();

		for (int i = 0; i < deptCount; i++)
		{
			String data = departmentNameList.get(i).getText();
			deptList.add(data);
		}

		String actDeptList = deptList.toString();
		String expDeptList = "[INV, A]";

		System.out.println("actDeptList"+actDeptList);
		System.out.println("expDeptList"+expDeptList);

		Thread.sleep(2000);

		int count2 = treeAccountsList.size();

		ArrayList<String> DeptNamesinTree = new ArrayList<String>();

		for (int i = 0; i < count2; i++) 
		{
			String data = treeAccountsList.get(i).getText();
			DeptNamesinTree.add(data);
		}

		String actDeptNamesinTree = DeptNamesinTree.toString();
		String expDeptNamesinTree = "[D, A, B]";

		System.out.println("actDeptNamesinTree: "+actDeptNamesinTree);
		System.out.println("expDeptNamesinTree: "+expDeptNamesinTree);


		for (int i = 0; i < deptCount; i++) 
		{
			String data = departmentNameList.get(i).getText();
			if (data.equalsIgnoreCase("A"))
			{
				getAction().doubleClick(departmentNameList.get(i)).build().perform();
				break;
			}
		}


		Thread.sleep(2000);
		int deptCount2 = departmentNameList.size();
		ArrayList<String> DeptListInA = new ArrayList<String>();

		for (int i = 0; i < deptCount2; i++) 
		{
			String data = departmentNameList.get(i).getText();
			DeptListInA.add(data);
		}

		String actDeptListInA = DeptListInA.toString();
		String expIDeptListInA = "[A1, A2, B]";

		System.out.println("actDeptListInA:"+actDeptListInA);
		System.out.println("expIDeptListInA:"+expIDeptListInA);

		Thread.sleep(2000);

		for (int i = 0; i < deptCount2; i++) 
		{
			String data = departmentNameList.get(i).getText();
			if (data.equalsIgnoreCase("B"))
			{
				getAction().doubleClick(departmentNameList.get(i)).build().perform();
				break;
			}
		}

		Thread.sleep(2000);
		int deptCount3 = departmentNameList.size();
		ArrayList<String> DeptListInB = new ArrayList<String>();

		for (int i = 0; i < deptCount3; i++) 
		{
			String data = departmentNameList.get(i).getText();
			DeptListInB.add(data);
		}

		String actDeptListInB = DeptListInB.toString();
		String expDeptListInB = "[B1, B2]";

		System.out.println("actItemListInB:"+actDeptListInB);
		System.out.println("expItemListInB:"+expDeptListInB);

		Thread.sleep(2000);

		if (actDeptList.equalsIgnoreCase(expDeptList) && actDeptListInA.equalsIgnoreCase(expIDeptListInA) 
				&& actDeptListInB.equalsIgnoreCase(expDeptListInB))
		{
			return true;
		} 
		else
		{
			return false;
		}

	}

	public static boolean checkSearchDepartmentWhetherNonRestrictedDepartmentsAreDisplaying() throws InterruptedException
	{
		searchAccount.click();
		Thread.sleep(2000);
		searchAccount.sendKeys(Keys.SPACE);
		Thread.sleep(2000);

		int count = searchAccountList.size();
		ArrayList<String> deptList = new ArrayList<String>();

		for (int i = 0; i < count; i++) 
		{
			String data = searchAccountList.get(i).getText();
			deptList.add(data);
		}

		String actdeptList = deptList.toString();
		String expdeptList = "[A, A1, A2, B, B1, B2, D, D1, D2, INV]";

		System.out.println("actdeptList:  "+actdeptList);
		System.out.println("expdeptList:  "+expdeptList);

		searchAccount.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		searchAccount.sendKeys("FIN");
		Thread.sleep(1500);
		searchAccount.sendKeys(Keys.ENTER);

		int count2 = searchAccountList.size();
		ArrayList<String> deptList2 = new ArrayList<String>();

		for (int i = 0; i < count2; i++) 
		{
			String data = searchAccountList.get(i).getText();
			deptList2.add(data);
			break;
		}

		String actdeptList2 = deptList2.toString();
		String expdeptList2 = "[]";


		System.out.println("actdeptList2:  "+actdeptList2);
		System.out.println("expdeptList2:  "+expdeptList2);

		if (actdeptList.equalsIgnoreCase(expdeptList) && actdeptList2.equalsIgnoreCase(expdeptList2)) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static boolean checkWarehouseMasterWhetherShowingOnlyRestrictedWarehouseInList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));

		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));

		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseMenu));

		warehouseMenu.click();

		Thread.sleep(3000);

		int warehouseCount = warehouseNameList.size();
		boolean warehouse=false;

		ArrayList<String> warehouseList = new ArrayList<String>();

		for (int i = 0; i < warehouseCount; i++)
		{
			String data = warehouseNameList.get(i).getText();
			warehouseList.add(data);
		}

		String actWarehouseList = warehouseList.toString();
		String expWarehouseList = "[HYD, A]";

		System.out.println("actWarehouseList:"+actWarehouseList);
		System.out.println("expWarehouseList:"+expWarehouseList);

		Thread.sleep(2000);

		int count2 = treeAccountsList.size();

		ArrayList<String> WarehouseNamesinTree = new ArrayList<String>();

		for (int i = 1; i < count2; i++) 
		{
			String data = treeAccountsList.get(i).getText();
			WarehouseNamesinTree.add(data);
		}

		String actWarehouseNamesinTree = WarehouseNamesinTree.toString();
		String expWarehouseNamesinTree = "[C, D, A, B]";

		System.out.println("actWarehouseNamesinTree: "+actWarehouseNamesinTree);
		System.out.println("expWarehouseNamesinTree: "+expWarehouseNamesinTree);


		for (int i = 0; i < warehouseCount; i++) 
		{
			String data = warehouseNameList.get(i).getText();
			if (data.equalsIgnoreCase("A"))
			{
				getAction().doubleClick(warehouseNameList.get(i)).build().perform();
				break;
			}
		}

		Thread.sleep(2000);
		int warehouseCount2 = warehouseNameList.size();
		ArrayList<String> WarehouseListInA = new ArrayList<String>();

		for (int i = 0; i < warehouseCount2; i++) 
		{
			String data = warehouseNameList.get(i).getText();
			WarehouseListInA.add(data);
		}

		String actWarehouseListInA = WarehouseListInA.toString();
		String expWarehouseListInA = "[B, A2, A1]";

		System.out.println("actWarehouseListInA:"+actWarehouseListInA);
		System.out.println("expWarehouseListInA:"+expWarehouseListInA);

		Thread.sleep(2000);

		for (int i = 0; i < warehouseCount2; i++) 
		{
			String data = warehouseNameList.get(i).getText();
			if (data.equalsIgnoreCase("B"))
			{
				getAction().doubleClick(warehouseNameList.get(i)).build().perform();
				break;
			}
		}

		Thread.sleep(2000);
		int warehouseCount3 = warehouseNameList.size();
		ArrayList<String> WarehouseListInB = new ArrayList<String>();

		for (int i = 0; i < warehouseCount3; i++) 
		{
			String data = warehouseNameList.get(i).getText();
			WarehouseListInB.add(data);
		}

		String actWarehouseListInB = WarehouseListInB.toString();
		String exWarehouseListInB  = "[B2, B1]";

		System.out.println("actWarehouseListInB:"+actWarehouseListInB);
		System.out.println("exWarehouseListInB:"+exWarehouseListInB);

		Thread.sleep(2000);

		if (actWarehouseList.equalsIgnoreCase(expWarehouseList)&& actWarehouseNamesinTree.equalsIgnoreCase(expWarehouseNamesinTree) && actWarehouseListInA.equalsIgnoreCase(expWarehouseListInA) 
				&& actWarehouseListInB.equalsIgnoreCase(exWarehouseListInB))
		{
			return true;
		} 
		else
		{
			return false;
		}

	}

	public static boolean checkSearchWarehouseWhetherNonRestrictedWarehousesAreDisplaying() throws InterruptedException
	{
		searchAccount.click();
		Thread.sleep(2000);
		searchAccount.sendKeys(Keys.SPACE);
		Thread.sleep(2000);

		int count = searchAccountList.size();
		ArrayList<String> WarehouseList = new ArrayList<String>();

		for (int i = 0; i < count; i++) 
		{
			String data = searchAccountList.get(i).getText();
			WarehouseList.add(data);
		}

		String actWarehouseList = WarehouseList.toString();
		String expWarehouseList = "[A, A1, A2, B, B1, B2, D, D1, D2, HYD]";

		System.out.println("actWarehouseList:  "+actWarehouseList);
		System.out.println("expWarehouseList:  "+expWarehouseList);

		searchAccount.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		searchAccount.sendKeys("SEC");
		Thread.sleep(1500);
		searchAccount.sendKeys(Keys.ENTER);

		int count2 = searchAccountList.size();
		ArrayList<String> WarehouseList2 = new ArrayList<String>();

		for (int i = 0; i < count2; i++) 
		{
			String data = searchAccountList.get(i).getText();
			WarehouseList2.add(data);
			break;
		}

		String actWarehouseList2 = WarehouseList2.toString();
		String expWarehouseList2 = "[]";


		System.out.println("actWarehouseList2:  "+actWarehouseList2);
		System.out.println("expWarehouseList2:  "+expWarehouseList2);

		if (actWarehouseList.equalsIgnoreCase(expWarehouseList) && actWarehouseList2.equalsIgnoreCase(expWarehouseList2)) 
		{
			return true;
		}
		else
		{
			return false;
		}

	}

	@FindBy(xpath="//*[@id='1179']")
	private static WebElement branchMasterMenu;
	public static boolean checkBranchMasterWhetherShowingOnlyRestrictedBranchInList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));

		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));

		mastersMenu.click();
		
		Thread.sleep(2000);
		scrollToElementJSE(branchMasterMenu);
		Thread.sleep(2500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(branchMasterMenu));

		branchMasterMenu.click();

		Thread.sleep(3000);

		int branchCount = branchNameList.size();
		boolean warehouse=false;

		ArrayList<String> branchList = new ArrayList<String>();

		for (int i = 0; i < branchCount; i++)
		{
			String data = branchNameList.get(i).getText();
			branchList.add(data);
		}

		String actbranchList = branchList.toString();
		String expbranchList = "[BR-HYD]";

		System.out.println("actbranchList:"+actbranchList);
		System.out.println("expbranchList:"+expbranchList);

		Thread.sleep(2000);

		if (actbranchList.equalsIgnoreCase(expbranchList))
		{
			return true;
		} 
		else 
		{
			return false;
		}

	}

	@FindBy(xpath="//tbody[@id='id_header_3_table_body']//tr/td[2]")
	private static List<WebElement> purchaseAccountList;

	@FindBy(xpath="//tbody[@id='id_header_4_table_body']//tr//td[2]")
	private static List<WebElement> vendorAccountList;

	@FindBy(xpath="//tbody[@id='id_header_268435460_table_body']//tr//td[2]")
	private static List<WebElement> warehouseList;

	@FindBy(xpath="//tbody[@id='id_header_268435459_table_body']//tr//td[2]")
	private static List<WebElement> departmentList;

	@FindBy(xpath="//tbody[@id='id_header_268438457_table_body']//tr/td[2]")
	private static List<WebElement> branchListInPurchases;

	@FindBy(xpath="//tbody[@id='id_body_23_table_body']//tr//td[2]")
	private static List<WebElement> itemList;
	@FindBy(xpath="//*[@id='2007']/span")
  	private static WebElement  financialsTransactionsPurchaseMenu; 

	@FindBy(xpath="//*[@id='2008']/span")
	private static WebElement  purchaseVoucher;
	
	@FindBy(xpath="//input[@id='id_header_3']")
	private static WebElement  purchaseAccountTxt;
	
	@FindBy(xpath="//input[@id='id_header_4']")
	private static WebElement  vendorAccountTxt;
	
	@FindBy(xpath="//input[@id='id_header_3']")
	private static WebElement SalesAccountTxt;
	
	@FindBy(xpath="//input[@id='id_header_4']")
	private static WebElement  CustomerAccountTxt;
	
	
	@FindBy(xpath="//input[@id='id_header_4']")
	private static WebElement  CBAccountTxt;
	
	@FindBy(xpath="//*[@id='id_header_268435460']")
	private static WebElement  warehouseTxt;
	
	@FindBy(xpath="//*[@id='id_header_268435459']")
	private static WebElement departmentTxt;
	
	@FindBy(xpath="//*[@id='id_header_268438457']")
	private static WebElement branchTxt;
	
	@FindBy(xpath="//input[@id='id_body_23']")
	private static WebElement  enter_ItemTxt;
	
	@FindBy(xpath="//input[@id='id_body_12']")
	private static WebElement  enter_AccountTxt;
	
	
	
	@FindBy(xpath="//tbody[@id='tblBodyTransRender']//tr//td[8]")
	private static List<WebElement> voucherItemsNames;
	
	@FindBy(xpath="//tbody[@id='tblBodyTransRender']//tr//td[9]")
	private static List<WebElement> voucherWarehouseNames;
	
	@FindBy(xpath="//tbody[@id='tblBodyTransRender']//tr//td[10]")
	private static List<WebElement> voucherDepartmentNames;
	
	@FindBy(xpath="//tbody[@id='tblBodyTransRender']//tr//td[11]")
	private static List<WebElement> voucherBranchNames;
	
	@FindBy(xpath="//tbody[@id='tblBodyTransRender']//tr//td[6]")
	private static List<WebElement> voucherPurchaseNames;
	
	@FindBy(xpath="//tbody[@id='tblBodyTransRender']//tr//td[7]")
	private static List<WebElement> voucherVendorNames;
	
	public static boolean checkPurchaseVoucherHomePageMastersList() throws InterruptedException
	{
		Thread.sleep(5000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucher));
		purchaseVoucher.click();
		Thread.sleep(2500);

		ArrayList<String>  ItemList = new ArrayList<String>(); 

		int count=voucherItemsNames.size();

		System.err.println(count);

		for(int i=0 ; i < count ;i++)
		{
			String data=voucherItemsNames.get(i).getText();
			ItemList.add(data);

		}

		String actItemList = ItemList.toString();
		String expItemList = "[D2, A1, A1, APPLE, A1, D1, A2, D2, B2, B1, ]";

		System.out.println("actItemList"+actItemList);
		System.out.println("expItemList"+expItemList);


		ArrayList<String>  WarehouseList = new ArrayList<String>(); 

		int Wcount=voucherWarehouseNames.size();

		System.err.println(Wcount);

		for(int i=0 ; i < Wcount ;i++)
		{
			String data=voucherWarehouseNames.get(i).getText();
			WarehouseList.add(data);

		}

		String actWarehouseList = WarehouseList.toString();
		String expWarehouseList = "[D2, A1, A1, A1, A1, A1, A1, A1, A1, A1, ]";

		System.out.println("actWarehouseList"+actWarehouseList);
		System.out.println("expWarehouseList"+expWarehouseList);


		ArrayList<String>  DepartmentList = new ArrayList<String>(); 

		int Dcount=voucherDepartmentNames.size();

		System.err.println(Dcount);

		for(int i=0 ; i < Dcount ;i++)
		{
			String data=voucherDepartmentNames.get(i).getText();
			DepartmentList.add(data);

		}

		String actDepartmentList = DepartmentList.toString();
		String expDepartmentList = "[D2, A1, A1, A1, A1, A1, A1, A1, A1, A1, ]";

		System.out.println("actDepartmentList"+actDepartmentList);
		System.out.println("expDepartmentList"+expDepartmentList);


		ArrayList<String>  BranchList = new ArrayList<String>(); 

		int Bcount=voucherBranchNames.size();

		System.err.println(Bcount);

		for(int i=0 ; i < Bcount ;i++)
		{
			String data=voucherBranchNames.get(i).getText();
			BranchList.add(data);

		}

		String actBranchList = BranchList.toString();
		String expBranchList = "[BR-HYD, BR-HYD, BR-HYD, BR-HYD, BR-HYD, BR-HYD, BR-HYD, BR-HYD, BR-HYD, BR-HYD, ]";

		System.out.println("actBranchList"+actBranchList);
		System.out.println("expBranchList"+expBranchList);

		ArrayList<String>  PurchaseAccList = new ArrayList<String>(); 

		int Pcount=voucherPurchaseNames.size();

		System.err.println(Pcount);

		for(int i=0 ; i < Pcount ;i++)
		{
			String data=voucherPurchaseNames.get(i).getText();
			PurchaseAccList.add(data);

		}

		String actPurchaseAccList = PurchaseAccList.toString();
		String expPurchaseAccList = "[B2, A1, Purchase, A1, A1, A1, A1, A1, A1, A1, ]";

		System.out.println("actPurchaseAccList"+actPurchaseAccList);
		System.out.println("expPurchaseAccList"+expPurchaseAccList);


		ArrayList<String>  VendorAccList = new ArrayList<String>(); 

		int Vcount=voucherVendorNames.size();

		System.err.println(Vcount);

		for(int i=0 ; i < Vcount ;i++)
		{
			String data=voucherVendorNames.get(i).getText();
			VendorAccList.add(data);

		}

		String actVendorAccList = VendorAccList.toString();
		String expVendorAccList = "[D2, BankACC, VendorACC, D1, D1, D1, D1, D1, D1, D1, ]";

		System.out.println("actVendorAccList"+actVendorAccList);
		System.out.println("expVendorAccList"+expVendorAccList);

		if (actItemList.equalsIgnoreCase(expItemList) && actWarehouseList.equalsIgnoreCase(expWarehouseList)
				&& actDepartmentList.equalsIgnoreCase(expDepartmentList) && actBranchList.equalsIgnoreCase(expBranchList)
				&& actPurchaseAccList.equalsIgnoreCase(expPurchaseAccList) && actVendorAccList.equalsIgnoreCase(expVendorAccList))
		{
			return true;
		}  
		else    
		{
			return false;
		}



	}
	
	
	public static boolean checkPurchasesVoucherForAllTheMastersListInMastersDropdown() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(5000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucher));
		purchaseVoucher.click();
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		checkValidationMessage("Screen opened");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();

		purchaseAccountTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(2000);

		ArrayList<String>  actPurchaseAccountList = new ArrayList<String>(); 

		int count=purchaseAccountList.size();

		System.err.println(count);

		for(int i=0 ; i < count ;i++)
		{
			String data=purchaseAccountList.get(i).getText();
			actPurchaseAccountList.add(data);

		}

		String actPurchaseList = actPurchaseAccountList.toString();
		String expPurchaseList = "[A1, A2, B1, B2, PurchaseACC]";

		System.out.println("actPurchaseList"+actPurchaseList);
		System.out.println("expPurchaseList"+expPurchaseList);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();

		vendorAccountTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(2000);

		ArrayList<String>  actvendorAccountList = new ArrayList<String>(); 

		int Vcount=vendorAccountList.size();

		System.err.println(Vcount);

		for(int i=0 ; i < Vcount ;i++)
		{
			String data=vendorAccountList.get(i).getText();
			actvendorAccountList.add(data);

		}

		String actvendorList = actvendorAccountList.toString();
		String expvendorList = "[BankACC, CashACC, D1, D2, VendorACC]";

		System.out.println("actvendorList"+actvendorList);
		System.out.println("expvendorList"+expvendorList);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
		warehouseTxt.click();

		warehouseTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(2000);

		ArrayList<String>  actwarehouseAccountList = new ArrayList<String>(); 

		int Wcount=warehouseList.size();

		System.err.println(Wcount);

		for(int i=0 ; i < Wcount ;i++)
		{
			String data=warehouseList.get(i).getText();
			actwarehouseAccountList.add(data);

		}

		String actwarehouseList = actwarehouseAccountList.toString();
		String expwarehouseList = "[A1, A2, B1, B2, D1, D2, HYD]";

		System.out.println("actwarehouseList"+actwarehouseList);
		System.out.println("expwarehouseList"+expwarehouseList);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();

		departmentTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(2000);

		ArrayList<String>  actdepartmentAccountList = new ArrayList<String>(); 

		int Dcount=departmentList.size();

		System.err.println(Dcount);

		for(int i=0 ; i < Dcount ;i++)
		{
			String data=departmentList.get(i).getText();
			actdepartmentAccountList.add(data);

		}

		String actdepartmentList = actdepartmentAccountList.toString();
		String expdepartmentList = "[A1, A2, B1, B2, D1, D2, INV]";

		System.out.println("actdepartmentList"+actdepartmentList);
		System.out.println("expdepartmentList"+expdepartmentList);
		
		departmentTxt.sendKeys(Keys.TAB);
		
		branchTxt.sendKeys(Keys.BACK_SPACE);
		
		Thread.sleep(2000);

		ArrayList<String>  actbranchAccountList = new ArrayList<String>(); 

		int Bcount=branchListInPurchases.size();

		System.err.println(Bcount);

		for(int i=0 ; i < Bcount ;i++)
		{
			String data=branchListInPurchases.get(i).getText();
			actbranchAccountList.add(data);

		}

		String actbranchList = actbranchAccountList.toString();
		String expbranchList = "[BR-HYD]";

		System.out.println("actbranchList"+actbranchList);
		System.out.println("expbranchList"+expbranchList);
		
		branchTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.END);
		enter_ItemTxt.sendKeys(Keys.SPACE,Keys.HOME);

		Thread.sleep(2000);
		
		ArrayList<String>  actitemAccountList = new ArrayList<String>(); 

		int Icount=itemList.size();

		System.err.println(Icount);

		for(int i=0 ; i < Icount ;i++)
		{
			String data=itemList.get(i).getText();
			actitemAccountList.add(data);

		}

		String actitemList = actitemAccountList.toString();
		String expitemList = "[A1, A2, APPLE, B1, B2, D1, D2]";

		System.out.println("actitemList"+actitemList);
		System.out.println("expitemList"+expitemList);
		
		if (actPurchaseList.equalsIgnoreCase(expPurchaseList) && actvendorList.equalsIgnoreCase(expvendorList) 
				&& actwarehouseList.equalsIgnoreCase(expwarehouseList) && actdepartmentList.equalsIgnoreCase(expdepartmentList)
				&& actbranchList.equalsIgnoreCase(expbranchList) && actitemList.equalsIgnoreCase(expitemList))
		{
			return true;
		} 
		else
		{	
			return false;
		}
		
		
		
	}
	
	@FindBy(xpath="//tbody[@id='tblBodyTransRender']//tr//td[7]")
	private static List<WebElement> SvoucherDeptNames;
	
	@FindBy(xpath="//tbody[@id='tblBodyTransRender']//tr//td[6]")
	private static List<WebElement> SvoucherWarehouseNames;
	
	@FindBy(xpath="//tbody[@id='tblBodyTransRender']//tr//td[5]")
	private static List<WebElement> SvoucheCustomerNames;
	
	
	
	public static boolean checkSalesInvoiceVoucherHomePgaeMastersList() throws InterruptedException
	{
		Thread.sleep(2500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();
					
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesBtn));
		salesInvoicesBtn.click();
		
		Thread.sleep(2500);
		
		ArrayList<String>  customerList = new ArrayList<String>(); 

		int Ccount=SvoucheCustomerNames.size();

		System.err.println(Ccount);

		for(int i=0 ; i < Ccount ;i++)
		{
			String data=SvoucheCustomerNames.get(i).getText();
			customerList.add(data);

		}

		String actcustomerList = customerList.toString();
		String expcustomerList = "[H2, H1, CustomerACC, CashACC, BankACC, H1, ]";

		System.out.println("actcustomerList"+actcustomerList);
		System.out.println("expcustomerList"+expcustomerList);
		

		ArrayList<String>  DepartmentList = new ArrayList<String>(); 

		int Dcount=SvoucherDeptNames.size();

		System.err.println(Dcount);

		for(int i=0 ; i < Dcount ;i++)
		{
			String data=SvoucherDeptNames.get(i).getText();
			DepartmentList.add(data);

		}

		String actDepartmentList = DepartmentList.toString();
		String expDepartmentList = "[A1, A1, A1, A1, A1, A1, ]";

		System.out.println("actDepartmentList"+actDepartmentList);
		System.out.println("expDepartmentList"+expDepartmentList);



		ArrayList<String>  WarehouseList = new ArrayList<String>(); 

		int Wcount=SvoucherWarehouseNames.size();

		System.err.println(Wcount);

		for(int i=0 ; i < Wcount ;i++)
		{
			String data=SvoucherWarehouseNames.get(i).getText();
			WarehouseList.add(data);

		}

		String actWarehouseList = WarehouseList.toString();
		String expWarehouseList = "[A1, A1, A1, A1, A1, A1, ]";

		System.out.println("actWarehouseList"+actWarehouseList);
		System.out.println("expWarehouseList"+expWarehouseList);

			
		if (actDepartmentList.equalsIgnoreCase(expDepartmentList) && actWarehouseList.equalsIgnoreCase(expWarehouseList))
		{
			return true;
		} 
		else
		{
			return false;
		}
		
	}

	
	@FindBy(xpath="//tbody[@id='id_header_3_table_body']//tr/td[2]")
	private static List<WebElement> SalesAccountList;

	@FindBy(xpath="//tbody[@id='id_header_4_table_body']//tr//td[2]")
	private static List<WebElement> CustomerAccountList;
	
	@FindBy(xpath="//tbody[@id='id_header_4_table_body']//tr//td[2]")
	private static List<WebElement> CBAccountList;
	
	@FindBy(xpath="//tbody[@id='id_header_268435460_table_body']/tr//td[2]")
	private static List<WebElement> SwarehouseList;

	@FindBy(xpath="//tbody[@id='id_header_268435459_table_body']/tr/td[2]")
	private static List<WebElement> SDepartmentList;
	

	
	public static boolean checkMastersListInSalesInvoices() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();
		Thread.sleep(2500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesBtn));
		salesInvoicesBtn.click();
		
		Thread.sleep(2500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkValidationMessage("Screen opened");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SalesAccountTxt));
		SalesAccountTxt.click();

		SalesAccountTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(2000);

		ArrayList<String>  actSalesAccountList = new ArrayList<String>(); 

		int count=SalesAccountList.size();

		System.err.println(count);

		for(int i=0 ; i < count ;i++)
		{
			String data=SalesAccountList.get(i).getText();
			actSalesAccountList.add(data);

		}

		String actSalesList = actSalesAccountList.toString();
		String expSalesList = "[E1, E2, F1, F2, SalesACC]";

		System.out.println("actSalesList"+actSalesList);
		System.out.println("expSalesList"+expSalesList);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustomerAccountTxt));
		CustomerAccountTxt.click();

		CustomerAccountTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(2000);

		ArrayList<String>  actCustomerAccountList = new ArrayList<String>(); 

		int Ccount=CustomerAccountList.size();

		System.err.println(Ccount);

		for(int i=0 ; i < Ccount ;i++)
		{
			String data=CustomerAccountList.get(i).getText();
			actCustomerAccountList.add(data);

		}

		String actCustomerList = actCustomerAccountList.toString();
		String expCustomerList = "[BankACC, CashACC, CustomerACC, H1, H2]";

		System.out.println("actCustomerList"+actCustomerList);
		System.out.println("expCustomerList"+expCustomerList);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
		warehouseTxt.click();

		warehouseTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(2000);

		ArrayList<String>  actwarehouseAccountList = new ArrayList<String>(); 

		int Wcount=SwarehouseList.size();

		System.err.println(Wcount);

		for(int i=0 ; i < Wcount ;i++)
		{
			String data=SwarehouseList.get(i).getText();
			actwarehouseAccountList.add(data);

		}

		String actwarehouseList = actwarehouseAccountList.toString();
		String expwarehouseList = "[A1, A2, B1, B2, D1, D2, HYD]";

		System.out.println("actwarehouseList"+actwarehouseList);
		System.out.println("expwarehouseList"+expwarehouseList);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();

		departmentTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(2000);

		ArrayList<String>  actdepartmentAccountList = new ArrayList<String>(); 

		int Dcount=SDepartmentList.size();

		System.err.println(Dcount);

		for(int i=0 ; i < Dcount ;i++)
		{
			String data=SDepartmentList.get(i).getText();
			actdepartmentAccountList.add(data);

		}

		String actdepartmentList = actdepartmentAccountList.toString();
		String expdepartmentList = "[A1, A2, B1, B2, D1, D2, INV]";

		System.out.println("actdepartmentList"+actdepartmentList);
		System.out.println("expdepartmentList"+expdepartmentList);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.END);
		enter_ItemTxt.sendKeys(Keys.SPACE,Keys.HOME);

		Thread.sleep(2000);
		
		ArrayList<String>  actitemAccountList = new ArrayList<String>(); 

		int Icount=itemList.size();

		System.err.println(Icount);

		for(int i=0 ; i < Icount ;i++)
		{
			String data=itemList.get(i).getText();
			actitemAccountList.add(data);

		}

		String actitemList = actitemAccountList.toString();
		String expitemList = "[A1, A2, APPLE, B1, B2, D1, D2]";

		System.out.println("actitemList"+actitemList);
		System.out.println("expitemList"+expitemList);
		


		if (actSalesList.equalsIgnoreCase(expSalesList) && actCustomerList.equalsIgnoreCase(expCustomerList) 
				&& actwarehouseList.equalsIgnoreCase(expwarehouseList) && actdepartmentList.equalsIgnoreCase(expdepartmentList)
				&& actitemList.equalsIgnoreCase(expitemList))
		{
			return true;
		} 
		else
		{	
			return false;
		}
		
	}

	@FindBy(xpath="//a[@id='2001']//span[contains(text(),'Cash and Bank')]")
	private static WebElement  cashAndBankMenu; 
	
	@FindBy(xpath="//a[@id='2002']//span[contains(text(),'Receipts')]")
	private static WebElement  receiptsVoucher;
		
	@FindBy(xpath="//a[@id='2003']//span[contains(text(),'Payments')]")
	private static WebElement  paymentsVoucher;
	
	@FindBy(xpath="//tbody[@id='tblBodyTransRender']//tr//td[6]")
	private static List<WebElement> PvoucherDeptNames;
	
	@FindBy(xpath="//tbody[@id='tblBodyTransRender']//tr//td[7]")
	private static List<WebElement> PvoucherAccountNames;
	
	@FindBy(xpath="//tbody[@id='tblBodyTransRender']//tr//td[8]")
	private static List<WebElement> PvouchercashNBankNames;
	
	public static boolean checkPaymentsVoucherHomePageMastersList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(paymentsVoucher));
		paymentsVoucher.click();
		
		Thread.sleep(2000);
		

		ArrayList<String>  DepartmentList = new ArrayList<String>(); 

		int Dcount=PvoucherDeptNames.size();

		System.err.println(Dcount);

		for(int i=0 ; i < Dcount ;i++)
		{
			String data=PvoucherDeptNames.get(i).getText();
			DepartmentList.add(data);

		}

		String actDepartmentList = DepartmentList.toString();
		String expDepartmentList = "[D2, ]";

		System.out.println("actDepartmentList"+actDepartmentList);
		System.out.println("expDepartmentList"+expDepartmentList);



		ArrayList<String>  AccountList = new ArrayList<String>(); 

		int Acount=PvoucherAccountNames.size();

		System.err.println(Acount);

		for(int i=0 ; i < Acount ;i++)
		{
			String data=PvoucherAccountNames.get(i).getText();
			AccountList.add(data);

		}

		String actAccountList = AccountList.toString();
		String expAccountList = "[H2, ]";

		System.out.println("actAccountList"+actAccountList);
		System.out.println("expAccountList"+expAccountList);

		

		ArrayList<String>  CBAccountList = new ArrayList<String>(); 

		int CBAcount=PvouchercashNBankNames.size();

		System.err.println(CBAcount);

		for(int i=0 ; i < CBAcount ;i++)
		{
			String data=PvouchercashNBankNames.get(i).getText();
			CBAccountList.add(data);

		}

		String actCBAccountList = CBAccountList.toString();
		String expCBAccountList = "[BankACC, ]";

		System.out.println("actCBAccountList"+actCBAccountList);
		System.out.println("expCBAccountList"+expCBAccountList);
		
		if (actDepartmentList.equalsIgnoreCase(expDepartmentList) && actAccountList.equalsIgnoreCase(expAccountList) && actCBAccountList.equalsIgnoreCase(expCBAccountList)) 
		{
			return true;
		} 
		else
		{
			return false;
		}
	}
	
	@FindBy(xpath="//tbody[@id='id_body_12_table_body']//tr//td[2]")
	private static List<WebElement> PAccountList;
	

	
	
	public static boolean checkMastersListInPayments() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		Thread.sleep(2500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(paymentsVoucher));
		paymentsVoucher.click();

		Thread.sleep(2000);

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		checkValidationMessage("Screen opened");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CBAccountTxt));
		CBAccountTxt.click();

		CBAccountTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(2000);

		ArrayList<String>  actCBAccountList = new ArrayList<String>(); 

		int count=CBAccountList.size();

		System.err.println(count);

		for(int i=0 ; i < count ;i++)
		{
			String data=CBAccountList.get(i).getText();
			actCBAccountList.add(data);

		}

		String actCBAList = actCBAccountList.toString();
		String expCBAList = "[BankACC, CashACC]";

		System.out.println("actCBAList"+actCBAList);
		System.out.println("expCBAList"+expCBAList);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();

		departmentTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(2000);

		ArrayList<String>  actdepartmentAccountList = new ArrayList<String>(); 

		int Dcount=SDepartmentList.size();

		System.err.println(Dcount);

		for(int i=0 ; i < Dcount ;i++)
		{
			String data=SDepartmentList.get(i).getText();
			actdepartmentAccountList.add(data);

		}

		String actdepartmentList = actdepartmentAccountList.toString();
		String expdepartmentList = "[A1, A2, B1, B2, D1, D2, INV]";

		System.out.println("actdepartmentList"+actdepartmentList);
		System.out.println("expdepartmentList"+expdepartmentList);
		
		
		departmentTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
		enter_AccountTxt.sendKeys(Keys.END);
		enter_AccountTxt.sendKeys(Keys.SPACE,Keys.HOME);

		Thread.sleep(2000);

		ArrayList<String>  actAccountAccountList = new ArrayList<String>(); 

		int Icount=PAccountList.size();

		System.err.println(Icount);

		for(int i=0 ; i < Icount ;i++)
		{
			String data=PAccountList.get(i).getText();
			actAccountAccountList.add(data);

		}

		String actAccountList = actAccountAccountList.toString();
		String expAccountList = "[A1, A2, B1, B2, BankACC, CashACC, CustomerACC, D1, D2, E1, E2, F1, F2, H1, H2, Opening Balances Control A/C, PurchaseACC, SalesACC, VendorACC]";

		System.out.println("actAccountList"+actAccountList);
		System.out.println("expAccountList"+expAccountList);

		if (actCBAList.equalsIgnoreCase(expCBAList) && actdepartmentList.equalsIgnoreCase(expdepartmentList) 
				&& actAccountList.equalsIgnoreCase(expAccountList))
		{
			return true;
		}
		else 
		{
			return false;
		}

	}


	public static boolean checkReceiptsHomePageMasterList() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsVchr));
		receiptsVchr.click();
		
		Thread.sleep(2000);
		

		ArrayList<String>  DepartmentList = new ArrayList<String>(); 

		int Dcount=PvoucherDeptNames.size();

		System.err.println(Dcount);

		for(int i=0 ; i < Dcount ;i++)
		{
			String data=PvoucherDeptNames.get(i).getText();
			DepartmentList.add(data);

		}

		String actDepartmentList = DepartmentList.toString();
		String expDepartmentList = "[A1, ]";

		System.out.println("actDepartmentList"+actDepartmentList);
		System.out.println("expDepartmentList"+expDepartmentList);



		ArrayList<String>  AccountList = new ArrayList<String>(); 

		int Acount=PvoucherAccountNames.size();

		System.err.println(Acount);

		for(int i=0 ; i < Acount ;i++)
		{
			String data=PvoucherAccountNames.get(i).getText();
			AccountList.add(data);

		}

		String actAccountList = AccountList.toString();
		String expAccountList = "[CustomerACC, ]";

		System.out.println("actAccountList"+actAccountList);
		System.out.println("expAccountList"+expAccountList);

		

		ArrayList<String>  CBAccountList = new ArrayList<String>(); 

		int CBAcount=PvouchercashNBankNames.size();

		System.err.println(CBAcount);

		for(int i=0 ; i < CBAcount ;i++)
		{
			String data=PvouchercashNBankNames.get(i).getText();
			CBAccountList.add(data);

		}

		String actCBAccountList = CBAccountList.toString();
		String expCBAccountList = "[BankACC, ]";

		System.out.println("actCBAccountList"+actCBAccountList);
		System.out.println("expCBAccountList"+expCBAccountList);
		
		if (actDepartmentList.equalsIgnoreCase(expDepartmentList) && actAccountList.equalsIgnoreCase(expAccountList) && actCBAccountList.equalsIgnoreCase(expCBAccountList)) 
		{
			return true;
		} 
		else
		{
			return false;
		}
	
	}

	public static boolean checkMasterInReceipts() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsVchr));
		receiptsVchr.click();

		Thread.sleep(2000);

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		checkValidationMessage("Screen opened");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CBAccountTxt));
		CBAccountTxt.click();

		CBAccountTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(2000);

		ArrayList<String>  actCBAccountList = new ArrayList<String>(); 

		int count=CBAccountList.size();

		System.err.println(count);

		for(int i=0 ; i < count ;i++)
		{
			String data=CBAccountList.get(i).getText();
			actCBAccountList.add(data);

		}

		String actCBAList = actCBAccountList.toString();
		String expCBAList = "[BankACC, CashACC]";

		System.out.println("actCBAList"+actCBAList);
		System.out.println("expCBAList"+expCBAList);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();

		departmentTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(2000);

		ArrayList<String>  actdepartmentAccountList = new ArrayList<String>(); 

		int Dcount=SDepartmentList.size();

		System.err.println(Dcount);

		for(int i=0 ; i < Dcount ;i++)
		{
			String data=SDepartmentList.get(i).getText();
			actdepartmentAccountList.add(data);

		}

		String actdepartmentList = actdepartmentAccountList.toString();
		String expdepartmentList = "[A1, A2, B1, B2, D1, D2, INV]";

		System.out.println("actdepartmentList"+actdepartmentList);
		System.out.println("expdepartmentList"+expdepartmentList);
		
		Thread.sleep(2000);
		departmentTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
		enter_AccountTxt.sendKeys(Keys.END);
		enter_AccountTxt.sendKeys(Keys.SPACE,Keys.HOME);

		Thread.sleep(2000);

		ArrayList<String>  actAccountAccountList = new ArrayList<String>(); 

		int Icount=PAccountList.size();

		System.err.println(Icount);

		for(int i=0 ; i < Icount ;i++)
		{
			String data=PAccountList.get(i).getText();
			actAccountAccountList.add(data);

		}

		String actAccountList = actAccountAccountList.toString();
		String expAccountList = "[A1, A2, B1, B2, BankACC, CashACC, CustomerACC, D1, D2, E1, E2, F1, F2, H1, H2, Opening Balances Control A/C, PurchaseACC, SalesACC, VendorACC]";

		System.out.println("actAccountList"+actAccountList);
		System.out.println("expAccountList"+expAccountList);

		if (actCBAList.equalsIgnoreCase(expCBAList) && actdepartmentList.equalsIgnoreCase(expdepartmentList) 
				&& actAccountList.equalsIgnoreCase(expAccountList))
		{
			return true;
		}
		else 
		{
			return false;
		}

	
	}
	
	public static boolean checkLogoutAndLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		userNameDisplay.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();

		Thread.sleep(4000);

		LoginPageOld lp=new LoginPageOld(getDriver()); 

		String unamelt="su";

		String pawslt="su";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
		username.click();
		Thread.sleep(2000);
		username.clear();
		Thread.sleep(2000);
		username.sendKeys(unamelt);
		getAction().moveToElement(username).sendKeys(Keys.TAB).perform();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
		password.click();
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		password.sendKeys(pawslt);
		String compname="Account Properties And Customization";
		/*	String compname="Automation Company";*/

		Select oSelect = new Select(companyDropDownList);

		List <WebElement> elementCount = oSelect.getOptions();

		int cqSize = elementCount.size();

		int zqSize=cSize+1;

		System.out.println("CompanyDropdownList Count :"+cqSize);

		System.out.println("Company dropdown is :"+ zqSize);


		//Select dropdown= new Select(lp.companyDropDownList);
		int i;

		//List<WebElement> list = dropdown.getOptions();

		//List<String> text = new ArrayList<>();
		for(i=0; i<elementCount.size(); i++) 
		{
			elementCount.get(i).getText();
			String optionName = elementCount.get(i).getText();
			if(optionName.toUpperCase().startsWith(compname.toUpperCase()))
			{
				System.out.println("q"+elementCount.get(i).getText());
				elementCount.get(i).click();
			}	
		}

		lp.clickOnSignInBtn();

		//checkRefershPopOnlogin();

		//checkPopUpWindow();

		Thread.sleep(8000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();

		String userInfo=userNameDisplay.getText();

		System.out.println("User Info : "+userInfo);

		System.out.println("User Info Capture Text :"+userNameDisplay.getText());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));

		companyLogo.click();

		String getCompanyTxt=companyName.getText();
		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
		System.out.println("company name :"+ getLoginCompanyName);
		companyLogo.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboard));

		String getDashboard=dashboard.getText();

		System.out.println(getDashboard);


		String expuserInfo            ="SU";
		String expLoginCompanyName    ="Account Properties";
		String expDashboard			  ="Graph with Active and setAsDefault";


		System.out.println("***********************************checkLogin*********************************");

		System.out.println("User Info                        : "+userInfo               +"  value expected  "+expuserInfo);
		System.out.println("Login Company Name               : "+getLoginCompanyName    +"  value expected  "+expLoginCompanyName);
		System.out.println("Dashboard                        : "+getDashboard           +"  value expected  "+expDashboard);


		if(userInfo.equalsIgnoreCase(expuserInfo) /*&& getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName)*/)
		{	
			return true;
		}	 
		else
		{
			return false;
		}
	}































	public UserRestrictionsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}










}
