package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.AccountPropertiesPage;
import com.focus.Pages.FocusFinancialsReportPage;
import com.focus.Pages.FocusInventoryReportsPage;
import com.focus.Pages.UserRestrictionsPage;
import com.focus.base.BaseEngine;

public class FocusFinancialsReportTest extends BaseEngine
{
	static FocusFinancialsReportPage ffrp;
	UserRestrictionsPage urp;
	
	@Test(priority=97)
	public void checkRestoreCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkRestoreCompany(), true);
	}
	
	@Test(priority=98)
	public void checkLoginWithRERInFA() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkLoginWithRERInFA(), true);
	}
	
	@Test(priority=99)
	public void checkLedgerReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ffrp=new FocusFinancialsReportPage(getDriver());
		Assert.assertEquals(ffrp.checkLedgerReport(), true);
	}
	
	@Test(priority=100)
	public void checkPrintOptionInLedgerAndValidatePDF() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ffrp=new FocusFinancialsReportPage(getDriver());
		Assert.assertEquals(ffrp.checkPrintOptionInLedgerAndValidatePDF(), true);
	}

	@Test(priority=101)
	public void checkFilterOptionInLedger() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ffrp=new FocusFinancialsReportPage(getDriver());
		Assert.assertEquals(ffrp.checkFilterOptionInLedger(), true);
	}
	
	@Test(priority=102)
	public void checkLedgerDetailReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ffrp=new FocusFinancialsReportPage(getDriver());
		Assert.assertEquals(ffrp.checkLedgerDetailReport(), true);
	}

	@Test(priority=104)//col
	public void checkSubLedgerReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ffrp=new FocusFinancialsReportPage(getDriver());
		Assert.assertEquals(ffrp.checkSubLedgerReport(), true);
	}

	@Test(priority=105)//col
	public void checkCashBookReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ffrp=new FocusFinancialsReportPage(getDriver());
		Assert.assertEquals(ffrp.checkCashBookReport(), true);
	}

	@Test(priority=106)//col
	public void checkBankBookAccountReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ffrp=new FocusFinancialsReportPage(getDriver());
		Assert.assertEquals(ffrp.checkBankBookAccountReport(), true);
	}

	@Test(priority=107)//col
	public void checkPettyCashBookReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ffrp=new FocusFinancialsReportPage(getDriver());
		Assert.assertEquals(ffrp.checkPettyCashBookReport(), true);
	}
	
	@Test(priority=108)//col
	public void checkDayBookReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ffrp=new FocusFinancialsReportPage(getDriver());
		Assert.assertEquals(ffrp.checkDayBookReport(), true);
	}
	
	@Test(priority=109)//col
	public void checkVirtualBankLedger() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ffrp=new FocusFinancialsReportPage(getDriver());
		Assert.assertEquals(ffrp.checkVirtualBankLedger(), true);
	}
	
	@Test(priority=110)//group accounts not displaying with pronghorn
	public void checkSalesRegisterReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ffrp=new FocusFinancialsReportPage(getDriver());
		Assert.assertEquals(ffrp.checkSalesRegisterReport(), true);
	}
	
	@Test(priority=111)// GA
	public void checkSalesSummaryRegisterReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ffrp=new FocusFinancialsReportPage(getDriver());
		Assert.assertEquals(ffrp.checkSalesSummaryRegisterReport(), true);
	}
	
	@Test(priority=112)
	public void checkMonthlySalesReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ffrp=new FocusFinancialsReportPage(getDriver());
		Assert.assertEquals(ffrp.checkMonthlySalesReport(), true);
	}
	
	@Test(priority=113)
	public void checkTopCustomersReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ffrp=new FocusFinancialsReportPage(getDriver());
		Assert.assertEquals(ffrp.checkTopCustomersReports(), true);
	}
	
	@Test(priority=114)
	public void checkTopCustomersReportsForGroupAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ffrp=new FocusFinancialsReportPage(getDriver());
		Assert.assertEquals(ffrp.checkTopCustomersReportsForGroupAccount(), true);
	}
	
	//PURCHASE REPORT
	
	@Test(priority=115)
	public void checkPurchaseRegisterReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ffrp=new FocusFinancialsReportPage(getDriver());
		Assert.assertEquals(ffrp.checkPurchaseRegisterReport(), true);
	}
	
	@Test(priority=116)
	public void checkPurchaseReturnRegister() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ffrp=new FocusFinancialsReportPage(getDriver());
		Assert.assertEquals(ffrp.checkPurchaseReturnRegister(), true);
	}
	
	@Test(priority=117)//VA
	public void checkSummaryPurchaseRegister() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ffrp=new FocusFinancialsReportPage(getDriver());
		Assert.assertEquals(ffrp.checkSummaryPurchaseRegister(), true);
	}

	 @Test(priority=118)//col
	 public void checkOpeningBalanceRegister() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkOpeningBalanceRegister(), true);
	 }
	 
	 @Test(priority=119)//col
	 public void checkJournalEntryRegister() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkJournalEntryRegister(), true);
	 }
	 
	 @Test(priority=120)
	 public void checkCreditNoteRegister() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkCreditNoteRegister(), true);
	 }
	 
	 @Test(priority=121)//col
	 public void checkReciptsRegister() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkReciptsRegister(), true);
	 }
	 
	 @Test(priority=122)//col
	 public void checkPaymentsRegister() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkPaymentsRegister(), true);
	 }
	 
	 @Test(priority=123)
	 public void checkPDCReceiptsRegister() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkPDCReceiptsRegister(), true);
	 }
	 
	 @Test(priority=124)
	 public void checkPDCPaymentsRegister() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkPDCPaymentsRegister(), true);
	 }
	 
	 @Test(priority=125)//
	 public void checkEntryJournalRegister() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkEntryJournalRegister(), true);
	 }
	 
	 @Test(priority=126)//
	 public void checkEntryJournalDetailReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkEntryJournalDetailReport(), true);
	 }
	 
	 
	 @Test(priority=127)
	 public void checkSalesGroupedByCustomer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkSalesGroupedByCustomer(), true);
	 }
	 
	 @Test(priority=128)
	 public void checkSalesGroupedByItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkSalesGroupedByItem(), true);
	 }
	 
	 @Test(priority=129)
	 public void checkSalesGroupedByDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkSalesGroupedByDepartment(), true);
	 }
	 
	 @Test(priority=130)// vA
	 public void checkPurchasesGroupedByVendor() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkPurchasesGroupedByVendor(), true);
	 }
	 
	 @Test(priority=131)//col
	 public void checkPurchasesGroupedByItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkPurchasesGroupedByItem(), true);
	 }
	 
	 @Test(priority=132)//VA
	 public void checkPurchasesGroupedByDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkPurchasesGroupedByDepartment(), true);
	 }
	 
	 @Test(priority=133)//
	 public void checkPeakAndLowBlanceAmount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkPeakAndLowBlanceAmount(), true);
	 }
	 
	 @Test(priority=134)
	 public void checkComparativeAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkComparativeAnalysisReport(), true);
	 }
	 
	 @Test(priority=135)
	 public void checkTransactionsTypeAnalysis() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkTransactionsTypeAnalysis(), true);
	 }
	 
	 @Test(priority=136)
	 public void checkABCAnalysisAmountReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkABCAnalysisAmountReport(), true);
	 }
	 
	 @Test(priority=137)
	 public void checkInterestCalculationReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkInterestCalculationReport(), true);
	 }
	 
	 @Test(priority=138)//col
	 public void checkMasterInfoOfAccountReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkMasterInfoOfAccountReport(), true);
	 }
	 
	 @Test(priority=139)
	 public void checkProductLableReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkProductLableReport(), true);
	 }
	 
	 @Test(priority=140)
	 public void checkUnitConversionReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkUnitConversionReport(), true);
	 }
	 
	 @Test(priority=141)
	 public void checkSkidDefinitionReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkSkidDefinitionReport(), true);
	 }
	 

	 @Test(priority=142)
	 public void checkAuditTrailTransactionsOfOpeningBalances() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkAuditTrailTransactionsOfOpeningBalances(), true);
	 }
	 
	 @Test(priority=143)
	 public void checkAuditTrailLoginsOfUsers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkAuditTrailLoginsOfUsers(), true);
	 }
	 
	 
	 @Test(priority=144)
	 public void checkAccountQueryReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkAccountQueryReport(), true);
	 }
	 
	 @Test(priority=145)
	 public void checkTransactionAuthorizationReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkTransactionAuthorizationReport(), true);
	 }
	 
	 @Test(priority=146)
	 public void checkMasterAuthorizationReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkMasterAuthorizationReport(), true);
	 }

	 
	 //Receivable payable analysis
	 @Test(priority=150)//COL
	 public void checkCustomerListingOfOutstandingBillsReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkCustomerListingOfOutstandingBillsReport(), true);
	 }
	 
	 @Test(priority=151)//col
	 public void checkCustomerStatementsReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkCustomerStatementsReport(), true);
	 }
	 
	 @Test(priority=152)//col
	 public void checkCustomerDueDateAnalysis() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkCustomerDueDateAnalysis(), true);
	 }
	 
	 @Test(priority=153)//col
	 public void checkCustomerAgeingDetailAnalysis() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkCustomerAgeingDetailAnalysis(), true);
	 }
	 
	 @Test(priority=154)//col
	 public void checkCustomerAgeingDetailByDueDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkCustomerAgeingDetailByDueDate(), true);
	 }
	 
	 @Test(priority=155)//col
	 public void checkCustomerOverDueAnalysis() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkCustomerOverDueAnalysis(), true);
	 }
	 
	 @Test(priority=156)
	 public void checkCustomerAgeingSummaryReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkCustomerAgeingSummaryReport(), true);
	 }
	 
	 @Test(priority=157)
	 public void checkCustomerSummaryAgeingByDueDateReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkCustomerSummaryAgeingByDueDateReport(), true);
	 }
	 
	 @Test(priority=158)
	 public void checkCustomerOverDueSummaryReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkCustomerOverDueSummaryReport(), true);
	 }
	 
	 @Test(priority=159)
	 public void checkCustomerBillWiseSummaryReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkCustomerBillWiseSummaryReport(), true);
	 }

	 @Test(priority=160)
	 public void checkVendorListingOfOutStandingBills() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkVendorListingOfOutStandingBills(), true);
	 }
	 
	 @Test(priority=161)
	 public void checkVendorStatementsReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkVendorStatementsReport(), true);
	 }
	 
	 @Test(priority=162)
	 public void checkVendorDueDateAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkVendorDueDateAnalysisReport(), true);
	 }
	 

	 @Test(priority=163)
	 public void checkVendorAgeingDetailsAnalysis() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkVendorAgeingDetailsAnalysis(), true);
	 }
	 
	 
	 
	 @Test(priority=164)
	 public void checkVendorAgeingDetailByDueDateReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkVendorAgeingDetailByDueDateReport(), true);
	 }
	 
	 @Test(priority=165)
	 public void checkVendorOverDueAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkVendorOverDueAnalysisReport(), true);
	 }
	 
	 //
	 @Test(priority=166)
	 public void checkVendorAgeingSummaryAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkVendorAgeingSummaryAnalysisReport(), true);
	 }
	 
	 @Test(priority=167)
	 public void checkVendorSummaryAgeingByDueDateReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkVendorSummaryAgeingByDueDateReport(), true);
	 }
	 
	 @Test(priority=168)
	 public void checkVendorOverDueSummaryReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkVendorOverDueSummaryReport(), true);
	 }
	 
	 @Test(priority=169)
	 public void checkVendorBillWiseSummaryReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkVendorBillWiseSummaryReport(), true);
	 }
	 
	 @Test(priority=170)
	 public void checkLogutAndLoginWithRER() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(urp.checkLoginWithERR(), true);
	 }
	 
	 
	 //Final Accounts
	 
	 @Test(priority=180)//col
	 public void checkTrailBalanceReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkTrailBalanceReport(), true);
	 }
	 
	 @Test(priority=181)//col
	 public void checkProfitAndLoassReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkProfitAndLossReport(), true);
	 }
	 
	 @Test(priority=182)//col
	 public void checkTradingAccountReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkTradingAccountReport(), true);
	 }
	 
	 @Test(priority=183)//col
	 public void checkTrandingAndProfitAndLoss() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkTrandingAndProfitAndLoss(), true);
	 }
	 
	 @Test(priority=184)//col
	 public void checkBalanceSheetReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkBalanceSheetReport(), true);
	 }
	 
	 @Test(priority=185)
	 public void checkSchedulesReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkSchedulesReports(), true);
	 }
	 
	 @Test(priority=186)//COL
	 public void checkFundFlowReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkFundFlowReport(), true);
	 }
	 
	 @Test(priority=187)//COL
	 public void checkCashFlowReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkCashFlowReport(), true);
	 }
	 
	 @Test(priority=188)
	 public void checkAdvanceCashFlowReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkAdvanceCashFlowReport(), true);
	 }
	 
	 @Test(priority=189)
	 public void checkIncomeExpensesTrendReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 ffrp=new FocusFinancialsReportPage(getDriver());
		 Assert.assertEquals(ffrp.checkIncomeExpensesTrendReport(), true);
	 }
	
	   @Test(priority=60063)
		  public void checklogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
		   ffrp=new FocusFinancialsReportPage(getDriver());
			  Assert.assertEquals(ffrp.checklogout(), true);
		  }
}
