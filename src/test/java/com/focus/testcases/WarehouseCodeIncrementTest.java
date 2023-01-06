package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.CodeIncrementalPage;
import com.focus.Pages.WareHouseCodeIncrementPage;
import com.focus.base.BaseEngine;

public class WarehouseCodeIncrementTest extends BaseEngine {
	
	
	    CodeIncrementalPage CIP;
	
		WareHouseCodeIncrementPage WIP;
	
		//@Test(priority=2000)
		public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			CIP=new CodeIncrementalPage(getDriver());
			Assert.assertEquals(CIP.checkLogin(), true);
		}
		
		
	    @Test(priority=2002)
		public void checkSaveNormalIncrementInWarehouseCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			WIP=new WareHouseCodeIncrementPage(getDriver());
			Assert.assertEquals(WIP.checkSaveNormalIncrementInWarehouseCode(), true);
		}
		
		@Test(priority=2004)
		public void checkSaveWarehouseMasterAndVerifyIncrementalPropery() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			WIP=new WareHouseCodeIncrementPage(getDriver());
			Assert.assertEquals(WIP.checkSaveWarehouseMasterAndVerifyIncrementalPropery(), true);
		}
		
		@Test(priority=2006)
		public void checkSavedWarehouseMastersWithIncrement() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			WIP=new WareHouseCodeIncrementPage(getDriver());
			Assert.assertEquals(WIP.checkSavedWarehouseMastersWithIncrement(), true);
		}
		
		@Test(priority=2008)
		public void checkRemoveIncrementalForCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			WIP=new WareHouseCodeIncrementPage(getDriver());
			Assert.assertEquals(WIP.checkRemoveIncrementalForCode(), true);
		}
		
		
		@Test(priority=2009)
		public void checkLogoutAndLoginAfterCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			WIP=new WareHouseCodeIncrementPage(getDriver());
			Assert.assertEquals(WIP.checkLogoutAndLoginAfterCustomization(), true);
		}
		
		@Test(priority=2010)
		public void checkSaveCopyFromParentAndIncrementalForGroupWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			WIP=new WareHouseCodeIncrementPage(getDriver());
			Assert.assertEquals(WIP.checkSaveCopyFromParentAndIncrementalForGroupWarehouse(), true);
		}
		
		
		@Test(priority=2011)
		public void checkLogoutAndLoginAfterCustomization2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			WIP=new WareHouseCodeIncrementPage(getDriver());
			Assert.assertEquals(WIP.checkLogoutAndLoginAfterCustomization(), true);
		}
		
		
		@Test(priority=2012)
		public void checkSaveGroupWarehousesAndNestedGroupWarehousesAndVerfifyCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			WIP=new WareHouseCodeIncrementPage(getDriver());
			Assert.assertEquals(WIP.checkSaveGroupWarehousesAndNestedGroupWarehousesAndVerfifyCode(), true);
		}
		

		@Test(priority=2013)
		public void checkLogoutAndLoginAfterCustomization3() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			WIP=new WareHouseCodeIncrementPage(getDriver());
			Assert.assertEquals(WIP.checkLogoutAndLoginAfterCustomization(), true);
		}
		
		
		@Test(priority=2014)
		public void checkSaveNormalWarehouseInLevelOne() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			WIP=new WareHouseCodeIncrementPage(getDriver());
			Assert.assertEquals(WIP.checkSaveNormalWarehouseInLevelOne(), true);
		}
		
		@Test(priority=2015)
		public void checkSaveNormalWarehouseInLevelFour() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			WIP=new WareHouseCodeIncrementPage(getDriver());
			Assert.assertEquals(WIP.checkSaveNormalWarehouseInLevelFour(), true);
		}
		
		

	}



