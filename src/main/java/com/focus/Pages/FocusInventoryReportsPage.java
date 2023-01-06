package com.focus.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;
import com.testautomationguru.utility.PDFUtil;

public class FocusInventoryReportsPage extends BaseEngine {
	
	
	
	public boolean checkItemQueryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemQuery));
		itemQuery.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(iq_ItemTxt));
		iq_ItemTxt.click();
		iq_ItemTxt.sendKeys("A1");
		Thread.sleep(2000);
		iq_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(iq_getStockBtn));
		iq_getStockBtn.click();
		
		Thread.sleep(5000);
		
		String actiq_OpeningStocks				=iq_OpeningStocks.getText();
		String actiq_PendingPurchaseOrders		=iq_PendingPurchaseOrders.getText();
		String actiq_CurrentStock				=iq_CurrentStock.getText();
		String actiq_PendingSalesOrders			=iq_PendingSalesOrders.getText();
		String actiq_AvgStockRate				=iq_AvgStockRate.getText();
		String actiq_QtyToBeOrdered				=iq_QtyToBeOrdered.getText();
		String actiq_Value						=iq_Value.getText();
		
		
		String expiq_OpeningStocks				="1.00";
		String expiq_PendingPurchaseOrders		="0.00";
		String expiq_CurrentStock				="3.00";
		String expiq_PendingSalesOrders			="0.00";
		String expiq_AvgStockRate				="1.00";
		String expiq_QtyToBeOrdered				="0.00";
		String expiq_Value						="3.00";
	
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(IQRecentStockPurchasesTransactionExpand));
		IQRecentStockPurchasesTransactionExpand.click();
		
		Thread.sleep(2000);
	
		ArrayList<String>  purchasesList1 = new ArrayList<String>(); 

		int count=IQRecentStockTransactionPurchasesR1.size();

		System.err.println(count);

		for(int i=0 ; i < count ;i++)
		{
			String data=IQRecentStockTransactionPurchasesR1.get(i).getText();
			purchasesList1.add(data);

		}

		String actpurchasesListR1 = purchasesList1.toString();
		String exppurchasesListR1 = "[21-07-2022, PurVou:3, Vendor A, 1.00, , 1.00, Indian Rupees, 1.0000000000]";

		System.out.println("actpurchasesList"+actpurchasesListR1);
		System.out.println("exppurchasesList"+exppurchasesListR1);

		
		ArrayList<String>  purchasesList2 = new ArrayList<String>(); 

		int count2=IQRecentStockTransactionPurchasesR2.size();

		System.err.println(count2);

		for(int i=0 ; i < count2 ;i++)
		{
			String data=IQRecentStockTransactionPurchasesR2.get(i).getText();
			purchasesList2.add(data);

		}

		String actpurchasesListR2 = purchasesList2.toString();
		String exppurchasesListR2 = "[21-07-2022, PurVou:9, BankACC, 1.00, , 1.00, Indian Rupees, 1.0000000000]";

		System.out.println("actpurchasesList"+actpurchasesListR2);
		System.out.println("exppurchasesList"+exppurchasesListR2);

		
		ArrayList<String>  purchasesList3 = new ArrayList<String>(); 

		int count3=IQRecentStockTransactionPurchasesR3.size();

		System.err.println(count3);

		for(int i=0 ; i < count3 ;i++)
		{
			String data=IQRecentStockTransactionPurchasesR3.get(i).getText();
			purchasesList3.add(data);

		}

		String actpurchasesListR3 = purchasesList3.toString();
		String exppurchasesListR3 = "[21-07-2022, PurVou:1, D1, 1.00, , 1.00, Indian Rupees, 1.0000000000]";

		System.out.println("actpurchasesList"+actpurchasesListR3);
		System.out.println("exppurchasesList"+exppurchasesListR3);

		
		ArrayList<String>  purchasesList4 = new ArrayList<String>(); 

		int count4=IQRecentStockTransactionPurchasesR4.size();

		System.err.println(count4);

		for(int i=0 ; i < count4 ;i++)
		{
			String data=IQRecentStockTransactionPurchasesR4.get(i).getText();
			purchasesList4.add(data);

		}

		String actpurchasesListR4 = purchasesList4.toString();
		String exppurchasesListR4 = "[21-07-2022, PurVou:8, D1, 1.00, , 1.00, Indian Rupees, 1.0000000000]";

		System.out.println("actpurchasesList"+actpurchasesListR4);
		System.out.println("exppurchasesList"+exppurchasesListR4);

		
		ArrayList<String>  purchasesList5 = new ArrayList<String>(); 

		int count5=IQRecentStockTransactionPurchasesR5.size();

		System.err.println(count5);

		for(int i=0 ; i < count5 ;i++)
		{
			String data=IQRecentStockTransactionPurchasesR5.get(i).getText();
			purchasesList5.add(data);

		}

		String actpurchasesListR5 = purchasesList5.toString();
		String exppurchasesListR5 = "[21-07-2022, PurVou:2, VendorACC, 1.00, , 1.00, Indian Rupees, 1.0000000000]";

		System.out.println("actpurchasesList"+actpurchasesListR5);
		System.out.println("exppurchasesList"+exppurchasesListR5);

		
		ArrayList<String>  purchasesList6 = new ArrayList<String>(); 

		int count6=IQRecentStockTransactionPurchasesR6.size();

		System.err.println(count6);

		for(int i=0 ; i < count6 ;i++)
		{
			String data=IQRecentStockTransactionPurchasesR6.get(i).getText();
			purchasesList6.add(data);

		}

		String actpurchasesListR6 = purchasesList6.toString();
		String exppurchasesListR6 = "[Quantity Purchased Till Date:, 7.00, , ]";

		System.out.println("actpurchasesList"+actpurchasesListR6);
		System.out.println("exppurchasesList"+exppurchasesListR6);
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(IQRecentStockPurchasesTransactionExpand));
		IQRecentStockPurchasesTransactionExpand.click();
		Thread.sleep(2000);
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(IQRecentStockSalessTransactionExpand));
		IQRecentStockSalessTransactionExpand.click();
		Thread.sleep(2000);
		
		
		ArrayList<String>  salesList1 = new ArrayList<String>(); 

		int Scount=IQRecentStockTransactionsalesR1.size();

		System.err.println(Scount);

		for(int i=0 ; i < Scount ;i++)
		{
			String data=IQRecentStockTransactionsalesR1.get(i).getText();
			salesList1.add(data);

		}

		String actsalesListR1 = salesList1.toString();
		String expsalesListR1 = "[25-07-2022, SalInv:2, BankACC, 1.00, , 1.00, Indian Rupees, 1.0000000000]";

		System.out.println("actsalesList"+actsalesListR1);
		System.out.println("expsalesList"+expsalesListR1);

		
		ArrayList<String>  salesList2 = new ArrayList<String>(); 

		int Scount2=IQRecentStockTransactionsalesR2.size();

		System.err.println(Scount2);

		for(int i=0 ; i < Scount2 ;i++)
		{
			String data=IQRecentStockTransactionsalesR2.get(i).getText();
			salesList2.add(data);

		}

		String actsalesListR2 = salesList2.toString();
		String expsalesListR2 = "[25-07-2022, SalInv:3, CashACC, 1.00, , 1.00, Indian Rupees, 1.0000000000]";

		System.out.println("actsalesList"+actsalesListR2);
		System.out.println("expsalesList"+expsalesListR2);

		
		ArrayList<String>  salesList3 = new ArrayList<String>(); 

		int Scount3=IQRecentStockTransactionsalesR3.size();

		System.err.println(Scount3);

		for(int i=0 ; i < Scount3 ;i++)
		{
			String data=IQRecentStockTransactionsalesR3.get(i).getText();
			salesList3.add(data);

		}

		String actsalesListR3 = salesList3.toString();
		String expsalesListR3 = "[21-07-2022, SalInv:1, H1, 2.00, , 2.00, Indian Rupees, 2.0000000000]";

		System.out.println("actsalesList"+actsalesListR3);
		System.out.println("expsalesList"+expsalesListR3);

		
		ArrayList<String>  salesList4 = new ArrayList<String>(); 

		int Scount4=IQRecentStockTransactionsalesR4.size();

		System.err.println(Scount4);

		for(int i=0 ; i < Scount4 ;i++)
		{
			String data=IQRecentStockTransactionsalesR4.get(i).getText();
			salesList4.add(data);

		}

		String actsalesListR4 = salesList4.toString();
		String expsalesListR4 = "[Quantity Sold Till Date:, 4.00, , ]";

		System.out.println("actsalesList"+actsalesListR4);
		System.out.println("expsalesList"+expsalesListR4);

		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(IQRecentStockSalessTransactionExpand));
		IQRecentStockSalessTransactionExpand.click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(IQBalanceByWarehouseTransactionExpand));
		IQBalanceByWarehouseTransactionExpand.click();
		
		Thread.sleep(2000);
		
		ArrayList<String>  WarehouseList1 = new ArrayList<String>(); 

		int Wcount=IQRecentStockTransactionWarehouseR1.size();

		System.err.println(Wcount);

		for(int i=0 ; i < Wcount ;i++)
		{
			String data=IQRecentStockTransactionWarehouseR1.get(i).getText();
			WarehouseList1.add(data);

		}

		String actWarehouseListR1 = WarehouseList1.toString();
		String expWarehouseListR1 = "[1, HYD, 1.00, 0.00, 1.00, 1.00, 1.00]";

		System.out.println("actWarehouseList"+actWarehouseListR1);
		System.out.println("expWarehouseList"+expWarehouseListR1);

		
		ArrayList<String>  WarehouseList2 = new ArrayList<String>(); 

		int Wcount2=IQRecentStockTransactionWarehouseR2.size();

		System.err.println(Wcount2);

		for(int i=0 ; i < Wcount2 ;i++)
		{
			String data=IQRecentStockTransactionWarehouseR2.get(i).getText();
			WarehouseList2.add(data);

		}

		String actWarehouseListR2 = WarehouseList2.toString();
		String expWarehouseListR2 = "[2, A1, 1.00, 0.00, 1.00, 1.00, 1.00]";

		System.out.println("actWarehouseList"+actWarehouseListR2);
		System.out.println("expWarehouseList"+expWarehouseListR2);

		
		ArrayList<String>  WarehouseList3 = new ArrayList<String>(); 

		int Wcount3=IQRecentStockTransactionWarehouseR3.size();

		System.err.println(Wcount3);

		for(int i=0 ; i < Wcount3 ;i++)
		{
			String data=IQRecentStockTransactionWarehouseR3.get(i).getText();
			WarehouseList3.add(data);

		}

		String actWarehouseListR3 = WarehouseList3.toString();
		String expWarehouseListR3 = "[3, D2, 1.00, 0.00, 1.00, 1.00, 1.00]";

		System.out.println("actWarehouseList"+actWarehouseListR3);
		System.out.println("expWarehouseList"+expWarehouseListR3);

		
		ArrayList<String>  WarehouseList4 = new ArrayList<String>(); 

		int Wcount4=IQRecentStockTransactionWarehouseR4.size();

		System.err.println(Wcount4);

		for(int i=0 ; i < Wcount4 ;i++)
		{
			String data=IQRecentStockTransactionWarehouseR4.get(i).getText();
			WarehouseList4.add(data);

		}

		String actWarehouseListR4 = WarehouseList4.toString();
		String expWarehouseListR4 = "[, , 3.00, 0.00, 3.00, , 3.00]";

		System.out.println("actWarehouseList"+actWarehouseListR4);
		System.out.println("expWarehouseList"+expWarehouseListR4);
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(IQBalanceByWarehouseTransactionExpand));
		IQBalanceByWarehouseTransactionExpand.click();
		
		Thread.sleep(2000);
		IQBalanceByBinsTransactionExpand.click();
		Thread.sleep(2000);
		
		ArrayList<String>  BinsList1 = new ArrayList<String>(); 

		int Bcount=IQRecentStockTransactionBinsR1.size();

		System.err.println(Bcount);

		for(int i=0 ; i < Bcount ;i++)
		{
			String data=IQRecentStockTransactionBinsR1.get(i).getText();
			BinsList1.add(data);

		}

		String actBinsListR1 = BinsList1.toString();
		String expBinsListR1 = "[1, BIN1, 4.00, 1.00, 4.00]";

		System.out.println("actBinsList"+actBinsListR1);
		System.out.println("expBinsList"+expBinsListR1);

		
		ArrayList<String>  BinsList2 = new ArrayList<String>(); 

		int Bcount2=IQRecentStockTransactionBinsR2.size();

		System.err.println(Bcount2);

		for(int i=0 ; i < Bcount2 ;i++)
		{
			String data=IQRecentStockTransactionBinsR2.get(i).getText();
			BinsList2.add(data);

		}

		String actBinsListR2 = BinsList2.toString();
		String expBinsListR2 = "[, 4.00, , 4.00]";

		System.out.println("actBinsList"+actBinsListR2);
		System.out.println("expBinsList"+expBinsListR2);


		if (actiq_OpeningStocks.equalsIgnoreCase(expiq_OpeningStocks) && actiq_PendingPurchaseOrders.equalsIgnoreCase(expiq_PendingPurchaseOrders)
    				&& actiq_CurrentStock.equalsIgnoreCase(expiq_CurrentStock) && actiq_PendingSalesOrders.equalsIgnoreCase(expiq_PendingSalesOrders)
    				&& actiq_AvgStockRate.equalsIgnoreCase(expiq_AvgStockRate) && actiq_QtyToBeOrdered.equalsIgnoreCase(expiq_QtyToBeOrdered)
    				&& actiq_Value.equalsIgnoreCase(expiq_Value)
			
			&&actpurchasesListR1.equalsIgnoreCase(exppurchasesListR1)&&actpurchasesListR2.equalsIgnoreCase(exppurchasesListR2)&&actpurchasesListR3.equalsIgnoreCase(exppurchasesListR3)
			&&actpurchasesListR4.equalsIgnoreCase(exppurchasesListR4)&&actpurchasesListR5.equalsIgnoreCase(exppurchasesListR5)
			&&actpurchasesListR6.equalsIgnoreCase(exppurchasesListR6)
			
			
			&&actsalesListR1.equalsIgnoreCase(expsalesListR1)&&actsalesListR2.equalsIgnoreCase(expsalesListR2)&&actsalesListR3.equalsIgnoreCase(expsalesListR3)
			&&actsalesListR4.equalsIgnoreCase(expsalesListR4)
			
			&&actWarehouseListR1.equalsIgnoreCase(expWarehouseListR1)&&actWarehouseListR2.equalsIgnoreCase(expWarehouseListR2)&&actWarehouseListR3.equalsIgnoreCase(expWarehouseListR3)
			&&actWarehouseListR4.equalsIgnoreCase(expWarehouseListR4)
		
			&&actBinsListR1.equalsIgnoreCase(expBinsListR1)&&actBinsListR2.equalsIgnoreCase(expBinsListR2))
		{
			
			return true;
			
		}
		else 
		{
			return false;
		}
		
		
	}
	
	
	public static boolean checkStockLedgerReport() throws InterruptedException
	{
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedger));
		stockLedger.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));

		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);
		

		ArrayList<String>  AllDatapage1 = new ArrayList<String>(); 

		int count=stockLedgerTable.size();

		System.err.println(count);

		for(int i=0 ; i < count ;i++)
		{
			String style= stockLedgerTable.get(i).getAttribute("style");
			if(style.contains("overflow: visible; font-weight: bold; background-color:"))
					{
				    String data=stockLedgerTable.get(i).getText();
				    AllDatapage1.add(data);
					}
		}

		String actAllDatapage1 = AllDatapage1.toString();
		String expAllDatapage1 = "[A1 [A101]]";

		System.out.println("actAllDatapage1"+actAllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);
		
		
		Thread.sleep(2500);
		report_NextBtn.click();
		
		Thread.sleep(2500);
		
		try{
			if(pageNum.getText().equalsIgnoreCase("4"))
					{
				report_PrevBtn.click();
				Thread.sleep(3000);
				report_PrevBtn.click();
					}
			
		}
		catch (Exception e) 
		{
			if(pageNum.getText().equalsIgnoreCase("3"))
			{
		report_PrevBtn.click();
	
			}
	
			System.out.println("Exception "+e);

		}

		ArrayList<String>  AllDatapage2 = new ArrayList<String>(); 

		int count2=stockLedgerTable.size();

		System.err.println(count2);

		for(int i=0 ; i < count2 ;i++)
		{
			String style= stockLedgerTable.get(i).getAttribute("style");
			if(style.contains("overflow: visible; font-weight: bold; background-color:"))
					{
				    String data=stockLedgerTable.get(i).getText();
				    AllDatapage2.add(data);
					}
			
		}

		String actAllDatapage2 = AllDatapage2.toString();
		String expAllDatapage2 = "[A2 [A102], APPLE [APP001], B1 [B201]]";

		System.out.println("actAllDatapage2"+actAllDatapage2);
		System.out.println("expAllDatapage2"+expAllDatapage2);
		
		
		Thread.sleep(2500);
		report_NextBtn.click();
		
		Thread.sleep(2500);
		
		try{
			if(pageNum.getText().equalsIgnoreCase("4"))
					{
				report_PrevBtn.click();
					}
			
		}
		catch (Exception e) 
		{
			
	
			System.out.println("Exception "+e);

		}
		
		
		ArrayList<String>  AllDatapage3 = new ArrayList<String>(); 

		int count3=stockLedgerTable.size();

		System.err.println(count3);

		for(int i=0 ; i < count3 ;i++)
		{
			String style= stockLedgerTable.get(i).getAttribute("style");
			if(style.contains("overflow: visible; font-weight: bold; background-color:"))
					{
				    String data=stockLedgerTable.get(i).getText();
				    AllDatapage3.add(data);
					}
	
		}

		String actAllDatapage3 = AllDatapage3.toString();
		String expAllDatapage3 = "[B2 [B202], D1 [D401], D2 [D402]]";

		System.out.println("actAllDatapage3"+actAllDatapage3);
		System.out.println("expAllDatapage3"+expAllDatapage3);
		
		Thread.sleep(2500);
		report_NextBtn.click();
		
		Thread.sleep(2500);
		
		
		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;
		
		Thread.sleep(2000);
		
		int rows1=getDriver().findElements(By.xpath("//table[@class='CommonReportTable']//tbody//tr")).size();
		
		for(  k=1;k<rows1;k++)
		{
			String text1=getDriver().findElement(By.xpath(beforePath + k + afterPath)).getText();
			
			if(text1.contains("Grand Total"))
			{
				int rowCount=(getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
				System.err.println("count"+rowCount);
			break;
			}	
			}
	
		int reportsRow1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Grand Total, , , , , , , , 44.00, 19.00, 13.00, 12.00, 31.00, 37.00, 13.00, 31.00, 38.00, , , ]";
		
		System.out.println("actRow1List"+actRow1List);
		System.out.println("expRow1List"+expRow1List);
		


		if (actAllDatapage1.equalsIgnoreCase(expAllDatapage1)&& actAllDatapage2.equalsIgnoreCase(expAllDatapage2)
				&& actAllDatapage3.equalsIgnoreCase(expAllDatapage3) &&actRow1List.equalsIgnoreCase(expRow1List))
		{
			return true;

		} 
		else 
		{
			return false;
		}
	}
	
	//4 records will be there and all the records are belongs to the stock transfers voucher when applied warehouse as hyd
	public static boolean checkFilterInStockLedger() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterExpandBtn));
		report_FilterExpandBtn.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
		report_FilterBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
		report_FilterCustomizeBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterWarehouseExpansion));
		report_FilterWarehouseExpansion.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterWarehouseNameChkbox));
		
		if (report_FilterWarehouseNameChkbox.isSelected()==false) 
		{
			report_FilterWarehouseNameChkbox.click();
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reports_Filter_Customize_OkBtn));
		reports_Filter_Customize_OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(osr_DefaultFilterTxt));
		osr_DefaultFilterTxt.click();
		osr_DefaultFilterTxt.sendKeys("HYD");
		
		Thread.sleep(2000);
		
		osr_DefaultFilterTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterOkBtn));
		report_FilterOkBtn.click();
		
		Thread.sleep(3000);
		
		ArrayList<String>  AllDatapage1 = new ArrayList<String>(); 

		int count1=stockLedgerTable.size();

		System.err.println(count1);

		for(int i=0 ; i < count1 ;i++)
		{
			String style= stockLedgerTable.get(i).getAttribute("style");
			if(style.contains("overflow: visible; font-weight: bold; background-color:"))
					{
				    String data=stockLedgerTable.get(i).getText();
				    AllDatapage1.add(data);
					}
	
		}

		String actAllDatapage1 = AllDatapage1.toString();
		String expAllDatapage1 = "[A1 [A101], A2 [A102], APPLE [APP001], D1 [D401]]";

		System.out.println("actAllDatapage1"+actAllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);
		
		
		
		
		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;
		
		Thread.sleep(2000);
		
		int rows1=getDriver().findElements(By.xpath("//table[@class='CommonReportTable']//tbody//tr")).size();
		
		for(  k=1;k<rows1;k++)
		{
			String text1=getDriver().findElement(By.xpath(beforePath + k + afterPath)).getText();
			
			if(text1.contains("Grand Total"))
			{
				int rowCount=(getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
				System.err.println("count"+rowCount);
			break;
			}	
			}
	
		int reportsRow1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Grand Total, , , , , , , , 4.00, 4.00, , , 4.00, 4.00, , 4.00, 4.00, , , ]";
		
		System.out.println("actRow1List"+actRow1List);
		System.out.println("expRow1List"+expRow1List);
		
		
		if (actAllDatapage1.equalsIgnoreCase(expAllDatapage1) && actRow1List.equalsIgnoreCase(expRow1List)) 
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
   	
	public static boolean checkOpeningStockRegisterReport() throws InterruptedException
	{
		Thread.sleep(2000);
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksRegister));
		openingStocksRegister.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(2000);
		
	
		int reportsRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}
			
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[A1, 1.00, 1.00, 1.00, BIN1-1.00, D2]";
		
		

		int reportsRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow2ListArray.add(data);
			}
			
			
		}
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[D1, 1.00, 1.00, 1.00, 51515151, D2]";
	

		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow3ListArray.add(data);
			}
		
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[A2, 1.00, 1.00, 1.00, BIN1-1.00, D2]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow4ListArray.add(data);
			}
			
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[APPLE, 1.00, 1.00, 1.00, ASA, D2]";
		
		
		
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText().trim();
			
			if(data.isEmpty() == false)
			{
				reportsRow5ListArray.add(data);
			}
				}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[D2, 1.00, 1.00, 1.00, dds15, D2]";
		
		
		
		int reportsRow6ListCount = reportsRow6List.size();
		ArrayList<String> reportsRow6ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow6ListCount;i++)
		{
			String data = reportsRow6List.get(i).getText().trim();
			
			if(data.isEmpty() == false)
			{
				reportsRow6ListArray.add(data);
			}
			
		}
		String actRow6List = reportsRow6ListArray.toString();
		String expRow6List = "[B1, 1.00, 1.00, 1.00, BIN1-1.00, D2]";
		
		
		
		int reportsRow7ListCount = reportsRow7List.size();
		ArrayList<String> reportsRow7ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow7ListCount;i++)
		{
			String data = reportsRow7List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow7ListArray.add(data);
			}
			
		
		}
		String actRow7List = reportsRow7ListArray.toString();
		String expRow7List = "[B2, 1.00, 1.00, 1.00, BIN1-1.00, D2]";
		
		
		
		int reportsRow8ListCount = reportsRow8List.size();
		ArrayList<String> reportsRow8ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow8ListCount;i++)
		{
			String data = reportsRow8List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow8ListArray.add(data);
			}
		
		}
		String actRow8List = reportsRow8ListArray.toString();
		String expRow8List = "[Grand Total, 7.00, 7.00, 7.00]";
		
		

		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		System.out.println(actRow2List);
		System.out.println(expRow2List);
		
		System.out.println(actRow3List);
		System.out.println(expRow3List);
		
		System.out.println(actRow4List);
		System.out.println(expRow4List);
		
		System.out.println(actRow5List);
		System.out.println(expRow5List);
		
		System.out.println(actRow6List);
		System.out.println(expRow6List);
		
		System.out.println(actRow7List);
		System.out.println(expRow7List);
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
					&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
					&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}	
		
	}
	
	public static boolean checkStockStatementReport() throws InterruptedException
	{
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockStatement));
		stockStatement.click();
		
		Thread.sleep(2000);
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));

		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);
		
		ArrayList<String>  AllDatapage1 = new ArrayList<String>(); 

		int count1=stockLedgerTable.size();

		System.err.println(count1);

		for(int i=0 ; i < count1 ;i++)
		{
			String style= stockLedgerTable.get(i).getAttribute("style");
			if(style.contains("overflow: visible; font-weight: bold; background-color:"))
					{
				    String data=stockLedgerTable.get(i).getText();
				    AllDatapage1.add(data);
					}
	
		}

		String actAllDatapage1 = AllDatapage1.toString();
		String expAllDatapage1 = "[APPLE [APP001], A1 [A101], A2 [A102], B1 [B201], B2 [B202]]";

		System.out.println("actAllDatapage1"+actAllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);
		
		Thread.sleep(2000);
		report_NextBtn.click();
		Thread.sleep(2000);
		
		ArrayList<String>  AllDatapage2 = new ArrayList<String>(); 

		int count2=stockLedgerTable.size();

		System.err.println(count2);

		for(int i=0 ; i < count2 ;i++)
		{
			String style= stockLedgerTable.get(i).getAttribute("style");
			if(style.contains("overflow: visible; font-weight: bold; background-color:"))
					{
				    String data=stockLedgerTable.get(i).getText();
				    AllDatapage2.add(data);
					}
	
		}

		String actAllDatapage2 = AllDatapage2.toString();
		String expAllDatapage2 = "[D1 [D401], D2 [D402]]";

		System.out.println("actAllDatapage2"+actAllDatapage2);
		System.out.println("expAllDatapage2"+expAllDatapage2);
		
		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;
		
		Thread.sleep(2000);
		
		int rows1=getDriver().findElements(By.xpath("//table[@class='CommonReportTable']//tbody//tr")).size();
		
		for(  k=1;k<rows1;k++)
		{
			String text1=getDriver().findElement(By.xpath(beforePath + k + afterPath)).getText();
			
			if(text1.contains("Grand Total"))
			{
				int rowCount=(getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
				System.err.println("count"+rowCount);
			break;
			}	
			}
	
		int reportsRow1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Grand Total, 39.00, 37.00, 13.00, 31.00, 31.00, , , , ]";
		
		System.out.println("actRow1List"+actRow1List);
		System.out.println("expRow1List"+expRow1List);
		
		if (actAllDatapage1.equalsIgnoreCase(expAllDatapage1) &&  actAllDatapage2.equalsIgnoreCase(expAllDatapage2) && actRow1List.equalsIgnoreCase(expRow1List))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
	}
	
	
	public static boolean checkPrintOptionInStockStatements() throws IOException, InterruptedException, AWTException
	{
		Thread.sleep(5000);

		File Efile=new File(getBaseDir()+"\\autoIt\\ExportFiles\\stockStatements.pdf");
		
		if(Efile.exists())
		{
			Efile.delete();
		}
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
		sl_ReportPrintBtn.click();
		
		Thread.sleep(3000);
		
		try{
			if(getIsAlertPresent())
			{
				String altetText = getAlert().getText();
				System.out.println("altetText"+altetText);
				getAlert().accept();
			}
		}
		catch (Exception e) 
		{
			System.out.println("Exception"+e);
		}
		
		 
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
			
		Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\StockStatementsPrintSaving.exe");
		
		Thread.sleep(5000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		
		ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
			
		int actOpenWindowsCount = getDriver().getWindowHandles().size();
		int expOpenWindowsCount = 3;
		
		System.out.println("Number of Windows  : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
		
		Thread.sleep(1000);

	 	getDriver().switchTo().window(openTabs.get(2)).close();
	 	Thread.sleep(1000);
	 	getDriver().switchTo().window(openTabs.get(1)).close();
	 	Thread.sleep(1000);
	 	getDriver().switchTo().window(openTabs.get(0));
	 	
	 	
	 	String actPDF = getBaseDir()+"\\autoIt\\ExportFiles\\stockStatements.pdf";
		String expPDF = getBaseDir()+"\\autoIt\\ImportFiles\\stockStatements.pdf";
		
		PDFUtil pdfutil = new PDFUtil();
		
		boolean result = pdfutil.compare(actPDF, expPDF);
		
		String actData = pdfutil.getText(actPDF);
		String expData = pdfutil.getText(expPDF).replaceAll("18/10/2022", getCurrentDateF2());
		
		System.err.println(actData);
		System.err.println(expData);
		
		System.out.println("Compared Result  : "+result);
		
		if (actData.equalsIgnoreCase(expData) /*&& result==true*/) 
		{
			return true;
		}
		else
		{
			return false;
		}
	
	
	}

	public static boolean checkStockMovementReport() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockMovement));
		stockMovement.click();
		
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));

		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);
		

		Thread.sleep(3000);
		
	
		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}
			
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Apple, A1, A2, B1, B2, D1, D2, Grand Total]";
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;
		
		Thread.sleep(2000);
		
		int rows1=getDriver().findElements(By.xpath("//table[@class='CommonReportTable']//tbody//tr")).size();
		
		for(  k=1;k<rows1;k++)
		{
			String text1=getDriver().findElement(By.xpath(beforePath + k + afterPath)).getText();
			
			if(text1.contains("Grand Total"))
			{
				int rowCount=(getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
				System.err.println("count"+rowCount);
			break;
			}	
			}
	
		int reportsRowListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRowListArray = new ArrayList<String>();
		for(int i=1;i<reportsRowListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			reportsRowListArray.add(data);
		}
		String actRowList = reportsRowListArray.toString();
		String expRowList = "[Grand Total, 7.00, 7.00, 37.00, 37.00, 13.00, 13.00, 31.00, 31.00, 7.00, , , ]";
		
		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
		
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRowList.equalsIgnoreCase(expRowList)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}	
		
		
	}
	
	public static boolean checkVirtualStockAnalysisReport() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(virtualStockAnalysis));
		virtualStockAnalysis.click();
		
		Thread.sleep(2000);
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));

		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);
		

		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}
			
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[A1, A2, APPLE, B1, B2, D1, D2, Grand Total]";
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;
		
		Thread.sleep(2000);
		
		int rows1=getDriver().findElements(By.xpath("//table[@class='CommonReportTable']//tbody//tr")).size();
		
		for(  k=1;k<rows1;k++)
		{
			String text1=getDriver().findElement(By.xpath(beforePath + k + afterPath)).getText();
			
			if(text1.contains("Grand Total"))
			{
				int rowCount=(getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
				System.err.println("count"+rowCount);
			break;
			}	
			}
	
		int reportsRowListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRowListArray = new ArrayList<String>();
		for(int i=1;i<reportsRowListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			reportsRowListArray.add(data);
		}
		String actRowList = reportsRowListArray.toString();
		String expRowList = "[Grand Total, 31.00, , , , 31.00]";
		
		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
		
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRowList.equalsIgnoreCase(expRowList)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}	

		
	}
	
	public static boolean checkStockValuationReportByProduct() throws InterruptedException
	{
		getDriver().navigate().refresh();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockValuation));
		stockValuation.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));

		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		Select sdd=new Select(stockValuationDropdwon);
		sdd.selectByVisibleText("by Product");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);

		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount-1;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		Iterator<String> itr = reportsRow1ListArray.iterator();
		while (itr.hasNext()) 
		{ 
			String row1 = itr.next(); 
			if (row1.equals("Sub Total"))
			{ 
				itr.remove();
			}

		}

		
		
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[APPLE, A, A1, A2, B, B1, B2, D, D1, D2]";

		System.out.println("ActualItems:"+actRow1List);
		System.out.println("ExpectedItems:"+expRow1List);

		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;

		Thread.sleep(2000);

		int rows1=getDriver().findElements(By.xpath("//table[@class='CommonReportTable']//tbody//tr")).size();

		for(  k=1;k<rows1;k++)
		{
			String text1=getDriver().findElement(By.xpath(beforePath + k + afterPath)).getText();

			if(text1.contains("Grand Total"))
			{
				int rowCount=(getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
				System.err.println("count"+rowCount);
				break;
			}	
		}

		int reportsRowListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRowListArray = new ArrayList<String>();
		for(int i=1;i<reportsRowListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			reportsRowListArray.add(data);
		}
		String actRowList = reportsRowListArray.toString();
		String expRowList = "[Grand Total, , , 31.00, 31.00, 7.00, , ]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);


		if (actRow1List.equalsIgnoreCase(expRow1List) && actRowList.equalsIgnoreCase(expRowList)) 
		{
			sl_CloseBtn.click();
			return true;
		} 
		else 
		{
			sl_CloseBtn.click();
			return false;
		}	

	}
	
	public static boolean checkStockValuationReportByProductByInventoryTag() throws InterruptedException
	{

		Select sdd=new Select(stockValuationDropdwon);
		sdd.selectByVisibleText("by Product by Inventory tag");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);

		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount-1;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		Iterator<String> itr = reportsRow1ListArray.iterator();
		while (itr.hasNext()) 
		{ 
			String row1 = itr.next(); 
			if (row1.equals("Sub Total"))
			{ 
				itr.remove();
			}

		}

		
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[APPLE, APPLE, APPLE, A, A1, A1, A2, A2, A1, B, B2, B1, B1, B2]";

		System.out.println("ActualItems:"+actRow1List);
		System.out.println("ExpectedItems:"+expRow1List);
		
		int reportsRow8ListCount = reportsCol7List.size();
		ArrayList<String> reportsRow8ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow8ListCount;i++)
		{
			String data = reportsCol7List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow8ListArray.add(data);
			}

		}
		String actRow8List = reportsRow8ListArray.toString();
		String expRow8List = "[A1, D2, HYD, A1, D2, D2, HYD, HYD, A1, A1, D2, D2]";

		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		Thread.sleep(2000);
		report_NextBtn.click();
		Thread.sleep(2000);
		
		int reportspage2Row1ListCount = reportsCol1List.size();
		ArrayList<String> reportspage2Row1ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage2Row1ListCount-1;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row1ListArray.add(data);
			}

		}
		
		Iterator<String> itr1 = reportspage2Row1ListArray.iterator();
		while (itr1.hasNext()) 
		{ 
			String row1 = itr1.next(); 
			if (row1.equals("Sub Total"))
			{ 
				itr1.remove();
			}

		}
		
		
		String actpage2Row1List = reportspage2Row1ListArray.toString();
		String exppage2Row1List = "[D2, D1, D1, D2, D1]";

		System.out.println(actpage2Row1List);
		System.out.println(exppage2Row1List);
		
		
		int reportspage2Row8ListCount = reportsCol7List.size();
		ArrayList<String> reportspage2Row8ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage2Row8ListCount;i++)
		{
			String data = reportsCol7List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row8ListArray.add(data);
			}

		}
		String actpage2Row8List = reportspage2Row8ListArray.toString();
		String exppage2Row8List = "[A1, A1, D2, D2, HYD]";

		System.out.println(actpage2Row8List);
		System.out.println(exppage2Row8List);
		
		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;

		Thread.sleep(2000);

		int rows1=getDriver().findElements(By.xpath("//table[@class='CommonReportTable']//tbody//tr")).size();

		for(  k=1;k<rows1;k++)
		{
			String text1=getDriver().findElement(By.xpath(beforePath + k + afterPath)).getText();

			if(text1.contains("Grand Total"))
			{
				int rowCount=(getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
				System.err.println("count"+rowCount);
				break;
			}	
		}

		int reportsRowListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRowListArray = new ArrayList<String>();
		for(int i=1;i<reportsRowListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			reportsRowListArray.add(data);
		}
		String actRowList = reportsRowListArray.toString();
		String expRowList = "[Grand Total, , , 31.00, 31.00, 17.00, , ]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow8List.equalsIgnoreCase(expRow8List) &&actpage2Row1List.equalsIgnoreCase(exppage2Row1List) &&
				actpage2Row8List.equalsIgnoreCase(exppage2Row8List) && actRowList.equalsIgnoreCase(expRowList)) 
		{
			sl_CloseBtn.click();
			return true;
		} 
		else 
		{
			sl_CloseBtn.click();
			return false;
		}	

		
	}
	
	
	public static boolean checkStockValuationReportByInventoryByProduct() throws InterruptedException
	{
		Select sdd=new Select(stockValuationDropdwon);
		sdd.selectByVisibleText("by Inventory tag by product");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);

		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount-1;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				
				reportsRow1ListArray.add(data);
			}

		}
		
		Iterator<String> itr = reportsRow1ListArray.iterator();
		while (itr.hasNext()) 
		{ 
			String row1 = itr.next(); 
			if (row1.equals("Sub Total"))
			{ 
				itr.remove();
			}
			
			if (row1.equals("HYD"))
			{ 
				itr.remove();
			}

		}

	
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[A1, A1, APPLE, B1, B2, D1, D2, D2, A1, A2, APPLE, B1, B2, D1, D2]";

		System.out.println("ActualItems  :"+actRow1List);
		System.out.println("ExpectedItems:"+expRow1List);
		
		
		int reportsRow8ListCount = reportsCol7List.size();
		ArrayList<String> reportsRow8ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow8ListCount;i++)
		{
			String data = reportsCol7List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow8ListArray.add(data);
			}

		}
		String actRow8List = reportsRow8ListArray.toString();
		String expRow8List = "[A1, A1, A1, A1, A1, A1, D2, D2, D2, D2, D2, D2, D2]";

		System.out.println(actRow8List);
		System.out.println(expRow8List);
		Thread.sleep(2000);
		report_NextBtn.click();
		Thread.sleep(2000);
		
		int reportspage2Row1ListCount = reportsCol1List.size();
		ArrayList<String> reportspage2Row1ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage2Row1ListCount-1;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row1ListArray.add(data);
			}

		}
		
		Iterator<String> itr1 = reportspage2Row1ListArray.iterator();
		while (itr1.hasNext()) 
		{ 
			String row1 = itr1.next(); 
			if (row1.equals("Sub Total"))
			{ 
				itr1.remove();
			}

		}
		
		
		String actpage2Row1List = reportspage2Row1ListArray.toString();
		String exppage2Row1List = "[A1, A2, APPLE, D1]";

		System.out.println(actpage2Row1List);
		System.out.println(exppage2Row1List);
		
		
		int reportspage2Row8ListCount = reportsCol7List.size();
		ArrayList<String> reportspage2Row8ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage2Row8ListCount;i++)
		{
			String data = reportsCol7List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row8ListArray.add(data);
			}

		}
		String actpage2Row8List = reportspage2Row8ListArray.toString();
		String exppage2Row8List = "[HYD, HYD, HYD, HYD]";

		System.out.println(actpage2Row8List);
		System.out.println(exppage2Row8List);
		
		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;

		Thread.sleep(2000);

		int rows1=getDriver().findElements(By.xpath("//table[@class='CommonReportTable']//tbody//tr")).size();

		for(  k=1;k<rows1;k++)
		{
			String text1=getDriver().findElement(By.xpath(beforePath + k + afterPath)).getText();

			if(text1.contains("Grand Total"))
			{
				int rowCount=(getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
				System.err.println("count"+rowCount);
				break;
			}	
		}

		int reportsRowListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRowListArray = new ArrayList<String>();
		for(int i=1;i<reportsRowListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			reportsRowListArray.add(data);
		}
		String actRowList = reportsRowListArray.toString();
		String expRowList = "[Grand Total, , , 31.00, 31.00, 17.00, , ]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actpage2Row1List.equalsIgnoreCase(exppage2Row1List) &&
				actpage2Row8List.equalsIgnoreCase(exppage2Row8List) && actRow8List.equalsIgnoreCase(expRow8List) 
				&& actRowList.equalsIgnoreCase(expRowList)) 
		{
			sl_CloseBtn.click();
			return true;
		} 
		else 
		{
			sl_CloseBtn.click();
			return false;
		}	

	
	}
	
	public static boolean checkStockReprtByTagReport() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockReportByTag));
		stockReportByTag.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));

		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);
		

		Thread.sleep(2000);

		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount-1;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[APPLE, A, A1, A2, B, B1, B2, D, D1, D2]";

		System.out.println("ActualItems  :"+actRow1List);
		System.out.println("ExpectedItems:"+expRow1List);

		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;

		Thread.sleep(2000);

		int rows1=getDriver().findElements(By.xpath("//table[@class='CommonReportTable']//tbody//tr")).size();

		for(  k=1;k<rows1;k++)
		{
			String text1=getDriver().findElement(By.xpath(beforePath + k + afterPath)).getText();

			if(text1.contains("Grand Total"))
			{
				int rowCount=(getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
				System.err.println("count"+rowCount);
				break;
			}	
		}

		int reportsRowListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRowListArray = new ArrayList<String>();
		for(int i=1;i<reportsRowListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText().trim();
			if (data.isEmpty() == false) 
			{
				reportsRowListArray.add(data);
			}
			
		}
		String actRowList = reportsRowListArray.toString();
		String expRowList = "[Grand Total, 18.00, 2.00, 18.00, 3.00, 2.00, 3.00, 10.00, 2.00, 10.00, 5.00, 2.00, 5.00]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);


		if (actRow1List.equalsIgnoreCase(expRow1List) && actRowList.equalsIgnoreCase(expRowList)) 
		{
			sl_CloseBtn.click();
			return true;
		} 
		else 
		{
			sl_CloseBtn.click();
			return false;
		}	

	}
	
	public static boolean checkStockValuationByFATagReport() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockValuationByFATagReport));
		stockValuationByFATagReport.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));

		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);
		

		Thread.sleep(2000);

		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount-1;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		Iterator<String> itr1 = reportsRow1ListArray.iterator();
		while (itr1.hasNext()) 
		{ 
			String row1 = itr1.next(); 
			if (row1.equals("Sub Total"))
			{ 
				itr1.remove();
			}

		}
		
		
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[APPLE, A1, A2, B1, B2, D1, D2, A1, APPLE, A1, A2, B1, B2, D1, D2]";

		System.out.println("ActualItems  :"+actRow1List);
		System.out.println("ExpectedItems:"+expRow1List);
		
		Thread.sleep(2000);
		report_NextBtn.click();
		Thread.sleep(2000);
		

		int reportsPage2Row1ListCount = reportsCol1List.size();
		ArrayList<String> reportsPage2Row1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsPage2Row1ListCount-1;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsPage2Row1ListArray.add(data);
			}

		}
		
		Iterator<String> itr2 = reportsPage2Row1ListArray.iterator();
		while (itr2.hasNext()) 
		{ 
			String Page2Row1 = itr2.next(); 
			if (Page2Row1.equals("Sub Total"))
			{ 
				itr2.remove();
			}

		}
		
		
		String actPage2Row1List = reportsPage2Row1ListArray.toString();
		String expPage2Row1List = "[D2, D2]";

		System.out.println("ActualItems  :"+actPage2Row1List);
		System.out.println("ExpectedItems:"+expPage2Row1List);
		
		
		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;

		Thread.sleep(2000);

		int rows1=getDriver().findElements(By.xpath("//table[@class='CommonReportTable']//tbody//tr")).size();

		for(  k=1;k<rows1;k++)
		{
			String text1=getDriver().findElement(By.xpath(beforePath + k + afterPath)).getText();

			if(text1.contains("Grand Total"))
			{
				int rowCount=(getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
				System.err.println("count"+rowCount);
				break;
			}	
		}

		int reportsRowListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRowListArray = new ArrayList<String>();
		for(int i=1;i<reportsRowListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			reportsRowListArray.add(data);
		}
		String actRowList = reportsRowListArray.toString();
		String expRowList = "[Grand Total, , 29.00, 15.00, 30.00]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
		
		if (actRow1List.equalsIgnoreCase(expRow1List)&& actPage2Row1List.equalsIgnoreCase(expPage2Row1List) && actRowList.equalsIgnoreCase(expRowList)) 
		{
			sl_CloseBtn.click();
			return true;
		} 
		else 
		{
			sl_CloseBtn.click();
			return false;
		}	
		
	}
	
	public static boolean checkABCAnalysisReport() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(abcAnalysis));
		abcAnalysis.click();
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));

		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);
		

		Thread.sleep(2000);

		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[A Product, D2, APPLE, A1, B2, B1, A2, D1, Grand Total]";

		System.out.println("ActualItems  :"+actRow1List);
		System.out.println("ExpectedItems:"+expRow1List);
		
		Thread.sleep(2000);

		int reportsRow2ListCount = reportsCol2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow2ListArray.add(data);
			}

		}
		
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[3.00, 9.00, 3.00, 2.00, 2.00, 2.00, 10.00, 31.00]";

		System.out.println("ActualItems  :"+actRow2List);
		System.out.println("ExpectedItems:"+expRow2List);
		
		Thread.sleep(2000);

		int reportsRow3ListCount = reportsCol3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow3ListArray.add(data);
			}

		}
		
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3.00, 9.00, 3.00, 2.00, 2.00, 2.00, 10.00, 31.00]";

		System.out.println("ActualItems  :"+actRow3List);
		System.out.println("ExpectedItems:"+expRow3List);
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List))
		{
			return true;
		} 
		else
		{
			return false;
		}
	}
	
	public static boolean checkStockAnalysisByBatchReport() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		
		getAction().sendKeys(Keys.END).build().perform();
		
		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", stockAnalysisByBatch);
		getAction().moveToElement(stockAnalysisByBatch).build().perform();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockAnalysisByBatch));
		stockAnalysisByBatch.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));

		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);
		

		Thread.sleep(2000);

		int reportsRow1ListCount = reportsrow1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportsrow1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[APP001, APPLE, 1, 8.00, 1.00, 8.00, 0, 0]";

		System.out.println("ActualItems  :"+actRow1List);
		System.out.println("ExpectedItems:"+expRow1List);
		
		Thread.sleep(2000);

		int reportsRow2ListCount = reportsrow2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow2ListCount;i++)
		{
			String data = reportsrow2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow2ListArray.add(data);
			}

		}
		
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[APP001, APPLE, ASA, 1.00, 1.00, 1.00, 0, 0]";

		System.out.println("ActualItems  :"+actRow2List);
		System.out.println("ExpectedItems:"+expRow2List);
		
		Thread.sleep(2000);

		int reportsRow3ListCount = reportsrow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow3ListCount;i++)
		{
			String data = reportsrow3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow3ListArray.add(data);
			}

		}
		
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[Grand Total, 9.00, 2.00, 9.00]";

		System.out.println("ActualItems  :"+actRow3List);
		System.out.println("ExpectedItems:"+expRow3List);
		
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List))
		{
			return true;
		} 
		else
		{
			return false;
		}

	}
	
	public static boolean checkStockAgeingAnalysisByRMAReport() throws InterruptedException
	{
		searchBtnInput.click();
		searchBtnInput.sendKeys("Ageing Analysis by RMA");
		Thread.sleep(1500);
		searchBtnInput.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(2000);
		
		Thread.sleep(2000);

		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount-1;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		Iterator<String> itr = reportsRow1ListArray.iterator();
		while (itr.hasNext()) 
		{ 
			String row1 = itr.next(); 
			if (row1.equals("Sub Total"))
			{ 
				itr.remove();
			}

		}

		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[D1 D401, 51515151, D1-1, D1-10, D1-3, D1-4, D1-5, D1-6, D1-7, D1-8, D1-9, D2 D402]";

		System.out.println("ActualItems  :"+actRow1List);
		System.out.println("ExpectedItems:"+expRow1List);
		
		Thread.sleep(2000);
		
		int reportsRow12ListCount = report12throw.size();
		ArrayList<String> reportsRow12ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow12ListCount;i++)
		{
			String data = report12throw.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow12ListArray.add(data);
			}
		
		}
		String actRow12List = reportsRow12ListArray.toString();
		String expRow12List = "[10.00, 10.00, 9.00, 9.00, 1.00, 1.00]";
		
		System.out.println("actual Subtotal  :"+actRow12List);
		System.out.println("Expected Subtotal:"+expRow12List);
		
	/*	
		int reportsRow17ListCount = report17throw.size();
		ArrayList<String> reportsRow17ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow17ListCount;i++)
		{
			String data = report17throw.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow17ListArray.add(data);
			}
			
		}
		String actRow17List = reportsRow17ListArray.toString();
		String expRow17List = "[3.00, 3.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";
		
		System.out.println("actual Subtotal  :"+actRow17List);
		System.out.println("Expected Subtotal:"+expRow17List);
		*/
		Thread.sleep(2000);
		
		report_NextBtn.click();
		Thread.sleep(2000);
		
		int reportsPage2Row1ListCount = reportsCol1List.size();
		ArrayList<String> reportsPage2Row1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsPage2Row1ListCount-1;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsPage2Row1ListArray.add(data);
			}

		}
		
		Iterator<String> itr1 = reportsPage2Row1ListArray.iterator();
		while (itr1.hasNext()) 
		{ 
			String Page2Row1 = itr1.next(); 
			if (Page2Row1.equals("Sub Total"))
			{ 
				itr1.remove();
			}

		}

		String actPage2Row1List = reportsPage2Row1ListArray.toString();
		String expPage2Row1List = "[D1 D401, 51515151, D1-1, D1-10, D1-3, D1-4, D1-5, D1-6, D1-7, D1-8, D1-9, D2 D402]";

		System.out.println("ActualItems  :"+actPage2Row1List);
		System.out.println("ExpectedItems:"+expPage2Row1List);
		
		Thread.sleep(2000);
		


		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;

		Thread.sleep(2000);

		int rows1=getDriver().findElements(By.xpath("//table[@class='CommonReportTable']//tbody//tr")).size();

		for(  k=1;k<rows1;k++)
		{
			String text1=getDriver().findElement(By.xpath(beforePath + k + afterPath)).getText();

			if(text1.contains("Grand Total"))
			{
				int rowCount=(getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
				System.err.println("count"+rowCount);
				break;
			}	
		}

		int reportsRowListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRowListArray = new ArrayList<String>();
		for(int i=1;i<reportsRowListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText().trim();
			if (data.isEmpty() == false) 
			{
				reportsRowListArray.add(data);
			}
			
		}
		String actRowList = reportsRowListArray.toString();
		String expRowList = "[Grand Total, 13.00, 13.00, 1.00, 1.00, 10.00, 10.00, 2.00, 2.00]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
		

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow12List.equalsIgnoreCase(expRow12List) 
					/*&& actRow17List.equalsIgnoreCase(expRow17List)*/&& actRowList.equalsIgnoreCase(expRowList)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
	}
	
	public static boolean checkStockDetailsByBins() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		Thread.sleep(2000);
		getAction().sendKeys(Keys.END).build().perform();
		Thread.sleep(1200);
		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", binsReportMenu);
		getAction().moveToElement(binsReportMenu).build().perform();
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsReportMenu));
		binsReportMenu.click();
		
		scrollToElementJSE(stockDetailsByBins);
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockDetailsByBins));
		stockDetailsByBins.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));

		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);
		

		Thread.sleep(2000);
		

		Thread.sleep(2000);

		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount-1;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		Iterator<String> itr = reportsRow1ListArray.iterator();
		while (itr.hasNext()) 
		{ 
			String row1 = itr.next(); 
			if (row1.equals("Sub Total"))
			{ 
				itr.remove();
			}

		}

		
		
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[A1 [A101], BIN1, A2 [A102], BIN1, BIN2, B1 [B201], BIN1, B2 [B202], BIN1]";

		System.out.println("ActualItems  :"+actRow1List);
		System.out.println("ExpectedItems:"+expRow1List);
		
		Thread.sleep(2000);

		Thread.sleep(2000);


		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;

		Thread.sleep(2000);

		int rows1=getDriver().findElements(By.xpath("//table[@class='CommonReportTable']//tbody//tr")).size();

		for(  k=1;k<rows1;k++)
		{
			String text1=getDriver().findElement(By.xpath(beforePath + k + afterPath)).getText();

			if(text1.contains("Grand Total"))
			{
				int rowCount=(getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
				System.err.println("count"+rowCount);
				break;
			}	
		}

		int reportsRowListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRowListArray = new ArrayList<String>();
		for(int i=1;i<reportsRowListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText().trim();
			if (data.isEmpty() == false) 
			{
				reportsRowListArray.add(data);
			}
			
		}
		String actRowList = reportsRowListArray.toString();
		String expRowList = "[Grand Total, 7.00, 7.00]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRowList.equalsIgnoreCase(expRowList))
		{
			return true;
		} 
		else
		{
			return false;
		}

		
	}
	
	public static boolean checkStockBlanceByBinsReport() throws InterruptedException
	{
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		Thread.sleep(2000);
		
		Thread.sleep(2000);
	getAction().sendKeys(Keys.END).build().perform();
		
		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", binsReportMenu);
		getAction().moveToElement(binsReportMenu).build().perform();
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsReportMenu));
		binsReportMenu.click();
		
		scrollToElementJSE(stockBalancesByBins);
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockBalancesByBins));
		stockBalancesByBins.click();
		

		Thread.sleep(2000);

		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));

		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);
		

		Thread.sleep(2000);

		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount-1;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		Iterator<String> itr = reportsRow1ListArray.iterator();
		while (itr.hasNext()) 
		{ 
			String row1 = itr.next(); 
			if (row1.equals("Sub Total"))
			{ 
				itr.remove();
			}

		}

		
		
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[BIN2 [BIN2], A2, BIN1 [BIN1], A1, A2, B1, B2]";

		System.out.println("ActualItems  :"+actRow1List);
		System.out.println("ExpectedItems:"+expRow1List);
		
		Thread.sleep(2000);

		Thread.sleep(2000);


		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;

		Thread.sleep(2000);

		int rows1=getDriver().findElements(By.xpath("//table[@class='CommonReportTable']//tbody//tr")).size();

		for(  k=1;k<rows1;k++)
		{
			String text1=getDriver().findElement(By.xpath(beforePath + k + afterPath)).getText();

			if(text1.contains("Grand Total"))
			{
				int rowCount=(getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
				System.err.println("count"+rowCount);
				break;
			}	
		}

		int reportsRowListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRowListArray = new ArrayList<String>();
		for(int i=1;i<reportsRowListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText().trim();
			if (data.isEmpty() == false) 
			{
				reportsRowListArray.add(data);
			}
			
		}
		String actRowList = reportsRowListArray.toString();
		String expRowList = "[Grand Total, 7.00, 7.00]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRowList.equalsIgnoreCase(expRowList))
		{
			return true;
		} 
		else
		{
			return false;
		}

		
	
	}
	
	public static boolean checkStockBalanceByItemsByBinsReport() throws InterruptedException
	{

		
		searchBtnInput.click();
		searchBtnInput.sendKeys("Stock Balances by Item by Bins");
		Thread.sleep(1500);
		searchBtnInput.sendKeys(Keys.ENTER);
		/*
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		Thread.sleep(2000);
		
		
		Thread.sleep(2000);
	getAction().sendKeys(Keys.END).build().perform();
		
		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", binsReportMenu);
		getAction().moveToElement(binsReportMenu).build().perform();
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsReportMenu));
		binsReportMenu.click();
		
		getAction().moveToElement(stockBalancesByItemByBins).build().perform();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockBalancesByItemByBins));
		stockBalancesByItemByBins.click();
		

		Thread.sleep(2000);

		Thread.sleep(2000);*/
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));

		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);
		

		Thread.sleep(2000);

		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount-1;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		Iterator<String> itr = reportsRow1ListArray.iterator();
		while (itr.hasNext()) 
		{ 
			String row1 = itr.next(); 
			if (row1.equals("Sub Total"))
			{ 
				itr.remove();
			}

		}

		
		
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[A1 [A101], BIN1, A2 [A102], BIN1, BIN2, B1 [B201], BIN1, B2 [B202], BIN1]";

		System.out.println("ActualItems  :"+actRow1List);
		System.out.println("ExpectedItems:"+expRow1List);
		
		Thread.sleep(2000);

		Thread.sleep(2000);


		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;

		Thread.sleep(2000);

		int rows1=getDriver().findElements(By.xpath("//table[@class='CommonReportTable']//tbody//tr")).size();

		for(  k=1;k<rows1;k++)
		{
			String text1=getDriver().findElement(By.xpath(beforePath + k + afterPath)).getText();

			if(text1.contains("Grand Total"))
			{
				int rowCount=(getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
				System.err.println("count"+rowCount);
				break;
			}	
		}

		int reportsRowListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRowListArray = new ArrayList<String>();
		for(int i=1;i<reportsRowListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText().trim();
			if (data.isEmpty() == false) 
			{
				reportsRowListArray.add(data);
			}
			
		}
		String actRowList = reportsRowListArray.toString();
		String expRowList = "[Grand Total, 7.00, 7.00]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRowList.equalsIgnoreCase(expRowList))
		{
			return true;
		} 
		else
		{
			return false;
		}

		
	
	
	}
   	
	public static boolean checkExpiredStockByBinsReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();


		Thread.sleep(2000);
		getAction().sendKeys(Keys.END).build().perform();

		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", binsReportMenu);
		getAction().moveToElement(binsReportMenu).build().perform();
		Thread.sleep(2000);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsReportMenu));
		binsReportMenu.click();

		getAction().sendKeys(Keys.END).build().perform();
/*
		scrollToElementJSE(expiredStockByBins);
		Thread.sleep(1200);
		getAction().moveToElement(expiredStockByBins).build().perform();*/
		Thread.sleep(1500);
		
		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", expiredStockByBins);
		getAction().moveToElement(expiredStockByBins).build().perform();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(expiredStockByBins));
		expiredStockByBins.click();

		Thread.sleep(2000);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));

		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);


		Thread.sleep(2000);

		boolean actReportsTable = reportsTable.getText().isEmpty();
		boolean expReportsTable = true;

		System.out.println("report_Body : "+actReportsTable+" Value Expected : "+expReportsTable);

		if(actReportsTable==expReportsTable)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean checkStockBalanceByWarehouse() throws InterruptedException
	{
		
		searchBtnInput.click();
		searchBtnInput.sendKeys("Stock Balance by Warehouse");
		Thread.sleep(1500);
		searchBtnInput.sendKeys(Keys.ENTER);
		/*
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		

		
		Thread.sleep(2000);
	getAction().sendKeys(Keys.END).build().perform();
		
		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", stockBalanceByWarehouse);
		getAction().moveToElement(stockBalanceByWarehouse).build().perform();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockBalanceByWarehouse));
		stockBalanceByWarehouse.click();
		
		Thread.sleep(2000);*/
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(4000);
		

		Thread.sleep(2000);

		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount-1;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		Iterator<String> itr = reportsRow1ListArray.iterator();
		while (itr.hasNext()) 
		{ 
			String row1 = itr.next(); 
			if (row1.equals("Sub Total"))
			{ 
				itr.remove();
			}

		}

		
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[HYD [HYD500051], APPLE, A1, A2, D1, A1 [A101], APPLE, BALL, CAM, A1, B1, B2, C1, C2, D1, D2]";

		System.out.println("ActualItems:"+actRow1List);
		System.out.println("ExpectedItems:"+expRow1List);
		
		Thread.sleep(2000);
		report_NextBtn.click();
		Thread.sleep(2000);
		
		int reportspage2Row1ListCount = reportsCol1List.size();
		ArrayList<String> reportspage2Row1ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage2Row1ListCount-1;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row1ListArray.add(data);
			}

		}
		
		Iterator<String> itr1 = reportspage2Row1ListArray.iterator();
		while (itr1.hasNext()) 
		{ 
			String row1 = itr1.next(); 
			if (row1.equals("Sub Total"))
			{ 
				itr1.remove();
			}

		}
		
		
		String actpage2Row1List = reportspage2Row1ListArray.toString();
		String exppage2Row1List = "[D2 [D402], APPLE, A1, A2, B1, B2, D1, D2]";

		System.out.println(actpage2Row1List);
		System.out.println(exppage2Row1List);
		
	
		Thread.sleep(2000);
		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;

		Thread.sleep(2000);

		int rows1=getDriver().findElements(By.xpath("//table[@class='CommonReportTable']//tbody//tr")).size();

		for(  k=1;k<rows1;k++)
		{
			String text1=getDriver().findElement(By.xpath(beforePath + k + afterPath)).getText();

			if(text1.contains("Grand Total"))
			{
				int rowCount=(getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
				System.err.println("count"+rowCount);
				break;
			}	
		}

		int reportsRowListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRowListArray = new ArrayList<String>();
		for(int i=1;i<reportsRowListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			reportsRowListArray.add(data);
		}
		String actRowList = reportsRowListArray.toString();
		String expRowList = "[Grand Total, 36.00, , 36.00]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);

		if (actRow1List.equalsIgnoreCase(expRow1List)&&actpage2Row1List.equalsIgnoreCase(exppage2Row1List) 
				&& actRowList.equalsIgnoreCase(expRowList)) 
		{
			sl_CloseBtn.click();
			return true;
		} 
		else 
		{
			sl_CloseBtn.click();
			return false;
		}	

		
	}
	
	public static boolean checkStockAgeingAnalysisReport() throws InterruptedException
	{

		searchBtnInput.click();
		searchBtnInput.sendKeys("Ageing Analysis");
		Thread.sleep(1500);
		searchBtnInput.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(2000);


		Thread.sleep(2000);

		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount-1;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		
		
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[HYD HYD500051, APPLE, A1, A2, D1, A1 A101, APPLE, BALL, CAM, A1, B1, B2, C1, C2, D1, D2]";

		System.out.println("ActualItems:"+actRow1List);
		System.out.println("ExpectedItems:"+expRow1List);
		
		Thread.sleep(2000);
		report_NextBtn.click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;

		Thread.sleep(2000);

		int rows1=getDriver().findElements(By.xpath("//table[@class='CommonReportTable']//tbody//tr")).size();

		for(  k=1;k<rows1;k++)
		{
			String text1=getDriver().findElement(By.xpath(beforePath + k + afterPath)).getText();

			if(text1.contains("Grand Total"))
			{
				int rowCount=(getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
				System.err.println("count"+rowCount);
				break;
			}	
		}

		int reportsRowListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRowListArray = new ArrayList<String>();
		for(int i=1;i<reportsRowListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			reportsRowListArray.add(data);
		}
		String actRowList = reportsRowListArray.toString();
		String expRowList = "[Grand Total, 36.00, , 36.00]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);

		if (actRow1List.equalsIgnoreCase(expRow1List)
				&& actRowList.equalsIgnoreCase(expRowList)) 
		{
			sl_CloseBtn.click();
			return true;
		} 
		else 
		{
			sl_CloseBtn.click();
			return false;
		}	

		
		
	}
	
	public static boolean checkAgeingAnalysisByBatchReport() throws InterruptedException
	{

		searchBtnInput.click();
		searchBtnInput.sendKeys("Ageing Analysis by batch");
		Thread.sleep(1500);
		searchBtnInput.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(2000);
		
		Thread.sleep(3000);
		
		
		int reportsRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}
			
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[APPLE [APP001]]";
		
		

		int reportsRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow2ListArray.add(data);
			}
			
			
		}
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[1, 8.00, 8.00, 8.00, 8.00, 0, 0]";
	

		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow3ListArray.add(data);
			}
		
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[ASA, 1.00, 1.00, 1.00, 1.00, 0, 0]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow4ListArray.add(data);
			}
			
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[Grand Total, 9.00, 9.00, 8.00, 8.00, 1.00, 1.00]";
		

	

		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		System.out.println(actRow2List);
		System.out.println(expRow2List);
		
		System.out.println(actRow3List);
		System.out.println(expRow3List);
		
		System.out.println(actRow4List);
		System.out.println(expRow4List);
		
	
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
					&& actRow4List.equalsIgnoreCase(expRow4List)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}	
	

	}
	
	
	public static boolean checkStockAnalysisByRMAReport() throws InterruptedException
	{

		searchBtnInput.click();
		searchBtnInput.sendKeys("Stock Analysis by RMA");
		Thread.sleep(1500);
		searchBtnInput.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
	

		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));

		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);
		

		Thread.sleep(2000);

		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount-1;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[4, 151, D1-1, D1-3, D1-4, D1-5, D1-6, D1-7, D1-8, D1-9, D1-10, dds15, 51515151]";

		System.out.println("ActualItems  :"+actRow1List);
		System.out.println("ExpectedItems:"+expRow1List);
		
		Thread.sleep(2000);

		int reportsRow2ListCount = reportsCol2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow2ListArray.add(data);
			}

		}
		
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[D2, D2, D1, D1, D1, D1, D1, D1, D1, D1, D1, D2, D1]";

		System.out.println("ActualItems  :"+actRow2List);
		System.out.println("ExpectedItems:"+expRow2List);
		
		Thread.sleep(2000);


		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;

		Thread.sleep(2000);

		int rows1=getDriver().findElements(By.xpath("//table[@class='CommonReportTable']//tbody//tr")).size();

		for(  k=1;k<rows1;k++)
		{
			String text1=getDriver().findElement(By.xpath(beforePath + k + afterPath)).getText();

			if(text1.contains("Grand Total"))
			{
				int rowCount=(getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
				System.err.println("count"+rowCount);
				break;
			}	
		}

		int reportsRowListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRowListArray = new ArrayList<String>();
		for(int i=1;i<reportsRowListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText().trim();
			if (data.isEmpty() == false) 
			{
				reportsRowListArray.add(data);
			}
			
		}
		String actRowList = reportsRowListArray.toString();
		String expRowList = "[Grand Total, 13.00, 13.00, 13.00]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRowList.equalsIgnoreCase(expRowList))
		{
			return true;
		} 
		else
		{
			return false;
		}

	
	}
	
	public static boolean checkStockAgeingAnalysisByBins() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		Thread.sleep(1500);

		scrollToElementJSE(stockAgeingAnalysisMenu);
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockAgeingAnalysisMenu));
		stockAgeingAnalysisMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ageingStockByBins));
		ageingStockByBins.click();
		
		Thread.sleep(2000);
		

		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
	
		Thread.sleep(2000);

		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount-1;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "";

		System.out.println("ActualItems  :"+actRow1List);
		System.out.println("ExpectedItems:"+expRow1List);
		
		Thread.sleep(2000);

		Thread.sleep(2000);


		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;

		Thread.sleep(2000);

		int rows1=getDriver().findElements(By.xpath("//table[@class='CommonReportTable']//tbody//tr")).size();

		for(  k=1;k<rows1;k++)
		{
			String text1=getDriver().findElement(By.xpath(beforePath + k + afterPath)).getText();

			if(text1.contains("Grand Total"))
			{
				int rowCount=(getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
				System.err.println("count"+rowCount);
				break;
			}	
		}

		int reportsRowListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRowListArray = new ArrayList<String>();
		for(int i=1;i<reportsRowListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText().trim();
			if (data.isEmpty() == false) 
			{
				reportsRowListArray.add(data);
			}
			
		}
		String actRowList = reportsRowListArray.toString();
		String expRowList = "[Grand Total, 7.00, 7.00]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRowList.equalsIgnoreCase(expRowList))
		{
			return true;
		} 
		else
		{
			return false;
		}

		
	}
	
	public static boolean checkStockAgeingAnalysisByItemByBins() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();

		Thread.sleep(2000);
		scrollToElementJSE(stockAgeingAnalysisMenu);
		Thread.sleep(1500);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockAgeingAnalysisMenu));
		stockAgeingAnalysisMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ageingByItemByBins));
		ageingByItemByBins.click();
		
		Thread.sleep(2000);
		

		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
	
		Thread.sleep(2000);

		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount-1;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "";

		System.out.println("ActualItems  :"+actRow1List);
		System.out.println("ExpectedItems:"+expRow1List);
		
		Thread.sleep(2000);

		Thread.sleep(2000);


		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;

		Thread.sleep(2000);

		int rows1=getDriver().findElements(By.xpath("//table[@class='CommonReportTable']//tbody//tr")).size();

		for(  k=1;k<rows1;k++)
		{
			String text1=getDriver().findElement(By.xpath(beforePath + k + afterPath)).getText();

			if(text1.contains("Grand Total"))
			{
				int rowCount=(getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
				System.err.println("count"+rowCount);
				break;
			}	
		}

		int reportsRowListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRowListArray = new ArrayList<String>();
		for(int i=1;i<reportsRowListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText().trim();
			if (data.isEmpty() == false) 
			{
				reportsRowListArray.add(data);
			}
			
		}
		String actRowList = reportsRowListArray.toString();
		String expRowList = "[Grand Total, 7.00, 7.00]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRowList.equalsIgnoreCase(expRowList))
		{
			return true;
		} 
		else
		{
			return false;
		}

		
		
	}
	
	public boolean checkReorderReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		

		Thread.sleep(2000);
		scrollToElementJSE(reorderReport);
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reorderReport));
		reorderReport.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(2000);
		
		boolean actReportsTable = reportsTable.getText().isEmpty();
		boolean expReportsTable = true;
		
		System.out.println("*********************************checkReorderReportReport*****************************************");
		
		System.out.println("Reports Table isEmpty : "+actReportsTable+"  Value Expected  "+expReportsTable);
		
		if(actReportsTable==expReportsTable)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static boolean checkFastMovingItemsReport() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();


		Thread.sleep(2000);
		scrollToElementJSE(fastMovingItem);
		Thread.sleep(1500);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fastMovingItem));
		fastMovingItem.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);

		Thread.sleep(3000);


		int reportsRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}

		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[A1, A101, A1, 5.00, 1.00, 1.00, A1, 1.00]";



		int reportsRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow2ListArray.add(data);
			}


		}
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[APPLE, APP001, APPLE, 2.00, 7.00, 1.00, A1, 7.00]";



		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow3ListArray.add(data);
			}

		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[D1, D401, D1, 1.00, 8.00, 1.00, A1, 8.00]";



		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow4ListArray.add(data);
			}

		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[Grand Total, 8.00, 16.00, 3.00, 16.00]";




		System.out.println(actRow1List);
		System.out.println(expRow1List);

		System.out.println(actRow2List);
		System.out.println(expRow2List);

		System.out.println(actRow3List);
		System.out.println(expRow3List);

		System.out.println(actRow4List);
		System.out.println(expRow4List);


		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}	




	}
	
	public static boolean checkSlowMovingItemsReport() throws InterruptedException
	{


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();


		Thread.sleep(2000);
		scrollToElementJSE(slowMovingItem);
		Thread.sleep(1500);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(slowMovingItem));
		slowMovingItem.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);

		Thread.sleep(3000);


		int reportsRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}

		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[D1, D401, D1, 1.00, 8.00, 1.00, A1, 8.00]";



		int reportsRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow2ListArray.add(data);
			}


		}
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[APPLE, APP001, APPLE, 2.00, 7.00, 1.00, A1, 7.00]";



		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow3ListArray.add(data);
			}

		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[A1, A101, A1, 5.00, 1.00, 1.00, A1, 1.00]";



		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow4ListArray.add(data);
			}

		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[Grand Total, 8.00, 16.00, 3.00, 16.00]";




		System.out.println(actRow1List);
		System.out.println(expRow1List);

		System.out.println(actRow2List);
		System.out.println(expRow2List);

		System.out.println(actRow3List);
		System.out.println(expRow3List);

		System.out.println(actRow4List);
		System.out.println(expRow4List);


		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}	

	}
	
	public static boolean checkPeakAndLowBlancesReport() throws InterruptedException
	{
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();

		Thread.sleep(2000);
		scrollToElementJSE(peakORLowBalances);
		Thread.sleep(1500);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(peakORLowBalances));
		peakORLowBalances.click();

		Thread.sleep(2000);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);


		int reportsRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}

		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[APPLE, 0, 31/03/2022, 1.00, 21/07/2022, 11.00]";



		int reportsRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow2ListArray.add(data);
			}


		}
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[A1, 0, 31/03/2022, 1.00, 21/07/2022, 8.00]";



		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow3ListArray.add(data);
			}

		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[A2, 0, 31/03/2022, 1.00, 21/07/2022, 2.00]";



		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow4ListArray.add(data);
			}

		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[B1, 0, 31/03/2022, 1.00, 21/07/2022, 2.00]";



		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow5ListArray.add(data);
			}
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[B2, 0, 31/03/2022, 1.00, 21/07/2022, 2.00]";



		int reportsRow6ListCount = reportsRow6List.size();
		ArrayList<String> reportsRow6ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow6ListCount;i++)
		{
			String data = reportsRow6List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow6ListArray.add(data);
			}

		}
		String actRow6List = reportsRow6ListArray.toString();
		String expRow6List = "[D1, 0, 31/03/2022, 1.00, 21/07/2022, 11.00]";



		int reportsRow7ListCount = reportsRow7List.size();
		ArrayList<String> reportsRow7ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow7ListCount;i++)
		{
			String data = reportsRow7List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow7ListArray.add(data);
			}


		}
		String actRow7List = reportsRow7ListArray.toString();
		String expRow7List = "[D2, 0, 31/03/2022, 1.00, 25/07/2022, 3.00]";



		int reportsRow8ListCount = reportsRow8List.size();
		ArrayList<String> reportsRow8ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow8ListCount;i++)
		{
			String data = reportsRow8List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow8ListArray.add(data);
			}

		}
		String actRow8List = reportsRow8ListArray.toString();
		String expRow8List = "[Grand Total, 7.00, 39.00]";



		System.out.println(actRow1List);
		System.out.println(expRow1List);

		System.out.println(actRow2List);
		System.out.println(expRow2List);

		System.out.println(actRow3List);
		System.out.println(expRow3List);

		System.out.println(actRow4List);
		System.out.println(expRow4List);

		System.out.println(actRow5List);
		System.out.println(expRow5List);

		System.out.println(actRow6List);
		System.out.println(expRow6List);

		System.out.println(actRow7List);
		System.out.println(expRow7List);

		System.out.println(actRow8List);
		System.out.println(expRow8List);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}	

	}
	
	public static boolean checkBestSellingItemReport() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();

		Thread.sleep(2000);
		scrollToElementJSE(bestSellingItem);
		Thread.sleep(1500);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(bestSellingItem));
		bestSellingItem.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(2000);
		

		Thread.sleep(3000);


		int reportsRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}

		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[A1, 3.00, 5.00]";



		int reportsRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow2ListArray.add(data);
			}


		}
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[APPLE, 2.00, 2.00]";



		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow3ListArray.add(data);
			}

		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[D1, 1.00, 1.00]";



		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow4ListArray.add(data);
			}

		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[Grand Total, 6.00, 2.00]";




		System.out.println(actRow1List);
		System.out.println(expRow1List);

		System.out.println(actRow2List);
		System.out.println(expRow2List);

		System.out.println(actRow3List);
		System.out.println(expRow3List);

		System.out.println(actRow4List);
		System.out.println(expRow4List);


		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}	

		
	}
	
	public static boolean checkStockTransferRegisterReport() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();

		Thread.sleep(2000);
		scrollToElementJSE(stockTransferReport);
		Thread.sleep(1500);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockTransferReport));
		stockTransferReport.click();
		
		Thread.sleep(2000);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);


		int reportsRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}

		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[APPLE [APP001]]";



		int reportsRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=3;i<reportsRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow2ListArray.add(data);
			}


		}
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[A1, 1.00]";



		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow3ListArray.add(data);
			}

		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[Sub Total, 1.00]";



		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow4ListArray.add(data);
			}

		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[A1 [A101]]";



		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=3;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow5ListArray.add(data);
			}
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[A1, 1.00]";



		int reportsRow6ListCount = reportsRow6List.size();
		ArrayList<String> reportsRow6ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow6ListCount;i++)
		{
			String data = reportsRow6List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow6ListArray.add(data);
			}

		}
		String actRow6List = reportsRow6ListArray.toString();
		String expRow6List = "[Sub Total, 1.00]";



		int reportsRow7ListCount = reportsRow7List.size();
		ArrayList<String> reportsRow7ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow7ListCount;i++)
		{
			String data = reportsRow7List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow7ListArray.add(data);
			}


		}
		String actRow7List = reportsRow7ListArray.toString();
		String expRow7List = "[A2 [A102]]";



		int reportsRow8ListCount = reportsRow8List.size();
		ArrayList<String> reportsRow8ListArray = new ArrayList<String>();
		for(int i=3;i<reportsRow8ListCount;i++)
		{
			String data = reportsRow8List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow8ListArray.add(data);
			}

		}
		String actRow8List = reportsRow8ListArray.toString();
		String expRow8List = "[A1, 1.00]";
		
		

		int reportsRow9ListCount = reportsRow9List.size();
		ArrayList<String> reportsRow9ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow9ListCount;i++)
		{
			String data = reportsRow9List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow9ListArray.add(data);
			}

		}
		String actRow9List = reportsRow9ListArray.toString();
		String expRow9List = "[Sub Total, 1.00]";



		int reportsRow10ListCount = reportsRow10List.size();
		ArrayList<String> reportsRow10ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow10ListCount;i++)
		{
			String data = reportsRow10List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow10ListArray.add(data);
			}
		}
		String actRow10List = reportsRow10ListArray.toString();
		String expRow10List = "[D1 [D401]]";



		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=3;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow11ListArray.add(data);
			}

		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[A1, 1.00]";



		int reportsRow12ListCount = reportsRow12List.size();
		ArrayList<String> reportsRow12ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow12ListCount;i++)
		{
			String data = reportsRow12List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow12ListArray.add(data);
			}


		}
		String actRow12List = reportsRow12ListArray.toString();
		String expRow12List = "[Sub Total, 1.00]";



		int reportsRow13ListCount = reportsRow13List.size();
		ArrayList<String> reportsRow13ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow13ListCount;i++)
		{
			String data = reportsRow13List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow13ListArray.add(data);
			}

		}
		String actRow13List = reportsRow13ListArray.toString();
		String expRow13List = "[Grand Total, 4.00]";


		System.out.println(actRow1List);
		System.out.println(expRow1List);

		System.out.println(actRow2List);
		System.out.println(expRow2List);

		System.out.println(actRow3List);
		System.out.println(expRow3List);

		System.out.println(actRow4List);
		System.out.println(expRow4List);

		System.out.println(actRow5List);
		System.out.println(expRow5List);

		System.out.println(actRow6List);
		System.out.println(expRow6List);

		System.out.println(actRow7List);
		System.out.println(expRow7List);

		System.out.println(actRow8List);
		System.out.println(expRow8List);
		

		System.out.println(actRow9List);
		System.out.println(expRow9List);

		System.out.println(actRow10List);
		System.out.println(expRow10List);

		System.out.println(actRow11List);
		System.out.println(expRow11List);

		System.out.println(actRow12List);
		System.out.println(expRow12List);

		System.out.println(actRow13List);
		System.out.println(expRow13List);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List)
				&& actRow9List.equalsIgnoreCase(expRow9List)&& actRow10List.equalsIgnoreCase(expRow10List)
				&& actRow11List.equalsIgnoreCase(expRow11List) && actRow12List.equalsIgnoreCase(expRow12List)
				&& actRow13List.equalsIgnoreCase(expRow13List))
			
		{
			return true;
		} 
		else 
		{
			return false;
		}	

	}
	
	public static boolean checkTransactionTypeWiseStockReport() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();


		Thread.sleep(2000);
		scrollToElementJSE(transactionTypeWiseStockReport);
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionTypeWiseStockReport));
		transactionTypeWiseStockReport.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);



		int reportsRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}

		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[APPLE, 9.00, 9.00, 1.00, 1.00, 1.00, 10.00, 10.00, 2.00, 2.00]";



		int reportsRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow2ListArray.add(data);
			}


		}
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[A1, 3.00, 3.00, 1.00, 1.00, 1.00, 3.00, 3.00, 1.00, 1.00, 1.00, 1.00, 4.00, 4.00, 1.00, 1.00, 1.00, 1.00]";



		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow3ListArray.add(data);
			}

		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[A2, 2.00, 2.00, 1.00, 1.00, 1.00, 1.00, 1.00]";



		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow4ListArray.add(data);
			}

		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[B1, 2.00, 2.00, 1.00, 1.00, 1.00, 1.00, 1.00]";



		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow5ListArray.add(data);
			}
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[B2, 2.00, 2.00, 1.00, 1.00, 1.00, 1.00, 1.00]";



		int reportsRow6ListCount = reportsRow6List.size();
		ArrayList<String> reportsRow6ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow6ListCount;i++)
		{
			String data = reportsRow6List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow6ListArray.add(data);
			}

		}
		String actRow6List = reportsRow6ListArray.toString();
		String expRow6List = "[D1, 10.00, 10.00, 1.00, 1.00, 1.00, 10.00, 10.00, 1.00, 1.00]";



		int reportsRow7ListCount = reportsRow7List.size();
		ArrayList<String> reportsRow7ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow7ListCount;i++)
		{
			String data = reportsRow7List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow7ListArray.add(data);
			}


		}
		String actRow7List = reportsRow7ListArray.toString();
		String expRow7List = "[D2, 3.00, 3.00, 1.00, 1.00, 1.00, 2.00, 2.00]";



		int reportsRow8ListCount = reportsRow8List.size();
		ArrayList<String> reportsRow8ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow8ListCount;i++)
		{
			String data = reportsRow8List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow8ListArray.add(data);
			}

		}
		String actRow8List = reportsRow8ListArray.toString();
		String expRow8List = "[Grand Total, 7.00, 7.00, 29.00, 29.00, 1.00, 1.00, 1.00, 1.00, 7.00, 21.00, 1.00, 1.00, 30.00, 0.78, 16.00]";
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);

		System.out.println(actRow2List);
		System.out.println(expRow2List);

		System.out.println(actRow3List);
		System.out.println(expRow3List);

		System.out.println(actRow4List);
		System.out.println(expRow4List);

		System.out.println(actRow5List);
		System.out.println(expRow5List);

		System.out.println(actRow6List);
		System.out.println(expRow6List);

		System.out.println(actRow7List);
		System.out.println(expRow7List);

		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	public static boolean checkActualConsumptionReport() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();

		Thread.sleep(2000);
		scrollToElementJSE(actualConsumptionReport);
		Thread.sleep(1500);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(actualConsumptionReport));
		actualConsumptionReport.click();
		
		Thread.sleep(2000);
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);



		int reportsRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}

		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[APPLE, 1.00, 1.00, 10.00, 10.00, 2.00, 4.00, 9.00, 0.78, 7.00]";



		int reportsRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow2ListArray.add(data);
			}


		}
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[A1, 1.00, 1.00, 4.00, 4.00, 1.00, 1.00, 1.00, 1.00, 4.00, 16.00, 1.00, 1.00, 2.00, 5.00, 10.00]";



		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow3ListArray.add(data);
			}

		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[A2, 1.00, 1.00, 1.00, 1.00, 2.00, 1.00, 2.00]";



		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow4ListArray.add(data);
			}

		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[B1, 1.00, 1.00, 1.00, 1.00, 2.00, 1.00, 2.00]";



		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow5ListArray.add(data);
			}
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[B2, 1.00, 1.00, 1.00, 1.00, 2.00, 1.00, 2.00]";



		int reportsRow6ListCount = reportsRow6List.size();
		ArrayList<String> reportsRow6ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow6ListCount;i++)
		{
			String data = reportsRow6List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow6ListArray.add(data);
			}

		}
		String actRow6List = reportsRow6ListArray.toString();
		String expRow6List = "[D1, 1.00, 1.00, 10.00, 10.00, 1.00, 1.00, 10.00, 1.00, 10.00]";



		int reportsRow7ListCount = reportsRow7List.size();
		ArrayList<String> reportsRow7ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow7ListCount;i++)
		{
			String data = reportsRow7List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow7ListArray.add(data);
			}


		}
		String actRow7List = reportsRow7ListArray.toString();
		String expRow7List = "[D2, 1.00, 1.00, 2.00, 2.00, 3.00, 1.00, 3.00]";



		int reportsRow8ListCount = reportsRow8List.size();
		ArrayList<String> reportsRow8ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow8ListCount;i++)
		{
			String data = reportsRow8List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow8ListArray.add(data);
			}

		}
		String actRow8List = reportsRow8ListArray.toString();
		String expRow8List = "[Grand Total, 7.00, 7.00, 29.00, 29.00, 1.00, 1.00, 1.00, 1.00, 7.00, 21.00, 1.00, 1.00, 30.00, 0.78, 16.00]";
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);

		System.out.println(actRow2List);
		System.out.println(expRow2List);

		System.out.println(actRow3List);
		System.out.println(expRow3List);

		System.out.println(actRow4List);
		System.out.println(expRow4List);

		System.out.println(actRow5List);
		System.out.println(expRow5List);

		System.out.println(actRow6List);
		System.out.println(expRow6List);

		System.out.println(actRow7List);
		System.out.println(expRow7List);

		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List))
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
	}
	
	public static boolean checkGeneralLedgerandInventoryMismatchReport() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		Thread.sleep(2000);
		scrollToElementJSE(GeneralLedgerAndInventoryMismatchReport);
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(GeneralLedgerAndInventoryMismatchReport));
		GeneralLedgerAndInventoryMismatchReport.click();
		
		Thread.sleep(2000);
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTxt));
		accountTxt.sendKeys("VendorACC");
		Thread.sleep(2000);
		accountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		Thread.sleep(2000);



		int reportsRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow1ListArray.add(data);
			}

		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Opening Difference, 0, 7.00, 1.00, 6.00]";



		int reportsRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow2ListArray.add(data);
			}


		}
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[Journal Entries, 0, 1.00, 1.00]";



		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow3ListArray.add(data);
			}

		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[21/07/2022, 35.00, 35.00]";



		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow4ListArray.add(data);
			}

		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[26/07/2022, 31.00, 1.00, 30.00]";



		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow5ListArray.add(data);
			}
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[Grand Total, 73.00, 1.00, 72.00]";
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);

		System.out.println(actRow2List);
		System.out.println(expRow2List);

		System.out.println(actRow3List);
		System.out.println(expRow3List);

		System.out.println(actRow4List);
		System.out.println(expRow4List);

		System.out.println(actRow5List);
		System.out.println(expRow5List);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List))
		{
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
 			userNameDisplay.click();
 			
 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
 			logoutOption.click();
 			
 			Thread.sleep(2000);
			return true;
		} 
		else 
		{
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
 			userNameDisplay.click();
 			
 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
 			logoutOption.click();
 			
 			Thread.sleep(2000);
			return false;
		}
		
		
	}
	
	
	
	public FocusInventoryReportsPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	// Stock Ledger Elements 

}
