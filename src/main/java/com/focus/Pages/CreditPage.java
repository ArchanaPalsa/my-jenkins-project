package com.focus.Pages;

import java.awt.AWTException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.xalan.xsltc.compiler.sym;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetElementDisplayed;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.supporters.NotePadReader;
import com.focus.utilities.POJOUtility;

public class CreditPage extends BaseEngine  
{

	private static String xlfile = getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	private static String resPass="Pass";
	private static String resFail="Fail";
	private static ExcelReader excelReader;
	private static String xlSheetName = "CreditPage";
	private static String xlSheetName1 = "RMA";
	
	@FindBy(xpath="//*[@id='16']")
	private static WebElement  settingsmenuBtn;
	
	@FindBy(xpath="//span[contains(text(),'Configure Transactions')]")
	private static WebElement  configureTransactionBtn;
	
	
	@FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='3']")
	private static WebElement  ARAPBtn;
	
	@FindBy(xpath="//*[@id='ARAccountsSettings']//button")
	private static WebElement arAccountSettingsBtn;
	
	@FindBy(xpath="//*[@id='CreditLimit']//button")
	private static WebElement CreditLimitBtn;

	@FindBy(xpath="//*[@id='chkARTag']/following-sibling::span")
	private static WebElement arTagChkBox; 
	
	@FindBy(xpath="//input[@id='chkARTag']")
	private static WebElement arTagChkBoxSelected; 
	
	@FindBy(xpath="//input[@id='optARTag']")
	private static WebElement arTagTxt;
	
	@FindBy(xpath="//input[@id='chkARSalesAC']/following-sibling::span")
	private static WebElement salesAccountChkBox;
	
	@FindBy(xpath="//input[@id='chkARProduct']/following-sibling::span")
	private static WebElement  arItemChkBox;
	
	@FindBy(xpath="//input[@id='chkEnableCreditLimitCheck']/following-sibling::span")
	private static WebElement enableCreditLimitCheckChkBox;
	
	@FindBy(xpath="//input[@id='chkEnableCreditLimitCheck']")
	private static WebElement enableCreditLimitCheckChkBoxSelected;
	
	@FindBy(xpath="//input[@id='chkIncludePendingSalesOrderValueInCreditLimitCheck']/following-sibling::span")
	private static WebElement includePendingSalesOrderChkBox;
	
	@FindBy(xpath="//input[@id='chkIncludePendingSalesOrderValueInCreditLimitCheck']")
	private static WebElement includePendingSalesOrderChkBoxSelected;
	
	
	@FindBy(xpath="//input[@id='chkCheckcreditlimitinorders']/following-sibling::span")
	private static WebElement checkCreditLimitInOrdersChkBox; 
	
	
	
	@FindBy(xpath="//input[@id='chkCheckcreditlimitinorders']")
	private static WebElement checkCreditLimitInOrdersChkBoxSelected; 
	
	@FindBy(xpath="//input[@id='chkDefineCreditLimitByDepartment']/following-sibling::span")
	private static WebElement defineCreditLimitByDepartmentChkBox;
	
	@FindBy(xpath="//input[@id='chkDefineCreditLimitByDepartment']")
	private static WebElement defineCreditLimitByDepartmentChkBoxSelected;
	
	@FindBy(xpath="//input[@id='chkAllowCreditLimitAuthorizationMappingToCustomer Group']")
	private static WebElement allowCreditLimitAuthorizationmappingChkBox;
	
	@FindBy(xpath="//input[@id='dvExceed_0']")
	private static WebElement  whenCreditLimitexceeded_WarnAndAllowRadio;
	
	@FindBy(xpath="//input[@id='dvExceed_1']")
	private static WebElement whenCreditLimitexceeded_StopRadio;
	
	@FindBy(xpath="//input[@id='dvExceed_2']")
	private static WebElement  RequestCreditLimitIncreaseRadio;

	@FindBy(xpath="//input[@id='chkPickCreditDayFromSalesAC']/following-sibling::span")
	private static WebElement pickCreditDayFromChkBox; 
	
	@FindBy(xpath="//input[@id='dvPickCreditDayFromSalesAC_0']")
	private static WebElement customerVendorACRadio;
	
	@FindBy(xpath="//input[@id='dvPickCreditDayFromSalesAC_1']")
	private static WebElement paymentsTermsRadio;
	
	@FindBy(xpath="//input[@id='dvPickCreditDayFromSalesAC_2']")
	private static WebElement  salesACRadio;
	
	@FindBy(xpath="//input[@id='chkAPTag']/following-sibling::span")
	private static WebElement apTagChkBox; 
	
	@FindBy(xpath="//input[@id='chkAPTag']")
	private static WebElement apTagChkBoxSelected; 
	
	@FindBy(xpath="//input[@id='optAPTag']")
	private static WebElement apTagTxt;
	
	@FindBy(xpath="//input[@id='chkAPPurchaseAC']/following-sibling::span")
	private static WebElement purchaseAccountChkBox;
	
	@FindBy(xpath="//input[@id='chkAPProduct']/following-sibling::span")
	private static WebElement  apItemChkBox;
	
	@FindBy(xpath="//input[@id='chkDependsonmaintainbillwiseforAR_AP']/following-sibling::span")
	private static WebElement dependsOnMaintainBillWiseForARAPChkBox;
	
	@FindBy(xpath="//input[@id='chkMaintainARTransactionCurrencies']/following-sibling::span")
	private static WebElement maintainARTransactionCurrenciesChkBox;
	
	@FindBy(xpath="//input[@id='chkMaintainAPTransactionCurrencies']/following-sibling::span")
	private static WebElement maintainAPTransactionCurrenciesChkBox; 
	
	@FindBy(xpath="//input[@id='chkInputNarrationInReferences']/following-sibling::span")
	private static WebElement inputNarrationInReferenceChkBox;
	
	@FindBy(xpath="//input[@id='chkEnableOverDueCheck']/following-sibling::span")
	private static WebElement enableOverDueCheckChkBox;
	
	@FindBy(xpath="//input[@id='chkEnableOverDueCheck']")
	private static WebElement enableOverDueCheckChkBoxSelected;
	
	@FindBy(xpath="//input[@id='chkCreditDaysInsteadOfDueDateForLimitCheck']/following-sibling::span")
	private static WebElement  useCreditDaysInsteadOfDueDateChkBox;
	
	@FindBy(xpath="//input[@id='chkCreditDaysInsteadOfDueDateForLimitCheck']")
	private static WebElement  useCreditDaysInsteadOfDueDateChkBoxSelected;
	
	@FindBy(xpath="//input[@id='dvOverdueExceed_0']")
	private static WebElement whenCreditDaysLimitexceeded_WarnAndAllowRadio;

	@FindBy(xpath="//input[@id='dvOverdueExceed_1']")
	private static WebElement whenCreditDaysLimitexceeded_StopRadio;

	
	@FindBy(xpath="//input[@id='chkAddFreeItems']")
	private static WebElement addfreeItemsonaNewLineChkBox; 
	
	
	
	@FindBy(xpath="//input[@id='chkCalDueDtLRDt']")
	private static WebElement calculatedueDateFromLRDateChkBox;
	
	@FindBy(xpath="//input[@id='chkCreateCustomerProfilefields']")
	private static WebElement createCustomerProfileFieldsChkBox;
	
	@FindBy(xpath="//input[@id='chkDialogbasedentryinvouchers']")
	private static WebElement  dialogbasedentryinvouchersChkBox;
	
	@FindBy(xpath="//input[@id='chkDontRefreshDescACProdDoc']")
	private static WebElement dontRefreshDescACProdDocChkBox; 
	
	@FindBy(xpath="//input[@id='chkIncUnCommitTransRpts']")
	private static WebElement includeUnCommitedTransactionChkBox;
	
	@FindBy(xpath="//input[@id='chkMntnLnksStkTransfer']")
	private static WebElement maintainLinksforOnlyOneSideChkBox;
	
	@FindBy(xpath="//input[@id='chkShowStatus']")
	private static WebElement  showStatusMessageInPopUphkox;
	
	@FindBy(xpath="//input[@id='chkPrefixLocationCode']")
	private static WebElement prefixLocationCodeWhileImportingChkBox; 
	
	@FindBy(xpath="//input[@id='chkShowTransactionInFifo']")
	private static WebElement showTransactionDateInFifo;
	
	@FindBy(xpath="//input[@id='chkEnableLocalCurrency']")
	private static WebElement enableLocalCurrencyChkBox;
	
	@FindBy(xpath="//input[@id='optLocalCurrency']")
	private static WebElement  localCurrencyTxt;
	
	@FindBy(xpath="//input[@id='chkDontShowOpeningBalLedger']")
	private static WebElement dontShowOpeningBalLedgerChkBox; 
	
	@FindBy(xpath="//input[@id='chkDontStoreDatesEntries']")
	private static WebElement dontStoreDatesEntriesChkBox;
	
	@FindBy(xpath="//input[@id='chkShowexchangeratedifferenceinledger']")
	private static WebElement showexchangeratedifferenceinledgerChkBox;
	
	@FindBy(xpath="//input[@id='chkEnableHijriDate']")
	private static WebElement  enableHijriDateChkBox;
	
	@FindBy(xpath="//input[@id='chkEnableprofitabilitycheckbyproduct']")
	private static WebElement enableprofitabilitycheckbyproductChkBox; 
	
	@FindBy(xpath="//input[@id='chkDonotLoadDocInExlusivemode']")
	private static WebElement donotLoadDocInExlusivemodeChkBox;
	
	@FindBy(xpath="//input[@id='chkCreateMasterinTransactionEntry']")
	private static WebElement createMasterinTransactionEntryChkBox;
	
	@FindBy(xpath="//input[@id='chkNextVoucherNoAftSaveVoucher']")
	private static WebElement  stayOnSameVoucherNumberAfterDeleteingChkBox;
	
	@FindBy(xpath="//input[@id='chkOpenSearchIfMasterNotFound']")
	private static WebElement openSearchIfMasterNotFoundChkBox; 
	
	@FindBy(xpath="//input[@id='chkloadDateBasesonLastSavedVoucher']")
	private static WebElement loadDateBasesonLastSavedVoucherChkBox;
	
	@FindBy(xpath="//input[@id='idfiltercurrencyBasedondepartment']")
	private static WebElement filtercurrencyBasedondepartmentChkBox;
	
	@FindBy(xpath="//input[@id='optCalendar']")
	private static WebElement  defaultCalanderTxt;
	 
	
	@FindBy(xpath="//select[@id='cmbImageformat']")
	private static WebElement imageFormatDropdown;
	
	@FindBy(xpath="//select[@id='cmbNumericSep']")
	private static WebElement numericSeperatorDropdown1;
	
	@FindBy(xpath="//input[@id='id_body_12']")
	private static WebElement  enter_PurchaseAccountTxt;

	@FindBy(xpath="//input[@id='id_body_12']")
	public static WebElement  enter_SalesAccountTxt;


	@FindBy(xpath="//*[@id='id_search_menu']/input")
	public static WebElement serachMenuTextHomePage;

	@FindBy(xpath="//li/span")
	public static WebElement searchMenuTextClick;

	

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
	
	@FindBy(id="ddlCompany")
	private static WebElement companyDropDownList;
	
	public boolean checkLogin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());

		getDriver().navigate().refresh();
		 Thread.sleep(1999);

		LoginPage lp=new LoginPage(getDriver()); 

		String unamelt="su";
				      
		String pawslt="su";
				      
		lp.enterUserName(unamelt);

		Thread.sleep(2000);
				
		lp.enterPassword(pawslt);

		String compname=excelReader.getCellData(xlSheetName, 9, 5);

		 Select oSelect = new Select(companyDropDownList);
		 
		 List <WebElement> elementCount = oSelect.getOptions();

		 int cqSize = elementCount.size();
		 
		 System.out.println("CompanyDropdownList Count :"+cqSize);

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
			
				
		  Thread.sleep(2000);

	   lp.clickOnSignInBtn();

		Thread.sleep(2000);
		
		String expFinancialsMenuDisplayed= excelReader.getCellData(xlSheetName, 10, 6);
		String actFinancialsMenuDisplayed=Boolean.toString(financialsMenu.isDisplayed());
		excelReader.setCellData(xlfile, xlSheetName, 10, 7, actFinancialsMenuDisplayed);
		
		if (actFinancialsMenuDisplayed.equalsIgnoreCase(expFinancialsMenuDisplayed)) 
		{
			 excelReader.setCellData(xlfile, xlSheetName, 6, 8, resPass);
			return true;
			
		}
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName,6, 8, resFail);
			return false;

		}
		
		
	}
	
	public static boolean checkRestoreCompany() throws InterruptedException, IOException, AWTException
	{


		BaseEngine.restoreCompany("CreditBillwise","BillWise");
		
		Thread.sleep(5000);
		
		String actUserInfo1=userNameTxt.getText();

		System.out.println("User Info  : "+actUserInfo1);

		System.out.println("User Info Capture Text  :  "+userNameTxt.getText());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogoImg));
		companyLogoImg.click();

		String getCompanyTxt1=companyName.getText();
		String getLoginCompanyName1=getCompanyTxt1.substring(0, 8);
		System.out.println("company name  :  "+ getLoginCompanyName1);
		companyLogoImg.click();

		String expUserInfo1           ="SU";
		String expLoginCompanyName1   ="BillWise";

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
	
	 public boolean checkErasingAllData() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());

		   Thread.sleep(4000);
		     
		     
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			checkValidationMessage("");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			Thread.sleep(1000);
				
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
			
			String expValidationMsg= excelReader.getCellData(xlSheetName, 12, 6);
			
			String actValidationMsg=checkValidationMessage(expValidationMsg);
			 excelReader.setCellData(xlfile, xlSheetName, 12, 7, actValidationMsg);

	     
			System.out.println("************************************* checkEraseAllTransactions  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			

			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllCloseBtn));
				eraseAllCloseBtn.click();
				 excelReader.setCellData(xlfile, xlSheetName, 11, 8, resPass);

				
				
				return true;
			} 
			else 
			{
				 excelReader.setCellData(xlfile, xlSheetName, 11, 8, resFail);
				return false;
			}
			
	   }
	 
	@FindBy(xpath="//*[@id='ARAccountsSettings']/button")
	public static WebElement ARAccountSettingsExpandBtn;
	
	@FindBy(xpath="//*[@id='CreditLimit']/button")
	public static WebElement creditLimitExpandBtn;
	
	
	public boolean chekARAPScreenUnderSettingsOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 
			getDriver().navigate().refresh();
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchTxt));
			searchTxt.click();
			searchTxt.sendKeys("Configure Transactions");
			Thread.sleep(1000);
			searchTxt.sendKeys(Keys.ENTER);
			
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ARAPBtn));
		ARAPBtn.click();
		
		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", ARAccountSettingsExpandBtn);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ARAccountSettingsExpandBtn));
		ARAccountSettingsExpandBtn.click();
		Thread.sleep(2000);
		//((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", arTagChkBox);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(arTagChkBox));
		
		String actarTagChkBox                             =Boolean.toString(arTagChkBox.isDisplayed());
		String actsalesAccountChkBox                      =Boolean.toString(salesAccountChkBox.isDisplayed());
		String actarItemChkBox                            =Boolean.toString(arItemChkBox.isDisplayed());
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditLimitExpandBtn));
		creditLimitExpandBtn.click();
		Thread.sleep(2000);
		
		String actenableCreditLimitCheckChkBox            =Boolean.toString(enableCreditLimitCheckChkBox.isDisplayed());
		String actpickCreditDayFromChkBox                 =Boolean.toString(pickCreditDayFromChkBox.isDisplayed());
		
		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", apTagChkBox);
		String actapTagChkBox                             =Boolean.toString(apTagChkBox.isDisplayed());
		String actpurchaseAccountChkBox                   =Boolean.toString(purchaseAccountChkBox.isDisplayed());
		String actapItemChkBox                            =Boolean.toString(apItemChkBox.isDisplayed());
		
		String actdependsOnMaintainBillWiseForARAPChkBox  =Boolean.toString(dependsOnMaintainBillWiseForARAPChkBox.isDisplayed());
		String actinputNarrationInReferenceChkBox         =Boolean.toString(inputNarrationInReferenceChkBox.isDisplayed());
		String actenableOverDueCheckChkBox                =Boolean.toString(enableOverDueCheckChkBox.isDisplayed());
		
		String exparTagChkBox  =excelReader.getCellData(xlSheetName, 14, 6);
		excelReader.setCellData(xlfile, xlSheetName, 14, 7, actarTagChkBox);
		
		String expsalesAccountChkBox  =excelReader.getCellData(xlSheetName, 15, 6);
		excelReader.setCellData(xlfile, xlSheetName, 15, 7, actsalesAccountChkBox);
		
		String exparItemChkBox   =excelReader.getCellData(xlSheetName, 16, 6);
		excelReader.setCellData(xlfile, xlSheetName, 16, 7, actarItemChkBox);
		
		String expenableCreditLimitCheckChkBox   =excelReader.getCellData(xlSheetName, 17, 6);
		excelReader.setCellData(xlfile, xlSheetName, 17, 7, actenableCreditLimitCheckChkBox);
		
		String exppickCreditDayFromChkBox    =excelReader.getCellData(xlSheetName, 18, 6);
		excelReader.setCellData(xlfile, xlSheetName, 18, 7, actpickCreditDayFromChkBox);
		
		String expapTagChkBox    =excelReader.getCellData(xlSheetName, 19, 6);
		excelReader.setCellData(xlfile, xlSheetName, 19, 7, actapTagChkBox);
		
		String exppurchaseAccountChkBox  =excelReader.getCellData(xlSheetName, 20, 6);
		excelReader.setCellData(xlfile, xlSheetName, 20, 7, actpurchaseAccountChkBox);
		
		String expapItemChkBox    =excelReader.getCellData(xlSheetName, 21, 6);
		excelReader.setCellData(xlfile, xlSheetName, 21, 7, actapItemChkBox);
		
		String expdependsOnMaintainBillWiseForARAPChkBox  =excelReader.getCellData(xlSheetName, 22, 6);
		excelReader.setCellData(xlfile, xlSheetName, 22, 7, actdependsOnMaintainBillWiseForARAPChkBox);
		
		String expinputNarrationInReferenceChkBox   =excelReader.getCellData(xlSheetName, 23, 6);
		excelReader.setCellData(xlfile, xlSheetName, 23, 7, actinputNarrationInReferenceChkBox);
		
		String expenableOverDueCheckChkBox   =excelReader.getCellData(xlSheetName, 24, 6);
		excelReader.setCellData(xlfile, xlSheetName, 24, 7, actenableOverDueCheckChkBox);
		
		
		System.out.println("**********************************checkARAPoptions**************************");
		
		System.out.println("arTagChkBox                             : "+actarTagChkBox                            +" Value Expected : "+exparTagChkBox);
		System.out.println("salesAccountChkBox                      : "+actsalesAccountChkBox                     +" Value Expected : "+expsalesAccountChkBox);
		System.out.println("arItemChkBox                            : "+actarItemChkBox                           +" Value Expected : "+exparItemChkBox);
		System.out.println("enableCreditLimitCheckChkBox            : "+actenableCreditLimitCheckChkBox           +" Value Expected : "+expenableCreditLimitCheckChkBox);
		System.out.println("pickCreditDayFromChkBox                 : "+actpickCreditDayFromChkBox                +" Value Expected : "+exppickCreditDayFromChkBox);
		System.out.println("apTagChkBox                             : "+actapTagChkBox                            +" Value Expected : "+expapTagChkBox);
		System.out.println("purchaseAccountChkBox                   : "+actpurchaseAccountChkBox                  +" Value Expected : "+exppurchaseAccountChkBox);
		System.out.println("apItemChkBox                            : "+actapItemChkBox                           +" Value Expected : "+expapItemChkBox);
		System.out.println("dependsOnMaintainBillWiseForARAPChkBox  : "+actdependsOnMaintainBillWiseForARAPChkBox +" Value Expected : "+expdependsOnMaintainBillWiseForARAPChkBox);
		System.out.println("inputNarrationInReferenceChkBox         : "+actinputNarrationInReferenceChkBox        +" Value Expected : "+expinputNarrationInReferenceChkBox);
		System.out.println("enableOverDueCheckChkBox                : "+actenableOverDueCheckChkBox               +" Value Expected : "+expenableOverDueCheckChkBox);
		
		
		
		boolean actMethod=actarTagChkBox.equalsIgnoreCase(exparTagChkBox) 
				&& actsalesAccountChkBox.equalsIgnoreCase(expsalesAccountChkBox) 
				&& actarItemChkBox.equalsIgnoreCase(exparItemChkBox)
				&& actenableCreditLimitCheckChkBox.equalsIgnoreCase(expenableCreditLimitCheckChkBox) 
				&& actpickCreditDayFromChkBox.equalsIgnoreCase(exppickCreditDayFromChkBox)
				&& actapTagChkBox.equalsIgnoreCase(expapTagChkBox) && actpurchaseAccountChkBox.equalsIgnoreCase(exppurchaseAccountChkBox) 
				&& actapItemChkBox.equalsIgnoreCase(expapItemChkBox)
				&& actdependsOnMaintainBillWiseForARAPChkBox.equalsIgnoreCase(expdependsOnMaintainBillWiseForARAPChkBox)
				&& actinputNarrationInReferenceChkBox.equalsIgnoreCase(expinputNarrationInReferenceChkBox)
				&& actenableOverDueCheckChkBox.equalsIgnoreCase(expenableOverDueCheckChkBox);
				
		String actREsult=Boolean.toString(actMethod);
		String expResult= excelReader.getCellData(xlSheetName, 25, 6);
        
		excelReader.setCellData(xlfile, xlSheetName, 25, 7, actREsult);
		
		
		if(actREsult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : ARAP Options are As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 13, 8, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : ARAP Options are NOT As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 13, 8, resFail);
			return false;
		}
	}
	
	
	public boolean checkTagsInARAP() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());

		Thread.sleep(1999);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(arTagChkBox));
		
		String actarTagChkBoxIsSelected=  Boolean.toString(arTagChkBoxSelected.isSelected());
		String  exparTagChkBoxIsSelected= excelReader.getCellData(xlSheetName, 26, 6);
		 excelReader.setCellData(xlfile, xlSheetName, 26, 7, actarTagChkBoxIsSelected);
		
		
		
		String actapTagChkBoxIsSelected=  Boolean.toString(apTagChkBoxSelected.isSelected());
		String expapTagChkBoxIsSelected=  excelReader.getCellData(xlSheetName, 27, 6);
        excelReader.setCellData(xlfile, xlSheetName, 27, 7, actapTagChkBoxIsSelected);
		
		String actarTagTxt  = arTagTxt.getAttribute("value");
		String exparTagTxt  = excelReader.getCellData(xlSheetName, 28, 6);
        excelReader.setCellData(xlfile, xlSheetName, 28, 7, actarTagTxt);
		
		String actapTagTxt  = apTagTxt.getAttribute("value");
		String expapTagTxt  = excelReader.getCellData(xlSheetName, 29, 6);
        excelReader.setCellData(xlfile, xlSheetName, 29, 7, actapTagTxt);
		
		System.out.println("**************************checkTagsinARAP******************************");
		System.out.println("ARTagCheckBoxSelected :" +actarTagChkBoxIsSelected + "Expected: "+exparTagChkBoxIsSelected);
		System.out.println("ApTagCheckBoxSelected :" +actapTagChkBoxIsSelected + "Expected: "+expapTagChkBoxIsSelected);
		System.out.println("ARTagText :" +actarTagTxt + "Expected: "+exparTagTxt);
		System.out.println("ApTagText :" +actapTagTxt + "Expected: "+expapTagTxt);
        
		if (actapTagChkBoxIsSelected .equalsIgnoreCase(expapTagChkBoxIsSelected) 
				&&actarTagChkBoxIsSelected.equalsIgnoreCase(exparTagChkBoxIsSelected)
				&& actapTagTxt.equalsIgnoreCase(expapTagTxt) 
				&& actarTagTxt.equalsIgnoreCase(exparTagTxt)) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 26, 8, resPass);
			return true;
			
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 26, 8, resFail);
			return false;
		}
		
	}

	@FindBy(xpath="//*[@id='60']")
	private static WebElement  financialsMenu; 
	
	@FindBy(xpath="//*[@id='2014']")
	private static WebElement  financialTransactionSalesMenu;
	
	@FindBy(xpath="//*[@id='2015']")
	private static WebElement  salesInvoiceVoucher;

/*	@FindBy(xpath="//*[@id='id_transaction_homescreen_new']/i")
	private static WebElement  newBtn;*/
	

	@FindBy(xpath="//a[@id='id_transaction_homescreen_new']//i")
	public static WebElement  newBtn;
	
	@FindBy(xpath="//input[@id='id_header_4']")
	private static WebElement  customerAccountTxt;
	
	@FindBy(xpath="//input[@id='fCreditLimit']")
	private static WebElement  creditLimitTxt;
	
	@FindBy(xpath="(//*[@id='btnMasterSaveClick'])[2]")
	public static WebElement accPopUpsaveBtn;
	
	@FindBy(xpath="//input[@id='iCreditDays']")
	private static WebElement  creditDaysTxt;
	
	@FindBy(xpath="//input[@id='id_header_3']")
	private static WebElement  salesAccountTxt;
	
	@FindBy(xpath="//tbody[@id='id_header_3_table_body']/tr/td[2]")
	private static List<WebElement> salesAccountListCount; 

    @FindBy(xpath="//tbody[@id='id_header_4_table_body']/tr/td[2]")
	private static List<WebElement> customerAccountListCount; 
	
	@FindBy(xpath="//input[@id='id_header_1']")
	private static WebElement  documentNumberTxt;
	
	@FindBy(xpath="//*[@id='id_header_1_input_image']/span")
	private static WebElement  documentNumberdropdown_ExpansionBtn;
	
	@FindBy(xpath="//input[@id='id_header_2']")
	private static WebElement  dateTxt;
	
	@FindBy(xpath="//td[@id='id_header_2_input_image']//span[@class='icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow']")
	private static WebElement  dateTxt_CalenderBtn;
	
	@FindBy(xpath="//tr[@id='id_header_2_day_today']//span[@class='theme_color-inverse'][contains(text(),'Today')]")
	private static WebElement  calender_TodayBtn;
	
	 
	@FindBy(xpath="//input[@id='id_header_268435460']")
	private static WebElement  warehouseTxt;
	
	@FindBy(xpath="//tbody[@id='id_header_268435460_table_body']/tr/td[2]")
	private static List<WebElement> warehouseHeaderComboList;
	
	@FindBy(xpath="//tbody[@id='id_body_23_table_body']/tr/td[2]")
	private static List<WebElement> itemComboList;
	
	@FindBy(xpath="//input[@id='id_body_23']")
	private static WebElement  enter_ItemTxt;
	
	@FindBy(xpath="//input[@id='id_body_33554464']")
	private static WebElement  enter_salesInvoiceFQ;
	
	@FindBy(xpath="//input[@id='id_body_27']")
	private static WebElement  enter_Rate;
	
	@FindBy(xpath="//input[@id='id_body_28']")
	private static WebElement  enter_Gross;
	
	@FindBy(xpath="//input[@id='id_header_268435460']")
	private static WebElement  wareHouseTxtinSalesInv;
	
	@FindBy(xpath="//input[@id='id_body_33554435']")
	private static WebElement  enter_Discount;
	
	
	
	@FindBy(xpath="//input[@id='id_body_33554438']")
	private static WebElement  enter_DiscountInSales;
	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[2]")
	private static WebElement  select1stRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[3]")
	private static WebElement  select1stRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[4]")
	private static WebElement  select1stRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[5]")
	private static WebElement  select1stRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[6]")
	private static WebElement  select1stRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[7]")
	private static WebElement  select1stRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[8]")
	private static WebElement  select1stRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[9]")
	private static WebElement  select1stRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[10]")
	private static WebElement  select1stRow_9thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[11]")
	private static WebElement  select1stRow_10thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[12]")
	private static WebElement  select1stRow_11thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[13]")
	private static WebElement  select1stRow_12thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[14]")
	private static WebElement  select1stRow_13thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[15]")
	private static WebElement  select1stRow_14thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[16]")
	private static WebElement  select1stRow_15thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[17]")
	private static WebElement  select1stRow_16thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[18]")
	private static WebElement  select1stRow_17thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[19]")
	private static WebElement  select1stRow_18thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[20]")
	private static WebElement  select1stRow_19thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[21]")
	private static WebElement  select1stRow_20thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[22]")
	private static WebElement  select1stRow_21stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[23]")
	private static WebElement  select1stRow_22ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[24]")
	private static WebElement  select1stRow_23rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[25]")
	private static WebElement  select1stRow_24thColumn;
	
	
	
	
	@FindBy(xpath="//*[@id='61']")
	private static WebElement  financialsTransactionMenu; 
		
	@FindBy(xpath="//*[@id='2023']")
	private static WebElement  financialsTransactionsJournalsMenu;
	
	@FindBy(xpath="//*[@id='2028']")
	private static WebElement  openingBalancesVoucher;
	
	@FindBy(xpath="//input[@id='id_header_10']")
	private static WebElement  voucherHeaderCurrency;
	
	@FindBy(xpath="//tbody[@id='id_header_10_table_body']/tr/td[2]")
	private static List<WebElement> currencyListCount;	
	
	//@FindBy(xpath="//input[@id='id_header_268435459']")
	@FindBy(xpath="//*[@id='id_header_268435459']")
	private static WebElement  departmentTxt;
	
	@FindBy(xpath="//input[@id='id_header_3']")
	public static WebElement  purchaseAccountTxt;


	 @FindBy(xpath="//input[@id='id_body_16']")
	   private static WebElement  enter_Amount;

	
	@FindBy(xpath="//input[@id='id_header_268435460']")
	private static WebElement  wareHouseTxt;
	
	@FindBy(xpath="//tbody[@id='id_header_268435459_table_body']/tr/td[2]")
    private static List<WebElement> departmentListCount;
	
	
	@FindBy(xpath="//*[@id='id_header_268435459_table_body']/tr/td[2]")
	private static List<WebElement> openingBalDepartmentList;
	
	@FindBy(xpath="//input[@id='id_body_12']")
	private static WebElement  enter_AccountTxt;
	
	@FindBy(xpath="//*[@id='id_body_12_table_body']/tr")
	private static List<WebElement> openingBalAccountListInGrid;
	
	@FindBy(xpath="//input[@id='id_body_18']")
	private static WebElement  enter_DebitTxt;
	
	@FindBy(xpath="//input[@id='id_body_19']")
	private static WebElement  enter_CreditTxt;
	
	@FindBy(xpath="//*[@id='lblAccount']")
	private static WebElement  billRefPartyName;
	
	@FindBy(xpath="//table[@id='id_Adjustment_Grid']")
	private static WebElement billRefAdjustBillsGrid;
	
	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr")
	private static List<WebElement> billRefAdjustBillsGridList;
	

@FindBy(xpath="//*[@id='id_transactionentry_save']")
private static WebElement openingBalancesSaveBtn;


	
	
	  //Bill Reference Screen 	
	

	@FindBy(xpath="//input[@id='txtNewReference']")
	private static WebElement  billRefNewReferenceTxt;
	

	
	public boolean checkCreditLimitOptionsAndAssigningCreditLimitToCustomer() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		Thread.sleep(1999);
		
	/*	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditLimitExpandBtn));
		creditLimitExpandBtn.click();*/
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enableCreditLimitCheckChkBox));
		if(enableCreditLimitCheckChkBoxSelected.isSelected()==false)
		{
			enableCreditLimitCheckChkBox.click();
		}
		
		if(includePendingSalesOrderChkBoxSelected.isSelected()==false)
		{
			includePendingSalesOrderChkBox.click();
		}
		
		if(checkCreditLimitInOrdersChkBoxSelected.isSelected()==false)
		{
			checkCreditLimitInOrdersChkBox.click();
		}
		
		if(whenCreditLimitexceeded_WarnAndAllowRadio.isSelected()==false)
		{
			whenCreditLimitexceeded_WarnAndAllowRadio.click();
		}
		
		if(defineCreditLimitByDepartmentChkBoxSelected.isSelected()==true)
		{
			defineCreditLimitByDepartmentChkBox.click();
		}
		
		  
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingUpdateIcon));
		settingUpdateIcon.click();
		
		Thread.sleep(2999);
		
		getWaitForAlert();
		
		getAlert().accept();
		
		
		String expValidationMessage=excelReader.getCellData(xlSheetName, 30, 6);
        String actValidationMessage=checkValidationMessage(expValidationMessage);
		excelReader.setCellData(xlfile, xlSheetName, 30, 7, actValidationMessage);
				
			  
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settings_closeBtn));
		settings_closeBtn.click();
		
		Thread.sleep(2999);
		
		getDriver().navigate().refresh();
		Thread.sleep(1200);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVoucher));
		salesInvoiceVoucher.click();
		
		Thread.sleep(3000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		    	
		checkValidationMessage("Screen opened");
		    	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAccountTxt));
	  	salesAccountTxt.click();
	  	salesAccountTxt.sendKeys(Keys.END);
	  	salesAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	  	salesAccountTxt.sendKeys(Keys.SPACE);
		 
	  	int customercount1=salesAccountListCount.size();
	  	
	  	System.err.println(customercount1);
	  	
	  	for(int j=0 ; j < customercount1 ;j++)
	  	{
	  		String data=salesAccountListCount.get(j).getText();
	  		
	  		if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 31, 5)))
	  		{
	  			salesAccountListCount.get(j).click();
	  			
	  			break;
	  		}
	  	}
				
	  	salesAccountTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.click();
		customerAccountTxt.sendKeys(Keys.END);
		customerAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		customerAccountTxt.sendKeys(Keys.SPACE);
		 
	  	int customercount=customerAccountListCount.size();
	  	
	  	System.err.println(customercount);
	  	
	  	for(int i=0 ; i < customercount ;i++)
	  	{
	  		String data=customerAccountListCount.get(i).getText();
	  		
	  		if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 32, 5)))
	  		{
	  			customerAccountListCount.get(i).click();
	  			
	  			break;
	  		}
	  	}
				
	  	customerAccountTxt.sendKeys(Keys.TAB);
	  	
	  	
	  	
	  	customerAccountTxt.click();
	  	
	  	customerAccountTxt.sendKeys(Keys.CONTROL, "e");
	  	Thread.sleep(2999);
	  	
	  	creditLimitTxt.click();
	  	creditLimitTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
	  	creditLimitTxt.sendKeys( excelReader.getCellData(xlSheetName, 33, 5));
	  	Thread.sleep(1999);
	  	creditLimitTxt.sendKeys(Keys.TAB);
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accPopUpsaveBtn));
	  	accPopUpsaveBtn.click();
	  	
	  	Thread.sleep(1999);
	  
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount=departmentListCount.size();
		
		System.err.println(departmentcount);
			
		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 34, 5)))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
		wareHouseTxt.click();
		wareHouseTxt.sendKeys( excelReader.getCellData(xlSheetName, 35, 5));
		
		Thread.sleep(2000);
		
		wareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	  	enter_ItemTxt.sendKeys(Keys.END);
	  	enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	  	enter_ItemTxt.sendKeys(Keys.BACK_SPACE);
	  	enter_ItemTxt.sendKeys(Keys.SPACE);
	  	
	  	Thread.sleep(2000);
	  	enter_ItemTxt.sendKeys( excelReader.getCellData(xlSheetName, 36, 5));
	  	Thread.sleep(2000);
	  	enter_ItemTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		
		enter_salesInvoiceFQ.click();
		enter_salesInvoiceFQ.clear();
		enter_salesInvoiceFQ.sendKeys( excelReader.getCellData(xlSheetName, 37, 5));
		Thread.sleep(2000);
		enter_salesInvoiceFQ.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
		select1stRow_11thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys( excelReader.getCellData(xlSheetName, 38, 5));
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
    	voucherSaveBtn.click();
    	
    	String expMessage1 =  excelReader.getCellData(xlSheetName, 39, 6);
    	String actMessage = checkValidationMessage(expMessage1);
    	excelReader.setCellData(xlfile, xlSheetName, 39, 7, actMessage);
		
    	//This Transaction will make the Credit Limit Negative Credit Limit is 100.00 whereas this transaction will make the balance as 110.00
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
    	String actBillwise=Boolean.toString(billRefNewReferenceTxt.isDisplayed());
    	String expBillwise=excelReader.getCellData(xlSheetName, 40, 6);
    	excelReader.setCellData(xlfile, xlSheetName, 40, 7, actBillwise);
    	
    	System.err.println("actBillwise  :"+actBillwise+" Value  "+expBillwise);
    	
    	
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefcancel));
    	billRefcancel.click();
    	
		if(actMessage.equalsIgnoreCase(expMessage1) &&
				actBillwise.equalsIgnoreCase(expBillwise))
		{
			System.out.println(" Test Pass: warm and Allow and Error Message is displayed ");
			 excelReader.setCellData(xlfile, xlSheetName, 30, 8, resPass);
			return true;
		}
		else
		{
			System.err.println(" Test Fail: warm and Allow and Error Message is displayed ");
			 excelReader.setCellData(xlfile, xlSheetName, 30, 8, resFail);
			return false;
		}
	}
	
	@FindBy(xpath="//*[@id='id_search_menu']/input")
	private static WebElement searchTxt;

	
	public boolean checkStopOptionInCreditLimitUnderSettings() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		Thread.sleep(1999);
		getDriver().navigate().refresh();
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchTxt));
		searchTxt.click();
		searchTxt.sendKeys("Configure Transactions");
		Thread.sleep(1000);
		searchTxt.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ARAPBtn));
		ARAPBtn.click();
		
		Thread.sleep(2000);
		
		checkValidationMessage("");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditLimitExpandBtn));
		creditLimitExpandBtn.click();
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(enableCreditLimitCheckChkBox));
		
		System.err.println("whenCreditLimitexceeded_StopRadio.isSelected()::"+whenCreditLimitexceeded_StopRadio.isSelected());
		
		if (whenCreditLimitexceeded_StopRadio.isSelected()==false) 
		{
			whenCreditLimitexceeded_StopRadio.click();
		}
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingUpdateIcon));
		settingUpdateIcon.click();
		
		Thread.sleep(2999);
		
		getWaitForAlert();
		
		getAlert().accept();
		
		
		String expValidationMessage=  excelReader.getCellData(xlSheetName, 42, 6);
       	String actValidationMessage=checkValidationMessage(expValidationMessage);
        excelReader.setCellData(xlfile, xlSheetName, 42, 7, actValidationMessage);		
			  
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settings_closeBtn));
		settings_closeBtn.click();
		
		Thread.sleep(2999);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVoucher));
		salesInvoiceVoucher.click();
		
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		    	
		checkValidationMessage("Screen opened");
		    	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAccountTxt));
	  	salesAccountTxt.click();
	  	salesAccountTxt.sendKeys(Keys.END);
	  	salesAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	  	salesAccountTxt.sendKeys(Keys.SPACE);
		 
	  	int customercount1=salesAccountListCount.size();
	  	
	  	System.err.println(customercount1);
	  	
	  	for(int j=0 ; j < customercount1 ;j++)
	  	{
	  		String data=salesAccountListCount.get(j).getText();
	  		
	  		if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 43, 5)))
	  		{
	  			salesAccountListCount.get(j).click();
	  			
	  			break;
	  		}
	  	}
				
	  	salesAccountTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.click();
		customerAccountTxt.sendKeys(Keys.END);
		customerAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		customerAccountTxt.sendKeys(Keys.SPACE);
		 
	  	int customercount=customerAccountListCount.size();
	  	
	  	System.err.println(customercount);
	  	
	  	for(int i=0 ; i < customercount ;i++)
	  	{
	  		String data=customerAccountListCount.get(i).getText();
	  		
	  		if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 44, 5)))
	  		{
	  			customerAccountListCount.get(i).click();
	  			
	  			break;
	  		}
	  	}
				
	  	customerAccountTxt.sendKeys(Keys.TAB);
	  	
	    Thread.sleep(1999);
	  
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount=departmentListCount.size();
		
		System.err.println(departmentcount);
			
		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 45, 5)))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
		wareHouseTxt.click();
		wareHouseTxt.sendKeys( excelReader.getCellData(xlSheetName, 46, 5));
		
		Thread.sleep(2000);
		
		wareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	  	enter_ItemTxt.sendKeys(Keys.END);
	  	enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	  	enter_ItemTxt.sendKeys(Keys.BACK_SPACE);
	  	enter_ItemTxt.sendKeys(Keys.SPACE);
	  	
	  	Thread.sleep(2000);
	  	enter_ItemTxt.sendKeys( excelReader.getCellData(xlSheetName, 47, 5));
	  	Thread.sleep(2000);
	  	enter_ItemTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		
		enter_salesInvoiceFQ.click();
		enter_salesInvoiceFQ.clear();
		enter_salesInvoiceFQ.sendKeys( excelReader.getCellData(xlSheetName, 48, 5));
		Thread.sleep(2000);
		enter_salesInvoiceFQ.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
		select1stRow_11thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys( excelReader.getCellData(xlSheetName, 49, 5));
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
    	voucherSaveBtn.click();
    	
    	
    	Thread.sleep(1000);
    	
    	String expMessage1 =  excelReader.getCellData(xlSheetName, 50, 6);
    	String actMessage = checkValidationMessage(expMessage1);
    	excelReader.setCellData(xlfile, xlSheetName, 50, 7, actMessage);
    	
    	System.err.println("Error: "+actMessage+" Value  "+expMessage1);
				
    	// Billwise screen should not display
    	Thread.sleep(2000);
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
    	departmentTxt.click();
    	
    	String  actBillwise=Boolean.toString(departmentTxt.isDisplayed());
    	String  expBillwise= excelReader.getCellData(xlSheetName, 51, 6);
    	excelReader.setCellData(xlfile, xlSheetName, 51, 7, actBillwise);
    	
    	System.err.println("actBillwise  :"+actBillwise+" Value  "+expBillwise);
    	
    	if(actMessage.equalsIgnoreCase(expMessage1) &&
				actBillwise.equalsIgnoreCase(expBillwise))
		{
			System.out.println(" Test Pass: Stop and Error Message is displayed ");
			 excelReader.setCellData(xlfile, xlSheetName, 41, 8, resPass);
			return true;
		}
		else
		{
			System.err.println(" Test Fail: Stop and Error Message is displayed ");
			 excelReader.setCellData(xlfile, xlSheetName, 41, 8, resFail);
			return false;
		}
	}
		
	
	@FindBy(xpath="//*[@id='id_Cancel']/a/span")
	private static WebElement  billRefcancel;		
	
	
	@FindBy(xpath="//*[@id='id_transactionentry_save']")
	private static WebElement  voucherSaveBtn;
	
	@FindBy(xpath="//div[@id='dvHomeTransClose']")  
	private static WebElement  voucherhomeCloseBtn;
	
	
	//@FindBy(xpath="//div[@class='theme_color font-6']")
	@FindBy(xpath="//*[@id='idGlobalError']/div/div[2]")//*[@id="idGlobalError"]/div/div[2]
	public static WebElement errorMessage;
	
	//@FindBy(xpath="//span[@class='icon-reject2 theme_color']")
	@FindBy(xpath="//*[@id='idGlobalError']/div/div[1]/button")
	public static WebElement errorMessageCloseBtn;
	
	
	@FindBy(xpath="//*[@id='btnCustomizeClose']/i")
	private static WebElement  settings_closeBtn;
	
	@FindBy(xpath="//a[@id='updateButton']/i")
	private static WebElement settingUpdateIcon;
	
	
	
	public boolean checkSavingOpeningBalanceVoucherWithHalfCreditLimit() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		Thread.sleep(2000);

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsJournalsMenu));
		financialsTransactionsJournalsMenu.click();
		
		Thread.sleep(2000);
		
		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", openingBalancesVoucher);		
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingBalancesVoucher));
		openingBalancesVoucher.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		Thread.sleep(1999);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		 
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
		voucherHeaderCurrency.click();
		
		voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
		
		voucherHeaderCurrency.sendKeys(Keys.SPACE);
		
		int currencycount=currencyListCount.size();
		
		System.err.println(currencycount);
			
		for(int i=0 ; i < currencycount ;i++)
		{
			String data=currencyListCount.get(i).getText();
			
			if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 53, 5)))
			{
				currencyListCount.get(i).click();
				
				break;
			}
		}
			
		voucherHeaderCurrency.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.SPACE);
		 
		int OpeningBalDepartmentListCount=openingBalDepartmentList.size();
		
		for (int i = 0; i < OpeningBalDepartmentListCount; i++) 
		{
			String data=openingBalDepartmentList.get(i).getText();
			
			if (data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 54, 5)))
			{
				openingBalDepartmentList.get(i).click();
				
				break;
			}
	 	 }
	   
		 departmentTxt.sendKeys(Keys.TAB);
		 
		 Thread.sleep(1999);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		 select1stRow_1stColumn.click();
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
		 enter_AccountTxt.click();
		 enter_AccountTxt.sendKeys(excelReader.getCellData(xlSheetName, 55, 5));
		 
		 int accountCount=openingBalAccountListInGrid.size();
			
		System.err.println(accountCount);
			
		for(int i=0 ; i < accountCount ;i++)
		{
			String data=openingBalAccountListInGrid.get(i).getText();
			
			if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 56, 5)))
			{
				openingBalAccountListInGrid.get(i).click();
				
				break;
			}
		}
		
		enter_AccountTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_DebitTxt));
		enter_DebitTxt.sendKeys(excelReader.getCellData(xlSheetName, 57, 5));
		enter_DebitTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_CreditTxt));
		enter_CreditTxt.sendKeys(Keys.TAB);
		
		/*
		
		*/
		Thread.sleep(2000);

		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		billRefNewReferenceTxt.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		
		Thread.sleep(4000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingBalancesSaveBtn));
		openingBalancesSaveBtn.click();
		
		boolean savingVoucher=checkVoucherSavingMessage(docno);
		if(savingVoucher==true)
		{
			System.out.println(" Test Pass: Voucher Saved With all Credit Amounts ");
			 excelReader.setCellData(xlfile, xlSheetName, 52, 8, resPass);
			return true;
			
		} 
		else
		{
			System.out.println(" Test Fail: Voucher Saved With all Credit Amounts ");
			 excelReader.setCellData(xlfile, xlSheetName, 52, 8, resFail);
	          return false;
		}
		
	}
	
	
	
 public boolean checkVoucherSavingMessage(String docno) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
 {
	try
	{
		checkValidationMessage("");
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
		String actErrorMessage=errorMessage.getText();
		String expErrorMessage="Voucher saved successfully";
		String expErrorMessage1=": "+docno;

		System.out.println("SavingMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage+" "+expErrorMessage1);
	
	if(actErrorMessage.startsWith(expErrorMessage) && actErrorMessage.endsWith(expErrorMessage1))
	{
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
			errorMessageCloseBtn.click();
			
			return  true;
		}
		catch(Exception ee)
		{
			return true;
		}	
	}
	else
	{
		return false;
	}	
}
catch(Exception e)
{
	System.err.println("UNABLE TO COMPARE");
		return false;
	}
 }
	
 public boolean checkEnteringDATAInsalesINvoiceAfterSavingOpeningBalance() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
 {
	 
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 
	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVoucher));
		salesInvoiceVoucher.click();
		
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		    	
		checkValidationMessage("Screen opened");
		    	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAccountTxt));
	  	salesAccountTxt.click();
	  	salesAccountTxt.sendKeys(Keys.END);
	  	salesAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	  	salesAccountTxt.sendKeys(Keys.SPACE);
		 
	  	int customercount1=salesAccountListCount.size();
	  	
	  	System.err.println(customercount1);
	  	
	  	for(int j=0 ; j < customercount1 ;j++)
	  	{
	  		String data=salesAccountListCount.get(j).getText();
	  		
	  		if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 59, 5)))
	  		{
	  			salesAccountListCount.get(j).click();
	  			
	  			break;
	  		}
	  	}
				
	  	salesAccountTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.click();
		customerAccountTxt.sendKeys(Keys.END);
		customerAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		customerAccountTxt.sendKeys(Keys.SPACE);
		 
	  	int customercount=customerAccountListCount.size();
	  	
	  	System.err.println(customercount);
	  	
	  	for(int i=0 ; i < customercount ;i++)
	  	{
	  		String data=customerAccountListCount.get(i).getText();
	  		
	  		if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 60, 5)))
	  		{
	  			customerAccountListCount.get(i).click();
	  			
	  			break;
	  		}
	  	}
				
	  	customerAccountTxt.sendKeys(Keys.TAB);
	  	
	    Thread.sleep(1999);
	  
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount=departmentListCount.size();
		
		System.err.println(departmentcount);
			
		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 61, 5)))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
		wareHouseTxt.click();
		wareHouseTxt.sendKeys( excelReader.getCellData(xlSheetName, 62, 5));
		
		Thread.sleep(2000);
		
		wareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	  	enter_ItemTxt.sendKeys(Keys.END);
	  	enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	  	enter_ItemTxt.sendKeys(Keys.BACK_SPACE);
	  	enter_ItemTxt.sendKeys(Keys.SPACE);
	  	
	  	Thread.sleep(2000);
	  	enter_ItemTxt.sendKeys( excelReader.getCellData(xlSheetName, 63, 5));
	  	Thread.sleep(2000);
	  	enter_ItemTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		
		enter_salesInvoiceFQ.click();
		enter_salesInvoiceFQ.clear();
		enter_salesInvoiceFQ.sendKeys( excelReader.getCellData(xlSheetName, 64, 5));
		Thread.sleep(2000);
		enter_salesInvoiceFQ.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
		select1stRow_11thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys( excelReader.getCellData(xlSheetName, 65, 5));
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
 	voucherSaveBtn.click();
 	
 	Thread.sleep(2000);
 	
 	
 	String expMessage1 =  excelReader.getCellData(xlSheetName, 66, 6);
 	String actMessage = checkValidationMessage(expMessage1);
 	excelReader.setCellData(xlfile, xlSheetName, 66, 7, actMessage);
 	// Billwise screen should not display
 	Thread.sleep(2000);
 	
 	try
 	{
 		boolean actNewRef = newReferenceTxt.isDisplayed();
 	 	boolean expNewRef = false;
 	 	System.err.println("actBillwise  :"+actNewRef+" Value  "+expNewRef);
 	}
 	
 	catch(Exception e)
 	{
 		System.out.println("Exception:"+e);
 	}
 	
 	
 	
 	
 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
 	departmentTxt.click();
 	Thread.sleep(1000);
 	
 	String actBillwise=Boolean.toString(departmentTxt.isDisplayed());
 	String expBillwise=excelReader.getCellData(xlSheetName, 67, 6);
 	excelReader.setCellData(xlfile, xlSheetName, 67, 7, actMessage);
 	
 	
 	
 	if(actMessage.equalsIgnoreCase(expMessage1) &&
				actBillwise.equalsIgnoreCase(expBillwise))
		{
			System.out.println(" Test Pass: Stop and Error Message is displayed ");
			excelReader.setCellData(xlfile, xlSheetName, 58, 8, resPass);
			return true;
		}
		else
		{
			System.err.println(" Test Fail: Stop and Error Message is displayed ");
			excelReader.setCellData(xlfile, xlSheetName, 58, 8, resFail);
			return false;
		}
	}
	
	@FindBy(xpath="//*[@id='id_Pick']/a/span")
	private static WebElement  billRefPickIcon;		

	@FindBy(xpath="//*[@id='id_Ok']/a/span")
	private static WebElement  billRefOkBtn;
	
	@FindBy(xpath="//input[@id='id_header_6']")
	private static WebElement  voucherHeaderDueDate;
	
	public boolean checkEnableOverDueCheckUnderARAPinSettings() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(1999);
		excelReader=new ExcelReader(POJOUtility.getExcelPath());

		getDriver().navigate().refresh();
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchTxt));
		searchTxt.click();
		searchTxt.sendKeys("Configure Transactions");
		Thread.sleep(1000);
		searchTxt.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ARAPBtn));
		ARAPBtn.click();
		
		
		Thread.sleep(1999);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(creditLimitExpandBtn));
		creditLimitExpandBtn.click();
		Thread.sleep(1000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(whenCreditLimitexceeded_WarnAndAllowRadio));
		if(whenCreditLimitexceeded_WarnAndAllowRadio.isSelected()==false)
		{
			whenCreditLimitexceeded_WarnAndAllowRadio.click();
		}
		
		Thread.sleep(1000);
		getAction().moveToElement(enableOverDueCheckChkBox).build().perform();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enableOverDueCheckChkBox));
		
		if(enableOverDueCheckChkBoxSelected.isSelected()==false)
		{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enableOverDueCheckChkBox));
		enableOverDueCheckChkBox.click();
		}
		
		Thread.sleep(1000);
		getAction().moveToElement(useCreditDaysInsteadOfDueDateChkBox).build().perform();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(useCreditDaysInsteadOfDueDateChkBox));
		
		if(useCreditDaysInsteadOfDueDateChkBoxSelected.isSelected()==false)
		{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(useCreditDaysInsteadOfDueDateChkBox));
		useCreditDaysInsteadOfDueDateChkBox.click();
		}
		
		Thread.sleep(1000);
		
		String actenableOverDueCheckChkBox=Boolean.toString(enableOverDueCheckChkBoxSelected.isSelected());
		String expenableOverDueCheckChkBox=excelReader.getCellData(xlSheetName, 69, 6);
        excelReader.setCellData(xlfile, xlSheetName, 69, 7, actenableOverDueCheckChkBox);

		
		String actuseCreditDaysInsteadOfDueDateChkBox=Boolean.toString(useCreditDaysInsteadOfDueDateChkBoxSelected.isSelected());
		String expuseCreditDaysInsteadOfDueDateChkBox=excelReader.getCellData(xlSheetName, 70, 6);
        excelReader.setCellData(xlfile, xlSheetName, 70, 7, actenableOverDueCheckChkBox);

		
		System.err.println("enableOverDueCheckChkBox  : "+actenableOverDueCheckChkBox +"**********"+expenableOverDueCheckChkBox);
		System.err.println("useCreditDaysInsteadOfDueDateChkBox : "+actuseCreditDaysInsteadOfDueDateChkBox +" ****"+expuseCreditDaysInsteadOfDueDateChkBox);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingUpdateIcon));
		settingUpdateIcon.click();
		
		Thread.sleep(2999);
		
		for (int i = 0; i < 2; i++) 
		{
			getWaitForAlert();
			
			getAlert().accept();
			
		}
		
		
		
		String expValidationMessage=excelReader.getCellData(xlSheetName, 71, 6);
		
		String actValidationMessage=checkValidationMessage(expValidationMessage);
		excelReader.setCellData(xlfile, xlSheetName, 71, 7, actValidationMessage);	
			  
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settings_closeBtn));
		settings_closeBtn.click();
		
		
		
		if (actenableOverDueCheckChkBox.equalsIgnoreCase(expenableOverDueCheckChkBox )
				&&actuseCreditDaysInsteadOfDueDateChkBox.equalsIgnoreCase(expuseCreditDaysInsteadOfDueDateChkBox )
				&& actValidationMessage.equalsIgnoreCase(expValidationMessage))
		{
			excelReader.setCellData(xlfile, xlSheetName, 68, 8, resPass);
			System.out.println(" Test Pas: Allow to Check OverDue");
			return true;
			
		} 
		else
		{
			System.out.println(" Test Fai: Allow to Check OverDue");
			excelReader.setCellData(xlfile, xlSheetName, 68, 8, resPass);
			return false;

		}
		
	}
	
	
	public boolean checkAddingCreditDaysATAccountThroughShortCutAndCheckingChangesInDueDate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());

		 
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
						
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
						
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
			financialTransactionSalesMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVoucher));
			salesInvoiceVoucher.click();
			
			Thread.sleep(2000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			    	
			checkValidationMessage("Screen opened");
			    	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAccountTxt));
		  	salesAccountTxt.click();
		  	salesAccountTxt.sendKeys(Keys.END);
		  	salesAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		  	salesAccountTxt.sendKeys(Keys.SPACE);
			 
		  	int customercount1=salesAccountListCount.size();
		  	
		  	System.err.println(customercount1);
		  	
		  	for(int j=0 ; j < customercount1 ;j++)
		  	{
		  		String data=salesAccountListCount.get(j).getText();
		  		
		  		if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 73, 5)))
		  		{
		  			salesAccountListCount.get(j).click();
		  			
		  			break;
		  		}
		  	}
					
		  	salesAccountTxt.sendKeys(Keys.TAB);
			
			
		
		Thread.sleep(1999);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.click();
		customerAccountTxt.sendKeys(Keys.END);
		customerAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		customerAccountTxt.sendKeys(Keys.SPACE);
		 
	  	int customercount=customerAccountListCount.size();
	  	
	  	System.err.println(customercount);
	  	
	  	for(int i=0 ; i < customercount ;i++)
	  	{
	  		String data=customerAccountListCount.get(i).getText();
	  		
	  		if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 74, 5)))
	  		{
	  			customerAccountListCount.get(i).click();
	  			
	  			break;
	  		}
	  	}
				
	  	customerAccountTxt.sendKeys(Keys.TAB);
	  	
	  	Thread.sleep(1999);
	  	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.click();
		customerAccountTxt.sendKeys(Keys.END);
		customerAccountTxt.sendKeys(Keys.CONTROL, "e");
		
		
		Thread.sleep(1999);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditDaysTxt));
		
		creditDaysTxt.click();
		creditDaysTxt.clear();
		creditDaysTxt.sendKeys( excelReader.getCellData(xlSheetName, 75, 5));
		
		System.out.println(" Entered Crtedit Days With Customer A ");
		
		Thread.sleep(1999);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accPopUpsaveBtn));
	  	accPopUpsaveBtn.click();
	  	
	  	Thread.sleep(1999);
	  	
	  	getDriver().navigate().refresh();
	  	
	  	Thread.sleep(2000);
	  	
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVoucher));
		salesInvoiceVoucher.click();
		
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		    	
		checkValidationMessage("Screen opened");
		    	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAccountTxt));
	  	salesAccountTxt.click();
	  	salesAccountTxt.sendKeys(Keys.END);
	  	salesAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	  	salesAccountTxt.sendKeys(Keys.SPACE);
	  	
	  	System.err.println(customercount1);
	  	
	  	for(int j=0 ; j < customercount1 ;j++)
	  	{
	  		String data=salesAccountListCount.get(j).getText();
	  		
	  		if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 76, 5)))
	  		{
	  			salesAccountListCount.get(j).click();
	  			
	  			break;
	  		}
	  	}
				
	  	salesAccountTxt.sendKeys(Keys.TAB);
		
		
	
	Thread.sleep(1999);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
	customerAccountTxt.click();
	customerAccountTxt.sendKeys(Keys.END);
	customerAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	customerAccountTxt.sendKeys(Keys.SPACE);
	 
  	
  	
  	for(int i=0 ; i < customercount ;i++)
  	{
  		String data=customerAccountListCount.get(i).getText();
  		
  		if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 77, 5)))
  		{
  			customerAccountListCount.get(i).click();
  			
  			break;
  		}
  	}
			
  	customerAccountTxt.sendKeys(Keys.TAB);
  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.click();
		customerAccountTxt.sendKeys(Keys.END);
		customerAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		customerAccountTxt.sendKeys(Keys.SPACE);
		 
	  	int customercount2=customerAccountListCount.size();
	  	
	  	System.err.println(customercount2);
	  	
	  	for(int i=0 ; i < customercount2 ;i++)
	  	{
	  		String data=customerAccountListCount.get(i).getText();
	  		
	  		if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 78, 5)))
	  		{
	  			customerAccountListCount.get(i).click();
	  			
	  			break;
	  		}
	  	}
				
	  	customerAccountTxt.sendKeys(Keys.TAB);
	  	
	  	
	  	Thread.sleep(1999);
	  
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderDueDate));
	  	
	  	String actvoucherHeaderDueDate=voucherHeaderDueDate.getAttribute("value");
	  	
	  	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	  	   
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat currentDate = new SimpleDateFormat("dd/MM/yyyy");
		cal.add(Calendar.DATE, 3); 
		
		String next2DaysDate=df.format(cal.getTime());
	  	
	  	String expvoucherHeaderDueDate=next2DaysDate;
	  	excelReader.setCellData(xlfile, xlSheetName, 79, 6, expvoucherHeaderDueDate);
	  	excelReader.setCellData(xlfile, xlSheetName, 79, 7, actvoucherHeaderDueDate);
		
	  	System.err.println(" ACT Due Date  : "+actvoucherHeaderDueDate);
	  	System.err.println(" Exp Due Date  : "+expvoucherHeaderDueDate);
	  	
	  	if (actvoucherHeaderDueDate.equalsIgnoreCase(expvoucherHeaderDueDate)) 
	  	{
	  		excelReader.setCellData(xlfile, xlSheetName, 72, 8, resPass);
	  		return true;
			
		}
	  	else
	  	{
	  		excelReader.setCellData(xlfile, xlSheetName, 72, 8, resFail);

	  		return false;
		}
	}
	@FindBy (xpath="//*[@id='26']")
	private static WebElement backup;
		
	@FindBy (xpath="//*[@id='27']")
	private static WebElement restore;
	
	@FindBy (xpath="//*[@id='111']")
	private static WebElement reindex;
	
	@FindBy (xpath="//*[@id='115']")
	private static WebElement eraseAll;
		
	@FindBy (xpath="//input[@id='idEraseTransaction']")
	private static WebElement eraseTranscationsRadio;
	
	@FindBy (xpath="//*[@id='navbarSupportedContent2']/ul/li[1]/a/i")
	private static WebElement eraseAllOkBtn;
	
	@FindBy (xpath="//*[@id='navbarSupportedContent2']/ul/li[2]/a/i")
	private static WebElement eraseAllCloseBtn;
	

    //DataManagement menu
	@FindBy (xpath="//*[@id='25']/span")
    private static WebElement dataMangementMenu;
	
		@FindBy(xpath = "//*[@id='1']")
		public static WebElement homeMenu;


	public boolean checkRaisingSalesInvoiceVoucherMoreThanCreditlimit() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
        excelReader=new ExcelReader(POJOUtility.getExcelPath());
		Thread.sleep(1999);
		getDriver().navigate().refresh();
		
		Thread.sleep(1999);
		
		checkValidationMessage("No Dashlate Available for this Dashboard");
	     
		Thread.sleep(3000);
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
		dataMangementMenu.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
		eraseAll.click();
		
		checkValidationMessage("");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
		eraseTranscationsRadio.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
		eraseAllOkBtn.click();
		Thread.sleep(1000);
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
			String expValidationMsg=excelReader.getCellData(xlSheetName, 81, 6);
			
			String actValidationMsg=checkValidationMessage(expValidationMsg);
			excelReader.setCellData(xlfile, xlSheetName, 81, 7, actValidationMsg);
			
	     
			Thread.sleep(2999);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
						
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
						
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
			financialTransactionSalesMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVoucher));
			salesInvoiceVoucher.click();
			
			Thread.sleep(2000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			Thread.sleep(1200);
			    	
			checkValidationMessage("Screen opened");
			    	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAccountTxt));
		  	salesAccountTxt.click();
		  	salesAccountTxt.sendKeys(Keys.END);
		  	salesAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		  	salesAccountTxt.sendKeys(Keys.SPACE);
			 
		  	int customercount1=salesAccountListCount.size();
		  	
		  	System.err.println(customercount1);
		  	
		  	for(int j=0 ; j < customercount1 ;j++)
		  	{
		  		String data=salesAccountListCount.get(j).getText();
		  		
		  		if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 82, 5)))
		  		{
		  			salesAccountListCount.get(j).click();
		  			
		  			break;
		  		}
		  	}
					
		  	salesAccountTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.click();
			customerAccountTxt.sendKeys(Keys.END);
			customerAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			customerAccountTxt.sendKeys(Keys.SPACE);
			 
		  	int customercount=customerAccountListCount.size();
		  	
		  	System.err.println(customercount);
		  	
		  	for(int i=0 ; i < customercount ;i++)
		  	{
		  		String data=customerAccountListCount.get(i).getText();
		  		
		  		if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 83, 5)))
		  		{
		  			customerAccountListCount.get(i).click();
		  			
		  			break;
		  		}
		  	}
					
		  	customerAccountTxt.sendKeys(Keys.TAB);
		  	
		  	
		  	
		  	customerAccountTxt.click();
		  	
		  	customerAccountTxt.sendKeys(Keys.CONTROL, "e");
		  	Thread.sleep(2999);
		  	
		  	creditLimitTxt.click();
		  	creditLimitTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		  	creditLimitTxt.sendKeys(excelReader.getCellData(xlSheetName, 84, 5));
		  	Thread.sleep(1999);
		  	creditLimitTxt.sendKeys(Keys.TAB);
		  	
		  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accPopUpsaveBtn));
		  	accPopUpsaveBtn.click();
		  	
		  	Thread.sleep(1999);
		  
		  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys(Keys.SPACE);
				
			int departmentcount=departmentListCount.size();
			
			System.err.println(departmentcount);
				
			for(int i=0 ; i < departmentcount ;i++)
			{
				String data=departmentListCount.get(i).getText();
				
				if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 85, 5)))
				{
					departmentListCount.get(i).click();
					
					break;
				}
			}
				
			departmentTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys(excelReader.getCellData(xlSheetName, 86, 5));
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		  	enter_ItemTxt.sendKeys(Keys.END);
		  	enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		  	enter_ItemTxt.sendKeys(Keys.BACK_SPACE);
		  	enter_ItemTxt.sendKeys(Keys.SPACE);
		  	
		  	Thread.sleep(2000);
		  	enter_ItemTxt.sendKeys(excelReader.getCellData(xlSheetName, 87, 5));
		  	Thread.sleep(2000);
		  	enter_ItemTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			
			enter_salesInvoiceFQ.click();
			enter_salesInvoiceFQ.clear();
			enter_salesInvoiceFQ.sendKeys(excelReader.getCellData(xlSheetName, 88, 5));
			Thread.sleep(2000);
			enter_salesInvoiceFQ.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
			select1stRow_11thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.click();
			enter_Rate.clear();
			enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 89, 5));
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.click();
			enter_Gross.sendKeys(Keys.TAB);
			
			String docno=documentNumberTxt.getAttribute("value");
			
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
	    	voucherSaveBtn.click();
	    	Thread.sleep(1000);
	    	
	    	String expMessage1 = excelReader.getCellData(xlSheetName, 90, 6);
	    	String actMessage = checkValidationMessage(expMessage1);
	    	excelReader.setCellData(xlfile, xlSheetName, 90, 7, actMessage);
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
	    	String  actBillwise=Boolean.toString(billRefNewReferenceTxt.isDisplayed());
	    	String expBillwise = excelReader.getCellData(xlSheetName, 91, 6);
            excelReader.setCellData(xlfile, xlSheetName, 91, 7, actBillwise);

	    	
	    	System.err.println("actBillwise  :"+actBillwise+" Value  "+expBillwise);
	    	
	    	Thread.sleep(1999);
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
	    	billRefNewReferenceTxt.click();
	    	
	    	Thread.sleep(1999);
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
	    	billRefPickIcon.click();
	    	
	    	Thread.sleep(1999);
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
	    	billRefOkBtn.click();
	    	Thread.sleep(1000);
	    	
	    	String expMessage2 = excelReader.getCellData(xlSheetName, 92, 6);
            String actMessage2 = checkValidationMessage(expMessage2);
            excelReader.setCellData(xlfile, xlSheetName, 92, 7, actMessage2);
            
            
            
	    	System.err.println("Validation Message "+actValidationMsg+" Value  "+expValidationMsg);
	    	System.err.println("actValidation Message1 "+actMessage);
	    	System.err.println("expValidation Message1 "+expMessage1);
	    	System.err.println("actValidation Message2 "+actMessage2);
	    	System.err.println("expValidation Message2 "+expMessage2);
	    	
	    	
	    	
	    	
	    	
	    	boolean savingVoucher=checkVoucherSavingMessage(docno);
	    	
	    	System.err.println("Saving Voucher "+ savingVoucher);
	    	
			if(actMessage.equalsIgnoreCase(expMessage1) && savingVoucher==true 
					&& actMessage2.equalsIgnoreCase(expMessage2) && 
					actBillwise.equalsIgnoreCase(expBillwise) 
					&& actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				System.out.println(" Test Pass:Voucher Saved With greater than Credit Limit ");
				
				 excelReader.setCellData(xlfile, xlSheetName, 80, 8, resPass);
				return true;
			}
			else
			{
				System.err.println(" Test Fail: Voucher Saved With greater than Credit Limit ");
				 excelReader.setCellData(xlfile, xlSheetName, 80, 8, resFail);
				return false;
			}
		}
		
		
	@FindBy(xpath="//a[@id='2001']//span[contains(text(),'Cash and Bank')]")
	private static WebElement  cashAndBankMenu; 

	@FindBy(xpath="//a[@id='2002']//span[contains(text(),'Receipts')]")
	private static WebElement  receiptsVoucher;
	
	@FindBy(xpath="//*[@id='id_header_4_table_body']/tr")
	private static List<WebElement>  cashAndBAnkAccountList;

	 @FindBy(xpath="//input[@id='id_header_4']")
	 private static WebElement newCashBankAccountTxt;

	
	public boolean checkAdjustingSalesinRecepitsVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsVoucher));
		receiptsVoucher.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkValidationMessage("Screen Opened");
		
		Thread.sleep(2000);

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
		newCashBankAccountTxt.click();

		newCashBankAccountTxt.sendKeys(Keys.SPACE);

		int cashAndBAnkAccountListCount  = cashAndBAnkAccountList.size();
		  
		System.err.println("cashAndBAnkAccountListCount   : "+cashAndBAnkAccountListCount);

		for (int i = 0; i < cashAndBAnkAccountListCount; i++) 
		{
			String data		  = cashAndBAnkAccountList.get(i).getText();
			
			if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 94, 5)))
			{
				cashAndBAnkAccountList.get(i).click();
				
				break;
			}
		}

		newCashBankAccountTxt.sendKeys(Keys.TAB);

		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
	  	voucherHeaderCurrency.click();;
	  	voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);

	  	voucherHeaderCurrency.sendKeys(Keys.SPACE);

	  	int currencycount=currencyListCount.size();

	  	System.err.println(currencycount);
	  		
	  	for(int i=0 ; i < currencycount ;i++)
	  	{
	  		String data=currencyListCount.get(i).getText();
	  		
	  		if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 95, 5)))
	  		{
	  			currencyListCount.get(i).click();
	  			
	  			break;
	  		}
	  	}
	  		
	  	voucherHeaderCurrency.sendKeys(Keys.TAB);
	  	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.END);
		departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount=departmentListCount.size();
		
		System.err.println(departmentcount);
			
		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 96, 5)))
			{
				departmentListCount.get(i).click();
				
				Thread.sleep(1000);
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);	

		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PurchaseAccountTxt));
		enter_PurchaseAccountTxt.click();
		
		enter_PurchaseAccountTxt.sendKeys( excelReader.getCellData(xlSheetName, 97, 5));
		Thread.sleep(2000);
		enter_PurchaseAccountTxt.sendKeys(Keys.TAB);
		
		enter_Amount.click();
		enter_Amount.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		enter_Amount.sendKeys( excelReader.getCellData(xlSheetName, 98, 5));
		
		enter_Amount.sendKeys(Keys.TAB);
		
		String docno=documentNumberTxt.getAttribute("value");
		
		
		Thread.sleep(2000);			
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billrefAdjuBills1stChkbox));
		billrefAdjuBills1stChkbox.click();
		Thread.sleep(2000);
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
				
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
				
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		
		boolean savingVoucher=checkVoucherSavingMessage(docno);
		
		if(savingVoucher==true)
		{
			System.out.println(" Test Pass: Voucher Saved With all Credit Amounts in Recepits  ");
			 excelReader.setCellData(xlfile, xlSheetName, 93, 8, resPass);
			return true;
			
		} 
		else
		{
			System.out.println(" Test Fail: Voucher Saved With all Credit Amounts in recepits  ");
			 excelReader.setCellData(xlfile, xlSheetName, 93, 8, resFail);
	         return false;
		}
		
	}

	
	public boolean checkResavingSalesInvoiceVoucherAfterConsuming() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		  excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVoucher));
		salesInvoiceVoucher.click();
		
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		    	
		checkValidationMessage("Screen opened");
		    	
		Thread.sleep(2000);
	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
	   previousBtn.click();
	   
	   checkValidationMessage("Voucher Loaded Succesfully");
	   
	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	   select1stRow_1stColumn.click();
	   
	   Thread.sleep(2000);
	   
	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
	   voucherSaveBtn.click();
	   
	   String expMessage1 =  excelReader.getCellData(xlSheetName, 100, 6);
       
   
       String actMessage = checkValidationMessage(expMessage1);
       
       excelReader.setCellData(xlfile, xlSheetName, 100, 7, actMessage);
		
	   
       if (actMessage.equalsIgnoreCase(expMessage1)) 
       {
    	   System.err.println(" Test PasS: Error Message is Displayed");
    	   excelReader.setCellData(xlfile, xlSheetName, 99, 8, resPass);
    	   return true;
		
	   }
       else 
       {
    	   System.err.println(" Test fail: Error Message is Displayed");
    	   excelReader.setCellData(xlfile, xlSheetName, 99, 8, resFail);
    	   return false;
	   }
	}
	
		
	//@FindBy(xpath="//*[@id='id_transactionentry_previous']")
	@FindBy(xpath="//*[@id='id_transactionentry_previous']/a/span")
	private static WebElement  previousBtn;
	
	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr/td[3]")
	private static List<WebElement> entryPageAdjBillsDocList;


	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr/td[2]")
	private static List<WebElement> entryPageAdjBillsChkboxList;

	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr/td[13]")
	private static List<WebElement> entryPageAdjBillsAdjustAmtList;

	
	 @FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[1]/td[2]/input")
	 private static WebElement  billrefAdjuBills1stChkbox;
	
		
	 public boolean checkResavingRecepitsVoucher() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 Thread.sleep(1999);
		 getDriver().navigate().refresh();
		 
		 Thread.sleep(1999);
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
			cashAndBankMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsVoucher));
			receiptsVoucher.click();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen Opened");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		    previousBtn.click();
		   
		    checkValidationMessage("Voucher Loaded Succesfully");
		   
		    Thread.sleep(2000);
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		    select1stRow_1stColumn.click();

		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PurchaseAccountTxt));
			enter_PurchaseAccountTxt.click();
			
			enter_PurchaseAccountTxt.sendKeys(Keys.TAB);
			
			enter_Amount.click();
			enter_Amount.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Amount.sendKeys(excelReader.getCellData(xlSheetName, 102, 5));
			
			enter_Amount.sendKeys(Keys.TAB);
			
			String docno=documentNumberTxt.getAttribute("value");
			
			
			Thread.sleep(2000);			
		  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billrefAdjuBills1stChkbox));
			billrefAdjuBills1stChkbox.click();
			Thread.sleep(2000);
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
					
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
					
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
			voucherSaveBtn.click();
			
			
			boolean savingVoucher=checkVoucherSavingMessage(docno);
			
			if(savingVoucher==true)
			{
				System.out.println(" Test Pass: Voucher Saved With all Credit Amounts in Recepits  ");

                excelReader.setCellData(xlfile, xlSheetName, 101, 8, resPass);
				return true;
				
			} 
			else
			{
				System.out.println(" Test Fail: Voucher Saved With all Credit Amounts in recepits  ");

                excelReader.setCellData(xlfile, xlSheetName, 101, 8, resFail);
		         return false;
			}
			
		}

	 
	 public boolean checkResavingSalesInvoiceVoucherAfterConsumingLesserThanCreditLimit() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
						
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
						
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
			financialTransactionSalesMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVoucher));
			salesInvoiceVoucher.click();
			
			Thread.sleep(2000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			Thread.sleep(1000);
			    	
			checkValidationMessage("Screen opened");
			    	
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
				
		     
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		   previousBtn.click();
		   Thread.sleep(2000);
		   
		   checkValidationMessage("Voucher Loaded Succesfully");
		   
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		   select1stRow_1stColumn.click();
		   
		   
		   Thread.sleep(2000);
		   try{
			   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
			   voucherSaveBtn.click();
			   Thread.sleep(2000); 
		   }
		   catch(Exception e)
		   {
			   System.out.println("Voucher save button is not displaying..");
		   }
		   boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
			String expvalidationConfirmationMessage = excelReader.getCellData(xlSheetName, 104, 6);
            
			excelReader.setCellData(xlfile, xlSheetName, 104, 7, actvalidationConfirmationMessage);

			
	       if (actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage)) 
	       {
	    	   System.err.println(" Test PasS: Error Message is Displayed");
	    	   excelReader.setCellData(xlfile, xlSheetName, 103, 8, resPass);

	    	   getDriver().navigate().refresh();
	    	   return true;
			
		   }
	       else 
	       {
	    	   System.err.println(" Test fail: Error Message is Displayed");
	    	   excelReader.setCellData(xlfile, xlSheetName, 103, 8, resFail);

	    	   getDriver().navigate().refresh();
	    	   return false;
		   }
		}
		
		
	 @FindBy(xpath="//div[@id='idGlobalError']")
	 public static WebElement validationConfirmationMessage;

	 public boolean checkEntringDateAfterDateOF1stVoucherInSalesInvoice() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());	 
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
						
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
						
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
			financialTransactionSalesMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVoucher));
			salesInvoiceVoucher.click();
			
			Thread.sleep(2000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			Thread.sleep(1000);
				    	
			checkValidationMessage("Screen opened");
			    	
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
				
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		   dateTxt.click();
		   dateTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		   
		  	
		  	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		  	   
			Calendar cal=Calendar.getInstance();
			SimpleDateFormat currentDate = new SimpleDateFormat("dd/MM/yyyy");
			cal.add(Calendar.DATE, 4); 
			System.out.println("***************************Date after 4 days*********************************"+cal);
			
			String next2DaysDate=df.format(cal.getTime());
		  	
			dateTxt.sendKeys(next2DaysDate);
			
		  	String actvoucherHeaderDate=dateTxt.getAttribute("value");
		  	String expvoucherHeaderDueDate=voucherHeaderDueDate.getAttribute("value");
		  	
		  	 excelReader.setCellData(xlfile, xlSheetName, 106, 6, expvoucherHeaderDueDate);
		  	 excelReader.setCellData(xlfile, xlSheetName, 106, 7, actvoucherHeaderDate);
		  	
		  	System.err.println(" ACT Due Date  : "+actvoucherHeaderDate);
		  	System.err.println(" Exp Due Date  : "+expvoucherHeaderDueDate);
		  	
		   
		  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAccountTxt));
		  	salesAccountTxt.click();
		  	salesAccountTxt.sendKeys(Keys.END);
		  	salesAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		  	salesAccountTxt.sendKeys(Keys.SPACE);
			 
		  	int customercount1=salesAccountListCount.size();
		  	
		  	System.err.println(customercount1);
		  	
		  	for(int j=0 ; j < customercount1 ;j++)
		  	{
		  		String data=salesAccountListCount.get(j).getText();
		  		
		  		if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 107, 5)))
		  		{
		  			salesAccountListCount.get(j).click();
		  			
		  			break;
		  		}
		  	}
					
		  	salesAccountTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.click();
			customerAccountTxt.sendKeys(Keys.END);
			customerAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			customerAccountTxt.sendKeys(Keys.SPACE);
			 
		  	int customercount=customerAccountListCount.size();
		  	
		  	System.err.println(customercount);
		  	
		  	for(int i=0 ; i < customercount ;i++)
		  	{
		  		String data=customerAccountListCount.get(i).getText();
		  		
		  		if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 108, 5)))
		  		{
		  			customerAccountListCount.get(i).click();
		  			
		  			break;
		  		}
		  	}
					
		  	customerAccountTxt.sendKeys(Keys.TAB);
		  	Thread.sleep(1000);
		  	
		  	String expMessage1 = excelReader.getCellData(xlSheetName, 109, 6);
		    String actMessage = checkValidationMessage(expMessage1);
		    excelReader.setCellData(xlfile, xlSheetName, 109, 7, actMessage);
		    if (actMessage.equalsIgnoreCase(expMessage1)) 
		    {
		    	   System.err.println(" Test PasS: Error Message is Displayed");
		    	   excelReader.setCellData(xlfile, xlSheetName, 105, 8, resPass);
		    	   getDriver().navigate().refresh();
		    	   return true;
				
			}
		    else 
		    {
		    	   System.err.println(" Test fail: Error Message is Displayed");
		    	   excelReader.setCellData(xlfile, xlSheetName, 105, 8, resFail);
		    	   getDriver().navigate().refresh();
		    	   return false;
			}
			}
			
		  	
	
	 //credit limit Authorisation
	 
	 @FindBy(xpath="//*[@id='69']/span")
	 private static WebElement CreditLimitAuthoriorisationMenu;
	 
	 
	 @FindBy(xpath="//input[@id='txtDropshow']")
	 private static WebElement CLA_NameTxt;
	 
	 @FindBy(xpath="//input[@id='txtPerFmValue-1']")
	 private static WebElement CLA_PercenFrmValueTxt;
	 
	 @FindBy(xpath="//input[@id='txtPerToValue-1']")
	 private static WebElement CLA_PercentToValueTxt;
	 
	 @FindBy(xpath="//input[@id='txtFrommValue-1']")
	 private static WebElement CLA_FromValueTxt;
	 
	 @FindBy(xpath="//input[@id='txtToValue-1']")
	 private static WebElement CLA_ToValueTxt;
	 
	 @FindBy(xpath="//input[@id='txtCreditDays-1']")
	 private static WebElement CLA_CreditDaysTxt;
	 
	 @FindBy(xpath="//input[@id='txtAuthOverAll-1']")
	 private static WebElement CLA_NumberOFAuthorizationAllowedOverAll;
	 
	 @FindBy(xpath="//select[@id='ddlAuthOverAll-1']")
	 private static WebElement CLA_Row1FrqyDrpDwn;
	 
	 @FindBy(xpath="//input[@id='txtAuthPerCustomer-1']")
	 private static WebElement CLA_NoOfAuthorisationPeraCustomer;
	 
	 @FindBy(xpath="//select[@id='ddlAuthPerCustomer-1']")
	 private static WebElement CLA_Row2FrqyDrpDwn;
	 
	 @FindBy(xpath="//input[@id='txtMaxvalIncreaseOvarAll-1']")
	 private static WebElement CLA_tMaxvalIncreaseOvarAll;
	 
	 @FindBy(xpath="//select[@id='ddlMaxvalIncreaseOvarAll-1']")
	 private static WebElement CLA_Row3FrqyDrpDwn;
	 
	 @FindBy(xpath="//input[@id='txtMaxvalIncreaseCust-1']")
	 private static WebElement CLA_MaxvalIncreaseCust;
	 
	 @FindBy(xpath="//select[@id='ddlMaxvalIncreaseCust-1']")
	 private static WebElement CLA_Row4FrqyDrpDwn; 
	 
	 @FindBy(xpath="//input[@id='rdoAllUser-1']")
	 private static WebElement CLA_AllUsersRadioBtn; 
	 
	 @FindBy(xpath="//input[@id='rdoSelectedUser-1']")
	 private static WebElement CLA_AnyOfSelectedUsersRadioBtn; 
	 
	// @FindBy(xpath="//*[@id='togl-1']/div[2]/div[1]/fieldset/div/label")
	 @FindBy(xpath="//*[@id='chkcheckbox-1']/label")
	 private static List<WebElement> CLA_AllUsersChkBoxList; 
	 
	 @FindBy(xpath="//*[@id='CrdAuthLevelPanel-collapseOne-1']/div/div[4]/div/label")
	 private static WebElement gotoNextLevelCheckbox; 
	 
	 
	 
	
	 
	 @FindBy(xpath="//*[@id='CreditLimitAuthorizationGrid1_col_1-']/input")
	 private static WebElement CLA_AlertReceivedChkbox; 
	 
	
	 @FindBy(xpath="//input[@id='chkIncludePendingSalesOrderValueInCreditLimitCheck']/following-sibling::span")
	 private static WebElement IncludePendingSalesOrderValueInCreditLimitCheckBox;
	 
	 @FindBy(xpath="//input[@id='chkIncludePendingSalesOrderValueInCreditLimitCheck']")
	 private static WebElement IncludePendingSalesOrderValueInCreditLimitCheckBoxSelected;
	 
	 @FindBy(xpath="//input[@id='chkCheckcreditlimitinorders']/following-sibling::span")
	 private static WebElement CheckcreditlimitinordersCHkBox;
	 
	 @FindBy(xpath="//input[@id='chkCheckcreditlimitinorders']")
	 private static WebElement CheckcreditlimitinordersCHkBoxSelected;
	 
	 @FindBy(xpath="//input[@id='chkDefineCreditLimitByDepartment']/following-sibling::span")
	 private static WebElement DefineCreditLimitByDepartmentChkbox;
	 
	 @FindBy(xpath="//input[@id='chkDefineCreditLimitByDepartment']")
	 private static WebElement DefineCreditLimitByDepartmentChkboxSelected;
	 
	 
	 @FindBy(xpath="//input[@id='chkAllowCreditLimitAuthorizationMappingToCustomerGroup']/following-sibling::span")
	 private static WebElement AllowCreditLimitAuthorizationMappingToCustomerChkbox;
	 
	 @FindBy(xpath="//input[@id='chkAllowCreditLimitAuthorizationMappingToCustomerGroup']")
	 private static WebElement AllowCreditLimitAuthorizationMappingToCustomerChkboxSelected;
	 
	 
	 
	 
	 
	 public boolean checkEnableCreditLimitOptionUnserPerferences() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 System.err.println("*********************checkEnableCreditLimitOptionUnserPerferences");

		 getDriver().navigate().refresh();
			
			Thread.sleep(2000);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchTxt));
			searchTxt.click();
			searchTxt.sendKeys("Configure Transactions");
			Thread.sleep(1000);
			searchTxt.sendKeys(Keys.ENTER);
			
			Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ARAPBtn));
		 ARAPBtn.click();

		 Thread.sleep(1999);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditLimitExpandBtn));
		 creditLimitExpandBtn.click();
		 Thread.sleep(1000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(IncludePendingSalesOrderValueInCreditLimitCheckBox));
		 if (IncludePendingSalesOrderValueInCreditLimitCheckBoxSelected.isSelected()==false) 
		 {
			 IncludePendingSalesOrderValueInCreditLimitCheckBox.click();	
		 }

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CheckcreditlimitinordersCHkBox));
		 if (CheckcreditlimitinordersCHkBoxSelected.isSelected()==false) 
		 {
			 CheckcreditlimitinordersCHkBox.click();	
		 }
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefineCreditLimitByDepartmentChkbox));
		 if (DefineCreditLimitByDepartmentChkboxSelected.isSelected()==false) 
		 {
			 DefineCreditLimitByDepartmentChkbox.click();	
		 }

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AllowCreditLimitAuthorizationMappingToCustomerChkbox));
		 if (AllowCreditLimitAuthorizationMappingToCustomerChkboxSelected.isSelected()==false) 
		 {
			 AllowCreditLimitAuthorizationMappingToCustomerChkbox.click();	
		 }

		 String actchk1=Boolean.toString(IncludePendingSalesOrderValueInCreditLimitCheckBoxSelected.isSelected());
		 String expchk1= excelReader.getCellData(xlSheetName, 111, 6);
         excelReader.setCellData(xlfile, xlSheetName, 111, 7, actchk1);
		 System.out.println(" CHECK BOX !: "+actchk1 +" Value : "+expchk1);

		 String actchk2=Boolean.toString(CheckcreditlimitinordersCHkBoxSelected.isSelected());
		 String expchk2=excelReader.getCellData(xlSheetName, 112, 6);
         excelReader.setCellData(xlfile, xlSheetName, 112, 7, actchk2);
		 System.out.println(" CHECK BOX 2: "+actchk2 +" Value : "+expchk2);

		 String actchk3=Boolean.toString(DefineCreditLimitByDepartmentChkboxSelected.isSelected());
		 String expchk3=excelReader.getCellData(xlSheetName, 113, 6);
         excelReader.setCellData(xlfile, xlSheetName, 113, 7, actchk3);
		 System.out.println(" CHECK BOX 3: "+actchk3 +" Value : "+expchk3);

		 String actchk4=Boolean.toString(AllowCreditLimitAuthorizationMappingToCustomerChkboxSelected.isSelected());
		 String expchk4= excelReader.getCellData(xlSheetName, 114, 6);
         excelReader.setCellData(xlfile, xlSheetName, 114, 7, actchk4);
		 System.out.println(" CHECK BOX 4: "+actchk4 +" Value : "+expchk4);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingUpdateIcon));
		 settingUpdateIcon.click();

		 getWaitForAlert();

		 String actAlert1=getAlert().getText();
		 String expAlert1=excelReader.getCellData(xlSheetName, 115, 6);
         excelReader.setCellData(xlfile, xlSheetName, 115, 7, actAlert1);

		 System.out.println(" ACT Alert= 1*****" +actAlert1  );
		 System.out.println(" Exp Alert= 1*****" +expAlert1 );


		 getAlert().accept();

		 getWaitForAlert();

		 String actAlert2=getAlert().getText();
		 String expAlert2= excelReader.getCellData(xlSheetName, 116, 6);
         excelReader.setCellData(xlfile, xlSheetName, 116, 7, actAlert2);

		 System.out.println(" ACT Alert= 2*****" +actAlert2  );
		 System.out.println(" Exp Alert  2=*****" +expAlert2  );

		 getAlert().accept();


		 boolean save= checkValidationMessage("Data saved successfully") != null;
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settings_closeBtn));
		 settings_closeBtn.click();

		 if (actAlert1.equalsIgnoreCase(expAlert1) && actAlert2.equalsIgnoreCase(expAlert2) && 
				 save==true && actchk1.equalsIgnoreCase(expchk1)
				 && actchk2.equalsIgnoreCase(expchk2) && actchk3.equalsIgnoreCase(expchk3) 
				 && actchk4.equalsIgnoreCase(expchk4))
		 {

             excelReader.setCellData(xlfile, xlSheetName, 110, 8, resPass);

			 return true;
		 } else {


             excelReader.setCellData(xlfile, xlSheetName, 110, 8, resFail);
			 return false;
		 }
	 }
	 
	 
	 public boolean checkcreditlimitAuthorisationHomeScreen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());

		 System.err.println("*********************checkcreditlimitAuthorisationHomeScreen");

 Thread.sleep(1200);
		 
		 getDriver().navigate().refresh();
		 Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchTxt));
			searchTxt.click();
			searchTxt.sendKeys("Credit Limit Authorization");
			Thread.sleep(1000);
			searchTxt.sendKeys(Keys.ENTER);
			
			Thread.sleep(2000);
		 Thread.sleep(1999);
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(CLA_NameTxt));
		 
		 getAction().moveToElement(CLA_AllUsersRadioBtn).build().perform();
		 Thread.sleep(3000);

		String actCLA_NameTxt                             =Boolean.toString(CLA_NameTxt.isDisplayed());
		String actCLA_PercenFrmValueTxt                   =Boolean.toString(CLA_PercenFrmValueTxt.isDisplayed());
		String actCLA_PercentToValueTxt                   =Boolean.toString(CLA_PercentToValueTxt.isDisplayed());
		String actCLA_FromValueTxt                         =Boolean.toString(CLA_FromValueTxt.isDisplayed());
		String actCLA_ToValueTxt                          =Boolean.toString(CLA_ToValueTxt.isDisplayed());
		String actCLA_CreditDaysTxt                       =Boolean.toString(CLA_CreditDaysTxt.isDisplayed());
		String actCLA_NumberOFAuthorizationAllowedOverAll =Boolean.toString(CLA_NumberOFAuthorizationAllowedOverAll.isDisplayed());
		String actCLA_NoOfAuthorisationPeraCustomer       =Boolean.toString(CLA_NoOfAuthorisationPeraCustomer.isDisplayed());
		String actCLA_tMaxvalIncreaseOvarAll              =Boolean.toString(CLA_tMaxvalIncreaseOvarAll.isDisplayed());
		String actCLA_MaxvalIncreaseCust                  =Boolean.toString(CLA_MaxvalIncreaseCust.isDisplayed());
		String actCLA_AllUsersRadioBtn                    =Boolean.toString(CLA_AllUsersRadioBtn.isDisplayed());

		String expCLA_NameTxt  =   excelReader.getCellData(xlSheetName, 118, 6);
        excelReader.setCellData(xlfile, xlSheetName, 118, 7, actCLA_NameTxt);
        
		String expCLA_PercenFrmValueTxt   = excelReader.getCellData(xlSheetName, 119, 6);
        excelReader.setCellData(xlfile, xlSheetName, 119, 7, actCLA_PercenFrmValueTxt);
        
		String expCLA_PercentToValueTxt     =excelReader.getCellData(xlSheetName, 120, 6);
        excelReader.setCellData(xlfile, xlSheetName, 120, 7, actCLA_PercentToValueTxt);
        
		String expCLA_FromValueTxt      =excelReader.getCellData(xlSheetName, 121, 6);
        excelReader.setCellData(xlfile, xlSheetName, 121, 7, actCLA_FromValueTxt);
        
		String expCLA_ToValueTxt     =excelReader.getCellData(xlSheetName, 122, 6);
        excelReader.setCellData(xlfile, xlSheetName, 122, 7, actCLA_ToValueTxt);
        
		String expCLA_CreditDaysTxt       =excelReader.getCellData(xlSheetName, 123, 6);
        excelReader.setCellData(xlfile, xlSheetName, 123, 7, actCLA_CreditDaysTxt);
        
		String expCLA_NumberOFAuthorizationAllowedOverAll = excelReader.getCellData(xlSheetName, 124, 6);
        excelReader.setCellData(xlfile, xlSheetName, 124, 7, actCLA_NumberOFAuthorizationAllowedOverAll);
        
		String expCLA_NoOfAuthorisationPeraCustomer   = excelReader.getCellData(xlSheetName, 125, 6);
        excelReader.setCellData(xlfile, xlSheetName, 125, 7, actCLA_NoOfAuthorisationPeraCustomer);
        
		String expCLA_tMaxvalIncreaseOvarAll  = excelReader.getCellData(xlSheetName, 126, 6);
        excelReader.setCellData(xlfile, xlSheetName, 126, 7, actCLA_tMaxvalIncreaseOvarAll);
        
		String expCLA_MaxvalIncreaseCust  = excelReader.getCellData(xlSheetName, 127, 6);
        excelReader.setCellData(xlfile, xlSheetName, 127, 7, actCLA_MaxvalIncreaseCust);
        
		String expCLA_AllUsersRadioBtn   = excelReader.getCellData(xlSheetName, 128, 6);
        excelReader.setCellData(xlfile, xlSheetName, 128, 7, actCLA_AllUsersRadioBtn);
        



		 System.out.println("CLA_NameTxt                    : "+actCLA_NameTxt                           +" Value Expected : "+expCLA_NameTxt);
		 System.out.println("CLA_PercenFrmValueTxt          : "+actCLA_PercenFrmValueTxt                 +" Value Expected : "+expCLA_PercenFrmValueTxt);
		 System.out.println("CLA_PercentToValueTxt          : "+actCLA_PercentToValueTxt                 +" Value Expected : "+expCLA_PercentToValueTxt);
		 System.out.println("CLA_FromValueTxt                : "+actCLA_FromValueTxt                       +" Value Expected : "+expCLA_FromValueTxt);
		 System.out.println("CLA_ToValueTxt                 : "+actCLA_ToValueTxt                        +" Value Expected : "+expCLA_ToValueTxt);
		 System.out.println("CLA_CreditDaysTxt              : "+actCLA_CreditDaysTxt                     +" Value Expected : "+expCLA_CreditDaysTxt);
		 System.out.println("CLA_NumberOFAuthorizationAllowe: "+actCLA_NumberOFAuthorizationAllowedOverAll+" Value Expected : "+expCLA_NumberOFAuthorizationAllowedOverAll);
		 System.out.println("CLA_NoOfAuthorisationPeraCus   : "+actCLA_NoOfAuthorisationPeraCustomer     +" Value Expected : "+expCLA_NoOfAuthorisationPeraCustomer);
		 System.out.println("CLA_tMaxvalIncreaseOvarAll     : "+actCLA_tMaxvalIncreaseOvarAll            +" Value Expected : "+expCLA_tMaxvalIncreaseOvarAll);
		 System.out.println("CLA_MaxvalIncreaseCust         : "+actCLA_MaxvalIncreaseCust                +" Value Expected : "+expCLA_MaxvalIncreaseCust);
		 System.out.println("CLA_AllUsersRadioBtn           : "+actCLA_AllUsersRadioBtn                  +" Value Expected : "+expCLA_AllUsersRadioBtn);

		 if(actCLA_NameTxt.equalsIgnoreCase(expCLA_NameTxt) && actCLA_PercenFrmValueTxt.equalsIgnoreCase(expCLA_PercenFrmValueTxt) 
				 && actCLA_PercentToValueTxt.equalsIgnoreCase(expCLA_PercentToValueTxt)
				 && actCLA_FromValueTxt.equalsIgnoreCase(expCLA_FromValueTxt) && actCLA_ToValueTxt.equalsIgnoreCase(expCLA_ToValueTxt)
				 && actCLA_CreditDaysTxt.equalsIgnoreCase(expCLA_CreditDaysTxt) && actCLA_NumberOFAuthorizationAllowedOverAll.equalsIgnoreCase(expCLA_NumberOFAuthorizationAllowedOverAll)
				 && actCLA_NoOfAuthorisationPeraCustomer.equalsIgnoreCase(expCLA_NoOfAuthorisationPeraCustomer)
				 && actCLA_tMaxvalIncreaseOvarAll.equalsIgnoreCase(expCLA_tMaxvalIncreaseOvarAll)
				 && actCLA_MaxvalIncreaseCust.equalsIgnoreCase(expCLA_MaxvalIncreaseCust)
				 && actCLA_AllUsersRadioBtn.equalsIgnoreCase(expCLA_AllUsersRadioBtn))
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 117, 8, resPass);

			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 117, 8, resFail);

			 return false;
		 }
	 }
	 
	 @FindBy(xpath="//*[@id='myDiv']/ul/li[2]/span/i")
	 private  static WebElement CLA_SaveBtn;
	 
	 @FindBy(xpath="//*[@id='myDiv']/ul/li[1]/span/i")
	 private  static WebElement CLA_DeleteBtn;
	 
	 @FindBy(xpath="//*[@id='myDiv']/ul/li[3]/span/i")
	 private  static WebElement CLA_CancelBtn;
	 
	 public boolean checkSavingCreditLimitAuthorisationWithOutInput() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	 {
		 Thread.sleep(1200);
		 
		 getDriver().navigate().refresh();
		 Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchTxt));
			searchTxt.click();
			searchTxt.sendKeys("Credit Limit Authorization");
			Thread.sleep(1000);
			searchTxt.sendKeys(Keys.ENTER);
			
			Thread.sleep(2000);
		
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 Thread.sleep(1999);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_SaveBtn));
		 CLA_SaveBtn.click();
		 
		
		 String ExpMessage= "Please Give the Credit Approval Name";
         
     	 String actMessage=checkValidationMessage(ExpMessage);
     	 
     	 // excelReader.setCellData(xlfile, xlSheetName, 130, 7, actMessage);

		 
		 
		 if (actMessage.equalsIgnoreCase(ExpMessage))
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 129, 8, resPass);
			 return true;
		 } 
		 else 
		 {

			 excelReader.setCellData(xlfile, xlSheetName, 129, 8, resFail);
			 return false;
		 }
	 }
	 
	 public boolean checkSavingCreditLimitAuthorisationWithNameInput() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	 {
		 
		 getDriver().navigate().refresh();
		 Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchTxt));
			searchTxt.click();
			searchTxt.sendKeys("Credit Limit Authorization");
			Thread.sleep(1000);
			searchTxt.sendKeys(Keys.ENTER);
			
			Thread.sleep(2000);
		
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_NameTxt));
		 CLA_NameTxt.click();
		 Thread.sleep(1000);
		 CLA_NameTxt.sendKeys( excelReader.getCellData(xlSheetName, 132, 5));
		 Thread.sleep(1000);
		 CLA_NameTxt.sendKeys(Keys.TAB);
		 
		 Thread.sleep(1999);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_SaveBtn));
		 CLA_SaveBtn.click();
		 
		 System.out.println("********Save Button clicked*******");
		 
		
		 String ExpMessage= excelReader.getCellData(xlSheetName, 133, 6);
		 String actMessage=checkValidationMessage(ExpMessage);
		 excelReader.setCellData(xlfile, xlSheetName, 133, 7, actMessage);
		
		 Thread.sleep(1200);
		 getAction().moveToElement(gotoNextLevelCheckbox).build().perform();
		 Thread.sleep(1200);
		 
		 
		 int count=CLA_AllUsersChkBoxList.size();
		 
		 ArrayList<String >users=new ArrayList<String>();
		 
		 for (int i = 0; i < count; i++) 
		 {
			String data=CLA_AllUsersChkBoxList.get(i).getText();
			users.add(data);
		}
		 
		 String actList=users.toString();
		 String expList=excelReader.getCellData(xlSheetName, 134, 6);
		 excelReader.setCellData(xlfile, xlSheetName, 133, 7, actList);
		 
		 System.out.println(" ACt List Displayed Users  : "+actList);
		 System.out.println(" Exp List Displayed Users  : "+expList);
		 
		 if (actMessage.equalsIgnoreCase(ExpMessage) && actList.equalsIgnoreCase(expList))
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 131, 8, resPass);

			 return true;
		 } 
		 else 
		 {

			 excelReader.setCellData(xlfile, xlSheetName, 131, 8, resFail);

			 return false;
		 }
	 }
	 
	 
	 public boolean checkSavingCreditLimitAuthorisationWithVaildDataWithoutCreditDaysForApprovalInLevel1() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 Thread.sleep(1000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_PercenFrmValueTxt));
		 CLA_PercenFrmValueTxt.click();
		 CLA_PercenFrmValueTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		 CLA_PercenFrmValueTxt.sendKeys(excelReader.getCellData(xlSheetName, 136, 5));
		 CLA_PercenFrmValueTxt.sendKeys(Keys.TAB);

		 Thread.sleep(1000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_PercentToValueTxt));
		 CLA_PercenFrmValueTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		 CLA_PercentToValueTxt.sendKeys(excelReader.getCellData(xlSheetName, 137, 5));
		 CLA_PercentToValueTxt.sendKeys(Keys.TAB);

		 Thread.sleep(1000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_FromValueTxt));
		 CLA_FromValueTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		 CLA_FromValueTxt.sendKeys(excelReader.getCellData(xlSheetName, 138, 5));
		 CLA_FromValueTxt.sendKeys(Keys.TAB);

		 Thread.sleep(1000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_ToValueTxt));
		 CLA_ToValueTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		 CLA_ToValueTxt.sendKeys(excelReader.getCellData(xlSheetName, 139, 5));
		 CLA_ToValueTxt.sendKeys(Keys.TAB);

		 Thread.sleep(1000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_ToValueTxt));
		 CLA_NumberOFAuthorizationAllowedOverAll.click();
		 CLA_NumberOFAuthorizationAllowedOverAll.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		 CLA_NumberOFAuthorizationAllowedOverAll.sendKeys(excelReader.getCellData(xlSheetName, 140, 5));
		 CLA_NumberOFAuthorizationAllowedOverAll.sendKeys(Keys.TAB);

		 Select s1=new Select(CLA_Row1FrqyDrpDwn);
		 s1.selectByValue("1");

		 Thread.sleep(1000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_NoOfAuthorisationPeraCustomer));
		 CLA_NoOfAuthorisationPeraCustomer.click();
		 CLA_NoOfAuthorisationPeraCustomer.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		 CLA_NoOfAuthorisationPeraCustomer.sendKeys(excelReader.getCellData(xlSheetName, 141, 5));
		 CLA_NoOfAuthorisationPeraCustomer.sendKeys(Keys.TAB);

		 Select s2=new Select(CLA_Row2FrqyDrpDwn);
		 s2.selectByValue("1");

		 Thread.sleep(1000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_tMaxvalIncreaseOvarAll));
		 CLA_tMaxvalIncreaseOvarAll.click();
		 CLA_tMaxvalIncreaseOvarAll.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		 CLA_tMaxvalIncreaseOvarAll.sendKeys(excelReader.getCellData(xlSheetName, 142, 5));
		 CLA_tMaxvalIncreaseOvarAll.sendKeys(Keys.TAB);

		 Select s3=new Select(CLA_Row3FrqyDrpDwn);
		 s3.selectByValue("1");

		 Thread.sleep(1000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_MaxvalIncreaseCust));
		 CLA_MaxvalIncreaseCust.click();
		 CLA_MaxvalIncreaseCust.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		 CLA_MaxvalIncreaseCust.sendKeys(excelReader.getCellData(xlSheetName, 143, 5));
		 CLA_MaxvalIncreaseCust.sendKeys(Keys.TAB);

		 Select s4=new Select(CLA_Row4FrqyDrpDwn);
		 s4.selectByValue("1");


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_AnyOfSelectedUsersRadioBtn));
		 if (CLA_AnyOfSelectedUsersRadioBtn.isSelected()==false) 
		 {
			 CLA_AnyOfSelectedUsersRadioBtn.click();

		 }

		 int count=CLA_AllUsersChkBoxList.size();

		 ArrayList<String >users=new ArrayList<String>();

		 for (int i = 0; i < count; i++) 
		 {
			 String data=CLA_AllUsersChkBoxList.get(i).getText();
			 if (data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 144, 5))) 
			 {
				 CLA_AllUsersChkBoxList.get(i).click();
			 }
		 }

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_SaveBtn));
		 CLA_SaveBtn.click();

		 String ExpMessage=excelReader.getCellData(xlSheetName, 145, 6);
		 String actMessage=checkValidationMessage(ExpMessage);
		 excelReader.setCellData(xlfile, xlSheetName, 145, 7, actMessage);

		 
		 if (actMessage.equalsIgnoreCase(ExpMessage))
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 135, 8, resPass);
			 return true;
		 } 
		 else 
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 135, 8, resFail);
			 return false;
		 }

	 }
	 
	 
	 
	 public boolean checkSavingWithEnteringCreditDays() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());


		 Thread.sleep(1000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_CreditDaysTxt));
		 CLA_CreditDaysTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		 CLA_CreditDaysTxt.sendKeys( excelReader.getCellData(xlSheetName, 147, 5));
		 CLA_CreditDaysTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_SaveBtn));
		 CLA_SaveBtn.click();

		 String ExpMessage=  excelReader.getCellData(xlSheetName, 148, 6);
		 String actMessage=checkValidationMessage(ExpMessage);
		 excelReader.setCellData(xlfile, xlSheetName, 148, 7, actMessage);
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_CancelBtn));
		 CLA_CancelBtn.click();

		 if (actMessage.equalsIgnoreCase(ExpMessage))
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 146, 8, resPass);
			 return true;
		 } 
		 else 
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 146, 8, resFail);
			 return false;
		 }
	 }
	 
	 @FindBy(xpath="//img[@id='imgDropdown']")
	 private static WebElement CLA_NameTxtIcon;
	 
	 
	 @FindBy(xpath="//ul[@id='showUl']/li[text()='Credit Approval']")
	 private static WebElement CLA_NameTxtCreditApproval;
	 
	 
	 
	 
	 
	 public boolean checkSavedCreditLimitAuthorisation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 Thread.sleep(1999);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		 settingsmenuBtn.click();

		 ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", CreditLimitAuthoriorisationMenu);
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CreditLimitAuthoriorisationMenu));
		 CreditLimitAuthoriorisationMenu.click();

		 Thread.sleep(1999);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_NameTxtIcon));
		 CLA_NameTxtIcon.click();
		 
		 Thread.sleep(1999);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_NameTxtCreditApproval));
		 CLA_NameTxtCreditApproval.click();
		 
		 

		 Thread.sleep(1000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_PercenFrmValueTxt));
		 String actCLA_PercenFrmValueTxt=CLA_PercenFrmValueTxt.getAttribute("value");
		 String expCLA_PercenFrmValueTxt= excelReader.getCellData(xlSheetName, 150, 6);
		 excelReader.setCellData(xlfile, xlSheetName, 150, 7, actCLA_PercenFrmValueTxt);
		 
		 System.out.println(" CLA_PercenFrmValueTxt : "+actCLA_PercenFrmValueTxt +" Value Exp : "+expCLA_PercenFrmValueTxt);
		 
		 
		 Thread.sleep(1000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_FromValueTxt));
		 String actCLA_FromValueTxt=CLA_FromValueTxt.getAttribute("value");
		 String expCLA_FromValueTxt= excelReader.getCellData(xlSheetName, 151, 6);
		 excelReader.setCellData(xlfile, xlSheetName, 151, 7, actCLA_FromValueTxt);
		 
		 System.out.println(" CLA_FromValueTxt : "+actCLA_FromValueTxt +" Value Exp : "+expCLA_FromValueTxt);
		 
		 Thread.sleep(1000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_ToValueTxt));
		 String actCLA_ToValueTxt=CLA_ToValueTxt.getAttribute("value");
		 String expCLA_ToValueTxt= excelReader.getCellData(xlSheetName, 152, 6);
		 excelReader.setCellData(xlfile, xlSheetName, 152, 7, actCLA_ToValueTxt);
		 
		 System.out.println(" CLA_ToValueTxt : "+actCLA_ToValueTxt +" Value Exp : "+expCLA_ToValueTxt);
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_NumberOFAuthorizationAllowedOverAll));
		 String actCLA_NumberOFAuthorizationAllowedOverAll=CLA_NumberOFAuthorizationAllowedOverAll.getAttribute("value");
		 String expCLA_NumberOFAuthorizationAllowedOverAll= excelReader.getCellData(xlSheetName, 153, 6);
		 excelReader.setCellData(xlfile, xlSheetName, 153, 7, actCLA_NumberOFAuthorizationAllowedOverAll);
		 
		 System.out.println(" CLA_NumberOFAuthorizationAllowedOverAll : "+actCLA_NumberOFAuthorizationAllowedOverAll +" Value Exp : "+expCLA_NumberOFAuthorizationAllowedOverAll);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_Row1FrqyDrpDwn));
		 Select s1=new Select(CLA_Row1FrqyDrpDwn);
		 
		 String actCLA_Row1FrqyDrpDwn=s1.getFirstSelectedOption().getText();
		 String expCLA_Row1FrqyDrpDwn= excelReader.getCellData(xlSheetName, 154, 6);
		 excelReader.setCellData(xlfile, xlSheetName, 154, 7, actCLA_Row1FrqyDrpDwn);
		 
		 System.out.println(" CLA_Row1FrqyDrpDwn : "+actCLA_Row1FrqyDrpDwn +" Value Exp : "+expCLA_Row1FrqyDrpDwn);
		 

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_NoOfAuthorisationPeraCustomer));
		 String actCLA_NoOfAuthorisationPeraCustomer=CLA_NoOfAuthorisationPeraCustomer.getAttribute("value");
		 String expCLA_NoOfAuthorisationPeraCustomer= excelReader.getCellData(xlSheetName, 155, 6);
		 excelReader.setCellData(xlfile, xlSheetName, 155, 7, actCLA_NoOfAuthorisationPeraCustomer);
		 
		 System.out.println(" CLA_NoOfAuthorisationPeraCustomer : "+actCLA_NoOfAuthorisationPeraCustomer +" Value Exp : "+expCLA_NoOfAuthorisationPeraCustomer);

		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_Row2FrqyDrpDwn));
		 Select s2=new Select(CLA_Row2FrqyDrpDwn);
		 
		 String actCLA_Row2FrqyDrpDwn=s1.getFirstSelectedOption().getText();
		 String expCLA_Row2FrqyDrpDwn= excelReader.getCellData(xlSheetName, 156, 6);
		 excelReader.setCellData(xlfile, xlSheetName, 156, 7, actCLA_Row2FrqyDrpDwn);
		 
		 System.out.println(" CLA_Row2FrqyDrpDwn : "+actCLA_Row2FrqyDrpDwn +" Value Exp : "+expCLA_Row2FrqyDrpDwn);

	

		 if (actCLA_PercenFrmValueTxt.equalsIgnoreCase(expCLA_PercenFrmValueTxt) &&
				 actCLA_FromValueTxt.equalsIgnoreCase(expCLA_FromValueTxt) && actCLA_Row1FrqyDrpDwn.equalsIgnoreCase(expCLA_Row1FrqyDrpDwn) &&
				 actCLA_ToValueTxt.equalsIgnoreCase(expCLA_ToValueTxt) && actCLA_NoOfAuthorisationPeraCustomer.equalsIgnoreCase(expCLA_NoOfAuthorisationPeraCustomer) && 
				 actCLA_Row2FrqyDrpDwn.equalsIgnoreCase(expCLA_Row2FrqyDrpDwn))
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 149, 8, resPass);

			 return true;
		 } 
		 else 
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 149, 8, resPass);

			 return false;
		 }

	 }
	 
	 
	 public boolean checkEditoptionInCreditLimit() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());

		 
		 Thread.sleep(1000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_CreditDaysTxt));
		 CLA_CreditDaysTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		 CLA_CreditDaysTxt.sendKeys( excelReader.getCellData(xlSheetName, 158, 5));
		 CLA_CreditDaysTxt.sendKeys(Keys.TAB);
		 
		 String actCLA_CreditDaysTxt=CLA_CreditDaysTxt.getAttribute("value");
		 String expCLA_CreditDaysTxt=  excelReader.getCellData(xlSheetName, 159, 6);
         excelReader.setCellData(xlfile, xlSheetName, 159, 7, actCLA_CreditDaysTxt);

		 
		 System.out.println(" Act CLA_CreditDaysTxt : "+actCLA_CreditDaysTxt);
		 System.out.println(" Exp CLA_CreditDaysTxt : "+expCLA_CreditDaysTxt);
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_SaveBtn));
		 CLA_SaveBtn.click();

		 String ExpMessage=  excelReader.getCellData(xlSheetName, 160, 6);
		 String actMessage=checkValidationMessage(ExpMessage);
		 excelReader.setCellData(xlfile, xlSheetName, 160, 7, actMessage);

		 if (actMessage.equalsIgnoreCase(ExpMessage))
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 157, 8, resPass);

			 return true;
		 } 
		 else 
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 157, 8, resFail);

			 return false;
		 }
	 
		 
	 }
	 
	 
	 public boolean checkDeleteOptionInCreditLimitAuthorisation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		 settingsmenuBtn.click();

		 Thread.sleep(1000);
		 ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", CreditLimitAuthoriorisationMenu);
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CreditLimitAuthoriorisationMenu));
		 CreditLimitAuthoriorisationMenu.click();

         Thread.sleep(1999);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_NameTxtIcon));
		 CLA_NameTxtIcon.click();
		 
		 Thread.sleep(1999);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_NameTxtCreditApproval));
		 CLA_NameTxtCreditApproval.click();

		 Thread.sleep(1999);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_CancelBtn));
		 CLA_DeleteBtn.click();
		 
		 String ExpMessage=  excelReader.getCellData(xlSheetName, 162, 6);
		 String actMessage=checkValidationMessage(ExpMessage);
		 excelReader.setCellData(xlfile, xlSheetName, 162, 7, actMessage);

		 
		 if (actMessage.equalsIgnoreCase(ExpMessage))
		 {
			 System.out.println(" Test Pass: Deleted ");
			 excelReader.setCellData(xlfile, xlSheetName, 161, 8, resPass);
			 return true;
		 } 
		 else 
		 {
			 System.out.println(" Test Fail: Deleted ");
			 excelReader.setCellData(xlfile, xlSheetName, 161, 8, resFail);
			 return false;
		}

	 }
	 
	 
	 public boolean checkResavingCreditLimitAuthorisation() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		 settingsmenuBtn.click();

		 Thread.sleep(1000);
		 ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", CreditLimitAuthoriorisationMenu);
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CreditLimitAuthoriorisationMenu));
		 CreditLimitAuthoriorisationMenu.click();

		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CLA_NameTxt));
		 CLA_NameTxt.click();
		 CLA_NameTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		 CLA_NameTxt.sendKeys( excelReader.getCellData(xlSheetName, 164, 5));
		 Thread.sleep(1000);
		 CLA_NameTxt.sendKeys(Keys.TAB);

		String  act= Boolean.toString(checkSavingCreditLimitAuthorisationWithVaildDataWithoutCreditDaysForApprovalInLevel1());
		String  exp=  excelReader.getCellData(xlSheetName, 165, 6);
        excelReader.setCellData(xlfile, xlSheetName, 165, 7, act);

		 
		String act1= Boolean.toString(checkSavingWithEnteringCreditDays());
		 String exp1= excelReader.getCellData(xlSheetName, 166, 6);
	        excelReader.setCellData(xlfile, xlSheetName, 166, 7, act1);

		 System.out.println(" ACT1 : "+act +" Value Expected  : "+exp);
		 System.out.println(" ACT2 : "+act1 +" Value Expected  : "+exp1);

		 
		 if (act.equalsIgnoreCase(exp) && act1.equalsIgnoreCase(exp1))
		 {
			 System.err.println(" Test Pass: Resaved Success");
			 excelReader.setCellData(xlfile, xlSheetName, 163, 8, resPass);
			 return true;
		} 
		 else
		 {
			 System.err.println(" Test FAil: Resaved Success");
			 excelReader.setCellData(xlfile, xlSheetName, 163, 8, resFail);
			 return false;
		}
	 }
		 
	 
	 
	 @FindBy(xpath="//span[contains(text(),'Map Credit Limit')]")
	 private static WebElement mapCreditLimitMenu;
	 
	 @FindBy(xpath="//td[@id='grdMapCreditLimit_col_1-1']")
	 private static WebElement mapCL_popUpRow1Col1;
	 
	 @FindBy(xpath="//td[@id='grdMapCreditLimit_col_1-2']")
	 private static WebElement mapCL_popUpRow1Col2;
	 
	 @FindBy(xpath="//td[@id='grdMapCreditLimit_col_1-3']")
	 private static WebElement mapCL_popUpRow1Col3;
	 
	 @FindBy(xpath="//td[@id='grdMapCreditLimit_col_1-4']")
	 private static WebElement mapCL_mapCL_popUpRow1Col4;
	 
	 @FindBy(xpath="//input[@id='btnSaveMapping']")
	 private static WebElement mapCL_SavBtn;
	 
	 @FindBy(xpath="//input[@id='btnCancelMapping']")
	 private static WebElement mapCL_CancelBtn;
	 
	 @FindBy(xpath="//input[@id='optTag']")
	 private static WebElement mapCL_EnterDepTxt;
	 
	 @FindBy(xpath="//input[@id='optCustomergroup']")
	 private static WebElement mapCL_EnterCustomerGrp;
	 
	 @FindBy(xpath="//input[@id='optAuthorizationFlow']")
	 private static WebElement mapCL_EnterAuthoriseFlowTxt;
	 
	 
	 
	 public boolean checkMappingDepartmentAndAccountInMapctreditLimitScreen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		 settingsmenuBtn.click();

		 Thread.sleep(1000);
		 
		 ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", mapCreditLimitMenu);
		 Thread.sleep(3000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mapCreditLimitMenu));
		 mapCreditLimitMenu.click();

		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mapCL_popUpRow1Col2));
		 
		 mapCL_popUpRow1Col2.click();
		 
		 mapCL_EnterDepTxt.click();
		 mapCL_EnterDepTxt.sendKeys(excelReader.getCellData(xlSheetName, 168, 5));
		 Thread.sleep(1999);
		 mapCL_EnterDepTxt.sendKeys(Keys.TAB);
		 
		 
		 mapCL_EnterCustomerGrp.click();
		 mapCL_EnterCustomerGrp.sendKeys(excelReader.getCellData(xlSheetName, 169, 5));
		 Thread.sleep(1999);
		 mapCL_EnterCustomerGrp.sendKeys(Keys.TAB);
		 
		 mapCL_EnterAuthoriseFlowTxt.click();
		 mapCL_EnterAuthoriseFlowTxt.sendKeys(excelReader.getCellData(xlSheetName, 170, 5));
		 Thread.sleep(1999);
		 mapCL_EnterAuthoriseFlowTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mapCL_SavBtn));
		 mapCL_SavBtn.click();
		 Thread.sleep(2500);

		 String expMessage= excelReader.getCellData(xlSheetName, 171, 6);
		 String actMessage=checkValidationMessage(expMessage);
		 excelReader.setCellData(xlfile, xlSheetName, 171, 7, actMessage);
		 
		 if (actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 167, 8, resPass);
			 return true;
		} 
		 else 
		 {

			 excelReader.setCellData(xlfile, xlSheetName, 167, 8, resFail);
			return false;
		}
		 
		 
		 
		 
	 }
	 
	
	
	//*[@id="ARAccountsSettings"]/button
	 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	 public static boolean checkEnableOnlyARTagInPreferences() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 Thread.sleep(2000);
		 Thread.sleep(3000);
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 getDriver().navigate().refresh();
			
			Thread.sleep(2000);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchTxt));
			searchTxt.click();
			searchTxt.sendKeys("Configure Transactions");
			Thread.sleep(1000);
			searchTxt.sendKeys(Keys.ENTER);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ARAPBtn));
			ARAPBtn.click();
			Thread.sleep(2000);
			
			
			if (apTagChkBoxSelected.isSelected() == true) 
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(apTagChkBox));
				apTagChkBox.click();
			}
			Thread.sleep(3000);
			
			((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", ARAccountSettingsExpandBtn);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ARAccountSettingsExpandBtn));
			ARAccountSettingsExpandBtn.click();
			
			Thread.sleep(1000);
			
			if (arTagChkBoxSelected.isSelected() == false) 
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(arTagChkBox));
				arTagChkBox.click();
				
				arTagTxt.click();
				arTagTxt.sendKeys(excelReader.getCellData(xlSheetName, 174, 5));
				Thread.sleep(2000);
				arTagTxt.sendKeys(Keys.TAB);
				
			}
			
		
		scrollToElementJSE(creditLimitExpandBtn);
		creditLimitExpandBtn.click();
		Thread.sleep(3000);
	
		Thread.sleep(1000);
		scrollToElementJSE(enableCreditLimitCheckChkBoxSelected);
		//getAction().moveToElement(enableCreditLimitCheckChkBoxSelected).build().perform();
		Thread.sleep(3000);
		
		if (enableCreditLimitCheckChkBoxSelected.isSelected() == true) 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enableCreditLimitCheckChkBox));
			enableCreditLimitCheckChkBox.click();
		}
			
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingUpdateIcon));
		settingUpdateIcon.click();
		
		Thread.sleep(1200);
		
		getWaitForAlert();
		
		getAlert().accept();
		
		
		
		
		String expValidationMessage= excelReader.getCellData(xlSheetName, 175, 6);
             
		String actValidationMessage=checkValidationMessage(expValidationMessage);
		 excelReader.setCellData(xlfile, xlSheetName, 175, 7, actValidationMessage);
		
		String  actSelectedApTag = Boolean.toString(apTagChkBox.isSelected());
		String  expSelectedApTag = excelReader.getCellData(xlSheetName, 176, 6);
		excelReader.setCellData(xlfile, xlSheetName, 176, 7, actSelectedApTag);
		
		
		String actSelectedenableCreditLimitCheckChkBox = Boolean.toString(enableCreditLimitCheckChkBox.isSelected());
		String expSelectedenableCreditLimitCheckChkBox = excelReader.getCellData(xlSheetName, 177, 6);
		excelReader.setCellData(xlfile, xlSheetName, 177, 7, actSelectedenableCreditLimitCheckChkBox);
		
		
		
		if (actValidationMessage.equalsIgnoreCase(expValidationMessage) && actSelectedApTag .equalsIgnoreCase( expSelectedApTag)
				&& actSelectedenableCreditLimitCheckChkBox .equalsIgnoreCase( expSelectedenableCreditLimitCheckChkBox))
		{
			
			excelReader.setCellData(xlfile, xlSheetName, 172, 8, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 172, 8, resFail);
			return false;
		}
		
		
		

		
	 }
	 
	// @FindBy(xpath="//span[@class='hidden-xs']")
	 @FindBy(xpath="//a[contains(text(),'SU')]")
		private static WebElement userNameDisplay;
	 
	// @FindBy(xpath="//*[@id='userprofile']/li/span[2]")
	 @FindBy(xpath="//ul[@id='id_user_profile_icons']/li[2]/a")
	    private static WebElement logoutOption;
	 
	 @FindBy(xpath="//div[@id='id_mainlayoutmenu']/ul[2]/li[7]")
		public static WebElement userNameDisplayLogo;



@FindBy(xpath="//*[@id='txtUsername']")
private static WebElement username;

@FindBy(id="txtPassword")
private static WebElement password;

@FindBy(id="btnSignin")
private static WebElement signIn;

	 
	 public static boolean checkLogoutAndLogin() throws InterruptedException
	 {

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
		 userNameDisplayLogo.click();
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		 logoutOption.click();

		 Thread.sleep(2000);

		 getDriver().navigate().refresh();
		 Thread.sleep(3000);

		 getDriver().navigate().refresh();
		 Thread.sleep(3000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
		 username.sendKeys("su");
		 getAction().moveToElement(username).sendKeys(Keys.TAB).perform();
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
		 password.sendKeys("su");
		 getAction().moveToElement(password).sendKeys(Keys.TAB).perform();
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(signIn));
		 signIn.click();

		 Thread.sleep(5000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		 userNameDisplay.click();

		 String actUserInfo = userNameDisplay.getText();
		 String expUserInfo = "SU";

		 if (actUserInfo.equalsIgnoreCase(expUserInfo))
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }

	 }
	 
		@FindBy (xpath="//*[@id='1000']//span")
		public static WebElement mastersMenu;

		//Accounts 
		@FindBy (xpath="//a[@id='1104']//span[contains(text(),'Account')]")
		public static WebElement accounts;
		
		//Master Main Header Fields		
		@FindBy(xpath="//*[@id='btnNew']/i")
		public static WebElement masterNewBtn;
		
		@FindBy(xpath="//input[@id='sName']")
		public static WebElement  nameTxt;

		@FindBy(xpath="//input[@id='sCode']")
		public static WebElement codeTxt ;
		
		//AccountType	
		@FindBy(xpath="//select[@id='iAccountType']")
		public static WebElement accountTypeDropdown;
		
		@FindBy(xpath="//ul[@class='nav navbar-nav navbar-left ulNewMaster']//li[2]//button[1]")
		public static WebElement SaveBtnInAccount;


	 
	 public static boolean checkSaveCustomerOrVendorAccountForVouchers() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			Thread.sleep(2000);
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
			 mastersMenu.click();
			
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
			 accounts.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));		
			 masterNewBtn.click();
			 
			
			 Thread.sleep(3000);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 179, 5));
			nameTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 180, 5));
		    codeTxt.sendKeys(Keys.TAB);
		  
		    Select accountTypeDrpdwn = new Select(accountTypeDropdown);
		    
			accountTypeDrpdwn.selectByVisibleText(excelReader.getCellData(xlSheetName, 181, 5));
			
			Thread.sleep(2000);
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtnInAccount));
			SaveBtnInAccount.click();
		
			String expSaveAccountMessage = excelReader.getCellData(xlSheetName, 182, 6);	
			String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);
			excelReader.setCellData(xlfile, xlSheetName, 182, 7, actSaveAccountMessage);
			
			Thread.sleep(2000);
			
			System.out.println("Click on Save With Valid Information Value Actual : " + actSaveAccountMessage + "  Value Expected : " + expSaveAccountMessage);
			
			if(actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage))
			{
				excelReader.setCellData(xlfile, xlSheetName, 178, 8, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 178, 8, resFail);
				return false;
			}
	 }
	 
		

		@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		public static WebElement closeBtn;
		
		 @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[11]")
		 private static List<WebElement> accontsNameList;
		 
		 @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[13]")
		 private static List<WebElement> accontsTypeNameList;

	 
	 public static boolean checkSavedAccountInMastersList() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 Thread.sleep(3000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		 closeBtn.click();
		 //////////

		 int accountsCount = accontsNameList.size();
		 boolean trailAccount = false;

		 ArrayList<String> accountslist = new ArrayList<String>();

		 		for (int i = 0; i < accountsCount; i++)
		 		{
		 			 String data = accontsNameList.get(i).getText();
		 			accountslist.add(data);
		 			if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 184, 5)))     
		 			{
		 				trailAccount = true;
		 				break;
		 			}
		 		
		 			
		 		}
		 		

				
		 		System.out.println("Accounts In Account Master: " +accountslist);
		 		
		 		System.err.println("trailAccount: "+trailAccount);
		 	
		
		 System.out.println("****************************checkAccountDisplayInAccountGridBeforeCustomization********************");
		 
		
		 if(trailAccount == true )
		 { 
			 excelReader.setCellData(xlfile, xlSheetName, 183, 8, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 183, 8, resFail);
			 return false;
		 }
	 }
	 

	// @FindBy(xpath="//span[@class='icon-financial icon-font1']")
	 @FindBy(xpath="//*[@id='60']")
	 private static WebElement  finacinalsMenu;

	 @FindBy(xpath="//*[@id='2007']/span")
	 private static WebElement  financialsTransactionsPurchaseMenu; 


	 @FindBy(xpath="//*[@id='2009']/span")
	 private static WebElement  purchaseReturnsVoucher;
	 
	 @FindBy(xpath="//*[@id='id_body_536870916']")
	 private static WebElement  warehouseTxtInPR;
	 
	 @FindBy(xpath="//input[@id='id_body_26']")
		public static WebElement  enter_Quantity;
	 

		@FindBy(xpath="//input[@id='txtNewReference']")
		public static WebElement newReferenceTxt;
	 
	  @FindBy(xpath = "//*[@id='idGlobalError']/div/div[2]")
			public static List<WebElement> errorMessageList;
			
			@FindBy(xpath = "//*[@id='idGlobalError']/div/div/button")
			public static List<WebElement> errorMessageCloseBtnList;
			
		

		   public static String checkValidationMessage(int count) throws InterruptedException
	       {
	               Thread.sleep(2500);

	               String message=null;

	               HashSet<String> actMessage = new HashSet();

	               for (int i = 0; i < count; i++) 
	               {
	                       String data = errorMessageList.get(i).getText();
	                       System.err.println(data);
	                       actMessage.add(data);
	                       errorMessageCloseBtnList.get(i).click();
	               }

	               message = actMessage.toString();

	               return message;
	       }
		   
		   
		   @FindBy(xpath="//div[@id='idGlobalError']/div/table/tbody/tr/td[2]/div[2]")
	        public static WebElement errorMessage1;

	        @FindBy(xpath="//div[@id='idGlobalError']/div/table/tbody/tr/td[3]/span")
	        public static WebElement errorMessageCloseBtn1;
	        
	 public static boolean checkSavePurchaseReturnsVoucherWithSavedCustOrVenAccount() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());

		 Thread.sleep(3000);
	
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		 finacinalsMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		 financialsTransactionMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		 financialsTransactionsPurchaseMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseReturnsVoucher));
		 purchaseReturnsVoucher.click();

		 Thread.sleep(4000);

		

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		 newBtn.click();

		 checkValidationMessage("Screen opened");

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		 customerAccountTxt.sendKeys( excelReader.getCellData(xlSheetName, 186, 5));
		 Thread.sleep(3000);
		 customerAccountTxt.sendKeys(Keys.TAB);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		 departmentTxt.sendKeys(Keys.SPACE);

		 int departmentcount=departmentListCount.size();

		 System.err.println(departmentcount);

		 for(int i=0 ; i < departmentcount ;i++)
		 {
			 String data=departmentListCount.get(i).getText();

			 if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 187, 5)))
			 {
				 departmentListCount.get(i).click();
				 break;
			 }
		 }

		 departmentTxt.sendKeys(Keys.TAB);

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		 select1stRow_1stColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxtInPR));
		 warehouseTxtInPR.click();
		 warehouseTxtInPR.sendKeys( excelReader.getCellData(xlSheetName, 188, 5));
		 Thread.sleep(2000);
		 warehouseTxtInPR.sendKeys(Keys.TAB);


		 enter_ItemTxt.sendKeys( excelReader.getCellData(xlSheetName, 189, 5));
		 Thread.sleep(2000);
		 enter_ItemTxt.sendKeys(Keys.TAB);

		 enter_PurchaseAccountTxt.click();
		 Thread.sleep(1000);
		 enter_PurchaseAccountTxt.sendKeys(Keys.TAB);
		 Thread.sleep(2000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
		 select1stRow_7thColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		 enter_Quantity.click();
		 enter_Quantity.sendKeys(Keys.END);
		 enter_Quantity.sendKeys(Keys.SHIFT,Keys.HOME);
		 enter_Quantity.sendKeys( excelReader.getCellData(xlSheetName, 190, 5));
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_10thColumn));
		 select1stRow_10thColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		 enter_Rate.click();
		 enter_Rate.sendKeys(Keys.END);
		 enter_Rate.sendKeys(Keys.SHIFT,Keys.HOME);
		 enter_Rate.sendKeys( excelReader.getCellData(xlSheetName, 191, 5));
		 Thread.sleep(1000);
		 enter_Rate.sendKeys(Keys.TAB);
		 Thread.sleep(3000);
		 
		 String expSavingMessage =  excelReader.getCellData(xlSheetName, 192, 6);

		 String actSavingMessage5 = checkValidationMessage(expSavingMessage);
		 

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();
		 
		 Thread.sleep(1500);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		 newReferenceTxt.click();

		 Thread.sleep(2000);
		 //Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();

		 Thread.sleep(3000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();
		
		 Thread.sleep(2000);
		
	
		 String expSavingMessage1 =  excelReader.getCellData(xlSheetName, 192, 6);

		 String actSavingMessage = checkValidationMessage(expSavingMessage1);
		 excelReader.setCellData(xlfile, xlSheetName, 192, 7, actSavingMessage);
		 
		 Thread.sleep(2000);
		 
		 String expSavingMessage2 =  excelReader.getCellData(xlSheetName, 193, 6);

		 String actSavingMessage1 = checkValidationMessage(expSavingMessage2);
		 excelReader.setCellData(xlfile, xlSheetName, 193, 7, actSavingMessage1);
		
		 if(actSavingMessage1.startsWith(expSavingMessage2))
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 185, 8, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 185, 8, resFail);
			 return false;
		 }




	 }
	 
		@FindBy(xpath="//*[@id='2023']/span")
		private static WebElement  finTransJournalsMenu;
		
		@FindBy(xpath="//a[@id='2027']//span[text()='Credit Notes']")
		private static WebElement  creditNotesMenu; 
		
		@FindBy(xpath="//*[@id='2026']/span[text()='Debit Notes']")
		private static WebElement  debitNotesMenu; 
		
		@FindBy(xpath="//*[@id='id_body_12_table_body']/tr/td[2]")
		private static List<WebElement> accountListCount;

	@FindBy(xpath="//*[@id='id_transactionentry_save']")
		private static WebElement  MRsaveBtn;



	 public static boolean checkSaveCreditNoteVoucherWithSavedCustomerOrVendorAccount() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 Thread.sleep(3000);
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 getDriver().navigate().refresh();
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		 finacinalsMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		 financialsTransactionMenu.click();

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finTransJournalsMenu));
		 finTransJournalsMenu.click();

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditNotesMenu));
		 creditNotesMenu.click();

		 Thread.sleep(2000);; 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		 newBtn.click();

		 checkValidationMessage("");

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		 customerAccountTxt.click();
		 customerAccountTxt.sendKeys( excelReader.getCellData(xlSheetName, 195, 5));

		 Thread.sleep(3000);

		 customerAccountTxt.sendKeys(Keys.TAB);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		 departmentTxt.click();
		 departmentTxt.sendKeys(Keys.SPACE);

		 int departmentcount=departmentListCount.size();

		 System.err.println(departmentcount);

		 for(int i=0 ; i < departmentcount ;i++)
		 {
			 String depdata=departmentListCount.get(i).getText();

			 if(depdata.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 196, 5)))
			 {
				 departmentListCount.get(i).click();

				 break;
			 }
		 }        

		 departmentTxt.sendKeys(Keys.TAB);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		 select1stRow_1stColumn.click();
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
		 enter_AccountTxt.click();
		 enter_AccountTxt.sendKeys(Keys.END);
		 enter_AccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		 enter_AccountTxt.sendKeys(Keys.SPACE);

		 Thread.sleep(1000);

		 int dbaccountCount1=accountListCount.size();

		 System.err.println(dbaccountCount1);

		 for(int i=0 ; i < dbaccountCount1 ;i++)
		 {
			 String data=accountListCount.get(i).getText();

			 if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 197, 5)))
			 {
				 accountListCount.get(i).click();

				 break;
			 }
		 }

		 enter_AccountTxt.sendKeys(Keys.TAB);



		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
		 enter_Amount.sendKeys( excelReader.getCellData(xlSheetName, 198, 5));
		 enter_Amount.sendKeys(Keys.TAB);

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MRsaveBtn));
		 MRsaveBtn.click();
		 

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		 newReferenceTxt.click();

		 Thread.sleep(2000);
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();

		 
		 String expMessage =  excelReader.getCellData(xlSheetName, 199, 6);
		 String actMessage = checkValidationMessage(expMessage);
		  excelReader.setCellData(xlfile, xlSheetName, 199, 7, actMessage);
		 
		 if (actMessage.startsWith(expMessage)) 
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 194, 8, resPass);
			return true;
		}
		 else 
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 194, 8, resFail);
			 return false;
		}
		 
	 }
	 
	 public static boolean checkSaveDebitNotesVoucherWithSavedCustOrVenAccount() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());	
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
			finacinalsMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finTransJournalsMenu));
			finTransJournalsMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitNotesMenu));
			debitNotesMenu.click();

			
			Thread.sleep(2000);

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("");

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.click();
			customerAccountTxt.sendKeys(excelReader.getCellData(xlSheetName, 201, 5));

			Thread.sleep(3000);

			customerAccountTxt.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys(Keys.SPACE);

			int departmentcount=departmentListCount.size();

			System.err.println(departmentcount);

			for(int i=0 ; i < departmentcount ;i++)
			{
				String depdata=departmentListCount.get(i).getText();

				if(depdata.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 202, 5)))
				{
					departmentListCount.get(i).click();

					break;
				}
			}	

			departmentTxt.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
			enter_AccountTxt.click();
			enter_AccountTxt.sendKeys(Keys.END);
			enter_AccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			enter_AccountTxt.sendKeys(Keys.SPACE);

			Thread.sleep(2000);

			int dbaccountCount1=accountListCount.size();

			System.err.println(dbaccountCount1);

			for(int i=0 ; i < dbaccountCount1 ;i++)
			{
				String data=accountListCount.get(i).getText();

				if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 203, 5)))
				{
					accountListCount.get(i).click();

					break;
				}
			}

			enter_AccountTxt.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
			enter_Amount.sendKeys(excelReader.getCellData(xlSheetName, 204, 5));
			enter_Amount.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MRsaveBtn));
			MRsaveBtn.click();
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
			 newReferenceTxt.click();

			 Thread.sleep(2000);
			 Thread.sleep(2000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			 billRefPickIcon.click();

			 Thread.sleep(2000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			 billRefOkBtn.click();

			
			 String expMessage = excelReader.getCellData(xlSheetName, 205, 6);
			 String actMessage = checkValidationMessage(expMessage);
			 
			 excelReader.setCellData(xlfile, xlSheetName, 205, 7, actMessage);
			 
			 if (actMessage.startsWith(expMessage)) 
			 {
				 excelReader.setCellData(xlfile, xlSheetName, 200, 8, resPass);
				return true;
			}
			 else 
			 {
				 excelReader.setCellData(xlfile, xlSheetName, 200, 8, resFail);
				 return false;
			}
	
	 }
	 @FindBy(xpath="//*[@id='2016']/span[text()='Sales Returns']")
	 public static WebElement salesReturnsVoucher;
	 
	 public static boolean checkSaveSalesReturnsVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 { 
		 Thread.sleep(3000);
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());

	
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		 finacinalsMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		 financialsTransactionMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		 financialTransactionSalesMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReturnsVoucher));
		 salesReturnsVoucher.click();

		 Thread.sleep(4000);
		 
		 Thread.sleep(4000);

			

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		 newBtn.click();

		 checkValidationMessage("Screen opened");

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		 customerAccountTxt.sendKeys(excelReader.getCellData(xlSheetName, 207, 5));
		 Thread.sleep(3000);
		 customerAccountTxt.sendKeys(Keys.TAB);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		 departmentTxt.sendKeys(Keys.SPACE);

		 int departmentcount=departmentListCount.size();

		 System.err.println(departmentcount);

		 for(int i=0 ; i < departmentcount ;i++)
		 {
			 String data=departmentListCount.get(i).getText();

			 if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 208, 5)))
			 {
				 departmentListCount.get(i).click();
				 break;
			 }
		 }

		 departmentTxt.sendKeys(Keys.TAB);

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		 select1stRow_1stColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxtInPR));
		 warehouseTxtInPR.click();
		 warehouseTxtInPR.sendKeys(excelReader.getCellData(xlSheetName, 209, 5));
		 Thread.sleep(2000);
		 warehouseTxtInPR.sendKeys(Keys.TAB);


		 enter_ItemTxt.sendKeys(excelReader.getCellData(xlSheetName, 210, 5));
		 Thread.sleep(2000);
		 enter_ItemTxt.sendKeys(Keys.TAB);

		 enter_SalesAccountTxt.click();
		 Thread.sleep(1000);
		 enter_SalesAccountTxt.sendKeys(Keys.TAB);
		 Thread.sleep(2000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		 select1stRow_5thColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		 enter_Quantity.click();
		 enter_Quantity.sendKeys(Keys.END);
		 enter_Quantity.sendKeys(Keys.SHIFT,Keys.HOME);
		 enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 211, 5));
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
		 select1stRow_7thColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		 enter_Rate.click();
		 enter_Rate.sendKeys(Keys.END);
		 enter_Rate.sendKeys(Keys.SHIFT,Keys.HOME);
		 enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 212, 5));
		 Thread.sleep(1000);
		 enter_Rate.sendKeys(Keys.TAB);
		 Thread.sleep(2000);

		 checkValidationMessage("This transaction will make stock negative.");

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();

		 Thread.sleep(2500);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		 newReferenceTxt.click();

		 Thread.sleep(2000);
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();

		 String expMessage = excelReader.getCellData(xlSheetName, 213, 6);
		 String actMessage = checkValidationMessage(expMessage);
		 excelReader.setCellData(xlfile, xlSheetName, 213, 7, actMessage);
		 
		 if (actMessage.startsWith(expMessage)) 
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 206, 8, resPass);
			return true;
		}
		 else 
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 206, 8, resPass);
			 return false;
		}

	 }
	 
	 @FindBy(xpath="//*[@id='2008']/span[text()='Purchases Vouchers']")
	 public static WebElement purchasesVoucher;
	 
	 public static boolean checkSavePurchaseVoucherWithCreatedCustOrVenAccount() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 Thread.sleep(3000);
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		 finacinalsMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		 financialsTransactionMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		 financialsTransactionsPurchaseMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesVoucher));
		 purchasesVoucher.click();

		 Thread.sleep(4000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		 newBtn.click();

		 checkValidationMessage("Screen opened");
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		 purchaseAccountTxt.click();
		 purchaseAccountTxt.sendKeys( excelReader.getCellData(xlSheetName, 215, 5));
		 Thread.sleep(2000);
		 purchaseAccountTxt.sendKeys(Keys.TAB);
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		 customerAccountTxt.click();
		 customerAccountTxt.sendKeys( excelReader.getCellData(xlSheetName, 216, 5));
		 Thread.sleep(2000);
		 customerAccountTxt.sendKeys(Keys.TAB);
		 
		 Thread.sleep(1000);
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		 departmentTxt.sendKeys(Keys.SPACE);

		 int departmentcount=departmentListCount.size();

		 System.err.println(departmentcount);

		 for(int i=0 ; i < departmentcount ;i++)
		 {
			 String data=departmentListCount.get(i).getText();

			 if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 217, 5)))
			 {
				 departmentListCount.get(i).click();
				 break;
			 }
		 }

		 departmentTxt.sendKeys(Keys.TAB);
		 

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		 select1stRow_1stColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxtInPR));
		 warehouseTxtInPR.click();
		 warehouseTxtInPR.sendKeys( excelReader.getCellData(xlSheetName, 218, 5));
		 Thread.sleep(2000);
		 warehouseTxtInPR.sendKeys(Keys.TAB);


		 enter_ItemTxt.sendKeys( excelReader.getCellData(xlSheetName, 219, 5));
		 Thread.sleep(2000);
		 enter_ItemTxt.sendKeys(Keys.TAB);

		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		 select1stRow_5thColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		 enter_Quantity.click();
		 enter_Quantity.sendKeys( excelReader.getCellData(xlSheetName, 220, 5));
		 Thread.sleep(2000);
		 enter_Quantity.sendKeys(Keys.TAB);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		 enter_Rate.click();
		 enter_Rate.sendKeys(Keys.END);
		 enter_Rate.sendKeys(Keys.SHIFT,Keys.HOME);
		 enter_Rate.sendKeys( excelReader.getCellData(xlSheetName, 221, 5));
		 Thread.sleep(1000);
		 enter_Rate.sendKeys(Keys.TAB);
		 Thread.sleep(2000);

		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();
		 
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		 newReferenceTxt.click();

		 Thread.sleep(2000);
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();

		 String expMessage =  excelReader.getCellData(xlSheetName, 222, 6);
		 String actMessage = checkValidationMessage(expMessage);
		 excelReader.setCellData(xlfile, xlSheetName, 222, 7, actMessage);
		 
		 if (actMessage.startsWith(expMessage)) 
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 214, 8, resPass);
			return true;
		}
		 else 
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 214, 8, resFail);
			 return false;
		}

	 }
	 
	 @FindBy(xpath="//*[@id='2015']/span[text()='Sales Invoices']")
	 private static WebElement salesInvoicesVoucher;
	 
	 public static boolean checkSalesInvoiceVoucherWithCreatedCustOrVenAccount() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	 {

		 Thread.sleep(3000);
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		 finacinalsMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		 financialsTransactionMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		 financialTransactionSalesMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
		 salesInvoicesVoucher.click();

		 Thread.sleep(4000);

		 Thread.sleep(4000);



		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		 newBtn.click();

		 checkValidationMessage("Screen opened");

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAccountTxt));
		 salesAccountTxt.click();
		 salesAccountTxt.sendKeys(excelReader.getCellData(xlSheetName, 224, 5));
		 Thread.sleep(2000);
		 salesAccountTxt.sendKeys(Keys.TAB);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		 customerAccountTxt.click();
		 customerAccountTxt.sendKeys(excelReader.getCellData(xlSheetName, 225, 5));
		 Thread.sleep(2000);
		 customerAccountTxt.sendKeys(Keys.TAB);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		 departmentTxt.sendKeys(Keys.SPACE);

		 int departmentcount=departmentListCount.size();

		 System.err.println(departmentcount);

		 for(int i=0 ; i < departmentcount ;i++)
		 {
			 String data=departmentListCount.get(i).getText();

			 if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 226, 5)))
			 {
				 departmentListCount.get(i).click();
				 break;
			 }
		 }

		 departmentTxt.sendKeys(Keys.TAB);


		 Thread.sleep(2000);

		 wareHouseTxtinSalesInv.click();
		 wareHouseTxtinSalesInv.sendKeys(excelReader.getCellData(xlSheetName, 227, 5));
		 Thread.sleep(2000);
		 wareHouseTxtinSalesInv.sendKeys(Keys.TAB);

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		 select1stRow_1stColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		 enter_ItemTxt.click();
		 enter_ItemTxt.sendKeys(excelReader.getCellData(xlSheetName, 228, 5));
		 Thread.sleep(2000);
		 enter_ItemTxt.sendKeys(Keys.TAB);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		 select1stRow_5thColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_salesInvoiceFQ));
		 enter_salesInvoiceFQ.click();
		 enter_salesInvoiceFQ.sendKeys(Keys.END);
		 enter_salesInvoiceFQ.sendKeys(Keys.SHIFT,Keys.HOME);
		 enter_salesInvoiceFQ.sendKeys(excelReader.getCellData(xlSheetName, 229, 5));
		 Thread.sleep(2000);
		 enter_salesInvoiceFQ.sendKeys(Keys.TAB);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
		 select1stRow_8thColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		 enter_Quantity.click();

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
		 select1stRow_11thColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		 enter_Rate.click();
		 enter_Rate.sendKeys(Keys.END);
		 enter_Rate.sendKeys(Keys.SHIFT,Keys.HOME);
		 enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 230, 5));
		 Thread.sleep(1000);
		 enter_Rate.sendKeys(Keys.TAB);
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();
		
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		 newReferenceTxt.click();

		 Thread.sleep(2000);
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();

		 String expMessage = excelReader.getCellData(xlSheetName, 231, 6);
		 String actMessage = checkValidationMessage(expMessage);
		 excelReader.setCellData(xlfile, xlSheetName, 231, 7, actMessage);


		 if (actMessage.startsWith(expMessage)) 
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 223, 8, resPass);
			 return true;
		 }
		 else 
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 223, 8, resFail);
			 return false;
		 }
		 
	 }
	 
	 @FindBy (xpath="//div[@id='Modal_Header']")
		private static WebElement rmaScreenTitle;

		@FindBy (xpath="//input[@id='txtSerialNo']")
		private static WebElement rmaSerialNumberTxtField;

		@FindBy (xpath="//input[@id='txtQuantity']")
		private static WebElement rmaQuantityTxtField;

	//	@FindBy (xpath="//div[@id='img_add']//span")
		@FindBy(xpath="//*[@id='Modal_Search_Body']//span/i")
		private static WebElement rmaAddBtn;
		
		//@FindBy (xpath="//i[@class='icon-ok icon-font']")
		@FindBy(xpath="//*[@id='div_OK']")
		private static WebElement rmaOkBtn;
		
		@FindBy(xpath="(//*[@id='div_Clear'])[1]")
		private static WebElement rmaClearBtn;
		
		@FindBy (xpath="//div[@id='RMAModel_Bottom']/div[1]/label")
		private static WebElement rmaCancelBtn;
		
		@FindBy (xpath="//div[@id='RMAModel_Bottom']/div[1]/label")
		private static WebElement rmaClearlBtn;
		
		@FindBy (xpath="//*[@id='chkSelectALL']")
		private static WebElement rmaSelectAllBtn;
		
		@FindBy(xpath="//td[contains(text(),'Rma1Rma')]/preceding-sibling::td")
		private static WebElement  rma1stchekbx;
		
		@FindBy(xpath="//td[contains(text(),'Rma2Rma')]/preceding-sibling::td")
		private static WebElement  rma2ndchekbx;
		
		@FindBy(xpath="//td[contains(text(),'Rma3Rma')]/preceding-sibling::td")
		private static WebElement  rma3rdchekbx;
		
		
		
	 public  boolean checkSavePurchaseVoucherWithRMANumbersFromExcel() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		 Thread.sleep(3000);
			
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		 finacinalsMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		 financialsTransactionMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		 financialsTransactionsPurchaseMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesVoucher));
		 purchasesVoucher.click();

		 Thread.sleep(4000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		 newBtn.click();

		 checkValidationMessage("Screen opened");
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		 purchaseAccountTxt.click();
		 purchaseAccountTxt.sendKeys( excelReader.getCellData(xlSheetName, 233, 5));
		 Thread.sleep(2000);
		 purchaseAccountTxt.sendKeys(Keys.TAB);
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		 customerAccountTxt.click();
		 customerAccountTxt.sendKeys( excelReader.getCellData(xlSheetName, 234, 5));
		 Thread.sleep(2000);
		 customerAccountTxt.sendKeys(Keys.TAB);
		 
		 Thread.sleep(1000);
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		 departmentTxt.sendKeys(Keys.SPACE);

		 int departmentcount=departmentListCount.size();

		 System.err.println(departmentcount);

		 for(int i=0 ; i < departmentcount ;i++)
		 {
			 String data=departmentListCount.get(i).getText();

			 if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 235, 5)))
			 {
				 departmentListCount.get(i).click();
				 break;
			 }
		 }

		 departmentTxt.sendKeys(Keys.TAB);
		 

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		 select1stRow_1stColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxtInPR));
		 warehouseTxtInPR.click();
		 warehouseTxtInPR.sendKeys( excelReader.getCellData(xlSheetName, 236, 5));
		 Thread.sleep(2000);
		 warehouseTxtInPR.sendKeys(Keys.TAB);


		 enter_ItemTxt.sendKeys( excelReader.getCellData(xlSheetName, 237, 5));
		 Thread.sleep(2000);
		 enter_ItemTxt.sendKeys(Keys.TAB);

		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		 select1stRow_5thColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		 enter_Quantity.click();
		 enter_Quantity.sendKeys(Keys.END);
		 enter_Quantity.sendKeys(Keys.SHIFT,Keys.HOME);
		 enter_Quantity.sendKeys( excelReader.getCellData(xlSheetName, 238, 5));
		 Thread.sleep(2000);
		 enter_Quantity.sendKeys(Keys.TAB);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		 enter_Rate.click();
		 enter_Rate.sendKeys(Keys.END);
		 enter_Rate.sendKeys(Keys.SHIFT,Keys.HOME);
		 enter_Rate.sendKeys( excelReader.getCellData(xlSheetName, 239, 5));
		 Thread.sleep(1000);
		 enter_Rate.sendKeys(Keys.TAB);
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		 enter_Gross.click();
		 enter_Gross.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		 enter_Discount.click();
		 enter_Discount.sendKeys(Keys.TAB);
		 Thread.sleep(1000);
		 
		 String rma1 = excelReader.getCellData(xlSheetName1, 0, 0);
		 String rma2 = excelReader.getCellData(xlSheetName1, 1, 0);
		 String rma3 = excelReader.getCellData(xlSheetName1, 2, 0);
		 
		 //this.rmaText=rmaText; 
		 
		  //rmaText = rma1+","+"\n"+rma2+","+"\n"+rma3;
		 String rmaText = rma1+","+"\n"+rma2+","+"\n"+rma3;
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		rmaSerialNumberTxtField.sendKeys(rmaText);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
		rmaAddBtn.click();

			Thread.sleep(2000);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		rmaOkBtn.click();
			
		Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();
		 
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		 newReferenceTxt.click();

		 Thread.sleep(2000);
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();

		 String expMessage =  excelReader.getCellData(xlSheetName, 240, 6);
		 String actMessage = checkValidationMessage(expMessage);
		 excelReader.setCellData(xlfile, xlSheetName, 240, 7, actMessage);
		 
		 if (actMessage.startsWith(expMessage)) 
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 232, 8, resPass);
			return true;
		}
		 else 
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 232, 8, resFail);
			 return false;
		}

	 
	 }
	 
	// @FindBy(xpath="//*[@id='id_transactionentry_toggle']/div[15]/div/div/a/span")
	 @FindBy(xpath="//*[@id='id_transactionentry_more']")
	 private static WebElement toggleBtn;
	 
	 //@FindBy(xpath="//*[@id='id_transactionentry_copytoclipboard']/a/label")
	 @FindBy(xpath="//*[@id='id_transactionentry_copytoclipboard']")
	 private static WebElement copyToClipBoardBtn;
	 
	// @FindBy(xpath="//*[@id='id_transactionentry_pastefromclipboard']/a/label")
	 @FindBy(xpath="//*[@id='id_transactionentry_pastefromclipboard']")
	 private static WebElement pasteFromClipBoardBtn;
	 
	 @FindBy(xpath="//*[@id='id_body_38']")
	 private static WebElement enter_Rma;
	 
	 @FindBy(xpath="//*[@id='id_body_38_input_image']/img")
	 private static WebElement enter_RmaDropDown;
	 
	// @FindBy(xpath="//*[@id='id_transactionentry_new']/div[1]/span")
	 @FindBy(xpath="//*[@id='id_transactionentry_new']")
		private static WebElement  newBtnFromVoucherHome;
	
	
	 
	 public static boolean checkCopyToClipandPasteBoardPreviouslySavedPurVoucherWithRmaAndSaveWithSameRma() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		 previousBtn.click();


		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		 toggleBtn.click();

		
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copyToClipBoardBtn));
		 copyToClipBoardBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtnFromVoucherHome));
		 newBtnFromVoucherHome.click();
		 
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		 toggleBtn.click();

		
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pasteFromClipBoardBtn));
		 pasteFromClipBoardBtn.click();
		 
		 checkValidationMessage("Paste from clipboard completed successfully");
		 
		 Thread.sleep(3000);
		 
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	   		String actR1Warehouse = select1stRow_1stColumn.getText();
	   		String expR1Warehouse =  excelReader.getCellData(xlSheetName, 242, 6);
	   		excelReader.setCellData(xlfile, xlSheetName, 242, 7, actR1Warehouse);
		 
			String actR1Item = select1stRow_2ndColumn.getText();
	   		String expR1Item = excelReader.getCellData(xlSheetName, 243, 6);
	   		excelReader.setCellData(xlfile, xlSheetName, 243, 7, actR1Item);

	   		String actR1Units = select1stRow_3rdColumn.getText();
	   		String expR1Units = excelReader.getCellData(xlSheetName, 244, 6);
	   		excelReader.setCellData(xlfile, xlSheetName, 244, 7, actR1Units);

	   		String actR1Quantity = select1stRow_5thColumn.getText();
	   		String expR1Quantity = excelReader.getCellData(xlSheetName, 245, 6);
	   		excelReader.setCellData(xlfile, xlSheetName, 245, 7, actR1Quantity);

	   		String actR1Rate = select1stRow_6thColumn.getText();
	   		String expR1Rate = excelReader.getCellData(xlSheetName, 246, 6);
	   		excelReader.setCellData(xlfile, xlSheetName, 246, 7, actR1Rate);

	   		String actR1Gross = select1stRow_7thColumn.getText();
	   		String expR1Gross = excelReader.getCellData(xlSheetName, 247, 6);
	   		excelReader.setCellData(xlfile, xlSheetName, 247, 7, actR1Gross);
	   		
	   		String actRma = select1stRow_12thColumn.getText();
	   		String expRma = excelReader.getCellData(xlSheetName, 248, 6);
	   		excelReader.setCellData(xlfile, xlSheetName, 248, 7, actRma);
	   		
	   		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
	   		select1stRow_8thColumn.click();
	  
	   	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		 enter_Discount.click();
		 enter_Discount.sendKeys(Keys.TAB);
		 Thread.sleep(1000);
		 
		 String rma1 = excelReader.getCellData(xlSheetName1, 0, 0);
		 String rma2 = excelReader.getCellData(xlSheetName1, 1, 0);
		 String rma3 = excelReader.getCellData(xlSheetName1, 2, 0);
		 
		 String rmaText = rma1+","+"\n"+rma2+","+"\n"+rma3;
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		rmaSerialNumberTxtField.sendKeys(rmaText);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
		rmaAddBtn.click();

			Thread.sleep(2000);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		rmaOkBtn.click();
			
		Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();
		 
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		 newReferenceTxt.click();

		 Thread.sleep(2000);
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();
		 
		 Thread.sleep(1000);
		 
		 String expMessage = excelReader.getCellData(xlSheetName, 249, 6);
		 
		String actMessage = checkValidationMessage(expMessage);
		
		 excelReader.setCellData(xlfile, xlSheetName, 249, 7, actMessage);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
   		select1stRow_8thColumn.click();
  
   	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
	 enter_Discount.click();
	 enter_Discount.sendKeys(Keys.TAB);
	 Thread.sleep(1000);
		
	/* enter_RmaDropDown.click();
	 Thread.sleep(1000);
	 rmaCancelBtn.click();*/
	 
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
	 select1stRow_12thColumn.click();
	 
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rma));
	 enter_Rma.sendKeys(Keys.SPACE);
	 Thread.sleep(2000);
	 
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaClearBtn));
	 rmaClearBtn.click();
	 
	 Thread.sleep(1000);
	 
	 String rma4 = excelReader.getCellData(xlSheetName1, 3, 0);
	 String rma5 = excelReader.getCellData(xlSheetName1, 4, 0);
	 String rma6 = excelReader.getCellData(xlSheetName1, 5, 0);
	 
	 String rmaText2 = rma4+","+"\n"+rma5+","+"\n"+rma6;
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
	rmaSerialNumberTxtField.click();
	rmaSerialNumberTxtField.sendKeys(rmaText2);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
	rmaAddBtn.click();

		Thread.sleep(2000);
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
	rmaOkBtn.click();
		
	
	Thread.sleep(2000);
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
	 voucherSaveBtn.click();
	 
	 Thread.sleep(2000);
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
	 newReferenceTxt.click();

	 Thread.sleep(2000);
	 Thread.sleep(2000);

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
	 billRefPickIcon.click();

	 Thread.sleep(2000);

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
	 billRefOkBtn.click();

	 String expMessage1 =  excelReader.getCellData(xlSheetName, 250, 6);
     
	 String actMessage1 = checkValidationMessage(expMessage1);
	 excelReader.setCellData(xlfile, xlSheetName, 250, 7, actMessage1);
		
			System.out.println("*******************************ROW1**********************************");

			System.out.println("Warehouse       : "+actR1Warehouse			+"  Value Expected  "+expR1Warehouse);
			System.out.println("Item            : "+actR1Item				+"  Value Expected  "+expR1Item);
			System.out.println("Units           : "+actR1Units				+"  Value Expected  "+expR1Units);
			System.out.println("Quantity        : "+actR1Quantity			+"  Value Expected  "+expR1Quantity);
			System.out.println("Rate            : "+actR1Rate				+"  Value Expected  "+expR1Rate);
			System.out.println("Gross           : "+actR1Gross				+"  Value Expected  "+expR1Gross);
			System.out.println("Rma             : "+actRma				    +"  Value Expected  "+expRma);


			if(actR1Warehouse.equalsIgnoreCase(expR1Warehouse) && actR1Item.equalsIgnoreCase(expR1Item) &&
					
				actR1Units.equalsIgnoreCase(expR1Units) && actR1Quantity.equalsIgnoreCase(expR1Quantity) &&
				actR1Rate.equalsIgnoreCase(expR1Rate) && actR1Gross.equalsIgnoreCase(expR1Gross)
				&& actMessage.equalsIgnoreCase(expMessage) && actMessage1.startsWith(expMessage1))
			{
				
				Thread.sleep(2000);
				excelReader.setCellData(xlfile, xlSheetName, 241, 8, resPass);
						
				return true;
				
				
			}
			
			else
			{
				 excelReader.setCellData(xlfile, xlSheetName, 241, 8, resFail);
				return false;
			}
	  
	 }
	 
	 public static boolean checkSavePurchaseVoucherWithRmaFromNotePad() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {

		 Thread.sleep(3000);
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		 finacinalsMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		 financialsTransactionMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		 financialsTransactionsPurchaseMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesVoucher));
		 purchasesVoucher.click();

		 Thread.sleep(4000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		 newBtn.click();

		 checkValidationMessage("Screen opened");

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		 purchaseAccountTxt.click();
		 purchaseAccountTxt.sendKeys(excelReader.getCellData(xlSheetName, 262, 5));
		 Thread.sleep(2000);
		 purchaseAccountTxt.sendKeys(Keys.TAB);

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		 customerAccountTxt.click();
		 customerAccountTxt.sendKeys(excelReader.getCellData(xlSheetName, 263, 5));
		 Thread.sleep(2000);
		 customerAccountTxt.sendKeys(Keys.TAB);

		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		 departmentTxt.sendKeys(Keys.SPACE);

		 int departmentcount=departmentListCount.size();

		 System.err.println(departmentcount);

		 for(int i=0 ; i < departmentcount ;i++)
		 {
			 String data=departmentListCount.get(i).getText();

			 if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 264, 5)))
			 {
				 departmentListCount.get(i).click();
				 break;
			 }
		 }

		 departmentTxt.sendKeys(Keys.TAB);


		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		 select1stRow_1stColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxtInPR));
		 warehouseTxtInPR.click();
		 warehouseTxtInPR.sendKeys(excelReader.getCellData(xlSheetName, 265, 5));
		 Thread.sleep(2000);
		 warehouseTxtInPR.sendKeys(Keys.TAB);


		 enter_ItemTxt.sendKeys(excelReader.getCellData(xlSheetName, 266, 5));
		 Thread.sleep(2000);
		 enter_ItemTxt.sendKeys(Keys.TAB);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		 select1stRow_5thColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		 enter_Quantity.click();
		 enter_Quantity.sendKeys(Keys.END);
		 enter_Quantity.sendKeys(Keys.SHIFT,Keys.HOME);
		 enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 267, 5));
		 Thread.sleep(2000);
		 enter_Quantity.sendKeys(Keys.TAB);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		 enter_Rate.click();
		 enter_Rate.sendKeys(Keys.END);
		 enter_Rate.sendKeys(Keys.SHIFT,Keys.HOME);
		 enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 268, 5));
		 Thread.sleep(1000);
		 enter_Rate.sendKeys(Keys.TAB);
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		 enter_Gross.click();
		 enter_Gross.sendKeys(Keys.TAB);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		 enter_Discount.click();
		 enter_Discount.sendKeys(Keys.TAB);
		 Thread.sleep(1000);

		 NotePadReader p = new NotePadReader();
		 String RmaTxt1 = p.getNotePadTxt();
		 System.err.println(RmaTxt1);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		 rmaSerialNumberTxtField.sendKeys(RmaTxt1);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
		 rmaAddBtn.click();

		 Thread.sleep(2000);
		 int countRMA=rmaTableList.size();
			
		 ArrayList<String >users=new ArrayList<String>();
		 
		 for (int i = 0; i < countRMA; i++) 
		 {
			String data=rmaTableList.get(i).getText();
			users.add(data);
		}
		 
		 String actRMAList=users.toString();
		 String expRMAList= excelReader.getCellData(xlSheetName, 269, 6);
		 excelReader.setCellData(xlfile, xlSheetName, 269, 7, actRMAList);
		 
		 System.out.println(" ACt List Displayed Users  : "+actRMAList);
		 System.out.println(" Exp List Displayed Users  : "+expRMAList);
	
		 

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		 rmaOkBtn.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();

		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		 newReferenceTxt.click();

		 Thread.sleep(2000);
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();

		 String expMessage = excelReader.getCellData(xlSheetName, 270, 6);
		
		 String actMessage = checkValidationMessage(expMessage);
		 excelReader.setCellData(xlfile, xlSheetName, 270, 7, actMessage);

		 if (actRMAList.equalsIgnoreCase(expRMAList) && actMessage.startsWith(expMessage)) 
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 261, 8, resPass);
			 return true;
		 }
		 else 
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 261, 8, resFail);
			 return false;
		 }


	 }
	 
	 public static boolean checkCopyToClipBoardFromSavedPurchaseVoucherWithRmaFromNotePad() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	 {
		 
		 Thread.sleep(2000);
		  excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		 previousBtn.click();


		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		 toggleBtn.click();

		
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copyToClipBoardBtn));
		 copyToClipBoardBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtnFromVoucherHome));
		 newBtnFromVoucherHome.click();
		 
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		 toggleBtn.click();

		
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pasteFromClipBoardBtn));
		 pasteFromClipBoardBtn.click();
		 
		 checkValidationMessage("Paste from clipboard completed successfully");
		 
		 Thread.sleep(3000);
		 
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	   		String actR1Warehouse = select1stRow_1stColumn.getText();
	   		String expR1Warehouse = excelReader.getCellData(xlSheetName, 272, 6);
	   		excelReader.setCellData(xlfile, xlSheetName, 272, 7, actR1Warehouse);

		 
			String actR1Item = select1stRow_2ndColumn.getText();
	   		String expR1Item =  excelReader.getCellData(xlSheetName, 273, 6);
	   		excelReader.setCellData(xlfile, xlSheetName, 273, 7, actR1Item);

	   		String actR1Units = select1stRow_3rdColumn.getText();
	   		String expR1Units =  excelReader.getCellData(xlSheetName, 274, 6);
	   		excelReader.setCellData(xlfile, xlSheetName, 274, 7, actR1Units);

	   		String actR1Quantity = select1stRow_5thColumn.getText();
	   		String expR1Quantity =  excelReader.getCellData(xlSheetName, 275, 6);
	   		excelReader.setCellData(xlfile, xlSheetName, 275, 7, actR1Quantity);

	   		String actR1Rate = select1stRow_6thColumn.getText();
	   		String expR1Rate =  excelReader.getCellData(xlSheetName, 276, 6);
	   		excelReader.setCellData(xlfile, xlSheetName, 276, 7, actR1Rate);

	   		String actR1Gross = select1stRow_7thColumn.getText();
	   		String expR1Gross =  excelReader.getCellData(xlSheetName, 277, 6);
	   		excelReader.setCellData(xlfile, xlSheetName, 277, 7, actR1Gross);
	   		
	   		String actRma = select1stRow_12thColumn.getText();
	   		String expRma =  excelReader.getCellData(xlSheetName, 278, 6);
	   		excelReader.setCellData(xlfile, xlSheetName, 278, 7, actRma);
	   		
	   		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
	   		select1stRow_8thColumn.click();
	  
	   	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		 enter_Discount.click();
		 enter_Discount.sendKeys(Keys.TAB);
		 Thread.sleep(1000);
		 
		
		 
		 NotePadReader p = new NotePadReader();
		 String RmaTxt1 = p.getNotePadTxt();
		 System.err.println(RmaTxt1);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));
		 
		

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		// rmaSerialNumberTxtField.click();
		 
		 rmaSerialNumberTxtField.sendKeys(RmaTxt1);

		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
		rmaAddBtn.click();

			Thread.sleep(2000);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		rmaOkBtn.click();
			
		Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();
		 
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		 newReferenceTxt.click();

		 Thread.sleep(2000);
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();
		 
		 Thread.sleep(1000);
		 
		 String expMessage =  excelReader.getCellData(xlSheetName, 279, 6);
	   	
		String actMessage = checkValidationMessage(expMessage);
		excelReader.setCellData(xlfile, xlSheetName, 279, 7, actMessage);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
   		select1stRow_8thColumn.click();
  
   	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
	 enter_Discount.click();
	 enter_Discount.sendKeys(Keys.TAB);
	 Thread.sleep(1000);
		
	/* enter_RmaDropDown.click();
	 Thread.sleep(1000);
	 rmaCancelBtn.click();
	 */
	 
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
	 select1stRow_12thColumn.click();
	 
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rma));
	 enter_Rma.sendKeys(Keys.SPACE);
	 Thread.sleep(2000);
	 
	 String RmaTxt2 = p.getNotePadTxt2();
	 System.err.println(RmaTxt2);


	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaClearBtn));
	 rmaClearBtn.click();
	 

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
	 rmaSerialNumberTxtField.click();
	 rmaSerialNumberTxtField.sendKeys(RmaTxt2);


	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
	rmaAddBtn.click();

		Thread.sleep(2000);
		
		Thread.sleep(2000);
		 int countRMA=rmaTableList.size();
			
		 ArrayList<String >users=new ArrayList<String>();
		 
		 for (int i = 0; i < countRMA; i++) 
		 {
			String data=rmaTableList.get(i).getText();
			users.add(data);
		}
		 
		 String actRMAList=users.toString();
		 String expRMAList=  excelReader.getCellData(xlSheetName, 280, 6);
         
		 excelReader.setCellData(xlfile, xlSheetName, 280, 7, actRMAList);
		 
		 System.out.println(" ACt List Displayed Users  : "+actRMAList);
		 System.out.println(" Exp List Displayed Users  : "+expRMAList);
	
		 
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
	rmaOkBtn.click();
		
	
	Thread.sleep(2000);
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
	 voucherSaveBtn.click();
	 
	 Thread.sleep(2000);
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
	 newReferenceTxt.click();

	 Thread.sleep(2000);
	 Thread.sleep(2000);

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
	 billRefPickIcon.click();

	 Thread.sleep(2000);

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
	 billRefOkBtn.click();

	 String expMessage1 =  excelReader.getCellData(xlSheetName, 281, 6);
     String actMessage1 = checkValidationMessage(expMessage1);
	 excelReader.setCellData(xlfile, xlSheetName, 281, 7, actMessage1);
	 
		
			System.out.println("*******************************ROW1**********************************");

			System.out.println("Warehouse       : "+actR1Warehouse			+"  Value Expected  "+expR1Warehouse);
			System.out.println("Item            : "+actR1Item				+"  Value Expected  "+expR1Item);
			System.out.println("Units           : "+actR1Units				+"  Value Expected  "+expR1Units);
			System.out.println("Quantity        : "+actR1Quantity			+"  Value Expected  "+expR1Quantity);
			System.out.println("Rate            : "+actR1Rate				+"  Value Expected  "+expR1Rate);
			System.out.println("Gross           : "+actR1Gross				+"  Value Expected  "+expR1Gross);
			System.out.println("Rma             : "+actRma				    +"  Value Expected  "+expRma);


			if(actR1Warehouse.equalsIgnoreCase(expR1Warehouse) && actR1Item.equalsIgnoreCase(expR1Item) &&
					
				actR1Units.equalsIgnoreCase(expR1Units) && actR1Quantity.equalsIgnoreCase(expR1Quantity) &&
				actR1Rate.equalsIgnoreCase(expR1Rate) && actR1Gross.equalsIgnoreCase(expR1Gross)
				&& actMessage.equalsIgnoreCase(expMessage)  && actRMAList.equalsIgnoreCase(expRMAList) && actMessage1.startsWith(expMessage1))
			{
				Thread.sleep(2000);
				excelReader.setCellData(xlfile, xlSheetName, 271, 8, resPass);
				
				return true;
				
				
			}
			
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 271, 8, resFail);
				return false;
			}
	  
	 }
	 
	 public static boolean checkSaveSalesInvoicesVoucherWithRMAFromExcel() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		 Thread.sleep(3000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		 finacinalsMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		 financialsTransactionMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		 financialTransactionSalesMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
		 salesInvoicesVoucher.click();

		 Thread.sleep(4000);

		 Thread.sleep(4000);



		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		 newBtn.click();

		 checkValidationMessage("Screen opened");

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAccountTxt));
		 salesAccountTxt.click();
		 salesAccountTxt.sendKeys(excelReader.getCellData(xlSheetName, 252, 5));
		 Thread.sleep(2000);
		 salesAccountTxt.sendKeys(Keys.TAB);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		 customerAccountTxt.click();
		 customerAccountTxt.sendKeys(excelReader.getCellData(xlSheetName, 253, 5));
		 Thread.sleep(2000);
		 customerAccountTxt.sendKeys(Keys.TAB);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		 departmentTxt.sendKeys(Keys.SPACE);

		 int departmentcount=departmentListCount.size();

		 System.err.println(departmentcount);

		 for(int i=0 ; i < departmentcount ;i++)
		 {
			 String data=departmentListCount.get(i).getText();

			 if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 254, 5)))
			 {
				 departmentListCount.get(i).click();
				 break;
			 }
		 }

		 departmentTxt.sendKeys(Keys.TAB);


		 Thread.sleep(2000);

		 wareHouseTxtinSalesInv.click();
		 wareHouseTxtinSalesInv.sendKeys(excelReader.getCellData(xlSheetName, 255, 5));
		 Thread.sleep(2000);
		 wareHouseTxtinSalesInv.sendKeys(Keys.TAB);

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		 select1stRow_1stColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		 enter_ItemTxt.click();
		 enter_ItemTxt.sendKeys(excelReader.getCellData(xlSheetName, 256, 5));
		 Thread.sleep(2000);
		 enter_ItemTxt.sendKeys(Keys.TAB);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		 select1stRow_5thColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_salesInvoiceFQ));
		 enter_salesInvoiceFQ.click();
		 enter_salesInvoiceFQ.sendKeys(Keys.END);
		 enter_salesInvoiceFQ.sendKeys(Keys.SHIFT,Keys.HOME);
		 enter_salesInvoiceFQ.sendKeys(excelReader.getCellData(xlSheetName, 257, 5));
		 Thread.sleep(2000);
		 enter_salesInvoiceFQ.sendKeys(Keys.TAB);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
		 select1stRow_8thColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		 enter_Quantity.click();

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
		 select1stRow_11thColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		 enter_Rate.click();
		 enter_Rate.sendKeys(Keys.END);
		 enter_Rate.sendKeys(Keys.SHIFT,Keys.HOME);
		 enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 258, 5));
		 Thread.sleep(1000);
		 enter_Rate.sendKeys(Keys.TAB);
		 Thread.sleep(2000);
		 
		 enter_Gross.click();
		 Thread.sleep(1000);
		 enter_Gross.sendKeys(Keys.TAB);
		 Thread.sleep(2000);
		 
		 
		 enter_DiscountInSales.click();
		 Thread.sleep(1000);
		 enter_DiscountInSales.sendKeys(Keys.TAB);
		 Thread.sleep(2000);
		 
		 
		 String rma1 = excelReader.getCellData(xlSheetName1, 0, 0);
		 String rma2 = excelReader.getCellData(xlSheetName1, 1, 0);
		 String rma3 = excelReader.getCellData(xlSheetName1, 2, 0);
		 
		 String rmaText = rma1+"\n"+rma2+"\n"+rma3;
		 
		 //System.err.println(CreditPage.rmaText);
		 
		 //System.out.println(rmaText);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		rmaSerialNumberTxtField.sendKeys(rmaText);*/
		 
		click(serialNumSearchBtn); 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSelectAllBtn));
		 rmaSelectAllBtn.click();
		 Thread.sleep(2000);
		/*click(rma1stchekbx);
		click(rma2ndchekbx);
		click(rma3rdchekbx);*/
		 
		click(searchRMAOkBtn);
		
		
		//rmaSerialNumberTxtField.sendKeys(Keys.TAB);
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serialNumSearchBtn));
		serialNumSearchBtn.click();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxes));
		selectAllCheckboxes.click();
		Thread.sleep(2000);
		
		Thread.sleep(3000);
		searchRMAOkBtn.click();
		*/
		 Thread.sleep(2000);
		 int countRMA=rmaTableList.size();
			
		 ArrayList<String >users=new ArrayList<String>();
		 
		 for (int i = 0; i < countRMA; i++) 
		 {
			String data=rmaTableList.get(i).getText();
			users.add(data);
		}
		 
		 String actRMAList=users.toString();
		 String expRMAList= excelReader.getCellData(xlSheetName, 259, 6);
		 excelReader.setCellData(xlfile, xlSheetName, 259, 7, actRMAList);
		 
		 System.out.println(" ACt List Displayed Users  : "+actRMAList);
		 System.out.println(" Exp List Displayed Users  : "+expRMAList);
	
			Thread.sleep(2000);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		rmaOkBtn.click();
			
		Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();
		 Thread.sleep(1000);
		 
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		 newReferenceTxt.click();

		 Thread.sleep(2000);
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();

		 String expMessage = excelReader.getCellData(xlSheetName, 260, 6);
		 
		 String actMessage = checkValidationMessage(expMessage);
		 excelReader.setCellData(xlfile, xlSheetName, 260, 7, actMessage);

		 if (actRMAList.equalsIgnoreCase(expRMAList) && actMessage.startsWith(expMessage)) 
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 251, 8, resPass);
			 return true;
		 }
		 else 
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 251, 8, resFail);
			 return false;
		 }
		 
	 
	 }
	 
	 public static boolean checkCopyToClipandPasteBoardPreviouslySavedSalesVoucherWithRmaAndSaveWithSameRma() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		 previousBtn.click();


		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		 toggleBtn.click();

		
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copyToClipBoardBtn));
		 copyToClipBoardBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtnFromVoucherHome));
		 newBtnFromVoucherHome.click();
		 
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		 toggleBtn.click();

		
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pasteFromClipBoardBtn));
		 pasteFromClipBoardBtn.click();
		 
		 checkValidationMessage("Paste from clipboard completed successfully");
		 
		 Thread.sleep(3000);
		 
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	   		String actItem = select1stRow_1stColumn.getText();
	   		String expItem = "WA COGS ITEM";
		 
			String actR1Units = select1stRow_2ndColumn.getText();
	   		String expR1Units = "Pcs";


	   		String actR1fQuantity = select1stRow_5thColumn.getText();
	   		String expR1fQuantity = "3.00";

	   		String actR1Quantity = select1stRow_8thColumn.getText();
	   		String expR1Quantity = "3.00";

	   		String actRate = select1stRow_11thColumn.getText();
	   		String expRate = "10.00";
	   		
	   		String actGross = select1stRow_12thColumn.getText();
	   		String expGross = "30.00";
	   		
	   		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_13thColumn));
	   		select1stRow_13thColumn.click();
	  
	   	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_DiscountInSales));
	   	enter_DiscountInSales.click();
	   	enter_DiscountInSales.sendKeys(Keys.TAB);
		 Thread.sleep(1000);
		 
		 
		 String rma1 = excelReader.getCellData(xlSheetName, 0, 0);
		 String rma2 = excelReader.getCellData(xlSheetName, 1, 0);
		 String rma3 = excelReader.getCellData(xlSheetName, 2, 0);
		 
		 String rmaText = rma1+","+"\n"+rma2+","+"\n"+rma3;
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		rmaSerialNumberTxtField.sendKeys(rmaText);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
		rmaAddBtn.click();

			Thread.sleep(2000);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		rmaOkBtn.click();
			
		Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();
		 
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		 newReferenceTxt.click();

		 Thread.sleep(2000);
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();
		 
		 Thread.sleep(1000);
		 
		 String expMessage = "RMA should be unique.";
		 
		String actMessage = checkValidationMessage(expMessage);
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_13thColumn));
   		select1stRow_13thColumn.click();
  
   	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_DiscountInSales));
   	enter_DiscountInSales.click();
   	enter_DiscountInSales.sendKeys(Keys.TAB);
	 Thread.sleep(1000);
	 
		
	 enter_RmaDropDown.click();
	 Thread.sleep(1000);
	 rmaCancelBtn.click();
	 
	 Thread.sleep(1000);
	 
	 String rma4 = excelReader.getCellData(xlSheetName, 3, 0);
	 String rma5 = excelReader.getCellData(xlSheetName, 4, 0);
	 String rma6 = excelReader.getCellData(xlSheetName, 5, 0);
	 
	 String rmaText2 = rma4+","+"\n"+rma5+","+"\n"+rma6;
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
	rmaSerialNumberTxtField.sendKeys(rmaText2);
	Thread.sleep(2000);
	rmaSerialNumberTxtField.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serialNumSearchBtn));
	serialNumSearchBtn.click();
	Thread.sleep(1000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxes));
	selectAllCheckboxes.click();
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxes));
	selectAllCheckboxes.click();
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxes));
	selectAllCheckboxes.click();
	
	
	Thread.sleep(3000);
	searchRMAOkBtn.click();

	
		Thread.sleep(2000);
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
	rmaOkBtn.click();
		
		Thread.sleep(2000);
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
	rmaOkBtn.click();
		
	
	Thread.sleep(2000);
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
	 voucherSaveBtn.click();
	 
	 Thread.sleep(2000);
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
	 newReferenceTxt.click();

	 Thread.sleep(2000);
	 Thread.sleep(2000);

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
	 billRefPickIcon.click();

	 Thread.sleep(2000);

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
	 billRefOkBtn.click();

	 String expMessage1 = "Voucher saved successfully";
	 String actMessage1 = checkValidationMessage(expMessage1);
	 

		System.out.println("*******************************ROW1**********************************");

		System.out.println("Item       : "+actItem			+"  Value Expected  "+expItem);
		System.out.println("Fquantity            : "+actR1fQuantity				+"  Value Expected  "+expR1fQuantity);
		System.out.println("Units           : "+actR1Units				+"  Value Expected  "+expR1Units);
		System.out.println("Quantity        : "+actR1Quantity			+"  Value Expected  "+expR1Quantity);
		System.out.println("Rate            : "+actRate				+"  Value Expected  "+expRate);
		System.out.println("Gross           : "+actGross				+"  Value Expected  "+expGross);
		

		if( actItem.equalsIgnoreCase(expItem) && actR1fQuantity.equalsIgnoreCase(expR1fQuantity) && 
				
			actR1Units.equalsIgnoreCase(expR1Units) && actR1Quantity.equalsIgnoreCase(expR1Quantity) &&
			actRate.equalsIgnoreCase(expRate) && actGross.equalsIgnoreCase(expGross)
			&& actMessage.equalsIgnoreCase(expMessage) && actMessage1.startsWith(expMessage1))
		{
			Thread.sleep(2000);
			
			
			return true;
			
		}
		
		else
		{
			return false;
		}

	 
		
	 }
	 
	 
	 public static boolean checkSaveSalesInvoiceVoucherWithRmaFromNotePad() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 Thread.sleep(3000);
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		 finacinalsMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		 financialsTransactionMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		 financialTransactionSalesMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
		 salesInvoicesVoucher.click();

		 Thread.sleep(4000);

		 Thread.sleep(4000);



		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		 newBtn.click();

		 checkValidationMessage("Screen opened");

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAccountTxt));
		 salesAccountTxt.click();
		 salesAccountTxt.sendKeys( excelReader.getCellData(xlSheetName, 283, 5));
		 Thread.sleep(2000);
		 salesAccountTxt.sendKeys(Keys.TAB);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		 customerAccountTxt.click();
		 customerAccountTxt.sendKeys( excelReader.getCellData(xlSheetName, 284, 5));
		 Thread.sleep(2000);
		 customerAccountTxt.sendKeys(Keys.TAB);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		 departmentTxt.sendKeys(Keys.SPACE);

		 int departmentcount=departmentListCount.size();

		 System.err.println(departmentcount);

		 for(int i=0 ; i < departmentcount ;i++)
		 {
			 String data=departmentListCount.get(i).getText();

			 if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 285, 5)))
			 {
				 departmentListCount.get(i).click();
				 break;
			 }
		 }

		 departmentTxt.sendKeys(Keys.TAB);


		 Thread.sleep(2000);

		 wareHouseTxtinSalesInv.click();
		 wareHouseTxtinSalesInv.sendKeys( excelReader.getCellData(xlSheetName, 286, 5));
		 Thread.sleep(2000);
		 wareHouseTxtinSalesInv.sendKeys(Keys.TAB);

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		 select1stRow_1stColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		 enter_ItemTxt.click();
		 enter_ItemTxt.sendKeys( excelReader.getCellData(xlSheetName, 287, 5));
		 Thread.sleep(2000);
		 enter_ItemTxt.sendKeys(Keys.TAB);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		 select1stRow_5thColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_salesInvoiceFQ));
		 enter_salesInvoiceFQ.click();
		 enter_salesInvoiceFQ.sendKeys(Keys.END);
		 enter_salesInvoiceFQ.sendKeys(Keys.SHIFT,Keys.HOME);
		 enter_salesInvoiceFQ.sendKeys( excelReader.getCellData(xlSheetName, 288, 5));
		 Thread.sleep(2000);
		 enter_salesInvoiceFQ.sendKeys(Keys.TAB);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
		 select1stRow_8thColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		 enter_Quantity.click();

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
		 select1stRow_11thColumn.click();
		 Thread.sleep(1000);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		 enter_Rate.click();
		 enter_Rate.sendKeys(Keys.END);
		 enter_Rate.sendKeys(Keys.SHIFT,Keys.HOME);
		 enter_Rate.sendKeys( excelReader.getCellData(xlSheetName, 289, 5));
		 Thread.sleep(1000);
		 enter_Rate.sendKeys(Keys.TAB);
		 Thread.sleep(2000);
		 
		 enter_Gross.click();
		 Thread.sleep(1000);
		 enter_Gross.sendKeys(Keys.TAB);
		 Thread.sleep(2000);
		 
		 
		 enter_DiscountInSales.click();
		 Thread.sleep(1000);
		 enter_DiscountInSales.sendKeys(Keys.TAB);
		 Thread.sleep(2000);
		 

		 NotePadReader p = new NotePadReader();
		 String RmaTxt1 = p.getNotePadTxt();
		 System.err.println(RmaTxt1);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		 rmaSerialNumberTxtField.sendKeys(RmaTxt1);
		
		 Thread.sleep(2000);
		 int countRMA=rmaTableList.size();
			
		 ArrayList<String >users=new ArrayList<String>();
		 
		 for (int i = 0; i < countRMA; i++) 
		 {
			String data=rmaTableList.get(i).getText();
			users.add(data);
		}
		 
		 String actRMAList=users.toString();
		 String expRMAList=  excelReader.getCellData(xlSheetName, 290, 6);
		 excelReader.setCellData(xlfile, xlSheetName, 290, 7, actRMAList);
		 
		 System.out.println(" ACt List Displayed Users  : "+actRMAList);
		 System.out.println(" Exp List Displayed Users  : "+expRMAList);
	
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		rmaOkBtn.click();
			
		Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();
		 Thread.sleep(1000);
		 
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		 newReferenceTxt.click();

		 Thread.sleep(2000);
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();

		 String expMessage = excelReader.getCellData(xlSheetName, 291, 6);
		
		 String actMessage = checkValidationMessage(expMessage);
		 excelReader.setCellData(xlfile, xlSheetName, 291, 7, actMessage);
		 

		 if (actRMAList.equalsIgnoreCase(expRMAList) && actMessage.startsWith(expMessage)) 
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 282, 8, resPass);
			 return true;
		 }
		 else 
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 282, 8, resFail);
			 return false;
		 }
		 
	 
	 }
	 
	 
	 public static boolean checkCopyToClipandPasteBoardPreviouslySavedSalesVoucherWithRmaAndSaveWithSameRmaFromNotepad() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	 {

		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		 previousBtn.click();


		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		 toggleBtn.click();

		
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copyToClipBoardBtn));
		 copyToClipBoardBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtnFromVoucherHome));
		 newBtnFromVoucherHome.click();
		 
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		 toggleBtn.click();

		
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pasteFromClipBoardBtn));
		 pasteFromClipBoardBtn.click();
		 
		 checkValidationMessage("Paste from clipboard completed successfully");
		 
		 Thread.sleep(3000);
		 
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	   		String actItem = select1stRow_1stColumn.getText();
	   		String expItem = "WA COGS ITEM";
		 
			String actR1Units = select1stRow_2ndColumn.getText();
	   		String expR1Units = "Pcs";


	   		String actR1fQuantity = select1stRow_5thColumn.getText();
	   		String expR1fQuantity = "3.00";

	   		String actR1Quantity = select1stRow_8thColumn.getText();
	   		String expR1Quantity = "3.00";

	   		String actRate = select1stRow_11thColumn.getText();
	   		String expRate = "10.00";
	   		
	   		String actGross = select1stRow_12thColumn.getText();
	   		String expGross = "30.00";
	   		
	   		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_13thColumn));
	   		select1stRow_13thColumn.click();
	  
	   	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_DiscountInSales));
	   	enter_DiscountInSales.click();
	   	enter_DiscountInSales.sendKeys(Keys.TAB);
		 Thread.sleep(1000);
		 
		 
		 
		 NotePadReader p = new NotePadReader();
		 String RmaTxt1 = p.getNotePadTxt();
		 System.err.println(RmaTxt1);


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		 rmaSerialNumberTxtField.sendKeys(RmaTxt1);

		 rmaSerialNumberTxtField.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serialNumSearchBtn));
			serialNumSearchBtn.click();
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxes));
			selectAllCheckboxes.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxes));
			selectAllCheckboxes.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxes));
			selectAllCheckboxes.click();
			
			
			Thread.sleep(3000);
			searchRMAOkBtn.click();

			
				Thread.sleep(2000);
				
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
		rmaAddBtn.click();

			Thread.sleep(2000);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		rmaOkBtn.click();
			
		Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();
		 
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		 newReferenceTxt.click();

		 Thread.sleep(2000);
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();
		 
		 Thread.sleep(1000);
		 
		 String expMessage = "RMA should be unique.";
		 
		String actMessage = checkValidationMessage(expMessage);
		
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_13thColumn));
   		select1stRow_13thColumn.click();
  
   	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_DiscountInSales));
   	enter_DiscountInSales.click();
   	enter_DiscountInSales.sendKeys(Keys.TAB);
	 Thread.sleep(1000);
	 
		
	 enter_RmaDropDown.click();
	 Thread.sleep(1000);
	 rmaCancelBtn.click();
	 
	 Thread.sleep(1000);
	 String RmaTxt2 = p.getNotePadTxt2();
	 System.err.println(RmaTxt2);


	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
	 rmaSerialNumberTxtField.sendKeys(RmaTxt2);
	 
	 rmaSerialNumberTxtField.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serialNumSearchBtn));
		serialNumSearchBtn.click();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxes));
		selectAllCheckboxes.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxes));
		selectAllCheckboxes.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxes));
		selectAllCheckboxes.click();
		
		
		Thread.sleep(3000);
		searchRMAOkBtn.click();

		
			Thread.sleep(2000);
			


	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
	rmaAddBtn.click();*/

		Thread.sleep(2000);
		
		Thread.sleep(2000);
		 int countRMA=rmaTableList.size();
			
		 ArrayList<String >users=new ArrayList<String>();
		 
		 for (int i = 0; i < countRMA; i++) 
		 {
			String data=rmaTableList.get(i).getText();
			users.add(data);
		}
		 
		 String actRMAList=users.toString();
		 String expRMAList="[1, rma@4rma, PurVou:5, "+getCurrentDateF2()+", , , 2, rma@5rma, PurVou:5, "+getCurrentDateF2()+", , , 3, rma@6rma, PurVou:5, "+getCurrentDateF2()+", , ]";
		 
		 System.out.println(" ACt List Displayed Users  : "+actRMAList);
		 System.out.println(" Exp List Displayed Users  : "+expRMAList);
	
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
	rmaOkBtn.click();
		
	
	Thread.sleep(2000);
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
	 voucherSaveBtn.click();
	 
	 Thread.sleep(2000);
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
	 newReferenceTxt.click();

	 Thread.sleep(2000);
	 Thread.sleep(2000);

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
	 billRefPickIcon.click();

	 Thread.sleep(2000);

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
	 billRefOkBtn.click();

	 String expMessage1 = "Voucher saved successfully";
	 String actMessage1 = checkValidationMessage(expMessage1);
	 

		System.out.println("*******************************ROW1**********************************");

		System.out.println("Item       : "+actItem			+"  Value Expected  "+expItem);
		System.out.println("Fquantity            : "+actR1fQuantity				+"  Value Expected  "+expR1fQuantity);
		System.out.println("Units           : "+actR1Units				+"  Value Expected  "+expR1Units);
		System.out.println("Quantity        : "+actR1Quantity			+"  Value Expected  "+expR1Quantity);
		System.out.println("Rate            : "+actRate				+"  Value Expected  "+expRate);
		System.out.println("Gross           : "+actGross				+"  Value Expected  "+expGross);
		

		if( actItem.equalsIgnoreCase(expItem) && actR1fQuantity.equalsIgnoreCase(expR1fQuantity) && 
				
			actR1Units.equalsIgnoreCase(expR1Units) && actR1Quantity.equalsIgnoreCase(expR1Quantity) &&
			actRate.equalsIgnoreCase(expRate) && actGross.equalsIgnoreCase(expGross)
			&& actMessage.equalsIgnoreCase(expMessage) &&actRMAList.equalsIgnoreCase(expRMAList) && actMessage1.startsWith(expMessage1))
		{
			Thread.sleep(2000);
			
			
			return true;
			
		}
		
		else
		{
			return false;
		}

	 
		
	 
	 }
	 @FindBy(xpath="//*[@id='135']")
	 private static WebElement InventoryMenu;
	 
	 @FindBy(xpath="//*[@id='137']")
	 private static WebElement InventoryTransactionsMenu;
	 
	 @FindBy(xpath="//*[@id='140']")
	 private static WebElement InventoryTranSalesMenu;
	 
	 @FindBy(xpath="//*[@id='2017']")
	 private static WebElement InventoryTransSalesOrder;
	 
	 @FindBy(xpath="//*[@id='btnCustomize']")
	 private static WebElement salesOredrCustomizeVoucherBtn;
	 
	
	 
	 @FindBy(xpath="//*[@id='id_Trans_spanPlus']")
		public static WebElement ledgerTransactionExpandBtn;
	 
	 @FindBy(xpath="//*[@id='rd_customization_tree1']/span/span/i")
	 private static WebElement TransactionFieldsExpandBtn;
	 
		@FindBy(xpath="//*[@id='rd_customization_tree1']/ul/li")
		public static List<WebElement> TransactionsFieldsList;
		
		@FindBy(xpath="//table[@id='id_rc_columnheadertable']//tr//th//p")
		public static List<WebElement> TableHeaderList;
		
		@FindBy(xpath="//*[@id='Save']//i")
		public static WebElement saveBtnInVoucherCustmztn;
		

		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[2]")
		private static WebElement  select2ndRow_1stColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[3]")
		private static WebElement  select2ndRow_2ndColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[4]")
		private static WebElement  select2ndRow_3rdColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[5]")
		private static WebElement  select2ndRow_4thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[6]")
		private static WebElement  select2ndRow_5thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[7]")
		private static WebElement  select2ndRow_6thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[8]")
		private static WebElement  select2ndRow_7thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[9]")
		private static WebElement  select2ndRow_8thColumn;
		
		
		public static boolean checkSavePurchaseVoucherWithRMANumbersFromExcelAfterEraseAll() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			 Thread.sleep(3000);
				
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
			 finacinalsMenu.click();

			 Thread.sleep(2000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			 financialsTransactionMenu.click();

			 Thread.sleep(2000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			 financialsTransactionsPurchaseMenu.click();

			 Thread.sleep(2000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesVoucher));
			 purchasesVoucher.click();

			 Thread.sleep(4000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			 newBtn.click();

			 checkValidationMessage("Screen opened");
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			 purchaseAccountTxt.click();
			 purchaseAccountTxt.sendKeys(excelReader.getCellData(xlSheetName, 293, 5));
			 Thread.sleep(2000);
			 purchaseAccountTxt.sendKeys(Keys.TAB);
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			 customerAccountTxt.click();
			 customerAccountTxt.sendKeys(excelReader.getCellData(xlSheetName, 294, 5));
			 Thread.sleep(2000);
			 customerAccountTxt.sendKeys(Keys.TAB);
			 
			 Thread.sleep(1000);
			 
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			 departmentTxt.sendKeys(Keys.SPACE);

			 int departmentcount=departmentListCount.size();

			 System.err.println(departmentcount);

			 for(int i=0 ; i < departmentcount ;i++)
			 {
				 String data=departmentListCount.get(i).getText();

				 if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 295, 5)))
				 {
					 departmentListCount.get(i).click();
					 break;
				 }
			 }

			 departmentTxt.sendKeys(Keys.TAB);
			 

			 Thread.sleep(2000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			 select1stRow_1stColumn.click();
			 Thread.sleep(1000);


			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxtInPR));
			 warehouseTxtInPR.click();
			 warehouseTxtInPR.sendKeys(excelReader.getCellData(xlSheetName, 296, 5));
			 Thread.sleep(2000);
			 warehouseTxtInPR.sendKeys(Keys.TAB);


			 enter_ItemTxt.sendKeys(excelReader.getCellData(xlSheetName, 297, 5));
			 Thread.sleep(2000);
			 enter_ItemTxt.sendKeys(Keys.TAB);

			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			 select1stRow_5thColumn.click();
			 Thread.sleep(1000);


			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			 enter_Quantity.click();
			 enter_Quantity.sendKeys(Keys.END);
			 enter_Quantity.sendKeys(Keys.SHIFT,Keys.HOME);
			 enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 298, 5));
			 Thread.sleep(2000);
			 enter_Quantity.sendKeys(Keys.TAB);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			 enter_Rate.click();
			 enter_Rate.sendKeys(Keys.END);
			 enter_Rate.sendKeys(Keys.SHIFT,Keys.HOME);
			 enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 299, 5));
			 Thread.sleep(1000);
			 enter_Rate.sendKeys(Keys.TAB);
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			 enter_Gross.click();
			 enter_Gross.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
			 enter_Discount.click();
			 enter_Discount.sendKeys(Keys.TAB);
			 Thread.sleep(1000);
			 
			 String rma1 = excelReader.getCellData(xlSheetName1, 0, 0);
			 String rma2 = excelReader.getCellData(xlSheetName1, 1, 0);
			 String rma3 = excelReader.getCellData(xlSheetName1, 2, 0);
			 
			 String rmaText = rma1+","+"\n"+rma2+","+"\n"+rma3;
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
			rmaSerialNumberTxtField.sendKeys(rmaText);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
			rmaAddBtn.click();

				Thread.sleep(2000);
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
			rmaOkBtn.click();
				
			Thread.sleep(2000);
			
			
			 Thread.sleep(2000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
			 select2ndRow_1stColumn.click();
			 Thread.sleep(1000);


			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxtInPR));
			 warehouseTxtInPR.click();
			 warehouseTxtInPR.sendKeys(Keys.END);
			 warehouseTxtInPR.sendKeys(Keys.SHIFT,Keys.HOME);
			 warehouseTxtInPR.sendKeys(excelReader.getCellData(xlSheetName, 300, 5));
			 Thread.sleep(2000);
			 warehouseTxtInPR.sendKeys(Keys.TAB);


			 enter_ItemTxt.sendKeys(excelReader.getCellData(xlSheetName, 301, 5));
			 Thread.sleep(2000);
			 enter_ItemTxt.sendKeys(Keys.TAB);

			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_5thColumn));
			 select2ndRow_5thColumn.click();
			 Thread.sleep(1000);


			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			 enter_Quantity.click();
			 enter_Quantity.sendKeys(Keys.END);
			 enter_Quantity.sendKeys(Keys.SHIFT,Keys.HOME);
			 enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 302, 5));
			 Thread.sleep(2000);
			 enter_Quantity.sendKeys(Keys.TAB);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			 enter_Rate.click();
			 enter_Rate.sendKeys(Keys.END);
			 enter_Rate.sendKeys(Keys.SHIFT,Keys.HOME);
			 enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 303, 5));
			 Thread.sleep(1000);
			 enter_Rate.sendKeys(Keys.TAB);
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			 enter_Gross.click();
			 enter_Gross.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
			 enter_Discount.click();
			 enter_Discount.sendKeys(Keys.TAB);
			 Thread.sleep(1000);
			 
			 Thread.sleep(1000);
			 
			 String rma4 = excelReader.getCellData(xlSheetName1, 3, 0);
			 String rma5 = excelReader.getCellData(xlSheetName1, 4, 0);
			 String rma6 = excelReader.getCellData(xlSheetName1, 5, 0);
			 
			 String rmaText2 = rma4+","+"\n"+rma5+","+"\n"+rma6;
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
			rmaSerialNumberTxtField.sendKeys(rmaText2);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
			rmaAddBtn.click();

				Thread.sleep(2000);
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
			rmaOkBtn.click();
				
			
			Thread.sleep(2000);
			 
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
			 voucherSaveBtn.click();
			 
			 Thread.sleep(2000);
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
			 newReferenceTxt.click();

			 Thread.sleep(2000);
			 Thread.sleep(2000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			 billRefPickIcon.click();

			 Thread.sleep(2000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			 billRefOkBtn.click();

			 String expMessage = excelReader.getCellData(xlSheetName, 304, 6);
			 String actMessage = checkValidationMessage(expMessage);
			 excelReader.setCellData(xlfile, xlSheetName, 304, 7, actMessage);

			 
			 if (actMessage.startsWith(expMessage)) 
			 {
				 excelReader.setCellData(xlfile, xlSheetName, 292, 8, resPass);
				 return true;
			}
			 else 
			 {
				 excelReader.setCellData(xlfile, xlSheetName, 292, 8, resFail);
				 return false;
			}

		 
		 
		}
		
		@FindBy(xpath="//*[@id='panelsStayOpen-headingOne']")
		public static WebElement homePanelExpBtn;
		
	 
	 
	 public static boolean checkAddingQuantityAndNetFromTransactionFieldsInSalesOrderVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 Thread.sleep(3000);
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InventoryMenu));
		 InventoryMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InventoryTransactionsMenu));
		 InventoryTransactionsMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InventoryTranSalesMenu));
		 InventoryTranSalesMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InventoryTransSalesOrder));
		 InventoryTransSalesOrder.click();

		 Thread.sleep(1000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePanelExpBtn));
		 homePanelExpBtn.click();
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOredrCustomizeVoucherBtn));
		 salesOredrCustomizeVoucherBtn.click();
		 Thread.sleep(1000);
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledgerTransactionExpandBtn));
		 ledgerTransactionExpandBtn.click();
		 Thread.sleep(1000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(TransactionFieldsExpandBtn));
		 TransactionFieldsExpandBtn.click();
		 Thread.sleep(1000);
		 
		int count = TransactionsFieldsList.size();
		 ArrayList<String> transFieldsList = new ArrayList<String>();
		 for(int i = 0 ; i < count ; i ++)
		 {
			  String data = TransactionsFieldsList.get(i).getText();
			  
			  if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 306, 5)))
			  {
				  getAction().doubleClick(TransactionsFieldsList.get(i)).build().perform();
			  }
			  
			  Thread.sleep(2000);
			  if (data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 307, 5))) 
			  {
				  getAction().doubleClick(TransactionsFieldsList.get(i)).build().perform();
			  }
			  
			  
		 }
		 
		 
		 int count2 = TableHeaderList.size();
		 ArrayList<String> headerList = new ArrayList<String>();
		 for(int i = 0 ; i < count2 ; i ++)
		 {
			  String data = TableHeaderList.get(i).getText().trim();
			  
	
			  headerList.add(data);
		 }
		 
		 String actHeaderListValues = headerList.toString();
		 String expHeaderListValues = excelReader.getCellData(xlSheetName, 308, 6);
		 excelReader.setCellData(xlfile, xlSheetName, 308, 7, actHeaderListValues);
		 
		 Thread.sleep(2000);
		 saveBtnInVoucherCustmztn.click();
		 
		 String expMessage = excelReader.getCellData(xlSheetName, 309, 6);
		 String actMessage = checkValidationMessage(expMessage);
		 excelReader.setCellData(xlfile, xlSheetName, 309, 7, actMessage);
		 
		 System.out.println("actHeaderListValues: "+actHeaderListValues);
		 System.out.println("expHeaderListValues: "+expHeaderListValues);
		 
		 if (actMessage.equalsIgnoreCase(expMessage) && actHeaderListValues.equalsIgnoreCase(expHeaderListValues))
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 305, 8, resPass);
			return true;
		}
		 else 
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 305, 8, resFail);
			 return false;
		}
		  
	 }
	 
	 @FindBy(xpath="//*[@id='id_body_33554460']")
	 private static WebElement so_enter_AQTxt;
	 
	 @FindBy(xpath="//*[@id='id_body_33554461']")
	 private static WebElement so_enter_FQTxt;
	 
	 @FindBy(xpath="//tbody[@id='Id_RMAReservation_FGrid_body']/tr/td[5]/input")
		private static List<WebElement> RmaSelectedList;

		@FindBy(xpath="//*[@id='Id_RMAReservation_FGrid_body']/tr/td[4]")
		private static List<WebElement> ReservePopUpRmaNoList; 

		@FindBy(xpath="//*[@id='Id_RMAReservation_FGrid_body']/tr/td[5]/input")
		private static List<WebElement> ReservePopUpRmaNoChkBox; 
		
	//	@FindBy(xpath="//div[@class='col-sm-12 footer_button_image']//span[@class='icon-ok icon-font6']")
		@FindBy(xpath="//*[@id='id_Reservation_Modal_SalesOrder']//ul[4]/li[3]/div/div[2]")
		private static WebElement res_OkBtn;


	 
	 public static boolean checkSaveSalesOrderVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 Thread.sleep(3000);
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());

			
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InventoryMenu));
		 InventoryMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InventoryTransactionsMenu));
		 InventoryTransactionsMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InventoryTranSalesMenu));
		 InventoryTranSalesMenu.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InventoryTransSalesOrder));
		 InventoryTransSalesOrder.click();

		 Thread.sleep(1000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		 newBtn.click();
		 Thread.sleep(1000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.click();
			customerAccountTxt.sendKeys(Keys.SPACE);

			int customercount=customerAccountListCount.size();

			System.err.println(customercount);

			for(int i=0 ; i < customercount ;i++)
			{
				String data=customerAccountListCount.get(i).getText();

				if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 311, 5)))
				{
					customerAccountListCount.get(i).click();
					break;
				}
			}

			customerAccountTxt.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();


			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxtInPR));
			 warehouseTxtInPR.click();
			 warehouseTxtInPR.sendKeys(excelReader.getCellData(xlSheetName, 312, 5));
			 Thread.sleep(2000);
			 warehouseTxtInPR.sendKeys(Keys.TAB);


			 enter_ItemTxt.sendKeys(excelReader.getCellData(xlSheetName, 313, 5));
			 Thread.sleep(2000);
			 enter_ItemTxt.sendKeys(Keys.TAB);


		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(so_enter_AQTxt));
			so_enter_AQTxt.sendKeys(excelReader.getCellData(xlSheetName, 314, 5));
			so_enter_AQTxt.sendKeys(Keys.TAB);


			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(so_enter_FQTxt));
			so_enter_FQTxt.sendKeys(excelReader.getCellData(xlSheetName, 315, 5));
			so_enter_FQTxt.sendKeys(Keys.TAB);
			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			String actQtyInVoucher	=enter_Quantity.getAttribute("value");
			String expQtyInVoucher	= excelReader.getCellData(xlSheetName, 316, 6);
			excelReader.setCellData(xlfile, xlSheetName, 316, 7, actQtyInVoucher);

			enter_Quantity.sendKeys(Keys.TAB);

			System.out.println("Qty Preload is displaying as Value In Sales Order Vouche  : "+actQtyInVoucher  +" Value Expected : "+expQtyInVoucher);
			Thread.sleep(1000);

			boolean actSelected = false;

			int RmaSelectedListCount = RmaSelectedList.size();

			for(int i=0;i<RmaSelectedListCount;i++)
			{
				actSelected = RmaSelectedList.get(i).isSelected();
			}

			boolean expSelected = false;

			System.out.println("actSelected : "+actSelected);
			System.out.println("expSelected : "+expSelected);

			int ReservePopUpRmaNoListCount = ReservePopUpRmaNoList.size();

			for(int i=0;i<ReservePopUpRmaNoListCount;i++)
			{
				String data = ReservePopUpRmaNoList.get(i).getText();
				System.err.println("DATA :"+data);

				if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 317, 5)) 
						|| data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 318, 5)) || data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 319, 5)) 
						|| data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 320, 5)) 
						|| data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 321, 5)) || data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 322, 5)) )
				{
					ReservePopUpRmaNoChkBox.get(i).click();
				}
			}


			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(res_OkBtn));
			res_OkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));

			String actReserveColumn	=select1stRow_8thColumn.getText();
			String expReserveColumn	= excelReader.getCellData(xlSheetName, 323, 6);
			excelReader.setCellData(xlfile, xlSheetName, 323, 7, actReserveColumn);

			System.out.println("Reservation Column  : "+actReserveColumn+"  Value Expected  "+expReserveColumn);


			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.click();
			enter_Rate.clear();
			enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 324, 5));
			enter_Rate.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);

		

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			String docno=documentNumberTxt.getAttribute("value");

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
			voucherSaveBtn.click();

			 String expMessage = excelReader.getCellData(xlSheetName, 325, 6);
			 String actMessage = checkValidationMessage(expMessage);
			 excelReader.setCellData(xlfile, xlSheetName, 325, 7, actMessage);


			System.out.println("Actual Message    : "+actMessage);
			System.out.println("Expected Message  : "+expMessage);

			if (actQtyInVoucher.equalsIgnoreCase(expQtyInVoucher)
					&& actSelected==expSelected && actReserveColumn.equalsIgnoreCase(expReserveColumn) 
					&& actMessage.startsWith(expMessage)) 
			{
				 excelReader.setCellData(xlfile, xlSheetName, 310, 8, resPass);
				return true;
			} 
			else 
			{
				 excelReader.setCellData(xlfile, xlSheetName, 310, 8, resFail);
				return false;
			}
		}
	 
	 @FindBy(xpath="//*[@id='id_transactionentry_footer_panel_summary_value_net']/span[2]")
	 private static WebElement VoucherNetValue;
	 
	 @FindBy(xpath="//*[@id='id_transactionentry_close']")
	 private static WebElement VoucherCloseBtn;
	 
	 @FindBy(xpath="//tbody[@id='tblBodyTransRender']//tr[1]/td[15]")
	 private static WebElement VoucherQuantityInVHome;
	 
	 @FindBy(xpath="//tbody[@id='tblBodyTransRender']//tr[2]/td[15]")
	 private static WebElement VoucherQuantityInVHomeTotal;
	 
	 @FindBy(xpath="//tbody[@id='tblBodyTransRender']//tr[1]/td[16]")
	 private static WebElement VoucherNetInVHome;
	 
	 @FindBy(xpath="//tbody[@id='tblBodyTransRender']//tr[2]/td[16]")
	 private static WebElement VoucherNetInVHomeTotal;
	 
	 	public static boolean checkValidateQuantityAndNetValuesInTheSalesOrderVoucherHomePage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 	{	
	 		Thread.sleep(2000);
	 		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
	 		previousBtn.click();
	 		
	 		Thread.sleep(3000);
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
	 		//select1stRow_7thColumn.click();
			String actQtyInVoucher	=select1stRow_7thColumn.getText();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VoucherNetValue));
			String actVoucherNet	=VoucherNetValue.getText();
			
			Thread.sleep(2000);
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VoucherCloseBtn));
	 		VoucherCloseBtn.click();
	 		
	 		Thread.sleep(3000);
	 		
	 		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	 		jse.executeScript("arguments[0].scrollIntoView(true);", VoucherNetInVHomeTotal);
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VoucherQuantityInVHome));
			String actQtyInVoucherHome	=VoucherQuantityInVHome.getText();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VoucherNetInVHome));
			String actVoucherNetInVHome	=VoucherNetInVHome.getText();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VoucherQuantityInVHomeTotal));
			String actVoucherQuantityInVHomeTotal	=VoucherQuantityInVHomeTotal.getText();
			String expVoucherQuantityInVHomeTotal	= excelReader.getCellData(xlSheetName, 327, 6);
            
			excelReader.setCellData(xlfile, xlSheetName, 327, 7, actVoucherQuantityInVHomeTotal);

	 		
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VoucherNetInVHomeTotal));
			String actVoucherNetInVHomeTotal	=VoucherNetInVHomeTotal.getText();
			String expVoucherNetInVHomeTotal	= excelReader.getCellData(xlSheetName, 328, 6);
            
			excelReader.setCellData(xlfile, xlSheetName, 328, 7, actVoucherNetInVHomeTotal);
			
			
			System.out.println("actQtyInVoucher: "+actQtyInVoucher  +"ValueExpected : "+actQtyInVoucherHome);
			System.out.println("actVoucherNet: "+actVoucherNet  +"ValueExpected : "+actVoucherNetInVHome);
			System.out.println("actVoucherQuantityInVHomeTotal: "+actVoucherQuantityInVHomeTotal  +"ValueExpected : "+expVoucherQuantityInVHomeTotal);
			System.out.println("actVoucherNetInVHomeTotal: "+actVoucherNetInVHomeTotal  +"ValueExpected : "+expVoucherNetInVHomeTotal);
			
			if (actQtyInVoucher.equalsIgnoreCase(actQtyInVoucherHome) && actVoucherNet.equalsIgnoreCase(actVoucherNetInVHome) && 
					actVoucherQuantityInVHomeTotal.equalsIgnoreCase(expVoucherQuantityInVHomeTotal) &&
					actVoucherNetInVHomeTotal.equalsIgnoreCase(expVoucherNetInVHomeTotal)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 326, 8, resPass);
				return true;
			}
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 326, 8, resFail);
				return false;
			}
	 	}
	 	
	 	@FindBy(xpath="//span[text()='Sales invoice VAT']")
	 	private static WebElement salesInvoiceVAT;
	 	
	 	@FindBy(xpath="//*[text()='Pending Sales Orders']")
	 	private static WebElement pendingSalesOrderLink;
	 	

		@FindBy (xpath="//tbody[@id='tblBodyTransRender']/tr/td[2]/input")
		private static List<WebElement> grid_CheckBoxList;
		
		@FindBy (xpath="//tbody[@id='tblBodyTransRender']/tr/td[5]")
		private static List<WebElement> grid_VoucherNoList;
		
		@FindBy (xpath="//*[@id='id_transaction_homescreen_convert']")
		private static WebElement convrtBtn;
		
		
		
		@FindBy (xpath="//*[@id='id_header_268435459']")
		private static WebElement departmentTxtInSalesInv;
		
		@FindBy (xpath="//*[@id='id_header_268435470']")
		private static WebElement PlaceOfSupplyInSalesInv;
		
		@FindBy (xpath="//*[@id='id_header_268435471']")
		private static WebElement JurisdictionInSalesInv;
		
		@FindBy (xpath="//*[@id='id_body_33554511']")
		private static WebElement enter_AQ;
		
		@FindBy (xpath="//*[@id='id_body_33554512']")
		private static WebElement enter_FQ;
		
		@FindBy (xpath="//*[@id='id_body_38']")
		private static WebElement enter_RMA;
		
		
		@FindBy (xpath="//*[@id='id_body_33554530']")
		private static WebElement enter_taxable;
		
		
		
		@FindBy (xpath="//*[@id='RMA_Table_body']/tr/td[2]")
		private static List<WebElement> rmaTableList;
		
		
		
	 	public static boolean checkSaveSalesInvoiceVatVoucherByConsumingPartialQuantity() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 	{
	 		Thread.sleep(3000);
	 		excelReader=new ExcelReader(POJOUtility.getExcelPath());

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
			 finacinalsMenu.click();

			 Thread.sleep(2000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			 financialsTransactionMenu.click();

			 Thread.sleep(2000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
			 financialTransactionSalesMenu.click();

			 Thread.sleep(2000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVAT));
			 salesInvoiceVAT.click();

			 Thread.sleep(2000);
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePanelExpBtn));
			 homePanelExpBtn.click();
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingSalesOrderLink));
			 pendingSalesOrderLink.click();
			 
			 int count = grid_VoucherNoList.size();
             
             for (int i = 0; i < count; i++) 
             {
                 String VoucherNo = grid_VoucherNoList.get(i).getText();
                 
                 if (VoucherNo.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 330, 5))) 
                 {
                 	if (grid_CheckBoxList.get(i).isSelected()==false) 
                 	{
                 		grid_CheckBoxList.get(i).click();
                         break;
						}
                 }
             }      
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convrtBtn));
				convrtBtn.click();
				
				Thread.sleep(1000);
				
				checkValidationMessage("Link data loaded");
				
				departmentTxtInSalesInv.click();
				departmentTxtInSalesInv.sendKeys(excelReader.getCellData(xlSheetName, 331, 5));
				Thread.sleep(2000);
				departmentTxtInSalesInv.sendKeys(Keys.TAB);
				
				PlaceOfSupplyInSalesInv.click();
				PlaceOfSupplyInSalesInv.sendKeys(excelReader.getCellData(xlSheetName, 332, 5));
				Thread.sleep(2000);
				PlaceOfSupplyInSalesInv.sendKeys(Keys.TAB);
				
				JurisdictionInSalesInv.click();
				JurisdictionInSalesInv.sendKeys(Keys.END);
				JurisdictionInSalesInv.sendKeys(Keys.SHIFT,Keys.HOME);
				JurisdictionInSalesInv.sendKeys(excelReader.getCellData(xlSheetName, 333, 5));
				Thread.sleep(2000);
				JurisdictionInSalesInv.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
				select1stRow_1stColumn.click();
				warehouseTxtInPR.sendKeys(Keys.TAB);
				
				enter_ItemTxt.click();
				enter_ItemTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_9thColumn));
				select1stRow_9thColumn.click();
				
				enter_FQ.sendKeys(Keys.END);
				enter_FQ.sendKeys(Keys.SHIFT,Keys.HOME);
				Thread.sleep(1000);
				
				enter_FQ.sendKeys(excelReader.getCellData(xlSheetName, 334, 5));
				enter_FQ.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
				String actQty = select1stRow_11thColumn.getText();
				String expQty = excelReader.getCellData(xlSheetName, 335, 6);
				excelReader.setCellData(xlfile, xlSheetName, 335, 7, actQty);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_18thColumn));
				select1stRow_18thColumn.click();
				
				enter_taxable.click();
				enter_taxable.sendKeys(Keys.TAB);
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
				enter_RMA.sendKeys(Keys.SPACE);	
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serialNumSearchBtn));
				serialNumSearchBtn.click();
				Thread.sleep(1000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxes));
				selectAllCheckboxes.click();
				
				Thread.sleep(1000);
				
				searchRMAOkBtn.click();
				
				Thread.sleep(3000);
				
				int countRMA=rmaTableList.size();
				
				 ArrayList<String >users=new ArrayList<String>();
				 
				 for (int i = 0; i < countRMA; i++) 
				 {
					String data=rmaTableList.get(i).getText();
					users.add(data);
				}
				 
				 String actRMAList=users.toString();
				 String expRMAList= excelReader.getCellData(xlSheetName, 336, 6);
					excelReader.setCellData(xlfile, xlSheetName, 336, 7, actRMAList);
				 
				 System.out.println(" ACt List Displayed Users  : "+actRMAList);
				 System.out.println(" Exp List Displayed Users  : "+expRMAList);
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
				rmaOkBtn.click();
				

				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
				 voucherSaveBtn.click();
				 Thread.sleep(1000);
				 
				 Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
				 newReferenceTxt.click();

				 Thread.sleep(2000);
				 Thread.sleep(2000);

				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
				 billRefPickIcon.click();

				 Thread.sleep(2000);

				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
				 billRefOkBtn.click();

				 String expMessage =  excelReader.getCellData(xlSheetName, 337, 6);
				 String actMessage = checkValidationMessage(expMessage);
				 excelReader.setCellData(xlfile, xlSheetName, 337, 7, actMessage);
				 

				 if (actRMAList.equalsIgnoreCase(expRMAList)&&actMessage.startsWith(expMessage)) 
				 {
					 excelReader.setCellData(xlfile, xlSheetName, 329, 8, resPass);
					 return true;
				 }
				 else 
				 {
					 excelReader.setCellData(xlfile, xlSheetName, 329, 8, resFail);
					 return false;
				 }
				 
	 	}
	 	
	 	public static boolean checkSaveSalesOrderWithPartialQntyConsumptionFromPVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 	{

			 Thread.sleep(3000);
			 excelReader=new ExcelReader(POJOUtility.getExcelPath());

				
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InventoryMenu));
			 InventoryMenu.click();

			 Thread.sleep(2000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InventoryTransactionsMenu));
			 InventoryTransactionsMenu.click();

			 Thread.sleep(2000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InventoryTranSalesMenu));
			 InventoryTranSalesMenu.click();

			 Thread.sleep(2000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InventoryTransSalesOrder));
			 InventoryTransSalesOrder.click();

			 Thread.sleep(1000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			 newBtn.click();
			 Thread.sleep(1000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
				customerAccountTxt.click();
				customerAccountTxt.sendKeys(Keys.SPACE);

				int customercount=customerAccountListCount.size();

				System.err.println(customercount);

				for(int i=0 ; i < customercount ;i++)
				{
					String data=customerAccountListCount.get(i).getText();

					if(data.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 339, 5)))
					{
						customerAccountListCount.get(i).click();
						break;
					}
				}

				customerAccountTxt.sendKeys(Keys.TAB);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
				select1stRow_1stColumn.click();


				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxtInPR));
				 warehouseTxtInPR.click();
				 warehouseTxtInPR.sendKeys( excelReader.getCellData(xlSheetName, 340, 5));
				 Thread.sleep(2000);
				 warehouseTxtInPR.sendKeys(Keys.TAB);


				 enter_ItemTxt.sendKeys( excelReader.getCellData(xlSheetName, 341, 5));
				 Thread.sleep(2000);
				 enter_ItemTxt.sendKeys(Keys.TAB);


			
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
				select1stRow_5thColumn.click();

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(so_enter_AQTxt));
				so_enter_AQTxt.sendKeys( excelReader.getCellData(xlSheetName, 342, 5));
				so_enter_AQTxt.sendKeys(Keys.TAB);


				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(so_enter_FQTxt));
				so_enter_FQTxt.sendKeys( excelReader.getCellData(xlSheetName, 343, 5));
				so_enter_FQTxt.sendKeys(Keys.TAB);
				

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
				String actQtyInVoucher	=enter_Quantity.getAttribute("value");
				String expQtyInVoucher	=  excelReader.getCellData(xlSheetName, 344, 6);
				excelReader.setCellData(xlfile, xlSheetName, 355, 7, actQtyInVoucher);
				enter_Quantity.sendKeys(Keys.TAB);

				System.out.println("Qty Preload is displaying as Value In Sales Order Vouche  : "+actQtyInVoucher  +" Value Expected : "+expQtyInVoucher);
				Thread.sleep(1000);

				boolean actSelected = false;

				int RmaSelectedListCount = RmaSelectedList.size();

				for(int i=0;i<RmaSelectedListCount;i++)
				{
					actSelected = RmaSelectedList.get(i).isSelected();
				}

				boolean expSelected = false;

				System.out.println("actSelected : "+actSelected);
				System.out.println("expSelected : "+expSelected);

				int ReservePopUpRmaNoListCount = ReservePopUpRmaNoList.size();

				for(int i=0;i<ReservePopUpRmaNoListCount;i++)
				{
					String data = ReservePopUpRmaNoList.get(i).getText();
					System.err.println("DATA :"+data);

					if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 345, 5)) 
							|| data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 346, 5)) 
							|| data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 347, 5)) || data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 348, 5)) 
							)
					{
						ReservePopUpRmaNoChkBox.get(i).click();
					}
				}


				Thread.sleep(2000);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(res_OkBtn));
				res_OkBtn.click();
				

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));

				String actReserveColumn	=select1stRow_8thColumn.getText();
				String expReserveColumn	= excelReader.getCellData(xlSheetName, 349, 6);
                
				excelReader.setCellData(xlfile, xlSheetName, 349, 7, actReserveColumn);


				System.out.println("Reservation Column  : "+actReserveColumn+"  Value Expected  "+expReserveColumn);


				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.click();
				enter_Rate.clear();
				enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 350, 5));
				enter_Rate.sendKeys(Keys.TAB);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);


				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
				String docno=documentNumberTxt.getAttribute("value");

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
				voucherSaveBtn.click();

				 String expMessage = excelReader.getCellData(xlSheetName, 351, 6);
				 String actMessage = checkValidationMessage(expMessage);
				 excelReader.setCellData(xlfile, xlSheetName, 351, 7, actMessage);

				System.out.println("Actual Message    : "+actMessage);
				System.out.println("Expected Message  : "+expMessage);

				if (actQtyInVoucher.equalsIgnoreCase(expQtyInVoucher)
						&& actSelected==expSelected && actReserveColumn.equalsIgnoreCase(expReserveColumn) 
						&& actMessage.startsWith(expMessage)) 
				{
					excelReader.setCellData(xlfile, xlSheetName, 338, 8, resPass);
					return true;
				} 
				else 
				{
					excelReader.setCellData(xlfile, xlSheetName, 338, 8, resFail);
					return false;
				}
	 	}
	 	
	 	public static boolean checkSalesOrderVoucherHomeandValidateQtyAndNetValues() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 	{
	 		Thread.sleep(2000);
	 		excelReader=new ExcelReader(POJOUtility.getExcelPath());

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
	 		previousBtn.click();
	 		
	 		Thread.sleep(3000);
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
	 		//select1stRow_7thColumn.click();
			String actQtyInVoucher	=select1stRow_7thColumn.getText();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VoucherNetValue));
			String actVoucherNet	=VoucherNetValue.getText();
			
			Thread.sleep(2000);
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VoucherCloseBtn));
	 		VoucherCloseBtn.click();
	 		
	 		Thread.sleep(3000);
	 		
	 		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	 		jse.executeScript("arguments[0].scrollIntoView(true);", VoucherNetInVHomeTotal);
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VoucherQuantityInVHome));
			String actQtyInVoucherHome	=VoucherQuantityInVHome.getText();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VoucherNetInVHome));
			String actVoucherNetInVHome	=VoucherNetInVHome.getText();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VoucherQuantityInVHomeTotal));
			String actVoucherQuantityInVHomeTotal	=VoucherQuantityInVHomeTotal.getText();
			String expVoucherQuantityInVHomeTotal	= excelReader.getCellData(xlSheetName, 353, 6);
			excelReader.setCellData(xlfile, xlSheetName, 353, 7, actVoucherQuantityInVHomeTotal);
	 		
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VoucherNetInVHomeTotal));
			String actVoucherNetInVHomeTotal	=VoucherNetInVHomeTotal.getText();
			String expVoucherNetInVHomeTotal	= excelReader.getCellData(xlSheetName, 354, 6);
			excelReader.setCellData(xlfile, xlSheetName, 354, 7, actVoucherNetInVHomeTotal);
			
			
			System.out.println("actQtyInVoucher: "+actQtyInVoucher  +"ValueExpected : "+actQtyInVoucherHome);
			System.out.println("actVoucherNet: "+actVoucherNet  +"ValueExpected : "+actVoucherNetInVHome);
			System.out.println("actVoucherQuantityInVHomeTotal: "+actVoucherQuantityInVHomeTotal  +"ValueExpected : "+expVoucherQuantityInVHomeTotal);
			System.out.println("actVoucherNetInVHomeTotal: "+actVoucherNetInVHomeTotal  +"ValueExpected : "+expVoucherNetInVHomeTotal);
			
			if (actQtyInVoucher.equalsIgnoreCase(actQtyInVoucherHome) && actVoucherNet.equalsIgnoreCase(actVoucherNetInVHome) && 
					actVoucherQuantityInVHomeTotal.equalsIgnoreCase(expVoucherQuantityInVHomeTotal) &&
					actVoucherNetInVHomeTotal.equalsIgnoreCase(expVoucherNetInVHomeTotal)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 352, 8, resPass);
				return true;
			}
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 352, 8, resFail);
				return false;
			}
	 	}
	 	//@FindBy(xpath="//*[@id='btnSearch']")
	 	@FindBy(xpath="//*[@id='sp_search']")
	 	private static WebElement serialNumSearchBtn;
	 	
	 	@FindBy(xpath="//*[@id='chkSelectALL']")
	 	private static WebElement selectAllCheckboxes;
	 	
	 //	@FindBy(xpath="//*[@id='SearchModal_Content']/div[3]/div/div[1]/label")
	 	@FindBy(xpath="(//*[@id='div_OK'])[2]")
	 	private static WebElement searchRMAOkBtn;
	 	
	 	
	 	
	 	
	 	public static boolean checkSaveSalesInvVatandConsumeQtyPartiallyFromPartiallyConsumedSalesOrder() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	 	{
	 		Thread.sleep(3000);
	 		excelReader=new ExcelReader(POJOUtility.getExcelPath());


			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
			 finacinalsMenu.click();

			 Thread.sleep(2000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			 financialsTransactionMenu.click();

			 Thread.sleep(2000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
			 financialTransactionSalesMenu.click();

			 Thread.sleep(2000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVAT));
			 salesInvoiceVAT.click();

			 Thread.sleep(4000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePanelExpBtn));
			 homePanelExpBtn.click();
			 Thread.sleep(2000);
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingSalesOrderLink));
			 pendingSalesOrderLink.click();
			 Thread.sleep(2000);
			 
			 int count = grid_VoucherNoList.size();
            
            for (int i = 0; i < count; i++) 
            {
                String VoucherNo = grid_VoucherNoList.get(i).getText();
                
                if (VoucherNo.equalsIgnoreCase( excelReader.getCellData(xlSheetName, 356, 5))) 
                {
                	if (grid_CheckBoxList.get(i).isSelected()==false) 
                	{
                		grid_CheckBoxList.get(i).click();
                        break;
						}
                }
            }      
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convrtBtn));
				convrtBtn.click();
				
				Thread.sleep(1000);
				
				checkValidationMessage("Link data loaded");
				
				departmentTxtInSalesInv.click();
				departmentTxtInSalesInv.sendKeys( excelReader.getCellData(xlSheetName, 357, 5));
				Thread.sleep(2000);
				departmentTxtInSalesInv.sendKeys(Keys.TAB);
				
				PlaceOfSupplyInSalesInv.click();
				PlaceOfSupplyInSalesInv.sendKeys( excelReader.getCellData(xlSheetName, 358, 5));
				Thread.sleep(2000);
				PlaceOfSupplyInSalesInv.sendKeys(Keys.TAB);
				
				JurisdictionInSalesInv.click();
				JurisdictionInSalesInv.sendKeys(Keys.END);
				JurisdictionInSalesInv.sendKeys(Keys.SHIFT,Keys.HOME);
				JurisdictionInSalesInv.sendKeys( excelReader.getCellData(xlSheetName, 359, 5));
				Thread.sleep(2000);
				JurisdictionInSalesInv.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
				select1stRow_1stColumn.click();
				warehouseTxtInPR.sendKeys(Keys.TAB);
				
				enter_ItemTxt.click();
				enter_ItemTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
				select1stRow_8thColumn.click();
				enter_AQ.click();
				enter_AQ.sendKeys(Keys.END);
				enter_AQ.sendKeys(Keys.SHIFT,Keys.HOME);
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_9thColumn));
				select1stRow_9thColumn.click();
				
				enter_FQ.sendKeys(Keys.END);
				enter_FQ.sendKeys(Keys.SHIFT,Keys.HOME);
				Thread.sleep(1000);
				
				enter_FQ.sendKeys( excelReader.getCellData(xlSheetName, 360, 5));
				enter_FQ.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
				String actQty = select1stRow_11thColumn.getText();
				String expQty =  excelReader.getCellData(xlSheetName, 361, 6);
				 excelReader.setCellData(xlfile, xlSheetName, 361, 7, actQty);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_18thColumn));
				select1stRow_18thColumn.click();
				
				enter_taxable.click();
				enter_taxable.sendKeys(Keys.TAB);
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
				enter_RMA.sendKeys(Keys.SPACE);	
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serialNumSearchBtn));
				serialNumSearchBtn.click();
				Thread.sleep(1000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxes));
				selectAllCheckboxes.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxes));
				selectAllCheckboxes.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxes));
				selectAllCheckboxes.click();
				
				
				Thread.sleep(3000);
				searchRMAOkBtn.click();
				
				int countRMA=rmaTableList.size();
				
				 ArrayList<String >users=new ArrayList<String>();
				 
				 for (int i = 0; i < countRMA; i++) 
				 {
					String data=rmaTableList.get(i).getText();
					users.add(data);
				}
				 
				 String actRMAList=users.toString();
				 String expRMAList= excelReader.getCellData(xlSheetName, 362, 6);
                 
				 excelReader.setCellData(xlfile, xlSheetName, 362, 7, actRMAList);

				 
				 System.out.println(" ACt List Displayed Users  : "+actRMAList);
				 System.out.println(" Exp List Displayed Users  : "+expRMAList);
			
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
				rmaOkBtn.click();
				
				
				Thread.sleep(2500);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
				 voucherSaveBtn.click();
				 Thread.sleep(1000);
				 
				 Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
				 newReferenceTxt.click();

				 Thread.sleep(2000);
				 Thread.sleep(2000);

				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
				 billRefPickIcon.click();

				 Thread.sleep(2000);

				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
				 billRefOkBtn.click();

				 String expMessage = excelReader.getCellData(xlSheetName, 363, 6);
                 
				 String actMessage = checkValidationMessage(expMessage);
				 
				 excelReader.setCellData(xlfile, xlSheetName, 363, 7, actMessage);

				 if (actRMAList.equalsIgnoreCase(expRMAList) && actMessage.startsWith(expMessage)) 
				 {
					 excelReader.setCellData(xlfile, xlSheetName, 355, 8, resPass);

					 return true;
				 }
				 else 
				 {
					 excelReader.setCellData(xlfile, xlSheetName, 355, 8, resFail);

					 return false;
				 }
	 	}

	 	
	 	public static boolean checklogout() throws InterruptedException
		{

			Thread.sleep(3000);
			
			getDriver().navigate().refresh();
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(LogoutDropdown));
			LogoutDropdown.click();
			 
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
	 
	 
	 
	
	public CreditPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
