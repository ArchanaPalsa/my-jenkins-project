package com.focus.Pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;

public class CodeIncrementalPage extends BaseEngine
{
	
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
	
	 private static int cSize;
	
	public static boolean checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		Thread.sleep(3000);
		LoginPage lp=new LoginPage(getDriver()); 
			
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    Thread.sleep(3000);
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
		/*String compname="Automation Company";*/
		
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
	    
	    Thread.sleep(5000);
	          
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
		companyName.click();
		
	
	    
	    String expuserInfo            ="SU";
	    String expLoginCompanyName    ="Account Properties And Customization ";
	   
		System.out.println("***********************************checkLogin*********************************");
	    
		 System.out.println("User Info                        : "+userInfo               +"  value expected  "+expuserInfo);
		    System.out.println("Login Company Name               : "+getLoginCompanyName    +"  value expected  "+expLoginCompanyName);
		   
			if(userInfo.equalsIgnoreCase(expuserInfo) /*&& getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName)*/)
			{	
				return true;
			}	 
			else
			{
				return false;
			}
		 }

	
	@FindBy(xpath="//*[@id='all_TabsField']/div[10]//ul//li[1]//a//i")
	public static WebElement headerDetailsSaveBtn;

	@FindBy(xpath="//*[@id='iAcceptanceac']")
	public static WebElement currencyTxt;
	
	
	public static boolean checkSaveNormalIncrementOfCodeInCustMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		masterRibbonToExpandOptions.click();

		Thread.sleep(2000);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
		masterCustamizemasterBtn.click();

		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalTab));	
		generalTab.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalMainTab));
		generalMainTab.click();

		int count = IfieldCaptionTxtList.size();

		for (int i = 0; i < count; i++) 
		{
			String data = IfieldCaptionTxtList.get(i).getText();

			if (data.equalsIgnoreCase("Code")) 
			{
				IeditFieldList.get(i).click();
				break;
			} 
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
		extraFields_PropertiesTab.click();

		Thread.sleep(2000);
		
		Select bd = new Select(extraFields_PropertiesBehaviourDropdown);
		bd.selectByVisibleText("Incremental");
		
		
		boolean actTableInc = incrementalTable.isDisplayed();
		boolean expTableInc = true;
		
		System.out.println("actTableInc:  "+actTableInc  + "expected value : "+expTableInc);
		
		IncCol1Row1.click();
		Thread.sleep(2000);
		
		Select typeDD = new Select(IncTypeDropdown);
		typeDD.selectByVisibleText("Incremental");
		Thread.sleep(1000);
		
		IncTypeDropdown.sendKeys(Keys.TAB);
		
		IncValueTxt.sendKeys("1");
		Thread.sleep(1000);
		IncValueTxt.sendKeys(Keys.TAB);
		
		IncStartingTxt.sendKeys("0");
		Thread.sleep(1000);
		IncStartingTxt.sendKeys(Keys.TAB);
		
		
		IncNoOfTxt.sendKeys("6");
		Thread.sleep(1000);
		IncNoOfTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		String actOpTxt = OutputTxt.getText();
		String expOpTxt = "Output : 000001";
		
		
		System.out.println("actOpTxt:  "+actOpTxt  + "expected value : "+expOpTxt);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		
		String expMessage="Field Updated Successfully";
		
		String actMessage=checkValidationMessage(expMessage);
		
		
		System.out.println("actMessage: "+actMessage);
		System.out.println("expMessage: "+expMessage);
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerDetailsSaveBtn));
		headerDetailsSaveBtn.click();

		String expMessageOnSave = "Master updated successfully";
		String actMessageOnSave=checkValidationMessage(expMessageOnSave);

	

		if (actMessageOnSave.equalsIgnoreCase(expMessageOnSave))
		{
			System.out.println(" Test Pass: code Customization Field done ");
			return true;
		}
		else
		{
			System.out.println(" Test Fail: code Customization Field not done ");
			return false;

		}
		
	}

	public static boolean checkCreateAccountMasterToVerifyCodeIncrement() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		
		getDriver().navigate().refresh();
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("IncrementOne");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);

		currencyTxt.click();
		Thread.sleep(2000);
		currencyTxt.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		String expSaveAccountMessage = "Saved Successfully";	
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);
		
		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);
		
		int count = masterGridBodyName.size();
		
		ArrayList<String> AccountNames = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);
		
			if (data.equalsIgnoreCase("IncrementOne")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
				System.out.println("Yes incrementOne is displayed...");
				break;
			}
			
		}
		
		Thread.sleep(2000);
		String actCodeTxt1 = codeTxt.getAttribute("value");
		String expCodeTxt1 = "009004";

		System.out.println("actCodeTxt1: "+actCodeTxt1 +"expCodeTxt1:  "+expCodeTxt1);
		
		Thread.sleep(2000);
		closeBtnAfterSave.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("IncrementTwo");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);

		currencyTxt.click();
		Thread.sleep(2000);
		currencyTxt.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		checkValidationMessage(expSaveAccountMessage);

		
		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(2000);
		
		for (int i = 0; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);
		
			if (data.equalsIgnoreCase("IncrementTwo")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
				break;
			}
			
		}
		Thread.sleep(2000);
		String actCodeTxt2 = codeTxt.getAttribute("value");
		String expCodeTxt2 = "009005";

		System.out.println("actCodeTxt2: "+actCodeTxt2 +"expCodeTxt2:  "+expCodeTxt2);
		
		Thread.sleep(2000);
		closeBtnAfterSave.click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("IncrementThree");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);

		currencyTxt.click();
		
		Thread.sleep(2000);
		currencyTxt.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		checkValidationMessage(expSaveAccountMessage);
		
		Thread.sleep(2000);
		

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(2000);
		

		for (int i = 0; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);
		
			if (data.equalsIgnoreCase("IncrementThree")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
				break;
			}
		}
		
		Thread.sleep(2000);
		String actCodeTxt3 = codeTxt.getAttribute("value");
		String expCodeTxt3 = "009006";


		System.out.println("actCodeTxt3: "+actCodeTxt3 +"expCodeTxt3:  "+expCodeTxt3);

		
		Thread.sleep(2000);
		closeBtnAfterSave.click();
		Thread.sleep(2000);
		
		if (actCodeTxt1.equalsIgnoreCase(expCodeTxt1) && actCodeTxt2.equalsIgnoreCase(expCodeTxt2) 
				&& actCodeTxt3.equalsIgnoreCase(expCodeTxt3))
		{
			return true;
		} 
		else {
			return false;
		}


	}
	
	public static boolean checkSavedAccountsInGrid() throws InterruptedException
	{
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(2000);
		
		int count = masterGridBodyName.size();
		boolean accountVisiblity = false;
		ArrayList<String> AccountNames = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);
		
			if (data.equalsIgnoreCase("IncrementOne")   || data.equalsIgnoreCase("IncrementTwo") || data.equalsIgnoreCase("IncrementThree")) 
			{
				accountVisiblity = true;
			}
		}
		
		System.out.println("accountVisiblity:"+accountVisiblity);
		
		if (accountVisiblity)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean checkRemoveIncrementalForCode() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		masterRibbonToExpandOptions.click();

		Thread.sleep(2000);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
		masterCustamizemasterBtn.click();

		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalTab));	
		generalTab.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalMainTab));
		generalMainTab.click();

		int count = IfieldCaptionTxtList.size();

		for (int i = 0; i < count; i++) 
		{
			String data = IfieldCaptionTxtList.get(i).getText();

			if (data.equalsIgnoreCase("Code")) 
			{
				IeditFieldList.get(i).click();
				break;
			} 
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
		extraFields_PropertiesTab.click();

		Thread.sleep(2000);
		

		Select bd = new Select(extraFields_PropertiesBehaviourDropdown);
		bd.selectByVisibleText("--None--");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		
		String expMessage="Field Updated Successfully";
		
		String actMessage=checkValidationMessage(expMessage);
		
		
		System.out.println("actMessage: "+actMessage);
		System.out.println("expMessage: "+expMessage);
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerDetailsSaveBtn));
		headerDetailsSaveBtn.click();

		String expMessageOnSave = "Master updated successfully";
		String actMessageOnSave=checkValidationMessage(expMessageOnSave);

	

		if (actMessageOnSave.equalsIgnoreCase(expMessageOnSave))
		{
			System.out.println(" Test Pass: code Customization Field done ");
			return true;
		}
		else
		{
			System.out.println(" Test Fail: code Customization Field not done ");
			return false;

		}
		
		
		

	}

	public static boolean checkLogoutAndLoginAfterCustomization() throws InterruptedException
	{	
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(LogoutDropdown));
		LogoutDropdown.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		Thread.sleep(4000);
		
		LoginPage lp=new LoginPage(getDriver()); 
			
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
	    username.click();
	    Thread.sleep(2000);
		username.clear();
	    Thread.sleep(2000);
	    username.sendKeys(unamelt);
	    //getAction().moveToElement(username).sendKeys(Keys.TAB).perform();

	    /*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
		password.click();
		Thread.sleep(2000);
		password.clear();*/
		Thread.sleep(2000);
		password.sendKeys(pawslt);
		String compname="Account Properties And Customization";
		
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
	    
	    Thread.sleep(3000);
	    
	    reLogin(unamelt, pawslt, "Account Properties And Customization");
	          
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameTxt));
	    userNameTxt.click();
	           	
		String userInfo=userNameTxt.getText();
		
		System.out.println("User Info : "+userInfo);
		
		System.out.println("User Info Capture Text :"+userNameTxt.getText());
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogoImg));
		
		companyLogoImg.click();
		
		String getCompanyTxt=companyName.getText();
		String getLoginCompanyName=getCompanyTxt.substring(0, 36);
		System.out.println("company name :"+ getLoginCompanyName);
		companyLogoImg.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));
		
		String getDashboard=dashboardName.getText();
		
		System.out.println(getDashboard);
		
	    
	    String expuserInfo            ="SU";
	    String expLoginCompanyName    ="Account Properties And Customization";
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


	@FindBy(xpath="//*[@id='FieldsDetails_CopyFromParent']//following-sibling::span")
	private static WebElement extraFields_PropertiesCopyFromParentChekbox;
	

	@FindBy(xpath="//*[@id='FieldsDetails_CopyFromParent']")
	private static WebElement extraFields_PropertiesCopyFromParentChekboxSelected;
	
	
	public static boolean checkSaveCopyFromParentAndIncrementalForGroupAccounts() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		masterRibbonToExpandOptions.click();

		Thread.sleep(2000);

	

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
		masterCustamizemasterBtn.click();

		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalTab));	
		generalTab.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalMainTab));
		generalMainTab.click();

		int count = IfieldCaptionTxtList.size();

		for (int i = 0; i < count; i++) 
		{
			String data = IfieldCaptionTxtList.get(i).getText();

			if (data.equalsIgnoreCase("Code")) 
			{
				IeditFieldList.get(i).click();
				break;
			} 
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
		extraFields_PropertiesTab.click();

		Thread.sleep(2000);
		
		if (extraFields_PropertiesCopyFromParentChekboxSelected.isSelected() ==false) 
		{
			extraFields_PropertiesCopyFromParentChekbox.click();
		}
		
		boolean actCFP = extraFields_PropertiesCopyFromParentChekboxSelected.isSelected();
		boolean expCFP = true;
		
		Thread.sleep(2000);
		
		Select bd = new Select(extraFields_PropertiesBehaviourDropdown);
		bd.selectByVisibleText("Incremental");
		
		
		boolean actTableInc = incrementalTable.isDisplayed();
		boolean expTableInc = true;
		
		System.out.println("actTableInc:  "+actTableInc  + "expected value : "+expTableInc);
		
		IncCol1Row1.click();
		Thread.sleep(2000);
		
		Select typeDD = new Select(IncTypeDropdown);
		typeDD.selectByVisibleText("Field");
		Thread.sleep(1000);
		
		IncTypeDropdown.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		Select valueDD = new Select(valueDropdown);
		valueDD.selectByVisibleText("Code");
		Thread.sleep(1000);
		
		valueDropdown.sendKeys(Keys.TAB);
		
		IncStartingTxt.sendKeys("1");
		Thread.sleep(1000);
		IncStartingTxt.sendKeys(Keys.TAB);
		
		
		IncNoOfTxt.sendKeys("8");
		Thread.sleep(1000);
		IncNoOfTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		
		typeDD.selectByVisibleText("Incremental");
		Thread.sleep(1000);
		
		IncTypeDropdown.sendKeys(Keys.TAB);
		
		IncValueTxt.sendKeys("1");
		Thread.sleep(1000);
		IncValueTxt.sendKeys(Keys.TAB);
		
		IncStartingTxt.sendKeys("0");
		Thread.sleep(1000);
		IncStartingTxt.sendKeys(Keys.TAB);
		
		
		IncNoOfTxt.sendKeys("8");
		Thread.sleep(1000);
		IncNoOfTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		String actOpTxt = OutputTxt.getText();
		String expOpTxt = "Output : XXXXXXX00000001";
		
		
		System.out.println("actOpTxt:  "+actOpTxt  + "expected value : "+expOpTxt);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		
		String expMessage="Field Updated Successfully";
		
		String actMessage=checkValidationMessage(expMessage);
		
		
		System.out.println("actMessage: "+actMessage);
		System.out.println("expMessage: "+expMessage);
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerDetailsSaveBtn));
		headerDetailsSaveBtn.click();

		String expMessageOnSave = "Master updated successfully";
		String actMessageOnSave=checkValidationMessage(expMessageOnSave);

	

		if (actOpTxt.equalsIgnoreCase(expOpTxt) && actMessage.equalsIgnoreCase(expMessage) && actMessageOnSave.equalsIgnoreCase(expMessageOnSave))
		{
			System.out.println(" Test Pass: code Customization Field done ");
			return true;
		}
		else
		{
			System.out.println(" Test Fail: code Customization Field not done ");
			return false;

		}
		

	}
	
	public static boolean checkSaveGroupAccountsAndNestedGroupAccountAndVerifyCode() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));	
		masterAddGroupBtn.click();

		Thread.sleep(2000);



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("CopyFromParentAndIncrementLevelOne");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("LevelCode");

		Thread.sleep(2000);

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		String expSaveAccountMessage = "Saved Successfully";	
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);

		int count = masterGridBodyName.size();

		for (int i = 0; i < count; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
			
			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelOne")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
			}
			break;
		}


		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));	
		masterAddGroupBtn.click();

		Thread.sleep(2000);

		//leveltwo

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("CopyFromParentAndIncrementLevelTwo");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);

		currencyTxt.click();
		Thread.sleep(2000);
		currencyTxt.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);

		int count2 = masterGridBodyName.size();
	
		for (int i = 0; i < count2; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
		

			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelTwo")) 
			{
				Thread.sleep(1000);
				masterGridBodyChkbox.get(i).click();
			}
		}

		Thread.sleep(2000);
		masterEditBtn.click();
		Thread.sleep(5000);

		String actCodeTxt1 = codeTxt.getAttribute("value");
		String expCodeTxt1 = "evelCode00000001";

		System.out.println("actCodeTxt1: "+actCodeTxt1 +"expCodeTxt1:  "+expCodeTxt1);

		closeBtnAfterSave.click();


		//level3
		int count3 = masterGridBodyName.size();
		for (int i = 0; i < count3; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
			

			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelTwo")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
			}
		}


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));	
		masterAddGroupBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("CopyFromParentAndIncrementLevelThree");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);

		currencyTxt.click();
		Thread.sleep(2000);
		currencyTxt.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);

		int count4 = masterGridBodyName.size();
		for (int i = 0; i < count4; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
			

			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelThree")) 
			{
				Thread.sleep(1000);
				masterGridBodyChkbox.get(i).click();
			}
		}

		Thread.sleep(2000);
		masterEditBtn.click();
		Thread.sleep(5000);

		String actCodeTxt2 = codeTxt.getAttribute("value");
		String expCodeTxt2 = "velCode000000001";

		System.out.println("actCodeTxt2: "+actCodeTxt2 +"expCodeTxt2:  "+expCodeTxt2);


		closeBtnAfterSave.click();

		//level4

		int count5 = masterGridBodyName.size();
		for (int i = 0; i < count5; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
			

			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelThree")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
			}
		}


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));	
		masterAddGroupBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("CopyFromParentAndIncrementLevelFour");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);

		currencyTxt.click();
		Thread.sleep(2000);
		currencyTxt.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);

		int count6 = masterGridBodyName.size();
		for (int i = 0; i < count6; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
		

			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelFour")) 
			{
				Thread.sleep(1000);
				masterGridBodyChkbox.get(i).click();
			}
		}

		Thread.sleep(2000);
		masterEditBtn.click();
		Thread.sleep(5000);

		String actCodeTxt3 = codeTxt.getAttribute("value");
		String expCodeTxt3 = "elCode0000000001";

		System.out.println("actCodeTxt3: "+actCodeTxt3 +"expCodeTxt3:  "+expCodeTxt3);


		closeBtnAfterSave.click();

		//level5


		int count7 = masterGridBodyName.size();
		for (int i = 0; i < count7; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
			

			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelFour")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
			}
		}


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));	
		masterAddGroupBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("CopyFromParentAndIncrementLevelFive");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);

		currencyTxt.click();
		Thread.sleep(2000);
		currencyTxt.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);

		int count8 = masterGridBodyName.size();
		for (int i = 0; i < count8; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
		

			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelFive")) 
			{
				Thread.sleep(1000);
				masterGridBodyChkbox.get(i).click();
			}
		}

		Thread.sleep(2000);
		masterEditBtn.click();
		Thread.sleep(5000);

		String actCodeTxt4 = codeTxt.getAttribute("value");
		String expCodeTxt4 = "lCode00000000001";

		System.out.println("actCodeTxt4: "+actCodeTxt4 +"expCodeTxt4:  "+expCodeTxt4);


		closeBtnAfterSave.click();

		//level6



		int count9 = masterGridBodyName.size();
		for (int i = 0; i < count9; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
		
			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelFive")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
			}
		}


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));	
		masterAddGroupBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("CopyFromParentAndIncrementLevelSix");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);

		currencyTxt.click();
		Thread.sleep(2000);
		currencyTxt.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);

		int count10 = masterGridBodyName.size();
		for (int i = 0; i < count10; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
		
			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelSix")) 
			{
				Thread.sleep(1000);
				masterGridBodyChkbox.get(i).click();
			}
		}

		Thread.sleep(2000);
		masterEditBtn.click();
		Thread.sleep(5000);

		String actCodeTxt5 = codeTxt.getAttribute("value");
		String expCodeTxt5 = "Code000000000001";

		System.out.println("actCodeTxt5: "+actCodeTxt5 +"expCodeTxt5:  "+expCodeTxt5);


		closeBtnAfterSave.click();



		if (actCodeTxt1.equalsIgnoreCase(expCodeTxt1) && actCodeTxt2.equalsIgnoreCase(expCodeTxt2) 
				&& actCodeTxt3.equalsIgnoreCase(expCodeTxt3) && actCodeTxt4.equalsIgnoreCase(expCodeTxt4)
				&& actCodeTxt5.equalsIgnoreCase(expCodeTxt5))
		{
			return true;
		} 
		else 
		{
			return false;
		}


	}

	public static boolean checkSaveNormalAccInLevelOne() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(2000);
		
		int count = masterGridBodyName.size();
		
		ArrayList<String> AccountNames = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);
		
			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelOne")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
			}
			break;
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("LevelOneChildOne");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);

		currencyTxt.click();
		Thread.sleep(2000);
		currencyTxt.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		String expSaveAccountMessage = "Saved Successfully";	
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);
		
		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);
		
		
		
		int codecount = masterGridBodyCode.size();
		
		ArrayList<String> AccountCodes = new ArrayList<String>();
		
		for (int i = 0; i < codecount; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyCode.get(i).getText();
			AccountCodes.add(data);
		}
		 
		String actCodeText = AccountCodes.toString();
		String expCodeText = "[evelCode00000002, evelCode00000001]";
		
		System.out.println("actCodeText:"+actCodeText);
		System.out.println("expCodeText:"+expCodeText);
		
		if (actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage) 
			&& actCodeText.equalsIgnoreCase(expCodeText))
		{
			return true;
		} 
		else 
		{	
			return false;
		}
	
	}
	
	public static boolean checkNormalAccountInLevelFour() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getDriver().navigate().refresh();
		
		Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		getAction().moveToElement(homeMenu).click().build().perform();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));
		masterSearchTxt.click();
		masterSearchTxt.sendKeys("CopyFromParentAndIncrementLevelFour");
		masterSearchTxt.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		int count = masterGridBodyName.size();
		
		ArrayList<String> AccountNames = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);
			
			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelFour")) 
			{
				Thread.sleep(1000);
				
				getAction().doubleClick(masterGridBodyChkbox.get(i)).build().perform();
				
			}
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("LevelFourChildOne");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);

		currencyTxt.click();
		Thread.sleep(2000);
		currencyTxt.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		String expSaveAccountMessage = "Saved Successfully";	
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);
		
		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);
		
		
		
		int codecount = masterGridBodyCode.size();
		
		ArrayList<String> AccountCodes = new ArrayList<String>();
		
		for (int i = 0; i < codecount; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyCode.get(i).getText();
			AccountCodes.add(data);
		}
		 
		String actCodeText = AccountCodes.toString();
		String expCodeText = "[lCode00000000002, lCode00000000001]";
		
		System.out.println("actCodeText:"+actCodeText);
		System.out.println("expCodeText:"+expCodeText);
		
		if (actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage) 
			&& actCodeText.equalsIgnoreCase(expCodeText))
		{
			return true;
		} 
		else 
		{	
			return false;
		}
	
		
		
	}

	 public CodeIncrementalPage(WebDriver driver)
	 {
		PageFactory.initElements(driver, this);
		
	 }









}
