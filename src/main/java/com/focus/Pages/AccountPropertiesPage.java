package com.focus.Pages;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.focus.base.BaseEngine;

public class AccountPropertiesPage extends BaseEngine {

	public static String checkValidationMessage(String ExpMessage)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		try {
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
			String actErrorMessage = errorMessage.getText();
			String expErrorMessage = ExpMessage;

			try {

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
				errorMessageCloseBtn.click();

				System.out.println("ValidationMessage  :  " + actErrorMessage + " Value Expected : " + expErrorMessage);

				return actErrorMessage;
			} catch (Exception ee) {

				System.out.println("ValidationMessage  :  " + actErrorMessage + " Value Expected : " + expErrorMessage);

				return actErrorMessage;
			}
		} catch (Exception e) {
			System.err.println("Error Message NOT Found or NOT Clickable");
			System.err.println(e.getMessage());

			String Exception = e.getMessage();

			return Exception;
		}
	}

	public static String checkValidationMessage2(String ExpMessage)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		try {
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage1));
			String actErrorMessage = errorMessage1.getText();
			String expErrorMessage = ExpMessage;

			try {

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn1));
				errorMessageCloseBtn1.click();

				System.out.println("ValidationMessage  :  " + actErrorMessage + " Value Expected : " + expErrorMessage);

				return actErrorMessage;
			} catch (Exception ee) {

				System.out.println("ValidationMessage  :  " + actErrorMessage + " Value Expected : " + expErrorMessage);

				return actErrorMessage;
			}
		} catch (Exception e) {
			System.err.println("Error Message NOT Found or NOT Clickable");
			System.err.println(e.getMessage());

			String Exception = e.getMessage();

			return Exception;
		}
	}

	@FindBy(xpath = "//*[@id='login_div']/div[1]/div/div/ul/li[9]/a/i")
	private static WebElement companyRefreshBtn;

	@FindBy(xpath = "//span[text()='Purchases Voucher VAT']")
	public static WebElement purchaseVouchersVat;

	public static boolean checkRestoreCompany()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BaseEngine.restoreCompany("SanityBackup", "Account Properties And Customization");

		Thread.sleep(6000);

		String actUserInfo1 = usernametxt.getText();

		System.out.println("User Info  : " + actUserInfo1);

		System.out.println("User Info Capture Text  :  " + userNameTxt.getText());

		/*
		 * getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(
		 * companyLogoImg)); companyLogoImg.click();
		 * 
		 * String getCompanyTxt1=companyName.getText(); String
		 * getLoginCompanyName1=getCompanyTxt1.substring(0, 36);
		 * System.out.println("company name  :  "+ getLoginCompanyName1);
		 * companyLogoImg.click();
		 */

		String expUserInfo1 = "SU";
		String expLoginCompanyName1 = "Account Properties And Customization";

		System.out.println("UserInfo1             : " + actUserInfo1 + " Value Expected : " + expUserInfo1);
		// System.out.println("LoginCompanyName1 : "+getLoginCompanyName1 +" Value
		// Expected : "+expLoginCompanyName1);

		if (actUserInfo1.equalsIgnoreCase(expUserInfo1) /* && getLoginCompanyName1.contains(expLoginCompanyName1) */) {
			return true;
		} else {
			return false;
		}

	}

	public static int cSize;

	public static boolean checkLogin()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		boolean loginSuccess = false;

		getDriver().navigate().refresh();

		LoginPage lp = new LoginPage(getDriver());

		String username = "su";
		String password = "su";
		String companyNameExpected = "Account Properties And Customization";

		WebDriverWait wait = new WebDriverWait(getDriver(), 240);

		boolean qflag = true;

		lp.enterUserName(username);

		Thread.sleep(1500);
		lp.enterPassword(password);

		// Select company from dropdown
		wait.until(ExpectedConditions.visibilityOf(companyDropDownList));
		Select companySelect = new Select(companyDropDownList);

		boolean companyFound = false;
		for (WebElement option : companySelect.getOptions()) {
			if (option.getText().equalsIgnoreCase(companyNameExpected)) {
				companySelect.selectByVisibleText(option.getText());
				companyFound = true;
				break;
			}
		}

		if (!companyFound) {
			System.err.println("Company '" + companyNameExpected + "' not found in dropdown.");
			return false;
		}

		// Click Sign In
		lp.clickOnSignInBtn();

		// Handle Reindexing Popup if it appears
		try {
			WebDriverWait popupWait = new WebDriverWait(getDriver(), 240);
			popupWait.until(ExpectedConditions.visibilityOf(reindexingPopup));
			reindexingPopupCancelBtn.click();
			lp.clickOnSignInBtn(); // Retry login after dismissing popup
			System.out.println("Reindexing popup handled.");
		} catch (TimeoutException e) {
			System.out.println("Reindexing popup did not appear.");
		}

		// Verify logged-in user
		WebElement userInfoElement;
		try {
			userInfoElement = wait.until(ExpectedConditions.visibilityOf(usernametxt));
		} catch (TimeoutException e) {
			userInfoElement = wait.until(ExpectedConditions.visibilityOf(userNameTxt));
		}

		String actualUser = userInfoElement.getText().trim();
		System.out.println("Logged in user: " + actualUser);

		if (actualUser.equalsIgnoreCase("SU")) {
			loginSuccess = true;
		} else {
			System.err.println("Login failed. Expected user 'SU' but found: " + actualUser);
			loginSuccess = false;
		}

		return loginSuccess;
	}

	/*
	 * public static boolean checkLogin() throws EncryptedDocumentException,
	 * InvalidFormatException, IOException, InterruptedException {
	 * Thread.sleep(1500);
	 * 
	 * getDriver().navigate().refresh(); Thread.sleep(4000);
	 * 
	 * LoginPage lp=new LoginPage(getDriver());
	 * 
	 * String unamelt="su";
	 * 
	 * String pawslt="su";
	 * 
	 * boolean qflag=true;
	 * 
	 * lp.enterUserName(unamelt);
	 * 
	 * Thread.sleep(1500); lp.enterPassword(pawslt);
	 * 
	 * Thread.sleep(1500);
	 * 
	 * String compname = "Account Properties And Customization";
	 * 
	 * Select oSelect = new Select(companyDropDownList);
	 * 
	 * List<WebElement> elementCount = oSelect.getOptions();
	 * 
	 * int cqSize = elementCount.size();
	 * 
	 * System.out.println("CompanyDropdownList Count :" + cqSize);
	 * 
	 * int i;
	 * 
	 * for (i = 0; i < elementCount.size(); i++) {
	 * 
	 * elementCount.get(i).getText();
	 * 
	 * String optionName = elementCount.get(i).getText(); if
	 * (optionName.toUpperCase().startsWith(compname.toUpperCase())) {
	 * System.out.println("q" + elementCount.get(i).getText());
	 * elementCount.get(i).click(); }
	 * 
	 * }
	 * 
	 * Thread.sleep(1500);
	 * 
	 * 
	 * 
	 * lp.clickOnSignInBtn();
	 * 
	 * 
	 * 
	 * //Thread.sleep(80000);
	 * 
	 * try { if (reindexingPopup.isDisplayed()) {
	 * System.out.println("Reindexing Log is Displaying in Restore Company");
	 * 
	 * getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(
	 * reindexingPopupCancelBtn)); reindexingPopupCancelBtn.click();
	 * 
	 * Thread.sleep(1500);
	 * 
	 * lp.clickOnSignInBtn(); } else {
	 * System.out.println("Reindexing Log is Not Displaying in Restore Company"); }
	 * 
	 * Thread.sleep(1500);
	 * 
	 * String actUserInfo1=usernametxt.getText();
	 * 
	 * System.out.println("User Info  : "+actUserInfo1);
	 * 
	 * System.out.println("User Info Capture Text  :  "+usernametxt.getText());
	 * 
	 * getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(
	 * companyLogoImg)); companyLogoImg.click();
	 * 
	 * String getCompanyTxt1=companyName.getText(); String
	 * getLoginCompanyName1=getCompanyTxt1.substring(0, 36);
	 * System.out.println("company name  :  "+ getLoginCompanyName1);
	 * companyLogoImg.click();
	 * 
	 * String expUserInfo1 ="SU"; String expLoginCompanyName1
	 * ="Account Properties And Customization";
	 * 
	 * System.out.println("UserInfo1             : "+actUserInfo1
	 * +" Value Expected : "+expUserInfo1); //
	 * System.out.println("LoginCompanyName1     : "+getLoginCompanyName1
	 * +" Value Expected : "+expLoginCompanyName1);
	 * 
	 * if(actUserInfo1.equalsIgnoreCase(expUserInfo1) &&
	 * getLoginCompanyName1.contains(expLoginCompanyName1)) { qflag=true; } else {
	 * qflag=false; } } catch (Exception e) { System.err.println(e.getMessage());
	 * 
	 * Thread.sleep(1500);
	 * 
	 * String actUserInfo1=userNameTxt.getText();
	 * 
	 * System.out.println("User Info  : "+actUserInfo1);
	 * 
	 * System.out.println("User Info Capture Text  :  "+userNameTxt.getText());
	 * 
	 * getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(
	 * companyLogoImg)); companyLogoImg.click();
	 * 
	 * String getCompanyTxt1=companyName.getText(); String
	 * getLoginCompanyName1=getCompanyTxt1.substring(0, 36);
	 * System.out.println("company name  :  "+ getLoginCompanyName1);
	 * companyLogoImg.click();
	 * 
	 * String expUserInfo1 ="SU"; String expLoginCompanyName1
	 * ="Account Properties And Customization";
	 * 
	 * System.out.println("UserInfo1             : "+actUserInfo1
	 * +" Value Expected : "+expUserInfo1); //
	 * System.out.println("LoginCompanyName1     : "+getLoginCompanyName1
	 * +" Value Expected : "+expLoginCompanyName1);
	 * 
	 * if(actUserInfo1.equalsIgnoreCase(expUserInfo1) &&
	 * getLoginCompanyName1.contains(expLoginCompanyName1)) { qflag=true; } else {
	 * qflag=false; } } return qflag; }
	 */

	public static boolean checkLogoutAndLogin()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		Thread.sleep(1500);

		getDriver().navigate().refresh();
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(LogoutDropdown));
		LogoutDropdown.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();

		Thread.sleep(2500);

		LoginPage lp = new LoginPage(getDriver());

		String unamelt = "su";

		String pawslt = "su";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
		username.click();
		Thread.sleep(1500);
		username.clear();
		Thread.sleep(1500);
		username.sendKeys(unamelt);
		// getAction().moveToElement(username).sendKeys(Keys.TAB).perform();

		/*
		 * getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(
		 * password)); password.click(); Thread.sleep(1500); password.clear();
		 */
		Thread.sleep(1500);
		password.sendKeys(pawslt);
		String compname = "Account Properties And Customization";

		Select oSelect = new Select(companyDropDownList);

		List<WebElement> elementCount = oSelect.getOptions();

		int cqSize = elementCount.size();

		int zqSize = cSize + 1;

		System.out.println("CompanyDropdownList Count :" + cqSize);

		System.out.println("Company dropdown is :" + zqSize);

		// Select dropdown= new Select(lp.companyDropDownList);
		int i;

		// List<WebElement> list = dropdown.getOptions();

		// List<String> text = new ArrayList<>();
		for (i = 0; i < elementCount.size(); i++) {
			elementCount.get(i).getText();
			String optionName = elementCount.get(i).getText();
			if (optionName.toUpperCase().startsWith(compname.toUpperCase())) {
				System.out.println("q" + elementCount.get(i).getText());
				elementCount.get(i).click();
			}
		}

		lp.clickOnSignInBtn();

		// checkRefershPopOnlogin();

		// checkPopUpWindow();

		Thread.sleep(5000);

		// reLogin(unamelt, pawslt, "Account Properties And Customization");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(usernametxt1));
		// usernametxt.click();

		String userInfo = usernametxt1.getText();

		System.out.println("User Info : " + userInfo);

		System.out.println("User Info Capture Text :" + usernametxt1.getText());

		/*
		 * getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(
		 * companyLogoImg));
		 * 
		 * companyLogoImg.click();
		 * 
		 * String getCompanyTxt=companyName.getText(); String
		 * getLoginCompanyName=getCompanyTxt.substring(0, 36);
		 * System.out.println("company name :"+ getLoginCompanyName);
		 * companyLogoImg.click();
		 */

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));

		String getDashboard = dashboardName.getText();

		System.out.println(getDashboard);

		String expuserInfo = "SU";
		String expLoginCompanyName = "Account Properties And Customization";
		String expDashboard = "Graph with Active and setAsDefault";

		System.out.println("***********************************checkLogin*********************************");

		System.out.println("User Info                        : " + userInfo + "  value expected  " + expuserInfo);
		// System.out.println("Login Company Name : "+getLoginCompanyName +" value
		// expected "+expLoginCompanyName);
		System.out.println("Dashboard                        : " + getDashboard + "  value expected  " + expDashboard);

		if (userInfo.equalsIgnoreCase(expuserInfo) /* && getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName) */) {
			return true;
		} else {
			return false;
		}
	}

	@FindBy(xpath = "//ul[@id='tree2']//li[1]//a[@style='cursor:pointer;']")
	public static List<WebElement> AccountTreeListBeforeCollapse;

	@FindBy(xpath = "//ul[@id='tree2']//ul[@id='0']/li/a[@style='cursor:pointer;']")
	public static List<WebElement> AccountTreeListAfterCollapse;

	@FindBy(xpath = "//*[@id='treeCombo']/div/span/label")
	public static WebElement masterTreeCreateTreeToggleBtn;

	@FindBy(xpath = "//*[@id='treeCombo']/div/ul/li[2]/a")
	public static WebElement masterTreeCreateTreeEditBtn;

	@FindBy(xpath = "//input[@id='chkCollapseTree']")
	public static WebElement masterTreeCreateTreeCollapseTreeCBx;

	@FindBy(xpath = "//div[@class='modal-footer']//*[@id='btnOk']")
	public static WebElement masterTreeCreateTreeOkBtn;

	public static boolean checkEnableCollapseTreeandValidateTreeList() throws InterruptedException {
		Thread.sleep(2000);
		getDriver().navigate().refresh();
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

		String actBList = listOfElements(AccountTreeListBeforeCollapse);
		String expBList = "[ASSETS, Fixed Assets, Current Assets, Cash & bank, Inventories, Accounts Receivable, Customer Update Group, Investments, EXPENSES, Direct Expenses, Indirect Expenses, Administrative Expenses, Employee Benefits, Financial Charges, Gain and Loss, CONTROL ACCOUNTS, REVENUE, SALES, EQUITIES, Capital, LIABILITIES, Loans & Borrowings, Loans, Accrued Liabilities, Trade Payable, Provisions]";

		System.out.println("actBList:" + actBList);
		System.out.println("expBList:" + expBList);

		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeCreateTreeToggleBtn));
		masterTreeCreateTreeToggleBtn.click();

		Thread.sleep(3500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeCreateTreeEditBtn));
		masterTreeCreateTreeEditBtn.click();

		Thread.sleep(1200);
		if (masterTreeCreateTreeCollapseTreeCBx.isSelected() == false) {
			masterTreeCreateTreeCollapseTreeCBx.click();
		}

		Thread.sleep(1200);
		masterTreeCreateTreeOkBtn.click();

		Thread.sleep(2500);
		String actAList = listOfElements(AccountTreeListAfterCollapse);
		String expAList = "[ASSETS, EXPENSES, CONTROL ACCOUNTS, REVENUE, EQUITIES, LIABILITIES]";

		System.out.println("actAList:" + actAList);
		System.out.println("expAList:" + expAList);

		if (actBList.equalsIgnoreCase(expBList) && actAList.equalsIgnoreCase(expAList)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkAccouncreatedWithPropertyAsCreditOrDebitTotlasForEachMonth()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(6000);

		checkValidationMessage("");

		new WebDriverWait(getDriver(), 350).until(ExpectedConditions.visibilityOf(masterNewBtn));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		Thread.sleep(1500);

		checkValidationMessage("");
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("cust_display_dr/cr_total_for_each_month");
		nameTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("CustCrDrTotals");
		codeTxt.sendKeys(Keys.TAB);

		Select accountTypeDrpdwn = new Select(accountTypeDropdown);

		// accountTypeDrpdwn.selectByVisibleText("Customer/Vendor");
		accountTypeDrpdwn.selectByValue("7");

		Thread.sleep(2500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		String expSaveAccountMessage = "Saved Successfully";
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(4000);

		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
		CloseBtn.click();
		Thread.sleep(4000);
		System.out.println("Click on Save With Valid Information Value Actual : " + actSaveAccountMessage
				+ "  Value Expected : " + expSaveAccountMessage);

		if (actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkPropertiesForCreatedAccountAsDebitOrCreditTotalsForEachMonth()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Thread.sleep(4000);

		int count = masterGridBodyName.size();

		ArrayList<String> AccountNames = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);
			Thread.sleep(1500);
			if (data.equalsIgnoreCase("cust_display_dr/cr_total_for_each_month")) {

				Thread.sleep(1500);
				masterGridBodyChkbox.get(i).click();
				break;
			}
		}

		Thread.sleep(2000);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);

		Thread.sleep(8000);

		getFluentWebDriverWait()
				.until(ExpectedConditions.elementToBeClickable(displayDrOrCrTotalsForEachMonthRadioBtnInProperties));
		displayDrOrCrTotalsForEachMonthRadioBtnInProperties.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		Thread.sleep(1500);
		checkValidationMessage("Saved Successfully");
		Thread.sleep(2000);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);

		Thread.sleep(4000);

		getFluentWebDriverWait()
				.until(ExpectedConditions.elementToBeClickable(displayDrOrCrTotalsForEachMonthRadioBtnInProperties));

		boolean actPropertyIsSelected = displayDrOrCrTotalsForEachMonthRadioBtnInProperties.isSelected();
		boolean expPropertyIsSelected = true;

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		Thread.sleep(1500);

		System.out.println(
				"Property isSelected : " + actPropertyIsSelected + "  Value Expected  " + expPropertyIsSelected);

		if (actPropertyIsSelected == expPropertyIsSelected) {
			return true;
		} else {
			return false;
		}
	}

	@FindBy(xpath = "//*[@id='id_header_2']")
	private static WebElement dateText;

	@FindBy(xpath = "//a[@id='2007']//span[contains(text(),'Purchases')]")
	private static WebElement financialsTransactionsPurchases;

	@FindBy(xpath = "//a[@id='2007']//span[contains(text(),'Purchases')]")
	public static WebElement purchasesExpandBtn;

	@FindBy(xpath = "//span[contains(text(),'Purchases Vouchers')]")
	public static WebElement purchaseVouchersBtn;

	@FindBy(xpath = "//input[@id='id_header_3']")
	private static WebElement purchasesAccTxt;

	@FindBy(xpath = " //*[@id='id_header_268435460']")
	private static WebElement WareHouseTxtInPurchases;

	public static void checkPurchasesVoucherHeader(String date, String purAcc, String VenAcc, String Warehouse,
			String dept) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Thread.sleep(1500);
		// getDriver().navigate().refresh();

		// Thread.sleep(4000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchases));
		financialsTransactionsPurchases.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersBtn));
		purchaseVouchersBtn.click();

		Thread.sleep(12000);

		new WebDriverWait(getDriver(), 350).until(ExpectedConditions.visibilityOf(newBtn));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateText));
		dateText.click();
		dateText.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		Thread.sleep(1000);
		dateText.sendKeys(date);
		dateText.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesAccTxt));
		purchasesAccTxt.sendKeys(purAcc);
		Thread.sleep(1500);
		purchasesAccTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(VenAcc);
		Thread.sleep(1500);
		vendorAccountTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		Thread.sleep(1000);
		departmentTxt.sendKeys(dept);
		Thread.sleep(1500);
		departmentTxt.sendKeys(Keys.TAB);

		Thread.sleep(1000);
	}

	public static void checkSalesInvoiceVATHeader(String date, String CustAcc, String dept, String placeOfSupply,
			String jurisdiction)
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {

		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		ClickUsingJs(financialsMenu);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSales));
		financialsTransactionsSales.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
		salesInvoiceVATVoucher.click();

		Thread.sleep(6000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateText));
		dateText.click();
		dateText.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		Thread.sleep(1000);
		dateText.sendKeys(date);
		dateText.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys(CustAcc);
		Thread.sleep(2000);
		customerAccountTxt.sendKeys(Keys.TAB);

		Thread.sleep(2500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.END);
		departmentTxt.sendKeys(Keys.SHIFT, Keys.HOME);
		departmentTxt.sendKeys(Keys.SPACE);

		int departmentcount = departmentListCount.size();

		System.err.println(departmentcount);

		for (int i = 0; i < departmentcount; i++) {
			String data = departmentListCount.get(i).getText();

			if (data.equalsIgnoreCase(dept)) {
				departmentListCount.get(i).click();

				Thread.sleep(1000);

				break;
			}
		}

		departmentTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
		salesInvoiceVATPlaceOFSupply.click();
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT, Keys.HOME);
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);

		int placeOFSupplyListCount = placeOFSupplyList.size();

		System.err.println("placeOFSupplyListCount   : " + placeOFSupplyListCount);

		for (int i = 0; i < placeOFSupplyListCount; i++) {
			String data = placeOFSupplyList.get(i).getText();

			if (data.equalsIgnoreCase(placeOfSupply)) {
				placeOFSupplyList.get(i).click();

				break;
			}
		}

		Thread.sleep(1500);

		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
		jurisdictionTxt.click();
		jurisdictionTxt.sendKeys(Keys.END);
		jurisdictionTxt.sendKeys(Keys.SHIFT, Keys.HOME);
		jurisdictionTxt.sendKeys(jurisdiction);
		Thread.sleep(1500);
		jurisdictionTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);
	}

	public static void checkSaveSalesInvoiceVAT(int i, int j, String warehouse, String item, int u, int q,
			String quantity, int rt, String rate, int vat) throws InterruptedException {

		Thread.sleep(2000);
		checkEnterRow(i, j);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		enter_WarehouseTxt.sendKeys(warehouse);
		Thread.sleep(1500);
		enter_WarehouseTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(item);
		Thread.sleep(1500);
		enter_ItemTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		Thread.sleep(1500);

		checkEnterRow(i, u);

		checkEnterRow(i, q);
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
		enter_AQTxt.sendKeys(quantity);
		Thread.sleep(1000);
		enter_AQTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
		enter_FQTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		checkEnterRow(i, rt);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys(rate);
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);

		checkEnterRow(i, vat);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
		enter_Vat.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Taxable));
		enter_Taxable.sendKeys(Keys.TAB);

	}

	public static void CheckSavePurchasesVoucher(String date, String purAcc, String VenAcc, String Warehouse,
			String dept, String item, String quantity, String rate)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		Thread.sleep(1500);
		getDriver().navigate().refresh();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchases));
		financialsTransactionsPurchases.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersBtn));
		purchaseVouchersBtn.click();

		Thread.sleep(2500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateText));
		dateText.click();
		dateText.sendKeys(Keys.HOME);
		Thread.sleep(1000);
		dateText.sendKeys(date);
		dateText.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesAccTxt));
		purchasesAccTxt.sendKeys(purAcc);
		Thread.sleep(1500);
		purchasesAccTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(VenAcc);
		Thread.sleep(1500);
		vendorAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		Thread.sleep(1000);
		departmentTxt.sendKeys(dept);
		Thread.sleep(1500);
		departmentTxt.sendKeys(Keys.TAB);

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.sendKeys(Warehouse);
		Thread.sleep(1500);
		enter_WarehouseTxt.sendKeys(Keys.TAB);

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(item);
		Thread.sleep(1500);
		enter_ItemTxt.sendKeys(Keys.TAB);

		Thread.sleep(1000);

		Thread.sleep(1500);
		enter_UnitTxt.sendKeys(Keys.TAB);

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys(quantity);
		Thread.sleep(1500);
		enter_Quantity.sendKeys(Keys.TAB);

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys(rate);
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);

	}

	public static void checkSTDItemforPurchasesVoucher(int i, int j, String warehouse, String item, int q,
			String quantity, String rate) throws InterruptedException {
		Thread.sleep(4000);
		checkEnterRow(i, j);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		enter_WarehouseTxt.sendKeys(warehouse);
		Thread.sleep(1500);
		enter_WarehouseTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(item);
		Thread.sleep(1500);
		enter_ItemTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		Thread.sleep(1500);
		enter_UnitTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		checkEnterRow(i, q);
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

	}

	public static void checkSaveSalesInvoicesVATForSTDItem(int i, int j, String warehouse, String item, int u, int q,
			String quantity, int rt, String rate, int vat) throws InterruptedException {

		checkEnterRow(i, j);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		enter_WarehouseTxt.sendKeys(warehouse);
		Thread.sleep(1500);
		enter_WarehouseTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(item);
		Thread.sleep(1500);
		enter_ItemTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		Thread.sleep(1500);

		checkEnterRow(i, u);

		checkEnterRow(i, q);
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
		enter_AQTxt.sendKeys(quantity);
		Thread.sleep(1000);
		enter_AQTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
		enter_FQTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		checkEnterRow(i, rt);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys(rate);
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);

		checkEnterRow(i, vat);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
		enter_Vat.sendKeys(Keys.TAB);

		Thread.sleep(1500);
	}

	public static void checkSaveRMAItemForSalesInvoiceVAT(int i, int j, String warehouse, String item, int u, int q,
			String quantity, int rt, String rate, int vat) throws InterruptedException {
		checkEnterRow(i, j);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		enter_WarehouseTxt.sendKeys(warehouse);
		Thread.sleep(1500);
		enter_WarehouseTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(item);
		Thread.sleep(1500);
		enter_ItemTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		Thread.sleep(1500);

		checkEnterRow(i, u);

		checkEnterRow(i, q);
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
		enter_AQTxt.sendKeys(quantity);
		Thread.sleep(1000);
		enter_AQTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
		enter_FQTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		checkEnterRow(i, rt);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys(rate);
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);

		checkEnterRow(i, vat);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
		enter_Vat.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Taxable));
		enter_Taxable.sendKeys(Keys.TAB);

	}

	public static void checkSaveSalesInvoicesVATForBatchItem(int i, int j, String warehouse, String item, int u, int q,
			String quantity, String rate, int vat) throws InterruptedException {
		checkEnterRow(i, j);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		enter_WarehouseTxt.sendKeys(warehouse);
		Thread.sleep(1500);
		enter_WarehouseTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(item);
		Thread.sleep(1500);
		enter_ItemTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		Thread.sleep(1500);

		checkEnterRow(i, u);

		checkEnterRow(i, q);
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
		enter_AQTxt.sendKeys(quantity);
		Thread.sleep(1000);
		enter_AQTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
		enter_FQTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys(rate);
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);

		checkEnterRow(i, vat);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
		enter_Vat.sendKeys(Keys.TAB);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Taxable));
		enter_Taxable.sendKeys(Keys.TAB);

		Thread.sleep(1500);
	}

	public static void checkBatchItemForPurchasesVoucher(int i, int j, String warehouse, String item, int q,
			String quantity, String rate, int b, String batch) throws InterruptedException {
		Thread.sleep(1000);

		checkEnterRow(i, j);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		Thread.sleep(1000);
		enter_WarehouseTxt.sendKeys(warehouse);
		Thread.sleep(1500);
		enter_WarehouseTxt.sendKeys(Keys.TAB);

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(item);
		Thread.sleep(1500);
		enter_ItemTxt.sendKeys(Keys.TAB);

		Thread.sleep(1000);

		Thread.sleep(1500);
		enter_UnitTxt.sendKeys(Keys.TAB);

		Thread.sleep(1000);

		checkEnterRow(i, q);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys(quantity);
		Thread.sleep(1500);
		enter_Quantity.sendKeys(Keys.TAB);

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys(rate);
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);

		checkEnterRow(i, b);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_BatchTxt));
		enter_BatchTxt.sendKeys(batch);
		Thread.sleep(1500);
		enter_BatchTxt.sendKeys(Keys.TAB);

		enter_expireDateTxt.click();
		enter_expireDateTxt.sendKeys(Keys.TAB);

	}

	public static void checkRMAItem(int i, int j, String warehouse, String item, int q, String quantity, String rate,
			String rmaText) throws InterruptedException {

		Thread.sleep(1500);

		checkEnterRow(i, j);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		Thread.sleep(1000);
		enter_WarehouseTxt.sendKeys(warehouse);
		Thread.sleep(1500);
		enter_WarehouseTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(item);
		Thread.sleep(1500);
		enter_ItemTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		Thread.sleep(1500);
		enter_UnitTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		checkEnterRow(i, q);
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

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Pventer_discount));
		Pventer_discount.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		if (RMA_SerialNoTxt.isDisplayed()) {
			RMA_SerialNoTxt.sendKeys(rmaText);
			Thread.sleep(1000);
			RMA_AddIcon.click();
			Thread.sleep(1000);

		}

	}

	public static void checkEnterRow(int i, int j) {
		getDriver()
				.findElement(By.xpath("//*[@id='id_transaction_entry_detail_table_body']/tr[" + i + "]/td[" + j + "]"))
				.click();

	}

	public static boolean checkPurchasesVoucherVATForCustomerDislayDrOrCrTotalsForEachMonth()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {

		checkPurchasesVoucherHeader("20/01/2023", "Purchase", "cust_display_dr/cr_total_for_each_month", "HYDERABAD",
				"DUBAI");

		checkSTDItemforPurchasesVoucher(1, 2, "HYDERABAD", "STD RATE COGS ITEM", 6, "10", "100");

		checkBatchItemForPurchasesVoucher(2, 2, "HYDERABAD", "BR COGS ITEM", 6, "10", "100", 10, "Batch12");

		checkRMAItem(3, 2, "HYDERABAD", "WA COGS ITEM", 6, "10", "100", "WA1,10");

		Thread.sleep(2500);
		int RMACOUNT = RMA_AddedList.size();
		System.out.println("RMACOUNT" + RMACOUNT);
		ArrayList<String> rmaList = new ArrayList<String>();
		for (int i = 0; i < RMACOUNT; i++) {
			String data = RMA_AddedList.get(i).getText();

			rmaList.add(data);
		}

		String actRow1List = rmaList.toString();
		String expRow1List = "[WA1, WA2, WA3, WA4, WA5, WA6, WA7, WA8, WA9, WA10]";

		System.out.println("actRow1List: " + actRow1List);
		System.out.println("expRow1List: " + expRow1List);

		RMA_OkBtn.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(4000);

		new WebDriverWait(getDriver(), 300).until(ExpectedConditions.visibilityOf(newReferenceTxt));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		Thread.sleep(1500);

		String expSavingMessage1 = "Voucher saved successfully";

		String actSavingMessage = checkValidationMessage(expSavingMessage1);

		if (actSavingMessage.startsWith(expSavingMessage1)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachMonth()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {

		checkSalesInvoiceVATHeader("28/01/2023", "cust_display_dr/cr_total_for_each_month", "India", "Abu Dhabi",
				"DUBAI");
		Thread.sleep(1500);

		checkSaveSalesInvoiceVAT(1, 2, "Hyderabad", "STD RATE COGS ITEM", 6, 9, "3", 15, "20", 18);

		checkSaveSalesInvoiceVAT(2, 2, "Hyderabad", "WA COGS ITEM", 6, 9, "3", 15, "20", 18);

		Thread.sleep(1500);
		ArrayList<String> rmaList = new ArrayList<String>();

		if (RMAPopupHeader.isDisplayed()) {
			RMA_SearchSavedrma.click();
			Thread.sleep(2500);
			int rmaCount = RMA_SavedRMAList.size();

			Thread.sleep(1500);
			for (int r = 0; r < rmaCount; r++) {
				String data = RMA_SavedRMAList.get(r).getText();
				rmaList.add(data);

			}

		}

		String actlist = rmaList.toString();
		String expList = "[WA1, WA2, WA3, WA4, WA5, WA6, WA7, WA8, WA9, WA10]";

		System.out.println("actlist: " + actlist);
		System.out.println("expList: " + expList);

		RMA_SelectAllCheckbox.click();

		Thread.sleep(1000);
		RMA_OKBtn.click();

		Thread.sleep(1500);
		ArrayList<String> SelectedrmaList = new ArrayList<String>();

		int rma = RMA_CheckedRMAList.size();

		for (int r = 0; r < rma; r++) {
			String data = RMA_CheckedRMAList.get(r).getText();
			SelectedrmaList.add(data);

		}

		String actSlist = SelectedrmaList.toString();
		String expSList = "[WA1, WA2, WA3]";

		System.out.println("actSlist: " + actSlist);
		System.out.println("expSList: " + expSList);

		Thread.sleep(1000);
		RMA_OKBtn2.click();

		checkSaveSalesInvoiceVAT(3, 2, "Hyderabad", "BR COGS ITEM", 6, 9, "3", 15, "20", 18);

		Thread.sleep(1500);
		ArrayList<String> BatchList = new ArrayList<String>();

		int BatchCount = Batch_SavedBatchList.size();

		Thread.sleep(1500);
		for (int r = 0; r < BatchCount; r++) {
			String data = Batch_SavedBatchList.get(r).getText().trim();

			if (data.isEmpty() == false) {
				BatchList.add(data);
			}

		}

		String actBatchlist = BatchList.toString();
		String expBatchList = "[1, BATCH12, 120.00, " + getCurrentDateF2() + ", 8.33, 0, 20/01/2023]";

		System.out.println("actBatchlist: " + actBatchlist);
		System.out.println("expBatchList: " + expBatchList);

		Batch_pickOnFifoBtn.click();

		String actTotalQty = Batch_TotalQty.getText();
		String expTotalQty = "120.00";

		String actQtyAdjusted = Batch_qtyAdjusted.getText();
		String expQtyAdjusted = "3.00";

		System.out.println("actTotalQty: " + actTotalQty);
		System.out.println("expTotalQty: " + expTotalQty);

		System.out.println("actQtyAdjusted: " + actQtyAdjusted);
		System.out.println("expQtyAdjusted: " + expQtyAdjusted);

		Batch_PopupOkBtn.click();

		String actbatchPicked = BatchPickedTxt.getText();
		String expbatchPicked = "BATCH12";

		System.out.println("actbatchPicked: " + actbatchPicked);
		System.out.println("expbatchPicked: " + expbatchPicked);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);

		if (actlist.equalsIgnoreCase(expList) && actSlist.equalsIgnoreCase(expSList)
				&& actBatchlist.equalsIgnoreCase(expBatchList) && actTotalQty.equalsIgnoreCase(expTotalQty)
				&& actQtyAdjusted.equalsIgnoreCase(expQtyAdjusted) && actbatchPicked.equalsIgnoreCase(expbatchPicked)
				&& actMessage.startsWith(expMessage)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachMonth2()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {

		checkSalesInvoiceVATHeader("28/02/2023", "cust_display_dr/cr_total_for_each_month", "India", "Abu Dhabi",
				"DUBAI");
		Thread.sleep(1500);

		checkSaveSalesInvoiceVAT(1, 2, "Hyderabad", "STD RATE COGS ITEM", 6, 9, "2", 15, "40", 18);

		checkSaveSalesInvoiceVAT(2, 2, "Hyderabad", "WA COGS ITEM", 6, 9, "2", 15, "40", 18);

		Thread.sleep(1500);
		ArrayList<String> rmaList = new ArrayList<String>();

		if (RMAPopupHeader.isDisplayed()) {
			RMA_SearchSavedrma.click();
			Thread.sleep(2500);
			int rmaCount = RMA_SavedRMAList.size();

			Thread.sleep(1500);
			for (int r = 0; r < rmaCount; r++) {
				String data = RMA_SavedRMAList.get(r).getText();
				rmaList.add(data);

			}

		}

		String actlist = rmaList.toString();
		String expList = "[WA4, WA5, WA6, WA7, WA8, WA9, WA10]";

		System.out.println("actlist: " + actlist);
		System.out.println("expList: " + expList);

		RMA_SelectAllCheckbox.click();

		Thread.sleep(1000);
		RMA_OKBtn.click();

		Thread.sleep(1500);
		ArrayList<String> SelectedrmaList = new ArrayList<String>();

		int rma = RMA_CheckedRMAList.size();

		for (int r = 0; r < rma; r++) {
			String data = RMA_CheckedRMAList.get(r).getText();
			SelectedrmaList.add(data);

		}

		String actSlist = SelectedrmaList.toString();
		String expSList = "[WA4, WA5]";

		System.out.println("actSlist: " + actSlist);
		System.out.println("expSList: " + expSList);

		Thread.sleep(1000);
		RMA_OKBtn2.click();

		checkSaveSalesInvoiceVAT(3, 2, "Hyderabad", "BR COGS ITEM", 6, 9, "3", 15, "20", 18);

		Thread.sleep(1500);
		ArrayList<String> BatchList = new ArrayList<String>();

		int BatchCount = Batch_SavedBatchList.size();

		Thread.sleep(1500);
		for (int r = 0; r < BatchCount; r++) {
			String data = Batch_SavedBatchList.get(r).getText().trim();

			if (data.isEmpty() == false) {
				BatchList.add(data);
			}

		}

		String actBatchlist = BatchList.toString();
		String expBatchList = "[1, BATCH12, 117.00, " + getCurrentDateF2() + ", 8.33, 0, 20/01/2023]";

		System.out.println("actBatchlist: " + actBatchlist);
		System.out.println("expBatchList: " + expBatchList);

		Batch_pickOnFifoBtn.click();

		String actTotalQty = Batch_TotalQty.getText();
		String expTotalQty = "117.00";

		String actQtyAdjusted = Batch_qtyAdjusted.getText();
		String expQtyAdjusted = "3.00";

		System.out.println("actTotalQty: " + actTotalQty);
		System.out.println("expTotalQty: " + expTotalQty);

		System.out.println("actQtyAdjusted: " + actQtyAdjusted);
		System.out.println("expQtyAdjusted: " + expQtyAdjusted);

		Batch_PopupOkBtn.click();

		String actbatchPicked = BatchPickedTxt.getText();
		String expbatchPicked = "BATCH12";

		System.out.println("actbatchPicked: " + actbatchPicked);
		System.out.println("expbatchPicked: " + expbatchPicked);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);

		if (actlist.equalsIgnoreCase(expList) && actSlist.equalsIgnoreCase(expSList)
				&& actBatchlist.equalsIgnoreCase(expBatchList) && actTotalQty.equalsIgnoreCase(expTotalQty)
				&& actQtyAdjusted.equalsIgnoreCase(expQtyAdjusted) && actbatchPicked.equalsIgnoreCase(expbatchPicked)
				&& actMessage.startsWith(expMessage)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkLedgerReportForCreatedCustomer() throws InterruptedException {
		Thread.sleep(1500);
		getDriver().navigate().refresh();
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
		ledger.click();

		Thread.sleep(4000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));
		masterSearchTxt.click();
		masterSearchTxt.sendKeys("cust_display_dr/cr_total_for_each_month");
		masterSearchTxt.sendKeys(Keys.ENTER);

		Thread.sleep(1500);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("cust_display_dr/cr_total_for_each_month")) {
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		/* sl_DateOptionDropdown.click(); */
		Select s = new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));

		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow1ListCount; i++) {
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[cust_display_dr/cr_total_for_each_month [CustCrDrTotals]]";

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for (int i = 2; i < reportsByWarehouseRow2ListCount; i++) {
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[, January 2023, 189.00, 3,000.00, 2,811.00, 13.23, 210.00, 196.77, 189.00, 3,000.00, 2,811.00, ]";

		int reportsByWarehouseRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
		for (int i = 2; i < reportsByWarehouseRow3ListCount; i++) {
			String data = reportsRow3List.get(i).getText();
			reportsByWarehouseRow3ListArray.add(data);
		}
		String actRow3List = reportsByWarehouseRow3ListArray.toString();
		String expRow3List = "[, February 2023, 231.00, , 2,580.00, 16.17, , 180.60, 231.00, , 2,580.00, ]";

		int reportsByWarehouseRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsByWarehouseRow4ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow4ListCount; i++) {
			String data = reportsRow4List.get(i).getText();
			reportsByWarehouseRow4ListArray.add(data);
		}
		String actRow4List = reportsByWarehouseRow4ListArray.toString();
		String expRow4List = "[Total, , , 420.00, 3,000.00, 2,580.00, 29.40, 210.00, 180.60, 420.00, 3,000.00, 2,580.00, ]";

		System.out.println(
				"*********************************checkLedgerReportForCreatedCustomer*****************************************");

		System.out.println("ActualRow1List Values   " + actRow1List);
		System.out.println("ExpectedRow1List Values " + expRow1List);

		System.out.println("ActualRow2List Values  " + actRow2List);
		System.out.println("ExpectedRow1List Values" + expRow2List);

		System.out.println("ActualRow3List Values  " + actRow3List);
		System.out.println("ExpectedRow3List Values" + expRow3List);

		System.out.println("ActualRow4List Values   " + actRow4List);
		System.out.println("ExpectedRow4List Values " + expRow4List);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				&& actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkCustomerStatementsReportForCreatedCustomerAccount() throws InterruptedException {
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		customerDetailMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait()
				.until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerStatementsReport));
		customerDetailsCustomerStatementsReport.click();

		Thread.sleep(6000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));
		masterSearchTxt.click();
		masterSearchTxt.sendKeys("cust_display_dr/cr_total_for_each_month");
		masterSearchTxt.sendKeys(Keys.ENTER);

		Thread.sleep(1500);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("cust_display_dr/cr_total_for_each_month")) {
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		// sl_DateOptionDropdown.click();
		Select s = new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));

		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow1ListCount; i++) {
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[cust_display_dr/cr_total_for_each_month [CustCrDrTotals]]";

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow2ListCount - 1; i++) {
			String data = reportsRow2List.get(i).getText();
			if (i == 13) {
				reportsByWarehouseRow2ListArray.add("Delay In Payment");
			} else {
				reportsByWarehouseRow2ListArray.add(data);
			}
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[PurVou:1, 20/01/2023, cust_display_dr/cr_total_for_each_month, 3,000.00, , , 3,000.00, 3,000.00, 3,000.00, , , 3,000.00, Delay In Payment, Indian Rupees, 20/01/2023, CustCrDrTotals, DUBAI, DUBAI, 210.00, , , 210.00, ]";

		int reportsByWarehouseRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow3ListCount - 1; i++) {
			String data = reportsRow3List.get(i).getText();
			if (i == 13) {
				reportsByWarehouseRow3ListArray.add("Delay In Payment");
			} else {
				reportsByWarehouseRow3ListArray.add(data);
			}
		}
		String actRow3List = reportsByWarehouseRow3ListArray.toString();
		String expRow3List = "[NDT55:1, 28/01/2023, cust_display_dr/cr_total_for_each_month, 189.00, , , 189.00, 2,811.00, 189.00, , , 189.00, Delay In Payment, Indian Rupees, 28/01/2023, CustCrDrTotals, INDIA, INDIA, 13.23, , , 13.23, ]";

		int reportsByWarehouseRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsByWarehouseRow4ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow4ListCount - 1; i++) {
			String data = reportsRow4List.get(i).getText();
			if (i == 13) {
				reportsByWarehouseRow4ListArray.add("Delay In Payment");
			} else {
				reportsByWarehouseRow4ListArray.add(data);
			}
		}
		String actRow4List = reportsByWarehouseRow4ListArray.toString();
		String expRow4List = "[NDT55:2, 28/02/2023, cust_display_dr/cr_total_for_each_month, 231.00, , , 231.00, 2,580.00, 231.00, , , 231.00, Delay In Payment, Indian Rupees, 28/02/2023, CustCrDrTotals, INDIA, INDIA, 16.17, , , 16.17, ]";

		int reportsByWarehouseRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsByWarehouseRow5ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow5ListCount - 1; i++) {
			String data = reportsRow5List.get(i).getText();
			if (i == 13) {
				reportsByWarehouseRow5ListArray.add("Delay In Payment");
			} else {
				reportsByWarehouseRow5ListArray.add(data);
			}
		}
		String actRow5List = reportsByWarehouseRow5ListArray.toString();
		String expRow5List = "[Total, , , 2,580.00, , , 2,580.00, 8,391.00, 2,580.00, , , 2,580.00, Delay In Payment, , , , , , 180.60, , , 180.60, ]";

		System.out.println(
				"*********************************checkCustomerStatementsReportDetailsForCreatedCustomer*****************************************");

		System.out.println("ActualRow1List Values   " + actRow1List);
		System.out.println("ExpectedRow1List Values " + expRow1List);

		System.out.println("ActualRow2List Values  " + actRow2List);
		System.out.println("ExpectedRow1List Values" + expRow2List);

		System.out.println("ActualRow3List Values  " + actRow3List);
		System.out.println("ExpectedRow3List Values" + expRow3List);

		System.out.println("ActualRow4List Values   " + actRow4List);
		System.out.println("ExpectedRow4List Values " + expRow4List);

		System.out.println("ActualRow5List Values   " + actRow5List);
		System.out.println("ExpectedRow5List Values " + expRow5List);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				&& actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List)
				&& actRow5List.equalsIgnoreCase(expRow5List)) {
			return true;
		} else {
			return false;
		}
	}

	// Display Debit / Credit totals for each day

	public static boolean checkAccouncreatedWithPropertyAsCreditOrDebitTotlasForEachDay()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(3000);

		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		Thread.sleep(1500);

		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("cust_display_dr/cr_total_for_each_day");
		nameTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("CustCrDrTotalsDay");
		codeTxt.sendKeys(Keys.TAB);

		Select accountTypeDrpdwn = new Select(accountTypeDropdown);

		// accountTypeDrpdwn.selectByVisibleText("Customer/Vendor");
		accountTypeDrpdwn.selectByValue("7");
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		String expSaveAccountMessage = "Saved Successfully";
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(4000);
		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
		CloseBtn.click();

		Thread.sleep(4000);
		System.out.println("Click on Save With Valid Information Value Actual : " + actSaveAccountMessage
				+ "  Value Expected : " + expSaveAccountMessage);

		if (actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkPropertiesForCreatedAccountAsDebitOrCreditTotalsForEachDay()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		Thread.sleep(3000);
		int count = masterGridBodyName.size();

		ArrayList<String> AccountNames = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);

			if (data.equalsIgnoreCase("cust_display_dr/cr_total_for_each_day")) {
				masterGridBodyChkbox.get(i).click();
				Thread.sleep(1500);
				break;
			}
		}

		Thread.sleep(1500);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);

		Thread.sleep(4000);

		getFluentWebDriverWait()
				.until(ExpectedConditions.elementToBeClickable(displayDrOrCrTotalsForEachDayRadioBtnInProperties));
		displayDrOrCrTotalsForEachDayRadioBtnInProperties.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		Thread.sleep(1500);
		checkValidationMessage("Saved Successfully");
		Thread.sleep(2000);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);
		checkValidationMessage("");

		Thread.sleep(1500);

		getFluentWebDriverWait()
				.until(ExpectedConditions.elementToBeClickable(displayDrOrCrTotalsForEachDayRadioBtnInProperties));

		boolean actPropertyIsSelected = displayDrOrCrTotalsForEachDayRadioBtnInProperties.isSelected();
		boolean expPropertyIsSelected = true;

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		Thread.sleep(1500);

		System.out.println(
				"Property isSelected : " + actPropertyIsSelected + "  Value Expected  " + expPropertyIsSelected);

		if (actPropertyIsSelected == expPropertyIsSelected) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkPurchasesVoucherVATForCustomerDislayDrOrCrTotalsForDay()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		checkPurchasesVoucherHeader("21/01/2023", "Purchase", "cust_display_dr/cr_total_for_each_day", "HYDERABAD",
				"DUBAI");

		checkSTDItemforPurchasesVoucher(1, 2, "HYDERABAD", "STD RATE COGS ITEM", 6, "3", "300");

		checkBatchItemForPurchasesVoucher(2, 2, "HYDERABAD", "BR COGS ITEM", 6, "10", "100", 10, "BatchBR");

		Thread.sleep(1500);
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

		String expSavingMessage1 = "Voucher saved successfully";

		String actSavingMessage = checkValidationMessage(expSavingMessage1);

		if (actSavingMessage.startsWith(expSavingMessage1)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachDay()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {

		checkSalesInvoiceVATHeader("28/03/2023", "cust_display_dr/cr_total_for_each_day", "India", "Abu Dhabi",
				"DUBAI");

		Thread.sleep(1500);

		checkSaveSalesInvoiceVAT(1, 2, "Hyderabad", "STD RATE COGS ITEM", 6, 9, "2", 15, "20", 18);

		checkSaveSalesInvoiceVAT(2, 2, "Hyderabad", "WA COGS ITEM", 6, 9, "2", 15, "20", 18);
		Thread.sleep(1500);

		Thread.sleep(1500);
		ArrayList<String> rmaList = new ArrayList<String>();

		if (RMAPopupHeader.isDisplayed()) {
			RMA_SearchSavedrma.click();
			Thread.sleep(2500);
			int rmaCount = RMA_SavedRMAList.size();

			Thread.sleep(1500);
			for (int r = 0; r < rmaCount; r++) {
				String data = RMA_SavedRMAList.get(r).getText();
				rmaList.add(data);

			}

		}

		String actlist = rmaList.toString();
		String expList = "[WA6, WA7, WA8, WA9, WA10]";

		System.out.println("actlist: " + actlist);
		System.out.println("expList: " + expList);

		RMA_SelectAllCheckbox.click();

		Thread.sleep(1000);
		RMA_OKBtn.click();

		Thread.sleep(1500);
		ArrayList<String> SelectedrmaList = new ArrayList<String>();

		int rma = RMA_CheckedRMAList.size();

		for (int r = 0; r < rma; r++) {
			String data = RMA_CheckedRMAList.get(r).getText();
			SelectedrmaList.add(data);

		}

		String actSlist = SelectedrmaList.toString();
		String expSList = "[WA6, WA7]";

		System.out.println("actSlist: " + actSlist);
		System.out.println("expSList: " + expSList);

		Thread.sleep(1000);
		RMA_OKBtn2.click();

		checkSaveSalesInvoiceVAT(3, 2, "Hyderabad", "BR COGS ITEM", 6, 9, "3", 15, "20", 18);

		Thread.sleep(1500);
		ArrayList<String> BatchList = new ArrayList<String>();

		int BatchCount = Batch_SavedBatchList.size();

		Thread.sleep(1500);
		for (int r = 0; r < BatchCount; r++) {
			String data = Batch_SavedBatchList.get(r).getText().trim();

			if (data.isEmpty() == false) {
				BatchList.add(data);
			}

		}

		String actBatchlist = BatchList.toString();
		String expBatchList = "[1, BATCH12, 114.00, " + getCurrentDateF2()
				+ ", 8.33, 0, 20/01/2023, 2, BATCHBR, 120.00, " + getCurrentDateF2() + ", 8.33, 0, 21/01/2023]";

		System.out.println("actBatchlist: " + actBatchlist);
		System.out.println("expBatchList: " + expBatchList);

		Batch_pickOnFifoBtn.click();

		String actTotalQty = Batch_TotalQty.getText();
		String expTotalQty = "234.00";

		String actQtyAdjusted = Batch_qtyAdjusted.getText();
		String expQtyAdjusted = "3.00";

		System.out.println("actTotalQty: " + actTotalQty);
		System.out.println("expTotalQty: " + expTotalQty);

		System.out.println("actQtyAdjusted: " + actQtyAdjusted);
		System.out.println("expQtyAdjusted: " + expQtyAdjusted);

		Batch_PopupOkBtn.click();

		String actbatchPicked = BatchPickedTxt.getText();
		String expbatchPicked = "BATCH12";

		System.out.println("actbatchPicked: " + actbatchPicked);
		System.out.println("expbatchPicked: " + expbatchPicked);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);

		if (actlist.equalsIgnoreCase(expList) && actSlist.equalsIgnoreCase(expSList)
				&& actBatchlist.equalsIgnoreCase(expBatchList) && actTotalQty.equalsIgnoreCase(expTotalQty)
				&& actQtyAdjusted.equalsIgnoreCase(expQtyAdjusted) && actbatchPicked.equalsIgnoreCase(expbatchPicked)
				&& actMessage.startsWith(expMessage)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachDay2()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		checkSalesInvoiceVATHeader("30/03/2023", "cust_display_dr/cr_total_for_each_day", "India", "Abu Dhabi",
				"DUBAI");
		Thread.sleep(1500);

		checkSaveSalesInvoiceVAT(1, 2, "Hyderabad", "STD RATE COGS ITEM", 6, 9, "2", 15, "20", 18);

		checkSaveSalesInvoiceVAT(2, 2, "Hyderabad", "WA COGS ITEM", 6, 9, "2", 15, "20", 18);

		Thread.sleep(1500);
		ArrayList<String> rmaList = new ArrayList<String>();

		if (RMAPopupHeader.isDisplayed()) {
			RMA_SearchSavedrma.click();
			Thread.sleep(2500);
			int rmaCount = RMA_SavedRMAList.size();

			Thread.sleep(1500);
			for (int r = 0; r < rmaCount; r++) {
				String data = RMA_SavedRMAList.get(r).getText();
				rmaList.add(data);

			}

		}

		String actlist = rmaList.toString();
		String expList = "[WA8, WA9, WA10]";

		System.out.println("actlist: " + actlist);
		System.out.println("expList: " + expList);

		RMA_SelectAllCheckbox.click();

		Thread.sleep(1000);
		RMA_OKBtn.click();

		Thread.sleep(1500);
		ArrayList<String> SelectedrmaList = new ArrayList<String>();

		int rma = RMA_CheckedRMAList.size();

		for (int r = 0; r < rma; r++) {
			String data = RMA_CheckedRMAList.get(r).getText();
			SelectedrmaList.add(data);

		}

		String actSlist = SelectedrmaList.toString();
		String expSList = "[WA8, WA9]";

		System.out.println("actSlist: " + actSlist);
		System.out.println("expSList: " + expSList);

		Thread.sleep(1000);
		RMA_OKBtn2.click();

		checkSaveSalesInvoiceVAT(3, 2, "Hyderabad", "BR COGS ITEM", 6, 9, "3", 15, "20", 18);

		Thread.sleep(1500);
		ArrayList<String> BatchList = new ArrayList<String>();

		int BatchCount = Batch_SavedBatchList.size();

		Thread.sleep(1500);
		for (int r = 0; r < BatchCount; r++) {
			String data = Batch_SavedBatchList.get(r).getText().trim();

			if (data.isEmpty() == false) {
				BatchList.add(data);
			}

		}

		String actBatchlist = BatchList.toString();
		String expBatchList = "[1, BATCH12, 111.00, " + getCurrentDateF2()
				+ ", 8.33, 0, 20/01/2023, 2, BATCHBR, 120.00, " + getCurrentDateF2() + ", 8.33, 0, 21/01/2023]";

		System.out.println("actBatchlist: " + actBatchlist);
		System.out.println("expBatchList: " + expBatchList);

		Batch_pickOnFifoBtn.click();

		String actTotalQty = Batch_TotalQty.getText();
		String expTotalQty = "231.00";

		String actQtyAdjusted = Batch_qtyAdjusted.getText();
		String expQtyAdjusted = "3.00";

		System.out.println("actTotalQty: " + actTotalQty);
		System.out.println("expTotalQty: " + expTotalQty);

		System.out.println("actQtyAdjusted: " + actQtyAdjusted);
		System.out.println("expQtyAdjusted: " + expQtyAdjusted);

		Batch_PopupOkBtn.click();

		String actbatchPicked = BatchPickedTxt.getText();
		String expbatchPicked = "BATCH12";

		System.out.println("actbatchPicked: " + actbatchPicked);
		System.out.println("expbatchPicked: " + expbatchPicked);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);

		if (actlist.equalsIgnoreCase(expList) && actSlist.equalsIgnoreCase(expSList)
				&& actBatchlist.equalsIgnoreCase(expBatchList) && actTotalQty.equalsIgnoreCase(expTotalQty)
				&& actQtyAdjusted.equalsIgnoreCase(expQtyAdjusted) && actbatchPicked.equalsIgnoreCase(expbatchPicked)
				&& actMessage.startsWith(expMessage)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkLedgerReportForCreatedCustomer2() throws InterruptedException {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
		ledger.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));
		masterSearchTxt.click();
		masterSearchTxt.sendKeys("cust_display_dr/cr_total_for_each_day");
		masterSearchTxt.sendKeys(Keys.ENTER);

		Thread.sleep(1500);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("cust_display_dr/cr_total_for_each_day")) {
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s = new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(1500);

		/*
		 * getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(
		 * sl_1stRow1stCol));
		 */

		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow1ListCount; i++) {
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[cust_display_dr/cr_total_for_each_day [CustCrDrTotalsDay]]";

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for (int i = 0; i < reportsByWarehouseRow2ListCount; i++) {
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 0, , 1/21/2023 12:00:00 AM, , 1,900.00, 1,900.00, , 133.00, 133.00, , 1,900.00, 1,900.00, ]";

		int reportsByWarehouseRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow3ListCount; i++) {
			String data = reportsRow3List.get(i).getText();
			reportsByWarehouseRow3ListArray.add(data);
		}
		String actRow3List = reportsByWarehouseRow3ListArray.toString();
		String expRow3List = "[0, , 3/30/2023 12:00:00 AM, 147.00, , 1,753.00, 10.29, , 122.71, 147.00, , 1,753.00, ]";

		int reportsByWarehouseRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsByWarehouseRow4ListArray = new ArrayList<String>();
		for (int i = 0; i < reportsByWarehouseRow4ListCount; i++) {
			String data = reportsRow4List.get(i).getText();
			reportsByWarehouseRow4ListArray.add(data);
		}
		String actRow4List = reportsByWarehouseRow4ListArray.toString();
		String expRow4List = "[4, 0, , 3/28/2023 12:00:00 AM, 147.00, , 1,606.00, 10.29, , 112.42, 147.00, , 1,606.00, ]";

		int reportsByWarehouseRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsByWarehouseRow5ListArray = new ArrayList<String>();
		for (int i = 0; i < reportsByWarehouseRow5ListCount; i++) {
			String data = reportsRow5List.get(i).getText();
			reportsByWarehouseRow5ListArray.add(data);
		}
		String actRow5List = reportsByWarehouseRow5ListArray.toString();
		String expRow5List = "[5, Total, , , 294.00, 1,900.00, 1,606.00, 20.58, 133.00, 112.42, 294.00, 1,900.00, 1,606.00, ]";

		System.out.println(
				"*********************************checkLedgerReportForCreatedCustomer2*****************************************");

		System.out.println("ActualRow1List Values   " + actRow1List);
		System.out.println("ExpectedRow1List Values " + expRow1List);

		System.out.println("ActualRow2List Values  " + actRow2List);
		System.out.println("ExpectedRow1List Values" + expRow2List);

		System.out.println("ActualRow3List Values  " + actRow3List);
		System.out.println("ExpectedRow3List Values" + expRow3List);

		System.out.println("ActualRow4List Values   " + actRow4List);
		System.out.println("ExpectedRow4List Values " + expRow4List);

		System.out.println("ActualRow5List Values  " + actRow5List);
		System.out.println("ExpectedRow5List Values" + expRow5List);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				&& actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List)
				&& actRow5List.equalsIgnoreCase(expRow5List)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkCustomerStatementsReportForCreatedCustomerAccount2() throws InterruptedException {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		customerDetailMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait()
				.until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerStatementsReport));
		customerDetailsCustomerStatementsReport.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));
		masterSearchTxt.click();
		masterSearchTxt.sendKeys("cust_display_dr/cr_total_for_each_day");
		masterSearchTxt.sendKeys(Keys.ENTER);

		Thread.sleep(1500);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("cust_display_dr/cr_total_for_each_day")) {
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s = new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));

		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow1ListCount; i++) {
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[cust_display_dr/cr_total_for_each_day [CustCrDrTotalsDay]]";

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow2ListCount - 1; i++) {
			String data = reportsRow2List.get(i).getText();
			if (i == 13) {
				reportsByWarehouseRow2ListArray.add("Delay In Payment");
			} else {
				reportsByWarehouseRow2ListArray.add(data);
			}
		}

		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[PurVou:2, 21/01/2023, cust_display_dr/cr_total_for_each_day, 1,900.00, , , 1,900.00, 1,900.00, 1,900.00, , , 1,900.00, Delay In Payment, Indian Rupees, 21/01/2023, CustCrDrTotalsDay, DUBAI, DUBAI, 133.00, , , 133.00, ]";

		int reportsByWarehouseRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow3ListCount - 1; i++) {
			String data = reportsRow3List.get(i).getText();
			if (i == 13) {
				reportsByWarehouseRow3ListArray.add("Delay In Payment");
			} else {
				reportsByWarehouseRow3ListArray.add(data);
			}
		}
		String actRow3List = reportsByWarehouseRow3ListArray.toString();
		String expRow3List = "[NDT55:3, 28/03/2023, cust_display_dr/cr_total_for_each_day, 147.00, , , 147.00, 1,753.00, 147.00, , , 147.00, Delay In Payment, Indian Rupees, 28/03/2023, CustCrDrTotalsDay, INDIA, INDIA, 10.29, , , 10.29, ]";

		int reportsByWarehouseRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsByWarehouseRow4ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow4ListCount - 1; i++) {
			String data = reportsRow4List.get(i).getText();
			if (i == 13) {
				reportsByWarehouseRow4ListArray.add("Delay In Payment");
			} else {
				reportsByWarehouseRow4ListArray.add(data);
			}
		}
		String actRow4List = reportsByWarehouseRow4ListArray.toString();
		String expRow4List = "[NDT55:4, 30/03/2023, cust_display_dr/cr_total_for_each_day, 147.00, , , 147.00, 1,606.00, 147.00, , , 147.00, Delay In Payment, Indian Rupees, 28/03/2023, CustCrDrTotalsDay, INDIA, INDIA, 10.29, , , 10.29, ]";

		int reportsByWarehouseRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsByWarehouseRow5ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow5ListCount - 1; i++) {
			String data = reportsRow5List.get(i).getText();
			if (i == 13) {
				reportsByWarehouseRow5ListArray.add("Delay In Payment");
			} else {
				reportsByWarehouseRow5ListArray.add(data);
			}
		}
		String actRow5List = reportsByWarehouseRow5ListArray.toString();
		String expRow5List = "[Total, , , 1,606.00, , , 1,606.00, 5,259.00, 1,606.00, , , 1,606.00, Delay In Payment, , , , , , 112.42, , , 112.42, ]";

		System.out.println(
				"*********************************checkCustomerStatementsReportDetailsForCreatedCustomer*****************************************");

		System.out.println("ActualRow1List Values   " + actRow1List);
		System.out.println("ExpectedRow1List Values " + expRow1List);

		System.out.println("ActualRow2List Values  " + actRow2List);
		System.out.println("ExpectedRow1List Values" + expRow2List);

		System.out.println("ActualRow3List Values  " + actRow3List);
		System.out.println("ExpectedRow3List Values" + expRow3List);

		System.out.println("ActualRow4List Values   " + actRow4List);
		System.out.println("ExpectedRow4List Values " + expRow4List);

		System.out.println("ActualRow5List Values   " + actRow5List);
		System.out.println("ExpectedRow5List Values " + expRow5List);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				&& actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List)
				&& actRow5List.equalsIgnoreCase(expRow5List)) {
			return true;
		} else {
			return false;
		}
	}

	// Master Account Properties

	public static boolean checkCreatingAccountForDisplayUnRealizeGainOrLossInLedger()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		Thread.sleep(2000);
		getDriver().navigate().refresh();
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		ClickUsingJs(homeMenu);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(1500);

		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		Thread.sleep(1500);

		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("Display_Un-Realize_GainOrLoss_In_Ledger");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("DisplayUnRealizeGainOrLossInLedger");

		Thread.sleep(2500);

		Select accountTypeDrpdwn = new Select(accountTypeDropdown);

		accountTypeDrpdwn.selectByVisibleText("Customer/Vendor");

		System.out.println(
				"***********************************checkCreatingAccountForDisplayUnRealizeGainOrLossInLedger*********************************");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		String expMessage = "Saved Successfully";

		String actMessage = checkValidationMessage(expMessage);

		Thread.sleep(3000);

		checkValidationMessage("");

		if (actMessage.equalsIgnoreCase(expMessage)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkMasterAccountEnablingDisplayUnRealizeGainOrLossInLedgerChkboxInProperties()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {

		Thread.sleep(3000);
		getAction().moveToElement(CloseBtn).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
		CloseBtn.click();

		Thread.sleep(4000);

		int count = masterGridBodyName.size();

		ArrayList<String> AccountNames = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);

			if (data.equalsIgnoreCase("Display_Un-Realize_GainOrLoss_In_Ledger")) {
				masterGridBodyChkbox.get(i).click();
				break;
			}
		}

		Thread.sleep(1500);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);

		Thread.sleep(4000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayUnRealizeGainLossInLedgerChkbox));
		displayUnRealizeGainLossInLedgerChkbox.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		checkValidationMessage("");

		Thread.sleep(4000);
		for (int i = 0; i < count; i++) {
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);

			if (data.equalsIgnoreCase("Display_Un-Realize_GainOrLoss_In_Ledger")) {
				masterGridBodyChkbox.get(i).click();
				break;
			}
		}

		Thread.sleep(2000);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);

		checkValidationMessage("");

		Thread.sleep(5000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayUnRealizeGainLossInLedgerChkbox));

		boolean actdisplayUnRealizeGainLossInLedgerChkbox = displayUnRealizeGainLossInLedgerChkboxSelected.isSelected();
		boolean expdisplayUnRealizeGainLossInLedgerChkbox = true;

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();
		Thread.sleep(1500);

		System.out.println("displayUnRealizeGainLossInLedgerChkbox  : " + actdisplayUnRealizeGainLossInLedgerChkbox
				+ "  Value Expected  " + expdisplayUnRealizeGainLossInLedgerChkbox);

		if (actdisplayUnRealizeGainLossInLedgerChkbox == expdisplayUnRealizeGainLossInLedgerChkbox) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkPurchasesVoucherVATForCustomerAccountAsDisplayUnRealizeGainLossInLedger()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {

		checkPurchasesVoucherHeader(getCurrentDateF2(), "Purchase", "Display_Un-Realize_GainOrLoss_In_Ledger",
				"HYDERABAD", "DUBAI");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
		voucherHeaderCurrency.click();
		voucherHeaderCurrency.sendKeys(Keys.END);
		voucherHeaderCurrency.sendKeys(Keys.SHIFT, Keys.HOME);
		Thread.sleep(1500);
		voucherHeaderCurrency.sendKeys("AED");
		Thread.sleep(1500);
		voucherHeaderCurrency.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderExchangeRate));
		voucherHeaderExchangeRate.click();
		voucherHeaderExchangeRate.sendKeys(Keys.END);
		voucherHeaderExchangeRate.sendKeys(Keys.SHIFT, Keys.HOME);
		voucherHeaderExchangeRate.sendKeys("0.050");
		voucherHeaderExchangeRate.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		checkSTDItemforPurchasesVoucher(1, 2, "HYDERABAD", "STD RATE COGS ITEM", 6, "2", "200");

		checkBatchItemForPurchasesVoucher(2, 2, "HYDERABAD", "BR COGS ITEM", 6, "5", "50", 10, "Batch3");

		Thread.sleep(1500);
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

		String expSavingMessage1 = "Voucher saved successfully";

		String actSavingMessage = checkValidationMessage(expSavingMessage1);

		if (actSavingMessage.startsWith(expSavingMessage1)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkSavingSalesInvoivesVATWithCustomerAccountAsDisplayUnRealizeGainLossInLedger()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		checkSalesInvoiceVATHeader(getCurrentDateF2(), "Display_Un-Realize_GainOrLoss_In_Ledger", "India", "Abu Dhabi",
				"DUBAI");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
		voucherHeaderCurrency.click();
		voucherHeaderCurrency.sendKeys(Keys.END);
		voucherHeaderCurrency.sendKeys(Keys.SHIFT, Keys.HOME);
		Thread.sleep(1500);
		voucherHeaderCurrency.sendKeys("AED");
		Thread.sleep(1500);
		voucherHeaderCurrency.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderExchangeRate));
		voucherHeaderExchangeRate.click();
		voucherHeaderExchangeRate.sendKeys(Keys.END);
		voucherHeaderExchangeRate.sendKeys(Keys.SHIFT, Keys.HOME);
		voucherHeaderExchangeRate.sendKeys("0.050");
		voucherHeaderExchangeRate.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		checkSaveSalesInvoiceVAT(1, 2, "Hyderabad", "STD RATE COGS ITEM", 6, 9, "2", 15, "20", 18);

		checkSaveSalesInvoiceVAT(2, 2, "Hyderabad", "BR COGS ITEM", 6, 9, "3", 15, "20", 18);

		Thread.sleep(1500);
		ArrayList<String> BatchList = new ArrayList<String>();

		int BatchCount = Batch_SavedBatchList.size();

		Thread.sleep(1500);
		for (int r = 0; r < BatchCount; r++) {
			String data = Batch_SavedBatchList.get(r).getText().trim();

			if (data.isEmpty() == false) {
				BatchList.add(data);
			}

		}

		String actBatchlist = BatchList.toString();
		String expBatchList = "[1, BATCH12, 108.00, " + getCurrentDateF2()
				+ ", 8.33, 0, 20/01/2023, 2, BATCHBR, 120.00, " + getCurrentDateF2()
				+ ", 8.33, 0, 21/01/2023, 3, BATCH3, 60.00, " + getCurrentDateF2() + ", 0.21, 0, " + getCurrentDateF2()
				+ "]";

		System.out.println("actBatchlist: " + actBatchlist);
		System.out.println("expBatchList: " + expBatchList);

		Batch_pickOnFifoBtn.click();

		String actTotalQty = Batch_TotalQty.getText();
		String expTotalQty = "288.00";

		String actQtyAdjusted = Batch_qtyAdjusted.getText();
		String expQtyAdjusted = "3.00";

		System.out.println("actTotalQty: " + actTotalQty);
		System.out.println("expTotalQty: " + expTotalQty);

		System.out.println("actQtyAdjusted: " + actQtyAdjusted);
		System.out.println("expQtyAdjusted: " + expQtyAdjusted);

		Batch_PopupOkBtn.click();

		Thread.sleep(2000);
		String actbatchPicked = BatchPickedTxt.getText();
		String expbatchPicked = "BATCH12";

		System.out.println("actbatchPicked: " + actbatchPicked);
		System.out.println("expbatchPicked: " + expbatchPicked);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);

		if (actBatchlist.equalsIgnoreCase(expBatchList) && actTotalQty.equalsIgnoreCase(expTotalQty)
				&& actQtyAdjusted.equalsIgnoreCase(expQtyAdjusted) &&
				/* actbatchPicked.equalsIgnoreCase(expbatchPicked) */actMessage.startsWith(expMessage)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean checkSavingRecepitsVocher1()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsVoucher));
		receiptsVoucher.click();

		Thread.sleep(6000);

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
		newCashBankAccountTxt.click();

		newCashBankAccountTxt.sendKeys(Keys.SPACE);

		int cashAndBAnkAccountListCount = cashAndBAnkAccountList.size();

		System.err.println("cashAndBAnkAccountListCount   : " + cashAndBAnkAccountListCount);

		for (int i = 0; i < cashAndBAnkAccountListCount; i++) {
			String data = cashAndBAnkAccountList.get(i).getText();

			if (data.equalsIgnoreCase("Bank")) {
				cashAndBAnkAccountList.get(i).click();

				break;
			}
		}

		newCashBankAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
		voucherHeaderCurrency.click();
		voucherHeaderCurrency.sendKeys(Keys.END);
		voucherHeaderCurrency.sendKeys(Keys.SHIFT, Keys.HOME);
		Thread.sleep(1500);
		voucherHeaderCurrency.sendKeys("AED");
		Thread.sleep(1500);
		voucherHeaderCurrency.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderExchangeRate));
		voucherHeaderExchangeRate.click();
		voucherHeaderExchangeRate.sendKeys(Keys.END);
		voucherHeaderExchangeRate.sendKeys(Keys.SHIFT, Keys.HOME);
		voucherHeaderExchangeRate.sendKeys("0.060");
		voucherHeaderExchangeRate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
		departmentTxt.sendKeys(Keys.SPACE);
		Thread.sleep(1500);
		int departmentcount = departmentListCount.size();

		System.err.println(departmentcount);

		for (int i = 0; i < departmentcount; i++) {
			String data = departmentListCount.get(i).getText();

			if (data.equalsIgnoreCase("INDIA")) {
				departmentListCount.get(i).click();
				break;
			}
		}

		Thread.sleep(1000);

		departmentTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
		enter_AccountTxt.click();
		enter_AccountTxt.sendKeys("Display_Un-Realize_GainOrLoss_In_Ledger");
		Thread.sleep(1500);
		enter_AccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
		enter_Amount.sendKeys("200");
		enter_Amount.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));

		String actPartyName = billRefPartyName.getText();
		String expPartyName = "Display_Un-Realize_GainOrLoss_In_Ledger (DisplayUnRealizeGainOrLossInLedger)";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		////// Pick

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = " : 1";
		String actMessage = checkValidationMessage(expMessage1);

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkLedgerReportForCustomerAccountAsDisplayUnRealizeGainLossInLedger() throws InterruptedException,
			EncryptedDocumentException, InvalidFormatException, IOException, ParseException {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
		ledger.click();

		Thread.sleep(1500);
		Thread.sleep(1500);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("Display_Un-Realize_GainOrLoss_In_Ledger")) {
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s = new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(1500);

		String s1 = sl_2ndRow2ndCol.getText();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		String s2 = f.format(cal.getTime());

		System.out.println("VoucherDate String : " + s1);
		System.out.println("CurrentDate String : " + s2);

		Date VoucherDate = f.parse(s1);
		Date PresentDate = f.parse(s2);

		Calendar day1 = Calendar.getInstance();
		Calendar day2 = Calendar.getInstance();
		day1.setTime(VoucherDate);
		day2.setTime(PresentDate);

		int daysBetween = day2.get(Calendar.DAY_OF_YEAR) - day1.get(Calendar.DAY_OF_YEAR);

		String delayInPayment = String.valueOf(daysBetween);

		System.err.println("DelayInPayment : " + daysBetween);

		String currentdate = f.format(cal.getTime()).toString();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));

		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsRow1ListCount; i++) {
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Display_Un-Realize_GainOrLoss_In_Ledger [DisplayUnRealizeGainOrLossInLedger]]";

		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for (int i = 1; i < report2ndRowListCount; i++) {
			String data = report2ndRowList.get(i).getText();

			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();

		String expRow2List = "[" + currentdate
				+ ", PurVou : 3, Purchase, , 650.00, 650.00, , 650.00, 650.00, , 32.50, 32.50, United Arab Emirates Dirham]";

		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for (int i = 1; i < report3rdRowListCount; i++) {
			String data = report3rdRowList.get(i).getText();

			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[" + currentdate
				+ ", NDT55 : 5, Sales - Computers, 42.00, , 608.00, 42.00, , 608.00, 2.10, , 30.40, United Arab Emirates Dirham]";

		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for (int i = 1; i < report4thRowListCount; i++) {
			String data = report4thRowList.get(i).getText();

			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[" + currentdate
				+ ", NDT55 : 5, Sales - Computers, 63.00, , 545.00, 63.00, , 545.00, 3.15, , 27.25, United Arab Emirates Dirham]";

		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for (int i = 1; i < report5thRowListCount; i++) {
			String data = report5thRowList.get(i).getText();

			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[" + currentdate
				+ ", Rct : 1, Bank, , 200.00, 745.00, , 200.00, 745.00, , 12.00, 39.25, United Arab Emirates Dirham]";

		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for (int i = 1; i < report6thRowListCount; i++) {
			String data = report6thRowList.get(i).getText();

			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[Total, , , 105.00, 850.00, 745.00, 105.00, 850.00, 745.00, 5.25, 44.50, 39.25, ]";

		System.out.println("actRow1List  : " + actRow1List);
		System.out.println("expRow1List  : " + expRow1List);
		System.out.println("*********************************************************************");

		System.out.println("actRow2List  : " + actRow2List);
		System.out.println("expRow2List  : " + expRow2List);
		System.out.println("*********************************************************************");

		System.out.println("actRow3List  : " + actRow3List);
		System.out.println("expRow3List  : " + expRow3List);
		System.out.println("*********************************************************************");

		System.out.println("actRow4List  : " + actRow4List);
		System.out.println("expRow4List  : " + expRow4List);
		System.out.println("*********************************************************************");

		System.out.println("actRow5List  : " + actRow5List);
		System.out.println("expRow5List  : " + expRow5List);

		System.out.println("*********************************************************************");

		System.out.println("actRow6List  : " + actRow6List);
		System.out.println("expRow6List  : " + expRow6List);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				&& actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List)
				&& actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)) {
			return true;
		} else {
			return false;
		}
	}

	// Consolidate when both Accounts are same

	public static boolean checkCreatingAccountForConsolidateWhenBothAccountsAreSame()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(1500);

		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		Thread.sleep(1500);

		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("Consolidate_When_Both_Accounts_Are_Same");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("ConsolidateWhenBothAccountsAreSame");

		Thread.sleep(1500);

		Select accountTypeDrpdwn = new Select(accountTypeDropdown);

		accountTypeDrpdwn.selectByVisibleText("Cash");

		System.out.println(
				"***********************************checkCreatingAccountForConsolidateWhenBothAccountsAreSame*********************************");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		String expMessage = "Saved Successfully";

		String actMessage = checkValidationMessage(expMessage);

		Thread.sleep(4000);

		checkValidationMessage("");
		if (actMessage.equalsIgnoreCase(expMessage)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkMasterAccountEnablingConsolidateWhenBothAccountsAreSameInProperties()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
		CloseBtn.click();

		Thread.sleep(3000);

		int count = masterGridBodyName.size();

		ArrayList<String> AccountNames = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);

			if (data.equalsIgnoreCase("Consolidate_When_Both_Accounts_Are_Same")) {
				Thread.sleep(1500);
				masterGridBodyChkbox.get(i).click();
				break;
			}
		}

		Thread.sleep(1500);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);

		Thread.sleep(4000);

		getFluentWebDriverWait()
				.until(ExpectedConditions.elementToBeClickable(consolidateWhenBothAccountsAreSameRadioBtn));
		consolidateWhenBothAccountsAreSameRadioBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		Thread.sleep(1500);
		checkValidationMessage("Saved Successfully");
		Thread.sleep(1200);

		for (int i = 0; i < count; i++) {
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);

			if (data.equalsIgnoreCase("Consolidate_When_Both_Accounts_Are_Same")) {
				Thread.sleep(1500);
				masterGridBodyChkbox.get(i).click();
				break;
			}
		}

		Thread.sleep(1500);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);
		Thread.sleep(1500);

		checkValidationMessage("");

		getFluentWebDriverWait()
				.until(ExpectedConditions.elementToBeClickable(consolidateWhenBothAccountsAreSameRadioBtn));

		boolean actconsolidateWhenBothAccountsAreSameRadioBtn = consolidateWhenBothAccountsAreSameRadioBtn.isSelected();
		boolean expconsolidateWhenBothAccountsAreSameRadioBtn = true;

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		Thread.sleep(1500);

		System.out.println(
				"***********************************checkMasterAccountEnablingConsolidateWhenBothAccountsAreSameInProperties*********************************");

		System.out.println(
				"consolidateWhenBothAccountsAreSameRadioBtn  : " + actconsolidateWhenBothAccountsAreSameRadioBtn
						+ "  Value Expected  " + expconsolidateWhenBothAccountsAreSameRadioBtn);

		if (actconsolidateWhenBothAccountsAreSameRadioBtn == expconsolidateWhenBothAccountsAreSameRadioBtn) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkSavingRecepitsVocherForValidatingConsolidateWhenBothAccountsAreSame()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Thread.sleep(3500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		Thread.sleep(1500);

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsVoucher));
		receiptsVoucher.click();

		Thread.sleep(6000);

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
		newCashBankAccountTxt.click();

		newCashBankAccountTxt.sendKeys(Keys.SPACE);

		int cashAndBAnkAccountListCount = cashAndBAnkAccountList.size();

		System.err.println("cashAndBAnkAccountListCount   : " + cashAndBAnkAccountListCount);

		for (int i = 0; i < cashAndBAnkAccountListCount; i++) {
			String data = cashAndBAnkAccountList.get(i).getText();

			if (data.equalsIgnoreCase("Consolidate_When_Both_Accounts_Are_Same")) {
				cashAndBAnkAccountList.get(i).click();

				break;
			}
		}

		newCashBankAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.SPACE);
		Thread.sleep(1500);
		int departmentcount = departmentListCount.size();

		System.err.println(departmentcount);

		for (int i = 0; i < departmentcount; i++) {
			String data = departmentListCount.get(i).getText();

			if (data.equalsIgnoreCase("INDIA")) {
				departmentListCount.get(i).click();
				break;
			}
		}

		Thread.sleep(1000);

		departmentTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
		enter_AccountTxt.click();
		enter_AccountTxt.sendKeys("Customer A");
		Thread.sleep(1500);
		enter_AccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
		enter_Amount.sendKeys("100");
		enter_Amount.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
		select2ndRow_1stColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
		enter_AccountTxt.click();
		enter_AccountTxt.sendKeys("Customer B");
		Thread.sleep(1500);
		enter_AccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
		enter_Amount.sendKeys("200");
		enter_Amount.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_1stColumn));
		select3rdRow_1stColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
		enter_AccountTxt.click();
		enter_AccountTxt.sendKeys("Customer A");
		Thread.sleep(1500);
		enter_AccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
		enter_Amount.sendKeys("300");
		enter_Amount.sendKeys(Keys.TAB);

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		System.out.println(
				"*********************************************************************************************************");

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = " : 2";
		String actMessage = checkValidationMessage(expMessage1);

		if (actMessage.startsWith(expMessage1)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkSavingRecepitsVocherForValidatingConsolidateWhenBothAccountsAreSame2()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsVoucher));
		receiptsVoucher.click();

		Thread.sleep(3000);

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
		newCashBankAccountTxt.click();

		newCashBankAccountTxt.sendKeys(Keys.SPACE);

		int cashAndBAnkAccountListCount = cashAndBAnkAccountList.size();

		System.err.println("cashAndBAnkAccountListCount   : " + cashAndBAnkAccountListCount);

		for (int i = 0; i < cashAndBAnkAccountListCount; i++) {
			String data = cashAndBAnkAccountList.get(i).getText();

			if (data.equalsIgnoreCase("Consolidate_When_Both_Accounts_Are_Same")) {
				cashAndBAnkAccountList.get(i).click();

				break;
			}
		}

		newCashBankAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.SPACE);
		Thread.sleep(1500);
		int departmentcount = departmentListCount.size();

		System.err.println(departmentcount);

		for (int i = 0; i < departmentcount; i++) {
			String data = departmentListCount.get(i).getText();

			if (data.equalsIgnoreCase("INDIA")) {
				departmentListCount.get(i).click();
				break;
			}
		}

		Thread.sleep(1000);

		departmentTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
		enter_AccountTxt.click();
		enter_AccountTxt.sendKeys("Customer C");
		Thread.sleep(1500);
		enter_AccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
		enter_Amount.sendKeys("100");
		enter_Amount.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
		select2ndRow_1stColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
		enter_AccountTxt.click();
		enter_AccountTxt.sendKeys("Customer B");
		Thread.sleep(1500);
		enter_AccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
		enter_Amount.sendKeys("200");
		enter_Amount.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_1stColumn));
		select3rdRow_1stColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
		enter_AccountTxt.click();
		enter_AccountTxt.sendKeys("Customer C");
		Thread.sleep(1500);
		enter_AccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
		enter_Amount.sendKeys("300");
		enter_Amount.sendKeys(Keys.TAB);

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		System.out.println(
				"*********************************************************************************************************");

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = " : 3";
		String actMessage = checkValidationMessage(expMessage1);

		if (actMessage.startsWith(expMessage1)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkLedgerReportForConsolidateWhenBothAccountsAreSame()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		getDriver().navigate().refresh();
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
		ledger.click();

		Thread.sleep(5000);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("Consolidate_When_Both_Accounts_Are_Same")) {
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s = new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));

		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsRow1ListCount; i++) {
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Consolidate_When_Both_Accounts_Are_Same [ConsolidateWhenBothAccountsAreSame]]";

		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for (int i = 3; i < report2ndRowListCount; i++) {
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[Customer A, 400.00, , 400.00, 28.00, , 28.00, 400.00, , 400.00, Indian Rupees]";

		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for (int i = 3; i < report3rdRowListCount; i++) {
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[Customer B, 200.00, , 600.00, 14.00, , 42.00, 200.00, , 600.00, Indian Rupees]";

		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for (int i = 3; i < report4thRowListCount; i++) {
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[Customer B, 200.00, , 800.00, 14.00, , 56.00, 200.00, , 800.00, Indian Rupees]";

		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for (int i = 3; i < report5thRowListCount; i++) {
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[Customer C, 400.00, , 1,200.00, 28.00, , 84.00, 400.00, , 1,200.00, Indian Rupees]";

		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for (int i = 1; i < report6thRowListCount; i++) {
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[Total, , , 1,200.00, , 1,200.00, 84.00, , 84.00, 1,200.00, , 1,200.00, ]";

		System.out.println(
				"************************************checkLedgerReportForConsolidateWhenBothAccountsAreSame********************************************");

		System.out.println("actRow1List  : " + actRow1List);
		System.out.println("expRow1List  : " + expRow1List);
		System.out.println("*********************************************************************");

		System.out.println("actRow2List  : " + actRow2List);
		System.out.println("expRow2List  : " + expRow2List);
		System.out.println("*********************************************************************");

		System.out.println("actRow3List  : " + actRow3List);
		System.out.println("expRow3List  : " + expRow3List);
		System.out.println("*********************************************************************");

		System.out.println("actRow4List  : " + actRow4List);
		System.out.println("expRow4List  : " + expRow4List);
		System.out.println("*********************************************************************");

		System.out.println("actRow5List  : " + actRow5List);
		System.out.println("expRow5List  : " + expRow5List);
		System.out.println("*********************************************************************");

		System.out.println("actRow6List  : " + actRow6List);
		System.out.println("expRow6List  : " + expRow6List);
		System.out.println("*********************************************************************");

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				&& actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List)
				&& actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)) {
			return true;
		} else {
			return false;
		}
	}

	// Consolidate Always

	public static boolean checkCreatingAccountForConsolidateAlways()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(1500);

		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		Thread.sleep(1500);

		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("Consolidate_Always");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("ConsolidateAlways");

		Thread.sleep(1500);

		Select accountTypeDrpdwn = new Select(accountTypeDropdown);

		accountTypeDrpdwn.selectByVisibleText("Cash");

		System.out.println(
				"***********************************checkCreatingAccountForConsolidateAlways*********************************");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		String expMessage = "Saved Successfully";

		String actMessage = checkValidationMessage(expMessage);

		Thread.sleep(3000);

		checkValidationMessage("");

		if (actMessage.equalsIgnoreCase(expMessage)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkMasterAccountEnablingConsolidateAlwaysInProperties()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
		CloseBtn.click();

		Thread.sleep(4000);

		int count = masterGridBodyName.size();

		ArrayList<String> AccountNames = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);

			if (data.equalsIgnoreCase("Consolidate_Always")) {
				masterGridBodyChkbox.get(i).click();
				break;
			}
		}

		Thread.sleep(1500);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);

		Thread.sleep(4000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(consolidateAlwaysRadioBtn));
		consolidateAlwaysRadioBtn.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		Thread.sleep(3500);
		checkValidationMessage("Saved Successfully");
		Thread.sleep(1200);

		for (int i = 0; i < count; i++) {
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);

			if (data.equalsIgnoreCase("Consolidate_Always")) {
				masterGridBodyChkbox.get(i).click();
				break;
			}
		}

		Thread.sleep(2000);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);

		checkValidationMessage("");

		Thread.sleep(5000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(consolidateAlwaysRadioBtn));

		boolean actconsolidateAlwaysRadioBtn = consolidateAlwaysRadioBtn.isSelected();
		boolean expconsolidateAlwaysRadioBtn = true;

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();
		Thread.sleep(5000);

		System.out.println(
				"***********************************checkMasterAccountEnablingConsolidateAlwaysInProperties*********************************");

		System.out.println("consolidateAlwaysRadioBtn  : " + actconsolidateAlwaysRadioBtn + "  Value Expected  "
				+ expconsolidateAlwaysRadioBtn);

		if (actconsolidateAlwaysRadioBtn == expconsolidateAlwaysRadioBtn) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkSavingRecepitsVocherForValidatingConsolidateAlways()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		Thread.sleep(1500);

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsVoucher));
		receiptsVoucher.click();

		Thread.sleep(6000);

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
		newCashBankAccountTxt.click();

		newCashBankAccountTxt.sendKeys(Keys.SPACE);

		int cashAndBAnkAccountListCount = cashAndBAnkAccountList.size();

		System.err.println("cashAndBAnkAccountListCount   : " + cashAndBAnkAccountListCount);

		for (int i = 0; i < cashAndBAnkAccountListCount; i++) {
			String data = cashAndBAnkAccountList.get(i).getText();

			if (data.equalsIgnoreCase("Consolidate_Always")) {
				cashAndBAnkAccountList.get(i).click();

				break;
			}
		}

		newCashBankAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.SPACE);
		Thread.sleep(1500);
		int departmentcount = departmentListCount.size();

		System.err.println(departmentcount);

		for (int i = 0; i < departmentcount; i++) {
			String data = departmentListCount.get(i).getText();

			if (data.equalsIgnoreCase("INDIA")) {
				departmentListCount.get(i).click();
				break;
			}
		}

		Thread.sleep(1000);

		departmentTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
		enter_AccountTxt.click();
		enter_AccountTxt.sendKeys("Customer A");
		Thread.sleep(1500);
		enter_AccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
		enter_Amount.sendKeys("100");
		enter_Amount.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
		select2ndRow_1stColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
		enter_AccountTxt.click();
		enter_AccountTxt.sendKeys("Customer B");
		Thread.sleep(1500);
		enter_AccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
		enter_Amount.sendKeys("200");
		enter_Amount.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_1stColumn));
		select3rdRow_1stColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
		enter_AccountTxt.click();
		enter_AccountTxt.sendKeys("Customer C");
		Thread.sleep(1500);
		enter_AccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
		enter_Amount.sendKeys("300");
		enter_Amount.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		System.out.println(
				"*********************************************************************************************************");

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = " : 3";
		String actMessage = checkValidationMessage(expMessage1);

		if (actMessage.startsWith(expMessage1)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkLedgerReportForConsolidateAlways()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Thread.sleep(1500);
		getDriver().navigate().refresh();
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
		ledger.click();

		Thread.sleep(5000);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("Consolidate_Always")) {
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s = new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));

		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsRow1ListCount; i++) {
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Consolidate_Always [ConsolidateAlways]]";

		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for (int i = 3; i < report2ndRowListCount; i++) {
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[Customer A, 600.00, , 600.00, 42.00, , 42.00, 600.00, , 600.00, Indian Rupees]";

		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for (int i = 1; i < report3rdRowListCount; i++) {
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[Total, , , 600.00, , 600.00, 42.00, , 42.00, 600.00, , 600.00, ]";

		System.out.println(
				"************************************checkLedgerReportForConsolidateAlways********************************************");

		System.out.println("actRow1List  : " + actRow1List);
		System.out.println("expRow1List  : " + expRow1List);
		System.out.println("*********************************************************************");

		System.out.println("actRow2List  : " + actRow2List);
		System.out.println("expRow2List  : " + expRow2List);
		System.out.println("*********************************************************************");

		System.out.println("actRow3List  : " + actRow3List);
		System.out.println("expRow3List  : " + expRow3List);
		System.out.println("*********************************************************************");

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				&& actRow3List.equalsIgnoreCase(expRow3List)) {
			return true;
		} else {
			return false;
		}
	}

	// Active and In Active

	public static boolean checkAccouncreatedWithPropertAsStatusIsActive()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(5000);

		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		Thread.sleep(1500);

		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("cust_display_when_StatusIsActive");
		nameTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("CustActive");
		codeTxt.sendKeys(Keys.TAB);

		Select accountTypeDrpdwn = new Select(accountTypeDropdown);

		accountTypeDrpdwn.selectByVisibleText("Customer");

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		String expSaveAccountMessage = "Saved Successfully";
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(4000);

		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
		CloseBtn.click();

		Thread.sleep(4000);
		System.out.println("Click on Save With Valid Information Value Actual : " + actSaveAccountMessage
				+ "  Value Expected : " + expSaveAccountMessage);

		if (actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkPropertiesForCreatedAccountAsDisplayWhenStatusIsActive()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		Thread.sleep(2500);
		int count = masterGridBodyName.size();

		ArrayList<String> AccountNames = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);

			if (data.equalsIgnoreCase("cust_display_when_StatusIsActive")) {
				masterGridBodyChkbox.get(i).click();
				break;
			}
		}

		Thread.sleep(1500);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);

		Thread.sleep(4000);

		Thread.sleep(1500);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", statusDropDownInAcoountProperties);
		Thread.sleep(1000);

		Select statusDropdown = new Select(statusDropDownInAcoountProperties);

		statusDropdown.selectByVisibleText("Active");

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		Thread.sleep(2000);
		checkValidationMessage("Saved Successfully");
		Thread.sleep(5000);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);
		checkValidationMessage("");

		Thread.sleep(3500);
		jse.executeScript("arguments[0].scrollIntoView(true);", statusDropDownInAcoountProperties);
		Thread.sleep(1000);

		String actStatus = statusDropdown.getFirstSelectedOption().getText();
		String expStatus = "Active";

		Thread.sleep(1500);

		System.out.println("Status : " + actStatus + "  Value Expected  " + expStatus);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		if (actStatus.equalsIgnoreCase(expStatus)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkRaiseSalesIvoiceForCustomerAccountCustDisplayWhenStatusIsActive()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		Thread.sleep(3000);
		checkSalesInvoiceVATHeader(getCurrentDateF2(), "cust_Display_when_StatusIsActive", "India", "Abu Dhabi",
				"DUBAI");

		checkSaveSalesInvoiceVAT(1, 2, "Hyderabad", "STD RATE COGS ITEM", 6, 9, "1", 15, "200", 18);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(2500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);

		if (actMessage.startsWith(expMessage)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkCustomerStatementsReportForCustDisplayWhenStatusIsActive() throws InterruptedException {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		customerDetailMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait()
				.until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerStatementsReport));
		customerDetailsCustomerStatementsReport.click();

		Thread.sleep(1500);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("cust_Display_when_StatusIsActive")) {
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s = new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(1500);

		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow1ListCount; i++) {
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[cust_Display_when_StatusIsActive [CustActive]]";

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for (int i = 3; i < reportsByWarehouseRow2ListCount - 2; i++) {
			String data = reportsRow2List.get(i).getText();
			if (i == 13) {
				reportsByWarehouseRow2ListArray.add("Delay in Payment");
			} else {
				reportsByWarehouseRow2ListArray.add(data);
			}
		}

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		String currentDate = f.format(cal.getTime());

		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[cust_display_when_StatusIsActive, 210.00, , , 210.00, 210.00, 210.00, , , 210.00, Delay in Payment, Indian Rupees, "
				+ currentDate + ", CustActive, INDIA, INDIA, 14.70, , , 14.70]";

		int reportsByWarehouseRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow3ListCount - 2; i++) {
			String data = reportsRow3List.get(i).getText();
			if (i == 13) {
				reportsByWarehouseRow3ListArray.add("Delay in Payment");
			} else {
				reportsByWarehouseRow3ListArray.add(data);
			}
		}
		String actRow3List = reportsByWarehouseRow3ListArray.toString();
		String expRow3List = "[Total, , , 210.00, , , 210.00, 210.00, 210.00, , , 210.00, Delay in Payment, , , , , , 14.70, , , 14.70]";

		System.out.println(
				"*********************************checkCustomerStatementsReportForCustDisplayWhenStatusIsActive*****************************************");

		System.out.println("ActualRow1List Values   " + actRow1List);
		System.out.println("ExpectedRow1List Values " + expRow1List);

		System.out.println("ActualRow2List Values  " + actRow2List);
		System.out.println("ExpectedRow1List Values" + expRow2List);

		System.out.println("ActualRow3List Values  " + actRow3List);
		System.out.println("ExpectedRow3List Values" + expRow3List);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				&& actRow3List.equalsIgnoreCase(expRow3List)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkReportDetailsInLedgerReportPageForCustomerAccountStatusAsActive()
			throws InterruptedException {
		Thread.sleep(2500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
		ledger.click();

		Thread.sleep(5000);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("cust_Display_when_StatusIsActive")) {
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s = new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));

		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow1ListCount; i++) {
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[cust_Display_when_StatusIsActive [CustActive]]";

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for (int i = 3; i < reportsByWarehouseRow2ListCount; i++) {
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[Sales - Computers, 210.00, , 210.00, 14.70, , 14.70, 210.00, , 210.00, Indian Rupees]";

		int reportsByWarehouseRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow3ListCount; i++) {
			String data = reportsRow3List.get(i).getText();
			reportsByWarehouseRow3ListArray.add(data);
		}
		String actRow3List = reportsByWarehouseRow3ListArray.toString();
		String expRow3List = "[Total, , , 210.00, , 210.00, 14.70, , 14.70, 210.00, , 210.00, ]";

		System.out.println(
				"*********************************checkReportDetailsInLedgerReportPageForCustomerAccountStatusAsActive*****************************************");

		System.out.println("ActualRow1List Values   " + actRow1List);
		System.out.println("ExpectedRow1List Values " + expRow1List);

		System.out.println("ActualRow2List Values  " + actRow2List);
		System.out.println("ExpectedRow1List Values" + expRow2List);

		System.out.println("ActualRow3List Values  " + actRow3List);
		System.out.println("ExpectedRow3List Values" + expRow3List);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				&& actRow3List.equalsIgnoreCase(expRow3List)) {
			return true;
		} else {
			return false;
		}
	}

	// In Active

	public static boolean checkChangeAccountPropertyFromActiveToInActive()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Thread.sleep(2500);

		getDriver().navigate().refresh();
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(6000);

		int count = masterGridBodyName.size();

		ArrayList<String> AccountNames = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);

			if (data.equalsIgnoreCase("cust_display_when_StatusIsActive")) {
				masterGridBodyChkbox.get(i).click();
				break;
			}
		}

		Thread.sleep(1500);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);

		Thread.sleep(5000);

		// JavascriptExecutor jse= (JavascriptExecutor)getDriver();
		// jse.executeScript("arguments[0].scrollIntoView(true);",
		// statusDropDownInAcoountProperties);
		// Thread.sleep(1000);

		getAction().moveToElement(statusDropDownInAcoountProperties).build().perform();
		Thread.sleep(2500);
		Select statusDropdown = new Select(statusDropDownInAcoountProperties);

		statusDropdown.selectByVisibleText("In Active");

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		Thread.sleep(4000);
		checkValidationMessage("Saved Successfully");
		Thread.sleep(2000);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);
		checkValidationMessage("");

		Thread.sleep(5000);

		// jse.executeScript("arguments[0].scrollIntoView(true);",
		// statusDropDownInAcoountProperties);

		getAction().moveToElement(statusDropDownInAcoountProperties).build().perform();
		Thread.sleep(1000);

		String actStatus = statusDropdown.getFirstSelectedOption().getText();
		String expStatus = "In Active";

		Thread.sleep(1500);

		System.out.println("Status : " + actStatus + "  Value Expected  " + expStatus);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		Thread.sleep(4000);
		if (actStatus.equalsIgnoreCase(expStatus)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkLogoutAndLoginToCheckCustomerStatementsReports() throws InterruptedException {
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(LogoutDropdown));
		LogoutDropdown.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();

		Thread.sleep(2500);

		LoginPage lp = new LoginPage(getDriver());

		String unamelt = "su";

		String pawslt = "su";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
		username.click();
		Thread.sleep(1500);
		username.clear();
		Thread.sleep(1500);
		username.sendKeys(unamelt);
		// getAction().moveToElement(username).sendKeys(Keys.TAB).perform();

		/*
		 * getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(
		 * password)); password.click(); Thread.sleep(1500); password.clear();
		 */
		Thread.sleep(1500);
		password.sendKeys(pawslt);

		String compname = "Account Properties And Customization";

		Select oSelect = new Select(companyDropDownList);

		List<WebElement> elementCount = oSelect.getOptions();

		int cqSize = elementCount.size();

		int zqSize = cSize + 1;

		System.out.println("CompanyDropdownList Count :" + cqSize);

		System.out.println("Company dropdown is :" + zqSize);

		// Select dropdown= new Select(lp.companyDropDownList);
		int i;

		// List<WebElement> list = dropdown.getOptions();

		// List<String> text = new ArrayList<>();
		for (i = 0; i < elementCount.size(); i++) {
			elementCount.get(i).getText();
			String optionName = elementCount.get(i).getText();
			if (optionName.toUpperCase().startsWith(compname.toUpperCase())) {
				System.out.println("q" + elementCount.get(i).getText());
				elementCount.get(i).click();
			}
		}

		lp.clickOnSignInBtn();

		Thread.sleep(1500);

		reLogin(unamelt, pawslt, "Account Properties And Customization ");

		// checkRefershPopOnlogin();

		// checkPopUpWindow();

		Thread.sleep(8000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(usernametxt1));
		// usernametxt.click();

		String userInfo = usernametxt1.getText();

		System.out.println("User Info : " + userInfo);

		System.out.println("User Info Capture Text :" + usernametxt1.getText());

		/*
		 * getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(
		 * companyLogoImg));
		 * 
		 * companyLogoImg.click();
		 * 
		 * String getCompanyTxt=companyName.getText(); String
		 * getLoginCompanyName=getCompanyTxt.substring(0, 36);
		 * System.out.println("company name :"+ getLoginCompanyName);
		 * companyLogoImg.click();
		 */
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));

		String getDashboard = dashboardName.getText();

		System.out.println(getDashboard);

		String expuserInfo = "SU";
		String expLoginCompanyName = "Account Properties And Customization ";
		String expDashboard = "Graph with Active and setAsDefault";

		System.out.println(
				"***********************************checkLogoutAndLoginAfterEnablingMandatoryCheckboxInFieldsProperties*********************************");

		System.out.println("User Info                        : " + userInfo + "  value expected  " + expuserInfo);
		// System.out.println("Login Company Name : "+getLoginCompanyName +" value
		// expected "+expLoginCompanyName);
		System.out.println("Dashboard                        : " + getDashboard + "  value expected  " + expDashboard);

		if (userInfo.equalsIgnoreCase(expuserInfo) /* && getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName) */) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkSalesInvoiceVatForInactiveAccount()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSales));
		financialsTransactionsSales.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
		salesInvoiceVATVoucher.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("cust_Display_when_StatusIsActive");

		int count = customerAccountComboList.size();
		ArrayList<String> accountList = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = customerAccountComboList.get(i).getText();
			accountList.add(data);
			break;
		}

		String actaccountList = accountList.toString();
		String expaccountList = "[]";

		System.out.println("actaccountList:  " + actaccountList);
		System.out.println("expaccountList:  " + expaccountList);

		if (actaccountList.equalsIgnoreCase(expaccountList)) {

			return true;
		} else {

			return false;
		}
	}

	public static boolean checkLedgerIsEmptyForCustomerAccountStatusAsInActive() throws InterruptedException {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
		ledger.click();

		Thread.sleep(1500);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("cust_Display_when_StatusIsActive")) {
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s = new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(1500);

		boolean actTableIsEmpty = ledgerTable.getText().isEmpty();
		boolean expTableIsEmpty = true;

		System.out.println(
				"*********************************checkLedgerIsEmptyForCustomerAccountStatusAsInActive*****************************************");

		System.out.println("Ledger Table isEmpty : " + actTableIsEmpty + "  Value Expected  " + expTableIsEmpty);

		if (actTableIsEmpty == expTableIsEmpty) {
			return true;
		} else {
			return false;
		}
	}

	// Do not restrict the selection even if rights are not allotted

	public static boolean checkCreatingAccountForDoNotRestrictTheSelectionEvenIfRightsAreNotAllotted()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		Thread.sleep(1500);

		getDriver().navigate().refresh();
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(4000);

		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		Thread.sleep(1500);

		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("DoNot_Restrict_If_Rights_Are_Not_Allotted");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("DoNotRestrictIfRightsAreNotAllotted");

		Thread.sleep(1500);

		Select accountTypeDrpdwn = new Select(accountTypeDropdown);

		accountTypeDrpdwn.selectByVisibleText("Customer");

		System.out.println(
				"***********************************checkCreatingAccountForDoNotRestrictTheSelectionEvenIfRightsAreNotAllotted*********************************");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		Thread.sleep(2000);

		checkValidationMessage("");

		String expMessage = "Saved Successfully";

		String actMessage = checkValidationMessage(expMessage);

		Thread.sleep(3000);

		click(CloseBtn);
		Thread.sleep(4000);

		if (actMessage.equalsIgnoreCase(expMessage)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkUserCreationForRestrictionOfAccount()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Thread.sleep(2500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
		securityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserMenu));
		createUserMenu.click();

		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		createUserIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		createUserLoginNameTxt.click();
		createUserLoginNameTxt.sendKeys("AccountRestrictUser");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		createUserERPRoleDropDown.click();
		createUserERPRoleDropDown.sendKeys("SampleRole1");

		int count = createUserERPRolesDropdownOptions.size() - 1;
		System.out.println("Count " + count);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.sendKeys("12345");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.sendKeys("12345");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		createUserNameTxt.sendKeys("UserForAccountRestriction");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginAbbrivationTxt));
		createUserLoginAbbrivationTxt.sendKeys("UFAR");

		createUserSecurityQuestionDropDown.click();
		Select s = new Select(createUserSecurityQuestionDropDown);
		s.selectByVisibleText("In which country were you born?");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityAnswerTxt));
		createUserSecurityAnswerTxt.sendKeys("India");

		createUserTimeZone.click();
		Select s1 = new Select(createUserTimeZone);
		s1.selectByVisibleText("(GMT+05:30) Chennai, Kolkatta, Mumbai, New Delhi");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		createUserAdditionalInfoTab.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
		Select user = new Select(createUserUserTypeDrpDwn);
		user.selectByVisibleText("Customer");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		createUserEmailTxt.click();
		createUserEmailTxt.clear();
		createUserEmailTxt.sendKeys("accountrestrection@focussoftnet.com");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserRestrictionforentryTab));
		createUserRestrictionforentryTab.click();

		Thread.sleep(4000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictEntryMasterAccount));
		restrictEntryMasterAccount.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTable1stRow1stCol));
		restrictForEntryTable1stRow1stCol.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableMastersCombo));
		restrictForEntryTableMastersCombo.sendKeys("Vendor B");
		Thread.sleep(2000);
		restrictForEntryTableMastersCombo.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow1EntryChkbox));
		restrictForEntryTableRow1EntryChkbox.click();
		// restrictForEntryTableRow1EntryChkbox.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow1ReportChkbox));
		restrictForEntryTableRow1ReportChkbox.click();
		// restrictForEntryTableRow1ReportChkbox.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow1ViewChkbox));
		restrictForEntryTableRow1ViewChkbox.click();
		// restrictForEntryTableRow1ViewChkbox.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTable2ndRow1stCol));
		restrictForEntryTable2ndRow1stCol.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableMastersCombo));
		restrictForEntryTableMastersCombo.sendKeys("Display_Un-Realize_GainOrLoss_In_Ledger");
		Thread.sleep(1500);
		restrictForEntryTableMastersCombo.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow2EntryChkbox));
		restrictForEntryTableRow2EntryChkbox.click();
		// restrictForEntryTableRow2EntryChkbox.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow2ReportChkbox));
		restrictForEntryTableRow2ReportChkbox.click();
		// restrictForEntryTableRow2ReportChkbox.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow2ViewChkbox));
		restrictForEntryTableRow2ViewChkbox.click();
		// restrictForEntryTableRow2ViewChkbox.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTable3rdRow1stCol));
		restrictForEntryTable3rdRow1stCol.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableMastersCombo));
		restrictForEntryTableMastersCombo.sendKeys("Sales - Computers");
		Thread.sleep(2000);
		restrictForEntryTableMastersCombo.sendKeys(Keys.TAB);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow3EntryChkbox));
		restrictForEntryTableRow3EntryChkbox.click();
		// restrictForEntryTableRow3EntryChkbox.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow3ReportChkbox));
		restrictForEntryTableRow3ReportChkbox.click();
		// restrictForEntryTableRow3ReportChkbox.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow3ViewChkbox));
		restrictForEntryTableRow3ViewChkbox.click();
		// restrictForEntryTableRow3ViewChkbox.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTable4thRow1stCol));
		restrictForEntryTable4thRow1stCol.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableMastersCombo));
		restrictForEntryTableMastersCombo.sendKeys("Purchase");
		Thread.sleep(1500);
		restrictForEntryTableMastersCombo.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow4EntryChkbox));
		restrictForEntryTableRow4EntryChkbox.click();
		// restrictForEntryTableRow4EntryChkbox.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow4ReportChkbox));
		restrictForEntryTableRow4ReportChkbox.click();
		// restrictForEntryTableRow4ReportChkbox.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow4ViewChkbox));
		restrictForEntryTableRow4ViewChkbox.click();
		// restrictForEntryTableRow4ViewChkbox.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		String expMessage = "new user created successfully";
		String actMessage = checkValidationMessage(expMessage);

		System.out.println(actMessage);
		System.out.println(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkSavingSalesInvoivesVATWithCustomerAccountAsDoNotRestrictIfRightsAreNotAllotted()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		checkSalesInvoiceVATHeader(getCurrentDateF2(), "DoNot_Restrict_If_Rights_Are_Not_Allotted", "India",
				"Abu Dhabi", "DUBAI");

		checkSaveSalesInvoiceVAT(1, 2, "Hyderabad", "STD RATE COGS ITEM", 6, 9, "1", 15, "200", 18);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);

		if (actMessage.startsWith(expMessage)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkLogoutAndLoginWithAccountRestrictUser()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		Thread.sleep(2500);
		getDriver().navigate().refresh();
		Thread.sleep(4000);

		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(LogoutDropdown));
		LogoutDropdown.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();

		Thread.sleep(2500);

		LoginPage lp = new LoginPage(getDriver());

		String unamelt = "AccountRestrictUser";

		String pawslt = "12345";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
		username.click();
		Thread.sleep(1500);
		username.clear();
		Thread.sleep(1500);
		username.sendKeys(unamelt);
		// getAction().moveToElement(username).sendKeys(Keys.TAB).perform();

		/*
		 * getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(
		 * password)); password.click(); Thread.sleep(1500); password.clear();
		 */
		Thread.sleep(1500);
		password.sendKeys(pawslt);

		String compname = "Account Properties And Customization";

		Select oSelect = new Select(companyDropDownList);

		List<WebElement> elementCount = oSelect.getOptions();

		int cqSize = elementCount.size();

		int zqSize = cSize + 1;

		System.out.println("CompanyDropdownList Count :" + cqSize);

		System.out.println("Company dropdown is :" + zqSize);

		// Select dropdown= new Select(lp.companyDropDownList);
		int i;

		// List<WebElement> list = dropdown.getOptions();

		// List<String> text = new ArrayList<>();
		for (i = 0; i < elementCount.size(); i++) {
			elementCount.get(i).getText();
			String optionName = elementCount.get(i).getText();
			if (optionName.toUpperCase().startsWith(compname.toUpperCase())) {
				System.out.println("q" + elementCount.get(i).getText());
				elementCount.get(i).click();
			}
		}

		lp.clickOnSignInBtn();

		Thread.sleep(1500);

		// reLogin(unamelt, pawslt, "Account Properties And Customization");

		// checkRefershPopOnlogin();

		// checkPopUpWindow();

		Thread.sleep(8000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(usernametxt1));
		// usernametxt.click();

		Thread.sleep(1000);
		String userInfo = usernametxt1.getText();

		System.out.println("User Info : " + userInfo);

		System.out.println("User Info Capture Text :" + usernametxt1.getText());

		/*
		 * getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(
		 * companyLogoImg)); companyLogoImg.click();
		 * 
		 * String getCompanyTxt=companyName.getText(); String
		 * getLoginCompanyName=getCompanyTxt.substring(0, 36);
		 * System.out.println("company name :"+ getLoginCompanyName);
		 * companyLogoImg.click();
		 */

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));

		String getDashboard = dashboardName.getText();

		System.out.println(getDashboard);

		String expuserInfo = "AccountRestrictUser";
		String expLoginCompanyName = "Account Properties And Customization ";
		String expDashboard = "Graph with Active and setAsDefault";

		System.out.println("***********************************checkLogin*********************************");

		System.out.println("User Info                        : " + userInfo + "  value expected  " + expuserInfo);
		// System.out.println("Login Company Name : "+getLoginCompanyName +" value
		// expected "+expLoginCompanyName);
		System.out.println("Dashboard                        : " + getDashboard + "  value expected  " + expDashboard);

		if (userInfo.equalsIgnoreCase(expuserInfo) /* && getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName) */) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkLedgerReportForUserRestrictAccountWithoutEnablingDoNotRestrictTheSelectionEvenIfRightsAreNotAllottedOption()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
		ledger.click();

		Thread.sleep(6000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));
		masterSearchTxt.click();
		masterSearchTxt.sendKeys("DoNot_Restrict_If_Rights_Are_Not_Allotted");
		masterSearchTxt.sendKeys(Keys.ENTER);

		Thread.sleep(1500);

		String actRestrictedAccount = reportAccountsTable.getText();
		String expRestrictedAccount = "No record found";

		System.out.println(
				"************************************checkLedgerReportForUserRestrictAccountWithoutEnablingDoNotRestrictTheSelectionEvenIfRightsAreNotAllottedOption********************************************");

		System.out
				.println("Restricted Account : " + actRestrictedAccount + "  Value Expected  " + expRestrictedAccount);

		if (actRestrictedAccount.equalsIgnoreCase(expRestrictedAccount)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkSalesInvoivesVATWithOutEnablingDoNotRestrictIfRightsAreNotAllottedOption()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		getDriver().navigate().refresh();
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSales));
		financialsTransactionsSales.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
		salesInvoiceVATVoucher.click();

		Thread.sleep(1500);

		int actNoOfVouchers = voucherNumberList.size() - 1;
		int expNoOfVouchers = 7;

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

		boolean restrict = true;

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(1500);

		int count = customerAccountComboList.size();

		for (int i = 0; i < count; i++) {
			String data = customerAccountComboList.get(i).getText();

			if (data.equalsIgnoreCase("DoNot_Restrict_If_Rights_Are_Not_Allotted")) {
				restrict = false;
				System.err.println("***Account is Displaying Even After Restricting***");
				break;
			}
		}

		System.out.println(
				"********checkSalesInvoivesVATWithOutEnablingDoNotRestrictIfRightsAreNotAllottedOption********");

		System.out.println(
				"No Of Vouchers Displaying            : " + actNoOfVouchers + "  Value Expected  " + expNoOfVouchers);
		System.out.println("Restricted Account Is Not Displaying : " + restrict + "  Value Expected  " + "true");

		if (actNoOfVouchers == expNoOfVouchers && restrict == true) {
			getDriver().navigate().refresh();
			Thread.sleep(1500);
			return true;
		} else {
			getDriver().navigate().refresh();
			Thread.sleep(1500);
			return false;
		}
	}

	public static boolean checkMasterAccountEnablingDoNotRestrictTheSelectionEvenIfRightsAreNotAllottedOption()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(3500);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("DoNot_Restrict_If_Rights_Are_Not_Allotted")) {
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}

		int count = masterGridBodyName.size();

		ArrayList<String> AccountNames = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);

			if (data.equalsIgnoreCase("DoNot_Restrict_If_Rights_Are_Not_Allotted")) {
				masterGridBodyChkbox.get(i).click();
				break;
			}
		}

		Thread.sleep(1500);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);

		Thread.sleep(4000);

		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox);
		Thread.sleep(1000);

		getFluentWebDriverWait()
				.until(ExpectedConditions.elementToBeClickable(doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox));
		doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		Thread.sleep(3000);
		checkValidationMessage("Saved Successfully");
		Thread.sleep(1200);

		for (int i = 0; i < count; i++) {
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);

			if (data.equalsIgnoreCase("DoNot_Restrict_If_Rights_Are_Not_Allotted")) {
				masterGridBodyChkbox.get(i).click();
				break;
			}
		}

		Thread.sleep(1500);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);

		Thread.sleep(4000);

		jse.executeScript("arguments[0].scrollIntoView(true);", doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox);
		Thread.sleep(1000);

		getFluentWebDriverWait()
				.until(ExpectedConditions.elementToBeClickable(doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox));

		boolean actdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox = doNotRestrictSelectionEvenIfRightsNotAllottedCheckboxSelected
				.isSelected();
		boolean expdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox = true;

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		Thread.sleep(3000);

		System.out.println(
				"***********************************checkMasterAccountEnablingDoNotRestrictTheSelectionEvenIfRightsAreNotAllottedOption*********************************");

		System.out.println("doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox  : "
				+ actdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox + "  Value Expected  "
				+ expdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox);

		if (actdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox == expdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkLedgerReportForUserRestrictAccountWithDoNotRestrictTheSelectionEvenIfRightsAreNotAllottedOption()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
		ledger.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));
		masterSearchTxt.click();
		masterSearchTxt.sendKeys("DoNot_Restrict_If_Rights_Are_Not_Allotted");
		masterSearchTxt.sendKeys(Keys.ENTER);

		Thread.sleep(1500);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("DoNot_Restrict_If_Rights_Are_Not_Allotted")) {
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s = new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));

		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsRow1ListCount; i++) {
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[DoNot_Restrict_If_Rights_Are_Not_Allotted [DoNotRestrictIfRightsAreNotAllotted]]";

		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for (int i = 2; i < report2ndRowListCount; i++) {
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[NDT55 : 7, Sales - Computers, 210.00, , 210.00, 14.70, , 14.70, 210.00, , 210.00, Indian Rupees]";

		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for (int i = 1; i < report3rdRowListCount; i++) {
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[Total, , , 210.00, , 210.00, 14.70, , 14.70, 210.00, , 210.00, ]";

		System.out.println(
				"************************************checkLedgerReportForUserRestrictAccountWithDoNotRestrictTheSelectionEvenIfRightsAreNotAllottedOption********************************************");

		System.out.println("actRow1List  : " + actRow1List);
		System.out.println("expRow1List  : " + expRow1List);
		System.out.println("*********************************************************************");

		System.out.println("actRow2List  : " + actRow2List);
		System.out.println("expRow2List  : " + expRow2List);
		System.out.println("*********************************************************************");

		System.out.println("actRow3List  : " + actRow3List);
		System.out.println("expRow3List  : " + expRow3List);
		System.out.println("*********************************************************************");

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				&& actRow3List.equalsIgnoreCase(expRow3List)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkSalesInvoivesVATAfterEnablingDoNotRestrictIfRightsAreNotAllottedOption()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		getDriver().navigate().refresh();
		Thread.sleep(4000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSales));
		financialsTransactionsSales.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
		salesInvoiceVATVoucher.click();

		Thread.sleep(1500);

		int actNoOfVouchers = voucherNumberList.size() - 1;
		int expNoOfVouchers = 2;

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

		boolean restrict = false;

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(1500);

		int count = customerAccountComboList.size();

		for (int i = 0; i < count; i++) {
			String data = customerAccountComboList.get(i).getText();

			if (data.equalsIgnoreCase("DoNot_Restrict_If_Rights_Are_Not_Allotted")) {
				restrict = true;
				break;
			}
		}

		System.out
				.println("********checkSalesInvoivesVATAfterEnablingDoNotRestrictIfRightsAreNotAllottedOption********");

		System.out.println(
				"No Of Vouchers Displaying            : " + actNoOfVouchers + "  Value Expected  " + expNoOfVouchers);
		System.out.println("Restricted Account Is Not Displaying : " + restrict + "  Value Expected  " + "true");

		if (/* actNoOfVouchers==expNoOfVouchers && */ restrict == true) {
			getDriver().navigate().refresh();
			Thread.sleep(1500);
			return true;
		} else {
			getDriver().navigate().refresh();
			Thread.sleep(1500);
			return false;
		}
	}

	// Display ledger by currency

	public static boolean checkAccouncreatedWithPropertyAsDisplayLedgerByCurrency()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(4000);
		checkValidationMessage("");
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		Thread.sleep(1500);
		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("cust_display_ledger_by_currency");
		nameTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("CustLedger");
		codeTxt.sendKeys(Keys.TAB);

		Select accountTypeDrpdwn = new Select(accountTypeDropdown);

		accountTypeDrpdwn.selectByVisibleText("Customer");
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		Thread.sleep(2000);
		checkValidationMessage("");

		String expSaveAccountMessage = "Saved Successfully";
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
		CloseBtn.click();
		Thread.sleep(3000);

		System.out.println("Click on Save With Valid Information Value Actual : " + actSaveAccountMessage
				+ "  Value Expected : " + expSaveAccountMessage);

		if (actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkPropertiesForCreatedAccountAsDisplayLedgerByCurrency()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		Thread.sleep(3000);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("cust_display_ledger_by_currency")) {
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}

		Thread.sleep(1500);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		// ClickUsingJs(masterPropertiesBtn);
		masterPropertiesBtn.click();
		Thread.sleep(4000);

		// JavascriptExecutor jse= (JavascriptExecutor)getDriver();
		// jse.executeScript("arguments[0].scrollIntoView(true);",
		// displayLedgerByCurrencyCheckboxInProperties);

		getAction().moveToElement(displayLedgerByCurrencyCheckboxInProperties).build().perform();
		Thread.sleep(1000);

		getFluentWebDriverWait()
				.until(ExpectedConditions.elementToBeClickable(displayLedgerByCurrencyCheckboxInProperties));
		displayLedgerByCurrencyCheckboxInProperties.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		Thread.sleep(4000);
		checkValidationMessage("Saved Successfully");
		Thread.sleep(1200);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		// ClickUsingJs(masterPropertiesBtn);
		// checkValidationMessage("");
		masterPropertiesBtn.click();
		Thread.sleep(4000);

		// jse.executeScript("arguments[0].scrollIntoView(true);",
		// displayLedgerByCurrencyCheckboxInProperties);
		getAction().moveToElement(displayLedgerByCurrencyCheckboxInProperties).build().perform();
		Thread.sleep(1000);

		Thread.sleep(1500);

		getFluentWebDriverWait()
				.until(ExpectedConditions.elementToBeClickable(displayLedgerByCurrencyCheckboxInProperties));

		boolean actdisplayLedgerByCurrencyCheckboxInProperties = displayLedgerByCurrencyCheckboxInPropertiesSelected
				.isSelected();
		boolean expdisplayLedgerByCurrencyCheckboxInProperties = true;

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		System.out.println(
				"displayLedgerByCurrencyCheckboxInProperties : " + actdisplayLedgerByCurrencyCheckboxInProperties
						+ "  VAlue Expected  " + expdisplayLedgerByCurrencyCheckboxInProperties);

		if (actdisplayLedgerByCurrencyCheckboxInProperties == expdisplayLedgerByCurrencyCheckboxInProperties) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkRaiseSalesInvoivesVATForCustomerDisplayLedgerByCurrency()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		Thread.sleep(4000);

		checkSalesInvoiceVATHeader(getCurrentDateF2(), "cust_display_ledger_by_Currency", "India", "Abu Dhabi",
				"DUBAI");

		checkSaveSalesInvoiceVAT(1, 2, "Hyderabad", "STD RATE COGS ITEM", 6, 9, "1", 15, "200", 18);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);

		if (actMessage.startsWith(expMessage)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkLedgerDetailsForCustomerDisplayLedgerByCurrency() throws InterruptedException {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
		ledger.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));
		masterSearchTxt.click();
		masterSearchTxt.sendKeys("cust_display_ledger_by_Currency");
		masterSearchTxt.sendKeys(Keys.ENTER);

		Thread.sleep(1500);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("cust_display_ledger_by_Currency")) {
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s = new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));

		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow1ListCount; i++) {
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[cust_display_ledger_by_Currency [CustLedger]]";

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for (int i = 2; i < reportsByWarehouseRow2ListCount; i++) {
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[Indian Rupees, , , , , , , , , , , ]";

		int reportsByWarehouseRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
		for (int i = 2; i < reportsByWarehouseRow3ListCount; i++) {
			String data = reportsRow3List.get(i).getText();
			reportsByWarehouseRow3ListArray.add(data);
		}
		String actRow3List = reportsByWarehouseRow3ListArray.toString();
		String expRow3List = "[NDT55 : 8, Sales - Computers, 210.00, , 210.00, 14.70, , 14.70, 210.00, , 210.00, Indian Rupees]";

		int reportsByWarehouseRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsByWarehouseRow4ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow4ListCount; i++) {
			String data = reportsRow4List.get(i).getText();
			reportsByWarehouseRow4ListArray.add(data);
		}
		String actRow4List = reportsByWarehouseRow4ListArray.toString();
		String expRow4List = "[, Indian Rupees, , 210.00, , 210.00, 14.70, , 14.70, 210.00, , 210.00, ]";

		int reportsByWarehouseRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsByWarehouseRow5ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow5ListCount; i++) {
			String data = reportsRow5List.get(i).getText();
			reportsByWarehouseRow5ListArray.add(data);
		}
		String actRow5List = reportsByWarehouseRow5ListArray.toString();
		String expRow5List = "[Total, , , 210.00, , 210.00, 14.70, , 14.70, 210.00, , 210.00, ]";

		System.out.println(
				"*********************************checkLedgerDetailsForVendorB*****************************************");

		System.out.println("ActualRow1List Values   " + actRow1List);
		System.out.println("ExpectedRow1List Values " + expRow1List);

		System.out.println("ActualRow2List Values  " + actRow2List);
		System.out.println("ExpectedRow1List Values" + expRow2List);

		System.out.println("ActualRow3List Values  " + actRow3List);
		System.out.println("ExpectedRow3List Values" + expRow3List);

		System.out.println("ActualRow4List Values   " + actRow4List);
		System.out.println("ExpectedRow4List Values " + expRow4List);

		System.out.println("ActualRow5List Values   " + actRow5List);
		System.out.println("ExpectedRow5List Values " + expRow5List);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				&& actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List)
				&& actRow5List.equalsIgnoreCase(expRow5List)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkCustomerStatementsReportForCreatedCustomerAccountDisplayLedgerByCurrency()
			throws InterruptedException {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		customerDetailMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait()
				.until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerStatementsReport));
		customerDetailsCustomerStatementsReport.click();

		Thread.sleep(5000);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) // ref details col not needed
		{
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("cust_display_ledger_by_Currency")) {
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s = new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(1500);

		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow1ListCount; i++)// ref details col not needed
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[cust_display_ledger_by_Currency [CustLedger]]";

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow2ListCount - 1; i++)// ref details col not needed
		{
			String data = reportsRow2List.get(i).getText();
			if (i == 13) {
				reportsByWarehouseRow2ListArray.add("Delay in Payment");
			} else {
				reportsByWarehouseRow2ListArray.add(data);
			}
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[NDT55:8, " + getCurrentDateF2()
				+ ", cust_display_ledger_by_currency, 210.00, , , 210.00, 210.00, 210.00, , , 210.00, Delay in Payment, Indian Rupees, "
				+ getCurrentDateF2() + ", CustLedger, INDIA, INDIA, 14.70, , , 14.70, ]";

		int reportsByWarehouseRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow3ListCount - 1; i++) {
			String data = reportsRow3List.get(i).getText();
			if (i == 13) {
				reportsByWarehouseRow3ListArray.add("Delay in Payment");
			} else {
				reportsByWarehouseRow3ListArray.add(data);
			}

		}
		String actRow3List = reportsByWarehouseRow3ListArray.toString();
		String expRow3List = "[Total, , , 210.00, , , 210.00, 210.00, 210.00, , , 210.00, Delay in Payment, , , , , , 14.70, , , 14.70, ]";
		System.out.println(
				"*********************************checkCustomerStatementsReportDetailsForCreatedCustomer*****************************************");

		System.out.println("ActualRow1List Values   " + actRow1List);
		System.out.println("ExpectedRow1List Values " + expRow1List);

		System.out.println("ActualRow2List Values  " + actRow2List);
		System.out.println("ExpectedRow1List Values" + expRow2List);

		System.out.println("ActualRow3List Values  " + actRow3List);
		System.out.println("ExpectedRow3List Values" + expRow3List);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				&& actRow3List.equalsIgnoreCase(expRow3List)) {
			return true;
		} else {
			return false;
		}
	}

	// Club the transactions of all the Accounts under Group

	public static boolean checkGroupAccountCreateAndSelectPropertyASClubAllTransactionsOfEachAccountUnderGroup()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {

		Thread.sleep(2500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(4000);

		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));
		masterAddGroupBtn.click();

		Thread.sleep(1500);

		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("Cust_ClubTransactionsOf_AllAccounts_Group");
		nameTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("clubTransactions");
		codeTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);
		Select accountTypeDrpdwn = new Select(accountTypeDropdown);
		// accountTypeDrpdwn.selectByVisibleText("Customer/Vendor");
		accountTypeDrpdwn.selectByValue("7");
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		checkValidationMessage("");

		String expSaveAccountMessage = "Saved Successfully";
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(4000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
		CloseBtn.click();

		Thread.sleep(3000);

		checkValidationMessage("");

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("Cust_ClubTransactionsOf_AllAccounts_Group")) {
				getAction().doubleClick(stockLedgerHometableItemChkboxList.get(i)).build().perform();
				break;
			}
		}

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtnInGrp));
		newBtnInGrp.click();

		Thread.sleep(3000);

		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("cust-club trans of all accts One");
		nameTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("custOne");
		codeTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);
		// accountTypeDrpdwn.selectByVisibleText("Customer/Vendor");
		accountTypeDrpdwn.selectByValue("7");
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		String expSaveAccountMessage1 = "Saved Successfully";
		String actSaveAccountMessage1 = checkValidationMessage(expSaveAccountMessage1);

		Thread.sleep(3500);

		checkValidationMessage("");
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("cust-club trans of all accts two");
		nameTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("custTwo");
		codeTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);
		// accountTypeDrpdwn.selectByVisibleText("Customer/Vendor");
		accountTypeDrpdwn.selectByValue("7");
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		String expSaveAccountMessage2 = "Saved Successfully";
		String actSaveAccountMessage2 = checkValidationMessage(expSaveAccountMessage2);

		Thread.sleep(3500);
		checkValidationMessage("");
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
		CloseBtn.click();

		Thread.sleep(4000);

		System.out.println("Click on Save With Valid Information Value Actual : " + actSaveAccountMessage
				+ "  Value Expected : " + expSaveAccountMessage);

		if (actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage)
				&& actSaveAccountMessage1.equalsIgnoreCase(expSaveAccountMessage1)
				&& actSaveAccountMessage2.equalsIgnoreCase(expSaveAccountMessage2)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkSavedGroupAccountInTheAccountsListAndSelectProprtyAsClubAllTransactionsOfEachAccountUnderGroup()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {

		Thread.sleep(1500);
		getDriver().navigate().refresh();
		Thread.sleep(1500);

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(6000);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("Cust_ClubTransactionsOf_AllAccounts_Group")) {
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);

		Thread.sleep(4000);

		getFluentWebDriverWait().until(ExpectedConditions
				.elementToBeClickable(ClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties));
		ClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		Thread.sleep(4500);
		checkValidationMessage("Saved Successfully");
		Thread.sleep(2000);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);
		checkValidationMessage("");

		Thread.sleep(4000);

		getFluentWebDriverWait().until(ExpectedConditions
				.elementToBeClickable(ClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties));

		boolean actClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties = ClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties
				.isSelected();
		boolean expClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties = true;
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		System.out.println("ClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties   :"
				+ actClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties + "  Value Expected : "
				+ expClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties);

		Thread.sleep(3000);
		if (actClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties == expClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkPurchasesVoucherVATForCustomerAccountOneInGroup()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		Thread.sleep(1500);
		getDriver().navigate().refresh();
		Thread.sleep(1500);
		CheckSavePurchasesVoucher(getCurrentDateF2(), "Purchase", "cust-club trans of all accts One", "HYDERABAD",
				"DUBAI", "STD RATE COGS ITEM", "2", "200");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		Thread.sleep(8000);

		String expSavingMessage1 = "Voucher saved successfully";

		String actSavingMessage = checkValidationMessage(expSavingMessage1);

		if (actSavingMessage.startsWith(expSavingMessage1)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkRaiseSalesInvoivesVATForCustomerAccountOneInGroup()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {

		checkSalesInvoiceVATHeader(getCurrentDateF2(), "cust-club trans of all accts One", "India", "Abu Dhabi",
				"DUBAI");

		checkSaveSalesInvoiceVAT(1, 2, "Hyderabad", "STD RATE COGS ITEM", 6, 9, "1", 15, "200", 18);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);

		if (actMessage.startsWith(expMessage)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkRaiseSalesInvoivesVATForCustomerAccountTwoInGroup()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {

		checkSalesInvoiceVATHeader(getCurrentDateF2(), "cust-club trans of all accts two", "India", "Abu Dhabi",
				"DUBAI");

		checkSaveSalesInvoiceVAT(1, 2, "Hyderabad", "STD RATE COGS ITEM", 6, 9, "1", 15, "200", 18);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);

		if (actMessage.startsWith(expMessage)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkCustomerStatementsReportDetailsForGroupAccountCustCulbTransactionsOfAllAccountsUnderGroup()
			throws InterruptedException {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		customerDetailMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait()
				.until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerStatementsReport));
		customerDetailsCustomerStatementsReport.click();

		Thread.sleep(1500);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("Cust_ClubTransactionsOf_AllAccounts_Group")) {
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s = new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(1500);

		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow1ListCount; i++) {
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[Cust_ClubTransactionsOf_AllAccounts_Group [clubTransactions]]";

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow2ListCount - 1; i++) {
			String data = reportsRow2List.get(i).getText();
			if (i == 13) {
				reportsByWarehouseRow2ListArray.add("Delay in Payment");
			} else {
				reportsByWarehouseRow2ListArray.add(data);
			}
		}

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		String currentDate = f.format(cal.getTime());

		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[NDT55:10, " + currentDate
				+ ", cust-club trans of all accts two, 210.00, , , 210.00, 210.00, 210.00, , , 210.00, Delay in Payment, Indian Rupees, "
				+ currentDate + ", custTwo, DUBAI, DUBAI]";

		int reportsByWarehouseRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow3ListCount - 1; i++) {
			String data = reportsRow3List.get(i).getText();
			if (i == 13) {
				reportsByWarehouseRow3ListArray.add("Delay in Payment");
			} else {
				reportsByWarehouseRow3ListArray.add(data);
			}

		}
		String actRow3List = reportsByWarehouseRow3ListArray.toString();
		String expRow3List = "[PurVou:4, " + currentDate
				+ ", cust-club trans of all accts One, 400.00, , , 400.00, 190.00, 400.00, , , 400.00, Delay in Payment, Indian Rupees, "
				+ currentDate + ", custOne, DUBAI, DUBAI]";

		int reportsByWarehouseRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsByWarehouseRow4ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow4ListCount - 1; i++) {
			String data = reportsRow4List.get(i).getText();
			if (i == 13) {
				reportsByWarehouseRow4ListArray.add("Delay in Payment");
			} else {
				reportsByWarehouseRow4ListArray.add(data);
			}
		}
		String actRow4List = reportsByWarehouseRow4ListArray.toString();
		String expRow4List = "[NDT55:9, " + currentDate
				+ ", cust-club trans of all accts One, 210.00, , , 210.00, 20.00, 210.00, , , 210.00, Delay in Payment, Indian Rupees, "
				+ currentDate + ", custOne, DUBAI, DUBAI]";

		int reportsByWarehouseRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsByWarehouseRow5ListArray = new ArrayList<String>();
		for (int i = 1; i < reportsByWarehouseRow5ListCount - 1; i++) {
			String data = reportsRow5List.get(i).getText();
			if (i == 13) {
				reportsByWarehouseRow5ListArray.add("Delay in Payment");
			} else {
				reportsByWarehouseRow5ListArray.add(data);
			}
		}
		String actRow5List = reportsByWarehouseRow5ListArray.toString();
		String expRow5List = "[Grand Total, , , 520.00, , , 520.00, 630.00, 520.00, , , 520.00, Delay in Payment, , , , , ]";

		System.out.println(
				"*********************************checkCustomerStatementsReportDetailsForGroupAccountCustCulbTransactionsOfAllAccountsUnderGroup*****************************************");

		System.out.println("ActualRow1List Values   " + actRow1List);
		System.out.println("ExpectedRow1List Values " + expRow1List);

		System.out.println("ActualRow2List Values  " + actRow2List);
		System.out.println("ExpectedRow1List Values" + expRow2List);

		System.out.println("ActualRow3List Values  " + actRow3List);
		System.out.println("ExpectedRow3List Values" + expRow3List);

		System.out.println("ActualRow4List Values   " + actRow4List);
		System.out.println("ExpectedRow4List Values " + expRow4List);

		System.out.println("ActualRow5List Values   " + actRow5List);
		System.out.println("ExpectedRow5List Values " + expRow5List);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				&& actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List)
				&& actRow5List.equalsIgnoreCase(expRow5List)) {
			return true;
		} else {
			return false;
		}
	}

	// Display Debit/Credit totals for each Account under group

	public static boolean checkGroupAccountCreateAndSelectPropertyASDisplayDrOrCrTotalForEachAccountUnderGroup()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(1500);

		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));
		masterAddGroupBtn.click();

		Thread.sleep(2500);

		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("Cust_Display Debit/Credit totals for each Account under group");
		nameTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("DrCrTotals");
		codeTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);
		Select accountTypeDrpdwn = new Select(accountTypeDropdown);
		// accountTypeDrpdwn.selectByVisibleText("Customer/Vendor");
		accountTypeDrpdwn.selectByValue("7");
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		String expSaveAccountMessage = "Saved Successfully";
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(3000);

		checkValidationMessage("");
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
		CloseBtn.click();

		Thread.sleep(3000);

		checkValidationMessage("");

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("Cust_Display Debit/Credit totals for each Account under group")) {
				getAction().doubleClick(stockLedgerHometableItemChkboxList.get(i)).build().perform();
				break;
			}
		}

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtnInGrp));
		newBtnInGrp.click();

		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("Cust-display cr dr total each account one");
		nameTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("customerOne");
		codeTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);
		// accountTypeDrpdwn.selectByVisibleText("Customer/Vendor");
		accountTypeDrpdwn.selectByValue("7");
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		String expSaveAccountMessage1 = "Saved Successfully";
		String actSaveAccountMessage1 = checkValidationMessage(expSaveAccountMessage1);

		Thread.sleep(3500);
		checkValidationMessage("");
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("Cust-display cr dr total each account two");
		nameTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("customerTwo");
		codeTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		// accountTypeDrpdwn.selectByVisibleText("Customer/Vendor");
		accountTypeDrpdwn.selectByValue("7");
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		String expSaveAccountMessage2 = "Saved Successfully";
		String actSaveAccountMessage2 = checkValidationMessage(expSaveAccountMessage2);

		Thread.sleep(3500);

		checkValidationMessage("");
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
		CloseBtn.click();

		Thread.sleep(4000);

		System.out.println("Click on Save With Valid Information Value Actual : " + actSaveAccountMessage
				+ "  Value Expected : " + expSaveAccountMessage);

		if (actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage)
				&& actSaveAccountMessage1.equalsIgnoreCase(expSaveAccountMessage1)
				&& actSaveAccountMessage2.equalsIgnoreCase(expSaveAccountMessage2)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkSavedGroupAccountInTheAccountsListAndSelectProprtyAsDisplayDrOrCrTotalForEachAccountUnderGroup()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		Thread.sleep(1500);
		getDriver().navigate().refresh();
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(4500);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("Cust_Display Debit/Credit totals for each Account under group")) {
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}

		Thread.sleep(1500);
		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);
		Thread.sleep(4000);

		getFluentWebDriverWait().until(ExpectedConditions
				.elementToBeClickable(displayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties));
		displayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties.click();
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		Thread.sleep(4000);
		checkValidationMessage("Saved Successfully");
		Thread.sleep(2000);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);
		checkValidationMessage("");

		Thread.sleep(3500);

		getFluentWebDriverWait().until(ExpectedConditions
				.elementToBeClickable(displayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties));
		boolean actdisplayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties = displayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties
				.isSelected();
		boolean expdisplayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties = true;

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		System.out.println("displayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties :"
				+ actdisplayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties + "     Value Expected : "
				+ expdisplayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties);

		Thread.sleep(4000);

		if (actdisplayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties == expdisplayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties) {

			return true;
		} else {

			return false;
		}
	}

	public static boolean checkPurchasesVoucherVATForCustomerAccountOneInGroupForDrOrCrTotlas()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		CheckSavePurchasesVoucher(getCurrentDateF2(), "Purchase", "Cust-display cr dr total each account one",
				"HYDERABAD", "DUBAI", "STD RATE COGS ITEM", "2", "200");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		String expSavingMessage1 = "Voucher saved successfully";

		String actSavingMessage = checkValidationMessage(expSavingMessage1);

		if (actSavingMessage.startsWith(expSavingMessage1)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkRaiseSalesInvoivesVATForCustomerAccountOneInGroupForDrOrCrTotlas()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {

		checkSalesInvoiceVATHeader(getCurrentDateF2(), "Cust-display cr dr total each account one", "India",
				"Abu Dhabi", "DUBAI");

		checkSaveSalesInvoiceVAT(1, 2, "Hyderabad", "STD RATE COGS ITEM", 6, 9, "1", 15, "200", 18);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);

		if (actMessage.startsWith(expMessage)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkRaiseSalesInvoivesVATForCustomerAccountTwoInGroupForDrOrCrTotlas()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {

		checkSalesInvoiceVATHeader(getCurrentDateF2(), "Cust-display cr dr total each account two", "India",
				"Abu Dhabi", "DUBAI");

		checkSaveSalesInvoiceVAT(1, 2, "Hyderabad", "STD RATE COGS ITEM", 6, 9, "1", 15, "200", 18);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);

		if (actMessage.startsWith(expMessage)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkLedgerReportForGroupAccountDisplayDrOrCrTotalsForEachAccountUnderGroup()
			throws InterruptedException {

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
		ledger.click();

		Thread.sleep(3000);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("Cust_Display Debit/Credit totals for each Account under group")) {
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s = new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(1600);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		return true;

	}

	public static boolean checkEnableShowSummaryOfTheAccountforAnAccount()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Thread.sleep(2000);
		((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(0, 0)", "");
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(1800);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		Thread.sleep(1800);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(6000);

		searchAccount.click();
		Thread.sleep(1800);
		searchAccount.sendKeys("cust_display_dr/cr_total_for_each_month");
		Thread.sleep(1800);

		Master_searchImg.click();

		int count = masterGridBodyName.size();

		ArrayList<String> AccountNames = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);

			if (data.equalsIgnoreCase("cust_display_dr/cr_total_for_each_month")) {

				if (masterGridBodyChkbox.get(i).isSelected() == false) {
					masterGridBodyChkbox.get(i).click();
				}

				break;
			}
		}

		Thread.sleep(1800);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);

		Thread.sleep(1200);
		showSummaryOfTheAccountRadioBtn.click();

		Thread.sleep(1800);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		Thread.sleep(1500);
		checkValidationMessage("Saved Successfully");
		Thread.sleep(2000);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		ClickUsingJs(masterPropertiesBtn);
		checkValidationMessage("");

		Thread.sleep(1800);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(showSummaryOfTheAccountRadioBtn));

		boolean actPropertyIsSelected = showSummaryOfTheAccountRadioBtn.isEnabled();
		boolean expPropertyIsSelected = true;

		Thread.sleep(1800);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();

		Thread.sleep(1800);

		System.out.println(
				"Property isSelected : " + actPropertyIsSelected + "  Value Expected  " + expPropertyIsSelected);

		if (actPropertyIsSelected == expPropertyIsSelected) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkLedgerReportForShowSummaryOfTheAccount() throws InterruptedException {

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
		ledger.click();

		Thread.sleep(3000);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = stockLedgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("cust_display_dr/cr_total_for_each_month")) {
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s = new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(1800);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(3000);

		String actRow1List = listOfElements(1, reportsRow1List);
		String expRow1List = "[cust_display_dr/cr_total_for_each_month [CustCrDrTotals]]";

		String actRow2List = listOfElements(1, reportsRow2List);
		String expRow2List = "[0, Purchase, 3,000.00, 3,000.00, 210.00, 210.00, 3,000.00, 3,000.00]";

		String actRow3List = listOfElements(1, reportsRow3List);
		String expRow3List = "[0, Sales - Computers, 420.00, 2,580.00, 29.40, 180.60, 420.00, 2,580.00]";

		String actRow4List = listOfElements(1, reportsRow4List);
		String expRow4List = "[Total, 420.00, 3,000.00, 2,580.00, 29.40, 210.00, 180.60, 420.00, 3,000.00, 2,580.00]";

		System.out.println(
				"*********************************checkCustomerStatementsReportDetailsForCreatedCustomer*****************************************");

		System.out.println("ActualRow1List Values   " + actRow1List);
		System.out.println("ExpectedRow1List Values " + expRow1List);

		System.out.println("ActualRow2List Values  " + actRow2List);
		System.out.println("ExpectedRow1List Values" + expRow2List);

		System.out.println("ActualRow3List Values  " + actRow3List);
		System.out.println("ExpectedRow3List Values" + expRow3List);

		System.out.println("ActualRow4List Values   " + actRow4List);
		System.out.println("ExpectedRow4List Values " + expRow4List);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				&& actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkApplyFilterIntheLedgerOnItemMaster() throws InterruptedException {
		Thread.sleep(1400);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(U_report_FilterBtn));
		U_report_FilterBtn.click();

		Thread.sleep(1400);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(U_report_FilterBtn2));
		U_report_FilterBtn2.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
		report_FilterCustomizeBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterItemExpansion));
		report_FilterItemExpansion.click();

		Thread.sleep(1400);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterItemNameChkbox));

		if (report_FilterItemNameChkbox.isSelected() == false) {
			report_FilterItemNameChkbox.click();
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reports_Filter_Customize_OkBtn));
		reports_Filter_Customize_OkBtn.click();

		Thread.sleep(1400);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc_DefaultFilterTxt));
		acc_DefaultFilterTxt.click();
		acc_DefaultFilterTxt.sendKeys("WA COGS ITEM");

		Thread.sleep(1500);

		acc_DefaultFilterTxt.sendKeys(Keys.TAB);

		Thread.sleep(1200);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterOkBtn));
		report_FilterOkBtn.click();

		Thread.sleep(1600);

		String actRow1List = listOfElements(1, reportsRow1List);
		String expRow1List = "[cust_display_dr/cr_total_for_each_month [CustCrDrTotals]]";

		String actRow2List = listOfElements(1, reportsRow2List);
		String expRow2List = "[0, Sales - Computers, 147.00, 147.00, 10.29, 10.29, 147.00, 147.00]";

		String actRow3List = listOfElements(1, reportsRow3List);
		String expRow3List = "[Total, 147.00, 147.00, 10.29, 10.29, 147.00, 147.00]";

		System.out.println(
				"*********************************checkCustomerStatementsReportDetailsForCreatedCustomer*****************************************");

		System.out.println("ActualRow1List Values   " + actRow1List);
		System.out.println("ExpectedRow1List Values " + expRow1List);

		System.out.println("ActualRow2List Values  " + actRow2List);
		System.out.println("ExpectedRow1List Values" + expRow2List);

		System.out.println("ActualRow3List Values  " + actRow3List);
		System.out.println("ExpectedRow3List Values" + expRow3List);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				&& actRow3List.equalsIgnoreCase(expRow3List)) {
			return true;
		} else {
			return false;
		}

	}

	@FindBy(xpath = "//*[@class='icon-settings hiconright2']")
	public static WebElement Voucher_SettingsBtn;

	@FindBy(xpath = "//div//*[@id='doc_TagsTable_col_3-1']")
	public static WebElement masterTable3rdrow;

	@FindBy(xpath = "//div//*[@id='doc_TagsTable_col_3-2']")
	public static WebElement masterposition3rdrow;

	@FindBy(xpath = "//div//*[@id='doc_TagsTable_col_4-1']")
	public static WebElement masterTable4throw;

	@FindBy(xpath = "//div//*[@id='doc_TagsTable_col_4-2']")
	public static WebElement masterposition4throw;

	@FindBy(xpath = "//div//*[@id='doc_TagsTable_col_5-1']")
	public static WebElement masterTable5throw;

	@FindBy(xpath = "//div//*[@id='doc_TagsTable_col_5-2']")
	public static WebElement masterposition5throw;

	@FindBy(xpath = "//div//*[@id='doc_TagsTable_col_6-1']")
	public static WebElement masterTable6throw;

	@FindBy(xpath = "//div//*[@id='doc_TagsTable_col_6-2']")
	public static WebElement masterposition6throw;

	@FindBy(xpath = "//select[@id='doc_TagsTableMasterDropDown']")
	public static WebElement MasterDropdown;

	@FindBy(xpath = "//select[@id='doc_TagsPositionDropDown']")
	public static WebElement PositionDropdown;

	public static boolean checksetSavedConfigureMastersIntoSalesInvoicesBody()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
		salesInvoicesVoucher.click();

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Voucher_SettingsBtn));
		Voucher_SettingsBtn.click();

		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTable3rdrow));
		masterTable3rdrow.click();
		Thread.sleep(1000);

		Select master = new Select(MasterDropdown);
		master.selectByVisibleText("BodyMasterOne");

		MasterDropdown.sendKeys(Keys.TAB);

		Select position = new Select(PositionDropdown);
		position.selectByVisibleText("Body");

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTable4throw));
		masterTable4throw.click();

		master.selectByVisibleText("BodyMasterTwo");

		MasterDropdown.sendKeys(Keys.TAB);
		Thread.sleep(1200);
		position.selectByVisibleText("Body");

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTable5throw));
		masterTable5throw.click();

		master.selectByVisibleText("BodyMasterThree");

		MasterDropdown.sendKeys(Keys.TAB);
		Thread.sleep(1200);
		position.selectByVisibleText("Body");

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTable6throw));
		masterTable6throw.click();

		master.selectByVisibleText("BodyMasterFour");

		MasterDropdown.sendKeys(Keys.TAB);
		Thread.sleep(1200);
		position.selectByVisibleText("Body");

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtn));
		updateBtn.click();

		String expMessage = "Data saved successfully";
		String actMessage = checkValidationMessage(expMessage);

		Thread.sleep(2000);

		if (actMessage.equalsIgnoreCase(expMessage)) {
			return true;
		} else {
			return false;
		}

	}

	@FindBy(xpath = "//*[@id='id_body_536873913']")
	public static WebElement body_masterOne;

	@FindBy(xpath = "//*[@id='id_body_536873914']")
	public static WebElement body_masterTwo;

	@FindBy(xpath = "//*[@id='id_body_536873915']")
	public static WebElement body_masterThree;

	@FindBy(xpath = "//*[@id='id_body_536873916']")
	public static WebElement body_masterFour;

	@FindBy(xpath = "//*[@id='id_body_33554459']")
	public static WebElement SInventer_AQTxt;

	@FindBy(xpath = "//*[@id='id_body_33554460']")
	public static WebElement SInventer_FQTxt;

	@FindBy(xpath = "//*[@id='id_body_33554463']")
	public static WebElement SInventer_AQTxt1;

	@FindBy(xpath = "//*[@id='id_body_33554464']")
	public static WebElement SInventer_FQTxt1;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[16]")
	public static WebElement select4thRow_15thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[17]")
	public static WebElement select4thRow_16thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[8]")
	public static WebElement select2ndRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[9]")
	public static WebElement select2ndRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[16]")
	public static WebElement select2ndRow_15thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[17]")
	public static WebElement select2ndRow_16thColumn;

	public static boolean checkSaveSalesInvoiceVoucherWithSavedBodyMasters()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
		salesInvoicesVoucher.click();

		Thread.sleep(6000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("Customer A");
		Thread.sleep(1500);
		customerAccountTxt.sendKeys(Keys.TAB);

		Thread.sleep(1200);

		/*
		 * getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(
		 * salesAccountTxt)); salesAccountTxt.sendKeys("Sales - Computers");
		 * Thread.sleep(1500); salesAccountTxt.sendKeys(Keys.TAB);
		 */

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys("DUBAI");
		Thread.sleep(1500);
		departmentTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(WareHouseTxtInPurchases));
		WareHouseTxtInPurchases.sendKeys("HYDERABAD");
		Thread.sleep(1500);
		WareHouseTxtInPurchases.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(body_masterOne));

		body_masterOne.sendKeys("Location1");
		Thread.sleep(2000);
		body_masterOne.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		body_masterTwo.sendKeys("RawMaterial1");
		Thread.sleep(2000);
		body_masterTwo.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		body_masterThree.sendKeys("Warehouse1");
		Thread.sleep(2000);
		body_masterThree.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		body_masterFour.sendKeys("Item1");
		Thread.sleep(2000);
		body_masterFour.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
		Thread.sleep(3000);
		enter_ItemTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_9thColumn));
		select1stRow_9thColumn.click();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SInventer_AQTxt));
		SInventer_AQTxt.sendKeys("2");
		Thread.sleep(1000);
		SInventer_AQTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SInventer_FQTxt));
		SInventer_FQTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_16thColumn));
		select1stRow_16thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("200");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);

		// row2

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
		select2ndRow_1stColumn.click();
		Thread.sleep(1200);
		body_masterOne.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		Thread.sleep(2000);
		body_masterOne.sendKeys("Location2");
		Thread.sleep(2000);
		body_masterOne.sendKeys(Keys.TAB);

		Thread.sleep(2500);
		body_masterTwo.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		Thread.sleep(2000);
		body_masterTwo.sendKeys("RawMaterial2");
		Thread.sleep(2000);
		body_masterTwo.sendKeys(Keys.TAB);

		Thread.sleep(2500);

		body_masterThree.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		Thread.sleep(2000);
		body_masterThree.sendKeys("Warehouse2");
		Thread.sleep(2000);
		body_masterThree.sendKeys(Keys.TAB);

		Thread.sleep(2500);

		body_masterFour.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		Thread.sleep(2000);
		body_masterFour.sendKeys("Item2");
		Thread.sleep(2000);
		body_masterFour.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
		Thread.sleep(3000);
		enter_ItemTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		// getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_7thColumn));
		// select2ndRow_7thColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_9thColumn));
		select2ndRow_9thColumn.click();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SInventer_AQTxt));
		SInventer_AQTxt.sendKeys("2");
		Thread.sleep(1000);
		SInventer_AQTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SInventer_FQTxt));
		SInventer_FQTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_16thColumn));
		select2ndRow_16thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("200");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);

		// row3

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_1stColumn));
		select3rdRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(body_masterOne));
		body_masterOne.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		Thread.sleep(1200);
		body_masterOne.sendKeys("Location3");
		Thread.sleep(2000);
		body_masterOne.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		body_masterTwo.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		Thread.sleep(1200);
		body_masterTwo.sendKeys("RawMaterial3");
		Thread.sleep(2000);
		body_masterTwo.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		body_masterThree.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		Thread.sleep(1200);
		body_masterThree.sendKeys("Warehouse3");
		Thread.sleep(2000);
		body_masterThree.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		body_masterFour.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		Thread.sleep(1200);
		body_masterFour.sendKeys("Item3");
		Thread.sleep(2000);
		body_masterFour.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
		Thread.sleep(3000);
		enter_ItemTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_9thColumn));
		select3rdRow_9thColumn.click();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SInventer_AQTxt));
		SInventer_AQTxt.sendKeys("2");
		Thread.sleep(1000);
		SInventer_AQTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SInventer_FQTxt));
		SInventer_FQTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_16thColumn));
		select3rdRow_16thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("200");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);

		// row4

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_1stColumn));
		select4thRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(body_masterOne));
		body_masterOne.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		Thread.sleep(1200);
		body_masterOne.sendKeys("Location4");
		Thread.sleep(2000);
		body_masterOne.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		body_masterTwo.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		Thread.sleep(1200);
		body_masterTwo.sendKeys("RawMaterial4");
		Thread.sleep(2000);
		body_masterTwo.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		body_masterThree.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		Thread.sleep(1200);
		body_masterThree.sendKeys("Warehouse4");
		Thread.sleep(2000);
		body_masterThree.sendKeys(Keys.TAB);

		Thread.sleep(1500);
		body_masterFour.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		Thread.sleep(1200);
		body_masterFour.sendKeys("Item4");
		Thread.sleep(2000);
		body_masterFour.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
		Thread.sleep(3000);
		enter_ItemTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_9thColumn));
		select4thRow_9thColumn.click();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SInventer_AQTxt));
		SInventer_AQTxt.sendKeys("2");
		Thread.sleep(1000);
		SInventer_AQTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SInventer_FQTxt));
		SInventer_FQTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_16thColumn));
		select4thRow_16thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("200");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		Thread.sleep(1500);
		// checkValidationMessage("");

		Thread.sleep(3000);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = "1";

		String actMessage = checkValidationMessage(expMessage1);

		Thread.sleep(2000);

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)) {
			return true;
		} else {
			return false;
		}

	}

	@FindBy(xpath = "//*[@id='id_transactionentry_new']")
	public static WebElement PO_EntryNewBtn;

	@FindBy(xpath = "//span[@class='icon-menudots hiconright2']")
	public static WebElement toggleBtn;

	@FindBy(xpath = "//label[contains(text(),'Copy to Clipboard')]")
	public static WebElement copyToClipBoardOption;

	@FindBy(xpath = "//label[contains(text(),'Paste from Clipboard')]")
	public static WebElement pasteFromClipBoardOption;

	public static boolean checkCopyToClipboardAndPasteFromClipboard()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		documentNumberTxt.click();
		documentNumberTxt.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME);
		documentNumberTxt.sendKeys("1");
		Thread.sleep(1500);
		documentNumberTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		toggleBtn.click();
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copyToClipBoardOption));
		copyToClipBoardOption.click();
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PO_EntryNewBtn));
		PO_EntryNewBtn.click();
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		toggleBtn.click();
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pasteFromClipBoardOption));
		pasteFromClipBoardOption.click();
		Thread.sleep(2000);
		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		Thread.sleep(1500);

		// checkValidationMessage("");

		Thread.sleep(3000);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = "2";

		String actMessage = checkValidationMessage(expMessage1);

		Thread.sleep(2000);

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)) {
			return true;
		} else {
			return false;
		}

	}

	@FindBy(xpath = "//*[@id='id_transactionentry_previous']//span")
	public static WebElement previousBtn;

	public static boolean checkValidatePastedSalesVoucher() throws InterruptedException {

		Thread.sleep(1200);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		previousBtn.click();
		Thread.sleep(1200);

		String actRow1List = listOfElements(VoucherRow1List);
		String expRow1List = "[1, Location1, RawMaterial1, Warehouse1, Item1, STD RATE COGS ITEM, Pcs, 0.00, 2.00, 0.00, 10.00, 10.00, 2.00, 200.00, 400.00, 0.00]";

		String actRow2List = listOfElements(VoucherRow2List);
		String expRow2List = "[2, Location2, RawMaterial2, Warehouse2, Item2, STD RATE COGS ITEM, Pcs, 0.00, 2.00, 0.00, 10.00, 10.00, 2.00, 200.00, 400.00, 0.00]";

		String actRow3List = listOfElements(VoucherRow3List);
		String expRow3List = "[3, Location3, RawMaterial3, Warehouse3, Item3, STD RATE COGS ITEM, Pcs, 0.00, 2.00, 0.00, 10.00, 10.00, 2.00, 200.00, 400.00, 0.00]";

		String actRow4List = listOfElements(VoucherRow4List);
		String expRow4List = "[4, Location4, RawMaterial4, Warehouse4, Item4, STD RATE COGS ITEM, Pcs, 0.00, 2.00, 0.00, 10.00, 10.00, 2.00, 200.00, 400.00, 0.00]";

		System.out.println("actRow1List: " + actRow1List + "expRow1List: " + expRow1List);
		System.out.println("actRow2List: " + actRow2List + "expRow2List: " + expRow2List);
		System.out.println("actRow3List: " + actRow3List + "expRow3List: " + expRow3List);
		System.out.println("actRow4List: " + actRow4List + "expRow4List: " + expRow4List);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				&& actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checklogoutAccountPropertiesPage() throws InterruptedException {
		Thread.sleep(1500);

		getDriver().navigate().refresh();
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(LogoutDropdown));
		LogoutDropdown.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();

		Thread.sleep(1500);

		boolean actUserLoginPage = username.isDisplayed() && username.isEnabled() && password.isDisplayed()
				&& password.isEnabled();

		boolean expUserLoginPage = true;

		if (actUserLoginPage == expUserLoginPage) {
			System.out.println("***Test Pass: Login Successfull***");

			return true;
		} else {

			System.out.println("***Test Fail: Login Not Successfull***");

			return false;
		}
	}

	public AccountPropertiesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

}
