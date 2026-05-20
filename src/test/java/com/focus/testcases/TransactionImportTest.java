package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.AccountMasterPage;
import com.focus.Pages.AccountPropertiesPage;
import com.focus.Pages.TransactionImportPage;
import com.focus.base.BaseEngine;

public class TransactionImportTest extends BaseEngine 
{
	
	AccountPropertiesPage app;
	AccountMasterPage cmctp;
	
	TransactionImportPage tip;
	
	
	@Test(priority=10)
	public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		cmctp=new AccountMasterPage(getDriver());
		Assert.assertEquals(cmctp.checkLogin(), true);
	}
	
	@Test(priority=100)
	public void checkRestoreCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		app=new AccountPropertiesPage(getDriver());
		Assert.assertEquals(app.checkRestoreCompany(), true);
	}

	@Test(priority=201)
	public void checkTransactionImportofOpeningBalances() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkTransactionImportofOpeningBalances(), true);
	}
	
	@Test(priority=202)
	public void checkImportedOpeningBalances() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkImportedOpeningBalances(), true);
	}
	
	@Test(priority=203)
	public void checkTransactionImportOfOpeningStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkTransactionImportOfOpeningStocks(), true);
	}
	
	@Test(priority=204)
	public void checkImportedOpeningStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkImportedOpeningStocks(), true);
	}
	
	@Test(priority=205)
	public void checkTransactionImportofNon_StandardJournalEntries() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkTransactionImportofNon_StandardJournalEntries(), true);
	}
	
	@Test(priority=206)
	public void checkNonStandardJEVoucherImported() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkNonStandardJEVoucherImported(), true);
	}
	
	@Test(priority=207)
	public void checkTransactionImportOfForexJV() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkTransactionImportOfForexJV(), true);
	}
	
	@Test(priority=208)
	public void checkForexJVImported() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkForexJVImported(), true);
	}
	
	@Test(priority=209)
	public void checkTransactionImportOfPayments() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkTransactionImportOfPayments(), true);
	}
	
	@Test(priority=210)
	public void checkPaymentsImported() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkPaymentsImported(), true);
	}
	
	@Test(priority=211)
	public void checkTransactionImportOfReceipts() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkTransactionImportOfReceipts(), true);
	}
	
	@Test(priority=212)
	public void checkReceiptsImported() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkReceiptsImported(), true);
	}
	
	@Test(priority=213)
	public void checkTransactionImportOfSalesInvoices() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkTransactionImportOfSalesInvoices(), true);
	}
	
	@Test(priority=214)
	public void checkSalesInvoicesImported() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkSalesInvoicesImported(), true);
	}
	
	@Test(priority=215)
	public void checkImportExcessessInStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkImportExcessessInStocks(), true);
	}
	
	@Test(priority=216)
	public void checkImportedExcessInStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkImportedExcessInStocks(), true);
	}
	
	@Test(priority=217)
	public void checkImportSalesInvoicesWithSpecialChars() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkImportSalesInvoicesWithSpecialChars(), true);
	}
	
	@Test(priority=218)
	public void checkImportedSalesInvoicesWithSpclChars() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkImportedSalesInvoicesWithSpclChars(), true);
	}
	
	@Test(priority=219)
	public void checkTransactionImportOfOpeningStocksofAllItems() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkTransactionImportOfOpeningStocksofAllItems(), true);
	}
	
	@Test(priority=220)
	public void checkImportedOpeningStocksofAllItems() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkImportedOpeningStocksofAllItems(), true);
	}
	
	@Test(priority=221)
	public void checkTransactionImportOfOpeningStocksNewofAllItems() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkTransactionImportOfOpeningStocksNewofAllItems(), true);
	}
	
	@Test(priority=222)
	public void checkImportedOpeningStocksNewofAllItems() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkImportedOpeningStocksNewofAllItems(), true);
	}
	
	@Test(priority=223)
	public void checkTransactionImportOfPurchasesVouchers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkTransactionImportOfPurchasesVouchers(), true);
	}
	
	@Test(priority=224)
	public void checkImportedPurchasesVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkImportedPurchasesVoucher(), true);
	}
	
	
	@Test(priority=225)
	public void checkTransactionImportOfPurchasesVouchersN() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkTransactionImportOfPurchasesVouchersN(), true);
	}
	
	@Test(priority=226)
	public void checkImportedPurchasesVoucherN() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkImportedPurchasesVoucherN(), true);
	}
	
	@Test(priority=227)
	public void checkTransactionImportOfMaterialReceiptsNotes() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkTransactionImportOfMaterialReceiptsNotes(), true);
	}
	
	@Test(priority=228)
	public void checkImportedMaterialReceiptsNotes() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkImportedMaterialReceiptsNotes(), true);
	}
	
	
	
	@Test(priority=229)
	public void checkImportRMAWithSpaceBeforeRmaNumberOdOpeningStockV() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkImportRMAWithSpaceBeforeRmaNumberOdOpeningStockV(), true);
	}
	
	@Test(priority=230)
	public void checkImportedOpeningStocksNewVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkImportedOpeningStocksNewVoucher(), true);
	}
	
	
	@Test(priority=231)
	public void checkImportRMAWithoutGivingRmaNumberOpeningStockV() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkImportRMAWithoutGivingRmaNumberOpeningStockV(), true);
	}
	
	//@Test(priority=232)
	public void checkImportedOpeningStocksNewVoucher2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkImportedOpeningStocksNewVoucher2(), true);
	}
	
	@Test(priority=233)
	public void checkImportRMAWithSpclCharRmaNumberOpeningStockV() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkImportRMAWithSpclCharRmaNumberOpeningStockV(), true);
	}
	
	@Test(priority=234)
	public void checkImportedOpeningStocksNewVoucher3() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkImportedOpeningStocksNewVoucher3(), true);
	}
	

	@Test(priority=235)
	public void checkWhetherIncludePendingSalesOrdersValueChckbxAndCreditLimitInOrdersEnabled() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkWhetherIncludePendingSalesOrdersValueChckbxAndCreditLimitInOrdersEnabled(), true);
	}
	
	@Test(priority=236)
	public void checkCreateAnAccountWithSomeCreditLimit() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkCreateAnAccountWithSomeCreditLimit(), true);
	}
	
	@Test(priority=237)
	public void checkCreateOpeningStockVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkCreateOpeningStockVoucher(), true);
	}
	
	
	@Test(priority=238)
	public void checkCreateSalesOrderVoucherWithCreditLimitAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkCreateSalesOrderVoucherWithCreditLimitAccount(), true);
	}
	
	
	@Test(priority=239)
	public void checkRaiseSalesInvoiceVoucherWithCosumingSalesOrderLink() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkRaiseSalesInvoiceVoucherWithCosumingSalesOrderLink(), true);
	}
	
	
	@Test(priority=240)
	public void checkSaveAnotherSalesInvoiceVoucherWithSameAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkSaveAnotherSalesInvoiceVoucherWithSameAccount(), true);
	}
	
	
	
	@Test(priority=241)
	public void checkStopCreditLimitWarning() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkStopCreditLimitWarning(), true);
	}
	
	
	@Test(priority=242)
	public void checkTrySavingSalesInvoiceVatWithSameCreditLimitAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkTrySavingSalesInvoiceVatWithSameCreditLimitAccount(), true);
	}
	

	@Test(priority=243)
	public void checkSaveAccountMasterWithCreditLimitForAutoCloseOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkSaveAccountMasterWithCreditLimitForAutoCloseOption(), true);
	}
	
	@Test(priority=244)
	public void checkDefineAndSaveAutoCloseOptionInDesignWorkFlow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkDefineAndSaveAutoCloseOptionInDesignWorkFlow(), true);
	}
	
	
	@Test(priority=245)
	public void checkSaveSalesOrderVoucherWithPreviousWeekDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkSaveSalesOrderVoucherWithPreviousWeekDate(), true);
	}
	
	
	@Test(priority=246)
	public void checkSaveSalesOrderVoucherAgainWithInAutoCloseDay5() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkSaveSalesOrderVoucherAgainWithInAutoCloseDay5(), true);
	}
	
	@Test(priority=247)
	public void checkSaveSalesOrderVoucherWithTheCurrentDateToCheckAutoCloseExpiredOrNot() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		tip=new TransactionImportPage(getDriver());
		Assert.assertEquals(tip.checkSaveSalesOrderVoucherWithTheCurrentDateToCheckAutoCloseExpiredOrNot(), true);
	}
	
	
	
	

	@Test(priority=250)
	public void checklogoutAccountPropertiesPage1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		app=new AccountPropertiesPage(getDriver());
		Assert.assertEquals(app.checklogoutAccountPropertiesPage(), true);
	}
	
}
