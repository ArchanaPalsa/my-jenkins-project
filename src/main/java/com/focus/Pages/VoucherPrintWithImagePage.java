package com.focus.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
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
import com.testautomationguru.utility.PDFUtil;

public class VoucherPrintWithImagePage extends BaseEngine{
	
	
	//(//*[@id='ImageDiv']//input)[1]
	@FindBy(xpath="//*[@id='BrowsepImage']")
	public static WebElement attachmentinItem;
	
	public static boolean checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		Thread.sleep(3000);
		LoginPage lp=new LoginPage(getDriver()); 

		String unamelt="su";

		String pawslt="su";


		getDriver().navigate().refresh();
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
		username.click();
		Thread.sleep(2000);
		username.clear();
		Thread.sleep(2000);
		username.sendKeys(unamelt);
			
		Thread.sleep(2000);
		password.sendKeys(pawslt);

		String compname="Print Design Layout Company";

		Select oSelect = new Select(companyDropDownList);

		List <WebElement> elementCount = oSelect.getOptions();

		int cqSize = elementCount.size();

		int zqSize=cSize+1;

		System.out.println("CompanyDropdownList Count :"+cqSize);

		System.out.println("Company dropdown is :"+ zqSize);


	
		int i;

		
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

			Thread.sleep(8000);
		

		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(usernametxt1));
		
		String userInfo=usernametxt1.getText();

		System.out.println("User Info : "+userInfo);

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));

		String getDashboard=dashboardName.getText();

		System.out.println(getDashboard);

		


		String expuserInfo            ="SU";
	
		String expDashboard			  ="Graph with Active and setAsDefault";


		System.out.println("***********************************checkLogin*********************************");

		System.out.println("User Info                        : "+userInfo               +"  value expected  "+expuserInfo);
		
		System.out.println("Dashboard                        : "+getDashboard           +"  value expected  "+expDashboard);


		if(userInfo.equalsIgnoreCase(expuserInfo))
		{	
			return true;
		}	 
		else
		{
			return false;
		}
	}
	
	public static boolean checkRestoreAndLoginVouchersPrintcompany() throws IOException, InterruptedException, AWTException
	{
		VoucherPrintOptionsPage.restoreCompany("Print Design Layout Company For Images","Print Design Layout Company");
		
		Thread.sleep(5000);
		
		String actUserInfo1=usernametxt.getText();

		System.out.println("User Info  : "+actUserInfo1);

		System.out.println("User Info Capture Text  :  "+usernametxt.getText());

	

		String expUserInfo1           ="SU";
		String expLoginCompanyName1   ="Print Design Layout Company";

		System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
		//System.out.println("LoginCompanyName1     : "+getLoginCompanyName1    +" Value Expected : "+expLoginCompanyName1);

		if(actUserInfo1.equalsIgnoreCase(expUserInfo1) /*&& getLoginCompanyName1.contains(expLoginCompanyName1)*/)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	@FindBy(xpath="//*[@id='iDonotshowtheItemsexpirewithindays']")
	public static WebElement expdays;
	
	public boolean checkSavingAnItemWithAttachingImageinItemMaster() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		
		click(homeMenu);
		click(masterMenuBtn);
		click(homeMasterItemMenu);
		click(homeMasterItem_ItemMenu);
		Thread.sleep(4000);
		
		checkValidationMessage("");
		
		for(int i=0;i<itemNameList.size();i++)
		{
			if(itemNameList.get(i).getText().equals("Apple"))
			{
				itemCheckBoxList.get(i).click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		click(itemEditBtn);
		Thread.sleep(6000);
		
		
		getAction().moveToElement(attachmentinItem).build().perform();
		
		//ClickUsingJs(attachmentinItem);
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\ItemBrowseBtn.exe");
		Thread.sleep(3000);
		Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\ItemAttachment.exe");

		Thread.sleep(9000);
		
		ClickUsingJs(itemSaveBtn);
		
		String expMsg="Updated Successfully";
		String actMsg=checkValidationMessage(expMsg);
		
		if(actMsg.equalsIgnoreCase(expMsg))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	@FindBy(xpath="//*[@id='id_menu_search_input']")
	public static WebElement searchTxt;
	
	public boolean checkSavingVoucherinPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		searchTxt.sendKeys("Purchases Vouchers");
		Thread.sleep(1500);
		searchTxt.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		click(newBtn);
		Thread.sleep(2000);
		
		click(purchaseAccountTxt);
		purchaseAccountTxt.sendKeys("STD RATE COGS ACC");
		Thread.sleep(2000);
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		click(vendorAccountTxt);
		vendorAccountTxt.sendKeys("Vendor A");
		Thread.sleep(2000);
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		click(warehouseTxt);
		warehouseTxt.sendKeys("HYDERABAD");
		Thread.sleep(2000);
		warehouseTxt.sendKeys(Keys.TAB);
		
		
		click(departmentTxt);
		departmentTxt.sendKeys("INDIA");
		Thread.sleep(2000);
		departmentTxt.sendKeys(Keys.TAB);
		
		click(select1stRow_1stColumn);
		click(enter_ItemTxt);
		enter_ItemTxt.sendKeys("Apple");
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		click(select1stRow_3rdColumn);
		click(enter_Quantity);
		enter_Quantity.sendKeys("10");
		
		click(select1stRow_5thColumn);
		click(enter_Rate);
		enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		enter_Rate.sendKeys("15.54");
		enter_Rate.sendKeys(Keys.TAB);
		
		click(voucherSaveBtn);
		Thread.sleep(5000);
		
		click(billRefNewReferenceTxt);
		click(billRefPickIcon);
		click(pickBtn);
		Thread.sleep(4000);
		
		String expMsg="Voucher saved successfully";
		String expMsg1=": 4";
		
		String actMsg=checkValidationMessage(expMsg);
		
		click(VoucherEntryCloseBtn);
		
		if(actMsg.startsWith(expMsg) && actMsg.endsWith(expMsg1))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	@FindBy(xpath="//*[@id='btnTransHomePrint']")
	public static WebElement voucherHomePrintBtn;
	
	@FindBy(xpath="(//span[@title='Create Layout'])[1]")
	public static WebElement voucherHomePrintCreateLayoutBtn;
	
	@FindBy(xpath="(//span[@title='Edit Layout'])[1]")
	public static WebElement voucherHomePrintEditLayoutBtn;
	
	@FindBy(xpath="//*[text()='Blank template']/../img")
	public static WebElement voucherHomePrintBlankTemplatetBtn;
	
	@FindBy(xpath="//*[@id='btn_PopUpNewLayoutOk']")
	public static WebElement voucherHomePrintLayoutOkBtn;
	
	@FindBy(xpath="//*[@id='DesignMenu']")
	public static WebElement printDesignerTab;
	
	@FindBy(xpath="//*[@id='PreviewMenu']")
	public static WebElement printPreviewTab;
	
	@FindBy(xpath="//*[@id='drpdownSlider']//i[@class='icon-save hiconright2']")
	public static WebElement printSaveDropdown;
	
	@FindBy(xpath="//*[@id='SliderMenu']/a[@title='Save']")
	public static WebElement printSaveBtn;
	
	@FindBy(xpath="//*[@id='id_PopuplayoutName']")
	public static WebElement printSaveTxt;
	
	@FindBy(xpath="//*[@id='btn_PopUpOk']")
	public static WebElement printSave_SaveBtn;
	
	@FindBy(xpath="//*[@id='id_InvoiceDesingCancel']")
	public static WebElement printExitBtn;
	
	
	public boolean checkCreatingLayoutHavingItemImageinPurchaseVoucher() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		Thread.sleep(2500);
		
		click(voucherHomePrintBtn);
		Thread.sleep(4000);
		
		click(voucherHomePrintCreateLayoutBtn);
		Thread.sleep(4000);
		
		click(voucherHomePrintBlankTemplatetBtn);
		Thread.sleep(8000);
		
		Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\ItemImageAttachment.exe");

		Thread.sleep(160000);
		getAction().moveToElement(printSaveDropdown).build().perform();
		click(printSaveDropdown);
		click(printSaveBtn);
		Thread.sleep(2000);
		click(printSaveTxt);
		printSaveTxt.sendKeys("LayoutWithImageinItem");
		click(printSave_SaveBtn);
		Thread.sleep(2000);
		
		String expMsg="Layout saved successfully";
		String actMsg=checkValidationMessage(expMsg);
		
		click(printExitBtn);
		
		if(actMsg.equalsIgnoreCase(expMsg))
		{
		
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	@FindBy(xpath="//*[@id='opt_LayoutID']")
	public static WebElement layoutName;
	
	@FindBy(xpath="//*[@id='btnPrint']")
	public static WebElement printBtn;
	
	@FindBy(xpath="//input[@value='X']")
	public static WebElement print_CloseBtn;
	
	
	public boolean checkPrintinPurchaseVocuherforCreatedLayout() throws InterruptedException, AWTException, IOException
	{
		Thread.sleep(5000);
		
		File Efile=new File(getBaseDir()+"\\autoIt\\ExportFiles\\ItemImageLayoutPDF.pdf");

		if(Efile.exists())
		{
			Efile.delete();
		}

		Thread.sleep(1600);
		
		for(int i=0;i<grid_VoucherNoList.size();i++)
		{
			if(grid_VoucherNoList.get(i).getText().equals("4"))
			{
				grid_CheckBoxList.get(i).click();
				break;
			}
		}
		
	
		click(voucherHomePrintBtn);
		Thread.sleep(4000);
		click(layoutName);
		layoutName.sendKeys("LayoutWithImageinItem");
		Thread.sleep(2000);
		layoutName.sendKeys(Keys.TAB);
		click(printBtn);
		Thread.sleep(10000);
		
		Robot robot=new Robot();
	
		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\SaveasPDFOption.exe");
	
		Thread.sleep(10000);
		StringSelection str = new StringSelection(getBaseDir()+"\\autoIt\\ExportFiles\\ItemImageLayoutPDF.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		System.out.println(str);
		
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(2500);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		Thread.sleep(2500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
		
	
		Thread.sleep(7500);
		
		String actPDF = getBaseDir()+"\\autoIt\\ExportFiles\\ItemImageLayoutPDF.pdf";
		String expPDF = getBaseDir()+"\\autoIt\\ImportFiles\\ItemImageLayoutPDF.pdf";
		
		Thread.sleep(3902);

		PDFUtil pdfutil = new PDFUtil();
		Thread.sleep(3902);

		boolean result = pdfutil.compare(actPDF, expPDF);
		
		Thread.sleep(3902);
		
		System.out.println("Compared Result  : "+result);
		
		
		Thread.sleep(5500);
		
		

		String actData = pdfutil.getText(actPDF);
		String expData = pdfutil.getText(expPDF);
		
		Thread.sleep(5500);

		System.err.println(actData);
		System.err.println(expData);
		
		Thread.sleep(2500);

		//System.out.println("Compared Result  : "+result);
		
		
		
		if(result)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	public boolean checkSavingVoucher2inPurchaseVoucher() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		searchTxt.sendKeys("Purchases Vouchers");
		Thread.sleep(1500);
		searchTxt.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		click(newBtn);
		Thread.sleep(2000);
		
		click(purchaseAccountTxt);
		purchaseAccountTxt.sendKeys("STD RATE COGS ACC");
		Thread.sleep(2000);
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		click(vendorAccountTxt);
		vendorAccountTxt.sendKeys("Vendor A");
		Thread.sleep(2000);
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		click(warehouseTxt);
		warehouseTxt.sendKeys("HYDERABAD");
		Thread.sleep(2000);
		warehouseTxt.sendKeys(Keys.TAB);
		
		
		click(departmentTxt);
		departmentTxt.sendKeys("INDIA");
		Thread.sleep(2000);
		departmentTxt.sendKeys(Keys.TAB);
		
		click(select1stRow_1stColumn);
		click(enter_ItemTxt);
		enter_ItemTxt.sendKeys("NewItem");
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		click(select1stRow_3rdColumn);
		click(enter_Quantity);
		enter_Quantity.sendKeys("8");
		
		click(select1stRow_5thColumn);
		click(enter_Rate);
		enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		enter_Rate.sendKeys("10.89");
		enter_Rate.sendKeys(Keys.TAB);
		
		click(voucherSaveBtn);
		Thread.sleep(5000);
		
		click(billRefNewReferenceTxt);
		click(billRefPickIcon);
		click(pickBtn);
		Thread.sleep(4000);
		
		String expMsg="Voucher saved successfully";
		String expMsg1=": 5";
		
		String actMsg=checkValidationMessage(expMsg);
		
		click(VoucherEntryCloseBtn);
		
		if(actMsg.startsWith(expMsg) && actMsg.endsWith(expMsg1))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	
	}
	
	public boolean checkPrintPurchaseVocuherforItemHavingImage() throws IOException, InterruptedException, AWTException
	{
		File Efile=new File(getBaseDir()+"\\autoIt\\ExportFiles\\ExistingItemImageLayoutPDF.pdf");

		if(Efile.exists())
		{
			Efile.delete();
		}

		Thread.sleep(1600);

		Thread.sleep(2000);
		
		for(int i=0;i<grid_VoucherNoList.size();i++)
		{
			if(grid_VoucherNoList.get(i).getText().equals("5"))
			{
				grid_CheckBoxList.get(i).click();
				break;
			}
		}
		
		click(voucherHomePrintBtn);
		Thread.sleep(4000);
		click(layoutName);
		layoutName.sendKeys("LayoutWithImageinItem");
		Thread.sleep(2000);
		layoutName.sendKeys(Keys.TAB);
		click(printBtn);
		Thread.sleep(4000);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\ExistingItemImageLayoutPDF.exe");

		Thread.sleep(4000);
		
		String actPDF = getBaseDir()+"\\autoIt\\ExportFiles\\ExistingItemImageLayoutPDF.pdf";
		String expPDF = getBaseDir()+"\\autoIt\\ImportFiles\\ExistingItemImageLayoutPDF.pdf";

		PDFUtil pdfutil = new PDFUtil();

		boolean result = pdfutil.compare(actPDF, expPDF);

		String actData = pdfutil.getText(actPDF);
		String expData = pdfutil.getText(expPDF);

		System.err.println(actData);
		System.err.println(expData);

		System.out.println("Compared Result  : "+result);
		
		click(print_CloseBtn);
		
		if(result)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	
	}
	
	@FindBy(xpath="//*[@id='drpdownSlider']")
	public static WebElement acc_toggleBtn;
	
	@FindBy(xpath="//*[@id='btnCustomizeMaster']")
	public static WebElement acc_CustomizeMstr;
	
	@FindBy(xpath="//*[@id='tab_HeaderDetails_0']")
	public static WebElement custMstr_HeaderDetailsTab;
	
	@FindBy(xpath="//*[@id='btnAdd_Field_MasterCust']")
	public static WebElement custMstr_AddField;
	
	@FindBy(xpath="//*[@id='ExtraField_FieldCaption']")
	public static WebElement custMstr_AddFieldCaptionTxt;
	
	@FindBy(xpath="//*[@id='ddlDatatype_ExtraField']")
	public static WebElement custMstr_AddFieldDatatypeSelect;
	
	@FindBy(xpath="//*[@id='btnSaveRule']")
	public static WebElement custMstr_AddFieldOkBtn;
	
	@FindBy(xpath="(//i[@class='icon-save hiconright2'])[1]")
	public static WebElement custMstr_SaveBtn;
	
	@FindBy(xpath="(//*[@id='btnCloseMasterCutomizationFromMasterScreen'])[1]")
	public static WebElement custMstr_CloseBtn;
	
	@FindBy(xpath="//*[@id='BrowseImageField']")
	public static WebElement dept_BrowseBtn;
	
	public boolean checkSavingExtraFieldwithImageinDepartmentMaster() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		
		click(homeMenu);
		click(masterMenuBtn);
		click(departmentMenu);
		Thread.sleep(4000);
		/*
		click(acc_toggleBtn);
		
		click(acc_CustomizeMstr);
		Thread.sleep(2500);
		
		click(custMstr_HeaderDetailsTab);
		click(custMstr_AddField);
		Thread.sleep(2000);
		
		click(custMstr_AddFieldCaptionTxt);
		custMstr_AddFieldCaptionTxt.sendKeys("Image Field");
		custMstr_AddFieldCaptionTxt.sendKeys(Keys.TAB);
		
		click(custMstr_AddFieldDatatypeSelect);
		Select s=new Select(custMstr_AddFieldDatatypeSelect);
		s.selectByValue("7");
		
		click(custMstr_AddFieldOkBtn);
		Thread.sleep(2500);
		String expMsg="Field Added Successfully.";
		String actMsg=checkValidationMessage(expMsg);
		
		click(custMstr_SaveBtn);
		Thread.sleep(2500);
		String expMsg1="Master updated successfully";
		String actMsg1=checkValidationMessage(expMsg1);
		
		click(custMstr_CloseBtn);
		Thread.sleep(4000);
		*/
		click(itemNewBtn);
		Thread.sleep(2000);
		
		click(nameTxt);
		nameTxt.sendKeys("Dep1");
		nameTxt.sendKeys(Keys.TAB);
		
		click(codeTxt);
		codeTxt.sendKeys("Dep1");
		codeTxt.sendKeys(Keys.TAB);
		
		ClickUsingJs(dept_BrowseBtn);
		Thread.sleep(2500);
		Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\DeptAttachment.exe");

		Thread.sleep(6000);
		
		ClickUsingJs(itemSaveBtn);
		
		String expMsg2="Saved Successfully";
		String actMsg2=checkValidationMessage(expMsg2);
		
		if (/*
			 * actMsg.equalsIgnoreCase(expMsg) && actMsg1.equalsIgnoreCase(expMsg1) &&
			 */actMsg2.equalsIgnoreCase(expMsg2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public boolean checkSavingVoucher3inPurchaseVocuher() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		Thread.sleep(2500);
		
		getDriver().navigate().refresh();
		Thread.sleep(4000);
		searchTxt.sendKeys("Purchases Vouchers");
		Thread.sleep(1500);
		searchTxt.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		click(newBtn);
		Thread.sleep(2000);
		
		click(purchaseAccountTxt);
		purchaseAccountTxt.sendKeys("STD RATE COGS ACC");
		Thread.sleep(2000);
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		click(vendorAccountTxt);
		vendorAccountTxt.sendKeys("Vendor A");
		Thread.sleep(2000);
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		click(warehouseTxt);
		warehouseTxt.sendKeys("HYDERABAD");
		Thread.sleep(2000);
		warehouseTxt.sendKeys(Keys.TAB);
		
		
		//click(departmentTxt);
		//Thread.sleep(2000);
		departmentTxt.sendKeys("Dep1");
		Thread.sleep(6000);
		departmentTxt.sendKeys(Keys.TAB);
		
		click(select1stRow_1stColumn);
		click(enter_ItemTxt);
		enter_ItemTxt.sendKeys("STD RATE COGS");
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		click(select1stRow_3rdColumn);
		click(enter_Quantity);
		enter_Quantity.sendKeys("25");
		
		click(select1stRow_5thColumn);
		click(enter_Rate);
		enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		enter_Rate.sendKeys("13.25");
		enter_Rate.sendKeys(Keys.TAB);
		
		click(voucherSaveBtn);
		Thread.sleep(5000);
		
		click(billRefNewReferenceTxt);
		click(billRefPickIcon);
		click(pickBtn);
		Thread.sleep(4000);
		
		String expMsg="Voucher saved successfully";
		String expMsg1=": 6";
		
		String actMsg=checkValidationMessage(expMsg);
		
		click(VoucherEntryCloseBtn);
		
		if(actMsg.startsWith(expMsg) && actMsg.endsWith(expMsg1))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	
	
	}
	
	public boolean checkCreatingNewLayoutforDepartmentImageinPurchaseVoucher() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		

		Thread.sleep(2500);
		
		for(int i=0;i<grid_VoucherNoList.size();i++)
		{
			if(grid_VoucherNoList.get(i).getText().equals("6"))
			{
				grid_CheckBoxList.get(i).click();
				break;
			}
		}
		
		click(voucherHomePrintBtn);
		Thread.sleep(4000);
		
		click(voucherHomePrintCreateLayoutBtn);
		Thread.sleep(4000);
		
		click(voucherHomePrintBlankTemplatetBtn);
		Thread.sleep(4000);
		
		Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\DeptImageAttachment.exe");

		Thread.sleep(160000);
		getAction().moveToElement(printSaveDropdown).build().perform();
		click(printSaveDropdown);
		click(printSaveBtn);
		Thread.sleep(2000);
		click(printSaveTxt);
		printSaveTxt.sendKeys("LayoutWithImageinDept");
		click(printSave_SaveBtn);
		Thread.sleep(2000);
		
		String expMsg="Layout saved successfully";
		String actMsg=checkValidationMessage(expMsg);
		
		click(printExitBtn);
		
		if(actMsg.equalsIgnoreCase(expMsg))
		{
		
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean checkPrintPDFforDepartmentImageinPurchaseVoucher() throws IOException, InterruptedException, AWTException
	{
		

		Thread.sleep(5000);
		
		getDriver().navigate().refresh();
		Thread.sleep(4000);
		searchTxt.sendKeys("Purchases Vouchers");
		Thread.sleep(1500);
		searchTxt.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		File Efile=new File(getBaseDir()+"\\autoIt\\ExportFiles\\DeptImageLayoutPDF.pdf");

		if(Efile.exists())
		{
			Efile.delete();
		}

		Thread.sleep(1600);
		
		for(int i=0;i<grid_VoucherNoList.size();i++)
		{
			if(grid_VoucherNoList.get(i).getText().equals("6"))
			{
				grid_CheckBoxList.get(i).click();
				break;
			}
		}
		
		click(voucherHomePrintBtn);
		Thread.sleep(8000);
		click(layoutName);
		layoutName.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		layoutName.sendKeys("LayoutWithImageinDept");
		Thread.sleep(2000);
		layoutName.sendKeys(Keys.TAB);
		click(printBtn);
		Thread.sleep(10000);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
		
		StringSelection str = new StringSelection(getBaseDir()+"\\autoIt\\ExportFiles\\DeptImageLayoutPDF.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		System.out.println(str);
		
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		
		//Thread.sleep(15000);
		
		String actPDF = getBaseDir()+"\\autoIt\\ExportFiles\\DeptImageLayoutPDF.pdf";
		String expPDF = getBaseDir()+"\\autoIt\\ImportFiles\\DeptImageLayoutPDF.pdf";

		PDFUtil pdfutil = new PDFUtil();

		boolean result = pdfutil.compare(actPDF, expPDF);

		String actData = pdfutil.getText(actPDF);
		String expData = pdfutil.getText(expPDF);

		System.err.println(actData);
		System.err.println(expData);

		System.out.println("Compared Result  : "+result);
		
		
		
		if(result)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	
	}
	
	public boolean checkSavingVoucher4inPurchasesVoucher() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		

		Thread.sleep(2500);
		
		getDriver().navigate().refresh();
		Thread.sleep(4000);
		searchTxt.sendKeys("Purchases Vouchers");
		Thread.sleep(1500);
		searchTxt.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		click(newBtn);
		Thread.sleep(2000);
		
		click(purchaseAccountTxt);
		purchaseAccountTxt.sendKeys("STD RATE COGS ACC");
		Thread.sleep(2000);
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		click(vendorAccountTxt);
		vendorAccountTxt.sendKeys("Vendor A");
		Thread.sleep(2000);
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		click(warehouseTxt);
		warehouseTxt.sendKeys("HYDERABAD");
		Thread.sleep(2000);
		warehouseTxt.sendKeys(Keys.TAB);
		
		
		click(departmentTxt);
		departmentTxt.sendKeys("Dep2");
		Thread.sleep(4000);
		departmentTxt.sendKeys(Keys.TAB);
		
		click(select1stRow_1stColumn);
		click(enter_ItemTxt);
		enter_ItemTxt.sendKeys("STD RATE COGS");
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		click(select1stRow_3rdColumn);
		click(enter_Quantity);
		enter_Quantity.sendKeys("25");
		
		click(select1stRow_5thColumn);
		click(enter_Rate);
		enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		enter_Rate.sendKeys("13.25");
		enter_Rate.sendKeys(Keys.TAB);
		
		click(voucherSaveBtn);
		Thread.sleep(5000);
		
		click(billRefNewReferenceTxt);
		click(billRefPickIcon);
		click(pickBtn);
		Thread.sleep(4000);
		
		String expMsg="Voucher saved successfully";
		String expMsg1=": 7";
		
		String actMsg=checkValidationMessage(expMsg);
		
		click(VoucherEntryCloseBtn);
		
		if(actMsg.startsWith(expMsg) && actMsg.endsWith(expMsg1))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	
	
	
	}
	
	
	public boolean checkPrintPDFforDepartmentExistingImageinPurchasesVoucher() throws IOException, InterruptedException, AWTException
	{		

		Thread.sleep(5000);
		
		File Efile=new File(getBaseDir()+"\\autoIt\\ExportFiles\\DeptExistingImageLayoutPDF.pdf");

		if(Efile.exists())
		{
			Efile.delete();
		}

		Thread.sleep(1600);
		
		for(int i=0;i<grid_VoucherNoList.size();i++)
		{
			if(grid_VoucherNoList.get(i).getText().equals("7"))
			{
				grid_CheckBoxList.get(i).click();
				break;
			}
		}
		
		click(voucherHomePrintBtn);
		Thread.sleep(4000);
		click(layoutName);
		layoutName.sendKeys("LayoutWithImageinDept");
		Thread.sleep(2000);
		layoutName.sendKeys(Keys.TAB);
		click(printBtn);
		Thread.sleep(10000);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
		
		StringSelection str = new StringSelection(getBaseDir()+"\\autoIt\\ExportFiles\\DeptExistingImageLayoutPDF");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		System.out.println(str);
		
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		
		//Thread.sleep(15000);
		
		String actPDF = getBaseDir()+"\\autoIt\\ExportFiles\\DeptExistingImageLayoutPDF.pdf";
		String expPDF = getBaseDir()+"\\autoIt\\ImportFiles\\DeptExistingImageLayoutPDF.pdf";

		PDFUtil pdfutil = new PDFUtil();

		boolean result = pdfutil.compare(actPDF, expPDF);

		String actData = pdfutil.getText(actPDF);
		String expData = pdfutil.getText(expPDF);

		System.err.println(actData);
		System.err.println(expData);

		System.out.println("Compared Result  : "+result);
		
		
		
		if(result)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	
	
	}
	
	
	
	public boolean checkSavingVoucherwithNarrationfieldgivingArabicinPurchaseVocuher() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		

		

		Thread.sleep(2500);
		
		getDriver().navigate().refresh();
		Thread.sleep(4000);
		searchTxt.sendKeys("Purchases Vouchers");
		Thread.sleep(1500);
		searchTxt.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		click(newBtn);
		Thread.sleep(2000);
		
		click(purchaseAccountTxt);
		purchaseAccountTxt.sendKeys("STD RATE COGS ACC");
		Thread.sleep(2000);
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		click(vendorAccountTxt);
		vendorAccountTxt.sendKeys("Vendor A");
		Thread.sleep(2000);
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		click(warehouseTxt);
		warehouseTxt.sendKeys("HYDERABAD");
		Thread.sleep(2000);
		warehouseTxt.sendKeys(Keys.TAB);
		
		
		click(departmentTxt);
		departmentTxt.sendKeys("India");
		Thread.sleep(2000);
		departmentTxt.sendKeys(Keys.TAB);
		
		narrationTxt.sendKeys("٣٠٠٠٥٤٩٥٣١٠٠٠٠٣");
		narrationTxt.sendKeys(Keys.TAB);
		
		
		
		click(select1stRow_1stColumn);
		click(enter_ItemTxt);
		enter_ItemTxt.sendKeys("STD RATE COGS");
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		click(select1stRow_3rdColumn);
		click(enter_Quantity);
		enter_Quantity.sendKeys("85");
		
		click(select1stRow_5thColumn);
		click(enter_Rate);
		enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		enter_Rate.sendKeys("13.25");
		enter_Rate.sendKeys(Keys.TAB);
		
		click(voucherSaveBtn);
		Thread.sleep(5000);
		
		click(billRefNewReferenceTxt);
		click(billRefPickIcon);
		click(pickBtn);
		Thread.sleep(4000);
		
		String expMsg="Voucher saved successfully";
		String expMsg1=": 8";
		
		String actMsg=checkValidationMessage(expMsg);
		
		click(VoucherEntryCloseBtn);
		
		if(actMsg.startsWith(expMsg) && actMsg.endsWith(expMsg1))
		{
			return true;
		}
		else
		{
			return false;
		}
	
	
	}
	
	
	@FindBy(xpath="//*[@id='PreviewMenu']")
	public static WebElement layoutPreviewTab;
	
	@FindBy(xpath="//*[@id='printf']")
	public static WebElement layoutPreviewTabframe;
	
	@FindBy(xpath="/html/body/pre")
	public static WebElement layoutPreviewTabTxt;
	
	@FindBy(xpath="//*[@id='li_InvoiceDesigner']")
	public static WebElement layoutDesignerTab;
	
	public boolean checkEditingCreatedLayoutwithNarrationFieldWithoutProprties() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		Thread.sleep(2500);
		for(int i=0;i<grid_VoucherNoList.size();i++)
		{
			if(grid_VoucherNoList.get(i).getText().equals("8"))
			{
				grid_CheckBoxList.get(i).click();
				break;
			}
		}
		
		click(voucherHomePrintBtn);
		Thread.sleep(4000);
		
		click(layoutName);
		layoutName.sendKeys("LayoutWithImageinDept");
		Thread.sleep(2000);
		layoutName.sendKeys(Keys.TAB);
		
		
		click(voucherHomePrintEditLayoutBtn);
		Thread.sleep(4000);
		
		Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\NarrationField.exe");

		Thread.sleep(10000);
		
		getAction().moveToElement(printSaveDropdown).build().perform();
		click(printSaveDropdown);
		click(printSaveBtn);
		Thread.sleep(2000);
	
		
		String expMsg="Layout saved successfully";
		String actMsg=checkValidationMessage(expMsg);
		
		click(layoutPreviewTab);
		Thread.sleep(4000);
		
		getDriver().switchTo().frame(layoutPreviewTabframe);
		
		String actPreviewTxt=layoutPreviewTabTxt.getText();
		String expPreviewTxt="\"!020 - Input string was not in a correct format., FixedDocument must contain at least one FixedPage., Friday, December 19, 2025 4:32 PM\\r\\nLayout : LayoutWithImageinDept, VoucherType : 768.pdf\"";
		
		String expPreviewTxt2="\"!020 - Input string was not in a correct format., FixedDocument must contain at least one FixedPage., "+currentTimeWithDateTimewithDay()+"\\r\\nLayout : LayoutWithImageinDept, VoucherType : 768.pdf\"";
		System.out.println(actPreviewTxt);
		System.out.println(expPreviewTxt2);			
		
		if(actMsg.equalsIgnoreCase(expMsg) && actPreviewTxt.equalsIgnoreCase(expPreviewTxt2))
		{
		
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	
	
	@FindBy(xpath="//*[text()='Header.Narration']")
	public static WebElement narrationheader;
	
	@FindBy(xpath="/html/body/ul/li[5]/span")
	public static WebElement narrationheaderProperties;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFieldProperties']/table/tbody/tr[13]/td[2]/select")
	public static WebElement narrationheaderPrintNumberArabicSelect;
	
	public boolean checkEditingCreatedLayoutforaddingNarrrationField() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2500);
		
		getDriver().navigate().refresh();
		Thread.sleep(4000);
		searchTxt.sendKeys("Purchases Vouchers");
		Thread.sleep(1500);
		searchTxt.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		for(int i=0;i<grid_VoucherNoList.size();i++)
		{
			if(grid_VoucherNoList.get(i).getText().equals("8"))
			{
				grid_CheckBoxList.get(i).click();
				break;
			}
		}
		
		click(voucherHomePrintBtn);
		Thread.sleep(4000);
		
		click(layoutName);
		layoutName.sendKeys("LayoutWithImageinDept");
		Thread.sleep(2000);
		layoutName.sendKeys(Keys.TAB);
		
		
		click(voucherHomePrintEditLayoutBtn);
		Thread.sleep(4000);
		
			
		getAction().contextClick(narrationheader).build().perform();
		Thread.sleep(2000);
		click(narrationheaderProperties);
		Thread.sleep(2000);
		
		
		click(narrationheaderPrintNumberArabicSelect);
		Select s=new Select(narrationheaderPrintNumberArabicSelect);
		s.selectByValue("1");
		
		getAction().moveToElement(printSaveDropdown).build().perform();
		click(printSaveDropdown);
		click(printSaveBtn);
		Thread.sleep(2000);
		
		
		String expMsg="Layout saved successfully";
		String actMsg=checkValidationMessage(expMsg);
		
		
		
		click(printExitBtn);
		
		
		
		
		if(actMsg.equalsIgnoreCase(expMsg))
		{
		
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean checkPrintinPurchaseVoucherforNarrationFieldasArabic() throws IOException, InterruptedException, AWTException
	{
		

		Thread.sleep(5000);
		
		File Efile=new File(getBaseDir()+"\\autoIt\\ExportFiles\\NarrationWithArabicLayoutPDF.pdf");

		if(Efile.exists())
		{
			Efile.delete();
		}

		Thread.sleep(2500);
	
		
		click(voucherHomePrintBtn);
		Thread.sleep(10000);
		click(layoutName);
		layoutName.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		layoutName.sendKeys("LayoutWithImageinDept");
		Thread.sleep(2000);
		layoutName.sendKeys(Keys.TAB);
		click(printBtn);
		Thread.sleep(10000);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
		
		StringSelection str = new StringSelection(getBaseDir()+"\\autoIt\\ExportFiles\\NarrationWithArabicLayoutPDF.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		System.out.println(str);
		
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(6000);
		
		//Thread.sleep(15000);
		
		String actPDF = getBaseDir()+"\\autoIt\\ExportFiles\\NarrationWithArabicLayoutPDF.pdf";
		String expPDF = getBaseDir()+"\\autoIt\\ImportFiles\\NarrationWithArabicLayoutPDF.pdf";

		PDFUtil pdfutil = new PDFUtil();

		boolean result = pdfutil.compare(actPDF, expPDF);

		String actData = pdfutil.getText(actPDF);
		String expData = pdfutil.getText(expPDF);

		System.err.println(actData);
		System.err.println(expData);

		System.out.println("Compared Result  : "+result);
		
		
		
		if(result)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	
		
	}
	
	
	public static boolean checkLogoutFromVoucherPrintWithImagePage() throws InterruptedException
	{


		Thread.sleep(2000);

		getDriver().navigate().refresh();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(LogoutDropdown));
		LogoutDropdown.click();

		Thread.sleep(2500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();

		boolean actSignInBtn = signIn.isDisplayed();
		boolean expSignInBtn = true;


		if (actSignInBtn == expSignInBtn)
		{
			return true;
		} 
		else 
		{
			return false;
		}

	}

	
	
	public VoucherPrintWithImagePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
