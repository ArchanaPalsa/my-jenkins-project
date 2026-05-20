package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.AccountMasterPage;
import com.focus.Pages.AccountPropertiesPage;
import com.focus.Pages.FixedAssetMasterIncrementalPage;
import com.focus.base.BaseEngine;

public class FixedAssetMasterIncrementalTest extends BaseEngine 
{
	AccountMasterPage cmctp;
	FixedAssetMasterIncrementalPage FAIP;

//	@Test(priority=10)
	public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		cmctp=new AccountMasterPage(getDriver());
		Assert.assertEquals(cmctp.checkLogin(), true);
	}

	// Creating Fields in Create Tab

	@Test(priority=11)
	public void checkSaveIncrementInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		FAIP=new FixedAssetMasterIncrementalPage(getDriver());
		Assert.assertEquals(FAIP.checkSaveIncrementInCustomizeMaster(), true);
	}

	@Test(priority=12)
	public void checkSaveFixedAssetMasterForIncrementalValidation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		FAIP=new FixedAssetMasterIncrementalPage(getDriver());
		Assert.assertEquals(FAIP.checkSaveFixedAssetMasterForIncrementalValidation(), true);
	}
	
	@Test(priority=13)
	public void checkCreatedFixedAssetMasterNamesAndCodeValidation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		FAIP=new FixedAssetMasterIncrementalPage(getDriver());
		Assert.assertEquals(FAIP.checkCreatedFixedAssetMasterNamesAndCodeValidation(), true);
	}
	
	@Test(priority=14)
	public void checkSaveFixedAssetForIncValidation2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		FAIP=new FixedAssetMasterIncrementalPage(getDriver());
		Assert.assertEquals(FAIP.checkSaveFixedAssetForIncValidation2(), true);
	}
	
	@Test(priority=15)
	public void checkCreatedFixedAssetMasterNamesAndCodeValidation2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		FAIP=new FixedAssetMasterIncrementalPage(getDriver());
		Assert.assertEquals(FAIP.checkCreatedFixedAssetMasterNamesAndCodeValidation2(), true);
	}
	
	
}
