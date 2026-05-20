package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.FocusFinancialsVoucherEntryToCheckRestrictionsPage;
import com.focus.Pages.UserRestrictionsPage;
import com.focus.base.BaseEngine;

public class FocusFinancialsVoucherEntryToCheckRestrictionsTest extends BaseEngine
{

	
	FocusFinancialsVoucherEntryToCheckRestrictionsPage FVR;
	UserRestrictionsPage urp;

	
	@Test(priority=2002)
	public void checkLoginWithERR() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkLoginWithERR(), true);
	}
	
	@Test(priority=10000)
	public void checkPurchasesVoucherForAllTheMastersListInMastersDropdownAndSaveVoucher() throws AWTException, Exception
	{
		FVR=new FocusFinancialsVoucherEntryToCheckRestrictionsPage(getDriver());
		Assert.assertEquals(FVR.checkPurchasesVoucherForAllTheMastersListInMastersDropdownAndSaveVoucher(), true);
	}

	@Test(priority=10020)
	public void checkSalesInvoiceForAllTheMastersListInMastersDropdownAndSaveVoucher() throws AWTException, Exception
	{
		FVR=new FocusFinancialsVoucherEntryToCheckRestrictionsPage(getDriver());
		Assert.assertEquals(FVR.checkSalesInvoiceForAllTheMastersListInMastersDropdownAndSaveVoucher(), true);
	}


	@Test(priority=10021)
	public void checkMastersListInPaymentsAndSaveVoucher() throws AWTException, Exception
	{
		FVR=new FocusFinancialsVoucherEntryToCheckRestrictionsPage(getDriver());
		Assert.assertEquals(FVR.checkMastersListInPaymentsAndSaveVoucher(), true);
	}
	@Test(priority=10022)
	public void checkMasterInReceiptsAndSaveVoucher() throws AWTException, Exception
	{
		FVR=new FocusFinancialsVoucherEntryToCheckRestrictionsPage(getDriver());
		Assert.assertEquals(FVR.checkMasterInReceiptsAndSaveVoucher(), true);
	}
	
	@Test(priority=10023)
	public void checkMastersListInStockTransfersMasterAndSaveVoucher() throws AWTException, Exception
	{
		FVR=new FocusFinancialsVoucherEntryToCheckRestrictionsPage(getDriver());
		Assert.assertEquals(FVR.checkMastersListInStockTransfersMasterAndSaveVoucher(), true);
	}

	
	
}
