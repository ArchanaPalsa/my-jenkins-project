package com.focus.testcases;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.LoginPageOld;
import com.focus.Pages.VoucherPrintOptionsPage;
import com.focus.base.BaseEngine;

public class DesignLayoutWithMultipleAttachmentsTest extends BaseEngine
{
	VoucherPrintOptionsPage VPO;
	private static LoginPageOld lp;
	
	  @Test(priority=999)
	  public void checkLogin() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkLogin(), true);
	  }
	
	  @Test(priority=1000)
	  public void checkRestoreCompany() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkRestoreCompany(), true);
	  }
	 
	// @Test(priority=1003)
	  public void checkLoginAfterRestoringForMultipleAttachments() throws AWTException, Exception
	  {
		  lp=new LoginPageOld(getDriver());
		  Assert.assertEquals(lp.checkLoginAfterRestoringForMultipleAttachments(), true);
	  }
	 
     @Test(priority=1005)
	  public void checkSavePurchaseVoucherVATForMultipleAttachmentsLayout() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkSavePurchaseVoucherVATForMultipleAttachmentsLayout(), true);
	  }
	 
	 @Test(priority=1009)
	  public void checkPrintPdfForMultipleAttachments() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkPrintPdfForMultipleAttachments(), true);
	  }
	
	 @Test(priority=1012)
	  public void checkEmailValidationForMultipleAttachments() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkEmailValidationForMultipleAttachments(), true);
	  }
	
	 @Test(priority=1015)
	  public void checkEmailSentFortheMultipleAttachmentLayouts() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkEmailSentFortheMultipleAttachmentLayouts(), true);
	  }
	 
	
	 @Test(priority=1018)
	  public void checkDownloadAllTheAttachments() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkDownloadAllTheAttachments(), true);
	  }
	 
	 
	 @Test(priority=40000)
		public void checkLogoutFromVoucherPrintPage() throws AWTException, Exception
		{
			VPO=new VoucherPrintOptionsPage(getDriver());
			Assert.assertEquals(VPO.checkLogoutFromVoucherPrintPage(), true);
		}
	 
	 
	 
	 
	 
}
