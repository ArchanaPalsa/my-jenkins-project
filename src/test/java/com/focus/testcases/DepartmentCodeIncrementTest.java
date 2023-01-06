package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.CodeIncrementalPage;
import com.focus.Pages.DepartmentCodeIncrementPage;
import com.focus.base.BaseEngine;

public class DepartmentCodeIncrementTest extends BaseEngine {
	
	
	    CodeIncrementalPage CIP;
	
		DepartmentCodeIncrementPage DIP;
	
		//@Test(priority=2000)
		public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			CIP=new CodeIncrementalPage(getDriver());
			Assert.assertEquals(CIP.checkLogin(), true);
		}
		
		
	    @Test(priority=2002)
		public void checkSaveNormalIncrementIndepartmentCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			DIP=new DepartmentCodeIncrementPage(getDriver());
			Assert.assertEquals(DIP.checkSaveNormalIncrementIndepartmentCode(), true);
		}
		
		@Test(priority=2004)
		public void checkSavedepartmentMasterAndVerifyIncrementalPropery() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			DIP=new DepartmentCodeIncrementPage(getDriver());
			Assert.assertEquals(DIP.checkSavedepartmentMasterAndVerifyIncrementalPropery(), true);
		}
		
		@Test(priority=2006)
		public void checkSaveddepartmentMastersWithIncrement() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			DIP=new DepartmentCodeIncrementPage(getDriver());
			Assert.assertEquals(DIP.checkSaveddepartmentMastersWithIncrement(), true);
		}
		
		@Test(priority=2008)
		public void checkRemoveIncrementalForCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			DIP=new DepartmentCodeIncrementPage(getDriver());
			Assert.assertEquals(DIP.checkRemoveIncrementalForCode(), true);
		}
		
		
		@Test(priority=2009)
		public void checkLogoutAndLoginAfterCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			DIP=new DepartmentCodeIncrementPage(getDriver());
			Assert.assertEquals(DIP.checkLogoutAndLoginAfterCustomization(), true);
		}
		
		@Test(priority=2010)
		public void checkSaveCopyFromParentAndIncrementalForGroupdepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			DIP=new DepartmentCodeIncrementPage(getDriver());
			Assert.assertEquals(DIP.checkSaveCopyFromParentAndIncrementalForGroupdepartment(), true);
		}
		
		
		@Test(priority=2011)
		public void checkLogoutAndLoginAfterCustomization2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			DIP=new DepartmentCodeIncrementPage(getDriver());
			Assert.assertEquals(DIP.checkLogoutAndLoginAfterCustomization(), true);
		}
		
		
		@Test(priority=2012)
		public void checkSaveGroupdepartmentsAndNestedGroupdepartmentsAndVerfifyCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			DIP=new DepartmentCodeIncrementPage(getDriver());
			Assert.assertEquals(DIP.checkSaveGroupdepartmentsAndNestedGroupdepartmentsAndVerfifyCode(), true);
		}
		

		@Test(priority=2013)
		public void checkLogoutAndLoginAfterCustomization3() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			DIP=new DepartmentCodeIncrementPage(getDriver());
			Assert.assertEquals(DIP.checkLogoutAndLoginAfterCustomization(), true);
		}
		
		
		@Test(priority=2014)
		public void checkSaveNormaldepartmentInLevelOne() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			DIP=new DepartmentCodeIncrementPage(getDriver());
			Assert.assertEquals(DIP.checkSaveNormaldepartmentInLevelOne(), true);
		}
		
		@Test(priority=2015)
		public void checkSaveNormaldepartmentInLevelFour() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			DIP=new DepartmentCodeIncrementPage(getDriver());
			Assert.assertEquals(DIP.checkSaveNormaldepartmentInLevelFour(), true);
		}
		
		

	}



