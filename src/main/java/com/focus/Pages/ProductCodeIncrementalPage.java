package com.focus.Pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;

public class ProductCodeIncrementalPage extends BaseEngine
{

	

	
	public static String checkValidationMessage(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	        try
	        {
	                getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(IerrorMessage));
	                String actErrorMessage=IerrorMessage.getText();
	                String expErrorMessage=ExpMessage;

	                try
	                {
	                
		                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(IerrorMessageCloseBtn));
		                IerrorMessageCloseBtn.click();

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

	
	public static boolean checkSaveNormalIncrementInItemCode() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{	
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		Thread.sleep(2000);
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
		homeMasterItemMenu.click();
		 
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
		 homeMasterItem_ItemMenu.click();

		 Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		masterRibbonToExpandOptions.click();
		
	
		Thread.sleep(2000);
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
		masterCustamizemasterBtn.click();
		
		Thread.sleep(2000);
		
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalTab));	
		generalTab.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalMainTabInItem));
		generalMainTabInItem.click();

		int count = fieldCaptionTxtList.size();

		for (int i = 0; i < count; i++) 
		{
			String data = fieldCaptionTxtList.get(i).getText();

			if (data.equalsIgnoreCase("Code")) 
			{
				editFieldList.get(i).click();
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
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerDetailsaccountSaveBtn));
		headerDetailsaccountSaveBtn.click();
		
		Thread.sleep(2000);

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
	
	public static boolean checkSaveProductMasterAndVerifyIncrementalPropery() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		Thread.sleep(2000);
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
		homeMasterItemMenu.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
		homeMasterItem_ItemMenu.click();


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("IncrementOne");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);

		BinTxt.click();
		Thread.sleep(2000);
		BinTxt.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();
		
		Thread.sleep(2000);
		String expSaveAccountMessage = "Saved Successfully";	
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);

		int count = ProductmasterGridBodyName.size();

		ArrayList<String> AccountNames = new ArrayList<String>();

		for (int i = 0; i < count; i++) 
		{
			Thread.sleep(1000);
			String data = ProductmasterGridBodyName.get(i).getText();
			AccountNames.add(data);

			if (data.equalsIgnoreCase("IncrementOne")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(ProductmasterGridBodyName.get(i)).build().perform();
				break;
			}

		}

		String actCodeTxt1 = codeTxt.getAttribute("value");
		String expCodeTxt1 = "000001";

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

		BinTxt.click();
		Thread.sleep(2000);
		BinTxt.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();

		checkValidationMessage(expSaveAccountMessage);

		
		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(2000);
		
		for (int i = 0; i < count; i++) 
		{
			String data = ProductmasterGridBodyName.get(i).getText();
			AccountNames.add(data);
		
			if (data.equalsIgnoreCase("IncrementTwo")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(ProductmasterGridBodyName.get(i)).build().perform();
				break;
			}
			
		}
		String actCodeTxt2 = codeTxt.getAttribute("value");
		String expCodeTxt2 = "000002";

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

		BinTxt.click();
		
		Thread.sleep(2000);
		BinTxt.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();

		checkValidationMessage(expSaveAccountMessage);
		
		Thread.sleep(2000);
		

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(2000);
		

		for (int i = 0; i < count; i++) 
		{
			String data = ProductmasterGridBodyName.get(i).getText();
			AccountNames.add(data);
		
			if (data.equalsIgnoreCase("IncrementThree")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(ProductmasterGridBodyName.get(i)).build().perform();
				break;
			}
		}
		String actCodeTxt3 = codeTxt.getAttribute("value");
		String expCodeTxt3 = "000003";


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
	
	public static boolean checkSavedProductMastersWithIncrement() throws InterruptedException
	{

		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		Thread.sleep(2000);
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
		homeMasterItemMenu.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
		homeMasterItem_ItemMenu.click();


		Thread.sleep(2000);
		
		int count = ProductmasterGridBodyName.size();
		boolean ProductVisiblity = false;
		ArrayList<String> ProductNames = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			String data = ProductmasterGridBodyName.get(i).getText();
			ProductNames.add(data);
		
			if (data.equalsIgnoreCase("IncrementOne")   || data.equalsIgnoreCase("IncrementTwo") || data.equalsIgnoreCase("IncrementThree")) 
			{
				ProductVisiblity = true;
			}
		}
		
		System.out.println("ProductVisiblity:"+ProductVisiblity);
		
		if (ProductVisiblity)
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
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
		homeMasterItemMenu.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
		homeMasterItem_ItemMenu.click();


		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		masterRibbonToExpandOptions.click();


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
		masterCustamizemasterBtn.click();

		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalTab));	
		generalTab.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalMainTabInItem));
		generalMainTabInItem.click();

		int count = fieldCaptionTxtList.size();

		for (int i = 0; i < count; i++) 
		{
			String data = fieldCaptionTxtList.get(i).getText();

			if (data.equalsIgnoreCase("Code")) 
			{
				editFieldList.get(i).click();
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
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerDetailsaccountSaveBtn));
		headerDetailsaccountSaveBtn.click();

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

	public static boolean checkSaveCopyFromParentAndIncrementalForGroupProducts() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		Thread.sleep(2000);
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
		homeMasterItemMenu.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
		homeMasterItem_ItemMenu.click();


		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		masterRibbonToExpandOptions.click();

		

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
		masterCustamizemasterBtn.click();

		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalTab));	
		generalTab.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalMainTabInItem));
		generalMainTabInItem.click();

		int count = fieldCaptionTxtList.size();

		for (int i = 0; i < count; i++) 
		{
			String data = fieldCaptionTxtList.get(i).getText();

			if (data.equalsIgnoreCase("Code")) 
			{
				editFieldList.get(i).click();
				break;
			} 
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
		extraFields_PropertiesTab.click();

		Thread.sleep(2000);
		
		if (Item_PropertiesCopyFromParentChekbox.isSelected() ==false) 
		{
			Item_PropertiesCopyFromParentChekbox.click();
		}
		
		boolean actCFP = Item_PropertiesCopyFromParentChekbox.isSelected();
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
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerDetailsaccountSaveBtn));
		headerDetailsaccountSaveBtn.click();

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
	
	
	public static boolean checkSaveGroupItemsAndNestedGroupItemsAndVerfifyCode() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{


		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		Thread.sleep(2000);
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
		homeMasterItemMenu.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
		homeMasterItem_ItemMenu.click();


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
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();

		String expSaveAccountMessage = "Saved Successfully";	
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);

		int count = ProductmasterGridBodyName.size();

		for (int i = 0; i < count; i++) 
		{
			Thread.sleep(1000);
			String data = ProductmasterGridBodyName.get(i).getText();
			
			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelOne")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(ProductmasterGridBodyName.get(i)).build().perform();
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

		BinTxt.click();
		Thread.sleep(2000);
		BinTxt.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();

		checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);

		int count2 = ProductmasterGridBodyName.size();
	
		for (int i = 0; i < count2; i++) 
		{
			Thread.sleep(1000);
			String data = ProductmasterGridBodyName.get(i).getText();
		

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
		int count3 = ProductmasterGridBodyName.size();
		for (int i = 0; i < count3; i++) 
		{
			Thread.sleep(1000);
			String data = ProductmasterGridBodyName.get(i).getText();
			

			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelTwo")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(ProductmasterGridBodyName.get(i)).build().perform();
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

		BinTxt.click();
		Thread.sleep(2000);
		BinTxt.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();

		checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);

		int count4 = ProductmasterGridBodyName.size();
		for (int i = 0; i < count4; i++) 
		{
			Thread.sleep(1000);
			String data = ProductmasterGridBodyName.get(i).getText();
			

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

		int count5 = ProductmasterGridBodyName.size();
		for (int i = 0; i < count5; i++) 
		{
			Thread.sleep(1000);
			String data = ProductmasterGridBodyName.get(i).getText();
			

			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelThree")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(ProductmasterGridBodyName.get(i)).build().perform();
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

		BinTxt.click();
		Thread.sleep(2000);
		BinTxt.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();

		checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);

		int count6 = ProductmasterGridBodyName.size();
		for (int i = 0; i < count6; i++) 
		{
			Thread.sleep(1000);
			String data = ProductmasterGridBodyName.get(i).getText();
		

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


		int count7 = ProductmasterGridBodyName.size();
		for (int i = 0; i < count7; i++) 
		{
			Thread.sleep(1000);
			String data = ProductmasterGridBodyName.get(i).getText();
			

			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelFour")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(ProductmasterGridBodyName.get(i)).build().perform();
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

		BinTxt.click();
		Thread.sleep(2000);
		BinTxt.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();

		checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);

		int count8 = ProductmasterGridBodyName.size();
		for (int i = 0; i < count8; i++) 
		{
			Thread.sleep(1000);
			String data = ProductmasterGridBodyName.get(i).getText();
		

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



		int count9 = ProductmasterGridBodyName.size();
		for (int i = 0; i < count9; i++) 
		{
			Thread.sleep(1000);
			String data = ProductmasterGridBodyName.get(i).getText();
		
			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelFive")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(ProductmasterGridBodyName.get(i)).build().perform();
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

		BinTxt.click();
		Thread.sleep(2000);
		BinTxt.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();

		checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);

		int count10 = ProductmasterGridBodyName.size();
		for (int i = 0; i < count10; i++) 
		{
			Thread.sleep(1000);
			String data = ProductmasterGridBodyName.get(i).getText();
		
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
	
	public static boolean checkSaveNormalItemInLevelOne() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		Thread.sleep(2000);
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
		homeMasterItemMenu.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
		homeMasterItem_ItemMenu.click();



		Thread.sleep(2000);
		
		int count = ProductmasterGridBodyName.size();
		
		ArrayList<String> ItemNames = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			Thread.sleep(1000);
			String data = ProductmasterGridBodyName.get(i).getText();
			ItemNames.add(data);
		
			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelOne")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(ProductmasterGridBodyName.get(i)).build().perform();
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

		BinTxt.click();
		Thread.sleep(2000);
		BinTxt.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();

		String expSaveItemMessage = "Saved Successfully";	
		String actSaveItemMessage = checkValidationMessage(expSaveItemMessage);
		
		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);
		
		
		
		int codecount = ProductmasterGridBodyCode.size();
		
		ArrayList<String> ItemCodes = new ArrayList<String>();
		
		for (int i = 0; i < codecount; i++) 
		{
			Thread.sleep(1000);
			String data = ProductmasterGridBodyCode.get(i).getText();
			ItemCodes.add(data);
		}
		 
		String actCodeText = ItemCodes.toString();
		String expCodeText = "[evelCode00000002, evelCode00000001]";
		
		System.out.println("actCodeText:"+actCodeText);
		System.out.println("expCodeText:"+expCodeText);
		
		if (actSaveItemMessage.equalsIgnoreCase(expSaveItemMessage) 
			&& actCodeText.equalsIgnoreCase(expCodeText))
		{
			return true;
		} 
		else 
		{	
			return false;
		}
	
	
	}
	
	public static boolean checkSaveNormalItemInLevelFour() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		Thread.sleep(2000);
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
		homeMasterItemMenu.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
		homeMasterItem_ItemMenu.click();



		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));
		masterSearchTxt.click();
		masterSearchTxt.sendKeys("CopyFromParentAndIncrementLevelFour");
		masterSearchTxt.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		int count = ProductmasterGridBodyName.size();
		
		ArrayList<String> ItemNames = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			String data = ProductmasterGridBodyName.get(i).getText();
			ItemNames.add(data);
			
			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelFour")) 
			{
				Thread.sleep(1000);
				
				getAction().doubleClick(ProductmasterGridBodyName.get(i)).build().perform();
				
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

		BinTxt.click();
		Thread.sleep(2000);
		BinTxt.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();

		String expSaveItemMessage = "Saved Successfully";	
		String actSaveItemMessage = checkValidationMessage(expSaveItemMessage);
		
		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);
		
		
		
		int codecount = ProductmasterGridBodyCode.size();
		
		ArrayList<String> ItemCodes = new ArrayList<String>();
		
		for (int i = 0; i < codecount; i++) 
		{
			Thread.sleep(1000);
			String data = ProductmasterGridBodyCode.get(i).getText();
			ItemCodes.add(data);
		}
		 
		String actCodeText = ItemCodes.toString();
		String expCodeText = "[lCode00000000002, lCode00000000001]";
		
		System.out.println("actCodeText:"+actCodeText);
		System.out.println("expCodeText:"+expCodeText);
		
		if (actSaveItemMessage.equalsIgnoreCase(expSaveItemMessage) 
			&& actCodeText.equalsIgnoreCase(expCodeText))
		{
			return true;
		} 
		else 
		{	
			return false;
		}
	
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public ProductCodeIncrementalPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
