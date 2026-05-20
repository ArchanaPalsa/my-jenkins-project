package com.focus.testcases;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.focus.Pages.UserRestrictionsPage;
import com.focus.Pages.UserTransactionRightsPage;

import com.focus.base.BaseEngine;

public class UserTransactionRightsTest extends BaseEngine
{
	UserTransactionRightsPage UTR;
	UserRestrictionsPage urp;

	@Test(priority=1)
	public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkLogin(), true);
	}
	
	
	@Test(priority=2)
	public void checkSaveRoleWithCreatedProfileForTransactionRights() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkSaveRoleWithCreatedProfileForTransactionRights(), true);
	}

	@Test(priority=3)
	public void checkUserCreationForCreatedRoleForTransactionRights() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkUserCreationForCreatedRoleForTransactionRights(), true);
	}

	
	@Test(priority=4)
	public void checkSavePurchasesVoucherForPreviousMonth() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkSavePurchasesVoucherForPreviousMonth(), true);
	}
	
	@Test(priority=5)
	public void checkEnableCreditLimitInARAP() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkEnableCreditLimitInARAP(), true);
	}
	 
	@Test(priority=6)
	public void checkCreateCustAccountInWithCreditLimit() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkCreateCustAccountInWithCreditLimit(), true);
	}
	
	
	@Test(priority=7)
	public void checkCannotEditAndCannotAddPrevMonthsTransactionDef() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkCannotEditAndCannotAddPrevMonthsTransactionDef(), true);
	}
	
	@Test(priority=8)
	public void checkLogoutFromSuandLoginToUTR() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkLogoutFromSuandLoginToUTR(), true);
	}
	
	@Test(priority=9)
	public void checkVerifyCannotEditPrevMonthsTransactioninUtr() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkVerifyCannotEditPrevMonthsTransactioninUtr(), true);
	}
	
	@Test(priority=10)
	public void checkVerifyCannotAddPrevMonthsTransactioninUtr() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkVerifyCannotAddPrevMonthsTransactioninUtr(), true);
	}

	@Test(priority=11)
	public void checkSaveExcessInStockVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkSaveExcessInStockVoucher(), true);
	}
	
	@Test(priority=12)
	public void checkSaveSalesInvoicesForCreditLimitAlert() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkSaveSalesInvoicesForCreditLimitAlert(), true);
	}

	@Test(priority=13)
	public void checkSavePaymentsForNegativeCashAlertValidation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkSavePaymentsForNegativeCashAlertValidation(), true);
	}
	
	@Test(priority=14)
	public void checkSaveRecieiptsForNegCashAlertValidation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkSaveRecieiptsForNegCashAlertValidation(), true);
	}
	
	@Test(priority=15)
	public void checkSaveSalesInvoicesForalertNegStockValidation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkSaveSalesInvoicesForalertNegStockValidation(), true);
	}
	
	@Test(priority=16)
	public void checkLogoutANDLoginWithSU() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkLogoutANDLoginWithSU(), true);
	}
	
	@Test(priority=17)
	public void checkDefineCurrentDateForCannotEditpreviousMonthsEntriesAfter() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkDefineCurrentDateForCannotEditpreviousMonthsEntriesAfter(), true);
	}
	
	@Test(priority=18)
	public void checkLogoutFromSuandLoginToUTR1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkLogoutFromSuandLoginToUTR(), true);
	}
	
	@Test(priority=19)
	public void checkSavePaymentsVoucherForNegativeCashStopValidation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkSavePaymentsVoucherForNegativeCashStopValidation(), true);
	}
	
	@Test(priority=20)
	public void checkReceiptsVoucherForNegCashStopValidation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkReceiptsVoucherForNegCashStopValidation(), true);
	}
			
	
	@Test(priority=21)
	public void checkStopCreditLimitInSalesInvoices() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkStopCreditLimitInSalesInvoices(), true);
	}
	
	@Test(priority=22)
	public void checkSavePurchasesVoucherForStdItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkSavePurchasesVoucherForStdItem(), true);
	}

	@Test(priority=23)
	public void checkSaveSalesInvoicesVoucherForNegativeStockStopValidation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkSaveSalesInvoicesVoucherForNegativeStockStopValidation(), true);
	}
	
	@Test(priority=24)
	public void checkVerifyCannotEditPrevMonthsTransactioninUtrwithCurrentDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkVerifyCannotEditPrevMonthsTransactioninUtrwithCurrentDate(), true);
	}

	@Test(priority=25)
	public void checkVerifyCannotAddPrevMonthsTransactioninUtrwithCurrentDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkVerifyCannotAddPrevMonthsTransactioninUtrwithCurrentDate(), true);
	}
	
	@Test(priority=26)
	public void checkLogoutANDLoginWithSU1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkLogoutANDLoginWithSU(), true);
	}
	
	@Test(priority=27)
	public void checkEnableCannotAddFutureTransactionsChcBx() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkEnableCannotAddFutureTransactionsChcBx(), true);
	}
	
	@Test(priority=28)
	public void checkLogoutFromSuandLoginToUTR2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkLogoutFromSuandLoginToUTR(), true);
	}
	
	@Test(priority=29)
	public void checkCreateAPurchaseVoucherandVerifyTransactionforFutureDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkCreateAPurchaseVoucherandVerifyTransactionforFutureDate(), true);
	}
	
	@Test(priority=30)
	public void checkValidateCantAddTransactionOfDaysOld() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkValidateCantAddTransactionOfDaysOld(), true);
	}
	
	@Test(priority=31)
	public void checkwithOnAndAfterDaysValidation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkwithOnAndAfterDaysValidation(), true);
	}
	
	@Test(priority=32)
	public void checkCannotEditTransactionThatAreMoreThanFiveDays() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkCannotEditTransactionThatAreMoreThanFiveDays(), true);
	}
	
	@Test(priority=33)
	public void checkADDAndEditTransactionsThatAre4DaysOld() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkADDAndEditTransactionsThatAre4DaysOld(), true);
	}

	
	@Test(priority=34)
	public void checkBatchCannotBeCustomizedValidationandMasterCustInSalesInvoice() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkBatchCannotBeCustomizedValidationandMasterCustInSalesInvoice(), true);
	}

	@Test(priority=35)
	public void checkLogoutANDLoginWithSU2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkLogoutANDLoginWithSU(), true);
	}
	
	@Test(priority=36)
	public void checkRequestForCreditLimitInTransactionRights() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkRequestForCreditLimitInTransactionRights(), true);
	}
	
	@Test(priority=37)
	public void checkDefineCreditLimitAuthorization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkDefineCreditLimitAuthorization(), true);
	}
	
	@Test(priority=38)
	public void checkMapCreditLimitWithCreatedAuthorizationdef() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkMapCreditLimitWithCreatedAuthorizationdef(), true);
	}
	
	
	@Test(priority=39)
	public void checkLogoutFromSuandLoginToUTR3() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkLogoutFromSuandLoginToUTR(), true);
	}
	
	@Test(priority=40)
	public void checkSaveSalesInvoiceForReqCreditLimit() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkSaveSalesInvoiceForReqCreditLimit(), true);
	}
	
	@Test(priority=41)
	public void checkLoginWithERR() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		urp=new UserRestrictionsPage(getDriver());
	  Assert.assertEquals(urp.checkLoginWithERR(), true);
	}
	
	@Test(priority=42)
	public void checkReqAlertInRERAndAuthorize() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
	  Assert.assertEquals(UTR.checkReqAlertInRERAndAuthorize(), true);
	}
	
	@Test(priority=43)
	public void checkLogoutFromSuandLoginToUTR4() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkLogoutFromSuandLoginToUTR(), true);
	}
	
	@Test(priority=44)
	public void checkResaveSalesInvoiceVoucherandValidateSuspendStatus() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
	  Assert.assertEquals(UTR.checkResaveSalesInvoiceVoucherandValidateSuspendStatus(), true);
	}
	
	@Test(priority=45)
	public void checkLogoutANDLoginWithSU3() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkLogoutANDLoginWithSU(), true);
	}
	
	
	@Test(priority=46)
	public void checkDefineBudgetForBudgetLimitOptionInUtr() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkDefineBudgetForBudgetLimitOptionInUtr(), true);
	}
	
	@Test(priority=47)
	public void checkSavedBudgetInConfirmBudgetScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkSavedBudgetInConfirmBudgetScreen(), true);
	}


	@Test(priority=48)
	public void checkLogoutFromSuandLoginToUTR5() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkLogoutFromSuandLoginToUTR(), true);
	}
	
	@Test(priority=49)
	public void checkSavePurchaseVoucherForBudgetLimitAlertValidation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkSavePurchaseVoucherForBudgetLimitAlertValidation(), true);
	}
	
	@Test(priority=50)
	public void checkLogoutANDLoginWithSU4() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkLogoutANDLoginWithSU(), true);
	}
	
	@Test(priority=51)
	public void checkStopOptionInBudgetLimit() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkStopOptionInBudgetLimit(), true);
	}
	
	@Test(priority=52)
	public void checkLogoutFromSuandLoginToUTR6() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkLogoutFromSuandLoginToUTR(), true);
	}
	
	@Test(priority=53)//  
	public void checkStopBudgetLimitOptionValidationInPurchasesVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkStopBudgetLimitOptionValidationInPurchasesVoucher(), true);
	}
	
	@Test(priority=54)
	public void checkLogoutANDLoginWithSU5() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkLogoutANDLoginWithSU(), true);
	}
	
	
	@Test(priority=57)
	public void checkCreateTreeInAccountMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkCreateTreeInAccountMaster(), true);
	}
	
	@Test(priority=58)
	public void checkCreateTreeInItemMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkCreateTreeInItemMaster(), true);
	}

	@Test(priority=59)
	public void checkAssignNewTreeForUtrUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkAssignNewTreeForUtrUser(), true);
	}
	
	@Test(priority=60)
	public void checkLogoutFromSuandLoginToUTR7() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkLogoutFromSuandLoginToUTR(), true);
	}
	
	@Test(priority=61)
	public void checkAccountTreeListForUtr() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkAccountTreeListForUtr(), true);
	}
	
	@Test(priority=62)
	public void checkItemTreeListforutr() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checkItemTreeListforutr(), true);
	}
	
	@Test(priority=63)
	public void checklogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		UTR=new UserTransactionRightsPage(getDriver());
		Assert.assertEquals(UTR.checklogout(), true);
	}
	
	

}

