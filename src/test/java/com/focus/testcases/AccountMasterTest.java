package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.AccountMasterPage;
import com.focus.Pages.AccountPropertiesPage;
import com.focus.base.BaseEngine;

public class AccountMasterTest extends BaseEngine 
{
	AccountMasterPage cmctp;
	AccountPropertiesPage cmtp;
	
	  @Test(priority=2000)
	  public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkLogin(), true);
	  }
	 
	 
	  // Creating Fields in Create Tab
	  
	  @Test(priority=2001)
	  public void checkOpenCustomizeMasterInAccounts() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkOpenCustomizeMasterInAccounts(), true);
	  }
	  
	  @Test(priority=2002)
	  public void checkAddFieldWithoutDefaultValueInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddFieldWithoutDefaultValueInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2003)
	  public void checkEditFieldUpdateWithDefaultValueInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkEditFieldUpdateWithDefaultValueInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2004)
	  public void checkAddFieldWithDataTypeAsNumberInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddFieldWithDataTypeAsNumberInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2005)
	  public void checkAddFieldWithDataTypeAsBooleanInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddFieldWithDataTypeAsBooleanInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2006)
	  public void checkAddFieldWithDataTypeAsDateTimeInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddFieldWithDataTypeAsDateTimeInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2007)
	  public void checkAddFieldWithDataTypeAsDateInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddFieldWithDataTypeAsDateInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2008)
	  public void checkAddFieldWithDataTypeAsTimeInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddFieldWithDataTypeAsTimeInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2009)
	  public void checkAddFieldWithDataTypeAsFractionInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddFieldWithDataTypeAsFractionInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2010)
	  public void checkAddFieldWithDataTypeAsPictureInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddFieldWithDataTypeAsPictureInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2011)
	  public void checkAddFieldWithDataTypeAsStringListInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddFieldWithDataTypeAsStringListInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2012)
	  public void checkAddFieldWithDataTypeAsNumberListInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddFieldWithDataTypeAsNumberListInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2013)
	  public void checkAddFieldWithDataTypeAsDocumentViewerInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddFieldWithDataTypeAsDocumentViewerInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2014)
	  public void checkAddFieldWithDataTypeAsMasterInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddFieldWithDataTypeAsMasterInCreateTabCustomizeMaster(), true);
	  } 
	  
	  @Test(priority=2015)
	  public void checkAddFieldWithDataTypeAsBigNumberInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddFieldWithDataTypeAsBigNumberInCreateTabCustomizeMaster(), true);
	  }
	  
	  //@Test(priority=2016)
	  public void checkAddFieldWithDataTypeAsExternalTableInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddFieldWithDataTypeAsExternalTableInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2017)
	  public void checkAddFieldWithDataTypeAsSmallNumberInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddFieldWithDataTypeAsSmallNumberInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2018)
	  public void checkAddFieldWithDataTypeAsTinyNumberInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddFieldWithDataTypeAsTinyNumberInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2019)
	  public void checkAddFieldWithDataTypeAsGregorianInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddFieldWithDataTypeAsGregorianInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2020)
	  public void checkAddFieldWithDataTypeAsHijriInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddFieldWithDataTypeAsHijriInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2020)
	  public void checkAddFieldWithDataTypeAsShamsiInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddFieldWithDataTypeAsShamsiInCreateTabCustomizeMaster(), true);
	  }
	  
	  /////////////////////////////////////////////////////////////////////
	  
	  
	  
	  @Test(priority=3001)
	  public void checkLogoutAndLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkLogoutAndLogin(), true);
	  }

	  
	  @Test(priority=3002)
	  public void checkOpenAccountsAndValidateFieldCreatedInCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkOpenAccountsAndValidateFieldCreatedInCreateTab(), true);
	  }
	  
	  @Test(priority=3003)
	  public void checkSavingDemoAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkSavingDemoAccount(), true);
	  }
	  
	  // Enable Mandatory in All fields
	  
	  @Test(priority=3004)
	  public void checkEnableMandatoryCheckboxInAllFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkEnableMandatoryCheckboxInAllFieldsProperties(), true);
	  }
	  
	  @Test(priority=3005)
	  public void checkLogoutAndLoginAfterEnablingMandatoryCheckboxInFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkLogoutAndLoginAfterEnablingMandatoryCheckboxInFieldsProperties(), true);
	  }
	  
	  @Test(priority=3006)
	  public void checkOpenAccountsAndValidateMandatoryFieldCreatedInCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkOpenAccountsAndValidateMandatoryFieldCreatedInCreateTab(), true);
	  }
	 
	  // Enable Mandatory in Group
	  
	  @Test(priority=3007)
	  public void checkEnableMandatoryInGroupCheckboxInAllFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkEnableMandatoryInGroupCheckboxInAllFieldsProperties(), true);
	  }
	  
	  
	  @Test(priority=3008)
	  public void checkLogoutAndLoginAfterEnablingMandatoryInGroupCheckboxInFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(AccountMasterPage.checkLogoutAndLoginAfterEnablingMandatoryInGroupCheckboxInFieldsProperties(), true);
	  }
	  
	  @Test(priority=3009)
	  public void checkOpenAccountsAndValidateMandatoryInGroupFieldCreatedInCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkOpenAccountsAndValidateMandatoryInGroupFieldCreatedInCreateTab(), true);
	  }

	  // Enable Hidden 
	  
	  @Test(priority=3010)
	  public void checkEnableHiddenCheckboxInAllFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkEnableHiddenCheckboxInAllFieldsProperties(), true);
	  }
	  
	  //Log out and Login
	  @Test(priority=3011)
	  public void checkLogoutAndLoginAfterEnablingHiddenCheckboxInFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkLogoutAndLoginAfterEnablingHiddenCheckboxInFieldsProperties(), true);
	  }
	  
	  @Test(priority=3012)
	  public void checkHiddenFieldsAreDisplayingInCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkHiddenFieldsAreDisplayingInCreateTab(), true);
	  }
	  
	  
	  @Test(priority=3013)
	  public void checkCreateTabEnableHiddenCheckboxInShasmiFieldProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkCreateTabEnableHiddenCheckboxInShasmiFieldProperties(), true);
	  }
	  
	  //Log out and Login
	  @Test(priority=3014)
	  public void checkLogoutAndLoginAfterEnablingHiddenCheckboxInShasmiFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkLogoutAndLoginAfterEnablingHiddenCheckboxInFieldsProperties(), true);
	  }
	
	  @Test(priority=3015)
	  public void checkCreateTabIsHiddenInAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkCreateTabIsHiddenInAccount(), true);
	  }
	  
	  
	  
	  
	  // Enable Hidden in Group
	  
	  @Test(priority=3016)
	  public void checkEnableHiddenInGroupCheckboxInAllFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkEnableHiddenInGroupCheckboxInAllFieldsProperties(), true);
	  }
	  
	  @Test(priority=3017)
	  public void checkLogoutAndLoginAfterEnablingHiddenInGroupCheckboxInFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkLogoutAndLoginAfterEnablingHiddenInGroupCheckboxInFieldsProperties(), true);
	  }
	  
	  @Test(priority=3018)
	  public void checkHiddenFieldsAreDisplayingInCreateTabInGroupAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkHiddenFieldsAreDisplayingInCreateTabInGroupAccount(), true);
	  }
	  
	  
	  
	  
	  // Spell Check
	  
	  @Test(priority=3019)
	  public void checkEnableSpellCheckBoxInAllFieldProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkEnableSpellCheckBoxInAllFieldProperties(), true);
	  }

	  
	  // Mass Update
	  
	  @Test(priority=3020)
	  public void checkEnableMassUpdateCheckBoxInAllFieldProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkEnableMassUpdateCheckBoxInAllFieldProperties(), true);
	  }
	  
	  @Test(priority=3021)
	  public void checkAccountsMassUpdatingFieldsValues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAccountsMassUpdatingFieldsValues(), true);
	  }
	  
	  @Test(priority=3022)
	  public void checkOpenAccountsAndValidateFieldValuesUpdatedInMassUpdateMandatoryGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkOpenAccountsAndValidateFieldValuesUpdatedInMassUpdateMandatoryGroup(), true);
	  }
	  
	  @Test(priority=3023)
	  public void checkOpenAccountsAndValidateFieldValuesUpdatedInMassUpdateMandatoryAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkOpenAccountsAndValidateFieldValuesUpdatedInMassUpdateMandatoryAccount(), true);
	  }
	  
	  // Read Only
	  
	  @Test(priority=3040)
	  public void checkEnableReadOnlyCheckBoxInFieldProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkEnableReadOnlyCheckBoxInFieldProperties(), true);
	  }
	  
	  @Test(priority=3041)
	  public void checkLogoutAndLoginAfterEnablingReadOnlyCheckboxInFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkLogoutAndLoginAfterEnablingHiddenInGroupCheckboxInFieldsProperties(), true);
	  }
	  
	  @Test(priority=3042)
	  public void checkOpenAccountsAndValidateFieldsWithReadOnlyOptionInMandatoryGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkOpenAccountsAndValidateFieldsWithReadOnlyOptionInMandatoryGroup(), true);
	  }
	  
	  @Test(priority=3043)
	  public void checkOpenAccountsAndValidateFieldsWithReadOnlyOptionInMandatoryAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkOpenAccountsAndValidateFieldsWithReadOnlyOptionInMandatoryAccount(), true);
	  }
	  
	  
	  
	  
	  // Copy From Parent
	  
	  @Test(priority=3045)
	  public void checkEnableCopyFromParentCheckBoxInFieldProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkEnableCopyFromParentCheckBoxInFieldProperties(), true);
	  }
	  
	  @Test(priority=3046)
	  public void checkLogoutAndLoginAfterEnablingCopyFromParentCheckboxInFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkLogoutAndLoginAfterEnablingHiddenInGroupCheckboxInFieldsProperties(), true);
	  }
	  
	  @Test(priority=3047)
	  public void checkOpenAccountsAndValidateFieldsValueWithCopyFromParentOptionInMandatoryGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkOpenAccountsAndValidateFieldsValueWithCopyFromParentOptionInMandatoryGroup(), true);
	  }
	  
	  
	  
	  
	  // Information Field
	  
	  @Test(priority=3050)
	  public void checkEnableInformationFieldCheckBoxInFieldProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkEnableInformationFieldCheckBoxInFieldProperties(), true);
	  }
	  
	  @Test(priority=3051)
	  public void checkLogoutAndLoginAfterEnablingInformationFieldCheckboxInFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkLogoutAndLoginAfterEnablingHiddenInGroupCheckboxInFieldsProperties(), true);
	  }
	 
	  @Test(priority=3052)
	  public void checkOpenAccountsAndValidateFieldsWithInformationFieldOptionInMandatoryGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkOpenAccountsAndValidateFieldsWithInformationFieldOptionInMandatoryGroup(), true);
	  }
	  
	  @Test(priority=3053)
	  public void checkOpenAccountsAndValidateFieldsWithInformationFieldOptionInMandatoryAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkOpenAccountsAndValidateFieldsWithInformationFieldOptionInMandatoryAccount(), true);
	  }
	  
	  
	  
	  
	  // Not Available for Reports
	  
	  @Test(priority=3056)
	  public void checkEnableNotAvailableForReportsCheckBoxInFieldProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkEnableNotAvailableForReportsCheckBoxInFieldProperties(), true);
	  }
	  
	  @Test(priority=3057)
	  public void checkLogoutAndLoginAfterEnablingNotAvailableForReportsCheckboxInFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkLogoutAndLoginAfterEnablingHiddenInGroupCheckboxInFieldsProperties(), true);
	  }
	  
	  @Test(priority=3058)
	  public void checkSavingPurchaseVoucherVATVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkSavingPurchaseVoucherVATVoucher(), true);
	  }
	 
	  @Test(priority=3059)
	  public void checkFinanacialLedgerReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkFinanacialLedgerReport(), true);
	  }
	  

	  
	  // Move up, down and sorting
	  
	  @Test(priority=4001)
	  public void checkMoveUpOptionInMasterAccounts() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkMoveUpOptionInMasterAccounts(), true);
	  }
	  
	  @Test(priority=4002)
	  public void checkMoveDownOptionInMasterAccounts() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkMoveDownOptionInMasterAccounts(), true);
	  }

	  @Test(priority=4003)
	  public void checkSortingOptionInMasterAccountsWithAscendingAndDescendingAccountName() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkSortingOptionInMasterAccountsWithAscendingAndDescendingAccountName(), true);
	  }
	 
	  // Customize Tree
	  
	  @Test(priority=4004)
	  public void checkCustomizeTreeOptionAddingCreateTab_TextField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkCustomizeTreeOptionAddingCreateTab_TextField(), true);
	  }
	 
	//backtrack
	  
	  @Test(priority=4005)
	  public void checkMasterAccountBackTrackOptionForVendorB() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkMasterAccountBackTrackOptionForVendorB(), true);
	  }
	  
	  //account transfer
	  
	  @Test(priority=4006)
	  public void checkMasterAccountTransferOptionFromVendorBToVendorA() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkMasterAccountTransferOptionFromVendorBToVendorA(), true);
	  }
	
	  @Test(priority=4007)
	  public void checkLedgerIsEmptyForVendorBAfterTransfer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {	
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkLedgerIsEmptyForVendorBAfterTransfer(), true);
	  }
	  
	  @Test(priority=4008)
	  public void checkLedgerReportForAccountVendorAAfterTransfer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkLedgerReportForAccountVendorAAfterTransfer(), true);
	  }
	  
	  @Test(priority=4009)
	  public void checkMasterAccountTransferOptionFromVendorAToVendorB() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkMasterAccountTransferOptionFromVendorAToVendorB(), true);
	  }
	  
	  @Test(priority=4010)
	  public void checkLedgerReportForAccountVendorBAfterTransfer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkLedgerReportForAccountVendorBAfterTransfer(), true);
	  }
	
	  // Info Panel
	  
	  @Test(priority=4011)
	  public void checkCustomizeMasterInfoPanelCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkCustomizeMasterInfoPanelCustomization(), true);
	  }
	  
	  @Test(priority=4012)
	  public void checkCustomizeMasterInfoPanelCustomizationAddingPanel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkCustomizeMasterInfoPanelCustomizationAddingPanel(), true);
	  }
	  
	  @Test(priority=4013)
	  public void checkLogoutAndLoginAfterAddingPanel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkLogoutAndLogin(), true);
	  }
	  @Test(priority=4014)
	  public void checkCustomizeMasterInfoPanelCustomizationValidatingPanelAdded() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkCustomizeMasterInfoPanelCustomizationValidatingPanelAdded(), true);
	  }
	 
	  @Test(priority=4015)
	  public void checkValidatingCreatedInfoPanelInMasterAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkValidatingCreatedInfoPanelInMasterAccount(), true);
	  }
	  
	  @Test(priority=4016)
	  public void checkValidatingDashletAddedInInfoPanelBySelectingTestMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkValidatingDashletAddedInInfoPanelBySelectingTestMaster(), true);
	  }
	 
	  @Test(priority=4017)
	  public void checkAddingAuthorizationDashletInfoPanelInMasterAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddingAuthorizationDashletInfoPanelInMasterAccount(), true);
	  }
	  
	  @Test(priority=4018)
	  public void checkValidatingAuthorizationDashletAddedInInfoPanel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkValidatingAuthorizationDashletAddedInInfoPanel(), true);
	  }
	  
	  @Test(priority=4019)
	  public void checkDeletingAuthorizationDashletInfoPanelInMasterAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkDeletingAuthorizationDashletInfoPanelInMasterAccount(), true);
	  }
	  
	  
	  @Test(priority=4020)
	  public void checkLogoutAndLoginAfterDeletingDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkLogoutAndLogin(), true);
	  }

	  @Test(priority=4021)
	  public void checkCustomizeMasterInfoPanelCustomizationEditingAndValidatingPanelAdded() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkCustomizeMasterInfoPanelCustomizationEditingAndValidatingPanelAdded(), true);
	  }
	  
	  @Test(priority=4022)
	  public void checkCustomizeMasterInfoPanelCustomizationDeletingInfoPanelAdded() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkCustomizeMasterInfoPanelCustomizationDeletingInfoPanelAdded(), true);
	  }
	  
	  @Test(priority=4030)
	  public void checkAddDefaultFieldInToCustomizeTreeOfDepartmentMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddDefaultFieldInToCustomizeTreeOfDepartmentMaster(), true);
	  }
	  
	  
	  
	
	  // Behaviour Dropdown Starts here
	  
	  @Test(priority=4040)
	  public void checkBehaviourFieldsUnderPropreitesTABUnderCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkBehaviourFieldsUnderPropreitesTABUnderCustomization(), true);
	  }
	  
	  @Test(priority=4041)
	  public void checkDropDownBehaviourDrpDwnWithOnSelectingPasswordField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkDropDownBehaviourDrpDwnWithOnSelectingPasswordField(), true);
	  }
	  @Test(priority=4042)
	  public void checkDropDownBehaviourDrpDwnWithOnSelectingSelection() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkDropDownBehaviourDrpDwnWithOnSelectingSelection(), true);
	  }
	
	  @Test(priority=4043)
	  public void checkDropDownBehaviourDrpDwnWithOnSelectingMultiLineWithWarp() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkDropDownBehaviourDrpDwnWithOnSelectingMultiLineWithWarp(), true);
	  }
	
	  
	  @Test(priority=4044)
	  public void checkDropDownBehaviourDrpDwnWithOnSelectingMultiLineWithHorizontal() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkDropDownBehaviourDrpDwnWithOnSelectingMultiLineWithHorizontal(), true);
	  }
	  
	  
	  
	  @Test(priority=4045)
	  public void checkDropDownBehaviourDrpDwnWithOnSelectingMultiLineWithVertical() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkDropDownBehaviourDrpDwnWithOnSelectingMultiLineWithVertical(), true);
	  }
	  
	  
	  @Test(priority=4046)
	  public void checkDropDownBehaviourDrpDwnWithOnSelectingAutoComplete() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkDropDownBehaviourDrpDwnWithOnSelectingAutoComplete(), true);
	  }
	  
	  @Test(priority=4047)
	  public void checkDropDownBehaviourDrpDwnWithOnSelectingIncremental() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkDropDownBehaviourDrpDwnWithOnSelectingIncremental(), true);
	  }
	  
	  
	  @Test(priority=4048)
	  public void checkTypeDropDownValuesAndSavingWithCondition() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkTypeDropDownValuesAndSavingWithCondition(), true);
	  }
	  
	  
	  
	 
	  // Formating Tab
	  
	  @Test(priority=4049)
	  public void checkFormattingTabExpandFontOptionsUnderCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkFormattingTabExpandFontOptionsUnderCustomization(), true);
	  }
	  
	  @Test(priority=4050)
	  public void checkDefaultFontPreviewInFontExpansion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkDefaultFontPreviewInFontExpansion(), true);
	  }
	  
	  @Test(priority=4051)
	  public void checkSavingFontSizeandColourInFocusFontPopUp() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkSavingFontSizeandColourInFocusFontPopUp(), true);
	  }
	 
	  
	  @Test(priority=4052) 
	  public void checkFomattingTabPreviewTextField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkFomattingTabPreviewTextField(), true);
	  }
	  
	  
	   
	  @Test(priority=4053)
	  public void checkChangesDoneInFontInAcountSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkChangesDoneInFontInAcountSaving(), true);
	  }
	  
	  @Test(priority=4054)
	  public void checkEditOptionInFormattingTABInFontFamilyandClickOnSaveBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkEditOptionInFormattingTABInFontFamilyandClickOnSaveBtn(), true);
	  }
	  
	  @Test(priority=4055)
	  public void checkFontEffectsUnderFormattingTAB() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkFontEffectsUnderFormattingTAB(), true);
	  }
	
	 
	  
	  // Rules Tab
	  
	  @	Test(priority=4056)
	  public void checkRulesTabUnderMasterCustomizationUnderCreateTAB() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkRulesTabUnderMasterCustomizationUnderCreateTAB(), true);
	  }
	  
	  @Test(priority=4057)
	  public void checkRuleTabOptionsUnderCreateTAB() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkRuleTabOptionsUnderCreateTAB(), true);
	  }
	  
	  @Test(priority=4058)
	  public void checkSavingRuleWithOutConditionUnderMasterCustomizationUnderCreateTAB() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkSavingRuleWithOutConditionUnderMasterCustomizationUnderCreateTAB(), true);
	  }
	  
	  @Test(priority=4059)
	  public void checkPreLoadValuesInRuleAfterSavingRuleWithNoConditionUnderCreateTAB() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkPreLoadValuesInRuleAfterSavingRuleWithNoConditionUnderCreateTAB(), true);
	  }
	  
	  @Test(priority=4060)
	  public void checkValidationRuleWithnoCondition() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkValidationRuleWithnoCondition(), true);
	  }
	
	  @Test(priority=4061)
	  public void checkSavingRuleWithConditionUnderCustomizationTABUnderCreateTAB() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkSavingRuleWithConditionUnderCustomizationTABUnderCreateTAB(), true);
	  }
	  
	  @Test(priority=4062)
	  public void checkPreLoadValuesInRuleAfterSavingRuleWithConditionUnderCreateTAB() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkPreLoadValuesInRuleAfterSavingRuleWithConditionUnderCreateTAB(), true);
	  }
	  
	  @Test(priority=4064)
	  public void checkValidationRuleWithCondition() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkValidationRuleWithCondition(), true);
	  }
	 
	  @Test(priority=4065)
	  public void checkEditOptionInRuleUnderCreatedField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkEditOptionInRuleUnderCreatedField(), true);
	  }
	   
	  //Write valiadtion and rule Option 
	  
	  @Test(priority=4066)
	  public void checkRuleValidationWithRuleWithNoConditionInAccountCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkRuleValidationWithRuleWithNoConditionInAccountCreation(), true);
	  }
	  
	  @Test(priority=4067)
	  public void checkRuleValidationWithRuleWithConditionInAccountCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkRuleValidationWithRuleWithConditionInAccountCreation(), true);
	  }
	  
	  
	  @Test(priority=4070)
	  public void checkRuleSavingUnderRuleOptionUnderAccountMasters() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkRuleSavingUnderRuleOptionUnderAccountMasters(), true);
	  }
	 
	  @Test(priority=4071)
	  public void checkPreLOadValuesInRulesOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkPreLOadValuesInRulesOption(), true);
	  }
	 
	  
	  @Test(priority=4072)
	  public void checkDeleteRuleOptionUnderAccountMasters() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkDeleteRuleOptionUnderAccountMasters(), true);
	  }
	
	  @Test(priority=4073)
	  public void checkRuleValidationWithGobalRuleWithConditionInAccountCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkRuleValidationWithGobalRuleWithConditionInAccountCreation(), true);
	  }
	  
	  
	  @Test(priority=4074)
	  public void checkRuleValidationWithGobalRuleWithConditionInAccountCreationElsePart() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkRuleValidationWithGobalRuleWithConditionInAccountCreationElsePart(), true);
	  }
	  
	  // UniqueConstarints
	  
	  @Test(priority=4075)
	  public void checkUniqueConstarintsUnderMasterCustomizaion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkUniqueConstarintsUnderMasterCustomizaion(), true);
	  }
	  
	  
	  @Test(priority=4076)
	  public void checkEditOptionInUniqueConstraintUnderMasterCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkEditOptionInUniqueConstraintUnderMasterCustomization(), true);
	  }
	  
	  @Test(priority=4077)
	  public void checkDeleteOptionInUniqueConstraint() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkDeleteOptionInUniqueConstraint(), true);
	  }
	  
	  @Test(priority=4078)
	  public void checkValidationUniqueConsatraintInAccountSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkValidationUniqueConsatraintInAccountSaving(), true);
	  }
	  
	  @Test(priority=4079)
	  public void checkSavingAnotherAccountWithSamNumberFieldTxt() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkSavingAnotherAccountWithSamNumberFieldTxt(), true);
	  }
	  
	  @Test(priority=4080)
	  public void checkUniqueConstarintsUnderMasterCustomizaionDelete() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkUniqueConstarintsUnderMasterCustomizaionDelete(), true);
	  }
  
	  
	  // Reports Tab
	  
	  @Test(priority=4081)
	  public void checkAllReportsDisplayingInReportsTabInCustomizationMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAllReportsDisplayingInReportsTabInCustomizationMaster(), true);
	  }
	  
	  @Test(priority=4082)
	  public void checkLedgerdetailcheckBoxInReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkLedgerdetailcheckBoxInReports(), true);
	  }
	  
	  @Test(priority=4083)
	  public void checkLogoutAndLoginAfterCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkLogoutAndLoginAfterCustomization(), true);
	  }
	 
	  @Test(priority=4084)
	  public void checkLedgerInDetailIsDisplayingInMasterRibbonControl() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkLedgerInDetailIsDisplayingInMasterRibbonControl(), true);
	  }
	  
	  @Test(priority=4085)
	  public void checkLedgerDetailReportForVendorB() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkLedgerDetailReportForVendorB(), true);
	  }
	
	  // Cannot Import and Cannot Export
	  
	  @Test(priority=4086)
	  public void checkAddFieldAsCannotImportInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddFieldAsCannotImportInCreateTabCustomizeMaster(), true);
	  }
	  

	  @Test(priority=4087)
	  public void checkEnableCannotImportCheckboxInCannotImportField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkEnableCannotImportCheckboxInCannotImportField(), true);
	  }
	  
	  
	  
	  @Test(priority=4088)
	  public void checkAddFieldAsCannotExportInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddFieldAsCannotExportInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=4089)
	  public void checkEnableCannotExportCheckboxInCannotExportField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkEnableCannotExportCheckboxInCannotExportField(), true);
	  }
	  
	  
	  @Test(priority=4090)
	  public void checkCannotExportFieldCheckboxExistsInExportPopup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkCannotExportFieldCheckboxExistsInExportPopup(), true);
	  }
	  
	  @Test(priority=4091)
	  public void checkAdvancedImportOrExportAfterEnablingExportCheckBoxesInCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAdvancedImportOrExportAfterEnablingExportCheckBoxesInCreateTab(), true);
	  }
	  
	  @Test(priority=4092)
	  public void checkAdvancedImportOrExportAfterEnablingImportCheckBoxesInCreateTab1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAdvancedImportOrExportAfterEnablingImportCheckBoxesInCreateTab1(), true);
	  }
	  
	 
	  
	 // @Test(priority=4093)
	  public void checkAdvancedImportOrExportAfterEnablingExportCheckBoxesInCreateTabAccountTypeAsData() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAdvancedImportOrExportAfterEnablingExportCheckBoxesInCreateTabAccountTypeAsData(), true);
	  }
	
	  ///
	   @Test(priority=5001)
	  public void checkCreateNewDepartmentInDepartmentMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkCreateNewDepartmentInDepartmentMaster(), true);
	  }
	  
	  @Test(priority=5002)
	  public void checkAddNewFieldInGeneralTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddNewFieldInGeneralTabInCustomizeMaster(), true);
	  }
	  
	  @Test(priority=5003)
	  public void checkEditCreatedFieldAndChangeDataTypeToMasterAndLinkToDepartmentMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkEditCreatedFieldAndChangeDataTypeToMasterAndLinkToDepartmentMaster(), true);
	  }
	  
	  @Test(priority=5004)
	  public void checkAddNewFieldForDeletionInGeneralTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddNewFieldForDeletionInGeneralTab(), true);
	  }
	  
	  @Test(priority=5005)
	  public void checkAddCreatedbyIntoCustomizeTreeFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAddCreatedbyIntoCustomizeTreeFields(), true);
	  }
	  
	  @Test(priority=5006)
	  public void checkSaveAccountMasterWithCreatedDepartmentLink() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkSaveAccountMasterWithCreatedDepartmentLink(), true);
	  }
	 
	  @Test(priority=5007)
	  public void checkAccountFilterAsDEPTInSalesInvoiceSettingsBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAccountFilterAsDEPTInSalesInvoiceSettingsBtn(), true);
	  }
	  
	  @Test(priority=5008)
	  public void checkAccountListInCreatedDepartmentLink() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAccountListInCreatedDepartmentLink(), true);
	  }
	  
	  @Test(priority=5009)
	  public void checkAccountlListWithoutCreatedDeptLinkMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkAccountlListWithoutCreatedDeptLinkMaster(), true);
	  }
	  
	  @Test(priority=5010)
	  public void checkSaveSalesInvoiceVoucherWithCreatedAccountsLinkedWithDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkSaveSalesInvoiceVoucherWithCreatedAccountsLinkedWithDepartment(), true);
	  }
	  
	  
	  @Test(priority=5011)
	  public void checkPreviouslySavedVoucherandValidate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkPreviouslySavedVoucherandValidate(), true);
	  }
	  
	  @Test(priority=5012)
	  public void checkSaveWithSelectAccountInLineUnderMiscellaneousTabInSalesInvoiceSettings() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkSaveWithSelectAccountInLineUnderMiscellaneousTabInSalesInvoiceSettings(), true);
	  }
	  
	  @Test(priority=5013)
	  public void checkSalesInvoiceVoucherBodyGridList() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkSalesInvoiceVoucherBodyGridList(), true);
	  }
	  

	  @Test(priority=5014)
	  public void checkSaveSalesInvoiceVoucherAfterSavingWithSelectingAccountInEveryLine() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkSaveSalesInvoiceVoucherAfterSavingWithSelectingAccountInEveryLine(), true);
	  }
	  
	  @Test(priority=5015)
	  public void checkEditPreviouslySavedSalesInvoiceVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkEditPreviouslySavedSalesInvoiceVoucher(), true);
	  }
	  
	  @Test(priority=5016)
	  public void checkSavedSalesInvoiceVoucherandValidateBothHeaderAndBodyFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountMasterPage(getDriver());
		  Assert.assertEquals(cmctp.checkSavedSalesInvoiceVoucherandValidateBothHeaderAndBodyFields(), true);
	  }
	 
	///
	  @Test(priority=7103)
		public void checkAddingFieldsWithDefaultMinimumAndMaximumValuesInPurchaseVoucherVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkAddingFieldsWithDefaultMinimumAndMaximumValuesInPurchaseVoucherVAT(), true);
		}

		@Test(priority=7104)
		public void checkAddingFieldWithhAddToNetDeductStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkAddingFieldWithhAddToNetDeductStock(), true);
		}
		
		@Test(priority=7105)
		public void checkAddingFieldWithAddToNetNotApplicableforAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkAddingFieldWithAddToNetNotApplicableforAddToStock(), true);
		}
		
		
		@Test(priority=7106)
		public void checkAddingFieldsWithDeductAsAddToNetADDAsAddToStockInPvVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkAddingFieldsWithDeductAsAddToNetADDAsAddToStockInPvVAT(), true);
		}
		
		@Test(priority=7107)
		public void checkAddingFieldWithNotApplicableAsAddToNetAddAsAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkAddingFieldWithNotApplicableAsAddToNetAddAsAddToStock(), true);
		}
		
		@Test(priority=7108)
		public void checkAddingFieldsWithDeductAsAddToNetDeductasAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkAddingFieldsWithDeductAsAddToNetDeductasAddToStock(), true);
		}
		
		@Test(priority=7109)
		public void checkAddingFieldWithNotApplicableAsAddToNetNotApplicableAsAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkAddingFieldWithNotApplicableAsAddToNetNotApplicableAsAddToStock(), true);
		}
		
		@Test(priority=7110)
		public void CheckAllFieldsInPurchaseVoucherVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.CheckAllFieldsInPurchaseVoucherVAT(), true);
		}
		
		@Test(priority=7171)
		public void checkLedgerReportForAddToNetOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkLedgerReportForAddToNetOption(), true);
		}
		
		//@Test(priority=7112)
		public void checkStockLedgerReportForAddToStockOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkStockLedgerReportForAddToStockOption(), true);
		}
	
		@Test(priority=7113)
		public void checkFieldPositionBQ_AddToNetNotApplicableToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkFieldPositionBQ_AddToNetNotApplicableToStock(), true);
		}
		
		
		@Test(priority=7114)
		public void checkFieldPositionBQR_DeductAsAddToNetAddAsAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkFieldPositionBQR_DeductAsAddToNetAddAsAddToStock(), true);
		}
		
		@Test(priority=7115)
		public void checkFieldPostionBRG_NotApplicableToAddToNetAddToAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkFieldPostionBRG_NotApplicableToAddToNetAddToAddToStock(), true);
		}
		
		
		@Test(priority=7116)
		public void checkFieldPositionAG_DeductAddToNetDeductToAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkFieldPositionAG_DeductAddToNetDeductToAddToStock(), true);
		}
		
		@Test(priority=7117)
		public void checkHiddenPropertyForNotApplicableToAddToNetNotApplicableToAddToStockField() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkHiddenPropertyForNotApplicableToAddToNetNotApplicableToAddToStockField(), true);
		}
		
		
		@Test(priority=7118)
		public void checkRestrictMesageAndRestrictFormulaFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkRestrictMesageAndRestrictFormulaFields(), true);
		}
		
		
		@Test(priority=7119)
		public void checkFieldsPositionAndHiddenFieldAndRestrictMessageInPvVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkFieldsPositionAndHiddenFieldInPvVAT(), true);
		}
		
		//////Properties
		
		@Test(priority=7120)
		public void checkAudiTrailPropertyForCaption_Default_Text() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkAudiTrailPropertyForCaption_Default_Text(), true);
		}
		
		@Test(priority=7121)
		public void checkCannotExportPropertyForAddToNetDeductFromStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkCannotExportPropertyForAddToNetDeductFromStock(), true);
		}

		@Test(priority=7122)
		public void checkCannotImportPropertyForAddToNetNotApplicableToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkCannotImportPropertyForAddToNetNotApplicableToStock(), true);
		}
		
		@Test(priority=7123)
		public void checkHiddenPropertyForDeductAsAddToNetAddAsAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkHiddenPropertyForDeductAsAddToNetAddAsAddToStock(), true);
		}
		
		@Test(priority=7124)
		public void checkMandatoryPropertyForNotApplicableToAddToNetAddToAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkMandatoryPropertyForNotApplicableToAddToNetAddToAddToStock(), true);
		}
		
		@Test(priority=7125)
		public void checkNotAvailableForReportsForDeductAddToNetDeductToAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkNotAvailableForReportsForDeductAddToNetDeductToAddToStock(), true);
		}
		
		
		@Test(priority=7126)
		public void checkReadOnlyPropertyForNotApplicableToAddToNetNotApplicableToAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkReadOnlyPropertyForNotApplicableToAddToNetNotApplicableToAddToStock(), true);
		}
		
		
		@Test(priority=7127)
		public void checkAddedPropertiesForAllFieldsInPvVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkAddedPropertiesForAllFieldsInPvVAT(), true);
		}
		//not available for reports property validation 
		@Test(priority=7128)
		public void checkNotAvailableForReportsForDeductAddToNetDeductToAddToStockInLedger() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkNotAvailableForReportsForDeductAddToNetDeductToAddToStockInLedger(), true);
		}
		
		
		@Test(priority=8000)//"PRIORITIES" ARE NOT IN ORDER THAT DOESNT EFFECT CODE(NO TEST CASES ARE MISSING IN THE MIDDLE)
		public void checkSaveCreateTab_TextFieldInBodyFiledsCustomizationMasterCreateTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkSaveCreateTab_TextFieldInBodyFiledsCustomizationMasterCreateTab(), true);
		}
		
		@Test(priority=8002)
		public void checkSaveCreateTab_NumberFieldInBodyFiledsCustomizationMasterCreateTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkSaveCreateTab_NumberFieldInBodyFiledsCustomizationMasterCreateTab(), true);
		}
		
		@Test(priority=8006)
		public void checkSaveCreateTab_DocumentViewerFieldInBodyFiledsCustomizationMasterCreateTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkSaveCreateTab_DocumentViewerFieldInBodyFiledsCustomizationMasterCreateTab(), true);
		}
		
		@Test(priority=8008)
		public void checkSaveCreateTab_MasterFieldInBodyFiledsCustomizationMasterCreateTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkSaveCreateTab_MasterFieldInBodyFiledsCustomizationMasterCreateTab(), true);
		}
		
		
		 @Test(priority=8010)
		  public void checkLogoutAndLoginForBodyCustomizationInCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
			  cmctp=new AccountMasterPage(getDriver());
			  Assert.assertEquals(cmctp.checkLogoutAndLogin(), true);
		  }
		 
		 @Test(priority=8013)
		  public void checkAddedFiledsInBodyFieldsInCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
			  cmctp=new AccountMasterPage(getDriver());
			  Assert.assertEquals(cmctp.checkAddedFiledsInBodyFieldsInCreateTab(), true);
		  }
		 
		 
		 
		  @Test(priority=8200)
		  public void checkLogoutAndLoginWithAccountRestrictUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
			  cmtp=new AccountPropertiesPage(getDriver());
			  Assert.assertEquals(cmtp.checkLogoutAndLoginWithAccountRestrictUser(), true);
		  }
		  
		  @Test(priority=8201)
		  public void checkCreateUserInAccountRestrictUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
			  cmctp=new AccountMasterPage(getDriver());
			  Assert.assertEquals(cmctp.checkCreateUserInAccountRestrictUser(), true);
		  }
		  
		  @Test(priority=8202)
		  public void checkLogoutAndLoginWithCreatedUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
			  cmctp=new AccountMasterPage(getDriver());
			  Assert.assertEquals(cmctp.checkLogoutAndLoginWithCreatedUser(), true);
		  }
		  
		  @Test(priority=8203)
		  public void checkLogoutAndLoginWithAccountRestrictUserAgain() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
			  cmtp=new AccountPropertiesPage(getDriver());
			  Assert.assertEquals(cmtp.checkLogoutAndLoginWithAccountRestrictUser(), true);
		  }
		  
		  @Test(priority=8204)
		  public void checkEditCreatedUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
			  cmctp=new AccountMasterPage(getDriver());
			  Assert.assertEquals(cmctp.checkEditCreatedUser(), true);
		  }
		  
		  @Test(priority=8205)
		  public void checkDeleteCreatedUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
			  cmctp=new AccountMasterPage(getDriver());
			  Assert.assertEquals(cmctp.checkDeleteCreatedUser(), true);
		  }
		  
		  @Test(priority=8206)
		  public void checkLogoutAndLoginWithSUToEnableDoNotRestrictTheSelectionEvenIfRightsAreNotAllottedOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
			  cmtp=new AccountPropertiesPage(getDriver());
			  Assert.assertEquals(cmtp.checkLogoutAndLogin(), true);
		  }
		  
		  
		   @Test(priority=60063)
		  public void checklogoutAccountPropertiesPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
			   cmtp=new AccountPropertiesPage(getDriver());
			  Assert.assertEquals(cmtp.checklogoutAccountPropertiesPage(), true);
		  }
		  
		  
		
		
		//cannot import property validation
		/*@Test(priority=7129)
		public void checkCannotImportPropertyForAddToNetNotApplicableToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			cmctp=new AccountMasterPage(getDriver());
			Assert.assertEquals(cmctp.checkCannotImportPropertyForAddToNetNotApplicableToStock(), true);
		}
		*/
	  
	  
	  
	  
}
	  
	  
	  
	  
	  
	  
	  
	  