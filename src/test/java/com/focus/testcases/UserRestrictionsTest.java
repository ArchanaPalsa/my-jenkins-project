package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.focus.Pages.UserRestrictionsPage;
import com.focus.base.BaseEngine;

public class UserRestrictionsTest extends BaseEngine
{

	UserRestrictionsPage urp;
	
	//SanityBackup in backup folder in project
	
	@Test(priority=1998)
	public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkLogin(), true);
	}

	@Test(priority=1999)
	public void checkRestoreCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkRestoreCompany(), true);
	}

	
	//@Test(priority=2001)
	public void checkValidateRestrictionsGivenInRERRoleInSu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkValidateRestrictionsGivenInRERRoleInSu(), true);
	}
	
	@Test(priority=2002)
	public void checkLoginWithERR() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkLoginWithERR(), true);
	}
	
	@Test(priority=2003)
	public void checkAccountMasterWhetherShowingOnlyRestrictedAccountsInList() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkAccountMasterWhetherShowingOnlyRestrictedAccountsInList(), true);
	}
	
	@Test(priority=2004)
	public void checkChildAccountsInsideTheGroupAccountsIndivdually() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkChildAccountsInsideTheGroupAccountsIndivdually(), true);
	}

	@Test(priority=2005)
	public void checkSearchAccountsWhetherNonRestrictedAccountsAreDisplaying() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkSearchAccountsWhetherNonRestrictedAccountsAreDisplaying(), true);
	}
	
	@Test(priority=2006)
	public void checkItemMasterWhetherShowingOnlyRestrictedItemsInList() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkItemMasterWhetherShowingOnlyRestrictedItemsInList(), true);
	}
	
	@Test(priority=2007)
	public void checkSearchItemsWhetherNonRestrictedItemsAreDisplaying() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkSearchItemsWhetherNonRestrictedItemsAreDisplaying(), true);
	}
	

	@Test(priority=2008)
	public void checkDepartmentMasterWhetherShowingOnlyRestrictedDepartmentInList() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkDepartmentMasterWhetherShowingOnlyRestrictedDepartmentInList(), true);
	}
	
	@Test(priority=2009)
	public void checkSearchDepartmentWhetherNonRestrictedDepartmentsAreDisplaying() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkSearchDepartmentWhetherNonRestrictedDepartmentsAreDisplaying(), true);
	}
	
	@Test(priority=2010)
	public void checkWarehouseMasterWhetherShowingOnlyRestrictedWarehouseInList() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkWarehouseMasterWhetherShowingOnlyRestrictedWarehouseInList(), true);
	}
	
	@Test(priority=2011)
	public void checkSearchWarehouseWhetherNonRestrictedWarehousesAreDisplaying() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkSearchWarehouseWhetherNonRestrictedWarehousesAreDisplaying(), true);
	}
	
	@Test(priority=2012)
	public void checkBranchMasterWhetherShowingOnlyRestrictedBranchInList() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkBranchMasterWhetherShowingOnlyRestrictedBranchInList(), true);
	}
	
	@Test(priority=2013)
	public void checkPurchaseVoucherHomePageMastersList() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkPurchaseVoucherHomePageMastersList(), true);
	}
	
	@Test(priority=2014)
	public void checkPurchasesVoucherForAllTheMastersListInMastersDropdown() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkPurchasesVoucherForAllTheMastersListInMastersDropdown(), true);
	}
	
	@Test(priority=2015)
	public void checkSalesInvoiceVoucherHomePgaeMastersList() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkSalesInvoiceVoucherHomePgaeMastersList(), true);
	}
	
	@Test(priority=2016)
	public void checkMastersListInSalesInvoices() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkMastersListInSalesInvoices(), true);
	}
	
	@Test(priority=2017)
	public void checkPaymentsVoucherHomePageMastersList() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkPaymentsVoucherHomePageMastersList(), true);
	}
	
	@Test(priority=2018)
	public void checkMastersListInPayments() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkMastersListInPayments(), true);
	}
	
	
	@Test(priority=2019)
	public void checkReceiptsHomePageMasterList() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkReceiptsHomePageMasterList(), true);
	}
	
	@Test(priority=2020)
	public void checkMasterInReceipts() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkMasterInReceipts(), true);
	}
	
	
	
	
	
	
 

}
