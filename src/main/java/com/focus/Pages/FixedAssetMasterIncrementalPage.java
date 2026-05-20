package com.focus.Pages;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;

public class FixedAssetMasterIncrementalPage extends BaseEngine 
{
	
	
	public static boolean checkSaveIncrementInCustomizeMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		getDriver().navigate().refresh();
		
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		Thread.sleep(2000);
		
		//scrollToElementJSE(fixedAssetMaster);
		getAction().moveToElement(fixedAssetMaster).build().perform();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fixedAssetMaster));
		fixedAssetMaster.click();
		
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
		
		
		IncNoOfTxt.sendKeys("9");
		Thread.sleep(1000);
		IncNoOfTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		String actOpTxt = OutputTxt.getText();
		String expOpTxt = "Output : 000000001";
		
		
		System.out.println("actOpTxt:  "+actOpTxt  + "expected value : "+expOpTxt);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		
		String expMessage="Field Updated Successfully";
		
		String actMessage=checkValidationMessage(expMessage);
		
		
		System.out.println("actMessage: "+actMessage);
		System.out.println("expMessage: "+expMessage);
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FA_headerDetailsaccountSaveBtn));
		FA_headerDetailsaccountSaveBtn.click();

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
	
	
	public static boolean checkSaveFixedAssetMasterForIncrementalValidation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		Thread.sleep(2000);
		
		getDriver().navigate().refresh();
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		scrollToElementJSE(fixedAssetMaster);
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fixedAssetMaster));
		fixedAssetMaster.click();

		Thread.sleep(4000);
		
		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		Thread.sleep(2000);

		//checkValidationMessage("");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("FixedAssetIncrement");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FAdatePicker));
		FAdatePicker.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FAgetDate));
		FAgetDate.click();
		
		FA_PurchaseDate.click();
		Thread.sleep(1000);
		FA_PurchaseDate.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FA_Price));
		FA_Price.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(1000);
		FA_Price.sendKeys("50000");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FA_Quantity));
		FA_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(1000);
		FA_Quantity.sendKeys("10");
		Thread.sleep(1200);
		
		
		ClickUsingJs(fITDepreciationRate);
		Thread.sleep(1200);
		
		//scrollToElementJSE(FA_CreateDiffFAForEachQty);
		Thread.sleep(2000);
		if (FA_CreateDiffFAForEachQty.isSelected() ==false)
		{
			FA_CreateDiffFAForEachQty.click();
			System.out.println("FA_CreateDiffFAForEachQty   :"+FA_CreateDiffFAForEachQty.isSelected());
		}
		
		Thread.sleep(1000);
		
		 //JavascriptExecutor js = (JavascriptExecutor) getDriver();
		// js.executeScript("window.scrollTo(0, 0)");
		
		ClickUsingJs(FA_DepricationTab);
		Thread.sleep(1200);
		
		
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FA_DepricationTab));
		//FA_DepricationTab.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FA_DateOfCommencement));
		FA_DateOfCommencement.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FA_DateofCmnmntToday));
		FA_DateofCmnmntToday.click();
		
		Thread.sleep(1500);
		
		ClickUsingJs(SaveBtn);
		

		/*
		 * scrollToElementJSE(SaveBtn); Thread.sleep(2000);
		 * getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(
		 * SaveBtn)); SaveBtn.click();
		 */

		String expSaveAccountMessage = "Saved Successfully";	
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);
		
		Thread.sleep(2000);
		ClickUsingJs(closeBtn);
	
		Thread.sleep(3000);
		
		if (actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage))
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
	}
	
	public static boolean checkCreatedFixedAssetMasterNamesAndCodeValidation() throws InterruptedException
	{
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		scrollToElementJSE(fixedAssetMaster);
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fixedAssetMaster));
		fixedAssetMaster.click();

		Thread.sleep(2000);
		
		
		int count = masterGridBodyName.size();
		int count1 = WmasterGridBodyName.size();
		
		
		ArrayList<String> AccountNames = new ArrayList<String>();
		
		ArrayList<String> AccountCode = new ArrayList<String>();
		
		for (int i = 0; i < count1; i++) 
		{
			String data = WmasterGridBodyName.get(i).getText();
			AccountNames.add(data);
			
		}
		
		for (int i = 0; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			AccountCode.add(data);
			
		}
		
		String actAccountNames = AccountNames.toString();
		String expAccountNames = "[FixedAssetIncrement, FixedAssetIncrement-1, FixedAssetIncrement-2, FixedAssetIncrement-3, FixedAssetIncrement-4, FixedAssetIncrement-5, FixedAssetIncrement-6, FixedAssetIncrement-7, FixedAssetIncrement-8, FixedAssetIncrement-9]";
		
		
		String actAccountCodes = AccountCode.toString();
		String expAccountCodes = "[000000001, 000000002, 000000003, 000000004, 000000005, 000000006, 000000007, 000000008, 000000009, 000000010]";
		
		
		System.out.println("actAccountNames: "+actAccountNames);
		System.out.println("expAccountNames: "+expAccountNames);
		
		System.out.println("actAccountCodes: "+actAccountCodes);
		System.out.println("expAccountCodes: "+expAccountCodes);
	
		if (actAccountNames.equalsIgnoreCase(expAccountNames) && actAccountCodes.equalsIgnoreCase(expAccountCodes))
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}

	public static boolean checkSaveFixedAssetForIncValidation2() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		scrollToElementJSE(fixedAssetMaster);
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fixedAssetMaster));
		fixedAssetMaster.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("FixedAssetIncrement");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("FixedAssetInc");
		Thread.sleep(2000);
		codeTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FAdatePicker));
		FAdatePicker.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FAgetDate));
		FAgetDate.click();
		
		FA_PurchaseDate.click();
		Thread.sleep(1000);
		FA_PurchaseDate.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FA_Price));
		FA_Price.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(1000);
		FA_Price.sendKeys("10000");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FA_Quantity));
		FA_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(1000);
		FA_Quantity.sendKeys("3");
		
		
		if (FA_CreateDiffFAForEachQty.isSelected() ==false)
		{
			FA_CreateDiffFAForEachQty.click();
		}
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FA_DepricationTab));
		FA_DepricationTab.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FA_DateOfCommencement));
		FA_DateOfCommencement.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FA_DateofCmnmntToday));
		FA_DateofCmnmntToday.click();
		

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		String expSaveAccountMessage = "Saved Successfully";	
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);
		
		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);
		
		if (actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage))
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
	
	}
	
	public static boolean checkCreatedFixedAssetMasterNamesAndCodeValidation2() throws InterruptedException
	{
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		scrollToElementJSE(fixedAssetMaster);
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fixedAssetMaster));
		fixedAssetMaster.click();

		Thread.sleep(2000);
		
		
		int count = masterGridBodyName.size();
		int count1 = WmasterGridBodyName.size();
		
		
		ArrayList<String> AccountNames = new ArrayList<String>();
		
		ArrayList<String> AccountCode = new ArrayList<String>();
		
		for (int i = 0; i < count1; i++) 
		{
			String data = WmasterGridBodyName.get(i).getText();
			AccountNames.add(data);
			
		}
		
		for (int i = 0; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			AccountCode.add(data);
			
		}
		
		String actAccountNames = AccountNames.toString();
		String expAccountNames = "[FixedAssetIncrement, FixedAssetIncrement, FixedAssetIncrement-1, FixedAssetIncrement-2, FixedAssetIncrement-3, FixedAssetIncrement-4, FixedAssetIncrement-5, FixedAssetIncrement-6, FixedAssetIncrement-7, FixedAssetIncrement-8, FixedAssetIncrement-9, FixedAssetIncrement-1, FixedAssetIncrement-2]";
		
		
		String actAccountCodes = AccountCode.toString();
		String expAccountCodes = "[000000001, FixedAssetInc, 000000002, 000000003, 000000004, 000000005, 000000006, 000000007, 000000008, 000000009, 000000010, 000000011, 000000012]";
		
		
		System.out.println("actAccountNames: "+actAccountNames);
		System.out.println("expAccountNames: "+expAccountNames);
		
		System.out.println("actAccountCodes: "+actAccountCodes);
		System.out.println("expAccountCodes: "+expAccountCodes);
	
		if (actAccountNames.equalsIgnoreCase(expAccountNames) && actAccountCodes.equalsIgnoreCase(expAccountCodes))
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
	
	public FixedAssetMasterIncrementalPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
