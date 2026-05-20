package com.focus.Pages;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.focus.base.BaseEngine;

public class FocusFinancialsVoucherEntryToCheckRestrictionsPage extends BaseEngine
{
	
	public static boolean checkPurchasesVoucherForAllTheMastersListInMastersDropdownAndSaveVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();

		Thread.sleep(1800);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucher));
		purchaseVoucher.click();
		Thread.sleep(1800);

		getAction().moveToElement(newBtn).build().perform();
		Thread.sleep(1200);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		checkValidationMessage("Screen opened");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();

		purchaseAccountTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(1800);

		String expPurchaseList = "[A1, A2, B1, B2, PurchaseACC]";
		boolean actPurchaseList = ListComparisionWOOrder(purchaseAccountList,expPurchaseList); 
		Thread.sleep(1200);
		purchaseAccountTxt.sendKeys("PurchaseACC");	
		Thread.sleep(1000);
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(1200);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();

		vendorAccountTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(1500);

		String expvendorList = "[BankACC, CashACC, D1, D2, VendorACC]";
		boolean actvendorList = ListComparisionWOOrder(vendorAccountList,expvendorList); 
		
		Thread.sleep(1200);
		vendorAccountTxt.sendKeys("VendorACC");	
		Thread.sleep(1000);
		vendorAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
		warehouseTxt.click();

		warehouseTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(1500);

		String expwarehouseList = "[A1, A2, B1, B2, D1, D2, HYD]";
		boolean actwarehouseList = ListComparisionWOOrder(warehouseList,expwarehouseList); 
		
		Thread.sleep(1200);
		warehouseTxt.sendKeys("HYD");	
		Thread.sleep(1000);
		warehouseTxt.sendKeys(Keys.TAB);

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();

		departmentTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(1500);
		
		String expdepartmentList = "[A1, A2, B1, B2, D1, D2, INV]";
		boolean actdepartmentList = ListComparisionWOOrder(departmentList,expdepartmentList); 

		
		Thread.sleep(1200);
		departmentTxt.sendKeys("INV");	
		Thread.sleep(1000);
		departmentTxt.sendKeys(Keys.TAB);
		
		branchTxt.sendKeys(Keys.BACK_SPACE);
		
		Thread.sleep(1500);

		
		String expbranchList = "[BR-HYD]";
		boolean actbranchList = ListComparisionWOOrder(branchListInPurchases,expbranchList); 

		System.out.println("actbranchList"+actbranchList);
		System.out.println("expbranchList"+expbranchList);
		
		Thread.sleep(1200);
		branchTxt.sendKeys("BR-HYD");	
		Thread.sleep(1000);
		branchTxt.sendKeys(Keys.TAB);
		
		branchTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.END);
		enter_ItemTxt.sendKeys(Keys.SPACE,Keys.HOME);

		Thread.sleep(1500);
		
		String expitemList = "[A1, A2, APPLE, B1, B2, D1, D2]";
		boolean actitemList = ListComparisionWOOrder(itemList,expitemList); 
		

		System.out.println("actitemList"+actitemList);
		System.out.println("expitemList"+expitemList);
		
		enter_ItemTxt.sendKeys("APPLE");
		Thread.sleep(1000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(1200);
		enter_Quantity.sendKeys("10");
		Thread.sleep(1000);
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(1200);
		enter_Rate.sendKeys("10");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);
		
		Thread.sleep(1000);
		
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(1000);
		
		pv_enter_discount.sendKeys(Keys.TAB);
		
		enter_Batch.sendKeys("App");
		
		enter_Batch.sendKeys(Keys.TAB);
		
		voucherSaveBtn.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		System.out.println("*********************************************************************************************************");

		String expMessage1 = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage1);

		if(actPurchaseList&& actvendorList
				&& actwarehouseList&& actdepartmentList
				&& actbranchList && actitemList && actMessage.startsWith(expMessage1))
		{
			return true;
		}
		else
		{
			return false;
		}	
			
	}
	
	
	public static boolean checkSalesInvoiceForAllTheMastersListInMastersDropdownAndSaveVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();
		Thread.sleep(2500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesBtn));
		salesInvoicesBtn.click();
		
		Thread.sleep(2500);
		
		getAction().moveToElement(newBtn).build().perform();
		Thread.sleep(2500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkValidationMessage("Screen opened");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SalesAccountTxt));
		SalesAccountTxt.click();

		SalesAccountTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(1600);

		String expSalesList = "[E1, E2, F1, F2, SalesACC]";
		boolean actSalesList =  ListComparisionWOOrder(SalesAccountList,expSalesList);
		
		Thread.sleep(1000);
		SalesAccountTxt.sendKeys("SalesACC");
		Thread.sleep(1000);
		SalesAccountTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustomerAccountTxt));
		CustomerAccountTxt.click();

		CustomerAccountTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(1600);

		String expCustomerList = "[BankACC, CashACC, CustomerACC, H1, H2]";
		boolean actCustomerList =  ListComparisionWOOrder(CustomerAccountList,expCustomerList);

		System.out.println("actCustomerList"+actCustomerList);
		System.out.println("expCustomerList"+expCustomerList);
		
		Thread.sleep(1000);
		CustomerAccountTxt.sendKeys("CustomerACC");
		Thread.sleep(1000);
		CustomerAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
		warehouseTxt.click();

		warehouseTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(1600);

		String expwarehouseList = "[A1, A2, B1, B2, D1, D2, HYD]";
		boolean actwarehouseList =  ListComparisionWOOrder(SwarehouseList,expwarehouseList);

		System.out.println("actwarehouseList"+actwarehouseList);
		System.out.println("expwarehouseList"+expwarehouseList);
		
		Thread.sleep(1000);
		warehouseTxt.sendKeys("HYD");
		Thread.sleep(1000);
		warehouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();

		departmentTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(1600);

		String expdepartmentList = "[A1, A2, B1, B2, D1, D2, INV]";
		boolean actdepartmentList =  ListComparisionWOOrder(SDepartmentList,expdepartmentList);

		System.out.println("actdepartmentList"+actdepartmentList);
		System.out.println("expdepartmentList"+expdepartmentList);
		
		Thread.sleep(1000);
		departmentTxt.sendKeys("INV");
		Thread.sleep(1000);
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.END);
		enter_ItemTxt.sendKeys(Keys.SPACE,Keys.HOME);

		Thread.sleep(1600);
		
		String expitemList = "[A1, A2, APPLE, B1, B2, D1, D2]";
		boolean actitemList = ListComparisionWOOrder(itemList,expitemList);

		System.out.println("actitemList"+actitemList);
		System.out.println("expitemList"+expitemList);
		
		Thread.sleep(1000);
		enter_ItemTxt.sendKeys("APPLE");
		Thread.sleep(1000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(1200);
		enter_Quantity.sendKeys("10");
		Thread.sleep(1000);
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(1200);
		enter_Rate.sendKeys("10");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);
		
		Thread.sleep(1000);
		
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(1000);
		
		enter_discount.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFifoBtn));
		batchPickOnFifoBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchOkBtn));
		batchOkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));	
		voucherSaveBtn.click();
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
		pickBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		System.out.println("*********************************************************************************************************");

		String expMessage1 = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage1);

		if (actSalesList&& actCustomerList
				&& actwarehouseList&& actdepartmentList
				&& actitemList && actMessage.startsWith(expMessage1))
		{
			return true;
		} 
		else
		{	
			return false;
		}
		
	}
	
	public static boolean checkMastersListInPaymentsAndSaveVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		Thread.sleep(2500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		Thread.sleep(2500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(paymentsVoucher));
		paymentsVoucher.click();

		Thread.sleep(2500);
		
		getAction().moveToElement(newBtn).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		checkValidationMessage("Screen opened");

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CBAccountTxt));
		CBAccountTxt.click();

		CBAccountTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(1800);
		
		String expCBAList = "[BankACC, CashACC]";
		boolean actCBAList = ListComparisionWOOrder(CBAccountList,expCBAList);

		System.out.println("actCBAList"+actCBAList);
		System.out.println("expCBAList"+expCBAList);
		Thread.sleep(1000);
		
		CBAccountTxt.sendKeys("BankACC");
		Thread.sleep(1000);
		CBAccountTxt.sendKeys(Keys.TAB);

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();

		departmentTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(1500);
		
		String expdepartmentList = "[A1, A2, B1, B2, D1, D2, INV]";
		boolean actdepartmentList = ListComparisionWOOrder(SDepartmentList,expdepartmentList);

		System.out.println("actdepartmentList"+actdepartmentList);
		System.out.println("expdepartmentList"+expdepartmentList);
		
		Thread.sleep(1000);
		
		departmentTxt.sendKeys("INV");
		Thread.sleep(1000);
		departmentTxt.sendKeys(Keys.TAB);

		Thread.sleep(2500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
		enter_AccountTxt.sendKeys(Keys.END);
		enter_AccountTxt.sendKeys(Keys.SPACE,Keys.HOME);

		Thread.sleep(1800);
		
		String expAccountList = "[A1, A2, B1, B2, BankACC, CashACC, CustomerACC, D1, D2, E1, E2, F1, F2, H1, H2, Opening Balances Control A/C, PurchaseACC, SalesACC, VendorACC]";
		boolean actAccountList = ListComparisionWOOrder(PAccountList,expAccountList);
		
		System.out.println("actAccountList"+actAccountList);
		System.out.println("expAccountList"+expAccountList);
		
		Thread.sleep(1000);
		
		enter_AccountTxt.sendKeys("CustomerACC");
		Thread.sleep(1000);
		enter_AccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(1000);
		enter_AmountTxt.sendKeys("50");
		
		Thread.sleep(1000);
		enter_AmountTxt.sendKeys(Keys.TAB);
		
	
		
		/*Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
		pickBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		*/

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));	
		voucherSaveBtn.click();


		System.out.println("*********************************************************************************************************");

		String expMessage1 = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage1);

		if (actCBAList && actdepartmentList
				&& actAccountList && actMessage.startsWith(expMessage1))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static boolean checkMasterInReceiptsAndSaveVoucher() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		Thread.sleep(2500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsVchr));
		receiptsVchr.click();

		Thread.sleep(1800);

		getAction().moveToElement(newBtn).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		checkValidationMessage("Screen opened");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CBAccountTxt));
		CBAccountTxt.click();

		CBAccountTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(1800);

		ArrayList<String>  actCBAccountList = new ArrayList<String>(); 

		int count=CBAccountList.size();

		System.err.println(count);

		for(int i=0 ; i < count ;i++)
		{
			String data=CBAccountList.get(i).getText();
			actCBAccountList.add(data);

		}

		String actCBAList = actCBAccountList.toString();
		String expCBAList = "[BankACC, CashACC]";

		System.out.println("actCBAList"+actCBAList);
		System.out.println("expCBAList"+expCBAList);
		Thread.sleep(1000);
		
		CBAccountTxt.sendKeys("BankACC");
		Thread.sleep(1000);
		CBAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();

		departmentTxt.sendKeys(Keys.SPACE);	

		Thread.sleep(1800);

		ArrayList<String>  actdepartmentAccountList = new ArrayList<String>(); 

		int Dcount=SDepartmentList.size();

		System.err.println(Dcount);

		for(int i=0 ; i < Dcount ;i++)
		{
			String data=SDepartmentList.get(i).getText();
			actdepartmentAccountList.add(data);

		}

		String actdepartmentList = actdepartmentAccountList.toString();
		String expdepartmentList = "[A1, A2, B1, B2, D1, D2, INV]";

		System.out.println("actdepartmentList"+actdepartmentList);
		System.out.println("expdepartmentList"+expdepartmentList);
		
		Thread.sleep(1000);
		
		departmentTxt.sendKeys("INV");
		Thread.sleep(1000);
		departmentTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
		enter_AccountTxt.sendKeys(Keys.END);
		enter_AccountTxt.sendKeys(Keys.SPACE,Keys.HOME);

		Thread.sleep(1800);

		ArrayList<String>  actAccountAccountList = new ArrayList<String>(); 

		int Icount=PAccountList.size();

		System.err.println(Icount);

		for(int i=0 ; i < Icount ;i++)
		{
			String data=PAccountList.get(i).getText();
			actAccountAccountList.add(data);

		}

		String actAccountList = actAccountAccountList.toString();
		String expAccountList = "[A1, A2, B1, B2, BankACC, CashACC, CustomerACC, D1, D2, E1, E2, F1, F2, H1, H2, Opening Balances Control A/C, PurchaseACC, SalesACC, VendorACC]";

		System.out.println("actAccountList"+actAccountList);
		System.out.println("expAccountList"+expAccountList);
		
		Thread.sleep(1000);
		
		enter_AccountTxt.sendKeys("SalesACC");
		Thread.sleep(1000);
		enter_AccountTxt.sendKeys(Keys.TAB);
		
		enter_AmountTxt.sendKeys("25");
		Thread.sleep(1000);
		enter_AmountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(1200);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));	
		voucherSaveBtn.click();
		
		System.out.println("*********************************************************************************************************");

		String expMessage1 = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage1);

		if (actCBAList.equalsIgnoreCase(expCBAList) && actdepartmentList.equalsIgnoreCase(expdepartmentList) 
				
				&& actAccountList.equalsIgnoreCase(expAccountList) && actMessage.startsWith(expMessage1))
		{
			return true;
		}
		else 
		{
			return false;
		}

	}
	
	
	
	
	
	
	public static boolean checkMastersListInStockTransfersMasterAndSaveVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	
	{
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsStocksMenu));
		inventoryTransactionsStocksMenu.click();

		Thread.sleep(6000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(StockTransfersVoucher));
		StockTransfersVoucher.click();
		
		Thread.sleep(1200);
		
		
		Thread.sleep(1800);

		getAction().moveToElement(newBtn).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		checkValidationMessage("Screen opened");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouse1Txt));
		warehouse1Txt.click();

		warehouse1Txt.sendKeys(Keys.SPACE);
		Thread.sleep(1800);
		
		String expList = "";
		boolean actList = ListComparisionWOOrder(ST_Warehouse1List,expList);
		
		System.out.println("actList"+actList);
		System.out.println("expList"+expList);
		Thread.sleep(1000);
		
		
		warehouse1Txt.sendKeys("Hyd");
		Thread.sleep(1000);
		warehouse1Txt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouse2Txt));
		warehouse2Txt.click();

		warehouse2Txt.sendKeys(Keys.SPACE);	

		Thread.sleep(1800);
		
		String exp2List = "";
		boolean act2List = ListComparisionWOOrder(ST_Warehouse2List,exp2List);

		System.out.println("act2List"+act2List);
		System.out.println("exp2List"+exp2List);
		Thread.sleep(1000);
		
		warehouse2Txt.sendKeys("A1");
		Thread.sleep(1000);
		warehouse2Txt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.END);
		enter_ItemTxt.sendKeys(Keys.SPACE,Keys.HOME);

		Thread.sleep(1600);
		
		String expitemList = "[A1, A2, APPLE, B1, B2, D1, D2]";
		boolean actitemList = ListComparisionWOOrder(itemList,expitemList);

		System.out.println("actitemList"+actitemList);
		System.out.println("expitemList"+expitemList);
		
		Thread.sleep(1000);
		enter_ItemTxt.sendKeys("APPLE");
		Thread.sleep(1000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(1200);
		enter_Quantity.sendKeys("2");
		Thread.sleep(1000);
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(1200);
		enter_Rate.sendKeys("10");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);
		
		Thread.sleep(1000);
		
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(1000);
		
		enter_discount.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFifoBtn));
		batchPickOnFifoBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchOkBtn));
		batchOkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));	
		voucherSaveBtn.click();
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
		pickBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		System.out.println("*********************************************************************************************************");

		String expMessage1 = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage1);

		if (actList && act2List && actitemList && actMessage.startsWith(expMessage1))
		{
			return true;
		} 
		else
		{	
			return false;
		}
		
		
		
		
		

	}
	
	
	public FocusFinancialsVoucherEntryToCheckRestrictionsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	

}
