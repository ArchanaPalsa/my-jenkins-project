package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.focus.Pages.AccountPropertiesPage;

import com.focus.base.BaseEngine;

public class AccountPropertiesTest extends BaseEngine
{

	
	AccountPropertiesPage cmctp;
	
	//SanityBackup in backup folder in project
	
	@Test(priority=1998)
	public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	  cmctp=new AccountPropertiesPage(getDriver());
	  Assert.assertEquals(cmctp.checkLogin(), true);
	}
	
	
 @Test(priority=1999)
	public void checkRestoreCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
	  cmctp=new AccountPropertiesPage(getDriver());
	  Assert.assertEquals(cmctp.checkRestoreCompany(), true);
	}
   /*
	 @Test(priority=60001)
	  public void checkAccouncreatedWithPropertyAsCreditOrDebitTotlasForEachMonth() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new  AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkAccouncreatedWithPropertyAsCreditOrDebitTotlasForEachMonth(), true);
	  }
	
	 @Test(priority=60002)
	  public void checkPropertiesForCreatedAccountAsDebitOrCreditTotalsForEachMonth() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new  AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkPropertiesForCreatedAccountAsDebitOrCreditTotalsForEachMonth(), true);
	  }
	  
	  @Test(priority=60003)
	  public void checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachMonth() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new  AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachMonth(), true);
	  }

	  @Test(priority=60004)
	  public void checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachMonth2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new  AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachMonth2(), true);
	  }
	  
	  @Test(priority=60005)
	  public void checkLedgerReportForCreatedCustomer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new  AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkLedgerReportForCreatedCustomer(), true);
	  }
	  
	  @Test(priority=60006)
	  public void checkCustomerStatementsReportForCreatedCustomerAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new  AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkCustomerStatementsReportForCreatedCustomerAccount(), true);
	  }
	  
	  
	
	  // Display Debit / Credit totals for each day
	  
	  @Test(priority=60007)
	  public void checkAccouncreatedWithPropertyAsCreditOrDebitTotlasForEachDay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new  AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkAccouncreatedWithPropertyAsCreditOrDebitTotlasForEachDay(), true);
	  }

	  @Test(priority=60008)
	  public void checkPropertiesForCreatedAccountAsDebitOrCreditTotalsForEachDay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new  AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkPropertiesForCreatedAccountAsDebitOrCreditTotalsForEachDay(), true);
	  }

	  @Test(priority=60009)
	  public void checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachDay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new  AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachDay(), true);
	  }
	
	  @Test(priority=60010)
	  public void checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachDay2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new  AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachDay2(), true);
	  }
	
	  @Test(priority=60011)//col
	  public void checkLedgerReportForCreatedCustomer2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new  AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkLedgerReportForCreatedCustomer2(), true);
	  }

	  @Test(priority=60012)
	  public void checkCustomerStatementsReportForCreatedCustomerAccount2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new  AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkCustomerStatementsReportForCreatedCustomerAccount2(), true);
	  }
	
	
	  // Display Un-Realize Gain/Loss In Ledger
	  
	  @Test(priority=60013)
	  public void checkCreatingAccountForDisplayUnRealizeGainOrLossInLedger() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkCreatingAccountForDisplayUnRealizeGainOrLossInLedger(), true);
	  }
	  
	  @Test(priority=60014)
	  public void checkMasterAccountEnablingDisplayUnRealizeGainOrLossInLedgerChkboxInProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkMasterAccountEnablingDisplayUnRealizeGainOrLossInLedgerChkboxInProperties(), true);
	  }
	  
	  @Test(priority=60015)
	  public void checkLogoutAndLoginAfterEnablingDisplayUnRealizeGainOrLossInLedgerChkboxInProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkLogoutAndLogin(), true);
	  }
	
	
	  @Test(priority=60016)
	  public void checkSavingSalesInvoivesVATWithCustomerAccountAsDisplayUnRealizeGainLossInLedger() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkSavingSalesInvoivesVATWithCustomerAccountAsDisplayUnRealizeGainLossInLedger(), true);
	  }
	  
	  @Test(priority=60017)
	  public void checkSavingRecepitsVocher1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkSavingRecepitsVocher1(), true);
	  }
	  
	  @Test(priority=60018)
	  public void checkCustomerStatementReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, ParseException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkCustomerStatementReport(), true);
	  }
	  
	  // Consolidate when both Accounts are same
	  
	  @Test(priority=60019)
	  public void checkCreatingAccountForConsolidateWhenBothAccountsAreSame() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkCreatingAccountForConsolidateWhenBothAccountsAreSame(), true);
	  }
	  
	  @Test(priority=60020)
	  public void checkMasterAccountEnablingConsolidateWhenBothAccountsAreSameInProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkMasterAccountEnablingConsolidateWhenBothAccountsAreSameInProperties(), true);
	  }
	  
	  @Test(priority=60021)
	  public void checkSavingRecepitsVocherForValidatingConsolidateWhenBothAccountsAreSame() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkSavingRecepitsVocherForValidatingConsolidateWhenBothAccountsAreSame(), true);
	  }
	  
	  @Test(priority=60022)
	  public void checkLedgerReportForConsolidateWhenBothAccountsAreSame() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkLedgerReportForConsolidateWhenBothAccountsAreSame(), true);
	  }
	 
	  // Consolidate Always
	  
	  
	  @Test(priority=60023)
	  public void checkCreatingAccountForConsolidateAlways() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkCreatingAccountForConsolidateAlways(), true);
	  }
	  
	  @Test(priority=60024)
	  public void checkMasterAccountEnablingConsolidateAlwaysInProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkMasterAccountEnablingConsolidateAlwaysInProperties(), true);
	  }
	  
	  @Test(priority=60025)
	  public void checkSavingRecepitsVocherForValidatingConsolidateAlways() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkSavingRecepitsVocherForValidatingConsolidateAlways(), true);
	  }
	  
	  @Test(priority=60026)
	  public void checkLedgerReportForConsolidateAlways() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkLedgerReportForConsolidateAlways(), true);
	  }
	  
	  // Active and In Active
	  
	  
	  @Test(priority=60027)
	  public void checkAccouncreatedWithPropertAsStatusIsActive() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkAccouncreatedWithPropertAsStatusIsActive(), true);
	  }
	
	  @Test(priority=60028)
	  public void checkPropertiesForCreatedAccountAsDisplayWhenStatusIsActive() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new  AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkPropertiesForCreatedAccountAsDisplayWhenStatusIsActive(), true);
	  }
	
	  @Test(priority=60029)
	  public void checkRaiseSalesIvoiceForCustomerAccountCustDisplayWhenStatusIsActive() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new  AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkRaiseSalesIvoiceForCustomerAccountCustDisplayWhenStatusIsActive(), true);
	  }
	
	  @Test(priority=60030)
	  public void checkCustomerStatementsReportForCustDisplayWhenStatusIsActive() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new  AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkCustomerStatementsReportForCustDisplayWhenStatusIsActive(), true);
	  }
	
	  @Test(priority=60031)
	  public void checkReportDetailsInLedgerReportPageForCustomerAccountStatusAsActive() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkReportDetailsInLedgerReportPageForCustomerAccountStatusAsActive(), true);
	  }
	
	  // In Active
	  
	  @Test(priority=60032)
	  public void checkChangeAccountPropertyFromActiveToInActive() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkChangeAccountPropertyFromActiveToInActive(), true);
	  }
	  
	  @Test(priority=60033)
	  public void checkLogoutAndLoginToCheckCustomerStatementsReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkLogoutAndLoginToCheckCustomerStatementsReports(), true);
	  }
	 
	   @Test(priority=60034)
	  public void checkCustomerStatementsReportisEmpty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkCustomerStatementsReportisEmpty(), true);
	  }
	  
	   @Test(priority=60035)
	  public void checkLedgerIsEmptyForCustomerAccountStatusAsInActive() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkLedgerIsEmptyForCustomerAccountStatusAsInActive(), true);
	  }
	 
	  
	  // Do Not Restrict The Selection Even If Rights Are Not Allotted
	  
	  @Test(priority=60036)
	  public void checkCreatingAccountForDoNotRestrictTheSelectionEvenIfRightsAreNotAllotted() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkCreatingAccountForDoNotRestrictTheSelectionEvenIfRightsAreNotAllotted(), true);
	  }
	 
	  @Test(priority=60037)
	  public void checkUserCreationForRestrictionOfAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkUserCreationForRestrictionOfAccount(), true);
	  }
	
	 @Test(priority=60038)
	  public void checkSavingSalesInvoivesVATWithCustomerAccountAsDoNotRestrictIfRightsAreNotAllotted() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkSavingSalesInvoivesVATWithCustomerAccountAsDoNotRestrictIfRightsAreNotAllotted(), true);
	  }
	 
	  
	  @Test(priority=60039)
	  public void checkLogoutAndLoginWithAccountRestrictUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkLogoutAndLoginWithAccountRestrictUser(), true);
	  }
	  
	  @Test(priority=60040)
	  public void checkLedgerReportForUserRestrictAccountWithoutEnablingDoNotRestrictTheSelectionEvenIfRightsAreNotAllottedOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkLedgerReportForUserRestrictAccountWithoutEnablingDoNotRestrictTheSelectionEvenIfRightsAreNotAllottedOption(), true);
	  }
	  
	  @Test(priority=60041)
	  public void checkSalesInvoivesVATWithOutEnablingDoNotRestrictIfRightsAreNotAllottedOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkSalesInvoivesVATWithOutEnablingDoNotRestrictIfRightsAreNotAllottedOption(), true);
	  }
	  
	  @Test(priority=60042)
	  public void checkLogoutAndLoginWithSUToEnableDoNotRestrictTheSelectionEvenIfRightsAreNotAllottedOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkLogoutAndLogin(), true);
	  }
	  
	  @Test(priority=60043)
	  public void checkMasterAccountEnablingDoNotRestrictTheSelectionEvenIfRightsAreNotAllottedOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkMasterAccountEnablingDoNotRestrictTheSelectionEvenIfRightsAreNotAllottedOption(), true);
	  }
	  
	  @Test(priority=60044)
	  public void checkLogoutAndLoginWithAccountRestrictUserAfterEnablingDoNotRestrictTheSelectionEvenIfRightsAreNotAllottedOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkLogoutAndLoginWithAccountRestrictUser(), true);
	  }
	  
	  @Test(priority=60045)
	  public void checkLedgerReportForUserRestrictAccountWithDoNotRestrictTheSelectionEvenIfRightsAreNotAllottedOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkLedgerReportForUserRestrictAccountWithDoNotRestrictTheSelectionEvenIfRightsAreNotAllottedOption(), true);
	  }
	  
	  @Test(priority=60046)
	  public void checkSalesInvoivesVATAfterEnablingDoNotRestrictIfRightsAreNotAllottedOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkSalesInvoivesVATAfterEnablingDoNotRestrictIfRightsAreNotAllottedOption(), true);
	  }
	  
	  @Test(priority=60047)
	  public void checkLogoutAndLoginWithSUAfterValidation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkLogoutAndLogin(), true);
	  }
	
	  
	  // Display ledger by currency
	  
	  @Test(priority=60048)
	  public void checkAccouncreatedWithPropertyAsDisplayLedgerByCurrency() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkAccouncreatedWithPropertyAsDisplayLedgerByCurrency(), true);
	  }
	  
	  @Test(priority=60049)
	  public void checkPropertiesForCreatedAccountAsDisplayLedgerByCurrency() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkPropertiesForCreatedAccountAsDisplayLedgerByCurrency(), true);
	  }
	  
	  @Test(priority=60050)
	  public void checkRaiseSalesInvoivesVATForCustomerDisplayLedgerByCurrency() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkRaiseSalesInvoivesVATForCustomerDisplayLedgerByCurrency(), true);
	  }
	  
	  @Test(priority=60051)
	  public void checkLedgerDetailsForCustomerDisplayLedgerByCurrency() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkLedgerDetailsForCustomerDisplayLedgerByCurrency(), true);
	  }
	  
	  @Test(priority=60052)
	  public void checkCustomerStatementsReportForCreatedCustomerAccountDisplayLedgerByCurrency() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkCustomerStatementsReportForCreatedCustomerAccountDisplayLedgerByCurrency(), true);
	  }
	  
	  
	  
	  
	  // Club the transactions of all the Accounts under Group
	  
	  @Test(priority=60053)
	  public void checkGroupAccountCreateAndSelectPropertyASClubAllTransactionsOfEachAccountUnderGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkGroupAccountCreateAndSelectPropertyASClubAllTransactionsOfEachAccountUnderGroup(), true);
	  }
	 
	  @Test(priority=60054)
	  public void checkSavedGroupAccountInTheAccountsListAndSelectProprtyAsClubAllTransactionsOfEachAccountUnderGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkSavedGroupAccountInTheAccountsListAndSelectProprtyAsClubAllTransactionsOfEachAccountUnderGroup(), true);
	  }
	  
	  @Test(priority=60055)
	  public void checkRaiseSalesInvoivesVATForCustomerAccountOneInGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkRaiseSalesInvoivesVATForCustomerAccountOneInGroup(), true);
	  }
	  
	  @Test(priority=60056)
	  public void checkRaiseSalesInvoivesVATForCustomerAccountTwoInGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkRaiseSalesInvoivesVATForCustomerAccountTwoInGroup(), true);
	  }
	  
	  @Test(priority=60057)
	  public void checkCustomerStatementsReportDetailsForGroupAccountCustCulbTransactionsOfAllAccountsUnderGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkCustomerStatementsReportDetailsForGroupAccountCustCulbTransactionsOfAllAccountsUnderGroup(), true);
	  }
	  
	  
	  
	  // Display Debit/Credit totals for each Account under group
	  
	  
	  @Test(priority=60058)
	  public void checkGroupAccountCreateAndSelectPropertyASDisplayDrOrCrTotalForEachAccountUnderGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkGroupAccountCreateAndSelectPropertyASDisplayDrOrCrTotalForEachAccountUnderGroup(), true);
	  }
	  
	  @Test(priority=60059)
	  public void checkSavedGroupAccountInTheAccountsListAndSelectProprtyAsDisplayDrOrCrTotalForEachAccountUnderGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkSavedGroupAccountInTheAccountsListAndSelectProprtyAsDisplayDrOrCrTotalForEachAccountUnderGroup(), true);
	  }
	  
	  @Test(priority=60060)
	  public void checkRaiseSalesInvoivesVATForCustomerAccountOneInGroupForDrOrCrTotlas() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkRaiseSalesInvoivesVATForCustomerAccountOneInGroupForDrOrCrTotlas(), true);
	  }
	  
	  @Test(priority=60061)
	  public void checkRaiseSalesInvoivesVATForCustomerAccountTwoInGroupForDrOrCrTotlas() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkRaiseSalesInvoivesVATForCustomerAccountTwoInGroupForDrOrCrTotlas(), true);
	  }
	  
	  @Test(priority=60062)
	  public void checkCustomerStatementsReportForGroupAccountDisplayDrOrCrTotalsForEachAccountUnderGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checkCustomerStatementsReportForGroupAccountDisplayDrOrCrTotalsForEachAccountUnderGroup(), true);
	  }
	  
	  
	   @Test(priority=60063)
	  public void checklogoutAccountPropertiesPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new AccountPropertiesPage(getDriver());
		  Assert.assertEquals(cmctp.checklogoutAccountPropertiesPage(), true);
	  }
	  
	  */

	  
}
