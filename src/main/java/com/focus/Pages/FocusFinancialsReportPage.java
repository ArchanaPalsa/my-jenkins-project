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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;
import com.testautomationguru.utility.PDFUtil;

public class FocusFinancialsReportPage extends BaseEngine
{

	
	public static boolean checkLedgerReport() throws InterruptedException
	{

		getDriver().navigate().refresh();
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
		ledger.click();
		
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));

		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);
		
		Thread.sleep(2000);

		int reportsRow2ListCount = reportsCol2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow2ListArray.add(data);
			}

		}
		
		
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[PurVou : 9, Rct : 1, SalInv : 2, Pmt : 1, SalInv : 3, SalInv : 1]";

		System.out.println("Actaul Voucher  :"+actRow2List);
		System.out.println("Expected Voucher:"+expRow2List);
		
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
		String expRow3List = "[Opening Balance, A1, CustomerACC, E1, H2, Opening Balance, E2, Opening Balance, Opening Balance, E1]";

		
		System.out.println("Actaul Account  :"+actRow3List);
		System.out.println("Expected Account:"+expRow3List);
		
		Thread.sleep(4000);

		int reportsRow4ListCount = reportsCol4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow4ListArray.add(data);
			}

		}
		
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[BR-HYD, BR-HYD, BR-HYD, BR-HYD]";

		System.out.println("Actual Branch  :"+actRow4List);
		System.out.println("Expected Branch:"+expRow4List);
		
		int reportsRow5ListCount = reportsCol5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsCol5List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow5ListArray.add(data);
			}

		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[A1, A1, A1, D2, A1, A1]";

		System.out.println("Actual Department  :"+actRow5List);
		System.out.println("Expected Department:"+expRow5List);
		
		int reportsRow6ListCount = reportsCol6List.size();
		ArrayList<String> reportsRow6ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow6ListCount;i++)
		{
			String data = reportsCol6List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow6ListArray.add(data);
			}

		}
		String actRow6List = reportsRow6ListArray.toString();
		String expRow6List = "[A1, A1, A1, A1]";

		System.out.println("Actual Warehouse  :"+actRow6List);
		System.out.println("Expected Warehouse:"+expRow6List);
		
	
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
		String expAllDatapage1 = "[BankACC [BAC001], CashACC [CASH001], Opening Balances Control A/C [OBC], H1 [H801]]";

		System.out.println("actAllDatapage1"+actAllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);
		
		Thread.sleep(2000);
		report_NextBtn.click();
		Thread.sleep(2000);
		
		
		System.out.println("*************************Printing page 1 data done*********************************");

		try{
			if(pageNum.getText().equalsIgnoreCase("3") || pageNum.getText().equalsIgnoreCase("4") || pageNum.getText().equalsIgnoreCase("5"))
					{
				report_PrevBtn.click();
					}
			
		}
		catch (Exception e) 
		{
			System.out.println("Exception "+e);

		}
		
		

		int reportsPage2Row2ListCount = reportsCol2List.size();
		ArrayList<String> reportsPage2Row2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsPage2Row2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsPage2Row2ListArray.add(data);
			}

		}
		
		
		String actPage2Row2List = reportsPage2Row2ListArray.toString();
		String expPage2Row2List = "[SalInv : 5, SalRet : 1, SalInv : 6, Pmt : 1, CreNts : 1, Rct : 1, SalInv : 4, NJv : 1]";

		System.out.println("Actaul Voucher  :"+actPage2Row2List);
		System.out.println("Expected Voucher:"+expPage2Row2List);
		
		int reportsPage2Row3ListCount = reportsCol3List.size();
		ArrayList<String> reportsPage2Row3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsPage2Row3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsPage2Row3ListArray.add(data);
			}

		}
		String actPage2Row3List = reportsPage2Row3ListArray.toString();
		String expPage2Row3List = "[F2, E1, Opening Balance, SalesACC, BankACC, B2, Opening Balance, BankACC, F1, SalesACC, Opening Balance]";

		
		System.out.println("Actaul Account  :"+actPage2Row3List);
		System.out.println("Expected Account:"+expPage2Row3List);
		
		Thread.sleep(4000);

		int reportsPage2Row4ListCount = reportsCol4List.size();
		ArrayList<String> reportsPage2Row4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsPage2Row4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsPage2Row4ListArray.add(data);
			}

		}
		
		String actPage2Row4List = reportsPage2Row4ListArray.toString();
		String expPage2Row4List = "[BR-HYD, BR-HYD, BR-HYD]";

		System.out.println("Actual Branch  :"+actPage2Row4List);
		System.out.println("Expected Branch:"+expPage2Row4List);
		
		int reportsPage2Row5ListCount = reportsCol5List.size();
		ArrayList<String> reportsPage2Row5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsPage2Row5ListCount;i++)
		{
			String data = reportsCol5List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsPage2Row5ListArray.add(data);
			}

		}
		String actPage2Row5List = reportsPage2Row5ListArray.toString();
		String expPage2Row5List = "[A1, A1, A1, D2, B2, A1, A1, D2]";

		System.out.println("Actual Department  :"+actPage2Row5List);
		System.out.println("Expected Department:"+expPage2Row5List);
		
		int reportsPage2Row6ListCount = reportsCol6List.size();
		ArrayList<String> reportsPage2Row6ListArray = new ArrayList<String>();
		for(int i=0;i<reportsPage2Row6ListCount;i++)
		{
			String data = reportsCol6List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsPage2Row6ListArray.add(data);
			}

		}
		String actPage2Row6List = reportsPage2Row6ListArray.toString();
		String expPage2Row6List = "[A1, A1, A1, A1]";

		System.out.println("Actual Warehouse  :"+actPage2Row6List);
		System.out.println("Expected Warehouse:"+expPage2Row6List);
		
	
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
		String expAllDatapage2 = "[H2 [H802], CustomerACC [CAC001], PurchaseACC [PAC001]]";

		System.out.println("actAllDatapage2"+actAllDatapage2);
		System.out.println("expAllDatapage2"+expAllDatapage2);
		
		Thread.sleep(2000);
		report_NextBtn.click();
		Thread.sleep(2000);
		System.out.println("*************************Printing page 2 data done*********************************");


		try{
			if(pageNum.getText().equalsIgnoreCase("4") || pageNum.getText().equalsIgnoreCase("5"))
					{
				report_PrevBtn.click();
					}
			
		}
		catch (Exception e) 
		{
			System.out.println("Exception "+e);

		}
		
		

		int reportspage3Row2ListCount = reportsCol2List.size();
		ArrayList<String> reportspage3Row2ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage3Row2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage3Row2ListArray.add(data);
			}

		}
		
		
		String actpage3Row2List = reportspage3Row2ListArray.toString();
		String exppage3Row2List = "[NJv : 1, PurVou : 1, PurVou : 3, PurVou : 9, PurRet : 1]";

		System.out.println("Actaul Voucher  :"+actpage3Row2List);
		System.out.println("Expected Voucher:"+exppage3Row2List);
		
		int reportspage3Row3ListCount = reportsCol3List.size();
		ArrayList<String> reportspage3Row3ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage3Row3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage3Row3ListArray.add(data);
			}

		}
		String actpage3Row3List = reportspage3Row3ListArray.toString();
		String exppage3Row3List = "[VendorACC, Opening Balance, D1, Vendor A, BankACC, D2, Opening Balance, Opening Balance, Opening Balance]";

		
		System.out.println("Actaul Account  :"+actpage3Row3List);
		System.out.println("Expected Account:"+exppage3Row3List);
		
		Thread.sleep(4000);

		int reportspage3Row4ListCount = reportsCol4List.size();
		ArrayList<String> reportspage3Row4ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage3Row4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage3Row4ListArray.add(data);
			}

		}
		
		String actpage3Row4List = reportspage3Row4ListArray.toString();
		String exppage3Row4List = "[0, BR-HYD, BR-HYD, BR-HYD, 0]";

		System.out.println("Actual Branch  :"+actpage3Row4List);
		System.out.println("Expected Branch:"+exppage3Row4List);
		
		int reportspage3Row5ListCount = reportsCol5List.size();
		ArrayList<String> reportspage3Row5ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage3Row5ListCount;i++)
		{
			String data = reportsCol5List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage3Row5ListArray.add(data);
			}

		}
		String actpage3Row5List = reportspage3Row5ListArray.toString();
		String exppage3Row5List = "[D2, A1, A1, A1, A1]";

		System.out.println("Actual Department  :"+actpage3Row5List);
		System.out.println("Expected Department:"+exppage3Row5List);
		
		int reportspage3Row6ListCount = reportsCol6List.size();
		ArrayList<String> reportspage3Row6ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage3Row6ListCount;i++)
		{
			String data = reportsCol6List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage3Row6ListArray.add(data);
			}

		}
		String actpage3Row6List = reportspage3Row6ListArray.toString();
		String exppage3Row6List = "[A1, A1, A1, A1]";

		System.out.println("Actual Warehouse  :"+actpage3Row6List);
		System.out.println("Expected Warehouse:"+exppage3Row6List);
		
	
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
		String expAllDatapage3 = "[A1 [A101], A2 [A102], B1 [B201], B2 [B202]]";

		System.out.println("actAllDatapage3"+actAllDatapage3);
		System.out.println("expAllDatapage3"+expAllDatapage3);
		
		
		System.out.println("*************************Printing page 3 data done*********************************");

		Thread.sleep(2000);
		report_NextBtn.click();
		Thread.sleep(2000);
		
		try{
			if(pageNum.getText().equalsIgnoreCase("6"))
					{
				report_PrevBtn.click();
				Thread.sleep(2500);
				report_PrevBtn.click();
					}
			
		}
		catch (Exception e) 
		{
			if(pageNum.getText().equalsIgnoreCase("5"))
			{
		report_PrevBtn.click();
			}
			System.out.println("Exception "+e);
			
			

		}
		
		int reportspage4Row2ListCount = reportsCol2List.size();
		ArrayList<String> reportspage4Row2ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage4Row2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage4Row2ListArray.add(data);
			}

		}
		
		
		String actpage4Row2List = reportspage4Row2ListArray.toString();
		String exppage4Row2List = "[PurRet : 1, DebNts : 1, PurVou : 2, NJv : 1]";

		System.out.println("Actaul Voucher  :"+actpage4Row2List);
		System.out.println("Expected Voucher:"+exppage4Row2List);
		
		int reportspage4Row3ListCount = reportsCol3List.size();
		ArrayList<String> reportspage4Row3ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage4Row3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage4Row3ListArray.add(data);
			}

		}
		String actpage4Row3List = reportspage4Row3ListArray.toString();
		String exppage4Row3List = "[A1, E2, Opening Balance, Purchase, PurchaseACC]";

		
		System.out.println("Actaul Account  :"+actpage4Row3List);
		System.out.println("Expected Account:"+exppage4Row3List);
		
		Thread.sleep(4000);

		int reportspage4Row4ListCount = reportsCol4List.size();
		ArrayList<String> reportspage4Row4ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage4Row4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage4Row4ListArray.add(data);
			}

		}
		
		String actpage4Row4List = reportspage4Row4ListArray.toString();
		String exppage4Row4List = "[0, 0, BR-HYD, 0]";

		System.out.println("Actual Branch  :"+actpage4Row4List);
		System.out.println("Expected Branch:"+exppage4Row4List);
		
		int reportspage4Row5ListCount = reportsCol5List.size();
		ArrayList<String> reportspage4Row5ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage4Row5ListCount;i++)
		{
			String data = reportsCol5List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage4Row5ListArray.add(data);
			}

		}
		String actpage4Row5List = reportspage4Row5ListArray.toString();
		String exppage4Row5List = "[A1, D2, A1, D2]";

		System.out.println("Actual Department  :"+actpage4Row5List);
		System.out.println("Expected Department:"+exppage4Row5List);
		
		int reportspage4Row6ListCount = reportsCol6List.size();
		ArrayList<String> reportspage4Row6ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage4Row6ListCount;i++)
		{
			String data = reportsCol6List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage4Row6ListArray.add(data);
			}

		}
		String actpage4Row6List = reportspage4Row6ListArray.toString();
		String exppage4Row6List = "[A1, A1]";

		System.out.println("Actual Warehouse  :"+actpage4Row6List);
		System.out.println("Expected Warehouse:"+exppage4Row6List);
		
	
		ArrayList<String>  AllDatapage4 = new ArrayList<String>(); 

		int count4=stockLedgerTable.size();

		System.err.println(count4);

		for(int i=0 ; i < count4 ;i++)
		{
			String style= stockLedgerTable.get(i).getAttribute("style");
			if(style.contains("overflow: visible; font-weight: bold; background-color:"))
					{
				    String data=stockLedgerTable.get(i).getText();
				    AllDatapage4.add(data);
					}
	
		}

		String actAllDatapage4 = AllDatapage4.toString();
		String expAllDatapage4 = "[VendorACC [VAC001]]";

		System.out.println("actAllDatapage4"+actAllDatapage4);
		System.out.println("expAllDatapage4"+expAllDatapage4);
		
		System.out.println("*************************Printing page 4 data done*********************************");


		Thread.sleep(2000);
		report_NextBtn.click();
		Thread.sleep(2000);
		
		try{
			if(pageNum.getText().equalsIgnoreCase("6"))
					{
				Thread.sleep(2000);
				report_PrevBtn.click();
					}
			
		}
		catch (Exception e) 
		{
			
			System.out.println("Exception "+e);
			
			

		}
		

		int reportspage5Row2ListCount = reportsCol2List.size();
		ArrayList<String> reportspage5Row2ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage5Row2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage5Row2ListArray.add(data);
			}

		}
		
		
		String actpage5Row2List = reportspage5Row2ListArray.toString();
		String exppage5Row2List = "[DebNts : 1, SalInv : 4, SalInv : 5, PurVou : 1, PurVou : 10]";

		System.out.println("Actaul Voucher  :"+actpage5Row2List);
		System.out.println("Expected Voucher:"+exppage5Row2List);
		
		int reportspage5Row3ListCount = reportsCol3List.size();
		ArrayList<String> reportspage5Row3ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage5Row3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage5Row3ListArray.add(data);
			}

		}
		String actpage5Row3List = reportspage5Row3ListArray.toString();
		String exppage5Row3List = "[D2, Opening Balance, CustomerACC, Opening Balance, H1, Opening Balance, A1, Opening Balance, B2]";

		
		System.out.println("Actaul Account  :"+actpage5Row3List);
		System.out.println("Expected Account:"+exppage5Row3List);
		
		Thread.sleep(4000);

		int reportspage5Row4ListCount = reportsCol4List.size();
		ArrayList<String> reportspage5Row4ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage5Row4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage5Row4ListArray.add(data);
			}

		}
		
		String actpage5Row4List = reportspage5Row4ListArray.toString();
		String exppage5Row4List = "[0, BR-HYD, BR-HYD, BR-HYD, BR-HYD]";

		System.out.println("Actual Branch  :"+actpage5Row4List);
		System.out.println("Expected Branch:"+exppage5Row4List);
		
		int reportspage5Row5ListCount = reportsCol5List.size();
		ArrayList<String> reportspage5Row5ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage5Row5ListCount;i++)
		{
			String data = reportsCol5List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage5Row5ListArray.add(data);
			}

		}
		String actpage5Row5List = reportspage5Row5ListArray.toString();
		String exppage5Row5List = "[D2, A1, A1, A1, D2]";

		System.out.println("Actual Department  :"+actpage5Row5List);
		System.out.println("Expected Department:"+exppage5Row5List);
		
		int reportspage5Row6ListCount = reportsCol6List.size();
		ArrayList<String> reportspage5Row6ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage5Row6ListCount;i++)
		{
			String data = reportsCol6List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage5Row6ListArray.add(data);
			}

		}
		String actpage5Row6List = reportspage5Row6ListArray.toString();
		String exppage5Row6List = "[A1, A1, A1, D2]";

		System.out.println("Actual Warehouse  :"+actpage5Row6List);
		System.out.println("Expected Warehouse:"+exppage5Row6List);
		
	
		ArrayList<String>  AllDatapage5 = new ArrayList<String>(); 

		int count5=stockLedgerTable.size();

		System.err.println(count5);

		for(int i=0 ; i < count5 ;i++)
		{
			String style= stockLedgerTable.get(i).getAttribute("style");
			if(style.contains("overflow: visible; font-weight: bold; background-color:"))
					{
				    String data=stockLedgerTable.get(i).getText();
				    AllDatapage5.add(data);
					}
	
		}

		String actAllDatapage5 = AllDatapage5.toString();
		String expAllDatapage5 = "[F1 [F601], F2 [F602], D1 [D401], D2 [D402]]";

		System.out.println("actAllDatapage5"+actAllDatapage5);
		System.out.println("expAllDatapage5"+expAllDatapage5);
		
		System.out.println("*************************Printing page 4 data done*********************************");


		Thread.sleep(2000);
		report_NextBtn.click();
		Thread.sleep(2000);
		

		int reportspage6Row2ListCount = reportsCol2List.size();
		ArrayList<String> reportspage6Row2ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage6Row2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage6Row2ListArray.add(data);
			}

		}
		
		
		String actpage6Row2List = reportspage6Row2ListArray.toString();
		String exppage6Row2List = "[PurRet : 1, DebNts : 1, PurVou : 2, NJv : 1]";

		System.out.println("Actaul Voucher  :"+actpage6Row2List);
		System.out.println("Expected Voucher:"+exppage6Row2List);
		
		int reportspage6Row3ListCount = reportsCol3List.size();
		ArrayList<String> reportspage6Row3ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage6Row3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage6Row3ListArray.add(data);
			}

		}
		String actpage6Row3List = reportspage6Row3ListArray.toString();
		String exppage6Row3List = "[A1, E2, Opening Balance, Purchase, PurchaseACC]";

		
		System.out.println("Actaul Account  :"+actpage6Row3List);
		System.out.println("Expected Account:"+exppage6Row3List);
		
		Thread.sleep(4000);

		int reportspage6Row4ListCount = reportsCol4List.size();
		ArrayList<String> reportspage6Row4ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage6Row4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage6Row4ListArray.add(data);
			}

		}
		
		String actpage6Row4List = reportspage6Row4ListArray.toString();
		String exppage6Row4List = "[0, 0, BR-HYD, 0]";

		System.out.println("Actual Branch  :"+actpage6Row4List);
		System.out.println("Expected Branch:"+exppage6Row4List);
		
		int reportspage6Row5ListCount = reportsCol5List.size();
		ArrayList<String> reportspage6Row5ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage6Row5ListCount;i++)
		{
			String data = reportsCol5List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage6Row5ListArray.add(data);
			}

		}
		String actpage6Row5List = reportspage6Row5ListArray.toString();
		String exppage6Row5List = "[A1, D2, A1, D2]";

		System.out.println("Actual Department  :"+actpage6Row5List);
		System.out.println("Expected Department:"+exppage6Row5List);
		
		int reportspage6Row6ListCount = reportsCol6List.size();
		ArrayList<String> reportspage6Row6ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage6Row6ListCount;i++)
		{
			String data = reportsCol6List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage6Row6ListArray.add(data);
			}

		}
		String actpage6Row6List = reportspage6Row6ListArray.toString();
		String exppage6Row6List = "[A1, A1]";

		System.out.println("Actual Warehouse  :"+actpage6Row6List);
		System.out.println("Expected Warehouse:"+exppage6Row6List);
		
	
		ArrayList<String>  AllDatapage6 = new ArrayList<String>(); 

		int count6=stockLedgerTable.size();

		System.err.println(count6);

		for(int i=0 ; i < count6 ;i++)
		{
			String style= stockLedgerTable.get(i).getAttribute("style");
			if(style.contains("overflow: visible; font-weight: bold; background-color:"))
					{
				    String data=stockLedgerTable.get(i).getText();
				    AllDatapage6.add(data);
					}
	
		}

		String actAllDatapage6 = AllDatapage6.toString();
		String expAllDatapage6 = "[VendorACC [VAC001]]";

		System.out.println("actAllDatapage6"+actAllDatapage6);
		System.out.println("expAllDatapage6"+expAllDatapage6);
		
		
		
		
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
		String expRow1List = "[Grand Total, , , , , , 77.00, 77.00, , , , , 77.00, 77.00, , ]";
		
		System.out.println("actRow1List"+actRow1List);
		System.out.println("expRow1List"+expRow1List);
		
		
		
		if (actAllDatapage1.equalsIgnoreCase(expAllDatapage1) &&  actAllDatapage2.equalsIgnoreCase(expAllDatapage2) &&
				 actAllDatapage3.equalsIgnoreCase(expAllDatapage3) &&  actAllDatapage4.equalsIgnoreCase(expAllDatapage4)
				 &&  actAllDatapage5.equalsIgnoreCase(expAllDatapage5)&& actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				 && actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List)
				 && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				 && actPage2Row2List.equalsIgnoreCase(expPage2Row2List)
				 && actPage2Row3List.equalsIgnoreCase(expPage2Row3List) && actPage2Row4List.equalsIgnoreCase(expPage2Row4List)
				 && actPage2Row5List.equalsIgnoreCase(expPage2Row5List) && actPage2Row6List.equalsIgnoreCase(expPage2Row6List)
				 
				 && actpage3Row2List.equalsIgnoreCase(exppage3Row2List)
				 && actpage3Row3List.equalsIgnoreCase(exppage3Row3List) && actpage3Row4List.equalsIgnoreCase(exppage3Row4List)
				 && actpage3Row5List.equalsIgnoreCase(exppage3Row5List) && actpage3Row6List.equalsIgnoreCase(exppage3Row6List)
				 
				 
				 && actpage4Row2List.equalsIgnoreCase(exppage4Row2List)
				 && actpage4Row3List.equalsIgnoreCase(exppage4Row3List) && actpage4Row4List.equalsIgnoreCase(exppage4Row4List)
				 && actpage4Row5List.equalsIgnoreCase(exppage4Row5List) && actpage4Row6List.equalsIgnoreCase(exppage4Row6List)
				 
				 && actpage5Row2List.equalsIgnoreCase(exppage5Row2List)
				 && actpage5Row3List.equalsIgnoreCase(exppage5Row3List) && actpage5Row4List.equalsIgnoreCase(exppage5Row4List)
				 && actpage5Row5List.equalsIgnoreCase(exppage5Row5List) && actpage5Row6List.equalsIgnoreCase(exppage5Row6List)
				 
				 && actpage6Row2List.equalsIgnoreCase(exppage6Row2List)
				 && actpage6Row3List.equalsIgnoreCase(exppage6Row3List) && actpage6Row4List.equalsIgnoreCase(exppage6Row4List)
				 && actpage6Row5List.equalsIgnoreCase(exppage6Row5List) && actpage6Row6List.equalsIgnoreCase(exppage6Row6List))
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
		
	}
	
	
	public static boolean checkPrintOptionInLedgerAndValidatePDF() throws InterruptedException, IOException, AWTException
	{
		File Efile=new File(getBaseDir()+"\\autoIt\\ExportFiles\\LedgerPDF.pdf");
		
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
		
		 
		Thread.sleep(10000);
		 
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
			
		Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\LedgerPrintSaving.exe");
		
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
	 	
	 	
	 	String actPDF = getBaseDir()+"\\autoIt\\ExportFiles\\LedgerPDF.pdf";
		String expPDF = getBaseDir()+"\\autoIt\\ImportFiles\\LedgerPDF.pdf";
		
		PDFUtil pdfutil = new PDFUtil();
		
		boolean result = pdfutil.compare(actPDF, expPDF);
		
		String actData = pdfutil.getText(actPDF);
		String expData = pdfutil.getText(expPDF).replaceAll("24/08/2022", getCurrentDateF2());
		
		System.err.println(actData);
		System.err.println(expData);
		
		System.out.println("Compared Result  : "+result);
		
		if (actData.equalsIgnoreCase(expData)) 
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
	
	public static boolean checkFilterOptionInLedger() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterExpandBtn));
		report_FilterExpandBtn.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
		report_FilterBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
		report_FilterCustomizeBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterAccountExpansion));
		report_FilterAccountExpansion.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterAccountNameChkbox));
		
		if (report_FilterAccountNameChkboxSelected.isSelected()==false) 
		{
			report_FilterAccountNameChkbox.click();
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reports_Filter_Customize_OkBtn));
		reports_Filter_Customize_OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc_DefaultFilterTxt));
		acc_DefaultFilterTxt.click();
		acc_DefaultFilterTxt.sendKeys("B");
		
		Thread.sleep(2000);
		
		acc_DefaultFilterTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterOkBtn));
		report_FilterOkBtn.click();
		
		Thread.sleep(3000);
		
		
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
		String expRow3List = "[Opening Balance, B2, Opening Balance, Opening Balance, D2, H2, B2]";

		System.out.println("Actaul Account  :"+actRow3List);
		System.out.println("Expected Account:"+expRow3List);
		
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
		String expAllDatapage1 = "[Opening Balances Control A/C [OBC], H2 [H802], B1 [B201], B2 [B202], D2 [D402]]";

		System.out.println("actAllDatapage1"+actAllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);
		
		Thread.sleep(2000);
		report_NextBtn.click();
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
	
		int reportsRow1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Grand Total, , , , , , 4.00, 4.00, , , , , 4.00, 4.00, , ]";
		
		System.out.println("actRow1List"+actRow1List);
		System.out.println("expRow1List"+expRow1List);
		
		
		if (actRow3List.equalsIgnoreCase(expRow3List) && actAllDatapage1.equalsIgnoreCase(expAllDatapage1) && actRow1List.equalsIgnoreCase(expRow1List)) 
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}

	public static boolean checkLedgerDetailReport() throws InterruptedException
	{
		getDriver().navigate().refresh();
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledgerDetail));
		ledgerDetail.click();
		
		
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));

		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(2000);
		
		Thread.sleep(2000);

		int reportsRow2ListCount = reportsCol2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow2ListArray.add(data);
			}

		}
		
		
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[NJv : 1, PurVou : 2, NJv : 1, SalInv : 6, NJv : 1, Rct : 1]";

		System.out.println("Actaul Voucher  :"+actRow2List);
		System.out.println("Expected Voucher:"+expRow2List);
		
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
		String expRow3List = "[VendorACC, Purchase, VendorACC, SalesACC, CustomerACC, CustomerACC]";

		
		System.out.println("Actaul Account  :"+actRow3List);
		System.out.println("Expected Account:"+expRow3List);
		
		Thread.sleep(4000);

		int reportsRow4ListCount = reportsCol4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow4ListArray.add(data);
			}

		}
		
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[Opening Balance, VendorACC, Opening Balance, Purchase, PurchaseACC, Opening Balance, H2, CustomerACC, Opening Balance, BankACC]";

		System.out.println("Actual Account1  :"+actRow4List);
		System.out.println("Expected Account1:"+expRow4List);
		
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
		String expAllDatapage1 = "[PurchaseACC [PAC001], VendorACC [VAC001], SalesACC [SAC001], CustomerACC [CAC001]]";

		System.out.println("actAllDatapage1"+actAllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);
		
		Thread.sleep(2000);
		report_NextBtn.click();
		Thread.sleep(2000);
		
		
		System.out.println("*************************Printing page 1 data done*********************************");

		try{
			if(pageNum.getText().equalsIgnoreCase("3") || pageNum.getText().equalsIgnoreCase("4") || pageNum.getText().equalsIgnoreCase("5"))
					{
				report_PrevBtn.click();
					}
			
		}
		catch (Exception e) 
		{
			if(pageNum.getText().equalsIgnoreCase("6"))
			{
	
			report_PrevBtn.click();
			report_PrevBtn.click();
			report_PrevBtn.click();
			report_PrevBtn.click();
			}
			System.out.println("Exception "+e);

		}
		
		

		int reportsPage2Row2ListCount = reportsCol2List.size();
		ArrayList<String> reportsPage2Row2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsPage2Row2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsPage2Row2ListArray.add(data);
			}

		}
		
		
		String actPage2Row2List = reportsPage2Row2ListArray.toString();
		String expPage2Row2List = "[SalInv : 4, NJv : 1, PurVou : 1, PurVou : 3, PurVou : 6, PurVou : 9, PurRet : 1, PurVou : 10, CreNts : 1]";

		System.out.println("Actaul Voucher  :"+actPage2Row2List);
		System.out.println("Expected Voucher:"+expPage2Row2List);
		
		int reportsPage2Row3ListCount = reportsCol3List.size();
		ArrayList<String> reportsPage2Row3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsPage2Row3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsPage2Row3ListArray.add(data);
			}

		}
		String actPage2Row3List = reportsPage2Row3ListArray.toString();
		String expPage2Row3List = "[F1, CustomerACC, A1, A1, A1, A1, A1, B2, H2]";

		
		System.out.println("Actaul Account  :"+actPage2Row3List);
		System.out.println("Expected Account:"+expPage2Row3List);
		
		Thread.sleep(4000);

		int reportsPage2Row4ListCount = reportsCol5List.size();
		ArrayList<String> reportsPage2Row4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsPage2Row4ListCount;i++)
		{
			String data = reportsCol5List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsPage2Row4ListArray.add(data);
			}

		}
		
		String actPage2Row4List = reportsPage2Row4ListArray.toString();
		String expPage2Row4List = "[F1, SalesACC, Opening Balance, D1, Vendor A, D1, BankACC, D2, Opening Balance, D2, H2]";

		System.out.println("Actual Account1  :"+actPage2Row4List);
		System.out.println("Expected Account1:"+expPage2Row4List);
		
	
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
		String expAllDatapage2 = "[A1 [A101], B2 [B202], D1 [D401]]";

		System.out.println("actAllDatapage2"+actAllDatapage2);
		System.out.println("expAllDatapage2"+expAllDatapage2);
		
		Thread.sleep(2000);
		report_NextBtn.click();
		Thread.sleep(2000);
		System.out.println("*************************Printing page 2 data done*********************************");


		try{
			if(pageNum.getText().equalsIgnoreCase("5")/* || pageNum.getText().equalsIgnoreCase("4")*/)
					{
				report_PrevBtn.click();
				Thread.sleep(2000);
				report_PrevBtn.click();
					}
			
		}
		catch (Exception e) 
		{
			if(pageNum.getText().equalsIgnoreCase("4"))
			{
		
		report_PrevBtn.click();
			}
			
			if(pageNum.getText().equalsIgnoreCase("6"))
			{
		report_PrevBtn.click();
		Thread.sleep(2000);
		report_PrevBtn.click();
		Thread.sleep(2000);
		report_PrevBtn.click();
			}
	
			System.out.println("Exception "+e);

		}
		
		

		int reportspage3Row2ListCount = reportsCol2List.size();
		ArrayList<String> reportspage3Row2ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage3Row2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage3Row2ListArray.add(data);
			}

		}
		
		
		String actpage3Row2List = reportspage3Row2ListArray.toString();
		String exppage3Row2List = "[PurVou : 1, PurVou : 6, PurVou : 10, DebNts : 1, PurRet : 1, SalInv : 1, SalInv : 2, SalRet : 1]";

		System.out.println("Actaul Voucher  :"+actpage3Row2List);
		System.out.println("Expected Voucher:"+exppage3Row2List);
		
		int reportspage3Row3ListCount = reportsCol3List.size();
		ArrayList<String> reportspage3Row3ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage3Row3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage3Row3ListArray.add(data);
			}

		}
		String actpage3Row3List = reportspage3Row3ListArray.toString();
		String exppage3Row3List = "[A1, A1, B2, D2, A1, E1, E1, E1]";

		
		System.out.println("Actaul Account  :"+actpage3Row3List);
		System.out.println("Expected Account:"+exppage3Row3List);
		
		Thread.sleep(4000);

		int reportspage3Row4ListCount = reportsCol5List.size();
		ArrayList<String> reportspage3Row4ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage3Row4ListCount;i++)
		{
			String data = reportsCol5List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage3Row4ListArray.add(data);
			}

		}
		
		String actpage3Row4List = reportspage3Row4ListArray.toString();
		String exppage3Row4List = "[Opening Balance, A1, A1, Opening Balance, B2, E2, A1, Opening Balance, H1, BankACC, H1]";

		System.out.println("Actual Account1  :"+actpage3Row4List);
		System.out.println("Expected Account1:"+exppage3Row4List);
		
	
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
		String expAllDatapage3 = "[D2 [D402], E1 [E501], E2 [E502]]";

		System.out.println("actAllDatapage3"+actAllDatapage3);
		System.out.println("expAllDatapage3"+expAllDatapage3);
		
		
		System.out.println("*************************Printing page 3 data done*********************************");

		Thread.sleep(2000);
		report_NextBtn.click();
		Thread.sleep(2000);
		
		try{
			if(pageNum.getText().equalsIgnoreCase("5"))
					{
				report_PrevBtn.click();
					}
			
		}
		catch (Exception e) 
		{
			
			if(pageNum.getText().equalsIgnoreCase("6"))
			{
		report_PrevBtn.click();
		Thread.sleep(2000);
		report_PrevBtn.click();
			}
			System.out.println("Exception "+e);
			
			

		}
		
		int reportspage4Row2ListCount = reportsCol2List.size();
		ArrayList<String> reportspage4Row2ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage4Row2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage4Row2ListArray.add(data);
			}

		}
		
		
		String actpage4Row2List = reportspage4Row2ListArray.toString();
		String exppage4Row2List = "[SalInv : 3, DebNts : 1, SalInv : 4, SalInv : 5, SalInv : 1, SalInv : 5, SalRet : 1]";

		System.out.println("Actaul Voucher  :"+actpage4Row2List);
		System.out.println("Expected Voucher:"+exppage4Row2List);
		
		int reportspage4Row3ListCount = reportsCol3List.size();
		ArrayList<String> reportspage4Row3ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage4Row3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage4Row3ListArray.add(data);
			}

		}
		String actpage4Row3List = reportspage4Row3ListArray.toString();
		String exppage4Row3List = "[E2, D2, F1, F2, E1, F2, E1]";

		
		System.out.println("Actaul Account  :"+actpage4Row3List);
		System.out.println("Expected Account:"+exppage4Row3List);
		
		Thread.sleep(4000);

		int reportspage4Row4ListCount = reportsCol5List.size();
		ArrayList<String> reportspage4Row4ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage4Row4ListCount;i++)
		{
			String data = reportsCol5List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage4Row4ListArray.add(data);
			}

		}
		
		String actpage4Row4List = reportspage4Row4ListArray.toString();
		String exppage4Row4List = "[Opening Balance, CashACC, D2, Opening Balance, CustomerACC, Opening Balance, H1, Opening Balance, E1, F2, E1]";

		System.out.println("Actual Account1  :"+actpage4Row4List);
		System.out.println("Expected Account1:"+exppage4Row4List);
	
		ArrayList<String>  AllDatapage4 = new ArrayList<String>(); 

		int count4=stockLedgerTable.size();

		System.err.println(count4);

		for(int i=0 ; i < count4 ;i++)
		{
			String style= stockLedgerTable.get(i).getAttribute("style");
			if(style.contains("overflow: visible; font-weight: bold; background-color:"))
					{
				    String data=stockLedgerTable.get(i).getText();
				    AllDatapage4.add(data);
					}
	
		}

		String actAllDatapage4 = AllDatapage4.toString();
		String expAllDatapage4 = "[F1 [F601], F2 [F602], H1 [H801]]";

		System.out.println("actAllDatapage4"+actAllDatapage4);
		System.out.println("expAllDatapage4"+expAllDatapage4);
		
		System.out.println("*************************Printing page 4 data done*********************************");

		Thread.sleep(2000);
		report_NextBtn.click();
		Thread.sleep(2000);
		
		
		try{
			if(pageNum.getText().equalsIgnoreCase("6"))
					{
				report_PrevBtn.click();
					}
			
		}
		catch (Exception e) 
		{
			
			
			System.out.println("Exception "+e);
			
			

		}
		//

		int reportspage5Row2ListCount = reportsCol2List.size();
		ArrayList<String> reportspage5Row2ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage5Row2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage5Row2ListArray.add(data);
			}

		}
		
		
		String actpage5Row2List = reportspage5Row2ListArray.toString();
		String exppage5Row2List = "[PurVou : 9, Rct : 1, Pmt : 1, SalInv : 2]";

		System.out.println("Actaul Voucher  :"+actpage5Row2List);
		System.out.println("Expected Voucher:"+exppage5Row2List);
		
		int reportspage5Row3ListCount = reportsCol3List.size();
		ArrayList<String> reportspage5Row3ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage5Row3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage5Row3ListArray.add(data);
			}

		}
		String actpage5Row3List = reportspage5Row3ListArray.toString();
		String exppage5Row3List = "[A1, CustomerACC, H2, E1]";

		
		System.out.println("Actaul Account  :"+actpage5Row3List);
		System.out.println("Expected Account:"+exppage5Row3List);
		
		Thread.sleep(4000);

		int reportspage5Row4ListCount = reportsCol5List.size();
		ArrayList<String> reportspage5Row4ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage5Row4ListCount;i++)
		{
			String data = reportsCol5List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage5Row4ListArray.add(data);
			}

		}
		
		String actpage5Row4List = reportspage5Row4ListArray.toString();
		String exppage5Row4List = "[Opening Balance, A1, CustomerACC, H2, E1, Opening Balance, Opening Balance, Opening Balance]";

		System.out.println("Actual Account1  :"+actpage5Row4List);
		System.out.println("Expected Account1:"+exppage5Row4List);
		
		
		ArrayList<String>  AllDatapage5 = new ArrayList<String>(); 

		int count5=stockLedgerTable.size();

		System.err.println(count5);

		for(int i=0 ; i < count5 ;i++)
		{
			String style= stockLedgerTable.get(i).getAttribute("style");
			if(style.contains("overflow: visible; font-weight: bold; background-color:"))
					{
				    String data=stockLedgerTable.get(i).getText();
				    AllDatapage5.add(data);
					}
	
		}

		String actAllDatapage5 = AllDatapage5.toString();
		String expAllDatapage5 = "[BankACC [BAC001], B1 [B201], A2 [A102], Opening Balances Control A/C [OBC]]";

		System.out.println("actAllDatapage5"+actAllDatapage5);
		System.out.println("expAllDatapage5"+expAllDatapage5);

		Thread.sleep(2000);
		report_NextBtn.click();
		Thread.sleep(2000);
		

		int reportspage6Row2ListCount = reportsCol2List.size();
		ArrayList<String> reportspage6Row2ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage6Row2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage6Row2ListArray.add(data);
			}

		}
		
		
		String actpage6Row2List = reportspage6Row2ListArray.toString();
		String exppage6Row2List = "[PurVou : 10, PurRet : 1, DebNts : 1, PurVou : 2, NJv : 1]";

		System.out.println("Actaul Voucher  :"+actpage6Row2List);
		System.out.println("Expected Voucher:"+exppage6Row2List);
		
		int reportspage6Row3ListCount = reportsCol5List.size();
		ArrayList<String> reportspage6Row3ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage6Row3ListCount;i++)
		{
			String data = reportsCol5List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage6Row3ListArray.add(data);
			}

		}
		String actpage6Row3List = reportspage6Row3ListArray.toString();
		String exppage6Row3List = "[Opening Balance, B2, A1, E2, Opening Balance, Purchase, PurchaseACC]";

		
		System.out.println("Actaul Account  :"+actpage6Row3List);
		System.out.println("Expected Account:"+exppage6Row3List);
		
		Thread.sleep(4000);

	
		int reportspage6Row5ListCount = reportsCol5List.size();
		ArrayList<String> reportspage6Row5ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage6Row5ListCount;i++)
		{
			String data = reportsCol5List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage6Row5ListArray.add(data);
			}

		}
		String actpage6Row5List = reportspage6Row5ListArray.toString();
		String exppage6Row5List = "[D2, A1, D2, A1, D2]";

		System.out.println("Actual Department  :"+actpage6Row5List);
		System.out.println("Expected Department:"+exppage6Row5List);
		
		
		
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
		String expRow1List = "[Grand Total, , , , , 76.00, 77.00, 1.00, 58.00, 59.00, 1.00, 76.00, 77.00, 1.00]";
		
		System.out.println("actRow1List"+actRow1List);
		System.out.println("expRow1List"+expRow1List);
		

		
		if (actAllDatapage1.equalsIgnoreCase(expAllDatapage1) &&  actAllDatapage2.equalsIgnoreCase(expAllDatapage2) &&
				 actAllDatapage3.equalsIgnoreCase(expAllDatapage3) &&  actAllDatapage4.equalsIgnoreCase(expAllDatapage4)
				 &&  actAllDatapage5.equalsIgnoreCase(expAllDatapage5)&& actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				 && actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List)
				
				 && actPage2Row2List.equalsIgnoreCase(expPage2Row2List)
				 && actPage2Row3List.equalsIgnoreCase(expPage2Row3List) && actPage2Row4List.equalsIgnoreCase(expPage2Row4List)
				
				 
				 && actpage3Row2List.equalsIgnoreCase(exppage3Row2List)
				 && actpage3Row3List.equalsIgnoreCase(exppage3Row3List) && actpage3Row4List.equalsIgnoreCase(exppage3Row4List)
				 
				 && actpage4Row2List.equalsIgnoreCase(exppage4Row2List)
				 && actpage4Row3List.equalsIgnoreCase(exppage4Row3List) && actpage4Row4List.equalsIgnoreCase(exppage4Row4List)
				
				 && actpage5Row2List.equalsIgnoreCase(exppage5Row2List)
				 && actpage5Row3List.equalsIgnoreCase(exppage5Row3List) && actpage5Row4List.equalsIgnoreCase(exppage5Row4List)

				
				 && actpage6Row2List.equalsIgnoreCase(exppage6Row2List)
				 && actpage6Row3List.equalsIgnoreCase(exppage6Row3List) && actpage6Row5List.equalsIgnoreCase(exppage6Row5List)
				)
				 
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
		
	
	}


	public static boolean checkSubLedgerReport() throws InterruptedException
	{
		

		searchBtnInput.click();
		searchBtnInput.sendKeys("sub ledger");
		Thread.sleep(1500);
		searchBtnInput.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		Thread.sleep(2000);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys("CustomerACC");
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("CustomerACC"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
	
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
		String expRow1List = "[CustomerACC CAC001]";



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
		String expRow2List = "[Opening Balance, 1.00, 1.00, 1.00, 1.00]";



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
		String expRow3List = "[22/07/2022, Rct : 1, BankACC, 1.00, 1.00, Indian Rupees]";



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
		String expRow4List = "[25/07/2022, SalInv : 4, F1, APPLE, 1.00, 1.00, 1.00, 1.00, Indian Rupees]";



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
		String expRow5List = "[26/07/2022, NJv : 1, SalesACC, 1.00, 2.00, 1.00, 2.00, Indian Rupees]";
		

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
		String expRow6List = "[Grand Total, 3.00, 1.00, 2.00, 3.00, 1.00, 2.00]";
		
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

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List)&& actRow6List.equalsIgnoreCase(expRow6List))
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
		
		
		
	}
	
	public static boolean checkCashBookReport() throws InterruptedException
	{
		

		searchBtnInput.click();
		searchBtnInput.sendKeys("Cash Book");
		Thread.sleep(1500);
		searchBtnInput.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("CashACC"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
	
		Thread.sleep(1500);
		
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
		String expRow1List = "[Opening Balance, 1.00, 1.00, 1.00, 1.00]";



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
		String expRow2List = "[25/07/2022, SalInv : 3, E2, 1.00, 2.00, 1.00, 2.00, 1.00, 1.00]";



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
		String expRow3List = "[Total, 2.00, 2.00, 2.00, 2.00, 1.00, 1.00]";



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
		String expRow4List = "[Closing balance, 2.00, 2.00, 1.00]";



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

	public static boolean checkBankBookAccountReport() throws InterruptedException
	{
		Thread.sleep(2000);
		
		getDriver().navigate().refresh();
		
		searchBtnInput.click();
		searchBtnInput.sendKeys("Bank Book");
		Thread.sleep(1500);
		searchBtnInput.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("BankACC"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(2000);
		
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
		String expRow1List = "[Opening Balance, 1.00, 1.00, 1.00, 1.00]";



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
		String expRow2List = "[21/07/2022, PurVou : 9, A1, 1.00, 1.00, 1.00, 1.00]";



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
		String expRow3List = "[22/07/2022, Rct : 1, CustomerACC, 1.00, 1.00, 1.00, 1.00, 1.00]";



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
		String expRow4List = "[25/07/2022, SalInv : 2, E1, 1.00, 2.00, 1.00, 2.00, 1.00, 1.00]";



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
		String expRow5List = "[25/07/2022, Pmt : 1, H2, 1.00, 1.00, 1.00, 1.00, 1.00]";
		

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
		String expRow6List = "[Total, 3.00, 2.00, 1.00, 3.00, 2.00, 1.00, 2.00, 2.00]";
		
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
		String expRow7List = "[Closing balance, 1.00, 1.00]";
		
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

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List)&& 
				actRow6List.equalsIgnoreCase(expRow6List) && actRow7List.equalsIgnoreCase(expRow7List))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
		
	}

	public static boolean checkPettyCashBookReport() throws InterruptedException
	{
		
		searchBtnInput.click();
		searchBtnInput.sendKeys("Petty Cash Book");
		Thread.sleep(1500);
		searchBtnInput.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("CashACC"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		


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
		String expRow1List = "[Opening Balance, 1.00, 1.00, 1.00, 1.00]";



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
		String expRow2List = "[25/07/2022, SalInv : 3, E2, 1.00, 2.00, 1.00, 2.00, 1.00, 1.00]";



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
		String expRow3List = "[Total, 2.00, 2.00, 2.00, 2.00, 1.00, 1.00]";



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
		String expRow4List = "[Closing balance, 2.00, 2.00, 1.00]";

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
	
	public static boolean checkDayBookReport() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankBooksMenu));
		cashAndBankBooksMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dayBookReport));
		dayBookReport.click();
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
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
		String expRow1List = "[31-03-2022, OpeBal : 1, 21-07-2022, PurVou : 1, PurVou : 2, SalInv : 1, SalInv : 1, PurVou : 1, PurVou : 2, PurVou : 9, PurVou : 9, 22-07-2022, Rct : 1, Rct : 1]";
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
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
		String expRow2List = "[Opening Balance, Opening Balances Control A/C, A1, VendorACC, E1, H1, D1, Purchase, A1, BankACC, BankACC, CustomerACC]";
		
		System.out.println(actRow2List);
		System.out.println(expRow2List);
		
		
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
		String expAllDatapage1 = "[31-03-2022, 21-07-2022, 22-07-2022]";

		System.out.println("actAllDatapage1"+actAllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);
		
		Thread.sleep(2000);
		report_NextBtn.click();
		Thread.sleep(2000);
		
		
		System.out.println("*************************Printing page 1 data done*********************************");

		try{
			if(pageNum.getText().equalsIgnoreCase("3"))
					{
				report_PrevBtn.click();
					}
			
		}
		catch (Exception e) 
		{
			System.out.println("Exception "+e);

		}
		
		Thread.sleep(2000);
		
		int reportspage2Row1ListCount = reportsCol1List.size();
		ArrayList<String> reportspage2Row1ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage2Row1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row1ListArray.add(data);
			}
			
		}
		
		Iterator<String> itr1 = reportsRow2ListArray.iterator();
		while (itr1.hasNext()) 
		{ 
			String row1 = itr1.next(); 
			if (row1.equals("Sub Total"))
			{ 
				itr1.remove();
			}

		}
		
		String actpage2Row1List = reportspage2Row1ListArray.toString();
		String exppage2Row1List = "[25-07-2022, SalInv : 3, SalInv : 5, SalInv : 5, SalInv : 4, SalInv : 6, SalInv : 2, Pmt : 1, SalInv : 4, Pmt : 1, PurVou : 10, SalInv : 2, PurVou : 10, SalInv : 3, SalInv : 6, Sub Total, 26-07-2022, SalRet : 1, DebNts : 1]";
		
		System.out.println(actpage2Row1List);
		System.out.println(exppage2Row1List);
		
		Thread.sleep(2000);
		
		int reportspage2Row2ListCount = reportsCol2List.size();
		ArrayList<String> reportspage2Row2ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage2Row2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row2ListArray.add(data);
			}
			
		}
		String actpage2Row2List = reportspage2Row2ListArray.toString();
		String exppage2Row2List = "[CashACC, H1, F2, F1, SalesACC, E1, H2, CustomerACC, BankACC, D2, BankACC, B2, E2, H2, E1, E2]";
		
		System.out.println(actpage2Row2List);
		System.out.println(exppage2Row2List);
		
		
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
		String expAllDatapage2 = "[25-07-2022, 26-07-2022]";

		System.out.println("actAllDatapage2"+actAllDatapage2);
		System.out.println("expAllDatapage2"+expAllDatapage2);
		
		Thread.sleep(2000);
		report_NextBtn.click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		
		int reportspage3Row1ListCount = reportsCol1List.size();
		ArrayList<String> reportspage3Row1ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage3Row1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage3Row1ListArray.add(data);
			}
			
		}
		
		Iterator<String> itr2 = reportspage3Row1ListArray.iterator();
		while (itr2.hasNext()) 
		{ 
			String row1 = itr2.next(); 
			if (row1.equals("Sub Total"))
			{ 
				itr2.remove();
			}

		}
		String actpage3Row1List = reportspage3Row1ListArray.toString();
		String exppage3Row1List = "[PurRet : 1, SalRet : 1, NJv : 1, NJv : 1, NJv : 1, PurRet : 1, DebNts : 1, CreNts : 1, CreNts : 1, NJv : 1, Grand Total]";
		
		System.out.println(actpage3Row1List);
		System.out.println(exppage3Row1List);
		
		Thread.sleep(2000);
		
		int reportspage3Row2ListCount = reportsCol2List.size();
		ArrayList<String> reportspage3Row2ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage3Row2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage3Row2ListArray.add(data);
			}
			
		}
		String actpage3Row2List = reportspage3Row2ListArray.toString();
		String exppage3Row2List = "[A1, H1, SalesACC, VendorACC, PurchaseACC, D2, D2, B2, H2, CustomerACC]";
		
		System.out.println(actpage3Row2List);
		System.out.println(exppage3Row2List);
		
		
		System.out.println("*************************Printing page 3 data done*********************************");


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
		String expRowList = "[Grand Total, , , , 1.00, 2.00, 72.00, 75.00, 95.00, 59.00, 95.00, 59.00, 77.00, 59.00]";
		
		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) 
				&& actpage2Row1List.equalsIgnoreCase(exppage2Row1List) && actpage2Row2List.equalsIgnoreCase(exppage2Row2List) 
				&& actpage3Row1List.equalsIgnoreCase(exppage3Row1List) && actpage3Row2List.equalsIgnoreCase(exppage3Row2List) 
				&& actAllDatapage1.equalsIgnoreCase(expAllDatapage1) && actAllDatapage2.equalsIgnoreCase(expAllDatapage2) && 
				actRowList.equalsIgnoreCase(expRowList)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}	
		
	}
	
	public static boolean checkVirtualBankLedger() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankBooksMenu));
		cashAndBankBooksMenu.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(virtualBankLedgerReport));
		virtualBankLedgerReport.click();
		
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
		String expAllDatapage1 = "[CashACC [CASH001], BankACC [BAC001]]";

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
	
		int reportsRowListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> reportsRowListArray = new ArrayList<String>();
		for(int i=1;i<reportsRowListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			reportsRowListArray.add(data);
		}
		String actRowList = reportsRowListArray.toString();
		String expRowList = "[Grand Total, 5.00, 2.00, 6.00, , , , 5.00, 2.00, 6.00, , , , 3.00, 2.00, , , , ]";
		
		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
		
		
		if (actAllDatapage1.equalsIgnoreCase(expAllDatapage1) && actRowList.equalsIgnoreCase(expRowList)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}	
	
	}


	public static boolean checkSalesRegisterReport() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReportsMenu));
		salesReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesRegisterReport));
		salesRegisterReport.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("E"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
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
		String expRow1List = "[21/07/2022, SalInv : 1, Sales Invoices, H1, E1, A1, 4.00, 2.00]";



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
		String expRow2List = "[25/07/2022, SalInv : 2, Sales Invoices, BankACC, E1, A1, 1.00, 1.00]";



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
		String expRow3List = "[25/07/2022, SalInv : 3, Sales Invoices, CashACC, E2, A1, 1.00, 1.00]";



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
		String expRow4List = "[25/07/2022, SalInv : 4, Sales Invoices, CustomerACC, F1, APPLE, 1.00, 1.00]";



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
		String expRow5List = "[25/07/2022, SalInv : 5, Sales Invoices, H1, F2, APPLE, 1.00, 1.00]";
		

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
		String expRow6List = "[Grand Total, 8.00, 6.00]";
		
	
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
	
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List)&& 
				actRow6List.equalsIgnoreCase(expRow6List))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
		
	}
	
	public static boolean checkSalesReturnRegisterReport()
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReportsMenu));
		salesReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReturnRegisterReport));
		salesReturnRegisterReport.click();
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("E"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
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
		String expRow1List = "[Opening Balance, 1.00, 1.00, 1.00, 1.00]";

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
		String expRow2List = "[21/07/2022, PurVou : 9, A1, 1.00, 1.00, 1.00, 1.00]";

		System.out.println(actRow1List);
		System.out.println(expRow1List);

		System.out.println(actRow2List);
		System.out.println(expRow2List);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
		
	}
	
	public static boolean checkSalesSummaryRegisterReport()
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReportsMenu));
		salesReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(summarySalesBookReport));
		summarySalesBookReport.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("E"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		reportaccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
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
		String expRow1List = "[21/07/2022, H1, E1, SalInv : 1, H1, 4.00]";



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
		String expRow2List = "[25/07/2022, BankACC, E1, SalInv : 2, BankACC, 1.00]";



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
		String expRow3List = "[25/07/2022, CashACC, E2, SalInv : 3, CashACC, 1.00]";



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
		String expRow4List = "[25/07/2022, CustomerACC, F1, SalInv : 4, CustomerACC, 1.00]";



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
		String expRow5List = "[25/07/2022, H1, F2, SalInv : 5, H1, 1.00]";
		

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
		String expRow6List = "[Grand Total, 8.00]";
		
	
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
	
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List)&& 
				actRow6List.equalsIgnoreCase(expRow6List))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
	}
	
	public static boolean checkMonthlySalesReport()
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReportsMenu));
		salesReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(monthlySalesBookReport));
		monthlySalesBookReport.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("E"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
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
		String expRow1List = "[July, 8.00]";

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
		String expRow2List = "[Grand Total, 8.00]";

		System.out.println(actRow1List);
		System.out.println(expRow1List);

		System.out.println(actRow2List);
		System.out.println(expRow2List);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
	}
	
	public static boolean checkTopCustomersReports()
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReportsMenu));
		salesReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(topCustomersListReport));
		topCustomersListReport.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("E1"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
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
		String expRow1List = "[H1, 7.00, 7.00]";

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
		String expRow2List = "[Grand Total, 7.00, 7.00]";

		System.out.println(actRow1List);
		System.out.println(expRow1List);

		System.out.println(actRow2List);
		System.out.println(expRow2List);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
		
	}
	
	public static boolean checkTopCustomersReportsForGroupAccount()
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReportsMenu));
		salesReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(topCustomersListReport));
		topCustomersListReport.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);

		int reportaccountTxtListCount = reportaccountTxtList.size();

		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();

			if(data.equalsIgnoreCase("E"))
			{
				reportaccountTxtList.get(i).click();
			}
		}

		reportaccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

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
		String expRow1List = "[CashACC, 1.00, 1.00]";

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
		String expRow2List = "[CustomerACC, 1.00, 1.00]";


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
		String expRow3List = "[H1, 6.00, 6.00]";



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
		String expRow4List = "[Grand Total, 4.00, 4.00]";



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
	
	public static boolean checkPurchaseRegisterReport() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseReportsMenu));
		purchaseReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseRegisterReport));
		purchaseRegisterReport.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("D"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

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
		String expRow1List = "[21/07/2022, PurVou : 1, D1, 1.00, A1, 1.00, 1.00]";



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
		String expRow2List = "[21/07/2022, PurVou : 1, D1, 1.00, A2, 1.00, 1.00]";



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
		String expRow3List = "[21/07/2022, PurVou : 1, D1, 1.00, B1, 1.00, 1.00]";



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
		String expRow4List = "[21/07/2022, PurVou : 1, D1, 1.00, B2, 1.00, 1.00]";



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
		String expRow5List = "[21/07/2022, PurVou : 1, D1, 10.00, D1, 10.00, 1.00]";
		

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
		String expRow6List = "[21/07/2022, PurVou : 1, D1, 1.00, D2, 1.00, 1.00]";
		
		
		//


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
		String expRow7List = "[21/07/2022, PurVou : 1, D1, 10.00, APPLE, 10.00, 1.00]";



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
		String expRow8List = "[25/07/2022, PurVou : 10, D2, 1.00, D2, 1.00, 1.00]";



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
		String expRow9List = "[Grand Total, 26.00, 26.00, 8.00]";
		
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
	
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List)&& 
				actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List)&& 
				actRow9List.equalsIgnoreCase(expRow9List))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
		
		
	}
	
	public static boolean checkPurchaseReturnRegister() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseReportsMenu));
		purchaseReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseReturnRegisteReport));
		purchaseReturnRegisteReport.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("A"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		
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
		String expRow1List = "[26/07/2022, PurRet : 1, D2, A1, 1.00, 1.00, 1.00]";

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
		String expRow2List = "[Grand Total, 1.00, 1.00, 1.00]";

		System.out.println(actRow1List);
		System.out.println(expRow1List);

		System.out.println(actRow2List);
		System.out.println(expRow2List);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
		
	}
	
	public static boolean checkSummaryPurchaseRegister()
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseReportsMenu));
		purchaseReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(summaryPurchaseBookReport));
		summaryPurchaseBookReport.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("A"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
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
		String expRow1List = "[21/07/2022, PurVou : 1, D1, 25.00]";

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
		String expRow2List = "[21/07/2022, PurVou : 3, Vendor A, 1.00]";


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
		String expRow3List = "[21/07/2022, PurVou : 9, BankACC, 1.00]";



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
		String expRow4List = "[25/07/2022, PurVou : 10, D2, 1.00]";

		

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
		String expRow5List = "[Grand Total, 28.00]";



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
			return true;
		} 
		else 
		{
			return false;
		}

		
	}
	
	public static boolean checkOpeningBalanceRegister() throws InterruptedException
	{
		Thread.sleep(2300);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingBalanceRegisterReport));
		openingBalanceRegisterReport.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		int reportsRow1ListCount = reportsCol2List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);
		
		
		int reportsRow2ListCount = reportsCol3List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow2ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow2ListArray.add(data);
			}

		}
		
		
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[A1, A2, B1, B2, BankACC, CashACC, CustomerACC, D2, D1, E1, E2, F1, F2, H1, H2, PurchaseACC, SalesACC]";

		System.out.println("Actaul Voucher  :"+actRow2List);
		System.out.println("Expected Voucher:"+expRow2List);
		
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
	
		int Row1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> Row1ListArray = new ArrayList<String>();
		for(int i=1;i<Row1ListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			Row1ListArray.add(data);
		}
		String actList = Row1ListArray.toString();
		String expList = "[Grand Total, , , 18.00, , 18.00, , 18.00, ]";
		
		System.out.println("actRow1List"+actList);
		System.out.println("expRow1List"+expList);
		
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) &&
				actList.equalsIgnoreCase(expList))
		{
			return true;
		}
		else 
		{
			return false;
		}
	
	}
	
	public static boolean checkJournalEntryRegister() throws InterruptedException
	{
		Thread.sleep(2500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(journalEntriesRegisterReport));
		journalEntriesRegisterReport.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
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
		String expRow1List = "[26/07/2022, NJv : 1, CustomerACC, 1.00, 1.00, 1.00]";

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
		String expRow2List = "[26/07/2022, NJv : 1, VendorACC, 1.00, 1.00, 1.00]";


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
		String expRow3List = "[Grand Total, 2.00, 2.00, 2.00]";


		System.out.println(actRow1List);
		System.out.println(expRow1List);

		System.out.println(actRow2List);
		System.out.println(expRow2List);

		System.out.println(actRow3List);
		System.out.println(expRow3List);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List))
		{
			return true;
		} 
		else 
		{
			return false;
		}

		
		
	}
	
	public static boolean checkCreditNoteRegister() throws InterruptedException
	{
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditNoteRegisterReport));
		creditNoteRegisterReport.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
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
		String expRow1List = "[26/07/2022, CreNts : 1, H2, 1.00]";

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
		String expRow2List = "[Grand Total, 1.00]";


		System.out.println(actRow1List);
		System.out.println(expRow1List);

		System.out.println(actRow2List);
		System.out.println(expRow2List);

	
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List))
		{
			return true;
		} 
		else 
		{
			return false;
		}

	}
	
	public static boolean checkDebitNotesRegister() throws InterruptedException
	{
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitNoteRegisterReport));
		debitNoteRegisterReport.click();
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
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
		String expRow1List = "[21/07/2022, PurVou : 1, D1, 25.00]";

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
		String expRow2List = "[21/07/2022, PurVou : 9, BankACC, 1.00]";


		System.out.println(actRow1List);
		System.out.println(expRow1List);

		System.out.println(actRow2List);
		System.out.println(expRow2List);

	
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List))
		{
			return true;
		} 
		else 
		{
			return false;
		}

	}
	
	public static boolean checkReciptsRegister() throws InterruptedException
	{	
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsRegisterReport));
		receiptsRegisterReport.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
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
		String expRow1List = "[22/07/2022, Rct : 1, CustomerACC, 1.00, 1.00, 1.00]";

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
		String expRow2List = "[Grand Total, 1.00, 1.00, 1.00]";


		System.out.println(actRow1List);
		System.out.println(expRow1List);

		System.out.println(actRow2List);
		System.out.println(expRow2List);

	
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List))
		{
			return true;
		} 
		else 
		{
			return false;
		}

	
	}
	
	public static boolean checkPaymentsRegister() throws InterruptedException
	{
	
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(paymentRegisterReport));
		paymentRegisterReport.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
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
		String expRow1List = "[25/07/2022, Pmt : 1, H2, 1.00, 1.00, 1.00]";

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
		String expRow2List = "[Grand Total, 1.00, 1.00, 1.00]";


		System.out.println(actRow1List);
		System.out.println(expRow1List);

		System.out.println(actRow2List);
		System.out.println(expRow2List);

	
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List))
		{
			return true;
		} 
		else 
		{
			return false;
		}

	
	
	}
	
	public static boolean checkPDCReceiptsRegister() throws InterruptedException
	{

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcReceiptsRegisterReport));
		pdcReceiptsRegisterReport.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		boolean actReportTable = reportsTable.getText().isEmpty();
		boolean expReportTable = true;
		
		System.out.println(actReportTable);
		System.out.println(expReportTable);
		
		if (actReportTable== expReportTable)
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
	}
	
	public static boolean checkPDCPaymentsRegister() throws InterruptedException
	{
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		Thread.sleep(2000);
		scrollToElementJSE(pdcPaymentsRegisterReport);
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcPaymentsRegisterReport));
		pdcPaymentsRegisterReport.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		boolean actReportTable = reportsTable.getText().isEmpty();
		boolean expReportTable = true;
		
		System.out.println(actReportTable);
		System.out.println(expReportTable);
		
		if (actReportTable== expReportTable)
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
	
	}
	
	public static boolean checkEntryJournalRegister() throws InterruptedException
	{
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		Thread.sleep(2000);
		scrollToElementJSE(entryJournalRegisterReport);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(entryJournalRegisterReport));
		entryJournalRegisterReport.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(2000);

		int reportsRow2ListCount = reportsCol2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow2ListArray.add(data);
			}

		}
		
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1]";

		System.out.println("Actaul Voucher  :"+actRow2List);
		System.out.println("Expected Voucher:"+expRow2List);
		
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
		String expRow3List = "[F2, B1, Opening Balances Control A/C, H2, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, D2, E2, VendorACC, Opening Balances Control A/C, A2, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, D1, A1, Opening Balances Control A/C, Opening Balances Control A/C]";

		
		System.out.println("Actaul Account  :"+actRow3List);
		System.out.println("Expected Account:"+expRow3List);
		

		Thread.sleep(2500);
		report_NextBtn.click();
		
		Thread.sleep(2500);
		
		try{
			if(pageNum.getText().equalsIgnoreCase("3") || pageNum.getText().equalsIgnoreCase("4") )
					{
				report_PrevBtn.click();
					}
			
		}
		catch (Exception e) 
		{
			System.out.println("Exception "+e);

		}
		
		
		int reportspage2row2ListCount = reportsCol2List.size();
		ArrayList<String> reportspage2row2ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage2row2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage2row2ListArray.add(data);
			}

		}
		
		String actpage2row2List = reportspage2row2ListArray.toString();
		String exppage2row2List = "[OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, PurVou : 1, PurVou : 1]";

		System.out.println("Actaul Voucher  :"+actpage2row2List);
		System.out.println("Expected Voucher:"+exppage2row2List);
		
		int reportspage2row3ListCount = reportsCol3List.size();
		ArrayList<String> reportspage2row3ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage2row3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2row3ListArray.add(data);
			}

		}
		String actpage2row3List = reportspage2row3ListArray.toString();
		String exppage2row3List = "[Opening Balances Control A/C, F1, B2, CustomerACC, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, CashACC, Opening Balances Control A/C, BankACC, Opening Balances Control A/C, Opening Balances Control A/C, E1, Opening Balances Control A/C, SalesACC, H1, PurchaseACC, D1, A1]";

		
		System.out.println("Actaul Account  :"+actpage2row3List);
		System.out.println("Expected Account:"+exppage2row3List);
		

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
		
	
		
		int reportspage3row2ListCount = reportsCol2List.size();
		ArrayList<String> reportspage3row2ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage3row2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage3row2ListArray.add(data);
			}

		}
		
		String actpage3row2List = reportspage3row2ListArray.toString();
		String exppage3row2List = "[PurVou : 2, PurVou : 2, PurVou : 9, PurVou : 9, SalInv : 1, SalInv : 1, Rct : 1, Rct : 1, Pmt : 1, Pmt : 1, SalInv : 2, SalInv : 2, SalInv : 3, SalInv : 3, SalInv : 4, SalInv : 4, SalInv : 5, SalInv : 5, SalInv : 6]";

		System.out.println("Actaul Voucher  :"+actpage3row2List);
		System.out.println("Expected Voucher:"+exppage3row2List);
		
		int reportspage3row3ListCount = reportsCol3List.size();
		ArrayList<String> reportspage3row3ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage3row3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage3row3ListArray.add(data);
			}

		}
		String actpage3row3List = reportspage3row3ListArray.toString();
		String exppage3row3List = "[VendorACC, Purchase, A1, BankACC, H1, E1, CustomerACC, BankACC, H2, BankACC, BankACC, E1, E2, CashACC, CustomerACC, F1, H1, F2, SalesACC]";

		
		System.out.println("Actaul Account  :"+actpage3row3List);
		System.out.println("Expected Account:"+exppage3row3List);
		
		Thread.sleep(2500);
		report_NextBtn.click();
		Thread.sleep(2500);
		
		int reportspage4row2ListCount = reportsCol2List.size();
		ArrayList<String> reportspage4row2ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage4row2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage4row2ListArray.add(data);
			}

		}
		
		String actpage4row2List = reportspage4row2ListArray.toString();
		String exppage4row2List = "[SalInv : 6, PurVou : 10, PurVou : 10, NJv : 1, NJv : 1, NJv : 1, NJv : 1, CreNts : 1, CreNts : 1, DebNts : 1, DebNts : 1, PurRet : 1, PurRet : 1, SalRet : 1, SalRet : 1]";

		System.out.println("Actaul Voucher  :"+actpage4row2List);
		System.out.println("Expected Voucher:"+exppage4row2List);
		
		int reportspage4row3ListCount = reportsCol3List.size();
		ArrayList<String> reportspage4row3ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage4row3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage4row3ListArray.add(data);
			}

		}
		String actpage4row3List = reportspage4row3ListArray.toString();
		String exppage4row3List = "[H2, B2, D2, VendorACC, PurchaseACC, SalesACC, CustomerACC, H2, B2, D2, E2, D2, A1, E1, H1]";

		
		System.out.println("Actaul Account  :"+actpage4row3List);
		System.out.println("Expected Account:"+exppage4row3List);
		

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
	
		int Row1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> Row1ListArray = new ArrayList<String>();
		for(int i=1;i<Row1ListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			Row1ListArray.add(data);
		}
		String actList = Row1ListArray.toString();
		String expList = "[Grand Total, , , 77.00, 77.00, 21.00, , 77.00, 77.00, 21.00, 77.00, 77.00, 21.00]";
		
		System.out.println("actRow1List"+actList);
		System.out.println("expRow1List"+expList);
		
		if (actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) &&
				actpage2row2List.equalsIgnoreCase(exppage2row2List)&& actpage2row3List.equalsIgnoreCase(exppage2row3List) &&
				actpage3row2List.equalsIgnoreCase(exppage3row2List) && actpage3row3List.equalsIgnoreCase(exppage3row3List)&&
				actpage4row2List.equalsIgnoreCase(exppage4row2List) && actpage4row3List.equalsIgnoreCase(exppage4row3List)
				&& actList.equalsIgnoreCase(expList)) 
		{
			return true;
			
		} 
		else 
		{
			return false;
		}

	}
	
	public static boolean checkEntryJournalDetailReport() throws InterruptedException
	{

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		Thread.sleep(2000);
		scrollToElementJSE(entryJournalDetailReport);
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(entryJournalDetailReport));
		entryJournalDetailReport.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(2000);

		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);
		
		
		
		
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
		String expRow3List = "[A1, A2, B1, B2, BankACC, CashACC, CustomerACC, D2, D1, E1]";

		
		System.out.println("Actaul Account  :"+actRow3List);
		System.out.println("Expected Account:"+expRow3List);
		
		
		
		int reportsRow4ListCount = reportsCol4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow4ListArray.add(data);
			}

		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C]";

		
		System.out.println("Actaul Account  :"+actRow4List);
		System.out.println("Expected Account:"+expRow4List);
		

		Thread.sleep(2500);
		report_NextBtn.click();
		
		Thread.sleep(2500);
		
		try{
			if(pageNum.getText().equalsIgnoreCase("3") || pageNum.getText().equalsIgnoreCase("4") )
					{
				report_PrevBtn.click();
					}
			
		}
		catch (Exception e) 
		{
			System.out.println("Exception "+e);

		}
		
		
		int reportspage2row1ListCount = reportsCol1List.size();
		ArrayList<String> reportspage2row1ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage2row1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage2row1ListArray.add(data);
			}

		}
		
		String actpage2row1List = reportspage2row1ListArray.toString();
		String exppage2row1List = "[OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, PurVou : 1, PurVou : 1]";

		System.out.println("Actaul Voucher  :"+actpage2row1List);
		System.out.println("Expected Voucher:"+exppage2row1List);
		
		int reportspage2row3ListCount = reportsCol3List.size();
		ArrayList<String> reportspage2row3ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage2row3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2row3ListArray.add(data);
			}

		}
		String actpage2row3List = reportspage2row3ListArray.toString();
		String exppage2row3List = "[E2, F1, F2, H1, H2, PurchaseACC, SalesACC, VendorACC, A1]";

		
		System.out.println("Actaul Account  :"+actpage2row3List);
		System.out.println("Expected Account:"+exppage2row3List);
		
		
		int reportspage2row4ListCount = reportsCol4List.size();
		ArrayList<String> reportspage2row4ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage2row4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2row4ListArray.add(data);
			}

		}
		String actpage2row4List = reportspage2row4ListArray.toString();
		String exppage2row4List = "[Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, D1]";

		
		System.out.println("Actaul Account  :"+actpage2row4List);
		System.out.println("Expected Account:"+exppage2row4List);
		

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
		
	
		
		int reportspage3row1ListCount = reportsCol1List.size();
		ArrayList<String> reportspage3row1ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage3row1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage3row1ListArray.add(data);
			}

		}
		
		String actpage3row1List = reportspage3row1ListArray.toString();
		String exppage3row1List = "[PurVou : 2, PurVou : 2, PurVou : 9, PurVou : 9, SalInv : 1, SalInv : 1, Rct : 1, Rct : 1, SalInv : 2, SalInv : 2, SalInv : 3, SalInv : 3, SalInv : 4, SalInv : 4, SalInv : 5, SalInv : 5, SalInv : 6, SalInv : 6, PurVou : 10]";

		System.out.println("Actaul Voucher  :"+actpage3row1List);
		System.out.println("Expected Voucher:"+exppage3row1List);
		
		int reportspage3row3ListCount = reportsCol3List.size();
		ArrayList<String> reportspage3row3ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage3row3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage3row3ListArray.add(data);
			}

		}
		String actpage3row3List = reportspage3row3ListArray.toString();
		String exppage3row3List = "[Purchase, A1, H1, BankACC, BankACC, CashACC, CustomerACC, H1, H2, B2]";

		
		System.out.println("Actaul Account  :"+actpage3row3List);
		System.out.println("Expected Account:"+exppage3row3List);
		
		int reportspage3row4ListCount = reportsCol4List.size();
		ArrayList<String> reportspage3row4ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage3row4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage3row4ListArray.add(data);
			}

		}
		String actpage3row4List = reportspage3row4ListArray.toString();
		String exppage3row4List = "[VendorACC, BankACC, E1, CustomerACC, E1, E2, F1, F2, SalesACC]";

		
		System.out.println("Actaul Account  :"+actpage3row4List);
		System.out.println("Expected Account:"+exppage3row4List);
		
		
		Thread.sleep(2500);
		report_NextBtn.click();
		Thread.sleep(2500);

		
		int reportspage4row1ListCount = reportsCol1List.size();
		ArrayList<String> reportspage4row1ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage4row1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage4row1ListArray.add(data);
			}

		}
		
		String actpage4row1List = reportspage4row1ListArray.toString();
		String exppage4row1List = "[PurVou : 10, Pmt : 1, Pmt : 1, SalRet : 1, SalRet : 1, PurRet : 1, PurRet : 1, NJv : 1, NJv : 1, NJv : 1, NJv : 1, CreNts : 1, CreNts : 1, DebNts : 1, DebNts : 1, Grand Total]";

		System.out.println("Actaul Voucher  :"+actpage4row1List);
		System.out.println("Expected Voucher:"+exppage4row1List);
		
		int reportspage4row3ListCount = reportsCol3List.size();
		ArrayList<String> reportspage4row3ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage4row3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage4row3ListArray.add(data);
			}

		}
		String actpage4row3List = reportspage4row3ListArray.toString();
		String exppage4row3List = "[H2, E1, D2, CustomerACC, VendorACC, H2, E2]";

		
		System.out.println("Actaul Account  :"+actpage4row3List);
		System.out.println("Expected Account:"+exppage4row3List);
		
		int reportspage4row4ListCount = reportsCol4List.size();
		ArrayList<String> reportspage4row4ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage4row4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage4row4ListArray.add(data);
			}

		}
		String actpage4row4List = reportspage4row4ListArray.toString();
		String exppage4row4List = "[D2, BankACC, H1, A1, SalesACC, PurchaseACC, B2, D2]";

		
		System.out.println("Actaul Account  :"+actpage4row4List);
		System.out.println("Expected Account:"+exppage4row4List);
		
		

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
	
		int Row1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> Row1ListArray = new ArrayList<String>();
		for(int i=1;i<Row1ListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			Row1ListArray.add(data);
		}
		String actList = Row1ListArray.toString();
		String expList = "[Grand Total, , , , ]";
		
		System.out.println("actRow1List"+actList);
		System.out.println("expRow1List"+expList);
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List) &&
				actpage2row1List.equalsIgnoreCase(exppage2row1List)&& actpage2row3List.equalsIgnoreCase(exppage2row3List) &&  actpage2row4List.equalsIgnoreCase(exppage2row4List) &&
				actpage3row1List.equalsIgnoreCase(exppage3row1List) && actpage3row3List.equalsIgnoreCase(exppage3row3List) && actpage3row4List.equalsIgnoreCase(exppage3row4List) && 
				actpage4row1List.equalsIgnoreCase(exppage4row1List) && actpage4row3List.equalsIgnoreCase(exppage4row3List) && actpage4row4List.equalsIgnoreCase(exppage4row4List) 
				&& actList.equalsIgnoreCase(expList)) 
		{
			return true;
			
		} 
		else 
		{
			return false;
		}

	
	}
	
	public static boolean checkSalesGroupedByCustomer() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAndPurchasesReportMenu));
		salesAndPurchasesReportMenu.click();
		
		Thread.sleep(2000);
		scrollToElementJSE(salesGroupedByCustomerReport);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesGroupedByCustomerReport));
		salesGroupedByCustomerReport.click();
		
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("E"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		
		Thread.sleep(2000);
		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[BankACC, CashACC, CustomerACC, H1, H1, Grand Total]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(2000);

		int reportsRow2ListCount = reportsCol2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow2ListArray.add(data);
			}

		}
		
		
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[BankACC, CashACC, CustomerACC, H1, H1]";

		System.out.println("Actaul Voucher  :"+actRow2List);
		System.out.println("Expected Voucher:"+expRow2List);
		
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
		String expRow3List = "[A1, A1, APPLE, A1, APPLE]";

		
		System.out.println("Actaul Account  :"+actRow3List);
		System.out.println("Expected Account:"+expRow3List);
		
		Thread.sleep(4000);

		int reportsRow4ListCount = reportsCol4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow4ListArray.add(data);
			}

		}
		
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 2.00, 1.00, 3.00, 6.00]";

		System.out.println("Actual Branch  :"+actRow4List);
		System.out.println("Expected Branch:"+expRow4List);
		
		int reportsRow5ListCount = reportsCol5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsCol5List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow5ListArray.add(data);
			}

		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 4.00, 1.00, 5.00, 8.00]";

		System.out.println("Actual Department  :"+actRow5List);
		System.out.println("Expected Department:"+expRow5List);
		
		if ( actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				 && actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List)
				 && actRow5List.equalsIgnoreCase(expRow5List)) 
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static boolean checkSalesGroupedByItem() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAndPurchasesReportMenu));
		salesAndPurchasesReportMenu.click();
		
		Thread.sleep(2000);
		scrollToElementJSE(salesGroupedByProductReport);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesGroupedByProductReport));
		salesGroupedByProductReport.click();
		
		Thread.sleep(2000);
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("E"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

		Thread.sleep(2000);
		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[A1, A1, A1, APPLE, APPLE, Grand Total]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(2000);

		int reportsRow2ListCount = reportsCol2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow2ListArray.add(data);
			}

		}
		
		
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[BankACC, CashACC, H1, CustomerACC, H1]";

		System.out.println("Actaul Voucher  :"+actRow2List);
		System.out.println("Expected Voucher:"+expRow2List);
		
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
		String expRow3List = "[1.00, 1.00, 2.00, 4.00, 1.00, 1.00, 2.00, 6.00]";

		
		System.out.println("Actaul Account  :"+actRow3List);
		System.out.println("Expected Account:"+expRow3List);
		
		Thread.sleep(4000);

		int reportsRow4ListCount = reportsCol4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow4ListArray.add(data);
			}

		}
		
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[1.00, 1.00, 4.00, 6.00, 1.00, 1.00, 2.00, 8.00]";

		System.out.println("Actual Branch  :"+actRow4List);
		System.out.println("Expected Branch:"+expRow4List);
		
	
		if ( actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				 && actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List)
				) 
		{
			return true;
		}
		else
		{
			return false;
		}
		

	}
	
	public static boolean checkSalesGroupedByDepartment() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAndPurchasesReportMenu));
		salesAndPurchasesReportMenu.click();
		
		Thread.sleep(2000);
		scrollToElementJSE(salesGroupedByDepartmentReport);
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesGroupedByDepartmentReport));
		salesGroupedByDepartmentReport.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("E"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		


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
		String expRow1List = "[A1, APPLE, 2.00, 2.00]";



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
		String expRow2List = "[A1, A1, 4.00, 6.00]";



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
		String expRow3List = "[6.00, 8.00]";



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
		String expRow4List = "[Grand Total, 6.00, 8.00]";

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
	
	public static boolean checkPurchasesGroupedByVendor() throws InterruptedException
	{
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAndPurchasesReportMenu));
		salesAndPurchasesReportMenu.click();
		

		Thread.sleep(2000);
		scrollToElementJSE(purchasesGroupedByVendorReport);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesGroupedByVendorReport));
		purchasesGroupedByVendorReport.click();


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);

		int reportaccountTxtListCount = reportaccountTxtList.size();

		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();

			if(data.equalsIgnoreCase("A"))
			{
				reportaccountTxtList.get(i).click();
			}
		}

		reportaccountTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

		Thread.sleep(2000);
		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[BankACC, D1, D1, D1, D1, D1, D1, D1, D2, Vendor A, Grand Total]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(2000);

		int reportsRow2ListCount = reportsCol2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow2ListArray.add(data);
			}

		}
		
		
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[A1, A1, A2, APPLE, B1, B2, D1, D2, D2, A1]";

		System.out.println("Actaul Voucher  :"+actRow2List);
		System.out.println("Expected Voucher:"+expRow2List);
		
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
		String expRow3List = "[1.00, 1.00, 1.00, 1.00, 10.00, 1.00, 1.00, 10.00, 1.00, 25.00, 1.00, 1.00, 1.00, 1.00, 28.00]";

		
		System.out.println("Actaul Account  :"+actRow3List);
		System.out.println("Expected Account:"+expRow3List);
		
		Thread.sleep(4000);

		int reportsRow4ListCount = reportsCol4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow4ListArray.add(data);
			}

		}
		
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[1.00, 1.00, 1.00, 1.00, 10.00, 1.00, 1.00, 10.00, 1.00, 25.00, 1.00, 1.00, 1.00, 1.00, 28.00]";

		System.out.println("Actual Branch  :"+actRow4List);
		System.out.println("Expected Branch:"+expRow4List);
		
	
		if ( actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				 && actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List)
				) 
		{
			return true;
		}
		else
		{
			return false;
		}
		

	}
	
	public static boolean checkPurchasesGroupedByItem() throws InterruptedException
	{

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAndPurchasesReportMenu));
		salesAndPurchasesReportMenu.click();
		

		Thread.sleep(2000);
		scrollToElementJSE(purchasesGroupedByProductReport);
		Thread.sleep(2000);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesGroupedByProductReport));
		purchasesGroupedByProductReport.click();
		
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);

		int reportaccountTxtListCount = reportaccountTxtList.size();

		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();

			if(data.equalsIgnoreCase("A"))
			{
				reportaccountTxtList.get(i).click();
			}
		}

		reportaccountTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

		Thread.sleep(2000);
		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[A1, A1, A1, A2, APPLE, B1, B2, D1, D2, D2]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(2000);

		int reportsRow2ListCount = reportsCol2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow2ListArray.add(data);
			}

		}
		
		
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[BankACC, D1, Vendor A, D1, D1, D1, D1, D1, D1, D2]";

		System.out.println("Actaul Voucher  :"+actRow2List);
		System.out.println("Expected Voucher:"+expRow2List);
		
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
		String expRow3List = "[1.00, 1.00, 1.00, 3.00, 1.00, 1.00, 10.00, 10.00, 1.00, 1.00, 1.00, 1.00, 10.00, 10.00, 1.00, 1.00, 2.00]";

		
		System.out.println("Actaul Account  :"+actRow3List);
		System.out.println("Expected Account:"+expRow3List);
		
		Thread.sleep(4000);

		int reportsRow4ListCount = reportsCol4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow4ListArray.add(data);
			}

		}
		
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[1.00, 1.00, 1.00, 3.00, 1.00, 1.00, 10.00, 10.00, 1.00, 1.00, 1.00, 1.00, 10.00, 10.00, 1.00, 1.00, 2.00]";

		System.out.println("Actual Branch  :"+actRow4List);
		System.out.println("Expected Branch:"+expRow4List);
		
	
		if ( actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				 && actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List)
				) 
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
	
	public static boolean checkPurchasesGroupedByDepartment() throws InterruptedException
	{
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAndPurchasesReportMenu));
		salesAndPurchasesReportMenu.click();
		

		Thread.sleep(2000);
		scrollToElementJSE(purchasesGroupedByDepartmentReport);
		Thread.sleep(2000);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesGroupedByDepartmentReport));
		purchasesGroupedByDepartmentReport.click();


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);

		int reportaccountTxtListCount = reportaccountTxtList.size();

		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();

			if(data.equalsIgnoreCase("A"))
			{
				reportaccountTxtList.get(i).click();
			}
		}

		reportaccountTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();


		Thread.sleep(2000);
		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}


		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[A1, A1, A1, A1, A1, A1, A1, D2, Grand Total]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(2000);

		int reportsRow2ListCount = reportsCol2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow2ListArray.add(data);
			}

		}


		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[APPLE, D1, B2, A2, A1, D2, B1, D2]";

		System.out.println("Actaul Voucher  :"+actRow2List);
		System.out.println("Expected Voucher:"+expRow2List);

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
		String expRow3List = "[10.00, 10.00, 1.00, 1.00, 3.00, 1.00, 1.00, 27.00, 1.00, 1.00, 28.00]";


		System.out.println("Actaul Account  :"+actRow3List);
		System.out.println("Expected Account:"+expRow3List);

		Thread.sleep(4000);

		int reportsRow4ListCount = reportsCol4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow4ListArray.add(data);
			}

		}

		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[10.00, 10.00, 1.00, 1.00, 3.00, 1.00, 1.00, 27.00, 1.00, 1.00, 28.00]";

		System.out.println("Actual Branch  :"+actRow4List);
		System.out.println("Expected Branch:"+expRow4List);


		if ( actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				&& actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List)
				) 
		{
			return true;
		}
		else
		{
			return false;
		}


	}
	
	public static boolean checkPeakAndLowBlanceAmount() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MiscellaneousAnalysisReportMenu));
		MiscellaneousAnalysisReportMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(peakAndLowBalancesReport));
		peakAndLowBalancesReport.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
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
		String expRow1List = "[B2, 0, 0, 26/07/2022, 1.00, 26/07/2022, 1.00]";



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
		String expRow2List = "[BankACC, 22/07/2022, 25/07/2022, 1.00, 21/07/2022, 25/07/2022, 1.00]";



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
		String expRow3List = "[CashACC, 25/07/2022, 1.00, 25/07/2022, 1.00, 0, 0]";

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
		String expRow4List = "[CustomerACC, 25/07/2022, 1.00, 25/07/2022, 1.00, 0, 0]";
		
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=5;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow5ListArray.add(data);
			}

		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[21/07/2022, 1.00, 21/07/2022, 29.00]";



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
		String expRow6List = "[D2, 26/07/2022, 26/07/2022, 1.00, 25/07/2022, 25/07/2022, 1.00]";



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
		String expRow7List = "[E2, 26/07/2022, 1.00, 26/07/2022, 1.00, 0, 0]";



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
		String expRow8List = "[H1, 21/07/2022, 25/07/2022, 4.00, 26/07/2022, 26/07/2022, 11.00]";
		
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
		String expRow9List = "[H2, 25/07/2022, 1.00, 25/07/2022, 1.00, 0, 0]";



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
		String expRow10List = "[Opening Balances Control A/C, 0, 0, 31/03/2022, 1.00, 31/03/2022, 1.00]";
		
		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow11ListArray.add(data);
			}

		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[PurchaseACC, 0, 0, 26/07/2022, 1.00, 26/07/2022, 1.00]";



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
		String expRow12List = "[SalesACC, 0, 0, 26/07/2022, 1.00, 26/07/2022, 1.00]";



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
		String expRow13List = "[VendorACC, 0, 0, 21/07/2022, 1.00, 21/07/2022, 1.00]";



		int reportsRow14ListCount = reportsRow14List.size();
		ArrayList<String> reportsRow14ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow14ListCount;i++)
		{
			String data = reportsRow14List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow14ListArray.add(data);
			}

		}
		String actRow14List = reportsRow14ListArray.toString();
		String expRow14List = "[Grand Total, 4.00, 10.00, 6.00, 47.00]";
		
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
		

		System.out.println(actRow14List);
		System.out.println(expRow14List);
	
		
		
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				&& actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List)&&
				actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) &&
				actRow9List.equalsIgnoreCase(expRow9List) && actRow10List.equalsIgnoreCase(expRow10List)
				&& actRow11List.equalsIgnoreCase(expRow11List) && actRow12List.equalsIgnoreCase(expRow12List)&&
				actRow13List.equalsIgnoreCase(expRow13List) && actRow14List.equalsIgnoreCase(expRow14List)
				) 
		{
			return true;
		}
		else
		{
			return false;
		}
		
	
	}
	
	public static boolean checkComparativeAnalysisReport() throws InterruptedException
	{
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MiscellaneousAnalysisReportMenu));
		MiscellaneousAnalysisReportMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(comprativeAnalysisReport));
		comprativeAnalysisReport.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		


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
		String expRow1List = "[PurchaseACC, 1.00]";



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
		String expRow2List = "[SalesACC, 1.00, 2.00]";



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
		String expRow3List = "[CustomerACC, 2.00, 1.00]";



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
		String expRow4List = "[A1, 35.00, 34.00]";
		
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
		String expRow5List = "[D1, 32.00, 33.00]";



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
		String expRow6List = "[D2, 1.00]";



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
		String expRow7List = "[E1, 7.00, 6.00]";



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
		String expRow8List = "[F1, 1.00]";
		
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
		String expRow9List = "[F2, 1.00]";



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
		String expRow10List = "[H1, 5.00, 6.00]";
		
		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow11ListArray.add(data);
			}

		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[H2, 4.00, 3.00]";



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
		String expRow12List = "[CashACC, 2.00, 1.00]";



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
		String expRow13List = "[Grand Total, 12.00]";

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
		

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				&& actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List)&&
				actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) &&
				actRow9List.equalsIgnoreCase(expRow9List) && actRow10List.equalsIgnoreCase(expRow10List)
				&& actRow11List.equalsIgnoreCase(expRow11List) && actRow12List.equalsIgnoreCase(expRow12List)&&
				actRow13List.equalsIgnoreCase(expRow13List)) 
		{
			return true;
		}
		else
		{
			return false;
		}
		
	
	
	}
	
	public static boolean checkTransactionsTypeAnalysis() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MiscellaneousAnalysisReportMenu));
		MiscellaneousAnalysisReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionsTypeAnalysisReport));
		transactionsTypeAnalysisReport.click();
		
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(2000);
		
	if (actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage)) 
	{
		return true;
	} 
	else 
	{
		return false;
	}
	
	}
	
	public static boolean checkABCAnalysisAmountReport() throws InterruptedException
	{
		Thread.sleep(3000);
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		Thread.sleep(2000);
		getAction().moveToElement(MiscellaneousAnalysisReportMenu).build().perform();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MiscellaneousAnalysisReportMenu));
		MiscellaneousAnalysisReportMenu.click();
		
		getAction().moveToElement(abcAnalysisReport).build().perform();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(abcAnalysisReport));
		abcAnalysisReport.click();
		
		Thread.sleep(2000);
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
				
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		if (actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}

	}
	
	public static boolean checkInterestCalculationReport() throws InterruptedException
	{
		Thread.sleep(3000);
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MiscellaneousAnalysisReportMenu));
		MiscellaneousAnalysisReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(interestCalculationReport));
		interestCalculationReport.click();
		
		Thread.sleep(2000);
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
				
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		

		Thread.sleep(2000);
		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}
		
		


		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[BankACC, CashACC, Opening Balances Control A/C, H1, H2, CustomerACC, PurchaseACC, A1, A2, B1, B2, SalesACC, E1, E2, F1, F2, D1, D2, VendorACC]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(2000);

		int reportsRow2ListCount = reportsCol2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow2ListArray.add(data);
			}

		}


		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[0.07, 0.07, 0.99, 0.03, 0.09, 0.07, 0.06, 0.44, 0.07, 0.07, 0.07, 0.05, 0.11, 0.07, 0.06, 0.06, 0.29, 0.06, 0.06]";

		System.out.println("Actaul Voucher  :"+actRow2List);
		System.out.println("Expected Voucher:"+expRow2List);

		Thread.sleep(2000);
		
		report_NextBtn.click();
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
	
		int Row1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> Row1ListArray = new ArrayList<String>();
		for(int i=1;i<Row1ListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			Row1ListArray.add(data);
		}
		String actList = Row1ListArray.toString();
		String expList = "[Grand Total, 0.22]";
		
		System.out.println("actRow1List"+actList);
		System.out.println("expRow1List"+expList);
		
		
		if (actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) 
				&& actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) 
				&& actList.equalsIgnoreCase(expList)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}

	
	}
		
	public static boolean checkMasterInfoOfAccountReport() throws InterruptedException
	{
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersInformationMenu));
		mastersInformationMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterInfoMenu));
		masterInfoMenu.click();
	
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

		Thread.sleep(2000);
		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}


		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[BankACC, CashACC, Opening Balances Control A/C, H, H1, H2, CustomerACC, PurchaseACC, A, A1, A2, B, B1, B2, SalesACC, E, E1]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(2000);
		
		report_NextBtn.click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		int reportspage2Row1ListCount = reportsCol1List.size();
		ArrayList<String> reportspage2Row1ListArray = new ArrayList<String>();
		for(int i=0;i<reportspage2Row1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportspage2Row1ListArray.add(data);
			}

		}


		String actpage2Row1List = reportspage2Row1ListArray.toString();
		String exppage2Row1List = "[E2, F, F1, F2, D, D1, D2, VendorACC]";

		System.out.println("Actaul Voucher  :"+actpage2Row1List);
		System.out.println("Expected Voucher:"+exppage2Row1List);
		
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actpage2Row1List.equalsIgnoreCase(exppage2Row1List))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
	}
	
	
	public static boolean checkProductLableReport() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersInformationMenu));
		mastersInformationMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(productLabelMenu));
		productLabelMenu.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(1500);
		
		boolean actdocumentTxt    					=documentTxt.isDisplayed();
		boolean actlayoutTxt						=layoutTxt.isDisplayed();
		boolean actdocumentRadioBtn					=documentRadioBtn.isDisplayed();
		boolean actitemRadioBtn					    =itemRadioBtn.isDisplayed();
		
		
		boolean actpl_printBtn       = pl_printBtn.isDisplayed();
		boolean actpl_CloseBtn       = pl_CloseBtn.isDisplayed();
		
		
		// Expected
		
		boolean expdocumentTxt    					=true;
		boolean explayoutTxt						=true;
		boolean expdocumentRadioBtn					=true;
		boolean expitemRadioBtn					    =true;
		
	
		boolean exppl_printBtn       = true;
		boolean exppl_CloseBtn       = true;
		
		System.out.println("************************************checkProductLabelOptions******************************************");
		
		System.out.println("documentTxt     		 	:   "+actdocumentTxt			+" Value Expected : "+expdocumentTxt);
		System.out.println("layoutTxt     		 		:   "+actlayoutTxt				+" Value Expected : "+explayoutTxt);
		System.out.println("documentRadioBtn     		:   "+actdocumentRadioBtn		+" Value Expected : "+expdocumentRadioBtn);
		System.out.println("itemRadioBtn     		 	:   "+actitemRadioBtn			+" Value Expected : "+expitemRadioBtn);
		
		//System.out.println("pl_previewBtn     		 	:   "+actpl_previewBtn			+" Value Expected : "+exppl_previewBtn);
		System.out.println("pl_printBtn     		 	:   "+actpl_printBtn			+" Value Expected : "+exppl_printBtn);
		System.out.println("pl_CloseBtn     		 	:   "+actpl_CloseBtn			+" Value Expected : "+exppl_CloseBtn);
		
		boolean actMethod=actdocumentTxt==expdocumentTxt && actlayoutTxt==explayoutTxt && actdocumentRadioBtn==expdocumentRadioBtn && actitemRadioBtn==expitemRadioBtn
				 && actpl_printBtn==exppl_printBtn && actpl_CloseBtn==exppl_CloseBtn;
		
		String actResult=Boolean.toString(actMethod);
		String expResult="true";
		
		if(actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && actResult.equalsIgnoreCase(expResult))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pl_CloseBtn));
			pl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pl_CloseBtn));
			pl_CloseBtn.click();
			return false;
		}

	}
	
	
	public static boolean checkUnitConversionReport() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
	    Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersInformationMenu));
		mastersInformationMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitConversionMenu));
		unitConversionMenu.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
				
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		boolean actReportTable = reportsTable.getText().isEmpty();
		boolean expReportTable = true;
		
		System.out.println(actReportTable);
		System.out.println(expReportTable);
		
		if (actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) &&
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1) && 
				actReportTable==expReportTable) 
		{
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	
	}
	
	public static boolean checkSkidDefinitionReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersInformationMenu));
		mastersInformationMenu.click();
		
		Thread.sleep(2000);
		getAction().moveToElement(skidDefinitionMenu).build().perform();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(skidDefinitionMenu));
		skidDefinitionMenu.click();
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(skid));
		boolean actskid    				  = skid.isDisplayed();
		boolean actprefixTxt			  = prefixTxt.isDisplayed();
		boolean actstartingNoTxt		  = startingNoTxt.isDisplayed();
		boolean actenableReprintChkBox	  = enableReprintChkBox.isDisplayed();
		boolean actquantityTxt            = quantityTxt.isDisplayed();
		boolean actsd_PreviewBtn          = sd_PreviewBtn.isDisplayed();
		boolean actsd_printBtn            = sd_PrintBtn.isDisplayed();
		boolean actsd_CloseBtn            = sd_CloseBtn.isDisplayed();
		
		
		// Expected
		
		boolean expskid    				  = true;
		boolean expprefixTxt		  	  = true;
		boolean expstartingNoTxt		  = true;
		boolean expenableReprintChkBox	  = true;
		boolean expquantityTxt            = true;
		boolean expsd_PreviewBtn          = true;
		boolean expsd_printBtn            = true;
		boolean expsd_CloseBtn            = true;
		
		System.out.println("************************************checkSkidDefinitionOptions******************************************");
		
		System.out.println("skid     		 	      :   "+actskid			      +" Value Expected : "+expskid);
		System.out.println("prefixTxt     		 	  :   "+actprefixTxt		  +" Value Expected : "+expprefixTxt);
		System.out.println("startingNoTxt     		  :   "+actstartingNoTxt	  +" Value Expected : "+expstartingNoTxt);
		System.out.println("enableReprintChkBox       :   "+actenableReprintChkBox+" Value Expected : "+expenableReprintChkBox);
		System.out.println("quantityTxt     		  :   "+actquantityTxt		  +" Value Expected : "+expquantityTxt);
		System.out.println("sd_PreviewBtn     		  :   "+actsd_PreviewBtn	  +" Value Expected : "+expsd_PreviewBtn);
		System.out.println("sd_printBtn     		  :   "+actsd_printBtn		  +" Value Expected : "+expsd_printBtn);
		System.out.println("sd_CloseBtn     		  :   "+actsd_CloseBtn		  +" Value Expected : "+expsd_CloseBtn);
		
		
		
		boolean actMethod=actskid==expskid && actprefixTxt==expprefixTxt && actstartingNoTxt==expstartingNoTxt && actenableReprintChkBox==expenableReprintChkBox
				&& actquantityTxt==expquantityTxt && actsd_PreviewBtn==expsd_PreviewBtn && actsd_printBtn==expsd_printBtn && actsd_CloseBtn==expsd_CloseBtn;
		
		
		
		String actResult=Boolean.toString(actMethod);
		String expResult="true";

		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sd_CloseBtn));
		sd_CloseBtn.click();
		
		if(actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && actResult.equalsIgnoreCase(expResult))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static boolean checkAuditTrailTransactionsOfOpeningBalances() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();

		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(auditTrailMenu));
		auditTrailMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(auditTrailtransactionsReport));
		auditTrailtransactionsReport.click();


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportVoucherTxt));
		reportVoucherTxt.click();
		reportVoucherTxt.sendKeys(Keys.SPACE);

		int reportVoucherTxtListCount = reportVoucherTxtList.size();

		for(int i=0;i<reportVoucherTxtListCount;i++)
		{
			String data = reportVoucherTxtList.get(i).getText();

			if(data.equalsIgnoreCase("Opening Balances"))
			{
				reportVoucherTxtList.get(i).click();
			}
		}

		reportVoucherTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();


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
		String expRow1List = "[OpeBal : 1, 26/07/2022, 16:16:42, Opening Balances Control A/C, 1.00, Unchecked, Modified, RER]";



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
		String expRow2List = "[OpeBal : 1, 26/07/2022, 16:17:27, Opening Balances Control A/C, 1.00, Unchecked, Modified, RER]";



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
		String expRow3List = "[Grand Total, 2.00]";


	    System.out.println(actRow1List);
		System.out.println(expRow1List);

		System.out.println(actRow2List);
		System.out.println(expRow2List);

		System.out.println(actRow3List);
		System.out.println(expRow3List);

		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List))
		{
				
			return true;
		} 
		else 
		{
			return false;
		}

	}
	
	public static boolean checkAuditTrailLoginsOfUsers() throws InterruptedException
	{
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(auditTrailMenu));
		auditTrailMenu.click();
		
		
		getAction().moveToElement(aAuditTrailloginsReport).build().perform();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(aAuditTrailloginsReport));
		aAuditTrailloginsReport.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportUsersTxt));
		reportUsersTxt.click();
		reportUsersTxt.sendKeys(Keys.SPACE);
		
		int reportUsersTxtListCount = reportUsersTxtList.size();
		
		for(int i=0;i<reportUsersTxtListCount;i++)
		{
			String data = reportUsersTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("UserAllOptionsST"))
			{
				reportUsersTxtList.get(i).click();
			}
		}
		
		reportUsersTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		Thread.sleep(2000);
		
		boolean ReportTable =reportTable.isDisplayed();
		String actReportTable = Boolean.toString(ReportTable);
		String expReportTable = "true";
		
		
		if (actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && actReportTable.equalsIgnoreCase(expReportTable)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
	}
	
	public static boolean checkAccountQueryReport() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		Thread.sleep(2000);
		getAction().moveToElement(accountQuery).build().perform();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountQuery));
		accountQuery.click();
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
			
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountQueryTxt));
		accountQueryTxt.click();
		accountQueryTxt.sendKeys("BankACC");
		Thread.sleep(1500);
		
		accountQueryTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getAccountDetailsBtn));
		getAccountDetailsBtn.click();
		

		Thread.sleep(2500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AQ_OpnBal));
		String actAQ_OpnBal				        =AQ_OpnBal.getText();
		String actAQ_Credit		                =AQ_Credit.getText();
		String actAQ_Debit				        =AQ_Debit.getText();
		String actAQ_Balance			        =AQ_Balance.getText();
		
		String expAQ_OpnBal				        ="0.00";
		String expAQ_Credit		                ="2.00";
		String expAQ_Debit				        ="2.00";
		String expAQ_Balance			        ="0.00";
		
		System.out.println("************************************checkAccountQueryOfBRCOGSACCINVAccount*************************************");
		
		System.out.println("AQ_OpnBal     		 :   "+actAQ_OpnBal			+" Value Expected : "+expAQ_OpnBal);
		System.out.println("AQ_Credit            :   "+actAQ_Credit			+" Value Expected : "+expAQ_Credit);
		System.out.println("AQ_Debit     		 :   "+actAQ_Debit			+" Value Expected : "+expAQ_Debit);
		System.out.println("AQ_Balance     	     :   "+actAQ_Balance		+" Value Expected : "+expAQ_Balance);

		ArrayList<String>  creditList1 = new ArrayList<String>(); 

		int count=CreditTransactionsTableR1.size();

		System.err.println(count);

		for(int i=0 ; i < count ;i++)
		{
			String data=CreditTransactionsTableR1.get(i).getText();
			creditList1.add(data);

		}

		String actcreditListR1 = creditList1.toString();
		String expcreditListR1 = "[25-07-2022, Pmt : 1, H2, 1.00]";

		System.out.println("actcreditList"+actcreditListR1);
		System.out.println("expcreditList"+expcreditListR1);

		
		ArrayList<String>  creditList2 = new ArrayList<String>(); 

		int count2=CreditTransactionsTableR2.size();

		System.err.println(count2);

		for(int i=0 ; i < count2 ;i++)
		{
			String data=CreditTransactionsTableR2.get(i).getText();
			creditList2.add(data);

		}

		String actcreditListR2 = creditList2.toString();
		String expcreditListR2 = "[21-07-2022, PurVou : 9, A1, 1.00]";

		System.out.println("actcreditList"+actcreditListR2);
		System.out.println("expcreditList"+expcreditListR2);

		
		

		ArrayList<String>  DebitList1 = new ArrayList<String>(); 

		int count3=debitTransactionsTableR1.size();

		System.err.println(count3);

		for(int i=0 ; i < count3 ;i++)
		{
			String data=debitTransactionsTableR1.get(i).getText();
			DebitList1.add(data);

		}

		String actDebitListR1 = DebitList1.toString();
		String expDebitListR1 = "[25-07-2022, SalInv : 2, E1, 1.00]";

		System.out.println("actDebitList"+actDebitListR1);
		System.out.println("expDebitList"+expDebitListR1);

		
		ArrayList<String>  DebitList2 = new ArrayList<String>(); 

		int count4=debitTransactionsTableR2.size();

		System.err.println(count4);

		for(int i=0 ; i < count4 ;i++)
		{
			String data=debitTransactionsTableR2.get(i).getText();
			DebitList2.add(data);

		}

		String actDebitListR2 = DebitList2.toString();
		String expDebitListR2 = "[22-07-2022, Rct : 1, CustomerACC, 1.00]";

		System.out.println("actDebitList"+actDebitListR2);
		System.out.println("expDebitList"+expDebitListR2);

		
		ArrayList<String>  DebitList3 = new ArrayList<String>(); 

		int count5=debitTransactionsTableR3.size();

		System.err.println(count5);

		for(int i=0 ; i < count5 ;i++)
		{
			String data=debitTransactionsTableR3.get(i).getText();
			DebitList3.add(data);

		}

		String actDebitListR3 = DebitList3.toString();
		String expDebitListR3 = "[31-03-2022, OpeBal : 1, Opening Balances Control A/C, 1.00]";

		System.out.println("actDebitList"+actDebitListR3);
		System.out.println("expDebitList"+expDebitListR3);

		Thread.sleep(2000);
		departmentBillWiseToggle.click();
		Thread.sleep(2000);
		
		
		ArrayList<String>  tagList1 = new ArrayList<String>(); 

		int count1=TagTransactionTableR1.size();

		System.err.println(count1);

		for(int i=0 ; i < count1 ;i++)
		{
			String data=TagTransactionTableR1.get(i).getText();
			tagList1.add(data);

		}

		String acttagListR1 = tagList1.toString();
		String exptagListR1 = "[1, A1, 2.00 Dr]";

		System.out.println("acttagList"+acttagListR1);
		System.out.println("exptagList"+exptagListR1);
		
		
		ArrayList<String>  tagList2 = new ArrayList<String>(); 

		int tcount2=TagTransactionTableR2.size();

		System.err.println(tcount2);

		for(int i=0 ; i < tcount2 ;i++)
		{
			String data=TagTransactionTableR2.get(i).getText();
			tagList2.add(data);

		}

		String acttagListR2 = tagList2.toString();
		String exptagListR2 = "[2, D2, 1.00 Cr]";

		System.out.println("acttagList"+acttagListR2);
		System.out.println("exptagList"+exptagListR2);
		
		ArrayList<String>  tagList3 = new ArrayList<String>(); 

		int tcount3=TagTransactionTableR3.size();

		System.err.println(tcount3);

		for(int i=0 ; i < tcount3 ;i++)
		{
			String data=TagTransactionTableR3.get(i).getText();
			tagList3.add(data);

		}

		String acttagListR3 = tagList3.toString();
		String exptagListR3 = "[3, 1.00 Dr]";

		System.out.println("acttagList"+acttagListR3);
		System.out.println("exptagList"+exptagListR3);
		
		
		
		if (actAQ_OpnBal.equalsIgnoreCase(expAQ_OpnBal) && actAQ_Credit.equalsIgnoreCase(expAQ_Credit)
					&& actAQ_Debit.equalsIgnoreCase(expAQ_Debit) && actAQ_Balance.equalsIgnoreCase(expAQ_Balance)
					&& actcreditListR1.equalsIgnoreCase(expcreditListR1) && actcreditListR2.equalsIgnoreCase(expcreditListR2)
					&& actDebitListR1.endsWith(expDebitListR1) && actDebitListR2.equalsIgnoreCase(expDebitListR2) 
					&& actDebitListR3.equalsIgnoreCase(expDebitListR3) && acttagListR1.equalsIgnoreCase(exptagListR1)
					&& acttagListR2.equalsIgnoreCase(exptagListR2) && acttagListR3.equalsIgnoreCase(exptagListR3))
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
	}

	public boolean checkTransactionAuthorizationReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		Thread.sleep(2000);
		getAction().moveToElement(transactionAuthorizationReport).build().perform();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationReport));
		transactionAuthorizationReport.click();
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		//Thread.sleep(1500);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportVoucherTxt));
		reportVoucherTxt.click();
		reportVoucherTxt.sendKeys(Keys.SPACE);
		
		int reportVoucherTxtListCount = reportVoucherTxtList.size();
		
		for(int i=0;i<reportVoucherTxtListCount;i++)
		{
			String data = reportVoucherTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase Voucher VAT"))
			{
				reportVoucherTxtList.get(i).click();
			}
		}
		
		reportVoucherTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(2000);
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		boolean actReportTable = reportsTable.getText().isEmpty();
		boolean expReportTable = true;
		
		System.out.println(actReportTable);
		System.out.println(expReportTable);
		
		if (actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) &&
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1) && 
				actReportTable==expReportTable) 
		{
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
	
	public boolean checkMasterAuthorizationReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		Thread.sleep(2000);
		scrollToElementJSE(masterAuthorizationReport);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAuthorizationReport));
		masterAuthorizationReport.click();
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(1500);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		Thread.sleep(2000);
		
		boolean actReportTable = reportsTable.getText().isEmpty();
		boolean expReportTable = true;
		
		System.out.println(actReportTable);
		System.out.println(expReportTable);
		
		if (actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) &&
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1) && 
				actReportTable==expReportTable) 
		{
		
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
	
	//receivable payable analysis
	
	public static boolean checkCustomerListingOfOutstandingBillsReport() throws InterruptedException
	{	
		Thread.sleep(2000);
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		customerDetailMenu.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerListingOfOutstandingBillsReport));
		customerDetailsCustomerListingOfOutstandingBillsReport.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		Thread.sleep(2000);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}


		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[H1 [H801], OpeBal:1, SalInv:1, SalInv:5, SalRet:1, Sub Total, H2 [H802], OpeBal:1, SalInv:6, Pmt:1, CreNts:1, Sub Total, CustomerACC [CAC001], OpeBal:1, Rct:1, SalInv:4, NJv:1, Sub Total, Grand Total]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow3ListCount = reportsCol3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow3ListArray.add(data);
			}

		}


		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[H1, H1, H1, H1, H2, H2, H2, H2, CustomerACC, CustomerACC, CustomerACC, CustomerACC]";

		System.out.println("Actaul Voucher  :"+actRow3List);
		System.out.println("Expected Voucher:"+expRow3List);

		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow4ListCount = reportsCol4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow4ListArray.add(data);
			}

		}


		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[1.00, 4.00, 1.00, 11.00, 5.00, 1.00, 1.00, 1.00, 1.00, 4.00, 1.00, 1.00, 1.00, 1.00, 2.00, 1.00]";

		System.out.println("Actaul Voucher  :"+actRow4List);
		System.out.println("Expected Voucher:"+expRow4List);


		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow5ListCount = reportsCol5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsCol5List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow5ListArray.add(data);
			}

		}


		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[1.00, 4.00, 1.00, 11.00, 5.00, 1.00, 1.00, 1.00, 1.00, 4.00, 1.00, 1.00, 1.00, 1.00, 2.00, 1.00]";

		System.out.println("Actaul Voucher  :"+actRow5List);
		System.out.println("Expected Voucher:"+expRow5List);



		Thread.sleep(2000);
		int reportsRow6ListCount = reportsCol6List.size();
		ArrayList<String> reportsRow6ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow6ListCount;i++)
		{
			String data = reportsCol6List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow6ListArray.add(data);
			}

		}


		String actRow6List = reportsRow6ListArray.toString();
		String expRow6List = "[1.00, 5.00, 6.00, 5.00, 5.00, 1.00, 2.00, 3.00, 4.00, 4.00, 1.00, 1.00, 2.00, 2.00, 21.00]";

		System.out.println("Actaul Voucher  :"+actRow6List);
		System.out.println("Expected Voucher:"+expRow6List);


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
		String expAllDatapage1 = "[H1 [H801], H2 [H802], CustomerACC [CAC001]]";

		System.out.println("actAllDatapage1"+actAllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);

		/*
		int reportsRow6ListCount = reportsRow6List.size();
		ArrayList<String> reportsRow6ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow6ListCount-1;i++)
		{
			String data = reportsRow6List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow6ListArray.add(data);
			}

		}
		String actRow6List = reportsRow6ListArray.toString();
		String expRow6List = "[Sub Total, 5.00, 5.00, 5.00, 5.00, 5.00, 5.00, 219]";


		System.out.println(actRow6List);
		System.out.println(expRow6List);


		int reportsRow12ListCount = reportsRow12List.size();
		ArrayList<String> reportsRow12ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow12ListCount-1;i++)
		{
			String data = reportsRow12List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow12ListArray.add(data);
			}

		}
		String actRow12List = reportsRow12ListArray.toString();
		String expRow12List = "[Sub Total, 4.00, 4.00, 4.00, 2.00, 4.00, 4.00, 215]";


		System.out.println(actRow12List);
		System.out.println(expRow12List);

		int reportsRow18ListCount = reportsRow18List.size();
		ArrayList<String> reportsRow18ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow18ListCount-1;i++)
		{
			String data = reportsRow18List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow18ListArray.add(data);
			}

		}
		String actRow18List = reportsRow18ListArray.toString();
		String expRow18List = "[Sub Total, 2.00, 2.00, 2.00, 2.00, 2.00, 2.00, 218]";


		System.out.println(actRow18List);
		System.out.println(expRow18List);


		 */
		/*
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

		int Row1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> Row1ListArray = new ArrayList<String>();
		for(int i=1;i<Row1ListCount-3;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			Row1ListArray.add(data);
		}
		String actRowList =Row1ListArray.toString();
		String expRowList = "[Grand Total, , , 1.00, 1.00, 21.00, , 1.00, 1.00, 1.00, , , , , , 652, , ]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
		 */

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow3List.equalsIgnoreCase(expRow3List) && 
				actRow4List.equalsIgnoreCase(expRow4List)  && actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) /*&& actRow12List.equalsIgnoreCase(expRow12List)
				&& actRow18List.equalsIgnoreCase(expRow18List) && actAllDatapage1.equalsIgnoreCase(expAllDatapage1) 
				&& actRowList.equalsIgnoreCase(expRowList)*/)

		{
			return true;
		} 
		else 
		{
			return false;
		}

	}
	
	
	public static boolean checkCustomerStatementsReport() throws InterruptedException
	{
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		customerDetailMenu.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerStatementsReport));
		customerDetailsCustomerStatementsReport.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}


		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[H1 [H801], OpeBal:1, SalInv:1, SalInv:5, SalRet:1, Sub Total, H2 [H802], OpeBal:1, SalInv:6, Pmt:1, CreNts:1, Sub Total, CustomerACC [CAC001], OpeBal:1, Rct:1, SalInv:4, NJv:1, Sub Total, Grand Total]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow3ListCount = reportsCol3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow3ListArray.add(data);
			}

		}


		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[H1, H1, H1, H1, H2, H2, H2, H2, CustomerACC, CustomerACC, CustomerACC, CustomerACC]";

		System.out.println("Actaul Voucher  :"+actRow3List);
		System.out.println("Expected Voucher:"+expRow3List);

		Thread.sleep(2000);
		

		Thread.sleep(2000);
		int reportsRow4ListCount = reportsCol4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow4ListArray.add(data);
			}

		}


		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[1.00, 4.00, 1.00, 11.00, 5.00, 1.00, 1.00, 1.00, 1.00, 4.00, 1.00, 1.00, 1.00, 1.00, 2.00, 1.00]";

		System.out.println("Actaul Voucher  :"+actRow4List);
		System.out.println("Expected Voucher:"+expRow4List);


		Thread.sleep(2000);
		

		Thread.sleep(2000);
		int reportsRow7ListCount = reportsCol7List.size();
		ArrayList<String> reportsRow7ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow7ListCount;i++)
		{
			String data = reportsCol7List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow7ListArray.add(data);
			}

		}


		String actRow7List = reportsRow7ListArray.toString();
		String expRow7List = "[1.00, 4.00, 1.00, 11.00, 5.00, 1.00, 1.00, 1.00, 1.00, 4.00, 1.00, 1.00, 1.00, 1.00, 2.00, 1.00]";

		System.out.println("Actaul Voucher  :"+actRow7List);
		System.out.println("Expected Voucher:"+expRow7List);
		


		Thread.sleep(2000);
		int reportsRow8ListCount = reportsCol8List.size();
		ArrayList<String> reportsRow8ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow8ListCount;i++)
		{
			String data = reportsCol8List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow8ListArray.add(data);
			}

		}


		String actRow8List = reportsRow8ListArray.toString();
		String expRow8List = "[1.00, 5.00, 6.00, 5.00, 7.00, 1.00, 2.00, 3.00, 4.00, 10.00, 1.00, 1.00, 2.00, 4.00, 21.00]";

		System.out.println("Actaul Voucher  :"+actRow8List);
		System.out.println("Expected Voucher:"+expRow8List);
		
		
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
		String expAllDatapage1 = "[H1 [H801], H2 [H802], CustomerACC [CAC001]]";

		System.out.println("actAllDatapage1"+actAllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);

/*
		int reportsRow6ListCount = reportsRow6List.size();
		ArrayList<String> reportsRow6ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow6ListCount-1;i++)
		{
			String data = reportsRow6List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow6ListArray.add(data);
			}

		}
		String actRow6List = reportsRow6ListArray.toString();
		String expRow6List = "[Sub Total, 5.00, 5.00, 5.00, 5.00, 5.00, 5.00, 219]";


		System.out.println(actRow6List);
		System.out.println(expRow6List);


		int reportsRow12ListCount = reportsRow12List.size();
		ArrayList<String> reportsRow12ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow12ListCount-1;i++)
		{
			String data = reportsRow12List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow12ListArray.add(data);
			}

		}
		String actRow12List = reportsRow12ListArray.toString();
		String expRow12List = "[Sub Total, 4.00, 4.00, 4.00, 2.00, 4.00, 4.00, 215]";


		System.out.println(actRow12List);
		System.out.println(expRow12List);

		int reportsRow18ListCount = reportsRow18List.size();
		ArrayList<String> reportsRow18ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow18ListCount-1;i++)
		{
			String data = reportsRow18List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow18ListArray.add(data);
			}

		}
		String actRow18List = reportsRow18ListArray.toString();
		String expRow18List = "[Sub Total, 2.00, 2.00, 2.00, 2.00, 2.00, 2.00, 218]";


		System.out.println(actRow18List);
		System.out.println(expRow18List);


*/
/*
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

		int Row1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> Row1ListArray = new ArrayList<String>();
		for(int i=1;i<Row1ListCount-3;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			Row1ListArray.add(data);
		}
		String actRowList =Row1ListArray.toString();
		String expRowList = "[Grand Total, , , 1.00, 1.00, 21.00, , 1.00, 1.00, 1.00, , , , , , 652, , ]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
*/

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow3List.equalsIgnoreCase(expRow3List) && 
				actRow4List.equalsIgnoreCase(expRow4List)  && actRow7List.equalsIgnoreCase(expRow7List) &&
				actRow8List.equalsIgnoreCase(expRow8List) /*&& actRow12List.equalsIgnoreCase(expRow12List)
				&& actRow18List.equalsIgnoreCase(expRow18List) && actAllDatapage1.equalsIgnoreCase(expAllDatapage1) 
				&& actRowList.equalsIgnoreCase(expRowList)*/)

		{
			return true;
		} 
		else 
		{
			return false;
		}

	
	}
	public static boolean checkCustomerDueDateAnalysis() throws InterruptedException
	{	
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		customerDetailMenu.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerDueDateAnalysisReport));
		customerDetailsCustomerDueDateAnalysisReport.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}


		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[H1 H801, OpeBal:1, SalInv:1, SalInv:5, SalRet:1, Sub Total, H2 H802, OpeBal:1, SalInv:6, Pmt:1, CreNts:1, Sub Total, CustomerACC CAC001, OpeBal:1, Rct:1, SalInv:4, NJv:1, Sub Total, Grand Total]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow3ListCount = reportsCol3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow3ListArray.add(data);
			}

		}


		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[H1, H1, H1, H1, H2, H2, H2, H2, CustomerACC, CustomerACC, CustomerACC, CustomerACC]";

		System.out.println("Actaul Voucher  :"+actRow3List);
		System.out.println("Expected Voucher:"+expRow3List);

		Thread.sleep(2000);
		

		Thread.sleep(2000);
		int reportsRow4ListCount = reportsCol4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow4ListArray.add(data);
			}

		}


		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[1.00, 4.00, 1.00, 11.00, 5.00, 1.00, 1.00, 1.00, 1.00, 4.00, 1.00, 1.00, 1.00, 1.00, 2.00, 1.00]";

		System.out.println("Actaul Voucher  :"+actRow4List);
		System.out.println("Expected Voucher:"+expRow4List);


		Thread.sleep(2000);
		

		Thread.sleep(2000);
		int reportsRow7ListCount = reportsCol7List.size();
		ArrayList<String> reportsRow7ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow7ListCount;i++)
		{
			String data = reportsCol7List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow7ListArray.add(data);
			}

		}


		String actRow7List = reportsRow7ListArray.toString();
		String expRow7List = "[1.00, 4.00, 1.00, 11.00, 5.00, 1.00, 1.00, 1.00, 1.00, 4.00, 1.00, 1.00, 1.00, 1.00, 2.00, 1.00]";

		System.out.println("Actaul Voucher  :"+actRow7List);
		System.out.println("Expected Voucher:"+expRow7List);
		


		Thread.sleep(2000);
		int reportsRow8ListCount = reportsCol8List.size();
		ArrayList<String> reportsRow8ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow8ListCount;i++)
		{
			String data = reportsCol8List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow8ListArray.add(data);
			}

		}


		String actRow8List = reportsRow8ListArray.toString();
		String expRow8List = "[1.00, 5.00, 6.00, 5.00, 7.00, 1.00, 2.00, 3.00, 4.00, 10.00, 1.00, 1.00, 2.00, 4.00, 21.00]";

		System.out.println("Actaul Voucher  :"+actRow8List);
		System.out.println("Expected Voucher:"+expRow8List);
		
		
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
		String expAllDatapage1 = "[H1 H801, H2 H802, CustomerACC CAC001]";

		System.out.println("actAllDatapage1"+actAllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);

/*
		int reportsRow6ListCount = reportsRow6List.size();
		ArrayList<String> reportsRow6ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow6ListCount-1;i++)
		{
			String data = reportsRow6List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow6ListArray.add(data);
			}

		}
		String actRow6List = reportsRow6ListArray.toString();
		String expRow6List = "[Sub Total, 5.00, 5.00, 5.00, 5.00, 5.00, 5.00, 219]";


		System.out.println(actRow6List);
		System.out.println(expRow6List);


		int reportsRow12ListCount = reportsRow12List.size();
		ArrayList<String> reportsRow12ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow12ListCount-1;i++)
		{
			String data = reportsRow12List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow12ListArray.add(data);
			}

		}
		String actRow12List = reportsRow12ListArray.toString();
		String expRow12List = "[Sub Total, 4.00, 4.00, 4.00, 2.00, 4.00, 4.00, 215]";


		System.out.println(actRow12List);
		System.out.println(expRow12List);

		int reportsRow18ListCount = reportsRow18List.size();
		ArrayList<String> reportsRow18ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow18ListCount-1;i++)
		{
			String data = reportsRow18List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow18ListArray.add(data);
			}

		}
		String actRow18List = reportsRow18ListArray.toString();
		String expRow18List = "[Sub Total, 2.00, 2.00, 2.00, 2.00, 2.00, 2.00, 218]";


		System.out.println(actRow18List);
		System.out.println(expRow18List);


*/
/*
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

		int Row1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> Row1ListArray = new ArrayList<String>();
		for(int i=1;i<Row1ListCount-3;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			Row1ListArray.add(data);
		}
		String actRowList =Row1ListArray.toString();
		String expRowList = "[Grand Total, , , 1.00, 1.00, 21.00, , 1.00, 1.00, 1.00, , , , , , 652, , ]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
*/

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow3List.equalsIgnoreCase(expRow3List) && 
				actRow4List.equalsIgnoreCase(expRow4List)  && actRow7List.equalsIgnoreCase(expRow7List) &&
				actRow8List.equalsIgnoreCase(expRow8List) /*&& actRow12List.equalsIgnoreCase(expRow12List)
				&& actRow18List.equalsIgnoreCase(expRow18List) && actAllDatapage1.equalsIgnoreCase(expAllDatapage1) 
				&& actRowList.equalsIgnoreCase(expRowList)*/)

		{
			return true;
		} 
		else 
		{
			return false;
		}

	
	}
	public static boolean checkCustomerAgeingDetailAnalysis() throws InterruptedException
	{
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		customerDetailMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerAgeingDetailsReport));
		customerDetailsCustomerAgeingDetailsReport.click();
		
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}


		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[H1 [H801], OpeBal:1, SalInv:1, SalInv:5, SalRet:1, Sub Total, H2 [H802], OpeBal:1, SalInv:6, Pmt:1, CreNts:1, Sub Total, CustomerACC [CAC001], OpeBal:1, Rct:1, SalInv:4, NJv:1, Sub Total, Grand Total]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow3ListCount = reportsCol3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow3ListArray.add(data);
			}

		}


		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[H1, H1, H1, H1, H2, H2, H2, H2, CustomerACC, CustomerACC, CustomerACC, CustomerACC]";

		System.out.println("Actaul Voucher  :"+actRow3List);
		System.out.println("Expected Voucher:"+expRow3List);

		Thread.sleep(2000);
		

		Thread.sleep(2000);
		int reportsRow4ListCount = reportsCol4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow4ListArray.add(data);
			}

		}


		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[1.00, 4.00, 1.00, 11.00, 5.00, 1.00, 1.00, 1.00, 1.00, 4.00, 1.00, 1.00, 1.00, 1.00, 2.00, 1.00]";

		System.out.println("Actaul Voucher  :"+actRow4List);
		System.out.println("Expected Voucher:"+expRow4List);


		Thread.sleep(2000);
		

		Thread.sleep(2000);
		int reportsRow5ListCount = reportsCol5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsCol5List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow5ListArray.add(data);
			}

		}


		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[1.00, 4.00, 1.00, 11.00, 5.00, 1.00, 1.00, 1.00, 1.00, 4.00, 1.00, 1.00, 1.00, 1.00, 2.00, 1.00]";

		System.out.println("Actaul Voucher  :"+actRow5List);
		System.out.println("Expected Voucher:"+expRow5List);
		


		Thread.sleep(2000);
		int reportsRow6ListCount = reportsCol6List.size();
		ArrayList<String> reportsRow6ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow6ListCount;i++)
		{
			String data = reportsCol6List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow6ListArray.add(data);
			}

		}


		String actRow6List = reportsRow6ListArray.toString();
		String expRow6List = "[1.00, 5.00, 6.00, 5.00, 7.00, 1.00, 2.00, 3.00, 4.00, 10.00, 1.00, 1.00, 2.00, 4.00, 21.00]";

		System.out.println("Actaul Voucher  :"+actRow6List);
		System.out.println("Expected Voucher:"+expRow6List);
		
		
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
		String expAllDatapage1 = "[H1 [H801], H2 [H802], CustomerACC [CAC001]]";

		System.out.println("actAllDatapage1"+actAllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);

/*
		int reportsRow6ListCount = reportsRow6List.size();
		ArrayList<String> reportsRow6ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow6ListCount-1;i++)
		{
			String data = reportsRow6List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow6ListArray.add(data);
			}

		}
		String actRow6List = reportsRow6ListArray.toString();
		String expRow6List = "[Sub Total, 5.00, 5.00, 5.00, 5.00, 5.00, 5.00, 219]";


		System.out.println(actRow6List);
		System.out.println(expRow6List);


		int reportsRow12ListCount = reportsRow12List.size();
		ArrayList<String> reportsRow12ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow12ListCount-1;i++)
		{
			String data = reportsRow12List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow12ListArray.add(data);
			}

		}
		String actRow12List = reportsRow12ListArray.toString();
		String expRow12List = "[Sub Total, 4.00, 4.00, 4.00, 2.00, 4.00, 4.00, 215]";


		System.out.println(actRow12List);
		System.out.println(expRow12List);

		int reportsRow18ListCount = reportsRow18List.size();
		ArrayList<String> reportsRow18ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow18ListCount-1;i++)
		{
			String data = reportsRow18List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow18ListArray.add(data);
			}

		}
		String actRow18List = reportsRow18ListArray.toString();
		String expRow18List = "[Sub Total, 2.00, 2.00, 2.00, 2.00, 2.00, 2.00, 218]";


		System.out.println(actRow18List);
		System.out.println(expRow18List);


*/
/*
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

		int Row1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> Row1ListArray = new ArrayList<String>();
		for(int i=1;i<Row1ListCount-3;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			Row1ListArray.add(data);
		}
		String actRowList =Row1ListArray.toString();
		String expRowList = "[Grand Total, , , 1.00, 1.00, 21.00, , 1.00, 1.00, 1.00, , , , , , 652, , ]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
*/

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow3List.equalsIgnoreCase(expRow3List) && 
				actRow4List.equalsIgnoreCase(expRow4List)  && actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) /*&& actRow12List.equalsIgnoreCase(expRow12List)
				&& actRow18List.equalsIgnoreCase(expRow18List) && actAllDatapage1.equalsIgnoreCase(expAllDatapage1) 
				&& actRowList.equalsIgnoreCase(expRowList)*/)

		{
			return true;
		} 
		else 
		{
			return false;
		}

	
	}
	
	public static boolean checkCustomerAgeingDetailByDueDate() throws InterruptedException
	{


		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		customerDetailMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerDetailAgeingByDueDateReport));
		customerDetailsCustomerDetailAgeingByDueDateReport.click();
		
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}


		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[H1 [H801], OpeBal:1, SalInv:1, SalInv:5, SalRet:1, Sub Total, H2 [H802], OpeBal:1, SalInv:6, Pmt:1, CreNts:1, Sub Total, CustomerACC [CAC001], OpeBal:1, Rct:1, SalInv:4, NJv:1, Sub Total, Grand Total]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow3ListCount = reportsCol3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow3ListArray.add(data);
			}

		}


		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[H1, H1, H1, H1, H2, H2, H2, H2, CustomerACC, CustomerACC, CustomerACC, CustomerACC]";

		System.out.println("Actaul Voucher  :"+actRow3List);
		System.out.println("Expected Voucher:"+expRow3List);

		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow4ListCount = reportsCol4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow4ListArray.add(data);
			}

		}


		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[1.00, 4.00, 1.00, 11.00, 5.00, 1.00, 1.00, 1.00, 1.00, 4.00, 1.00, 1.00, 1.00, 1.00, 2.00, 1.00]";

		System.out.println("Actaul Voucher  :"+actRow4List);
		System.out.println("Expected Voucher:"+expRow4List);

		Thread.sleep(2000);

		

		Thread.sleep(2000);
		int reportsRow5ListCount = reportsCol5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsCol5List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow5ListArray.add(data);
			}

		}


		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[1.00, 4.00, 1.00, 11.00, 5.00, 1.00, 1.00, 1.00, 1.00, 4.00, 1.00, 1.00, 1.00, 1.00, 2.00, 1.00]";

		System.out.println("Actaul Voucher  :"+actRow5List);
		System.out.println("Expected Voucher:"+expRow5List);

		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow6ListCount = reportsCol6List.size();
		ArrayList<String> reportsRow6ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow6ListCount;i++)
		{
			String data = reportsCol6List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow6ListArray.add(data);
			}

		}


		String actRow6List = reportsRow6ListArray.toString();
		String expRow6List = "[1.00, 5.00, 6.00, 5.00, 7.00, 1.00, 2.00, 3.00, 4.00, 10.00, 1.00, 1.00, 2.00, 4.00, 21.00]";

		System.out.println("Actaul Voucher  :"+actRow6List);
		System.out.println("Expected Voucher:"+expRow6List);

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
		String expAllDatapage1 = "[H1 [H801], H2 [H802], CustomerACC [CAC001]]";

		System.out.println("actAllDatapage1"+actAllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);

/*
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
		String expRow6List = "[Sub Total, 5.00, 5.00, 7.00, 219, 5.00, 5.00, 6.00, 1.00, 5.00, 6.00, 1.00, 5.00]";


		System.out.println(actRow6List);
		System.out.println(expRow6List);


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
		String expRow12List = "[Sub Total, 2.00, 2.00, 4.00, 218, 2.00, 2.00, 1.00, 1.00, 2.00, 1.00, 1.00, 2.00]";


		System.out.println(actRow12List);
		System.out.println(expRow12List);

		int reportsRow18ListCount = reportsRow18List.size();
		ArrayList<String> reportsRow18ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow18ListCount;i++)
		{
			String data = reportsRow18List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow18ListArray.add(data);
			}

		}
		String actRow18List = reportsRow18ListArray.toString();
		String expRow18List = "[Sub Total, 2.00, 2.00, 4.00, 218, 2.00, 2.00, 1.00, 1.00, 2.00, 1.00, 1.00, 2.00]";


		System.out.println(actRow18List);
		System.out.println(expRow18List);


*/

		/*String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
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

		int Row1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> Row1ListArray = new ArrayList<String>();
		for(int i=1;i<Row1ListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			Row1ListArray.add(data);
		}
		String actRowList =Row1ListArray.toString();
		String expRowList = "[Grand Total, , , 1.00, 1.00, 21.00, 652, 1.00, 1.00, 2.00, , , , 3.00, , , , 1.00, 2.00, , , , 3.00, , , , 1.00, , , , , , , , , , , ]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);

*/
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List)
				 && actRow6List.equalsIgnoreCase(expRow6List)
				/*actRow6List.equalsIgnoreCase(expRow6List) && actRow12List.equalsIgnoreCase(expRow12List)
				&& actRow18List.equalsIgnoreCase(expRow18List)*/ && actAllDatapage1.equalsIgnoreCase(expAllDatapage1) 
				/*&& actRowList.equalsIgnoreCase(expRowList)*/)

		{
			return true;
		} 
		else 
		{
			return false;
		}

	}
	
	public static boolean checkCustomerOverDueAnalysis() throws InterruptedException
	{
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		customerDetailMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerOverdueAnalysisReport));
		customerDetailsCustomerOverdueAnalysisReport.click();
		
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}


		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[H1 [H801], OpeBal:1, SalInv:1, SalInv:5, SalRet:1, Sub Total, H2 [H802], OpeBal:1, SalInv:6, Pmt:1, CreNts:1, Sub Total, CustomerACC [CAC001], OpeBal:1, Rct:1, SalInv:4, NJv:1, Sub Total, Grand Total]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow3ListCount = reportsCol3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow3ListArray.add(data);
			}

		}


		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[H1, H1, H1, H1, H2, H2, H2, H2, CustomerACC, CustomerACC, CustomerACC, CustomerACC]";

		System.out.println("Actaul Voucher  :"+actRow3List);
		System.out.println("Expected Voucher:"+expRow3List);
		

		Thread.sleep(2000);
		int reportsRow4ListCount = reportsCol4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow4ListArray.add(data);
			}

		}


		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[1.00, 4.00, 1.00, 11.00, 5.00, 1.00, 1.00, 1.00, 1.00, 4.00, 1.00, 1.00, 1.00, 1.00, 2.00, 1.00]";

		System.out.println("Actaul Voucher  :"+actRow4List);
		System.out.println("Expected Voucher:"+expRow4List);

		Thread.sleep(2000);
		

		Thread.sleep(2000);
		int reportsRow5ListCount = reportsCol5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsCol5List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow5ListArray.add(data);
			}

		}


		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[1.00, 4.00, 1.00, 11.00, 5.00, 1.00, 1.00, 1.00, 1.00, 4.00, 1.00, 1.00, 1.00, 1.00, 2.00, 1.00]";

		System.out.println("Actaul Voucher  :"+actRow5List);
		System.out.println("Expected Voucher:"+expRow5List);
		

		

		Thread.sleep(2000);
		int reportsRow7ListCount = reportsCol7List.size();
		ArrayList<String> reportsRow7ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow7ListCount;i++)
		{
			String data = reportsCol7List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow7ListArray.add(data);
			}

		}


		String actRow7List = reportsRow7ListArray.toString();
		String expRow7List = "[1.00, 5.00, 6.00, 5.00, 7.00, 1.00, 2.00, 3.00, 4.00, 10.00, 1.00, 1.00, 2.00, 4.00, 21.00]";

		System.out.println("Actaul Voucher  :"+actRow7List);
		System.out.println("Expected Voucher:"+expRow7List);
		
		


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
		String expAllDatapage1 = "[H1 [H801], H2 [H802], CustomerACC [CAC001]]";

		System.out.println("actAllDatapage1"+actAllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);

/*
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
		String expRow6List = "[Sub Total, 5.00, 5.00, 207, 7.00, 6.00, 1.00, 5.00]";


		System.out.println(actRow6List);
		System.out.println(expRow6List);


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
		String expRow12List = "[Sub Total, 4.00, 4.00, 203, 10.00, 3.00, 1.00, 4.00]";


		System.out.println(actRow12List);
		System.out.println(expRow12List);

		int reportsRow18ListCount = reportsRow18List.size();
		ArrayList<String> reportsRow18ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow18ListCount;i++)
		{
			String data = reportsRow18List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow18ListArray.add(data);
			}

		}
		String actRow18List = reportsRow18ListArray.toString();
		String expRow18List = "[Sub Total, 2.00, 2.00, 206, 4.00, 1.00, 1.00, 2.00]";


		System.out.println(actRow18List);
		System.out.println(expRow18List);

*/
/*

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

		int Row1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> Row1ListArray = new ArrayList<String>();
		for(int i=1;i<Row1ListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			Row1ListArray.add(data);
		}
		String actRowList =Row1ListArray.toString();
		String expRowList = "[Grand Total, , , 1.00, 1.00, 616, 21.00, , 2.00, , , , 3.00, , , , 1.00, ]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);

*/
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow3List.equalsIgnoreCase(expRow3List) && 
				actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List)
				&& actRow7List.equalsIgnoreCase(expRow7List)
				/*actRow6List.equalsIgnoreCase(expRow6List) && actRow12List.equalsIgnoreCase(expRow12List)
				&& actRow18List.equalsIgnoreCase(expRow18List) */&& actAllDatapage1.equalsIgnoreCase(expAllDatapage1) 
				/*&& actRowList.equalsIgnoreCase(expRowList)*/)

		{
			return true;
		} 
		else 
		{
			return false;
		}

	}
	
	
	//Customer summary
	
	
	public static boolean checkCustomerAgeingSummaryReport()
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerSummaryMenu));
		customerSummaryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerSummaryCustomerAgeingSummaryReport));
		customerSummaryCustomerAgeingSummaryReport.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();



		int reportscol1ListCount = reportsCol1List.size();
		ArrayList<String> reportscol1ListArray = new ArrayList<String>();
		for(int i=0;i<reportscol1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportscol1ListArray.add(data);
			}

		}
		String actcol1List = reportscol1ListArray.toString();
		String expcol1List = "[H1, H2, CustomerACC, Grand Total]";



		int reportscol2ListCount = reportsCol2List.size();
		ArrayList<String> reportscol2ListArray = new ArrayList<String>();
		for(int i=0;i<reportscol2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportscol2ListArray.add(data);
			}


		}
		String actcol2List = reportscol2ListArray.toString();
		String expcol2List = "[5.00, 4.00, 2.00, 1.00]";



		int reportscol3ListCount = reportsCol3List.size();
		ArrayList<String> reportscol3ListArray = new ArrayList<String>();
		for(int i=0;i<reportscol3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportscol3ListArray.add(data);
			}

		}
		String actcol3List = reportscol3ListArray.toString();
		String expcol3List = "[5.00, 4.00, 2.00, 1.00]";



		int reportscol6ListCount = reportsCol6List.size();
		ArrayList<String> reportscol6ListArray = new ArrayList<String>();
		for(int i=0;i<reportscol6ListCount;i++)
		{
			String data = reportsCol6List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportscol6ListArray.add(data);
			}

		}
		String actcol6List = reportscol6ListArray.toString();
		String expcol6List = "[5.00, 4.00, 2.00, 1.00]";


		System.out.println(actcol1List);
		System.out.println(expcol1List);

		System.out.println(actcol2List);
		System.out.println(expcol2List);

		System.out.println(actcol3List);
		System.out.println(expcol3List);

		System.out.println(actcol6List);
		System.out.println(expcol6List);



		if (actcol1List.equalsIgnoreCase(expcol1List) && actcol2List.equalsIgnoreCase(expcol2List) && actcol3List.equalsIgnoreCase(expcol3List) 
				&& actcol6List.equalsIgnoreCase(expcol6List))
		{
			return true;
		} 
		else 
		{
			return false;
		}

	}
	
	public static boolean checkCustomerSummaryAgeingByDueDateReport() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerSummaryMenu));
		customerSummaryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerSummaryAgeingByDueDateReport));
		customerSummaryAgeingByDueDateReport.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		


		int reportscol1ListCount = reportsCol1List.size();
		ArrayList<String> reportscol1ListArray = new ArrayList<String>();
		for(int i=0;i<reportscol1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportscol1ListArray.add(data);
			}

		}
		String actcol1List = reportscol1ListArray.toString();
		String expcol1List = "[H1, H2, CustomerACC, Grand Total]";



		int reportscol2ListCount = reportsCol2List.size();
		ArrayList<String> reportscol2ListArray = new ArrayList<String>();
		for(int i=0;i<reportscol2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportscol2ListArray.add(data);
			}


		}
		String actcol2List = reportscol2ListArray.toString();
		String expcol2List = "[5.00, 4.00, 2.00, 1.00]";



		int reportscol3ListCount = reportsCol3List.size();
		ArrayList<String> reportscol3ListArray = new ArrayList<String>();
		for(int i=0;i<reportscol3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportscol3ListArray.add(data);
			}

		}
		String actcol3List = reportscol3ListArray.toString();
		String expcol3List = "[5.00, 4.00, 2.00, 1.00]";



		int reportscol6ListCount = reportsCol6List.size();
		ArrayList<String> reportscol6ListArray = new ArrayList<String>();
		for(int i=0;i<reportscol6ListCount;i++)
		{
			String data = reportsCol6List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportscol6ListArray.add(data);
			}

		}
		String actcol6List = reportscol6ListArray.toString();
		String expcol6List = "[5.00, 4.00, 2.00, 1.00]";


		System.out.println(actcol1List);
		System.out.println(expcol1List);

		System.out.println(actcol2List);
		System.out.println(expcol2List);

		System.out.println(actcol3List);
		System.out.println(expcol3List);

		System.out.println(actcol6List);
		System.out.println(expcol6List);



		if (actcol1List.equalsIgnoreCase(expcol1List) && actcol2List.equalsIgnoreCase(expcol2List) && actcol3List.equalsIgnoreCase(expcol3List) 
				&& actcol6List.equalsIgnoreCase(expcol6List))
		{
			return true;
		} 
		else 
		{
			return false;
		}

	}
	
	public static boolean checkCustomerOverDueSummaryReport() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerSummaryMenu));
		customerSummaryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerSummaryCustomerOverDueSummeryReport));
		customerSummaryCustomerOverDueSummeryReport.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();


		int reportscol1ListCount = reportsCol1List.size();
		ArrayList<String> reportscol1ListArray = new ArrayList<String>();
		for(int i=0;i<reportscol1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportscol1ListArray.add(data);
			}

		}
		String actcol1List = reportscol1ListArray.toString();
		String expcol1List = "[H1, H2, CustomerACC, Grand Total]";



		int reportscol2ListCount = reportsCol2List.size();
		ArrayList<String> reportscol2ListArray = new ArrayList<String>();
		for(int i=0;i<reportscol2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportscol2ListArray.add(data);
			}


		}
		String actcol2List = reportscol2ListArray.toString();
		String expcol2List = "[5.00, 4.00, 2.00, 1.00]";



		int reportscol3ListCount = reportsCol3List.size();
		ArrayList<String> reportscol3ListArray = new ArrayList<String>();
		for(int i=0;i<reportscol3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportscol3ListArray.add(data);
			}

		}
		String actcol3List = reportscol3ListArray.toString();
		String expcol3List = "[5.00, 4.00, 2.00, 1.00]";



		int reportscol6ListCount = reportsCol6List.size();
		ArrayList<String> reportscol6ListArray = new ArrayList<String>();
		for(int i=0;i<reportscol6ListCount;i++)
		{
			String data = reportsCol6List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportscol6ListArray.add(data);
			}

		}
		String actcol6List = reportscol6ListArray.toString();
		String expcol6List = "[4.00, 1.00, 3.00]";


		System.out.println(actcol1List);
		System.out.println(expcol1List);

		System.out.println(actcol2List);
		System.out.println(expcol2List);

		System.out.println(actcol3List);
		System.out.println(expcol3List);

		System.out.println(actcol6List);
		System.out.println(expcol6List);



		if (actcol1List.equalsIgnoreCase(expcol1List) && actcol2List.equalsIgnoreCase(expcol2List) && actcol3List.equalsIgnoreCase(expcol3List) 
				&& actcol6List.equalsIgnoreCase(expcol6List))
		{
			return true;
		} 
		else 
		{
			return false;
		}

	}
	
	public static boolean checkCustomerBillWiseSummaryReport() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerSummaryMenu));
		customerSummaryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerSummaryCustomerBillWiseSummeryReport));
		customerSummaryCustomerBillWiseSummeryReport.click();
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		


		int reportscol1ListCount = reportsCol1List.size();
		ArrayList<String> reportscol1ListArray = new ArrayList<String>();
		for(int i=0;i<reportscol1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportscol1ListArray.add(data);
			}

		}
		String actcol1List = reportscol1ListArray.toString();
		String expcol1List = "[H1, H2, CustomerACC, Grand Total]";



		int reportscol2ListCount = reportsCol2List.size();
		ArrayList<String> reportscol2ListArray = new ArrayList<String>();
		for(int i=0;i<reportscol2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportscol2ListArray.add(data);
			}


		}
		String actcol2List = reportscol2ListArray.toString();
		String expcol2List = "[6.00, 4.00, 3.00, 13.00]";



		int reportscol3ListCount = reportsCol3List.size();
		ArrayList<String> reportscol3ListArray = new ArrayList<String>();
		for(int i=0;i<reportscol3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportscol3ListArray.add(data);
			}

		}
		String actcol3List = reportscol3ListArray.toString();
		String expcol3List = "[11.00, 1.00, 12.00]";




		System.out.println(actcol1List);
		System.out.println(expcol1List);

		System.out.println(actcol2List);
		System.out.println(expcol2List);

		System.out.println(actcol3List);
		System.out.println(expcol3List);

		
		if (actcol1List.equalsIgnoreCase(expcol1List) && actcol2List.equalsIgnoreCase(expcol2List) && actcol3List.equalsIgnoreCase(expcol3List) 
				)
		{
			return true;
		} 
		else 
		{
			return false;
		}

		
	}
	
	public static boolean checkVendorListingOfOutStandingBills() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailMenu));
		vendorDetailMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailsVendorListingOfOutstandingBillsReport));
		vendorDetailsVendorListingOfOutstandingBillsReport.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}


		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[D1 [D401], OpeBal:1, PurVou:1, PurVou:6, Sub Total, D2 [D402], OpeBal:1, PurVou:10, PurRet:1, DebNts:1, Sub Total, VendorACC [VAC001], OpeBal:1, PurVou:2, NJv:1, Sub Total, Grand Total]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow3ListCount = reportsCol3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow3ListArray.add(data);
			}

		}


		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[D1, D1, D1, D2, D2, D2, D2, VendorACC, VendorACC, VendorACC]";

		System.out.println("Actaul Voucher  :"+actRow3List);
		System.out.println("Expected Voucher:"+expRow3List);

		Thread.sleep(2000);

		


		Thread.sleep(2000);
		int reportsRow4ListCount = reportsCol4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow4ListArray.add(data);
			}

		}


		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[1.00, 29.00, 1.00, 29.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 28.00]";

		System.out.println("Actaul Voucher  :"+actRow4List);
		System.out.println("Expected Voucher:"+expRow4List);

		Thread.sleep(2000);
		
		


		Thread.sleep(2000);
		int reportsRow5ListCount = reportsCol5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsCol5List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow5ListArray.add(data);
			}

		}


		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[1.00, 29.00, 1.00, 29.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 28.00]";

		System.out.println("Actaul Voucher  :"+actRow5List);
		System.out.println("Expected Voucher:"+expRow5List);

		Thread.sleep(2000);
		


		Thread.sleep(2000);
		int reportsRow6ListCount = reportsCol6List.size();
		ArrayList<String> reportsRow6ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow6ListCount;i++)
		{
			String data = reportsCol6List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow6ListArray.add(data);
			}

		}


		String actRow6List = reportsRow6ListArray.toString();
		String expRow6List = "[1.00, 28.00, 29.00, 29.00, 1.00, 1.00, 1.00, 1.00, 1.00, 52.00]";

		System.out.println("Actaul Voucher  :"+actRow6List);
		System.out.println("Expected Voucher:"+expRow6List);

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
		String expAllDatapage1 = "[D1 [D401], D2 [D402], VendorACC [VAC001]]";

		System.out.println("actAllDatapage1"+actAllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);

/*
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
		String expRow5List = "[Sub Total, 29.00, 29.00, 29.00, 29.00, 29.00, 29.00, 190]";


		System.out.println(actRow5List);
		System.out.println(expRow5List);


		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow11ListArray.add(data);
			}

		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[Sub Total, 2.00, 202]";


		System.out.println(actRow11List);
		System.out.println(expRow11List);

		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow16ListArray.add(data);
			}

		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[Sub Total, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 185]";


		System.out.println(actRow16List);
		System.out.println(expRow16List);




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

		int Row1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> Row1ListArray = new ArrayList<String>();
		for(int i=1;i<Row1ListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			Row1ListArray.add(data);
		}
		String actRowList =Row1ListArray.toString();
		String expRowList = "[Grand Total, , , 28.00, 28.00, 52.00, , 26.00, 28.00, 28.00, , , , , , 577, , ]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
*/

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)/*&& actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow16List.equalsIgnoreCase(expRow16List) */&& actAllDatapage1.equalsIgnoreCase(expAllDatapage1) 
				/*&& actRowList.equalsIgnoreCase(expRowList)*/)

		{
			return true;
		} 
		else 
		{
			return false;
		}

	
	}
	
	public static boolean checkVendorStatementsReport() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailMenu));
		vendorDetailMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailsVendorStatementsReport));
		vendorDetailsVendorStatementsReport.click();
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}


		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[D1 [D401], OpeBal:1, PurVou:1, PurVou:6, Sub Total, D2 [D402], OpeBal:1, PurVou:10, PurRet:1, DebNts:1, Sub Total, VendorACC [VAC001], OpeBal:1, PurVou:2, NJv:1, Sub Total, Grand Total]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow3ListCount = reportsCol3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow3ListArray.add(data);
			}

		}


		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[D1, D1, D1, D2, D2, D2, D2, VendorACC, VendorACC, VendorACC]";

		System.out.println("Actaul Voucher  :"+actRow3List);
		System.out.println("Expected Voucher:"+expRow3List);

		Thread.sleep(2000);

		


		Thread.sleep(2000);
		int reportsRow4ListCount = reportsCol4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow4ListArray.add(data);
			}

		}


		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[1.00, 29.00, 1.00, 29.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 28.00]";

		System.out.println("Actaul Voucher  :"+actRow4List);
		System.out.println("Expected Voucher:"+expRow4List);

		Thread.sleep(2000);
		
		


		Thread.sleep(2000);
		int reportsRow7ListCount = reportsCol7List.size();
		ArrayList<String> reportsRow7ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow7ListCount;i++)
		{
			String data = reportsCol7List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow7ListArray.add(data);
			}

		}


		String actRow7List = reportsRow7ListArray.toString();
		String expRow7List = "[1.00, 29.00, 1.00, 29.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 28.00]";

		System.out.println("Actaul Voucher  :"+actRow7List);
		System.out.println("Expected Voucher:"+expRow7List);

		Thread.sleep(2000);
		


		Thread.sleep(2000);
		int reportsRow8ListCount = reportsCol8List.size();
		ArrayList<String> reportsRow8ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow8ListCount;i++)
		{
			String data = reportsCol8List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow8ListArray.add(data);
			}

		}


		String actRow8List = reportsRow8ListArray.toString();
		String expRow8List = "[1.00, 28.00, 29.00, 56.00, 1.00, 1.00, 2.00, 1.00, 1.00, 2.00, 52.00]";

		System.out.println("Actaul Voucher  :"+actRow8List);
		System.out.println("Expected Voucher:"+expRow8List);

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
		String expAllDatapage1 = "[D1 [D401], D2 [D402], VendorACC [VAC001]]";

		System.out.println("actAllDatapage1"+actAllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);

/*
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
		String expRow5List = "[Sub Total, 29.00, 29.00, 29.00, 29.00, 29.00, 29.00, 190]";


		System.out.println(actRow5List);
		System.out.println(expRow5List);


		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow11ListArray.add(data);
			}

		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[Sub Total, 2.00, 202]";


		System.out.println(actRow11List);
		System.out.println(expRow11List);

		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow16ListArray.add(data);
			}

		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[Sub Total, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 185]";


		System.out.println(actRow16List);
		System.out.println(expRow16List);




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

		int Row1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> Row1ListArray = new ArrayList<String>();
		for(int i=1;i<Row1ListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			Row1ListArray.add(data);
		}
		String actRowList =Row1ListArray.toString();
		String expRowList = "[Grand Total, , , 28.00, 28.00, 52.00, , 26.00, 28.00, 28.00, , , , , , 577, , ]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
*/

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List)/*&& actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow16List.equalsIgnoreCase(expRow16List) */&& actAllDatapage1.equalsIgnoreCase(expAllDatapage1) 
				/*&& actRowList.equalsIgnoreCase(expRowList)*/)

		{
			return true;
		} 
		else 
		{
			return false;
		}

	
	}
	
	public static boolean checkVendorDueDateAnalysisReport() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailMenu));
		vendorDetailMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailsVendorDueDateAnalysisReport));
		vendorDetailsVendorDueDateAnalysisReport.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}


		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[D1 [D401], OpeBal:1, PurVou:1, PurVou:6, Sub Total, D2 [D402], OpeBal:1, PurVou:10, PurRet:1, DebNts:1, Sub Total, VendorACC [VAC001], OpeBal:1, PurVou:2, NJv:1, Sub Total, Grand Total]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow3ListCount = reportsCol3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow3ListArray.add(data);
			}

		}


		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[D1, D1, D1, D2, D2, D2, D2, VendorACC, VendorACC, VendorACC]";

		System.out.println("Actaul Voucher  :"+actRow3List);
		System.out.println("Expected Voucher:"+expRow3List);

		Thread.sleep(2000);

		


		Thread.sleep(2000);
		int reportsRow4ListCount = reportsCol4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow4ListArray.add(data);
			}

		}


		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[1.00, 29.00, 1.00, 29.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 28.00]";

		System.out.println("Actaul Voucher  :"+actRow4List);
		System.out.println("Expected Voucher:"+expRow4List);

		Thread.sleep(2000);
		
		


		Thread.sleep(2000);
		int reportsRow7ListCount = reportsCol7List.size();
		ArrayList<String> reportsRow7ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow7ListCount;i++)
		{
			String data = reportsCol7List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow7ListArray.add(data);
			}

		}


		String actRow7List = reportsRow7ListArray.toString();
		String expRow7List = "[1.00, 29.00, 1.00, 29.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 28.00]";

		System.out.println("Actaul Voucher  :"+actRow7List);
		System.out.println("Expected Voucher:"+expRow7List);

		Thread.sleep(2000);
		


		Thread.sleep(2000);
		int reportsRow8ListCount = reportsCol8List.size();
		ArrayList<String> reportsRow8ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow8ListCount;i++)
		{
			String data = reportsCol8List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow8ListArray.add(data);
			}

		}


		String actRow8List = reportsRow8ListArray.toString();
		String expRow8List = "[1.00, 28.00, 29.00, 56.00, 1.00, 1.00, 2.00, 1.00, 1.00, 2.00, 52.00]";

		System.out.println("Actaul Voucher  :"+actRow8List);
		System.out.println("Expected Voucher:"+expRow8List);

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
		String expAllDatapage1 = "[D1 [D401], D2 [D402], VendorACC [VAC001]]";

		System.out.println("actAllDatapage1"+actAllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);

/*
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
		String expRow5List = "[Sub Total, 29.00, 29.00, 29.00, 29.00, 29.00, 29.00, 190]";


		System.out.println(actRow5List);
		System.out.println(expRow5List);


		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow11ListArray.add(data);
			}

		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[Sub Total, 2.00, 202]";


		System.out.println(actRow11List);
		System.out.println(expRow11List);

		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow16ListArray.add(data);
			}

		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[Sub Total, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 185]";


		System.out.println(actRow16List);
		System.out.println(expRow16List);




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

		int Row1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> Row1ListArray = new ArrayList<String>();
		for(int i=1;i<Row1ListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			Row1ListArray.add(data);
		}
		String actRowList =Row1ListArray.toString();
		String expRowList = "[Grand Total, , , 28.00, 28.00, 52.00, , 26.00, 28.00, 28.00, , , , , , 577, , ]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
*/

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List)/*&& actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow16List.equalsIgnoreCase(expRow16List) */&& actAllDatapage1.equalsIgnoreCase(expAllDatapage1) 
				/*&& actRowList.equalsIgnoreCase(expRowList)*/)

		{
			return true;
		} 
		else 
		{
			return false;
		}

	
	}
	
	public static boolean checkVendorAgeingDetailsAnalysis() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailMenu));
		vendorDetailMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailsVendorAgeingDetailsReport));
		vendorDetailsVendorAgeingDetailsReport.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(2000);



		Thread.sleep(2000);
		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}


		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[D1 [D401], OpeBal:1, PurVou:1, PurVou:6, Sub Total, D2 [D402], OpeBal:1, PurVou:10, PurRet:1, DebNts:1, Sub Total, VendorACC [VAC001], OpeBal:1, PurVou:2, NJv:1, Sub Total, Grand Total]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow3ListCount = reportsCol3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow3ListArray.add(data);
			}

		}


		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[D1, D1, D1, D2, D2, D2, D2, VendorACC, VendorACC, VendorACC]";

		System.out.println("Actaul Voucher  :"+actRow3List);
		System.out.println("Expected Voucher:"+expRow3List);

		Thread.sleep(2000);

		


		Thread.sleep(2000);
		int reportsRow4ListCount = reportsCol4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow4ListArray.add(data);
			}

		}


		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[1.00, 29.00, 1.00, 29.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 28.00]";

		System.out.println("Actaul Voucher  :"+actRow4List);
		System.out.println("Expected Voucher:"+expRow4List);

		Thread.sleep(2000);
		
		


		Thread.sleep(2000);
		int reportsRow5ListCount = reportsCol5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsCol5List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow5ListArray.add(data);
			}

		}


		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[1.00, 29.00, 1.00, 29.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 28.00]";

		System.out.println("Actaul Voucher  :"+actRow5List);
		System.out.println("Expected Voucher:"+expRow5List);

		Thread.sleep(2000);
		


		Thread.sleep(2000);
		int reportsRow6ListCount = reportsCol6List.size();
		ArrayList<String> reportsRow6ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow6ListCount;i++)
		{
			String data = reportsCol6List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow6ListArray.add(data);
			}

		}


		String actRow6List = reportsRow6ListArray.toString();
		String expRow6List = "[1.00, 28.00, 29.00, 56.00, 1.00, 1.00, 2.00, 1.00, 1.00, 2.00, 52.00]";

		System.out.println("Actaul Voucher  :"+actRow6List);
		System.out.println("Expected Voucher:"+expRow6List);

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
		String expAllDatapage1 = "[D1 [D401], D2 [D402], VendorACC [VAC001]]";

		System.out.println("actAllDatapage1"+actAllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);

/*
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
		String expRow5List = "[Sub Total, 29.00, 29.00, 29.00, 29.00, 29.00, 29.00, 190]";


		System.out.println(actRow5List);
		System.out.println(expRow5List);


		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow11ListArray.add(data);
			}

		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[Sub Total, 2.00, 202]";


		System.out.println(actRow11List);
		System.out.println(expRow11List);

		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow16ListArray.add(data);
			}

		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[Sub Total, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 185]";


		System.out.println(actRow16List);
		System.out.println(expRow16List);




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

		int Row1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> Row1ListArray = new ArrayList<String>();
		for(int i=1;i<Row1ListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			Row1ListArray.add(data);
		}
		String actRowList =Row1ListArray.toString();
		String expRowList = "[Grand Total, , , 28.00, 28.00, 52.00, , 26.00, 28.00, 28.00, , , , , , 577, , ]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
*/

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)/*&& actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow16List.equalsIgnoreCase(expRow16List) */&& actAllDatapage1.equalsIgnoreCase(expAllDatapage1) 
				/*&& actRowList.equalsIgnoreCase(expRowList)*/)

		{
			return true;
		} 
		else 
		{
			return false;
		}

	
	}
	
	public static boolean checkVendorAgeingDetailByDueDateReport() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailMenu));
		vendorDetailMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailsVendorDetailsAgeingByDueDateReport));
		vendorDetailsVendorDetailsAgeingByDueDateReport.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(2000);



		Thread.sleep(2000);
		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}


		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[D1 [D401], OpeBal:1, PurVou:1, PurVou:6, Sub Total, D2 [D402], OpeBal:1, PurVou:10, PurRet:1, DebNts:1, Sub Total, VendorACC [VAC001], OpeBal:1, PurVou:2, NJv:1, Sub Total, Grand Total]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow3ListCount = reportsCol3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow3ListArray.add(data);
			}

		}


		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[D1, D1, D1, D2, D2, D2, D2, VendorACC, VendorACC, VendorACC]";

		System.out.println("Actaul Voucher  :"+actRow3List);
		System.out.println("Expected Voucher:"+expRow3List);

		Thread.sleep(2000);

		


		Thread.sleep(2000);
		int reportsRow4ListCount = reportsCol4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow4ListArray.add(data);
			}

		}


		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[1.00, 29.00, 1.00, 29.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 28.00]";

		System.out.println("Actaul Voucher  :"+actRow4List);
		System.out.println("Expected Voucher:"+expRow4List);

		Thread.sleep(2000);
		
		


		Thread.sleep(2000);
		int reportsRow5ListCount = reportsCol5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsCol5List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow5ListArray.add(data);
			}

		}


		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[1.00, 29.00, 1.00, 29.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 28.00]";

		System.out.println("Actaul Voucher  :"+actRow5List);
		System.out.println("Expected Voucher:"+expRow5List);

		Thread.sleep(2000);
		


		Thread.sleep(2000);
		int reportsRow6ListCount = reportsCol6List.size();
		ArrayList<String> reportsRow6ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow6ListCount;i++)
		{
			String data = reportsCol6List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow6ListArray.add(data);
			}

		}


		String actRow6List = reportsRow6ListArray.toString();
		String expRow6List = "[1.00, 28.00, 29.00, 56.00, 1.00, 1.00, 2.00, 1.00, 1.00, 2.00, 52.00]";

		System.out.println("Actaul Voucher  :"+actRow6List);
		System.out.println("Expected Voucher:"+expRow6List);

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
		String expAllDatapage1 = "[D1 [D401], D2 [D402], VendorACC [VAC001]]";

		System.out.println("actAllDatapage1"+actAllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);

/*
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
		String expRow5List = "[Sub Total, 29.00, 29.00, 29.00, 29.00, 29.00, 29.00, 190]";


		System.out.println(actRow5List);
		System.out.println(expRow5List);


		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow11ListArray.add(data);
			}

		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[Sub Total, 2.00, 202]";


		System.out.println(actRow11List);
		System.out.println(expRow11List);

		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow16ListArray.add(data);
			}

		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[Sub Total, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 185]";


		System.out.println(actRow16List);
		System.out.println(expRow16List);




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

		int Row1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> Row1ListArray = new ArrayList<String>();
		for(int i=1;i<Row1ListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			Row1ListArray.add(data);
		}
		String actRowList =Row1ListArray.toString();
		String expRowList = "[Grand Total, , , 28.00, 28.00, 52.00, , 26.00, 28.00, 28.00, , , , , , 577, , ]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
*/

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)/*&& actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow16List.equalsIgnoreCase(expRow16List) */&& actAllDatapage1.equalsIgnoreCase(expAllDatapage1) 
				/*&& actRowList.equalsIgnoreCase(expRowList)*/)

		{
			return true;
		} 
		else 
		{
			return false;
		}

	
	}
	
	public static boolean checkVendorOverDueAnalysisReport() throws InterruptedException
	{


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailMenu));
		vendorDetailMenu.click();
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailsVendorOverdueAnalysisReport));
		vendorDetailsVendorOverdueAnalysisReport.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(2000);



		Thread.sleep(2000);
		int reportsRow1ListCount = reportsCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow1ListArray.add(data);
			}

		}


		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[D1 [D401], OpeBal:1, PurVou:1, PurVou:6, Sub Total, D2 [D402], OpeBal:1, PurVou:10, PurRet:1, DebNts:1, Sub Total, VendorACC [VAC001], OpeBal:1, PurVou:2, NJv:1, Sub Total, Grand Total]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(2000);


		Thread.sleep(2000);
		int reportsRow3ListCount = reportsCol3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow3ListArray.add(data);
			}

		}


		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[D1, D1, D1, D2, D2, D2, D2, VendorACC, VendorACC, VendorACC]";

		System.out.println("Actaul Voucher  :"+actRow3List);
		System.out.println("Expected Voucher:"+expRow3List);

		Thread.sleep(2000);

		


		Thread.sleep(2000);
		int reportsRow4ListCount = reportsCol4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsCol4List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow4ListArray.add(data);
			}

		}


		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[1.00, 1.00, 29.00, 29.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 28.00]";

		System.out.println("Actaul Voucher  :"+actRow4List);
		System.out.println("Expected Voucher:"+expRow4List);

		Thread.sleep(2000);
		
		


		Thread.sleep(2000);
		int reportsRow5ListCount = reportsCol5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsCol5List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow5ListArray.add(data);
			}

		}


		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[1.00, 1.00, 29.00, 29.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 28.00]";

		System.out.println("Actaul Voucher  :"+actRow5List);
		System.out.println("Expected Voucher:"+expRow5List);

		Thread.sleep(2000);
		


		Thread.sleep(2000);
		int reportsRow6ListCount = reportsCol7List.size();
		ArrayList<String> reportsRow6ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow6ListCount;i++)
		{
			String data = reportsCol7List.get(i).getText().trim();
			if(data.isEmpty() == false )
			{
				reportsRow6ListArray.add(data);
			}

		}


		String actRow6List = reportsRow6ListArray.toString();
		String expRow6List = "[1.00, 29.00, 28.00, 1.00, 1.00, 2.00, 1.00, 1.00, 2.00, 24.00]";

		System.out.println("Actaul Voucher  :"+actRow6List);
		System.out.println("Expected Voucher:"+expRow6List);

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
		String expAllDatapage1 = "[D1 [D401], D2 [D402], VendorACC [VAC001]]";

		System.out.println("actAllDatapage1"+actAllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);

/*
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
		String expRow5List = "[Sub Total, 29.00, 29.00, 29.00, 29.00, 29.00, 29.00, 190]";


		System.out.println(actRow5List);
		System.out.println(expRow5List);


		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow11ListArray.add(data);
			}

		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[Sub Total, 2.00, 202]";


		System.out.println(actRow11List);
		System.out.println(expRow11List);

		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow16ListArray.add(data);
			}

		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[Sub Total, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 185]";


		System.out.println(actRow16List);
		System.out.println(expRow16List);




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

		int Row1ListCount = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).size();
		ArrayList<String> Row1ListArray = new ArrayList<String>();
		for(int i=1;i<Row1ListCount;i++)
		{
			String data = (getDriver().findElements(By.xpath(beforePath + k +"]//td"))).get(i).getText();
			Row1ListArray.add(data);
		}
		String actRowList =Row1ListArray.toString();
		String expRowList = "[Grand Total, , , 28.00, 28.00, 52.00, , 26.00, 28.00, 28.00, , , , , , 577, , ]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
*/

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)/*&& actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow16List.equalsIgnoreCase(expRow16List) */&& actAllDatapage1.equalsIgnoreCase(expAllDatapage1) 
				/*&& actRowList.equalsIgnoreCase(expRowList)*/)

		{
			return true;
		} 
		else 
		{
			return false;
		}

	
	}
	
	
	public static boolean checkVendorAgeingSummaryAnalysisReport()
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummaryMenu));
		vendorSummaryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummeryVendorAgeingSummaryReport));
		vendorSummeryVendorAgeingSummaryReport.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		


		int reportsCol1ListCount = reportsCol1List.size();
		ArrayList<String> reportsCol1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsCol1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsCol1ListArray.add(data);
			}

		}
		String actCol1List = reportsCol1ListArray.toString();
		String expCol1List = "[D1, VendorACC, Grand Total]";



		int reportsCol2ListCount = reportsCol2List.size();
		ArrayList<String> reportsCol2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsCol2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsCol2ListArray.add(data);
			}


		}
		String actCol2List = reportsCol2ListArray.toString();
		String expCol2List = "[29.00, 1.00, 28.00]";



		int reportsCol3ListCount = reportsCol3List.size();
		ArrayList<String> reportsCol3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsCol3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsCol3ListArray.add(data);
			}

		}
		String actCol3List = reportsCol3ListArray.toString();
		String expCol3List = "[29.00, 1.00, 28.00]";

		

		int reportsCol6ListCount = reportsCol6List.size();
		ArrayList<String> reportsCol6ListArray = new ArrayList<String>();
		for(int i=0;i<reportsCol6ListCount;i++)
		{
			String data = reportsCol6List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsCol6ListArray.add(data);
			}

		}
		String actCol6List = reportsCol6ListArray.toString();
		String expCol6List = "[29.00, 1.00, 28.00]";


		
		System.out.println(actCol1List);
		System.out.println(expCol1List);

		System.out.println(actCol2List);
		System.out.println(expCol2List);

		System.out.println(actCol3List);
		System.out.println(expCol3List);

		System.out.println(actCol6List);
		System.out.println(expCol6List);
		
		
	
		if (actCol1List.equalsIgnoreCase(expCol1List) && actCol2List.equalsIgnoreCase(expCol2List) 
				&& actCol3List.equalsIgnoreCase(expCol3List) && actCol6List.equalsIgnoreCase(expCol6List)  )
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
	
	}
	
	public static boolean checkVendorSummaryAgeingByDueDateReport()
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummaryMenu));
		vendorSummaryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummeryVendorSummaryAgeingByDueDateReport));
		vendorSummeryVendorSummaryAgeingByDueDateReport.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		


		int reportsCol1ListCount = reportsCol1List.size();
		ArrayList<String> reportsCol1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsCol1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsCol1ListArray.add(data);
			}

		}
		String actCol1List = reportsCol1ListArray.toString();
		String expCol1List = "[D1, VendorACC, Grand Total]";



		int reportsCol2ListCount = reportsCol2List.size();
		ArrayList<String> reportsCol2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsCol2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsCol2ListArray.add(data);
			}


		}
		String actCol2List = reportsCol2ListArray.toString();
		String expCol2List = "[29.00, 1.00, 28.00]";



		int reportsCol3ListCount = reportsCol3List.size();
		ArrayList<String> reportsCol3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsCol3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsCol3ListArray.add(data);
			}

		}
		String actCol3List = reportsCol3ListArray.toString();
		String expCol3List = "[29.00, 1.00, 28.00]";

		

		int reportsCol6ListCount = reportsCol6List.size();
		ArrayList<String> reportsCol6ListArray = new ArrayList<String>();
		for(int i=0;i<reportsCol6ListCount;i++)
		{
			String data = reportsCol6List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsCol6ListArray.add(data);
			}

		}
		String actCol6List = reportsCol6ListArray.toString();
		String expCol6List = "[29.00, 1.00, 28.00]";


		
		System.out.println(actCol1List);
		System.out.println(expCol1List);

		System.out.println(actCol2List);
		System.out.println(expCol2List);

		System.out.println(actCol3List);
		System.out.println(expCol3List);

		System.out.println(actCol6List);
		System.out.println(expCol6List);
		
		
	
		if (actCol1List.equalsIgnoreCase(expCol1List) && actCol2List.equalsIgnoreCase(expCol2List) 
				&& actCol3List.equalsIgnoreCase(expCol3List) && actCol6List.equalsIgnoreCase(expCol6List)  )
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
	}
	
	public static boolean checkVendorOverDueSummaryReport()
	{


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummaryMenu));
		vendorSummaryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummeryVendorOverdueSummaryReport));
		vendorSummeryVendorOverdueSummaryReport.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();


		int reportsCol1ListCount = reportsCol1List.size();
		ArrayList<String> reportsCol1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsCol1ListCount;i++)
		{
			String data = reportsCol1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsCol1ListArray.add(data);
			}

		}
		String actCol1List = reportsCol1ListArray.toString();
		String expCol1List = "[D1, VendorACC, Grand Total]";



		int reportsCol2ListCount = reportsCol2List.size();
		ArrayList<String> reportsCol2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsCol2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsCol2ListArray.add(data);
			}


		}
		String actCol2List = reportsCol2ListArray.toString();
		String expCol2List = "[28.00, 1.00, 27.00]";



		int reportsCol3ListCount = reportsCol3List.size();
		ArrayList<String> reportsCol3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsCol3ListCount;i++)
		{
			String data = reportsCol3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsCol3ListArray.add(data);
			}

		}
		String actCol3List = reportsCol3ListArray.toString();
		String expCol3List = "[28.00, 1.00, 27.00]";

		System.out.println(actCol1List);
		System.out.println(expCol1List);

		System.out.println(actCol2List);
		System.out.println(expCol2List);

		System.out.println(actCol3List);
		System.out.println(expCol3List);

	
		if (actCol1List.equalsIgnoreCase(expCol1List) && actCol2List.equalsIgnoreCase(expCol2List) 
				&& actCol3List.equalsIgnoreCase(expCol3List))
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
	}
	
	public static boolean checkVendorBillWiseSummaryReport() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummaryMenu));
		vendorSummaryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummeryVendorBillWiseSummaryReport));
		vendorSummeryVendorBillWiseSummaryReport.click();
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
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
		String expRow1List = "[D1, 1.00, 29.00, D401]";



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
		String expRow2List = "[D2, 2.00, 2.00, D402]";



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
		String expRow3List = "[VendorACC, 2.00, 1.00, VAC001]";



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
		String expRow4List = "[Grand Total, 5.00, 32.00]";

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
	
	public static boolean checkTrailBalanceReport() throws InterruptedException
	{   
		Thread.sleep(2000);
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(trialBalanceReport));
		trialBalanceReport.click();
	
		Thread.sleep(1500);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

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
		String expRow1List = "[BankACC, BAC001, BankACC, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00, 2.00, 2.00]";



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
		String expRow2List = "[CashACC, CASH001, CashACC, 1.00, 1.00, 2.00, 1.00, 1.00, 1.00, 2.00, 1.00, 2.56, 2.56]";



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
		String expRow3List = "[CONTROL ACCOUNTS, CA, CONTROL ACCOUNTS, 18.00, 18.00, 18.00, 18.00]";



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
		String expRow4List = "[Opening Balances Control A/C, OBC, Opening Balances Control A/C, 18.00, 18.00, 18.00, 18.00]";



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
		String expRow5List = "[G, G700, G, 3.00, 2.00, 1.00, 8.00, 11.00, 3.00, 2.00, 1.00, 8.00, 11.00, 7.69, 7.69]";
		

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
		String expRow6List = "[H, H800, H, 3.00, 2.00, 1.00, 8.00, 11.00, 3.00, 2.00, 1.00, 8.00, 11.00, 7.69, 7.69]";
		
		
		//


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
		String expRow7List = "[H1, H801, H1, 6.00, 1.00, 5.00, 5.00, 11.00, 6.00, 1.00, 5.00, 5.00, 11.00, 15.38, 15.38]";



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
		String expRow8List = "[H2, H802, H2, 3.00, 1.00, 4.00, 3.00, 3.00, 1.00, 4.00, 3.00, 7.69, 7.69]";



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
		String expRow9List = "[CustomerACC, CAC001, CustomerACC, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00, 1.00, 2.00, 2.00, 1.00, 2.56, 2.56]";
		
		
		///

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
		String expRow10List = "[PurchaseACC, PAC001, PurchaseACC, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 2.56, 2.56]";



		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow11ListArray.add(data);
			}


		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[A, A100, A, 33.00, 4.00, 37.00, 35.00, 2.00, 33.00, 4.00, 37.00, 35.00, 2.00, 84.62, 84.62]";



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
		String expRow12List = "[A1, A101, A1, 33.00, 1.00, 34.00, 34.00, 1.00, 33.00, 1.00, 34.00, 34.00, 1.00, 84.62, 84.62]";



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
		String expRow13List = "[A2, A102, A2, 1.00, 1.00, 1.00, 1.00]";



		int reportsRow14ListCount = reportsRow14List.size();
		ArrayList<String> reportsRow14ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow14ListCount;i++)
		{
			String data = reportsRow14List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow14ListArray.add(data);
			}
		}
		String actRow14List = reportsRow14ListArray.toString();
		String expRow14List = "[B, B200, B, 2.00, 2.00, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00]";
		

		int reportsRow15ListCount = reportsRow15List.size();
		ArrayList<String> reportsRow15ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow15ListCount;i++)
		{
			String data = reportsRow15List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow15ListArray.add(data);
			}
		}
		String actRow15List = reportsRow15ListArray.toString();
		String expRow15List = "[B1, B201, B1, 1.00, 1.00, 1.00, 1.00]";
		
		

		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow16ListArray.add(data);
			}

		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[B2, B202, B2, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";



		int reportsRow17ListCount = reportsRow17List.size();
		ArrayList<String> reportsRow17ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow17ListCount;i++)
		{
			String data = reportsRow17List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow17ListArray.add(data);
			}

		}
		String actRow17List = reportsRow17ListArray.toString();
		String expRow17List = "[SalesACC, SAC001, SalesACC, 2.00, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00, 2.00, 5.13, 5.13]";



		int reportsRow18ListCount = reportsRow18List.size();
		ArrayList<String> reportsRow18ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow18ListCount;i++)
		{
			String data = reportsRow18List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow18ListArray.add(data);
			}
		}
		String actRow18List = reportsRow18ListArray.toString();
		String expRow18List = "[E, E500, E, 4.00, 4.00, 8.00, 12.00, 8.00, 4.00, 4.00, 8.00, 12.00, 8.00, 10.26, 10.26]";
		
		int reportsRow19ListCount = reportsRow19List.size();
		ArrayList<String> reportsRow19ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow19ListCount;i++)
		{
			String data = reportsRow19List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow19ListArray.add(data);
			}
		}
		String actRow19List = reportsRow19ListArray.toString();
		String expRow19List = "[E1, E501, E1, 6.00, 1.00, 7.00, 11.00, 5.00, 6.00, 1.00, 7.00, 11.00, 5.00, 15.38, 15.38]";
		
		Thread.sleep(2000);
		report_NextBtn.click();
		Thread.sleep(2000);
		
		

		int reportspage2Row1ListCount = reportsrow1List.size();
		ArrayList<String> reportspage2Row1ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row1ListCount;i++)
		{
			String data = reportsrow1List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row1ListArray.add(data);
			}

		}
		String actpage2Row1List = reportspage2Row1ListArray.toString();
		String exppage2Row1List = "[E2, E502, E2, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";



		int reportspage2Row2ListCount = reportsrow2List.size();
		ArrayList<String> reportspage2Row2ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row2ListCount;i++)
		{
			String data = reportsrow2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row2ListArray.add(data);
			}


		}
		String actpage2Row2List = reportspage2Row2ListArray.toString();
		String exppage2Row2List = "[F, F600, F, 2.00, 2.00, 2.00, 2.00, 2.00, 2.00, 5.13, 5.13]";



		int reportspage2Row3ListCount = reportsrow3List.size();
		ArrayList<String> reportspage2Row3ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row3ListCount;i++)
		{
			String data = reportsrow3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row3ListArray.add(data);
			}

		}
		String actpage2Row3List = reportspage2Row3ListArray.toString();
		String exppage2Row3List = "[F1, F601, F1, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 2.56, 2.56]";



		int reportspage2Row4ListCount = reportsrow4List.size();
		ArrayList<String> reportspage2Row4ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row4ListCount;i++)
		{
			String data = reportsrow4List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row4ListArray.add(data);
			}

		}
		String actpage2Row4List = reportspage2Row4ListArray.toString();
		String exppage2Row4List = "[F2, F602, F2, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 2.56, 2.56]";



		int reportspage2Row5ListCount = reportsRow5List.size();
		ArrayList<String> reportspage2Row5ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportspage2Row5ListArray.add(data);
			}
		}
		String actpage2Row5List = reportspage2Row5ListArray.toString();
		String exppage2Row5List = "[C, C300, C, 33.00, 2.00, 31.00, 1.00, 34.00, 33.00, 2.00, 31.00, 1.00, 34.00, 84.62, 84.62]";
		

		int reportspage2Row6ListCount = reportsRow6List.size();
		ArrayList<String> reportspage2Row6ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row6ListCount;i++)
		{
			String data = reportsRow6List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportspage2Row6ListArray.add(data);
			}
		}
		String actpage2Row6List = reportspage2Row6ListArray.toString();
		String exppage2Row6List = "[D, D400, D, 33.00, 2.00, 31.00, 1.00, 34.00, 33.00, 2.00, 31.00, 1.00, 34.00, 84.62, 84.62]";
		
		
		//


		int reportspage2Row7ListCount = reportsRow7List.size();
		ArrayList<String> reportspage2Row7ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row7ListCount;i++)
		{
			String data = reportsRow7List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row7ListArray.add(data);
			}

		}
		String actpage2Row7List = reportspage2Row7ListArray.toString();
		String exppage2Row7List = "[D1, D401, D1, 32.00, 1.00, 31.00, 32.00, 32.00, 1.00, 31.00, 32.00, 82.05, 82.05]";



		int reportspage2Row8ListCount = reportsRow8List.size();
		ArrayList<String> reportspage2Row8ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row8ListCount;i++)
		{
			String data = reportsRow8List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row8ListArray.add(data);
			}

		}
		String actpage2Row8List = reportspage2Row8ListArray.toString();
		String exppage2Row8List = "[D2, D402, D2, 1.00, 1.00, 1.00, 2.00, 1.00, 1.00, 1.00, 2.00, 2.56, 2.56]";



		int reportspage2Row9ListCount = reportsRow9List.size();
		ArrayList<String> reportspage2Row9ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row9ListCount;i++)
		{
			String data = reportsRow9List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportspage2Row9ListArray.add(data);
			}
		}
		String actpage2Row9List = reportspage2Row9ListArray.toString();
		String exppage2Row9List = "[VendorACC, VAC001, VendorACC, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";
		

		int reportspage2Row10ListCount = reportsRow10List.size();
		ArrayList<String> reportspage2Row10ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row10ListCount;i++)
		{
			String data = reportsRow10List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportspage2Row10ListArray.add(data);
			}
		}
		String actpage2Row10List = reportspage2Row10ListArray.toString();
		String exppage2Row10List = "[Grand Total, 39.00, 39.00, 18.00, 18.00, 51.00, 51.00, 62.00, 62.00, 39.00, 39.00, 18.00, 18.00, 51.00, 51.00, 62.00, 62.00]";
		
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

		System.out.println(actRow14List);
		System.out.println(expRow14List);
		

		System.out.println(actRow15List);
		System.out.println(expRow15List);
		
		System.out.println(actRow16List);
		System.out.println(expRow16List);

		System.out.println(actRow17List);
		System.out.println(expRow17List);
		

		System.out.println(actRow18List);
		System.out.println(expRow18List);
		
		System.out.println(actRow19List);
		System.out.println(expRow19List);
		
		System.out.println(actpage2Row1List);
		System.out.println(exppage2Row1List);

		System.out.println(actpage2Row2List);
		System.out.println(exppage2Row2List);

		System.out.println(actpage2Row3List);
		System.out.println(exppage2Row3List);

		System.out.println(actpage2Row4List);
		System.out.println(exppage2Row4List);

		System.out.println(actpage2Row5List);
		System.out.println(exppage2Row5List);
		

		System.out.println(actpage2Row6List);
		System.out.println(exppage2Row6List);
		
		System.out.println(actpage2Row7List);
		System.out.println(exppage2Row7List);

		System.out.println(actpage2Row8List);
		System.out.println(exppage2Row8List);
		

		System.out.println(actpage2Row9List);
		System.out.println(exppage2Row9List);
		
		System.out.println(actpage2Row10List);
		System.out.println(exppage2Row10List);
		
		

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List)&& 
				actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List)&& 
				actRow9List.equalsIgnoreCase(expRow9List) &&
				actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow12List.equalsIgnoreCase(expRow12List) && actRow13List.equalsIgnoreCase(expRow13List)
				&& actRow14List.equalsIgnoreCase(expRow14List) && actRow15List.equalsIgnoreCase(expRow15List)
				&& actRow16List.equalsIgnoreCase(expRow16List) && actRow17List.equalsIgnoreCase(expRow17List)
				&& actRow18List.equalsIgnoreCase(expRow18List) && actRow19List.equalsIgnoreCase(expRow19List)
				
				&&actpage2Row1List.equalsIgnoreCase(exppage2Row1List) && actpage2Row2List.equalsIgnoreCase(exppage2Row2List)
				&&actpage2Row3List.equalsIgnoreCase(exppage2Row3List) && actpage2Row4List.equalsIgnoreCase(exppage2Row4List)
				&&actpage2Row5List.equalsIgnoreCase(exppage2Row5List) && actpage2Row6List.equalsIgnoreCase(exppage2Row6List)
				&& actpage2Row7List.equalsIgnoreCase(exppage2Row7List) && actpage2Row8List.equalsIgnoreCase(exppage2Row8List)
				&& actpage2Row9List.equalsIgnoreCase(exppage2Row9List) && actpage2Row10List.equalsIgnoreCase(exppage2Row10List))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
		
		
	}
	
	public static boolean checkProfitAndLossReport() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(profitandLossReport));
		profitandLossReport.click();
	
	
		Thread.sleep(1500);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

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
		String expRow1List = "[PurchaseACC, PAC001, PurchaseACC, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 33.33, 33.33]";

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
		String expRow2List = "[A, A100, A, 33.00, 4.00, 37.00, 35.00, 2.00, 33.00, 4.00, 37.00, 35.00, 2.00, 89.19, 89.19]";

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
		String expRow3List = "[A1, A101, A1, 33.00, 1.00, 34.00, 34.00, 1.00, 33.00, 1.00, 34.00, 34.00, 1.00, 89.19, 89.19]";



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
		String expRow4List = "[A2, A102, A2, 1.00, 1.00, 1.00, 1.00]";



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
		String expRow5List = "[B, B200, B, 2.00, 2.00, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00]";
		

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
		String expRow6List = "[B1, B201, B1, 1.00, 1.00, 1.00, 1.00]";
		
		
		//


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
		String expRow7List = "[B2, B202, B2, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";



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
		String expRow8List = "[SalesACC, SAC001, SalesACC, 2.00, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00, 2.00, 66.67, 66.67]";



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
		String expRow9List = "[E, E500, E, 4.00, 4.00, 8.00, 12.00, 8.00, 4.00, 4.00, 8.00, 12.00, 8.00, 10.81, 10.81]";
		
		
		///

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
		String expRow10List = "[E1, E501, E1, 6.00, 1.00, 7.00, 11.00, 5.00, 6.00, 1.00, 7.00, 11.00, 5.00, 16.22, 16.22]";



		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow11ListArray.add(data);
			}


		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[E2, E502, E2, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";



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
		String expRow12List = "[F, F600, F, 2.00, 2.00, 2.00, 2.00, 2.00, 2.00, 66.67, 66.67]";



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
		String expRow13List = "[F1, F601, F1, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 33.33, 33.33]";



		int reportsRow14ListCount = reportsRow14List.size();
		ArrayList<String> reportsRow14ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow14ListCount;i++)
		{
			String data = reportsRow14List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow14ListArray.add(data);
			}
		}
		String actRow14List = reportsRow14ListArray.toString();
		String expRow14List = "[F2, F602, F2, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 33.33, 33.33]";
		

		int reportsRow15ListCount = reportsRow15List.size();
		ArrayList<String> reportsRow15ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow15ListCount;i++)
		{
			String data = reportsRow15List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow15ListArray.add(data);
			}
		}
		String actRow15List = reportsRow15ListArray.toString();
		String expRow15List = "[Excess of Expenditure over Income, (34.00), (10.00), (44.00), (34.00), (34.00), (10.00), (44.00), (34.00)]";
		
		

		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow16ListArray.add(data);
			}

		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[Grand Total, 37.00, 37.00, 10.00, 10.00, 45.00, 45.00, 47.00, 47.00, 37.00, 37.00, 10.00, 10.00, 45.00, 45.00, 47.00, 47.00]";
		
		
		
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

		System.out.println(actRow14List);
		System.out.println(expRow14List);
		

		System.out.println(actRow15List);
		System.out.println(expRow15List);
		
		System.out.println(actRow16List);
		System.out.println(expRow16List);


		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List)&& 
				actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List)&& 
				actRow9List.equalsIgnoreCase(expRow9List) &&
				actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow12List.equalsIgnoreCase(expRow12List) && actRow13List.equalsIgnoreCase(expRow13List)
				&& actRow14List.equalsIgnoreCase(expRow14List) && actRow15List.equalsIgnoreCase(expRow15List)
				&& actRow16List.equalsIgnoreCase(expRow16List)) 
				{
					return true;
				} 
		else 
		{
			return false;
		}

	}
	
	public static boolean checkTradingAccountReport() throws InterruptedException
	{


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tradingAccountReport));
		tradingAccountReport.click();
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
	
		Thread.sleep(1500);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

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
		String expRow1List = "[PurchaseACC, PAC001, PurchaseACC, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 33.33, 33.33]";

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
		String expRow2List = "[A, A100, A, 33.00, 4.00, 37.00, 35.00, 2.00, 33.00, 4.00, 37.00, 35.00, 2.00, 89.19, 89.19]";

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
		String expRow3List = "[A1, A101, A1, 33.00, 1.00, 34.00, 34.00, 1.00, 33.00, 1.00, 34.00, 34.00, 1.00, 89.19, 89.19]";



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
		String expRow4List = "[A2, A102, A2, 1.00, 1.00, 1.00, 1.00]";



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
		String expRow5List = "[B, B200, B, 2.00, 2.00, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00]";
		

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
		String expRow6List = "[B1, B201, B1, 1.00, 1.00, 1.00, 1.00]";
		
		
		//


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
		String expRow7List = "[B2, B202, B2, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";



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
		String expRow8List = "[SalesACC, SAC001, SalesACC, 2.00, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00, 2.00, 66.67, 66.67]";



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
		String expRow9List = "[E, E500, E, 4.00, 4.00, 8.00, 12.00, 8.00, 4.00, 4.00, 8.00, 12.00, 8.00, 10.81, 10.81]";
		
		
		///

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
		String expRow10List = "[E1, E501, E1, 6.00, 1.00, 7.00, 11.00, 5.00, 6.00, 1.00, 7.00, 11.00, 5.00, 16.22, 16.22]";



		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow11ListArray.add(data);
			}


		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[E2, E502, E2, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";



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
		String expRow12List = "[F, F600, F, 2.00, 2.00, 2.00, 2.00, 2.00, 2.00, 66.67, 66.67]";



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
		String expRow13List = "[F1, F601, F1, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 33.33, 33.33]";



		int reportsRow14ListCount = reportsRow14List.size();
		ArrayList<String> reportsRow14ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow14ListCount;i++)
		{
			String data = reportsRow14List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow14ListArray.add(data);
			}
		}
		String actRow14List = reportsRow14ListArray.toString();
		String expRow14List = "[F2, F602, F2, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 33.33, 33.33]";
		

		int reportsRow15ListCount = reportsRow15List.size();
		ArrayList<String> reportsRow15ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow15ListCount;i++)
		{
			String data = reportsRow15List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow15ListArray.add(data);
			}
		}
		String actRow15List = reportsRow15ListArray.toString();
		String expRow15List = "[Excess of Expenditure over Income, (34.00), (10.00), (44.00), (34.00), (34.00), (10.00), (44.00), (34.00)]";
		
		

		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow16ListArray.add(data);
			}

		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[Grand Total, 37.00, 37.00, 10.00, 10.00, 45.00, 45.00, 47.00, 47.00, 37.00, 37.00, 10.00, 10.00, 45.00, 45.00, 47.00, 47.00]";
		
		
		
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

		System.out.println(actRow14List);
		System.out.println(expRow14List);
		

		System.out.println(actRow15List);
		System.out.println(expRow15List);
		
		System.out.println(actRow16List);
		System.out.println(expRow16List);


		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List)&& 
				actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List)&& 
				actRow9List.equalsIgnoreCase(expRow9List) &&
				actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow12List.equalsIgnoreCase(expRow12List) && actRow13List.equalsIgnoreCase(expRow13List)
				&& actRow14List.equalsIgnoreCase(expRow14List) && actRow15List.equalsIgnoreCase(expRow15List)
				&& actRow16List.equalsIgnoreCase(expRow16List)) 
				{
					return true;
				} 
		else 
		{
			return false;
		}

	
	}

	public static boolean checkTrandingAndProfitAndLoss() throws InterruptedException
	{
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tradingandProfitAndLossReport));
		tradingandProfitAndLossReport.click();
		

	
		Thread.sleep(1500);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

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
		String expRow1List = "[SalesACC, SAC001, SalesACC, 2.00, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00, 2.00, 66.67, 66.67]";

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
		String expRow2List = "[E, E500, E, 4.00, 4.00, 8.00, 12.00, 8.00, 4.00, 4.00, 8.00, 12.00, 8.00, 10.81, 10.81]";

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
		String expRow3List = "[E1, E501, E1, 6.00, 1.00, 7.00, 11.00, 5.00, 6.00, 1.00, 7.00, 11.00, 5.00, 16.22, 16.22]";



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
		String expRow4List = "[E2, E502, E2, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";



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
		String expRow5List = "[F, F600, F, 2.00, 2.00, 2.00, 2.00, 2.00, 2.00, 66.67, 66.67]";
		

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
		String expRow6List = "[F1, F601, F1, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 33.33, 33.33]";
		
		
		//


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
		String expRow7List = "[F2, F602, F2, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 33.33, 33.33]";



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
		String expRow8List = "[PurchaseACC, PAC001, PurchaseACC, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 33.33, 33.33]";



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
		String expRow9List = "[A, A100, A, 33.00, 4.00, 37.00, 35.00, 2.00, 33.00, 4.00, 37.00, 35.00, 2.00, 89.19, 89.19]";
		
		
		///

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
		String expRow10List = "[A1, A101, A1, 33.00, 1.00, 34.00, 34.00, 1.00, 33.00, 1.00, 34.00, 34.00, 1.00, 89.19, 89.19]";



		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow11ListArray.add(data);
			}


		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[A2, A102, A2, 1.00, 1.00, 1.00, 1.00]";



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
		String expRow12List = "[B, B200, B, 2.00, 2.00, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00]";



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
		String expRow13List = "[B1, B201, B1, 1.00, 1.00, 1.00, 1.00]";



		int reportsRow14ListCount = reportsRow14List.size();
		ArrayList<String> reportsRow14ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow14ListCount;i++)
		{
			String data = reportsRow14List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow14ListArray.add(data);
			}
		}
		String actRow14List = reportsRow14ListArray.toString();
		String expRow14List = "[B2, B202, B2, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";
		

		int reportsRow15ListCount = reportsRow15List.size();
		ArrayList<String> reportsRow15ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow15ListCount;i++)
		{
			String data = reportsRow15List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow15ListArray.add(data);
			}
		}
		String actRow15List = reportsRow15ListArray.toString();
		String expRow15List = "[Loss for the period, (34.00), (10.00), (44.00), (34.00), (34.00), (10.00), (44.00), (34.00)]";
		
		

		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow16ListArray.add(data);
			}

		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[Grand Total, 37.00, 37.00, 10.00, 10.00, 45.00, 45.00, 47.00, 47.00, 37.00, 37.00, 10.00, 10.00, 45.00, 45.00, 47.00, 47.00]";
		
		
		
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

		System.out.println(actRow14List);
		System.out.println(expRow14List);
		

		System.out.println(actRow15List);
		System.out.println(expRow15List);
		
		System.out.println(actRow16List);
		System.out.println(expRow16List);


		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List)&& 
				actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List)&& 
				actRow9List.equalsIgnoreCase(expRow9List) &&
				actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow12List.equalsIgnoreCase(expRow12List) && actRow13List.equalsIgnoreCase(expRow13List)
				&& actRow14List.equalsIgnoreCase(expRow14List) && actRow15List.equalsIgnoreCase(expRow15List)
				&& actRow16List.equalsIgnoreCase(expRow16List)) 
				{
					return true;
				} 
		else 
		{
			return false;
		}

	
		
	}
	
	public static boolean checkBalanceSheetReport() throws InterruptedException
	{

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(balanceSheetReport));
		balanceSheetReport.click();
	
	
		Thread.sleep(1500);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

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
		String expRow1List = "[BankACC, BAC001, BankACC, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00, 2.00, 2.00]";

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
		String expRow2List = "[CashACC, CASH001, CashACC, 1.00, 1.00, 2.00, 1.00, 1.00, 1.00, 2.00, 1.00, 50.00, 50.00]";

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
		String expRow3List = "[CONTROL ACCOUNTS, CA, CONTROL ACCOUNTS, 18.00, 18.00, 18.00, 18.00]";



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
		String expRow4List = "[Opening Balances Control A/C, OBC, Opening Balances Control A/C, 18.00, 18.00, 18.00, 18.00]";



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
		String expRow5List = "[G, G700, G, 3.00, 2.00, 1.00, 8.00, 11.00, 3.00, 2.00, 1.00, 8.00, 11.00, 8.33, 8.33]";
		

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
		String expRow6List = "[H, H800, H, 3.00, 2.00, 1.00, 8.00, 11.00, 3.00, 2.00, 1.00, 8.00, 11.00, 8.33, 8.33]";
		
		
		//


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
		String expRow7List = "[H1, H801, H1, 6.00, 1.00, 5.00, 5.00, 11.00, 6.00, 1.00, 5.00, 5.00, 11.00, 16.67, 16.67]";



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
		String expRow8List = "[H2, H802, H2, 3.00, 1.00, 4.00, 3.00, 3.00, 1.00, 4.00, 3.00, 150.00, 150.00]";



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
		String expRow9List = "[CustomerACC, CAC001, CustomerACC, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00, 1.00, 2.00, 2.00, 1.00, 50.00, 50.00]";
		
		
		///

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
		String expRow10List = "[C, C300, C, 33.00, 2.00, 31.00, 1.00, 34.00, 33.00, 2.00, 31.00, 1.00, 34.00, 91.67, 91.67]";



		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow11ListArray.add(data);
			}


		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[D, D400, D, 33.00, 2.00, 31.00, 1.00, 34.00, 33.00, 2.00, 31.00, 1.00, 34.00, 91.67, 91.67]";



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
		String expRow12List = "[D1, D401, D1, 32.00, 1.00, 31.00, 32.00, 32.00, 1.00, 31.00, 32.00, 88.89, 88.89]";



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
		String expRow13List = "[D2, D402, D2, 1.00, 1.00, 1.00, 2.00, 1.00, 1.00, 1.00, 2.00, 2.78, 2.78]";



		int reportsRow14ListCount = reportsRow14List.size();
		ArrayList<String> reportsRow14ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow14ListCount;i++)
		{
			String data = reportsRow14List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow14ListArray.add(data);
			}
		}
		String actRow14List = reportsRow14ListArray.toString();
		String expRow14List = "[VendorACC, VAC001, VendorACC, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";
		

		int reportsRow15ListCount = reportsRow15List.size();
		ArrayList<String> reportsRow15ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow15ListCount;i++)
		{
			String data = reportsRow15List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow15ListArray.add(data);
			}
		}
		String actRow15List = reportsRow15ListArray.toString();
		String expRow15List = "[Excess of Expenditure over Income, 34.00, 10.00, 44.00, 34.00, 34.00, 44.00, 34.00]";
		
		

		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow16ListArray.add(data);
			}

		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[Grand Total, 36.00, 36.00, 18.00, 18.00, 50.00, 50.00, 49.00, 49.00, 36.00, 36.00, 18.00, 18.00, 50.00, 50.00, 49.00, 49.00]";
		
		
		
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

		System.out.println(actRow14List);
		System.out.println(expRow14List);
		

		System.out.println(actRow15List);
		System.out.println(expRow15List);
		
		System.out.println(actRow16List);
		System.out.println(expRow16List);


		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List)&& 
				actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List)&& 
				actRow9List.equalsIgnoreCase(expRow9List) &&
				actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow12List.equalsIgnoreCase(expRow12List) && actRow13List.equalsIgnoreCase(expRow13List)
				&& actRow14List.equalsIgnoreCase(expRow14List) && actRow15List.equalsIgnoreCase(expRow15List)
				&& actRow16List.equalsIgnoreCase(expRow16List)) 
				{
					return true;
				} 
		else 
		{
			return false;
		}

	
	}
	
	public static boolean checkSchedulesReports() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finalAccountSchedulesReport));
		finalAccountSchedulesReport.click();
		

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
	
		Thread.sleep(1500);
		Thread.sleep(1500);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

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
		String expRow1List = "[BankACC, BAC001, BankACC, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00, 2.00, 2.00]";



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
		String expRow2List = "[CashACC, CASH001, CashACC, 1.00, 1.00, 2.00, 1.00, 1.00, 1.00, 2.00, 1.00, 2.56, 2.56]";



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
		String expRow3List = "[CONTROL ACCOUNTS, CA, CONTROL ACCOUNTS, 18.00, 18.00, 18.00, 18.00]";



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
		String expRow4List = "[Opening Balances Control A/C, OBC, Opening Balances Control A/C, 18.00, 18.00, 18.00, 18.00]";



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
		String expRow5List = "[G, G700, G, 3.00, 2.00, 1.00, 8.00, 11.00, 3.00, 2.00, 1.00, 8.00, 11.00, 7.69, 7.69]";
		

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
		String expRow6List = "[H, H800, H, 3.00, 2.00, 1.00, 8.00, 11.00, 3.00, 2.00, 1.00, 8.00, 11.00, 7.69, 7.69]";
		
		
		//


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
		String expRow7List = "[H1, H801, H1, 6.00, 1.00, 5.00, 5.00, 11.00, 6.00, 1.00, 5.00, 5.00, 11.00, 15.38, 15.38]";



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
		String expRow8List = "[H2, H802, H2, 3.00, 1.00, 4.00, 3.00, 3.00, 1.00, 4.00, 3.00, 7.69, 7.69]";



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
		String expRow9List = "[CustomerACC, CAC001, CustomerACC, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00, 1.00, 2.00, 2.00, 1.00, 2.56, 2.56]";
		
		
		///

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
		String expRow10List = "[PurchaseACC, PAC001, PurchaseACC, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 2.56, 2.56]";



		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow11ListArray.add(data);
			}


		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[A, A100, A, 33.00, 4.00, 37.00, 35.00, 2.00, 33.00, 4.00, 37.00, 35.00, 2.00, 84.62, 84.62]";



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
		String expRow12List = "[A1, A101, A1, 33.00, 1.00, 34.00, 34.00, 1.00, 33.00, 1.00, 34.00, 34.00, 1.00, 84.62, 84.62]";



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
		String expRow13List = "[A2, A102, A2, 1.00, 1.00, 1.00, 1.00]";



		int reportsRow14ListCount = reportsRow14List.size();
		ArrayList<String> reportsRow14ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow14ListCount;i++)
		{
			String data = reportsRow14List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow14ListArray.add(data);
			}
		}
		String actRow14List = reportsRow14ListArray.toString();
		String expRow14List = "[B, B200, B, 2.00, 2.00, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00]";
		

		int reportsRow15ListCount = reportsRow15List.size();
		ArrayList<String> reportsRow15ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow15ListCount;i++)
		{
			String data = reportsRow15List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow15ListArray.add(data);
			}
		}
		String actRow15List = reportsRow15ListArray.toString();
		String expRow15List = "[B1, B201, B1, 1.00, 1.00, 1.00, 1.00]";
		
		

		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow16ListArray.add(data);
			}

		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[B2, B202, B2, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";



		int reportsRow17ListCount = reportsRow17List.size();
		ArrayList<String> reportsRow17ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow17ListCount;i++)
		{
			String data = reportsRow17List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow17ListArray.add(data);
			}

		}
		String actRow17List = reportsRow17ListArray.toString();
		String expRow17List = "[SalesACC, SAC001, SalesACC, 2.00, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00, 2.00, 5.13, 5.13]";

		
		Thread.sleep(2000);
		report_NextBtn.click();
		Thread.sleep(2000);


		int reportspage2Row1ListCount = reportsRow1List.size();
		ArrayList<String> reportspage2Row1ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportspage2Row1ListArray.add(data);
			}
		}
		String actpage2Row1List = reportspage2Row1ListArray.toString();
		String exppage2Row1List = "[E, E500, E, 4.00, 4.00, 8.00, 12.00, 8.00, 4.00, 4.00, 8.00, 12.00, 8.00, 10.26, 10.26]";
		
		int reportspage2Row2ListCount = reportsRow2List.size();
		ArrayList<String> reportspage2Row2ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportspage2Row2ListArray.add(data);
			}
		}
		String actpage2Row2List = reportspage2Row2ListArray.toString();
		String exppage2Row2List = "[E1, E501, E1, 6.00, 1.00, 7.00, 11.00, 5.00, 6.00, 1.00, 7.00, 11.00, 5.00, 15.38, 15.38]";
		
		

		int reportspage2Row3ListCount = reportsrow3List.size();
		ArrayList<String> reportspage2Row3ListArray = new ArrayList<String>();
		for(int i=3;i<reportspage2Row3ListCount;i++)
		{
			String data = reportsrow3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row3ListArray.add(data);
			}

		}
		String actpage2Row3List = reportspage2Row3ListArray.toString();
		String exppage2Row3List = "[E2, E502, E2, 3.00, 3.00, 3.00, 3.00, 3.00, 3.00, 3.00, 3.00]";



		int reportspage2Row4ListCount = reportsrow4List.size();
		ArrayList<String> reportspage2Row4ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row4ListCount;i++)
		{
			String data = reportsrow4List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row4ListArray.add(data);
			}


		}
		String actpage2Row4List = reportspage2Row4ListArray.toString();
		String exppage2Row4List = "[F, F600, F, 4.00, 4.00, 4.00, 4.00, 4.00, 4.00, 5.13, 5.13]";



		int reportspage2Row5ListCount = reportsRow5List.size();
		ArrayList<String> reportspage2Row5ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row5ListArray.add(data);
			}

		}
		String actpage2Row5List = reportspage2Row5ListArray.toString();
		String exppage2Row5List = "[F1, F601, F1, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 2.56, 2.56]";



		int reportspage2Row6ListCount = reportsRow6List.size();
		ArrayList<String> reportspage2Row6ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row6ListCount;i++)
		{
			String data = reportsRow6List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row6ListArray.add(data);
			}

		}
		String actpage2Row6List = reportspage2Row6ListArray.toString();
		String exppage2Row6List = "[F2, F602, F2, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 2.56, 2.56]";



		int reportspage2Row7ListCount = reportsRow7List.size();
		ArrayList<String> reportspage2Row7ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row7ListCount;i++)
		{
			String data = reportsRow7List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportspage2Row7ListArray.add(data);
			}
		}
		String actpage2Row7List = reportspage2Row7ListArray.toString();
		String exppage2Row7List = "[C, C300, C, 33.00, 2.00, 31.00, 1.00, 34.00, 33.00, 2.00, 31.00, 1.00, 34.00, 84.62, 84.62]";
		

		int reportspage2Row8ListCount = reportsRow8List.size();
		ArrayList<String> reportspage2Row8ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row8ListCount;i++)
		{
			String data = reportsRow8List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportspage2Row8ListArray.add(data);
			}
		}
		String actpage2Row8List = reportspage2Row8ListArray.toString();
		String exppage2Row8List = "[D, D400, D, 33.00, 2.00, 31.00, 1.00, 34.00, 33.00, 2.00, 31.00, 1.00, 34.00, 84.82, 84.82]";
		
		
		//


		int reportspage2Row9ListCount = reportsRow9List.size();
		ArrayList<String> reportspage2Row9ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row9ListCount;i++)
		{
			String data = reportsRow9List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row9ListArray.add(data);
			}

		}
		String actpage2Row9List = reportspage2Row9ListArray.toString();
		String exppage2Row9List = "[D1, D401, D1, 32.00, 1.00, 31.00, 32.00, 32.00, 1.00, 31.00, 32.00, 82.05, 82.05]";



		int reportspage2Row10ListCount = reportsRow10List.size();
		ArrayList<String> reportspage2Row10ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row10ListCount;i++)
		{
			String data = reportsRow10List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row10ListArray.add(data);
			}

		}
		String actpage2Row10List = reportspage2Row10ListArray.toString();
		String exppage2Row10List = "[D2, D402, D2, 1.00, 1.00, 1.00, 2.00, 1.00, 1.00, 1.00, 2.00, 2.56, 2.56]";



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

		System.out.println(actRow14List);
		System.out.println(expRow14List);
		

		System.out.println(actRow15List);
		System.out.println(expRow15List);
		
		System.out.println(actRow16List);
		System.out.println(expRow16List);

		System.out.println(actRow17List);
		System.out.println(expRow17List);
		

		System.out.println(actpage2Row1List);
		System.out.println(exppage2Row1List);

		System.out.println(actpage2Row2List);
		System.out.println(exppage2Row2List);

		System.out.println(actpage2Row3List);
		System.out.println(exppage2Row3List);

		System.out.println(actpage2Row4List);
		System.out.println(exppage2Row4List);

		System.out.println(actpage2Row5List);
		System.out.println(exppage2Row5List);
		

		System.out.println(actpage2Row6List);
		System.out.println(exppage2Row6List);
		
		System.out.println(actpage2Row7List);
		System.out.println(exppage2Row7List);

		System.out.println(actpage2Row8List);
		System.out.println(exppage2Row8List);
		

		System.out.println(actpage2Row9List);
		System.out.println(exppage2Row9List);
		
		System.out.println(actpage2Row10List);
		System.out.println(exppage2Row10List);
		
		

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List)&& 
				actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List)&& 
				actRow9List.equalsIgnoreCase(expRow9List) &&
				actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow12List.equalsIgnoreCase(expRow12List) && actRow13List.equalsIgnoreCase(expRow13List)
				&& actRow14List.equalsIgnoreCase(expRow14List) && actRow15List.equalsIgnoreCase(expRow15List)
				&& actRow16List.equalsIgnoreCase(expRow16List) && actRow17List.equalsIgnoreCase(expRow17List)
				
				
				&&actpage2Row1List.equalsIgnoreCase(exppage2Row1List) && actpage2Row2List.equalsIgnoreCase(exppage2Row2List)
				&&actpage2Row3List.equalsIgnoreCase(exppage2Row3List) && actpage2Row4List.equalsIgnoreCase(exppage2Row4List)
				&&actpage2Row5List.equalsIgnoreCase(exppage2Row5List) && actpage2Row6List.equalsIgnoreCase(exppage2Row6List)
				&& actpage2Row7List.equalsIgnoreCase(exppage2Row7List) && actpage2Row8List.equalsIgnoreCase(exppage2Row8List)
				&& actpage2Row9List.equalsIgnoreCase(exppage2Row9List) && actpage2Row10List.equalsIgnoreCase(exppage2Row10List))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
	}
	
	public static boolean checkFundFlowReport() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fundFlowReport));
		fundFlowReport.click();
	
		Thread.sleep(1500);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

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
		String expRow1List = "[BankACC, BAC001, BankACC, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00, 2.00, 2.00]";

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
		String expRow2List = "[CashACC, CASH001, CashACC, 1.00, 1.00, 2.00, 1.00, 1.00, 1.00, 2.00, 1.00, 50.00, 50.00]";

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
		String expRow3List = "[CONTROL ACCOUNTS, CA, CONTROL ACCOUNTS, 18.00, 18.00, 18.00, 18.00]";



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
		String expRow4List = "[Opening Balances Control A/C, OBC, Opening Balances Control A/C, 18.00, 18.00, 18.00, 18.00]";



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
		String expRow5List = "[G, G700, G, 3.00, 2.00, 1.00, 8.00, 11.00, 3.00, 2.00, 1.00, 8.00, 11.00, 8.33, 8.33]";
		

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
		String expRow6List = "[H, H800, H, 3.00, 2.00, 1.00, 8.00, 11.00, 3.00, 2.00, 1.00, 8.00, 11.00, 8.33, 8.33]";
		
		
		//


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
		String expRow7List = "[H1, H801, H1, 6.00, 1.00, 5.00, 5.00, 11.00, 6.00, 1.00, 5.00, 5.00, 11.00, 16.67, 16.67]";



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
		String expRow8List = "[H2, H802, H2, 3.00, 1.00, 4.00, 3.00, 3.00, 1.00, 4.00, 3.00, 150.00, 150.00]";



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
		String expRow9List = "[CustomerACC, CAC001, CustomerACC, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00, 1.00, 2.00, 2.00, 1.00, 50.00, 50.00]";
		
		
		///

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
		String expRow10List = "[C, C300, C, 33.00, 2.00, 31.00, 1.00, 34.00, 33.00, 2.00, 31.00, 1.00, 34.00, 91.67, 91.67]";



		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow11ListArray.add(data);
			}


		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[D, D400, D, 33.00, 2.00, 31.00, 1.00, 34.00, 33.00, 2.00, 31.00, 1.00, 34.00, 91.67, 91.67]";



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
		String expRow12List = "[D1, D401, D1, 32.00, 1.00, 31.00, 32.00, 32.00, 1.00, 31.00, 32.00, 88.89, 88.89]";



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
		String expRow13List = "[D2, D402, D2, 1.00, 1.00, 1.00, 2.00, 1.00, 1.00, 1.00, 2.00, 2.78, 2.78]";



		int reportsRow14ListCount = reportsRow14List.size();
		ArrayList<String> reportsRow14ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow14ListCount;i++)
		{
			String data = reportsRow14List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow14ListArray.add(data);
			}
		}
		String actRow14List = reportsRow14ListArray.toString();
		String expRow14List = "[VendorACC, VAC001, VendorACC, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";
		

		int reportsRow15ListCount = reportsRow15List.size();
		ArrayList<String> reportsRow15ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow15ListCount;i++)
		{
			String data = reportsRow15List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow15ListArray.add(data);
			}
		}
		String actRow15List = reportsRow15ListArray.toString();
		String expRow15List = "[Loss for the period, 34.00, 10.00, 44.00, 34.00, 34.00, 44.00, 34.00]";
		
		

		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow16ListArray.add(data);
			}

		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[Grand Total, 36.00, 36.00, 18.00, 18.00, 50.00, 50.00, 49.00, 49.00, 36.00, 36.00, 18.00, 18.00, 50.00, 50.00, 49.00, 49.00]";
		
		
		
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

		System.out.println(actRow14List);
		System.out.println(expRow14List);
		

		System.out.println(actRow15List);
		System.out.println(expRow15List);
		
		System.out.println(actRow16List);
		System.out.println(expRow16List);


		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List)&& 
				actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List)&& 
				actRow9List.equalsIgnoreCase(expRow9List) &&
				actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow12List.equalsIgnoreCase(expRow12List) && actRow13List.equalsIgnoreCase(expRow13List)
				&& actRow14List.equalsIgnoreCase(expRow14List) && actRow15List.equalsIgnoreCase(expRow15List)
				&& actRow16List.equalsIgnoreCase(expRow16List)) 
				{
					return true;
				} 
		else 
		{
			return false;
		}

	
	}
	
	public static boolean checkCashFlowReport() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashFlowReport));
		cashFlowReport.click();
	
		Thread.sleep(1500);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

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
		String expRow1List = "[CashACC, CASH001, CashACC, 1.00, 1.00, 2.00, 1.00, 1.00, 1.00, 2.00, 1.00, 100.00, 100.00]";

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
		String expRow2List = "[Loss for the period, (1.00), (1.00), (2.00), (1.00), (1.00), (1.00), (2.00), (1.00)]";

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
		String expRow3List = "[Grand Total, 1.00, 1.00, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00]";
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);

		System.out.println(actRow2List);
		System.out.println(expRow2List);

		System.out.println(actRow3List);
		System.out.println(expRow3List);
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) ) 
		{
			return true;
		} 
		else 
		{
			return false;
		}

	}
	
	//cash flow analysis
	
	
	public static boolean checkAdvanceCashFlowReport() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(advanceCashFlowReport));
		advanceCashFlowReport.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(2000);
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
		String expRow1List = "[Net Income, 535.00]";

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
		String expRow2List = "[Begining Cash Balance]";

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
		String expRow3List = "[Total Change in Cash, 535.00]";
		
		
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
		String expRow4List = "[Ending Cash Balance, 535.00]";
		
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
	
	public static boolean checkIncomeExpensesTrendReport() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(incomeExpenseTrendsReport));
		incomeExpenseTrendsReport.click();
		
		Thread.sleep(1500);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllChkBox));
		sl_SelectAllChkBox.click();
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

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
		String expRow1List = "[March, 10.00]";

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
		String expRow2List = "[July, 13.00, 45.00]";

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
		String expRow3List = "[Grand Total, 13.00, 55.00]";
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);

		System.out.println(actRow2List);
		System.out.println(expRow2List);

		System.out.println(actRow3List);
		System.out.println(expRow3List);
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) ) 
		{
			return true;
		} 
		else 
		{
			return false;
		}

	
	}
	
	public static boolean checkReceivableAndPayableReport() throws InterruptedException
	{
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivablePayableReport));
		receivablePayableReport.click();

		Thread.sleep(1500);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

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
		String expRow1List = "[PurchaseACC, PAC001, PurchaseACC, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 33.33, 33.33]";

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
		String expRow2List = "[A, A100, A, 33.00, 4.00, 37.00, 35.00, 2.00, 33.00, 4.00, 37.00, 35.00, 2.00, 89.19, 89.19]";

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
		String expRow3List = "[A1, A101, A1, 33.00, 1.00, 34.00, 34.00, 1.00, 33.00, 1.00, 34.00, 34.00, 1.00, 89.19, 89.19]";



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
		String expRow4List = "[A2, A102, A2, 1.00, 1.00, 1.00, 1.00]";



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
		String expRow5List = "[B, B200, B, 2.00, 2.00, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00]";
		

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
		String expRow6List = "[B1, B201, B1, 1.00, 1.00, 1.00, 1.00]";
		
		
		//


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
		String expRow7List = "[B2, B202, B2, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";



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
		String expRow8List = "[SalesACC, SAC001, SalesACC, 2.00, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00, 2.00, 66.67, 66.67]";



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
		String expRow9List = "[E, E500, E, 4.00, 4.00, 8.00, 12.00, 8.00, 4.00, 4.00, 8.00, 12.00, 8.00, 10.81, 10.81]";
		
		
		///

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
		String expRow10List = "[E1, E501, E1, 6.00, 1.00, 7.00, 11.00, 5.00, 6.00, 1.00, 7.00, 11.00, 5.00, 16.22, 16.22]";



		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow11ListArray.add(data);
			}


		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[E2, E502, E2, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";



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
		String expRow12List = "[F, F600, F, 2.00, 2.00, 2.00, 2.00, 2.00, 2.00, 66.67, 66.67]";



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
		String expRow13List = "[F1, F601, F1, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 33.33, 33.33]";



		int reportsRow14ListCount = reportsRow14List.size();
		ArrayList<String> reportsRow14ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow14ListCount;i++)
		{
			String data = reportsRow14List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow14ListArray.add(data);
			}
		}
		String actRow14List = reportsRow14ListArray.toString();
		String expRow14List = "[F2, F602, F2, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 33.33, 33.33]";
		

		int reportsRow15ListCount = reportsRow15List.size();
		ArrayList<String> reportsRow15ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow15ListCount;i++)
		{
			String data = reportsRow15List.get(i).getText().trim();

			if(data.isEmpty() == false)
			{
				reportsRow15ListArray.add(data);
			}
		}
		String actRow15List = reportsRow15ListArray.toString();
		String expRow15List = "[Excess of Expenditure over Income, (34.00), (10.00), (44.00), (34.00), (34.00), (10.00), (44.00), (34.00)]";
		
		

		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow16ListArray.add(data);
			}

		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[Grand Total, 37.00, 37.00, 10.00, 10.00, 45.00, 45.00, 47.00, 47.00, 37.00, 37.00, 10.00, 10.00, 45.00, 45.00, 47.00, 47.00]";
		
		
		
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

		System.out.println(actRow14List);
		System.out.println(expRow14List);
		

	

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List)&& 
				actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List)&& 
				actRow9List.equalsIgnoreCase(expRow9List) &&
				actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow12List.equalsIgnoreCase(expRow12List) && actRow13List.equalsIgnoreCase(expRow13List)
				&& actRow14List.equalsIgnoreCase(expRow14List)) 
				{
					return true;
				} 
		else 
		{
			return false;
		}

	
	}
	
	public static boolean checklogout() throws InterruptedException
	{

		Thread.sleep(3000);
		
		getDriver().navigate().refresh();
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(LogoutDropdown));
		LogoutDropdown.click();
		 
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		  logoutOption.click();
		  
		  Thread.sleep(2000);
		  
		  boolean actUserLoginPage              = username.isDisplayed() && username.isEnabled()
                                                  && password.isDisplayed() && password.isEnabled();
                                         
		  boolean expUserLoginPage              = true;
		  
		  if(actUserLoginPage==expUserLoginPage)  
	      {
			System.out.println("***Test Pass: Login Successfull***");
			return true;
		  }
	      else
	      {
	  	 
			System.out.println("***Test Fail: Login Not Successfull***");
			
			return false;
		  }
		
	}
	
public FocusFinancialsReportPage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}

}
