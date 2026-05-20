package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.VoucherPrintWithImagePage;
import com.focus.base.BaseEngine;

public class VoucherPrintWithImageTest extends BaseEngine{
	
	VoucherPrintWithImagePage VPIP;
	
	@Test(priority=4999)
	public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		VPIP=new VoucherPrintWithImagePage(getDriver());
		Assert.assertEquals(VPIP.checkLogin(), true);
	}
	
	
	
	@Test(priority=5000)
	public void checkRestoreAndLoginVouchersPrintcompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		VPIP=new VoucherPrintWithImagePage(getDriver());
		Assert.assertEquals(VPIP.checkRestoreAndLoginVouchersPrintcompany(), true);
	}

	@Test(priority=5001)
	public void checkSavingAnItemWithAttachingImageinItemMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		VPIP=new VoucherPrintWithImagePage(getDriver());
		Assert.assertEquals(VPIP.checkSavingAnItemWithAttachingImageinItemMaster(), true);
	}
	

	
	@Test(priority=5002)
	public void checkSavingVoucherinPurchaseVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		VPIP=new VoucherPrintWithImagePage(getDriver());
		Assert.assertEquals(VPIP.checkSavingVoucherinPurchaseVoucher(), true);
	}

	
	
	@Test(priority=5003)
	public void checkCreatingLayoutHavingItemImageinPurchaseVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		VPIP=new VoucherPrintWithImagePage(getDriver());
		Assert.assertEquals(VPIP.checkCreatingLayoutHavingItemImageinPurchaseVoucher(), true);
	}
	
	
	
	@Test(priority=5004)
	public void checkPrintinPurchaseVocuherforCreatedLayout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		VPIP=new VoucherPrintWithImagePage(getDriver());
		Assert.assertEquals(VPIP.checkPrintinPurchaseVocuherforCreatedLayout(), true);
	}
	
		
	@Test(priority=5005)
	public void checkSavingVoucher2inPurchaseVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		VPIP=new VoucherPrintWithImagePage(getDriver());
		Assert.assertEquals(VPIP.checkSavingVoucher2inPurchaseVoucher(), true);
	}
	
		
	//@Test(priority=5006)//getting error
	public void checkPrintPurchaseVocuherforItemHavingImage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		VPIP=new VoucherPrintWithImagePage(getDriver());
		Assert.assertEquals(VPIP.checkPrintPurchaseVocuherforItemHavingImage(), true);
	}
	
	
	
	@Test(priority=5007)
	public void checkSavingExtraFieldwithImageinDepartmentMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		VPIP=new VoucherPrintWithImagePage(getDriver());
		Assert.assertEquals(VPIP.checkSavingExtraFieldwithImageinDepartmentMaster(), true);
	}
		
	
	@Test(priority=5008)
	public void checkSavingVoucher3inPurchaseVocuher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		VPIP=new VoucherPrintWithImagePage(getDriver());
		Assert.assertEquals(VPIP.checkSavingVoucher3inPurchaseVocuher(), true);
	}
	
	
	
	
	@Test(priority=5009)
	public void checkCreatingNewLayoutforDepartmentImageinPurchaseVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		VPIP=new VoucherPrintWithImagePage(getDriver());
		Assert.assertEquals(VPIP.checkCreatingNewLayoutforDepartmentImageinPurchaseVoucher(), true);
	}
	
	
	
	@Test(priority=5010)
	public void checkPrintPDFforDepartmentImageinPurchaseVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		VPIP=new VoucherPrintWithImagePage(getDriver());
		Assert.assertEquals(VPIP.checkPrintPDFforDepartmentImageinPurchaseVoucher(), true);
	}
	
		
	@Test(priority=5011)
	public void checkSavingVoucher4inPurchasesVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		VPIP=new VoucherPrintWithImagePage(getDriver());
		Assert.assertEquals(VPIP.checkSavingVoucher4inPurchasesVoucher(), true);
	}
	
		
	@Test(priority=5012)
	public void checkPrintPDFforDepartmentExistingImageinPurchasesVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		VPIP=new VoucherPrintWithImagePage(getDriver());
		Assert.assertEquals(VPIP.checkPrintPDFforDepartmentExistingImageinPurchasesVoucher(), true);
	}
	
	
	@Test(priority=5013)
	public void checkSavingVoucherwithNarrationfieldgivingArabicinPurchaseVocuher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		VPIP=new VoucherPrintWithImagePage(getDriver());
		Assert.assertEquals(VPIP.checkSavingVoucherwithNarrationfieldgivingArabicinPurchaseVocuher(), true);
	}
	
	
	
	
	@Test(priority=5014)
	public void checkEditingCreatedLayoutwithNarrationFieldWithoutProprties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		VPIP=new VoucherPrintWithImagePage(getDriver());
		Assert.assertEquals(VPIP.checkEditingCreatedLayoutwithNarrationFieldWithoutProprties(), true);
	}
	
	
	
	
	@Test(priority=5015)
	public void checkEditingCreatedLayoutforaddingNarrrationField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		VPIP=new VoucherPrintWithImagePage(getDriver());
		Assert.assertEquals(VPIP.checkEditingCreatedLayoutforaddingNarrrationField(), true);
	}
	
		
	@Test(priority=5016)
	public void checkPrintinPurchaseVoucherforNarrationFieldasArabic() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		VPIP=new VoucherPrintWithImagePage(getDriver());
		Assert.assertEquals(VPIP.checkPrintinPurchaseVoucherforNarrationFieldasArabic(), true);
	}
	
	
	
	@Test(priority=5020)
	public void checkLogoutFromVoucherPrintWithImagePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		VPIP=new VoucherPrintWithImagePage(getDriver());
		Assert.assertEquals(VPIP.checkLogoutFromVoucherPrintWithImagePage(), true);
	}
	
	
	
}
