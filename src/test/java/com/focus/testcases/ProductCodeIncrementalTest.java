package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.CodeIncrementalPage;
import com.focus.Pages.ProductCodeIncrementalPage;
import com.focus.base.BaseEngine;

public class ProductCodeIncrementalTest extends BaseEngine
{
	CodeIncrementalPage CIP;
	
	ProductCodeIncrementalPage PCIP;

	//@Test(priority=2000)
	public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		CIP=new CodeIncrementalPage(getDriver());
		Assert.assertEquals(CIP.checkLogin(), true);
	}
	
	
	@Test(priority=2002)
	public void checkSaveNormalIncrementInItemCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		PCIP=new ProductCodeIncrementalPage(getDriver());
		Assert.assertEquals(PCIP.checkSaveNormalIncrementInItemCode(), true);
	}
	
	@Test(priority=2004)
	public void checkSaveProductMasterAndVerifyIncrementalPropery() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		PCIP=new ProductCodeIncrementalPage(getDriver());
		Assert.assertEquals(PCIP.checkSaveProductMasterAndVerifyIncrementalPropery(), true);
	}
	
	@Test(priority=2006)
	public void checkSavedProductMastersWithIncrement() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		PCIP=new ProductCodeIncrementalPage(getDriver());
		Assert.assertEquals(PCIP.checkSavedProductMastersWithIncrement(), true);
	}
	
	@Test(priority=2008)
	public void checkRemoveIncrementalForCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		PCIP=new ProductCodeIncrementalPage(getDriver());
		Assert.assertEquals(PCIP.checkRemoveIncrementalForCode(), true);
	}
	
	
	@Test(priority=2009)
	public void checkLogoutAndLoginAfterCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		PCIP=new ProductCodeIncrementalPage(getDriver());
		Assert.assertEquals(PCIP.checkLogoutAndLoginAfterCustomization(), true);
	}
	
	@Test(priority=2010)
	public void checkSaveCopyFromParentAndIncrementalForGroupProducts() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		PCIP=new ProductCodeIncrementalPage(getDriver());
		Assert.assertEquals(PCIP.checkSaveCopyFromParentAndIncrementalForGroupProducts(), true);
	}
	
	
	@Test(priority=2011)
	public void checkLogoutAndLoginAfterCustomization2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		PCIP=new ProductCodeIncrementalPage(getDriver());
		Assert.assertEquals(PCIP.checkLogoutAndLoginAfterCustomization(), true);
	}
	
	
	@Test(priority=2012)
	public void checkSaveGroupItemsAndNestedGroupItemsAndVerfifyCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		PCIP=new ProductCodeIncrementalPage(getDriver());
		Assert.assertEquals(PCIP.checkSaveGroupItemsAndNestedGroupItemsAndVerfifyCode(), true);
	}
	

	@Test(priority=2013)
	public void checkLogoutAndLoginAfterCustomization3() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		PCIP=new ProductCodeIncrementalPage(getDriver());
		Assert.assertEquals(PCIP.checkLogoutAndLoginAfterCustomization(), true);
	}
	
	
	@Test(priority=2014)
	public void checkSaveNormalItemInLevelOne() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		PCIP=new ProductCodeIncrementalPage(getDriver());
		Assert.assertEquals(PCIP.checkSaveNormalItemInLevelOne(), true);
	}
	
	@Test(priority=2015)
	public void checkSaveNormalItemInLevelFour() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		PCIP=new ProductCodeIncrementalPage(getDriver());
		Assert.assertEquals(PCIP.checkSaveNormalItemInLevelFour(), true);
	}
	
	

}
