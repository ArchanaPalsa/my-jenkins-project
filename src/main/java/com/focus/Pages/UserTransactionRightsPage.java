package com.focus.Pages;

import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
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
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

import freemarker.core.ReturnInstruction.Return;

public class UserTransactionRightsPage extends BaseEngine 
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

				System.err.println("ValidationMessage    :  "+actErrorMessage);
				System.err.println("EValidationMessag    :  "+expErrorMessage);

				return actErrorMessage;
			}
			catch(Exception ee)
			{

				System.err.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);

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
	
	public static String checkValidationMessage2(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage2));
			String actErrorMessage=errorMessage2.getText();
			String expErrorMessage=ExpMessage;

			try
			{

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn2));
				errorMessageCloseBtn2.click();

				System.err.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);

				return actErrorMessage;
			}
			catch(Exception ee)
			{

				System.err.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);

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
		Thread.sleep(2500);
		
		
	    
	    Thread.sleep(2500);

		getDriver().navigate().refresh();

		LoginPageOld lp=new LoginPageOld(getDriver()); 

		String unamelt="su";

		String pawslt="su";

		boolean qflag=true;

		lp.enterUserName(unamelt);
		Thread.sleep(1200);

		lp.enterPassword(pawslt);

		Thread.sleep(1500);

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

		Thread.sleep(1500);

		lp.clickOnSignInBtn();


		Thread.sleep(2000);

		String actUserInfo1=userNameDisplay.getText();

		System.out.println("User Info  : "+actUserInfo1);

		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());

		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		//companyLogo.click();
		
		Thread.sleep(1800);

		String getCompanyTxt1=companyName.getText();
		//String getLoginCompanyName1=getCompanyTxt1.substring(0, 17);
		System.out.println("company name  :  "+ getCompanyTxt1);
		//companyLogo.click();

		String expUserInfo1           ="su";
		String expLoginCompanyName1   ="UserRestrictions";

		System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
		System.out.println("LoginCompanyName1     : "+getCompanyTxt1    +" Value Expected : "+expLoginCompanyName1);

		if(actUserInfo1.equalsIgnoreCase(expUserInfo1) && getCompanyTxt1.contains(expLoginCompanyName1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	public static boolean checkSavePurchasesVoucherForPreviousMonth() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		

		String prevMonth = PreviousMonth(-1);
		
		System.err.println("tmrw:"+prevMonth);
		
		Thread.sleep(1500);
		CheckSavePurchasesVoucher(prevMonth,"Purchase","Vendor A", "HYD", "INV", "BR-HYD","CAM", "2", "20", "12");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		

		Thread.sleep(1500);
		
		Thread.sleep(1500);

		String expMessage2 = "Voucher saved successfully";
		String actMessage2 = checkValidationMessage(expMessage2);
		
		if (actMessage2.startsWith(expMessage2)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
		
	}
	
	public static boolean checkSaveRoleWithCreatedProfileForTransactionRights() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
		securityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityCreateRoleMenu));
		homeSecurityCreateRoleMenu.click();


		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.sendKeys("UTR");
		Thread.sleep(2000);
		createRoleRoleNameCombo.sendKeys(Keys.TAB);
		
		//IsVisible(admin);
		Thread.sleep(2500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
		Select s=new Select(createRolePasswordPolicyDropdown);
		s.selectByVisibleText("QA");
		Thread.sleep(2000);


		Thread.sleep(1500);

		int avaliableprofileListCount = avaliableprofileList.size();

		for(int i=0;i<avaliableprofileListCount;i++)
		{
			String data = avaliableprofileList.get(i).getText();

			if(data.equalsIgnoreCase("Admin"))
			{
				avaliableprofileList.get(i).click();
			}
		}

		Thread.sleep(1500);
		ClickUsingJs(createRoleMOveFiledsFromLeftSideToRightSide);
		Thread.sleep(1500);
		
		ClickUsingJs(createRoleSaveicon);
		Thread.sleep(500);

		System.out.println("**************************************checkSavingRoleWithAllProfileST***********************************************");

		String expMessage= "Role saved successfully";

		String actMessage=checkValidationMessage(expMessage);


		System.out.println("Saving Message of Rolw : " +actMessage+" Value Expected : "+expMessage);
		
		ClickUsingJs(createRoleCloseIcon);
	

		if (actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");


			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");


			return false;
		}
	}

	
	public static boolean checkUserCreationForCreatedRoleForTransactionRights() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
		securityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserMenu));
		createUserMenu.click();

		Thread.sleep(6000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		createUserIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		createUserLoginNameTxt.click();
		createUserLoginNameTxt.sendKeys("UTR");
		Thread.sleep(1200);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		createUserERPRoleDropDown.click();
		createUserERPRoleDropDown.sendKeys("UTR");
		Thread.sleep(1200);

		int count = createUserERPRolesDropdownOptions.size()-1;
		System.out.println("Count "+ count);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.sendKeys("su");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.sendKeys("su");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		createUserNameTxt.sendKeys("TestUser12");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginAbbrivationTxt));
		createUserLoginAbbrivationTxt.sendKeys("tSTUSR12");
		Thread.sleep(1200);
		createUserSecurityQuestionDropDown.click();
		Select s = new Select(createUserSecurityQuestionDropDown);
		s.selectByVisibleText("In which country were you born?");
		Thread.sleep(1200);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityAnswerTxt));	
		createUserSecurityAnswerTxt.sendKeys("India");
		
		Thread.sleep(1200);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		createUserAdditionalInfoTab.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
		Select user = new Select(createUserUserTypeDrpDwn);
		user.selectByVisibleText("Customer");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		createUserEmailTxt.click();
		createUserEmailTxt.clear();
		createUserEmailTxt.sendKeys("testUser12@focussoftnet.com");

		ClickUsingJs(createUserSaveIcon);

		String expMessage = "new user created successfully";
		String actMessage = checkValidationMessage(expMessage);

		System.out.println(actMessage);
		System.out.println(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	public static boolean checkCannotEditAndCannotAddPrevMonthsTransactionDef() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		String fd = findDay();
		System.err.println("fd "+fd);
		
		Thread.sleep(1500);
		
		ClickUsingJs(homeMenu);
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
		securityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityCreateRoleMenu));
		homeSecurityCreateRoleMenu.click();


		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.sendKeys("UTR");
		Thread.sleep(2500);
		createRoleRoleNameCombo.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		
		IsVisible(admin);
		Thread.sleep(1500);
		ClickUsingJs(transactionRightsTab);			
		Thread.sleep(1500);
		IsVisible(cannotEditPreviousMonthEntriesAfterTxt);
		Thread.sleep(1500);
		clearValueFromTextBox1(cannotEditPreviousMonthEntriesAfterTxt);
		Thread.sleep(1500);
		cannotEditPreviousMonthEntriesAfterTxt.sendKeys(fd);
		Thread.sleep(1500);
		clearValueFromTextBox1(CantAddPrevMnthEntriesaftTxt);
		Thread.sleep(1500);		
		CantAddPrevMnthEntriesaftTxt.sendKeys(fd);
		Thread.sleep(1500);
		
		Select creditLimit = new Select(creditLimitWarningDropdown);
		creditLimit.selectByVisibleText("Alert");
		Thread.sleep(1500);
		
		
		Select negCashCheck = new Select(negativeCashCheckDropdown);
		negCashCheck.selectByVisibleText("Alert");
		Thread.sleep(1500);
		
		Select negStockCheck = new Select(negativeStockCheckDropdown);
		negStockCheck.selectByVisibleText("Alert");
		Thread.sleep(1500);
		
		ClickUsingJs(createRoleSaveicon);	
		

		System.out.println("**************************************checkSavingRoleWithAllProfileST***********************************************");

		String expMessage= "Role updated Successfully";

		String actMessage=checkValidationMessage(expMessage);


		System.out.println("Saving Message of Rolw : " +actMessage+" Value Expected : "+expMessage);

		ClickUsingJs(createRoleCloseIcon);
		

		if (actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");


			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");


			return false;
		}
		

	
	}
	
	
	public static boolean checkVerifyCannotEditPrevMonthsTransactioninUtr() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		getDriver().navigate().refresh();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersBtn));
		purchaseVouchersBtn.click();

		Thread.sleep(1800);
		IsVisible(newBtn);
		Thread.sleep(1800);
		
		String prevMonth = PreviousMonth(-1);
		
		System.err.println("prevMonth:"+prevMonth);
		
		Thread.sleep(1500);
		
		Thread.sleep(1500);
		
		int count = grid_DateList.size();

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_DateList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase(prevMonth)) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
					break;
				}
			}
		}    
		
		
		checkValidationMessage("Voucher loaded successfully");
		Thread.sleep(3500);;
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(1200);
		departmentTxt.sendKeys("FIN");
		Thread.sleep(1500);
		departmentTxt.sendKeys(Keys.TAB);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(1500);

		String expMessage = "You do not have rights to Add back Dated Transactions.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}	
	}
	
	
	public static boolean checkVerifyCannotAddPrevMonthsTransactioninUtr() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		Thread.sleep(3500);
		
		String prevMonth = PreviousMonth(-1);
		
		System.err.println("prevMonth:"+prevMonth);
		
		Thread.sleep(1500);
		
		Thread.sleep(1500);
		
		CheckSavePurchasesVoucher(prevMonth,"Purchase","Vendor A", "HYD", "INV", "BR-HYD","APPLE", "2", "20", "12");
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		
		Thread.sleep(1500);

		String expMessage = "You do not have rights to Add back Dated Transactions.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}	

	}
	
	public static boolean checkDefineCurrentDateForCannotEditpreviousMonthsEntriesAfter() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(1800);
		String today = getCurrentDay();
		System.err.println("today "+today);
		

		ClickUsingJs(homeMenu);
		Thread.sleep(1200);
		ClickUsingJs(homeSecurityCreateRoleMenu);		
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.sendKeys("UTR");
		Thread.sleep(1500);
		createRoleRoleNameCombo.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		IsVisible(admin);
		Thread.sleep(1500);
		ClickUsingJs(transactionRightsTab);
		Thread.sleep(1500);	
	
		cannotEditPreviousMonthEntriesAfterTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(1500);
		cannotEditPreviousMonthEntriesAfterTxt.sendKeys(today);
		Thread.sleep(1500);
		
		CantAddPrevMnthEntriesaftTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(1500);
		CantAddPrevMnthEntriesaftTxt.sendKeys(today);
		Thread.sleep(1500);
		

		Select creditLimit = new Select(creditLimitWarningDropdown);
		creditLimit.selectByVisibleText("Stop");
		Thread.sleep(1500);
		
		
		Select negCashCheck = new Select(negativeCashCheckDropdown);
		negCashCheck.selectByVisibleText("Stop");
		Thread.sleep(1500);
		
		Select negStockCheck = new Select(negativeStockCheckDropdown);
		negStockCheck.selectByVisibleText("Stop");
		Thread.sleep(1000);
	
		ClickUsingJs(createRoleSaveicon);
		

		System.out.println("**************************************checkSavingRoleWithAllProfileST***********************************************");

		String expMessage= "Role updated Successfully";

		String actMessage=checkValidationMessage(expMessage);


		System.out.println("Saving Message of Rolw : " +actMessage+" Value Expected : "+expMessage);

		ClickUsingJs(createRoleCloseIcon);
		

		if (actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");


			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");


			return false;
		}
		

	}
	
	public static boolean checkStopCreditLimitInSalesInvoices() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{


		getDriver().navigate().refresh();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
		salesInvoicesVoucher.click();
		
		Thread.sleep(2000);getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		
		
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAccountTxt));
		salesAccountTxt.sendKeys("Sales - Computers");
		Thread.sleep(1800);
		salesAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("CreditLimitCustomer");
		Thread.sleep(1800);
		customerAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(WareHouseTxtInPurchases));
		WareHouseTxtInPurchases.sendKeys("HYD");
		Thread.sleep(1800);
		WareHouseTxtInPurchases.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.sendKeys("FIN");
		Thread.sleep(1800);
		departmentTxt.sendKeys(Keys.TAB);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(branchTxt));
		branchTxt.sendKeys("BR-HYD");
		Thread.sleep(1800);
		branchTxt.sendKeys(Keys.TAB);
		

	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("CAM");
		Thread.sleep(1800);
		enter_ItemTxt.sendKeys(Keys.TAB);

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("5");
		Thread.sleep(1800);
		enter_Quantity.sendKeys(Keys.TAB);

		Thread.sleep(1500);
		
		checkValidationMessage("This transaction will make stock negative.");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(2000);
		enter_Rate.sendKeys("10");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SINV_enter_discount));
		SINV_enter_discount.sendKeys(Keys.TAB);
		
		Thread.sleep(1000);
		batchPickOnFifoBtn.click();
		Thread.sleep(1000);
		batchOkBtn.click();
		
		if (getIsAlertPresent()) 
		{
			Thread.sleep(1000);
		    getAlert().accept();
		}
		
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(1000);
		
		String expCreditLimitMsg = "This Transaction will make the Credit limit Negative. It cannot be saved Credit Limit is 100.00 whereas this transaction will make the balance as 1120.00";
		String actCreditLimitMsg = checkValidationMessage(expCreditLimitMsg);
		
		
		
		if (actCreditLimitMsg.equalsIgnoreCase(expCreditLimitMsg)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
		
	
	
	}
	
	

	public static boolean checkVerifyCannotEditPrevMonthsTransactioninUtrwithCurrentDate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		getDriver().navigate().refresh();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersBtn));
		purchaseVouchersBtn.click();
		
		Thread.sleep(1200);
		IsVisible(newBtn);

		Thread.sleep(1800);
		
		String prevMonth = PreviousMonth(-1);
		
		System.err.println("prevMonth:"+prevMonth);
		
		Thread.sleep(1500);
		
		Thread.sleep(1500);
		
		int count = grid_DateList.size();

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_DateList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase(prevMonth)) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
					break;
				}
			}
		}    
		
		
		checkValidationMessage("Voucher loaded successfully");
		Thread.sleep(1500);;
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(1200);
		departmentTxt.sendKeys("FIN");
		Thread.sleep(1500);
		departmentTxt.sendKeys(Keys.TAB);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(1500);
		
		
		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		

		Thread.sleep(1500);
		
		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 13";
		
		String actMessage = checkValidationMessage(expMessage1);
		Thread.sleep(1500);
		
		System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
		

		if (actMessage.startsWith(expMessage1) 
				&& actMessage.endsWith(expMessage2)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}	
	}
	
	
	public static boolean checkVerifyCannotAddPrevMonthsTransactioninUtrwithCurrentDate() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		Thread.sleep(1800);
		
		String prevMonth = PreviousMonth(-1);
		
		System.err.println("prevMonth:"+prevMonth);
		
		Thread.sleep(1500);
		
		Thread.sleep(1500);
		
		CheckSavePurchasesVoucher(prevMonth,"Purchase","Vendor A", "HYD", "INV", "BR-HYD","APPLE", "2", "20", "12");
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		

		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		

		Thread.sleep(1500);
		
		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 15";
		
		String actMessage = checkValidationMessage(expMessage1);
		Thread.sleep(1500);
		
		System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
		

		if (actMessage.startsWith(expMessage1) 
				&& actMessage.endsWith(expMessage2)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}	

	}
	

	public static boolean checkEnableCannotAddFutureTransactionsChcBx() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
		securityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityCreateRoleMenu));
		homeSecurityCreateRoleMenu.click();


		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.sendKeys("UTR");
		Thread.sleep(1500);
		createRoleRoleNameCombo.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		IsVisible(admin);
		Thread.sleep(1200);
		
		ClickUsingJs(transactionRightsTab);
		Thread.sleep(1500);
		
		
		if(cantaddfutureTransChkbox.isSelected()==false)
		{
			cantaddfutureTransChkbox.click();
		}
		
		Thread.sleep(1500);
		clearValueFromTextBox1(cannotAddTransThatAreMoreThanTxt);
		Thread.sleep(1200);
		cannotAddTransThatAreMoreThanTxt.sendKeys("10");
		Thread.sleep(1500);
		clearValueFromTextBox1(CantEditTransthatAreremorethanTxt);
		Thread.sleep(1200);		
		CantEditTransthatAreremorethanTxt.sendKeys("5");
		Thread.sleep(1500);
		
		

		if(doNotAllowMasterCustomizationS.isSelected()==false)
		{
			doNotAllowMasterCustomization.click();
		}
		
		

		if(doNotAllowBatchCustomizationS.isSelected()==false)
		{
			doNotAllowBatchCustomization.click();
		}
		
		
		ClickUsingJs(createRoleSaveicon);
		Thread.sleep(1500);
		

		System.out.println("**************************************checkSavingRoleWithAllProfileST***********************************************");

		String expMessage= "Role updated Successfully";

		String actMessage=checkValidationMessage(expMessage);


		System.out.println("Saving Message of Rolw : " +actMessage+" Value Expected : "+expMessage);
		
		ClickUsingJs(createRoleCloseIcon);
		Thread.sleep(1500);
		

		if (actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");


			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");


			return false;
		}
		

	}
	
	public static boolean checkLogoutFromSuandLoginToUTR() throws InterruptedException
	{
		
		Thread.sleep(3500);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(LogoutDropdown));
		LogoutDropdown.click();
		Thread.sleep(2500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		Thread.sleep(1800);
		
		
		LoginPageOld lp=new LoginPageOld(getDriver()); 

		String unamelt="UTR";

		String pawslt="su";

		boolean qflag=true;

		lp.enterUserName(unamelt);

		lp.enterPassword(pawslt);

		Thread.sleep(1500);

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

		Thread.sleep(1500);

		lp.clickOnSignInBtn();

		Thread.sleep(1500);

		String actUserInfo1=userNameDisplay.getText();

		System.out.println("User Info  : "+actUserInfo1);

		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());

		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		//companyLogo.click();
		
		Thread.sleep(1200);

		String getCompanyTxt1=companyName.getText();
		//String getLoginCompanyName1=getCompanyTxt1.substring(0, 17);
		System.out.println("company name  :  "+ getCompanyTxt1);
		//companyLogo.click();

		String expUserInfo1           ="UTR";
		String expLoginCompanyName1   ="UserRestrictions";

		System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
		System.out.println("LoginCompanyName1     : "+getCompanyTxt1    +" Value Expected : "+expLoginCompanyName1);

		if(actUserInfo1.equalsIgnoreCase(expUserInfo1) && getCompanyTxt1.contains(expLoginCompanyName1))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	

	public static void CheckSavePurchasesVoucher(String date, String purAcc,String VenAcc, String Warehouse, String dept,String branch,String item,String quantity,String rate,String batch) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		Thread.sleep(1500);
		getDriver().navigate().refresh();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersBtn));
		purchaseVouchersBtn.click();
		Thread.sleep(1500);
		IsVisible(newBtn);

		Thread.sleep(3000);

		Thread.sleep(4500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateText));
		dateText.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(1500);
		dateText.sendKeys(date);
		Thread.sleep(1500);
		dateText.sendKeys(Keys.TAB);
		
	
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesAccTxt));
		purchasesAccTxt.sendKeys(purAcc);
		Thread.sleep(1500);
		purchasesAccTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(VenAcc);
		Thread.sleep(1500);
		vendorAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(WareHouseTxtInPurchases));
		WareHouseTxtInPurchases.sendKeys(Warehouse);
		Thread.sleep(1500);
		WareHouseTxtInPurchases.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.sendKeys(dept);
		Thread.sleep(1500);
		departmentTxt.sendKeys(Keys.TAB);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(branchTxt));
		branchTxt.sendKeys(branch);
		Thread.sleep(1500);
		branchTxt.sendKeys(Keys.TAB);
		

	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(item);
		Thread.sleep(1500);
		enter_ItemTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys(quantity);
		Thread.sleep(1500);
		enter_Quantity.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys(rate);
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_6thColumn));
		select1stRow_6thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_BatchTxt));
		enter_BatchTxt.sendKeys(batch);
		Thread.sleep(1500);
		enter_BatchTxt.sendKeys(Keys.TAB);
		
	}
	

	public static boolean checkCreateAPurchaseVoucherandVerifyTransactionforFutureDate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("today:"+getCurrentDateF2());
		
		System.err.println("tmrw:"+findNextDay());
		
		String nextday = findNextDay();
		
		String prevDay = findpastDay(-11);
		
		System.err.println("tmrw:"+prevDay);
		
		Thread.sleep(1500);
		getDriver().navigate().refresh();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersBtn));
		purchaseVouchersBtn.click();

		Thread.sleep(1200);
		IsVisible(newBtn);
		Thread.sleep(1800);

		Thread.sleep(2000);getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateText));
		dateText.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(1500);
		dateText.sendKeys(nextday);
		Thread.sleep(1500);
		dateText.sendKeys(Keys.TAB);
		
	
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesAccTxt));
		purchasesAccTxt.sendKeys("Purchase");
		Thread.sleep(1500);
		purchasesAccTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys("Vendor A");
		Thread.sleep(1500);
		vendorAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(WareHouseTxtInPurchases));
		WareHouseTxtInPurchases.sendKeys("HYD");
		Thread.sleep(1500);
		WareHouseTxtInPurchases.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.sendKeys("INV");
		Thread.sleep(1500);
		departmentTxt.sendKeys(Keys.TAB);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(branchTxt));
		branchTxt.sendKeys("BR-HYD");
		Thread.sleep(1500);
		branchTxt.sendKeys(Keys.TAB);
		

	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("APPLE");
		Thread.sleep(1500);
		enter_ItemTxt.sendKeys(Keys.TAB);

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("2");
		Thread.sleep(1500);
		enter_Quantity.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("20");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_6thColumn));
		select1stRow_6thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_BatchTxt));
		enter_BatchTxt.sendKeys("12");
		Thread.sleep(1500);
		enter_BatchTxt.sendKeys(Keys.TAB);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(1500);

		String expMessage = "You do not have rights to Add Future Date Transactions";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	public static boolean checkLogoutANDLoginWithSU() throws InterruptedException
	{
		
		Thread.sleep(2500);
		
		ClickUsingJs(LogoutDropdown);
	
		Thread.sleep(1100);
		ClickUsingJs(logoutOption);
		
		Thread.sleep(1100);	
		
		Thread.sleep(1800);
		
		
		LoginPageOld lp=new LoginPageOld(getDriver()); 

		String unamelt="su";

		String pawslt="su";

		boolean qflag=true;
		
		Thread.sleep(2500);

		lp.enterUserName(unamelt);

		lp.enterPassword(pawslt);

		Thread.sleep(1500);

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

		Thread.sleep(1500);

		lp.clickOnSignInBtn();

		Thread.sleep(1500);

		String actUserInfo1=userNameDisplay.getText();

		System.out.println("User Info  : "+actUserInfo1);

		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());

		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		//companyLogo.click();
		
		Thread.sleep(1200);

		String getCompanyTxt1=companyName.getText();
		//String getLoginCompanyName1=getCompanyTxt1.substring(0, 17);
		System.out.println("company name  :  "+ getCompanyTxt1);
		//companyLogo.click();

		String expUserInfo1           ="SU";
		String expLoginCompanyName1   ="UserRestrictions";

		System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
		System.out.println("LoginCompanyName1     : "+getCompanyTxt1    +" Value Expected : "+expLoginCompanyName1);

		if(actUserInfo1.equalsIgnoreCase(expUserInfo1) && getCompanyTxt1.contains(expLoginCompanyName1))
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
	
	
	
	
	public static boolean checkValidateCantAddTransactionOfDaysOld() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		String prevDay = findpastDay(-11);
		
		System.err.println("tmrw:"+prevDay);
		
		Thread.sleep(1500);
		
		CheckSavePurchasesVoucher(prevDay,"Purchase","Vendor A", "HYD", "INV", "BR-HYD","APPLE", "2", "20", "12");
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(1500);

		String expMessage = "You do not have rights to Add back Dated Transactions.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
		
	}
	
	
	public static boolean checkwithOnAndAfterDaysValidation() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		String OnThatDay = findpastDay(-10);
		
		System.err.println("tmrw:"+OnThatDay);
		
		Thread.sleep(1500);
		
		CheckSavePurchasesVoucher(OnThatDay,"Purchase","Vendor A", "HYD", "INV", "BR-HYD","APPLE", "2", "20", "67");
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		Thread.sleep(1000);
		
		String expMessage = "This Transaction cannot be Saved as it violates the policy of Old Transactions.";
		String actMessage = checkValidationMessage(expMessage);
		
		System.out.println("actMessage:"+actMessage);
		System.out.println("expMessage:"+expMessage);
		
		

		String OnNextDay = findpastDay(-9);
		
		System.err.println("tmrw:"+OnNextDay);
		
		Thread.sleep(1500);
		

		CheckSavePurchasesVoucher(OnNextDay,"Purchase","Vendor A", "HYD", "INV", "BR-HYD","APPLE", "2", "20", "b12");
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		

		Thread.sleep(1000);

		String expMessage2 = "Voucher saved successfully";
		String actMessage2 = checkValidationMessage(expMessage2);
		
		if (actMessage.equalsIgnoreCase(expMessage) && actMessage2.startsWith(expMessage2)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
		
	
	}
	
	
	public static boolean checkCannotEditTransactionThatAreMoreThanFiveDays() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		getDriver().navigate().refresh();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersBtn));
		purchaseVouchersBtn.click();

		Thread.sleep(1800);
		
		String OnNextDay = findpastDay(-9);
		
		System.err.println("tmrw:"+OnNextDay);
		
		Thread.sleep(1500);
		
		Thread.sleep(1500);
		
		int count = grid_DateList.size();

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_DateList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase(OnNextDay)) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
					break;
				}
			}
		}    
		
		checkValidationMessage("Voucher loaded successfully");
		Thread.sleep(1500);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(1200);
		departmentTxt.sendKeys("FIN");
		Thread.sleep(1500);
		departmentTxt.sendKeys(Keys.TAB);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		

		Thread.sleep(1500);
		
		Thread.sleep(1500);

		String expMessage = "This Transaction cannot be Edited as it violates the policy of Old Transactions.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
	}
	
	
	public static boolean checkADDAndEditTransactionsThatAre4DaysOld() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		String FourDaysPst = findpastDay(-4);
		
		System.err.println("tmrw:"+FourDaysPst);
		
		Thread.sleep(1500);
		CheckSavePurchasesVoucher(FourDaysPst,"Purchase","Vendor A", "HYD", "INV", "BR-HYD","APPLE", "2", "20", "12");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		

		Thread.sleep(1500);
		
		Thread.sleep(1500);

		String expMessage2 = "Voucher saved successfully";
		String actMessage2 = checkValidationMessage(expMessage2);
		
		
		Thread.sleep(2500);
		TransactionCloseBtn.click();
		
		Thread.sleep(2500);
		
		int count = grid_DateList.size();

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_DateList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase(FourDaysPst)) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
					break;
				}
			}
		}    
		
		
		checkValidationMessage("Voucher loaded successfully");
		Thread.sleep(1500);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(1200);
		departmentTxt.sendKeys("FIN");
		Thread.sleep(1500);
		departmentTxt.sendKeys(Keys.TAB);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(1500);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		

		Thread.sleep(1500);

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.startsWith(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
		
	
		
		
		
	}
	
	
	public static boolean checkBatchCannotBeCustomizedValidationandMasterCustInSalesInvoice() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		getDriver().navigate().refresh();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
		salesInvoicesVoucher.click();
		
		Thread.sleep(2000);getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		
		
		
		String ActstyleTxt = salesAccountTxtCustBtn.getAttribute("style");
		String ExpStyleTxt = "font-size: 15px; color: lightgray; pointer-events: none;";
		
	
		
		
		System.out.println("ActstyleTxt:"+ActstyleTxt);
		System.out.println("ExpStyleTxt:"+ExpStyleTxt);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAccountTxt));
		salesAccountTxt.sendKeys("Sales - Computers");
		Thread.sleep(1500);
		salesAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("Customer A");
		Thread.sleep(1500);
		customerAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(WareHouseTxtInPurchases));
		WareHouseTxtInPurchases.sendKeys("HYD");
		Thread.sleep(1500);
		WareHouseTxtInPurchases.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.sendKeys("FIN");
		Thread.sleep(1500);
		departmentTxt.sendKeys(Keys.TAB);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(branchTxt));
		branchTxt.sendKeys("BR-HYD");
		Thread.sleep(1500);
		branchTxt.sendKeys(Keys.TAB);
		

	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("APPLE");
		Thread.sleep(1500);
		enter_ItemTxt.sendKeys(Keys.TAB);

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("2");
		Thread.sleep(1500);
		enter_Quantity.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(1200);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SINV_enter_discount));
		SINV_enter_discount.sendKeys(Keys.TAB);
		
		
		Thread.sleep(2500);
		int count = batchFooterButtons.size();

		ArrayList<String> batchButtonNames = new ArrayList<String>();

		for (int i = 0; i < count; i++) 
		{
			String data = batchFooterButtons.get(i).getText();
			batchButtonNames.add(data);
		}

		String actbatchButtonList = batchButtonNames.toString();
		String expbatchButtonList = "[Pick on FIFO, Ok, Cancel]";

		System.out.println("actbatchButtonList: "+actbatchButtonList);
		System.out.println("expbatchButtonList: "+expbatchButtonList);

		Thread.sleep(1200);
		batchCancelBtn.click();
		Thread.sleep(1200);
		ClickUsingJs(new_CloseBtn);
		Thread.sleep(1800);
		ClickUsingJs(contentChangeYesBtn);
		Thread.sleep(1800);
		
		
		if (ActstyleTxt.contains(ExpStyleTxt) && actbatchButtonList.equalsIgnoreCase(expbatchButtonList))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
	}
	
	public static boolean checkEnableCreditLimitInARAP() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		Thread.sleep(1000);
		ClickUsingJs(settingsmenuBtn);		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PreferencesBtn));
		PreferencesBtn.click();		
		Thread.sleep(1000);
		ClickUsingJs(AccountsBtn);
		Thread.sleep(1500);
		
		if (acc_NegCashBankChkboxSelected.isSelected() == false) 
		{
			acc_NegCashBankChkbox.click();
		}
		
		Thread.sleep(1500);
		ClickUsingJs(InventoryBtn);		
		
		if (CheckNegativeStockChkBoxSelected.isSelected() == false) {
			CheckNegativeStockChkBox.click();
		}

		Thread.sleep(1500);
		ClickUsingJs(ARAPBtn);
		Thread.sleep(1500);

		if (enableCreditCheckBoxS.isSelected() == false) {
			enableCreditCheckBox.click();
		}		
	
	
		Thread.sleep(1000);
		if(creditLimitAuthToCustGrpschkbxS.isSelected() == false) 
		{
			creditLimitAuthToCustGrpschkbx.click();
		}
		
		
		ClickUsingJs(updateBtnInDc);
		Thread.sleep(1200);

		getWaitForAlert();
		getAlert().accept();
		Thread.sleep(2500);
		
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs="Do you want to save the changes?";
		Thread.sleep(1200);
		System.out.println("actAlertMgs   :"+actAlertMgs);
		System.out.println("expAlertMgs   :"+expAlertMgs);
		Thread.sleep(1200);
		getAlert().accept();

		Thread.sleep(1500);
		
		String expSaveMessage = "Data saved Successfully";
		String actSaveMessage = checkValidationMessage(expSaveMessage);
		
		
		
		if (actAlertMgs.equalsIgnoreCase(expAlertMgs) && actSaveMessage.equalsIgnoreCase(expSaveMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}

	}
	
	public static boolean checkCreateCustAccountInWithCreditLimit() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		Thread.sleep(1500);
		
		ClickUsingJs(homeMenu);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));
		masterAddGroupBtn.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		nameTxt.clear();
		nameTxt.sendKeys("CreditGroup");
		nameTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("CG");
		codeTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);


		Select actype = new Select(accountTypeDropdown);
		actype.selectByVisibleText("Customer");	
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditLimitTxt));
		creditLimitTxt.click();
		creditLimitTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(1000);
		creditLimitTxt.sendKeys("100");
		creditLimitTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		String expMessage="Saved Successfully";

		String actMessage=checkValidationMessage(expMessage);


		Thread.sleep(2500);
		closeBtn.click();
		Thread.sleep(2500);
		getDriver().navigate().refresh();
		Thread.sleep(2500);
		

		ClickUsingJs(homeMenu);
		Thread.sleep(1500);	

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(2000);

		int count = masterGridBodyName.size();

		ArrayList<String> AccountNames = new ArrayList<String>();

		for (int i = 0; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);
			Thread.sleep(2000);
			if (data.equalsIgnoreCase("CreditGroup")) 
			{

				Thread.sleep(2000);
				getAction().doubleClick(masterGridBodyChkbox.get(i)).build().perform();
				break;
			}
		}

		
		Thread.sleep(2500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();


		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		nameTxt.clear();
		nameTxt.sendKeys("CreditLimitCustomer");
		nameTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("CLC");
		codeTxt.sendKeys(Keys.TAB);



		actype.selectByVisibleText("Customer");	
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditLimitTxt));
		creditLimitTxt.click();
		creditLimitTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(1000);
		creditLimitTxt.sendKeys("100");
		creditLimitTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		String expMessage1="Saved Successfully";

		String actMessage1=checkValidationMessage(expMessage1);

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		nameTxt.clear();
		nameTxt.sendKeys("ReqCreditLimitCustomer");
		nameTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("RCLC");
		codeTxt.sendKeys(Keys.TAB);



		actype.selectByVisibleText("Customer");	
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditLimitTxt));
		creditLimitTxt.click();
		creditLimitTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(1000);
		creditLimitTxt.sendKeys("200");
		creditLimitTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		String expMessage2="Saved Successfully";

		String actMessage2=checkValidationMessage(expMessage2);

		if (actMessage.equalsIgnoreCase(expMessage) && actMessage1.equalsIgnoreCase(expMessage1) && actMessage2.equalsIgnoreCase(expMessage2)) 
		{
			return true;
		}
		else 
		{
			return false;
		}

	}
	

	
	public static boolean checkSaveExcessInStockVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(1500);
		getDriver().navigate().refresh();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsStocksMenu));
		inventoryTransactionsStocksMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(excessInStocksBtn));
		excessInStocksBtn.click();

		Thread.sleep(1800);

		Thread.sleep(2000);getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(WareHouseTxtInPurchases));
		WareHouseTxtInPurchases.sendKeys("HYD");
		Thread.sleep(1500);
		WareHouseTxtInPurchases.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("Apple");
		Thread.sleep(1500);
		enter_ItemTxt.sendKeys(Keys.TAB);

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("50");
		Thread.sleep(1500);
		enter_Quantity.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_BatchTxt));
		enter_BatchTxt.sendKeys("BATCH321");
		Thread.sleep(1500);
		enter_BatchTxt.sendKeys(Keys.TAB);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(1000);
		
		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 3";
		
		String actMessage = checkValidationMessage(expMessage1);
		Thread.sleep(1500);
		
		System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
		
		
		if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
		{
			
			return true;
		} 
		else 
		{
			
			
			return false;
		}
		
	}
	
	
	public static boolean checkSaveSalesInvoicesForCreditLimitAlert() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		getDriver().navigate().refresh();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
		salesInvoicesVoucher.click();
		Thread.sleep(2500);
		
		IsVisible(newBtn);
		Thread.sleep(3500);
		Thread.sleep(2000);getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAccountTxt));
		salesAccountTxt.sendKeys("Sales - Computers");
		Thread.sleep(1800);
		salesAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("CreditLimitCustomer");
		Thread.sleep(1800);
		customerAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(WareHouseTxtInPurchases));
		WareHouseTxtInPurchases.sendKeys("HYD");
		Thread.sleep(1800);
		WareHouseTxtInPurchases.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.sendKeys("FIN");
		Thread.sleep(1800);
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(branchTxt));
		branchTxt.sendKeys("BR-HYD");
		Thread.sleep(1800);
		branchTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("APPLE");
		Thread.sleep(1800);
		enter_ItemTxt.sendKeys(Keys.TAB);

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("10");
		Thread.sleep(1800);
		//enter_Quantity.sendKeys(Keys.TAB);

		Thread.sleep(2500);
		
		ClickUsingJs(select1stRow_3rdColumn);
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("110");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SINV_enter_discount));
		SINV_enter_discount.sendKeys(Keys.TAB);
		
		Thread.sleep(5000);
		ClickUsingJs(batchPickOnFifoBtn);
		
		Thread.sleep(1000);
		ClickUsingJs(batchOkBtn);
		Thread.sleep(1200);
		
		ClickUsingJs(voucherSaveBtn);
		
		Thread.sleep(1000);
		                            
		String expCreditLimitMsg = "This Transaction will make the Credit Limit Negative Credit Limit is 100.00 whereas this transaction will make the balance as 1100.00";
		String actCreditLimitMsg = checkValidationMessage(expCreditLimitMsg);
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		Thread.sleep(1000);
		
		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 8";
		
		String actMessage = checkValidationMessage(expMessage1);
		Thread.sleep(1500);
		
		System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
		
		if (actCreditLimitMsg.equalsIgnoreCase(expCreditLimitMsg) && actMessage.startsWith(expMessage1) 
				&& actMessage.endsWith(expMessage2)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
		
	
	}
	
	
	public static boolean checkSavePaymentsForNegativeCashAlertValidation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		getDriver().navigate().refresh();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(paymentsVoucher));
		paymentsVoucher.click();

		Thread.sleep(2000);getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		

		Thread.sleep(1500);
		cashAndBankAccTxt.sendKeys("Cash");
		Thread.sleep(1800);
		cashAndBankAccTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.sendKeys("FIN");
		Thread.sleep(1800);
		departmentTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_SalesAccountTxt));
		enter_SalesAccountTxt.sendKeys("Vendor A");
		Thread.sleep(1800);
		enter_SalesAccountTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AmountTxt));
		enter_AmountTxt.sendKeys("500");
		Thread.sleep(1800);
		enter_AmountTxt.sendKeys(Keys.TAB);
		

		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(1000);
		                            
		String expMsg = "This Transaction will make the Cash Account Negative";
		String actMsg = checkValidationMessage(expMsg);
		
		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 3";
		
		String actMessage = checkValidationMessage(expMessage1);
		Thread.sleep(1500);
		
		System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
		
		
		if (actMsg.equalsIgnoreCase(expMsg) && actMessage.startsWith(expMessage1) 
				&& actMessage.endsWith(expMessage2))
		{
			return true;
		} 
		else
		{
			return false;
		}
		
	}
	
	
	public static boolean checkSaveRecieiptsForNegCashAlertValidation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getDriver().navigate().refresh();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsVoucher));
		receiptsVoucher.click();

		Thread.sleep(2000);getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		

		Thread.sleep(1500);
		cashAndBankAccTxt.sendKeys("Cash");
		Thread.sleep(1800);
		cashAndBankAccTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.sendKeys("FIN");
		Thread.sleep(1800);
		departmentTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_SalesAccountTxt));
		enter_SalesAccountTxt.sendKeys("Customer A");
		Thread.sleep(1800);
		enter_SalesAccountTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AmountTxt));
		enter_AmountTxt.sendKeys("-100");
		Thread.sleep(1800);
		enter_AmountTxt.sendKeys(Keys.TAB);
		

		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(1200);
		                            
		String expMsg = "This Transaction will make the Cash Account Negative";
		String actMsg = checkValidationMessage(expMsg);
		
		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 3";
		
		String actMessage = checkValidationMessage(expMessage1);
		Thread.sleep(1500);
		
		System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
		
		
		if (actMsg.equalsIgnoreCase(expMsg) && actMessage.startsWith(expMessage1) 
				&& actMessage.endsWith(expMessage2))
		{
			return true;
		} 
		else
		{
			return false;
		}
		
	
	}
	
	public static boolean checkSaveSalesInvoicesForalertNegStockValidation() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		getDriver().navigate().refresh();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
		salesInvoicesVoucher.click();
		
		Thread.sleep(2000);getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAccountTxt));
		salesAccountTxt.sendKeys("Sales - Computers");
		Thread.sleep(1800);
		salesAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("Customer A");
		Thread.sleep(1800);
		customerAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(WareHouseTxtInPurchases));
		WareHouseTxtInPurchases.sendKeys("HYD");
		Thread.sleep(1800);
		WareHouseTxtInPurchases.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.sendKeys("FIN");
		Thread.sleep(1800);
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(branchTxt));
		branchTxt.sendKeys("BR-HYD");
		Thread.sleep(1800);
		branchTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("APPLE");
		Thread.sleep(1800);
		enter_ItemTxt.sendKeys(Keys.TAB);

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("42");
		Thread.sleep(1800);
		enter_Quantity.sendKeys(Keys.TAB);

		Thread.sleep(1500);
		
		String expStockMsg = "This Transaction will make Stock Negative.";
		String actStockMsg = checkValidationMessage(expStockMsg);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(1000);
		enter_Rate.sendKeys("10");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SINV_enter_discount));
		SINV_enter_discount.sendKeys(Keys.TAB);
		
		Thread.sleep(1000);
		batchPickOnFifoBtn.click();
		Thread.sleep(1000);
		batchOkBtn.click();
		
		Thread.sleep(1000);
		

	
		if (getIsAlertPresent()) 
		{
			getAlert().accept();
			Thread.sleep(1000);
		}
		
		Thread.sleep(1000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(1000);
		                            
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 9";
		
		String actMessage = checkValidationMessage(expMessage1);
		Thread.sleep(1500);
		
		System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
		
		if (actStockMsg.equalsIgnoreCase(expStockMsg) && actMessage.startsWith(expMessage1) 
				&& actMessage.endsWith(expMessage2)) 
		{	ClickUsingJs(new_CloseBtn);
			Thread.sleep(1500);
			return true;
		} 
		else 
		{
			ClickUsingJs(new_CloseBtn);
			Thread.sleep(1500);
			return false;
		}
		
	}
	
	
	public static boolean checkSavePaymentsVoucherForNegativeCashStopValidation() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		getDriver().navigate().refresh();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(paymentsVoucher));
		paymentsVoucher.click();
		Thread.sleep(1200);
		IsVisible(newBtn);
		Thread.sleep(1200);
		Thread.sleep(2000);getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		

		Thread.sleep(1500);
		cashAndBankAccTxt.sendKeys("Cash");
		Thread.sleep(1800);
		cashAndBankAccTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.sendKeys("FIN");
		Thread.sleep(1800);
		departmentTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_SalesAccountTxt));
		enter_SalesAccountTxt.sendKeys("Vendor A");
		Thread.sleep(1800);
		enter_SalesAccountTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AmountTxt));
		enter_AmountTxt.sendKeys("500");
		Thread.sleep(1800);
		enter_AmountTxt.sendKeys(Keys.TAB);
		

		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(1000);
		                       
		String expMsg = "This Transaction will make the Cash Account Negative. It cannot be saved";
		String actMsg = checkValidationMessage(expMsg);
		
		System.out.println("actMsg   :"+actMsg);
		System.out.println("actMsg   :"+actMsg);
		
		
		
		if (actMsg.equalsIgnoreCase(expMsg))
		{
			return true;
		} 
		else
		{
			return false;
		}
		
	
	}
	
	public static boolean checkReceiptsVoucherForNegCashStopValidation() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		

		getDriver().navigate().refresh();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsVoucher));
		receiptsVoucher.click();

		Thread.sleep(2000);getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		

		Thread.sleep(1500);
		cashAndBankAccTxt.sendKeys("Cash");
		Thread.sleep(1800);
		cashAndBankAccTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.sendKeys("FIN");
		Thread.sleep(1800);
		departmentTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_SalesAccountTxt));
		enter_SalesAccountTxt.sendKeys("Customer A");
		Thread.sleep(1800);
		enter_SalesAccountTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AmountTxt));
		enter_AmountTxt.sendKeys("-100");
		Thread.sleep(1800);
		enter_AmountTxt.sendKeys(Keys.TAB);
		

		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(1000);
		                       
		String expMsg = "This Transaction will make the Cash Account Negative. It cannot be saved";
		String actMsg = checkValidationMessage(expMsg);
		
		
		
		if (actMsg.equalsIgnoreCase(expMsg))
		{
			return true;
		} 
		else
		{
			return false;
		}
		
	
	
		
	}
	
	public static boolean checkSavePurchasesVoucherForStdItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(1500);
		getDriver().navigate().refresh();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersBtn));
		purchaseVouchersBtn.click();

		Thread.sleep(2000);

		Thread.sleep(2000);getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
	
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesAccTxt));
		purchasesAccTxt.sendKeys("Purchase");
		Thread.sleep(1500);
		purchasesAccTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys("Vendor A");
		Thread.sleep(1500);
		vendorAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(WareHouseTxtInPurchases));
		WareHouseTxtInPurchases.sendKeys("HYD");
		Thread.sleep(1500);
		WareHouseTxtInPurchases.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.sendKeys("FIN");
		Thread.sleep(1500);
		departmentTxt.sendKeys(Keys.TAB);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(branchTxt));
		branchTxt.sendKeys("BR-HYD");
		Thread.sleep(1500);
		branchTxt.sendKeys(Keys.TAB);
		

	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("STD RATE ITEM");
		Thread.sleep(1500);
		enter_ItemTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("10");
		Thread.sleep(1500);
		enter_Quantity.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
	
		                            
		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 14";
		
		String actMessage = checkValidationMessage(expMessage1);
		Thread.sleep(1500);
		
		System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
		
		if (actMessage.startsWith(expMessage1) 
				&& actMessage.endsWith(expMessage2)) 
		{
			return true;
		}
		else 
		{
			return false;
		}
		
		
		
	}
	
	public static boolean checkSaveSalesInvoicesVoucherForNegativeStockStopValidation() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{



		getDriver().navigate().refresh();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
		salesInvoicesVoucher.click();
		
		Thread.sleep(2000);getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		
		
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAccountTxt));
		salesAccountTxt.sendKeys("Sales - Computers");
		Thread.sleep(1800);
		salesAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("Customer A");
		Thread.sleep(1800);
		customerAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(WareHouseTxtInPurchases));
		WareHouseTxtInPurchases.sendKeys("HYD");
		Thread.sleep(1800);
		WareHouseTxtInPurchases.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.sendKeys("FIN");
		Thread.sleep(1800);
		departmentTxt.sendKeys(Keys.TAB);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(branchTxt));
		branchTxt.sendKeys("BR-HYD");
		Thread.sleep(1800);
		branchTxt.sendKeys(Keys.TAB);
		

	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("STD RATE ITEM");
		Thread.sleep(1800);
		enter_ItemTxt.sendKeys(Keys.TAB);

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("30");
		Thread.sleep(1800);
		enter_Quantity.sendKeys(Keys.TAB);

		Thread.sleep(1500);
		
		String expStockMsg = "This Transaction will make Stock negative.";
		String actStockMsg = checkValidationMessage(expStockMsg);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(1000);
		enter_Rate.sendKeys("10");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SINV_enter_discount));
		SINV_enter_discount.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		

		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		Thread.sleep(1000);
        
		String expStockMsg2 = "This Transaction will make the Stock negative. It cannot be saved";
		String actStockMsg2 = checkValidationMessage(expStockMsg2);
	
		if (actStockMsg.equalsIgnoreCase(expStockMsg) && actStockMsg2.equalsIgnoreCase(expStockMsg2)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
		
	
	
	
	}
	
	
	public static boolean checkRequestForCreditLimitInTransactionRights() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
		securityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityCreateRoleMenu));
		homeSecurityCreateRoleMenu.click();


		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.sendKeys("UTR");
		Thread.sleep(1500);
		createRoleRoleNameCombo.sendKeys(Keys.TAB);
		Thread.sleep(1200);
		IsVisible(admin);
		Thread.sleep(1500);
		
		ClickUsingJs(transactionRightsTab);
		Thread.sleep(2500);
		
		
		
		Select creditLimit = new Select(creditLimitWarningDropdown);
		creditLimit.selectByVisibleText("Request credit limit increase");
		Thread.sleep(1500);
		
		
		/*Select negCashCheck = new Select(negativeCashCheckDropdown);
		negCashCheck.selectByVisibleText("Alert");
		Thread.sleep(1000);
		
		Select negStockCheck = new Select(negativeStockCheckDropdown);
		negStockCheck.selectByVisibleText("Alert");
		Thread.sleep(1000);
		*/
		Thread.sleep(1500);
		
		
		ClickUsingJs(createRoleSaveicon);
		Thread.sleep(1500);
	

		System.out.println("**************************************checkSavingRoleWithAllProfileST***********************************************");

		String expMessage= "Role updated Successfully";

		String actMessage=checkValidationMessage(expMessage);


		System.out.println("Saving Message of Rolw : " +actMessage+" Value Expected : "+expMessage);
		ClickUsingJs(createRoleCloseIcon);
		Thread.sleep(1500);
		

		if (actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");


			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");


			return false;
		}
		

	
	}
	
	
	public static boolean checkDefineCreditLimitAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		ClickUsingJs(settingsmenuBtn);
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsCreditLimitAuthorization));
		settingsCreditLimitAuthorization.click();
		
		Thread.sleep(1500);
		IsVisible(CLA_NameTxt);
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_NameTxt));
		CLA_NameTxt.click();
		Thread.sleep(1000);
		CLA_NameTxt.sendKeys("CreditLimit");
		Thread.sleep(1000);
		CLA_NameTxt.sendKeys(Keys.TAB);
		

		 Thread.sleep(1000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_FromValueTxt));
		 CLA_FromValueTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		 CLA_FromValueTxt.sendKeys("1");
		 CLA_FromValueTxt.sendKeys(Keys.TAB);

		 Thread.sleep(1000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_ToValueTxt));
		 CLA_ToValueTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		 CLA_ToValueTxt.sendKeys("1000");
		 CLA_ToValueTxt.sendKeys(Keys.TAB);
		 
		 Thread.sleep(1000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_CreditDaysTxt));
		 CLA_CreditDaysTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		 CLA_CreditDaysTxt.sendKeys("5");
		 CLA_CreditDaysTxt.sendKeys(Keys.TAB);
		 
		 int count=CLA_AllUsersChkBoxList.size();

		 ArrayList<String >users=new ArrayList<String>();

		 for (int i = 0; i < count; i++) 
		 {
			 String data=CLA_AllUsersChkBoxList.get(i).getText();
			 if (data.equalsIgnoreCase("RER")) 
			 {
				 CLA_AllUsersChkBoxList.get(i).click();
			 }
		 }
		 
		 Thread.sleep(3500);
		 
		 ClickUsingJs(CLA_SaveBtn);	

		 String ExpMessage="Record saved successfully";
		 String actMessage=checkValidationMessage(ExpMessage);
		 Thread.sleep(1200);
		 System.out.println("actMessage   :"+actMessage);
		 System.out.println("ExpMessage   :"+ExpMessage);	 
		 
		
		 
		 if (actMessage.equalsIgnoreCase(ExpMessage))
		 {
			
			 return true;
		 } 
		 else 
		 {
			
			 return false;
		 }


	}
	
	public static boolean checkMapCreditLimitWithCreatedAuthorizationdef() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		Thread.sleep(1200);
		ClickUsingJs(settingsmenuBtn);
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMapCreditLimit));
		settingsMapCreditLimit.click();
		Thread.sleep(1500);
		IsVisible(select1stRow_1stColumnMapCr);
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumnMapCr));
		select1stRow_1stColumnMapCr.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustomerGroupMapCr));
		CustomerGroupMapCr.sendKeys("CreditGroup");
		Thread.sleep(1800);
		CustomerGroupMapCr.sendKeys(Keys.TAB);
		
		AuthorizationFlowMapCr.sendKeys("CreditLimit");
		Thread.sleep(1800);
		AuthorizationFlowMapCr.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		ClickUsingJs(saveBtnInMapCredit);
		
		Thread.sleep(1220);
		
		String expMessage = "Mapping saved successfully";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.startsWith(expMessage)) 
		{
			return true;
		}
		else 
		{
			return false;
		}
		

	}
	
	public static boolean checkSaveSalesInvoiceForReqCreditLimit() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		Thread.sleep(2000);
		ClickUsingJs(financialsMenu);
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
		salesInvoicesVoucher.click();
		
		Thread.sleep(1200);
		
		boolean newfieldBtn =newBtn.isEnabled();
		Thread.sleep(1000);
		System.out.println("newfieldBtn     :"+newfieldBtn);
		
		IsVisible(newBtn);		
		Thread.sleep(1200);
		Thread.sleep(2000);getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAccountTxt));
		salesAccountTxt.sendKeys("Sales - Computers");
		Thread.sleep(1800);
		salesAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("ReqCreditLimitCustomer");
		Thread.sleep(1800);
		customerAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(WareHouseTxtInPurchases));
		WareHouseTxtInPurchases.sendKeys("HYD");
		Thread.sleep(1800);
		WareHouseTxtInPurchases.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.sendKeys("FIN");
		Thread.sleep(1800);
		departmentTxt.sendKeys(Keys.TAB);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(branchTxt));
		branchTxt.sendKeys("BR-HYD");
		Thread.sleep(1800);
		branchTxt.sendKeys(Keys.TAB);
		

	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("STD RATE ITEM");
		Thread.sleep(1800);
		enter_ItemTxt.sendKeys(Keys.TAB);

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		Thread.sleep(1800);
		enter_Quantity.sendKeys(Keys.TAB);

		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(1000);
		enter_Rate.sendKeys("220");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SINV_enter_discount));
		SINV_enter_discount.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(3000);
		
		
		if (getIsAlertPresent()) 
		{
			Thread.sleep(1000);
			System.out.println("Alert text for request credit Limit: "+getAlert().getText());
			getAlert().accept();
			
			
		}
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		String ExpMessage = "Voucher saved successfully";
		String ActMessage = checkValidationMessage(ExpMessage);
		
		Thread.sleep(2000);
		TransactionCloseBtn.click();
		
		Thread.sleep(2000);
		int count = grid_VoucherNoList.size();
		String actsuspendStatus = null;
		String expsuspendStatus  = "true";
		
		Thread.sleep(1500);

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_VoucherNoList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase("ReqCreditLimitCustomer")) 
			{
				actsuspendStatus = grid_SuspendStatusList.get(i).getText();
					System.err.println("actsuspendStatus"+actsuspendStatus);
					break;
			}
		}
			
		
		System.err.println("actsuspendStatus:"+actsuspendStatus+"value Expected"+expsuspendStatus);
		
		if (actsuspendStatus.equalsIgnoreCase(expsuspendStatus) && ActMessage.startsWith(ExpMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
		
	
	
	
	
	}
	
	public static boolean checkReqAlertInRERAndAuthorize() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		boolean actAlertNo = AlertNo.isDisplayed();
		boolean expAlertNo = true;
		
		System.out.println("actAlertNo   :"+actAlertNo);
		System.out.println("expAlertNo   :"+expAlertNo);


		String actNoOfAlerts = AlertNo.getText();
		String expNoOfAlerts = "1";

		Thread.sleep(722);
		System.out.println("actNoOfAlerts   :"+actNoOfAlerts);
		System.out.println("expNoOfAlerts   :"+expNoOfAlerts);
		
		
		Thread.sleep(1200);
		
		ClickUsingJs(AlertBtn);

		Thread.sleep(2000);
		boolean actAlertBtnlevel1 = AlertBtnlevel1.isDisplayed();
		boolean exAlertBtnlevel1 = true;
		
		Thread.sleep(1200);
		System.out.println("actAlertBtnlevel1   :"+actAlertBtnlevel1);
		System.out.println("exAlertBtnlevel1    :"+exAlertBtnlevel1);
		
		

		String actAlertBtnlevel1Txt = AlertBtnlevel1.getText();
		String expAlertBtnlevel1Txt = "Credit Management (1)";
		
		Thread.sleep(1000);
		
		System.out.println("actAlertBtnlevel1Txt   :"+actAlertBtnlevel1Txt);
		System.out.println("expAlertBtnlevel1Txt    :"+expAlertBtnlevel1Txt);
		
		
		
		Thread.sleep(1200);

		ClickUsingJs(AlertBtnlevel1);

		Thread.sleep(3500);
		boolean actAlertBtnlevel2 = AlertBtnlevel2.isDisplayed();
		boolean exAlertBtnlevel2 = true;
		
		System.out.println("actAlertBtnlevel2   :"+actAlertBtnlevel2);
		System.out.println("exAlertBtnlevel2    :"+exAlertBtnlevel2);
		
		

		String actAlertBtnlevel2Txt = AlertBtnlevel2.getText();
		String expAlertBtnlevel2Txt = "Credit Approval(s) to View (1)";
		
		System.out.println("actAlertBtnlevel2Txt   :"+actAlertBtnlevel2Txt);
		System.out.println("expAlertBtnlevel2Txt    :"+expAlertBtnlevel2Txt);
		
		

		Thread.sleep(1500);
		ClickUsingJs(AlertBtnlevel2);

		Thread.sleep(3000);
		boolean actAlertBtnlevel3 = AlertBtnlevel3.isDisplayed();
		boolean exAlertBtnlevel3 = true;
		
		System.out.println("actAlertBtnlevel3   :"+actAlertBtnlevel3);
		System.out.println("exAlertBtnlevel3    :"+exAlertBtnlevel3);
		
		

		String actAlertBtnlevel3Txt = AlertBtnlevel3.getText();
		String expAlertBtnlevel3Txt = "Need Credit Approval for Customer-->ReqCreditLimitCustomer";
		
		System.out.println("actAlertBtnlevel3Txt   :"+actAlertBtnlevel3Txt);
		System.out.println("expAlertBtnlevel3Txt    :"+expAlertBtnlevel3Txt);
		
		

		Thread.sleep(1500);
		ClickUsingJs(AlertBtnlevel3);
		
		Thread.sleep(3500);

		boolean actTxt = creditApprovalText.isDisplayed();
		boolean expTxt = true;
		
		System.out.println("actTxt   :"+actTxt);
		System.out.println("expTxt   :"+expTxt);
		
		System.out.println("actTxt: "+actTxt +"value exp"+expTxt);
		
		ClickUsingJs(approvalStatuschckbx);

		
		/*String ACTapprTxt = approvalStatusTxt.getText();
		String ExpappTxt  = "None";

		approvalStatusTxt.click();
		Thread.sleep(1000);
		Select approve = new Select(approvalStatusDropdown);
		approve.selectByVisibleText("Approve");*/

		/*saveApprovalBtn.click();*/
		
		ClickUsingJs(saveApprovalBtn);

		Thread.sleep(1200);


		String expMessage = "Status Updated successfully";
		String actMessage = checkValidationMessage(expMessage);

		
		//System.out.println("ACTapprTxt: "+ACTapprTxt +"value exp"+ExpappTxt);

		if (actAlertNo == expAlertNo && actNoOfAlerts.equalsIgnoreCase(actNoOfAlerts) && actAlertBtnlevel1 == exAlertBtnlevel1
				&& actAlertBtnlevel1Txt.contains(expAlertBtnlevel1Txt) && actAlertBtnlevel2 == exAlertBtnlevel2
				&& actAlertBtnlevel2Txt.contains(expAlertBtnlevel2Txt) && actAlertBtnlevel3  == exAlertBtnlevel3
				&& actAlertBtnlevel3Txt.contains(expAlertBtnlevel3Txt) && actTxt == expTxt 
				/*&& ACTapprTxt.equalsIgnoreCase(ExpappTxt) */&& actMessage.equalsIgnoreCase(expMessage))
		{
			return true;
		} 
		else
		{
			return false;
		}

	}
	
	public static boolean checkResaveSalesInvoiceVoucherandValidateSuspendStatus() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
		salesInvoicesVoucher.click();
		
		Thread.sleep(1200);
		IsVisible(newBtn);
		
		Thread.sleep(2000);
		int count = grid_VoucherNoList.size();
		
		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_VoucherNoList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase("ReqCreditLimitCustomer")) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
					break;
				}
			}
		}
			
		checkValidationMessage("Voucher loaded successfully");
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(1000);
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		String ExpMessage = "Voucher saved successfully";
		String ActMessage = checkValidationMessage(ExpMessage);
		
		Thread.sleep(1500);
		
		ClickUsingJs(new_CloseBtn);
		Thread.sleep(2100);
		
		//TransactionCloseBtn.click();
		
		Thread.sleep(2000);
	
		String actsuspendStatus = null;
		String expsuspendStatus  = "false";

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_VoucherNoList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase("ReqCreditLimitCustomer")) 
			{
				actsuspendStatus = grid_SuspendStatusList.get(i).getText();
					System.err.println("actsuspendStatus"+actsuspendStatus);
					break;
			}
		}
			
		
		System.err.println("actsuspendStatus:"+actsuspendStatus+"value Expected"+expsuspendStatus);
		
		if (ActMessage.startsWith(ExpMessage) && actsuspendStatus.equalsIgnoreCase(expsuspendStatus)) 
		{
			return true;
		} 
		else
		{
			return false;
		}
		
	
	}
	
	public static boolean checkDefineBudgetForBudgetLimitOptionInUtr() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsBudgetMenu));
		financialsBudgetMenu.click();

		Thread.sleep(1200);
		ClickUsingJs(financialsBudgetDefineBudget);
		Thread.sleep(1299);
		IsVisible(planName);
		Thread.sleep(1500);

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(planName)); 
		planName.sendKeys("Budget23");
		Thread.sleep(2000);
		versionNo.click();
		versionNo.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(budgetTypeR1C2SelectCell));     	
		budgetTypeR1C2SelectCell.click();

		budgetTypeR1C1InputCell.click();

		budgetTypeR1C1InputCell.sendKeys("By Account By Value");  	
		Thread.sleep(2000);
		budgetTypeR1C1InputCell.sendKeys(Keys.TAB);

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(budgetDepartmentR1C3SelectCell));     	
		budgetDepartmentR1C3SelectCell.click();	 	

		budgetDepartmentR1C3InputCell.click();

		budgetDepartmentR1C3InputCell.sendKeys("FIN");
		Thread.sleep(2000);
		budgetDepartmentR1C3InputCell.sendKeys(Keys.TAB);

		
		budgetAccountR1C4InputCell.click();
		budgetAccountR1C4InputCell.sendKeys("Purchase");
		Thread.sleep(2500);
		budgetAccountR1C4InputCell.sendKeys(Keys.TAB);

		budgetValueTxt.click();
		budgetValueTxt.sendKeys("40000");
		//budgetValueTxt.sendKeys(Keys.TAB);
		Thread.sleep(1500);

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(budgetSaveBtn));     	
		budgetSaveBtn.click();	

		String expErrorMessage="Budget Saved succesfully";
		String actErrorMessage= checkValidationMessage(expErrorMessage);
	
		
		System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);



		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(planName));   
		planName.sendKeys(Keys.HOME);
		planName.sendKeys(Keys.SHIFT,Keys.END);
		planName.sendKeys("Budget23");
		Thread.sleep(2000);
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(versionNo));
		versionNo.click();

		System.out.println(versionNo.getAttribute("value"));	 	



		String actVersionNo      = versionNo.getAttribute("value");
		String actBudgetType     = budgetTypeGetText.getText();
		String actDepartment     = budgetDepartmentGetText.getText();
		String actAccount        = budgetAccountGetText.getText();
		String actValue          = budgetValueGetText.getText();
		String actBudgetStatus   = budgetStatusGetText.getText();

		String expVersionNo      = "1";
		String expBudgetType     = "By Account By Value";
		String expDepartment     = "FIN";
		String expAccount        = "Purchase";
		String expValue          = "40,000.00";
		String expBudgetStatus   = "Pending";


		System.out.println("Budget Menu Define Budget         : " + actVersionNo +        "  value expected  " + expVersionNo);
		System.out.println("Budget Menu Confirm Budget        : " + actBudgetType +       "  value expected  " + expBudgetType);
		System.out.println("Budget Menu Revise Budget         : " + actDepartment +       "  value expected  " + expDepartment);
		System.out.println("Budget Menu Approval Budget       : " + actAccount +          "  value expected  " + expAccount);
		System.out.println("Budget Menu Revise Budget Budget  : " + actValue +            "  value expected  " + expValue);
		System.out.println("Budget Menu Budget Report Budget  : " + actBudgetStatus +     "  value expected  " + actBudgetStatus);


		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(budgetConfirmBtn));     	
		budgetConfirmBtn.click();

	
		
		String expErrorMessages="Budget Confirmed successfully";
		String actErrorMessages= checkValidationMessage(expErrorMessages);

		

		System.out.println("ValidationMessage  :  "+actErrorMessages +" Value Expected : "+expErrorMessages);

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(planName));     	
		planName.sendKeys("Budget23");

		Thread.sleep(2000);

		versionNo.click();

		System.out.println(versionNo.getAttribute("value"));	 	


		String actVersionNos      = versionNo.getAttribute("value");
		String actBudgetTypes     = budgetTypeGetText.getText();
		String actDepartments     = budgetDepartmentGetText.getText();
		String actAccounts        = budgetAccountGetText.getText();
		String actValues          = budgetValueGetText.getText();
		String actBudgetStatuss   = budgetStatusGetText.getText();

		String expVersionNos      = "1";
		String expBudgetTypes     = "By Account By Value";
		String expDepartments     = "FIN";
		String expAccounts        = "Purchase";
		String expValues          = "40,000.00";
		String expBudgetStatuss   = "Authorized";


		System.out.println("Budget Menu Define Budget         : " + actVersionNos +        "  value expected  " + expVersionNos);
		System.out.println("Budget Menu Confirm Budget        : " + actBudgetTypes +       "  value expected  " + expBudgetTypes);
		System.out.println("Budget Menu Revise Budget         : " + actDepartments +       "  value expected  " + expDepartments);
		System.out.println("Budget Menu Approval Budget       : " + actAccounts +          "  value expected  " + expAccounts);
		System.out.println("Budget Menu Revise Budget Budget  : " + actValues +            "  value expected  " + expValues);
		System.out.println("Budget Menu Budget Report Budget  : " + actBudgetStatuss +     "  value expected  " + expBudgetStatuss);


		Thread.sleep(5000);

		budgetCloseBtnFirst.click();


		if(actVersionNo.equalsIgnoreCase(expVersionNo) && actBudgetType.equalsIgnoreCase(expBudgetType)
				&& actDepartment.equalsIgnoreCase(expDepartment) && actAccount.equalsIgnoreCase(expAccount)
				&& actAccount.equalsIgnoreCase(expAccount) && actValue.equalsIgnoreCase(expValue) && actBudgetStatus.equalsIgnoreCase(expBudgetStatus)

				&&  actErrorMessages.equalsIgnoreCase(expErrorMessages) &&  actVersionNos.equalsIgnoreCase(expVersionNos) && actBudgetTypes.equalsIgnoreCase(expBudgetTypes)
				&& actDepartments.equalsIgnoreCase(expDepartments) && actAccounts.equalsIgnoreCase(expAccounts)
				&& actAccounts.equalsIgnoreCase(expAccounts) && actValues.equalsIgnoreCase(expValues) && actBudgetStatuss.equalsIgnoreCase(expBudgetStatuss))
		{

			return true;
		}
		else
		{

			return false;
		}




	}
	
	public static boolean checkSavedBudgetInConfirmBudgetScreen() throws InterruptedException
	{
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsBudgetMenu));
		financialsBudgetMenu.click();

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsBudgetConfirmBudget));
		financialsBudgetConfirmBudget.click();

		Thread.sleep(2000);
		IsVisible(planNameInConfirmBudget);
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(planNameInConfirmBudget));     
		planNameInConfirmBudget.click();
		planNameInConfirmBudget.sendKeys("Budget23");
		Thread.sleep(2000);
		planNameInConfirmBudget.sendKeys(Keys.TAB);
		
		Thread.sleep(1500);
		String acttotalBudget = ConfirmBudget_TotalBudget.getText();
		String exptotalBudget = "40,000.00";
		
		System.out.println("acttotalBudget: "+acttotalBudget +"Value expected: "+exptotalBudget);
		
		if (acttotalBudget.equalsIgnoreCase(exptotalBudget)) 
		{
			return true;
		} 
		else
		{
			return false;
		}
	
	}
	
	
	public static boolean checkSavePurchaseVoucherForBudgetLimitAlertValidation() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		CheckSavePurchasesVoucher("","Purchase","Vendor A", "HYD", "FIN", "BR-HYD","CAM", "10", "41000", "Btch12");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		

		Thread.sleep(1500);
		
		/*String expMessage = "This Transaction will make the Budget Negative";
		String actMessage = checkValidationMessage2(expMessage);*/
		
		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 18";
		
		String actMessage1 = checkValidationMessage(expMessage1);
		
		System.out.println("SavingMessage  :  "+actMessage1 +" Value Expected : "+expMessage1+" "+expMessage2);		
		
		if (actMessage1.startsWith(expMessage1) && actMessage1.endsWith(expMessage2)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
	}
	
	public static boolean checkStopOptionInBudgetLimit() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
		securityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityCreateRoleMenu));
		homeSecurityCreateRoleMenu.click();


		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.sendKeys("UTR");
		Thread.sleep(2000);
		createRoleRoleNameCombo.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		IsVisible(admin);
		Thread.sleep(2500);
		
		ClickUsingJs(transactionRightsTab);
		Thread.sleep(1500);	
		
		
		Select budget = new Select(budgetLimitWarningDropdown);
		budget.selectByVisibleText("Stop");
		Thread.sleep(1500);
		ClickUsingJs(createRoleSaveicon);
		Thread.sleep(1500);	
		

		System.out.println("**************************************checkSavingRoleWithAllProfileST***********************************************");

		String expMessage= "Role updated Successfully";

		String actMessage=checkValidationMessage(expMessage);


		System.out.println("Saving Message of Rolw : " +actMessage+" Value Expected : "+expMessage);
		
		ClickUsingJs(createRoleCloseIcon);
		Thread.sleep(1500);	

	

		if (actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");


			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");


			return false;
		}
		
	}
	
	public static boolean checkStopBudgetLimitOptionValidationInPurchasesVoucher() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		CheckSavePurchasesVoucher("","Purchase","Vendor A", "HYD", "FIN", "BR-HYD","CAM", "10", "41000", "Btch45");
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		String expMessage2 = "This Transaction will make the Budget Negative. It cannot be saved";
		String actMessage2 = checkValidationMessage(expMessage2);
		
		
		
		
		if (actMessage2.equalsIgnoreCase(expMessage2)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
	
	}
	

	public static boolean checkCreateTreeInAccountMaster() throws InterruptedException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Tree_createTree));
		Tree_createTree.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Tree_createTreeBtn));
		Tree_createTreeBtn.click();
		
		Thread.sleep(2500);
		IsVisible(Tree_CreateTreeNameTxt);
		Thread.sleep(2500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Tree_CreateTreeNameTxt));
		Tree_CreateTreeNameTxt.sendKeys("AccountTypeTree");
		
		Thread.sleep(1500);
		
		ClickUsingJs(AutoRadioBtn);
		Thread.sleep(1500);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FiledstableRowl));
		FiledstableRowl.click();
		Thread.sleep(1500);
		FieldsDropDown.click();
		
		Select fields = new Select(FieldsDropDown);
		fields.selectByVisibleText("Account Type");
		
		Thread.sleep(3000);
		ClickUsingJs(Tree_CreateTreeOkBtn);
		Thread.sleep(3500);
		
		
		Thread.sleep(2000);
		ClickUsingJs(createTreeDropdown);
		Thread.sleep(1500);
		
		Select treeDd = new Select(createTreeDropdown);
		int count = createTreeDropdownOptions.size();
		
		ArrayList<String> treeOptions = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			String option = treeDd.getOptions().get(i).getText();
			treeOptions.add(option);
		}
		
		String actTreeList = treeOptions.toString();
		String expTreeList = "[Default, AccountTypeTree]";
		
		System.out.println("actTreeList: "+actTreeList);
		System.out.println("expTreeList: "+expTreeList);
		
		if (actTreeList.equalsIgnoreCase(expTreeList)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
	}
	
	public static boolean checkCreateTreeInItemMaster() throws InterruptedException
	{
		Thread.sleep(1200);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(1200);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		
		Thread.sleep(1200);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
		homeMasterItemMenu.click();

		Thread.sleep(1200);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
		homeMasterItem_ItemMenu.click();
		

		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Tree_createTree));
		Tree_createTree.click();
		
		Thread.sleep(2500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Tree_createTreeBtn));
		Tree_createTreeBtn.click();
		Thread.sleep(1500);
		IsVisible(Tree_CreateTreeNameTxt);
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Tree_CreateTreeNameTxt));
		Tree_CreateTreeNameTxt.sendKeys("ItemTypeTree");
		
		Thread.sleep(1000);
		
		ClickUsingJs(AutoRadioBtn);
		Thread.sleep(1500);
		ClickUsingJs(FiledstableRowl);
		Thread.sleep(1500);
		
		
		Thread.sleep(1000);
		ClickUsingJs(FieldsDropDown);
		Thread.sleep(1500);
		
		
		Select fields = new Select(FieldsDropDown);
		fields.selectByVisibleText("Item Type");
		
		Thread.sleep(1000);
		ClickUsingJs(Tree_CreateTreeOkBtn);
		Thread.sleep(4500);
		
		
		Thread.sleep(2000);
		ClickUsingJs(createTreeDropdown);
		Thread.sleep(1500);

		
		Thread.sleep(1000);
		Select treeDd = new Select(createTreeDropdown);
		int count = createTreeDropdownOptions.size();
		
		ArrayList<String> treeOptions = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			String option = treeDd.getOptions().get(i).getText();
			treeOptions.add(option);
		}
		
		String actTreeList = treeOptions.toString();
		String expTreeList = "[Default, ItemTypeTree]";
		
		System.out.println("actTreeList: "+actTreeList);
		System.out.println("expTreeList: "+expTreeList);
		
		if (actTreeList.equalsIgnoreCase(expTreeList)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
	
	}
	
	
	public static boolean checkAssignNewTreeForUtrUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
		securityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityCreateRoleMenu));
		homeSecurityCreateRoleMenu.click();


		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.sendKeys("UTR");
		Thread.sleep(1500);
		createRoleRoleNameCombo.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		IsVisible(admin);
		Thread.sleep(1500);
		
		ClickUsingJs(createRole_RestrictionForTrees);
		
	
		
		Thread.sleep(2000);
		
		
		int count = MastersList.size();
		
		ArrayList<String> treeOptions = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			String data = MastersList.get(i).getText();
			if(data.equalsIgnoreCase("Account"))
			{
				MastersList.get(i).click();
				break;
			}
		}
		
		
		Thread.sleep(2000);
		int Treecount = CreatedTreeList.size();
		
		
		ArrayList<String> CtreeOptions = new ArrayList<String>();
		
		for (int i = 0; i < Treecount; i++) 
		{
			String data = CreatedTreeList.get(i).getText();
			CtreeOptions.add(data);
			
			if (data.equalsIgnoreCase("AccountTypeTree"))
			{
				CreatedTreechckbxList.get(i).click();
				break;
			}
		}
		
		String actTreeList = CtreeOptions.toString();
		String expTreeList = "[Default, AccountTypeTree]";
		
		System.out.println("actTreeList: "+actTreeList);
		System.out.println("expTreeList: "+expTreeList);
		
		
		Thread.sleep(5000);
		for (int i = 0; i < count; i++) 
		{
			String data = MastersList.get(i).getText();
			if(data.equalsIgnoreCase("Item"))
			{
				MastersList.get(i).click();
				break;
			}
		}
		
		Thread.sleep(2000);
		for (int i = 0; i < Treecount; i++) 
		{
			String data = CreatedTreeList.get(i).getText();
			CtreeOptions.add(data);
			
			if (data.equalsIgnoreCase("ItemTypeTree"))
			{
				CreatedTreechckbxList.get(i).click();
				break;
			}
		}
		
		
		ClickUsingJs(createRoleSaveicon);
		Thread.sleep(1500);

		System.out.println("**************************************checkSavingRoleWithAllProfileST***********************************************");

		String expMessage= "Role updated Successfully";

		String actMessage=checkValidationMessage(expMessage);


		System.out.println("Saving Message of Rolw : " +actMessage+" Value Expected : "+expMessage);
		
		ClickUsingJs(createRoleCloseIcon);
		Thread.sleep(1500);

		

		if (actTreeList.equalsIgnoreCase(expTreeList) && actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");


			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");


			return false;
		}
		
	}
	
	public static boolean checkAccountTreeListForUtr() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(2000);

		int actCount = createTreeDropdownOptions.size();
		int expCount = 1;

		int Treecount = AccountTreeListUTR.size();

		ArrayList<String> CtreeOptions = new ArrayList<String>();

		for (int i = 0; i < Treecount; i++) 
		{
			String data = AccountTreeListUTR.get(i).getText();
			CtreeOptions.add(data);

		}

		String actTreeList = CtreeOptions.toString();
		String expTreeList = "[Cash, Assets, Bank, Sales, Purchases, Inventory, Fixed Assets, Customer, Liabilities, Vendor, Expenses, Income, Income / Expense, Customer/Vendor]";

		System.out.println("actTreeList: "+actTreeList);
		System.out.println("expTreeList: "+expTreeList);

		Thread.sleep(2000);
		int count = masterGridBodyName.size();

		ArrayList<String> AccountNames = new ArrayList<String>();

		for (int i = 0; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);

		}
		
		String actaccountsList = AccountNames.toString();
		String expaccountsList = "[Cash, Assets, Bank, Sales, Purchases, Inventory, Fixed Assets, Customer, Liabilities, Vendor, Expenses, Income, Income / Expense, Customer/Vendor]";

		System.out.println("actaccountsList: "+actaccountsList);
		System.out.println("expaccountsList: "+expaccountsList);
		
		if (actCount == expCount && actTreeList.equalsIgnoreCase(expTreeList) && actaccountsList.equalsIgnoreCase(expaccountsList)) 
		{
			return true;
		}
		else 
		{
			return false;
		}


	}
	
	public static boolean checkItemTreeListforutr() throws InterruptedException
	{

		Thread.sleep(1200);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(1200);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		
		Thread.sleep(1200);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
		homeMasterItemMenu.click();

		Thread.sleep(1200);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
		homeMasterItem_ItemMenu.click();
		

		Thread.sleep(4500);
		
		
		int actCount = createTreeDropdownOptions.size();
		int expCount = 1;

		int Treecount = AccountTreeListUTR.size();

		ArrayList<String> CtreeOptions = new ArrayList<String>();

		for (int i = 0; i < Treecount; i++) 
		{
			String data = AccountTreeListUTR.get(i).getText();
			CtreeOptions.add(data);

		}

		String actTreeList = CtreeOptions.toString();
		String expTreeList = "[Raw material, Intermediate Item, Finished goods]";

		System.out.println("actTreeList: "+actTreeList);
		System.out.println("expTreeList: "+expTreeList);

		Thread.sleep(2000);
		int count = ProductmasterGridBodyName.size();

		ArrayList<String> ItemNames = new ArrayList<String>();

		for (int i = 0; i < count; i++) 
		{
			String data = ProductmasterGridBodyName.get(i).getText();
			ItemNames.add(data);

		}
		
		String actItemsList = ItemNames.toString();
		String expItemsList = "[Raw material, Intermediate Item, Finished goods]";

		System.out.println("actItemsList: "+actItemsList);
		System.out.println("expItemsList: "+expItemsList);
		
		if (actCount == expCount && actTreeList.equalsIgnoreCase(expTreeList) && actItemsList.equalsIgnoreCase(expItemsList)) 
		{
			return true;
		}
		else 
		{
			return false;
		}

		
	}
	
	

	public static boolean checklogout() throws InterruptedException
	{
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(LogoutDropdown));
		LogoutDropdown.click();
		 Thread.sleep(1000);
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		  logoutOption.click();
		  
		  Thread.sleep(2000);
		  
		  boolean actUserLoginPage              = username.isDisplayed() && username.isEnabled()
                                                  && password.isDisplayed() && password.isEnabled();
                                         
		  boolean expUserLoginPage              = true;
		  
		  if(actUserLoginPage==expUserLoginPage)  
	      {
			System.out.println("***Test Pass: Login Successfull***");
			
			return true;
		  }
	      else
	      {
	  	 
			System.out.println("***Test Fail: Login Not Successfull***");
			
			return false;
		  }
		}
	
	
	
	
	
	
	
	public static boolean checkDay() throws IOException
	{
		String fd = findDay();
		System.err.println("fd "+fd);
		
		String strDateToSet = "12";
		Runtime.getRuntime().exec("cmd /C date " + strDateToSet ); 
		return true;
	}
	
	public UserTransactionRightsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
