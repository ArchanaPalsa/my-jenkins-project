package com.focus.Pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.Pages.LoginPage;
import com.focus.base.BaseEngine;
import com.focus.supporters.NotePadReader;
import com.focus.utilities.DriverUtility;

public class RMA extends BaseEngine
{
	
	
	
	public static void checkEnterRow(int i,int j)
	{
		getDriver().findElement(By.xpath("//*[@id='id_transaction_entry_detail_table_body']/tr["+i+"]/td["+j+"]")).click();

	}
	

	public static void checkPurchasesVoucherHeader(String purAcc,String VenAcc, String dept) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(3000);
		getAction().moveToElement(financialsMenu).build().perform();
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(2500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchases));
		financialsTransactionsPurchases.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersBtn));
		purchaseVouchersBtn.click();

		Thread.sleep(1800);
		getWebDriverWaitEle(newBtn);
		ClickUsingJs(newBtn);
		/*getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();*/
		
		Thread.sleep(2000);
		

		Thread.sleep(4500);
		
		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(purchasesAccTxt));
		purchasesAccTxt.click();
		purchasesAccTxt.sendKeys(purAcc);
		Thread.sleep(1500);
		purchasesAccTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(VenAcc);
		Thread.sleep(1500);
		vendorAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		Thread.sleep(1000);
		departmentTxt.sendKeys(dept);
		Thread.sleep(1500);
		departmentTxt.sendKeys(Keys.TAB);

		Thread.sleep(1000);
	}
	
	public static void checkRMAItem(int i, int j,String warehouse,String item,int q,String quantity,String rate,String rmaText) throws InterruptedException
	{

		Thread.sleep(1500);

		checkEnterRow(i,j);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(1000);
		enter_WarehouseTxt.sendKeys(warehouse);
		Thread.sleep(1500);
		enter_WarehouseTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(item);
		Thread.sleep(1500);
		enter_ItemTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		Thread.sleep(1500);
		enter_UnitTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		checkEnterRow(i,q);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys(quantity);
		Thread.sleep(1500);
		enter_Quantity.sendKeys(Keys.TAB);

		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys(rate);
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Pventer_discount));
		Pventer_discount.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		if (RMA_SerialNoTxt.isDisplayed()) 
		{
			RMA_SerialNoTxt.sendKeys(rmaText);
			Thread.sleep(1000);
			RMA_AddIcon.click();
			Thread.sleep(1000);


		}


	}

	

	
	public static void checkSalesInvoiceVATHeader(String SalesAcc, String CustAcc,String dept, String warehouse) throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		Thread.sleep(1500);
		getAction().moveToElement(homeMenu).build().perform();
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSales));
		financialsTransactionsSales.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVoucher));
		salesInvoiceVoucher.click();

		Thread.sleep(2500);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		
		Thread.sleep(2500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAccountTxt));
		salesAccountTxt.sendKeys(SalesAcc);
		Thread.sleep(1500);
		salesAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys(CustAcc);
		Thread.sleep(1500);
		customerAccountTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.END);
		departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		departmentTxt.sendKeys(Keys.SPACE);

		int departmentcount=departmentListCount.size();

		System.err.println(departmentcount);

		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();

			if(data.equalsIgnoreCase(dept))
			{
				departmentListCount.get(i).click();

				Thread.sleep(1000);

				break;
			}
		}

		departmentTxt.sendKeys(Keys.TAB);	

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(WareHouseTxtInPurchases));
		WareHouseTxtInPurchases.click();
		WareHouseTxtInPurchases.sendKeys(warehouse);
		Thread.sleep(3000);
		WareHouseTxtInPurchases.sendKeys(Keys.TAB);

		Thread.sleep(1500);
	}


	public static void checkSaveSalesInvoiceVAT(int i, int j,String item,int q,String quantity,int rt,String rate) throws InterruptedException
	{
		
		Thread.sleep(5000);
		checkEnterRow(i,j);
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(item);
		Thread.sleep(1500);
		enter_ItemTxt.sendKeys(Keys.TAB);

		Thread.sleep(1800);
		checkEnterRow(i,q);
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Sales_enter_AQTxt));
		Sales_enter_AQTxt.sendKeys(quantity);
		Thread.sleep(1000);
		Sales_enter_AQTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Sales_enter_FQTxt));
		Sales_enter_FQTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(1500);

		checkEnterRow(i,rt);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys(rate);
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SINV_enter_discount));
		SINV_enter_discount.sendKeys(Keys.TAB);

	
	}

	public static void checkSalesReturnsHeader(String CustAcc,String dept) throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		Thread.sleep(1500);
		getAction().moveToElement(homeMenu).build().perform();
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSales));
		financialsTransactionsSales.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesreturnbtn));
		salesreturnbtn.click();

		Thread.sleep(2500);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys(CustAcc);
		Thread.sleep(1500);
		customerAccountTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.END);
		departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		departmentTxt.sendKeys(Keys.SPACE);

		int departmentcount=departmentListCount.size();

		System.err.println(departmentcount);

		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();

			if(data.equalsIgnoreCase(dept))
			{
				departmentListCount.get(i).click();

				Thread.sleep(1000);

				break;
			}
		}

		departmentTxt.sendKeys(Keys.TAB);	

		
	}

	public static void checkSaveSalesReturnsVoucher(int i, int j, String warehouse,String item,int q,String quantity,int rt,String rate) throws InterruptedException
	{
		checkEnterRow(i,j);
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.click();
		enter_WarehouseTxt.sendKeys(Keys.SPACE);
		enter_WarehouseTxt.sendKeys(warehouse);
		Thread.sleep(1200);
		enter_WarehouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(item);
		Thread.sleep(1500);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(1800);
		enter_SalesAccountTxt.sendKeys(Keys.TAB);

		Thread.sleep(1800);
		checkEnterRow(i,q);
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys(quantity);
		
		Thread.sleep(1500);

		checkEnterRow(i,rt);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys(rate);
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_discount));
		enter_discount.sendKeys(Keys.TAB);

	
	}


	public static boolean checkSaveOpeningStocksVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		ClickUsingJs(inventoryMenu);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorystocks));
		inventorystocks.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryopeningstocks));
		inventoryopeningstocks.click();

		Thread.sleep(2000);
		
		getWebDriverWaitEle(newBtn);
		ClickUsingJs(newBtn);
		/*getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();*/
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.click();

		enter_WarehouseTxt.sendKeys(Keys.SPACE);

		enter_WarehouseTxt.sendKeys("HYDERABAD");

		Thread.sleep(2000);

		int warehousecount=warehouseBodyComboList.size();

		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=warehouseBodyComboList.get(i).getText();

			if (data.equalsIgnoreCase("HYDERABAD")) 
			{
				warehouseBodyComboList.get(i).click();
				break;
			}
		}

		enter_WarehouseTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.click();
		enter_ItemTxt.sendKeys(Keys.SPACE);

		enter_ItemTxt.sendKeys("WA COGS ITEM");

		Thread.sleep(2000);

		int pvvGridItemListCount=pvvGridItemList.size();
		for (int i = 0; i < pvvGridItemListCount; i++) 
		{
			String Item=pvvGridItemList.get(i).getText();
			if (Item.equalsIgnoreCase("WA COGS ITEM")) 
			{
				pvvGridItemList.get(i).click();
				break;
			}
		}
		enter_ItemTxt.sendKeys(Keys.TAB);	

	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
		select1stRow_4thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.click();
		enter_Quantity.clear();
		enter_Quantity.sendKeys("1");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);

		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		rmaSerialNumberTxtField.sendKeys("1022");
		rmaSerialNumberTxtField.sendKeys(Keys.ENTER);
		
		
		getAction().moveToElement(rmaOkBtn).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		ClickUsingJs(rmaOkBtn);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);


		if (actMessage.startsWith(expMessage)) 
		{

			return true;
		}
		else 
		{

			return false;
		}
	}
	
	public static boolean checkSaveSalesInvoicesVoucherWithSavedRmaInOS() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		checkSalesInvoiceVATHeader("Sales - Computers", "Customer C", "DUBAI", "HYDERABAD");
		
		checkSaveSalesInvoiceVAT(1,2,"WA COGS ITEM",5, "1",12,"5");
		
		Thread.sleep(1500);
		ArrayList<String> rmaList = new ArrayList<String>();

		if (RMAPopupHeader.isDisplayed()) 
		{
			RMA_SearchSavedrma.click();
			Thread.sleep(2500);
			int rmaCount = RMA_SavedRMAList.size();
			System.err.println("rmaCount"+rmaCount);

			Thread.sleep(1500);
			for(int r=0; r<rmaCount; r++)
			{
				String data = RMA_SavedRMAList.get(r).getText();
				rmaList.add(data);
				
				System.out.println("rmaList"+rmaList);
				
				if(data.contains("1022"))
				{
					RMA_SavedRMAcheckbxList.get(r).click();
					break;
				}
				
				

			}


		}

		String actlist = rmaList.toString();
		String expList = "[1022]";

		System.out.println("actlist: "+actlist);
		System.out.println("expList: "+expList);
		
		Thread.sleep(1000);
		RMA_OKBtn.click();

		Thread.sleep(1500);
		ArrayList<String> SelectedrmaList = new ArrayList<String>();

		int rma = RMA_CheckedRMAList.size();

		for(int r=0; r<rma; r++)
		{
			String data = RMA_CheckedRMAList.get(r).getText();
			SelectedrmaList.add(data);

		}



		String actSlist = SelectedrmaList.toString();
		String expSList = "[1022]";


		System.out.println("actSlist: "+actSlist);
		System.out.println("expSList: "+expSList);

		Thread.sleep(1000);
		RMA_OKBtn2.click();
		
		enter_Rma.sendKeys(Keys.TAB);
		

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(6000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();


		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);


		if(actlist.equalsIgnoreCase(expList) && actSlist.equalsIgnoreCase(expSList) && actMessage.startsWith(expMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public static boolean checkSaveSalesReturnsVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		checkSalesReturnsHeader("Customer C", "DUBAI");
		checkSaveSalesReturnsVoucher(1,2,"HYDERABAD", "WA COGS ITEM", 6 ,"1", 8, "5");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RMA_SerialNoTxt));
		RMA_SerialNoTxt.sendKeys("1022");
		Thread.sleep(1000);
		RMA_AddIcon.click();
		Thread.sleep(2000);
		RMA_OkBtn.click();
		Thread.sleep(2000);
		enter_Rma.sendKeys(Keys.TAB);
		

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();


		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);


		if(actMessage.startsWith(expMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static boolean checkEnableRMAOptionAsRMANumbersAreAlwaysNumericOption() throws InterruptedException
	{
		Thread.sleep(2000);
		
		getAction().moveToElement(settingsmenuBtn).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		//ClickUsingJs(settingsmenuBtn);
		ClickUsingJs(settingsmenuBtn);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PreferencesBtn));
		PreferencesBtn.click();

		Thread.sleep(5000);
		
		ClickUsingJs(RMABtn);
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RMABtn));
		//RMABtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RMANumberAlwaysnumericChcBx));
		RMANumberAlwaysnumericChcBx.click();
		
		getWebDriverWaitEle(UpdateBtn);
		ClickUsingJs(UpdateBtn);
	

		getWaitForAlert();
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  ="Do you want to save the changes?";
		getAlert().accept();

		Thread.sleep(5000);

		if (actAlertMgs.equalsIgnoreCase(expAlertMgs))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}

	public static boolean checkSaveOpeningStockVoucherWithRMACopiedFromNotePad() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		ClickUsingJs(inventoryMenu);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorystocks));
		inventorystocks.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryopeningstocks));
		inventoryopeningstocks.click();

		Thread.sleep(2000);
		
		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.click();

		enter_WarehouseTxt.sendKeys(Keys.SPACE);

		enter_WarehouseTxt.sendKeys("HYDERABAD");

		Thread.sleep(2000);

		int warehousecount=warehouseBodyComboList.size();

		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=warehouseBodyComboList.get(i).getText();

			if (data.equalsIgnoreCase("HYDERABAD")) 
			{
				warehouseBodyComboList.get(i).click();
				break;
			}
		}

		enter_WarehouseTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.click();
		enter_ItemTxt.sendKeys(Keys.SPACE);

		enter_ItemTxt.sendKeys("WA COGS ITEM");

		Thread.sleep(2000);

		int pvvGridItemListCount=pvvGridItemList.size();
		for (int i = 0; i < pvvGridItemListCount; i++) 
		{
			String Item=pvvGridItemList.get(i).getText();
			if (Item.equalsIgnoreCase("WA COGS ITEM")) 
			{
				pvvGridItemList.get(i).click();
				break;
			}
		}
		enter_ItemTxt.sendKeys(Keys.TAB);	

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
		select1stRow_4thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.click();
		enter_Quantity.clear();
		enter_Quantity.sendKeys("3");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);

		 NotePadReader p = new NotePadReader();
		 String RmaTxt1 = p.getNumbNotePadTxt();
		 System.err.println("RmaTxt1:"+RmaTxt1);

		// getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		 rmaSerialNumberTxtField.sendKeys(RmaTxt1);

		 Thread.sleep(1200);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
		 rmaAddBtn.click();

		 Thread.sleep(2000);
		 int countRMA=RMA_CheckedRMAList.size();
			
		 ArrayList<String >users=new ArrayList<String>();
		 
		 for (int i = 0; i < countRMA; i++) 
		 {
			String data=RMA_CheckedRMAList.get(i).getText();
			users.add(data);
		}
		 
		 String actRMAList=users.toString();
		 String expRMAList= "[457812, 547891, 362547]";
		 
		 System.out.println(" ACt List Displayed Users  : "+actRMAList);
		 System.out.println(" Exp List Displayed Users  : "+expRMAList);
	
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		 rmaOkBtn.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();
		 
		 String expMessage = "Voucher saved successfully";
		
		 String actMessage = checkValidationMessage(expMessage);
		
		 if (actRMAList.equalsIgnoreCase(expRMAList) && actMessage.startsWith(expMessage)) 
		 {
			
			 return true;
		 }
		 else 
		 {
			
			 return false;
		 }

	
	}
	
	public static boolean checkSavePurchasesVoucherwithRma() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		checkPurchasesVoucherHeader("Purchase","Vendor B","DUBAI");

		checkRMAItem(1,2,"HYDERABAD","WA COGS ITEM",6,"1","10","TS63");


		Thread.sleep(2500);
		int RMACOUNT = RMA_AddedList.size();
		ArrayList<String> rmaList = new ArrayList<String>();
		for(int i=0;i<RMACOUNT;i++)
		{

			String data = RMA_AddedList.get(i).getText();
			Thread.sleep(1000);
			rmaList.add(data);
		}


		String actRow1List = rmaList.toString();
		String expRow1List = "[TS63]";

		System.out.println("actRow1List: "+actRow1List);
		System.out.println("expRow1List: "+expRow1List);

		RMA_OkBtn.click();
		
		Thread.sleep(3500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(2500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		Thread.sleep(1500);

		String expSavingMessage1 = "Voucher saved successfully";

		String actSavingMessage = checkValidationMessage(expSavingMessage1);

		if(actSavingMessage.startsWith(expSavingMessage1))
		{
			return true;
		}
		else
		{
			return false;
		}

	}
	
	
	public static boolean checkDisableRMAAlwaysNumericOption() throws InterruptedException
	{

		Thread.sleep(2000);
		
		getAction().moveToElement(settingsmenuBtn).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		ClickUsingJs(settingsmenuBtn);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(PreferencesBtn));
		PreferencesBtn.click();

		Thread.sleep(5000);
		
		ClickUsingJs(RMABtn);
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RMABtn));
		//RMABtn.click();

		//Thread.sleep(5000);

		if(RMANumberAlwaysnumericChcBx.isSelected())
		{
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RMANumberAlwaysnumericChcBx));
			RMANumberAlwaysnumericChcBx.click();
		}
		
		
		getWebDriverWaitEle(UpdateBtn);
		ClickUsingJs(UpdateBtn);
	

		getWaitForAlert();
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  ="Do you want to save the changes?";
		getAlert().accept();

		Thread.sleep(5000);

		if (actAlertMgs.equalsIgnoreCase(expAlertMgs))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
	}
	public static boolean checkSavePurchasesRetunsForTheAboveSavedRma() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(3000);
		getAction().moveToElement(financialsMenu).build().perform();
		Thread.sleep(1500);
		ClickUsingJs(financialsMenu);

		Thread.sleep(2500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchases));
		financialsTransactionsPurchases.click();

		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFinTransPurPurchasesReturns));
		addFinTransPurPurchasesReturns.click();
		Thread.sleep(2500);

		getWebDriverWaitEle(newBtn);
		ClickUsingJs(newBtn);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys("Vendor B");
		Thread.sleep(1500);
		vendorAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		Thread.sleep(1000);
		departmentTxt.sendKeys("DUBAI");
		Thread.sleep(1500);
		departmentTxt.sendKeys(Keys.TAB);

		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.click();

		enter_WarehouseTxt.sendKeys(Keys.SPACE);

		enter_WarehouseTxt.sendKeys("HYDERABAD");

		Thread.sleep(2000);

		int warehousecount=warehouseBodyComboList.size();

		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=warehouseBodyComboList.get(i).getText();

			if (data.equalsIgnoreCase("HYDERABAD")) 
			{
				warehouseBodyComboList.get(i).click();
				break;
			}
		}

		enter_WarehouseTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.click();
		enter_ItemTxt.sendKeys(Keys.SPACE);

		enter_ItemTxt.sendKeys("WA COGS ITEM");

		Thread.sleep(2000);

		int pvvGridItemListCount=pvvGridItemList.size();
		for (int i = 0; i < pvvGridItemListCount; i++) 
		{
			String Item=pvvGridItemList.get(i).getText();
			if (Item.equalsIgnoreCase("WA COGS ITEM")) 
			{
				pvvGridItemList.get(i).click();
				break;
			}
		}
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		Thread.sleep(1000);
		enter_PurchaseAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
		select1stRow_4thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.click();
		enter_UnitTxt.sendKeys(Keys.TAB);
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
		select1stRow_7thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.click();
		enter_Quantity.clear();
		enter_Quantity.sendKeys("1");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_10thColumn));
		select1stRow_10thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys("5");
		enter_Rate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvou_enter_discount));
		pvou_enter_discount.click();
		pvou_enter_discount.sendKeys(Keys.TAB);

		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		rmaSerialNumberTxtField.sendKeys("TS63");
		rmaSerialNumberTxtField.sendKeys(Keys.ENTER);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		rmaOkBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(2500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		Thread.sleep(1500);

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);


		if (actMessage.startsWith(expMessage)) 
		{

			return true;
		}
		else 
		{

			return false;
		}
		
	}
	
	public static boolean checkEditPurchasesVoucherAndAddReturnedItemAgain() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(3000);
		getAction().moveToElement(financialsMenu).build().perform();
		Thread.sleep(1500);
		ClickUsingJs(financialsMenu);

		Thread.sleep(2500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchases));
		financialsTransactionsPurchases.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersBtn));
		purchaseVouchersBtn.click();
		
		Thread.sleep(5000);

		int count = grid_AccountList.size();

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_AccountList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase("1")) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					grid_CheckBoxList.get(i).click();
					editBtn.click();
					break;
				}
			}
		} 
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
		select2ndRow_1stColumn.click();
		Thread.sleep(1000);
		enter_WarehouseTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		enter_WarehouseTxt.sendKeys("HYDERABAD");

		Thread.sleep(2000);
		enter_WarehouseTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.click();
		enter_ItemTxt.sendKeys(Keys.SPACE);

		enter_ItemTxt.sendKeys("WA COGS ITEM");

		Thread.sleep(2000);

		int pvvGridItemListCount=pvvGridItemList.size();
		for (int i = 0; i < pvvGridItemListCount; i++) 
		{
			String Item=pvvGridItemList.get(i).getText();
			if (Item.equalsIgnoreCase("WA COGS ITEM")) 
			{
				pvvGridItemList.get(i).click();
				break;
			}
		}
		enter_ItemTxt.sendKeys(Keys.TAB);	

		Thread.sleep(1500);
		enter_UnitTxt.sendKeys(Keys.TAB);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_5thColumn));
		select2ndRow_5thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		Thread.sleep(1500);
		enter_Quantity.sendKeys(Keys.TAB);

		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("5");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Pventer_discount));
		Pventer_discount.sendKeys(Keys.TAB);

		Thread.sleep(1500);
		
		if (RMA_SerialNoTxt.isDisplayed()) 
		{
			RMA_SerialNoTxt.sendKeys("TS63");
			Thread.sleep(1000);
			RMA_AddIcon.click();
			Thread.sleep(1000);


		}
		
		String actAlertTxt = "";
		String expAlertTxt = "";
		
		try
		{
			getIsAlertPresent();
			actAlertTxt = getAlert().getText();
			expAlertTxt = "RMA Number Series Already Exist.";
			getAlert().accept();
			System.err.println("Issue existed even now");
			return false;
			
		}
		catch (Exception e) 
		{
			Thread.sleep(2500);
			int RMACOUNT = RMA_AddedList.size();
			ArrayList<String> rmaList = new ArrayList<String>();
			for(int i=0;i<RMACOUNT;i++)
			{

				String data = RMA_AddedList.get(i).getText();
				Thread.sleep(1000);
				rmaList.add(data);
			}


			String actRow1List = rmaList.toString();
			String expRow1List = "[TS63]";

			System.out.println("actRow1List: "+actRow1List);
			System.out.println("expRow1List: "+expRow1List);

			RMA_OkBtn.click();
			
			Thread.sleep(1500);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
			voucherSaveBtn.click();

			Thread.sleep(2500);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
			newReferenceTxt.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();

			Thread.sleep(1500);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();

			Thread.sleep(1500);

			String expSavingMessage1 = "Voucher saved successfully";

			String actSavingMessage = checkValidationMessage(expSavingMessage1);

			if(actSavingMessage.startsWith(expSavingMessage1))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	
	}
	
	
	
	public static boolean checkSaveExcessInStocksVoucherWithRma() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(3000);
		getDriver().navigate().refresh();
		
		Thread.sleep(5000);
		
		getAction().moveToElement(inventoryMenu).build().perform();
		
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		ClickUsingJs(inventoryMenu);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsStocksMenu));
		inventoryTransactionsStocksMenu.click();

		Thread.sleep(6000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(excessesInStocksVoucher));
		excessesInStocksVoucher.click();

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();

		Thread.sleep(6000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.click();
		enter_WarehouseTxt.sendKeys("HYDERABAD");
		Thread.sleep(1000);
		enter_WarehouseTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.click();
		enter_ItemTxt.sendKeys("WA COGS ITEM");
		Thread.sleep(1000);
		enter_ItemTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
		select1stRow_4thColumn.click();

		Thread.sleep(6000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.click();
		enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		enter_Quantity.sendKeys("1");
		Thread.sleep(1000);
		//enter_Quantity.sendKeys(Keys.TAB);

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_6thColumn));
		select1stRow_6thColumn.click();
		Thread.sleep(1000);
		enter_Rate.sendKeys("10");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);
		Thread.sleep(1300);
		enter_Gross.sendKeys(Keys.TAB);

		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		rmaSerialNumberTxtField.sendKeys("focus1");
		Thread.sleep(1000);
		//rmaSerialNumberTxtField.sendKeys(Keys.TAB);
		
		Thread.sleep(4000);

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
		ClickUsingJs(rmaAddBtn);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		rmaOkBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(2000);

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);


		if (actMessage.startsWith(expMessage)) 
		{

			return true;
		}
		else 
		{

			return false;
		}

	
	}
	
	public static boolean checkSaveShortagesInStockVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		Thread.sleep(3000);
		getAction().moveToElement(inventoryMenu).build().perform();
		
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		ClickUsingJs(inventoryMenu);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsStocksMenu));
		inventoryTransactionsStocksMenu.click();

		Thread.sleep(6000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(shortageInStocksMenu));
		shortageInStocksMenu.click();

		Thread.sleep(2500);
		getWebDriverWaitEle(newBtn);
		Thread.sleep(1200);
		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();

		Thread.sleep(6000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.click();
		enter_WarehouseTxt.sendKeys("HYDERABAD");
		Thread.sleep(1000);
		enter_WarehouseTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.click();
		enter_ItemTxt.sendKeys("WA COGS ITEM");
		Thread.sleep(1000);
		enter_ItemTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();

		Thread.sleep(6000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.click();
		enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		enter_Quantity.sendKeys("1");
		
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
		select1stRow_7thColumn.click();
		Thread.sleep(1000);
		enter_Rate.sendKeys("10");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);
		Thread.sleep(1300);
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(1500);
		ArrayList<String> rmaList = new ArrayList<String>();

		if (RMAPopupHeader.isDisplayed()) 
		{
			RMA_SearchSavedrma.click();
			Thread.sleep(2500);
			int rmaCount = RMA_SavedRMAList.size();

			Thread.sleep(1500);
			for(int r=0; r<rmaCount; r++)
			{
				String data = RMA_SavedRMAList.get(r).getText();
				rmaList.add(data);
				
				if(data.equalsIgnoreCase("focus1"))
				{
					RMA_SavedRMAcheckbxList.get(r).click();
					break;
				}
				
				

			}


		}

		String actlist = rmaList.toString();
		String expList = "[1022, 362547, 457812, 547891, focus1]";

		System.out.println("actlist: "+actlist);
		System.out.println("expList: "+expList);
		
		Thread.sleep(1000);
		RMA_OKBtn.click();

		Thread.sleep(1500);
		ArrayList<String> SelectedrmaList = new ArrayList<String>();

		int rma = RMA_CheckedRMAList.size();

		for(int r=0; r<rma; r++)
		{
			String data = RMA_CheckedRMAList.get(r).getText();
			SelectedrmaList.add(data);

		}



		String actSlist = SelectedrmaList.toString();
		String expSList = "[focus1]";


		System.out.println("actSlist: "+actSlist);
		System.out.println("expSList: "+expSList);

		Thread.sleep(2500);
		RMA_OKBtn2.click();
		
		Thread.sleep(2500);
		
		enter_Rma.sendKeys(Keys.TAB);
		

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(1500);
/*
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();*/


		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);


		if(actlist.equalsIgnoreCase(expList) && actSlist.equalsIgnoreCase(expSList) && actMessage.startsWith(expMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	
	}
	
	public static boolean checkEditSavedShortagesInStockVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(3000);
		getDriver().navigate().refresh();
		Thread.sleep(3500);
		
		getAction().moveToElement(inventoryMenu).build().perform();
		
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsStocksMenu));
		inventoryTransactionsStocksMenu.click();

		Thread.sleep(6000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(shortageInStocksMenu));
		shortageInStocksMenu.click();
		
		Thread.sleep(2000);

		int count = grid_AccountList.size();

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_AccountList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase("1")) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					grid_CheckBoxList.get(i).click();
					editBtn.click();
					break;
				}
			}
		} 
		
		
		Thread.sleep(2500);
		getAction().moveToElement(select1stRow_11thColumn).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
		select1stRow_11thColumn.click();
		Thread.sleep(1000);
		enter_Rma.sendKeys(Keys.SPACE);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		rmaSerialNumberTxtField.sendKeys("centra1");
		Thread.sleep(1000);
		rmaSerialNumberTxtField.sendKeys(Keys.TAB);
		
		Thread.sleep(1500);
		
		getAction().moveToElement(rmaAddBtn).build().perform();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
		ClickUsingJs(rmaAddBtn);

		Thread.sleep(2000);
		
		String actAlertTxt = getAlert().getText();
		String expAlertTxt = "Cannot Enter more than Quantity. if want to change Select from Search Option.";
		
		getAlert().accept();
		
		Thread.sleep(2500);
		RMA_OKBtn2.click();
		
		Thread.sleep(2500);
		
		if (actAlertTxt.equalsIgnoreCase(expAlertTxt)) 
		{

			return true;
		}
		else 
		{

			return false;
		}
		
		
	}
	
	public static boolean checkSaveOpeningStocksVoucherForStockTransferVouchers() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorystocks));
		inventorystocks.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryopeningstocks));
		inventoryopeningstocks.click();

		Thread.sleep(2000);
		
		getWebDriverWaitEle(newBtn);
		ClickUsingJs(newBtn);
		/*getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();*/
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.click();

		enter_WarehouseTxt.sendKeys(Keys.SPACE);

		enter_WarehouseTxt.sendKeys("HYDERABAD");

		Thread.sleep(2000);

		int warehousecount=warehouseBodyComboList.size();

		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=warehouseBodyComboList.get(i).getText();

			if (data.equalsIgnoreCase("HYDERABAD")) 
			{
				warehouseBodyComboList.get(i).click();
				break;
			}
		}

		enter_WarehouseTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.click();
		enter_ItemTxt.sendKeys(Keys.SPACE);

		enter_ItemTxt.sendKeys("WA COGS ITEM");

		Thread.sleep(2000);

		int pvvGridItemListCount=pvvGridItemList.size();
		for (int i = 0; i < pvvGridItemListCount; i++) 
		{
			String Item=pvvGridItemList.get(i).getText();
			if (Item.equalsIgnoreCase("WA COGS ITEM")) 
			{
				pvvGridItemList.get(i).click();
				break;
			}
		}
		enter_ItemTxt.sendKeys(Keys.TAB);	

	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
		select1stRow_4thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.click();
		enter_Quantity.clear();
		enter_Quantity.sendKeys("1");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys("5");
		enter_Rate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);

		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		rmaSerialNumberTxtField.sendKeys("Rma@123");
		rmaSerialNumberTxtField.sendKeys(Keys.ENTER);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		rmaOkBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);


		if (actMessage.startsWith(expMessage)) 
		{

			return true;
		}
		else 
		{

			return false;
		}
		
	}
	
	
	public static boolean checkSaveStockTransferVoucherForOpeningStocks() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(3000);
		getAction().moveToElement(inventoryMenu).build().perform();
		
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsStocksMenu));
		inventoryTransactionsStocksMenu.click();

		Thread.sleep(6000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(StockTransfersVoucher));
		StockTransfersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		getWebDriverWaitEle(newBtn);
		ClickUsingJs(newBtn);
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ST_WH1));
		ST_WH1.click();
		ST_WH1.sendKeys("HYDERABAD");
		Thread.sleep(1500);
		ST_WH1.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ST_WH2));
		ST_WH2.click();
		ST_WH2.sendKeys(Keys.SPACE);
		Thread.sleep(1500);
		ST_WH2.sendKeys("WH1");
		Thread.sleep(1500);
		ST_WH2.sendKeys(Keys.TAB);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.click();
		enter_ItemTxt.sendKeys(Keys.SPACE);

		enter_ItemTxt.sendKeys("WA COGS ITEM");

		Thread.sleep(2000);

		int pvvGridItemListCount=pvvGridItemList.size();
		for (int i = 0; i < pvvGridItemListCount; i++) 
		{
			String Item=pvvGridItemList.get(i).getText();
			if (Item.equalsIgnoreCase("WA COGS ITEM")) 
			{
				pvvGridItemList.get(i).click();
				break;
			}
		}
		enter_ItemTxt.sendKeys(Keys.TAB);	

	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
		select1stRow_4thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.click();
		enter_Quantity.clear();
		enter_Quantity.sendKeys("1");

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_6thColumn));
		select1stRow_6thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys("5");
		enter_Rate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);

		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		rmaSerialNumberTxtField.sendKeys("Rma@123");
		rmaSerialNumberTxtField.sendKeys(Keys.ENTER);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		rmaOkBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);


		if (actMessage.startsWith(expMessage)) 
		{

			return true;
		}
		else 
		{

			return false;
		}
		
	}
	
	
	public static boolean checkDeleteStockTransfersVoucher() throws InterruptedException
	{

		Thread.sleep(3000);
		getAction().moveToElement(inventoryMenu).build().perform();
		
		
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		ClickUsingJs(inventoryMenu);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsStocksMenu));
		inventoryTransactionsStocksMenu.click();

		Thread.sleep(6000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(StockTransfersVoucher));
		StockTransfersVoucher.click();
		
		Thread.sleep(2000);

		int count = grid_AccountList.size();

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_AccountList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase("1")) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					grid_CheckBoxList.get(i).click();
					Thread.sleep(2000);
					Voucher_deleteBtn.click();
					break;
				}
			}
		} 
		
		
		getWaitForAlert();
		
		String actAlertTxt = getAlert().getText();
		String expAlertTxt = "Are you sure that you want to delete the Selected Voucher?";
		
		
		getAlert().accept();
		
		
		if (actAlertTxt.equalsIgnoreCase(expAlertTxt)) 
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	
	
	public static boolean checkSavePurchasesVoucherForRMA() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		checkPurchasesVoucherHeader("Purchase","Vendor B","DUBAI");

		checkRMAItem(1,2,"HYDERABAD","WA COGS ITEM",6,"10","10","Focuss,10");

		Thread.sleep(2500);
		int RMACOUNT = RMA_AddedList.size();
		ArrayList<String> rmaList = new ArrayList<String>();
		for(int i=0;i<RMACOUNT;i++)
		{

			String data = RMA_AddedList.get(i).getText();
			Thread.sleep(1000);
			rmaList.add(data);
		}


		String actRow1List = rmaList.toString();
		String expRow1List = "[, Focuss1, Focuss2, Focuss3, Focuss4, Focuss5, Focuss6, Focuss7, Focuss8, Focuss9]";

		System.out.println("actRow1List: "+actRow1List);
		System.out.println("expRow1List: "+expRow1List);

		RMA_CancelBtn.click();
		
		Thread.sleep(5000);
		getAction().moveToElement(select1stRow_12thColumn).build().perform();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
		select1stRow_12thColumn.click();
		Thread.sleep(1000);
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rma));
		enter_Rma.click();*/
		
		Thread.sleep(3000);
		RMA_SerialNoTxt.sendKeys("Focuss1,10");
		Thread.sleep(1000);
		RMA_AddIcon.click();
		Thread.sleep(1000);
		
		rmaOkBtn.click();
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(2500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		Thread.sleep(1500);

		String expSavingMessage1 = "Voucher saved successfully";

		String actSavingMessage = checkValidationMessage(expSavingMessage1);

		if(actRow1List.equalsIgnoreCase(expRow1List) && actSavingMessage.startsWith(expSavingMessage1))
		{
			return true;
		}
		else
		{
			return false;
		}

	}
	
	
	public static boolean checkEnableRMACannotBeReUseOptions() throws InterruptedException
	{
		Thread.sleep(2000);
		
		getAction().moveToElement(settingsmenuBtn).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		ClickUsingJs(settingsmenuBtn);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PreferencesBtn));
		PreferencesBtn.click();

		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RMABtn));
		RMABtn.click();


		Thread.sleep(2000);
		
		if(RMANoCannotBeReUseChcBx.isEnabled()==false)
		{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RMANoCannotBeReUseChcBx));
		RMANoCannotBeReUseChcBx.click();
		}


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();


		getWaitForAlert();
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  ="Do you want to save the changes?";
		getAlert().accept();

		Thread.sleep(5000);

		if (actAlertMgs.equalsIgnoreCase(expAlertMgs))
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
	}
	
	public static boolean checkSaveOpeningStockVoucherForRmaCannotBeResusedOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		ClickUsingJs(inventoryMenu);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorystocks));
		inventorystocks.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryopeningstocks));
		inventoryopeningstocks.click();

		Thread.sleep(2000);
		
		getWebDriverWaitEle(newBtn);
		ClickUsingJs(newBtn);
		/*getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();*/
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.click();

		enter_WarehouseTxt.sendKeys(Keys.SPACE);

		enter_WarehouseTxt.sendKeys("HYDERABAD");

		Thread.sleep(2000);

		int warehousecount=warehouseBodyComboList.size();

		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=warehouseBodyComboList.get(i).getText();

			if (data.equalsIgnoreCase("HYDERABAD")) 
			{
				warehouseBodyComboList.get(i).click();
				break;
			}
		}

		enter_WarehouseTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.click();
		enter_ItemTxt.sendKeys(Keys.SPACE);

		enter_ItemTxt.sendKeys("WA COGS ITEM");

		Thread.sleep(2000);

		int pvvGridItemListCount=pvvGridItemList.size();
		for (int i = 0; i < pvvGridItemListCount; i++) 
		{
			String Item=pvvGridItemList.get(i).getText();
			if (Item.equalsIgnoreCase("WA COGS ITEM")) 
			{
				pvvGridItemList.get(i).click();
				break;
			}
		}
		enter_ItemTxt.sendKeys(Keys.TAB);	

	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
		select1stRow_4thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.click();
		enter_Quantity.clear();
		enter_Quantity.sendKeys("1");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);

		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		rmaSerialNumberTxtField.sendKeys("Focus@789");
		rmaSerialNumberTxtField.sendKeys(Keys.ENTER);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		rmaOkBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);


		if (actMessage.startsWith(expMessage)) 
		{

			return true;
		}
		else 
		{

			return false;
		}
	
	}
	
	
	public static boolean checkSaveSalesInvoiceVoucher() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		checkSalesInvoiceVATHeader("Sales - Computers", "Customer C", "DUBAI", "HYDERABAD");
		
		checkSaveSalesInvoiceVAT(1,2,"WA COGS ITEM",5, "1",12,"5");
		
		Thread.sleep(1500);
		ArrayList<String> rmaList = new ArrayList<String>();

		if (RMAPopupHeader.isDisplayed()) 
		{
			RMA_SearchSavedrma.click();
			Thread.sleep(2500);
			int rmaCount = RMA_SavedRMAList.size();

			Thread.sleep(1500);
			for(int r=0; r<rmaCount; r++)
			{
				String data = RMA_SavedRMAList.get(r).getText();
				rmaList.add(data);
				
				if(data.equalsIgnoreCase("Focus@789"))
				{
					RMA_SavedRMAcheckbxList.get(r).click();
					break;
				}
				
				

			}


		}

		String actlist = rmaList.toString();
		String expList = "[1022, 362547, 457812, 547891, Focuss1, Focuss2, Focuss3, Focuss4, Focuss5, Focuss6, Focuss7, Focuss8, Focuss9, Rma@123, Focuss10, Focus@789]";

		System.out.println("actlist: "+actlist);
		System.out.println("expList: "+expList);
		
		Thread.sleep(1000);
		RMA_OKBtn.click();

		Thread.sleep(1500);
		ArrayList<String> SelectedrmaList = new ArrayList<String>();

		int rma = RMA_CheckedRMAList.size();

		for(int r=0; r<rma; r++)
		{
			String data = RMA_CheckedRMAList.get(r).getText();
			SelectedrmaList.add(data);

		}



		String actSlist = SelectedrmaList.toString();
		String expSList = "[Focus@789]";


		System.out.println("actSlist: "+actSlist);
		System.out.println("expSList: "+expSList);

		Thread.sleep(1000);
		RMA_OKBtn2.click();
		
		enter_Rma.sendKeys(Keys.TAB);
		

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();


		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);


		if(actlist.equalsIgnoreCase(expList) && actSlist.equalsIgnoreCase(expSList) && actMessage.startsWith(expMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	
	}
	
	public static boolean checkEditOpeningStocksVoucherandDuplicatetheRma() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		ClickUsingJs(inventoryMenu);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorystocks));
		inventorystocks.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryopeningstocks));
		inventoryopeningstocks.click();

		Thread.sleep(2000);
		
		int count = grid_AccountList.size();

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_AccountList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase("4")) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					grid_CheckBoxList.get(i).click();
					Thread.sleep(2000);
					editBtn.click();
					break;
				}
			}
		} 
		
		checkValidationMessage("");
		
		Thread.sleep(3500);
		getAction().contextClick(select1stRow_1sstColumn).build().perform();
		Thread.sleep(1200);
		duplicateRowBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_10thColumn));
		select2ndRow_10thColumn.click();
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rma));
		enter_Rma.click();*/
		
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		rmaSerialNumberTxtField.sendKeys("Focus@789");
		rmaSerialNumberTxtField.sendKeys(Keys.ENTER);
		
		getWaitForAlert();
		String actAlertTxt = getAlert().getText();
		getAlert().accept();
		
		System.err.println("Alert Accepted....");

		System.err.println(actAlertTxt);

		String expAlertTxt = "RMA Number Series Already Exist.";

		Thread.sleep(3000);
		
		Thread.sleep(2500);
		rmaCancelBtn.click();
		Thread.sleep(2500);
		VoucherEntryCloseBtn.click();
		Thread.sleep(2500);
		getAlert().accept();
		if(actAlertTxt.equalsIgnoreCase(expAlertTxt))
		{
			
			return true;
		}
		else
		{
			return false;
		}
		
	
	}
	

	public static boolean checkSaveOpeningStocksVoucherForRmaProperties() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		ClickUsingJs(inventoryMenu);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorystocks));
		inventorystocks.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryopeningstocks));
		inventoryopeningstocks.click();

		Thread.sleep(2000);
		
		getWebDriverWaitEle(newBtn);
		ClickUsingJs(newBtn);
		/*getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();*/
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.click();

		enter_WarehouseTxt.sendKeys(Keys.SPACE);

		enter_WarehouseTxt.sendKeys("HYDERABAD");

		Thread.sleep(2000);

		int warehousecount=warehouseBodyComboList.size();

		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=warehouseBodyComboList.get(i).getText();

			if (data.equalsIgnoreCase("HYDERABAD")) 
			{
				warehouseBodyComboList.get(i).click();
				break;
			}
		}

		enter_WarehouseTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.click();
		enter_ItemTxt.sendKeys(Keys.SPACE);

		enter_ItemTxt.sendKeys("WA COGS ITEM");

		Thread.sleep(2000);

		int pvvGridItemListCount=pvvGridItemList.size();
		for (int i = 0; i < pvvGridItemListCount; i++) 
		{
			String Item=pvvGridItemList.get(i).getText();
			if (Item.equalsIgnoreCase("WA COGS ITEM")) 
			{
				pvvGridItemList.get(i).click();
				break;
			}
		}
		enter_ItemTxt.sendKeys(Keys.TAB);	

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
		select1stRow_4thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.click();
		enter_Quantity.clear();
		enter_Quantity.sendKeys("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);

		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		rmaSerialNumberTxtField.sendKeys("FocusRma");
		rmaSerialNumberTxtField.sendKeys(Keys.ENTER);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		rmaOkBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);


		if (actMessage.startsWith(expMessage)) 
		{

			return true;
		}
		else 
		{

			return false;
		}
	}
	
	public static boolean checkSaveSalesInvoicesVoucherWithSavedRmaInOSForRmaProperties() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		checkSalesInvoiceVATHeader("Sales - Computers", "Customer C", "DUBAI", "HYDERABAD");
		
		checkSaveSalesInvoiceVAT(1,2,"WA COGS ITEM",5, "1",12,"5");
		
		Thread.sleep(1500);
		ArrayList<String> rmaList = new ArrayList<String>();

		if (RMAPopupHeader.isDisplayed()) 
		{
			RMA_SearchSavedrma.click();
			Thread.sleep(2500);
			int rmaCount = RMA_SavedRMAList.size();

			Thread.sleep(1500);
			for(int r=0; r<rmaCount; r++)
			{
				String data = RMA_SavedRMAList.get(r).getText();
				rmaList.add(data);
				
				if(data.equalsIgnoreCase("FocusRma"))
				{
					RMA_SavedRMAcheckbxList.get(r).click();
					break;
				}
				
				

			}


		}

		String actlist = rmaList.toString();
		String expList = "[1022, 362547, 457812, 547891, Focuss1, Focuss2, Focuss3, Focuss4, Focuss5, Focuss6, Focuss7, Focuss8, Focuss9, Rma@123, FocusRma]";

		System.out.println("actlist: "+actlist);
		System.out.println("expList: "+expList);
		
		Thread.sleep(1000);
		RMA_OKBtn.click();

		Thread.sleep(1500);
		ArrayList<String> SelectedrmaList = new ArrayList<String>();

		int rma = RMA_CheckedRMAList.size();

		for(int r=0; r<rma; r++)
		{
			String data = RMA_CheckedRMAList.get(r).getText();
			SelectedrmaList.add(data);

		}



		String actSlist = SelectedrmaList.toString();
		String expSList = "[FocusRma]";


		System.out.println("actSlist: "+actSlist);
		System.out.println("expSList: "+expSList);

		Thread.sleep(1000);
		RMA_OKBtn2.click();
		
		enter_Rma.sendKeys(Keys.TAB);
		

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		newReferenceTxt.click();

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();


		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);


		if(actlist.equalsIgnoreCase(expList) && actSlist.equalsIgnoreCase(expSList) && actMessage.startsWith(expMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public static boolean checkSaveSalesReturnsVoucherForRmaProperties() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		checkSalesReturnsHeader("Customer C", "DUBAI");
		checkSaveSalesReturnsVoucher(1,2,"HYDERABAD", "WA COGS ITEM", 6 ,"1", 8, "5");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RMA_SerialNoTxt));
		RMA_SerialNoTxt.sendKeys("FocusRma");
		Thread.sleep(1000);
		RMA_AddIcon.click();
		Thread.sleep(2000);
		RMA_OkBtn.click();

		getWaitForAlert();
		String actAlertTxt = getAlert().getText();
		getAlert().accept();
		
		System.err.println("Alert Accepted....");

		System.err.println(actAlertTxt);

		String expAlertTxt = "RMA Number should be unique";

		Thread.sleep(3000);
		
		Thread.sleep(2500);
		rmaCancelBtn.click();

		if(actAlertTxt.equalsIgnoreCase(expAlertTxt))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static boolean checkMaterialReceiptsNotesFoRmaItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		ClickUsingJs(inventoryMenu);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(materialReceiptNotesVoucher));
		materialReceiptNotesVoucher.click();

		Thread.sleep(2000);
		
		getWebDriverWaitEle(newBtn);
		ClickUsingJs(newBtn);
		
		Thread.sleep(3500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys("Vendor A");
		vendorAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(1200);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.click();

		enter_WarehouseTxt.sendKeys(Keys.SPACE);

		enter_WarehouseTxt.sendKeys("HYDERABAD");

		Thread.sleep(2000);

		int warehousecount=warehouseBodyComboList.size();

		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=warehouseBodyComboList.get(i).getText();

			if (data.equalsIgnoreCase("HYDERABAD")) 
			{
				warehouseBodyComboList.get(i).click();
				break;
			}
		}

		enter_WarehouseTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.click();
		enter_ItemTxt.sendKeys(Keys.SPACE);

		enter_ItemTxt.sendKeys("WA COGS ITEM");

		Thread.sleep(2000);

		int pvvGridItemListCount=pvvGridItemList.size();
		for (int i = 0; i < pvvGridItemListCount; i++) 
		{
			String Item=pvvGridItemList.get(i).getText();
			if (Item.equalsIgnoreCase("WA COGS ITEM")) 
			{
				pvvGridItemList.get(i).click();
				break;
			}
		}
		enter_ItemTxt.sendKeys(Keys.TAB);	
		Thread.sleep(1200);
		
		enter_Units.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.click();
		enter_Quantity.clear();
		enter_Quantity.sendKeys("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
		select1stRow_7thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);

		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		rmaSerialNumberTxtField.sendKeys("FocusMRN");
		rmaSerialNumberTxtField.sendKeys(Keys.ENTER);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		rmaOkBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);


		if(actMessage.startsWith(expMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static boolean checkTrySavingAnotherMRNVoucherWithSameRMASeries() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		ClickUsingJs(inventoryMenu);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(materialReceiptNotesVoucher));
		materialReceiptNotesVoucher.click();
		
		Thread.sleep(2000);
		
		getWebDriverWaitEle(newBtn);
		ClickUsingJs(newBtn);

		
		Thread.sleep(3500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		previousBtn.click();
		System.err.println("Previous voucher");
		
		Thread.sleep(3500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		toggleBtn.click();
		
		Thread.sleep(1200);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copyToClipBoardOption));
		copyToClipBoardOption.click();
	
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtnInHome));
		newBtnInHome.click();
		Thread.sleep(3500);
		
		Thread.sleep(1200);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		toggleBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pasteFromClipBoardOption));
		ClickUsingJs(pasteFromClipBoardOption);
		
		String ExpMsg = "Paste from clipboard completed successfully";
		String ActMsg = checkValidationMessage(ExpMsg);
		
		
		System.err.println("ActMsg"+ActMsg);
		
		Thread.sleep(4000);
		getAction().moveToElement(select1stRow_8thColumn).build().perform();
		Thread.sleep(2000);
		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
		select1stRow_8thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		rmaSerialNumberTxtField.sendKeys("FocusMRN");
		rmaSerialNumberTxtField.sendKeys(Keys.ENTER);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		rmaOkBtn.click();

		Thread.sleep(2000);

		getWaitForAlert();
		
		String actAlertTxt = getAlert().getText();
		System.err.println(actAlertTxt);
		String expAlertTxt = "RMA Number should be unique";
		
		getAlert().accept();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaCancelBtn));
		rmaCancelBtn.click();
		
		Thread.sleep(1200);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VoucherEntryCloseBtn));
		VoucherEntryCloseBtn.click();
		
		Thread.sleep(2500);
		voucherchanges_Yes.click();
		
		if (ActMsg.startsWith(ExpMsg) && actAlertTxt.startsWith(expAlertTxt))
		{
			return true;
		} 
		else
		{
			return false;
			
			
		}
		
	}
	
	
	public static boolean checkSuspendMRNVoucher1andSaveMRNVoucher2() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		Thread.sleep(2000);
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));

    	int count = grid_VoucherNoList.size();

    	for (int i = 0; i < count; i++) 
    	{
    		String VoucherNo = grid_VoucherNoList.get(i).getText();

    		if (VoucherNo.equalsIgnoreCase("1")) 
    		{
    			if (grid_CheckBoxList.get(i).isSelected() == false) 
    			{
    				grid_CheckBoxList.get(i).click();
    				break;
    			}
    		}
    	}
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(suspendBtn));
    	suspendBtn.click();
    	
    	String expSusMsg = "Voucher Suspended Successfully";
    	String actSusMsg = checkValidationMessage(expSusMsg);
    	
    	Thread.sleep(1500);
    	
    	getWebDriverWaitEle(newBtn);
		ClickUsingJs(newBtn);
		Thread.sleep(2400);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		toggleBtn.click();
		
		Thread.sleep(2500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pasteFromClipBoardOption));
		pasteFromClipBoardOption.click();
		
		String ExpMsg = "Paste from clipboard completed successfully";
		String ActMsg = checkValidationMessage(ExpMsg);
		
		Thread.sleep(1200);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
		select1stRow_8thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		rmaSerialNumberTxtField.sendKeys("FocusMRN");
		rmaSerialNumberTxtField.sendKeys(Keys.ENTER);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		rmaOkBtn.click();

		Thread.sleep(2000);
    	
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);


		if(actMessage.startsWith(expMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	
	public static boolean checkRESaveMRNVoucherMRNVoucher() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		ClickUsingJs(inventoryMenu);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(materialReceiptNotesVoucher));
		materialReceiptNotesVoucher.click();

		Thread.sleep(5000);
		
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));

    	int count = grid_AccountList.size();

    	for (int i = 0; i < count; i++) 
    	{
    		String VoucherNo = grid_AccountList.get(i).getText();
    		Thread.sleep(2000);
    		if (VoucherNo.equalsIgnoreCase("1")) 
    		{
    				grid_CheckBoxList.get(i).click();
    				Thread.sleep(2000);
    				break;
    		}
    	}
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editBtn));
    	editBtn.click();
    	Thread.sleep(2500);
    	
    	checkValidationMessage("");
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
    	
    	String expSusMsg = "RMA should be unique.";
    	String actSusMsg = checkValidationMessage(expSusMsg);
    	
    	Thread.sleep(1500);
    	
    	if (actSusMsg.equalsIgnoreCase(expSusMsg))
    	{
			return true;
		}
    	else 
    	{
    		return false;
		}
    	
	}
	
	public static boolean checkRmaQunatityIncreaseInInwardVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		ClickUsingJs(inventoryMenu);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorystocks));
		inventorystocks.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryopeningstocks));
		inventoryopeningstocks.click();

		Thread.sleep(2000);
		
		getWebDriverWaitEle(newBtn);
		ClickUsingJs(newBtn);
		/*getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();*/
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.click();

		enter_WarehouseTxt.sendKeys(Keys.SPACE);

		enter_WarehouseTxt.sendKeys("HYDERABAD");

		Thread.sleep(2000);

		int warehousecount=warehouseBodyComboList.size();

		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=warehouseBodyComboList.get(i).getText();

			if (data.equalsIgnoreCase("HYDERABAD")) 
			{
				warehouseBodyComboList.get(i).click();
				break;
			}
		}

		enter_WarehouseTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.click();
		enter_ItemTxt.sendKeys(Keys.SPACE);

		enter_ItemTxt.sendKeys("WA COGS ITEM");

		Thread.sleep(2000);

		int pvvGridItemListCount=pvvGridItemList.size();
		for (int i = 0; i < pvvGridItemListCount; i++) 
		{
			String Item=pvvGridItemList.get(i).getText();
			if (Item.equalsIgnoreCase("WA COGS ITEM")) 
			{
				pvvGridItemList.get(i).click();
				break;
			}
		}
		enter_ItemTxt.sendKeys(Keys.TAB);	

	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
		select1stRow_4thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.click();
		enter_Quantity.clear();
		enter_Quantity.sendKeys("1");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);

		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		rmaSerialNumberTxtField.sendKeys("1022");
		rmaSerialNumberTxtField.sendKeys(Keys.ENTER);
		
		
		getAction().moveToElement(rmaOkBtn).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		ClickUsingJs(rmaOkBtn);

		Thread.sleep(3500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
		select1stRow_4thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.click();
		enter_Quantity.clear();
		enter_Quantity.sendKeys("5");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		enter_Rma.sendKeys(Keys.SPACE);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		rmaSerialNumberTxtField.sendKeys("1023,5");
		rmaSerialNumberTxtField.sendKeys(Keys.ENTER);
		
		
		getAction().moveToElement(rmaOkBtn).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		ClickUsingJs(rmaOkBtn);
		
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);


		if (actMessage.startsWith(expMessage)) 
		{

			return true;
		}
		else 
		{

			return false;
		}
 
		
	}
	
	
	public static boolean checkRmaNoUncheckAndSeeRMASelectedGrid() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		ClickUsingJs(inventoryMenu);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsSalesMenu));
		inventoryTransactionsSalesMenu.click();
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deliveryNotesVoucher));
		deliveryNotesVoucher.click();

		Thread.sleep(2000);
		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		Thread.sleep(2000);

		Thread.sleep(1000);
		checkValidationMessage("Voucher loaded successfully");

		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("Customer A");
		Thread.sleep(1500);
		customerAccountTxt.sendKeys(Keys.TAB);
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.click();

		enter_WarehouseTxt.sendKeys(Keys.SPACE);

		enter_WarehouseTxt.sendKeys("HYDERABAD");

		Thread.sleep(2000);

		int warehousecount=warehouseBodyComboList.size();

		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=warehouseBodyComboList.get(i).getText();

			if (data.equalsIgnoreCase("HYDERABAD")) 
			{
				warehouseBodyComboList.get(i).click();
				break;
			}
		}

		enter_WarehouseTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.click();
		enter_ItemTxt.sendKeys(Keys.SPACE);

		enter_ItemTxt.sendKeys("WA COGS ITEM");

		Thread.sleep(2000);

		int pvvGridItemListCount=pvvGridItemList.size();
		for (int i = 0; i < pvvGridItemListCount; i++) 
		{
			String Item=pvvGridItemList.get(i).getText();
			if (Item.equalsIgnoreCase("WA COGS ITEM")) 
			{
				pvvGridItemList.get(i).click();
				break;
			}
		}
		enter_ItemTxt.sendKeys(Keys.TAB);	
		Thread.sleep(1200);
		
		enter_Units.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_6thColumn));
		select1stRow_6thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.click();
		enter_Quantity.clear();
		enter_Quantity.sendKeys("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
		select1stRow_8thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		
		Thread.sleep(1500);
		ArrayList<String> rmaList = new ArrayList<String>();

		if (RMAPopupHeader.isDisplayed()) 
		{
			RMA_SearchSavedrma.click();
			Thread.sleep(2500);
			int rmaCount = RMA_SavedRMAList.size();

			Thread.sleep(1500);
			for(int r=0; r<rmaCount; r++)
			{
				String data = RMA_SavedRMAList.get(r).getText();
				rmaList.add(data);
				
				if(data.equalsIgnoreCase("Focuss1"))
				{
					RMA_SavedRMAcheckbxList.get(r).click();
				
				}
				
			
			}


		}
		
		Thread.sleep(1000);
		RMA_OKBtn.click();

		RMA_SearchSavedrma.click();
		
		int rmaCount = RMA_SavedRMAList.size();
		Thread.sleep(1500);
		for(int r1=0; r1<rmaCount; r1++)
		{
			String data = RMA_SavedRMAList.get(r1).getText();
			rmaList.add(data);
		if(data.equalsIgnoreCase("Focuss1"))
		{
			RMA_SavedRMAcheckbxList.get(r1).isEnabled();
			
			if (RMA_SavedRMAcheckbxList.get(r1).isEnabled())
			{
				RMA_SavedRMAcheckbxList.get(r1).click();
				
			}
		
		}
		
		if(data.equalsIgnoreCase("Focuss2"))
		{
			
				RMA_SavedRMAcheckbxList.get(r1).click();
		
		}
		
		if(data.equalsIgnoreCase("Focuss2"))
		{
			RMA_SavedRMAcheckbxList.get(r1).isEnabled();
			
			if (RMA_SavedRMAcheckbxList.get(r1).isEnabled())
			{
				RMA_SavedRMAcheckbxList.get(r1).click();
				
			}
		
		}
		
		}
		
		Thread.sleep(1000);
		RMA_OKBtn.click();
		
		boolean actAlert = getIsAlertPresent();
		
		String actAlertText = getAlert().getText();
		System.err.println(actAlertText);
		String expAlertText = "Select Atleast One Record.";
		
		getAlert().accept();
		
		if(actAlert && actAlertText.equalsIgnoreCase(expAlertText))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	
	public static boolean checkSaveOpeningStocksVoucherForTheRemoveRmaValiations() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		ClickUsingJs(inventoryMenu);
		
		Thread.sleep(5000);

		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorystocks));
		inventorystocks.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryopeningstocks));
		inventoryopeningstocks.click();

		Thread.sleep(2000);
		
		getWebDriverWaitEle(newBtn);
		ClickUsingJs(newBtn);
		/*getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();*/
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.click();

		enter_WarehouseTxt.sendKeys(Keys.SPACE);

		enter_WarehouseTxt.sendKeys("HYDERABAD");

		Thread.sleep(2000);

		int warehousecount=warehouseBodyComboList.size();

		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=warehouseBodyComboList.get(i).getText();

			if (data.equalsIgnoreCase("HYDERABAD")) 
			{
				warehouseBodyComboList.get(i).click();
				break;
			}
		}

		enter_WarehouseTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.click();
		enter_ItemTxt.sendKeys(Keys.SPACE);

		enter_ItemTxt.sendKeys("WA COGS ITEM");

		Thread.sleep(2000);

		int pvvGridItemListCount=pvvGridItemList.size();
		for (int i = 0; i < pvvGridItemListCount; i++) 
		{
			String Item=pvvGridItemList.get(i).getText();
			if (Item.equalsIgnoreCase("WA COGS ITEM")) 
			{
				pvvGridItemList.get(i).click();
				break;
			}
		}
		enter_ItemTxt.sendKeys(Keys.TAB);	

	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
		select1stRow_4thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.click();
		enter_Quantity.clear();
		enter_Quantity.sendKeys("5");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		rmaSerialNumberTxtField.sendKeys("RmaRmv1,5");
		rmaSerialNumberTxtField.sendKeys(Keys.ENTER);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		rmaOkBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);


		if (actMessage.startsWith(expMessage)) 
		{

			return true;
		}
		else 
		{

			return false;
		}
	
	}
	
	@FindBy(xpath="//*[@id='Search_lblItems']")
	public static WebElement NoOfItems;
	
	public static boolean checkEditopeningStocksVoucherQuantity() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		ClickUsingJs(inventoryMenu);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorystocks));
		inventorystocks.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryopeningstocks));
		inventoryopeningstocks.click();

		Thread.sleep(2000);

		int count = grid_AccountList.size();

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_AccountList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase("10")) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					grid_CheckBoxList.get(i).click();
					Thread.sleep(2000);
					editBtn.click();
					break;
				}
			}
		} 

		checkValidationMessage("");

		Thread.sleep(2500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
		select1stRow_4thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.click();
		enter_Quantity.clear();
		enter_Quantity.sendKeys("4");
		Thread.sleep(1000);
		enter_Quantity.sendKeys(Keys.TAB);

		int rmaCount = RMA_SavedRMAList.size();

		Thread.sleep(1500);
		for(int r=0; r<rmaCount; r++)
		{
			String data = RMA_SavedRMAList.get(r).getText();
			if(data.equalsIgnoreCase("RmaRmv5"))
			{
				RMA_SavedRMAcheckbxList.get(r).click();
				String actSelectNoOfItems = NoOfItems.getText();
				String expSelectNoOfItems = "1";
				System.err.println("Checked");

				if(RMA_SavedRMAcheckbxList.get(r).isSelected())
				{
					RMA_SavedRMAcheckbxList.get(r).click();
					String actSelectNoOfItems2 = NoOfItems.getText();
					String expSelectNoOfItems2 = "0";
					System.err.println("UnChecked");
					break;
				}

			}

		}

		Thread.sleep(1000);
		RMA_OKBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_10thColumn));
		select1stRow_10thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rma));
		enter_Rma.click();
		enter_Rma.sendKeys(Keys.SPACE);

		ArrayList<String> rmaList2 = new ArrayList<String>();

		int rmaCount2 = RMA_CheckedRMAList.size();

		Thread.sleep(1500);
		for(int r=0; r<rmaCount2; r++)
		{
			String data = RMA_CheckedRMAList.get(r).getText();
			rmaList2.add(data);
		}

		String ActRmaList2Are = rmaList2.toString();
		String ExpRmaList2Are = "[RmaRmv1, RmaRmv2, RmaRmv3, RmaRmv4]";

		System.out.println(ActRmaList2Are);
		System.out.println(ExpRmaList2Are);
		
		RMA_OKBtn2.click();
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		if(ActRmaList2Are.equalsIgnoreCase(ExpRmaList2Are))
		{
			return true;
		}
		else
		{
			return false;
		}

	}
	
	public static boolean checkSaveDeliveryNotesVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		ClickUsingJs(inventoryMenu);
		Thread.sleep(2500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsSalesMenu));
		inventoryTransactionsSalesMenu.click();
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deliveryNotesVoucher));
		deliveryNotesVoucher.click();

		Thread.sleep(2000);
		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		Thread.sleep(2000);

		Thread.sleep(1000);
		checkValidationMessage("Voucher loaded successfully");

		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("Customer A");
		Thread.sleep(1500);
		customerAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.click();

		enter_WarehouseTxt.sendKeys(Keys.SPACE);

		enter_WarehouseTxt.sendKeys("HYDERABAD");

		Thread.sleep(2000);

		int warehousecount=warehouseBodyComboList.size();

		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=warehouseBodyComboList.get(i).getText();

			if (data.equalsIgnoreCase("HYDERABAD")) 
			{
				warehouseBodyComboList.get(i).click();
				break;
			}
		}

		enter_WarehouseTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.click();
		enter_ItemTxt.sendKeys(Keys.SPACE);

		enter_ItemTxt.sendKeys("WA COGS ITEM");

		Thread.sleep(2000);

		int pvvGridItemListCount=pvvGridItemList.size();
		for (int i = 0; i < pvvGridItemListCount; i++) 
		{
			String Item=pvvGridItemList.get(i).getText();
			if (Item.equalsIgnoreCase("WA COGS ITEM")) 
			{
				pvvGridItemList.get(i).click();
				break;
			}
		}
		enter_ItemTxt.sendKeys(Keys.TAB);	
		Thread.sleep(1200);
		
		enter_Units.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_6thColumn));
		select1stRow_6thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.click();
		enter_Quantity.clear();
		enter_Quantity.sendKeys("4");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
		select1stRow_8thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(1500);
		ArrayList<String> rmaList = new ArrayList<String>();

		if (RMAPopupHeader.isDisplayed()) 
		{
			RMA_SearchSavedrma.click();
			Thread.sleep(2500);
			int rmaCount = RMA_SavedRMAList.size();

			Thread.sleep(1500);
			for(int r=0; r<rmaCount; r++)
			{
				String data = RMA_SavedRMAList.get(r).getText();
				rmaList.add(data);
				
				if(data.equalsIgnoreCase("RmaRmv1"))
				{
					RMA_SavedRMAcheckbxList.get(r).click();
				
				}
				

				if(data.equalsIgnoreCase("RmaRmv2"))
				{
					RMA_SavedRMAcheckbxList.get(r).click();
				
				}
				

				if(data.equalsIgnoreCase("RmaRmv3"))
				{
					RMA_SavedRMAcheckbxList.get(r).click();
				
				}
				

				if(data.equalsIgnoreCase("RmaRmv4"))
				{
					RMA_SavedRMAcheckbxList.get(r).click();
				
				}
				
			
			}


		}
		
		Thread.sleep(1000);
		RMA_OKBtn.click();

		Thread.sleep(2000);
		

		Thread.sleep(1000);
		RMA_OKBtn2.click();
		
		Thread.sleep(2500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);


		if(actMessage.startsWith(expMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	public static boolean checkEditDeliveryNotesForRmaEdit() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		ClickUsingJs(inventoryMenu);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsSalesMenu));
		inventoryTransactionsSalesMenu.click();
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deliveryNotesVoucher));
		deliveryNotesVoucher.click();

		Thread.sleep(2000);
		

		Thread.sleep(2000);

		int count = grid_AccountList.size();

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_AccountList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase("4")) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					grid_CheckBoxList.get(i).click();
					Thread.sleep(2000);
					editBtn.click();
					break;
				}
			}
		} 

		checkValidationMessage("");

		Thread.sleep(2500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
		select1stRow_12thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rma));
		enter_Rma.click();
		enter_Rma.sendKeys(Keys.SPACE);
		
		
		Thread.sleep(2500);
		RMA_SearchSavedrma.click();
		Thread.sleep(2500);

		int rmaCount = RMA_SavedRMAList.size();

		Thread.sleep(1500);
		for(int r=0; r<rmaCount; r++)
		{
			String data = RMA_SavedRMAList.get(r).getText();
			if(data.equalsIgnoreCase("RmaRmv3"))
			{
				if(RMA_SavedRMAcheckbxList.get(r).isSelected())
				{
					RMA_SavedRMAcheckbxList.get(r).click();
					System.err.println("UnChecked");
					
				}

			}
			
			if(data.equalsIgnoreCase("RmaRmv4"))
			{
				if(RMA_SavedRMAcheckbxList.get(r).isSelected())
				{
					RMA_SavedRMAcheckbxList.get(r).click();
					System.err.println("UnChecked");
					
				}

			}

		}

		Thread.sleep(1000);
		RMA_OKBtn.click();

		ArrayList<String> rmaList2 = new ArrayList<String>();

		int rmaCount2 = RMA_CheckedRMAList.size();

		Thread.sleep(1500);
		for(int r=0; r<rmaCount2; r++)
		{
			String data = RMA_CheckedRMAList.get(r).getText();
			rmaList2.add(data);
		}

		String ActRmaList2Are = rmaList2.toString();
		String ExpRmaList2Are = "[RmaRmv1, RmaRmv2, , ]";

		System.out.println(ActRmaList2Are);
		System.out.println(ExpRmaList2Are);
		
		RMA_OKBtn2.click();
		Thread.sleep(2000);
		
		getAlert().accept();
		Thread.sleep(1200);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);


		if(ActRmaList2Are.equalsIgnoreCase(ExpRmaList2Are) && actMessage.startsWith(expMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	public static boolean checkSaveOpeningStocksForRma() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		ClickUsingJs(inventoryMenu);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorystocks));
		inventorystocks.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryopeningstocks));
		inventoryopeningstocks.click();

		Thread.sleep(2000);
		
		getWebDriverWaitEle(newBtn);
		ClickUsingJs(newBtn);
		/*getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();*/
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.click();

		enter_WarehouseTxt.sendKeys(Keys.SPACE);

		enter_WarehouseTxt.sendKeys("HYDERABAD");

		Thread.sleep(2000);

		int warehousecount=warehouseBodyComboList.size();

		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=warehouseBodyComboList.get(i).getText();

			if (data.equalsIgnoreCase("HYDERABAD")) 
			{
				warehouseBodyComboList.get(i).click();
				break;
			}
		}

		enter_WarehouseTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.click();
		enter_ItemTxt.sendKeys(Keys.SPACE);

		enter_ItemTxt.sendKeys("WA COGS ITEM");

		Thread.sleep(2000);

		int pvvGridItemListCount=pvvGridItemList.size();
		for (int i = 0; i < pvvGridItemListCount; i++) 
		{
			String Item=pvvGridItemList.get(i).getText();
			if (Item.equalsIgnoreCase("WA COGS ITEM")) 
			{
				pvvGridItemList.get(i).click();
				break;
			}
		}
		enter_ItemTxt.sendKeys(Keys.TAB);	

	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
		select1stRow_4thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.click();
		enter_Quantity.clear();
		enter_Quantity.sendKeys("1");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);

		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		rmaSerialNumberTxtField.sendKeys("FOCUS");
		rmaSerialNumberTxtField.sendKeys(Keys.ENTER);
		
		
		getAction().moveToElement(rmaCancelBtn).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaCancelBtn));
		ClickUsingJs(rmaCancelBtn);

		Thread.sleep(2000);
		getAction().moveToElement(select1stRow_10thColumn).build().perform();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_10thColumn));
		select1stRow_10thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rma));
		enter_Rma.sendKeys(Keys.SPACE);
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
		rmaSerialNumberTxtField.sendKeys("FOCUS");
		rmaSerialNumberTxtField.sendKeys(Keys.ENTER);
		

		getAction().moveToElement(rmaOkBtn).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
		ClickUsingJs(rmaOkBtn);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		String expMessage = "Voucher saved successfully";
		String actMessage = checkValidationMessage(expMessage);


		if (actMessage.startsWith(expMessage)) 
		{

			return true;
		}
		else 
		{

			return false;
		}
	
	}
	
	public RMA(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
