package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.LoginPage;
import com.focus.Pages.VoucherPrintOptionsPage;
import com.focus.base.BaseEngine;

public class VoucherFooterScenariosTest extends BaseEngine 
{

	VoucherPrintOptionsPage VPO;
	private static LoginPage lp;
	
	@Test(priority=4)
	public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		lp=new LoginPage(getDriver());
		Assert.assertEquals(LoginPage.checkLogin(), true);
	}
	
	@Test(priority=11150)
	public void checkRestoreCompanyForFooterValueValidation() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkRestoreCompanyForFooterValueValidation(), true);
	}

	@Test(priority=11151)
	public void checkSavingSalesInvoiceNewVoucherWithRow1InBodyGrid() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSavingSalesInvoiceNewVoucherWithRow1InbodyGrid(), true);
	}

	@Test(priority=11152)
	public void checkEditingSavedSalesNewVoucherByAddingRow2() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkEditingSavedSalesNewVoucherByAddingRow2(), true);
	}

	@Test(priority=11153)
	public void checkEditingSavedSalesNewVoucherWithIgstValueDeduction() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkEditingSavedSalesNewVoucherWithIgstValueDeduction(), true);
	}

	@Test(priority=11157)
	public void checkSaveSalesInvoiceNewVoucherWithDecimalValueRates() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSaveSalesInvoiceNewVoucherWithDecimalValueRates(), true);
	}

	@Test(priority=11160)
	public void checkFieldPostToAccountInPurchaseVouchers() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkFieldPostToAccountInPurchaseVouchers(), true);
	}

	@Test(priority=11161)
	public void checksavePurchaseVouchers() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checksavePurchaseVouchers(), true);
	}


	@Test(priority=11162)
	public void checkDefinedStandardRateForSTDItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkDefinedStandardRateForSTDItem(), true);
	}

	@Test(priority=11163)
	public void checkPurchaseVarianceInPostingDetailsForSTDItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPurchaseVarianceInPostingDetailsForSTDItem(), true);
	}

	@Test(priority=11164)//It should not show any purchase variance in posting details as we are giving rate exactly equal to std rate
	public void checkPurchaseVarianceInPostingDeatilsByGivingExactStandardRate() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPurchaseVarianceInPostingDeatilsByGivingExactStandardRate(), true);
	}

	//@Test(priority=11200)
	public void checkVouchersExportOptionExcelInVoucherToggle() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkVouchersExportOptionExcelInVoucherToggle(), true);
	}

	//@Test(priority=11202)
	public void checkVouchersExportOptionPDFInVoucherToggle() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkVouchersExportOptionPDFInVoucherToggle(), true);
	}

	//@Test(priority=11204)
	public void checkVouchersExportOptionPrintnVoucherToggle() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkVouchersExportOptionPrintnVoucherToggle(), true);
	}


	//Barcode Layout 
	@Test(priority=12000)
	public void checkAvailableOptionsBarCodeDefinition() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkAvailableOptionsBarCodeDefinition(), true);
	}

	@Test(priority=12001)
	public void checkSaveBarcodeDefinitionWithoutTemplateName() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSaveBarcodeDefinitionWithoutTemplateName(), true);
	}

	@Test(priority=12002)
	public void checksaveDefinitionWithoutSelectingFields() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checksaveDefinitionWithoutSelectingFields(), true);
	}

	@Test(priority=12003)
	public void checkSaveBarcodeDefinitionWithAllInputs() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSaveBarcodeDefinitionWithAllInputs(), true);
	}

	@Test(priority=12004)
	public void checkCreateNewMRNVoucher() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkCreateNewMRNVoucher(), true);
	}


	@Test(priority=12005)
	public void checkSaveBarcodeVoucherWithBatchItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSaveBarcodeVoucherWithBatchItem(), true);
	}
	
	@Test(priority=12006)
	public void checkCreateLayoutForBarCode() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkCreateLayoutForBarCode(), true);
	}

	@Test(priority=12007)
	public void checkChangeFieldPropertiesInBarcodeLayout() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkChangeFieldPropertiesInBarcodeLayout(), true);
	}
	
	

	@Test(priority=12008)
	public void checkPrintBarcodePopupFields() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintBarcodePopupFields(), true);
	}

	@Test(priority=12009)
	public void checkPrintBarcodeIntoPDFandValidatePDF() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintBarcodeIntoPDFandValidatePDF(), true);
	}

	@Test(priority=12010)
	public void checkPrintBarcodePrintingWithManualQuantityPick() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintBarcodePrintingWithManualQuantityPick(), true);
	}

	@Test(priority=12011)
	public void checkPrintBarcodePrintingWithItemSelection() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintBarcodePrintingWithItemSelection(), true);
	}

	@Test(priority=12012)
	public void checkBarcodeIsbeenScannedInDeliveryNotesVoucher() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkBarcodeIsbeenScannedInDeliveryNotesVoucher(), true);
	}
	

	  @Test(priority=12020)
	  public void checkCreateProfileWithHomeFinancialsReportRestrictions() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkCreateProfileWithHomeFinancialsReportRestrictions(), true);
	  }
	  
	  @Test(priority=12021)
	  public void checkSavedProfileWithUnselectedRestrictions() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkSavedProfileWithUnselectedRestrictions(), true);
	  }
	  
	  @Test(priority=12022)
	  public void checkSaveRoleWithCreatedProfileForRestrictions() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkSaveRoleWithCreatedProfileForRestrictions(), true);
	  }
	 
	  @Test(priority=12023)
	  public void checkUserCreationForCreatedRoleForRestrictions() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkUserCreationForCreatedRoleForRestrictions(), true);
	  }
	
	 
	  @Test(priority=12024)
	  public void checkLogoutAndLogoutWithCrestedUser() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkLogoutAndLogoutWithCrestedUser(), true);
	  }
	  
	  @Test(priority=12026)
	  public void checkMenuSelectedInProfileAreReflectingInUserLevel() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkMenuSelectedInProfileAreReflectingInUserLevel(), true);
	  }
	  
	  @Test(priority=12028)
	  public void checkValidateAccountVisibilityInUserLevel() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkValidateAccountVisibilityInUserLevel(), true);
	  }
	  
	  @Test(priority=12030)
	  public void checkPurchaseVoucherVATVisibilityInPurchasesMenuInUserLevel() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkPurchaseVoucherVATVisibilityInPurchasesMenuInUserLevel(), true);
	  }
	  
	  @Test(priority=12032)
	  public void checkStockLedgerVisibilityInReports() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkStockLedgerVisibilityInReports(), true);
	  }
	  
	  @Test(priority=12034)
	  public void checkLogoutAndLoginWithSU() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkLogoutAndLoginWithSU(), true);
	  }
	

	  @Test(priority=12036)
	  public void checkGiveAccessandShowHomePageAccessToAccountInTestRestrictionProfile() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkGiveAccessandShowHomePageAccessToAccountInTestRestrictionProfile(), true);
	  }
	  
	  @Test(priority=12038)
	  public void checkGiveAccessandShowHomePageAccessToPVVATInTestRestrictionProfile() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkGiveAccessandShowHomePageAccessToPVVATInTestRestrictionProfile(), true);
	  }
	 
	  @Test(priority=12040)
	  public void checkGiveAccessandShowHomePageAccessToStockLedgerInUserLevel() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkGiveAccessandShowHomePageAccessToStockLedgerInUserLevel(), true);
	  }
	  
	  @Test(priority=12042)
	  public void checkLogoutAndLogoutWithCrestedUserAfterGivingPermissionsForProfile() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkLogoutAndLogoutWithCrestedUser(), true);
	  }
	   
	  ///
	  
	  @Test(priority=12044)
	  public void checkValidateAccountAccessInUserLevel() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkValidateAccountAccessInUserLevel(), true);
	  }
	   
	  @Test(priority=12046)
	  public void checkAccountRestrictionByEditingInUserLevel() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkAccountRestrictionByEditingInUserLevel(), true);
	  }
	   
	  @Test(priority=12048)
	  public void checKValidatePurchaseVoucherVATRestrictionInUserLevel() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checKValidatePurchaseVoucherVATRestrictionInUserLevel(), true);
	  }
	   
	  
	  @Test(priority=12050)
	  public void checkValidateStockLedgerReportRestrictionInUserLevel() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkValidateStockLedgerReportRestrictionInUserLevel(), true);
	  }
	  
	  @Test(priority=12051)
	  public void checkLogoutAndLoginWithSUForAccessRights() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkLogoutAndLoginWithSU(), true);
	  }
	  
	  @Test(priority=12053)
	  public void checkEnableAllAccessightsInAccountForTestRestrictionProfile() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkEnableAllAccessightsInAccountForTestRestrictionProfile(), true);
	  }
	  
	  @Test(priority=12055)
	  public void checkEnablePurchaseVoucherVatAccessRightsForSavingVoucher() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkEnablePurchaseVoucherVatAccessRightsForSavingVoucher(), true);
	  }
	  
	  @Test(priority=12057)
	  public void checkEnableStockLedgerAccessRightsForAccessingReports() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkEnableStockLedgerAccessRightsForAccessingReports(), true);
	  }
	
	  @Test(priority=12059)
	  public void checkLogoutAndLogoutWithCrestedUserAfterGivingPermissionsForAccount() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkLogoutAndLogoutWithCrestedUser(), true);
	  }
	  
	  @Test(priority=12060)
	  public void checkToolsOptionsAccountsMenu() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkToolsOptionsAccountsMenu(), true);
	  }
	  
	  @Test(priority=12061)
	  public void checkOtherToolsOptionsAccountsMenu() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkOtherToolsOptionsAccountsMenu(), true);
	  }
	  
	 @Test(priority=12062)
	  public void checkSaveAccountAfterAccessingRights() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkSaveAccountAfterAccessingRights(), true);
	  }
	  
	  @Test(priority=12064)
	  public void checkSavePurchaseVoucherVAT() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkSavePurchaseVoucherVAT(), true);
	  }
	  
	  @Test(priority=12065)
	  public void checkSavedPurchaseVoucherVATForCopyPastePostingDetailsSettingsDeleteDoc() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkSavedPurchaseVoucherVATForCopyPastePostingDetailsSettingsDeleteDoc(), true);
	  }
	  
	  @Test(priority=12066)
	  public void checkSettingsBtnDeleteBtnnUserLevel() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkSettingsBtnDeleteBtnnUserLevel(), true);
	  }
	  
	  @Test(priority=12068)
	  public void checkStockLedgerAfterAccessingRights() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkStockLedgerAfterAccessingRights(), true);
	  }
	  
	  @Test(priority=12070)
	  public void checkPrintOptionInUserLevel() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkPrintOptionInUserLevel(), true);
	  }
	  
	  @Test(priority=12072)
	  public void checkLogoutAndLoginWithSUForAccessRightsInPVVAT() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkLogoutAndLoginWithSU(), true);
	  }
	
	  @Test(priority=12073)
	  public void checkEnableRestOfTheAccessRightInPvVAT() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkEnableRestOfTheAccessRightInPvVAT(), true);
	  }
	  
	  @Test(priority=12074)
	  public void checkEnableRestOfTheRightsInStockLedger() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkEnableRestOfTheRightsInStockLedger(), true);
	  }
	  
	  @Test(priority=12075)
	  public void checkLogoutAndLogoutWithCreatedUserForValidations() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkLogoutAndLogoutWithCrestedUser(), true);
	  }
	  
	  @Test(priority=12077)
	  public void checkValidateEnabledRightsInProfileInUserLevel() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkValidateEnabledRightsInProfileInUserLevel(), true);
	  }
	  
	 // @Test(priority=12079)
	  public void checkSuspendVoucherandEditSuspendedVoucher() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkSuspendVoucherandEditSuspendedVoucher(), true);
	  }
	  
	  @Test(priority=12080)
	  public void checkPostingDetailsAndCopyToClipBoardOptionsInPVVAT() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkPostingDetailsAndCopyToClipBoardOptionsInPVVAT(), true);
	  }
	  
	  @Test(priority=12082)
	  public void checkSavePrintLayoutAndPrintOptionInOutputOptions() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkSavePrintLayoutAndPrintOptionInOutputOptions(), true);
	  }
	  
	  
	  @Test(priority=12084)
	  public void checkStockLedgerIconsInUserLevelandValidateAnalyzeReport() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkStockLedgerIconsInUserLevelandValidateAnalyzeReport(), true);
	  }
	  
	  @Test(priority=12086)
	  public void checkAnalyzeStockLedgerInUserLevel() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkAnalyzeStockLedgerInUserLevel(), true);
	  }
	  
	  
	  @Test(priority=12088)//
	  public void checkLoadAnalysisReport() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkLoadAnalysisReport(), true);
	  }
	  
	  
	  
	  @Test(priority=12090)
	  public void checkFilterOptionInStockLedger() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkFilterOptionInStockLedger(), true);
	  }

	   @Test(priority=13021)
	  public void checkLogoutAndLoginWithSUForUserCreation() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkLogoutAndLoginWithSU(), true);
	  }
	 
	  @Test(priority=13022)
	  public void CheckCreateUserInSU() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.CheckCreateUserInSU(), true);
	  }
	  
	  @Test(priority=13023)
	  public void checkSaveExcessInStocksVoucher() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkSaveExcessInStocksVoucher(), true);
	  }
	  
	  @Test(priority=13024)
	  public void checkPrintFromExcessInStockVoucherTransaction() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkPrintFromExcessInStockVoucherTransaction(), true);
	  }
	  
	  @Test(priority=13025)
	  public void checkLogoutAndLoginWithTestUser() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkLogoutAndLoginWithTestUser(), true);
	  }
	  
	  @Test(priority=13026)
	  public void checkVoucherSavedBySUIsVisibleInTestUser() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkVoucherSavedBySUIsVisibleInTestUser(), true);
	  }
	  
	  @Test(priority=13027)
	  public void checkSaveExcessInStocksInUserLevel() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkSaveExcessInStocksInUserLevel(), true);
	  }
	  
	  @Test(priority=13028)
	  public void checkPrintInExcessStocksInUserLevel() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkPrintInExcessStocksInUserLevel(), true);
	  }
	  

		@Test(priority=40000)
		public void checkLogoutFromVoucherPrintPage() throws AWTException, Exception
		{
			VPO=new VoucherPrintOptionsPage(getDriver());
			Assert.assertEquals(VPO.checkLogoutFromVoucherPrintPage(), true);
		}
		
	  
}
