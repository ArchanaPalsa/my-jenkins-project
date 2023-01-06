package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.AccountMasterPage;
import com.focus.Pages.AccountPropertiesPage;
import com.focus.Pages.CodeIncrementalPage;
import com.focus.base.BaseEngine;

public class CodeIncrementalTest extends BaseEngine
{
               
	CodeIncrementalPage CIP;

	@Test(priority=2000)
	public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		CIP=new CodeIncrementalPage(getDriver());
		Assert.assertEquals(CIP.checkLogin(), true);
	}
	
	@Test(priority=2002)
	public void checkSaveNormalIncrementOfCodeInCustMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		CIP=new CodeIncrementalPage(getDriver());
		Assert.assertEquals(CIP.checkSaveNormalIncrementOfCodeInCustMaster(), true);
	}
	
	@Test(priority=2004)
	public void checkCreateAccountMasterToVerifyCodeIncrement() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		CIP=new CodeIncrementalPage(getDriver());
		Assert.assertEquals(CIP.checkCreateAccountMasterToVerifyCodeIncrement(), true);
	}
	
	@Test(priority=2005)
	public void checkSavedAccountsInGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		CIP=new CodeIncrementalPage(getDriver());
		Assert.assertEquals(CIP.checkSavedAccountsInGrid(), true);
	}
	
	@Test(priority=2006)
	public void checkRemoveIncrementalForCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		CIP=new CodeIncrementalPage(getDriver());
		Assert.assertEquals(CIP.checkRemoveIncrementalForCode(), true);
	}
	
	@Test(priority=2007)
	public void checkLogoutAndLoginAfterCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		CIP=new CodeIncrementalPage(getDriver());
		Assert.assertEquals(CIP.checkLogoutAndLoginAfterCustomization(), true);
	}
	
	@Test(priority=2008)
	public void checkSaveCopyFromParentAndIncrementalForGroupAccounts() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		CIP=new CodeIncrementalPage(getDriver());
		Assert.assertEquals(CIP.checkSaveCopyFromParentAndIncrementalForGroupAccounts(), true);
	}
	
	@Test(priority=2009)
	public void checkLogoutAndLoginAfterCustomization2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		CIP=new CodeIncrementalPage(getDriver());
		Assert.assertEquals(CIP.checkLogoutAndLoginAfterCustomization(), true);
	}
	
	@Test(priority=2010)
	public void checkSaveGroupAccountsAndNestedGroupAccountAndVerifyCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		CIP=new CodeIncrementalPage(getDriver());
		Assert.assertEquals(CIP.checkSaveGroupAccountsAndNestedGroupAccountAndVerifyCode(), true);
	}
	
	@Test(priority=2011)
	public void checkLogoutAndLoginAfterCustomization3() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		CIP=new CodeIncrementalPage(getDriver());
		Assert.assertEquals(CIP.checkLogoutAndLoginAfterCustomization(), true);
	}
	
	@Test(priority=2012)
	public void checkSaveNormalAccInLevelOne() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		CIP=new CodeIncrementalPage(getDriver());
		Assert.assertEquals(CIP.checkSaveNormalAccInLevelOne(), true);
	}
	
	@Test(priority=2013)
	public void checkNormalAccountInLevelFour() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		CIP=new CodeIncrementalPage(getDriver());
		Assert.assertEquals(CIP.checkNormalAccountInLevelFour(), true);
	}

}
