package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.FocusInventoryReportsPage;
import com.focus.Pages.UserRestrictionsPage;
import com.focus.base.BaseEngine;

public class FocusInventoryReportsTest extends BaseEngine
{

	static FocusInventoryReportsPage firp;
	UserRestrictionsPage urp;
	
	@Test(priority=98)
	public void checkLoginWithRERInFA() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkLoginWithRERInFA(), true);
	}
	
	 @Test(priority=99)
	 public void checkItemQueryReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkItemQueryReport(), true);
	 }

	 @Test(priority=100)
	 public void checkStockLedgerReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkStockLedgerReport(), true);
	 }

	 @Test(priority=101)
	 public void checkFilterInStockLedger() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkFilterInStockLedger(), true);
	 }
	 
	 @Test(priority=102)//Miss matching rows
	 public void checkOpeningStockRegisterReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkOpeningStockRegisterReport(), true);
	 }

	 @Test(priority=103)
	 public void checkStockStatementReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkStockStatementReport(), true);
	 }

	 @Test(priority=104)
	 public void checkPrintOptionInStockStatements() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkPrintOptionInStockStatements(), true);
	 }
	
	 @Test(priority=105)
	 public void checkStockMovementReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkStockMovementReport(), true);
	 }
	 
	 @Test(priority=106)
	 public void checkVirtualStockAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkVirtualStockAnalysisReport(), true);
	 }

	 @Test(priority=107)
	 public void checkStockValuationReportByProduct() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkStockValuationReportByProduct(), true);
	 }
	 
	 @Test(priority=108)
	 public void checkStockValuationReportByProductByInventoryTag() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkStockValuationReportByProductByInventoryTag(), true);
	 }
	 
	 @Test(priority=109)
	 public void checkStockValuationReportByInventoryByProduct() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkStockValuationReportByInventoryByProduct(), true);
	 }
	 
	 @Test(priority=110)
	 public void checkStockReprtByTagReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkStockReprtByTagReport(), true);
	 }

	 @Test(priority=111)
	 public void checkStockValuationByFATagReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkStockValuationByFATagReport(), true);
	 }
	 
	 @Test(priority=112)
	 public void checkABCAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkABCAnalysisReport(), true);
	 }
	 
	 @Test(priority=113)
	 public void checkStockAnalysisByBatchReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkStockAnalysisByBatchReport(), true);
	 }

	 @Test(priority=114)
	 public void checkStockAnalysisByRMAReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkStockAnalysisByRMAReport(), true);
	 }
	 
	 @Test(priority=115)
	 public void checkStockDetailsByBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkStockDetailsByBins(), true);
	 }
	 
	 @Test(priority=116)
	 public void checkStockBlanceByBinsReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkStockBlanceByBinsReport(), true);
	 }
	
	 @Test(priority=117)
	 public void checkStockBalanceByItemsByBinsReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkStockBalanceByItemsByBinsReport(), true);
	 }
	 
	 @Test(priority=118)
	 public void checkExpiredStockByBinsReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkExpiredStockByBinsReports(), true);
	 }
	 
	 @Test(priority=119)//issue exists in user level (Non restricted items are displaying in col1)
	 public void checkStockBalanceByWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkStockBalanceByWarehouse(), true);
	 }
	 
	 //@Test(priority=120)//Not displaying in user level
	 public void checkStockAgeingAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkStockAgeingAnalysisReport(), true);
	 }
	 
	 @Test(priority=121)
	 public void checkAgeingAnalysisByBatchReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkAgeingAnalysisByBatchReport(), true);
	 }
	 
	 @Test(priority=122)//col
	 public void checkStockAgeingAnalysisByRMAReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkStockAgeingAnalysisByRMAReport(), true);
	 }
	 
	 //@Test(priority=123)//Not displaying in user level
	 public void checkStockAgeingAnalysisByBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkStockAgeingAnalysisByBins(), true);
	 }
	 
	// @Test(priority=124)//Not displaying in user level
	 public void checkStockAgeingAnalysisByItemByBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkStockAgeingAnalysisByItemByBins(), true);
	 }
	 
	 //@Test(priority=125)
	 public void checkReorderReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkReorderReports(), true);
	 }
	 
	
	 @Test(priority=126)
	 public void checkFastMovingItemsReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkFastMovingItemsReport(), true);
	 }
	 
	 @Test(priority=127)
	 public void checkSlowMovingItemsReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkSlowMovingItemsReport(), true);
	 }
	 
	 @Test(priority=128)
	 public void checkPeakAndLowBlancesReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkPeakAndLowBlancesReport(), true);
	 }
	 
	 @Test(priority=129)
	 public void checkBestSellingItemReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkBestSellingItemReport(), true);
	 }
	 
	 @Test(priority=130)
	 public void checkStockTransferRegisterReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkStockTransferRegisterReport(), true);
	 }
	 
	 @Test(priority=131)
	 public void checkTransactionTypeWiseStockReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkTransactionTypeWiseStockReport(), true);
	 }
	 
	 @Test(priority=132)
	 public void checkActualConsumptionReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkActualConsumptionReport(), true);
	 }
	 
	 @Test(priority=133)
	 public void checkGeneralLedgerandInventoryMismatchReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 firp=new FocusInventoryReportsPage(getDriver());
		 Assert.assertEquals(firp.checkGeneralLedgerandInventoryMismatchReport(), true);
	 }
	
	 
}
