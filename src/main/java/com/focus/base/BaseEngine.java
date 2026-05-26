package com.focus.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.automationtesting.excelreport.Xl;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.log4testng.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
import com.focus.Pages.LoginPage;
import com.focus.Pages.VoucherPrintOptionsPage;
import com.focus.Repository.ElementRepository;
import com.focus.utilities.DriverUtility;
import com.focus.utilities.ScreenshotUtility;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseEngine extends ElementRepository
{

	/*private static WebDriver driver;
	private static String baseDir;
	private static String tcName;
	public static ExtentReports extentReports;
	private static ExtentTest extentTest;
	private static Logger logger;
	private static WebDriverWait wait;

	private String filePath;
	private FileInputStream fip;
	private FileOutputStream fop;
	private Workbook workbook;
	private Sheet sheet;
	private Cell cell;
	private CellStyle style;
	private Row row;
	private String res=null;

	private static Alert alert;
	 public static int cSize;

	//private String xlfile="\\E:\\ZFocusAI\\TestData.xls";


	  @Parameters("browser")
	  @BeforeSuite
	  public void openBrowser(@Optional("chrome")String browser)
	  {

		baseDir=System.getProperty("user.dir");
		//PropertyConfigurator.configure(baseDir + "\\log4j.properties");

		PropertyConfigurator.configure("D:\\FocusXAllProjectsSuite\\FocusAI\\log4j.properties");




		if(browser.equalsIgnoreCase("chrome"))
		{	
			System.setProperty(DriverUtility.chromeKey, baseDir+DriverUtility.chromeValue);
			String downloadFilepath = getBaseDir()+"\\autoIt\\ExportFiles";
	        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	        chromePrefs.put("profile.default_content_settings.popups", 0);
	        chromePrefs.put("download.default_directory", downloadFilepath);
	        chromePrefs.put("safebrowsing.enabled", "true"); 
	        ChromeOptions options = new ChromeOptions();
	        options.setExperimentalOption("prefs", chromePrefs);
	        DesiredCapabilities cap = DesiredCapabilities.chrome();
	        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	        cap.setCapability(ChromeOptions.CAPABILITY, options);

			driver=new ChromeDriver(cap);
			initActivities();
		}

		if(browser.equalsIgnoreCase("chrome"))
		{	
			System.setProperty(DriverUtility.chromeKey, baseDir+DriverUtility.chromeValue);
			driver=new ChromeDriver();
			initActivities();
		}

		if(browser.equalsIgnoreCase("ie"))
		{	
			System.setProperty(DriverUtility.ieKey, baseDir+DriverUtility.ieValue);
			driver=new InternetExplorerDriver();
			initActivities();
		}

		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty(DriverUtility.firefoxKey, baseDir+DriverUtility.firefoxValue);
			driver=new FirefoxDriver();
			initActivities();
		}  
	  }


	  public void initActivities()
	  {
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
	  }


	  @BeforeMethod
      public void beforeMethodExecution(Method method)
      {
		  tcName=method.getName();
		  //System.out.println("tc started");
		  logger = Logger.getLogger(BaseEngine.class);

		  getLogger().info("Currently Executing Test Case Name is : "+ tcName);
		  //extentTest=extentReports.startTest(tcName);

		  extentTest = extentReports.createTest(tcName);

		  System.out.println("This Is Before Method Execution And Trying To Executing The Method: "+ tcName);
		  //Excel Update is Written as below
      }


	  @AfterMethod
	  public void afterMethodExecution(ITestResult result) throws IOException, EncryptedDocumentException, InvalidFormatException
	  {


		  //System.out.println(res);
		  //System.out.println(result.getStatus());
		  //System.out.println("This is After method");

		  if (result.getStatus()==ITestResult.SUCCESS)
		  {
			  res="Pass";
			  getLogger().info("Test Case is Passed : " + tcName);
			  //excelReader.setCellData(xlfile, "Sheet3", 0, 0, res);
			  //extentTest.log(LogStatus.PASS, "Test Case is Passed  : " + tcName);

			  extentTest.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED  ", ExtentColor.GREEN));
			  System.out.println("Pass : Test Case is Passed from after Method : " + tcName);
		  }

		  else if(result.getStatus()==ITestResult.FAILURE)
		  {
			  res="Fail";
			  getLogger().info("Test Case is Failed : " + tcName + "So Taking the Screenshot");
			  //excelReader.setCellData(xlfile, "Sheet3", 0, 1, res);
			  //extentTest.log(LogStatus.FAIL, "Test Case is Failed : " + tcName);
			  extentTest.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED  ", ExtentColor.RED));
			  extentTest.fail(result.getThrowable());
			  ScreenshotUtility.screenshot();
			  System.out.println("Fail : Test Case Is Failed After Method Execution : " + tcName);
			  //System.out.println("Log Message:: @AfterMethod: Method-"+methodName+"- has Failed");

		  }
		  else if(result.getStatus()==ITestResult.SKIP)
		  {
			  res="Skip";
			  getLogger().info("Test Case is Skipped : " + tcName + "So Taking the Screenshot");
			  //excelReader.setCellData(xlfile, "Sheet3", 0, 2, res);
			 // extentTest.log(LogStatus.SKIP, "Test Case is Skipped : " + tcName);

			  extentTest.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED  ", ExtentColor.ORANGE));
			  extentTest.skip(result.getThrowable());
			  ScreenshotUtility.screenshot();
			  System.out.println("Skip : Test Case Is Skipped After Method Execution : " + tcName);
		  }

	  }

	// @AfterSuite
	  public void closeBrowser()
	  {
		  if(driver==null)
		  {
			  getLogger().info("Driver is pointing to Null : @AfterSuite");
		  }
		  else
		  {
			  driver.close();
		  }

	  }

	  @BeforeTest
      public void intialiseReports()
      {


                //extentReports = new ExtentReports(baseDir +"\\reports\\"+getCurrentDateFormatWithTime()+"---FocusAutomationReport.html");
               // extentReports.assignProject("FocusAI");

    	 extentReports =new ExtentReports();
    	 ExtentSparkReporter spark=new ExtentSparkReporter(baseDir +"\\reports\\"+getCurrentDateFormatWithTime()+"---FocusAutomationReport.html");
    	 extentReports.attachReporter(spark);   
      }




	  @AfterTest
	  public void generateReports()
	  {
		  extentReports.flush();
		  //extentReports.endTest(extentTest);
	  }*/


	public static int cSize;

	protected static WebDriver driver;
	private static String baseDir;
	private static String tcName;
	//private static ExtentReports extentReports;
	//private static ExtentTest extentTest;

	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	private static Logger logger;
	private static WebDriverWait wait;

	private String filePath;
	private FileInputStream fip;
	private FileOutputStream fop;
	private Workbook workbook;
	private Sheet sheet;
	private Cell cell;
	private CellStyle style;
	private Row row;
	private String res = null;

	private static Alert alert;

	// private String xlfile="\\E:\\ZFocusAI\\TestData.xls";

	@Parameters("browser")
	@BeforeSuite
	public void openBrowser(@Optional("chrome") String browser) {

		baseDir = System.getProperty("user.dir");
		PropertyConfigurator.configure(baseDir + "\\log4j.properties");

		// Auto-detect if running in Jenkins
		String isJenkins = System.getenv("JENKINS_HOME");
		boolean runningInJenkins = (isJenkins != null);

		System.out.println("Running in Jenkins: " + runningInJenkins);
		System.out.println("Base Directory: " + baseDir);

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty(DriverUtility.chromeKey, baseDir + DriverUtility.chromeValue);

			// Download preferences
			String downloadFilepath = getBaseDir() + "\\autoIt\\ExportFiles";
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			chromePrefs.put("download.default_directory", downloadFilepath);
			chromePrefs.put("safebrowsing.enabled", "true");
			chromePrefs.put("safebrowsing.disable_download_protection", true);
			chromePrefs.put("download.prompt_for_download", true);

			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", chromePrefs);
			options.setAcceptInsecureCerts(true);

			// Fix download blocking - add to BOTH modes:
			options.addArguments("--disable-features=InsecureDownloadWarnings");
			options.addArguments("--allow-running-insecure-content");

			if (runningInJenkins) {
				// ======= JENKINS MODE - Headless =======
				System.out.println("Jenkins Mode: Starting Chrome in Headless mode");
				options.addArguments("--headless=new");
				options.addArguments("--disable-gpu");
				options.addArguments("--window-size=1920,1080");
				options.addArguments("--no-sandbox");
				options.addArguments("--disable-dev-shm-usage");
				options.addArguments("--disable-extensions");
				options.addArguments("--remote-allow-origins=*");
				options.addArguments("--ignore-certificate-errors");
				options.addArguments("--allow-insecure-localhost");
			} else {
				// ======= LOCAL ECLIPSE MODE - Normal Browser =======
				// LOCAL ECLIPSE MODE
				System.out.println("Local Mode: Starting Chrome in Normal mode");
				options.addArguments("--start-maximized");
				options.addArguments("--disable-notifications");
				options.addArguments("--ignore-certificate-errors");

				// Fix for downloads being blocked:
				options.addArguments("--allow-running-insecure-content"); 
				options.addArguments("--disable-features=InsecureDownloadWarnings"); // ← Add this
				options.addArguments("--no-sandbox");
			}

			driver = new ChromeDriver(options);
			initActivities();
			System.out.println("Chrome Browser Started Successfully");
		}

		if (browser.equalsIgnoreCase("ie")) {
			System.setProperty(DriverUtility.ieKey, baseDir + DriverUtility.ieValue);
			driver = new InternetExplorerDriver();
			initActivities();
		}

		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty(DriverUtility.firefoxKey, baseDir + DriverUtility.firefoxValue);
			driver = new FirefoxDriver();
			initActivities();
		}
	}

	public void initActivities() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	@BeforeMethod
	public void beforeMethodExecution(Method method) {
		tcName = method.getName();
		System.out.println("tc started");
		logger = Logger.getLogger(BaseEngine.class);

		System.out.println("tc end");

		getLogger().info("Currently Executing Test Case Name is : " + tcName);
		//extentTest = extentReports.startTest(tcName);

		extentTest = extentReports.createTest(tcName);

		System.out.println("This Is Before Method Execution And Trying To Executing The Method: " + tcName);
		// Excel Update is Written as below
	}

	@AfterMethod
	public void afterMethodExecution(ITestResult result)
			throws IOException, EncryptedDocumentException, InvalidFormatException {
		// System.out.println(res);
		// System.out.println(result.getStatus());
		// System.out.println("This is After method");

		if (result.getStatus() == ITestResult.SUCCESS) {
			res = "Pass";
			getLogger().info("Test Case is Passed : " + tcName);
			// excelReader.setCellData(xlfile, "Sheet3", 0, 0, res);
			//extentTest.log(LogStatus.PASS, "Test Case is Passed  : " + tcName);

			extentTest.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));


			System.out.println("Pass : Test Case is Passed from after Method : " + tcName);
		}

		else if (result.getStatus() == ITestResult.FAILURE) {
			res = "Fail";
			getLogger().info("Test Case is Failed : " + tcName + "So Taking the Screenshot");
			// excelReader.setCellData(xlfile, "Sheet3", 0, 1, res);
			//extentTest.log(LogStatus.FAIL, "Test Case is Failed : " + tcName);

			extentTest.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
			extentTest.fail(result.getThrowable());
			ScreenshotUtility.screenshot();
			System.out.println("Fail : Test Case Is Failed After Method Execution : " + tcName);
			// System.out.println("Log Message:: @AfterMethod:
			// Method-"+methodName+"- has
			// Failed");

		} else if (result.getStatus() == ITestResult.SKIP) {
			res = "Skip";
			getLogger().info("Test Case is Skipped : " + tcName + "So Taking the Screenshot");
			// excelReader.setCellData(xlfile, "Sheet3", 0, 2, res);
			//extentTest.log(LogStatus.SKIP, "Test Case is Skipped : " + tcName);
			extentTest.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
			extentTest.skip(result.getThrowable());
			ScreenshotUtility.screenshot();
			System.out.println("Skip : Test Case Is Skipped After Method Execution : " + tcName);
		}

	}

	//@AfterSuite
	public void closeBrowser() throws Exception {
		if (driver == null) {
			getLogger().info("Driver is pointing to Null : @AfterSuite");
			Xl.generateReport(getCurrentDateFormatWithTime()+"FocusAutomationExcelReport.xlsx");
		} else {
			Xl.generateReport(getCurrentDateFormatWithTime()+"FocusAutomationExcelReport.xlsx");
			driver.close();

		}

	}

	@BeforeTest
	public void intialiseReports() throws Exception {		


		/*extentReports = new ExtentReports(baseDir + "\\reports\\FocusAutomationReport.html");
		extentReports.assignProject("FocusAI");*/

		extentReports  =new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter(baseDir +"\\reports\\"+getCurrentDateFormatWithTime()+"---FocusAutomationReport.html");
		extentReports.attachReporter(spark);


	}

	@AfterTest
	public void generateReports() throws Exception {
		//Xl.generateReport(getCurrentDateFormatWithTime()+"FocusAutomationExcelReport.xlsx");
		extentReports.flush();
		//Xl.generateReport(getCurrentDateFormatWithTime()+"FocusAutomationExcelReport.xlsx");
		//extentReports.endTest(extentTest);
	}


	public static String getCurrentDateFormatWithTime() 
	{

		String timeStamp = new SimpleDateFormat("MMM"+" "+"dd"+" "+"yyyy"+" "+"HH"+" "+"mm").format(Calendar.getInstance().getTime());
		System.out.println(timeStamp );
		return timeStamp;
	}





	public static String getTCName()
	{
		return tcName;
	}

	public static String getBaseDir()
	{
		return baseDir;
	}

	public static WebDriver getDriver()
	{
		return driver;
	}

	public static ExtentTest getExtentTest()
	{
		return extentTest;
	}

	public static Logger getLogger()
	{
		return logger;
	}

	public static void enterUrl(String url) 
	{
		getDriver().get(url);
	}

	public static boolean isElementNotDisplayed(WebElement we)
	{
		try
		{
			if(we.isDisplayed())
			{
				return true;
			}

			return false;
		}
		catch(Exception e)
		{
			return false;
		}
	}





	public static Actions getAction()
	{
		Actions action=new Actions(driver);
		return action;

	}

	public static void getWaitForAlert()
	{
		new WebDriverWait(getDriver(), 800).ignoring(NoAlertPresentException.class).until(ExpectedConditions.alertIsPresent());
	}


	public static Alert getAlert()
	{
		alert=getDriver().switchTo().alert();
		return alert;
	}

	public static boolean getIsAlertPresent() 
	{ 
		try 
		{ 
			driver.switchTo().alert(); 
			return true; 
		} 
		catch (NoAlertPresentException Ex) 
		{ 
			return false; 
		}
	}  



	public static Wait getWebDriverWait()
	{
		wait = new WebDriverWait(getDriver(), 240);
		return wait;

	}

	public static WebElement getWebDriverWaitEle(WebElement ele)
	{
		WebElement WEle = new WebDriverWait(getDriver(), 240).until(ExpectedConditions.elementToBeClickable(ele));

		return WEle; 


	}

	public static Wait getFluentWebDriverWait()
	{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(20, TimeUnit.SECONDS) 			
				.pollingEvery(1, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);
		return wait;
	}

	public static void scrollToElementJSE(WebElement Element) throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", Element);
		Thread.sleep(2000);
	}

	public static void ClickUsingJs(WebElement element) throws InterruptedException {

		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].click();", element);

	}

	public static Wait getFluentWebDriverWaitN() throws InterruptedException 
	{

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(20, TimeUnit.SECONDS) 			
				.pollingEvery(1, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);

		Thread.sleep(10000);
		return wait;


		/*
			  Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())
				        .withTimeout(Duration.ofSeconds(40))
				        .pollingEvery(Duration.ofSeconds(5))
				        .ignoring(NoSuchElementException.class);
			return wait;*/


	}



	public static String getCurrentDateF2() {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = dateFormat.format(date);
		// System.out.println(strDate);
		return strDate;

	}

	public static String currentTimeWithDateTimewithDay()
	{

		ZonedDateTime now = ZonedDateTime.now(ZoneId.systemDefault());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy h:mm a");

		// 3. Format the ZonedDateTime object into a string
		String formattedDateTime = now.format(formatter);

		// 4. Print the result
		System.out.println("Current Date and Time: " + formattedDateTime);
		return formattedDateTime;

	}



	public static String getCurrentDay() {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("dd");
		String strDate = dateFormat.format(date);
		// System.out.println(strDate);
		return strDate;

	}
	public static void ScrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}



	public static void moveToElement(WebElement element) {
		try {
			Actions action = new Actions(getDriver()).moveToElement(element);

			action.build().perform();

			System.out.println("Move To element clicked the element");
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element " + element + " was not found in DOM " + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Element " + element + " was not clickable " + e.getStackTrace());
		}
	}

	public static void checkLoginToSelectedCompany(String cname,String username,String Password) throws InterruptedException
	{
		Thread.sleep(8000);

		LoginPage lp= new LoginPage(getDriver());

		lp.enterUserName(username);

		Thread.sleep(2000);
		lp.enterPassword(Password);

		String compname = cname;

		Select oSelect = new Select(companyDropDownList);

		List<WebElement> elementCount = oSelect.getOptions();

		int cqSize = elementCount.size();

		System.out.println("CompanyDropdownList Count :" + cqSize);

		int i;

		for (i = 0; i < elementCount.size(); i++) {

			elementCount.get(i).getText();

			String optionName = elementCount.get(i).getText();
			if (optionName.toUpperCase().startsWith(compname.toUpperCase())) {
				System.out.println("Logined Company" + elementCount.get(i).getText());
				elementCount.get(i).click();
			}

		}

		Thread.sleep(2000);

		lp.clickOnSignInBtn();
	}



	//DataManagement menu
	@FindBy (xpath="//*[@id='25']")
	public static WebElement dataMangementMenu;

	@FindBy (xpath="//*[@id='27']/span")
	private static WebElement restore;

	@FindBy (xpath="//*[@id='openFile']")
	private static WebElement folderpathExpandBtn;


	@FindBy (xpath="//*[@class='icon-restore hiconright2']")
	private static WebElement restoreCompanyBtn;

	@FindBy (xpath="//*[@id='RestoreCompanyModal']/div/div/div[2]/button[1]")
	private static WebElement overRideYesBtn;

	public static  void restoreCompany(String BackupFile, String companyName) throws InterruptedException, IOException, AWTException
	{
		Thread.sleep(1000);

		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
		dataMangementMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restore));
		restore.click();

		Thread.sleep(4000);
		/*
		 * getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(
		 * folderpathExpandBtn)); folderpathExpandBtn.click();
		 */

		Thread.sleep(4000);

		/*
		 * REPLACED ROBOT CODE WITH FILE INPUT
		 * -----------------------------------
		 * Earlier:
		 *   Robot + Clipboard + CTRL+V + ENTER
		 *
		 * Now:
		 *   Direct file upload using sendKeys()
		 */

		String filePath = getBaseDir() + "\\backup\\" + BackupFile + ".fbak";

		System.out.println("Backup File Path : " + filePath);

		// Locate hidden file input
		WebElement fileInput = getDriver().findElement(By.id("openFile"));

		// Make hidden input visible
		JavascriptExecutor js = (JavascriptExecutor) getDriver();

		js.executeScript(
		    "arguments[0].style.display='block';",
		    fileInput
		);

		Thread.sleep(2000);

		// Upload file directly
		fileInput.sendKeys(filePath);

		System.out.println("File uploaded successfully");

		Thread.sleep(5000);

		getFluentWebDriverWait().until(
				ExpectedConditions.elementToBeClickable(restoreCompanyBtn));
		restoreCompanyBtn.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(
				ExpectedConditions.elementToBeClickable(overRideYesBtn));
		overRideYesBtn.click();

		System.err.println("COMPANY EXISTS");

	

		System.err.println("waiting for alert....");

		try {

			System.err.println("Alert Displayed");

			getWaitForAlert();

			System.err.println(getAlert().getText());

			getAlert().accept();

		} catch (Exception E) {

			System.out.println("alert not displayed");
		}

		Thread.sleep(2500);

		getAction().moveToElement(LogoutDropdown).build().perform();

		Thread.sleep(1200);

		getFluentWebDriverWait().until(
				ExpectedConditions.elementToBeClickable(LogoutDropdown));

		ClickUsingJs(LogoutDropdown);

		Thread.sleep(1200);

		getFluentWebDriverWait().until(
				ExpectedConditions.elementToBeClickable(logoutOption));

		ClickUsingJs(logoutOption);

		Thread.sleep(3000);

		checkLoginToSelectedCompany(companyName, "su", "su");

		Thread.sleep(100000);

		System.err.println("Reached here");

		try {

			if (reindexingPopup.isDisplayed()) {

				System.err.println("need to handle reindexing popup");

				Thread.sleep(3000);

				getDriver().navigate().refresh();

				Thread.sleep(3000);

				checkLoginToSelectedCompany(companyName, "su", "su");
			}

		} catch (Exception e) {

			System.err.println("No need to handle reindexing popup");
		}}


	@FindBy(xpath = "//*[@id='errmsgDiv']")
	public static WebElement loginPageErrorMesg;

	public static void reLogin(String unamelt, String pawslt,String compname)
	{
		try {

			if(loginPageErrorMesg.isDisplayed())
			{

				Thread.sleep(1999);
				username.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);

				LoginPage.enterUserName(unamelt);

				Thread.sleep(2000);

				password.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);

				LoginPage.enterPassword(pawslt);

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

				LoginPage.clickOnSignInBtn();


			}

		} catch (Exception e) {
			// TODO: handle exception
		}


	}


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



	public static void click(WebElement element) {

		new WebDriverWait(getDriver(), 50).until(ExpectedConditions.elementToBeClickable(element));

		element.click();
	}





	public static String findNextDay()
	{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar exp=Calendar.getInstance();
		exp.add(Calendar.DATE, 1); 
		String expiryDate = df.format(exp.getTime());
		return expiryDate;


	}

	public static String findpastDay(int date)
	{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar exp=Calendar.getInstance();
		exp.add(Calendar.DATE, date); 
		String expiryDate = df.format(exp.getTime());
		return expiryDate;


	}

	public static String findDay()
	{
		DateFormat df = new SimpleDateFormat("dd");
		Calendar exp=Calendar.getInstance();
		exp.add(Calendar.DATE, -1); 
		String expiryDate = df.format(exp.getTime());
		return expiryDate;


	}



	public static void enterText(WebElement element, String Value) {

		new WebDriverWait(getDriver(), 50).until(ExpectedConditions.elementToBeClickable(element));

		element.sendKeys(Value);
	}
	public static void IsVisible(WebElement element) {
		new WebDriverWait(getDriver(), 120).until(ExpectedConditions.visibilityOf(element));		
		System.err.println("element is visible");
	}

	public static void clearValueFromTextBox1(WebElement element) throws InterruptedException {

		new WebDriverWait(getDriver(), 50).until(ExpectedConditions.elementToBeClickable(element));

		Thread.sleep(1500);
		element.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(1500);
		element.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1500);
	}

	public static String PreviousMonth(int Month)
	{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar exp=Calendar.getInstance();
		exp.add(Calendar.MONTH, Month); 
		String expiryDate = df.format(exp.getTime());
		return expiryDate;


	}

	public static String PreviousWeek(int week)
	{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar exp=Calendar.getInstance();
		exp.add(Calendar.WEEK_OF_MONTH, week); 
		String expiryDate = df.format(exp.getTime());
		return expiryDate;


	}

	public static String minusDays(int i)
	{
		LocalDate futureDate = LocalDate.now().minusDays(i);	
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dateStr = futureDate.format(formatter);
		System.out.println("after removing "+i+" days  :"+ dateStr);
		return dateStr;

	}




	public static  String listOfElements(List<WebElement> elementList)
	{

		int count= elementList.size();

		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < count; i++) 
		{
			String data=elementList.get(i).getText();

			if (data.isEmpty() == false) 
			{
				list.add(data);
			}



		}


		String actList=list.toString();

		return actList;

	}

	public static String ListOfElementBold(List<WebElement> elementList)
	{

		ArrayList<String>  AllDatapage1 = new ArrayList<String>(); 

		int count=stockLedgerTable.size();

		System.err.println(count);

		for(int i=0 ; i < count ;i++)
		{
			String style= stockLedgerTable.get(i).getAttribute("style");
			if(style.contains("overflow: visible; font-weight: bold; background-color:"))
			{
				String data=stockLedgerTable.get(i).getText();
				AllDatapage1.add(data);
			}
		}


		String actList=AllDatapage1.toString();

		return actList;

	}




	public static  String listOfElements(int val,List<WebElement> elementList)
	{

		int count= elementList.size();

		ArrayList<String> list = new ArrayList<String>();

		for (int i = val; i < count; i++) 
		{
			String data=elementList.get(i).getText();

			if (data.isEmpty() == false) 
			{
				list.add(data);
			}



		}


		String actList=list.toString();

		return actList;

	}

	public static  boolean ListComparisionWOOrderBold(List<WebElement> elementList,String expRowList)
	{

		String actRowList = ListOfElementBold(elementList);
		List List1 = new ArrayList<String>(Arrays.asList(actRowList.replace("[", "").replace("]", "").replace(" ", "").split(",")));
		List List2 = new ArrayList<String>(Arrays.asList(expRowList.replace("[", "").replace("]", "").replace(" ", "").split(",")));



		Collections.sort(List1);
		Collections.sort(List2);

		System.out.println("actList:"+List1); 
		System.out.println("expList:"+List2);

		boolean result = List1.size() == List2.size()&& List1.equals(List2);
		System.out.println("Two Lists result:"+result);
		return result;
	}


	//printing grandtotal

	public static String GrandTotalList() throws InterruptedException

	{
		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;

		Thread.sleep(1500);

		int rows1=getDriver().findElements(By.xpath("//table[@class='CommonReportTable']//tbody//tr")).size();

		for(  k=1;k<rows1;k++)
		{
			String text1=getDriver().findElement(By.xpath(beforePath + k + afterPath)).getText();

			if(text1.contains("Grand Total"))
			{
				int rowCount=(getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
				System.err.println("count"+rowCount);
				break;
			}	
		}

		int reportsRow1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			reportsRow1ListArray.add(data);
		}

		Thread.sleep(2500);


		String actRow1List = reportsRow1ListArray.toString();

		return actRow1List;


	}

	public static String GrandTotalListWithLimitedData(int count) throws InterruptedException

	{
		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;

		Thread.sleep(1500);

		int rows1=getDriver().findElements(By.xpath("//table[@class='CommonReportTable']//tbody//tr")).size();

		for(  k=1;k<rows1;k++)
		{
			String text1=getDriver().findElement(By.xpath(beforePath + k + afterPath)).getText();

			if(text1.contains("Grand Total"))
			{
				int rowCount=(getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
				System.err.println("count"+rowCount);
				break;
			}	
		}

		int reportsRow1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<count;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			reportsRow1ListArray.add(data);
		}

		Thread.sleep(2500);


		String actRow1List = reportsRow1ListArray.toString();

		return actRow1List;


	}


	public static  boolean ListComparisionWOOrder(List<WebElement> elementList,String expRowList)
	{

		String actRowList = listOfElements(elementList);
		List List1 = new ArrayList<String>(Arrays.asList(actRowList.replace("[", "").replace("]", "").replace(" ", "").split(",")));
		List List2 = new ArrayList<String>(Arrays.asList(expRowList.replace("[", "").replace("]", "").replace(" ", "").split(",")));



		Collections.sort(List1);
		Collections.sort(List2);

		System.out.println("actList:"+List1); 
		System.out.println("expList:"+List2);

		boolean result = List1.size() == List2.size()&& List1.equals(List2);
		System.out.println("Two Lists result:"+result);

		return result;
	}




	public static  boolean ListComparisionWOOrder(int i,List<WebElement> elementList,String expRowList)
	{

		String actRowList = listOfElements(i,elementList);
		List List1 = new ArrayList<String>(Arrays.asList(actRowList.replace("[", "").replace("]", "").replace(" ", "").split(",")));
		List List2 = new ArrayList<String>(Arrays.asList(expRowList.replace("[", "").replace("]", "").replace(" ", "").split(",")));

		System.out.println("actList:"+List1); 
		System.out.println("expList:"+List2);

		Collections.sort(List1);
		Collections.sort(List2);


		boolean result = List1.size() == List2.size()&& List1.equals(List2);
		System.out.println("Two Lists result:"+result);
		return result;
	}




}



