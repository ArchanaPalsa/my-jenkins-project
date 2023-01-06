package com.focus.Repository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementRepository 
{
	// Elements 
		
	  @FindBy(xpath="//*[@id='login_div']/div[1]/div/div/ul/li[3]/a/i")
		public static WebElement  loginPageRestoreBtn;
		
		@FindBy(xpath="//i[@class='icon-security icon-font4']")
		public static WebElement  loginPageSecurityProtectedCompanyBtn;
		

	    @FindBy(xpath="//*[@id='ShowAuthForCreateRestore']/div/div/div[4]/button[1]")
		public static WebElement loginButton;
		
		@FindBy(xpath="//*[@id='ShowAuthForCreateRestore']/div/div/div[4]/button[2]")
		public static WebElement cancelButtonInRestore;
		
		@FindBy(xpath="//*[@id='id_search_menu']/input")
		public static WebElement searchBtnInput;
		
		
		
		

		@FindBy (xpath="//div[@id='ReIndexingError_Modal']/div/div")
			public static WebElement reindexingPopup;

			@FindBy (xpath="(//div[@id='ReIndexingError_Modal']//div/button)[1]")
			public static WebElement reindexingPopupCloseBtn;

			@FindBy (xpath="//div[@id='ReIndexingError_Modal']//*[text()='Cancel']")
			public static WebElement reindexingPopupCancelBtn;

			@FindBy (xpath="//*[@id='ReIndexingError_Modal']//input")
			public static WebElement reindexingPopupSaveBtn;
			
			@FindBy (xpath="//*[@id='login_div']/div[1]/div/div/ul/li[9]/a/i")
			public static WebElement companyRefreshBtn;


		@FindBy(xpath="//button[@id='btnOkForDelete']")
		public static WebElement clickOnOkInDelete;

		@FindBy(xpath="//button[@id='btnCancelForDelete']")
		public static WebElement clickOnCancelInDelete;

		@FindBy(xpath = "//*[@id='idGlobalError']/div/div[2]")
		public static WebElement errorMessage;

		@FindBy(xpath = "//*[@id='idGlobalError']/div/div[1]/button")
		public static WebElement errorMessageCloseBtn;


		@FindBy(xpath="//*[@id='id_mainlayoutmenu']/ul[2]/li[5]/a")
		public static WebElement userNameDisplay;
		
		@FindBy(xpath="//div[@class='adminprofile']")
		public static WebElement LogoutDropdown;
		
		
		// Document Set
		
	   

	    //Restore Screen Options
	    @FindBy(xpath="//*[@id='navbarSupportedContent2']/ul/li/a/i")
	    public static WebElement restoreCompanyBtnOfLoginPage;
	    
	    @FindBy(xpath="//input[@id='txtRestoreFile']")
	    public static WebElement restoreInputTxt;
	    
	    @FindBy(xpath="//button[@class='btn Fbutton']")
	    public static WebElement restoreBrowseBtn;
	    
	    @FindBy(xpath="//*[@id='RestoreCompanyModal']/div/div/div[2]/button[1]")
	    public static WebElement restoreOverwriteYesBtn;
	    
	    @FindBy(xpath="//*[@id='RestoreCompanyModal']/div/div/div[2]/button[1]")
		public static WebElement OverwriteYesBtn;
		
		@FindBy(xpath="//*[@id='RestoreCompanyModal']/div/div/div[2]/button[2]")
		public static WebElement OverwriteNoBtn;
		
		@FindBy(xpath="//*[@id='RestoreCompanyModal']/div/div/div[2]/button[3]")
		public static WebElement OverwriteCancelBtn;

	@FindBy(xpath="//i[@title='Create Company']")
	public static WebElement companyCreateBtn;


	@FindBy(xpath="//*[@id='txtAdminUsername']")
	public static WebElement adminName;

	@FindBy(xpath="//*[@id='txtAdminPassword']")
	public static WebElement adminPassword;

	@FindBy(xpath="//*[@id='ShowAuthForCreateRestore']/div/div/div[4]/button[1]")
	public static WebElement okButton;

	@FindBy(xpath="//*[@id='ShowAuthForCreateRestore']/div/div/div[4]/button[2]")
	public static WebElement cancelButton;



	@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
	public static WebElement companyName;

	@FindBy(xpath="//*[@id='CompanyName']")
	public static WebElement CompanyName;

	@FindBy(xpath="//*[@id='id_chkrememberme_div']/label/span")
	public static WebElement rememberMeChk;

	@FindBy(xpath="//*[@id='chkRememberMe']")
	public static WebElement rememberMeChkBox;

	@FindBy(xpath="//*[@id='id_chkrememberpwd_div']/label/span")
	public static WebElement rememberPwdChk;

	@FindBy(xpath="//*[@id='chkRememberPwd']")
	public static WebElement rememberPwdChkBox;



	@FindBy(xpath="//div[@id='errorCompanyName']")
	public static WebElement getCompanyNameError;

	@FindBy(xpath="//*[@id='CalendarType']")
	public static WebElement calendarType;

	@FindBy(xpath="//*[@id='CreateTabDateField_input_container']/div[1]/i[2]")
	public static WebElement datePicker;	

	@FindBy(xpath="//input[@id='CreatedDate']")
	public static WebElement accountingDate;

	@FindBy(xpath="//*[@id='CreateTabDateField_day_today']/td/span[1]")
	public static WebElement getDate;

	@FindBy(id="securityNormal")
	public static WebElement securityNormal;

	@FindBy(id="securityLow")
	public static WebElement securityLow;

	@FindBy(id="securityHigh")
	public static WebElement securityHigh;

	@FindBy(xpath="//input[@id='SUserPassword']")
	public static WebElement passwordSU;

	@FindBy(xpath=" //div[@id='errorUserPassword']")
	public static WebElement getPasswordErrorMsg;

	@FindBy(id="chkRemeberLoginCredentials")
	public static WebElement rememberLoginCredentials;

	@FindBy(id="chkUnauthorizedUsers")
	public static WebElement unAuthorizeUsers;

	@FindBy(id="Currency1")
	public static WebElement globalCurrency;

	@FindBy(xpath="//select[@id='Country']")
	public static WebElement country;

	@FindBy(xpath="//select[@id='DefLanguages']")
	public static WebElement defaultLanguage;

	@FindBy(xpath="//*[@id='companyLogo']")
	public static WebElement companyLogo;

	@FindBy(xpath="//img[@id='CompanyLogo']")
	public static WebElement companylgo;

	@FindBy(xpath="/html/body/section/div[2]/header/nav/div/ul/li[6]/a/span[1]")
	public static WebElement userImage;



	@FindBy(xpath="//*[@id='company_Languages']/div[1]/label/span")
	public static WebElement languagesEnglish;

	@FindBy(xpath="//*[@id='company_Languages']/div[1]/label/input")
	public static WebElement languagesEnglishSelected;



	@FindBy(xpath="//*[@id='company_Languages']/div[2]/label/span")
	public static WebElement languagesArabic;

	@FindBy(xpath="//*[@id='company_Languages']/div[2]/label/input")
	public static WebElement languagesArabicSelected;



	@FindBy(xpath="//*[@id='company_Languages']/div[3]/label/span")
	public static WebElement languagesPersian;

	@FindBy(xpath="//*[@id='company_Languages']/div[3]/label/input")
	public static WebElement languagesPersianSelected;

	@FindBy(xpath="//*[@id='company_Languages']/div[4]/label/span")
	public static WebElement languagesChinese;

	@FindBy(xpath="//*[@id='company_Languages']/div[4]/label/input")
	public static WebElement languagesChineseSelected;

	@FindBy(xpath="//*[@id='company_Languages']/div[5]/label/span")
	public static WebElement languagesSpanish;

	@FindBy(xpath="//*[@id='company_Languages']/div[5]/label/input")
	public static WebElement languagesSpanishSelected;

	@FindBy(xpath="//*[@id='company_Languages']/div[6]/label/span")
	public static WebElement languagesPortuguese;

	@FindBy(xpath="//*[@id='company_Languages']/div[6]/label/input")
	public static WebElement languagesPortugueseSelected;

	@FindBy(xpath="//*[@id='company_Languages']/div[7]/label/span")
	public static WebElement languagesIndonesian;

	@FindBy(xpath="//*[@id='company_Languages']/div[7]/label/input")
	public static WebElement languagesIndonesianSelected;

	@FindBy(xpath="//*[@id='btn_common_header']/ul/li[1]/a/i")
	public static WebElement okButtonInCreateCompany;

	@FindBy(xpath="//*[@id='btn_common_header']/ul/li[2]/a/i")
	public static WebElement cancelButtonInCreateCompany;

	@FindBy(xpath="(//*[@id='panelsStayOpen-headingOne']/button)[1]")
	public static WebElement companyMinimizeAndMaximize;




	@FindBy(xpath="//*[@id='txtUsername']")
	public static WebElement username;

	@FindBy(id="txtPassword")
	public static WebElement password;

	@FindBy(id="ddlCompany")
	public static WebElement companyDropDownList;

	@FindBy(id="btnSignin")
	public static WebElement signIn;

	@FindBy(xpath="//i[@title='Keyboard ']")
	public static WebElement keyboardBtn;

	@FindBy(xpath="//i[@title='Refresh']")
	public static WebElement refreshBtn;



	@FindBy(id="frgtPwd")
	public static WebElement frgtPwdLnk;



	@FindBy(xpath="//div[@id='Layout_Popup']//input[2]")
	public static WebElement noIn;

	@FindBy(linkText="Create Company")
	public static WebElement createCompanyScreen;

	@FindBy(xpath="//*[@id='errmsgDiv']")
	public static WebElement mandatoryMsgs;

	//Fields of Company su Home Page


	@FindBy(xpath="//*[@id='mainHeader_MainLayout']/a/img")
	public static WebElement focusLogo;

	@FindBy(xpath="//*[@id='id_focus8_wrapper_default']/aside/section")
	public static WebElement menuBar;

	@FindBy(xpath="//*[@id='Dashboard_ddlList']/li/a")
	public static WebElement dashboardName;

	@FindBy(xpath="//*[@id='dashIcons']")
	public static WebElement dashboardIcons;


	@FindBy(xpath="//div[@id='id_mainlayoutmenu']/ul[2]/li[6]//ul/li[1]")
	public static WebElement changePassword;

	@FindBy(xpath="//select[@id='id_languageoptions']")
	public static WebElement languageDropdownInLogout;

	@FindBy(xpath="//*[@id='id_user_profile_icons']/li[2]/a")
	public static WebElement logoutOption;

	@FindBy(xpath="//*[@id='dashName']")
	public static WebElement dashboard;

	@FindBy(xpath="//ul[@id='ulCompanyDetails_HomePage']")
	public static WebElement companydetails;

	

	@FindBy(xpath="//span[@class='pull-right']")
	public static WebElement closeBtnInDemoPopupScreen;

	//Financial Menu
	@FindBy (xpath="//*[@id='60' and @title='Financials']")
	public static WebElement financialMenu;

	//Fixed Assets Menu
	@FindBy (xpath="//span[@class='icon-assets icon-font1']")
	public static WebElement fixedAssetsMenu;

	//Production Menu
	@FindBy (xpath="//span[@class='icon-production icon-font1']")
	public static WebElement productionMenu;

	//Point Of Sale Menu
	@FindBy (xpath="//div[contains(text(),'Point of Sale')]")
	public static WebElement pointOfSaleMenu;

	//Quality Of Control Menu
	@FindBy (xpath="//span[@class='icon-quotationanalysis icon-font1']")
	public static WebElement qualityControlMenu;

	//Settings Menu
	@FindBy (xpath="//a[@id='16']")
	public static WebElement SettingsMenu;

	@FindBy(xpath="//ul[@id='navigation_menu']/li[8]/ul/li/a/span")
	public static List<WebElement> SettingsSubMenusList;

	//Inventory Menu and Sub Menus		
	@FindBy(xpath="//*[@id='135']")
	public static WebElement  inventoryMenu; 

	@FindBy(xpath = "//div[@id='id_left_mainmenu']/ul/li/a")
	public static List<WebElement> menusList;

	@FindBy(xpath = "//*[@id='mainHeader_MainLayout']/nav/div/ul/li")
	public static List<WebElement> navbarList;

	@FindBy (xpath="//a[@id='dropdown03']")
	public static WebElement aboutQuickAcessMenu;

	@FindBy (xpath="//input[@id='id_ai_search_input']")
	public static WebElement aiSearchTextBox;

	@FindBy (xpath="(//div[@id='mainHeader_MainLayout']//div/input)[3]")
	public static WebElement searchTxtBox;

	@FindBy (xpath="//div[@id='id_mainlayoutmenu']/ul[2]/li[1]/a")
	public static WebElement productTour;

	@FindBy (xpath="//div[@id='id_mainlayoutmenu']/ul[2]/li[3]/a")
	public static WebElement alertsOptions;

	@FindBy (xpath="//div[@id='id_mainlayoutmenu']/ul[2]/li[2]/a")
	public static WebElement recentMenus;


	// AccountsPage

	@FindBy (xpath="//a[@id='1']")
	public static WebElement homeMenu;

	//Masters Menu	
	@FindBy (xpath="//*[@id='1000']//span")
	public static WebElement mastersMenu;

	//Accounts 
	@FindBy (xpath="//a[@id='1104']//span[contains(text(),'Account')]")
	public static WebElement accounts;


	//Accounts Title
	@FindBy (xpath="//*[@id='masterFirstDiv']/nav/div/nav/ol/li[3]")
	public static WebElement accountsTitle;


	//Master Main Header Fields		
	@FindBy(xpath="//*[@id='btnNew']/i")
	public static WebElement masterNewBtn;

	@FindBy(xpath="//*[@id='btnAddGroup']/i")
	public static WebElement masterAddGroupBtn; 

	@FindBy(xpath="//*[@id='btnMasterEdit']/i")
	public static WebElement masterEditBtn; 

	@FindBy(xpath="//*[@id='btnClone']/i")
	public static WebElement masterCloneBtn; 

	@FindBy(xpath="//*[@id='btnProperties']/i")
	public static WebElement masterPropertiesBtn; 


	//customization account


	@FindBy(xpath="//button[@id='btnDeleteTab_MCust']")
	public static WebElement tabs_DeleteBtn; 

	@FindBy(xpath="//button[@id='btnCreateTab_MCust']")
	public static WebElement createTab; 

	@FindBy(xpath="//*[@id='MCustomize_CreateTreeTab_Modal']/div[2]/div/div[3]/div/input[1]")
	public static WebElement  treeTab_OkBtn;

	@FindBy(xpath="//*[@id='MCustomize_CreateTreeTab_Modal']/div[2]/div/div[3]/div/input[2]")
	public static WebElement  treeTab_CancelBtn;


	@FindBy(xpath="//input[@id='txtNewTreeTabCaption']")
	public static WebElement  treeTabCaptionTxt;

	@FindBy(xpath="//input[@id='txtNewTreeTabName']")
	public static WebElement  treeTabTabNameTxt;

	@FindBy(xpath="//input[@id='fOption_tab_masterName']")
	public static WebElement  treeTabNewMastertxt;

	@FindBy(xpath="//*[@id='fOption_tab_masterName_input_container']/div[2]/table/tbody/tr/td[1]/i")
	public static WebElement  treeTabNewMasterdropdown;

	@FindBy(xpath="//*[@id='fOption_tab_masterName_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement  treeTab_NewMasterSettingsBtn;

	@FindBy(xpath="//input[@id='txtNewTreeTabFieldCaption']")
	public static WebElement  treeTab_FieldCaptiontxt;

	@FindBy(xpath="//input[@id='txtNewTreeTabFieldName']")
	public static WebElement  treeTab_FieldNameTxt;

	@FindBy(xpath="//*[@id='MCustomize_CreateTreeTab_Modal']/div[2]/div/div[2]/div/div[6]/div/div/div/label/span")
	public static WebElement  treeTab_HiddenChkBox;

	//reports


	@FindBy(xpath="//*[@id='tabContent_Reports_MasterCust']/div[1]/div/div[2]/nav/ul/li[1]/a/i")

	public static WebElement  accountReports_SaveBtn;

	@FindBy(xpath="(//*[@id='btnCloseMasterCutomizationFromMasterScreen']/a)[9]")
	public static WebElement  accountReports_CloseBtn;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[1]/label/input")
	public static WebElement  reports_AdvancedbudgetReportChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[1]/div/label/span")
	public static WebElement  reports_MasterInfoChkBox;


	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[2]/div/label/span")
	public static WebElement  reports_ABCAnalysisAmountChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[3]/div/label/span")
	public static WebElement  reports_BankBookChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[4]/div/label/span")
	public static WebElement  reports_BankreconciliationstatementChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[5]/div/label/span")
	public static WebElement  reports_CashBookChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[7]/div/label/span")
	public static WebElement  reports_ComparativeAnalysisChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[8]/div/label/span")
	public static WebElement  reports_CustomerAgeingDetailsAnalysisChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[9]/div/label/span")
	public static WebElement  reports_CustomerageingdetailbyduedateChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[10]/div/label/span")
	public static WebElement  reports_CustomerageingsummaryanalysisChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[11]/div/label/span")
	public static WebElement  reports_CustomerbillwisesummaryChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[12]/div/label/span")
	public static WebElement  reports_CustomerduedateanalysisChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[13]/div/label/span")
	public static WebElement  reports_CustomerlistingofoutstandingbillsChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[14]/div/label/span")
	public static WebElement  reports_CustomeroverdueanalysisChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[15]/div/label/span")
	public static WebElement  reports_CustomeroverduesummaryChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[16]/div/label/span")
	public static WebElement  reports_CustomerstatementsChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[17]/div/label/span")
	public static WebElement  reports_CustomersummaryageingbyduedateChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[18]/div/label/span")
	public static WebElement  reports_IncomeExpenseTrendChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[19]/div/label/span")
	public static WebElement  reports_InterestcalculationChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[20]/div/label/span")
	public static WebElement  reports_LedgerChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[21]/div/label/span")
	public static WebElement  reports_LedgerdetailChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[22]/div/label/span")
	public static WebElement  reports_MonthlySalesChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[23]/div/label/span")
	public static WebElement  reports_PeakandlowbalanceamountChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[24]/div/label/span")
	public static WebElement  reports_PettycashbookChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[25]/div/label/span")
	public static WebElement  reports_PurchaseregisterChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[26]/div/label/span")
	public static WebElement  reports_PurchasereturnregisterChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[27]/div/label/span")
	public static WebElement  reports_PurchasesgroupedbydepartmentChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[28]/div/label/span")
	public static WebElement  reports_PurchasesgroupedbyItemChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[29]/div/label/span")
	public static WebElement  reports_PurchasesgroupedbyvendorChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[30]/div/label/span")
	public static WebElement  reports_SalesdaybookChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[31]/div/label/span")
	public static WebElement  reports_SalesgroupedbycustomerChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[32]/div/label/span")
	public static WebElement  reports_salesgroupedbydepartmentrChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[33]/div/label/span")
	public static WebElement  reports_SalesgroupedbyItemChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[34]/div/label/span")
	public static WebElement  reports_SalesreturnregisterChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[35]/div/label/span")
	public static WebElement  reports_SchedulesChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[36]/div/label/span")
	public static WebElement  reports_SubledgerChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[37]/div/label/span")
	public static WebElement  reports_SummarypurchaseregisterChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[38]/div/label/span")
	public static WebElement  reports_SummarysalesregisterChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[39]/div/label/span")
	public static WebElement  reports_TopCustomersChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[40]/div/label/span")
	public static WebElement  reports_TradingaccountrChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[41]/div/label/span")
	public static WebElement  reports_TransactionstypeanalysisChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[42]/div/label/span")
	public static WebElement  reports_VendorageingdetailanalysisChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[43]/div/label/span")
	public static WebElement  reports_VendorageingdetailbyduedateChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[44]/div/label/span")
	public static WebElement  reports_VendorageingsummaryanalysisChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[45]/div/label/span")
	public static WebElement  reports_VendorbillwisesummaryChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[46]/div/label/span")
	public static WebElement  reports_VendorduedateanalysisChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[47]/div/label/span")
	public static WebElement  reports_VendorlistingofoutstandingbillsChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[48]/div/label/span")
	public static WebElement  reports_VendoroverdueanalysisChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[49]/div/label/span")
	public static WebElement  reports_VendoroverduesummaryChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[50]/div/label/span")
	public static WebElement  reports_VendorstatementsChkBox;

	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[51]/div/label/span")
	public static WebElement  reports_VendorsummaryageingbyduedateChkBox;

	@FindBy(xpath="//*[@id='masterFields_list']/li[5]/a")
	public static WebElement customizeMasterCreateTreeTabNewlyCreate; 	

	@FindBy(xpath="//input[@id='txtEditTabCaption']")
	public static WebElement customizeMasterCreateTreeTabNewlyCreateTabCaption; 	

	@FindBy(xpath="//*[@id='MCustomize_EditTab_Modal']/div[2]/div/div[2]/div/div[2]/div/div/div/label/span")
	public static WebElement customizeMasterCreateTreeTabNewlyCreateHidden; 	

	@FindBy(xpath="//*[@id='MCustomize_EditTab_Modal']/div[2]/div/div[3]/div/input[1]")
	public static WebElement customizeMasterCreateTreeTabNewlyCreateOkButton; 	

	@FindBy(xpath="//*[@id='MCustomize_EditTab_Modal']/div[2]/div/div[3]/div/input[2]")
	public static WebElement customizeMasterCreateTreeTabNewlyCreateCancelButton; 

	@FindBy(xpath="(//tbody[@class='ui-sortable']//tr[1]//td[text()='Tree Tab'])[1]")
	public static WebElement customizeMasterCreateTreeTabNewlyFieldInBodyDetails; 	


	@FindBy(xpath="//*[@id='tab_HeaderDetails_4']")
	public static WebElement customizeMasterCreateTreeTabNewlyHeaderDetails; 	

	//               
	@FindBy(xpath="//*[@id='HeaderDetails_4']/div/div")
	public static WebElement customizeMasterCreateTreeTabNewlyBlankInHeaderDetails; 	

	@FindBy(xpath="//*[@id='tab_BodyDetails_4']")
	public static WebElement customizeMasterCreateTreeTabNewlyBodyDetails; 	



	@FindBy(xpath="//input[@id='txtNewDocTabCaption']")
	public static WebElement documentTab_TabCaption;  

	@FindBy(xpath="//input[@id='txtNewDocTabName']")
	public static WebElement documentTab_TabName;  

	@FindBy(xpath="//*[@id='MCustomize_CreateDocTab_Modal']/div[2]/div/div[2]/div/div[3]/div/div/div/label/span")
	public static WebElement documentTab_HiddenChkbox;  

	@FindBy(xpath="//*[@id='MCustomize_CreateDocTab_Modal']/div[2]/div/div[3]/div/input[1]")
	public static WebElement documentTab_OkBtn;  

	@FindBy(xpath="//*[@id='MCustomize_CreateDocTab_Modal']/div[2]/div/div[3]/div/input[2]")
	public static WebElement documentTab_CancelBtn; 

	@FindBy(xpath="//*[@id='masterFields_list']/li[6]/a")
	public static WebElement customizeMasterCreateDocumentTabNewlyCreate; 

	@FindBy(xpath="//*[@id='tab_HeaderDetails_5']")
	public static WebElement customizeMasterCreateDocumentTabNewlyHeaderDetails; 	

	@FindBy(xpath="//*[@id='HeaderDetails_5']/div/div")
	public static WebElement customizeMasterCreateDocumentTabNewlyBlankInHeaderDetails;

	@FindBy(xpath="//*[@id='tab_BodyDetails_5']")
	public static WebElement customizeMasterCreateDocumentTabNewlyBodyDetails; 	

	@FindBy(xpath="(//tbody[@class='ui-sortable']/tr[1]/td[text()='File Name'])[1]")
	public static WebElement customizeMasterCreateDocumentTabFieldName; 

	@FindBy(xpath="(//*[@id='example']/tbody/tr[2]/td[text()='Document'])[1]")
	public static WebElement customizeMasterCreateDocumentTabDocument; 

	@FindBy(xpath="(//*[@id='example']/tbody/tr[3]/td[text()='Created Date'])[1]")
	public static WebElement customizeMasterCreateDocumentTabCreatedDate; 

	@FindBy(xpath="(//*[@id='example']/tbody/tr[4]/td[text()='Last Modified'])[1]")
	public static WebElement customizeMasterCreateDocumentTabLastModified; 

	@FindBy(xpath="(//*[@id='example']/tbody/tr[5]/td[text()='File Size'])[1]")
	public static WebElement customizeMasterCreateDocumentFileSize; 



	@FindBy(xpath="//input[@id='txtNewTabCaption']")
	public static WebElement createTab_TabCaptionTxt;  

	@FindBy(xpath="//input[@id='txtNewTabName']")
	public static WebElement createTab_TabNameTxt;  

	@FindBy(xpath="//*[@id='MCustomize_CreateTab_Modal']/div[2]/div/div[2]/div/div[3]/div/div/div/label/span")
	public static WebElement createTab_PopHiddenChkbox;  

	@FindBy(xpath="//*[@id='MCustomize_CreateTab_Modal']/div[2]/div/div[3]/div/input[1]")
	public static WebElement createTab_PopOkBtn;  

	@FindBy(xpath="//*[@id='MCustomize_CreateTab_Modal']/div[2]/div/div[3]/div/input[2]")
	public static WebElement createTab_PopCloseBtn; 

	@FindBy(xpath="//*[@id='masterFields_list']/li[7]/a")
	public static WebElement customizeMasterCreateCreateTabNewlyCreateTab; 	

	@FindBy(xpath="//*[@id='tab_HeaderDetails_6']")
	public static WebElement customizeMasterCreateTabHeaderDetails; 

	@FindBy(xpath="//*[@id='HeaderDetails_6']/div/div")
	public static WebElement customizeMasterCreateTabBlankHeaderDetails; 	

	@FindBy(xpath="//*[@id='tab_BodyDetails_6']")
	public static WebElement customizeMasterCreateTabBodyDetails; 	

	@FindBy(xpath="//*[@id='BodyDetails_6']/div/div")
	public static WebElement customizeMasterCreateTabBlankBodyDetails; 

	@FindBy(xpath="//*[@id='all_TabsField']/div[8]/nav/div/div/ul/li[1]/a/i")
	public static WebElement customizeMasterCreateTabNewlyCreateTabSaveButton; 	

	@FindBy(xpath="(//*[@id='btnAdd_Field_MasterCust']/a/i)[1]")
	public static WebElement customizeMasterCreateTabAddButton; 	

	@FindBy(xpath="(//*[@id='btnPreview']/a/i)[1]")
	public static WebElement customizeMasterCreateTabPreviewButton; 	

	@FindBy(xpath="(//*[@id='btnCloseMasterCutomizationFromMasterScreen']/a/i)[1]")
	public static WebElement customizeMasterCreateTabCloseButton; 	




	@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[1]/label/span")
	public static WebElement extraFields_PropertiesTabPartOfDeliveryAddressChekbox;

	@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[2]/label/span")
	public static WebElement extraFields_PropertiesPartOfBillingAddressChekbox;

	@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[4]/label/span")
	public static WebElement extraFields_PropertiesAllowAsParameterChekbox;

	@FindBy(xpath="//input[@id='FieldsDetails_IsHidden']//following-sibling::span")
	public static WebElement extraFields_PropertiesHiddenChekbox;

	@FindBy(xpath="//input[@id='FieldsDetails_HiddenInGroup']//following-sibling::span")
	public static WebElement extraFields_PropertiesHiddenInGroupChekbox;

	@FindBy(xpath="//input[@id='FieldsDetails_SpellCheck']//following-sibling::span")
	public static WebElement extraFields_PropertiesSpellCheckChekbox;

	@FindBy(xpath="//input[@id='FieldsDetails_MandatoryInGroup']//following-sibling::span")
	public static WebElement extraFields_PropertiesMandatoryInGroupChekbox;

	@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[9]/label/span")
	public static WebElement extraFields_PropertiesAuditTrialChekbox;

	@FindBy(xpath="//input[@id='FieldsDetails_NotAvailableForReports']//following-sibling::span")
	public static WebElement extraFields_PropertiesNotAvailableForReportsChekbox;

	@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[11]/label/span")
	public static WebElement extraFields_PropertiesMergeFieldChekbox;

	@FindBy(xpath="//input[@id='FieldsDetails_MassUpdate']//following-sibling::span")
	public static WebElement extraFields_PropertiesMassUpdateChekbox;

	@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[13]/label/span")
	public static WebElement extraFields_PropertiesIncludeInQuickCreateChekbox;

	@FindBy(xpath="//input[@id='FieldsDetails_CannotBeExported']//following-sibling::span")
	public static WebElement extraFields_PropertiesCannotBeExportedChekbox;

	@FindBy(xpath="//input[@id='FieldsDetails_CannotBeImported']//following-sibling::span")
	public static WebElement extraFields_PropertiesCannotBeImportedChekbox;

	@FindBy(xpath="//input[@id='FieldsDetails_CopyFromParent']//following-sibling::span")
	public static WebElement extraFields_PropertiesCopyFromParentChekbox;

	@FindBy(xpath="//input[@id='FieldsDetails_ReadOnly']//following-sibling::span")
	public static WebElement extraFields_PropertiesReadOnlyChekbox;

	@FindBy(xpath="//input[@id='FieldsDetails_InformationField']//following-sibling::span")
	public static WebElement extraFields_PropertiesInformationFieldChekbox;

	/*@FindBy(xpath="//*[@id='FieldsDetails_IsMandatoryInRevision']")
				public static WebElement extraFields_PropertiesIsMandatoryInRevisionChekbox;*/

	@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[19]/label/span")
	public static WebElement extraFields_PropertiesIsMandatoryInRevisionChekbox;



	@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[20]/label/span")
	public static WebElement extraFields_PropertiesAvailableinCustomerPortalChekbox;

	@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[21]/label[2]/span")
	public static WebElement extraFields_PropertiesEditableinCustomerPortalChekbox;

	@FindBy(xpath="//*[@id='Behaviour']")
	public static WebElement extraFields_PropertiesBehaviourDropdown;     



	@FindBy(xpath="(//*[@id='example']/tbody/tr[2]/td[text()='Exra Field Two'])[1]")
	public static WebElement extraFields_SecondFieldInHeaderDetailsTab;


	@FindBy(xpath="//*[@id='btnMove_Field_MasterCust']/a/i")
	public static WebElement extraFields_MoveFieldOption;

	@FindBy(xpath="//*[@id='ddlAllTabs_MasterFieldTab']")
	public static WebElement extraFields_MoveFieldTabName;

	@FindBy(xpath="//*[@id='defaultChecked']")
	public static WebElement extraFields_MoveFieldHeader;

	@FindBy(xpath="//*[@id='defaultChecked1']")
	public static WebElement extraFields_MoveFieldBody;

	@FindBy(xpath="//*[@id='MCustomize_MoveField_Modal']/div[2]/div/div[3]/div/div/input[1]")
	public static WebElement extraFields_MoveFieldOkButton;

	@FindBy(xpath="//*[@id='MCustomize_MoveField_Modal']/div[2]/div/div[3]/div/div/input[1]")
	public static WebElement extraFields_MoveFieldCancelButton;


	@FindBy(xpath="(//*[@id='example']/tbody/tr[3]/td[1]/i[1])[3]")
	public static WebElement extraFields_SettingsTab_MoveField;

	@FindBy(xpath="(//*[@id='example']/tbody/tr[1]/td[text()='Debit / Credit proposal'])[1]")
	public static WebElement extraFields_SettingsTab_First;

	@FindBy(xpath="(//*[@id='example']/tbody/tr[1]/td[1]/i[2])[2]")
	public static WebElement extraFields_SettingsTab_FirstDelete;

	@FindBy(xpath="(//*[@id='example']/tbody/tr[3]/td[1]/i[2])[2]")
	public static WebElement extraFields_SettingsTab_MoveFieldOptsDelete;

	@FindBy(xpath="//label[@id='lblWarnMessage_FieldModal' and text()=' Are you sure that you want to delete selected Field']")
	public static WebElement extraFields_SettingsTab_DeleteMessage;

	@FindBy(xpath="//*[@id='MCustomize_DeleteField_Modal']/div[2]/div/div[3]/div/div/input[2]")
	public static WebElement extraFields_SettingsTab_DeleteMessageNoOption;

	@FindBy(xpath="//*[@id='MCustomize_DeleteField_Modal']/div[2]/div/div[3]/div/div/input[1]")
	public static WebElement extraFields_SettingsTab_DeleteMessageYesOption;


	@FindBy(xpath="//*[@id='divBtnGroup0']")
	public static WebElement extraFields_GeneralTab;

	@FindBy(xpath="//*[@id='divBtnGroup1']")
	public static WebElement extraFields_SettingsTab;

	@FindBy(xpath="//*[@id='divBtnGroup2']")
	public static WebElement extraFields_DetailsTab;

	@FindBy(xpath="//*[@id='divBtnGroup3']")
	public static WebElement extraFields_PrintLayout;

	@FindBy(xpath="//*[@id='divBtnGroup4']")
	public static WebElement extraFields_TreeTabUpdate;

	@FindBy(xpath="//*[@id='divBtnGroup5']")
	public static WebElement extraFields_DocumentTab;

	@FindBy(xpath="//*[@id='divBtnGroup6']")
	public static WebElement extraFields_CreateTab;

	@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/div/ul/li[2]/button[5]")
	public static WebElement extraFields_PreviewTab_CloseBtn;

	@FindBy(xpath="(//*[@id='btnPreview']/a/i)[1]")
	public static WebElement extraFields_PreviewTab;


	@FindBy(xpath="//input[@id='sFileName1']")
	public static WebElement extraFields_PreviewTab_DocumentTab_FileName;

	@FindBy(xpath="//input[@id='biDocument1']")
	public static WebElement extraFields_PreviewTab_DocumentTab_Document;

	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/div[1]")
	public static WebElement extraFields_PreviewTab_DocumentTab_UploadDocument;

	@FindBy(xpath="//*[@id='SaveImg']")
	public static WebElement extraFields_PreviewTab_DocumentTab_SaveDocument;

	@FindBy(xpath="//*[@id='tblMasterNewGeneratorBody']/tr/td[5]/div/div/div[3]/i")
	public static WebElement extraFields_PreviewTab_DocumentTab_DeleteDocument;

	@FindBy(xpath="//*[@id='dCreatedDate1']")
	public static WebElement extraFields_PreviewTab_DocumentTab_CreateDate;

	@FindBy(xpath="//*[@id='iFileSize1']")
	public static WebElement extraFields_PreviewTab_DocumentTab_FileSize;



	@FindBy(xpath="//span[contains(text(),'Account Properties')]")
	public static WebElement accountPropertiesLabelTxt;

	@FindBy(xpath="//input[@id='rbnNormal']")
	public static WebElement normalRadioBtn;

	@FindBy(xpath="//input[@id='rbnDisplayDebitCreditTotalForEachAccountUnderGroup']")
	public static WebElement  displayDebitCreditTotalForEachAccountUnderGroup;

	@FindBy(xpath="//input[@id='rbnClubTranOfAllAcctsUnderGrpWhenDispInLedger']")
	public static WebElement  ClubTheTransactionsofAllTheAccountsUnderGroup;

	@FindBy(xpath="//input[@id='rbnShowSummaryOfAccount']")
	public static WebElement showSummaryOfTheAccountRadioBtn ;	

	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/div[1]/table/tbody/tr[4]/td/label/span")
	public static WebElement suspendCreditLimitChkbox ;

	@FindBy(xpath="//input[@id='rbnDisplayDebitCreditTotalForEachMonth']")
	public static WebElement  displayDebitCreditTotalForEachMonthRadioBtn;

	@FindBy(xpath="//input[@id='rbnrbnDisplayDebitCreditTotalForEachDay']")
	public static WebElement  displayDebitCreditTotalForEachDayRadioBtn;

	@FindBy(xpath="//input[@id='rbnNone']")
	public static WebElement  noneRadioBtn;

	@FindBy(xpath="//input[@id='rbnConsolidateWhenBothAccountsAreSame']")
	public static WebElement consolidateWhenBothAccountsAreSameRadioBtn ;

	@FindBy(xpath="//input[@id='rbnConsolidateAlways']")
	public static WebElement consolidateAlwaysRadioBtn ;

	@FindBy(xpath="//select[@id='ddlStatus']")
	public static WebElement  statusDropdown;

	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/div[3]/table/tbody/tr[2]/td/label/span")
	public static WebElement  doNotRestrictSelectionEvenIfRightsNotAllottedCheckboxInAccountProperties;

	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/div[3]/table/tbody/tr[3]/td/label/span")
	public static WebElement allowOtherCompaniesToViewRecordsCheckboxInAccountProperties;

	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/div[3]/table/tbody/tr[4]/td/label/span")
	public static WebElement generateLedgerByCurrencyCheckbox;

	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/div[3]/table/tbody/tr[5]/td/label/span")
	public static WebElement sendSmsEmailWhereverAcDebitedCreditedCheckbox;









	//customization account

	//bins properties page

	//Properties Page
	@FindBy(xpath="//span[contains(text(),'Bins Properties')]")
	public static WebElement accountPropertiesLabel;

	@FindBy(xpath="//span[contains(text(),'Department Properties')]")
	public static WebElement departmentPropertiesLabel;


	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/div/table/tbody/tr[2]/td/label/span")
	public static WebElement  doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox;

	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/div/table/tbody/tr[3]/td/label/span")
	public static WebElement allowOtherCompaniesToViewRecordsCheckbox;

	@FindBy(xpath="//span[@id='btnPropOk']")
	public static WebElement properties_okBtn;

	@FindBy(xpath="//*[@id='divModal_properties']/div[1]/div[2]/ul/li[2]/span/i")
	public static WebElement  properties_cancelBtn;




	@FindBy(xpath="//*[@id='btnDelete']/i")
	public static WebElement masterDeleteBtn; 

	@FindBy(xpath="//*[@id='btnClose']/i")
	public static WebElement masterCloseBtn; 

	@FindBy(xpath="//*[@id='btnGroup']")
	public static WebElement masterGroupBtn; 

	@FindBy(xpath="//*[@id='drpdownSlider']/a/i")
	public static WebElement masterRibbonToExpandOptions; 

	@FindBy(xpath="//*[@id='btnDeleteAll']")
	public static WebElement masterDeleteAllBtn; 

	@FindBy(xpath="//*[@id='btnCloseAccount']")
	public static WebElement masterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity; 

	@FindBy(xpath="//*[@id='btnOpenCloseAccount']")
	public static WebElement masteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState; 

	@FindBy(xpath="//*[@id='btnAdvImportForMaster']")
	public static WebElement masterAdvanceMasterImportORExportBtn; 

	@FindBy(xpath="//*[@id='btnAuthInfo']")
	public static WebElement masterAuthorInfoBtn; 

	@FindBy(xpath="//*[@id='btnCustomizeTree']")
	public static WebElement MastercustamizeTreeBtn; 
	
	@FindBy(xpath="//*[@id='btnMoveUp']")
	public static WebElement masterMoveUpBtn; 

	@FindBy(xpath="//*[@id='btnMOveDown']")
	public static WebElement masterMoveDownBtn; 

	@FindBy(xpath="//*[@id='btnSorting']")
	public static WebElement masterSortBtn; 

	@FindBy(xpath="//*[@id='btnMassUpdate']")
	public static WebElement masterMassUpdateBtn; 

	@FindBy(xpath="//a[@class='lSNext']")
	public static WebElement masterRibbonControlNextBtn; 

	@FindBy(xpath="//*[@id='btnXMLImport']")
	public static WebElement masterImportFromXmlBtn; 

	@FindBy(xpath="//*[@id='btnXMLExport']")
	public static WebElement masterExportFormatToXmlBtn; 

	@FindBy(xpath="//*[@id='btnCustomizeMaster']")
	public static WebElement masterCustamizemasterBtn; 


	@FindBy(xpath="//h4[contains(text(),'Create Tree')]")
	public static WebElement treeID_CreateTreeLabel; 

	

	@FindBy(xpath="//*[@id='allMasterCustTabs']/li[2]/a")
	public static WebElement TabUniqueConstraints;

	@FindBy(xpath="//*[@id='txtConstraintName']")
	public static WebElement UniqueConstraints_ConstraintNameText;

	@FindBy(xpath="//*[@id='txtConstraintName_table_body']/tr/td[2]")
	public static List<WebElement> uniqueConstraintsList;

	@FindBy(xpath="//*[@id='btnDelete_UniqueConstraints']/a/i")
	public static WebElement UniqueConstraintsDeleteBtn;


	@FindBy(xpath="//div[@class='col-md-6']//ul//li[3]//i[@class='icon-close iconbreadcom']")
	public static WebElement UniqueConstraintsCloseBtn;

	@FindBy(xpath="//i[@class='icon-font6 icon-options']")
	public static WebElement masterCustamizeViewBtn; 

	@FindBy(xpath="//*[@id='btnCustomizeTree']")
	public static WebElement mastercustamizeTreeBtn; 


	@FindBy(xpath="//*[@id='btnLedger']")
	public static WebElement masterLedgerBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-financial-1']")
	public static WebElement masterManageCreditBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-department-appropriation']")
	public static WebElement masterDepartmentAppropriationBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-budget']")
	public static WebElement masterBudgetBtn; 


	

	@FindBy(xpath="//*[@id='btnBackTrack']")
	public static WebElement masterBackTrackBtn; 


	@FindBy(xpath="//*[@id='btnTransfer']")
	public static WebElement masterTranferBtn; 
	
	@FindBy(xpath="//*[@id='btnNewSets']")
	public static WebElement masterNewSetBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-modifier']")
	public static WebElement masterModifierBtn; 

	@FindBy(xpath="//*[@id='btnSetType']")
	public static WebElement masterSetTypeBtn; 

	@FindBy(xpath="//i[@class='icon-convert icon-font6']")
	public static WebElement masterUnitConversionBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-alternate-product-1']")
	public static WebElement masterAlternateItemBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-related-product']")
	public static WebElement masterRelatedItemBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-stock-ledger']")
	public static WebElement masterStockLedgerBtn; 



	@FindBy(xpath="//tbody[@id='LandingGridBody']/tr/td[11]")
	public static List<WebElement> masterAccountsList;


	//AccountType	
	@FindBy(xpath="//select[@id='iAccountType']")
	public static WebElement accountTypeDropdown;


	//CreditLimit
	@FindBy(xpath="//input[@id='fCreditLimit']")
	public static WebElement creditLimitTxt;

	//CreditDays
	@FindBy(xpath="//input[@id='iCreditDays']")
	public static WebElement creditdaysTxt;



	//Accounts Creation Page 

	//Header tab Fields

	@FindBy(xpath="//div[@class='tabbable-line']//a[@id='divBtnGroup0']")
	public static WebElement headerGeneralTab;

	@FindBy(xpath="//div[@class='tabbable-line']//a[@id='divBtnGroup1']")
	public static WebElement headerAccountSettingTab;

	@FindBy(xpath="//div[@class='tabbable-line']//a[@id='divBtnGroup2']")
	public static WebElement headerDetailsTab;

	@FindBy(xpath="//div[@class='tabbable-line']//a[@id='divBtnGroup3']")
	public static WebElement headerPrintLayoutTab;


	//Header Section Fields

	@FindBy(xpath="//*[@id='ExtraFieldOne']")
	public static WebElement extraFields_PreviewTab_CreateCreateTab_ExtraFieldUpdate;



	@FindBy(xpath="//input[@id='sFileName1']")
	public static WebElement extraFields_DocumentTab_FileName;

	@FindBy(xpath="//input[@id='biDocument1']")
	public static WebElement extraFields_DocumentTab_Document;

	@FindBy(xpath="//tr[1]//td[5]//div[1]//div[1]//div[1]")
	public static WebElement extraFields_DocumentTab_UploadDocument;

	@FindBy(xpath="//a[@id='SaveImg']")
	public static WebElement extraFields_DocumentTab_SaveDocument;

	@FindBy(xpath="//i[@class='fa fa-eraser RemoveImg']")
	public static WebElement extraFields_DocumentTab_DeleteDocument;

	@FindBy(xpath="//input[@id='iFileSize1']")
	public static WebElement extraFields_DocumentTab_FileSize;




	@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	public static WebElement closeBtn;


	@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]/i")
	public static WebElement CloseBtn;

	@FindBy(xpath="//*[@id='btnCustomizeClose']/i")
	public static WebElement CloseBtnINDC;








	//ChequeDiscountLimit
	@FindBy(xpath="//input[@id='fChequeDiscountLimit']")
	public static WebElement chequeDiscountLimitTxt;


	//Rate Of Interest
	@FindBy(xpath="//input[@id='fRateofinterest']")
	public static WebElement rateofinterestTxt;

	//Group Accounts
	@FindBy(xpath="//*[@id='18']/a[1]")
	public static WebElement accountAssestsGroup;

	@FindBy(xpath="//*[@id='17']/a[1]")
	public static WebElement accountFixedAssestsGroup;

	@FindBy(xpath="//*[@id='23']/a[1]")
	public static WebElement accountCurrentAssetsGroup;

	@FindBy(xpath="//*[@id='8']/a[1]")
	public static WebElement accountCAshAndBankGroup;

	@FindBy(xpath="//*[@id='13']/a[1]")
	public static WebElement accountInventoriesGroup;

	@FindBy(xpath="//*[@id='22']/a[1]")
	public static WebElement accountAccountsReceivableGroup;

	@FindBy(xpath="//*[@id='84']/a[1]")//*[@id="83"]/a[2]
	protected
	static WebElement accountAccountsReceivableCustomerUpdateGroup;

	@FindBy(xpath="//*[@id='72']/a[1]")
	public static WebElement accountInvestmentsGroup;

	@FindBy(xpath="//*[@id='25']/a[1]")
	public static WebElement accountExpensesGroup;

	@FindBy(xpath="//*[@id='24']/a[1]")
	public static WebElement accountDirectExpensesGroup;

	@FindBy(xpath="//*[@id='73']/a[1]")
	public static WebElement accountIndirectExpensesGroup;

	@FindBy(xpath="//*[@id='54']/a[1]")
	public static WebElement accountAdministrativeExpensesGroup;

	@FindBy(xpath="//*[@id='60']/a[1]")
	public static WebElement accountEmployeeBenefitsGroup;

	@FindBy(xpath="//*[@id='64']/a[1]")
	public static WebElement accountFinancialChargesGroup;

	@FindBy(xpath="//*[@id='69']/a[1]")
	public static WebElement accountGainAndLossGroup;

	@FindBy(xpath="//*[@id='26']/a[1]")
	public static WebElement accountControlAccountsGroup;

	@FindBy(xpath="//*[@id='29']/a[1]")
	public static WebElement accountRevenueGroup;

	@FindBy(xpath="//*[@id='28']/a[1]")
	public static WebElement accountSalesGroup;

	@FindBy(xpath="//*[@id='33']/a[1]")
	public static WebElement accountEqitiesGroup;

	@FindBy(xpath="//*[@id='32']/a[1]")
	public static WebElement accountCapitalGroup;

	@FindBy(xpath="//*[@id='39']/a[1]")
	public static WebElement accountLiabilitiesGroup;

	@FindBy(xpath="//*[@id='38']/a[1]")
	public static WebElement accountLoanAndBorrowingGroup;

	@FindBy(xpath="//*[@id='37']/a[1]")
	public static WebElement accountLoansGroup;

	@FindBy(xpath="//*[@id='42']/a[1]")
	public static WebElement accountAccruedLiabilitiesGroup;

	@FindBy(xpath="//*[@id='45']/a[1]")
	public static WebElement accountTradePayableGroup;

	@FindBy(xpath="//*[@id='48']/a[1]")
	public static WebElement accountProvisionsGroup;

	@FindBy(xpath="//*[@id='oncheckaccorderan']")
	public static WebElement masterOptionToHideAccountsGroupTree; /////To hide TreeId and TreeViewId Elements From HomeScreen

	//TreeViewID//Elements		




	//Header Elements of Master MainLanding
	@FindBy(xpath="//*[@id='txtsrch-term']")
	public static WebElement masterSearchTxt; 

	@FindBy(xpath="//*[@id='divsearchLanding']/i")
	public static WebElement masterSearchBtn; 

	/*  @FindBy(xpath="//a[contains(text(),'Search on')]")
	public static WebElement masterSearchTxtBtn_SearchOnBtn; 								

	@FindBy(xpath="//a[contains(text(),'Advance Search')]")
	public static WebElement masterSearchTxtBtn_AdvanceSearchBtn; */

	@FindBy(xpath="//input[@id='cmbUserTypeMaster']")
	public static WebElement mastercmbMasterTxt; 

	@FindBy(xpath="//*[@id='cmbUserTypeMaster_input_container']/div[2]/table/tbody/tr/td[1]/i")
	public static WebElement masterCmbMasterExpansionBtn; 

	@FindBy(xpath="//*[@id='li_moveup']/ul/li[1]/a/span")
	public static WebElement masterMoveTheSelectionToNextBookMarkBtn; 

	@FindBy(xpath="//*[@id='li_moveup']/ul/li[2]/a/span")
	public static WebElement masterMoveTheSelectionToPrevoiusBookmarkBtn; 

	@FindBy(xpath="//*[@id='li_moveup']/ul/li[3]/a/span")
	public static WebElement masterShowAllRecordsBtn; 

	@FindBy(xpath="//*[@id='id_showAllUnAuth']/span")
	public static WebElement masterShowAllUnauthorisedRecords; 

	@FindBy(xpath="//*[@id='id_ShowAllClosed']/span")
	public static WebElement masterShowAllClosedRecordsBtn; 

	@FindBy(xpath="//*[@id='chkResizeGrid']/span")
	public static WebElement masterAutoAdjustColoumnsBtn; 

	@FindBy(xpath="//*[@id='lbl_Retain']/span")
	public static WebElement masterRetainSelectionCheckBox; 

	@FindBy(xpath="//*[@id='btnsideBar']")
	public static WebElement masterSideBarBtn; 






	//BankAccount
	@FindBy(xpath="//input[@id='iBankAc']")
	public static WebElement bankAccountTxt;

	@FindBy(xpath="//*[@id='iBankAc_input_image']/span")
	public static WebElement bankAccount_ExpansionBtn;

	@FindBy(xpath="//*[@id='iBankAc_input_settings']/span")
	public static WebElement bankAccount_SettingBtn;


	@FindBy(xpath="//*[@id='btnDelete']/i")
	public static WebElement deleteBtn;

	@FindBy(xpath="//div[@id='idGlobalError']")
	public static WebElement validationConfirmationMessage;



	@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	public static WebElement masterNewCloseBtn;

	@FindBy(xpath="//*[@id='LandingGridBody']/tr[1]/td[11]")
	public static WebElement accountCreation;

	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[4]/span[1]")
	public static WebElement clickOnVendorGroup;

	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	public static WebElement getVendorGroupName;

	@FindBy(xpath="//button[@class='btn-link theme_icon-color btnGenerateMasterclose closeMasterPartial clsMasterSaveClose']//i[@class='icon-font6 icon-close']")
	public static WebElement closeAccountCreationScreen;

	@FindBy(xpath="//input[@id='chkRetainSelection']")
	public static WebElement accountMasterRetain;

	@FindBy(xpath="//input[@id='liSelectAllMasters']")
	public static WebElement accountMasterSelect;

	@FindBy(xpath="(//label[@id='lblnchecked']/input)[1]")
	public static WebElement accountFirstCheckBox;

	@FindBy(xpath="(//label[@id='lblnchecked']/input)[2]")
	public static WebElement accountSecondCheckBox;

	@FindBy(xpath="//button[@class='btn-link theme_icon-color btnGenerateMasterclose closeMasterPartial clsMasterSaveClose']")
	public static WebElement closeAccMasterCreationScreen;


	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/button[5]/i[1]")
	public static WebElement closeMaster;

	@FindBy(xpath="//tbody[@id='LandingGridBody']//tr[1]//td[8]")
	public static WebElement unitFirstCheckBox;

	@FindBy(xpath="//tbody[@id='LandingGridBody']//tr[1]//td[10]")
	public static WebElement accountNewCreationName;

	@FindBy(xpath="//*[@id='ol_treeNavigation']/li[2]/span")
	public static WebElement accountGroupTitleDisplay;

	@FindBy(xpath="//*[@id='ol_treeNavigation']/li[1]/span")
	public static WebElement binsFirstLevelMastersDisplay;

	@FindBy(xpath="//*[@id='Dashboard_AddDash']/a/i")
	public static WebElement newAddDashBoard;

	@FindBy(xpath="//*[@id='Dashboard_Dash_Config']/a/i")
	public static WebElement dashboardCustomizationSettings;


	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-left ulNewMaster']//li[2]//button[1]")
	public static WebElement SaveBtn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[2]")
	public static WebElement  select1stRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[3]")
	public static WebElement  select1stRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[4]")
	public static WebElement  select1stRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[5]")
	public static WebElement  select1stRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[6]")
	public static WebElement  select1stRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[7]")
	public static WebElement  select1stRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[8]")
	public static WebElement  select1stRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[9]")
	public static WebElement  select1stRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[10]")
	public static WebElement  select1stRow_9thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[11]")
	public static WebElement  select1stRow_10thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[12]")
	public static WebElement  select1stRow_11thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[13]")
	public static WebElement  select1stRow_12thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[14]")
	public static WebElement  select1stRow_13thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[15]")
	public static WebElement  select1stRow_14thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[16]")
	public static WebElement  select1stRow_15thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[17]")
	public static WebElement  select1stRow_16thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[18]")
	public static WebElement  select1stRow_17thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[19]")
	public static WebElement  select1stRow_18thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[20]")
	public static WebElement  select1stRow_19thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[21]")
	public static WebElement  select1stRow_20thColumn;
	



	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/button[2]")
	public static WebElement unitSaveBtns;

	@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/ul/li[2]/button[1]/i")
	public static WebElement unitSaveBtn;


	@FindBy(xpath="//a[@id='btnClose']/i")
	public static WebElement unitsCloseBtn;

	@FindBy(xpath="//*[@id='oncheckaccorderan']")
	public static WebElement masterOptionToHideItemGroupDisplay;



	@FindBy(xpath="//*[@id='cmbUserTypeMaster_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement masterCumMasterSettingBtn; 

	@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_container']")
	public static WebElement masterCumMaster_Pop_sNameTxt;

	@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_footer']/div/div/button")
	public static WebElement masterCumMaster_StandardFieldsBtn;

	@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_heading']")
	public static WebElement masterCumMaster_PopCustomizeDispalyColumnsLabel; 		

	@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_standardfields_list']")
	public static WebElement masterCumMaster_Pop_StandardFields_Filedsdropdown;

	@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_standardfields_header']")
	public static WebElement masterCumMaster_Pop_StandardFields_HeaderTxt;

	@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_standardfields_alignment']")
	public static WebElement masterCumMaster_Pop_StandardFields_Allignmentdropdown;

	@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_standardfields_width']")
	public static WebElement masterCumMaster_Pop_StandardFields_WidthTxt;

	@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_footer']/div/div/input[2]")
	public static WebElement masterCumMaster_Pop_StandardFields_OkBtn;

	@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_footer']/div/div/input[3]")
	public static WebElement masterCumMaster_Pop_StandardFields_CancelBtn;

	@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_footer']/div/div/input[1]")
	public static WebElement masterCumMaster_Pop_DeleteColumnBtn;

	@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_footer']/div/div/input[2]")
	public static WebElement masterCumMaster_Pop_OkBtn;

	@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_footer']/div/div/input[3]")
	public static WebElement masterCumMaster_Pop_CancelBtn;


	// Item Page(Focus x)

	@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[12]")
	public static List<WebElement> masterItemGridBodyName;

	@FindBy(xpath="//*[@id='iTreeId']")
	public static WebElement masterTreeIdDropdown; 

	@FindBy(xpath="//*[@id='treeCombo']/div/span/label")
	public static WebElement masterTreeIDToggleBtn; 

	@FindBy(xpath="//select[@id='iTreeViewId']")
	public static WebElement masterTreeViewIDDropdown; 

	@FindBy(xpath="//*[@id='treeView']/div/span/label")
	public static WebElement masterTreeViewIDToggleBtn;

	@FindBy(xpath="//*[@id='treeCombo']/div/ul/li[1]/a")
	public static WebElement masterTreeIDToggle_CreateTreeBtn; 


	@FindBy(xpath="//input[@id='liSelectAllMasters']")
	public static WebElement itemMasterSelect;

	@FindBy(xpath="//*[@id='treeView']/div/ul/li[1]/a")
	public static WebElement masterTreeViewIdCreateViewBtn; 

	@FindBy(xpath="//*[@id='treeView']/div/ul/li[2]/a")
	public static WebElement masterTreeeViewIdEditBtn; 

	@FindBy(xpath="//*[@id='treeView']/div/ul/li[3]/a")
	public static WebElement masterTreeViewIdDeleteBtn; 

	@FindBy(xpath="//*[@id='createViewDiv']/div[1]/div[1]/h4")
	public static WebElement CreateView_Label; 

	@FindBy(xpath="//*[@id='btnCancel']/i")
	public static WebElement CreateView_CloseBtn; 


	@FindBy(xpath="//*[@id='treeCombo']/div/ul/li[2]/a")
	public static WebElement masterTreeIDToggle_EditBtn; 

	@FindBy(xpath="//*[@id='treeCombo']/div/ul/li[3]/a")
	public static WebElement masterTreeIDToggle_DeleteBtn; 

	@FindBy(xpath="//*[@id='treeCombo']/div/ul/li[4]/a")
	public static WebElement masterTreeIDToggle_setDefaultBtn;

	@FindBy(xpath="//div[@id='divTreeMenu']")
	public static WebElement treeDepartmentDisplay;








	// Units Test

	@FindBy (xpath="//a[@id='1114']")
	public static WebElement unitsMenu;


	@FindBy(xpath="//tbody[@id='LandingGridBody']/tr/td[10]")
	public static List<WebElement> masterItemUnitsList;


	// Currency Test

	@FindBy(xpath="//*[@id='220']")
	public static WebElement currencyMenu;

	@FindBy(xpath="//*[@id='70']/span[text()='Currency Master']")
	public static WebElement currencyMasterMenu;

	@FindBy(xpath="//a[@id='71']//span[contains(text(),'Exchange Rate')]")
	public static WebElement exchangeRateMenu;

	@FindBy(xpath="//*[@id='formid']/div[1]/nav/div/nav/ol/li[4]")
	public static WebElement exchangeRateDefinitionLabel;



	@FindBy(xpath="//span[contains(text(),'Exchange Rate History')]")
	public static WebElement exchangeRateHistoryMenu;


	///Exchange Rate History

	@FindBy(xpath="//*[@id='page_Content']/div/div[1]/nav/div/nav/ol/li[4]")
	public static WebElement exchangeRateHistoryLabel;

	@FindBy(xpath="//input[@id='id_option']")
	public static WebElement baseCurrencyInExchangeRateHistory;

	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 col-vsm-12']/div[@class='input-group']//select[@id='DateOption']")
	public static WebElement dateOptionDropdown;

	@FindBy(xpath="//*[@id='dpFromDate']")
	public static WebElement fromDateTxt;

	@FindBy(xpath="//*[@id='dpToDate']")
	public static WebElement toDateTxt ;

	@FindBy(xpath="//*[@id='ShowData']")
	public static WebElement loadIcon;

	@FindBy(xpath="//*[@id='btnCan']")
	public static WebElement exchangeRateHistoryclearIcon;


	@FindBy(xpath="//*[@id='navbarSupportedContent2']/ul/li/a/i")
	public static WebElement exchangeRateHistoryCloseIcon;

	@FindBy(xpath="//*[@id='id_RightDiv']/div[1]/div/div/div/ul/li[2]/a")
	public static WebElement graphTab;

	@FindBy(xpath="//*[@id='id_RightDiv']/div[1]/div/div/div/ul/li[1]/a")
	public static WebElement tableTab;




	@FindBy(xpath="//li[@id='btnClose']")
	public static WebElement currencyMasterCancelBtn;


	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[4]/ul/li[3]/ul//li//span")
	public static List<WebElement> currencyMenuList;

	@FindBy(xpath="//*[@id='CurrencyMainDiv']/div[1]/nav/div/nav/ol/li[4]")
	public static WebElement currencyMasterlabel;

	@FindBy(xpath=" (//div[@id='navbarSupportedContent2'])[1]//ul[@class='Pnav navbar-nav ml-auto']//li")
	public static List<WebElement> currencyRibbonControlList;

	@FindBy(xpath="//*[@id='currencyMasterWidth']/div[1]/div/div/label")
	public static List<WebElement> currencyDetailsLableList;

	@FindBy(xpath="//*[@id='currencyMasterWidth']/div[1]/div/div/div")
	public static List<WebElement> currencyDetailsDropdownList;



	@FindBy(xpath="//*[@id='currencyMasterWidth']/div[2]/div[1]//div")
	public static List<WebElement> roundingOffDetailsList;

	@FindBy(xpath="//*[@id='currencyMasterWidth']/div[2]/div[2]/div")
	public static List<WebElement> currencyConnectorList;



	@FindBy(xpath="//*[@id='CurrencyMasterGridDiv']/label")
	public static WebElement denominationDetailsLabel;

	@FindBy(xpath="//*[@id='CurrencyMasterGrid_head']/tr/th/div")
	public static List<WebElement> denominationDetailsGridHeader;

	@FindBy(xpath="//*[@id='ISOCurrencyCode']")
	public static WebElement ISOCurrencyCodeTxt;

	@FindBy(xpath = "//input[@id='NoOfDesimals']")
	public static WebElement noOfDecimalsTxtInCurrency;

	@FindBy(xpath="//*[@id='CoinsName']")
	public static WebElement coinsNameTxt;

	@FindBy(xpath="//*[@id='currencyName']")
	public static WebElement currencyNameTxt;

	@FindBy(xpath="//*[@id='GeneralRoundOff']")
	public static WebElement generalRoundOffTxt;

	@FindBy(xpath="//input[@id='CurrencyUnit']")
	public static WebElement currencyUnitTxt;

	@FindBy(xpath="//input[@id='CurrencySubUnit']")
	public static WebElement currencySubUnitTxt;

	@FindBy(xpath="//input[@id='connector']")
	public static WebElement connectorTxt;

	@FindBy(xpath="//input[@id='controlSymbol']")
	public static WebElement controlSymbolDropdown;


	@FindBy(xpath="//*[@id='exchange_currency']/a/i")
	public static WebElement exchangeRateIcon;

	@FindBy(xpath="//*[@id='btnClear']/a/i")
	public static WebElement clearIcon;

	@FindBy(xpath="//*[@id='btnSave']/a/i")
	public static WebElement saveIcon;

	@FindBy(xpath="//*[@id='btnClose']/a/i")
	public static WebElement cancelIcon;

	@FindBy(xpath="(//div[@id='navbarSupportedContent2'])[2]/ul/li")
	public static List<WebElement> exchangeRateDefintionRibbonControlList;

	@FindBy(xpath="//div[@id='navbarSupportedContent2']/ul/li")
	public static List<WebElement> ExchangeRateDefintionRibbonControlList;

	@FindBy(xpath="//*[@id='div_ExchangeRate']/div[2]/div/div[1]/button/preceding-sibling::h4")
	public static WebElement exchangeRateDefinitionLabelInPopup;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_1-1']")
	public static WebElement exchangeRateDefinitionCurrencyNameRow1Col1;

	@FindBy(xpath = "//*[@id='ExchangeTable_col_1-1']")
	public static WebElement exchangeRateDefinitionCurrencyNameRow1Col1q;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_2-1']")
	public static WebElement exchangeRateDefinitionCurrencyNameRow2Col1;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_1-2']")
	public static WebElement exchangeRateDefinitionDefinedAsRow1Col2;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_2-2']")
	public static WebElement exchangeRateDefinitionDefinedAsRow2Col2;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_1-3']")
	public static WebElement exchangeRateDefinitionRateRow1Col3;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_2-3']")
	public static WebElement exchangeRateDefinitionRateRow2Col3;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_1-4']")
	public static WebElement exchangeRateDefinitionDescriptionRow1Col4;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_2-4']")
	public static WebElement exchangeRateDefinitionDescriptionRow2Col4;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_3-1']")
	public static WebElement exchangeRateDefinitionCurrencyNameRow3Col1;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_4-1']")
	public static WebElement exchangeRateDefinitionCurrencyNameRow4Col1;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_3-2']")
	public static WebElement exchangeRateDefinitionDefinedAsRow3Col2;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_4-2']")
	public static WebElement exchangeRateDefinitionDefinedAsRow4Col2;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_3-3']")
	public static WebElement exchangeRateDefinitionRateRow3Col3;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_4-3']")
	public static WebElement exchangeRateDefinitionRateRow4Col3;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_3-4']")
	public static WebElement exchangeRateDefinitionDescriptionRow3Col4;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_4-4']")
	public static WebElement exchangeRateDefinitionDescriptionRow4Col4;

	@FindBy(xpath="//*[@id='id_option_table_body']/tr/td[2]")
	public static List<WebElement> baseCurrencyComboList;



	// Exchange Rate and Exchange Rate History

	@FindBy(xpath="//*[@id='navbarSupportedContent2']//li[4]")
	public static WebElement exchangeRateDefinitionSaveIcon;

	@FindBy(xpath="//*[@id='navbarSupportedContent2']//li[2]")
	public static WebElement exchnageRateDeleteOption;


	@FindBy(xpath="//*[@id='id_option_table_body']/tr/td[2]")
	public static List<WebElement> baseCurrencyListCount;



	@FindBy(xpath="(//*[@id='navbarSupportedContent2']/ul/li[3]/a/i)[2]")
	public static WebElement exchangeRateDefinitionSaveIconInPopup;

	@FindBy(xpath="//*[@id='div_ExchangeRate']/div[2]/div/div[1]/button")
	public static WebElement exchangeRateDefinitionPopCloseIcon;

	@FindBy(xpath="//*[@id='btnCurrencyMasterCancel']/a/i")
	public static WebElement exchangeRateDefinitionPageCloseIconInPopup;


	@FindBy(xpath="//input[@id='id_option']")
	public static WebElement baseCurrencyTxt;

	@FindBy(xpath="//input[@id='EffectiveDate']")
	public static WebElement withEffectiveDateTxt;


	@FindBy(xpath="//input[@id='ExchangeTable_DefinedAs']")
	public static WebElement gridDefineAsTxt;

	@FindBy(xpath="//input[@id='ExchangeTable_Rate']")
	public static WebElement gridRateTxt;

	@FindBy(xpath="//input[@id='ExchangeTable_CurrencyName']")
	public static WebElement gridcurrencyName1Txt;

	@FindBy(xpath="//li[@id='closeExchangeRate']")
	public static WebElement exchangeRateDefinitionPageCloseIcon;



	@FindBy(xpath="//tbody[@id='HistoryTableBody']/tr[2]/td[3]")
	public static WebElement valueUSD;

	@FindBy(xpath="//tbody[@id='HistoryTableBody']/tr[2]/td[4]")
	public static WebElement valueAED;

	@FindBy(xpath="//td[@id='ExchangeTable_col_1-2']")
	public static WebElement selCurrencyOne;

	@FindBy(xpath="//td[@id='ExchangeTable_col_2-2']")
	public static WebElement selCurrecnyTwo;

	@FindBy(xpath="//td[@id='ExchangeTable_col_1-3']")
	public static WebElement defCurrecnyOne;

	@FindBy(xpath="//td[@id='ExchangeTable_col_2-3']")
	public static WebElement defCurrecnyTwo;



	// Check Import From Excel in Exchange Rate

	@FindBy(xpath = "//input[@id='uploadFile']")
	public static WebElement importFilePathTxt;

	// input[@id='uploadBtn']
	@FindBy(xpath = "//*[@id='formLoadDataExcel']/div/div/span/span")
	public static WebElement importFileBtn;

	@FindBy(xpath = "//div[contains(text(),'Exchange Rate Fields')]")
	public static WebElement importFileExchangeRateColumnName;

	@FindBy(xpath = "//div[contains(text(),'External Fields')]")
	public static WebElement importFileExternalFieldsColumnName;

	@FindBy(xpath = "//td[@id='ImportTable_col_1-1']")
	public static WebElement importFileBaseCurrencyName;

	@FindBy(xpath = "//td[@id='ImportTable_col_1-2']")
	public static WebElement importFileBaseCurrencyValue;

	@FindBy(xpath = "//td[@id='ImportTable_col_2-1']")
	public static WebElement importFileEffectiveDateName;

	@FindBy(xpath = "//td[@id='ImportTable_col_2-2']")
	public static WebElement importFileEffectiveDateValue;

	@FindBy(xpath = "//td[@id='ImportTable_col_3-1']")
	public static WebElement importFileDefinedCurrencyName;

	@FindBy(xpath = "//td[@id='ImportTable_col_3-2']")
	public static WebElement importFileDefinedCurrencyValue;

	@FindBy(xpath = "//td[@id='ImportTable_col_4-1']")
	public static WebElement importFileRateName;

	@FindBy(xpath = "//td[@id='ImportTable_col_4-2']")
	public static WebElement importFileRateValue;

	@FindBy(xpath = "//td[@id='ImportTable_col_5-1']")
	public static WebElement importFileSelectedCurrencyName;

	@FindBy(xpath = "//td[@id='ImportTable_col_5-2']")
	public static WebElement importFileSelectedCurrencyValue;

	@FindBy(xpath = "//input[@id='btnImportData' and @class='FButton-Primary']")
	public static WebElement importDataBtn;

	@FindBy(xpath = "//*[@id='btnImportData'  and @class='FButton-Secondary']")
	public static WebElement closeImportBtn;




	// Departments Test

	@FindBy (xpath="//a[@id='1106']//span[contains(text(),'Department')]")
	public static WebElement departmentMenu;

	@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[10]")
	public static List<WebElement> masterDepartmentGridBodyName;




	// Bins Test



	//Wrapper Layout
	/*@FindBy(xpath="//*[@id='idquickAccessMenus_Main']/span[1]")
	public static WebElement aboutIdQuickAccessMenu;*/

	@FindBy(xpath="//*[@id='dropdown03']/span")
	public static WebElement aboutIdQuickAccessMenu;



	/*@FindBy(xpath="//*[@id='quickAccessDiv']/ul/li[1]/a")
		public static WebElement favouriteOption;*/


	@FindBy(xpath="//*[@id='nav-Favourite-tab']")
	public static WebElement favouriteOption;



	/*@FindBy(xpath="//*[@id='quickAccessDiv']/ul/li[2]/a")
		public static WebElement recentItemsOpion;*/

	@FindBy(xpath="//*[@id='nav-Recent-tab']")
	public static WebElement recentItemsOpion;

	@FindBy(xpath="//*[@id='nav-Run-tab']")
	public static WebElement runOption;

	/*@FindBy(xpath="//*[@id='quickAccessDiv']/ul/li[3]/a")
		public static WebElement runOption;*/

	/*@FindBy(xpath="//*[@id='quickAccessDiv']/ul/li[4]/a/span")
		public static WebElement quickAccessOption;*/

	@FindBy(xpath="//*[@id='nav-Quick-tab']")
	public static WebElement quickAccessOption;



	/*@FindBy(xpath="//*[@id='quickAccessDiv']/ul/li[5]/a")
		public static WebElement aboutOption;*/

	@FindBy(xpath="//*[@id='nav-About-tab']")
	public static WebElement aboutOption;

	@FindBy(xpath="//*[@id='about']/div[1]/img")
	public static WebElement aboutImage;

	@FindBy(xpath="//*[@id='idAboutCompany']/div[1]/label[2]")
	public static WebElement aboutVersioin;



	@FindBy(xpath="//*[@id='idAboutCompany']/div[2]/label[2]")
	public static WebElement aboutRelease;

	@FindBy(xpath="//*[@id='idAboutCompany']/div[3]/label[2]")
	public static WebElement aboutLicensed;

	/*@FindBy(xpath="//input[@id='txtSearchMenu_MainLayout']")
	public static WebElement searchOption;*/

	@FindBy(xpath="//*[@id='id_search_menu']/input")
	public static WebElement searchOption;

	/*@FindBy(xpath="//*[@id='mainHeader_MainLayout']/nav/div/ul/li[2]/a/i")
	public static WebElement productTourOption;*/

	@FindBy(xpath="//*[@id='id_mainlayoutmenu']/ul[2]/li[1]/a/i")
	public static WebElement productTourOption;

	/*@FindBy(xpath="//*[@id='mainHeader_MainLayout']/nav/div/ul/li[3]/a/i")
	public static WebElement alertsOption;*/

	@FindBy(xpath="//*[@id='id_mainlayoutmenu']/ul[2]/li[3]/a/i")
	public static WebElement alertsOption;


	/*@FindBy(xpath="//img[@class='user-image theme_button_color']")
	public static WebElement imgOfTheUser;*/


	/*@FindBy(xpath="//*[@id='securityNavBar']/div/div[1]/a/div/span[2]")
			public static WebElement changePasswordTitle;*/

	@FindBy(xpath="//*[@id='changePwd']/div[1]/div/nav/div/nav/ol/li[3]")
	public static WebElement changePasswordTitle;

	/*@FindBy(xpath="//*[@id='myNavbar']/ul/li/span[1]/i")
			public static WebElement changePasswordSaveBtn;*/

	@FindBy(xpath="//*[@id='navbarSupportedContent2']/ul/li[1]/a/i")
	public static WebElement changePasswordSaveBtn;

	/*@FindBy(xpath="//*[@id='myNavbar']/ul/li/span[2]/i")
			public static WebElement changePasswordCloseBtn;*/


	@FindBy(xpath="//*[@id='navbarSupportedContent2']/ul/li[2]/a/i")
	public static WebElement changePasswordCloseBtn;

	@FindBy(xpath="//*[@id='oldPassword']")
	public static WebElement changePasswordOldPasswordTxt;

	@FindBy(xpath="//*[@id='newPassword']")
	public static WebElement changePasswordNewPasswordTxt;

	@FindBy(xpath="//*[@id='confirmPassword']")
	public static WebElement changePasswordConfirmTxt;


	@FindBy(xpath="//span[@class='hidden-xs']")
	public static WebElement textNameOfTheUser;

	@FindBy(xpath="//i[@class='fa fa-caret-down']")
	public static WebElement dropdownMenuUserChangePasswordLanguageAndLogout;

	@FindBy(xpath="//*[@id='companyLogo']")
	public static WebElement companyLogoImg;


	@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
	public static WebElement companyNameInCompanyLogo;

	@FindBy (xpath="//*[@id='1115']/span")
	public static WebElement binsMenu;

	@FindBy (xpath="//*[@id='1161']/span")
	public static WebElement taxCode;

	@FindBy (xpath="//*[@id='1161']/span")
	public static WebElement TaxcodeMenu;



	@FindBy(xpath="//*[@id='id_mainlayoutmenu']/ul[2]/li[5]/a")
	public static WebElement userNameTxt;
	
	@FindBy(xpath="//*[@id='identifierId']")
	public static WebElement  UserNameTxt;

	@FindBy(xpath="//span[contains(text(),'Sales invoice VAT')]")
	public static WebElement  salesInvoiceVATVoucher;
	
	  @FindBy(xpath="//*[@id='id_Cancel']/a")
	    public static WebElement  billRefcancel;  
	    


	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[4]/ul/li")
	public static List<WebElement> masterSubMenusList;

	@FindBy(xpath="//input[@id='iColNo']")
	public static WebElement binColNoTxt;

	@FindBy(xpath="//tbody[@id='LandingGridBody']/tr/td[8]/div[1]/label/input")
	public static List<WebElement> masterItemUnitsChkboxList;


	// Unit Conversion Test

	@FindBy(xpath="//a[@id='72']/span")
	public static WebElement  homeMasterItem_UnitConversionMenu;

	@FindBy(xpath="//input[@id='optionBaseUnit']")
	public static WebElement unitConversionBaseUnitTxt;

	@FindBy(xpath="//input[@id='optionProduct']")
	public static WebElement unitConversionItemTxt;

	@FindBy(xpath="//td[@id='myTagsTable_col_1-2']")
	public static WebElement unitConversionTableRow1Col1;

	@FindBy(xpath="//td[@id='myTagsTable_col_1-3']")
	public static WebElement unitConversionTableRow1Col2;

	@FindBy(xpath="//td[@id='myTagsTable_col_1-4']")
	public static WebElement unitConversionTableRow1Col3;

	@FindBy(xpath="//td[@id='myTagsTable_col_1-5']")
	public static WebElement unitConversionTableRow1Col4;

	@FindBy(xpath="//td[@id='myTagsTable_col_1-6']")
	public static WebElement unitConversionTableRow1Col5;

	@FindBy(xpath="//input[@id='myTagsTable_UnitName']")
	public static WebElement unitConversion_EnterUnitNameTxt;

	@FindBy(xpath="//input[@id='myTagsTable_XFactor']")
	public static WebElement unitConversion_EnterXFactorTxt;

	@FindBy(xpath="//*[@id='ucCancel']/span")
	public static WebElement unitConversionCancelBtn;

	@FindBy(xpath="//*[@id='btnDeleteUnitConversion']/span")
	public static WebElement unitConversionDeleteBtn;


	// Configure Masters Test


	@FindBy(xpath="//*[@id='navigation_menu']/li[8]/ul/li")
	public static List<WebElement> settingsSubMenusList;

	@FindBy(xpath="//div[@id='masterTreeMenu']//ul//li//a//span")
	public static List<WebElement> menuList;

	@FindBy(xpath="//div[@id='masterTreeMenu']/ul//li/a/i")
	public static List<WebElement> menuPlus;
	@FindBy(xpath="//a[contains(@class,'menu-selected theme_color-inverse')]//span[@class='Flabel'][contains(text(),'Masters')]")
	public static WebElement cmMastermenu;


	@FindBy(xpath="//*[@id='1182']/span")
	public static WebElement ConfigMasterInMastersList;

	@FindBy(xpath="//input[@id='sName']")
	public static WebElement  nameTxt;

	@FindBy(xpath="//input[@id='sCode']")
	public static WebElement codeTxt ;

	@FindBy(xpath="//input[@id='iCapacity']")
	public static WebElement  capacityTxt;

	@FindBy(xpath="//input[@id='fCurrentCapacity']")
	public static WebElement  currentCapacityTxt;

	@FindBy(xpath="//select[@id='iType']")
	public static WebElement  typeDropdown;

	@FindBy(xpath="//input[@id='iCategory']")
	public static WebElement  categoryTxt;

	@FindBy(xpath="//*[@id='iCategory_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement  categorySettingBtn;



	@FindBy(xpath="//span[text()='GroupMaster']")
	public static WebElement GroupMasterMenuBtn;

	@FindBy(xpath="(//span[text()='GroupMaster'])[2]")
	public static WebElement GroupMasterBtn;

	@FindBy(xpath="//span[text()='GroupMasterToDelete']")
	public static WebElement GroupMasterToDeleteMenuBtn;



	// Seller Price book Test



	@FindBy(xpath="//*[@id='76']/span")
	public static WebElement  homeMasterItem_sellerPriceBookMenu;



	//First Row

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[1]/td[2]")
	public static WebElement itemFirstCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[1]/td[4]")
	public static WebElement wareHouseFirstCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[1]/td[5]")
	public static WebElement startingDateFirstCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[1]/td[6]")
	public static WebElement endingDateFirstCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[1]/td[7]")
	public static WebElement vendorFirstCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[1]/td[8]")
	public static WebElement currencyFirstCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[1]/td[9]")
	public static WebElement minQtyFirstCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[1]/td[10]")
	public static WebElement maxQtyFirstCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[1]/td[11]")
	public static WebElement unitFirstCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[1]/td[12]")
	public static WebElement rateFirstCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[1]/td[13]")
	public static WebElement PoFirstCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[1]/td[14]")
	public static WebElement PtFirstCellSelect; 	


	//Second Row
	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[2]/td[2]")
	public static WebElement itemSecondCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[2]/td[4]")
	public static WebElement wareHouseSecondCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[2]/td[5]")
	public static WebElement satrtingDateSecondCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[2]/td[6]")
	public static WebElement endingDateSecondCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[2]/td[7]")
	public static WebElement vendorSecondCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[2]/td[8]")
	public static WebElement currencySecondCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[2]/td[9]")
	public static WebElement minQtySecondCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[2]/td[10]")
	public static WebElement maxQtySecondCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[2]/td[11]")
	public static WebElement unitSecondCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[2]/td[12]")
	public static WebElement rateSecondCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[2]/td[13]")
	public static WebElement PoSecondCellSelect; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_body']/tr[2]/td[14]")
	public static WebElement PtSecondCellSelect; 


	//Third Row
	@FindBy(xpath="//td[@id='PriceBookWebGrid_col_3-1']")
	public static WebElement itemThirdCellSelect; 	

	@FindBy(xpath="//td[@id='PriceBookWebGrid_col_3-3']")
	public static WebElement wareHouseThirdCellSelect; 	

	@FindBy(xpath="//td[@id='PriceBookWebGrid_col_3-4']")
	public static WebElement satrtingDateThirdCellSelect; 	

	@FindBy(xpath="//td[@id='PriceBookWebGrid_col_3-5']")
	public static WebElement endingDateThirdCellSelect; 	

	@FindBy(xpath="//td[@id='PriceBookWebGrid_col_3-6']")
	public static WebElement vendorThirdCellSelect; 	

	@FindBy(xpath="//td[@id='PriceBookWebGrid_col_3-7']")
	public static WebElement currencyThirdCellSelect; 	

	@FindBy(xpath="//td[@id='PriceBookWebGrid_col_3-8']")
	public static WebElement minQtyThirdCellSelect; 	

	@FindBy(xpath="//td[@id='PriceBookWebGrid_col_3-9']")
	public static WebElement maxQtyThirdCellSelect; 	

	@FindBy(xpath="//td[@id='PriceBookWebGrid_col_3-10']")
	public static WebElement unitThirdCellSelect; 	

	@FindBy(xpath="//td[@id='PriceBookWebGrid_col_3-11']")
	public static WebElement rateThirdCellSelect; 	

	@FindBy(xpath="//td[@id='PriceBookWebGrid_col_3-12']")
	public static WebElement PoThirdCellSelect; 	

	@FindBy(xpath="//td[@id='PriceBookWebGrid_col_3-13']")
	public static WebElement PtThirdCellSelect; 	


	//To get Value From Cell

	@FindBy(xpath="//input[@id='PriceBookWebGrid_option_2']")
	public static WebElement itemValue; 	

	@FindBy(xpath="//input[@id='PriceBookWebGrid_option_4']")
	public static WebElement wareHouseValue; 	

	@FindBy(xpath="//input[@id='PriceBookWebGrid_option_StartingDate']")
	public static WebElement startingDateValue; 	

	@FindBy(xpath="//input[@id='PriceBookWebGrid_option_EndingDate']")
	public static WebElement endingDateValue; 	

	@FindBy(xpath="//input[@id='PriceBookWebGrid_option_1']")
	public static WebElement vendorValue; 	

	@FindBy(xpath="//input[@id='Currency_option']")
	public static WebElement currencyOptionValue; 	

	@FindBy(xpath="//input[@id='PriceBookWebGrid_minqty']")
	public static WebElement minQtyValue; 	

	@FindBy(xpath="//input[@id='PriceBookWebGrid_maxqty']")
	public static WebElement maxQtyValue; 	

	@FindBy(xpath="//input[@id='PriceBookWebGrid_option_11']")
	public static WebElement unitValue; 	

	@FindBy(xpath="//input[@id='PriceBookWebGrid_val0']")
	public static WebElement rateValue; 	

	@FindBy(xpath="//input[@id='PriceBookWebGrid_val1']")
	public static WebElement PoValue; 	

	@FindBy(xpath="//input[@id='PriceBookWebGrid_val2']")
	public static WebElement PtValue; 	

	@FindBy(xpath="//*[@id='btnMasterPaste']/i")
	public static WebElement pasteBtn;



	@FindBy(xpath="//*[@id='ctrlOptionProPriceBookH_table_body']/tr/td[2]")
	public static List<WebElement> pricebookComboBoxList;

	@FindBy(xpath="//*[@id='PriceBookWebGrid_option_2_table_body']/tr/td[2]")
	public static List<WebElement> itemComboBoxList;

	@FindBy(xpath="//*[@id='PriceBookWebGrid_option_4_table_body']/tr/td[2]")
	public static List<WebElement> warehouseComboBoxList;

	@FindBy(xpath="//*[@id='PriceBookWebGrid_option_1_table_body']/tr/td[2]")
	public static List<WebElement> vendorComboBoxList;

	@FindBy(xpath="//*[@id='Currency_option_table_body']/tr/td[2]")
	public static List<WebElement> currencyComboBoxList;

	@FindBy(xpath="//*[@id='PriceBookWebGrid_option_11_table_body']/tr/td[2]")
	public static List<WebElement> unitComboBoxList;

	@FindBy(xpath="//input[@id='btnLoad']")
	public static WebElement priceBookFilterAndLoadBtn;



	@FindBy (xpath="//form[@id='formLoadDataXML']//button[@id='btnExporttoExcel']")
	public static WebElement priceBookExportToExcel;

	@FindBy(xpath="//button[@id='btnImportData']")
	public static WebElement importButton;

	@FindBy(xpath="//button[@id='btnCloseImport']")
	public static WebElement closeButtonInImport;

	@FindBy(xpath="//span[@class='btn btn-sm theme_background-color fileUpload theme_color']")
	public static WebElement browseButton;

	@FindBy(xpath="//input[@id='rdoFilterName']")
	public static WebElement nameRadioButton;

	@FindBy(xpath="//input[@id='rdoFilterCode']")
	public static WebElement codeRadioButton;

	@FindBy(xpath="//input[@id='rdoFilterBoth']")
	public static WebElement bothRadioButton;


	@FindBy(xpath="//input[@id='chkOverride']")
	public static WebElement overrideCheckbox;



	//Department

	@FindBy(xpath="//*[@id='iCurrencyId']")
	public static WebElement localCurrencyComboBox;

	@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[10]")
	public static List<WebElement> departmentNameList;

	@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[8]/div[1]")
	public static List<WebElement> departMentCheckboxList;

	@FindBy(xpath="//*[@id='innerDivDeleteMasterModal']/div[2]/div[1]/label")
	public static WebElement getMsgOnDelete;

	//derpartment


	//Warehouse

	@FindBy (xpath="//*[@id='1107']/span")
	public static WebElement warehouseMenu;



	@FindBy(xpath="//*[@id='iPhysInventoryCountingFrequency']")
	public static WebElement physicalInventoryCountingFrequency;

	@FindBy(xpath="//*[@id='iWarehouseType']")
	public static WebElement warehouseType;

	@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[10]")
	public static List<WebElement> warehouseNameList;
	
	@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[10]")
	public static List<WebElement> branchNameList;

	@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[8]/div[1]")
	public static List<WebElement> warehouseCheckboxList;

	@FindBy(xpath="//*[@id='divModal_properties']/div[1]/div[1]/h4")
	public static WebElement warehousePropertiesLabel;

	@FindBy(xpath="//*[@id='allMasterCustTabs']/li[1]/a/i")
	public static WebElement plusBtn;

	@FindBy(xpath="//*[@id='allMasterCustTabs']/li[1]/a/i")
	public static WebElement minusBtn;


	@FindBy(xpath="//a[text()='Tree Tab']")//*[@id="masterCustomizingTabList"]/div[2]/div/ul/li[1]/a
	public static WebElement createTabTreeTab; 

	@FindBy(xpath="//a[contains(text(),'Document Tab')]")
	public static WebElement createTab_DocumentTab;  

	@FindBy(xpath="//a[contains(text(),'Create Tab')]")
	public static WebElement createTab_CreateTab;  



	@FindBy(xpath="//span[contains(text(),'Master Fields')]")
	public static WebElement masterFieldsOption;

	@FindBy(xpath="//*[@id='allMasterCustTabs']/li[2]/a")
	public static WebElement accountMasterFieldsUniqueConstraintsOption; 

	@FindBy(xpath="//*[@id='allMasterCustTabs']/li[5]/a")
	public static WebElement accountReportsTab;

	@FindBy(xpath="//*[@id='allMasterCustTabs']/li[4]/a")
	public static WebElement rules_ExternalModules;

	@FindBy(xpath="//*[@id='allMasterCustTabs']/li[3]/a")
	public static WebElement RulesOption;

	@FindBy(xpath="//*[@id='masterFields_list']/li[2]/a")
	public static WebElement settingOption;

	@FindBy(xpath="//*[@id='masterFields_list']/li[3]/a")
	public static WebElement accountMasterFieldDetailsOption;

	@FindBy(xpath="//*[@id='masterFields_list']/li[4]/a")//*[@id="masterFields_list"]/li[4]/span
	public static WebElement accountMasterFieldPrintLayoutOption;


	@FindBy(xpath="//*[@id='masterFields_list']/li[1]/a")
	public static WebElement generalTab;

	@FindBy(xpath="//*[@id='tab_HeaderDetails_0']")
	public static WebElement generalHeaderDetailsTab;

	@FindBy(xpath="//*[@id='tab_mainTab_0']")
	public static WebElement generalMainTab;

	@FindBy(xpath="//*[@id='btnPreview']/a/i")
	public static WebElement accountHeaderPreview;

	@FindBy(xpath="//*[@id='all_TabsField']/div[5]/nav/div/div/ul/li[1]/a/i")
	public static WebElement accountSaveBtn;

	@FindBy(xpath="//*[@id='btnAdd_Field_MasterCust']/a/i")
	public static WebElement accountAddBtn;

	@FindBy(xpath="(//*[@id='btnCloseMasterCutomizationFromMasterScreen']/a/i)[1]")
	public static WebElement accountCloseBtn;


	@FindBy(xpath="//tbody[@class='ui-sortable']//tr[1]//td[4]")
	public static WebElement warehouseHeaderDetailsBins;



	@FindBy(xpath="//div[@id='mainTab_0']//tbody//tr[1]//td[4]")
	public static WebElement accountCustomizeName;

	@FindBy(xpath="//div[@id='mainTab_0']//tr[2]//td[4]")
	public static WebElement accountCustomizeCode;

	@FindBy(xpath="//div[@id='mainTab_0']//tr[3]//td[4]")
	public static WebElement accountCustomizeAccountType;

	@FindBy(xpath="//div[@id='mainTab_0']//tr[4]//td[4]")
	public static WebElement accountCustomizeCreditLimit;

	@FindBy(xpath="//div[@id='mainTab_0']//tr[5]//td[4]")
	public static WebElement accountCustomizeCreditDays;	


	@FindBy(xpath="//div[@id='tabId_1']//tbody[contains(@class,'ui-sortable')]//tr[1]//td[4]")
	public static WebElement accountCustomizeChequeDiscountLimit;

	@FindBy(xpath="//div[@id='HeaderDetails_0']//tr[2]//td[4]")
	public static WebElement accountCustomizeRateOfInterest;

	@FindBy(xpath="//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[3]/td[4]")
	public static WebElement accountCustomizePDCDiscountedAccount;

	@FindBy(xpath="//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[4]/td[4]")
	public static WebElement accountCustomizeBankAc;

	@FindBy(xpath="//*[@id='btnMove_Field_MasterCust']/a/i")
	public static WebElement accountHeaderMoveFiledBtn;

	@FindBy(xpath="//*[@id='tab_HeaderDetails_1']")
	public static WebElement settingsHeaderDetailsTab;

	@FindBy(xpath="//*[@id='tab_BodyDetails_1']")
	public static WebElement settingsBodyDetailsTab;


	@FindBy(xpath="(//*[@id='btnMove_Field_MasterCust']/a/i)[1]")
	public static WebElement accountSettingsHeaderMoveFiledBtn;

	@FindBy(xpath="(//*[@id='btnPreview']/a/i)[1]")
	public static WebElement accountSettingsHeaderPreview;

	@FindBy(xpath="//*[@id='all_TabsField']/div[5]/nav/div/div/ul/li[1]/a/i")
	public static WebElement accountSettingsSaveBtn;

	@FindBy(xpath="(//*[@id='btnAdd_Field_MasterCust']/a/i)[1]")
	public static WebElement accountSettingsAddBtn;						

	@FindBy(xpath="(//*[@id='btnCloseMasterCutomizationFromMasterScreen']/a/i)[1]")
	public static WebElement accountSettingsCloseBtn;


	@FindBy(xpath="//*[@id='BodyDetails_1']/div/div")
	public static WebElement settingsBodyDetailsEmptyTab;

	@FindBy(xpath="//*[@id='tab_HeaderDetails_2']")
	public static WebElement detailsHeaderDetailsTab;

	@FindBy(xpath="//*[@id='tab_BodyDetails_2']")
	public static WebElement detailsBodyDetailsTab;

	@FindBy(xpath="//*[@id='BodyDetails_2']/div/div")
	public static WebElement detailsBodyDetailsEmptyTab;



	@FindBy(xpath="//*[@id='all_TabsField']/div[5]/nav/div/div/ul/li[1]/a/i")
	public static WebElement detailsHeaderBankSaveBtn;

	@FindBy(xpath="(//*[@id='btnMove_Field_MasterCust'])[1]")
	public static WebElement detailsHeaderMoveFieldBtn;

	@FindBy(xpath="(//*[@id='btnAdd_Field_MasterCust']/a/i)[1]")
	public static WebElement detailsHeaderAddBtn;

	@FindBy(xpath="(//*[@id='btnPreview'])[1]")
	public static WebElement detailsHeaderPreviewBtn;

	@FindBy(xpath="(//*[@id='btnCloseMasterCutomizationFromMasterScreen']/a/i)[1]")
	public static WebElement detailsHeaderCloseBtn;




	@FindBy(xpath="//div[@id='tabId_72']//tr[2]//td[4]")
	public static WebElement detailsHeaderTelNo;

	@FindBy(xpath="//div[@id='tabId_72']//tr[3]//td[4]")
	public static WebElement detailsHeaderFaxNo;		

	@FindBy(xpath="//div[@id='tabId_72']//tr[4]//td[4]")
	public static WebElement detailsHeaderCity;

	@FindBy(xpath="//div[@id='tabId_72']//tr[5]//td[4]")
	public static WebElement detailsHeaderPin;

	@FindBy(xpath="//div[@id='tabId_72']//tr[6]//td[4]")
	public static WebElement detailsHeaderDeliveryAddress;

	@FindBy(xpath="//div[@id='tabId_72']//tr[7]//td[4]")
	public static WebElement detailsHeaderCityOne;

	@FindBy(xpath="//div[@id='tabId_72']//tr[8]//td[4]")
	public static WebElement detailsHeaderPinOne;

	@FindBy(xpath="//div[@id='tabId_72']//tr[9]//td[4]")//*[@id="HeaderDetails_2"]/div/div/table/tbody/tr[7]/td[4]
	public static WebElement detailsHeaderSendEmailToCustomer;

	@FindBy(xpath="//div[@id='tabId_72']//tr[10]//td[4]")
	public static WebElement detailsHeaderAllowCustomerPortal;

	@FindBy(xpath="//div[@id='tabId_72']//tr[11]//td[4]")
	public static WebElement detailsHeaderEmail;

	@FindBy(xpath="//div[@id='tabId_72']//tr[12]//td[4]")
	public static WebElement detailsHeaderPassword;

	@FindBy(xpath="//div[@id='tabId_72']//tr[13]//td[4]")
	public static WebElement detailsHeaderBankAccountName;

	@FindBy(xpath="//div[@id='tabId_72']//tr[14]//td[4]")
	public static WebElement detailsHeaderBankAccountNumber;

	@FindBy(xpath="//div[@id='tabId_72']//tr[15]//td[4]")
	public static WebElement detailsHeaderIFSCCode;

	@FindBy(xpath="//div[@id='tabId_72']//tr[16]//td[4]")
	public static WebElement detailsHeaderPaymentType;

	@FindBy(xpath="//div[@id='tabId_72']//tr[17]//td[4]")
	public static WebElement detailsHeaderFinanceEmail;							  

	@FindBy(xpath="//div[@id='tabId_72']//tr[18]//td[4]")
	public static WebElement detailsHeaderPortalEmail;

	@FindBy(xpath="//*[@id='tab_HeaderDetails_3']")
	public static WebElement printlayoutHeaderDetailsTab;

	@FindBy(xpath="//*[@id='HeaderDetails_3']/div/div")
	public static WebElement printLayoutHeaderDetailsEmpty;

	@FindBy(xpath="//*[@id='tab_BodyDetails_3']")
	public static WebElement printLayouBodyDetailsTab;

	@FindBy(xpath="//div[@id='BodyDetails_3']/div/div/table/tbody/tr[1]/td[4]")
	public static WebElement printlayoutBodyVoucherType;

	@FindBy(xpath="//div[@id='BodyDetails_3']/div/div/table/tbody/tr[2]/td[4]")
	public static WebElement printLayoutBodyPrintlayout;



	@FindBy(xpath="//*[@id='all_TabsField']/div[5]/nav/div/div/ul/li[1]/a/i")
	public static WebElement printLayoutSaveBtn;

	@FindBy(xpath="(//*[@id='btnAdd_Field_MasterCust']/a/i)[1]")
	public static WebElement printLayoutAddBtn;

	@FindBy(xpath="(//*[@id='btnPreview']/a/i)[1]")
	public static WebElement printLayoutPreviewBtn;

	@FindBy(xpath="(//*[@id='btnCloseMasterCutomizationFromMasterScreen']/a/i)[1]")
	public static WebElement printLayoutCloseBtn;

	@FindBy(xpath="//*[@id='tab_Main_UcFields']")
	public static WebElement UniqueConstraints_MainExpansionBtn;

	@FindBy(xpath="//*[@id='tabContent_UConstraints_MasterCust']/div[1]/div/div[2]/nav/ul/li[1]/a/i")
	public static WebElement UniqueConstraintsAddBtn;

	@FindBy(xpath="//*[@id='btnDelete_UniqueConstraints']/a/i")
	public static WebElement uniqueConstraintsDeleteBtn;

	@FindBy(xpath="(//*[@id='btnCloseMasterCutomizationFromMasterScreen']/a/i)[2]")
	public static WebElement uniqueConstraintsCloseBtn;

	@FindBy(xpath="//input[@id='txtConstraintName']")
	public static WebElement ConstraintNameTxt;

	@FindBy(xpath="//select[@id='ddlConstraintTabList']")
	public static WebElement UniqueConstraints_TabsDropdown;

	@FindBy(xpath="//*[@id='chkList_MainFields_1']/div[1]/div/div/label/span")
	public static WebElement accountUniqueConstraints_Main_NameChekbox;

	@FindBy(xpath="//*[@id='chkList_MainFields_1']/div[2]/div/div/label/span")
	public static WebElement accountUniqueConstraints_Main_CodeChekbox;

	@FindBy(xpath="//*[@id='chkList_MainFields_1']/div[3]/div/div/label/span")
	public static WebElement accountUniqueConstraints_Main_AccountTypeCheckbox;

	@FindBy(xpath="//*[@id='chkList_MainFields_1']/div[4]/div/div/label/span")
	public static WebElement accountUniqueConstraints_Main_CreditLimitCheckBox;

	@FindBy(xpath="//*[@id='chkList_MainFields_1']/div[5]/div/div/label/span")
	public static WebElement accountUniqueConstraints_Main_CreditDays;

	@FindBy(xpath="//*[@id='tab_Header_UcFields']")
	public static WebElement UniqueConstraints_HeaderExpansionBtn;

	@FindBy(xpath="//*[@id='chkList_HeaderFields_1']/div[1]/div/div/label/span")
	public static WebElement UniqueConstraints_Header_ChequeDiscountLimitChekbox;

	@FindBy(xpath="//*[@id='chkList_HeaderFields_1']/div[2]/div/div/label/span")
	public static WebElement UniqueConstraints_Header_RateOfInterestChekbox;

	@FindBy(xpath="//*[@id='chkList_HeaderFields_1']/div[4]/div/div/label/span")
	public static WebElement UniqueConstraints_Header_BankAcChekbox;

	@FindBy(xpath="//*[@id='chkList_HeaderFields_1']/div[3]/div/div/label/span")
	public static WebElement UniqueConstraints_Header_PDCDiscountedChekbox;

	@FindBy(xpath="//*[@id='tab_Body_UcFields']")
	public static WebElement UniqueConstraints_BodyExpansionBtn;






	@FindBy(xpath="//*[@id='newRuleTab_div_MasterRules']/div[1]/div/div[2]/nav/ul/li[1]/a/i")
	public static WebElement accountRules_SaveBtn;

	@FindBy(xpath="//*[@id='newRuleTab_div_MasterRules']/div[1]/div/div[2]/nav/ul/li[2]/a/i")
	public static WebElement accountRules_NewBtn;

	@FindBy(xpath="//*[@id='newRuleTab_div_MasterRules']/div[1]/div/div[2]/nav/ul/li[3]/a/i")
	public static WebElement accountRules_DeleteBtn;

	@FindBy(xpath="(//*[@id='btnCloseMasterCutomizationFromMasterScreen']/a/i)[3]")
	public static WebElement accountRules_CloseBtn;   

	@FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules']")
	public static WebElement Rules_RuleNameText ;


	@FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/nav/ul/li[1]/a/i")
	public static WebElement extraFields_RulesSaveBtn ;

	@FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/nav/ul/li[2]/a/i")
	public static WebElement extraFields_RulesNewBtn ;

	@FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/nav/ul/li[3]/a/i")
	public static WebElement extraFields_RulesDeleteBtn ;

	@FindBy(xpath="(//*[@id='btnCloseMasterCutomizationFromMasterScreen']/a/i)[2]")
	public static WebElement extraFields_RulesCloseBtn ;
	/*    
    @FindBy(xpath="//input[@class='btn btn-link']")
    public static WebElement extraFields_RulesClickHereAddRuleButtonBtn ;*/

	@FindBy(xpath="//input[@id='txtMasterRuleName_MasterRules']")
	public static WebElement extraFields_RuleNameDropdown ;

	@FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement extraFields_RuleNameSetingBtn ;      





	@FindBy(xpath="//*[@id='chkListApplyOn_MasterRules']/div/div[1]/div/div/label/span")
	public static WebElement Rules_CreatingGroupChekbox ;

	@FindBy(xpath="//*[@id='chkListApplyOn_MasterRules']/div/div[2]/div/div/label/span")
	public static WebElement Rules_NewRecordChekbox ;

	@FindBy(xpath="//*[@id='chkListApplyOn_MasterRules']/div/div[3]/div/div/label/span")
	public static WebElement Rules_EditChekbox ;

	@FindBy(xpath="//*[@id='chkListEvaluateOn_MasterRules']/div/div[1]/div/div/label/span")
	public static WebElement Rules_LoadChekbox ;

	@FindBy(xpath="//*[@id='chkListEvaluateOn_MasterRules']/div/div[4]/div/div/label/span")
	public static WebElement Rules_BeforeSaveChekbox ;

	@FindBy(xpath="//*[@id='chkListEvaluateOn_MasterRules']/div/div[2]/div/div/label/span")
	public static WebElement Rules_OnLeaveChekbox ;

	@FindBy(xpath="//*[@id='chkListEvaluateOn_MasterRules']/div/div[5]/div/div/label/span")
	public static WebElement Rules_BeforeDeleteChekbox ;

	@FindBy(xpath="//*[@id='chkListEvaluateOn_MasterRules']/div/div[3]/div/div/label/span")
	public static WebElement Rules_OnEnterChekbox ;

	@FindBy(xpath="//*[@id='chkListStatus_MasterRules']/div/div[1]/div/div/label/span")
	public static WebElement Rules_ActiveChekbox ;

	@FindBy(xpath="//*[@id='Conditions-Context_Menu_MasterRules']/li[3]/div/label/span")
	public static WebElement Rules_NoConditionChekbox;	





	@FindBy(xpath="//select[@id='ddlOnEvent_MasterExternalModule']")
	public static WebElement rules_ExternalModulesOnEventDropdown;	

	@FindBy(xpath="//input[@id='txtbuttonCaption_MasterExternalModule']")
	public static WebElement rules_ExternalModulesButtonCaption;

	@FindBy(xpath="//select[@id='ddlModuleType_MasterExternalModule']")
	public static WebElement rules_ExternalModules_ModuleTypeBtn;

	@FindBy(xpath="//select[@id='ddlAllDllFiles_MasterExternalModule']")
	public static WebElement rules_ExternalModules_ModuleNameDropdown;

	@FindBy(xpath="//select[@id='ddlClassNames_MasterExternalModule']")
	public static WebElement rules_ExternalModulesClassNameDropdown;

	@FindBy(xpath="//select[@id='ddlClassMethods_MasterExternalModule']")
	public static WebElement rules_ExternalModulesFuctionalNameDropdown;

	@FindBy(xpath="//*[@id='ExternalModulesDiv_MasterExternalModule']/div[1]/div/div[2]/nav/ul/li[1]/a")
	public static WebElement rules_ExternalModulesUpdateBtn;

	@FindBy(xpath="//*[@id='ExternalModulesDiv_MasterExternalModule']/div[1]/div/div[2]/nav/ul/li[2]/a")
	public static WebElement rules_ExternalModulesSaveBtn;

	@FindBy(xpath="//*[@id='ExternalModulesDiv_MasterExternalModule']/div[1]/div/div[2]/nav/ul/li[3]/a")
	public static WebElement rules_ExternalModulesEditBtn;

	@FindBy(xpath="//*[@id='btnDeleteExternalModule']/a")
	public static WebElement rules_ExternalModulesDeleteBtn;

	@FindBy(xpath="(//*[@id='btnCloseMasterCutomizationFromMasterScreen']/a)[4]")
	public static WebElement rules_ExternalModulesCloseBtn;





	@FindBy(xpath="//*[@id='allMasterCustTabs']/li[5]/a")
	public static WebElement itemInfoPanelCustomizationTab;

	@FindBy(xpath="//*[@id='tabContent_IPCust_MasterCust']/div[1]/div/div[2]/nav/ul/li[1]/a")
	public static WebElement iteminfoPanelCust_AddBtn;

	@FindBy(xpath="//*[@id='tabContent_IPCust_MasterCust']/div[1]/div/div[2]/nav/ul/li[2]/a")
	public static WebElement infoPanelCust_DeleteBtn;

	@FindBy(xpath="(//*[@id='btnCloseMasterCutomizationFromMasterScreen']/a)[5]")
	public static WebElement infoPanelCust_CloseBtn;

	@FindBy(xpath="//strong[contains(text(),'Credit History')]")
	public static WebElement infoPanelCustCreditHistory;

	@FindBy(xpath="//div[@id='divPanel_2']//strong[contains(text(),'Ageing Analysis')]")
	public static WebElement infoPanelCustAgeingAnalysis;

	@FindBy(xpath="//strong[contains(text(),'Ageing Analysis Base')]")
	public static WebElement infoPanelCustAgeingAnalysisBase;

	@FindBy(xpath="//strong[contains(text(),'Ageing Analysis Local')]")
	public static WebElement infoPanelCustAgeingAnalysisLocal;

	@FindBy(xpath="//strong[contains(text(),'Authorization')]")
	public static WebElement infoPanelAuthorization;













	@FindBy(xpath="//tbody[@class='ui-sortable']//tr[2]//td[4]")
	public static WebElement warehouseHeaderDetailsPhysInventory;

	@FindBy(xpath="//tbody[@class='ui-sortable']//tr[3]//td[4]")
	public static WebElement warehouseHeaderDetailsWarehouse;

	@FindBy(xpath="//tbody[@class='ui-sortable']//tr[4]//td[4]")
	public static WebElement warehouseHeaderDetailsDonotMaintainStocks;

	@FindBy(xpath="//tbody[@class='ui-sortable']//tr[1]//td[1]//i[1]")
	public static WebElement warehouseHeaderDetailsBinsEdit;

	@FindBy(xpath="//*[@id='ExtraField_FieldCaption']")
	public static WebElement extraFields_FieldDetailsCaption;   

	@FindBy(xpath="//div[@id='tab_FieldDetails_ExtraField']//div[1]//div[2]//div[1]//input[1]")
	public static WebElement extraFields_FieldDetailsName;  

	@FindBy(xpath="//*[@id='ddlDatatype_ExtraField']")
	public static WebElement extraFields_FieldDetailsDatTypeDropdown;  

	@FindBy(xpath="//*[@id='ExtraField_DefaultValue']")
	public static WebElement extraFields_FieldDetailsDefaultValue;  

	@FindBy(xpath="//*[@id='ExtraField_BannerText']")
	public static WebElement extraFields_FieldDetailsBannerText;  

	@FindBy(xpath="//*[@id='ExtraField_MaxSize']")
	public static WebElement extraFields_FieldDetails_MaxSize;  

	@FindBy(xpath="//*[@id='ExtraField_ControlType']")
	public static WebElement extraFields_FieldDetailsControlTypeDropdown;  

	@FindBy(xpath="//*[@id='ExtraField_ToolTipText']")
	public static WebElement extraFields_FieldDetailsToolTipText;  

	@FindBy(xpath="//*[@id='ExtraField_IncludeGroups']")
	public static WebElement extraFields_FieldDetailsInCludeGroups;

	@FindBy(xpath="//input[@id='FieldsDetails_IsHidden']")
	public static WebElement extraFields_PropertiesHiddenChekboxSelected;

	@FindBy(xpath="//input[@id='FieldsDetails_HiddenInGroup']")
	public static WebElement extraFields_PropertiesHiddenInGroupChekboxSelected;

	@FindBy(xpath="//*[@id='btnSaveRule']/a/i")
	public static WebElement extraFields_OkBtn;


	@FindBy(xpath="(//*[@id='btnCloseMasterCutomizationFromMasterScreen'])[1]")
	public static WebElement closeBtnInCreateTabCustomizeMasetrWarehouse;



	@FindBy(xpath="//*[@id='btnCloseRule']/a/i")
	public static WebElement extraFields_CloseBtn;




	//Warehouse

	//Item
	@FindBy(xpath="//*[@id='1105']/span")
	public static WebElement  homeMasterItem_ItemMenu;

	@FindBy(xpath="//*[@id='masterFirstDiv']/nav/div/nav/ol/li[3]/a")
	public static WebElement item_ItemLabel;


	@FindBy(xpath="//*[@id='divBtnGroup8']")
	public static WebElement itemNewCreateTab;




	@FindBy(xpath="//input[@id='extraFiledOne']")
	public static WebElement itemExtraFieldOne;

	@FindBy(xpath="//input[@id='ExraFieldTwo']")
	public static WebElement itemExtraFieldTwo;


	@FindBy(xpath="//*[@id='MCustomize_CreateTab_ModalLabel']")
	public static WebElement createTab_TabDetailsLabel;  




	@FindBy(xpath="//*[@id='MCustomize_CreateTab_Modal']/div[2]/div/div[1]/span/i")
	public static WebElement createTab_PopCancelBtn; 



	@FindBy(xpath="//*[@id='btnNew']")
	public static WebElement itemNewBtn;

	@FindBy(xpath="//*[@id='divBtnGroup0']")
	public static WebElement ItemNewnewGeneralBtn;

	@FindBy(xpath="//a[@id='divBtnGroup1']")
	public static WebElement ItemNewUnitsBtn;

	@FindBy(xpath="//a[@id='divBtnGroup2']")
	public static WebElement ItemNewSettingsBtn;

	@FindBy(xpath="//a[@id='divBtnGroup3']")
	public static WebElement ItemNewClassificationBtn;

	@FindBy(xpath="//a[@id='divBtnGroup4']")
	public static WebElement ItemNewOtherDetailsBtn;

	@FindBy(xpath="//a[@id='divBtnGroup5']")
	public static WebElement ItemNewReplenishmentBtn;

	@FindBy(xpath="//a[@id='divBtnGroup7']")
	public static WebElement ItemNewOutletBtn;

	@FindBy(xpath="//input[@id='sName']")
	public static WebElement newGeneralName;

	@FindBy(xpath="//input[@id='sCode']")
	public static WebElement newGeneralCode;

	@FindBy(xpath="//select[@id='iProductType']")
	public static WebElement newGeneralItemTypeDropDown;

	@FindBy(xpath="//input[@id='fReorderLevel']")
	public static WebElement newGeneralReorderLevel;

	@FindBy(xpath="//input[@id='iBinCapacity']")
	public static WebElement newGeneralBinCapacity;

	@FindBy(xpath="//select[@id='iValuationMethod']")
	public static WebElement newGeneralValuationMethodDropDown;

	@FindBy(xpath="//input[@id='iCategory']")
	public static WebElement newGeneralCategoryDropDown;

	@FindBy(xpath="//*[@id='iCategory_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement newGeneralCategorySettingBtn;

	@FindBy(xpath="//select[@id='iProductMake']")
	public static WebElement newGeneralItemMakeDropDown;

	@FindBy(xpath="//input[@id='Printer']")
	public static WebElement newGeneralPrint;

	@FindBy(xpath="//input[@id='iAlternateCategory']")
	public static WebElement newGeneralAlternativeCategoryDropdown;

	@FindBy(xpath="//*[@id='iCategory_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement newGeneralAlternativeCategoryDropdownSettingBtn;

	@FindBy(xpath="//textarea[@id='sDescription']")
	public static WebElement newGeneralDescription;

	@FindBy(xpath="//input[@id='bPerishableItem']")
	public static WebElement newGeneralPerishableItemCheckBox;

	@FindBy(xpath="//input[@id='iBin']")
	public static WebElement newGeneralBinDropdown;

	@FindBy(xpath="//*[@id='iBin_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement newGeneralBinDropdownSettingBtn;

	@FindBy(xpath="//input[@id='pImage']")
	public static WebElement newGeneralUploadImageOrFileBtn;

	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-left ulNewMaster']//li[2]//button[1]")
	public static WebElement newGeneralSaveBtn;

	@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	public static WebElement newGeneralCLoseBtn;





	//AddGroup Elements

	@FindBy(xpath="//*[@id='btnAddGroup']")
	public static WebElement itemAddGroupBtn;

	@FindBy(xpath="//a[@id='divBtnGroup0']")
	public static WebElement ItemAddGroupGeneralBtn;

	@FindBy(xpath="//*[@id='sName']")
	public static WebElement AddGroupGeneralName;

	@FindBy(xpath="//*[@id='sCode']")
	public static WebElement AddGroupGeneralCode;

	@FindBy(xpath="//*[@id='iProductType']")
	public static WebElement AddGroupGeneralItemTypeDropDown;

	@FindBy(xpath="//*[@id='fReorderLevel']")
	public static WebElement AddGroupGeneralReorderLevel;

	@FindBy(xpath="//*[@id='iBinCapacity']")
	public static WebElement AddGroupGeneralBinCapacity;

	@FindBy(xpath="//*[@id='iValuationMethod']")
	public static WebElement AddGroupGeneralValuationMethodDropDown;

	@FindBy(xpath="//*[@id='iCategory']")
	public static WebElement AddGroupGeneralCategoryDropDown;

	@FindBy(xpath="//*[@id='iCategory_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement AddGroupGeneralCategorySettingBtn;
	/*  
								     @FindBy(xpath="//*[@id='iProductMake']")
								     public static WebElement AddGroupGeneralItemMakeDropDown;*/

	@FindBy(xpath="//*[@id='Printer']")
	public static WebElement AddGroupGeneralPrint;

	@FindBy(xpath="//*[@id='iAlternateCategory']")
	public static WebElement AddGroupGeneralAlternativeCategoryDropdown;

	@FindBy(xpath="//*[@id='iAlternateCategory_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement AddGroupGeneralAlternativeCategoryDropdownSettingBtn;

	@FindBy(xpath="//*[@id='sDescription']")
	public static WebElement AddGroupGeneralDescription;

	@FindBy(xpath="//*[@id='bPerishableItem']")
	public static WebElement AddGroupGeneralPerishableItemCheckBox;

	@FindBy(xpath="//*[@id='iBin']")
	public static WebElement AddGroupGeneralBinDropdown;

	@FindBy(xpath="//*[@id='iBin_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement AddGroupGeneralBinDropdownSettingBtn;


	@FindBy(xpath="//*[@id='BrowsepImage']")
	public static WebElement AddGroupGeneralUploadImageOrFileBtn;

	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-left ulNewMaster']//li[2]//button[1]")
	public static WebElement AddGroupGeneralSaveBtn;

	@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	public static WebElement AddGroupGeneralCLoseBtn;


	@FindBy(xpath="//*[@id='btnMasterEdit']")
	public static WebElement itemEditBtn;


	@FindBy(xpath="//*[@id='btnClone']")
	public static WebElement ItemCloneBtn;

	@FindBy(xpath="//*[@id='btnProperties']")
	public static WebElement itemPropertiesBtn;


	@FindBy(xpath="//*[@id='btnDelete']")
	public static WebElement itemDeleteBtn;

	@FindBy(xpath="//*[@id='btnClose']")
	public static WebElement itemCloseBtn;

	@FindBy(xpath="//*[@id='drpdownSlider']/a/i")
	public static WebElement itemToggleRibbonBtn;

	@FindBy(xpath="//a[@id='btnCustomizeTree']")
	public static WebElement itemCustomizeTreeBtn;

	@FindBy(xpath="//a[@id='btnAlternateProduct']")
	public static WebElement itemAlternateProductBtn;

	@FindBy(xpath="//a[@id='btnRelatedProduct']")
	public static WebElement itembtnRelatedProductBtn;

	@FindBy(xpath="//a[@id='btnLedger']")
	public static WebElement itemLedgerBtn;

	@FindBy(xpath="//span[@id='btnBudget']")
	public static WebElement itemBudgetBtn;

	@FindBy(xpath="//a[@id='btnBackTrack']")
	public static WebElement itemBackTrackBtn;

	@FindBy(xpath="//a[@id='btnTransfer']")
	public static WebElement itemTransferBtn;

	@FindBy(xpath="//div[@id='divTreeMenu']")
	public static WebElement masterTreeDisplayMenuItemGroups; 


	@FindBy(xpath="//input[@id='liSelectAllMasters']")
	public static WebElement itemDisplayGridArea;





	@FindBy(xpath="//input[@id='iDefaultBaseUnit']")
	public static WebElement itemUnitsDefaultBaseUnitDropdown;

	@FindBy(xpath="//*[@id='iDefaultBaseUnit_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement itemUnitsDefaultBaseUnitSetting;

	@FindBy(xpath="//input[@id='iDefaultSalesUnit']")
	public static WebElement itemUnitsDefaultSalesUnitDropdown;

	@FindBy(xpath="//*[@id='iDefaultSalesUnit_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement itemUnitsDefaultSalesUnitSettingsBtn;

	@FindBy(xpath="//input[@id='iDefaultPurchaseUnit']")
	public static WebElement itemUnitsDefaultPurchaseUnitDropDown;

	@FindBy(xpath="//*[@id='iDefaultPurchaseUnit_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement itemUnitsDefaultPurchaseUnitSettingsBtn;

	@FindBy(xpath="//input[@id='fLength']")
	public static WebElement itemUnitsLength;

	@FindBy(xpath="//input[@id='fWidth']")
	public static WebElement itemUnitswidth;

	@FindBy(xpath="//input[@id='fHeight']")
	public static WebElement itemUnitsHeight;

	@FindBy(xpath="//input[@id='fWeight']")
	public static WebElement itemUnitsWeight;

	@FindBy(xpath="//*[@id='fStandardCost']")
	public static WebElement NewSettingsStandardCost;

	@FindBy(xpath="//*[@id='fOverheadCost']")
	public static WebElement NewSettingsOverheadCost;

	@FindBy(xpath="//*[@id='fIndirectCost']")
	public static WebElement NewSettingsIndirectCost;

	@FindBy(xpath="//*[@id='fProfit']")
	public static WebElement NewSettingsProfit;		     

	@FindBy(xpath="//*[@id='iDontshowproductexpireddays']")
	public static WebElement NewSettingsDontshowproductexpireddays;

	@FindBy(xpath="//*[@id='iTaxCode']")
	public static WebElement NewSettingsTaxCode;

	@FindBy(xpath="//*[@id='iTaxCode_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement NewSettingsTaxCodeSttingsBtn;

	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-left ulNewMaster']//li[2]//button[1]")
	public static WebElement NewSettingsSaveBtn; 

	@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	public static WebElement NewSettingsCloseBtn;




	@FindBy(xpath="//*[@id='iABCCodeValue']")
	public static WebElement newItemClassificationABC_CodeValueDropdown;

	@FindBy(xpath="//*[@id='iABCCodeMargin']")
	public static WebElement newItemClassificationABC_CodeMarginDropdOwn;

	@FindBy(xpath="//*[@id='iABCCodeRevenue']")
	public static WebElement newItemClassificationABCCodeRevenueDropdown;

	@FindBy(xpath="//*[@id='iABCCodeCarryingCost']")
	public static WebElement newItemClassificationABCCodeCarryingCostDropdown;

	@FindBy(xpath="//*[@id='sBarcode1']")
	public static WebElement newItemClassificationBarcode1;

	@FindBy(xpath="//*[@id='sBarcode2']")
	public static WebElement newItemClassificationBarcode2;

	@FindBy(xpath="//*[@id='sBarcode3']")
	public static WebElement newItemClassificationBarcode3;

	@FindBy(xpath="//*[@id='iUnit1']")
	public static WebElement newItemgridFirstrowUnit;

	@FindBy(xpath="//*[@id='sBarcode1']")
	public static WebElement newItemgridFirstrowBarcode;



	@FindBy(xpath="//input[@id='iCostOfIssueAccount']")
	public static WebElement newOtherDetailsCostOfIssueitem;

	@FindBy(xpath="//*[@id='iCostOfIssueAccount_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement newOtherDetailsCostOfIssueitemsettingsBtn;

	@FindBy(xpath="//input[@id='iStocksAccount']")
	public static WebElement newOtherDetailsStocksitem;

	@FindBy(xpath="//*[@id='iStocksAccount_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement newOtherDetailsiStocksitemsettingsBtn;

	@FindBy(xpath="//input[@id='iSalesAccount']")
	public static WebElement newOtherDetailsSalesAccount;

	@FindBy(xpath="//*[@id='iSalesAccount_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement newOtherDetailsSalesitemsettingsBtn;

	@FindBy(xpath="//input[@id='iWIPAccount']")
	public static WebElement newOtherDetailsWIPitem;

	@FindBy(xpath="//*[@id='iWIPAccount_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement newOtherDetailsWIPitemsettingsBtn;

	@FindBy(xpath="//input[@id='iCostofShortageStockAC']")
	public static WebElement newOtherDetailsCostofShortageStockAC;

	@FindBy(xpath="//*[@id='iCostofShortageStockAC_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement newOtherDetailsCostofShortageStockACsettingsBtn;

	@FindBy(xpath="//input[@id='iCostofExcessStockAC']")
	public static WebElement newOtherDetailsCostofExcessStockAC;

	@FindBy(xpath="//*[@id='iCostofExcessStockAC_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement OtherDetailsCostofExcessStockACsettingsBtn;

	@FindBy(xpath="//input[@id='iCostofSaleReturnAC']")
	public static WebElement OtherDetailsCostofSaleReturnAC;

	@FindBy(xpath="//*[@id='iCostofSaleReturnAC_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement OtherDetailsCostofSaleReturnACsettingsBtn;

	@FindBy(xpath="//input[@id='iPurchaseVarianceAC']")
	public static WebElement OtherDetailsPurchaseVarianceAC;

	@FindBy(xpath="//*[@id='iPurchaseVarianceAC_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement OtherDetailsPurchaseVarianceACsettingsBtn;

	@FindBy(xpath="//*[@id='btnMasterSaveClick']")
	public static WebElement newOtherDetailsSaveBtn;

	@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	public static WebElement newOtherDetailsCloseBtn;

	//Grid Elements

	@FindBy(xpath="//*[@id='ioWarehouse1']")
	public static WebElement newOtherDetailsgridFirstrowWareHouse;




	@FindBy(xpath="//*[@id='irWarehouse1']")
	public static WebElement newreplenishmentGridFirstRowWarehouse;

	@FindBy(xpath="//*[@id='irStartdate1']")
	public static WebElement newreplenishmentGridFirstRowStartDate;

	@FindBy(xpath="//*[@id='irEnddate1']")
	public static WebElement newreplenishmentGridFirstRowEndDate;

	@FindBy(xpath="//*[@id='iReplenishqty1']")
	public static WebElement newreplenishmentGridFirstRowReplenishqty;

	@FindBy(xpath="//*[@id='iReorderPolicy1']")
	public static WebElement newreplenishmentGridFirstRowReorderPolicy;

	@FindBy(xpath="//*[@id='fSafetyStock1']")
	public static WebElement newreplenishmentGridFirstRowSafetyStock;

	@FindBy(xpath="//*[@id='iSafetyLeadTime1']")
	public static WebElement newreplenishmentFirstRowSafetyLeadTime;

	@FindBy(xpath="//*[@id='fReordercycle1']")
	public static WebElement newreplenishmentFirstRowReordercycle;

	@FindBy(xpath="//*[@id='fReorderPoint1']")
	public static WebElement newreplenishmentFirstRowReorderPoint;

	@FindBy(xpath="//*[@id='fReorderQuantity1']")
	public static WebElement newreplenishmentFirstRowReorderQuantity;

	@FindBy(xpath="//*[@id='fMaxInventoryLevel1']")
	public static WebElement newreplenishmentFirstRowMaxInventoryLevel;

	@FindBy(xpath="//*[@id='iDefaultVendor1']")
	public static WebElement newreplenishmentFirstRowDefaultVendor;


	@FindBy(xpath="//*[@id='fMinOrderQuantity1']")
	public static WebElement newreplenishmentFirstRowMinOrderQuantity;


	@FindBy(xpath="//*[@id='fMaxOrderQuantity1']")
	public static WebElement newreplenishmentFirstRowMaxOrderQuantity1;


	@FindBy(xpath="//*[@id='fOrderMultiple1']")
	public static WebElement newreplenishmentFirstRowOrderMultiple;




	@FindBy(xpath="//*[@id='iDefaultReplenishment']")
	public static WebElement newreplenishmentDefaultReplenishment;

	@FindBy(xpath="//*[@id='iManufacturePolicy']")
	public static WebElement newreplenishmentManufacturePolicy;

	@FindBy(xpath="//*[@id='iPackingBOM']")
	public static WebElement newreplenishmentPackingBOM;

	@FindBy(xpath="//*[@id='iPackingBOM_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement newreplenishmentPackingBOMsettingsBtn;

	@FindBy(xpath="//*[@id='iBOM']")
	public static WebElement newreplenishmentBOM;

	@FindBy(xpath="//*[@id='iFlushing']")
	public static WebElement newreplenishmentFlushing;



	@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[12]")
	public static List<WebElement> itemNameList;

	@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[8]/div[1]")
	public static List<WebElement> itemCheckBoxList;




	@FindBy(xpath="//select[@id='iValuationMethod']")
	public static WebElement validationMethodDropdown;







	@FindBy(xpath="//*[@id='divModal_properties']/div[1]/div[1]/h4")
	public static WebElement itemPropertiesLabel;




	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/table/tbody/tr[1]/td/label/span")
	public static WebElement dontMaintainStockbyBatchCheckbox ;

	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/table/tbody/tr[2]/td/label/span")
	public static WebElement  dontinputBinCheckbox;

	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/table/tbody/tr[3]/td/label/span")
	public static WebElement dontMaintainStocksByRMACheckbox ;

	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/table/tbody/tr[4]/td/label/span")
	public static WebElement  inputBreakupofQuantitiesForEachCategoriesCheckbox;

	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/table/tbody/tr[5]/td/label/span")
	public static WebElement   doNotPrintInBillIfRateIszeroCheckbox;

	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/table/tbody/tr[6]/td/label/span")
	public static WebElement notAllowedforHomeDeliveryCheckbox ;

	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/table/tbody/tr[7]/td/label/span")
	public static WebElement starProductCheckbox ;

	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/table/tbody/tr[8]/td/label/span")
	public static WebElement  donotUpdateStockCheckbox;

	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/table/tbody/tr[9]/td/label/span")
	public static WebElement  ignoreExpiryforthisItemCheckBox;

	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/table/tbody/tr[11]/td/label/span")
	public static WebElement  ignoreFractionInQtyCheckbox;

	@FindBy(xpath="//input[@id='rbnDefault']")
	public static WebElement  defaultRadioBtn;

	@FindBy(xpath="//label[@id='lblNone']")
	public static WebElement reservationNone;

	@FindBy(xpath="//input[@id='rbnQualities']")
	public static WebElement  qualitiesRadioBtn;

	@FindBy(xpath="//input[@id='rbnReserveBy']")
	public static WebElement  reserveByRadioBtn;

	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/div[1]/table/tbody/tr[5]/td/label[1]/span")
	public static WebElement batchCheckbox ;

	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/div[1]/table/tbody/tr[5]/td/label[2]/span")
	public static WebElement binCheckbox ;

	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/div[1]/table/tbody/tr[5]/td/label[3]/span")
	public static WebElement  RMACheckbox;



	@FindBy(xpath="//select[@id='ddlInventoryAllocation']")
	public static WebElement inventoryAllocationDropdown ;

	@FindBy(xpath="//select[@id='ddlStatus']")
	public static WebElement miscelliniousDropdown;   ///Active or Inactive

	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/div[3]/table/tbody/tr[2]/td/label/span")
	public static WebElement  DonotrestricttheselectionevenifrightsarenotallottedChkbox;

	@FindBy(xpath="//*[@id='divModal_properties']/div[2]/div[3]/table/tbody/tr[3]/td/label/span")
	public static WebElement  AllowOtherCompaniesToViewRecordChkbox;



	@FindBy(xpath="//*[@id='masterFields_list']/li[9]")
	public static WebElement customizeMasterCreateCreateTabNewlyCreateTabCaption; 	

	@FindBy(xpath="//*[@id='tab_HeaderDetails_8']")
	public static WebElement customizeMasterCreateCreateTabHeaderDetails; 	

	@FindBy(xpath="//*[@id='HeaderDetails_8']/div/div")
	public static WebElement customizeMasterCreateCreateTabBlankHeaderDetails; 	

	@FindBy(xpath="//*[@id='tab_BodyDetails_8']")
	public static WebElement customizeMasterCreateCreateTabBodyDetails; 	

	@FindBy(xpath="//*[@id='BodyDetails_8']/div/div")
	public static WebElement customizeMasterCreateCreateTabBlankBodyDetails; 

	@FindBy(xpath="//*[@id='all_TabsField']/div[18]/nav/div/div/ul/li[1]/a/i")
	public static WebElement customizeMasterCreateCreateTabNewlyCreateTabSaveButton; 	

	@FindBy(xpath="//*[@id='btnAdd_Field_MasterCust']/a/i")
	public static WebElement customizeMasterCreateCreateTabAddButton; 	

	@FindBy(xpath="//*[@id='btnPreview']/a/i")
	public static WebElement customizeMasterCreateCreateTabPreviewButton; 	

	@FindBy(xpath="(//*[@id='btnCloseMasterCutomizationFromMasterScreen']/a/i)[1]")
	public static WebElement customizeMasterCreateCreateTabCloseButton;



	@FindBy(xpath="//*[@id='ExtraField_Tabs']/li[1]")
	public static WebElement extraFields_FieldDetailsTab;   

	@FindBy(xpath="//*[@id='ExtraField_Tabs']/li[2]")
	public static WebElement extraFields_PropertiesTab;	

	@FindBy(xpath="//*[@id='ExtraField_Tabs']/li[3]")
	public static WebElement  extraFields_FormattingTab;

	@FindBy(xpath="//*[@id='ExtraField_Tabs']/li[4]")
	public static WebElement extraFields_RulesTab ;


	@FindBy(xpath="//*[@id='ExtraField_Tabs']/li[5]")
	public static WebElement extraFields_ExternalModulesTab;	




	@FindBy(xpath="//*[@id='ExtraField_Tabs']/li[1]/a")
	public static WebElement extraFields_ClickOnFieldDetailsTab; 


	@FindBy(xpath="//*[@id='ExtraField_RegularExpression']")
	public static WebElement extraFields_FieldDetailsRegularExpressionText;  

	@FindBy(xpath="//*[@id='btnLoad_RExp']")
	public static WebElement extraFields_RegularExperssionLoadExpansionBtn;





	@FindBy(xpath="//*[@id='FieldsDetails_ColumnSpan']")
	public static WebElement extraFields_FormattingColumnSpan ;

	@FindBy(xpath="//*[@id='FieldsDetails_RowSpan']")
	public static WebElement extraFields_FormattingRowSpan ;

	@FindBy(xpath="//*[@id='CharacterCasing']")
	public static WebElement extraFields_FormattingCharacterCasingDropdown ;

	@FindBy(xpath="//*[@id='TextAlign']")
	public static WebElement extraFields_FormattingTextAlignDropdown ;

	@FindBy(xpath="//*[@id='FieldsDetails_Font']")
	public static WebElement extraFields_FormattingFieldsDetailsFont ;

	@FindBy(xpath="//*[@id='FieldsDetails_BackColor']")
	public static WebElement extraFields_FormattingBackColor ;

	@FindBy(xpath="//*[@id='FieldsDetails_Font_Button']")
	public static WebElement extraFields_FormattingFieldsDetailsFont_Btn ;


	@FindBy(xpath="//*[@id='lnkRule_div_FieldRules']/input")
	public static WebElement extraFields_RulesClickHereAddRuleButtonBtn ;


	@FindBy(xpath="//*[@id='ddlOnEvent_mExtraFieldExternalModule']")
	public static WebElement extraFields_ExternalModulesOnEventDropdown;	

	@FindBy(xpath="//*[@id='txtbuttonCaption_mExtraFieldExternalModule']")
	public static WebElement extraFields_ExternalModulesButtonCaption;

	@FindBy(xpath="//*[@id='ddlModuleType_mExtraFieldExternalModule']")
	public static WebElement extraFields_ExternalModules_ModuleTypeBtn;

	@FindBy(xpath="//*[@id='ddlAllDllFiles_mExtraFieldExternalModule']")
	public static WebElement extraFields_ExternalModules_ModuleNameDropdown;

	@FindBy(xpath="//*[@id='ddlClassNames_mExtraFieldExternalModule']")
	public static WebElement extraFields_ExternalModulesClassNameDropdown;

	@FindBy(xpath="//*[@id='ddlClassMethods_mExtraFieldExternalModule']")
	public static WebElement extraFields_ExternalModulesFuctionalNameDropdown;

	@FindBy(xpath="//*[@id='ddlAvailability_mExtraFieldExternalModule']")
	public static WebElement extraFields_ExternalModulesAvabileInDropdown; 




	//Elements are used for font edit option pop in field details and rules 

	@FindBy(xpath="//*[@id='fontFamily_ExtraField_FontCtrl']")
	public static WebElement FontAreialDropdown ;

	@FindBy(xpath="//*[@id='fontStyle_ExtraField_FontCtrl']")
	public static WebElement fontStyleDropdown ;

	@FindBy(xpath="//*[@id='fontWeight_ExtraField_FontCtrl']")
	public static WebElement fontWeightDropdown ;

	@FindBy(xpath="//*[@id='fontSizes_ExtraField_FontCtrl']")
	public static WebElement fontSizeDropdown ;

	@FindBy(xpath="//*[@id='fontForeColor_ExtraField_FontCtrl']")
	public static WebElement foreColourDropdown ;

	@FindBy(xpath="//*[@id='fontBackColor_ExtraField_FontCtrl']")
	public static WebElement backColorDropdown ;

	@FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div[2]/div/div[2]/div[7]/div/div[1]/label/span")
	public static WebElement baselineChekbox ;

	@FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div[2]/div/div[2]/div[7]/div/div[2]/label/span")
	public static WebElement overLineChekbox ;

	@FindBy(xpath="//*[@id='chkStrikeThrough_ExtraField_FontCtrl']")
	public static WebElement strikeThroughChekbox ;

	@FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div[2]/div/div[2]/div[7]/div/div[4]/label/span")
	public static WebElement underlineChekbox ;

	@FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div[2]/div/div[2]/div[9]/label/span")
	public static WebElement enableFontChekbox ;

	@FindBy(xpath="//*[@id='previewfont_ExtraField_FontCtrl']")
	public static WebElement frontPriveiw ;

	@FindBy(xpath="//*[@id='btnAddGroup_Ok']")
	public static WebElement frontSaveBtn ;

	@FindBy(xpath="//*[@id='btnAddGroup_Cancel']")
	public static WebElement frontCloseBtn ;





	//Item		 














	//Units


	@FindBy(xpath="//div[@id='divTreeMenu']")
	public static WebElement treeUnitsDisplay;	

	@FindBy(xpath="//input[@id='iNoOfDecimals']")
	public static WebElement noOfDecimalsTxt;

	@FindBy(xpath="//select[@id='RoundingType']")
	public static WebElement roundingTypeDropdown;

	@FindBy(xpath="//select[@id='UnitType']")
	public static WebElement unitTypeDropdown;

	@FindBy(xpath="//button[@id='btnMasterClone']")
	public static WebElement editcloneBtn;

	@FindBy(xpath="//*[@id='btnMasterCopy']")
	public static WebElement copyBtn;

	@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[6]")
	public static WebElement editcloseBtn;

	@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[10]")
	public static List<WebElement> unitNameList;

	@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[8]/div[1]")
	public static List<WebElement> unitsCheckBoxList;

	@FindBy(xpath="//span[contains(text(),'Units Properties')]")
	public static WebElement unitsPropertiesLabel;

	@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[8]/div/label/input")
	public static List<WebElement> checkboxListInMasters;

	@FindBy(xpath="//*[@id='72']/span")
	public static WebElement unitsConversionMenu;

	@FindBy (xpath="//*[@id='ReminderNavBar']/div/nav/ol/li[4]")
	public static WebElement unitsConversionTitle;

	//Units


	@FindBy(xpath="//span[contains(text(),'Select Sheet')]")
	public static WebElement sheetTitle;

	@FindBy(xpath="//li[@class='clsSheetName']")
	public static WebElement sheetName;

	@FindBy(xpath="//button[@id='btnSheetOk']")
	public static WebElement sheetOkButton;

	@FindBy(xpath="//button[@id='btnSheetClose']")
	public static WebElement sheetCloseButton;


	@FindBy(xpath="//div[@id='myModalImportFromExcel']//tr[1]//td[3]")
	public static WebElement sheetItemHeading;

	@FindBy(xpath="//select[@id='ddlImportFromExcelItemList0']")
	public static WebElement sheetItem;

	@FindBy(xpath="//div[@id='myModalImportFromExcel']//tr[2]//td[3]")
	public static WebElement sheetAccountHeading;

	@FindBy(xpath="//select[@id='ddlImportFromExcelItemList1']")
	public static WebElement sheetAccount;

	@FindBy(xpath="(//div[@id='myModalImportFromExcel']//tr[3]//td[3])[2]")
	public static WebElement sheetTagHeading;

	@FindBy(xpath="//select[@id='ddlImportFromExcelItemList2']")
	public static WebElement sheetTag;

	@FindBy(xpath="//div[@id='myModalImportFromExcel']//tr[4]//td[3]")
	public static WebElement sheetCurrencyHeading;

	@FindBy(xpath="//select[@id='ddlImportFromExcelItemList3']")
	public static WebElement sheetCurrency;

	@FindBy(xpath="//div[@id='myModalImportFromExcel']//tr[5]//td[3]")
	public static WebElement sheetStartDateHeading;

	@FindBy(xpath="//select[@id='ddlImportFromExcelItemList4']")
	public static WebElement sheetStartDate;

	@FindBy(xpath="//div[@id='myModalImportFromExcel']//tr[6]//td[3]")
	public static WebElement sheetEndDateHeading;

	@FindBy(xpath="//select[@id='ddlImportFromExcelItemList5']")
	public static WebElement sheetEndDate;

	@FindBy(xpath="//div[@id='myModalImportFromExcel']//tr[7]//td[3]")
	public static WebElement sheetMinQtyHeading;

	@FindBy(xpath="//select[@id='ddlImportFromExcelItemList6']")
	public static WebElement sheetMinQty;

	@FindBy(xpath="//div[@id='myModalImportFromExcel']//tr[8]//td[3]")
	public static WebElement sheetMaxQtyHeading;

	@FindBy(xpath="//select[@id='ddlImportFromExcelItemList7']")
	public static WebElement sheetMaxQty;

	@FindBy(xpath="//div[@id='myModalImportFromExcel']//tr[9]//td[3]")
	public static WebElement sheetUnitHeading;

	@FindBy(xpath="//select[@id='ddlImportFromExcelItemList8']")
	public static WebElement sheetUnitQty;

	@FindBy(xpath="//div[@id='myModalImportFromExcel']//tr[10]//td[3]")
	public static WebElement sheetRateHeading;

	@FindBy(xpath="//select[@id='ddlImportFromExcelItemList9']")
	public static WebElement sheetRate;

	@FindBy(xpath="//div[@id='myModalImportFromExcel']//tr[11]//td[3]")
	public static WebElement sheetPOHeading;

	@FindBy(xpath="//select[@id='ddlImportFromExcelItemList10']")
	public static WebElement sheetPO;

	@FindBy(xpath="//div[@id='myModalImportFromExcel']//tr[12]//td[3]")
	public static WebElement sheetPTHeading;

	@FindBy(xpath="//div[@id='myModalImportFromExcel']//tr[13]//td[3]")
	public static WebElement sheetHeading;

	@FindBy(xpath="//select[@id='ddlImportFromExcelItemList11']")
	public static WebElement sheetPT;

	@FindBy(xpath="//select[@id='ddlImportFromExcelItemList12']")
	public static WebElement sheetP;


	@FindBy (xpath="//ul[@id='ddlMenu']/li/label/input")
	public static List<WebElement> buyerPriceBook_CustomizeCheckBoxList;

	@FindBy (xpath="//tbody[@id='PriceBookWebGrid_body']/tr[1]/td")
	public static List<WebElement> buyerPriceBook_TableRow1List;

	@FindBy (xpath="//tbody[@id='PriceBookWebGrid_body']/tr[2]/td")
	public static List<WebElement> buyerPriceBook_TableRow2List;


	@FindBy(xpath="//select[@id='ImportGrid_ExternalFields']")
	public static WebElement buyerPriceBook_MappingDrpdwn;


	//PreferencesTest
	@FindBy(xpath = "//*[@id='16']//span[text()='Settings']")
	public static WebElement settingsmenuBtn;

	@FindBy(xpath="//*[@id='navigation_menu']/li[8]/ul/li[@class='submenuone']")
	public static List<WebElement>  settingMenuList;


	@FindBy(xpath="//span[contains(text(),'Configure Transactions')]")
	public static WebElement  ConfigureTransactionBtn;





	@FindBy(xpath="//span[contains(text(),'Configure Transactions')]")
	public static WebElement  settingsConfigureTransactions;   

	@FindBy(xpath="//*[@id='68']/span")
	public static WebElement  settingsTransactionAuthorization;

	@FindBy(xpath="//*[@id='235']/span")
	public static WebElement  settingsPricebookAuthorization;

	@FindBy(xpath="//*[@id='19']/span")
	public static WebElement  settingsConfigureMasters;

	@FindBy(xpath="//*[@id='67']/span")
	public static WebElement  settingsMasterAuthorization;

	@FindBy(xpath="//*[@id='69']/span")
	public static WebElement  settingsCreditLimitAuthorization;

	@FindBy(xpath="//*[@id='74']/span")
	public static WebElement  settingsDesignWorkflow;

	@FindBy(xpath="//*[@id='105']/span")
	public static WebElement  settingsSettingsWizard;

	@FindBy(xpath="//*[@id='232']/span")
	public static WebElement  settingsBatchCodeGeneration;

	@FindBy(xpath="//*[@id='34']/span")
	public static WebElement  settingsMapCreditLimit;


	@FindBy(xpath="//*[@id='258']/span")
	public static WebElement  settingsCustomerPortalAdmin;

	@FindBy(xpath="//*[@id='3308']/span")
	public static WebElement  settingsBudgetAuthorization;

	@FindBy(xpath="//*[@id='3320']/span")
	public static WebElement  settingsPaymentGatewayIntegration;	

	@FindBy(xpath="//*[@id='3322']//span")
	public static WebElement  settingsAISetup;	

	@FindBy(xpath="//*[@id='3329']//span")
	public static WebElement  ConfigureForms;	



	@FindBy(xpath="//*[@id='3327']/span")
	public static WebElement  settingsFixedAssetsAuthorization;	

	@FindBy(xpath="//*[@id='dvTag']/div/div/label")
	public static List<WebElement>  configureTransactionPageList;

	@FindBy(xpath="//*[@id='configureTransactions']/div/div[1]/div/div/ul/li[1]/a")
	public static WebElement  PreferencesBtn;

	@FindBy(xpath="//*[@id='configureTransactions']/div/div[1]/div/div/ul/li[2]/a")
	public static WebElement  DocumentCustomizationBtn;


	

	@FindBy(xpath="//li//a[@id='0' and text()='Tags']")
	public static WebElement  TagsBtn;

	@FindBy(xpath="//*[@id='1' and text()='Accounts ']")
	public static WebElement  AccountsBtn;

	@FindBy(xpath="//*[@id='2' and text()='Budgets']")
	public static WebElement  BudgetBtn;

	@FindBy(xpath="//*[@id='3' and text()='AR/AP']")
	public static WebElement  ARAPBtn;

	@FindBy(xpath="//*[@id='4' and text()='Miscellaneous']")
	public static WebElement  MiselleanousBtn;

	@FindBy(xpath="//*[@id='5' and text()='PDC']")
	public static WebElement  PDCBtn;

	@FindBy(xpath="//*[@id='6' and text()= 'Inventory ']")
	public static WebElement  InventoryBtn;

	@FindBy(xpath="//*[@id='7' and text()='Batch']")
	public static WebElement  BatchBtn;

	@FindBy(xpath="//*[@id='30' and text()='RMA']")
	public static WebElement  RMABtn;

	@FindBy(xpath="//*[@id='8' and text()='Bins']")
	public static WebElement  BinsBtn;

	@FindBy(xpath="//*[@id='9' and text()='Hire Purchase']")
	public static WebElement  HirePurchaseBtn;

	@FindBy(xpath="//*[@id='10' and text()='Quotation Analysis']")
	public static WebElement  QuotationAnalysisBtn;

	@FindBy(xpath="//*[@id='34' and text()='RFID']")
	public static WebElement  RFIDBtn;

	@FindBy(xpath="//*[@id='29' and text()='Auto Indent']")
	public static WebElement  AutoIndentBtn;

	@FindBy(xpath="//*[@id='14' and text()='ABC Analysis']")
	public static WebElement  ABCAnalysisBtn;

	@FindBy(xpath="//*[@id='11' and text()='Report']")
	public static WebElement  ReportBtn;

	@FindBy(xpath="//*[@id='12' and text()='Internet']")
	public static WebElement  InternetBtn;

	@FindBy(xpath="//*[@id='13' and text()='Mail Settings']")
	public static WebElement  MailSettingsBtn;

	@FindBy(xpath="//*[@id='16' and text()='Masters']")
	public static WebElement  MastersBtn;

	@FindBy(xpath="//*[@id='17' and text()='External Modules']")
	public static WebElement  ExternalModulesBtn;

	@FindBy(xpath="//*[@id='18' and text()='Info']")
	public static WebElement  InfoBtn;

	@FindBy(xpath="//*[@id='19' and text()='Production']")
	public static WebElement  ProductionBtn;

	@FindBy(xpath="//*[@id='20' and text()='MRP']")
	public static WebElement  MrpBtn;


	@FindBy(xpath="//*[@id='21' and text()='Quality Control']")
	public static WebElement  QualityControlBtn;


	@FindBy(xpath="//*[@id='22' and text()='Fixed Assets']")
	public static WebElement  FixedAssetsBtn;

	@FindBy(xpath="//*[@id='25' and text()='VAT']")
	public static WebElement  VatBtn;

	@FindBy(xpath="//*[@id='28' and text()='POS']")
	public static WebElement  PosBtn;

	@FindBy(xpath="//*[@id='35' and text()='Warehouse Management']")
	public static WebElement  WareHouseManagementBtn;

	@FindBy(xpath="//*[@id='36' and text()='Letter of Credit']")
	public static WebElement  LetterForCreditBtn;

	@FindBy(xpath="//*[@id='37' and text()='Pronghorn']")
	public static WebElement  PronghornBnt;

	@FindBy(xpath="//*[@id='38' and text()='AI Setting']")
	public static WebElement  AISettingsBtn;

	@FindBy(xpath="//*[@id='39' and text()='WhatsApp']")
	public static WebElement  WhatsAppBtn;


	@FindBy(xpath="//select[@id='Accounts']")
	public static WebElement  AccountingDropdown;

	@FindBy(xpath="//select[@id='Inventory']")
	public static WebElement  InventoryDropdown;

	@FindBy(xpath="//select[@id='Payroll']")
	public static WebElement  PayRollCostCenterDropdown;

	@FindBy(xpath="//select[@id='SellingRate']")
	public static WebElement  SellingsRateDropdown;

	@FindBy(xpath="//select[@id='BuyingRates']")
	public static WebElement  BuyingRatesdropdown;

	@FindBy(xpath="//select[@id='PayrolDept']")
	public static WebElement  PayRollDepartmentDropdown;

	@FindBy(xpath="//select[@id='PayrollSite']")
	public static WebElement  PayRollSiteDropdown;

	@FindBy(xpath="//select[@id='DeptwiseAppropriation']")
	public static WebElement  FinancialAppropriationByDropdown;

	@FindBy(xpath="//select[@id='VAT']")
	public static WebElement  VatDropdown;

	@FindBy(xpath="//select[@id='Schemes']")
	public static WebElement  SchemesDropdown;

	@FindBy(xpath="//select[@id='Inventoryallocationtag']")
	public static WebElement  InventoryAloocationTagDropdown;

	@FindBy(xpath="//a[@id='updateButton']/i")
	public static WebElement  UpdateBtn;

	@FindBy(xpath="//*[@id='btnCustomizeClose']/i")
	public static WebElement  CustCloseBtn;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapsetwo']/div/div/div/label")
	public static List<WebElement>  accountsPageList;


	@FindBy(xpath="//input[@id='AssetGroup0']")
	public static WebElement  acc_AssertGroupDrpdwn;

	@FindBy(xpath="//input[@id='CashAndBankGroup1']")
	public static WebElement  acc_CashAndBankDrpdwn;

	@FindBy(xpath="//input[@id='ControlAccount2']")
	public static WebElement  acc_ControlAC;

	@FindBy(xpath="//input[@id='DepreciationAndAmortization3']")
	public static WebElement  acc_DepreciationAndAmortizationDrpdwn;

	@FindBy(xpath="//input[@id='Expenses4']")
	public static WebElement  acc_ExpencesGroupDrpdwn;

	@FindBy(xpath="//input[@id='ForeignExchangeGainAccount5']")
	public static WebElement  acc_ForginExchangeGainAccDrpDwn;

	@FindBy(xpath="//input[@id='ForeignExchangeLossAccount6']")
	public static WebElement  acc_ForginExchangeLossAccDrpDwn;

	@FindBy(xpath="//input[@id='GeneralAndAdministrativeExpenses7']")
	public static WebElement  acc_GeneralAdminExpenDrpdwn;

	@FindBy(xpath="//input[@id='IncomeTaxAccount8']")
	public static WebElement  acc_IncomeTaxesDrpdwn;

	@FindBy(xpath="//input[@id='IncomeGroup9']")
	public static WebElement  acc_IncomesDrpdwn;

	@FindBy(xpath="//input[@id='Liabilities10']")
	public static WebElement  acc_LiabilitesDrpdwn;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapsethree']/div/label/span")
	public static WebElement  acc_NegCashBankChkbox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapsethree']/div/label/input")
	public static WebElement  acc_NegCashBankChkboxSelected;

	@FindBy(xpath="//div[@id='divTreeMenu']")
	public static WebElement masterTreeDisplayMenuAccountGroups; 		


	@FindBy(xpath="//*[@id='dvCheckNegativeCashByTag']/span")
	public static WebElement  checkNegativeCashByTagChkBox;

	@FindBy(xpath="//*[@id='dvCheckNegativeCashByTag']/input")
	public static WebElement  checkNegativeCashByTagChkBoxSelected;


	@FindBy(xpath="//input[@id='CheckAccountInNegativeCashBalance_0']")
	public static WebElement checkNegativeCashBalance_WarnAndAllowRadio;

	@FindBy(xpath="//input[@id='CheckAccountInNegativeCashBalance_1']")
	public static WebElement checkNegativeCashBalance_StopRadio;


	@FindBy(xpath="//input[@id='CheckAccountInNegativeCashByTag_0']")
	public static WebElement checkNegativeCashByTag_WarnAndAllowRadio;

	@FindBy(xpath="//input[@id='CheckAccountInNegativeCashByTag_1']")
	public static WebElement checkNegativeCashByTag_StopRadio;



	@FindBy(xpath="//*[@id='panelsStayOpen-collapsefour']/div/label[1]/span")
	public static WebElement  acc_DoNotBalChkbox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapsefour']/div/label[2]/span")
	public static WebElement  acc_RestrictAccBasedOnDepartChkbox ;


	@FindBy(xpath="//*[@id='dvCheckBudgets']/div/label/span")
	public static WebElement  budgetChekBudgetInDataEntryChkbox;

	@FindBy(xpath="//input[@id='CheckBudgetInDataEntryGroup_0']")
	public static WebElement  budgetQuaterlyRadioBtn ;

	@FindBy(xpath="//input[@id='CheckBudgetInDataEntryGroup_1']")
	public static WebElement  budgetmonthlyRadioBtn;

	@FindBy(xpath="//input[@id='CheckBudgetInDataEntryGroup_2']")
	public static WebElement  budgetAnnualRadioBtn;

	@FindBy(xpath="//input[@id='BudgetExceeded_0']")
	public static WebElement  budgetWarnAndAllowRadioBtn;

	@FindBy(xpath="//input[@id='BudgetExceeded_1']")
	public static WebElement  budgetStopRadioBtn;

	@FindBy(xpath="//input[@id='BudgetGroup_0']")
	public static WebElement  budgetNARadioBtn;

	@FindBy(xpath="//input[@id='BudgetGroup_1']")
	public static WebElement  budgetbyAccountRadioBtn;

	@FindBy(xpath="//input[@id='BudgetGroup_2']")
	public static WebElement  budgetbyAccByTagRadioBtn;

	@FindBy(xpath="//input[@id='BudgetGroup_3']")
	public static WebElement  budgetByAccByItemByTagRadioBtn;

	@FindBy(xpath="//*[@id='cmbBudgetPlanning']")
	public static WebElement  budgetPlanningTagSelection;

	//maintainied by AR




	@FindBy(xpath="//*[@id='ARAccountsSettings']/button")
	public static WebElement arTagExpandBtn; 

	@FindBy(xpath="//*[@id='ARAccountsSettings']/button")
	public static WebElement creditLimitExpandBtn; 

	//*[@id="CreditLimit"]/button

	@FindBy(xpath="//*[@id='grpMaintainARBy']/div/label[1]/span")
	public static WebElement arTagChkBox; 

	@FindBy(xpath="//*[@id='grpMaintainARBy']/div/label[1]/input")
	public static WebElement arTagChkBoxSelected; 

	@FindBy(xpath="//*[@id='optARTag']")
	public static WebElement arTagTxt;

	@FindBy(xpath="//*[@id='grpMaintainARBy']/div/label[2]/span")
	public static WebElement salesAccountChkBox;

	@FindBy(xpath="//*[@id='grpMaintainARBy']/div/label[2]/input")
	public static WebElement salesAccountChkBoxSelected;

	@FindBy(xpath="//*[@id='grpMaintainARBy']/div/label[3]/span")
	public static WebElement  arItemChkBox;




	@FindBy(xpath="//*[@id='CreditLimitContent']/div/label[1]/span")
	public static WebElement enableCreditLimitCheckChkBox;

	@FindBy(xpath="//*[@id='CreditLimitContent']/div/label[1]/input")
	public static WebElement enableCreditLimitCheckChkBoxSelected;

	@FindBy(xpath="//*[@id='dvCreditcardcheck']/label[1]/span")
	public static WebElement includePendingSalesOrderChkBox;

	@FindBy(xpath="//*[@id='dvCreditcardcheck']/label[1]/input")
	public static WebElement includePendingSalesOrderChkBoxSelected;

	@FindBy(xpath="//*[@id='dvCreditcardcheck']/label[2]/span")
	public static WebElement checkCreditLimitInOrdersChkBox; 

	@FindBy(xpath="//*[@id='dvCreditcardcheck']/label[2]/input")
	public static WebElement checkCreditLimitInOrdersChkBoxSelected; 

	@FindBy(xpath="//*[@id='dvCreditcardcheck']/label[3]/span")
	public static WebElement defineCreditLimitByDepartmentChkBox;

	@FindBy(xpath="//*[@id='dvCreditcardcheck']/label[3]/input")
	public static WebElement defineCreditLimitByDepartmentChkBoxSelected;


	@FindBy(xpath="//*[@id='dvCreditcardcheck']/label[4]/span")
	public static WebElement allowCreditLimitAuthorizationmappingChkBox;

	@FindBy(xpath="//*[@id='dvCreditcardcheck']/label[4]/input")
	public static WebElement allowCreditLimitAuthorizationmappingChkBoxSelected;

	@FindBy(xpath="//input[@id='dvExceed_0']")
	public static WebElement  whenCreditLimitexceeded_WarnAndAllowRadio;

	@FindBy(xpath="//input[@id='dvExceed_1']")
	public static WebElement whenCreditLimitexceeded_StopRadio;

	@FindBy(xpath="//input[@id='dvExceed_2']")
	public static WebElement  RequestCreditLimitIncreaseRadio;

	@FindBy(xpath="//*[@id='CreditLimitContent']/div/label[2]/span")
	public static WebElement pickCreditDayFromChkBox; 

	@FindBy(xpath="//input[@id='dvPickCreditDayFromSalesAC_0']")
	public static WebElement customerVendorACRadio;

	@FindBy(xpath="//input[@id='dvPickCreditDayFromSalesAC_1']")
	public static WebElement paymentsTermsRadio;

	@FindBy(xpath="//input[@id='dvPickCreditDayFromSalesAC_2']")
	public static WebElement  salesACRadio;

	@FindBy(xpath="//*[@id='grpMaintainAPBy']/div[1]/label[1]/span")
	public static WebElement apTagChkBox; 

	@FindBy(xpath="//*[@id='grpMaintainAPBy']/div[1]/label[1]/input")
	public static WebElement apTagChkBoxSelected; 

	@FindBy(xpath="//input[@id='optAPTag']")
	public static WebElement apTagTxt;

	@FindBy(xpath="//*[@id='grpMaintainAPBy']/div[1]/label[2]/span")
	public static WebElement purchaseAccountChkBox;

	@FindBy(xpath="//*[@id='grpMaintainAPBy']/div[1]/label[3]/span")
	public static WebElement  apItemChkBox;

	@FindBy(xpath="//*[@id='grpMaintainAPBy']/div[1]/label[3]/input")
	public static WebElement  apItemChkBoxSelected;

	@FindBy(xpath="//*[@id='grpMaintainAPBy']/label[2]/span")
	public static WebElement dependsOnMaintainBillWiseForARAPChkBox;

	@FindBy(xpath="//*[@id='grpMaintainAPBy']/label[2]/input")
	public static WebElement dependsOnMaintainBillWiseForARAPChkBoxSelected;

	@FindBy(xpath="//*[@id='dvMaintainARAP']/label[1]/span")
	public static WebElement maintainARTransactionCurrenciesChkBox;

	@FindBy(xpath="//*[@id='dvMaintainARAP']/label[1]/input")
	public static WebElement maintainARTransactionCurrenciesChkBoxSelected;

	@FindBy(xpath="//*[@id='dvMaintainARAP']/label[2]/span")
	public static WebElement maintainAPTransactionCurrenciesChkBox; 

	@FindBy(xpath="//*[@id='dvMaintainARAP']/label[2]/input")
	public static WebElement maintainAPTransactionCurrenciesChkBoxSelected; 

	@FindBy(xpath="//*[@id='grpMaintainAPBy']/label[3]/span")
	public static WebElement inputNarrationInReferenceChkBox;

	@FindBy(xpath="//*[@id='grpMaintainAPBy']/label[3]/input")
	public static WebElement inputNarrationInReferenceChkBoxSelected;

	@FindBy(xpath="//*[@id='grpMaintainAPBy']/label[4]/span")
	public static WebElement enableOverDueCheckChkBox;

	@FindBy(xpath="//*[@id='grpMaintainAPBy']/label[4]/input")
	public static WebElement enableOverDueCheckChkBoxSelected;

	@FindBy(xpath="//*[@id='dvOverDueCheck']/label/span")
	public static WebElement  useCreditDaysInsteadOfDueDateChkBox;

	@FindBy(xpath="//*[@id='dvOverDueCheck']/label/input")
	public static WebElement  useCreditDaysInsteadOfDueDateChkBoxSelected;

	@FindBy(xpath="//input[@id='dvOverdueExceed_0']")
	public static WebElement whenCreditDaysLimitexceeded_WarnAndAllowRadio;

	@FindBy(xpath="//input[@id='dvOverdueExceed_1']")
	public static WebElement whenCreditDaysLimitexceeded_StopRadio;

	@FindBy(xpath="//tbody[@id='optLocalCurrency_table_body']/tr/td[2]")
	public static List<WebElement> localCurrencyCombo;




	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[1]/label/span")
	public static WebElement addfreeItemsonaNewLineChkBox;

	@FindBy(xpath="//input[@id='chkAddFreeItems']")
	public static WebElement addfreeItemsonaNewLineChkBoxSelected; 

	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[2]/label/span")
	public static WebElement calculatedueDateFromLRDateChkBox;

	@FindBy(xpath="//input[@id='chkCalDueDtLRDt']")
	public static WebElement calculatedueDateFromLRDateChkBoxSelected;


	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[3]/label/span")
	public static WebElement createCustomerProfileFieldsChkBox;

	@FindBy(xpath="//input[@id='chkCreateCustomerProfilefields']")
	public static WebElement createCustomerProfileFieldsChkBoxSelected;


	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[4]/label/span")
	public static WebElement  dialogbasedentryinvouchersChkBox;

	@FindBy(xpath="//input[@id='chkDialogbasedentryinvouchers']")
	public static WebElement  dialogbasedentryinvouchersChkBoxSelected;


	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[5]/label/span")
	public static WebElement dontRefreshDescACProdDocChkBox; 

	@FindBy(xpath="//input[@id='chkDontRefreshDescACProdDoc']")
	public static WebElement dontRefreshDescACProdDocChkBoxSelected; 


	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[6]/label/span")
	public static WebElement includeUnCommitedTransactionChkBox;

	@FindBy(xpath="//input[@id='chkIncUnCommitTransRpts']")
	public static WebElement includeUnCommitedTransactionChkBoxSelected;


	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[7]/label/span")
	public static WebElement maintainLinksforOnlyOneSideChkBox;

	@FindBy(xpath="//input[@id='chkMntnLnksStkTransfer']")
	public static WebElement maintainLinksforOnlyOneSideChkBoxSelected;


	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[8]/label/span")
	public static WebElement  showStatusMessageInPopUphkox;

	@FindBy(xpath="//input[@id='chkShowStatus']")
	public static WebElement  showStatusMessageInPopUphkoxSelected;

	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[10]/label/span")
	public static WebElement prefixLocationCodeWhileImportingChkBox; 


	@FindBy(xpath="//input[@id='chkPrefixLocationCode']")
	public static WebElement prefixLocationCodeWhileImportingChkBoxSelected; 

	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[11]/label/span")
	public static WebElement showTransactionDateInFifo;

	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[12]/label/span")
	public static WebElement enableLocalCurrencyChkBox;

	@FindBy(xpath="//input[@id='chkEnableLocalCurrency']")
	public static WebElement enableLocalCurrencyChkBoxSelected;

	@FindBy(xpath="//input[@id='optLocalCurrency']")
	public static WebElement  localCurrencyTxt;

	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[14]/label/span")
	public static WebElement dontShowOpeningBalLedgerChkBox; 

	@FindBy(xpath="//input[@id='chkDontShowOpeningBalLedger']")
	public static WebElement dontShowOpeningBalLedgerChkBoxSelected; 

	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[15]/label/span")
	public static WebElement dontStoreDatesEntriesChkBox;

	@FindBy(xpath="//input[@id='chkDontStoreDatesEntries']")
	public static WebElement dontStoreDatesEntriesChkBoxSelected;

	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[16]/label/span")
	public static WebElement showexchangeratedifferenceinledgerChkBox;

	@FindBy(xpath="//input[@id='chkShowexchangeratedifferenceinledger']")
	public static WebElement showexchangeratedifferenceinledgerChkBoxSelected;

	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[17]/label/span")
	public static WebElement  enableHijriDateChkBox;

	@FindBy(xpath="//input[@id='chkEnableHijriDate']")
	public static WebElement  enableHijriDateChkBoxSelected;

	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[18]/label/span")
	public static WebElement enableprofitabilitycheckbyproductChkBox; 

	@FindBy(xpath="//input[@id='chkEnableprofitabilitycheckbyproduct']")
	public static WebElement enableprofitabilitycheckbyproductChkBoxSelected; 

	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[19]/label/span")
	public static WebElement donotLoadDocInExlusivemodeChkBox;

	@FindBy(xpath="//input[@id='chkDonotLoadDocInExlusivemode']")
	public static WebElement donotLoadDocInExlusivemodeChkBoxSelected;

	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[20]/label/span")
	public static WebElement createMasterinTransactionEntryChkBox;

	@FindBy(xpath="//input[@id='chkCreateMasterinTransactionEntry']")
	public static WebElement createMasterinTransactionEntryChkBoxSelected;

	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[21]/label/span")
	public static WebElement  stayOnSameVoucherNumberAfterDeleteingChkBox;

	@FindBy(xpath="//input[@id='chkNextVoucherNoAftSaveVoucher']")
	public static WebElement  stayOnSameVoucherNumberAfterDeleteingChkBoxSelected;


	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[22]/label/span")
	public static WebElement openSearchIfMasterNotFoundChkBox; 

	@FindBy(xpath="//input[@id='chkOpenSearchIfMasterNotFound']")
	public static WebElement openSearchIfMasterNotFoundChkBoxSelected; 

	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[24]/label/span")
	public static WebElement loadDateBasesonLastSavedVoucherChkBox;

	@FindBy(xpath="//input[@id='chkloadDateBasesonLastSavedVoucher']")
	public static WebElement loadDateBasesonLastSavedVoucherChkBoxSelected;

	@FindBy(xpath="//*[@id='MisecAccountsContent']/div[25]/label/span[@class='checkmark']")
	public static WebElement filtercurrencyBasedondepartmentChkBox;

	@FindBy(xpath="//input[@id='idfiltercurrencyBasedondepartment']")
	public static WebElement filtercurrencyBasedondepartmentChkBoxSelected;

	@FindBy(xpath="//*[@id='CalenderSettings']/button")
	public static WebElement calendarSettingsExpandBtn;

	@FindBy(xpath="//*[@id='ExcludevoucherduringRepost']/button")
	public static WebElement ExcludevoucherduringRepostExpandBtn;

	@FindBy(xpath="//*[@id='InvoiceEmailSettings']/button")
	public static WebElement InvoiceEmailSettingsExpandBtn;



	@FindBy(xpath="//input[@id='optCalendar']")
	public static WebElement  defaultCalanderTxt;


	@FindBy(xpath="//select[@id='cmbImageformat']")
	public static WebElement imageFormatDropdown;

	@FindBy(xpath="//select[@id='cmbNumericSep']")
	public static WebElement numericSeperatorDropdown1;

	@FindBy(xpath="//select[@id='cmbFormula']")
	public static WebElement  numericSeperatorDropdown2;

	@FindBy(xpath="//input[@id='rdoDocTypeOrClass_0']")
	public static WebElement docTypeRadio; 

	@FindBy(xpath="//input[@id='rdoDocTypeOrClass_1']")
	public static WebElement docClassRadio;

	@FindBy(xpath="//td[@id='gPrefMisExcludeVoucher_col_1-0']")
	public static WebElement gridFirstRowIndexBtn;

	@FindBy(xpath="//td[@id='gPrefMisExcludeVoucher_col_2-0']")
	public static WebElement  gridSecondRowIndexBtn;

	@FindBy(xpath="//td[@id='gPrefMisExcludeVoucher_col_1-1']")
	public static WebElement gridVoucherFirstRow; 

	@FindBy(xpath="//td[@id='gPrefMisExcludeVoucher_col_2-1']")
	public static WebElement gridVoucherSecondRow;

	@FindBy(xpath="//input[@id='rdoSendMailClass_0']")
	public static WebElement sendAsAttachmentRadio;

	@FindBy(xpath="//input[@id='rdoSendMailClass_1']")
	public static WebElement  sendASBodyRadio;



	@FindBy(xpath = "//*[@id='dvCheckPDC']/div/label/span")
	public static WebElement postDatedChequeChkbox;

	@FindBy(xpath = "//input[@id='chkPostDatedCheques']")
	public static WebElement postDatedChequeChkboxSelected;

	@FindBy(xpath = "//*[@id='dvPostDatedCheques']/div/label[1]/span")
	public static WebElement AutoCheckMaturedPDCChkbox;

	@FindBy(xpath = "//input[@id='chkAutoCheckMaturedPDC']")
	public static WebElement AutoCheckMaturedPDCChkboxSelected;

	@FindBy(xpath = "//*[@id='dvPostDatedCheques']/div/label[2]/span")
	public static WebElement displayLedgerAndBalanceChkbox;

	@FindBy(xpath = "//input[@id='gphDisplayInLedger']")
	public static WebElement displayLedgerAndBalanceChkboxSelected;

	@FindBy(xpath = "//*[@id='dvPostDatedCheques']/div/label[3]/span")
	public static WebElement matureDatesinLedgerChkbox;

	@FindBy(xpath = "//input[@id='gphDisplayBasedOnMaturityDateInLedger']")
	public static WebElement matureDatesinLedgerChkboxSelected;

	@FindBy(xpath = "//*[@id='dvPostDatedCheques']/div/label[4]/span")
	public static WebElement reversePostingConversionChkbox;

	@FindBy(xpath = "//input[@id='chkReverseACPostPDCConversion']")
	public static WebElement reversePostingConversionChkboxSelected;

	@FindBy(xpath = "//input[@id='PDCDiscountedAccount']")
	public static WebElement chequeDiscountingACDrpdwn;

	@FindBy(xpath = "//input[@id='PDCDiscountedVoucherType']")
	public static WebElement discountedVoucherDepdwn;

	@FindBy(xpath="//*[@id='StockSettings']//button")
	public static WebElement  StockSettingsExpandBtn;

	@FindBy(xpath="//*[@id='Cogs']/button")
	public static WebElement  cogsExpandBtn;

	@FindBy(xpath="//*[@id='InventorySettings']/button")
	public static WebElement  InventorySettingsExpandBtn;

	@FindBy(xpath="//*[@id='chkReservation']/button")
	public static WebElement  ReservationExpandBtn;


	@FindBy(xpath="//input[@id='Reservation_1']")
	public static WebElement  Reservation_NoneRadio;

	@FindBy(xpath="//input[@id='Reservation_2']")
	public static WebElement  Reservation_QuantitiesRadio;

	@FindBy(xpath="//input[@id='Reservation_3']")
	public static WebElement  Reservation_ReserveByRadio;

	@FindBy(xpath="//*[@id='dvReserveBy']/div/label[1]/span")
	public static WebElement  ReservationByBatchChkBox;

	@FindBy(xpath="//input[@id='ReservationByBatch']")
	public static WebElement  ReservationByBatchChkBoxSelected;

	@FindBy(xpath="//*[@id='dvReserveBy']/div/label[2]/span")
	public static WebElement  ReservationByBinChkBox;

	@FindBy(xpath="//input[@id='ReservationByBin']")
	public static WebElement  ReservationByBinChkBoxSelected;

	@FindBy(xpath="//*[@id='dvReserveBy']/div/label[3]/span")
	public static WebElement  ReservationByRMAChkBox;

	@FindBy(xpath="//input[@id='ReservationByRMA']")
	public static WebElement  ReservationByRMAChkBoxSelected;







	@FindBy(xpath="//input[@id='CheckNegativeStock']")
	public static WebElement  CheckNegativeStockChkBoxSelected;

	@FindBy(xpath="//*[@id='StockSettingsContent']/div/label[1]/span")
	public static WebElement  CheckNegativeStockChkBox;

	@FindBy(xpath="//input[@id='CheckNegativeStockGroup_0']")
	public static WebElement  CheckNegativeStockWarnandAllowRadio;

	@FindBy(xpath="//input[@id='CheckNegativeStockGroup_1']")
	public static WebElement  CheckNegativeStockStopRadio;

	@FindBy(xpath="//*[@id='ChkNvStkGroupChkBoxs']/div/label[1]/span")
	public static WebElement  IncludePendingPOToCheckNegativeStockChkBox;

	@FindBy(xpath="//input[@id='IncludePendingPOToCheckNegativeStock']")
	public static WebElement  IncludePendingPOToCheckNegativeStockChkBoxSelected;

	@FindBy(xpath="//*[@id='ChkNvStkGroupChkBoxs']/div/label[2]/span")
	public static WebElement  CheckStockInOrdersChkBox;

	@FindBy(xpath="//input[@id='CheckStockInOrders']")
	public static WebElement  CheckStockInOrdersChkBoxSelected;

	@FindBy(xpath="//*[@id='ChkNvStkGroupChkBoxs']/div/label[3]/span")
	public static WebElement  IncludePendingSOQuantityInnegativeStockCheckChkBox;

	@FindBy(xpath="//input[@id='IncludePendingSOQuantityInnegativeStockCheck']")
	public static WebElement  IncludePendingSOQuantityInnegativeStockCheckChkBoxSelected;

	@FindBy(xpath="//*[@id='ChkNvStkGroupChkBoxs']/div/label[4]/span")
	public static WebElement  IncludeReserveStockInStockCheckChkBox;

	@FindBy(xpath="//input[@id='IncludeReserveStockInStockCheck']")
	public static WebElement  IncludeReserveStockInStockCheckChkBoxSelected;

	@FindBy(xpath="//*[@id='StockSettingsContent']/div/label[2]/span")
	public static WebElement  CheckReorderLevelChkBox;

	@FindBy(xpath="//*[@id='StockSettingsContent']/div/label[2]/input")
	public static WebElement  CheckReorderLevelChkBoxSelected;

	@FindBy(xpath="//input[@id='ReorderLevelGroup_0']")
	public static WebElement  CheckReorderLevelWarnandAllowRadio;

	@FindBy(xpath="//input[@id='ReorderLevelGroup_1']")
	public static WebElement  CheckReorderLevelStoRadio;

	@FindBy(xpath="//input[@id='MaintainQuantityAndValueby_0']")
	public static WebElement  MaintainQtyAndValuebyWareHouseRadio;

	@FindBy(xpath="//input[@id='MaintainQuantityAndValueby_1']")
	public static WebElement  MaintainQtyByWareHouseandVlueOverAllRadio;

	@FindBy(xpath="//input[@id='MaintainQuantityAndValueby_2']")
	public static WebElement  MaintainQtyOverAllAndValueOverAllRadio;


	@FindBy(xpath="//*[@id='CogsContent']/div/label[1]/span")
	public static WebElement  IntegrateInventoryWithAccountsChkBox;

	@FindBy(xpath="//input[@id='IntegrateInventoryWithAccounts']")
	public static WebElement  IntegrateInventoryWithAccountsChkBoxSelected;



	@FindBy(xpath="//*[@id='InventorySettingsContent']/div/div[2]/label[1]/span")
	public static WebElement  IncludeReserveStockInStockLedgerChkBox;

	@FindBy(xpath="//*[@id='InventorySettingsContent']/div/div[2]/label[1]/input")
	public static WebElement  IncludeReserveStockInStockLedgerChkBoxSelected;

	@FindBy(xpath="//*[@id='InventorySettingsContent']/div/div[2]/label[2]/span")
	public static WebElement  InputUnitInTransactionsChkBox;

	@FindBy(xpath="//input[@id='InputUnitInTransactions']")
	public static WebElement  InputUnitInTransactionsChkBoxSelected;

	@FindBy(xpath="//*[@id='InventorySettingsContent']/div/div[2]/label[3]/span")
	public static WebElement  MaintainInventoryInAlternateUnitChkBox;

	@FindBy(xpath="//input[@id='MaintainInventoryInAlternateUnit']")
	public static WebElement  MaintainInventoryInAlternateUnitChkBoxSelected;

	@FindBy(xpath="//*[@id='InventorySettingsContent']/div/div[2]/label[4]/span")
	public static WebElement  RestrictProductSelectionDependingOnTypeChkBox;

	@FindBy(xpath="//input[@id='RestrictProductSelectionDependingOnType']")
	public static WebElement  RestrictProductSelectionDependingOnTypeChkBoxSelected;

	@FindBy(xpath="//*[@id='InventorySettingsContent']/div/div[2]/label[5]/span")
	public static WebElement  UpdateMRNValueStockThroughPurchaseChkBox;

	@FindBy(xpath="//input[@id='UpdateMRNValueStockThroughPurchase']")
	public static WebElement  UpdateMRNValueStockThroughPurchaseChkBoxSelected;

	@FindBy(xpath="//*[@id='InventorySettingsContent']/div/div[2]/label[6]/span")
	public static WebElement  DisplayProductAliasChkBox;

	@FindBy(xpath="//input[@id='DisplayProductAlias']")
	public static WebElement  DisplayProductAliasChkBoxSelected;

	@FindBy(xpath="//*[@id='InventorySettingsContent']/div/div[2]/label[7]/span")
	public static WebElement  ReorderLevelsByWarehouseChkBox;

	@FindBy(xpath="//input[@id='ReorderLevelsByWarehouse']")
	public static WebElement  ReorderLevelsByWarehouseChkBoxSelected;

	@FindBy(xpath="//*[@id='InventorySettingsContent']/div/div[2]/label[8]/span")
	public static WebElement  DonotUseRealTimeRateChkBox;

	@FindBy(xpath="//input[@id='DonotUseRealTimeRate']")
	public static WebElement  DonotUseRealTimeRateChkBoxSelected;


	@FindBy(xpath="//input[@id='chkEnableBatchNumbers']")
	public static WebElement  EnableBatchesNoChkBoxSelected;

	@FindBy(xpath="//*[@id='dvInvBatchNo']/div/label/span")
	public static WebElement  EnableBatchesNoChkBox;

	@FindBy(xpath="//*[@id='dvChk']/div/label[1]/span")
	public static WebElement  AllowNegativeBatchesQtyChkBox;

	@FindBy(xpath="//input[@id='chkAllowNegativeQuantity']")
	public static WebElement  AllowNegativeBatchesQtyChkBoxSelected;

	@FindBy(xpath="//*[@id='dvChk']/div/label[2]/span")
	public static WebElement  DontAcceptDuplicateBatchesChkBox;

	@FindBy(xpath="//input[@id='chkDontAcceptDupDoc']")
	public static WebElement  DontAcceptDuplicateBatchesChkBoxSelected;

	@FindBy(xpath="//*[@id='dvChk']/div/label[3]/span")
	public static WebElement  ExpiryDatesOfBatchesChkBox;

	@FindBy(xpath="//input[@id='chkExpiryDatesBatches']")
	public static WebElement  ExpiryDatesOfBatchesChkBoxSelected;

	@FindBy(xpath="//*[@id='dvDates']/div/label[1]/span")
	public static WebElement  ExpiryDateOptionalChkBox;

	@FindBy(xpath="//input[@id='chkExpiryDatesOptional']")
	public static WebElement  ExpiryDateOptionalChkBoxSelected;

	@FindBy(xpath="//*[@id='dvDates']/div/label[2]/span")
	public static WebElement  IgnoringDayInExpiryChkBox;

	@FindBy(xpath="//input[@id='chkIgnoreDayInExpiry']")
	public static WebElement  IgnoringDayInExpiryChkBoxSelected;

	@FindBy(xpath="//*[@id='dvDates']/div/label[3]/span")
	public static WebElement  CalculateExpiryDateFromItemChkBox;

	@FindBy(xpath="//input[@id='chkCalculateExpiryDateFromItem']")
	public static WebElement  CalculateExpiryDateFromItemChkBoxSelected;

	@FindBy(xpath="//*[@id='dvDates']/div/div/div[1]/label/span")
	public static WebElement  CantSellBatchesNxtChkBox;

	@FindBy(xpath="//input[@id='chkCantSellBatchesNxt']")
	public static WebElement  CantSellBatchesNxtChkBoxSelected;

	@FindBy(xpath="//*[@id='dvDates']/div/label[4]/span")
	public static WebElement  DontClubBatchesMfDtChkBox;

	@FindBy(xpath="//input[@id='chkDontClubBatchesMfDt']")
	public static WebElement  DontClubBatchesMfDtChkBoxSelected;

	@FindBy(xpath="//*[@id='dvDates']/div/label[5]/span")
	public static WebElement  SortBatchesExpDateChkBox;

	@FindBy(xpath="//input[@id='chkSortBatchesExpDate']")
	public static WebElement  SortBatchesExpDateChkBoxSelected;

	@FindBy(xpath="//*[@id='dvChk']/div/label[4]/span")
	public static WebElement  InputBatchMrpChkBox;

	@FindBy(xpath="//input[@id='chkInputBatchMrp']")
	public static WebElement  InputBatchMrpChkBoxSelected;



	@FindBy(xpath="//*[@id='dvChk']/div/label[5]/span")
	public static WebElement  LoadAllDtlsBatchChkBox;

	@FindBy(xpath="//input[@id='chkLoadAllDtlsBatch']")
	public static WebElement  LoadAllDtlsBatchChkBoxSelected;


	@FindBy(xpath="//*[@id='dvChk']/div/label[8]/span")
	public static WebElement  ManufacturingDateByBatchesChkBox;

	@FindBy(xpath="//input[@id='chkManufacturingDateByBaches']")
	public static WebElement  ManufacturingDateByBatchesChkBoxSelected;

	@FindBy(xpath="//*[@id='dvChk']/div/label[9]/span")
	public static WebElement  SuggestNextBatchNoDocChkBox;

	@FindBy(xpath="//input[@id='chkSuggestNextBatchNoDoc']")
	public static WebElement  SuggestNextBatchNoDocChkBoxSelected;


	@FindBy(xpath="//*[@id='dvChk']/div/label[10]/span")
	public static WebElement  ConsolidateBatchesByBatchNoChkBox;

	@FindBy(xpath="//input[@id='chkConsolidateBatchesByBatchNo']")
	public static WebElement  ConsolidateBatchesByBatchNoChkBoxSelected;

	@FindBy(xpath="//*[@id='dvChk']/div/label[11]/span")
	public static WebElement  HideRatesOptionChkBox;

	@FindBy(xpath="//input[@id='chkHideRatesOption']")
	public static WebElement  HideRatesOptionChkBoxSelected;

	@FindBy(xpath="//*[@id='dvChk']/div/label[12]/span")
	public static WebElement  donotshowbatchesconsumedinsuspendedandpendingdocumentsChkBox;

	@FindBy(xpath="//input[@id='chkDonotshowbatchesconsumedinsuspendedandpendingdocuments']")
	public static WebElement  donotshowbatchesconsumedinsuspendedandpendingdocumentsChkBoxSelected;

	@FindBy(xpath="//input[@id='txtValue1']")
	public static WebElement  InputBatch_Value1Txt;

	@FindBy(xpath="//input[@id='txtValue2']")
	public static WebElement  InputBatch_Value2Txt;

	@FindBy(xpath="//input[@id='txtNoofbatch']")
	public static WebElement  CantSellBatches_Txt;

	@FindBy(xpath="//select[@id='cmbBatchExpire']")
	public static WebElement  CantSellBatches_Dropdown;



	@FindBy(xpath="//*[@id='dvRMASupports']/div/label/span")
	public static WebElement  RmaSupportChkBox;

	@FindBy(xpath="//input[@id='chkRMASupport']")
	public static WebElement  RmaSupportChkBoxSelected;

	@FindBy(xpath="//*[@id='dvRMASupportGroup']/div/label[1]/span")
	public static WebElement  RMAbasedalternateQuantityChkBox;

	@FindBy(xpath="//input[@id='chkRMAbasedalternateQuantity']")
	public static WebElement  RMAbasedalternateQuantityChkBoxSelected;

	@FindBy(xpath="//*[@id='dvRMASupportGroup']/div/label[2]/span")
	public static WebElement  RMANumberAlwaysnumericChkBox;

	@FindBy(xpath="//input[@id='chkRMANumberAlwaysnumeric']")
	public static WebElement  RMANumberAlwaysnumericChkBoxSelected;

	@FindBy(xpath="//*[@id='dvRMASupportGroup']/div/label[3]/span")
	public static WebElement  RMANumberUniqueAcrossAllItemsChkBox;

	@FindBy(xpath="//input[@id='chkRMANumberUniqueAcrossAllItems']")
	public static WebElement  RMANumberUniqueAcrossAllItemsChkBoxSelected;

	@FindBy(xpath="//*[@id='dvRMASupportGroup']/div/label[4]/span")
	public static WebElement  InputRMANoChkBox;

	@FindBy(xpath="//input[@id='chkInputRMANo']")
	public static WebElement  InputRMANoChkBoxSelected;

	@FindBy(xpath="//*[@id='dvRMASupportGroup']/div/label[5]/span")
	public static WebElement  RMANumberCantBeUsedChkBox;

	@FindBy(xpath="//input[@id='chkRMANumberCantBeUsed']")
	public static WebElement  RMANumberCantBeUsedChkBoxSelected;

	@FindBy(xpath="//*[@id='dvRMASupportGroup']/div/label[6]/span")
	public static WebElement  PrefixVoucherNoChkBox;

	@FindBy(xpath="//input[@id='PrefixVoucherNo']")
	public static WebElement  PrefixVoucherNoChkBoxSelected;


	@FindBy(xpath = "//select[@id='cmbTag']")
	public static WebElement QATagToUSeDrpdwn;

	@FindBy(xpath = "//*[@id='dvSalesQuotation']/label/span")
	public static WebElement QASalesQuatationsChkBox;

	@FindBy(xpath = "//*[@id='dvSalesQuotation']/label/input")
	public static WebElement QASalesQuatationsChkBoxSelected;

	@FindBy(xpath = "//*[@id='dvPurchaseQuotation']/label/span")
	public static WebElement QAPurchaseQuatationsChkbox;

	@FindBy(xpath = "//*[@id='dvPurchaseQuotation']/label/input")
	public static WebElement QAPurchaseQuatationsChkboxSelected;

	@FindBy(xpath = "//input[@id='txtMinQuot1']")
	public static WebElement QAMinmumNoOFQutationsTXtR1;

	@FindBy(xpath = "//input[@id='txtValueIsLess']")
	public static WebElement QAWhenValueLessThanTxt;

	@FindBy(xpath = "//input[@id='txtMinQuot2']")
	public static WebElement QAMinmumNoOFQutationsTXtR2;

	@FindBy(xpath = "//input[@id='txtValueIsGreat']")
	public static WebElement QAWhenValueGreaterThanTxt;

	@FindBy(xpath = "//*[@id='dvQuotationAnalysis']/div/label/span")
	public static WebElement QADataHistoryChkBox;

	@FindBy(xpath = "//*[@id='dvQuotationAnalysis']/div/label/input")
	public static WebElement QADataHistoryChkBoxSelected;

	@FindBy(xpath = "//input[@id='RadioCurrencyIn_0']")
	public static WebElement QABaseCurrencyRadioBtn;

	@FindBy(xpath = "//input[@id='RadioCurrencyIn_1']")
	public static WebElement QATransCurrencyRadioBtn;

	@FindBy(xpath = "//*[@id='dvRFID']/div/div[2]/div/label[1]/span")
	public static WebElement RFIDProductIDChkbox;

	@FindBy(xpath = "//input[@id='ProductId']")
	public static WebElement RFIDProductIDChkboxSelected;

	@FindBy(xpath = "//*[@id='dvRFID']/div/div[2]/div/label[2]/span")
	public static WebElement RFIDQuantityChkbox;

	@FindBy(xpath = "//input[@id='Quantity']")
	public static WebElement RFIDQuantityChkboxSelected;

	@FindBy(xpath = "//*[@id='dvRFID']/div/div[2]/div/label[3]/span")
	public static WebElement RFIDAlternativeQTYChkbox;

	@FindBy(xpath = "//input[@id='QualityControl']")
	public static WebElement RFIDAlternativeQTYChkboxSelected;

	@FindBy(xpath = "//*[@id='dvRFID']/div/div[2]/div/label[4]/span")
	public static WebElement RFIDUnitsChkbox;

	@FindBy(xpath = "//input[@id='Units']")
	public static WebElement RFIDUnitsChkboxSelected;

	@FindBy(xpath = "//*[@id='dvRFID']/div/div[2]/div/label[5]/span")
	public static WebElement RFIDBatchChkbox;

	@FindBy(xpath = "//input[@id='Batch']")
	public static WebElement RFIDBatchChkboxSelected;

	@FindBy(xpath = "//*[@id='dvRFID']/div/div[2]/div/label[6]/span")
	public static WebElement RFIDRMAChkbox;

	@FindBy(xpath = "//input[@id='RMA']")
	public static WebElement RFIDRMAChkboxSelected;





	@FindBy(xpath="//select[@id='SMTPSettings']")
	public static WebElement SMTPSettingsDropdown;

	@FindBy(xpath="//input[@id='SMTPAddress']")
	public static WebElement SMTPAddressTxt;

	@FindBy(xpath="//input[@id='OutgoingPortNo']")
	public static WebElement OutgoingPortNoTxt;

	@FindBy(xpath="//select[@id='AutenticationType']")
	public static WebElement AuthenticationTypeDropdown;

	@FindBy(xpath="//*[@id='dvUserSecureConnection']/span")
	public static WebElement UserSecureConnectionChkBox;

	@FindBy(xpath="//*[@id='dvUserSecureConnection']/input")
	public static WebElement UserSecureConnectionChkBoxSelected;

	@FindBy(xpath="//input[@id='SecureConnection_0']")
	public static WebElement NeverRadio;

	@FindBy(xpath="//input[@id='SecureConnection_1']")
	public static WebElement TLSRadio;

	@FindBy(xpath="//input[@id='SecureConnection_2']")
	public static WebElement SSLRadio;

	@FindBy(xpath="//input[@id='SSLSocketPort']")
	public static WebElement SSLPortTxt;

	@FindBy(xpath="//*[@id='dvSMTPSettingVal_0']/div/label[1]/span")
	public static WebElement SecurePasswordAutenticationChkBox;

	@FindBy(xpath="//*[@id='dvSMTPSettingVal_0']/div/label[1]/input")
	public static WebElement SecurePasswordAutenticationChkBoxSelected;

	@FindBy(xpath="//*[@id='dvSMTPSettingVal_0']/div/label[2]/span")
	public static WebElement FullEmailIdChkBox;

	@FindBy(xpath="//*[@id='dvSMTPSettingVal_0']/div/label[2]/input")
	public static WebElement FullEmailIdChkBoxSelected;

	@FindBy(xpath="//*[@id='dvSMTPSettingVal_0']/div/label[3]/span")
	public static WebElement MailServerRequiresAuthenticationChkBox;

	@FindBy(xpath="//input[@id='MailServerRequiresAuthentication']")
	public static WebElement MailServerRequiresAuthenticationChkBoxSelected;

	@FindBy(xpath="//input[@id='EmailId']")
	public static WebElement EmailIdTxt;

	@FindBy(xpath="//input[@id='Password']")
	public static WebElement PasswordTxt;


	//External modules 	

	@FindBy(xpath="//select[@id='cmbOnEvent_VT_0_4']")
	public static WebElement extMOD_OnEventDrpdwn;

	@FindBy(xpath="//select[@id='cmbModuleType_VT_0_4']")
	public static WebElement extMOD_ModuleTypeDrpdwn;

	@FindBy(xpath="//select[@id='cmbClassname_VT_0_4']")
	public static WebElement extMOD_CLassNameDrpdwn;

	@FindBy(xpath="//input[@id='txtModuleName_VT_0_4']")
	public static WebElement extMOD_ModuleNAmeTXt;

	@FindBy(xpath="//select[@id='cmbFunctionName_VT_0_4']")
	public static WebElement extMOD_FunctionNAmeDrpdwn;

	@FindBy(xpath="//input[@id='btnInsert_VT_0_4']")
	public static WebElement extMOD_InsertBtn;

	@FindBy(xpath="//input[@id='btnRemove_VT_0_4']")
	public static WebElement extMOD_RemoveBtn;

	@FindBy(xpath="//*[@id='id_ExtModuleTable']/thead/tr/th")
	public static List<WebElement> extMOD_BodyGridList;



	@FindBy(xpath="//*[@id='dvInfo']/div/div/label")
	public static List<WebElement> infoList;



	@FindBy(xpath = "//*[@id='dvProduction']/div/label[1]/span")
	public static WebElement productionRaiseIssueAndReceiptVoucherChkbox;

	@FindBy(xpath = "//*[@id='dvProduction']/div/label[1]/input")
	public static WebElement productionRaiseIssueAndReceiptVoucherChkboxSelected;

	@FindBy(xpath = "//*[@id='dvProduction']/div/label[2]/span")
	public static WebElement productionRaiseProductionorderonPIRChkbox;

	@FindBy(xpath = "//input[@id='RaiseProductionorderonPIR']")
	public static WebElement productionRaiseProductionorderonPIRChkboxSelected;

	@FindBy(xpath = "//*[@id='dvProduction']/div/label[3]/span")
	public static WebElement productionRaiseIssuetoproductionandReceiptChkbox;

	@FindBy(xpath = "//input[@id='RaiseIssuetoproductionandReceiptfromproductionvouchersonsale']")
	public static WebElement productionRaiseIssuetoproductionandReceiptChkboxSelected;

	@FindBy(xpath = "//*[@id='dvProduction']/div/label[4]/span")
	public static WebElement productionPrefixVoucherNoWhileRaisingQCRequisitionChkbox;


	@FindBy(xpath = "//input[@id='PrefixVoucherNoWhileRaisingQCRequisition']")
	public static WebElement productionPrefixVoucherNoWhileRaisingQCRequisitionChkboxSelected;



	@FindBy(xpath = "//input[@id='optProcurementVoucher']")
	public static WebElement mrpProcurementVoucherDrpdwn;

	@FindBy(xpath = "//input[@id='optProcurementIncharge']")
	public static WebElement mrpProcurementInchargeDrpdwn;

	@FindBy(xpath = "//input[@id='optProductionIncharge']")
	public static WebElement mrpProductionInchargeDrpdwn;

	@FindBy(xpath = "//select[@id='cmbMRPType']")
	public static WebElement mrp_MRPDrpdwn;

	@FindBy(xpath = "//input[@id='optPurchasePlanningVoucher']")
	public static WebElement mrpPurchasePlanningVoucherDrpdwn;

	@FindBy(xpath = "//input[@id='optRaiseMaterialrequestonRelease']")
	public static WebElement mrpRaiseMaterialrequestonReleaseDrpdwn;

	@FindBy(xpath = "//*[@id='BOMTagContent']/div/div[3]/label[2]/span")
	public static WebElement mrpAskForVendorWhileRaisingPurchaseVoucherChkbox;

	@FindBy(xpath = "//input[@id='AskForVendorWhileRaisingPurchaseVoucher']")
	public static WebElement mrpAskForVendorWhileRaisingPurchaseVoucherChkboxSelected;

	@FindBy(xpath = "//*[@id='BOMTagContent']/div/div[3]/label[3]/span")
	public static WebElement mrpDontAllowToDoMROIfStockIsAvailableChkbox;

	@FindBy(xpath = "//input[@id='DontAllowToDoMROIfStockIsAvailable']")
	public static WebElement mrpDontAllowToDoMROIfStockIsAvailableChkboxSelected;

	@FindBy(xpath = "//*[@id='BOMTagContent']/div/div[3]/label[4]/span")
	public static WebElement mrpDontAllowToIssueMoreThanPlannedQuantityChkbox;

	@FindBy(xpath = "//input[@id='DontAllowToIssueMoreThanPlannedQuantity']")
	public static WebElement mrpDontAllowToIssueMoreThanPlannedQuantityChkboxSelected;

	@FindBy(xpath = "//*[@id='BOMTagContent']/div/div[3]/label[5]/span")
	public static WebElement mrpDontAllowToReceiveMoreQuantityThanRequiredChkbox;

	@FindBy(xpath = "//input[@id='DontAllowToReceiveMoreQuantityThanRequired']")
	public static WebElement mrpDontAllowToReceiveMoreQuantityThanRequiredChkboxSelected;

	@FindBy(xpath = "//*[@id='BOMTagContent']/div/div[3]/label[6]/span")
	public static WebElement mrpTrackBasedOnOrderChkbox;

	@FindBy(xpath = "//input[@id='TrackBasedOnOrder']")
	public static WebElement mrpTrackBasedOnOrderChkboxSelected;

	@FindBy(xpath = "//*[@id='BOMTagContent']/div/div[3]/label[7]/span")
	public static WebElement mrpAllowUserToIssuesAndReceiptProcessWiseChkbox;

	@FindBy(xpath = "//input[@id='AllowUserToIssuesAndReceiptProcessWise']")
	public static WebElement mrpAllowUserToIssuesAndReceiptProcessWiseChkboxSelected;

	@FindBy(xpath = "//*[@id='BOMTagContent']/div/div[3]/label[8]/span")
	public static WebElement mrpRestrictReleasePOBasedOnProductionHierarchyChkbox;

	@FindBy(xpath = "//input[@id='RestrictReleasePOBasedOnProductionHierarchy']")
	public static WebElement mrpRestrictReleasePOBasedOnProductionHierarchyChkboxSelected;

	@FindBy(xpath = "//*[@id='BOMTagContent']/div/div[3]/label[9]/span")
	public static WebElement mrpAllowToChangeCostingPeratReceiptFromProductionChkbox;

	@FindBy(xpath = "//input[@id='AllowToChangeCostingPeratReceiptFromProduction']")
	public static WebElement mrpAllowToChangeCostingPeratReceiptFromProductionChkboxSelected;

	@FindBy(xpath = "//*[@id='BOMTagContent']/div/div[3]/label[10]/span")
	public static WebElement mrpAllowtoissuepartialquantityinIssuestoproductionChkbox;

	@FindBy(xpath = "//input[@id='AllowtoissuepartialquantityinIssuestoproduction']")
	public static WebElement mrpAllowtoissuepartialquantityinIssuestoproductionChkboxSelected;

	@FindBy(xpath = "//*[@id='BOMTagContent']/div/div[3]/label[11]/span")
	public static WebElement mrpDoNotAllowToReleasePOIfStockNotavailableChkbox;

	@FindBy(xpath = "//input[@id='chkDoNotAllowToReleasePOIfStockNotavailable']")
	public static WebElement mrpDoNotAllowToReleasePOIfStockNotavailableChkboxSelected;

	@FindBy(xpath = "//*[@id='BOMTagContent']/div/div[3]/label[12]/span")
	public static WebElement mrpDisplayBothBOMQuantityandAlternateQuantityinPlanningChkbox;

	@FindBy(xpath = "//input[@id='chkDisplayBothBOMQuantityandAlternateQuantityinPlanning']")
	public static WebElement mrpDisplayBothBOMQuantityandAlternateQuantityinPlanningChkboxSelected;

	@FindBy(xpath = "//*[@id='BOMTagContent']/div/div[3]/label[13]/span")
	public static WebElement mrpPlanningBasedonAlternateQuantityChkbox;

	@FindBy(xpath = "//input[@id='chkPlanningBasedonAlternateQuantity']")
	public static WebElement mrpPlanningBasedonAlternateQuantityChkboxSelected;

	@FindBy(xpath = "//*[@id='BOMTagContent']/div/div[3]/label[16]/span")
	public static WebElement mrpCalculateAlternateQuantityBasedonChkbox;

	@FindBy(xpath = "//input[@id='chkCalculateAlternateQuantityBasedon']")
	public static WebElement mrpCalculateAlternateQuantityBasedonChkboxSelected;


	@FindBy(xpath = "//select[@id='cmbTagQC']")
	public static WebElement QualityControl_QualityControlDrpdwn;

	@FindBy(xpath = "//input[@id='optQCStockTransferVoucher']")
	public static WebElement QualityControl_QCStockTransferVoucherDrpdwn;



	@FindBy(xpath="//*[@id='Main']/button")
	public static WebElement vatMainExpandBtn;

	@FindBy(xpath="//*[@id='VAT']/button")
	public static WebElement VatExpandBtn;

	@FindBy(xpath="//*[@id='TaxablePersonDetails']/button")
	public static WebElement vatTaxablePersonDetailsExpandBtn;


	@FindBy(xpath="//input[@id='ocBranchSales0']")
	public static WebElement VATBranchSalesTxt;

	@FindBy(xpath="//input[@id='ocVATAdvancePurAC27']")
	public static WebElement VATAdvancePurchaseACTxt;

	@FindBy(xpath="//input[@id='ocCapitalPuchase1']")
	public static WebElement VATCapitalPurchasesACTxt;

	@FindBy(xpath="//input[@id='ocSatSales15']")
	public static WebElement VATSatSalesTxt;

	@FindBy(xpath="//input[@id='ocCashAc2']")
	public static WebElement VATCashAccountTxt;

	@FindBy(xpath="//input[@id='ocServicTaXAc16']")
	public static WebElement VATServiceTaxACTxt;

	@FindBy(xpath="//input[@id='ocConsignmentPur3']")
	public static WebElement VATConsignmentPurchaseACTxt;

	@FindBy(xpath="//input[@id='ocConsignSalesAC4']")
	public static WebElement VATConsignmentSalesACTxt;

	@FindBy(xpath="//input[@id='txtFormType']")
	public static WebElement VATFormTypeTxt;

	@FindBy(xpath="//input[@id='txtDocumentLocator']")
	public static WebElement VATDocumentLocationTxt;

	@FindBy(xpath="//input[@id='txtTaxFormFilingType']")
	public static WebElement VATTaxFormFilingTypeTxt;

	@FindBy(xpath="//input[@id='ocInterStateSales5']")
	public static WebElement VATInterStateSalesACTxt;

	@FindBy(xpath="//input[@id='ocSalestoDealer6']")
	public static WebElement VATSalesToDealerTxt;

	@FindBy(xpath="//input[@id='ocExportSales7']")
	public static WebElement VATExportSalesACTxt;

	@FindBy(xpath="//input[@id='txtTRN']")
	public static WebElement VATTRNTxt;

	@FindBy(xpath="//input[@id='txtTaxablePersonNameE']")
	public static WebElement VATTaxablePersonNameEngTxt;

	@FindBy(xpath="//input[@id='txtTaxablePersonNameA']")
	public static WebElement VATTaxablePersonNameArbTxt;

	@FindBy(xpath="//input[@id='txtTaxPersonAddress']")
	public static WebElement VATTaxablePersonAddressTxt;

	@FindBy(xpath="//input[@id='txtTaxAgencyName']")
	public static WebElement VATTaxAgencyNameTxt;

	@FindBy(xpath="//input[@id='txtTAN']")
	public static WebElement VATTANTxt;

	@FindBy(xpath="//input[@id='txtTaxAgentName']")
	public static WebElement VATTaxAgentNameTxt;

	@FindBy(xpath="//input[@id='txtTAAN']")
	public static WebElement VATTAANameTxt;

	@FindBy(xpath="//input[@id='ocFuel8']")
	public static WebElement VATFuelACTxt;

	@FindBy(xpath="//input[@id='ocSalestoEOU9']")
	public static WebElement VATSalesToEOUTxt;

	@FindBy(xpath="//input[@id='ocInterStatePUR10']")
	public static WebElement VATInterStatePurchasesACTxt;

	@FindBy(xpath="//input[@id='ocVatoutput11']")
	public static WebElement VATOutputTxt;

	@FindBy(xpath="//input[@id='ocVatAc12']")
	public static WebElement VATInputTxt;

	@FindBy(xpath="//input[@id='ocSatAC13']")
	public static WebElement VATSATACTxt;

	@FindBy(xpath="//input[@id='ocSatPur14']")
	public static WebElement VATSatPurchasesTxt;

	@FindBy(xpath="//input[@id='ocVATAdvanceAC26']")
	public static WebElement VATAdvanceAccountTxt;

	@FindBy(xpath="//input[@id='chkEnableMultiEntity']")
	public static WebElement VATEnableMultiEntryChkBox;

	@FindBy(xpath="//tbody[@id='gVATPercentage_body']")
	public static WebElement VATPercentageTable;


	@FindBy(xpath="//*[@id='btnMasterSaveClick'][2]")
	public static WebElement vatCreationPageSaveBtn;



	//PreferencesTest


	// Security Test

	//Home Menu Security Menu
	@FindBy(xpath="//*[@id='6']")
	public static WebElement securityMenu; 

	//Home Menu Password Policy Menu
	@FindBy(xpath="//span[contains(text(),'Password policy')]")
	public static WebElement  homeSecurityPasswordPolicyMenu;  

	@FindBy(xpath="//a[@id='11']/span")
	public static WebElement createUserMenu;



	//Password Policy sendMailOnFailure
	@FindBy (xpath="//*[@id='sendEmailId']")
	public static WebElement sendEmailId;

	//Password Policy sendMailOnFailure
	@FindBy (xpath="//*[@id='sendemailonloginsuccessId']")
	public static WebElement sendEmailOnLoginSuccess;

	//Password Policy sendMailOnFailure
	@FindBy (xpath="//*[@id='SendemailonloginfailureId']")
	public static WebElement sendEmailOnLoginFailure;

	@FindBy(xpath="//*[@id='PolicyListDiv']/li")
	public static List<WebElement> passwordList;

	@FindBy (xpath="//a[@id='9']/span[contains(text(),'Create Profile')]")
	public static WebElement createProfile;

	@FindBy(xpath="//input[@id='profileName']")
	public static WebElement  createProfileProfileNameCombo; 

	@FindBy(xpath="//*[@id='Profilemenu']/li/a/span")
	public static List<WebElement> profileMenuPanelList;

	@FindBy(xpath="//a[@id='btnLoadForm']/i")
	public static WebElement createProfileLoadFromIcon;

	@FindBy(xpath="//ul[@id='ProfileloadFromDiv']/li/span")
	public static List<WebElement> createProfileLoadFromPopupProfilesList;

	@FindBy(xpath="//div[@id='LoadProfile']//button[text()='Ok']")
	public static WebElement loadPopupOkBtn;

	@FindBy(xpath="//div[@id='LoadProfile']//button[text()='Cancel']")
	public static WebElement loadPopupCancelBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[2]/a/span")
	public static WebElement  createProfileFinancalsExpandBtn; 

	@FindBy(xpath="//ul[@id='Profilemenu']/li[2]/ul/li[1]/a/span")
	public static WebElement financialsTransactionsExpandBtn;

	@FindBy(xpath="//*[@id='Profilemenu']/li[2]/ul/li[1]/ul/li/a/span")
	public static List<WebElement> financialsTransactionsList;

	@FindBy(xpath="//li[@class='treeview']//a[@id='2001']//span[contains(text(),'Cash and Bank')]")
	public static WebElement financialsTransactionsCashAndBank;

	@FindBy(xpath="//li[@class='active']//a[@id='2007']//span[contains(text(),'Purchases')]")
	public static WebElement financialsTransactionsPurchases;

	

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Journals')]")
	public static WebElement financialsTransactionsJournals;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Auto Postings')]")
	public static WebElement financialsTransactionsAutoPostings;



	@FindBy(xpath="//*[@id='Profilemenu']/li[2]/ul/li[1]/ul/li[3]/a/span")
	public static WebElement financialsTransactionsSalesExpandBtn;

	@FindBy(xpath="//*[@id='Profilemenu']/li[2]/ul/li[1]/ul/li[3]/ul/li/a/span")
	public static List<WebElement> financialsTransactionsSalesOptionsList;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Sales Invoices')]")
	public static WebElement financialsTransactionsSalesInvoiceOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Sales Returns')]")
	public static WebElement financialsTransactionsSalesReturnsOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Auto Sales Invoice')]")
	public static WebElement financialsTransactionsAutoSalesInvoiceOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Sales Invoice N')]")
	public static WebElement financialsTransactionsSalesInvoiceNOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Cash Sales')]")
	public static WebElement financialsTransactionsCashSalesOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Hire-Purchase Sales')]")
	public static WebElement financialsTransactionsHirePurchaseSalesOption;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[2]/ul/li[1]/ul/li[2]/a/span")
	public static WebElement financialsTransactionsPurchasesExpandBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[2]/ul/li[1]/ul/li[2]/ul/li[1]/a/span")
	public static WebElement financialsTransactionsPurchasesVoucherOption;



	@FindBy(xpath="//ul[@id='Profilemenu']/li[2]/ul/li[2]/a/span")
	public static WebElement financialsCreditManagementExpandBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[2]/ul/li[3]/a/span")
	public static WebElement finincalsReportsExpandBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[2]/ul/li[4]/a/span")
	public static WebElement finalAccountsExpandBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[2]/ul/li[5]/a/span")
	public static WebElement financialsReceivableandPayableAnalysisExpandBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[2]/ul/li[6]/a/span")
	public static WebElement financialsBudgetExpandBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[2]/ul/li[7]/a/span")
	public static WebElement financialsOnlinePaymentsExpandBtn;

	@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
	public static WebElement faAccessChkbox;

	@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
	public static WebElement faAddchkbox;

	@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
	public static WebElement faEditChkBox;

	@FindBy(xpath="//li[4]//div[1]//label[1]//input[1]")
	public static WebElement faDeleteChkbox;

	@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
	public static WebElement faSaveChkbox;

	@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
	public static WebElement faPOstDepreciationChkbox;

	@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
	public static WebElement faMultipleAssetUsageDeleteChkbox;

	@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
	public static WebElement faMultipleusageAssetSaveChkbox;

	@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
	public static WebElement searchChkbox;

	@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
	public static WebElement printChkbox;

	@FindBy(xpath="//li[4]//div[1]//label[1]//input[1]")
	public static WebElement viewChkbox;

	@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
	public static WebElement exportChkbox;

	@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
	public static WebElement emailReportChkbox;

	@FindBy(xpath="//li[7]//div[1]//label[1]//input[1]")
	public static WebElement editPrintlayoutChkbox;

	@FindBy(xpath="//li[8]//div[1]//label[1]//input[1]")
	public static WebElement viewCustomizeLayoutChkbox;

	@FindBy(xpath="//li[9]//div[1]//label[1]//input[1]")
	public static WebElement addCustomizeLAyoutChkbox;

	@FindBy(xpath="//li[10]//div[1]//label[1]//input[1]")
	public static WebElement BackTrackChkbox;

	@FindBy(xpath="//li[11]//div[1]//label[1]//input[1]")
	public static WebElement emailChkbox;

	@FindBy(xpath="//li[12]//div[1]//label[1]//input[1]")
	public static WebElement viewGraphChkbox;

	@FindBy(xpath="//li[13]//div[1]//label[1]//input[1]")
	public static WebElement filterChkbox;

	@FindBy(xpath="//li[14]//div[1]//label[1]//input[1]")
	public static WebElement analyzeChkbox;

	@FindBy(xpath="//li[15]//div[1]//label[1]//input[1]")
	public static WebElement crossReferenceChkbox;

	@FindBy(xpath="//li[16]//div[1]//label[1]//input[1]")
	public static WebElement AddAnalyzeReportChkbox;

	@FindBy(xpath="//*[@id='restrictionsDiv']/li/div/label/input")
	public static List<WebElement> restrictionTabChkBoxList;

	@FindBy(xpath="//*[@id='restrictionsDiv']/li/div/label/span")
	public static List<WebElement> restrictionTabChkBoxNameList;

	@FindBy(xpath="//tbody[@id='profileName_table_body']/tr/td[2]")
	public static List<WebElement> createProfileProfileNameList;

	@FindBy(xpath="//span[contains(text(),'Create Role')]")
	public static WebElement  homeSecurityCreateRoleMenu;

	@FindBy(xpath="//input[@id='roleName']")
	public static WebElement createRoleRoleNameCombo; 

	@FindBy(xpath="//tbody[@id='roleName_table_body']/tr/td[2]")
	public static List<WebElement> createRoleRoleNameComboList;

	@FindBy(xpath="//span[2]//span[1]")
	public static WebElement  createRoleMOveFiledsFronLeftSideToRightSide; 


	@FindBy(xpath="//*[contains(text(),'All Profile')]")
	public static WebElement avaliableAllProfile ;

	@FindBy(xpath="//*[contains(text(),'All Profile ST')]")
	public static WebElement avaliableAllProfileSt ;

	@FindBy(xpath="//*[contains(text(),'Purchase Profile')]")
	public static WebElement avaliableProfilePurchaseProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesOrderProfile')]")
	public static WebElement avaliableProfileSalesOrderProfile ;

	@FindBy(xpath="//*[contains(text(),'SaleAccessProfile')]")
	public static WebElement avaliableProfileSaleAccessProfile ;

	@FindBy(xpath="//*[contains(text(),'SaleAddProfile')]")
	public static WebElement avaliableProfileSaleAddProfile ;

	@FindBy(xpath="//*[contains(text(),'SaleEditProfile')]")
	public static WebElement avaliableProfileSaleEditProfile ;

	@FindBy(xpath="//*[contains(text(),'SaleDeleteProfile')]")
	public static WebElement avaliableProfileSaleDeleteProfile ;

	@FindBy(xpath="//*[contains(text(),'SalePrintProfile')]")
	public static WebElement avaliableProfileSalePrintProfile ;

	@FindBy(xpath="//*[contains(text(),'SaleRePrintProfile')]")
	public static WebElement avaliableProfileSaleRePrintProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesPrintUnAuthorizeProfile')]")
	public static WebElement avaliableProfileSalesPrintUnAuthorizeProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesEditMiscProfile')]")
	public static WebElement avaliableProfileSalesEditMiscProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesAlwaysSuspendingProfile')]")
	public static WebElement avaliableProfileSalesAlwaysSuspendingProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesChangePrintLayoutProfile')]")
	public static WebElement avaliableProfileSalesChangePrintLayoutProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesAuthorizeProfile')]")
	public static WebElement avaliableProfileSalesAuthorizeProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesRejectProfile')]")
	public static WebElement avaliableProfileSalesRejectProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesHomePageProfile')]")
	public static WebElement avaliableProfileSalesHomePageProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesStopProfile')]")
	public static WebElement avaliableProfileSalesStopProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesModifySettingsProfile')]")
	public static WebElement avaliableProfileSalesModifySettingsProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesViewDocumentsEnterByOther')]")
	public static WebElement avaliableProfileSalesViewDocumentsEnterByOther ;

	@FindBy(xpath="//*[contains(text(),'SalesCloseLinkProfile')]")
	public static WebElement avaliableProfileSalesCloseLinkProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesSaveRevisionProfile')]")
	public static WebElement avaliableProfileSalesSaveRevisionProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesSuspendProfile')]")
	public static WebElement avaliableProfileSalesSuspendProfile ;

	@FindBy(xpath="//*[contains(text(),'EditExportedSyncDocProfile')]")
	public static WebElement avaliableProfileEditExportedSyncDocProfile ;

	@FindBy(xpath="//*[contains(text(),'EditImportedSyncDocProfile')]")
	public static WebElement avaliableProfileEditImportedSyncDocProfile ;

	@FindBy(xpath="//*[contains(text(),'SaleHideProfile')]")
	public static WebElement avaliableProfileSaleHideProfile ;

	@FindBy(xpath="//*[contains(text(),'FAReportsAllOptions')]")
	public static WebElement avaliableProfileFAReportsAllOptions ;

	@FindBy(xpath="//*[contains(text(),'LedgerProfile')]")
	public static WebElement avaliableProfileLedgerProfile ;

	@FindBy(xpath="//*[contains(text(),'SLAcessProfile')]")
	public static WebElement avaliableProfileSLAcessProfile ;

	@FindBy(xpath="//*[contains(text(),'SLSearchProfile')]")
	public static WebElement avaliableProfileSLSearchProfile ;

	@FindBy(xpath="//*[contains(text(),'SLPrintProfile')]")
	public static WebElement avaliableProfileSLPrintProfile ;

	@FindBy(xpath="//*[contains(text(),'SLViewProfile')]")
	public static WebElement avaliableProfileSLViewProfile ;

	@FindBy(xpath="//*[contains(text(),'SLExportProfile')]")
	public static WebElement avaliableProfileSLExportProfile ;

	@FindBy(xpath="//*[contains(text(),'SLEmailProfile')]")
	public static WebElement avaliableProfileSLEmailProfile ;

	@FindBy(xpath="//*[contains(text(),'SLViewGraphProfile')]")
	public static WebElement avaliableProfileSLViewGraphProfile ;

	@FindBy(xpath="//*[contains(text(),'SLFilterProfile')]")
	public static WebElement avaliableProfileSLFilterProfile ;

	@FindBy(xpath="//*[contains(text(),'SLAnalyzeProfile')]")
	public static WebElement avaliableProfileSLAnalyzeProfile ;

	@FindBy(xpath="//*[contains(text(),'SLCrossReferenceProfile')]")
	public static WebElement avaliableProfileSLCrossReferenceProfile ;

	@FindBy(xpath="//*[contains(text(),'SLAddAnalyzeProfile')]")
	public static WebElement avaliableProfileSLAddAnalyzeProfile ;

	@FindBy(xpath="//*[contains(text(),'AllMasterProfile')]")
	public static WebElement avaliableProfileAllMasterProfile ;

	@FindBy(xpath="//*[contains(text(),'AllProductProfile')]")
	public static WebElement avaliableProfileAllProductProfile ;

	@FindBy(xpath="//*[contains(text(),'ProfileAddProduct')]")
	public static WebElement avaliableProfileProfileAddProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileEditProduct')]")
	public static WebElement avaliableProfileProfileEditProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileCopyProduct')]")
	public static WebElement avaliableProfileProfileCopyProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileSearchProduct')]")
	public static WebElement avaliableProfileProfileSearchProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileDeleteProduct')]")
	public static WebElement avaliableProfileProfileDeleteProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfilePrintProduct')]")
	public static WebElement avaliableProfileProfilePrintProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileExportProduct')]")
	public static WebElement avaliableProfileProfileExportProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileCustomizeViewProduct')]")
	public static WebElement avaliableProfileProfileCustomizeViewProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileSortProduct')]")
	public static WebElement avaliableProfileProfileSortProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileMassUpdateProduct')]")
	public static WebElement avaliableProfileProfileMassUpdateProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileAuthorizeProduct')]")
	public static WebElement avaliableProfileProfileAuthorizeProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileTransferProduct')]")
	public static WebElement avaliableProfileProfileTransferProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfilePropertiesProduct')]")
	public static WebElement avaliableProfileProfilePropertiesProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileLedgerProduct')]")
	public static WebElement avaliableProfileProfileLedgerProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileBackTrackProduct')]")
	public static WebElement avaliableProfileProfileBackTrackProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileBudgetsProduct')]")
	public static WebElement avaliableProfileProfileBudgetsProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileHelpProduct')]")
	public static WebElement avaliableProfileProfileHelpProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileCreateTreeProduct')]")
	public static WebElement avaliableProfileProfileCreateTreeProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileDeleteTreeProduct')]")
	public static WebElement avaliableProfileProfileDeleteTreeProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileCreateViewProduct')]")
	public static WebElement avaliableProfileProfileCreateViewProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileEditViewProduct')]")
	public static WebElement avaliableProfileProfileEditViewProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileDeleteViewProduct')]")
	public static WebElement avaliableProfileProfileDeleteViewProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileSelectViewProduct')]")
	public static WebElement avaliableProfileProfileSelectViewProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileSelectTreeProduct')]")
	public static WebElement avaliableProfileProfileSelectTreeProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileCloneProduct')]")
	public static WebElement avaliableProfileProfileCloneProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileAddGroupProduct')]")
	public static WebElement avaliableProfileProfileAddGroupProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileGroupMasterProduct')]")
	public static WebElement avaliableProfileProfileGroupMasterProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileSetTypeProduct')]")
	public static WebElement avaliableProfileProfileSetTypeProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileDeleteAllProduct')]")
	public static WebElement avaliableProfileProfileDeleteAllProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileMoveUpProduct')]")
	public static WebElement avaliableProfileProfileMoveUpProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileMoveDownProduct')]")
	public static WebElement avaliableProfileProfileMoveDownProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileCreditManagementProduct')]")
	public static WebElement avaliableProfileProfileCreditManagementProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileDepAppropirationProduct')]")
	public static WebElement avaliableProfileProfileDepAppropirationProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileCustomizeTreeProduct')]")
	public static WebElement avaliableProfileProfileCustomizeTreeProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileCustomizeMasterProduct')]")
	public static WebElement avaliableProfileProfileCustomizeMasterProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileCanChangeGroupProduct')]")
	public static WebElement avaliableProfileProfileCanChangeGroupProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileCanNavigateProduct')]")
	public static WebElement avaliableProfileProfileCanNavigateProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileAddInfoPanelProduct')]")
	public static WebElement avaliableProfileProfileAddInfoPanelProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileEditInfoPanelProduct')]")
	public static WebElement avaliableProfileProfileEditInfoPanelProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileViewInfoPanelProduct')]")
	public static WebElement avaliableProfileProfileViewInfoPanelProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileRejectProduct')]")
	public static WebElement avaliableProfileProfileRejectProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileImportProduct')]")
	public static WebElement avaliableProfileProfileImportProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileShowHomePageProduct')]")
	public static WebElement avaliableProfileProfileShowHomePageProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileDeleteInfoPanelProduct')]")
	public static WebElement avaliableProfileProfileDeleteInfoPanelProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileStopProduct')]")
	public static WebElement avaliableProfileProfileStopProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileSaveRevisionProduct')]")
	public static WebElement avaliableProfileProfileSaveRevisionProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileSetDeafultTreeProduct')]")
	public static WebElement avaliableProfileProfileSetDeafultTreeProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileModifierProduct')]")
	public static WebElement avaliableProfileProfileModifierProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileEditTreeProduct')]")
	public static WebElement avaliableProfileProfileEditTreeProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileGeneralProduct')]")
	public static WebElement avaliableProfileProfileGeneralProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileUnitsProduct')]")
	public static WebElement avaliableProfileProfileUnitsProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileSettingsProduct')]")
	public static WebElement avaliableProfileProfileSettingsProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileClassificationProduct')]")
	public static WebElement avaliableProfileProfileClassificationProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileOtherDetailsProduct')]")
	public static WebElement avaliableProfileProfileOtherDetailsProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileReplenishmentProduct')]")
	public static WebElement avaliableProfileProfileReplenishmentProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileReorderProduct')]")
	public static WebElement avaliableProfileProfileReorderProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileOutletProduct')]")
	public static WebElement avaliableProfileProfileOutletProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileAllAcountsOption')]")
	public static WebElement avaliableProfileProfileAllAcountsOption ;

	@FindBy(xpath="//*[contains(text(),'ProfileAllDepartmentOption')]")
	public static WebElement avaliableProfileProfileAllDepartmentOption ;

	@FindBy(xpath="//*[contains(text(),'ProfileLoadFrom')]")
	public static WebElement avaliableProfileProfileLoadFrom ;

	@FindBy(xpath="//*[@id='profileAdditionbtns']/div[2]/span/span")
	public static WebElement  createRoleMOveFiledsFromLeftSideToRightSide; 

	@FindBy(xpath="//*[@id='profileAdditionbtns']/div[3]/span/span")
	public static WebElement createRoleMOveFiledsFromRigheSideToLeftSide;

	@FindBy(xpath="//ul[@id='assignedProfiles']/li")
	public static List<WebElement> assignedProfileList;


	//Addtions Tab
	@FindBy(xpath="//ul[@id='Addmenu']/li/a/span")
	public static List<WebElement> createRoleAddTabMenuList;

	@FindBy(xpath="//ul[@id='Addmenu']/li[1]/a/span")
	public static WebElement createRoleAddTabHomeMenu;

	@FindBy(xpath="//ul[@id='Addmenu']/li[2]/a/span")
	public static WebElement createRoleAddTabFinancialsMenu;

	@FindBy(xpath="//ul[@id='Addmenu']/li[3]/a/span")
	public static WebElement createRoleAddTabInventoryMenu;

	@FindBy(xpath="//ul[@id='Addmenu']/li[4]/a/span")
	public static WebElement createRoleAddTabFixedAssetsMenu;

	@FindBy(xpath="//ul[@id='Addmenu']/li[5]/a/span")
	public static WebElement createRoleAddTabProductionMenu;

	@FindBy(xpath="//ul[@id='Addmenu']/li[6]/a/span")
	public static WebElement createRoleAddTabPointOfSaleMenu;

	@FindBy(xpath="//ul[@id='Addmenu']/li[7]/a/span")
	public static WebElement createRoleAddTabQualityControlMenu;

	@FindBy(xpath="//ul[@id='Addmenu']/li[8]/a/span")
	public static WebElement createRoleAddTabSettingsMenu;

	@FindBy(xpath="//div[@id='Additions']//div[@id='controlBtns']//span[1]")
	public static WebElement createRoleAddTabSelectAllChkBox;

	@FindBy(xpath="//div[@id='Additions']//div[@id='controlBtns']//span[2]")
	public static WebElement createRoleAddTabUnSelectAllChkBox;


	// Exclusions Tab
	@FindBy(xpath="//ul[@id='Exclmenu']/li/a/span")
	public static List<WebElement> createRoleExclTabMenuList;

	@FindBy(xpath="//ul[@id='Exclmenu']/li[1]/a/span")
	public static WebElement createRoleExclTabHomeMenu;

	@FindBy(xpath="//ul[@id='Exclmenu']/li[2]/a/span")
	public static WebElement createRoleExclTabFinancialsMenu;

	@FindBy(xpath="//ul[@id='Exclmenu']/li[3]/a/span")
	public static WebElement createRoleExclTabInventoryMenu;

	@FindBy(xpath="//ul[@id='Exclmenu']/li[4]/a/span")
	public static WebElement createRoleExclTabFixedAssetsMenu;

	@FindBy(xpath="//ul[@id='Exclmenu']/li[5]/a/span")
	public static WebElement createRoleExclTabProductionMenu;

	@FindBy(xpath="//ul[@id='Exclmenu']/li[6]/a/span")
	public static WebElement createRoleExclTabPointOfSaleMenu;

	@FindBy(xpath="//ul[@id='Exclmenu']/li[7]/a/span")
	public static WebElement createRoleExclTabQualityControlMenu;

	@FindBy(xpath="//ul[@id='Exclmenu']/li[8]/a/span")
	public static WebElement createRoleExclTabSettingsMenu;

	@FindBy(xpath="//div[@id='Exclusions']//div[@id='controlBtns']//span[1]")
	public static WebElement createRoleExclTabSelectAllChkBox;

	@FindBy(xpath="//div[@id='Exclusions']//div[@id='controlBtns']//span[2]")
	public static WebElement createRoleExclTabUnSelectAllChkBox;



	// Restriction for Entry Tab
	@FindBy(xpath="//div[@id='RestrictionEntryMasters']/ul/li")
	public static List<WebElement> createRoleRestrictionForEntryTabMastersList;

	@FindBy(xpath="//input[@id='chkExclusion']")
	public static WebElement createRoleRestrictionForEntryTabExclChkBox;

	@FindBy(xpath="//table[@id='restrictionEntryTable']")
	public static WebElement createRoleRestrictionForEntryTabTable;

	@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[1]/td[2]")
	public static WebElement restrictionForEntryTabTableSelectRow1Col1;

	@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[1]/td[3]//input")
	public static WebElement restrictionForEntryTabRow1EntryChkBox;

	@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[1]/td[4]//input")
	public static WebElement restrictionForEntryTabRow1ReportChkBox;

	@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[1]/td[5]//input")
	public static WebElement restrictionForEntryTabRow1ViewChkBox;


	@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[2]/td[2]")
	public static WebElement restrictionForEntryTabTableSelectRow2Col1;

	@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[2]/td[3]//input")
	public static WebElement restrictionForEntryTabRow2EntryChkBox;

	@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[2]/td[4]//input")
	public static WebElement restrictionForEntryTabRow2ReportChkBox;

	@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[2]/td[5]//input")
	public static WebElement restrictionForEntryTabRow2ViewChkBox;


	@FindBy(xpath="//input[@id='MasteroptionControl']")
	public static WebElement restrictionForEntryTabTableEnterMasterTxt;

	@FindBy(xpath="//tbody[@id='MasteroptionControl_table_body']/tr/td[2]")
	public static List<WebElement> restrictionForEntryTabTableMasterComboList;




	@FindBy(xpath="//div[@class='Fcheckbox']/label/input[@name='Alwayssuspendonsaving']")
	public static WebElement CRAddAlwaysSuspendOnSavingChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']/label/input[@name='HideMenu']")
	public static WebElement CRAddHideMenuChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']/label/input[@name='Deletedocumentscreatedbyothers']")
	public static WebElement CRAddDeleteDocumentsCreatedByOthersChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']/label/input[@name='Deleteauthorizeddocuments']")
	public static WebElement CRAddDeleteAuthorizedDocumentsChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']/label/input[@name='EditSuspendedDocuments']")
	public static WebElement CRAddEditSuspendedDocumentsChkBox;

	@FindBy(xpath="//*[@id='Exclmenu']/li[3]/ul/li/a/span")
	public static List<WebElement> exclusionsTabInventoryMenusList;

	@FindBy(xpath="//*[@id='Exclmenu']/li[3]/ul/li[1]/ul/li/a/span")
	public static List<WebElement> exclusionsTabInventoryTransactionsMenusList;

	@FindBy(xpath="//div[@class='Fcheckbox']/label/input[@name='Save']")
	public static WebElement CreateRoleSaveChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']/label/input[@name='Access']")
	public static WebElement CreateRoleAccessChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']/label/input[@name='Edit']")
	public static WebElement CreateRoleEditChkBox;


	@FindBy(xpath="//a[contains(text(),'Restriction for entry')]")
	public static WebElement createRoleRestrictionForEntryTab;

	@FindBy(xpath="//div[@id='RestrictionEntryMasters']//li[@id='1']")
	public static WebElement resOFEntryAccount;

	@FindBy(xpath="//div[@id='RestrictionEntryMasters']//li[@id='2']")
	public static WebElement resOFEntryItem;

	@FindBy(xpath="//div[@id='RestrictionEntryMasters']//li[@id='3']")
	public static WebElement resOFEntryDepartment;

	@FindBy(xpath="//div[@id='RestrictionEntryMasters']//li[@id='4']")
	public static WebElement resOFEntryWarehouse;

	@FindBy(xpath="//input[@id='chkExclusion']")
	public static WebElement resOFEntryExclusionchkBox;

	@FindBy(xpath="//div[contains(text(),'Masters')]")
	public static WebElement  resOFEntryGridMasterColoumn;

	@FindBy(xpath="//table[@id='restrictionEntryTable']")
	public static WebElement  resOFEntryTable;


	@FindBy(xpath="//div[@id='Additions']//label[@class='Flabel font-4'][contains(text(),'Menu')]")
	public static WebElement menuLabel;

	@FindBy(xpath="//li[@class='active']//a[@id='61']//i[@class='icon-expand']")
	public static WebElement  addFinTransationExpandBtn;

	@FindBy(xpath="//li[@class='active']//a[@id='2007']//i[@class='icon-expand']")
	public static WebElement addFinTransationpurchaseExpandBtn;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Purchases Vouchers')]")
	public static WebElement addFinTransPurPurchasesVouchers;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Purchases Returns')]")
	public static WebElement addFinTransPurPurchasesReturns;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Purchase Vouchers N')]")
	public static WebElement addFinTransPurPurchaseVouchersN;

	@FindBy(xpath="//label[contains(text(),'Always suspend on saving')]//input[@id='2008']")
	public static WebElement purAlwaysSuspendChkBox;

	@FindBy(xpath="//label[contains(text(),'Hide Menu')]//input[@id='2008']")
	public static WebElement purHideMenuChkbox;

	@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
	public static WebElement finPurAccessChkbox;

	@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
	public static WebElement finPurAddChkbox;

	@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
	public static WebElement finPurEditChkbox;

	@FindBy(xpath="//label[contains(text(),'Delete')]//input[@id='2008']")
	public static WebElement finPurDeleteChkbox;

	@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
	public static WebElement finPurPrintChkbox;

	@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
	public static WebElement finPurRePrintChkbox;

	@FindBy(xpath="//label[contains(text(),'Print Barcode')]//input[@id='2008']")
	public static WebElement finPurPrintBarcodeChkbox;

	@FindBy(xpath="//label[contains(text(),'Print Un-Authorized documents')]//input[@id='2008']")
	public static WebElement finPurPrintUnAuthorizedDocumentsChkbox;

	@FindBy(xpath="//label[contains(text(),'Export')]//input[@id='2008']")
	public static WebElement finPurExportChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit documents entered by other')]//input[@id='2008']")
	public static WebElement finPurEditDocumentsEnteredbyOtherChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit documents that are checked')]//input[@id='2008']")
	public static WebElement finPurEditDocumentsThatAreCheckedChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit Reconciled documents')]//input[@id='2008']")
	public static WebElement finPurEditReconciledDocumentsChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit documents authorization by higher ups')]//input[@id='2008']")
	public static WebElement finPurEditDocumentsAuthorizationByHigherUpsChkbox;

	@FindBy(xpath="//label[contains(text(),'Enter documents that exceed limit')]//input[@id='2008']")
	public static WebElement finPurEnterDocumentsThatExceedLimitChkbox;

	@FindBy(xpath="//label[contains(text(),'Enter documents that make Cash or Bank Balance Neg')]//input[@id='2008']")
	public static WebElement finPurChkboxEnterDocumentsThatMakeCashorBankBalanceNeg;

	@FindBy(xpath="//label[contains(text(),'Edit documents that are Re-Printed')]//input[@id='2008']")
	public static WebElement finPurEditDocumentsThatAreRePrintedChkbox;

	@FindBy(xpath="//label[contains(text(),'Access through API')]//input[@id='2008']")
	public static WebElement finPurAccessThroughAPIChkbox;

	@FindBy(xpath="//label[contains(text(),'Always suspend on saving')]//input[@id='2008']")
	public static WebElement finPurAlwaysSuspendOnSavingChkbox;

	@FindBy(xpath="//label[contains(text(),'Change print layout')]//input[@id='2008']")
	public static WebElement finPurChangePrintLayoutChkbox;

	@FindBy(xpath="//li[20]//div[1]//label[1]//input[1]")
	public static WebElement finPurAuthorizeChkbox;

	@FindBy(xpath="//label[contains(text(),'Reject')]//input[@id='2008']")
	public static WebElement finPurRejectChkbox;

	@FindBy(xpath="//label[contains(text(),'Show home page')]//input[@id='2008']")
	public static WebElement finPurShowHomepageChkbox;

	@FindBy(xpath="//label[contains(text(),'Stop')]//input[@id='2008']")
	public static WebElement finPurStopChkbox;

	@FindBy(xpath="//label[contains(text(),'Modify Settings')]//input[@id='2008']")
	public static WebElement finPurModifySettingsChkbox;

	@FindBy(xpath="//label[contains(text(),'View document entered by others')]//input[@id='2008']")
	public static WebElement finPurViewDocumentEnteredByOthersChkbox;

	@FindBy(xpath="//label[contains(text(),'Close Links')]//input[@id='2008']")
	public static WebElement finPurCloseLinksChkbox;

	@FindBy(xpath="//label[contains(text(),'Save Revision')]//input[@id='2008']")
	public static WebElement finPurSaveRevisionChkbox;

	@FindBy(xpath="//label[contains(text(),'Show Posting Details')]//input[@id='2008']")
	public static WebElement finPurShowPostingDetailsChkbox;

	@FindBy(xpath="//label[contains(text(),'Suspend')]//input[@id='2008']")
	public static WebElement finPurSuspendChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit exported (Sync) documents')]//input[@id='2008']")
	public static WebElement finPurEditExportedChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit imported (Sync) documents')]//input[@id='2008']")
	public static WebElement finPurEditImportedChkbox;

	@FindBy(xpath="//label[contains(text(),'Hide Menu')]//input[@id='2008']")
	public static WebElement finPurHideMenuChkbox;

	@FindBy(xpath="//label[contains(text(),'Amend')]//input[@id='2008']")
	public static WebElement finPurAmendChkbox;

	@FindBy(xpath="//label[contains(text(),'Customize link')]//input[@id='2008']")
	public static WebElement finPurCustomizeLinkChkbox;

	@FindBy(xpath="//label[contains(text(),'Filter home page')]//input[@id='2008']")
	public static WebElement finPurFilterHomePageChkbox;

	@FindBy(xpath="//label[contains(text(),'Add to stock')]//input[@id='2008']")
	public static WebElement finPurAddToStockChkbox;

	@FindBy(xpath="//label[contains(text(),'Reverse Entry')]//input[@id='2008']")
	public static WebElement finPurReverseEntryChkbox;

	@FindBy(xpath="//label[contains(text(),'Customize info panel')]//input[@id='2008']")
	public static WebElement finPurCustomizeInfoPanelChkbox;

	@FindBy(xpath="//label[contains(text(),'Raise Cheque Return')]//input[@id='2008']")
	public static WebElement finPurRaiseChequeReturnChkbox;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Request for Quote')]")
	public static WebElement addRequestForQuoteOption;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Purchases Quotations')]")
	public static WebElement addPurchaseQuotationOption;

	@FindBy(xpath="//li[@class='active']//a[@id='2012']//span[contains(text(),'Purchases Orders')]")
	public static WebElement addPurchaseorderOption;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Material Receipt Notes')]")
	public static WebElement addMaterialRecepitNotes;

	@FindBy(xpath="(//span[text() = 'Delete'])[1]/i")
	public static WebElement CreateRoleDeleteButtonImage; 



	@FindBy(xpath="//*[@id='createUserBtn']/i")
	public static WebElement createUserIcon;

	@FindBy(xpath="//*[@id='createGroupBtn']/i")
	public static WebElement createUserCreateGroupIcon;

	@FindBy(xpath="//*[@id='navbarSupported3']/ul/li[3]/a/i")
	public static WebElement createUserCancelIcon;

	@FindBy(xpath="//input[@id='loginName']")
	public static WebElement createUserLoginNameTxt;

	@FindBy(xpath="//select[@id='ERPRoles']")
	public static WebElement createUserERPRoleDropDown;

	@FindBy(xpath="//select[@id='passwordPolicy']")
	public static WebElement createUserPasswordPolicyDropdown;

	@FindBy(xpath="//input[@id='password']")
	public static WebElement createUserPasswordTxt;

	@FindBy(xpath="//input[@id='confirmpassword']")
	public static WebElement createUserConfirmPasswordTxt;

	@FindBy(xpath="//input[@id='Username']")
	public static WebElement createUserNameTxt;

	@FindBy(xpath="//input[@id='lginAbbr']")
	public static WebElement createUserLoginAbbrivationTxt;

	@FindBy(xpath="//select[@id='SecurityQues']")
	public static WebElement createUserSecurityQuestionDropDown;

	@FindBy(xpath="//input[@id='SecurityAns']")
	public static WebElement createUserSecurityAnswerTxt;

	@FindBy(xpath="//select[@id='language']")
	public static WebElement createUserLanguageTxt;

	@FindBy(xpath="//select[@id='altLanguage']")
	public static WebElement createUserAlternateLanguageTxt;

	@FindBy(xpath="//i[@class='icon-unlock-user icon-font6']")
	public static WebElement createUserUnlockUserIcon;

	@FindBy(xpath="//i[@class='icon-move-user icon-font6']")
	public static WebElement createUserMoveUserIcon;

	@FindBy(xpath="//i[@class='icon-reset icon-font6']")
	public static WebElement createUserResetIcon;

	@FindBy(xpath="//*[@id='btnLoadFrom']/i")
	public static WebElement createUserLoadFromIcon;	

	@FindBy(xpath="//*[@id='btnSave']/a/i")
	public static WebElement createUserSaveIcon;

	@FindBy(xpath="//*[@id='CancelCreateUser']/i")
	public static WebElement createUserCloseIcon;

	@FindBy(xpath="//input[@id='emailId']")
	public static WebElement createUserEmailTxt;

	@FindBy(xpath="//input[@id='Emailpassword']")
	public static WebElement createUserEmailPasswordTxt;

	@FindBy(xpath="//input[@id='phone']")
	public static WebElement createUserPhoneTxt;

	@FindBy(xpath="//input[@id='mobile']")
	public static WebElement createUserMobileTxt;

	@FindBy(xpath="//input[@id='IsEmailAuthPermission']")
	public static WebElement createUserSetPermissionForEmailAuthorizationChkBox;

	@FindBy(xpath="//select[@id='DominSecurityMping']")
	public static WebElement createUserDomainUserMappingDrpDwn;

	@FindBy(xpath="//input[@id='domainUserName']")
	public static WebElement createUserDomainUserMappingTxt;

	@FindBy(xpath="//input[@id='ipAddr1']")
	public static WebElement createUserUserValuesTxt1;

	@FindBy(xpath="//input[@id='ipAddr2']")
	public static WebElement createUserUserValuesTxt2;

	@FindBy(xpath="//input[@id='ipAddr3']")
	public static WebElement createUserUserValuesTxt3;

	@FindBy(xpath="//input[@id='ipAddr4']")
	public static WebElement createUserUserValuesTxt4;

	@FindBy(xpath="//input[@id='ipAddr5']")
	public static WebElement createUserUserValuesTxt5;

	@FindBy(xpath="//select[@id='typeOfUser']")
	public static WebElement createUserUserTypeDrpDwn;

	@FindBy(xpath="//input[@id='cmbUserTypeMaster']")
	public static WebElement createUserUserTypeCombo;

	@FindBy(xpath="//select[@id='crmRoles']")
	public static WebElement createUserCRMRolesDrpDwn;

	@FindBy(xpath="//input[@id='UserTypeMobile']")
	public static WebElement createUserMobileChkBox;

	@FindBy(xpath="//input[@id='UserTypeOffline']")
	public static WebElement createUserOfflineChkBox;

	@FindBy(xpath="//input[@id='UserTypeWeb']")
	public static WebElement createUserWebChkBox;

	@FindBy(xpath="//select[@id='ERPRoles']/option")
	public static List<WebElement> createUserERPRolesDropdownOptions;

	@FindBy(xpath="//select[@id='passwordPolicy']//option[6]")
	public static WebElement getNumericValue;

	@FindBy(xpath="//select[@id='language']")
	public static WebElement getLanguage;

	@FindBy(xpath="//select[@id='altLanguage']")
	public static WebElement getAltLanguage;

	@FindBy(xpath="//select[@id='language']/option")
	public static List<WebElement> createUserLanguageDropdownList;

	@FindBy(xpath="//select[@id='altLanguage']/option")
	public static List<WebElement> createUserAltLanguageDropdownList;

	@FindBy(xpath="//*[contains(text(),'Additional Info')]")
	public static WebElement createUserAdditionalInfoTab;

	@FindBy(xpath="//div[@id='userAndGroups']/ul/li/ul/li/div/span/span[1]")
	public static List<WebElement> createUserSavedUsersList;

	@FindBy(xpath="//i[@class='icon-delete hiconright2']")
	public static WebElement createUserDeleteIcon;

	@FindBy(xpath="//*[contains(text(),'Restriction for entry')]")
	public static WebElement createUserRestrictionforentryTab;

	@FindBy(xpath="//div[@id='id_login_div']//div[contains(text(),'Invalid Password')]")
	public static WebElement invalidPasswordMsgs;

	@FindBy(xpath="//*[@id='61']/span")
	public static WebElement  financialsTransactionMenu;
	

    @FindBy(xpath="//a[@id='2014']")
	public static WebElement  financialTransactionSalesMenu;
    

	@FindBy(xpath="//a[@id='2007']//span[contains(text(),'Purchases')]")
	public static WebElement  purchasesExpandBtn;

	@FindBy(xpath="//span[contains(text(),'Purchases Vouchers')]")
	public static WebElement  purchaseVouchersBtn;

	@FindBy(xpath="//*[@id='navbarSupportedContent2']/ul/li[1]/a[@id='id_transaction_homescreen_new']")
	public static WebElement newBtn;
	
	
	@FindBy(xpath = "//*[@id='id_reportmenudisplay']/ul/li[9]")
	public static WebElement report_FilterExpandBtn;
	
	@FindBy(xpath="//*[@id='filter_Okbtn_']")
	public static WebElement  report_FilterOkBtn;
	
	@FindBy(xpath="//i[contains(@class,'icon icon-close')]")
	public static WebElement  report_FilterCancelBtn;
	

	@FindBy(xpath="//*[@id='id_header_4']")
	public static WebElement vendorAccountTxt;

	@FindBy(xpath="//*[@id='id_header_4_input_image']/span")
	public static WebElement vendorAccountComboExpand;

	@FindBy(xpath="//*[@id='id_header_4_input_image']/span")
	public static WebElement customerAccountComboExpand;

	@FindBy(xpath="//*[@id='id_header_4_table_body']/tr/td[2]")
	public static List<WebElement> vendorAccountList;

	@FindBy(xpath="//*[@id='id_header_4_table_body']/tr/td[2]")
	public static List<WebElement> customerAccountList;

	@FindBy(xpath="//*[@id='2014']/span")
	public static WebElement salesMenu;

	@FindBy(xpath="//*[@id='2055']/span")
	public static WebElement salesInvoicesVatBtn;

	@FindBy(xpath="//*[@id='81']/span")
	public static WebElement  financialsReportsMenu; 

	@FindBy(xpath="//*[@id='500']/span")
	public static WebElement  ledger;

	@FindBy (xpath="//*[@id='txtsrch-term']")
	public static WebElement accountSearchTextArea;

	@FindBy (xpath="//tbody[@id='LandingGridBody']//td[@class='tdName padding0 ']")
	public static List<WebElement> accountsListInLedger;

	@FindBy(xpath="//select[@id='timezone']")
	public static WebElement userCreationTimeZoneDrpdwn;

	@FindBy(xpath="//th[2]//span[1]")
	public static WebElement masterGrid_Header_SelectTxt;

	@FindBy(xpath="//input[@id='liSelectAllMasters']")
	public static WebElement masterGridHeader_SelectAllRowsCheckBox;

	@FindBy(xpath="//*[@id='landgridData']/thead/tr/th[3]")
	public static WebElement masterGridHeader_MasterId;

	@FindBy(xpath="//*[@id='landgridData']/thead/tr/th[4]")
	public static WebElement masterGridHeader_Name;

	@FindBy(xpath="//td[contains(text(),'ASSETS')]")
	public static WebElement masterAssets;

	@FindBy(xpath="//td[contains(text(),'EXPENSES')]")
	public static WebElement masterExpenses;

	@FindBy(xpath="//td[contains(text(),'CONTROL ACCOUNTS')]")
	public static WebElement masterControlAccounts;

	@FindBy(xpath="//td[contains(text(),'REVENUE')]")
	public static WebElement masterRevenue;

	@FindBy(xpath="//td[contains(text(),'EQUITIES')]")
	public static WebElement masterEquities;

	@FindBy(xpath="//td[contains(text(),'LIABILITIES')]")
	public static WebElement masterLiabilities;


	//Setting Elements 

	//DebitCreditProposal
	@FindBy(xpath="//select[@id='iDebitCreditProposal']")
	public static WebElement debitCreditProposalDropdown;


	//DebitCreditRequired
	@FindBy(xpath="//select[@id='iDebitCreditRequired']")
	public static WebElement debitCreditRequiredDropdown;


	//ExchangeAdjustmentGainAC
	@FindBy(xpath="//input[@id='iExchangeAdjustmentGainAC']")
	public static WebElement exchangeAdjustmentGainACTxt;

	@FindBy(xpath="//*[@id='iExchangeAdjustmentGainAC_input_container']/div[2]/table/tbody/tr/td[1]/i")
	public static WebElement exchangeAdjustmentGainAC_ExpansionBtn;

	@FindBy(xpath="//*[@id='iExchangeAdjustmentGainAC_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement exchangeAdjustmentGainAC_SettingBtn;


	//ExchangeAdjustmentLossAC
	@FindBy(xpath="//input[@id='iExchangeAdjustmentLossAC']")
	public static WebElement exchangeAdjustmentLossACTxt;

	@FindBy(xpath="//*[@id='iExchangeAdjustmentLossAC_input_container']/div[2]/table/tbody/tr/td[1]/i")
	public static WebElement exchangeAdjustmentLossAC_ExpansionBtn;

	@FindBy(xpath="//*[@id='iExchangeAdjustmentLossAC_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement exchangeAdjustmentLossAC_SettingBtn;


	///PrimaryAccount
	@FindBy(xpath="//input[@id='iPrimaryAccount']")
	public static WebElement primaryAccountTxt;

	@FindBy(xpath="//*[@id='iPrimaryAccount_input_container']/div[2]/table/tbody/tr/td[1]/i")
	public static WebElement primaryAccount_ExpansionBtn;

	@FindBy(xpath="//*[@id='iPrimaryAccount_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement primaryAccount_SettingBtn;


	////DefaultCurrency
	@FindBy(xpath="//input[@id='iDefaultCurrency']")
	public static WebElement defaultCurrencyTxt;

	@FindBy(xpath="//*[@id='iDefaultCurrency_input_container']/div[2]/table/tbody/tr/td[1]/i")
	public static WebElement defaultCurrency_ExpansionBtn;

	@FindBy(xpath="//*[@id='iDefaultCurrency_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement defaultCurrency_SettingBtn;



	///ConsolidationMethod
	@FindBy(xpath="//select[@id='iConsolidationMethod']")
	public static WebElement consolidationMethodDropdown;


	///PaymentTerms
	@FindBy(xpath="//input[@id='iPaymentTerms']")
	public static WebElement paymentTermstxt;

	@FindBy(xpath="//*[@id='iPaymentTerms_input_container']/div[2]/table/tbody/tr/td[1]/i")
	public static WebElement paymentTerms_ExpansionBtn;

	@FindBy(xpath="//*[@id='iPaymentTerms_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement paymentTerms_SettingBtn;


	//ReminderTerms
	@FindBy(xpath="//input[@id='iReminderTerms']")
	public static WebElement reminderTermsTxt;

	@FindBy(xpath="//*[@id='iReminderTerms_input_container']/div[2]/table/tbody/tr/td[1]/i")
	public static WebElement reminderTerms_ExpansionBtn;

	@FindBy(xpath="//*[@id='iReminderTerms_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement reminderTerms_SettingBtn;


	///FinanceChargeTerms
	@FindBy(xpath="//*[@id='iFinanceChargeTerms']")
	public static WebElement financeChargeTermsTxt;

	@FindBy(xpath="//*[@id='iFinanceChargeTerms_input_container']/div[2]/table/tbody/tr/td[1]/i")
	public static WebElement financeChargeTerms_Expansion;

	@FindBy(xpath="//*[@id='iFinanceChargeTerms_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement financeChargeTerms_SettingBtn;





	//Details Elements


	//Address
	@FindBy(xpath="//textarea[@id='sAddress']")
	public static WebElement addressTxt;


	//City
	@FindBy(xpath="//input[@id='iCity']")
	public static WebElement cityTxt;

	@FindBy(xpath="//*[@id='iCity_input_container']/div[2]/table/tbody/tr/td[1]/i")
	public static WebElement city_ExpansionBtn;

	@FindBy(xpath="//*[@id='iCity_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement city_SettingBtn;

	//DeliveryAddress
	@FindBy(xpath="//textarea[@id='sDeliveryAddress']")
	public static WebElement deliveryAddressTxt;

	//Pin
	@FindBy(xpath="//input[@id='sPin']")
	public static WebElement pinTxt;


	//City2 DeliveryCity (City As Second TextBox)
	@FindBy(xpath="//input[@id='iDeliveryCity']")
	public static WebElement city2Text;

	@FindBy(xpath="//*[@id='iDeliveryCity_input_container']/div[2]/table/tbody/tr/td[1]/i")
	public static WebElement city2_ExpansionBtn;

	@FindBy(xpath="//*[@id='iDeliveryCity_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement city2_SettingBtn;



	////Pin---->Delivery pin***()Second Pin TxtBox
	@FindBy(xpath="//input[@id='sDeliveryPin']")
	public static WebElement pin2Txt;


	//Send Email
	@FindBy(xpath="//input[@id='bSendEmailtocustomer']")
	public static WebElement sendEmailCheckBox;

	//AllowCustomerPortal
	@FindBy(xpath="//input[@id='bAllowCustomerPortal']")
	public static WebElement allowCustomerPortalCheckBox;

	//SendEmail
	@FindBy(xpath="//input[@id='sEMail']")
	public static WebElement sendEmailTxt;

	//Password
	@FindBy(xpath="//input[@id='sPassword']")
	public static WebElement passwordTxt;

	///TelphoneNumber
	@FindBy(xpath="//input[@id='sTelNo']")
	public static WebElement telphoneNumberTxt;

	//FaxNo
	@FindBy(xpath="//input[@id='sFaxNo']")
	public static WebElement faxNoTxt;


	//PortalEmail
	@FindBy(xpath="//input[@id='sPortalEmail']")
	public static WebElement portalEmailTxt;


	/////Print Layout Elements	
	//Voucher Type
	@FindBy(xpath="//label[contains(text(),'Voucher Type')]")
	public static WebElement gridVoucherTypeTxt;

	@FindBy(xpath="//*[@id='iVoucherType_input_container']/div[2]/table/tbody/tr/td[1]/i")
	public static WebElement gridVoucher_ExpansionBtn;

	@FindBy(xpath="//*[@id='iVoucherType_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement gridVoucher_SettingBtn;


	///////Print layout
	@FindBy(xpath="//label[contains(text(),'Print Layout')]")
	public static WebElement gridPrintLayoutTxt;

	@FindBy(xpath="//*[@id='iPrintLayout_input_container']/div[2]/table/tbody/tr/td[1]/i")
	public static WebElement gridPrintLayout_ExpansionBtn;

	@FindBy(xpath="//*[@id='iPrintLayout_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement gridPrintLayout_SettingBtn;


	@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[11]")
	public static List<WebElement> accontsNameList;

	@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[8]/div[1]")
	public static List<WebElement> accontsCheckBoxList;





	// Document Customization



	@FindBy (xpath="//table[@id='editScreen_footerTable']/tbody/tr[2]/td/span[1]")
	public static WebElement editScreenFooterRow2Edit;

	@FindBy (xpath="//table[@id='editScreen_footerTable']/tbody/tr[2]/td/span[2]")
	public static WebElement editScreenFooterRow2Delete;

	@FindBy (xpath="//table[@id='editScreen_footerTable']/tbody/tr[2]/td[3]")
	public static WebElement editScreenFooterRow2Caption;

	@FindBy (xpath="//table[@id='editScreen_footerTable']/tbody/tr[2]/td[8]")
	public static WebElement editScreenFooterRow2Formula;

	@FindBy (xpath="//table[@id='editScreen_footerTable']/tbody/tr")
	public static List <WebElement> editScreenFooterRowsCount;


	@FindBy (xpath="//table[@id='editLayout_headerTable']/tbody/tr")
	public static List <WebElement> editLayoutHeaderRowsCount;


	@FindBy (xpath="//table[@id='editScreen_bodyTable']/tbody/tr[3]/td/span[1]")
	public static WebElement editScreenBodyRow3Edit;

	@FindBy (xpath="//table[@id='editScreen_bodyTable']/tbody/tr[3]/td/span[2]")
	public static WebElement editScreenBodyRow3Delete;

	@FindBy (xpath="//table[@id='editScreen_bodyTable']/tbody/tr[3]/td[3]")
	public static WebElement editScreenBodyRow3Caption;

	@FindBy (xpath="//table[@id='editScreen_bodyTable']/tbody/tr[3]/td[8]")
	public static WebElement editScreenBodyRow3Formula;


	@FindBy (xpath="//table[@id='editScreen_bodyTable']/tbody/tr")
	public static List <WebElement> editScreenBodyRowsCount;


	@FindBy(xpath="//ul[@id='id_documentcustomization_views_list_users']/li[1]/div/label/input")
	public static WebElement  viewSuChkbox;

	@FindBy(xpath="//ul[@id='id_documentcustomization_views_list_users']/li[2]/div/label/input")
	public static WebElement  viewsUserAllOptionsSTChkbox;




	@FindBy(xpath="//input[@id='triggers_existTriggers']")
	public static WebElement  editLayoutTriggerName;

	@FindBy(xpath="//td[@id='triggers_existTriggers_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	public static WebElement  triggersExistTriggersSettingBtn;



	@FindBy(xpath="//tbody//span[@class='icon-close icon-font6']")
	public static WebElement  triggersTrigCreteriaCloseBtn;

	@FindBy(xpath="//tbody//span[@class='icon-pluse icon-font6']")
	public static WebElement  triggersTrigCreteriaAddBtn;

	@FindBy(xpath="//tr[2]//td[6]//span[1]")
	public static WebElement  triggersTrigCretriaRow2CloseBtn;

	@FindBy(xpath="//input[@id='triggers_chkraiseNewDoc']")
	public static WebElement editLayoutTriggerRaiseDoc;  	

	@FindBy(xpath="//input[@id='triggers_chkraiseNewDoc']")
	public static WebElement  triggersRiseANewDocChkbox;

	@FindBy(xpath="//*[@id='triggers_FieldsDiv']/div[2]/div[2]/div[1]/label/input")
	public static WebElement  triggersSuspendedChkboxs;

	@FindBy(xpath="//*[@id='triggers_FieldsDiv']/div[2]/div[2]/div[1]/label")
	public static WebElement  triggersSuspended;

	@FindBy(xpath="//input[@id='rdbOnSave']")
	public static WebElement  triggersOnSaveRadioBtn;

	@FindBy(xpath="//input[@id='rdbOnAuthorization']")
	public static WebElement  triggersOnAuthorizatinRadioBtn;

	@FindBy(xpath="//input[@id='triggers_chksendAlert']")
	public static WebElement  triggersSendAlertChkbox;

	@FindBy(xpath="//select[@id='triggers_sendAlert']")
	public static WebElement  triggersSendAlertDrpdwn;

	@FindBy(xpath="//*[@id='triggers_FieldsDiv']/div[2]/div[3]/div[1]/button")
	public static WebElement  triggersSendAlertExpansionBtn;

	@FindBy(xpath="//input[@id='id_trigger_alertdateformula']")
	public static WebElement  triggersAlertDataFormula;

	@FindBy(xpath="//input[@id='triggers_chksendEmail']")
	public static WebElement  triggersSendEmailChkbox;

	@FindBy(xpath="//input[@id='Triggers_LayoutID']")
	public static WebElement  triggersSendEmailDrpdwn;

	@FindBy(xpath="//div[@class='col-xs-12 col-sm-6']//div[2]//button[1]")
	public static WebElement  triggersSendEmailExpansionBtn;

	@FindBy(xpath="//input[@id='triggers_chksendSMS']")
	public static WebElement  triggersSendSMSChkbox;

	@FindBy(xpath="//select[@id='triggers_sendSMS']")
	public static WebElement  triggersSendSMSDrpdwn;

	@FindBy(xpath="//div[@class='col-xs-12 col-sm-6']//div[@class='col-xs-12']//div[3]//button[1]")
	public static WebElement  triggersSendSMSExpansionBtn;

	@FindBy(xpath="//input[@id='triggers_smsconfirm']")
	public static WebElement  triggersConformBeforeSendingChkbox;

	@FindBy(xpath="//input[@id='triggers_smsonedit']")
	public static WebElement  triggersSendSMSonEdit;

	@FindBy(xpath="//select[@id='triggers_PhoneNo']")
	public static WebElement  triggersPhoneNoDrpdwn;

	@FindBy(xpath="//input[@id='triggers_chksendTypeCustomeVendor']")
	public static WebElement  triggersCustmerORVendorChkbox;

	@FindBy(xpath="//input[@id='triggers_chksendTypeLogin']")
	public static WebElement  triggersLoginChkbox;

	@FindBy(xpath="//input[@id='triggers_chksendTypeExtraField']")
	public static WebElement  triggersExtraFieldChkbox;

	@FindBy(xpath="//input[@id='triggers_Role']")
	public static WebElement  triggersRoleChkbox;

	@FindBy(xpath="//input[@id='triggers_Auth']")
	public static WebElement  triggersAuthorisationChkbox;

	@FindBy(xpath="//select[@id='triggers_Auth_DD']")
	public static WebElement  triggersDefaultDrpdwn;




	@FindBy(xpath="//td[@id='docNum_Table_col_1-0']")
	public static WebElement  docNUmneringFirstRowIndex;	

	@FindBy(xpath="//td[@id='docNum_Table_col_1-1']")
	public static WebElement  typeRow1;	

	@FindBy(xpath="//td[@id='docNum_Table_col_1-2']")
	public static WebElement  fieldValueRow1;	

	@FindBy(xpath="//td[@id='docNum_Table_col_1-3']")
	public static WebElement  startingCharacterRow1;	

	@FindBy(xpath="//td[@id='docNum_Table_col_1-4']")
	public static WebElement  noofCharactersRow1;	

	@FindBy(xpath="//td[@id='docNum_Table_col_2-0']")
	public static WebElement  docNUmneringSecondRowIndex;	

	@FindBy(xpath="//td[@id='docNum_Table_col_2-1']")
	public static WebElement  typeRow2;	

	@FindBy(xpath="//td[@id='docNum_Table_col_2-2']")
	public static WebElement  fieldValueRow2;	

	@FindBy(xpath="//td[@id='docNum_Table_col_2-3']")
	public static WebElement  startingCharacterRow2;	

	@FindBy(xpath="//td[@id='docNum_Table_col_2-4']")
	public static WebElement  noofCharactersRow2;	

	@FindBy(xpath="//td[@id='docNum_Table_col_3-0']")
	public static WebElement  docNUmneringThkirdRowIndex;	

	@FindBy(xpath="//td[@id='docNum_Table_col_3-1']")
	public static WebElement  typeRow3;	

	@FindBy(xpath="//td[@id='docNum_Table_col_3-2']")
	public static WebElement  fieldValueRow3;	

	@FindBy(xpath="//td[@id='docNum_Table_col_3-3']")
	public static WebElement  startingCharacterRow3;	

	@FindBy(xpath="//td[@id='docNum_Table_col_3-4']")
	public static WebElement  noofCharactersRow3;	

	@FindBy(xpath="//td[@id='docNum_Table_col_4-0']")
	public static WebElement  docNUmneringFourthRowIndex;	

	@FindBy(xpath="//td[@id='docNum_Table_col_4-1']")
	public static WebElement  typeRow4;	

	@FindBy(xpath="//td[@id='docNum_Table_col_4-2']")
	public static WebElement  fieldValueRow4;	

	@FindBy(xpath="//td[@id='docNum_Table_col_4-3']")
	public static WebElement  startingCharacterRow4;	

	@FindBy(xpath="//td[@id='docNum_Table_col_4-4']")
	public static WebElement  noofCharactersRow4;	

	@FindBy(xpath="//td[@id='docNum_Table_col_5-0']")
	public static WebElement  docNUmneringFifthRowIndex;	

	@FindBy(xpath="//td[@id='docNum_Table_col_5-1']")
	public static WebElement  typeRow5;	

	@FindBy(xpath="//td[@id='docNum_Table_col_5-2']")
	public static WebElement  fieldValueRow5;	

	@FindBy(xpath="//td[@id='docNum_Table_col_5-3']")
	public static WebElement  startingCharacterRow5;	

	@FindBy(xpath="//td[@id='docNum_Table_col_5-4']")
	public static WebElement  noofCharactersRow5;	

	@FindBy(xpath="//td[@id='docNum_Table_col_6-0']")
	public static WebElement  docNUmneringSixthRowIndex;	

	@FindBy(xpath="//td[@id='docNum_Table_col_6-1']")
	public static WebElement  typeRow6;	

	@FindBy(xpath="//td[@id='docNum_Table_col_6-2']")
	public static WebElement  fieldValueRow6;	

	@FindBy(xpath="//td[@id='docNum_Table_col_6-3']")
	public static WebElement  startingCharacterRow6;	

	@FindBy(xpath="//td[@id='docNum_Table_col_6-4']")
	public static WebElement  noofCharactersRow6;	

	@FindBy(xpath="//td[@id='docNum_Table_col_7-0']")
	public static WebElement  docNUmneringSeventhRowIndex;	

	@FindBy(xpath="//td[@id='docNum_Table_col_7-1']")
	public static WebElement  typeRow7;	

	@FindBy(xpath="//td[@id='docNum_Table_col_7-2']")
	public static WebElement  fieldValueRow7;	

	@FindBy(xpath="//td[@id='docNum_Table_col_7-3']")
	public static WebElement  startingCharacterRow7;	

	@FindBy(xpath="//td[@id='docNum_Table_col_7-4']")
	public static WebElement  noofCharactersRow7;	



	@FindBy(xpath="//select[@id='docNum_TypeDropDown']")
	public static WebElement  typeDropDown;	

	@FindBy(xpath="//input[@id='docNum_FieldORValueDropDown']")
	public static WebElement  fieldValueTxt;	

	@FindBy(xpath="//select[@id='docNum_FieldORValueDropDown']")
	public static WebElement  fieldValueDropDown;	

	@FindBy(xpath="//input[@id='docNum_startCharacterTxtbox']")
	public static WebElement  startingCharacterTxt;	

	@FindBy(xpath="//input[@id='docNum_noofCharacterTxtbox']")
	public static WebElement  noOfCharacterTxt;


	@FindBy (xpath="//*[@id='docNum_Table_col_1-0']")
	public static WebElement docNumberingRow1Col1;

	@FindBy (xpath="//*[@id='docNum_Table_col_2-0']")
	public static WebElement docNumberingRow2Col1;

	@FindBy (xpath="//div[contains(text(),'Delete Row')]")
	public static WebElement docNumberingRow1DeleteBtn;


	@FindBy(xpath = "//input[@class='btn btn-link']")
	public static WebElement rulesTabAddRuleBtn;

	@FindBy(xpath = "//input[@id='txtMasterRuleName_DocCustRules']")
	public static WebElement rulesTabRuleNameTxt;

	@FindBy(xpath = "//td[@id='txtMasterRuleName_DocCustRules_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	public static WebElement rulesTabRuleNameSettingBtn;

	@FindBy(xpath = "//*[@id='Conditions-Context_Menu_DocCustRules']/li[2]/a")
	public static WebElement rulesTabElseTab;


	@FindBy(xpath = "//*[@id='Conditions-Context_Menu_DocCustRules']/li[1]/a")
	public static WebElement rulesTabIFTab;

	@FindBy(xpath = "//input[@id='txtField_RC_1_1_DocCustRules']")
	public static WebElement rulesTabIFSelectTabTxt;

	@FindBy(xpath = "//select[@id='ddlMasterFields_RULES_DocCustRules']")
	public static WebElement rulesTabIFSelectTabDrpdwn;


	@FindBy(xpath = "//select[@id='ddlExtraFields_1_1_DocCustRules']")
	public static WebElement rulesTabExtraFieldDrpdwn;


	@FindBy(xpath = "//select[@id='ddlOperators_RC_1_1_DocCustRules']")
	public static WebElement rulesTabOperatorsDrpdwn;

	@FindBy(xpath = "//select[@id='ddlCompareWith_RC_1_1_DocCustRules']")
	public static WebElement rulesTabCompareWithDrpdwn;

	@FindBy(xpath = "//input[@id='txtCompareType_RC_1_1_DocCustRules']")
	public static WebElement rulesTabValueTxt;


	@FindBy(xpath = "//input[@id='txtCompareType_RC_1_1_DocCustRules']")
	public static WebElement rulesTabConditionTxttoEnter;

	@FindBy(xpath = "//input[@id='optControl_RulesCondition_DocCustRules']	")
	public static WebElement rulesTabConditionTxt;





	@FindBy(xpath = "//input[@id='optControl_RulesCondition_DocCustRules']")
	public static WebElement rulesTabConditioDrpdwn;




	@FindBy(xpath = "//select[@id='ddlConjunction_RC_1_1_DocCustRules']")
	public static WebElement rulesTabConjunctionDrpdwn;

	@FindBy(xpath = "//input[@id='chkNoRuleCondition_DocCustRules']")
	public static WebElement rulesTabNoConditionChkbbox;

	@FindBy(xpath = "//i[@id='iconRuleSettings_DocCustRules']")
	public static WebElement rulesTabSettingsAddIcon;

	@FindBy(xpath = "//span[@class='icon-close icon-font7']")
	public static WebElement rulesTabIfConditionCloseBtn;

	@FindBy(xpath = "//*[@id='Rule_IF_DocCustRules']/div[2]/div[1]/ul/li[1]/a/span")
	public static WebElement rulesTab_IFFormattingTab;

	@FindBy(xpath = "//*[@id='Rule_IF_DocCustRules']/div[2]/div[1]/ul/li[2]/a/span")
	public static WebElement rulesTab_IFMesssageTab;

	@FindBy(xpath = "//*[@id='Rule_IF_DocCustRules']/div[2]/div[1]/ul/li[3]/a/span")
	public static WebElement rulesTab_IFAlertsTab;

	@FindBy(xpath = "//*[@id='Rule_Else_DocCustRules']/div/div[1]/ul/li[1]/a/span")
	public static WebElement rulesTab_ElseFormattingTab;

	@FindBy(xpath = "//*[@id='Rule_Else_DocCustRules']/div/div[1]/ul/li[2]/a/span")
	public static WebElement rulesTab_ElseMessageTab;

	@FindBy(xpath = "//*[@id='Rule_Else_DocCustRules']/div/div[1]/ul/li[3]/a/span")
	public static WebElement rulesTab_ElseAlertsTab;

	@FindBy(xpath = "//button[@id='btnAddRule']")
	public static WebElement rulesTab_SaveRuleBtn;

	@FindBy(xpath = "//button[contains(text(),'Delete Rule')]")
	public static WebElement rulesTab_DeleteRuleBtn;

	@FindBy (xpath="//*[@id='DeleteRule_Modal_DocCustRules']/div/div/div[3]/button[1]")
	public static WebElement deleteRuleYesBtn;


	@FindBy(xpath="//*[@id='configTransMenu']/ul/li[2]/span[2]")
	public static WebElement  docCustCloseBtn;

	@FindBy(xpath="//li/span")
	public static WebElement searchMenuTextClick;

	@FindBy(xpath="//i[@id='tbDocumentCustomization']")
	public static WebElement  documentCustomization45Btn;

	@FindBy(xpath="//a[text()='Preferences']/i")
	public static WebElement  configureTransactionPreferencesMinus;

	@FindBy(xpath="//div[@id='configureTransactions']/div[2]/div[2]/div/div/ul/li[2]/a/i")
	public static WebElement  configureTransactionDocumentCustomiztionMinus;





	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-1']")
	public static WebElement  masters2;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-2']")
	public static WebElement  position2;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-3']")
	public static WebElement  showDependency2;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-4']")
	public static WebElement  group2;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-5']")
	public static WebElement  filter2;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-6']")
	public static WebElement  mandatory2;

	@FindBy(xpath="//select[@id='doc_TagsTableMasterDropDown']")
	public static WebElement  masterDropDown;

	@FindBy(xpath="//select[@id='doc_TagsPositionDropDown']")
	public static WebElement  positionDropdown;


	// Miscellaneous Tab

	@FindBy(xpath="//ul[@id='navigationTabs']/li[9]/a")
	public static WebElement  miscellaneousTab;

	@FindBy(xpath="//input[@id='misc_Abbrivation']")
	public static WebElement  abbreviationTxt;


	@FindBy(xpath="//*[@id='panelsStayOpen-headingTwo']/button")
	public static WebElement miscellaneusTabPostingDetailsMenu;

	@FindBy(xpath="(//h2[@id='panelsStayOpen-headingThree'])[2]/button")
	public static WebElement miscellaneousTabCurrencyMenu;




	@FindBy(xpath="//ul[@id='navigationTabs']/li[4]/a")
	public static WebElement  editScreenTab; 



	@FindBy(xpath="//select[@id='editScreen_voucherDropDown']")
	public static WebElement editScreenLoadFieldsDropdown;  

	@FindBy(xpath="//div[@id='editScreen_copyFieldsDiv']//button[@class='Fbutton pull-right'][contains(text(),'Ok')]")
	public static WebElement editScreenokBtn;  



	@FindBy(xpath="//ul[@id='navigationTabs']/li[3]/a")
	public static WebElement editLayoutTab;


	@FindBy(xpath="//*[@class='icon-new hiconright2']")
	public static WebElement editLayoutAddFieldsBtn;

	@FindBy(xpath="//input[@id='EditLayout_FieldsCustomization_FieldDetails_Caption']")
	public static WebElement  editLayoutCaptionTxt;


	@FindBy(xpath="//td[@id='editLayout_headerrow_2 _4']")
	public static WebElement  editLayoutHeader2ndRowCaption;

	@FindBy(xpath="//td[@id='editLayout_bodyrow_1 _4']")
	public static WebElement  editLayoutbody1stRowCaption;

	@FindBy(xpath="//*[@id='editLayout_tabContent']/div/div[1]/div[1]/a[1]/i")
	public static WebElement editLayoutLoadFieldsBtn;  

	@FindBy(xpath="//*[@id='editLayout_voucherDropDown']")
	public static WebElement editLayoutLoadFieldsDropdown;  

	@FindBy(xpath="//button[@class='Fbutton pull-left']")
	public static WebElement editLayoutselectAllBtn;  

	@FindBy(xpath="//*[@id='dvVWCommonDetails']/div[2]/div/div[3]/input[2]")
	public static WebElement editLayoutokBtn;     




	@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div/div[2]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/table/tbody/tr[2]/td[1]/span[1]")
	public static WebElement  editLayoutHeader2ndRowEditBtn; 

	@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div/div[2]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/table/tbody/tr[2]/td[1]/span[2]")
	public static WebElement  editLayoutHeader2ndRowDeleteBtn; 



	@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div/div[2]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div[2]/table/tbody/tr/td[1]/span[1]")
	public static WebElement  editLayoutBody1stRowEditBtn; 

	@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div/div[2]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div[2]/table/tbody/tr/td[1]/span[2]")
	public static WebElement  editLayoutBody1stRowDeleteBtn; 

	@FindBy(xpath="//input[@id='chkNewRecord_Rule_DocCustRules']")
	public static WebElement rulesNewRecordChekbox ;

	@FindBy(xpath="//input[@id='chkEdit_Rule_DocCustRules']")
	public static WebElement rulesEditChekbox ;

	@FindBy(xpath="//input[@id='chkLoad_Rule_DocCustRules']")
	public static WebElement rulesLoadChekbox ;

	@FindBy(xpath="//input[@id='chkOnEnter_Rule_DocCustRules']")
	public static WebElement rulesOnEnterChekbox ;

	@FindBy(xpath="//*[@id='Rule_IF_DocCustRules']/div[2]/div[1]/ul/li[2]/a/span")
	public static WebElement rulesIFMessageTab ;

	@FindBy(xpath="//input[@id='txtGeneralMsg_RuleIfMsg_DocCustRules']")
	public static WebElement rulesIFMessagesGenralMessageTxt;

	@FindBy(xpath="//ul[@id='navigationTabs']/li[8]/a")
	public static WebElement  inventoryoptionsTab;

	@FindBy(xpath="//input[@id='inventoryOpt_chkApplyRateSchemes']")
	public static WebElement applyrateSchemesChkBox;

	@FindBy(xpath="//ul[@id='navigationTabs']/li[14]/a")
	public static WebElement  viewsBtn;

	@FindBy(xpath="//ul[@id='navigationTabs']/li[13]/a")
	public static WebElement  triggersBtn;

	@FindBy(xpath="//ul[@id='navigationTabs']/li[2]/a")
	public static WebElement  documentNumberingBtn;

	@FindBy(xpath="//ul[@id='navigationTabs']/li[11]/a")
	public static WebElement  rulesBtn;

	@FindBy (xpath="//div[@id='dvSearchBx']/div[2]/span[1]")
	public static WebElement docCustCreateVoucherBtn;

	@FindBy(xpath="//*[@id='editScreen_copyFieldsOptFields']/div/label/span")
	public static List<WebElement>  editScreenLoadFieldTxtList;

	@FindBy(xpath="//*[@id='editScreen_copyFieldsOptFields']/div/label/input")
	public static List<WebElement>  editScreenLoadFieldchkboxList;

	@FindBy(xpath="//*[@id='105']")
	public static WebElement  settingsWizardMenu;

	@FindBy(xpath="//a[@id='1'][text()='VAT']")
	public static WebElement settingsWizardVATBtn;

	@FindBy(xpath="//label[contains(text(),'Gross')]/input")
	public static WebElement settingsWizardVATGrossChkbox;




	//DC Test
	@FindBy(xpath="//*[@id='id_search_menu']/input")
	public static WebElement serachMenuTextHomePage;



	@FindBy(xpath="//a[@id='770' and text() =' Purchases Voucher VAT']")
	public static WebElement  purchasesVoucherVatBtn;


	@FindBy(xpath="//*[@id='doc_Searchbox']")
	public static WebElement  searchBox;

	@FindBy(xpath="//*[@id='dvSearchBx']/div[2]/span[1]")
	public static WebElement  createVoucherBtn;

	@FindBy(xpath="//span[@id='spanDeleteVoucher']")
	public static WebElement  deletevoucherBtn;

	@FindBy(xpath="//a[@id='4608']")
	public static WebElement  receiptsBtn;
	
	@FindBy(xpath="//a[@id='2002']")
	public static WebElement  receiptsVchr;
	
	

	@FindBy(xpath="//a[@id='4864']")
	public static WebElement  paymentsBtn;

	@FindBy(xpath="//a[@id='5120']")
	public static WebElement  pettyCashBtn;

	@FindBy(xpath="//a[@id='5888']")
	public static WebElement  postDatedreceiptsBtn;

	@FindBy(xpath="//a[@id='7168']")
	public static WebElement  postDatedpaymentsBtn;

	@FindBy(xpath="//a[@id='768']")
	public static WebElement  purchaseVouchersBtnInDC;

	@FindBy(xpath="//a[@id='1023']")
	public static WebElement  stockAdjustmentBtn;

	@FindBy(xpath="//a[@id='6400']")
	public static WebElement  purchaseReturnsBtn;

	@FindBy(xpath="//a[@id='2560']")
	public static WebElement  purcahseOrdersBtn;

	@FindBy(xpath="//a[@id='2561']")
	public static WebElement  jobOrdersBtn;

	@FindBy(xpath="//a[@id='1280']")
	public static WebElement  materialReceiptsNotesBtn;

	@FindBy(xpath="//*[@id='3328' and text() ='Sales Invoices ']")
	public static WebElement  salesInvoiceBtn;
	
	@FindBy(xpath="//*[@id='2015']")
	public static WebElement  salesInvoicesBtn;

	
	

	@FindBy(xpath="//a[@id='3329' and text()='Cash Sales']")
	public static WebElement  cashSalesBtn;

	@FindBy(xpath="//a[@id='3330' and text()='Hire-Purchase Sales']")
	public static WebElement  hirePurcahseSalesBtn;

	/*@FindBy(xpath="//a[@id='3331']")
	public static WebElement  posSalesBtn;*/

	@FindBy(xpath="//a[@id='3331' and text()='POS Sales']")
	public static WebElement  posSalesBtn;

	@FindBy(xpath="//a[@id='1792']")
	public static WebElement  salesReturnsBtn;

	@FindBy(xpath="//a[@id='5632']")
	public static WebElement  salesOrdersBtn;

	@FindBy(xpath="//a[@id='5633']")
	public static WebElement  productionOrderBtn;

	@FindBy(xpath="//a[@id='6144']")
	public static WebElement  deliveryNotesBtn;

	@FindBy(xpath="//a[@id='3584']")
	public static WebElement  nonStandardjournalEntriesBtn;

	@FindBy(xpath="//a[@id='3585']")
	public static WebElement  interDepartmentalJVBtn;

	@FindBy(xpath="//a[@id='3586']")
	public static WebElement  debitNotesLineWiseBtn;

	@FindBy(xpath="//a[@id='3587']")
	public static WebElement  creditNotesLineWiseBtn;

	@FindBy(xpath="//a[@id='3588']")
	public static WebElement  fixedAssetDepreciationVoucherBtn;

	@FindBy(xpath="//a[@id='8704']")
	public static WebElement  journalEntriesBtn;

	@FindBy(xpath="//a[@id='3840']")
	public static WebElement  debitNotesBtn;

	@FindBy(xpath="//a[@id='4096']")
	public static WebElement  creditNotesBtn;

	@FindBy(xpath="//a[@id='4097']")
	public static WebElement  payRollPostingsBtn;

	@FindBy(xpath="//a[@id='256']")
	public static WebElement  openingBalancesBtn;

	@FindBy(xpath="//a[@id='5376']")
	public static WebElement  shortageInStocksBtn;

	@FindBy(xpath="//*[@id='2048' and text()='Excesses in Stocks']")
	public static WebElement  excessInStocksBtn;

	@FindBy(xpath="//a[@id='3072']")
	public static WebElement  stockTransfersBtn;

	@FindBy(xpath="//*[@id='512' and text()='Opening Stocks']")
	public static WebElement  openingStocksBtn;

	@FindBy(xpath="//*[@id='6656' and text()='Issues to Production']")
	public static WebElement  issuesToProductionBtn;

	@FindBy(xpath="//a[@id='1024']")
	public static WebElement  receiptsFromProductionBtn;

	@FindBy(xpath="//a[@id='1056']")
	public static WebElement  returnsFromShopfloorBtn;

	@FindBy(xpath="//a[@id='6912']")
	public static WebElement  jobWorkIssuesBtn;

	@FindBy(xpath="//a[@id='1536']")
	public static WebElement  jobWorkReeceiptsBtn;

	@FindBy(xpath="//a[@id='2304']")
	public static WebElement  purchaseQuotationsBtn;

	@FindBy(xpath="//a[@id='7424']")
	public static WebElement  salesQuotationsBtn;

	@FindBy(xpath="//a[@id='7680']")
	public static WebElement  jobOrderBtn;

	@FindBy(xpath="//a[@id='2816']")
	public static WebElement  productionProcessBtn;

	@FindBy(xpath="//a[@id='7936']")
	public static WebElement  materialRequisitionBtn;

	@FindBy(xpath="//a[@id='8192']")
	public static WebElement  requestForQuoteBtn;

	@FindBy(xpath="//a[@id='8448']")
	public static WebElement  forecxJVBtn;

	@FindBy(xpath="//*[@id='updateButton']/i")
	public static WebElement  updateBtn;

	@FindBy(xpath="//*[@id='btnCustomizeClose']/i")
	public static WebElement  closeBtnInDc;

	@FindBy(xpath="//*[@id='doc_title']")
	public static WebElement  titleTxt;

	@FindBy(xpath="(//input[@id='doc_baseDocument'])[1]")
	public static WebElement  baseDocumentTxtInDocCust;

	@FindBy(xpath="//*[@id='navigationtab1']")
	public static WebElement  documentsTab;

	@FindBy(xpath="//*[@id='navigationtab2']")
	public static WebElement  miscellaneousTabInDC;

	@FindBy(xpath="//*[@id='navigationtab3']")
	public static WebElement editLayoutTabInDc;

	@FindBy(xpath="//*[@id='navigationtab4']")
	public static WebElement  viewBtn;

	@FindBy(xpath="//*[@id='navigationtab5']")
	public static WebElement  externalFunctionBtn;



	@FindBy(xpath="//*[@id='navigationtab6']")
	public static WebElement  exportFieldBtn;

	@FindBy(xpath="//*[@id='navigationtab7']")
	public static WebElement  triggerBtn;

	@FindBy(xpath="//*[@id='navigationtab8']")
	public static WebElement  docuBtn;

	@FindBy(xpath="//*[@id='navigationtab10']")
	public static WebElement  hirePurBtn;

	@FindBy(xpath="//*[@id='navigationtab11']")
	public static WebElement  ruleBtn;

	@FindBy(xpath="//*[@id='navigationtab12']")
	public static WebElement  reportBtn;

	@FindBy(xpath="//*[@id='navigationtab15']")
	public static WebElement  schemesBtn;




	@FindBy(xpath="//*[@id='4609']")
	public static WebElement  newReceiptsVoucher;


	@FindBy(xpath="//*[@id='panelsStayOpen-headingOne']/button")
	public static WebElement  generalExpandBtn;

	@FindBy(xpath="//*[@id='panelsStayOpen-headingThree']/button")
	public static WebElement  menuSelectionExpandBtn;

	@FindBy(xpath="//*[@id='editScreen_CustomizeButtons']/a[1]")
	public static WebElement  mastersLoadBtn;


	@FindBy(xpath="//*[@id='editScreen_CustomizeButtons']/a[3]")
	public static WebElement  mastersDeleteRowBtn;

	@FindBy(xpath="//*[@id='editScreen_CustomizeButtons']/a[2]")
	public static WebElement  mastersAddGroup;

	@FindBy(xpath="//*[@id='editScreen_CustomizeButtons']/a[4]/i")
	public static WebElement  mastersDeleteGroup;



	@FindBy(xpath="//tbody[@id='doc_TagsTable_body']")
	public static WebElement  mastersNposTable;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-1']")
	public static WebElement  masters1;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-2']")
	public static WebElement  position1;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-3']")
	public static WebElement  showDependency1;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-4']")
	public static WebElement  group1;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-5']")
	public static WebElement  filter1;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-6']")
	public static WebElement  mandatory1;


	// Currency	

	@FindBy(xpath="//*[@id='misc_CurrencyAddCurrencyIn']")
	public static WebElement CurrencyInDropdownInDC;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseThree']/label[2]/span")
	public static WebElement inputExchangeRateChkBoxInDC;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseThree']/label[2]/input")
	public static WebElement inputExchangeRateChkBoxInDCSelected;

	@FindBy(xpath="//*[@id='editLayout_tabContent']/div/div[1]/div[1]/span")
	public static WebElement  editLayoutAddBtn;

	@FindBy(xpath="//*[@id='editLayout_tabContent']/div/div[1]/div[1]/a[1]")
	public static WebElement  editLayoutLoadBtn;

	@FindBy(xpath="//*[@id='BodyTabMenu']")
	public static WebElement  editLayoutLoadBtnInBodyTab;

	@FindBy(xpath="//*[@id='editLayout_tabContent']/div/div[1]/div[1]/a[2]/i")
	public static WebElement  editLayoutCustomizeBtn;

	@FindBy(xpath="//*[@id='HeaderTabMenu']")
	public static WebElement  editLayoutHeaderTab;

	@FindBy(xpath="//*[@id='BodyTabMenu']")
	public static WebElement  editLayoutBodyTab;



	@FindBy(xpath="//*[@id='editLayout_headerrow_1 _3']")
	public static WebElement  narrationHeaderInEditLayout;

	@FindBy(xpath="//*[@id='editLayout_headerrow_2 _3']")
	public static WebElement  chequeHeaderInEditLayout;

	@FindBy(xpath="//*[@id='editScreen_FieldsCustomization_tabs']/li[3]/a")
	public static WebElement formattingTab;  


	@FindBy(xpath="//a[contains(text(),'Properties')]")
	public static WebElement editLayoutPropertiesTab; 

	@FindBy(xpath="//ul[@id='editScreen_FieldsCustomization_tabs']//li[4]//a[1]")
	public static WebElement  editLayoutRulesTab;


	@FindBy(xpath="//*[@id='tbRules']")
	public static WebElement  editLayoutBodyRulesTab;




	@FindBy(xpath="//ul[@id='editScreen_FieldsCustomization_tabs']//li[5]")
	public static WebElement  editlayoutExternalModulesTab;

	@FindBy(xpath="(//*[@id='tbProperty'])[2]")
	public static WebElement  editlayoutBodyExternalModulesTab;





	@FindBy(xpath="//a[contains(text(),'Field Details')]")
	public static WebElement editLayoutFieldDetailsTab;


	@FindBy(xpath="//*[@id='EditLayout_FieldsCustomization_FieldDetails_Caption_input_container']/div[2]/table/tbody/tr/td[1]/i")
	public static WebElement  editLayOutCaptionExpandBtn;

	@FindBy(xpath="//*[@id='EditLayout_FieldsCustomization_FieldDetails_Caption_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement  editLayoutCaptionSettingsBtn;


	@FindBy(xpath="//*[@id='dvCustomizeEditLayoutField']/div[2]/div/div[3]/input[1]")
	public static WebElement editLayoutApplyBtn;  

	@FindBy(xpath="//*[@id='editLayout_FieldsCustomization_Close']/i")
	public static WebElement editLayoutcloseBtnInDc;






	//Properties Tab 




	@FindBy(xpath="//*[@id='editLayout_FieldsCustomization_Properties']/fieldset/div[1]/div[1]/label/span")
	public static WebElement auditTrailChkBox;  

	@FindBy(xpath="//*[@id='dvEditLayoutPropChkHidden']/label/span")
	public static WebElement hiddenChkbox;  

	@FindBy(xpath="//*[@id='editLayout_FieldsCustomization_Properties']/fieldset/div[1]/div[3]/label/span")
	public static WebElement mergeFieldChkBox;  

	@FindBy(xpath="//*[@id='editLayout_FieldsCustomization_Properties']/fieldset/div[1]/div[4]/label/span")
	public static WebElement notAvailableForReportsChkBox;  

	@FindBy(xpath="//*[@id='editLayout_FieldsCustomization_Properties']/fieldset/div[1]/div[5]/label/span")
	public static WebElement informationFieldChkBox;  

	@FindBy(xpath="//*[@id='editLayout_FieldsCustomization_Properties']/fieldset/div[1]/div[6]/label/span")
	public static WebElement readOnlyChkBox;  

	@FindBy(xpath="//*[@id='editLayout_FieldsCustomization_Properties']/fieldset/div[1]/div[7]/label/span")
	public static WebElement cantExportChkBox;  

	@FindBy(xpath="//*[@id='editLayout_FieldsCustomization_Properties']/fieldset/div[1]/div[8]/label/span")
	public static WebElement mandatorychkBox;  

	@FindBy(xpath="//*[@id='editLayout_FieldsCustomization_Properties']/fieldset/div[1]/div[9]/label/span")
	public static WebElement spellCheckChkBox;  

	@FindBy(xpath="//*[@id='editLayout_FieldsCustomization_Properties']/fieldset/div[1]/div[10]/label/span")
	public static WebElement cantImportChkbox;  

	@FindBy(xpath="//*[@id='editLayout_FieldsCustomization_Properties']/fieldset/div[1]/div[11]/label/span")
	public static WebElement massUpdateChkBox;  

	@FindBy(xpath="//select[@id='editLayout_FieldsCustomization_Properties_behavoir']")
	public static WebElement behaviourDropdown;  





	@FindBy(xpath="//input[@id='editLayout_FieldsCustomization_Formatting_colSpan']")
	public static WebElement columnSpanDropdown;  

	@FindBy(xpath="//input[@id='editLayout_FieldsCustomization_Formatting_rowSpan']")
	public static WebElement rowSpandropdown;  

	@FindBy(xpath="//select[@id='editLayout_FieldsCustomization_Formatting_charCasing']")
	public static WebElement characterCasingDropdown;  

	@FindBy(xpath="//select[@id='editLayout_FieldsCustomization_Formatting_textAlign']")
	public static WebElement textAlignDropdown;  

	@FindBy(xpath="//*[@id='editLayout_FieldsCustomization_Formatting']/div[5]/label/span")
	public static WebElement enableFontChkbox;  

	@FindBy(xpath="//select[@id='doc_voucherDropDown']")
	public static WebElement  loadmasterDropDown;

	@FindBy(xpath="//*[@id='dvVWCommonDetails']/div[2]/div/div[3]/input[1]")
	public static WebElement  selectAllBtn;

	@FindBy(xpath="//*[@id='dvVWCommonDetails']/div[2]/div/div[3]/input[2]")
	public static WebElement  resetBtn;

	@FindBy(xpath="//*[@id='dvVWCommonDetails']/div[2]/div/div[3]/input[3]")
	public static WebElement  okBtn;

	@FindBy(xpath="//*[@id='navigationtab14']")
	public static WebElement  inventoryoptionsTabInDC;

	@FindBy(xpath="//*[@id='panelsStayOpen-headingTwo']/button")
	public static WebElement  postingDetailsEpandBtn;

	@FindBy(xpath="//*[@id='BodyTabMenu']")
	public static WebElement  editScreenBodyTab;

	@FindBy(xpath="//a[contains(text(),'Footer')]")
	public static WebElement  editScreenFooterTab;  


	@FindBy(xpath="//*[@id='editScreen_tabContent']//nav/div/div/ul//li[1]")
	public static WebElement editScreenaddBtn;

	@FindBy(xpath="//*[@id='editScreen_tabContent']/div/div[1]/div[1]/a[1]/i")
	public static WebElement editScreenLoadFieldsBtn;



	@FindBy(xpath="//button[@id='btnEditScreenPrev']")
	public static WebElement editScreenPreviousBtn;  

	@FindBy(xpath="//button[@id='btnEditScreenNext']")
	public static WebElement editScreenNextBtn;  


	@FindBy(xpath="//select[@id='cmbBehaviour']")
	public static WebElement editScreenBehaviourDropdown;

	@FindBy(xpath="//input[@id='editScreen_qtyPreLoaded_textbox']")
	public static WebElement editScreenQuantityPreloadedTxt;


	@FindBy(xpath="//*[@id='editScreen_qtyFormula_textbox']")
	public static WebElement  editScreenformulaTxt;



	@FindBy(xpath="//a[contains(text(),'Field Details')]")
	public static WebElement editScreenFieldDetailsTab;


	@FindBy(xpath="(//*[@id='tbProperty'])[2]")
	public static WebElement editScreenExternalModulesTab; 


	@FindBy(xpath="//a[contains(text(),'Properties')]")
	public static WebElement editScreenPropertiesTab; 


	@FindBy(xpath="//*[@id='dvCustomizeEditScreenField']/div[2]/div/div[3]/input[1]")
	public static WebElement editScreenApplyBtn;  

	@FindBy(xpath="//*[@id='editScreen_FieldsCustomization_Close']/i")
	public static WebElement editScreencloseBtnInDc; 



	@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_behaviour']")
	public static WebElement editScreenAddFieldsBehaviourDropdown;


	@FindBy(xpath="//*[@id='editScreen_bodyrow_2 _1']//span[1]")
	public static WebElement editScreenSecondRowEdit;

	@FindBy(xpath="//*[@id='editScreen_bodyTable']/tbody/tr[2]/td/span[2]")
	public static WebElement editScreenSecondRowDelete;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_Formula_textbox']")
	public static WebElement  editScreenAddBehaviourformulaTxt;

	@FindBy(xpath="//*[@id='editScreen_FieldsCustomization_Formula_formulaText']")
	public static WebElement  editScreenAddBehaviourformulaTxtTxt;

	@FindBy(xpath="//*[@id='editScreen_FieldsCustomization_PreLoad_formulaText']")
	public static WebElement  editScreenAddBehaviourPreloadTxtTxt;



	@FindBy(xpath="//*[@id='editScreen_FieldsCustomization_tabs']/li[3]/a")
	public static WebElement editScreenformattingTab;


	@FindBy(xpath="//*[@id='editScreen_footerrow_1 _1']//span[1]")
	public static WebElement editSCreenFooterFirsRowEdit;

	@FindBy(xpath="//*[@id='editScreen_footerrow_1 _1']//span[2]")
	public static WebElement editScreenFooterFirRowDelete;


	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_Caption']")
	public static WebElement  editScreenCaptionTxt;

	@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_DataType']")
	public static WebElement  editScreenCaptionDataTypeDropdown;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_DefaultValue']")
	public static WebElement editScreenDefaultValueTxt;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_noofDecimals']")
	public static WebElement editScreenNoOfDecimalsTxt;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_toolTip']")
	public static WebElement editScreenToolTipTxt;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_bannerText']")
	public static WebElement editScreenBannerTextTxt;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_MinValue']")
	public static WebElement editScreenMinimunValueTxt;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_MaxValue']")
	public static WebElement editScreenMaximunValueTxt;

	@FindBy(xpath="//*[@id='editLayout_copyFieldsOptFields']/label[1]/span")
	public static WebElement editLayoutLoadFields1stChkBox;

	@FindBy(xpath="//*[@id='editLayout_copyFieldsOptFields']/label[2]/span")
	public static WebElement editLayoutLoadFields2ndChkBox;

	@FindBy(xpath="//*[@id='editLayout_copyFieldsOptFields']/label[3]/span")
	public static WebElement editLayoutLoadFields3rdChkBox;


	@FindBy(xpath="//*[@id='navigationtab13']")
	public static WebElement  editScreenTabInDC; 


	@FindBy(xpath="//*[@id='editScreen_copyFieldsOptFields']/div/label")
	public static List<WebElement> editScreenloadFieldsList;


	@FindBy(xpath="//td[@id='editScreen_bodyrow_1 _1']//span[@id='editIcon']")
	public static WebElement  editScreenBody1stRowEditBtn; 

	@FindBy(xpath="//td[@id='editScreen_bodyrow_1 _1']//span[@id='deleteIcon']")
	public static WebElement  editScreenBody1stRowDeleteBtn; 


	@FindBy(xpath="//*[@id='panelsStayOpen-headingOne']/button")
	public static WebElement  inventorySettingsExpandBtn; 


	@FindBy(xpath="//*[@id='2049']")
	public static WebElement  newExcessInStockVoucher; 

	@FindBy(xpath="(//*[@id='panelsStayOpen-headingOne']/button)[2]")
	public static WebElement  vendorAccountSettingsExpandBtn; 

	@FindBy(xpath="//*[@id='panelsStayOpen-headingten']/button")
	public static WebElement AR_APExpandBtn;


	@FindBy(xpath="(//*[@id='panelsStayOpen-headingThree']/button)[2]")
	public static WebElement currencyExpandBtnInDc;


	@FindBy(xpath="//*[@id='panelsStayOpen-headingnine']/button")
	public static WebElement roundOffBehaviourExpandBtn;

	@FindBy(xpath="//*[@id='panelsStayOpen-headingeight']/button")
	public static WebElement applyDependyOnExpandBtn;

	@FindBy(xpath="//*[@id='panelsStayOpen-headingseven']/button")
	public static WebElement applyRulesOnExpandBtn;

	@FindBy(xpath="//*[@id='panelsStayOpen-headingsix']/button")
	public static WebElement restrictionExpandBtn;






	@FindBy(xpath="//*[@id='navigationtab5']")
	public static WebElement  externalFunctionsBtn;




	@FindBy(xpath="//button[@id='editScreen_FieldsCustomization_Formula_Ok']")
	public static WebElement  editScreenAddBehaviourFormulaokBtn;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_PreLoad_textbox']")
	public static WebElement editScreenPreloadTxt;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_PreLoad_textbox']")
	public static WebElement editScreenRestrictformulaTxt;

	@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_RoundOff']")
	public static WebElement editScreenRoundOffsDropdown;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_RoundOffTo']")
	public static WebElement editScreenRoundOffToTxt;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_RestrictMsg']")
	public static WebElement editScreenRestrictMessageTxt;

	@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_AddToNet']")
	public static WebElement editScreenAddToNetDropdown;

	@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_AddToStock']")
	public static WebElement EditScreenAddToStockDropDown;

	@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_Position']")
	public static WebElement editScreenpositionDropdown;  


	//DOC CUST VIEW TEST

	@FindBy(xpath="(//*[@id='panelsStayOpen-headingTwo']/button)[1]")
	public static WebElement TriggersExpandBtn;

	@FindBy(xpath="(//*[@id='panelsStayOpen-headingTwo']/button)[2]")
	public static WebElement ActionExpandBtn;

	@FindBy(xpath="(//*[@id='panelsStayOpen-headingTwo']/button)[3]")
	public static WebElement AlertExpandBtn;


	@FindBy(xpath="//*[@id='17_1_AdvanceFilter_']/table/tbody/tr/td[5]/input")
	public static WebElement  triggersValueTxtGetValue;


	@FindBy(xpath="//*[@id='17_1_AdvanceFilter_']/table/tbody/tr/td[1]/select")
	public static WebElement  triggersConjuctionDrpdwn;


	@FindBy(xpath="//*[@id='17_1_AdvanceFilter_']/table/tbody/tr/td[2]/input")
	public static WebElement  triggersSelectFieldTxt;


	@FindBy(xpath="//ul[@class='treeview filtertreedata col-xs-12']//li//a[@id='4']")
	public static WebElement  triggerVendorACExpansionBtn;

	//New Element For VendorACName 
	@FindBy(xpath="//ul[@class='treeview-menu col-xs-12']//li//a[@id='5002' and @data-parent = '4']")
	public static WebElement  triggerVendorAcName;

	@FindBy(xpath="//*[@id='17_1_AdvanceFilter_']/table/tbody/tr/td[3]/select")
	public static WebElement  triggersSelectOperdrpdwn;

	@FindBy(xpath="//*[@id='17_1_AdvanceFilter_']/table/tbody/tr/td[4]/select")
	public static WebElement  triggersCompareWithdrpdwn;

	@FindBy(xpath="//tbody//input[@placeholder='Value']")
	public static WebElement  triggersValueTxt;


	@FindBy(xpath="//input[@id='advancefilter_master_17_1']")
	public static WebElement  triggersValueToEnterTxt;


	@FindBy(xpath="//*[@id='trigger_Controlbuttons']/a[2]/i")
	public static WebElement  editLayoutTriggersSaveBtn;

	@FindBy(xpath="//*[@id='trigger_Controlbuttons']/a[1]/i")
	public static WebElement  editLayoutTriggerDeleteBtn;

	@FindBy(xpath="//*[@id='DocumentNumbering']/div/div/div/div[2]/label[1]")
	public static WebElement  docNumberAppearAsLabel;


	@FindBy(xpath="//*[@id='docNum_Table_head']/tr/th/div")
	public static List<WebElement>  docNumberingGridHeader;	

	@FindBy(xpath="//*[@id='docNum_Table_body']/tr/td")
	public static List<WebElement>  docNumberingGridBody;	

	@FindBy(xpath="//*[@id='docNum_documentNumberAs']")
	public static WebElement  docNumberAppearAsValue;

	//VIEWS

	@FindBy(xpath="(//*[@id='panelsStayOpen-headingOne']/button)[2]")
	public static WebElement  viewSettingsExpandBtn;

	@FindBy(xpath="//*[@id='panelsStayOpen-headingTwo']/button")
	public static WebElement  loginExpandBtn;

	@FindBy(xpath="(//*[@id='panelsStayOpen-headingThree']/button)[2]")
	public static WebElement  alwaysLoadDocumentFromExpandBtn;



	@FindBy(xpath="//*[@id='views_tabContent']/div/div/div[1]/a[1]/i")
	public static WebElement  viewsExportIcon;

	@FindBy(xpath="//*[@id='views_tabContent']/div/div/div[1]/a[2]/i")
	public static WebElement  viewImportIcon;

	@FindBy(xpath="//*[@id='views_tabContent']/div/div/div[1]/a[3]/i")
	public static WebElement  viewsInsertInformColmnIcon;

	@FindBy(xpath="//*[@id='views_tabContent']/div/div/div[1]/a[4]/i")
	public static WebElement  viewInformFiledIcon;

	@FindBy(xpath="//*[@id='views_tabContent']/div/div/div[1]/a[5]/i")
	public static WebElement  viewsCreateRuleIcon;

	@FindBy(xpath="//*[@id='views_tabContent']/div/div/div[1]/a[6]/i")
	public static WebElement  viewLoadDefaultsIcon;

	@FindBy(xpath="//*[@id='views_tabContent']/div/div/div[1]/a[7]/i")
	public static WebElement  viewsRefereshIcon;

	@FindBy(xpath="//*[@id='views_tabContent']/div/div/div[1]/a[8]/i")
	public static WebElement  viewsDeleteViewIcon;

	@FindBy(xpath="//*[@id='views_tabContent']/div/div/div[1]/a[9]/i")
	public static WebElement  viewSaveView;

	//To Get Fields List in Body Grid 
	@FindBy(xpath="//*[@id='views_FieldsTable']/tbody/tr/td[3]")
	public static List<WebElement>  viewsGridFiledsList;

	@FindBy(xpath="//*[@id='views_FieldsTable']/tbody/tr/td[1]")
	public static List<WebElement>  viewsGridFiledsEditList;


	@FindBy(xpath="//input[@id='views_existingViews']")
	public static WebElement  ViewExistingViewTxt;

	@FindBy(xpath="//*[@id='views_existingViews_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement  viewExistingSettingIcon;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseOne']/div[2]/div/label[1]/span")
	public static WebElement  viewsAuthorizeOnlyChkbox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseOne']/div[2]/div/label[2]/span")
	public static WebElement  viewBodyReadOnlyChkbox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseOne']/div[2]/div/label[3]/span")
	public static WebElement  viewHideNetFromSummaryChkbox;

	@FindBy(xpath="//ul[@id='id_documentcustomization_views_list_users']//li//label")
	public static List<WebElement>  viewsUsersList;

	//Roles Name Label List 
	@FindBy(xpath="//ul[@id='id_documentcustomization_views_list_roles']//li//label")
	public static List<WebElement>  viewsRolesList;



	@FindBy(xpath="//a[@id='769']")
	public static WebElement  purchaseVouchersNewVoucherBtn;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-1']")
	public static WebElement  mastersR1C1;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-2']")
	public static WebElement  mastersPositionR1C2;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-1']")
	public static WebElement  mastersR2C1;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-2']")
	public static WebElement  mastersPositionR2C2;


	@FindBy(xpath="//*[@id='panelsStayOpen-collapseOne']/div[6]/div/label[2]/span")
	public static WebElement  changeTransactionDateWhenAuthorizedChkBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseOne']/div[6]/div/label[3]/span")
	public static WebElement  dateCannotBePriortoPrevdateChkBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseOne']/div[7]/div/label[1]/span")
	public static WebElement  detailedDisplayInSummaryBarChkBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseOne']/div[7]/div/label[2]/span")
	public static WebElement  dontAllowEditThisDocChkBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseOne']/div[6]/div/label[4]/span")
	public static WebElement  dontAllowInputDateChkBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseOne']/label[2]/span")
	public static WebElement  dontRestrictAccount1TypeChkBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseOne']/label[3]/span")
	public static WebElement  dontRestrictAccount2TypeChkBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseOne']/label[4]/span")
	public static WebElement  dontRestrictOnLoginAccountChkBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseOne']/label[5]/span")
	public static WebElement  dontRestrictOnLoginTagChkBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseOne']/label[6]/span")
	public static WebElement  enableVersionChkBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseOne']/label[7]/span")
	public static WebElement  printUsingDefaultPrinterAndFormatChkBox;

	@FindBy(xpath="//select[@id='misc_chkCheckBudget']")
	public static WebElement  checkbudgetDropdown;

	@FindBy(xpath="//select[@id='misc_PickEmailFrom']")
	public static WebElement  pickEmailFromDropdown;

	// Restrictions Sections

	@FindBy(xpath="//input[@id='misc_restrictionRdStop']")
	public static WebElement  stopRadio;

	@FindBy(xpath="//input[@id='misc_restrictionRdwarnandAllow']")
	public static WebElement  warnAndAllowRadio;



	@FindBy(xpath="//*[@id='panelsStayOpen-collapseOne']/div[7]/div/label[3]/span")
	public static WebElement  dontpostCOGS;

	@FindBy(xpath="//*[@id='dvMisc_PostingSelectAccInLine']/span")
	public static WebElement selectAccountInEveryLineChkBox;

	@FindBy(xpath="//*[@id='id_misc_inputlocalexchangerate_section']/label/span")
	public static WebElement inputLocalExchangeRateChkBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseThree']/label[3]/span")
	public static WebElement postExchangeRateDifferrenceChkBox;


	// Apply Rules On	

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseseven']/div/div/label[1]/span")
	public static WebElement applyRulesOnExternalModuleChkbox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseseven']/div/div/label[2]/span")
	public static WebElement applyRulesOnLinkChkBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseseven']/div/div/label[3]/span")
	public static WebElement applyRulesOnSetItemsChkBox;

	//										Apply Dependency On

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseeight']/div/div/label[1]/span")
	public static WebElement applyDependencyOnExternalModuleChkbox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseeight']/div/div/label[2]/span")
	public static WebElement applyDependencyOnLinkChkBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseeight']/div/div/label[3]/span")
	public static WebElement applyDependencyOnSetItemsChkBox;


	// Posting Details	

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseTwo']/label[1]/span")
	public static WebElement updateFAChkBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseTwo']/label[1]/input")
	public static WebElement updateFAChkBoxSelected;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseTwo']/label[2]/span")
	public static WebElement selectAmountInEveryLineChkBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseTwo']/label[3]/span")
	public static WebElement detailedPostingChkbox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseTwo']/label[4]/span")
	public static WebElement updateStockChkBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseTwo']/label[5]/span")
	public static WebElement allowChangingUpdateStock;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseTwo']/label[6]/span")
	public static WebElement postServicetaxChkBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseTwo']/label[7]/span")
	public static WebElement postTDSchkBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseTwo']/label[8]/span")
	public static WebElement postVATchkBox;

	@FindBy(xpath="//*[@id='dvMisc_PostingLinkToLetterOfCredit']/label/span")
	public static WebElement linkToLetterOfCreditChkBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseTwo']/label[9]/span")
	public static WebElement dontcheckcreditlimitChkBox;

	// Currency	

	@FindBy(xpath="//select[@id='misc_CurrencyAddCurrencyIn']")
	public static WebElement addCurrencyInDropdown;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseThree']/label[2]/span")
	public static WebElement inputExchangeRateChkBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseThree']/label[3]/span")
	public static WebElement postExchangeRateChkDifferrenceBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseThree']/label[4]/span")
	public static WebElement postExchangeRateDifferenceBasedOnStandardRuleChkBox;

	// AR/AP	


	@FindBy(xpath="//select[@id='misc_arapDueDate']")
	public static WebElement dueDateDropdown;

	@FindBy(xpath="//select[@id='misc_arapARAPOptions']")
	public static WebElement arapOptionsDropdown;

	@FindBy(xpath="//select[@id='misc_arapOptions']")
	public static WebElement optionsdDropdown;

	@FindBy(xpath="//input[@id='misc_arapchkSelectbillsbeforeamt']")
	public static WebElement selectbillsbeforeAmountChkBox;

	@FindBy(xpath="//*[@id='panelsStayOpen-collapseten']/div/div/label[4]/span")
	public static WebElement postDiscountBasedOnCrediDaysChkBox;

	@FindBy(xpath="//*[@id='dvMisc_arapchkInputPaymentTerms']/label/span")
	public static WebElement inputPaymenttermsChkBox;

	@FindBy(xpath="//select[@id='misc_arapNarration']")
	public static WebElement narrationDropdown;

	@FindBy(xpath = "//*[@id='EditLayout_FieldsCustomization_FieldDetails_DataType']")
	public static WebElement fieldDetails_DataTypeDrpdwn;

	@FindBy(xpath = "//*[@id='editScreen_FieldsCustomization_DefaultValue']")
	public static WebElement fieldDetails_DefaultValueTxt;

	@FindBy(xpath = "//*[@id='views_PopupDiv']/div/div[1]/div/span[1]/i")
	public static WebElement fieldDetails_ApplyBtn;

	@FindBy(xpath = "//div[@id='views_tabContent']//tr[2]//td[1]//span[1]")
	public static WebElement viewGridRow2EditBtn;

	//DOC CUST VIEW TEST


	//configure master test



	@FindBy(xpath="//div[@id='myNavbar']/ul/li/a")
	public static List<WebElement> configMastersRibbonControl;

	@FindBy(xpath="//*[@id='MasterTabs']//li//a")
	public static List<WebElement> configMastersHeaderList;





	@FindBy(xpath="//select[@id='ddlModule']")
	public static WebElement moduleDropdown;

	@FindBy(xpath="//input[@id='txtMasterName']")
	public static WebElement nameComboBox;

	@FindBy(xpath="//tbody[@id='txtMasterName_table_body']/tr/td[2]")
	public static List<WebElement> nameComboBoxList;

	@FindBy(xpath="//input[@id='txtMasterCaption']")
	public static WebElement captionTxt;

	@FindBy(xpath="//input[@id='rdoSearchByName_master']")
	public static WebElement searchByNameRadioBtn;

	@FindBy(xpath="//input[@id='rdoSearchByCode_master']")
	public static WebElement searchByCodeRadioBtn;

	@FindBy(xpath="//*[@id='firstsub']/div[4]/div/div[1]/div/label/span")
	public static WebElement allowReservationChkBox;

	@FindBy(xpath="//*[@id='firstsub']/div[4]/div/div[2]/div/label/span")
	public static WebElement defaultChkBox;

	@FindBy(xpath="//*[@id='firstsub']/div[5]/div/div[1]/div/label/span")
	public static WebElement groupMandatoryChkBox;

	@FindBy(xpath="//*[@id='firstsub']/div[5]/div/div[2]/div/label/span")
	public static WebElement pickCodeChkBox;


	@FindBy(xpath="//thead//tr[@class='theadHeight']//th")
	public static List<WebElement> showDependencyHeader;

	@FindBy(xpath="//*[@id='liDependency_tab']")
	public static WebElement dependentTab;

	@FindBy(xpath="//*[@id='liDependencyUsed_tab']")
	public static WebElement usedTab;

	@FindBy(xpath="//*[@id='MasterMenus_div']/div/div[1]/div[2]/div/table/tbody/tr/td/i")
	public static WebElement menuMinimizeBtn;

	@FindBy(xpath="//*[@id='InfoPaneldv']/div/div/table/tbody/tr/td/i")
	public static WebElement menuExpansionBtn;


	@FindBy(xpath="//*[@id='MasterTabs']//li[1]")
	public static WebElement definitionTab;

	@FindBy(xpath="//*[@id='MasterTabs']//li[2]")
	public static WebElement customizationTab;

	@FindBy(xpath="//*[@id='MasterTabs']//li[3]")
	public static WebElement viewsTab;

	@FindBy(xpath="//*[@id='MasterTabs']//li[4]")
	public static WebElement treeCustomizationTab;



	@FindBy(xpath="//*[@id='btnSave_ConfigureMasters']/a/i")
	public static WebElement cmSaveBtn;

	@FindBy(xpath="//*[@id='btnClose_ConfigureMasters']")
	public static WebElement cmCloseBtn;

	@FindBy(xpath="//li[@id='mMenu1']/a/i")
	public static WebElement homeMenuExpandBtn;

	@FindBy(xpath="//li[@id='mMenu1000']/a/i")
	public static WebElement masterMenuExpandBtn;

	@FindBy(xpath="//*[@id='1000']")
	public static WebElement masterMenuBtn;

	@FindBy(xpath="//*[@id='accordionExample']/div[2]/input[1]")
	public static WebElement addGroupBtnInconfigureMaster;

	@FindBy(xpath="//*[@id='accordionExample']/div[2]/input[2]")
	public static WebElement deleteGroupBtnInconfigureMaster;

	@FindBy(xpath="//*[@id='txtNewGroupName']")
	public static WebElement groupNameTxt;

	@FindBy(xpath="//*[@id='btnAddGroup_Ok']")
	public static WebElement okBtnInAddgroupPopup;

	@FindBy(xpath="//*[@id='btnAddGroup_Cancel']")
	public static WebElement cancelBtnInAddgroupPopup;



	@FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr/td[4]")
	public static List<WebElement> fieldCaptionTxtList;

	@FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr/td[1]/i[1]")
	public static List<WebElement> editFieldList;

	@FindBy(xpath="//*[@id='ExtraField_Tabs']/li[2]/a")
	public static WebElement extraFields_PropertiesTabb;	

	@FindBy(xpath="//input[@id='FieldsDetails_IsMandatory']//following-sibling::span")
	public static WebElement extraFields_PropertiesMandatoryChekbox;


	@FindBy(xpath="//table[@id='landgridData']//th//span")
	public static List<WebElement> tableHeaderList;

	@FindBy(xpath="//*[@id='divBtnGroup1']")
	public static WebElement newlyAddedcreatetab;

	@FindBy(xpath="//*[@id='ItemMasterfield']")
	public static WebElement itemMasetrdropDownTxt;

	@FindBy(xpath="//*[@id='Text']")
	public static WebElement txtFieldTxt;

	@FindBy(xpath="//input[@data-field = 'Text']/following-sibling::span")
	public static WebElement textcheckBox;

	@FindBy(xpath="//*[@id='ConfigureMasters_GridCustomization_Modal']/div[1]/div[2]/ul/li/a/i")
	public static WebElement okBtnInTreeCustomization;




	@FindBy(xpath="//*[@id='btnCreateTab_MCust']")
	public static WebElement createTabBtn;

	@FindBy(xpath="//*[@id='masterCustomizingTabList']/div[2]/div/ul/li[3]/a")
	public static WebElement createTabInList;

	@FindBy(xpath="//*[@id='txtNewTabCaption']")
	public static WebElement tabCaptionTxt;

	@FindBy(xpath="//*[@id='MCustomize_CreateTab_Modal']/div[2]/div/div[3]/div/input[1]")
	public static WebElement okBtnInTabDetails;

	@FindBy(xpath="//*[@id='btnAdd_Field_MasterCust']/a/i")
	public static WebElement addFieldBtn;

	@FindBy(xpath="//*[@id='ExtraField_FieldCaption']")
	public static WebElement FieldcaptionTxt;

	@FindBy(xpath="//select[@id='ddlDatatype_ExtraField']")
	public static WebElement dataTypeDropdown;

	@FindBy(xpath="//*[@id='ExtraField_MasterToLink']")
	public static WebElement extraField_FieldDetailsMasterToLinkDropDown;

	@FindBy(xpath="//*[@id='btnSaveRule']/a/i")
	public static WebElement okBtnInFieldCreation;

	@FindBy(xpath="//*[@id='ul_details_TreeCust']/li[6]/div/label/span")
	public static WebElement createdByCheckbx;

	@FindBy(xpath="//*[@id='ul_details_TreeCust']/li[7]/div/label/span")
	public static WebElement createdDateCheckbx;


	@FindBy(xpath="(//*[@id='btnCloseMasterCutomizationFromMasterScreen']/a/i)[1]")
	public static WebElement closeBtnInCreateTab;


	@FindBy(xpath="//*[@id='GridCustomizeTblBody']/tr[4]/td//input")
	public static WebElement createdByChckbx; 

	@FindBy(xpath="//*[@id='GridCustomizeTblBody']/tr[5]/td//input")
	public static WebElement modifiedbyChckbx; 

	@FindBy(xpath="//*[@id='btnOk']")
	public static WebElement okbtnIncustomizePopup;


	@FindBy(xpath="//*[@id='btnCreateTab_MCust']")
	public static WebElement createTabBtnIncustomizationMstr;

	@FindBy(xpath="//span[text()='GroupMaster']")
	public static WebElement groupmasterInMastersList;

	@FindBy(xpath="//span[text()='ChildMaster']")
	public static WebElement childmasterUnderGrpMstr;



	@FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules']")
	public static WebElement MasterRules_RuleNameText ;

	@FindBy(xpath="//*[@id='chkListApplyOn_MasterRules']/div/div[1]/div/div/label/span")
	public static WebElement MasterRules_CreatingGroupChekbox ;

	@FindBy(xpath="//*[@id='chkListApplyOn_MasterRules']/div/div[2]/div/div/label/span")
	public static WebElement	MasterRules_NewRecordChekbox ;

	@FindBy(xpath="//*[@id='chkListApplyOn_MasterRules']/div/div[3]/div/div/label/span")
	public static WebElement MasterRules_EditChekbox ;

	@FindBy(xpath="//*[@id='chkListEvaluateOn_MasterRules']/div/div[1]/div/div/label/span")
	public static WebElement MasterRules_LoadChekbox ;

	@FindBy(xpath="//*[@id='chkListEvaluateOn_MasterRules']/div/div[4]/div/div/label/span")
	public static WebElement	MasterRules_BeforeSaveChekbox ;

	@FindBy(xpath="//*[@id='chkListEvaluateOn_MasterRules']/div/div[2]/div/div/label/span")
	public static WebElement MasterRules_OnLeaveChekbox ;

	@FindBy(xpath="//*[@id='chkListEvaluateOn_MasterRules']/div/div[5]/div/div/label/span")
	public static WebElement MasterRules_BeforeDeleteChekbox ;

	@FindBy(xpath="//*[@id='chkListEvaluateOn_MasterRules']/div/div[3]/div/div/label/span")
	public static WebElement MasterRules_OnEnterChekbox ;

	@FindBy(xpath="//*[@id='chkListStatus_MasterRules']/div/div[1]/div/div/label/span")
	public static WebElement masterRules_ActiveChekbox ;

	@FindBy(xpath="//*[@id='Conditions-Context_Menu_MasterRules']/li[3]/div/label/span")
	public static WebElement masterRules_NoConditionChekbox;


	@FindBy(xpath="//*[@id='btnExport_ConfigureMasters']/a/i")
	public static WebElement cmExportBtn;

	@FindBy(xpath="//*[@id='AllExportImportMasters']/div/div/div/label")
	public static List<WebElement> cmExportList;

	@FindBy(xpath="//*[@id='ExportMasters_Modal']/div[2]/div/div[3]/div/input[1]")
	public static WebElement cmFooterExportBtn;



	//configure master test


	//Setting wiz


	@FindBy(xpath="//*[@id='0']")
	public static WebElement generalInSettingwizard;

	@FindBy(xpath="//*[@id='1' and text()='VAT']")
	public static WebElement vatInSettingwizard;

	@FindBy(xpath="//*[@id='SettingWizardUL']/li[8]")
	public static WebElement posInSettingwizard;

	@FindBy(xpath="//*[@id='3' and text()='Inventory']")
	public static WebElement inventoryInSettingwizard;

	@FindBy(xpath="//*[@id='4' and text()='Financial']")
	public static WebElement financialInSettingwizard;

	@FindBy(xpath="//*[@id='5' and text()='TDS']")
	public static WebElement tdsInSettingwizard;

	@FindBy(xpath="//*[@id='7' and text()='WMS']")
	public static WebElement wmsInSettingwizard;

	@FindBy(xpath="//*[@id='8' and text()='GST']")
	public static WebElement gstInSettingwizard;

	@FindBy(xpath="//*[@id='9' and text()='MRP1']")
	public static WebElement mrpOneInSettingwizard;

	@FindBy(xpath="//*[@id='10' and text()='MRP2']")
	public static WebElement mrpTwoInSettingwizard;


	@FindBy(xpath="//*[@id='SettingWizardUL']/li")
	public static List<WebElement> settingWizardULList;


	@FindBy(xpath="//*[@id='dvRightSettingWizard']/div/div[1]/div[1]/label/span")
	public static WebElement  settingsWizardVATActivateVATChkbox;

	@FindBy(xpath="//*[@id='dvRightSettingWizard']/div/div[1]/div[1]/label/input")
	public static WebElement  settingsWizardVATActivateVATChkboxSelected;

	@FindBy(xpath="//*[@id='dvRightSettingWizard']/div/div[2]/div[1]/div/div/label")
	public static List<WebElement> settingsWizardVATVouchersList;

	@FindBy(xpath="//*[@id='dvRightSettingWizard']/div/div[2]/div[1]/div/div/label/span")
	public static List<WebElement> settingsWizardVATVoucherChkboxList;

	@FindBy(xpath="//*[@id='dvRightSettingWizard']/div/div[2]/div[1]/div/div/label/input")
	public static List<WebElement> settingsWizardVATVoucherChkboxListSelected;

	@FindBy(xpath="//*[@id='dvSelectedVouchers']//label")
	public static List<WebElement> settingsWizardVATSelectedVouchersList;

	@FindBy(xpath="//*[@id='dvSelectedVouchers']")
	public static WebElement settingsWizardVATSelectedVouchersListEmpty;


	@FindBy(xpath="//*[@id='navbarSupportedContent2']/ul/li[1]/a/i")
	public static WebElement settingsWizardUpdateBtn;

	@FindBy(xpath="//*[@id='navbarSupportedContent2']/ul/li[2]/a/i")
	public static WebElement settingsWizardVAtCloseBtn;

	@FindBy(xpath="//*[@id='dvRightSettingWizard']/div/div[3]/div[2]/label/span")
	public static WebElement settingsWizardVATInclusiveChkbox;

	@FindBy(xpath="//tbody[@id='LandingGridBody']/tr/td[10]")
	public static List<WebElement> nameList;

	@FindBy (xpath="//*[@id='navigation_menu']/li[1]/ul/li[6]/ul//li")
	public static List<WebElement> utilitesList;

	@FindBy(xpath="//a[@id='20']//span[contains(text(),'Utilities')]")
	public static WebElement  utilities;

	@FindBy(xpath="//input[@id='OptProductId']")
	public static WebElement standardRateItemCombo;

	@FindBy(xpath="//input[@id='txtEffectiveDate']")
	public static WebElement standardRateEffectiveDateTxt;

	@FindBy(xpath="//input[@id='txtrate']")
	public static WebElement standardRateRateTxt;

	@FindBy(xpath="//*[@id='id_EdtAdd']/a/i")
	public static WebElement standardRateAddBtn;


	@FindBy(xpath="//tbody[@id='OptProductId_table_body']/tr/td[2]")
	public static List<WebElement> standardRateItemComboList;



	@FindBy(xpath="//*[@id='id_StandardRate_col_1-2']")
	public static WebElement standardRateTableRow1EffectiveDate;

	@FindBy(xpath="//*[@id='id_StandardRate_col_1-3']")
	public static WebElement standardRateTableRow1Rate;

	@FindBy(xpath="//td[@id='id_StandardRate_col_2-2']")
	public static WebElement standardRateTableRow2EffectiveDate;

	@FindBy(xpath="//td[@id='id_StandardRate_col_2-3']")
	public static WebElement standardRateTableRow2Rate;

	@FindBy(xpath="//*[@id='btnEdit_Id_1']")
	public static WebElement standardRateEditRow1;

	@FindBy(xpath="//*[@id='navbarSupportedContent2']/ul/li[3]/a/i")
	public static WebElement closeBtnInStandardRate;


	@FindBy(xpath="//*[@id='257']/span")
	public static WebElement  settingsVATTaxCode;

	@FindBy(xpath="//tbody[@id='grid_VatTaxCode_body']/tr[1]/td[3]")
	public static WebElement  vatTaxCodeBodyGrid;

	@FindBy(xpath="//*[@id='navbarSupportedContent2']/ul/li[2]/a/i")
	public static WebElement  vatTaxCodeImportBtn;

	/*@FindBy(xpath="//span[@class='icon-exportexcel icon-font7']")
															public static WebElement  vatTaxCodeExportBtn;*/

	@FindBy(xpath="//*[@id='navbarSupportedContent2']/ul/li[3]/a")
	public static WebElement  vatTaxCodeExportBtn;

	@FindBy(xpath="//*[@id='navbarSupportedContent2']/ul/li[1]/a/i")
	public static WebElement  vatTaxCodeSaveBtn;

	@FindBy(xpath="//*[@id='navbarSupportedContent2']/ul/li[5]/a/i")
	public static WebElement  vatTaxCodeCloseBtn;


	@FindBy(xpath="//*[@id='ulSheetData']/li")
	public static WebElement  vatTaxCodeSelectSheetList;

	@FindBy(xpath="//button[@id='btnSheetOk']")
	public static WebElement  vatTaxCodeSelectSheetOkBtn;



	@FindBy(xpath="//a[@id='25']//span[contains(text(),'Data Management')]")
	public static WebElement  dataManagementMenu;

	@FindBy(xpath="//*[@id='dvReindex']/div[1]/div/nav/div/nav/ol/li[3]")
	public static WebElement  reindexMenu;

	@FindBy(xpath="//*[@id='dvReindex']/div[2]/div/div[2]/div[2]/label/span")
	public static WebElement  fullReindexChkBox;

	@FindBy(xpath="//*[@id='btnSave']/i")
	public static WebElement  reindexOkBtn;

	@FindBy(xpath="//*[@id='CancelCreateProfile']/i")
	public static WebElement  reindexCancelBtn;


	//Setting wiz


	//

	//Password Policy Menu
	@FindBy (xpath="//*[@id='8']/span")
	public static WebElement passwordPolicySubMenu;

	//Password Policy Screen Title
	@FindBy (xpath="//*[@id='page_Content']/div/div/div[1]/div/nav/div/nav/ol/li[3]")
	public static WebElement passwordPolicyTitle;



	@FindBy (xpath="//*[@id='7']/span")
	public static WebElement networkPolicy;

	@FindBy (xpath="//*[@id='page_Content']/div/div/div[1]/div/nav/div/nav/ol/li[3]")
	public static WebElement networkPolicyTitle;

	@FindBy (xpath="//*[@id='allow']")
	public static WebElement allowRadioBtnInNetworkPolicy;

	@FindBy (xpath="//*[@id='blocked']")
	public static WebElement blockRadioBtnInNetworkPolicy;
	@FindBy (xpath="//*[@id='From']")
	public static WebElement fromIp;

	@FindBy (xpath="//*[@id='To']")
	public static WebElement toIp;

	@FindBy (xpath="//*[@id='addbtn']")
	public static WebElement addIp;

	@FindBy (xpath="//*[@id='clearbtn']")
	public static WebElement clearIp;

	@FindBy (xpath="//*[@id='btnSave']/i")
	public static WebElement saveBtnInNetworkPolicy;

	@FindBy (xpath="//*[@id='addbtn']/i")
	public static WebElement updateBtnInNetworkPolicy;

	@FindBy (xpath="//*[@id='CancelNetworkPolicy']/i")
	public static WebElement closeBtnInNetworkPolicy;

	//Password Policy AddBtn
	@FindBy (xpath="//*[@id='addPasswordPolicybtn']/i")
	public static WebElement passwordPolicyAddBtn;

	//Password Policy DeleteBtn
	@FindBy (xpath="//*[@id='controlBtns']/span[2]/i")
	public static WebElement passwordPolicyDeletebtn;

	//Password Policy CancelBtn
	@FindBy (xpath="//*[@id='controlBtns']/span[3]/i")
	public static WebElement passwordPolicyCancelBtn;

	//Password Policy SaveBtn
	@FindBy (xpath="//*[@id='btnSave']/i")
	public static WebElement passwordPolicySaveBtn;

	//Password Policy SaveBtnone
	@FindBy (xpath="//span[@id='btnSaveId']")
	public static WebElement pPSaveBtn;

	//Password Policy CloseBtn
	@FindBy (xpath="//*[@id='CancelPasswordPolicy']/i")
	public static WebElement passwordPolicyCloseBtn;

	//Password Policy policyName
	@FindBy (xpath="//*[@id='policyName']")
	public static WebElement policyName;

	//Password Policy passwordLength
	@FindBy (xpath="//*[@id='MinPassLength']")
	public static WebElement passwordLength;

	//Password Policy passwordComplexity
	@FindBy (xpath="//*[@id='complexity']")
	public static WebElement passwordComplexity;

	//Password Policy doNotAllowPreviousPassword
	@FindBy (xpath="//*[@id='Donotallprevious']")
	public static WebElement doNotAllowPrevious;

	//Password Policy passwordExpiryDays
	@FindBy (xpath="//*[@id='passwordexpirydays']")
	public static WebElement passwordExpiryDays;

	//Password Policy List
	@FindBy (xpath="//*[@id='PolicyListDiv']")
	public static WebElement passwordPolicyList;


	@FindBy(xpath="//ul[@id='PolicyListDiv']/li")
	public static List<WebElement> passwordPolicyNameLists;


	//Password Policy passwordOTPExpiryInMins
	@FindBy (xpath="//*[@id='OTPexpiryinminute']")
	public static WebElement passwordExpiryInMins;

	//Password Policy passwordInvalidAttempts
	@FindBy (xpath="//*[@id='NoOfInvalidAttemps']")
	public static WebElement passwordInvalidAttempts;

	//Password Policy passwordLockOut
	@FindBy (xpath="//*[@id='Lockoutperiod']")
	public static WebElement passwordLockOut;

	//Password Policy passwordLockOutUnits
	@FindBy (xpath="//*[@id='Units']")
	public static WebElement passwordLockOutUnits;

	//Password Policy sendMailCheck
	@FindBy (xpath="//*[@id='PolicyDiv']/div[9]/div[1]/label/span")
	public static WebElement sendMailCheck;

	//Password Policy sendMailOnSuccess
	@FindBy (xpath="//*[@id='PolicyDiv']/div[10]/div[1]/label/span")
	public static WebElement sendMailOnSuccess;


	//Password Policy sendMailOnFailure
	@FindBy (xpath="//*[@id='PolicyDiv']/div[11]/div[1]/label/span")
	public static WebElement sendMailOnFailure;

	//Password Policy sendMailOnFailure
	@FindBy (xpath="//*[@id='PolicyDiv']/div[12]/div/label/span")
	public static WebElement changePasswordAfterFirstLogin;

	//Password Policy sendMailOnFailure
	@FindBy (xpath="//*[@id='PolicyDiv']/div[13]/div/label/span")
	public static WebElement cannotChangePassword;

	//Password Policy sendMailOnFailure
	@FindBy (xpath="//*[@id='PolicyDiv']/div[14]/div/label/span")
	public static WebElement otpBasedLogin;


	@FindBy(xpath="//*[@id='btnSave']/i")
	public static WebElement  createProfileSaveIcon; 

	@FindBy(xpath="//*[@id='deleteBtn']/i")
	public static WebElement  createProfileDeleteIcon; 

	@FindBy(xpath="//*[@id='CancelCreateProfile']/i")
	public static WebElement  createProfileCloseIcon; 

	@FindBy(xpath="//*[@id='controlBtns']/div/span[1]/i")
	public static WebElement  createProfileSelectAllIcon; 

	@FindBy(xpath="//*[@id='controlBtns']/div/span[2]/i")
	public static WebElement  createProfileUnSelectAllIcon; 


	@FindBy(xpath="//*[@id='Profilemenu']/li[8]/ul//li")
	public static List<WebElement> settingsExpansionOptionsList;

	@FindBy(xpath="//*[@id='Profilemenu']/li[1]/ul//li")
	public static List<WebElement> homeExpansionMenusList;

	@FindBy(xpath="//*[@id='Profilemenu']/li[2]/ul//li")
	public static List<WebElement> financialsExpansionMenusList;

	@FindBy(xpath="//*[@id='Profilemenu']/li[3]/ul//li")
	public static List<WebElement> inventoryExpansionMenusList;

	@FindBy(xpath="//*[@id='Profilemenu']/li[5]/ul//li")
	public static List<WebElement> productionExpansionMenusList;

	@FindBy(xpath="//*[@id='Profilemenu']/li[6]/ul//li")
	public static List<WebElement> pointOfSaleExpansionMenusList;

	@FindBy(xpath="//*[@id='Profilemenu']/li[7]/ul//li")
	public static List<WebElement> qualityControlExpansionMenusList;

	@FindBy(xpath="//select[@id='passwordPolicy']")
	public static WebElement  createRolePasswordPolicyDropdown; 

	@FindBy(xpath="//*[@id='btnSave']/i")
	public static WebElement  createRoleSaveicon; 

	@FindBy(xpath="//*[@id='btndelete']")
	public static WebElement  createRoleDeleteIcon; 

	@FindBy(xpath="//*[@id='CancelCreateUser']/i")
	public static WebElement  createRoleCloseIcon; 



	@FindBy(xpath="//a[contains(text(),'Assigned Profiles')]")
	public static WebElement  assignedProfilesTab;

	@FindBy(xpath="//a[contains(text(),'Additions')]")
	public static WebElement  additionTab;

	@FindBy(xpath="//a[contains(text(),'Exclusions')]")
	public static WebElement  exclusionsTab;

	/*	@FindBy(xpath="//a[contains(text(),'Restriction for entry')]")
			public static WebElement  restrictionforEntryTab;*/

	@FindBy(xpath="//a[contains(text(),'Restriction for trees')]")
	public static WebElement  restrictionforTreesTab;

	@FindBy(xpath="//a[contains(text(),'Transaction Rights')]")
	public static WebElement  transactionRightsTab;

	@FindBy(xpath="//a[contains(text(),'AI Rights')]")
	public static WebElement  AIRightsTab;


	@FindBy(xpath="//*[@id='profileAdditionbtns']/div[1]/span")
	public static WebElement  CreateRoleAssignAllToRight;

	@FindBy(xpath="//*[@id='profileAdditionbtns']/div[2]/span")
	public static WebElement  CreateRoleAssignSelectedToRight;

	@FindBy(xpath="//*[@id='profileAdditionbtns']/div[3]/span")
	public static WebElement  CreateRoleAssignSelectedToLeft;

	@FindBy(xpath="//*[@id='profileAdditionbtns']/div[4]/span")
	public static WebElement  CreateRoleAssignAllToLeft;

	@FindBy(xpath="//ul[@id='availableProfiles']")
	public static WebElement  availableProfilesArea;

	@FindBy(xpath="//ul[@id='assignedProfiles']")
	public static WebElement  assignedProfilesArea;

	@FindBy(xpath="//*[@id='Addmenu']/li[2]/ul//li/a")
	public static List<WebElement> additionTabFinancialsMenuList;

	@FindBy(xpath="//*[@id='Addmenu']/li[2]/ul/li[1]/a")
	public static WebElement additionTabFinancialsTransaction;

	@FindBy(xpath="//*[@id='Addmenu']/li[2]/ul/li[1]/ul//li/a")
	public static List<WebElement> additionTabFinancialsTransactionMenusList;

	@FindBy(xpath="//*[@id='Addmenu']/li[2]/ul/li[1]/ul/li[2]/ul//li/a")
	public static List<WebElement> additionTabFinancialsTransactionsPurchasesMenusList;


	@FindBy(xpath="//*[@id='TransactionRights']/div/div/div[1]/div[1]/div[2]/label/span")
	public static WebElement allowBillWiseOnAccountChkBox;

	@FindBy(xpath="//select[@id='BudgetLimitWarning']")
	public static WebElement budgetLimitWarningDropdown;

	@FindBy(xpath="//select[@id='CreditLimitWarning']")
	public static WebElement creditLimitWarningDropdown;

	@FindBy(xpath="//select[@id='NegativeCashCheck']")
	public static WebElement negativeCashCheckDropdown;

	@FindBy(xpath="//select[@id='NegativeStockCheck']")
	public static WebElement negativeStockCheckDropdown;

	@FindBy(xpath="//*[@id='editOptionDiv']/div[2]/label/span")
	public static WebElement cantaddfutureTransChkbox;

	@FindBy(xpath="//input[@id='CantAdTransThtAremrethan']")
	public static WebElement cannotAddTransThatAreMoreThanTxt;

	@FindBy(xpath="//input[@id='CantEditPrevTransaremorethn']")
	public static WebElement cannotEditPreviousMonthEntriesAfterTxt;

	@FindBy(xpath="//input[@id='CantEditTranstharemorethn']")
	public static WebElement CantEditTransthatAreremorethanTxt;

	@FindBy(xpath="//input[@id='CantAddPrevMnthEntriesaft']")
	public static WebElement CantAddPrevMnthEntriesaftTxt;

	@FindBy(xpath="//input[@id='CantPrintAfterValue']")
	public static WebElement CantPrintAfterValueTxt;

	@FindBy(xpath="//select[@id='CantPrintAfterOption']")
	public static WebElement cantPrintAfterValueDropdown;

	@FindBy(xpath="//input[@id='CantRe-PrintAfterValue']")
	public static WebElement CantRePrintAfterValueTxt;

	@FindBy(xpath="//select[@id='CantRe-PrintAfterOption']")
	public static WebElement CantRePrintAfterDropdown;

	@FindBy(xpath="//*[@id='editOptionDiv']/div[9]/label/span")
	public static WebElement doNotAllowMasterCustomization;


	// Restriction for trees Tab
	@FindBy(xpath="//div[@id='RestrictionTreeMasters']/ul/li")
	public static List<WebElement> createRoleRestrictionForTreesTabMastersList;

	@FindBy(xpath="//*[@id='RestrictionTreeMastersTree']/li/label[text()='Default ']//span")
	public static WebElement restrictionForTreesTabDefaultChkBox;

	// AI Rights
	@FindBy(xpath="//*[@id='AIRights']/div/div/div[1]/div[1]/label/span")
	public static WebElement AIRightsEnableVUIChkBox;

	@FindBy(xpath="//*[@id='AIRights']/div/div/div[1]/div[2]/label/span")
	public static WebElement AIRightsEnableAIChkBox;

	@FindBy(xpath="//*[@id='AIRights']/div/div/div[1]/div[3]/label/span")
	public static WebElement doNotApplyTheTagResTrictionToTheResultsChkBox;

	@FindBy(xpath="//input[@id='Noofvoicecommandspermitted']")
	public static WebElement NoOfVoiceCommandsPermittedTxt;

	@FindBy(xpath="//input[@id='Nooftextcommandspermitted']")
	public static WebElement NoOfTextCommandsPermittedTxt;

	@FindBy(xpath="//*[@id='Modules']/div[1]/label/span")
	public static WebElement AIRightsSalesChkBox;

	@FindBy(xpath="//*[@id='Modules']/div[2]/label/span")
	public static WebElement AIRightsSalesOrderChkBox;

	@FindBy(xpath="//*[@id='Modules']/div[3]/label/span")
	public static WebElement AIRightsStockChkBox;

	@FindBy(xpath="//*[@id='Modules']/div[4]/label/span")
	public static WebElement AIRightsPurchasesChkBox;

	@FindBy(xpath="//*[@id='Modules']/div[5]/label/span")
	public static WebElement AIRightsPurchasesOrdersChkBox;

	@FindBy(xpath="//*[@id='Modules']/div[6]/label/span")
	public static WebElement AIRightsAccountsReceivablesChkBox;

	@FindBy(xpath="//*[@id='Modules']/div[7]/label/span")
	public static WebElement AIRightsAccountsPayablesChkBox;

	@FindBy(xpath="//*[@id='Modules']/div[8]/label/span")
	public static WebElement AIRightsFinanceChkBox;


	@FindBy(xpath="//*[@id='Addmenu']/li[1]/i")
	public static WebElement  addHomeExpandBtn; 

	@FindBy(xpath="//*[@id='Addmenu']/li[2]/i")
	public static WebElement  addFininicalExpandBtn; 

	@FindBy(xpath="//*[@id='Addmenu']/li[3]/i")
	public static WebElement  addInventoryExpandBtn; 

	@FindBy(xpath="//*[@id='Addmenu']/li[4]/i")
	public static WebElement  addFixedAssestsExpandBtn; 

	@FindBy(xpath="//*[@id='Addmenu']/li[5]/i")
	public static WebElement  addProductionExpandBtn; 

	@FindBy(xpath="//*[@id='Addmenu']/li[6]/i")
	public static WebElement  addPointOfSaleExpandBtn; 

	@FindBy(xpath="//*[@id='Addmenu']/li[7]/i")
	public static WebElement  addQualityExpandBtn; 

	@FindBy(xpath="//*[@id='Addmenu']/li[8]/i")
	public static WebElement  addSettingExpandBtn; 


	//Master Buying and selling


	//Master Buying and selling

	@FindBy(xpath="//*[@id='221']/span")
	public static WebElement  homeMasterItemMenu;


	@FindBy(xpath="//*[@id='80']/span")
	public static WebElement  homeMasterItem_buyerPriceBookMenu;

	@FindBy(xpath="//*[@id='ctrlOptionProPriceBookH']")
	public static WebElement buyerPriceBook_PriceBook;

	@FindBy(xpath="//*[@id='ctrlOptionProPriceBookH_input_container']/div[2]/table/tbody/tr/td[3]/i")
	public static WebElement buyerPriceBook_PriceBookSettingBtn;

	@FindBy(xpath="//*[@id='txtAbbreviation']")
	public static WebElement buyerPriceBook_AbbreviationBtn;

	@FindBy(xpath="//*[@id='PriceBookContainer']/div[2]/div/nav/div/nav/ol/li[4]")
	public static WebElement buyerPriceBookLabel;

	@FindBy(xpath="//*[@id='btnClear']")
	public static WebElement buyerPriceBookClearBtn;

	@FindBy(xpath="//*[@id='btnPaste']")
	public static WebElement buyerPriceBookPasteBtn;

	@FindBy(xpath="//*[@id='btnCopy']")
	public static WebElement buyerPriceBookCopyBtn;

	@FindBy(xpath="//*[@id='btnSelectAll']")
	public static WebElement buyerPriceBookSelectAllBtn;

	@FindBy(xpath="//*[@id='btnClose']")
	public static WebElement buyerPriceBookCloseBtn;

	@FindBy(xpath="//*[@id='btnSave']")
	public static WebElement buyerPriceBookSaveBtn;

	@FindBy(xpath="//span[@id='btnClose']")
	public static WebElement buyerPriceBookCloseAfterImport;


	@FindBy(xpath="//*[@id='btnDelete']")
	public static WebElement buyerPriceBookDeleteBtn;

	@FindBy(xpath="//*[@id='StartingDateH']")
	public static WebElement buyerPriceBookStaringDate;

	@FindBy(xpath="//*[@id='EndingDateH']")
	public static WebElement buyerPriceBookENdingDate;

	@FindBy(xpath="//*[@id='chkLabel']/div/label[text()='Inactive']/span")
	public static WebElement buyerPriceBookInActiveCheckBox;

	@FindBy(xpath="//*[@id='chkLabel']/div/label[text()='Inactive']/input")
	public static WebElement buyerPriceBookInActiveCheckBoxSelected;


	@FindBy(xpath="//*[@id='FilterProduct']")
	public static WebElement buyerPriceBookFilter_Item;

	@FindBy(xpath="//*[@id='FilterCurrency']")
	public static WebElement buyerPriceBookFilter_Currency;

	@FindBy(xpath="//*[@id='FilterCustomer']")
	public static WebElement buyerPriceBookFilter_Customer;

	@FindBy(xpath="//*[@id='FilterDepartment']")
	public static WebElement buyerPriceBookFilter_Department;

	@FindBy(xpath="//*[@id='btnFilterClear']")
	public static WebElement buyerPriceBookFilter_ClearBtn;

	@FindBy(xpath="//*[@id='btnFilter']")
	public static WebElement buyerPriceBookFilter_FilterBtn;

	@FindBy(xpath="//*[@id='btnLoad']")
	public static WebElement buyerPriceBookFilter_FilterAndLoadBtn;

	@FindBy(xpath="//*[@id='btnAdvExcelImport']")
	public static WebElement buyerPriceBook_AdvanceExcelImportBtn;

	@FindBy(xpath="//*[@id='btnPBPrintRateHistory']")
	public static WebElement buyerPriceBook_PrintRateHistoryBtn;

	@FindBy(xpath="//*[@id='btnPBExportToXML']")
	public static WebElement buyerPriceBook_ExportToXmlBtn;

	@FindBy(xpath="//span[contains(text(),'Import From XML')]")
	public static WebElement buyerPriceBook_ImportFromXmlBtn;

	@FindBy(xpath="//input[@id='btnExporttoExcel']")
	public static WebElement buyerPriceBook_ExportToExcel;

	@FindBy(xpath="//input[@id='btnPBImportFromExcel']")
	public static WebElement buyerPriceBook_ImportFromExcel;

	@FindBy(xpath="//input[@id='btnViewPrice']")
	public static WebElement buyerPriceBook_ViewPrice;

	@FindBy(xpath="//input[@id='btnUpdatePriceList']")
	public static WebElement buyerPriceBook_UpdatePriceList;

	@FindBy(xpath="//*[@id='toggleDropDown']/i")
	public static WebElement buyerPriceBook_CustamizeSettingBtn;

	@FindBy(xpath="//*[@id='chkDateRange']")
	public static WebElement buyerPriceBook_CustamizeDateRangeCheckBox;

	@FindBy(xpath="//*[@id='chkCustomer']")
	public static WebElement buyerPriceBook_CustomizeVendorCheckBox;

	@FindBy(xpath="//*[@id='chkDepartment']")
	public static WebElement buyerPriceBook_WarehouseCheckBox;

	@FindBy(xpath="//*[@id='chkQtyRange']")
	public static WebElement buyerPriceBook_QualityRangeCheckBox;

	@FindBy(xpath="//*[@id='chkCurrency']")
	public static WebElement buyerPriceBook_CurrencyCheckBox;

	@FindBy(xpath="//*[@id='chkUnit']")
	public static WebElement buyerPriceBook_UnitCheckBox;


	@FindBy(xpath="//th[@id='PriceBookWebGrid_control_heading_1']//div[contains(text(),'Item')]")
	public static WebElement  gridItemColoumn;

	@FindBy(xpath="//th[@id='PriceBookWebGrid_control_heading_3']//div[contains(text(),'Warehouse')]")
	public static WebElement  gridWareHouseColoumn;

	@FindBy(xpath="//th[@id='PriceBookWebGrid_control_heading_11']//div[contains(text(),'Rate')]")
	public static WebElement  gridRateColoumn;

	@FindBy(xpath="//th[@id='PriceBookWebGrid_control_heading_12']//div[contains(text(),'Po')]")
	public static WebElement  gridPoColoumn;

	@FindBy(xpath="//div[contains(text(),'Pt')]")
	public static WebElement  gridPtColoumn;

	@FindBy(xpath="//i[@id='ToggleFilter']")
	public static WebElement beforeClickOnToggle; 	

	@FindBy(xpath="//*[@id='ClosedDiv']")
	public static WebElement afterClickOnToggle; 

	// Check Customize Settings Options

	@FindBy(xpath="//*[@id='PriceBookWebGrid_control_heading_4']//div[text()='Starting date']")
	public static WebElement startingdate; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_control_heading_5']//div[contains(text(),'Ending date')]")
	public static WebElement endingdate; 	

	@FindBy(xpath="//th[@id='PriceBookWebGrid_control_heading_6']//div[contains(text(),'Vendor')]")
	public static WebElement vendor; 	

	@FindBy(xpath="//th[@id='PriceBookWebGrid_control_heading_6']//div[contains(text(),'Customer')]")
	public static WebElement customer; 

	@FindBy(xpath="//th[@id='PriceBookWebGrid_control_heading_7']//div[contains(text(),'Currency')]")
	public static WebElement currency; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_control_heading_8']//div[contains(text(),'Min Qty')]")
	public static WebElement minQty; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_control_heading_9']//div[contains(text(),'Max Qty')]")
	public static WebElement maxQty; 	

	@FindBy(xpath="//*[@id='PriceBookWebGrid_control_heading_10']//div[contains(text(),'Unit')]")
	public static WebElement unit; 	

	@FindBy(xpath="//th[@id='PriceBookWebGrid_control_heading_11']//div[contains(text(),'Rate')]")
	public static WebElement rate; 	

	@FindBy(xpath="//th[@id='PriceBookWebGrid_control_heading_12']//div[contains(text(),'Po')]")
	public static WebElement po; 	


	//transaction authorization




	@FindBy(xpath="//*[@id='id_report_popup_body']/div[2]/div[1]/ul[1]/li[1]/a")
	public static WebElement conditionTab; 


	@FindBy(xpath="//*[@id='id_report_popup_body']/div[2]/div[1]/ul[1]/li[3]/a")
	public static WebElement alertsTab;	

	//Master Authorization Add Field User Selection
	@FindBy(xpath="//*[@id='id_report_popup_body']/div[2]/div[1]/ul[1]/li[2]/a")
	public static WebElement userSelectionTab;

	@FindBy(xpath="//*[@id='id_report_popup_body']/div[2]/div[1]/ul[1]/li[4]/a")
	public static WebElement escalationTab;	

	//Description Fields

	@FindBy(xpath="//*[@id='txtDescription']")
	public static WebElement descriptionTxt; 

	@FindBy(xpath="//*[@id='chkConditionNotRequired']")
	public static WebElement conditionNotRequiredChkBox; 


	@FindBy(xpath="//*[@id='chkCreditLimitExceeded']")
	public static WebElement creditLimitExceededChkBox; 

	@FindBy(xpath="//*[@id='chkBudgetExceeded']")
	public static WebElement budgetExceededChkBox; 

	@FindBy(xpath="//*[@id='chkNegativeCashCheck']")
	public static WebElement negativeCashCheckChkBox; 

	@FindBy(xpath="//*[@id='chkLineWiseAuthorization']")
	public static WebElement lineWiseAuthorizationChkBox; 

	@FindBy(xpath="//*[@id='chkCreditDaysExceeded']")
	public static WebElement creditDaysExceededChkBox; 

	@FindBy(xpath="//*[@id='chkNegativeStockCheck']")
	public static WebElement negativeStockCheckChkBox; 

	@FindBy(xpath="//*[@id='chkDateRange']")
	public static WebElement dateRangeChkBox; 

	@FindBy(xpath="//*[@id='dpFromDate']")
	public static WebElement fromDateTxtInAuth; 

	@FindBy(xpath="//*[@id='dpToDate']")
	public static WebElement toDateTxtInAuth; 

	@FindBy(xpath="//*[@id='chkTimeRange']")
	public static WebElement timeRangeChkBox;

	@FindBy(xpath="//input[@id='tpFromTime']")
	public static WebElement fromTimeTxt; 

	@FindBy(xpath="//*[@id='tpToTime']")
	public static WebElement totimeTxt; 

	@FindBy(xpath="//*[@id='tblNodeBody']/tr[1]/td[2]/div/div/div/span/i")
	public static WebElement endpoint;

	@FindBy(xpath="//*[@id='tblNodeBody']/tr[1]/td[2]/div/div/span[2]/i")
	public static WebElement endpointInBudget;



	//Condition------Condition Fields

	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr/td[1]/select")
	public static WebElement ConjunctionDropdown; 

	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr/td[2]/input")
	public static WebElement SelectFieldTxt; 


	//Undo Authorization On Editing

	@FindBy(xpath="//*[@id='chkAnyValueChange']")
	public static WebElement anyValueChangeChkBox;

	@FindBy(xpath="//*[@id='chkAmountsOrQuantityOrNumeric']")
	public static WebElement amountsOrQuantityOrNumericChkBox;

	@FindBy(xpath="//*[@id='chkBillAdjustments']")
	public static WebElement billAdjustmentsChkBox;

	@FindBy(xpath="//*[@id='chkUndoReservation']")
	public static WebElement undoReservationChkBox;

	@FindBy(xpath="//*[@id='chkUndoLinks']")
	public static WebElement undoLinksChkBox;

	@FindBy(xpath="//*[@id='chkBatchRMABins']")
	public static WebElement batchRMABinChkBox;

	@FindBy(xpath="//*[@id='ddlUndoAuthEditing']")
	public static WebElement undoAuthorizationEditingDropdown;


	@FindBy(xpath="//*[@id='ulAuthBtns']/li[1]/span/i")
	public static WebElement clearbtn; 

	@FindBy(xpath="//span[@id='spndeleteProfile']")
	public static WebElement DeleteBtn; 

	@FindBy(xpath="//*[@id='btnSaveAuthorization']/i")
	public static WebElement saveBtn; 

	@FindBy(xpath="//*[@id='ulAuthBtns']/li[5]/span/i")
	public static WebElement cancelBtn; 

	//Ok And Cancel for Authorization Definition
	@FindBy(xpath="//*[@id='id_report_popup_ok']/i")
	public static WebElement definitionOkBtn;					

	@FindBy(xpath="//*[@id='id_report_popup_cancel']/i	")
	public static WebElement definitionCancelBtn;	

	@FindBy(xpath="//*[@id='divLevel']/div[1]/i[@class='NodeIcon icon-report-1']")
	public static WebElement level1Template;




	//DWFLOW



	//Expands Buttons

	@FindBy(xpath="//i[@id='icon_5']")
	public static WebElement purchaseVouchersExpandBtn;

	@FindBy(xpath="//i[@id='icon_7']")
	public static WebElement purchaseOrdersExpandBtn;

	@FindBy(xpath="(//i[@id='icon_9'])[1]")
	public static WebElement salesInvoicesExpandBtn;

	@FindBy(xpath="(//*[@id='icon_11'])[1]")
	public static WebElement salesOrdersExpandBtn;

	@FindBy(xpath="//i[@id='icon_14']")
	public static WebElement nonStandardJournalEntriesExpandBtn;

	@FindBy(xpath="//i[@id='icon_17']")
	public static WebElement creditNotesExpandBtn;

	@FindBy(xpath="//i[@id='icon_24']")
	public static WebElement receiptsFromProductionExpandBtn;



	@FindBy(xpath="//a[@id='74']//span[contains(text(),'Design Workflow')]")
	public static WebElement designWorkflowbtn; 

	@FindBy(xpath="//*[@id='div1']/div[1]/div/nav/div/nav/ol/li/a/span")
	public static WebElement designWorkflowLabel; 

	@FindBy(xpath="//*[@id='workflowButtons']/ul/li[2]/a[@id='btnSave']")
	public static WebElement dwsaveBtn; 

	@FindBy(xpath="//*[@id='btnClear']/i")
	public static WebElement clearBtn; 

	@FindBy(xpath="//*[@id='btnDelete']/i")
	public static WebElement dwdeleteBtn; 

	@FindBy(xpath="//*[@id='workflowButtons']/ul/li[4]//a")
	public static WebElement dwcloseBtn;

	@FindBy(xpath="//input[@id='optWorkflow']")
	public static WebElement workflowNameTxt; 




	//Last Dropdown In Condition Screen

	//Deisgn workflow


	//Link Setting -----Setting Tab

	@FindBy(xpath="//a[contains(text(),'Setting')]")
	public static WebElement settingTab; 

	@FindBy(xpath="//*[@id='Settings']/div[1]/div[1]/div/label/span")
	public static WebElement raiseLinkDocumentWhenbaseIsSavedChkbox; 

	@FindBy(xpath="//input[@id='idNegative']")
	public static WebElement tolerance1Txt; 

	@FindBy(xpath="//input[@id='idPossitive']")
	public static WebElement tolerance2Txt; 

	@FindBy(xpath="//select[@id='ddlTolearenceType']")
	public static WebElement tolearenceTypeDropdown; 

	@FindBy(xpath="//select[@id='ddlReleaseto']")
	public static WebElement relatesToDropdown; 

	@FindBy(xpath="//input[@id='AutoCloseTxt']")
	public static WebElement autoCloseTxt; 

	@FindBy(xpath="//select[@id='ddlActions']")
	public static WebElement settinglinkValueDropdown; 

	@FindBy(xpath="//select[@id='ddlLoadpendingDoc']")
	public static WebElement loadpendingDocumentsDropdown; 

	@FindBy(xpath="//select[@id='ddlBasedOnfiled']")
	public static WebElement loadFieldsDropdown; 


	@FindBy(xpath="//*[@id='LeftSideChkbox']/div[12]/label/span")
	public static WebElement voucherGrossChkbox; 

	@FindBy(xpath="//*[@id='rightsideCheckbox']/div[4]/label/span")
	public static WebElement netChkbox; 

	@FindBy(xpath="//*[@id='rightsideCheckbox']/div[5]/label/span")
	public static WebElement voucherNetChkbox; 

	@FindBy(xpath="//*[@id='rightsideCheckbox']/div[6]/label/span")
	public static WebElement userChkbox; 

	@FindBy(xpath="//*[@id='rightsideCheckbox']/div[7]/label/span")
	public static WebElement roleChkbox; 

	@FindBy(xpath="//*[@id='rightsideCheckbox']/div[8]/label/span")
	public static WebElement user1Chkbox; 

	@FindBy(xpath="//*[@id='rightsideCheckbox']/div[9]/label/span")
	public static WebElement user2Chkbox; 

	@FindBy(xpath="//*[@id='rightsideCheckbox']/div[10]/label/span")
	public static WebElement user3Chkbox; 

	@FindBy(xpath="//*[@id='rightsideCheckbox']/div[11]/label/span")
	public static WebElement user4Chkbox; 

	@FindBy(xpath="//*[@id='rightsideCheckbox']/div[12]/label/span")
	public static WebElement user5Chkbox; 





	//Link Settings-----Properties

	@FindBy(xpath="//a[contains(text(),'Properties')]")
	public static WebElement propertiesTab; 

	@FindBy(xpath="//*[@id='ChkStockLink']/label/span")
	public static WebElement checkstockWhileLinkingChkbox; 

	@FindBy(xpath="//*[@id='Properties']/div/div[4]/label/span")
	public static WebElement cannotExceedTheBaseValueChkbox; 

	@FindBy(xpath="//*[@id='Properties']/div/div[5]/label/span")
	public static WebElement baseDocumentCannotBeEditedAfterItIsLinkedChkbox; 

	@FindBy(xpath="//*[@id='Properties']/div/div[6]/label/span")
	public static WebElement useThisLinkOnlyForLoadingChkbox; 

	@FindBy(xpath="//*[@id='Properties']/div/div[7]/label/span")
	public static WebElement loadTheBaseDocumentDetailsAtTheTimeOfLinkingChkbox; 

	@FindBy(xpath="//*[@id='Properties']/div/div[8]/label/span")
	public static WebElement closeLinkAfterTheDueDateElapsesChkbox; 

	@FindBy(xpath="//*[@id='Properties']/div/div[9]/label/span")
	public static WebElement linkIsMandatoryChkbox; 

	@FindBy(xpath="//*[@id='Properties']/div/div[10]/label/span")
	public static WebElement linkIsOptionalIfTheDocumentIsLinkedToAnotherbasedocumentChkbox; 

	@FindBy(xpath="//*[@id='Properties']/div/div[11]/label/span")
	public static WebElement doNotClubWithCommonBaseChkbox; 

	@FindBy(xpath="//*[@id='Properties']/div/div[12]/label/span")
	public static WebElement doNotAllowSelectionIfLinksFieldsAreNotSelectedChkbox; 

	@FindBy(xpath="//input[@id='chkRecheckBeforeTheSavingIflink']")
	public static WebElement recheckBeforeTheSavingIfLinkIsConsumeEelsewhereOnTheNetworkChkbox; 

	@FindBy(xpath="//*[@id='Properties']/div/div[13]/label/span")
	public static WebElement allowBackdatedLinkingChkbox;

	@FindBy(xpath="//*[@id='Properties']/div/div[14]/label/span")
	public static WebElement doNotUpdateLinkUnlessQCIsDoneChkbox;

	@FindBy(xpath="//*[@id='LeftSideChkbox']/div/label")
	public static List<WebElement> definitionTabChkBoxNameList;


	@FindBy(xpath="//*[@id='LeftSideChkbox']/div/label/span")
	public static List<WebElement> definitionTabChkBoxList;

	@FindBy(xpath="//*[@id='LeftSideChkbox']/div/label/input")
	public static List<WebElement> definitionTabChkBoxListSelected;

	@FindBy(xpath="//*[@id='WorkflowSettingDialog']/div[2]/div/div[1]/span/i")
	public static WebElement closeBtnInDesignWorkflow;



	//budget




	@FindBy(xpath="//*[@id='60']")
	public static WebElement  financialsMenu; 

	@FindBy(xpath="//*[@id='3301']/span")
	public static WebElement  financialsBudgetMenu; 

	@FindBy(xpath="//*[@id='3302']/span")
	public static WebElement  financialsBudgetDefineBudget; 

	@FindBy(xpath="//*[@id='3303']/span")
	public static WebElement  financialsBudgetConfirmBudget; 

	@FindBy(xpath="//*[@id='3304']/span")
	public static WebElement  financialsBudgetReviseBudget; 

	@FindBy(xpath="//span[contains(text(),'Append Budget')]")
	public static WebElement appendBudgetMenu;

	@FindBy(xpath="//a[@id='3306']//span[contains(text(),'Add')]")
	public static WebElement addORReduceBudgetMenu;

	@FindBy(xpath="//span[contains(text(),'Transfer Budget')]")
	public static WebElement transferBudgetMenu;

	@FindBy(xpath="//*[@id='3309']/span")
	public static WebElement  financialsBudgetApproveBudget; 

	@FindBy(xpath="//*[@id='3310']/span")
	public static WebElement  financialsBudgetRejectedBudget; 

	@FindBy(xpath="//*[@id='3328']/span")
	public static WebElement  financialsBudgetReviseBudgetDetailsBudget; 

	@FindBy(xpath="//*[@id='3321']/span")
	public static WebElement  financialsBudgetReportst; 



	@FindBy(xpath="//*[@id='optPlanName']")
	public static WebElement  planName; 

	@FindBy(xpath="//*[@id='txtVersion']")
	public static WebElement  versionNo; 

	@FindBy(xpath="//*[@id='dvDefineBudget']/div/div[1]/div/div[3]/div[1]/div/span/span")
	public static WebElement  budgetDefineFile; 

	@FindBy(xpath="//*[@id='btnNavBar']/ul//li[1]")
	public static WebElement  budgetExportBtn; 

	@FindBy(xpath="//*[@id='btnNavBar']/ul//li[2]")
	public static WebElement  budgetImportBtn; 

	@FindBy(xpath="//*[@id='btnNavBar']/ul//li[4]")
	public static WebElement  budgetClearBtn; 

	@FindBy(xpath="//*[@id='btnNavBar']/ul//li[5]")
	public static WebElement  budgetSaveBtn; 

	@FindBy(xpath="//*[@id='btnNavBar']/ul//li[7]")
	public static WebElement  budgetConfirmBtn; 

	@FindBy(xpath="//*[@id='btnNavBar']/ul//li[8]")
	public static WebElement  budgetDeleteBtn;

	@FindBy(xpath="//*[@id='btnNavBar']/ul//li[9]")
	public static WebElement  budgetCloseBtn; 

	@FindBy(xpath="//*[@id='btnNavBar']/ul//li[9]")
	public static WebElement  budgetCloseBtnFirst; 

	@FindBy(xpath="//*[@id='grdDefineBudget_control_heading_2']/div[1]")
	public static WebElement  budgetTypeColHeadingTxt; 

	@FindBy(xpath="//*[@id='grdDefineBudget_control_heading_3']/div[1]")
	public static WebElement  budgetDepartmenteColHeadingTxt; 

	@FindBy(xpath="//*[@id='grdDefineBudget_control_heading_6']/div[1]")
	public static WebElement  budgetItemColHeadingTxt; 

	@FindBy(xpath="//*[@id='grdDefineBudget_control_heading_7']/div[1]")
	public static WebElement  budgetAccountColHeadeingTxt; 

	@FindBy(xpath="//*[@id='grdDefineBudget_control_heading_8']/div[1]")
	public static WebElement  budgetQuanityColHeadingTxt; 

	@FindBy(xpath="//*[@id='grdDefineBudget_control_heading_9']/div[1]")
	public static WebElement  budgetValueColHeadingTxt; 

	@FindBy(xpath="//*[@id='grdDefineBudget_control_heading_13']/div[1]")
	public static WebElement  budgetStatusColHeadingTxt; 



	// CONFIRM BUDGET


	@FindBy(xpath="//*[@id='optPlanName']")
	public static WebElement  planNameInConfirmBudget; 

	@FindBy(xpath="//*[@id='txtVersion']")
	public static WebElement  versionTxtBox; 

	@FindBy(xpath="//*[@id='exportdiv']/a")
	public static WebElement  exportBtn; 

	@FindBy(xpath="//*[@id='navbarSupportedContent2']/ul/li[5]/a")
	public static WebElement  clearBtnInBudget; 

	@FindBy(xpath="//*[@id='btnCancel']/a/i")
	public static WebElement  closeBtnInBudget; 

	@FindBy(xpath="//*[@id='optAccount']")
	public static WebElement  accountCmbx; 

	@FindBy(xpath="//*[@id='optProduct']")
	public static WebElement  itemCmbx; 

	@FindBy(xpath="//*[@id='opttag1']")
	public static WebElement departmentCmbx; 

	@FindBy(xpath="//tbody[@id='grdConfirmBudget_body']//tr[1]//td[4]")
	public static WebElement budgetTxtBox; 

	@FindBy(xpath="//tbody[@id='grdConfirmBudget_body']//tr[1]//td[5]")
	public static WebElement departmentTxtBox;

	@FindBy(xpath="//tbody[@id='grdConfirmBudget_body']//tr[1]//td[8]")
	public static WebElement itemTxtBox; 

	@FindBy(xpath="//tbody[@id='grdConfirmBudget_body']//tr[1]//td[9]")
	public static WebElement accountTxtBox; 

	@FindBy(xpath="//tbody[@id='grdConfirmBudget_body']//tr[1]//td[10]")
	public static WebElement qtyTxtBox; 

	@FindBy(xpath="//tbody[@id='grdConfirmBudget_body']//tr[1]//td[11]")
	public static WebElement  valueTxtBox; 

	@FindBy(xpath="//label[@id='totalbudget']")
	public static WebElement  budgetTotalValue; 

	@FindBy(xpath="//label[@id='totalquantity']")
	public static WebElement  budgetTotalQty; 


	// TRANSFER BUDGETS

	@FindBy(xpath="//label[@id='txtVersion']")
	public static WebElement budgetVersionTxt;

	@FindBy(xpath="//label[@id='lblValidToDate']")
	public static WebElement validToDateTxt;

	@FindBy(xpath="//label[@id='lblLastUpdateDate']")
	public static WebElement lastUpdateTxt;

	@FindBy(xpath="//label[@id='txtReviseNo']")
	public static WebElement reviseTxt;


	@FindBy(xpath="//*[@id='btnSave']/a")
	public static WebElement budgetsTransferSaveBtn;


	// TRANSFER FROM

	@FindBy(xpath="//*[@id='optFromProfitCenterSchool']")
	public static WebElement TransFrom_DepartmnentTxt;

	@FindBy(xpath="//input[@id='optFromProduct']")
	public static WebElement TransFrom_itemTxt;

	@FindBy(xpath="//input[@id='optFromAccount']")
	public static WebElement TransFrom_accountTxt;

	@FindBy(xpath="//input[@id='txtFromQuantity']")
	public static WebElement TransFrom_quantityTxt;

	@FindBy(xpath="//input[@id='txtFromSpentQuantity']")
	public static WebElement TransFrom_spentQtyTxt;

	@FindBy(xpath="//input[@id='txtFromPreCommittedQuantity']")
	public static WebElement TransFrom_preCommitedQtyTxt;

	@FindBy(xpath="//input[@id='txtFromCommittedQuantity']")
	public static WebElement TransFrom_committedQtyTxt;

	@FindBy(xpath="//input[@id='txtFromBalanceQuantity']")
	public static WebElement TransFrom_balQtyTxt;

	@FindBy(xpath="//input[@id='txtFromBudgetValue']")
	public static WebElement TransFrom_budgetValueTxt;

	@FindBy(xpath="//input[@id='txtFromSpentBudget']")
	public static WebElement TransFrom_spentbudgetTxt;

	@FindBy(xpath="//input[@id='txtFromPreCommittedValue']")
	public static WebElement TransFrom_preCommittedTxt;

	@FindBy(xpath="//input[@id='txtFromCommittedBudget']")
	public static WebElement TransFrom_committedBudget ;

	@FindBy(xpath="//input[@id='txtFromBalanceBudget']")
	public static WebElement TransFrom_balBudgetTxt;

	@FindBy(xpath="//input[@id='txtFromReduceQuantity']")
	public static WebElement TransFrom_reduceQtyTxt;

	@FindBy(xpath="//input[@id='txtFromReduceValue']")
	public static WebElement TransFrom_reduceValueTxt;


	@FindBy(xpath="//*[@id='chkActive']")
	public static WebElement activeChkBox;  

	@FindBy(xpath="//*[@id='chkAlwaysauthorizationstartsfromfirstlevel']")
	public static WebElement alwaysauthorizationstartsfromfirstlevelChkBox; 


	//Master Authorization Clear,Delete,Save,Cancel
	@FindBy(xpath="//*[@id='li_clear']/span")
	public static WebElement clearBtnInBudgetInAuth; 

	@FindBy(xpath="//*[@id='li_delete']/span")
	public static WebElement deleteBtnInBudgetAuth; 

	@FindBy(xpath="//*[@id='li_save']/span")
	public static WebElement saveBtnInBudgetAuth; 

	@FindBy(xpath="//*[@id='li_close']/span")
	public static WebElement cancelBtnInAuth; 


	@FindBy(xpath="//li[contains(text(),'Define Budget')]")
	public static WebElement defineBudget;

	@FindBy(xpath="//li[contains(text(),'Revise Budget')]")
	public static WebElement reviseBudget;

	@FindBy(xpath="//*[@id='3308_0_AdvanceFilter_']/table/tbody/tr/td[3]/select")
	public static WebElement selectOperatorDropdown; 

	@FindBy(xpath="//*[@id='3308_0_AdvanceFilter_']/table/tbody/tr/td[4]/select")
	public static WebElement compareWithDropdown; 

	@FindBy(xpath="//*[@id='3308_0_AdvanceFilter_']/table/tbody/tr/td[5]/input")
	public static WebElement valueTxt;


	//Account Customization 




	@FindBy (xpath="//*[@id='masterFields_list']/li[7]/a")
	public static WebElement masterFieldsCreateTab;

	@FindBy (xpath="//*[@id='btnAdd_Field_MasterCust']/a/i")
	public static WebElement createTabHeaderDetailsAddFieldsBtn;
	

	
	
	@FindBy (xpath="//div[@id='HeaderDetails_6']/div/div/table/tbody/tr/td[4]")
	public static List<WebElement> CreateTabfieldCaptionTxtList;
	
	@FindBy (xpath="//div[@id='HeaderDetails_6']/div/div/table/tbody/tr/td[1]/i[1]")
	public static List<WebElement> CreateTabeditFieldList;
	
	@FindBy (xpath="//div[@id='HeaderDetails_6']/div/div/table/tbody/tr/td[1]/i[2]")
	public static List<WebElement> deleteFieldList;
	

	
		
	@FindBy(xpath="//a[@id='137']//span[contains(text(),'Transactions')]")
	public static WebElement  inventoryTransactionsMenu; 
		
	@FindBy(xpath="//*[@id='139']/span")
	public static WebElement  inventoryTransactionsPurchasesMenu; 
	
	@FindBy(xpath="//*[@id='2010']/span")
	public static WebElement  requestForQuoteVoucher;
	
	@FindBy(xpath="//*[@id='2011']/span")
	public static WebElement  purchasesQuotationsVoucher;
		
	@FindBy(xpath="//*[@id='2012']/span")
	public static WebElement  purchasesOrdersVoucher;

	@FindBy(xpath="//*[@id='2013']/span")
	public static WebElement  materialReceiptNotesVoucher;
				
	@FindBy(xpath="//*[@id='140']/span")
	public static WebElement  inventoryTransactionsSalesMenu; 
			
	@FindBy(xpath="//*[@id='2018']/span")
	public static WebElement  salesQuotationsVoucher;
	
	@FindBy(xpath="//*[@id='202']")
	public static WebElement itemQuery;
	
	@FindBy(xpath="//*[@id='551']")
	public static WebElement stockLedger;

	
	@FindBy(xpath="//*[@id='200']")
	public static WebElement inventoryReportsMenu;
	
	@FindBy(xpath="//*[@id='587']")
	public static WebElement stockDetailsByBins;
		@FindBy(xpath="//*[@id='588']")
		public static WebElement  stockBalancesByBins;
		
		@FindBy(xpath="//*[@id='589']")
		public static WebElement  stockBalancesByItemByBins;
		
		@FindBy(xpath="//span[contains(text(),'Expired Stock by Bins')]")
		public static WebElement  expiredStockByBins;		
	
	@FindBy(xpath="//span[contains(text(),'Stock balance by warehouse')]")
	public static WebElement  stockBalanceByWarehouse;
	
	@FindBy(xpath="//span[contains(text(),'Stock ageing analysis')]")
	public static WebElement  stockAgeingAnalysisMenu;
		
		@FindBy(xpath="//*[@id='582']")
		public static WebElement  ageingAnalysis;
		
		@FindBy(xpath="//*[@id='622']")
		public static WebElement  ageingAnalysisByBatch;
		
		@FindBy(xpath="//*[@id='623']")
		public static WebElement  ageingAnalysisByRMA;		
		
		@FindBy(xpath="//*[@id='591']/span")
		public static WebElement  ageingStockByBins;
				
		@FindBy(xpath="//*[@id='646']")
		public static WebElement  ageingByItemByBins;		

	@FindBy(xpath="//span[contains(text(),'Reorder Report')]")
	public static WebElement reorderReport;
	
	@FindBy(xpath="//a[@id='584']//span[contains(text(),'Fast Moving Item')]")
	public static WebElement  fastMovingItem;
			
	@FindBy(xpath="//a[@id='585']//span[contains(text(),'Slow Moving Item')]")
	public static WebElement  slowMovingItem;
	
	@FindBy(xpath="//span[contains(text(),'Peak/Low Balances')]")
	public static WebElement  peakORLowBalances;
	
	@FindBy(xpath="//span[contains(text(),'Best Selling Item')]")
	public static WebElement  bestSellingItem;

	@FindBy(xpath="//span[contains(text(),'Raise Indent Item with Low Stock')]")
	public static WebElement  raiseIndentItemWithLowStock;
	
	@FindBy(xpath="//span[contains(text(),'Stock transfer report')]")
	public static WebElement  stockTransferReport;
	
	@FindBy(xpath="//span[contains(text(),'Raise request for quote')]")
	public static WebElement  raiseRequestForQuote;
	
	@FindBy(xpath="//span[contains(text(),'Stock reservation report')]")
	public static WebElement  stockReservationReport;
	
	@FindBy(xpath="//span[contains(text(),'Transaction type-wise stock report')]")
	public static WebElement  transactionTypeWiseStockReport;
	
	@FindBy(xpath="//span[contains(text(),'Actual consumption report')]")
	public static WebElement  actualConsumptionReport;
	
	@FindBy(xpath="//input[@id='productQuery']")
	public static WebElement iq_ItemTxt;

	@FindBy(xpath="//*[@id='dv_Panelbody']/div[1]/div[2]/div/input")
	public static WebElement iq_getStockBtn;
	
	@FindBy(xpath="//button[contains(text(),'Customize')]")
	public static WebElement iq_customizeBtn;
	
	@FindBy(xpath="//span[@id='id_productquery_button_clear']")
	public static WebElement iq_clearBtn;
	
	//*[@id="navbarSupportedContent2"]/ul/li[2]/a/i
	@FindBy(xpath="//span[@id='id_productquery_button_close']")
	public static WebElement iq_closeBtn;
	
	@FindBy(xpath="//label[contains(text(),'Opening Stock Quantity:')]")
	public static WebElement iq_OpeningStockQtyLable;
	
	@FindBy(xpath="//label[contains(text(),'Pending purchases orders :')]")
	public static WebElement iq_PendingPurchaseOrdersLable;
	
	@FindBy(xpath="//label[contains(text(),'Current Stock :')]")
	public static WebElement iq_CurrentStockLable;
	
	@FindBy(xpath="//label[contains(text(),'Pending Sales Orders :')]")
	public static WebElement iq_PendingSalesOrdersLable;
	
	@FindBy(xpath="//label[contains(text(),'Avg. Stock Rate :')]")
	public static WebElement iq_AvgStockRateLable;
	
	@FindBy(xpath="//label[contains(text(),'Qty to be Ordered :')]")
	public static WebElement iq_QtytobeOrderedLable;
	
	@FindBy(xpath="//label[contains(text(),'Base Unit :')]")
	public static WebElement iq_BaseUnitLable;
	
	@FindBy(xpath="//label[contains(text(),'Value :')]")
	public static WebElement iq_ValueLable;
	
	@FindBy(xpath="//table[@id='purchaseTable']//th[contains(text(),'Date')]")
	public static WebElement iq_PurDate;
	
	@FindBy(xpath="//table[@id='purchaseTable']//th[contains(text(),'Voucher No')]")
	public static WebElement iq_PurVoucherNo;
	
	@FindBy(xpath="//th[contains(text(),'Vendor')]")
	public static WebElement iq_PurVendor;
	
	@FindBy(xpath="//table[@id='purchaseTable']//th[contains(text(),'Quantity')]")
	public static WebElement iq_PurQty;
	
	@FindBy(xpath="//table[@id='purchaseTable']//th[contains(text(),'Unit')]")
	public static WebElement iq_PurUnit;
	
	@FindBy(xpath="//table[@id='purchaseTable']//th[contains(text(),'Rate')]")
	public static WebElement iq_PurRate;
	
	@FindBy(xpath="//table[@id='purchaseTable']//th[contains(text(),'Currency')]")
	public static WebElement iq_PurCurrency;
	
	@FindBy(xpath="//table[@id='purchaseTable']//th[contains(text(),'Quantity In Base')]")
	public static WebElement iq_PurQtyInBase;
	
	@FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Date')]")
	public static WebElement iq_SaleDate;
	
	@FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Voucher No')]")
	public static WebElement iq_SaleVoucherNo;
	
	@FindBy(xpath="//th[contains(text(),'Customer')]")
	public static WebElement iq_SaleCustomer;
	
	@FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Quantity')]")
	public static WebElement iq_SaleQty;
	
	@FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Unit')]")
	public static WebElement iq_SaleUnit;
	
	@FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Rate')]")
	public static WebElement iq_SaleRate;
	
	@FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Currency')]")
	public static WebElement iq_SaleCurrency;
	
	@FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Quantity In Base')]")
	public static WebElement iq_SaleQtyInBase;
	
	
	@FindBy(xpath="//*[@id='openingStock']")
	public static WebElement iq_OpeningStocks;
	
	@FindBy(xpath="//*[@id='currentStock']")
	public static WebElement iq_CurrentStock;
	
	@FindBy(xpath="//*[@id='avgStockRate']")
	public static WebElement iq_AvgStockRate;
	
	@FindBy(xpath="//*[@id='value']")
	public static WebElement iq_Value;
	
	@FindBy(xpath="//*[@id='iBaseUnit']")
	public static WebElement iq_BaseUnit;
	
	@FindBy(xpath="//*[@id='purchaseOrdered']")
	public static WebElement iq_PendingPurchaseOrders;
	
	@FindBy(xpath="//*[@id='salesOrdered']")
	public static WebElement iq_PendingSalesOrders;
	
	@FindBy(xpath="//*[@id='quantityToBeOrdered']")
	public static WebElement iq_QtyToBeOrdered;
	
	
	// Purchase Table
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[1]")
	public static WebElement pur1strow_1stColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[2]")
	public static WebElement pur1strow_2ndColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[3]")
	public static WebElement pur1strow_3rdColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[4]")
	public static WebElement pur1strow_4thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[5]")
	public static WebElement pur1strow_5thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[6]")
	public static WebElement pur1strow_6thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[7]")
	public static WebElement pur1strow_7thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[8]")
	public static WebElement pur1strow_8thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[9]")
	public static WebElement pur1strow_9thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[10]")
	public static WebElement pur1strow_10thColumn;
	
	
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[1]")
	public static WebElement pur2ndrow_1stColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[2]")
	public static WebElement pur2ndrow_2ndColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[3]")
	public static WebElement pur2ndrow_3rdColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[4]")
	public static WebElement pur2ndrow_4thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[5]")
	public static WebElement pur2ndrow_5thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[6]")
	public static WebElement pur2ndrow_6thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[7]")
	public static WebElement pur2ndrow_7thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[8]")
	public static WebElement pur2ndrow_8thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[9]")
	public static WebElement pur2ndrow_9thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[10]")
	public static WebElement pur2ndrow_10thColumn;
	
	
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[1]")
	public static WebElement pur7thRow_1stColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[2]")
	public static WebElement pur3rdrow_2ndColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[3]")
	public static WebElement pur3rdrow_3rdColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[4]")
	public static WebElement pur3rdrow_4thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[5]")
	public static WebElement pur3rdrow_5thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[6]")
	public static WebElement pur3rdrow_6thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[7]")
	public static WebElement pur3rdrow_7thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[8]")
	public static WebElement pur3rdrow_8thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[9]")
	public static WebElement pur3rdrow_9thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[10]")
	public static WebElement pur3rdrow_10thColumn;
	
	
	// 4TH
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[4]/td[1]")
	public static WebElement pur4throw_1stColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[4]/td[2]")
	public static WebElement pur4throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[4]/td[3]")
	public static WebElement pur4throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[4]/td[4]")
	public static WebElement pur4throw_4thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[4]/td[5]")
	public static WebElement pur4throw_5thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[4]/td[6]")
	public static WebElement pur4throw_6thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[4]/td[7]")
	public static WebElement pur4throw_7thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[4]/td[8]")
	public static WebElement pur4throw_8thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[4]/td[9]")
	public static WebElement pur4throw_9thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[4]/td[10]")
	public static WebElement pur4throw_10thColumn;
	
	// 5TH
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[5]/td[1]")
	public static WebElement pur5throw_1stColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[5]/td[2]")
	public static WebElement pur5throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[5]/td[3]")
	public static WebElement pur5throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[5]/td[4]")
	public static WebElement pur5throw_4thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[5]/td[5]")
	public static WebElement pur5throw_5thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[5]/td[6]")
	public static WebElement pur5throw_6thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[5]/td[7]")
	public static WebElement pur5throw_7thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[5]/td[8]")
	public static WebElement pur5throw_8thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[5]/td[9]")
	public static WebElement pur5throw_9thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[5]/td[10]")
	public static WebElement pur5throw_10thColumn;
	
	// 6TH
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[6]/td[1]")
	public static WebElement pur6throw_1stColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[6]/td[2]")
	public static WebElement pur6throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[6]/td[3]")
	public static WebElement pur6throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[6]/td[4]")
	public static WebElement pur6throw_4thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[6]/td[5]")
	public static WebElement pur6throw_5thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[6]/td[6]")
	public static WebElement pur6throw_6thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[6]/td[7]")
	public static WebElement pur6throw_7thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[6]/td[8]")
	public static WebElement pur6throw_8thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[6]/td[9]")
	public static WebElement pur6throw_9thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[6]/td[10]")
	public static WebElement pur6throw_10thColumn;
	
	
	@FindBy(xpath="//td[contains(text(),'Quantity Purchased Till Date:')]")
	public static WebElement qtyPurchasedTillDate;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[2]")
	public static WebElement purTotalWa;
			
			
	// Sales Table
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[1]/td[1]")
	public static WebElement sal1strow_1stColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[1]/td[2]")
	public static WebElement sal1strow_2ndColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[1]/td[3]")
	public static WebElement sal1strow_3rdColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[1]/td[4]")
	public static WebElement sal1strow_4thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[1]/td[5]")
	public static WebElement sal1strow_5thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[1]/td[6]")
	public static WebElement sal1strow_6thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[1]/td[7]")
	public static WebElement sal1strow_7thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[1]/td[8]")
	public static WebElement sal1strow_8thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[1]/td[9]")
	public static WebElement sal1strow_9thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[1]/td[10]")
	public static WebElement sal1strow_10thColumn;
	
	// 2nd
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[2]/td[1]")
	public static WebElement sal2ndrow_1stColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[2]/td[2]")
	public static WebElement sal2ndrow_2ndColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[2]/td[3]")
	public static WebElement sal2ndrow_3rdColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[2]/td[4]")
	public static WebElement sal2ndrow_4thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[2]/td[5]")
	public static WebElement sal2ndrow_5thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[2]/td[6]")
	public static WebElement sal2ndrow_6thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[2]/td[7]")
	public static WebElement sal2ndrow_7thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[2]/td[8]")
	public static WebElement sal2ndrow_8thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[2]/td[9]")
	public static WebElement sal2ndrow_9thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[2]/td[10]")
	public static WebElement sal2ndrow_10thColumn;
	
	// 3rd
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td[1]")
	public static WebElement sal3rdrow_1stColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td[2]")
	public static WebElement sal3rdrow_2ndColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td[3]")
	public static WebElement sal3rdrow_3rdColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td[4]")
	public static WebElement sal3rdrow_4thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td[5]")
	public static WebElement sal3rdrow_5thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td[6]")
	public static WebElement sal3rdrow_6thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td[7]")
	public static WebElement sal3rdrow_7thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td[8]")
	public static WebElement sal3rdrow_8thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td[9]")
	public static WebElement sal3rdrow_9thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td[10]")
	public static WebElement sal3rdrow_10thColumn;
	
	// 4th
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[4]/td[1]")
	public static WebElement sal4throw_1stColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[4]/td[2]")
	public static WebElement sal4throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[4]/td[3]")
	public static WebElement sal4throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[4]/td[4]")
	public static WebElement sal4throw_4thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[4]/td[5]")
	public static WebElement sal4throw_5thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[4]/td[6]")
	public static WebElement sal4throw_6thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[4]/td[7]")
	public static WebElement sal4throw_7thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[4]/td[8]")
	public static WebElement sal4throw_8thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[4]/td[9]")
	public static WebElement sal4throw_9thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[4]/td[10]")
	public static WebElement sal4throw_10thColumn;
	
	//5th
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[5]/td[1]")
	public static WebElement sal5throw_1stColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[5]/td[2]")
	public static WebElement sal5throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[5]/td[3]")
	public static WebElement sal5throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[5]/td[4]")
	public static WebElement sal5throw_4thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[5]/td[5]")
	public static WebElement sal5throw_5thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[5]/td[6]")
	public static WebElement sal5throw_6thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[5]/td[7]")
	public static WebElement sal5throw_7thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[5]/td[8]")
	public static WebElement sal5throw_8thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[5]/td[9]")
	public static WebElement sal5throw_9thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[5]/td[10]")
	public static WebElement sal5throw_10thColumn;
	
	//6th
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[6]/td[1]")
	public static WebElement sal6throw_1stColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[6]/td[2]")
	public static WebElement sal6throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[6]/td[3]")
	public static WebElement sal6throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[6]/td[4]")
	public static WebElement sal6throw_4thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[6]/td[5]")
	public static WebElement sal6throw_5thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[6]/td[6]")
	public static WebElement sal6throw_6thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[6]/td[7]")
	public static WebElement sal6throw_7thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[6]/td[8]")
	public static WebElement sal6throw_8thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[6]/td[9]")
	public static WebElement sal6throw_9thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[6]/td[10]")
	public static WebElement sal6throw_10thColumn;
	
	// 7th
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[7]/td[1]")
	public static WebElement sal7throw_1stColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[7]/td[2]")
	public static WebElement sal7throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[7]/td[3]")
	public static WebElement sal7throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[7]/td[4]")
	public static WebElement sal7throw_4thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[7]/td[5]")
	public static WebElement sal7throw_5thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[7]/td[6]")
	public static WebElement sal7throw_6thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[7]/td[7]")
	public static WebElement sal7throw_7thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[7]/td[8]")
	public static WebElement sal7throw_8thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[7]/td[9]")
	public static WebElement sal7throw_9thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[7]/td[10]")
	public static WebElement sal7throw_10thColumn;

	
	@FindBy(xpath="//td[contains(text(),'Quantity Sold Till Date:')]")
	public static WebElement qtySoldTillDate;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td[2]")
	public static WebElement salTotalWa;
			
	
	
	// Warehouse Table
	
	@FindBy(xpath="//div[contains(text(),'Warehouse')]")
	public static WebElement BalancebyWareHouselable;
	
	@FindBy(xpath="(//span[@id='ProdQuery_ShowPopup'])[1]")
	public static WebElement BalancebyWareHouseExpandBtn;
	
	@FindBy(xpath="(//span[@id='ProdQuery_ShowPopup'])[2]")
	public static WebElement BalancebyBinExpandBtn;
	
	@FindBy(xpath="//*[@id='tagWiseData']/tbody/tr[1]/td[2]")
	public static WebElement wh1strow_2ndColumn;
	
	@FindBy(xpath="//*[@id='tagWiseData']/tbody/tr[1]/td[3]")
	public static WebElement wh1strow_3rdColumn;
	
	@FindBy(xpath="//*[@id='tagWiseData']/tbody/tr[1]/td[4]")
	public static WebElement wh1strow_4thColumn;
	
	@FindBy(xpath="//*[@id='tagWiseData']/tbody/tr[1]/td[5]")
	public static WebElement wh1strow_5thColumn;
	
	@FindBy(xpath="//*[@id='tagWiseData']/tbody/tr[1]/td[6]")
	public static WebElement wh1strow_6thColumn;
	
	
	
	@FindBy(xpath="//*[@id='tagWiseData']/tbody/tr[2]/td[2]")
	public static WebElement wh2ndrow_2ndColumn;
	
	@FindBy(xpath="//*[@id='tagWiseData']/tbody/tr[2]/td[3]")
	public static WebElement wh2ndrow_3rdColumn;
	
	@FindBy(xpath="//*[@id='tagWiseData']/tbody/tr[2]/td[4]")
	public static WebElement wh2ndrow_4thColumn;
	
	@FindBy(xpath="//*[@id='tagWiseData']/tbody/tr[2]/td[5]")
	public static WebElement wh2ndrow_5thColumn;
	
	@FindBy(xpath="//*[@id='tagWiseData']/tbody/tr[2]/td[6]")
	public static WebElement wh2ndrow_6thColumn;
	
	
	@FindBy(xpath="//*[@id='tagWiseData']/tbody/tr[3]/td[2]")
	public static WebElement whStockTotal;
	
	@FindBy(xpath="//*[@id='tagWiseData']/tbody/tr[3]/td[4]")
	public static WebElement whValueTotal;
	
	
	// Selling rate and buying rates
	
	@FindBy(xpath="//div[contains(text(),'Selling rates and Buying rates')]")
	public static WebElement sellingAndBuyingRateslable;
	
	@FindBy(xpath="//span[@id='ProdQuery_ShowSellandBuyRatesPopup']")
	public static WebElement sellingAndBuyingRatesExpandBtn;
	
	// 1st 
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[1]/td[2]")
	public static WebElement sbr1strow_2ndColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[1]/td[3]")
	public static WebElement sbr1strow_3rdColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[1]/td[4]")
	public static WebElement sbr1strow_4thColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[1]/td[5]")
	public static WebElement sbr1strow_5thColumn;
	
	// 2nd 
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[2]/td[2]")
	public static WebElement sbr2ndrow_2ndColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[2]/td[3]")
	public static WebElement sbr2ndrow_3rdColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[2]/td[4]")
	public static WebElement sbr2ndrow_4thColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[2]/td[5]")
	public static WebElement sbr2ndrow_5thColumn;
	
	//3rd
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[3]/td[2]")
	public static WebElement sbr3rdrow_2ndColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[3]/td[3]")
	public static WebElement sbr3rdrow_3rdColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[3]/td[4]")
	public static WebElement sbr3rdrow_4thColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[3]/td[5]")
	public static WebElement sbr3rdrow_5thColumn;
	
	// 4th
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[4]/td[2]")
	public static WebElement sbr4throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[4]/td[3]")
	public static WebElement sbr4throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[4]/td[4]")
	public static WebElement sbr4throw_4thColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[4]/td[5]")
	public static WebElement sbr4throw_5thColumn;
	
	
	
	// 5th
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[5]/td[2]")
	public static WebElement sbr5throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[5]/td[3]")
	public static WebElement sbr5throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[5]/td[4]")
	public static WebElement sbr5throw_4thColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[5]/td[5]")
	public static WebElement sbr5throw_5thColumn;
		
		
	// 6th
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[6]/td[2]")
	public static WebElement sbr6throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[6]/td[3]")
	public static WebElement sbr6throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[6]/td[4]")
	public static WebElement sbr6throw_4thColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[6]/td[5]")				
	public static WebElement sbr6throw_5thColumn;
		
	
	
	// 7th

	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[7]/td[2]")
	public static WebElement sbr7throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[7]/td[3]")
	public static WebElement sbr7throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[7]/td[4]")
	public static WebElement sbr7throw_4thColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[7]/td[5]")
	public static WebElement sbr7throw_5thColumn;
		
		
	// 8th
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[8]/td[2]")
	public static WebElement sbr8throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[8]/td[3]")
	public static WebElement sbr8throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[8]/td[4]")
	public static WebElement sbr8throw_4thColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[8]/td[5]")
	public static WebElement sbr8throw_5thColumn;
		
		
	
	// 9th
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[9]/td[2]")
	public static WebElement sbr9throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[9]/td[3]")
	public static WebElement sbr9throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[9]/td[4]")
	public static WebElement sbr9throw_4thColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[9]/td[5]")
	public static WebElement sbr9throw_5thColumn;
		

	
	// 10th
	
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[10]/td[2]")
		public static WebElement sbr10throw_2ndColumn;
		
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[10]/td[3]")
		public static WebElement sbr10throw_3rdColumn;
		
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[10]/td[4]")
		public static WebElement sbr10throw_4thColumn;
		
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[10]/td[5]")
		public static WebElement sbr10throw_5thColumn;
		
	// 11th
	
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[11]/td[2]")
		public static WebElement sbr11throw_2ndColumn;
		
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[11]/td[3]")
		public static WebElement sbr11throw_3rdColumn;
		
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[11]/td[4]")
		public static WebElement sbr11throw_4thColumn;
		
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[11]/td[5]")
		public static WebElement sbr11throw_5thColumn;
		
	// 12th
	
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[12]/td[2]")
		public static WebElement sbr12throw_2ndColumn;
		
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[12]/td[3]")
		public static WebElement sbr12throw_3rdColumn;
		
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[12]/td[4]")
		public static WebElement sbr12throw_4thColumn;
		
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[12]/td[5]")
		public static WebElement sbr12throw_5thColumn;
		
	// 13th
	
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[13]/td[2]")
		public static WebElement sbr13throw_2ndColumn;
		
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[13]/td[3]")
		public static WebElement sbr13throw_3rdColumn;
		
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[13]/td[4]")
		public static WebElement sbr13throw_4thColumn;
		
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[13]/td[5]")
		public static WebElement sbr13throw_5thColumn;
	
	// 14th
	
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[14]/td[2]")
		public static WebElement sbr14throw_2ndColumn;
		
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[14]/td[3]")
		public static WebElement sbr14throw_3rdColumn;
		
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[14]/td[4]")
		public static WebElement sbr14throw_4thColumn;
		
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[14]/td[5]")
		public static WebElement sbr14throw_5thColumn;
		
		@FindBy(xpath="//*[@id='panelsStayOpen-headingOne']//button")
		public static WebElement IQRecentStockPurchasesTransactionExpand;
		
		@FindBy(xpath="//*[@id='panelsStayOpen-headingTwo']//button")
		public static WebElement IQRecentStockSalessTransactionExpand;
		
		@FindBy(xpath="//*[@id='panelsStayOpen-headingThree']//button")
		public static WebElement IQBalanceByWarehouseTransactionExpand;
		
		@FindBy(xpath="//*[@id='panelsStayOpen-headingFour']//button")
		public static WebElement IQBalanceByBinsTransactionExpand;
		
		
		@FindBy(xpath="//*[@id='panelsStayOpen-headingFive']//button")
		public static WebElement IQRSellingRatesAndBuyingRatesExpand;
		
		

		@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[6]")
		public static WebElement closeBtnAfterSave;
		

		@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[8]//input")
		public static List<WebElement> masterGridBodyChkbox;
		
		@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[10]")
		public static List<WebElement> WmasterGridBodyName;

		@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[11]")
		public static List<WebElement> masterGridBodyName;
		
		@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[12]")
		public static List<WebElement> ProductmasterGridBodyName;
		
		@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[13]")
	    public static List<WebElement> ProductmasterGridBodyCode;
		
		@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[12]")
	    public static List<WebElement> masterGridBodyCode;

		
		
		
		@FindBy(xpath="//table[@id='purchaseTable']//tbody//tr[1]/td")
		public static List<WebElement> IQRecentStockTransactionPurchasesR1;
		
		@FindBy(xpath="//table[@id='purchaseTable']//tbody//tr[2]/td")
		public static List<WebElement> IQRecentStockTransactionPurchasesR2;
		
		
		@FindBy(xpath="//table[@id='purchaseTable']//tbody//tr[3]/td")
		public static List<WebElement> IQRecentStockTransactionPurchasesR3;
		
		@FindBy(xpath="//table[@id='purchaseTable']//tbody//tr[4]/td")
		public static List<WebElement> IQRecentStockTransactionPurchasesR4;
		
		@FindBy(xpath="//table[@id='purchaseTable']//tbody//tr[5]/td")
		public static List<WebElement> IQRecentStockTransactionPurchasesR5;
		
		@FindBy(xpath="//table[@id='purchaseTable']//tbody//tr[6]/td")
		public static List<WebElement> IQRecentStockTransactionPurchasesR6;
		
		
		
		@FindBy(xpath="//*[@id='salesTable']/tbody/tr[1]/td")
		public static List<WebElement> IQRecentStockTransactionsalesR1;
		
		@FindBy(xpath="//*[@id='salesTable']/tbody/tr[2]/td")
		public static List<WebElement> IQRecentStockTransactionsalesR2;
		
		
		@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td")
		public static List<WebElement> IQRecentStockTransactionsalesR3;
		
		@FindBy(xpath="//*[@id='salesTable']/tbody/tr[4]/td")
		public static List<WebElement> IQRecentStockTransactionsalesR4;
		
		
		@FindBy(xpath="//table[@id='tagWiseData']//tbody//tr[1]//td")
		public static List<WebElement> IQRecentStockTransactionWarehouseR1;
		
		@FindBy(xpath="//table[@id='tagWiseData']//tbody//tr[2]//td")
		public static List<WebElement> IQRecentStockTransactionWarehouseR2;
		
		
		@FindBy(xpath="//table[@id='tagWiseData']//tbody//tr[3]//td")
		public static List<WebElement> IQRecentStockTransactionWarehouseR3;
		
		@FindBy(xpath="//table[@id='tagWiseData']//tbody//tr[4]//td")
		public static List<WebElement> IQRecentStockTransactionWarehouseR4;
		
	
		@FindBy(xpath="//table[@id='BinTableData']//tbody//tr[1]//td")
		public static List<WebElement> IQRecentStockTransactionBinsR1;
		
		@FindBy(xpath="//table[@id='BinTableData']//tbody//tr[2]//td")
		public static List<WebElement> IQRecentStockTransactionBinsR2;
		
   	
		@FindBy(xpath="//*[@id='dvReportInputs']/div[1]/div/label/span")
		public static WebElement sl_SelectAllChkBox;
		

		@FindBy(xpath="//*[@id='navigation_menu']/li[3]/ul/li[3]/ul/li[5]")
		public static WebElement stockStatement;
		
		@FindBy(xpath="//*[@id='navigation_menu']/li[3]/ul/li[3]/ul/li[8]")
		public static WebElement virtualStockAnalysis;
		

		
		@FindBy(xpath="//*[@id='581']")
		public static WebElement stockAnalysisByRMA;

		
		@FindBy(xpath="//*[@id='540']")
		
		public static WebElement binsReportMenu;
		
		@FindBy(xpath="//*[@id='580']")
		public static WebElement stockAnalysisByBatch;
		
		

		@FindBy(xpath="//*[@id='579']")
		public static WebElement abcAnalysis;

		@FindBy(xpath="//*[@id='navigation_menu']/li[3]/ul/li[3]/ul/li[6]")
		public static WebElement stockMovement;
		

		@FindBy(xpath="//*[@id='navigation_menu']/li[3]/ul/li[3]/ul/li[9]")
		public static WebElement stockValuation;
		

		@FindBy(xpath="//*[@id='navigation_menu']/li[3]/ul/li[3]/ul/li[10]")
		public static WebElement stockReportByTag;
		

		@FindBy(xpath="//*[@id='552']")
		public static WebElement openingStocksRegister;

		
		@FindBy(xpath="//select[@id='DateOptions_']")
		public static WebElement sl_DateOptionDropdown;


		@FindBy(xpath="//*[@id='dvReportInputs']/div[1]/div/label/span")
		public static WebElement sl_HeaderSelectChkBox;
		
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-schedule')]")
		public static WebElement sl_ScheduleBtn;
		
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-custamize')]")
		public static WebElement sl_CustomizeBtn;
		
		@FindBy(xpath="//*[@id='id_reportmenudisplay']/ul/li[9]")
		public static WebElement sl_FilterExpandBtn;
		
		@FindBy(xpath="//*[@id='id_reportmenudisplay']/ul/li[9]/ul//li[1]")
		public static WebElement sl_FilterBtn;
		
		@FindBy(xpath="//*[@id='id_reportmenudisplay']/ul/li[9]/ul//li[2]")
		public static WebElement sl_RefineBtn;
		
		@FindBy(xpath="//div[@id='id_mainreportmenuheadings']//i[@class='icon-ok hiconright2']")
		public static WebElement sl_OkBtn;
		
		@FindBy(xpath="//div[@id='id_reportmenudisplay']//i[@class='icon-close hiconright2']")
		public static WebElement sl_CloseBtn;
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[1]//td[2]")
		public static WebElement stckldgrRow1;
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[18]//td")
		public static List<WebElement> A1SubTotal;
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[19]//td[2]")
		public static WebElement stckldgrRow19;
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[2]//td")
		public static List<WebElement> A2SubTotal;
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[3]//td[2]")
		public static WebElement stckldgrRow3;
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[10]//td")
		public static List<WebElement> AppleSubTotal;
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[11]//td[2]")
		public static WebElement stckldgrRow11;
		
	
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[14]//td")
		public static List<WebElement> B1SubTotal;
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[15]//td[2]")
		public static WebElement stckldgrRow15;
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[18]//td")
		public static List<WebElement> B2SubTotal;
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[19]//td[2]")
		public static WebElement stckldgrRowD19;
		
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[3]//td")
		public static List<WebElement> D1SubTotal;
		
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[4]//td[2]")
		public static WebElement stckldgrRowD4;
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[8]//td")
		public static List<WebElement>  D2SubTotal;
		
	
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[9]//td")
		public static List<WebElement> StckLedgerGrandTotal;
		
	
		
		@FindBy(xpath="//div[@id='tblFooterReportRender']//div[2]//button[4]")
		public static WebElement report_NextBtn;
		
		@FindBy(xpath="//div[@id='tblFooterReportRender']/div[2]//button[2]")
		public static WebElement report_PrevBtn;
		
	
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr//td")
		public static List<WebElement>  stockLedgerTable;
		
		
		@FindBy(xpath="//div[@id='tblFooterReportRender']//button[3]")
		public static WebElement pageNum;
		
		
		
		@FindBy(xpath="//span[@id='idFilterCustomizeIcon']")
		public static WebElement  report_FilterCustomizeBtn;
		
		@FindBy(xpath="//a[contains(text(),'Item')]//i")
		public static WebElement  report_FilterItemExpansion;
		
		@FindBy(xpath="(//a[contains(text(),'Warehouse')]//i)[1]")
		public static WebElement  report_FilterWarehouseExpansion;
		
		@FindBy(xpath="(//a[text()=' Account']//i)[1]")
		public static WebElement  report_FilterAccountExpansion;
		
		@FindBy(xpath="(//input[@id='5002'])[1]//following-sibling::span")
		public static WebElement  report_FilterAccountNameChkbox;
		
		@FindBy(xpath="(//input[@id='5002'])[1]")
		public static WebElement  report_FilterAccountNameChkboxSelected;
		
		@FindBy(xpath="//input[@id='5021']")
		public static WebElement  report_FilterItemNameChkbox;
		
		@FindBy(xpath="//input[@id='5058']//following-sibling::span")
		public static WebElement  report_FilterWarehouseNameChkbox;
		
		//@FindBy(xpath="(//input[@class='FButton-Primary'])[1]")
		@FindBy(xpath="//input[@class='FButton-Primary' and  @value='Ok']")
		public static WebElement  reports_Filter_Customize_OkBtn;
		
		@FindBy(xpath="//input[@id='FOption_551_0_DefaultFilter_0']")
		public static WebElement  osr_DefaultFilterTxt;
		
		@FindBy(xpath="//input[@id='FOption_500_0_DefaultFilter_0']")
		public static WebElement acc_DefaultFilterTxt;
		
		@FindBy(xpath="//span[@id='filterRefresh']")
		public static WebElement  report_Filter_RefreshBtn;
		
		@FindBy(xpath="//tbody/tr[1]/td[6]/span[1]")
		public static WebElement  report_Filter_RefreshConditionBtn;
		
		
		
		@FindBy(xpath="(//table[@class='CommonReportTable']/tbody)[1]/tr")
		public static List<WebElement> reportsRowsCount;
		

		@FindBy(xpath="//div[@id='id_reportmenudisplay']//li[text()='Filter']")
		public static WebElement report_FilterBtn;
		
		@FindBy(xpath="(//tr[@id='trRender_0'])[1]/td")
		public static List<WebElement> reportsRow1List;
		
		@FindBy(xpath="(//tr[@id='trRender_1'])[1]/td")
		public static List<WebElement> reportsRow2List;
		
		@FindBy(xpath="(//tr[@id='trRender_2'])[1]/td")
		public static List<WebElement> reportsRow3List;
		
		@FindBy(xpath="(//tr[@id='trRender_3'])[1]/td")
		public static List<WebElement> reportsRow4List;
		
		@FindBy(xpath="(//tr[@id='trRender_4'])[1]/td")
		public static List<WebElement> reportsRow5List;
		
		@FindBy(xpath="(//tr[@id='trRender_5'])[1]/td")
		public static List<WebElement> reportsRow6List;
		
		@FindBy(xpath="(//tr[@id='trRender_6'])[1]/td")
		public static List<WebElement> reportsRow7List;
		
		@FindBy(xpath="(//tr[@id='trRender_7'])[1]/td")
		public static List<WebElement> reportsRow8List;
		
		@FindBy(xpath="(//tr[@id='trRender_8'])[1]/td")
		public static List<WebElement> reportsRow9List;
		
		@FindBy(xpath="(//tr[@id='trRender_9'])[1]/td")
		public static List<WebElement> reportsRow10List;
		
		@FindBy(xpath="(//tr[@id='trRender_10'])[1]/td")
		public static List<WebElement> reportsRow11List;
		

		@FindBy(xpath="(//tr[@id='trRender_11'])[1]/td")
		public static List<WebElement> reportsRow12List;
		

		@FindBy(xpath="(//tr[@id='trRender_12'])[1]/td")
		public static List<WebElement> reportsRow13List;
		

		@FindBy(xpath="(//tr[@id='trRender_13'])[1]/td")
		public static List<WebElement> reportsRow14List;
		
		@FindBy(xpath="(//tr[@id='trRender_14'])[1]/td")
		public static List<WebElement> reportsRow15List;
		
		@FindBy(xpath="(//tr[@id='trRender_15'])[1]/td")
		public static List<WebElement> reportsRow16List;
		
		@FindBy(xpath="(//tr[@id='trRender_16'])[1]/td")
		public static List<WebElement> reportsRow17List;
		
		@FindBy(xpath="(//tr[@id='trRender_17'])[1]/td")
		public static List<WebElement> reportsRow18List;
		
		@FindBy(xpath="(//tr[@id='trRender_18'])[1]/td")
		public static List<WebElement> reportsRow19List;
		
	
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//td[2]")
		public static List<WebElement> reportsCol1List;
		
		@FindBy(xpath="//input[@id='donotshow']")
		public static WebElement doNotShowCheckbox;
		
	    @FindBy(xpath="//*[@id='id_Pick']/a")
	    public static WebElement  billRefPickIcon;  
		
	    @FindBy(xpath="//*[@id='id_Ok']/a")
	    public static WebElement  billRefOkBtn;   
	    
		@FindBy(xpath="//input[@id='id_header_4']")
		public static WebElement newCashBankAccountTxt;
		
		@FindBy(xpath="//*[@id='769']")
		public static WebElement purchaseVouchersVatBtnInPrint;
		
		
		@FindBy(xpath="//select[@id='EditLayout_FieldsCustomization_FieldDetails_DataType']")
	    public static WebElement editLayoutDataTypeDropdown;
		
		@FindBy(xpath="//input[@id='id_header_3']")
		public static WebElement  salesAccountTxt;
		
		@FindBy(xpath="//tbody[@id='id_header_4_table_body']/tr/td[2]")
		public static List<WebElement> vendorAccountListCount; 
		
		@FindBy(xpath="//a[@id='2001']//span[contains(text(),'Cash and Bank')]")
		public static WebElement  cashAndBankMenu; 
		
		@FindBy(xpath="//a[@id='2002']//span[contains(text(),'Receipts')]")
		public static WebElement  receiptsVoucher;
		
		
	    
		@FindBy(xpath="//ul[@class='nav navbar-nav navbar-left ulNewMaster']//li[2]//button[1]")
		public static WebElement SaveBtnInAccount;

		
		@FindBy(xpath="//*[@id='optiVoucherType1']")
		public static WebElement voucherTypeInPrintLayoutTab;

		
		@FindBy(xpath="//*[@id='panelsStayOpen-collapseOne']/label[7]/input")
		public static WebElement  printUsingDefaultPrinterAndFormatChkBoxSelected;
		
		@FindBy(xpath="//*[@id='panelsStayOpen-headingfour']/button")
		public static WebElement  TransactionHomePageExpanBtn;;

		
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//td[3]")
		public static List<WebElement> reportsCol2List;
		
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//td[4]")
		public static List<WebElement> reportsCol3List;
		
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//td[5]")
		public static List<WebElement> reportsCol4List;
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//td[6]")
		public static List<WebElement> reportsCol5List;
		
		@FindBy(xpath="//*[@id='2007']/span")
	  	public static WebElement  financialsTransactionsPurchaseMenu; 
		
		@FindBy(xpath="//span[text()='Purchase Voucher VAT']")
		public static WebElement  purchaseVouchersVat;
		
		@FindBy(xpath="//input[@id='id_header_1']")
		public static WebElement  documentNumberTxt;
		
		@FindBy(xpath="//a[@id='769']")
		public static WebElement  purchaseVoucherVATsBtnInDC;
		
		@FindBy(xpath="//*[@id='updateButton']")
		public static WebElement  updateBtnInDc;
		
		
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//td[7]")
		public static List<WebElement> reportsCol6List;
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//td[8]")
		public static List<WebElement> reportsCol7List;
		

		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//td[9]")
		public static List<WebElement> reportsCol8List;
		
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[1]//td")
		public static List<WebElement> reportsrow1List;
		
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[2]//td")
		public static List<WebElement> reportsrow2List;
		
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[3]//td")
		public static List<WebElement> reportsrow3List;
		
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[4]//td")
		public static List<WebElement> reportsrow4List;
		
		
		
		/*
		@FindBy(xpath="//table[@class='CommonReportTable']//tbody//td[8]")
		public static List<WebElement> reportsCol7List;*/
		
		@FindBy(xpath="//*[@id='RITCombobox__1']")
		public static WebElement  stockValuationDropdwon;
		
		@FindBy(xpath="//*[@id='726']/span")
		public static WebElement  stockValuationByFATagReport;
		
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody")
		public static WebElement reportsTable;
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tr[12]//td")
		public static List<WebElement> report12throw;
		
		@FindBy(xpath="//table[@class='CommonReportTable']//tr[17]//td")
		public static List<WebElement> report17throw;
		
		
		@FindBy(xpath="//a[@id='681']/span")
		public static WebElement GeneralLedgerAndInventoryMismatchReport;
		
		@FindBy (xpath="//input[@id='MasterGroup__101']")
		public static WebElement accountTxt;
		
		@FindBy (xpath="//input[@id='MasterSingle__4']")
		public static WebElement reportWarehouseTxt;
		
		//FA REPORTS
		
		@FindBy(xpath="//*[@id='658']/span")
		public static WebElement  ledgerDetail;
					
		@FindBy(xpath="//*[@id='501']/span")
		public static WebElement  subLedger;
		
		@FindBy(xpath="//*[@id='82']/span")
		public static WebElement  cashAndBankBooksMenu;
		
		@FindBy(xpath="//*[@id='510']/span")
		public static WebElement  cashBookReport;
		
		@FindBy(xpath="//*[@id='511']/span")
		public static WebElement  bankBookReport;
		
		@FindBy(xpath="//*[@id='512']/span")
		public static WebElement  pettyCashBokReport;
		
		@FindBy(xpath="//*[@id='513']/span")
		public static WebElement  dayBookReport;
		
		@FindBy(xpath="//*[@id='83']/span")
		public static WebElement  bankReconciliationReport;
		
		@FindBy(xpath="//*[@id='84']/span")
		public static WebElement  bankReconciliationImport;
		
		@FindBy(xpath="//*[@id='85']/span")
		public static WebElement  customerVendorReconciliation;

		@FindBy(xpath="//*[@id='537']/span")
		public static WebElement  bankReconciliationStatement;
			
		@FindBy(xpath="//*[@id='162']/span")
		public static WebElement chequeDiscountingMenu;
				
		@FindBy(xpath="//*[@id='502']/span")
		public static WebElement  salesReportsMenu;
		
		@FindBy(xpath="//*[@id='503']/span")
		public static WebElement  salesRegisterReport;

		@FindBy(xpath="//*[@id='504']/span")
		public static WebElement  salesReturnRegisterReport;
		
		@FindBy(xpath="//*[@id='505']/span")
		public static WebElement summarySalesBookReport;
		
		@FindBy(xpath="//*[@id='628']/span")
		public static WebElement monthlySalesBookReport;
		
		@FindBy(xpath="//*[@id='629']/span")
		public static WebElement  topCustomersListReport;
				
		@FindBy(xpath="//*[@id='506']/span")
		public static WebElement  purchaseReportsMenu;
				
		@FindBy(xpath="//*[@id='507']/span")
		public static WebElement  purchaseRegisterReport;
		
		@FindBy(xpath="//*[@id='508']/span")
		public static WebElement  purchaseReturnRegisteReport;
		
		@FindBy(xpath="//*[@id='509']/span")
		public static WebElement  summaryPurchaseBookReport;
							
		@FindBy(xpath="//*[@id='514']/span")
		public static WebElement  registersReportMenu;
				
		@FindBy(xpath="//*[@id='516']/span")
		public static WebElement  openingBalanceRegisterReport;
		
		@FindBy(xpath="//*[@id='515']/span")
		public static WebElement journalEntriesRegisterReport;
		
		@FindBy(xpath="//span[contains(text(),'Credit Note Register')]")
		public static WebElement creditNoteRegisterReport;
		
		@FindBy(xpath="//*[@id='610']/span")
		public static WebElement  debitNoteRegisterReport;
		
		@FindBy(xpath="//*[@id='598']/span")
		public static WebElement  receiptsRegisterReport;
		
		@FindBy(xpath="//*[@id='599']/span")
		public static WebElement  paymentRegisterReport;
		
		@FindBy(xpath="//*[@id='518']/span")
		public static WebElement  pdcReceiptsRegisterReport;
		
		@FindBy(xpath="//*[@id='519']/span")
		public static WebElement pdcPaymentsRegisterReport;
		
		@FindBy(xpath="//*[@id='517']/span")
		public static WebElement  entryJournalRegisterReport;
		
		@FindBy(xpath="//span[contains(text(),'Entry journal detail report')]")
		public static WebElement  entryJournalDetailReport;
		
							
		@FindBy(xpath="//*[@id='523']/span")
		public static WebElement  salesAndPurchasesReportMenu;
				
		@FindBy(xpath="//*[@id='524']/span")
		public static WebElement  salesGroupedByCustomerReport;
		
		@FindBy(xpath="//*[@id='525']/span")
		public static WebElement  salesGroupedByProductReport;
		
		@FindBy(xpath="//*[@id='526']/span")
		public static WebElement  salesGroupedByDepartmentReport;
		
		@FindBy(xpath="//*[@id='527']/span")
		public static WebElement  purchasesGroupedByVendorReport;
		
		@FindBy(xpath="//*[@id='528']/span")
		public static WebElement  purchasesGroupedByProductReport;
		
		@FindBy(xpath="//*[@id='529']/span")
		public static WebElement  purchasesGroupedByDepartmentReport;		
				
		@FindBy(xpath="//*[@id='568']/span")
		public static WebElement  MiscellaneousAnalysisReportMenu;
				
		@FindBy(xpath="//*[@id='569']/span")
		public static WebElement  peakAndLowBalancesReport;
		
		@FindBy(xpath="//*[@id='570']/span")
		public static WebElement  comprativeAnalysisReport;
		
		@FindBy(xpath="//*[@id='571']/span")
		public static WebElement  transactionsTypeAnalysisReport;
		
		@FindBy(xpath="//*[@id='572']/span")
		public static WebElement  abcAnalysisReport;
		
		@FindBy(xpath="//*[@id='597']/span")
		public static WebElement  interestCalculationReport;

		@FindBy(xpath="//*[@id='536']/span")
		public static WebElement  mastersInformationMenu;
				
	 	@FindBy(xpath="//*[@id='538']/span")
		public static WebElement  masterInfoMenu;
		
		@FindBy(xpath="//*[@id='144']/span")
		public static WebElement  productLabelMenu;
		
		@FindBy(xpath="//*[@id='573']/span")
		public static WebElement  unitConversionMenu;
			
		@FindBy(xpath="//*[@id='147']/span")
		public static WebElement  skidDefinitionMenu;
									
		@FindBy(xpath="//*[@id='520']/span")
		public static WebElement  auditTrailMenu;
				
		@FindBy(xpath="//*[@id='521']/span")
		public static WebElement  auditTrailtransactionsReport;
		
		@FindBy(xpath="//*[@id='522']/span")
		public static WebElement  aAuditTrailloginsReport;
				
		@FindBy(xpath="//*[@id='204']/span")
		public static WebElement  accountQuery;
		
		@FindBy(xpath="//span[contains(text(),'Transaction authorization report')]")
		public static WebElement  transactionAuthorizationReport;
		
		

		@FindBy(xpath="//input[@id='MasterGroup__101']")
		public static WebElement reportaccountTxt;
		
		@FindBy(xpath="//*[@id='MasterGroup__101_table_body']/tr/td[2]")
		public static List<WebElement> reportaccountTxtList;
		
		@FindBy(xpath="//select[@id='RITCombobox__1']")
		public static WebElement includePdcDropDown;
		
		@FindBy(xpath="//select[@id='RITCombobox__5']")
		public static WebElement sortingDropDown;
		
		@FindBy(xpath="//select[@id='RITCombobox__10']")
		public static WebElement includeNonAuthorizedDataDropDown;
		
		@FindBy(xpath="//input[@id='RITCheckbox__6']")
		public static WebElement displayUnRealizedLossorGainChkBox;
		
		@FindBy(xpath="//input[@id='RITCheckbox__4']")
		public static WebElement ignoreConvertedPdcChkBox;
		
		@FindBy(xpath="//*[@id='722']/span")
		public static WebElement virtualBankLedgerReport;
		
		
		@FindBy(xpath="//input[@id='opt_DocumentTypeID']")
		public static WebElement documentTxt;
		
		@FindBy(xpath="//input[@id='opt_LayoutID']")
		public static WebElement layoutTxt;
		
		@FindBy(xpath="//input[@id='idrdDocument']")
		public static WebElement documentRadioBtn;
		
		@FindBy(xpath="//input[@id='idrdProduct']")
		public static WebElement itemRadioBtn;
		
		@FindBy(xpath="//i[@class='icon-add-preview icon-font6']")
		public static WebElement pl_previewBtn;
		
		@FindBy(xpath="//i[@class='icon-print hiconright2']")
		public static WebElement pl_printBtn;
		
		@FindBy(xpath="//i[@class='icon-close hiconright2']")
		public static WebElement pl_CloseBtn;
		


		// Skid Definition
		
		
		@FindBy(xpath="//input[@id='skidId']")
		public static WebElement skid;
		
		@FindBy(xpath="//input[@id='txtprefix']")
		public static WebElement prefixTxt;
		
		@FindBy(xpath="//input[@id='txtStartingNumber']")
		public static WebElement startingNoTxt;
		
		@FindBy(xpath="//input[@id='chkSkid']//following-sibling::span")
		public static WebElement enableReprintChkBox;
		
		@FindBy(xpath="//input[@id='txtQuantity']")
		public static WebElement quantityTxt;
		
		@FindBy(xpath="//*[@class='icon-analyze hiconright2']")
		public static WebElement sd_PreviewBtn;
		
		@FindBy(xpath="//*[@class='icon-print hiconright2']")
		public static WebElement sd_PrintBtn;
		
		@FindBy(xpath="//*[@class='icon-close hiconright2']")
		public static WebElement sd_CloseBtn;


		@FindBy(xpath="//input[@id='RITTable__0']")
		public static WebElement reportVoucherTxt;
		
		@FindBy(xpath="//*[@id='RITTable__0_table_body']/tr/td[2]")
		public static List<WebElement> reportVoucherTxtList;
		
		@FindBy(xpath="//table[@class='CommonReportTable']")
		public static WebElement reportTable;
		


		
		@FindBy(xpath="//input[@id='RITTable__0']")
		public static WebElement reportUsersTxt;
		
		@FindBy(xpath="//*[@id='RITTable__0_table_body']/tr/td[2]")
		public static List<WebElement> reportUsersTxtList;
		
		@FindBy(xpath="//input[@id='accountQuery']")
		public static WebElement accountQueryTxt;
		
		@FindBy(xpath="//*[@id='page_Content']//input[@type='button']")
		public static WebElement getAccountDetailsBtn;
		
		@FindBy(xpath="//table[@id='creditTransTable']//tr[1]//td")
		public static List<WebElement> CreditTransactionsTableR1;
		@FindBy(xpath="//table[@id='creditTransTable']//tr[2]//td")
		public static List<WebElement> CreditTransactionsTableR2;
		
		@FindBy(xpath="//table[@id='debitTransTable']//tr[1]//td")
		public static List<WebElement> debitTransactionsTableR1;
		@FindBy(xpath="//table[@id='debitTransTable']//tr[2]//td")
		public static List<WebElement> debitTransactionsTableR2;
		@FindBy(xpath="//table[@id='debitTransTable']//tr[3]//td")
		public static List<WebElement> debitTransactionsTableR3;
		
		
		@FindBy(xpath="//*[@id='page_Content']/div/div[2]/div[7]/div[1]/span")
		public static WebElement departmentBillWiseToggle;
		
		@FindBy(xpath="//table[@id='tagWiseTransData']//tr[1]//td")
		public static List<WebElement> TagTransactionTableR1;
		@FindBy(xpath="//table[@id='tagWiseTransData']//tr[2]//td")
		public static List<WebElement> TagTransactionTableR2;
		@FindBy(xpath="//table[@id='tagWiseTransData']//tr[3]//td")
		public static List<WebElement> TagTransactionTableR3;
		
		@FindBy(xpath="//span[@id='openingBal']")
		public static WebElement  AQ_OpnBal;
		
		@FindBy(xpath="//span[@id='credit']")
		public static WebElement  AQ_Credit;
		
		@FindBy(xpath="//span[@id='debit']")
		public static WebElement  AQ_Debit;
		
		@FindBy(xpath="//span[@id='balance']")
		public static WebElement  AQ_Balance;
		
		
		@FindBy(xpath="//*[@id='711']//span[contains(text(),'Master authorization report')]")
		public static WebElement  masterAuthorizationReport;
		
		//Receivable payable analysis
		
		

		@FindBy(xpath="//a[@id='558']//span[contains(text(),'Receivable and Payable Analysis')]")
		public static WebElement  receivableAndPayableAnalysisMenu;

		@FindBy(xpath="//a[@id='605']//span[contains(text(),'Customer Detail')]")
		public static WebElement  customerDetailMenu;

		@FindBy(xpath="//span[contains(text(),'Customer Summary')]")
		public static WebElement  customerSummaryMenu;

		@FindBy(xpath="//a[@id='606']//span[contains(text(),'Vendor Detail')]")
		public static WebElement  vendorDetailMenu;

		@FindBy(xpath="//a[@id='608']//span[contains(text(),'Vendor Summary')]")
		public static WebElement  vendorSummaryMenu;

		@FindBy(xpath="//a[@id='75']//span[contains(text(),'Letter of Credit')]")
		public static WebElement  letterOfCreditReport;

		@FindBy(xpath="//span[contains(text(),'Release Letter of Credit')]")
		public static WebElement  releaseLetterOfCreditReport;



		@FindBy(xpath="//span[contains(text(),'Customer Listing of Outstanding Bills')]")
		public static WebElement  customerDetailsCustomerListingOfOutstandingBillsReport;

		@FindBy(xpath="//span[contains(text(),'Customer Statements')]")
		public static WebElement  customerDetailsCustomerStatementsReport;

		@FindBy(xpath="//span[contains(text(),'Customer Due Date Analysis')]")
		public static WebElement  customerDetailsCustomerDueDateAnalysisReport;

		@FindBy(xpath="//a[@id='563']//span[contains(text(),'Ageing Details')]")
		public static WebElement  customerDetailsCustomerAgeingDetailsReport;

		@FindBy(xpath="//span[contains(text(),'Customer Detail Ageing by Due Date')]")
		public static WebElement  customerDetailsCustomerDetailAgeingByDueDateReport;

		@FindBy(xpath="//a[@id='566']//span[contains(text(),'Overdue Analysis')]")
		public static WebElement  customerDetailsCustomerOverdueAnalysisReport;



		@FindBy(xpath="//span[contains(text(),'Customer Ageing Summary')]")
		public static WebElement  customerSummaryCustomerAgeingSummaryReport;

		@FindBy(xpath="//a[@id='565']//span[contains(text(),'Summary Ageing by Due Date')]")
		public static WebElement  customerSummaryAgeingByDueDateReport;

		@FindBy(xpath="//a[@id='567']//span[contains(text(),'Overdue Summary')]")
		public static WebElement  customerSummaryCustomerOverDueSummeryReport;

		@FindBy(xpath="//span[contains(text(),'Customer bill-wise summary')]")
		public static WebElement  customerSummaryCustomerBillWiseSummeryReport;



		@FindBy(xpath="//span[contains(text(),'Vendor Listing of Outstanding Bills')]")
		public static WebElement  vendorDetailsVendorListingOfOutstandingBillsReport;

		@FindBy(xpath="//span[contains(text(),'Vendor Statements')]")
		public static WebElement  vendorDetailsVendorStatementsReport;

		@FindBy(xpath="//span[contains(text(),'Vendor Due Date Analysis')]")
		public static WebElement  vendorDetailsVendorDueDateAnalysisReport;

		@FindBy(xpath="//span[contains(text(),'Vendor Ageing Details')]")
		public static WebElement  vendorDetailsVendorAgeingDetailsReport;

		@FindBy(xpath="//span[contains(text(),'Vendor Detail Ageing by Due Date')]")
		public static WebElement  vendorDetailsVendorDetailsAgeingByDueDateReport;

		@FindBy(xpath="//span[contains(text(),'Vendor Overdue Analysis')]")
		public static WebElement  vendorDetailsVendorOverdueAnalysisReport;



		@FindBy(xpath="//span[contains(text(),'Vendor Ageing Summary')]")
		public static WebElement  vendorSummeryVendorAgeingSummaryReport;

		@FindBy(xpath="//span[contains(text(),'Vendor Summary Ageing by Due Date')]")
		public static WebElement  vendorSummeryVendorSummaryAgeingByDueDateReport;

		@FindBy(xpath="//span[contains(text(),'Vendor Overdue Summary')]")
		public static WebElement  vendorSummeryVendorOverdueSummaryReport;

		@FindBy(xpath="//span[contains(text(),'Vendor bill-wise summary')]")
		public static WebElement  vendorSummeryVendorBillWiseSummaryReport;



		//Final Accounts
		@FindBy(xpath="//*[@id='530']/span")
	    public static WebElement  financialsFinalAccountsMenu;
		
		@FindBy(xpath="//*[@id='531']/span")
		public static WebElement trialBalanceReport;
				
		@FindBy(xpath="//*[@id='532']/span")
		public static WebElement profitandLossReport;
		
		@FindBy(xpath="//*[@id='533']/span")
		public static WebElement  tradingAccountReport;
		
		@FindBy(xpath="//*[@id='534']/span")
		public static WebElement  tradingandProfitAndLossReport;
		
		@FindBy(xpath="//*[@id='535']/span")
		public static WebElement  balanceSheetReport;				
		
		@FindBy(xpath="//*[@id='592']/span")
		public static WebElement  finalAccountSchedulesReport;
		
		@FindBy(xpath="//*[@id='593']/span")
		public static WebElement  fundFlowReport;
		
		@FindBy(xpath="//*[@id='594']/span")
		public static WebElement  cashFlowReport;
		
		@FindBy(xpath="//*[@id='252']/span")
		public static WebElement  cashFlowCalendarReport;
		
		@FindBy(xpath="//*[@id='595']/span")
		public static WebElement  cashFlowAnalysisReport;
		
		@FindBy(xpath="//*[@id='632']/span")
		public static WebElement  advanceCashFlowReport;
		
		@FindBy(xpath="//*[@id='630']/span")
		public static WebElement  incomeExpenseTrendsReport;
		
		@FindBy(xpath="//*[@id='655']/span")
		public static WebElement  receivablePayableReport;
		

		@FindBy (xpath="//div[@id='id_reportmenudisplay']//i[@class='icon-print hiconright2']")
		public static WebElement sl_ReportPrintBtn;
		
		

		@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[3]/div/label/input")
		public static WebElement extraFields_PropertiesMandatoryChekboxSelected;
		
		@FindBy (xpath="//table[@id='tblNumList_ExtraField']/tbody/tr[1]/td[1]/input")
		public static WebElement extraFields_NumberListDatTypeRow1Col1;
		
		@FindBy (xpath="//table[@id='tblNumList_ExtraField']/tbody/tr[1]/td[2]/input")
		public static WebElement extraFields_NumberListDatTypeRow1Col2;
		
		
		@FindBy(xpath="//*[@id='divBtnGroup6']")
		public static WebElement accountHeaderCreateTab;
		
		@FindBy(xpath="//input[@id='CreateTabTextField']")
		public static WebElement accountHeaderCreateTabTextFieldTxt;
		
		@FindBy(xpath="//input[@id='CreateTabNumberField']")
		public static WebElement accountHeaderCreateTabNumberFieldTxt;
		
		@FindBy(xpath="//input[@id='CreateTabBooleanField']")
		public static WebElement accountHeaderCreateTabBooleanFieldChkbox;
		
		@FindBy(xpath="//span[@id='CreateTabDateTimeField']")
		public static WebElement accountHeaderCreateTabDateTimeField;
		
		@FindBy(xpath="//input[@id='CreateTabDateField']")
		public static WebElement accountHeaderCreateTabDateField;
		
		@FindBy(xpath="//input[@id='CreateTabTimeField']")
		public static WebElement accountHeaderCreateTabTimeFieldTxt;
		
		
		@FindBy(xpath="//input[@id='CreateTabFractionField']")
		public static WebElement accountHeaderCreateTabFractionFieldTxt;
		
		@FindBy(xpath="//div[@id='ImageDiv']")
		public static WebElement accountHeaderCreateTabPictureFieldBrowseBtn;
		
		@FindBy(xpath="(//a[@id='SaveImg'])[2]")
		public static WebElement accountHeaderCreateTabPictureFieldSaveBtn;
		
		@FindBy(xpath="(//i[@class='fa fa-eraser RemoveImg'])[2]")
		public static WebElement accountHeaderCreateTabPictureFieldDeleteBtn;
		
		@FindBy(xpath="//select[@id='CreateTabStringListField']")
		public static WebElement accountHeaderCreateTabStringListFieldDropdown;
		
		@FindBy(xpath="//*[@id='CreateTabDocumentViewerField']")
		public static WebElement accountHeaderCreateTabDocumentViewerField;
		
		@FindBy(xpath="//*[@id='uploadBtnCreateTabDocumentViewerField']")
		public static WebElement accountHeaderCreateTabDocumentViewerBrowseBtn;
		
		@FindBy(xpath="(//*[@id='SaveImg'])[3]")
		public static WebElement accountHeaderCreateTabDocumentViewerSaveBtn;
		
		@FindBy(xpath="(//i[@class='fa fa-eraser RemoveImg'])[3]")
		public static WebElement accountHeaderCreateTabDocumentViewerEraseBtn;

		@FindBy(xpath="//*[@id='CreateTabNumberListField']")
		public static WebElement accountHeaderCreateTabNumberListFieldDropdown;
		
		@FindBy(xpath="//input[@id='CreateTabMasterField']")
		public static WebElement accountHeaderCreateTabMasterFieldTxt;
		
		@FindBy(xpath="//*[@id='CreateTabMasterField_input_container']/div[2]/table/tbody/tr/td[3]/i")
		public static WebElement accountHeaderCreateTabMasterFieldSettingsBtn;
		
		@FindBy(xpath="//*[@id='CreateTabBigNumberField']")
		public static WebElement accountHeaderCreateTabBigNumberField;
		
		@FindBy(xpath="//*[@id='CreateTabExternalTableField']")
		public static WebElement accountHeaderCreateTabExternalFieldDropdown;
		
		@FindBy(xpath="//*[@id='CreateTabExternalTableField_input_settings']/span")
		public static WebElement accountHeaderCreateTExternalFieldSettingsBtn;
		
		@FindBy(xpath="//*[@id='CreateTabSmallNumberField']")
		public static WebElement accountHeaderCreateTabSmallNumberField;
		
		@FindBy(xpath="//*[@id='CreateTabTinyNumberField']")
		public static WebElement accountHeaderCreateTabTinyNumberField;//
		
		@FindBy(xpath="//*[@id='CreateTabGregorianField_checkbox']")
		public static WebElement accountHeaderCreateTabGregorianCheckBox;
		
		@FindBy(xpath="//*[@id='CreateTabGregorianField']")
		public static WebElement accountHeaderCreateTabGregorianDateField;
		
		@FindBy(xpath="//*[@id='CreateTabGregorianField_input_container']/div[1]/i[2]")
		public static WebElement accountHeaderCreateTabGregorianCalenderIcon;
		
		@FindBy(xpath="//*[@id='CreateTabHijriField_checkbox']")
		public static WebElement accountHeaderCreateTabHijriFieldCheckBox;
		
		@FindBy(xpath="//*[@id='CreateTabHijriField']")
		public static WebElement accountHeaderCreateTabHijriFieldDate;
		
		@FindBy(xpath="//*[@id='CreateTabHijriField_input_container']/div[1]/i[2]")
		public static WebElement accountHeaderCreateTabHijriFieldCalenderIcon;
		
		@FindBy(xpath="//*[@id='CreateTabShamsiField_checkbox']")
		public static WebElement accountHeaderCreateTabShamsiFieldCheckBox;
		
		@FindBy(xpath="//*[@id='CreateTabShamsiField']")
		public static WebElement accountHeaderCreateTabShamsiFieldDate;
		
		@FindBy(xpath="//*[@id='CreateTabShamsiField_input_container']/div[1]/i[2]")
		public static WebElement accountHeaderCreateTabShamsiFieldCalenderIcon;
		
		
		@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[8]/div/label/input")
		public static WebElement extraFields_PropertiesMandatoryInGroupChekboxSelected;
		
		@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[12]/div/label/input")
		public static WebElement extraFields_PropertiesMassUpdateChekboxSelected;
		
		@FindBy(xpath="//*[@id='ExtraField_DefaultValue']")
		public static WebElement extraFields_FieldDetailsDefaultValueDrpdwn;
		
		@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[16]/div/label/input")
		public static WebElement extraFields_PropertiesCopyFromParentChekboxSelected;
		
		@FindBy(xpath="//*[@id='ExtraField_MandatoryFields']")
		public static WebElement extraField_FieldDetailsMandatoryFields;
		
		@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[17]/div/label/input")
		public static WebElement extraFields_PropertiesReadOnlyChekboxSelected;
		


		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[6]")
		public static WebElement  select2ndRow_5thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[7]")
		public static WebElement  select2ndRow_6thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[10]")
		public static WebElement  select2ndRow_9thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[13]")
		public static WebElement  select2ndRow_12thColumn;
		
		@FindBy (xpath="//div[@id='ExtraField_NumValueTable']/div/div[2]/button[1]")
		public static WebElement extraFields_NumberListDatTypeOkBtn;
		
		
		@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[18]/div/label/input")
		public static WebElement extraFields_PropertiesInformationFieldChekboxSelected;
		
		@FindBy(xpath="//*[@id='MCustomize_DeleteField_Modal']//input[1]")
		public static WebElement FieldDltYesBtn;


		@FindBy(xpath="//*[@id='idGlobalError']/div[1]/div[1]/button")
		public static WebElement errorMessageCloseBtn1;
			
		
	    @FindBy(xpath="//*[@id='idGlobalError']/div[1]/div[2]")
		public static WebElement errorMessage1;
		
	    @FindBy (xpath="//*[@id='rbnDisplayDebitCreditTotalForEachMonth']")
		public static WebElement displayDrOrCrTotalsForEachMonthRadioBtnInProperties;
		
		@FindBy (xpath="//*[@id='rbnrbnDisplayDebitCreditTotalForEachDay']")
		public static WebElement displayDrOrCrTotalsForEachDayRadioBtnInProperties;
		
		
		@FindBy (xpath="//*[@id='chkDisplayUnRealizeGainLossInLedger']//following-sibling::span")
		public static WebElement displayUnRealizeGainLossInLedgerChkbox;
		
		@FindBy (xpath="//*[@id='chkDisplayUnRealizeGainLossInLedger']")
		public static WebElement displayUnRealizeGainLossInLedgerChkboxSelected;
		
		@FindBy (xpath="//*[@id='btnPropOk']")
		public static WebElement okBtnInAccountProperties;
		

		@FindBy(xpath="//*[@id='id_header_2']")
		public static WebElement  dateText;
		
		 @FindBy(xpath="//input[@id='id_header_4']")
			public static WebElement  customerAccountTxt;

		 @FindBy(xpath="//input[@id='id_header_268435459']")
			public static WebElement  departmentTxt;
		 
		 @FindBy(xpath="//tbody[@id='id_header_268435459_table_body']/tr/td[2]")
		    public static List<WebElement> departmentListCount;
			
		 @FindBy(xpath="//input[@id='id_header_268435470']")
		    public static WebElement  salesInvoiceVATPlaceOFSupply;
		 
		    @FindBy(xpath="//tbody[@id='id_header_268435470_table_body']/tr/td[2]")
		    public static List<WebElement> placeOFSupplyList;
		    

			@FindBy(xpath="//input[@id='id_header_268435471']")
			public static WebElement  jurisdictionTxt;
			  
			
			@FindBy(xpath="//input[@id='id_body_536870916']")
		    public static WebElement enter_WarehouseTxt;
			
			@FindBy(xpath="//*[@id='id_body_536870916_table_body']/tr")
		    public static List<WebElement> pvvGridWarehouseList;
			
			@FindBy(xpath="//input[@id='id_body_23']")
			public static WebElement  enter_ItemTxt;
			
			@FindBy(xpath="//input[@id='id_body_12']")
			public static WebElement  enter_SalesAccountTxt;
			
			@FindBy(xpath="//input[@id='id_body_24']")
			public static WebElement  enter_UnitTxt;
			
			@FindBy(xpath="//input[@id='id_body_26']")
			public static WebElement  enter_Quantity;
			
			@FindBy(xpath="//input[@id='id_body_27']")
			public static WebElement  enter_Rate;
			
			@FindBy(xpath="//input[@id='id_body_28']")
			public static WebElement  enter_Gross;
			
			  
		    @FindBy(xpath="//*[@id='id_body_33554511']")
		    public static WebElement enter_AQTxt;

		    @FindBy(xpath="//*[@id='id_body_33554512']")
		    public static WebElement enter_FQTxt;
		    
		    @FindBy(xpath="//*[@id='id_body_33554529']")
		    public static WebElement  enter_Vat;
		    
		    @FindBy(xpath="//a[@id='2014']")
			public static WebElement financialsTransactionsSales;
		    
			@FindBy(xpath="//*[@id='id_transactionentry_save']")
			public static WebElement  voucherSaveBtn;
			
			@FindBy(xpath="//input[@id='txtNewReference']")
			public static WebElement  billRefNewReferenceTxt;
			
			@FindBy(xpath="//input[@id='txtNewReference']")
			public static WebElement newReferenceTxt;
			
			@FindBy(xpath="//tbody[@id='LandingGridBody']/tr/td[8]/div/label/input")
			public static List<WebElement> stockLedgerHometableItemChkboxList;
			
			@FindBy(xpath="//tbody[@id='LandingGridBody']/tr/td[11]")
			public static List<WebElement> stockLedgerHometableItemNamesList;
			
			
			@FindBy(xpath="//tbody[@id='LandingGridBody']/tr")
			public static List<WebElement> stockLedgerHometableRowCount;
			
			@FindBy(xpath="//*[@id='trRender_0']/td[1]")
			public static WebElement sl_1stRow1stCol;
			
			 @FindBy(xpath="//input[@id='id_header_11']")
				public static WebElement  voucherHeaderExchangeRate;
				
			    @FindBy(xpath="//input[@id='id_header_10']")
				public static WebElement  voucherHeaderCurrency;
				
			    
				
				@FindBy(xpath="//*[@id='id_header_4_table_body']/tr/td[2]")
				public static List<WebElement>  cashAndBAnkAccountList;
				
				@FindBy(xpath="//input[@id='id_body_12']")
				public static WebElement  enter_AccountTxt;
				
				@FindBy(xpath="//input[@id='id_body_16']")
				public static WebElement  enter_Amount;
				

				@FindBy(xpath="//*[@id='lblAccount']")
				public static WebElement  billRefPartyName;
				
				@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[1]/td")
				public static List<WebElement> report1stRowList;

				@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[2]/td")
				public static List<WebElement> report2ndRowList;

				@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[3]/td")
				public static List<WebElement> report3rdRowList;

				@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[4]/td")
				public static List<WebElement> report4thRowList;

				@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[5]/td")
				public static List<WebElement> report5thRowList;

				@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[6]/td")
				public static List<WebElement> report6thRowList;

				@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[7]/td")
				public static List<WebElement> report7thRowList;

				@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[8]/td")
				public static List<WebElement> report8thRowList;

				@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[9]/td")
				public static List<WebElement> report9thRowList;

				@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[10]/td")
				public static List<WebElement> report10thRowList;

				@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[11]/td")
				public static List<WebElement> report11thRowList;

				@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[12]/td")
				public static List<WebElement> report12thRowList;

				@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[13]/td")
				public static List<WebElement> report13thRowList;

				@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[14]/td")
				public static List<WebElement> report14thRowList;

				@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[15]/td")
				public static List<WebElement> report15thRowList;

				
				@FindBy(xpath="//*[@id='trRender_1']/td[3]")
				public static WebElement sl_2ndRow3rdCol;


				
				@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[2]")
				public static WebElement  select2ndRow_1stColumn;
				
				@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[3]")
				public static WebElement  select2ndRow_2ndColumn;
				
				@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[4]")
				public static WebElement  select2ndRow_3rdColumn;
				
				
				
				@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[2]")
				public static WebElement  select3rdRow_1stColumn;
				
				@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[3]")
				public static WebElement  select3rdRow_2ndColumn;
				
				@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[4]")
				public static WebElement  select3rdRow_3rdColumn;
				
				
				@FindBy(xpath="//*[@id='ddlStatus']")
				public static WebElement statusDropDownInAcoountProperties;
				
				
				@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody")
			    public static WebElement ledgerTable;
				
				
				@FindBy(xpath="//*[@id='MasteroptionControl']")
				public static WebElement restrictForEntryTableMastersCombo;
				
				@FindBy(xpath="//*[@id='restrictionEntryTable_col_1-2']/label/span")
				public static WebElement restrictForEntryTableRow1EntryChkbox;
				
				@FindBy(xpath="//*[@id='restrictionEntryTable_col_1-3']/label/span")
				public static WebElement restrictForEntryTableRow1ReportChkbox;
				
				@FindBy(xpath="//*[@id='restrictionEntryTable_col_1-4']/label/span")
				public static WebElement restrictForEntryTableRow1ViewChkbox;
				
				
				
				@FindBy(xpath="//*[@id='restrictionEntryTable_col_2-2']/label/span")
				public static WebElement restrictForEntryTableRow2EntryChkbox;
				
				@FindBy(xpath="//*[@id='restrictionEntryTable_col_2-3']/label/span")
				public static WebElement restrictForEntryTableRow2ReportChkbox;
				
				@FindBy(xpath="//*[@id='restrictionEntryTable_col_2-4']/label/span")
				public static WebElement restrictForEntryTableRow2ViewChkbox;
				
				
				
				@FindBy(xpath="//*[@id='restrictionEntryTable_col_3-2']/label/span")
				public static WebElement restrictForEntryTableRow3EntryChkbox;
				
				@FindBy(xpath="//*[@id='restrictionEntryTable_col_3-3']/label/span")
				public static WebElement restrictForEntryTableRow3ReportChkbox;
				
				@FindBy(xpath="//*[@id='restrictionEntryTable_col_3-4']/label/span")
				public static WebElement restrictForEntryTableRow3ViewChkbox;
				

				
				@FindBy(xpath="//*[@id='restrictionEntryTable_col_4-2']/label/span")
				public static WebElement restrictForEntryTableRow4EntryChkbox;
				
				@FindBy(xpath="//*[@id='restrictionEntryTable_col_4-3']/label/span")
				public static WebElement restrictForEntryTableRow4ReportChkbox;
				
				@FindBy(xpath="//*[@id='restrictionEntryTable_col_4-4']/label/span")
				public static WebElement restrictForEntryTableRow4ViewChkbox;
				
				
				@FindBy(xpath="//*[@id='RestrictionForEntry']/div/div[2]/div[1]/label/span")
				public static WebElement restrictForEntryExclusionChkbox;
				
				
				@FindBy(xpath="//table[@id='landgridData']/tbody")
				public static WebElement reportAccountsTable;
				
				
				@FindBy(xpath="//div[@id='restrictionsDiv']//tbody[@id='restrictionEntryTable_body']/tr[1]/td[@id='restrictionEntryTable_col_1-1']")
				public static WebElement restrictForEntryTable1stRow1stCol;
				
				@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[1]/td[3]")
				public static WebElement restrictForEntryTable1stRow2ndCol;
				
				@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[1]/td[4]")
				public static WebElement restrictForEntryTable1stRow3rdCol;
				
				@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[1]/td[5]")
				public static WebElement restrictForEntryTable1stRow4thCol;
				
				
				@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[2]/td[2]")
				public static WebElement restrictForEntryTable2ndRow1stCol;
				
				@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[2]/td[3]")
				public static WebElement restrictForEntryTable2ndRow2ndCol;
				
				@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[2]/td[4]")
				public static WebElement restrictForEntryTable2ndRow3rdCol;
				
				@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[2]/td[5]")
				public static WebElement restrictForEntryTable2ndRow4thCol;
				
				
				@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[3]/td[2]")
				public static WebElement restrictForEntryTable3rdRow1stCol;
				
				@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[3]/td[3]")
				public static WebElement restrictForEntryTable3rdRow2ndCol;
				
				@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[3]/td[4]")
				public static WebElement restrictForEntryTable3rdRow3rdCol;
				
				@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[3]/td[5]")
				public static WebElement restrictForEntryTable3rdRow4thCol;
				
				
				@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[4]/td[2]")
				public static WebElement restrictForEntryTable4thRow1stCol;
				
				@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[4]/td[3]")
				public static WebElement restrictForEntryTable4thRow2ndCol;
				
				@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[4]/td[4]")
				public static WebElement restrictForEntryTable4thRow3rdCol;
				
				@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[4]/td[5]")
				public static WebElement restrictForEntryTable4thRow4thCol;
				
				
				@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[5]/td[2]")
				public static WebElement restrictForEntryTable5thRow1stCol;
				
				@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[5]/td[3]")
				public static WebElement restrictForEntryTable5thRow2ndCol;
				
				@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[5]/td[4]")
				public static WebElement restrictForEntryTable5thRow3rdCol;
				
				@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[5]/td[5]")
				public static WebElement restrictForEntryTable5thRow4thCol;
				
				
				@FindBy(xpath="//tbody[@id='id_header_4_table_body']/tr/td[2]")
				public static List<WebElement> vendorAccountComboList;
				
				@FindBy(xpath="//tbody[@id='id_header_4_table_body']/tr/td[2]")
				public static List<WebElement> customerAccountComboList;
				
				@FindBy(xpath="//tbody[@id='id_header_10_table_body']/tr/td[2]")
				public static List<WebElement> currencyComboList;
			

				
				@FindBy(xpath="//ul[@id='RestrictionEntryMasters']//li[@id='1']")
				public static WebElement restrictEntryMasterAccount;
				

				@FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr/td[4]")
				public static List<WebElement> voucherNumberList;
				

				@FindBy (xpath="//*[@id='divModal_properties']/div[2]/div[3]/table/tbody/tr[4]/td/label/span")
				public static WebElement displayLedgerByCurrencyCheckboxInProperties;
				
				@FindBy (xpath="//*[@id='divModal_properties']/div[2]/div[3]/table/tbody/tr[4]/td/label/input")
				public static WebElement displayLedgerByCurrencyCheckboxInPropertiesSelected;
			
				
				@FindBy(xpath="//select[@id='timezone']")
				public static WebElement createUserTimeZone;
				
				
				@FindBy(xpath="//*[@id='chkDoNotRestrictSelectionEvenIfRightsNotAllotted']")
				public static WebElement  doNotRestrictSelectionEvenIfRightsNotAllottedCheckboxSelected;
				
				
				@FindBy(xpath="//*[@id='btnNew']/i")
				public static WebElement  newBtnInGrp;
				
				@FindBy (xpath="//*[@id='rbnDisplayDebitCreditTotalForEachAccountUnderGroup']")
				public static WebElement displayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties;
				
				
				
				
				@FindBy (xpath="//*[@id='rbnClubTranOfAllAcctsUnderGrpWhenDispInLedger']")
				public static WebElement ClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties;
				
				
				
				
				
				

			

				@FindBy(xpath="//i[@class='icon-font6 icon-print']")
				public static WebElement masterPrintBtn; 

			

				
				@FindBy (xpath="//*[@id='mainTab_0']/div/div/table/tbody/tr/td[4]")
				public static List<WebElement> IfieldCaptionTxtList;
				
				@FindBy (xpath="//*[@id='mainTab_0']/div/div/table/tbody/tr/td[1]/i[1]")
				public static List<WebElement> IeditFieldList;
				
				@FindBy (xpath="//*[@id='mainTab_0']/div/div/table/tbody/tr/td[1]/i[2]")
				public static List<WebElement> IdeleteFieldList;
				
				
				@FindBy (xpath="//tbody[@id='tblIncremental_ExtraField_body']")
				public static WebElement incrementalTable;
				
				@FindBy (xpath="//*[@id='tblIncremental_ExtraField_col_1-2']")
				public static WebElement IncCol1Row1;
				
				@FindBy (xpath="//*[@id='ddlIncremental_Type_ExtraFld']")
				public static WebElement IncTypeDropdown;
				
				
				@FindBy (xpath="//*[@id='ddlField_MasterFields']")
				public static WebElement valueDropdown;
				
				@FindBy(xpath = "//*[@id='idGlobalError']/div/table/tbody/tr/td[2]/div[2]")
				public static WebElement IerrorMessage;
				
				@FindBy(xpath = "//*[@id='idGlobalError']/div/table/tbody/tr/td[3]/span")
				public static WebElement IerrorMessageCloseBtn;
				

				@FindBy(xpath="//*[@id='all_TabsField']/div[10]//ul//li[1]//a//i")
				public static WebElement headerDetailsaccountSaveBtn;
				
				@FindBy(xpath="//*[@id='all_TabsField']/div[2]//ul//li[1]//a//i")
				public static WebElement headerDetailswarehouseSaveBtn;
				
				

				@FindBy(xpath="//*[@id='tabId_2']/ul/li[1]/a")
				public static WebElement generalMainTabInItem;
				
				@FindBy(xpath="//*[@id='tabId_4']/ul/li[1]/a")
				public static WebElement WgeneralMainTab;
				
				@FindBy(xpath="//*[@id='tabId_3']/ul/li[1]/a")
				public static WebElement DgeneralMainTab;

				@FindBy (xpath="//*[@id='iBin']")
				public static WebElement BinTxt;
				
				@FindBy (xpath="//*[@id='iCurrencyId']")
				public static WebElement currencyTxt;
				
				@FindBy (xpath="//*[@id='Jurisdiction']")
				public static WebElement jurSdictnTxt;
				
				

				@FindBy(xpath="//*[@id='FieldsDetails_CopyFromParent']//following-sibling::span")//*[@id="FieldsDetails_CopyFromParent"]
				public static WebElement Item_PropertiesCopyFromParentChekbox;
				
				

				@FindBy(xpath="//*[@id='all_TabsField']/div[2]//ul//li[1]//a//i")
				public static WebElement DheaderDetailsSaveBtn;

				
				@FindBy (xpath="//*[@id='txtIncrementalTypes_ExtraFld']")
				public static WebElement IncValueTxt;
				
				@FindBy (xpath="//*[@id='txtSCharPosition_ExtraFld']")
				public static WebElement IncStartingTxt;
				
				@FindBy (xpath="//*[@id='txtNoOfChars_ExtraFld']")
				public static WebElement IncNoOfTxt;
				
				@FindBy (xpath="//*[@id='lblIncrementalOutput']")
				public static WebElement OutputTxt;
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
}
