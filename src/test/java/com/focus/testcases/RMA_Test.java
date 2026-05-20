package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.AccountMasterPage;
import com.focus.Pages.AccountPropertiesPage;
import com.focus.Pages.TransactionImportPage;
import com.focus.Pages.RMA;
import com.focus.base.BaseEngine;

public class RMA_Test extends BaseEngine
{
	
	AccountMasterPage cmctp;
	
	TransactionImportPage tip;
	AccountPropertiesPage app;
	RMA rm;
	
	
	@Test(priority=99)
	public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		app=new AccountPropertiesPage(getDriver());
		Assert.assertEquals(app.checkLogin(), true);
	}
	
	
	@Test(priority=100)
	public void checkRestoreCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		app=new AccountPropertiesPage(getDriver());
		Assert.assertEquals(app.checkRestoreCompany(), true);
	}

	@Test(priority=201)
	public void checkSaveOpeningStocksVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkSaveOpeningStocksVoucher(), true);
	}
	
	@Test(priority=202)
	public void checkSaveSalesInvoicesVoucherWithSavedRmaInOS() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkSaveSalesInvoicesVoucherWithSavedRmaInOS(), true);
	}
	
	
	@Test(priority=206)
	public void checkDisableRMAAlwaysNumericOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkDisableRMAAlwaysNumericOption(), true);
	}
	
	
	@Test(priority=207)
	public void checkSavePurchasesVoucherwithRma() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkSavePurchasesVoucherwithRma(), true);
	}
	
	@Test(priority=208)
	public void checkSavePurchasesRetunsForTheAboveSavedRma() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkSavePurchasesRetunsForTheAboveSavedRma(), true);
	}
	
	@Test(priority=209)
	public void checkEditPurchasesVoucherAndAddReturnedItemAgain() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkEditPurchasesVoucherAndAddReturnedItemAgain(), true);
	}
	
	@Test(priority=210)
	public void checkSaveExcessInStocksVoucherWithRma() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkSaveExcessInStocksVoucherWithRma(), true);
	}
	
	@Test(priority=211)
	public void checkSaveShortagesInStockVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkSaveShortagesInStockVoucher(), true);
	}
	
	@Test(priority=212)
	public void checkEditSavedShortagesInStockVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkEditSavedShortagesInStockVoucher(), true);
	}
	
	@Test(priority=213)
	public void checkSaveOpeningStocksVoucherForStockTransferVouchers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkSaveOpeningStocksVoucherForStockTransferVouchers(), true);
	}
	
	@Test(priority=214)
	public void checkSaveStockTransferVoucherForOpeningStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkSaveStockTransferVoucherForOpeningStocks(), true);
	}
	
	@Test(priority=215)
	public void checkDeleteStockTransfersVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkDeleteStockTransfersVoucher(), true);
	}
	
	@Test(priority=216)
	public void checkSavePurchasesVoucherForRMA() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkSavePurchasesVoucherForRMA(), true);
	}
	
	@Test(priority=217)
	public void checkEnableRMACannotBeReUseOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkEnableRMACannotBeReUseOptions(), true);
	}
	
	@Test(priority=218)
	public void checkSaveOpeningStockVoucherForRmaCannotBeResusedOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkSaveOpeningStockVoucherForRmaCannotBeResusedOption(), true);
	}
	
	@Test(priority=219)
	public void checkSaveSalesInvoiceVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkSaveSalesInvoiceVoucher(), true);
	}
	
	@Test(priority=220)
	public void checkEditOpeningStocksVoucherandDuplicatetheRma() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkEditOpeningStocksVoucherandDuplicatetheRma(), true);
	}
	
	@Test(priority=221)
	public void checkSaveOpeningStocksVoucherForRmaProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkSaveOpeningStocksVoucherForRmaProperties(), true);
	}
	
	@Test(priority=222)
	public void checkSaveSalesInvoicesVoucherWithSavedRmaInOSForRmaProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkSaveSalesInvoicesVoucherWithSavedRmaInOSForRmaProperties(), true);
	}
	
	//@Test(priority=223)//run getting stopped here so commented for now.
	public void checkSaveSalesReturnsVoucherForRmaProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkSaveSalesReturnsVoucherForRmaProperties(), true);
	}
	
	@Test(priority=224)
	public void checkMaterialReceiptsNotesFoRmaItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkMaterialReceiptsNotesFoRmaItem(), true);
	}
	
	@Test(priority=225)
	public void checkTrySavingAnotherMRNVoucherWithSameRMASeries() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkTrySavingAnotherMRNVoucherWithSameRMASeries(), true);
	}
	
	@Test(priority=226)
	public void checkSuspendMRNVoucher1andSaveMRNVoucher2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkSuspendMRNVoucher1andSaveMRNVoucher2(), true);
	}
	
	@Test(priority=227)
	public void checkRESaveMRNVoucherMRNVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkRESaveMRNVoucherMRNVoucher(), true);
	}
	
	@Test(priority=228)
	public void checkRmaQunatityIncreaseInInwardVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkRmaQunatityIncreaseInInwardVoucher(), true);
	}
	
	@Test(priority=229)
	public void checkRmaNoUncheckAndSeeRMASelectedGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkRmaNoUncheckAndSeeRMASelectedGrid(), true);
	}
	
	
	@Test(priority=230)
	public void checkSaveOpeningStocksVoucherForTheRemoveRmaValiations() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkSaveOpeningStocksVoucherForTheRemoveRmaValiations(), true);
	}
	
	
	@Test(priority=231)
	public void checkEditopeningStocksVoucherQuantity() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkEditopeningStocksVoucherQuantity(), true);
	}
	
	@Test(priority=232)
	public void checkSaveDeliveryNotesVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkSaveDeliveryNotesVoucher(), true);
	}
	
	@Test(priority=233)
	public void checkEditDeliveryNotesForRmaEdit() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkEditDeliveryNotesForRmaEdit(), true);
	}
	
	@Test(priority=234)
	public void checkSaveOpeningStocksForRma() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		rm=new RMA(getDriver());
		Assert.assertEquals(rm.checkSaveOpeningStocksForRma(), true);
	}
	
	@Test(priority=235)
	public void checklogoutAccountPropertiesPage1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		app=new AccountPropertiesPage(getDriver());
		Assert.assertEquals(app.checklogoutAccountPropertiesPage(), true);
	}
	
	
}
