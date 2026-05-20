package com.focus.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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

import com.focus.base.BaseEngine;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.testautomationguru.utility.PDFUtil;

public class FocusFinancialsReportPage extends BaseEngine
{

	
	
	
	public static boolean checkLedgerReport() throws InterruptedException
	{

		getDriver().navigate().refresh();
		Thread.sleep(1500);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
		ledger.click();
		
		Thread.sleep(1500);
		IsVisible(Ledger1stItem);
		Thread.sleep(1500);
		
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);

		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		Thread.sleep(1200);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		
		Thread.sleep(1500);

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
		String expRow2List = "[PurVou : 9, Rct : 1, SalInv : 2, Pmt : 1, SalInv : 3]";

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
		String expRow3List = "[Opening Balance, A1, CustomerACC, E1, H2, Opening Balance, E2, Opening Balance, Opening Balance]";

		
		System.out.println("Actaul Account  :"+actRow3List);
		System.out.println("Expected Account:"+expRow3List);
		
		Thread.sleep(1500);

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
		String expRow4List = "[BR-HYD, BR-HYD, BR-HYD]";

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
		String expRow5List = "[A1, A1, A1, D2, A1]";

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
		String expRow6List = "[A1, A1, A1]";

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
		
		Thread.sleep(2500);
		report_NextBtn.click();
		Thread.sleep(2500);
		
		
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
		
		Thread.sleep(2500);

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
		String expPage2Row2List = "[SalInv : 1, SalInv : 5, SalRet : 1, SalInv : 6, Pmt : 1, CreNts : 1, Rct : 1, SalInv : 4, NJv : 1]";

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
		String expPage2Row3List = "[E1, F2, E1, Opening Balance, SalesACC, BankACC, B2, Opening Balance, BankACC, F1, SalesACC]";

		
		System.out.println("Actaul Account  :"+actPage2Row3List);
		System.out.println("Expected Account:"+expPage2Row3List);
		
		Thread.sleep(1500);

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
		String expPage2Row4List = "[BR-HYD, BR-HYD, BR-HYD, 0, BR-HYD, 0]";

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
		String expPage2Row5List = "[A1, A1, A1, A1, D2, B2, A1, A1, D2]";

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
		String expPage2Row6List = "[A1, A1, A1, A1, A1]";

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
		String expAllDatapage2 = "[H2 [H802], CustomerACC [CAC001]]";

		System.out.println("actAllDatapage2"+actAllDatapage2);
		System.out.println("expAllDatapage2"+expAllDatapage2);
		
		Thread.sleep(1500);
		report_NextBtn.click();
		Thread.sleep(1500);
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
		
		Thread.sleep(4500);

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
		String exppage3Row3List = "[Opening Balance, VendorACC, Opening Balance, D1, Vendor A, BankACC, D2, Opening Balance, Opening Balance]";

		
		System.out.println("Actaul Account  :"+actpage3Row3List);
		System.out.println("Expected Account:"+exppage3Row3List);
		
		Thread.sleep(1500);

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
		String expAllDatapage3 = "[PurchaseACC [PAC001], A1 [A101], A2 [A102], B1 [B201]]";

		System.out.println("actAllDatapage3"+actAllDatapage3);
		System.out.println("expAllDatapage3"+expAllDatapage3);
		
		
		System.out.println("*************************Printing page 3 data done*********************************");

		Thread.sleep(1500);
		report_NextBtn.click();
		Thread.sleep(2500);
		
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
		
		Thread.sleep(4500);
		
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
		String exppage4Row2List = "[PurVou : 10, CreNts : 1, SalInv : 6, NJv : 1, SalInv : 1, SalInv : 2, SalRet : 1]";

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
		String exppage4Row3List = "[Opening Balance, D2, H2, Opening Balance, H2, CustomerACC, Opening Balance, H1, BankACC, H1]";

		
		System.out.println("Actaul Account  :"+actpage4Row3List);
		System.out.println("Expected Account:"+exppage4Row3List);
		
		Thread.sleep(1500);

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
		String exppage4Row4List = "[BR-HYD, 0, BR-HYD, 0, BR-HYD, BR-HYD, 0]";

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
		String exppage4Row5List = "[D2, B2, A1, D2, A1, A1, A1]";

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
		String exppage4Row6List = "[D2, A1, A1, A1, A1]";

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
		String expAllDatapage4 = "[B2 [B202], SalesACC [SAC001], E1 [E501]]";

		System.out.println("actAllDatapage4"+actAllDatapage4);
		System.out.println("expAllDatapage4"+expAllDatapage4);
		
		System.out.println("*************************Printing page 4 data done*********************************");


		Thread.sleep(1500);
		report_NextBtn.click();
		Thread.sleep(2500);
		
		try{
			if(pageNum.getText().equalsIgnoreCase("6"))
					{
				Thread.sleep(1500);
				report_PrevBtn.click();
					}
			
		}
		catch (Exception e) 
		{
			
			System.out.println("Exception "+e);
			
			

		}
		
		Thread.sleep(2500);

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
		String exppage5Row2List = "[SalInv : 3, DebNts : 1, SalInv : 4, SalInv : 5]";

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
		String exppage5Row3List = "[Opening Balance, CashACC, D2, Opening Balance, CustomerACC, Opening Balance, H1, Opening Balance]";

		
		System.out.println("Actaul Account  :"+actpage5Row3List);
		System.out.println("Expected Account:"+exppage5Row3List);
		
		Thread.sleep(1500);

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
		String exppage5Row4List = "[BR-HYD, 0, BR-HYD, BR-HYD]";

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
		String exppage5Row5List = "[A1, D2, A1, A1]";

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
		String exppage5Row6List = "[A1, A1, A1]";

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


		Thread.sleep(1500);
		report_NextBtn.click();
		Thread.sleep(2500);
		
		IsVisible(grandTotalTxt);
		Thread.sleep(2500);
		

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
		String exppage6Row2List = "[PurVou : 1, PurVou : 10, PurRet : 1, DebNts : 1, PurVou : 2, NJv : 1]";

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
		String exppage6Row3List = "[A1, Opening Balance, B2, A1, E2, Opening Balance, Purchase, PurchaseACC]";

		
		System.out.println("Actaul Account  :"+actpage6Row3List);
		System.out.println("Expected Account:"+exppage6Row3List);
		
		Thread.sleep(1500);

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
		String exppage6Row4List = "[BR-HYD, BR-HYD, 0, 0, BR-HYD, 0]";

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
		String exppage6Row5List = "[A1, D2, A1, D2, A1, D2]";

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
		String exppage6Row6List = "[A1, D2, A1, A1]";

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
		String expAllDatapage6 = "[D2 [D402], VendorACC [VAC001]]";

		System.out.println("actAllDatapage6"+actAllDatapage6);
		System.out.println("expAllDatapage6"+expAllDatapage6);
		
		
		
		
		String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;
		
		Thread.sleep(1500);
		
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
		
		Thread.sleep(2500);
		
		
		
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
				 
				 
				/* && actpage4Row2List.equalsIgnoreCase(exppage4Row2List)
				 && actpage4Row3List.equalsIgnoreCase(exppage4Row3List) && actpage4Row4List.equalsIgnoreCase(exppage4Row4List)
				 && actpage4Row5List.equalsIgnoreCase(exppage4Row5List) && actpage4Row6List.equalsIgnoreCase(exppage4Row6List)*/
				 
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
		
		Thread.sleep(3500);
		File Efile=new File(getBaseDir()+"\\autoIt\\ExportFiles\\LedgerPDF.pdf");
		
		if(Efile.exists())
		{
			Efile.delete();
		}
		
		Thread.sleep(2500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
		sl_ReportPrintBtn.click();
		
		Thread.sleep(2500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ss_ReportPrintLabel));
        
        String actConfirmMsg=ss_ReportPrintMsg.getText();
        String expConfirmMsg="";
        Thread.sleep(1500);
        
        System.out.println("Actual Msg                :                "+        actConfirmMsg                + "Expected                "        +        expConfirmMsg);
        
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ss_ReportPrintYesBtn));
        ss_ReportPrintYesBtn.click();
        
        Thread.sleep(9999);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2500);
			
		Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\LedgerPrintSaving.exe");
		
		Thread.sleep(2500);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2500);
		
		ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
			
		int actOpenWindowsCount = getDriver().getWindowHandles().size();
		int expOpenWindowsCount = 3;
		
		System.out.println("Number of Windows  : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
		
		Thread.sleep(2500);

	 	/*getDriver().switchTo().window(openTabs.get(2)).close();
	 	Thread.sleep(1000);
	 	getDriver().switchTo().window(openTabs.get(1)).close();
	 	Thread.sleep(1000);
	 	getDriver().switchTo().window(openTabs.get(0));*/
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(2500);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(4500);
	 	
	 	
	 	String actPDF = getBaseDir()+"\\autoIt\\ExportFiles\\LedgerPDF.pdf";
		String expPDF = getBaseDir()+"\\autoIt\\ImportFiles\\LedgerPDF.pdf";
		
		Thread.sleep(2500);
		
		PDFUtil pdfutil = new PDFUtil();
		
		boolean result = pdfutil.compare(actPDF, expPDF);
		Thread.sleep(2500);
		
		String actData = pdfutil.getText(actPDF);
		String expData = pdfutil.getText(expPDF).replaceAll("25/10/2022", getCurrentDateF2());
		Thread.sleep(2500);
		
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
	
	
	
	@FindBy(xpath = "//td[text()='Opening Balances Control A/C [OBC]']")
	public static WebElement ledgerFilterAccName;
	
	public static boolean checkFilterOptionInLedger() throws InterruptedException
	{
		Thread.sleep(2500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterExpandBtn));
		report_FilterExpandBtn.click();
		Thread.sleep(2500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
		report_FilterBtn.click();
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
		report_FilterCustomizeBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterAccountExpansion));
		report_FilterAccountExpansion.click();
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterAccountNameChkbox));
		
		if (report_FilterAccountNameChkboxSelected.isSelected()==false) 
		{
			report_FilterAccountNameChkbox.click();
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reports_Filter_Customize_OkBtn));
		reports_Filter_Customize_OkBtn.click();
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc_DefaultFilterTxt));
		acc_DefaultFilterTxt.click();
		acc_DefaultFilterTxt.sendKeys("B");
		
		Thread.sleep(2500);
		
		acc_DefaultFilterTxt.sendKeys(Keys.TAB);
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterOkBtn));
		report_FilterOkBtn.click();
		
		Thread.sleep(1500);
		
		IsVisible( ledgerFilterAccName);
		Thread.sleep(1500);
		
		
		int RowCount = reportsCol3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=1;i<RowCount;i++)
		{
			String data = reportsCol3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[H1, H1, H1, H1, H2, H2, H2, H2, CustomerACC, CustomerACC, CustomerACC, CustomerACC]";
		
		System.out.println("actRow1List"+actRow3List);
		System.out.println("expRow1List"+expRow3List);
		
		int count1=stockLedgerTable.size();	
		HashSet<String> AllDatapage1 = new HashSet<String>();
		 int count=stockLedgerTable.size();
		 
		  System.err.println(count);
		 
		  for(int i=0 ; i < count ;i++) {
			  String style=
		  stockLedgerTable.get(i).getAttribute("style");
			  if(style.contains("overflow: visible; font-weight: bold; background-color:"))
			  { 
				  String data=stockLedgerTable.get(i).getText();
				  AllDatapage1.add(data); 
			  } 
		  }
		  
		  Set<String> expAllDatapage1 = Set.of("Opening Balances Control A/C [OBC]", "H2 [H802]", "B1 [B201]", "B2 [B202]", "D2 [D402]");
		 
		 
		  System.out.println("actAllDatapage1"+AllDatapage1);
		  System.out.println("expAllDatapage1"+expAllDatapage1);
		
		Thread.sleep(1500);
		report_NextBtn.click();
		Thread.sleep(2500);
		
		/*String beforePath="//table[@class='CommonReportTable']//tbody//tr[";
		String afterPath="]//td[2]";
		int k;
		
		Thread.sleep(1500);
		
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
		}*/
		
		int reportsLastRowCount = reportsLastRowList.size();
		ArrayList<String> lastRow = new ArrayList<String>();
		for(int i=1;i<reportsLastRowCount;i++)
		{
			String data = reportsLastRowList.get(i).getText();
			lastRow.add(data);
		}
		
		String actRow1List = lastRow.toString();
		String expRow1List = "[Grand Total, , , , , , 4.00, 4.00, , , , , 4.00, 4.00, , ]";
		
		System.out.println("actRow1List"+actRow1List);
		System.out.println("expRow1List"+expRow1List);
		
		
		if (AllDatapage1.equals(expAllDatapage1) && actRow1List.equalsIgnoreCase(expRow1List)) 
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
		Thread.sleep(1500);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledgerDetail));
		ledgerDetail.click();
		
		
		

		Thread.sleep(1500);
		IsVisible(Ledger1stItem);
		Thread.sleep(1500);
		
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);


		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(1500);
		
		Thread.sleep(3500);

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
		String expRow2List = "[PurVou : 9, Rct : 1, Pmt : 1, SalInv : 2, SalInv : 3, SalInv : 1, SalInv : 5]";

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
		String expRow3List = "[A1, CustomerACC, H2, E1, E2, E1, F2]";

		
		System.out.println("Actaul Account  :"+actRow3List);
		System.out.println("Expected Account:"+expRow3List);
		
		Thread.sleep(1500);

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
		String expRow4List = "[Purchases Vouchers, Receipts, Payments, Sales Invoices, Sales Invoices, Sales Invoices, Sales Invoices]";

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
		String expAllDatapage1 = "[BankACC [BAC001], CashACC [CASH001], H1 [H801]]";

		System.out.println("actAllDatapage1"+actAllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);
		
		Thread.sleep(1500);
		report_NextBtn.click();
		Thread.sleep(1500);
		
		
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
		String expPage2Row2List = "[Pmt : 1, SalInv : 6, CreNts : 1, Rct : 1, SalInv : 4, NJv : 1, SalRet : 1]";

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
		String expPage2Row3List = "[H2, SalesACC, H2, CustomerACC, F1, CustomerACC]";

		
		System.out.println("Actaul Account  :"+actPage2Row3List);
		System.out.println("Expected Account:"+expPage2Row3List);
		
		Thread.sleep(1500);

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
		String expPage2Row4List = "[Opening Balance, BankACC, SalesACC, B2, Opening Balance, BankACC, F1, Opening Balance, E1]";

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
		String expAllDatapage2 = "[H2 [H802], CustomerACC [CAC001], PurchaseACC [PAC001]]";

		System.out.println("actAllDatapage2"+actAllDatapage2);
		System.out.println("expAllDatapage2"+expAllDatapage2);
		
		Thread.sleep(1500);
		report_NextBtn.click();
		Thread.sleep(2500);
		System.out.println("*************************Printing page 2 data done*********************************");


		try{
			if(pageNum.getText().equalsIgnoreCase("5")/* || pageNum.getText().equalsIgnoreCase("4")*/)
					{
				report_PrevBtn.click();
				Thread.sleep(1500);
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
		Thread.sleep(1500);
		report_PrevBtn.click();
		Thread.sleep(1500);
		report_PrevBtn.click();
			}
	
			System.out.println("Exception "+e);

		}
		
		Thread.sleep(2500);

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
		String exppage3Row2List = "[PurVou : 1, PurVou : 3, PurVou : 9, PurRet : 1, PurVou : 10, CreNts : 1, NJv : 1]";

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
		String exppage3Row3List = "[A1, A1, A1, A1, B2, H2, VendorACC]";

		
		System.out.println("Actaul Account  :"+actpage3Row3List);
		System.out.println("Expected Account:"+exppage3Row3List);
		
		Thread.sleep(1500);

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
		String exppage3Row4List = "[Opening Balance, D1, VendorACC, Vendor A, BankACC, D2, Opening Balance, D2, H2, Opening Balance, H2]";

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
		String expAllDatapage3 = "[A1 [A101], B2 [B202]]";

		System.out.println("actAllDatapage3"+actAllDatapage3);
		System.out.println("expAllDatapage3"+expAllDatapage3);
		
		
		System.out.println("*************************Printing page 3 data done*********************************");

		Thread.sleep(1500);
		report_NextBtn.click();
		Thread.sleep(2500);
		
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
		Thread.sleep(1500);
		report_PrevBtn.click();
			}
			System.out.println("Exception "+e);
			
			

		}
		
		Thread.sleep(2500);
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
		String exppage4Row2List = "[NJv : 1, SalInv : 1, SalInv : 2, SalRet : 1, SalInv : 3, DebNts : 1, SalInv : 4]";

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
		String exppage4Row3List = "[SalesACC [SAC001], CustomerACC, E1, E1, E1, E2, D2, F1]";

		
		System.out.println("Actaul Account  :"+actpage4Row3List);
		System.out.println("Expected Account:"+exppage4Row3List);
		
		Thread.sleep(1500);

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
		String exppage4Row4List = "[CustomerACC, Opening Balance, H1, BankACC, H1, Opening Balance, CashACC, D2, Opening Balance]";

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
		String expAllDatapage4 = "[SalesACC [SAC001], E1 [E501], E2 [E502], F1 [F601]]";

		System.out.println("actAllDatapage4"+actAllDatapage4);
		System.out.println("expAllDatapage4"+expAllDatapage4);
		
		System.out.println("*************************Printing page 4 data done*********************************");

		Thread.sleep(1500);
		report_NextBtn.click();
		Thread.sleep(2500);
		
		
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
		
		Thread.sleep(2500);

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
		String exppage5Row2List = "[]";

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
		String exppage5Row3List = "[]";

		
		System.out.println("Actaul Account  :"+actpage5Row3List);
		System.out.println("Expected Account:"+exppage5Row3List);
		
		Thread.sleep(1500);

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
		String exppage5Row4List = "[Opening Balance]";

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
		String expAllDatapage5 = "[Opening Balances Control A/C [OBC]]";

		System.out.println("actAllDatapage5"+actAllDatapage5);
		System.out.println("expAllDatapage5"+expAllDatapage5);

		Thread.sleep(1500);
		report_NextBtn.click();
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(2900);
		

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
		String exppage6Row2List = "[]";

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
		String exppage6Row3List = "[Opening Balance]";

		
		System.out.println("Actaul Account  :"+actpage6Row3List);
		System.out.println("Expected Account:"+exppage6Row3List);
		
		Thread.sleep(1500);

	
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
		String exppage6Row5List = "[Opening Balance]";

		System.out.println("Actual Department  :"+actpage6Row5List);
		System.out.println("Expected Department:"+exppage6Row5List);
		
		Thread.sleep(2500);
		
		
		int reportsLastRowCount = reportsLastRowList.size();
		ArrayList<String> lastRow = new ArrayList<String>();
		for(int i=1;i<reportsLastRowCount;i++)
		{
			String data = reportsLastRowList.get(i).getText();
			lastRow.add(data);
		}
		
		
		String actRow1List = lastRow.toString();
		String expRow1List = "[Grand Total, , , , , 77.00, 77.00, , 59.00, 59.00, , 77.00, 77.00, ]";
		
		System.out.println("actRow1List"+actRow1List);
		System.out.println("expRow1List"+expRow1List);
		

		
		if (actAllDatapage1.equalsIgnoreCase(expAllDatapage1) &&  actAllDatapage2.equalsIgnoreCase(expAllDatapage2) &&
				 actAllDatapage3.equalsIgnoreCase(expAllDatapage3) /*&&  actAllDatapage4.equalsIgnoreCase(expAllDatapage4)
				 &&  actAllDatapage5.equalsIgnoreCase(expAllDatapage5)*/&& actRow1List.equalsIgnoreCase(expRow1List) /*&& actRow2List.equalsIgnoreCase(expRow2List)
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
				 && actpage6Row3List.equalsIgnoreCase(exppage6Row3List) && actpage6Row5List.equalsIgnoreCase(exppage6Row5List)*/
				)
				 
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
		
	
	}

	@FindBy(xpath="//td[text()='VendorACC VAC001']")
	public static WebElement  subLedgerVendorAcc;

	public static boolean checkSubLedgerReport() throws InterruptedException
	{
		

		searchBtnInput.click();
		searchBtnInput.sendKeys("sub ledger");
		Thread.sleep(1500);
		searchBtnInput.sendKeys(Keys.ENTER);
		
		Thread.sleep(1500);
		Thread.sleep(1500);

		
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);
		ClickUsingJs(reportaccountTxt);
		Thread.sleep(1200);		
		reportaccountTxt.sendKeys("CustomerACC");
		
		Thread.sleep(2500);	
		
		reportaccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2500);	
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);
		


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
		
		Thread.sleep(1500);
		
		
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);
		
		
		ClickUsingJs(reportaccountTxt);
		Thread.sleep(1500);
		reportaccountTxt.sendKeys("CashACC");
		Thread.sleep(1500);		
			
		reportaccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(1500);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
	
		Thread.sleep(1500);
		IsVisible(closingBalance);
		
		Thread.sleep(1500);
		

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
		Thread.sleep(1500);
		
		getDriver().navigate().refresh();
		
		searchBtnInput.click();
		searchBtnInput.sendKeys("Bank Book");
		Thread.sleep(1500);
		searchBtnInput.sendKeys(Keys.ENTER);
		
		Thread.sleep(1500);
		
		
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		ClickUsingJs(reportaccountTxt);
		Thread.sleep(1500);
		reportaccountTxt.sendKeys("BankACC");
		Thread.sleep(1500);		
		
		reportaccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(1500);
		IsVisible(closingBalance);
		
		Thread.sleep(1500);
		

		


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
		
		Thread.sleep(1500);
		
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);
		
		ClickUsingJs(reportaccountTxt);
		Thread.sleep(1000);
		reportaccountTxt.sendKeys("CashACC");
		Thread.sleep(1500);
		
		
		
		reportaccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(1500);
		IsVisible(closingBalance);
		Thread.sleep(1500);


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
		String expRow2List = "[25/07/2022, SalInv : 3, E2, 1.00, 2.00, 1.00, 2.00]";



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
		String expRow3List = "[Total, 2.00, 2.00, 2.00, 2.00]";



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
		String expRow4List = "[Closing balance, 2.00, 2.00]";
		
		
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
		
		Thread.sleep(2500);
	
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(1500);
		
		int reportsRow1ListCount = reportsCol1List.size();
		
		HashSet<String> reportsRow1ListArray = new HashSet<String>();
		
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
		
		 Set<String> expRow1List = Set.of("31-03-2022", "OpeBal : 1", "21-07-2022", "PurVou : 1", "PurVou : 1", "PurVou : 2", "PurVou : 2", "PurVou : 3", "PurVou : 3", "PurVou : 9", "PurVou : 9", "SalInv : 1", "SalInv : 1");

		String actRow1List = reportsRow1ListArray.toString();
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		Thread.sleep(1500);
		
		int reportsRow2ListCount = reportsCol2List.size();
		HashSet<String> reportsRow2ListArray = new HashSet<String>();
		for(int i=0;i<reportsRow2ListCount;i++)
		{
			String data = reportsCol2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow2ListArray.add(data);
			}
			
		}
		
		 Set<String> expRow2List = Set.of("Opening Balance", "Opening Balances Control A/C", "A1", "D1", "VendorACC", "Purchase", "Vendor A", "A1", "A1", "BankACC", "E1", "H1");

		String actRow2List = reportsRow2ListArray.toString();
		
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
		String expAllDatapage1 = "[31-03-2022]";

		System.out.println("actAllDatapage1"+actAllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);
		
		Thread.sleep(1500);
		report_NextBtn.click();
		Thread.sleep(2500);
		
		
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
		
		Thread.sleep(2500);
		
		int reportspage2Row1ListCount = reportsCol1List.size();
		HashSet<String> reportspage2Row1ListArray = new HashSet<String>();
		for(int i=0;i<reportspage2Row1ListCount;i++)
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
		
		
		 Set<String> exppage2Row1List = Set.of("22-07-2022", "Rct : 1", "Rct : 1", "25-07-2022", "SalInv : 2", "SalInv : 2", "SalInv : 3", "SalInv : 3", "SalInv : 4", "SalInv : 4", "SalInv : 5", "SalInv : 5", "SalInv : 6", "SalInv : 6");
		 String actpage2Row1List = reportspage2Row1ListArray.toString();
		
		System.out.println(actpage2Row1List);
		System.out.println(exppage2Row1List);
		
		Thread.sleep(1500);
		
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
		String exppage2Row2List = "[BankACC, CustomerACC, E1, BankACC, CashACC, E2, F1, CustomerACC, H1, F2, SalesACC, H2]";
		
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
		String expAllDatapage2 = "[21-07-2022]";

		System.out.println("actAllDatapage2"+actAllDatapage2);
		System.out.println("expAllDatapage2"+expAllDatapage2);
		
		Thread.sleep(1500);
		report_NextBtn.click();
		Thread.sleep(1500);
		
		Thread.sleep(1500);
		
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
		String exppage3Row1List = "[DebNts : 1, DebNts : 1, Grand Total]";
		
		System.out.println(actpage3Row1List);
		System.out.println(exppage3Row1List);
		
		Thread.sleep(1500);
		
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
		String exppage3Row2List = "[E2, D2]";
		
		System.out.println(actpage3Row2List);
		System.out.println(exppage3Row2List);
		
		
		System.out.println("*************************Printing page 3 data done*********************************");

		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);

		int reportsLastRowCount = reportsLastRowList.size();
		ArrayList<String> lastRow = new ArrayList<String>();
		for(int i=1;i<reportsLastRowCount;i++)
		{
			String data = reportsLastRowList.get(i).getText();
			lastRow.add(data);
		}
		
		
		String actRowList = lastRow.toString();
		String expRowList = "[Grand Total, , , , 1.00, 2.00, 73.00, 76.00, 96.00, 60.00, 96.00, 60.00, 78.00, 60.00]";
		
		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);
		
		if (actRow1List.equals(expRow1List) && actRow2List.equals(expRow2List) 
				&& actpage2Row1List.equals(exppage2Row1List) && actpage2Row2List.equalsIgnoreCase(exppage2Row2List) 
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
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(virtualBankLedgerReport));
		virtualBankLedgerReport.click();
		
		
		Thread.sleep(1500);
		IsVisible(Ledger1stItem);
		Thread.sleep(1500);
		
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);

		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);

		Thread.sleep(1500);
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
		
		Thread.sleep(1500);
		
		int reportsLastRowCount = reportsLastRowList.size();
		ArrayList<String> lastRow = new ArrayList<String>();
		for(int i=1;i<reportsLastRowCount;i++)
		{
			String data = reportsLastRowList.get(i).getText();
			lastRow.add(data);
		}
		
		String actRowList = lastRow.toString();
		String expRowList = "[Grand Total, 5.00, 2.00, 6.00, , , , 5.00, 2.00, 6.00, , , ]";
		
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
		
		Thread.sleep(1500);
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(1500);
		
		ClickUsingJs(reportaccountTxt1);
		Thread.sleep(1000);
		reportaccountTxt1.sendKeys("E");
		Thread.sleep(1500);
		
		
		reportaccountTxt1.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);
		
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
		
	
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
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
	
	public static boolean checkSalesSummaryRegisterReport() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReportsMenu));
		salesReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(summarySalesBookReport));
		summarySalesBookReport.click();
		
		Thread.sleep(1500);
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);
		
		ClickUsingJs(reportaccountTxt1);
		Thread.sleep(1000);
		reportaccountTxt1.sendKeys("E");
		Thread.sleep(1900);
		
		
		reportaccountTxt1.sendKeys(Keys.TAB);
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);
		
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
	
	public static boolean checkMonthlySalesReport() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReportsMenu));
		salesReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(monthlySalesBookReport));
		monthlySalesBookReport.click();
		
		Thread.sleep(1500);
		
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(1500);
		
		ClickUsingJs(reportaccountTxt);
		Thread.sleep(1500);
		
		reportaccountTxt.sendKeys("E");
		Thread.sleep(1500);
		
		reportaccountTxt.sendKeys(Keys.TAB);
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
	
	public static boolean checkTopCustomersReports() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReportsMenu));
		salesReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(topCustomersListReport));
		topCustomersListReport.click();
		
		Thread.sleep(1500);
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);
		ClickUsingJs(reportaccountTxt);
		Thread.sleep(1500);
		reportaccountTxt.sendKeys("E1");
		Thread.sleep(1500);
		
		
		
		reportaccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);
		
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
	
	public static boolean checkTopCustomersReportsForGroupAccount() throws InterruptedException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReportsMenu));
		salesReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(topCustomersListReport));
		topCustomersListReport.click();

		Thread.sleep(1500);
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);

		ClickUsingJs(reportaccountTxt);
		Thread.sleep(1500);
		reportaccountTxt.sendKeys("E");
		Thread.sleep(1500);

		
		reportaccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);

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
		
		Thread.sleep(3000);
		
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);
		ClickUsingJs(reportaccountTxt1);
		Thread.sleep(1000);
		reportaccountTxt1.sendKeys("D");
		Thread.sleep(1500);	
		
		reportaccountTxt1.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);

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
		String expRow5List = "[21/07/2022, PurVou : 1, D1, 1.00, C1, 1.00, 1.00]";
		

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
		String expRow6List = "[21/07/2022, PurVou : 1, D1, 1.00, C2, 1.00, 1.00]";
		
		
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
		
		Thread.sleep(1500);
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);
		
		ClickUsingJs(reportaccountTxt1);
		Thread.sleep(1000);
		reportaccountTxt1.sendKeys("A");
		Thread.sleep(1500);
		
		reportaccountTxt1.sendKeys(Keys.TAB);
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);
		

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
	
	public static boolean checkSummaryPurchaseRegister() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseReportsMenu));
		purchaseReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(summaryPurchaseBookReport));
		summaryPurchaseBookReport.click();
		
		Thread.sleep(1500);
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);
		
		ClickUsingJs(reportaccountTxt1);
		Thread.sleep(1000);
		reportaccountTxt1.sendKeys("A");
		Thread.sleep(1500);
		
		
		reportaccountTxt1.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);
		
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
		
		Thread.sleep(1500);
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		//IsVisible(grandTotalTxt);
		Thread.sleep(3500);
		
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
		String expRow1List = "[OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1]";

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
		String expRow2List = "[A1, A2, B1, B2, BankACC, CashACC, CustomerACC, D2, D1, E1, E2, F1, F2, H1, H2, PurchaseACC]";

		System.out.println("Actaul Voucher  :"+actRow2List);
		System.out.println("Expected Voucher:"+expRow2List);
		
		Thread.sleep(2500);
		report_NextBtn.click();
		Thread.sleep(3500);
		
		
		int reportsLastRowCount = reportsLastRowList.size();
		ArrayList<String> lastRow = new ArrayList<String>();
		for(int i=1;i<reportsLastRowCount;i++)
		{
			String data = reportsLastRowList.get(i).getText();
			lastRow.add(data);
		}
		
		String actList = lastRow.toString();
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
		
		Thread.sleep(1500);
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);
		

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
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditNoteRegisterReport));
		creditNoteRegisterReport.click();
		
		Thread.sleep(1500);
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);
		

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
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitNoteRegisterReport));
		debitNoteRegisterReport.click();
		
		Thread.sleep(1500);
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(1500);
		

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
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsRegisterReport));
		receiptsRegisterReport.click();
		
		Thread.sleep(1500);
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);
		

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
	
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(paymentRegisterReport));
		paymentRegisterReport.click();
		
			
		Thread.sleep(1500);
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);
		

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

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		Thread.sleep(1500);
		ClickUsingJs(pdcReceiptsRegisterReport);
		
		Thread.sleep(1500);
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(3500);
		
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
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		Thread.sleep(1500);
		
		ClickUsingJs(pdcPaymentsRegisterReport);
		
		
		Thread.sleep(1500);
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(3500);
		
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
		Thread.sleep(1500);
		getDriver().navigate().refresh();
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		Thread.sleep(1500);
		ClickUsingJs(entryJournalRegisterReport);		
		Thread.sleep(1500);
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(1500);
		Thread.sleep(3500);

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
		String expRow2List = "[OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1]";

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
		String expRow3List = "[Opening Balances Control A/C, F2, CashACC, B1, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, D2, Opening Balances Control A/C, PurchaseACC, H2, H1, Opening Balances Control A/C, Opening Balances Control A/C, E2]";

		
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
		Thread.sleep(2500);
		
		System.out.println(" PAGE NO 2");
		
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
		String exppage2row2List = "[OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1]";

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
		String exppage2row3List = "[SalesACC, Opening Balances Control A/C, E1, BankACC, VendorACC, A2, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, CustomerACC, B2, Opening Balances Control A/C, F1, Opening Balances Control A/C, A1]";

		
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
		
	
		Thread.sleep(3500);
		System.out.println(" PAGE NO 3");
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
		String exppage3row2List = "[OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, PurVou : 1, PurVou : 1, PurVou : 2, PurVou : 2, PurVou : 3, PurVou : 3, PurVou : 9, PurVou : 9, SalInv : 1, SalInv : 1, Rct : 1, Rct : 1]";

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
		String exppage3row3List = "[D1, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, A1, D1, Purchase, VendorACC, A1, Vendor A, A1, BankACC, E1, H1, BankACC, CustomerACC]";

		
		System.out.println("Actaul Account  :"+actpage3row3List);
		System.out.println("Expected Account:"+exppage3row3List);
		
		Thread.sleep(2500);
		report_NextBtn.click();
		Thread.sleep(3500);
		
		System.out.println(" PAGE NO 4");
		
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
		String exppage4row2List = "[Pmt : 1, Pmt : 1, SalInv : 2, SalInv : 2, SalInv : 3, SalInv : 3, SalInv : 4, SalInv : 4, SalInv : 5, SalInv : 5, SalInv : 6, SalInv : 6, PurVou : 10, PurVou : 10, NJv : 1, NJv : 1]";

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
		String exppage4row3List = "[BankACC, H2, BankACC, E1, E2, CashACC, CustomerACC, F1, H1, F2, SalesACC, H2, B2, D2, PurchaseACC, VendorACC]";

		
		System.out.println("Actaul Account  :"+actpage4row3List);
		System.out.println("Expected Account:"+exppage4row3List);
		
		Thread.sleep(2500);
		report_NextBtn.click();
		
		Thread.sleep(2500);
		System.out.println(" PAGE NO 5");
		

		int reportsLastRowCount = reportsLastRowList.size();
		ArrayList<String> lastRow = new ArrayList<String>();
		for(int i=1;i<reportsLastRowCount;i++)
		{
			String data = reportsLastRowList.get(i).getText();
			lastRow.add(data);
		}
		
		
		String actList = lastRow.toString();
		String expList = "[Grand Total, , , 78.00, 78.00, , , 78.00, 78.00, , 78.00, 78.00, ]";
		
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

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		Thread.sleep(1500);
		ClickUsingJs(entryJournalDetailReport);
		
		Thread.sleep(1500);
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(1500);

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
		String expRow1List = "[OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1]";

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
		String expRow3List = "[A1, A2, B1, B2, BankACC, CashACC, CustomerACC, D2]";

		
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
		String expRow4List = "[Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C]";

		
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
		String exppage2row1List = "[OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1]";

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
		String exppage2row3List = "[D1, E1, E2, F1, F2, H1, H2, PurchaseACC]";

		
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
		String exppage2row4List = "[Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C, Opening Balances Control A/C]";

		
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
		String exppage3row1List = "[OpeBal : 1, OpeBal : 1, OpeBal : 1, OpeBal : 1, PurVou : 1, PurVou : 1, PurVou : 2, PurVou : 2, PurVou : 3, PurVou : 3, PurVou : 9, PurVou : 9, SalInv : 1, SalInv : 1, Rct : 1, Rct : 1]";

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
		String exppage3row3List = "[SalesACC, VendorACC, A1, Purchase, A1, A1, H1, BankACC]";

		
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
		String exppage3row4List = "[Opening Balances Control A/C, Opening Balances Control A/C, D1, VendorACC, Vendor A, BankACC, E1, CustomerACC]";

		
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
		String exppage4row1List = "[SalInv : 2, SalInv : 2, SalInv : 3, SalInv : 3, SalInv : 4, SalInv : 4, SalInv : 5, SalInv : 5, SalInv : 6, SalInv : 6, PurVou : 10, PurVou : 10, Pmt : 1, Pmt : 1, SalRet : 1, SalRet : 1]";

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
		String exppage4row3List = "[BankACC, CashACC, CustomerACC, H1, H2, B2, H2, E1]";

		
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
		String exppage4row4List = "[E1, E2, F1, F2, SalesACC, D2, BankACC, H1]";

		
		System.out.println("Actaul Account  :"+actpage4row4List);
		System.out.println("Expected Account:"+exppage4row4List);
		
		Thread.sleep(2500);
		report_NextBtn.click();
		Thread.sleep(2500);

		int reportsLastRowCount = reportsLastRowList.size();
		ArrayList<String> lastRow = new ArrayList<String>();
		for(int i=1;i<reportsLastRowCount;i++)
		{
			String data = reportsLastRowList.get(i).getText();
			lastRow.add(data);
		}
		
		
		String actList = lastRow.toString();
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
		
		Thread.sleep(1500);
		ClickUsingJs(salesGroupedByCustomerReport);
		
		Thread.sleep(1500);
	
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);
		
		ClickUsingJs(reportaccountTxt1);
		Thread.sleep(1500);
		reportaccountTxt1.sendKeys("E");
		Thread.sleep(1500);
		
		
		reportaccountTxt1.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);
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

		Thread.sleep(1500);

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
		
		Thread.sleep(1500);

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
		
		Thread.sleep(1500);
		ClickUsingJs(salesGroupedByProductReport);
		
		Thread.sleep(1500);
		
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);		
		ClickUsingJs(reportaccountTxt1);
		Thread.sleep(1000);
		reportaccountTxt1.sendKeys("E");
		Thread.sleep(1500);
		
		
		reportaccountTxt1.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);
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

		Thread.sleep(1500);

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
		
		Thread.sleep(1500);

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
		
		Thread.sleep(1500);
		ClickUsingJs(salesGroupedByDepartmentReport);
	
		Thread.sleep(1500);
	
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);
		ClickUsingJs(reportaccountTxt1);
		Thread.sleep(1000);
		reportaccountTxt1.sendKeys("E");
		Thread.sleep(1500);
		
		
		
		reportaccountTxt1.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		
		Thread.sleep(1500);
		


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
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAndPurchasesReportMenu));
		salesAndPurchasesReportMenu.click();
		

		Thread.sleep(1500);
		ClickUsingJs(purchasesGroupedByVendorReport);


		Thread.sleep(1500);

		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);
		ClickUsingJs(reportaccountTxt1);
		Thread.sleep(1000);
		reportaccountTxt1.sendKeys("A");
		Thread.sleep(1500);

		
		reportaccountTxt1.sendKeys(Keys.TAB);
		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(1500);
		//IsVisible(grandTotalTxt);
		Thread.sleep(1500);
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

		Thread.sleep(1500);

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
		
		Thread.sleep(1500);

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
		Thread.sleep(1500);
		getDriver().navigate().refresh();
		Thread.sleep(1500);

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAndPurchasesReportMenu));
		salesAndPurchasesReportMenu.click();


		Thread.sleep(1500);
		ClickUsingJs(purchasesGroupedByProductReport);


		Thread.sleep(1500);

		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);

		ClickUsingJs(reportaccountTxt1);
		Thread.sleep(1000);
		reportaccountTxt1.sendKeys("A");
		Thread.sleep(1500);

		
		reportaccountTxt1.sendKeys(Keys.TAB);

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		//IsVisible(grandTotalTxt);
		Thread.sleep(1500);
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
		String expRow1List = "[A1, A1, A1, A2, APPLE, B1, B2, D1, D2]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(1500);

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
		String expRow2List = "[BankACC, D1, Vendor A, D1, D1, D1, D1, D1, D1]";

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
		String expRow3List = "[1.00, 1.00, 1.00, 3.00, 1.00, 1.00, 10.00, 10.00, 1.00, 1.00, 1.00, 1.00, 10.00, 10.00, 1.00]";


		System.out.println("Actaul Account  :"+actRow3List);
		System.out.println("Expected Account:"+expRow3List);

		Thread.sleep(1500);

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
		String expRow4List = "[1.00, 1.00, 1.00, 3.00, 1.00, 1.00, 10.00, 10.00, 1.00, 1.00, 1.00, 1.00, 10.00, 10.00, 1.00]";

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
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAndPurchasesReportMenu));
		salesAndPurchasesReportMenu.click();
		

		Thread.sleep(1500);
		ClickUsingJs(purchasesGroupedByDepartmentReport);


		Thread.sleep(1500);

	
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);

		ClickUsingJs(reportaccountTxt1);
		Thread.sleep(1500);
		reportaccountTxt1.sendKeys("A");
		Thread.sleep(1500);

		
		reportaccountTxt1.sendKeys(Keys.TAB);

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();

		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);
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

		Thread.sleep(1500);

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

		Thread.sleep(1500);

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
		
		Thread.sleep(1500);
		getDriver().navigate().refresh();
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MiscellaneousAnalysisReportMenu));
		MiscellaneousAnalysisReportMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(peakAndLowBalancesReport));
		peakAndLowBalancesReport.click();
		
		Thread.sleep(1500);
		IsVisible(Ledger1stItem);
		Thread.sleep(1500);
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);	
	
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(1500);

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);
		
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
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MiscellaneousAnalysisReportMenu));
		MiscellaneousAnalysisReportMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(comprativeAnalysisReport));
		comprativeAnalysisReport.click();
		
		Thread.sleep(1500);
		
		Thread.sleep(1500);
		IsVisible(Ledger1stItem);
		Thread.sleep(1500);
		
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);
		
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(1500);

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);


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
		
		Thread.sleep(1500);
		
		Thread.sleep(1500);
		IsVisible(Ledger1stItem);
		Thread.sleep(1500);
		
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(3500);
		

		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(1500);
		
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
		Thread.sleep(1500);
		getDriver().navigate().refresh();
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		Thread.sleep(1500);
		ClickUsingJs(MiscellaneousAnalysisReportMenu);		
		Thread.sleep(1500);
		ClickUsingJs(abcAnalysisReport);		
		Thread.sleep(3500);
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(1500);
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);		
		
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);

		
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(2500);
				
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
		Thread.sleep(1500);
		getDriver().navigate().refresh();
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		Thread.sleep(1500);
		ClickUsingJs(MiscellaneousAnalysisReportMenu);
		Thread.sleep(1500);
		ClickUsingJs(interestCalculationReport);
		Thread.sleep(1500);
		
		
		
		Thread.sleep(1500);
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(1500);
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(1500);
				
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		

		Thread.sleep(1500);
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
		String expRow1List = "[Opening Balances Control A/C, PurchaseACC, VendorACC, SalesACC, CustomerACC, A1, A2, B1, B2, D1, D2, E1, E2, F1, F2, H1]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(1500);

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
		String expRow2List = "[8.79, 0.06, 0.58, 0.47, 1.11, 18.63, 0.59, 0.59, 0.59, 16.92, 0.06, 3.74, 0.59, 0.06, 0.06, 2.57]";

		System.out.println("Actaul Voucher  :"+actRow2List);
		System.out.println("Expected Voucher:"+expRow2List);

		Thread.sleep(1500);
		
		report_NextBtn.click();
		Thread.sleep(1500);
		

		int reportsLastRowCount = reportsLastRowList.size();
		ArrayList<String> lastRow = new ArrayList<String>();
		for(int i=1;i<reportsLastRowCount;i++)
		{
			String data = reportsLastRowList.get(i).getText();
			lastRow.add(data);
		}
		
		
		String actList = lastRow.toString();
		String expList = "[Grand Total, 1.76]";
		
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
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		//Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersInformationMenu));
		mastersInformationMenu.click();
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterInfoMenu));
		masterInfoMenu.click();
	
		Thread.sleep(1500);
		
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);

				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

		Thread.sleep(1500);
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
		String expRow1List = "[BankACC, CashACC, Opening Balances Control A/C, H, H1, H2, CustomerACC, PurchaseACC, A, A1, A2, B, B1, B2, SalesACC, E]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(1500);
		
		report_NextBtn.click();
		Thread.sleep(1500);
		
		Thread.sleep(1500);
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
		String exppage2Row1List = "[E1, E2, F, F1, F2, D, D1, D2, VendorACC]";

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
		
		Thread.sleep(1500);
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(1500);
		
		boolean actdocumentTxt    					=documentTxt.isDisplayed();
		boolean actlayoutTxt						=layoutTxt.isDisplayed();
		boolean actdocumentRadioBtn					=documentRadioBtn.isDisplayed();
		boolean actitemRadioBtn					    =itemRadioBtn.isDisplayed();
		
		
		/*boolean actpl_printBtn       = pl_printBtn.isDisplayed();
		boolean actpl_CloseBtn       = pl_CloseBtn.isDisplayed();*/
		
		
		// Expected
		
		boolean expdocumentTxt    					=true;
		boolean explayoutTxt						=true;
		boolean expdocumentRadioBtn					=true;
		boolean expitemRadioBtn					    =true;
		
	
		/*boolean exppl_printBtn       = true;
		boolean exppl_CloseBtn       = true;*/
		
		System.out.println("************************************checkProductLabelOptions******************************************");
		
		System.out.println("documentTxt     		 	:   "+actdocumentTxt			+" Value Expected : "+expdocumentTxt);
		System.out.println("layoutTxt     		 		:   "+actlayoutTxt				+" Value Expected : "+explayoutTxt);
		System.out.println("documentRadioBtn     		:   "+actdocumentRadioBtn		+" Value Expected : "+expdocumentRadioBtn);
		System.out.println("itemRadioBtn     		 	:   "+actitemRadioBtn			+" Value Expected : "+expitemRadioBtn);
		
		//System.out.println("pl_previewBtn     		 	:   "+actpl_previewBtn			+" Value Expected : "+exppl_previewBtn);
		//System.out.println("pl_printBtn     		 	:   "+actpl_printBtn			+" Value Expected : "+exppl_printBtn);
		//System.out.println("pl_CloseBtn     		 	:   "+actpl_CloseBtn			+" Value Expected : "+exppl_CloseBtn);
		
		boolean actMethod=actdocumentTxt==expdocumentTxt && actlayoutTxt==explayoutTxt && actdocumentRadioBtn==expdocumentRadioBtn && actitemRadioBtn==expitemRadioBtn
				/*&& actpl_printBtn==exppl_printBtn && actpl_CloseBtn==exppl_CloseBtn*/;
		
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
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
	    Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersInformationMenu));
		mastersInformationMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitConversionMenu));
		unitConversionMenu.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		Thread.sleep(1500);
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);

		
					
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
		
		Thread.sleep(1500);
		ClickUsingJs(skidDefinitionMenu);
		Thread.sleep(1500);
		
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

		//Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();

		//Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(auditTrailMenu));
		auditTrailMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(auditTrailtransactionsReport));
		auditTrailtransactionsReport.click();


		Thread.sleep(1500);

		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
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
		String expRow1List = "[Opening Balances [OpeBal]]";



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
		String expRow2List = "[1, 26/07/2022, 35, Modified, SCREEN]";



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
		String expRow3List = "[1, 26/07/2022, 34, Modified, SCREEN]";


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
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(auditTrailMenu));
		auditTrailMenu.click();
		
		Thread.sleep(1500);
		ClickUsingJs(aAuditTrailloginsReport);
		Thread.sleep(150);
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		Thread.sleep(1500);
	
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
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
		
		Thread.sleep(1500);
		
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
	
	
	
	@FindBy(xpath="//button[contains(text(),'Last Credit Transactions')]")
	public static WebElement  accountQueryCreditTransactions;
	
	@FindBy(xpath="//button[contains(text(),'Last Debit Transactions')]")
	public static WebElement  accountQueryDebitTransactions;
	
	@FindBy(xpath="//button[contains(text(),'Department - wise Balance')]")
	public static WebElement  accountQueryDepartmentWiseBalance;
	
	public static boolean checkAccountQueryReport() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		Thread.sleep(1500);
		ClickUsingJs(accountQuery);
		Thread.sleep(1500);
		
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
		

		Thread.sleep(3500);
		
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AQ_OpnBal));
		String actAQ_OpnBal				        =AQ_OpnBal.getText();
		String actAQ_Credit		                =AQ_Credit.getText();
		String actAQ_Debit				        =AQ_Debit.getText();
		String actAQ_Balance			        =AQ_Balance.getText();
		
		String expAQ_OpnBal				        ="1.00 Dr";
		String expAQ_Credit		                ="2.00";
		String expAQ_Debit				        ="2.00";
		String expAQ_Balance			        ="1.00 Dr";
		
		System.out.println("************************************checkAccountQueryOfBRCOGSACCINVAccount*************************************");
		
		System.out.println("AQ_OpnBal     		 :   "+actAQ_OpnBal			+" Value Expected : "+expAQ_OpnBal);
		System.out.println("AQ_Credit            :   "+actAQ_Credit			+" Value Expected : "+expAQ_Credit);
		System.out.println("AQ_Debit     		 :   "+actAQ_Debit			+" Value Expected : "+expAQ_Debit);
		System.out.println("AQ_Balance     	     :   "+actAQ_Balance		+" Value Expected : "+expAQ_Balance);

		Thread.sleep(1500);
		ClickUsingJs(accountQueryCreditTransactions);
		Thread.sleep(1500);
		
		ArrayList<String>  creditList1 = new ArrayList<String>(); 

		int count=CreditTransactionsTableR1.size();

		System.err.println(count);

		for(int i=0 ; i < count ;i++)
		{
			String data=CreditTransactionsTableR1.get(i).getText();
			creditList1.add(data);

		}

		String actcreditListR1 = creditList1.toString();
		String expcreditListR1 = "[25/07/2022, Pmt : 1, H2, 1.00]";

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
		String expcreditListR2 = "[21/07/2022, PurVou : 9, A1, 1.00]";

		System.out.println("actcreditList"+actcreditListR2);
		System.out.println("expcreditList"+expcreditListR2);

		Thread.sleep(1500);
		ClickUsingJs(accountQueryDebitTransactions);
		Thread.sleep(1500);
		

		ArrayList<String>  DebitList1 = new ArrayList<String>(); 

		int count3=debitTransactionsTableR1.size();

		System.err.println(count3);

		for(int i=0 ; i < count3 ;i++)
		{
			String data=debitTransactionsTableR1.get(i).getText();
			DebitList1.add(data);

		}

		String actDebitListR1 = DebitList1.toString();
		String expDebitListR1 = "[25/07/2022, SalInv : 2, E1, 1.00]";

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
		String expDebitListR2 = "[22/07/2022, Rct : 1, CustomerACC, 1.00]";

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
		String expDebitListR3 = "[31/03/2022, OpeBal : 1, Opening Balances Control A/C, 1.00]";

		System.out.println("actDebitList"+actDebitListR3);
		System.out.println("expDebitList"+expDebitListR3);

		Thread.sleep(1500);
		ClickUsingJs(accountQueryDepartmentWiseBalance);
		Thread.sleep(1500);
		
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
		
		Thread.sleep(1500);
		ClickUsingJs(transactionAuthorizationReport);
		Thread.sleep(1500);

		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(1500);
	
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		Thread.sleep(1500);
		
		ClickUsingJs(reportVoucherTxt);
		Thread.sleep(1200);
		reportVoucherTxt.sendKeys("Purchases Vouchers");
		Thread.sleep(1500);
		
		
		reportVoucherTxt.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		
		Thread.sleep(1500);
		
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
			
			Thread.sleep(1500);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			Thread.sleep(1500);
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
		
		Thread.sleep(1500);
		ClickUsingJs(masterAuthorizationReport);
		Thread.sleep(1500);
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(1500);
	
		
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		Thread.sleep(1500);
		
		boolean actReportTable = reportsTable.getText().isEmpty();
		boolean expReportTable = false;
		
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
		Thread.sleep(1500);
		getDriver().navigate().refresh();
		Thread.sleep(1500);
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		customerDetailMenu.click();
		Thread.sleep(1500);
		ClickUsingJs(customerDetailsCustomerListingOfOutstandingBillsReport);

		Thread.sleep(1500);	
		IsVisible(customerListingOfOutstandingBills1stItem);
		Thread.sleep(1500);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		Thread.sleep(1500);

		ClickUsingJs(selectAllItemsChkBox);
		
		Thread.sleep(1500);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);

		Thread.sleep(3500);
		
		int reportsRow1ListCount = reportsCol1List.size();
		
		String expRow1List = "[CustomerACCCAC001, H1H801, H2H802, NJv:1, OpeBal:1, OpeBal:1, OpeBal:1, Rct:1, SalInv:1, SalInv:4, SalInv:5, SalInv:6, SalRet:1, SubTotal, SubTotal]";

		Boolean actRow1List = ListComparisionWOOrder(reportsCol1List, expRow1List);
		

		Thread.sleep(1500);

		
		int reportsRow3ListCount = reportsCol3List.size();
		
		String expRow3List = "[H1, H1, H1, H1, H2, H2, CustomerACC, CustomerACC, CustomerACC, CustomerACC]";

		Boolean actRow3List = ListComparisionWOOrder(reportsCol3List, expRow3List);
		
		

		Thread.sleep(1500);
		
		int reportsRow4ListCount = reportsCol4List.size();
		
		String expRow4List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 11.00, 2.00, 4.00, 5.00]";

		Boolean actRow4List = ListComparisionWOOrder(reportsCol4List, expRow4List);

	

		Thread.sleep(1500);

		int reportsRow5ListCount = reportsCol5List.size();
		
		String expRow5List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 11.00, 2.00, 4.00, 5.00]";

		Boolean actRow5List = ListComparisionWOOrder(reportsCol5List, expRow5List);
		
		System.out.println("Actaul Voucher  :"+actRow5List);
		System.out.println("Expected Voucher:"+expRow5List);


		Thread.sleep(1500);
		
		int reportsRow6ListCount = reportsCol6List.size();
		
		String expRow6List = "[1.00, 1.00, 1.00, 1.00, 2.00, 2.00, 4.00, 5.00, 5.00, 6.00, 7.00]";

		Boolean actRow6List = ListComparisionWOOrder(reportsCol6List, expRow6List);
		
	

		
		HashSet<String> AllDatapage1 = new HashSet<String>();
		 int count=stockLedgerTable.size();
		 
		  System.err.println(count);
		 
		  for(int i=0 ; i < count ;i++) {
			  String style=
		  stockLedgerTable.get(i).getAttribute("style");
			  if(style.contains("overflow: visible; font-weight: bold; background-color:"))
			  { 
				  String data=stockLedgerTable.get(i).getText();
				  AllDatapage1.add(data); 
			  } 
		  }
		  
		  
		  Set<String> expAllDatapage1 = Set.of("H1 [H801]", "H2 [H802]", "CustomerACC [CAC001]");
		 
		 
		  System.out.println("actAllDatapage1"+AllDatapage1);
		  System.out.println("expAllDatapage1"+expAllDatapage1);

		

		Thread.sleep(1500);
		report_NextBtn.click();
		Thread.sleep(2500);
		
		System.out.println(" PAGE NO 2");

		int reportsLastRowCount = reportsLastRowList.size();
		ArrayList<String> lastRow = new ArrayList<String>();
		for(int i=1;i<reportsLastRowCount-3;i++)
		{
			String data = reportsLastRowList.get(i).getText();
			lastRow.add(data);
		}
		
		
		String actpage2Row1List = lastRow.toString();
		String exppage2Row1List = "[Grand Total, , , 1.00, 1.00, 21.00, , 1.00, 1.00, 1.00, 21.00, , , , ]";

		System.out.println("actpage2Row1List"+actpage2Row1List);
		System.out.println("exppage2Row1List"+exppage2Row1List);

	
		if(actRow1List && actRow3List && actRow4List && actRow5List && actRow6List &&
				actpage2Row1List.equals(exppage2Row1List)&&	AllDatapage1.equals(expAllDatapage1))

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
		
		Thread.sleep(1500);
		getDriver().navigate().refresh();
		Thread.sleep(1500);
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		customerDetailMenu.click();
		Thread.sleep(1500);
		ClickUsingJs(customerDetailsCustomerStatementsReport);		
		Thread.sleep(1500);
		IsVisible(customerListingOfOutstandingBills1stItem);	
		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		Thread.sleep(1000);

		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);


		Thread.sleep(3500);
		
	
		int reportsRow1ListCount = reportsCol1List.size();
		
		String expRow1List = "[CustomerACCCAC001, H1H801, H2H802, NJv:1, OpeBal:1, OpeBal:1, OpeBal:1, Rct:1, SalInv:1, SalInv:4, SalInv:5, SalInv:6, SalRet:1, SubTotal, SubTotal]";

		Boolean actRow1List = ListComparisionWOOrder(reportsCol1List, expRow1List);
		
		
		Thread.sleep(1500);

		
		int reportsRow3ListCount = reportsCol3List.size();
		
		String expRow3List = "[H1, H1, H1, H1, H2, H2, CustomerACC, CustomerACC, CustomerACC, CustomerACC]";

		Boolean actRow3List = ListComparisionWOOrder(reportsCol3List, expRow3List);
		
		
		Thread.sleep(1500);
		
		int reportsRow4ListCount = reportsCol4List.size();
		
		String expRow4List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 11.00, 2.00, 4.00, 5.00]";

		Boolean actRow4List = ListComparisionWOOrder(reportsCol4List, expRow4List);
		
		Thread.sleep(1500);
		
		
		int reportsRow7ListCount = reportsCol7List.size();
		
		String expRow7List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 11.00, 2.00, 4.00, 5.00]";

		Boolean actRow7List = ListComparisionWOOrder(reportsCol7List, expRow7List);
		
		Thread.sleep(1500);

		
		
		int reportsRow8ListCount = reportsCol8List.size();
		
		String expRow8List = "[1.00, 1.00, 1.00, 1.00, 2.00, 2.00, 4.00, 5.00, 5.00, 6.00, 7.00]";

		Boolean actRow8List = ListComparisionWOOrder(reportsCol8List, expRow8List);
		
		Thread.sleep(1500);

		HashSet<String> AllDatapage1 = new HashSet<String>();
		 int count=stockLedgerTable.size();
		 
		  System.err.println(count);
		 
		  for(int i=0 ; i < count ;i++) {
			  String style=
		  stockLedgerTable.get(i).getAttribute("style");
			  if(style.contains("overflow: visible; font-weight: bold; background-color:"))
			  { 
				  String data=stockLedgerTable.get(i).getText();
				  AllDatapage1.add(data); 
			  } 
		  }
		  
		  
		  Set<String> expAllDatapage1 = Set.of("H1 [H801]", "H2 [H802]", "CustomerACC [CAC001]");
		 
		 
		  System.out.println("actAllDatapage1"+AllDatapage1);
		  System.out.println("expAllDatapage1"+expAllDatapage1);


		Thread.sleep(1500);
		report_NextBtn.click();
		Thread.sleep(2500);
		
		
		int reportspage2Row1ListCount = reportsrow1List.size();
		
		String exppage2Row1List = "[1.00, 1.00, 1.00, 1.00, 16, 25/07/2022, 25/07/2022, 3.00, H2, H802, IndianRupees, Pmt:1]";

		Boolean actpage2Row1List = ListComparisionWOOrder(reportsrow1List, exppage2Row1List);
		
		
		
		int reportspage2Row2ListCount = reportsrow2List.size();
		
		String exppage2Row2List = "[1.00, 1.00, 1.00, 1.00, 17, 26/07/2022, 26/07/2022, 4.00, CreNts:1, H2, H802, IndianRupees]";

		Boolean actpage2Row2List = ListComparisionWOOrder(reportsrow2List, exppage2Row2List);
		

		
	
		if (actRow1List && actRow3List && 
				actRow4List && actRow7List &&
				actRow8List)

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
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		customerDetailMenu.click();
		Thread.sleep(1500);
		ClickUsingJs(customerDetailsCustomerDueDateAnalysisReport);
		
		Thread.sleep(1500);


		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		Thread.sleep(1000);

		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		

		int reportsRow1ListCount = reportsCol1List.size();
		
		String expRow1List = "[CustomerACCCAC001, H1H801, H2H802, NJv:1, OpeBal:1, OpeBal:1, OpeBal:1, Rct:1, SalInv:1, SalInv:4, SalInv:5, SalInv:6, SalRet:1, SubTotal, SubTotal]";

		Boolean actRow1List = ListComparisionWOOrder(reportsCol1List, expRow1List);
		
		
		Thread.sleep(1500);

		
		int reportsRow3ListCount = reportsCol3List.size();
		
		String expRow3List = "[CustomerACC, CustomerACC, CustomerACC, CustomerACC, H1, H1, H1, H1, H2, H2]";

		Boolean actRow3List = ListComparisionWOOrder(reportsCol3List, expRow3List);
		
		
		Thread.sleep(1500);
		
		int reportsRow4ListCount = reportsCol4List.size();
		
		String expRow4List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 11.00, 2.00, 4.00, 5.00]";

		Boolean actRow4List = ListComparisionWOOrder(reportsCol4List, expRow4List);
		
		Thread.sleep(1500);
		
		
		int reportsRow7ListCount = reportsCol7List.size();
		
		String expRow7List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 11.00, 2.00, 4.00, 5.00]";

		Boolean actRow7List = ListComparisionWOOrder(reportsCol7List, expRow7List);
		
		Thread.sleep(1500);
		
		int reportsRow8ListCount = reportsCol8List.size();
		
		String expRow8List = "[1.00, 1.00, 1.00, 1.00, 2.00, 2.00, 4.00, 5.00, 5.00, 6.00, 7.00]";

		Boolean actRow8List = ListComparisionWOOrder(reportsCol8List, expRow8List);
		
		Thread.sleep(1500);

		HashSet<String> AllDatapage1 = new HashSet<String>();
		 int count=stockLedgerTable.size();
		 
		  System.err.println(count);
		 
		  for(int i=0 ; i < count ;i++) {
			  String style=
		  stockLedgerTable.get(i).getAttribute("style");
			  if(style.contains("overflow: visible; font-weight: bold; background-color:"))
			  { 
				  String data=stockLedgerTable.get(i).getText();
				  AllDatapage1.add(data); 
			  } 
		  }
		  
		  
		  Set<String> expAllDatapage1 = Set.of("H1 [H801]", "H2 [H802]", "CustomerACC [CAC001]");
		 
		 
		  System.out.println("actAllDatapage1"+AllDatapage1);
		  System.out.println("expAllDatapage1"+expAllDatapage1);


		Thread.sleep(1500);
		report_NextBtn.click();
		Thread.sleep(3500);
		
		
		

		int reportspage2Row1ListCount = reportsrow2List.size();
		ArrayList<String> reportspage2Row1ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row1ListCount-1;i++)
		{
			String data = reportsrow2List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row1ListArray.add(data);
			}

		}
		String actpage2Row1List = reportspage2Row1ListArray.toString();
		String exppage2Row1List = "[Pmt:1, 25/07/2022, H2, 1.00, 1.00, 3.00, 1.00, 1.00, Indian Rupees, 25/07/2022, H802]";



		int reportspage2Row2ListCount = reportsrow3List.size();
		ArrayList<String> reportspage2Row2ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row2ListCount-1;i++)
		{
			String data = reportsrow3List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row2ListArray.add(data);
			}


		}
		String actpage2Row2List = reportspage2Row2ListArray.toString();
		String exppage2Row2List = "[CreNts:1, 26/07/2022, H2, 1.00, 1.00, 4.00, 1.00, 1.00, Indian Rupees, 26/07/2022, H802]";
		
		
		int reportspage2Row4ListCount = reportsrow5List.size();
		ArrayList<String> reportspage2Row4ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row4ListCount-2;i++)
		{
			String data = reportsrow5List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row4ListArray.add(data);
			}

		}
		String actpage2Row4List = reportspage2Row4ListArray.toString();
		String exppage2Row4List = "[Grand Total, 1.00, 1.00, 21.00, 1.00, 1.00]";

		
		
		System.out.println("actpage2Row1List"+actpage2Row1List);
		System.out.println("exppage2Row1List"+exppage2Row1List);
		
		
		System.out.println("actpage2Row2List"+actpage2Row2List);
		System.out.println("exppage2Row2List"+exppage2Row2List);
		
		System.out.println("actpage2Row4List"+actpage2Row4List);
		System.out.println("exppage2Row4List"+exppage2Row4List);

		if (actRow1List && actRow3List&& 
				actRow4List && actRow7List &&
				actRow8List  && actpage2Row4List.equalsIgnoreCase(exppage2Row4List))

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
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		customerDetailMenu.click();

		ClickUsingJs(customerDetailsCustomerAgeingDetailsReport);	
		
		Thread.sleep(1500);


		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		Thread.sleep(1000);

		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		
		int reportsRow1ListCount = reportsCol1List.size();
		
		String expRow1List = "[CustomerACCCAC001, H1H801, H2H802, NJv:1, OpeBal:1, OpeBal:1, OpeBal:1, Rct:1, SalInv:1, SalInv:4, SalInv:5, SalInv:6, SalRet:1, SubTotal, SubTotal]";

		Boolean actRow1List = ListComparisionWOOrder(reportsCol1List, expRow1List);
		
		
		Thread.sleep(1500);

		
		int reportsRow3ListCount = reportsCol3List.size();
		
		String expRow3List = "[CustomerACC, CustomerACC, CustomerACC, CustomerACC, H1, H1, H1, H1, H2, H2]";

		Boolean actRow3List = ListComparisionWOOrder(reportsCol3List, expRow3List);
		
		
		Thread.sleep(1500);
		
		int reportsRow4ListCount = reportsCol4List.size();
		
		String expRow4List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 11.00, 2.00, 4.00, 5.00]";

		Boolean actRow4List = ListComparisionWOOrder(reportsCol4List, expRow4List);
		
		Thread.sleep(1500);
		
		
		int reportsRow5ListCount = reportsCol5List.size();
		
		String expRow5List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 11.00, 2.00, 4.00, 5.00]";

		Boolean actRow5List = ListComparisionWOOrder(reportsCol5List, expRow5List);
		
		Thread.sleep(1500);
		
		int reportsRow6ListCount = reportsCol6List.size();
		
		String expRow6List = "[1.00, 1.00, 1.00, 1.00, 2.00, 2.00, 4.00, 5.00, 5.00, 6.00, 7.00]";

		Boolean actRow6List = ListComparisionWOOrder(reportsCol6List, expRow6List);
		
		Thread.sleep(1500);

		HashSet<String> AllDatapage1 = new HashSet<String>();
		 int count=stockLedgerTable.size();
		 
		  System.err.println(count);
		 
		  for(int i=0 ; i < count ;i++) {
			  String style=
		  stockLedgerTable.get(i).getAttribute("style");
			  if(style.contains("overflow: visible; font-weight: bold; background-color:"))
			  { 
				  String data=stockLedgerTable.get(i).getText();
				  AllDatapage1.add(data); 
			  } 
		  }
		  
		  
		  Set<String> expAllDatapage1 = Set.of("H1 [H801]", "H2 [H802]", "CustomerACC [CAC001]");
		 
		 
		  System.out.println("actAllDatapage1"+AllDatapage1);
		  System.out.println("expAllDatapage1"+expAllDatapage1);



		Thread.sleep(1500);
		report_NextBtn.click();
		Thread.sleep(2500);
		
		

		int reportspage2Row1ListCount = reportsrow2List.size();
		
		String exppage2Row1List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 16, 25/07/2022, 25/07/2022, 3.00, H, H2, H802, NewRef:Jul252022, Pmt:1]";

		Boolean actpage2Row1List = ListComparisionWOOrder(reportsrow2List, exppage2Row1List);
		
		
		
		int reportspage2Row2ListCount = reportsrow3List.size();
		
		String exppage2Row2List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 17, 26/07/2022, 26/07/2022, 4.00, CreNts:1, H, H2, H802, NewRef:Jul262022]";

		Boolean actpage2Row2List = ListComparisionWOOrder(reportsrow3List, exppage2Row2List);
		

		
		
		int reportspage2Row4ListCount = reportsrow5List.size();
		ArrayList<String> reportspage2Row4ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row4ListCount-1;i++)
		{
			String data = reportsrow5List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row4ListArray.add(data);
				
				if(data.startsWith("6703"))
				{
					reportspage2Row4ListArray.remove(data);
				}
			}

		}
		String actpage2Row4List = reportspage2Row4ListArray.toString();
		String exppage2Row4List = "[Grand Total, 1.00, 1.00, 21.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";

		System.out.println("actpage2Row4List"+actpage2Row4List);
		  System.out.println("exppage2Row4List"+exppage2Row4List);
		
		if (actRow1List && actRow3List&& 
				actRow4List && actRow5List &&
				actRow6List&& actpage2Row4List.equalsIgnoreCase(exppage2Row4List))

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


		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		customerDetailMenu.click();

		ClickUsingJs(customerDetailsCustomerDetailAgeingByDueDateReport);
		
		
		Thread.sleep(1500);

		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		Thread.sleep(1000);

		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);

		int reportsRow1ListCount = reportsCol1List.size();
		
		String expRow1List = "[CustomerACCCAC001, H1H801, H2H802, NJv:1, OpeBal:1, OpeBal:1, OpeBal:1, Rct:1, SalInv:1, SalInv:4, SalInv:5, SalInv:6, SalRet:1, SubTotal, SubTotal]";

		Boolean actRow1List = ListComparisionWOOrder(reportsCol1List, expRow1List);
		
		
		Thread.sleep(1500);

		
		int reportsRow3ListCount = reportsCol3List.size();
		
		String expRow3List = "[CustomerACC, CustomerACC, CustomerACC, CustomerACC, H1, H1, H1, H1, H2, H2]";

		Boolean actRow3List = ListComparisionWOOrder(reportsCol3List, expRow3List);
		
		
		Thread.sleep(1500);
		
		int reportsRow4ListCount = reportsCol4List.size();
		
		String expRow4List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 11.00, 2.00, 4.00, 5.00]";

		Boolean actRow4List = ListComparisionWOOrder(reportsCol4List, expRow4List);
		
		Thread.sleep(1500);
		
		
		int reportsRow5ListCount = reportsCol5List.size();
		
		String expRow5List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 11.00, 2.00, 4.00, 5.00]";

		Boolean actRow5List = ListComparisionWOOrder(reportsCol5List, expRow5List);
		
		Thread.sleep(1500);
		
		int reportsRow6ListCount = reportsCol6List.size();
		
		String expRow6List = "[1.00, 1.00, 1.00, 1.00, 2.00, 2.00, 4.00, 5.00, 5.00, 6.00, 7.00]";

		Boolean actRow6List = ListComparisionWOOrder(reportsCol6List, expRow6List);
		
		Thread.sleep(1500);
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
		

		Thread.sleep(1500);
		report_NextBtn.click();
		Thread.sleep(2500);
		
		

		int reportspage2Row1ListCount = reportsrow2List.size();
		
		String exppage2Row1List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 16, 25/07/2022, 25/07/2022, 3.00, H, H2, H802, NewRef:Jul252022, Pmt:1]";

		Boolean actpage2Row1List = ListComparisionWOOrder(reportsrow2List, exppage2Row1List);
		
		
		
		int reportspage2Row2ListCount = reportsrow3List.size();
		
		String exppage2Row2List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 17, 26/07/2022, 26/07/2022, 4.00, CreNts:1, H, H2, H802, NewRef:Jul262022]";

		Boolean actpage2Row2List = ListComparisionWOOrder(reportsrow3List, exppage2Row2List);
		

		

		int reportspage2Row4ListCount = reportsrow5List.size();
		ArrayList<String> reportspage2Row4ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row4ListCount-1;i++)
		{
			String data = reportsrow5List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row4ListArray.add(data);
			}

		}
		String actpage2Row4List = reportspage2Row4ListArray.toString();
		String exppage2Row4List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 19, 21.00, 6448, GrandTotal]";
		
		
		System.out.println("actpage2Row4List"+actpage2Row4List);
		System.out.println("exppage2Row4List"+exppage2Row4List);
		
		
		if (actRow1List && actRow3List&& 
				actRow4List && actRow5List &&
				actRow6List&& actpage2Row4List.equalsIgnoreCase(exppage2Row4List))

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
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		customerDetailMenu.click();

		ClickUsingJs(customerDetailsCustomerOverdueAnalysisReport);
		
		
		Thread.sleep(1500);

		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		Thread.sleep(1000);

		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		
		
		int reportsRow1ListCount = reportsCol1List.size();
		
		String expRow1List = "[CustomerACCCAC001, H1H801, H2H802, NJv:1, OpeBal:1, OpeBal:1, OpeBal:1, Rct:1, SalInv:1, SalInv:4, SalInv:5, SalInv:6, SalRet:1, SubTotal, SubTotal]";

		Boolean actRow1List = ListComparisionWOOrder(reportsCol1List, expRow1List);
		
		
		Thread.sleep(1500);

		
		int reportsRow3ListCount = reportsCol3List.size();
		
		String expRow3List = "[CustomerACC, CustomerACC, CustomerACC, CustomerACC, H1, H1, H1, H1, H2, H2]";

		Boolean actRow3List = ListComparisionWOOrder(reportsCol3List, expRow3List);
		
		
		Thread.sleep(1500);
		
		int reportsRow4ListCount = reportsCol4List.size();
		
		String expRow4List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 11.00, 2.00, 4.00, 5.00]";

		Boolean actRow4List = ListComparisionWOOrder(reportsCol4List, expRow4List);
		
		Thread.sleep(1500);
		
		
		int reportsRow5ListCount = reportsCol5List.size();
		
		String expRow5List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 11.00, 2.00, 4.00, 5.00]";

		Boolean actRow5List = ListComparisionWOOrder(reportsCol5List, expRow5List);
		
		Thread.sleep(1500);
		
		int reportsRow7ListCount = reportsCol7List.size();
		
		String expRow7List = "[1289, 1289, 1290, 1290, 1290, 1293, 1294, 1406, 1406, 1406, 5278, 5279]";

		Boolean actRow7List = ListComparisionWOOrder(reportsCol7List, expRow7List);

		HashSet<String> AllDatapage1 = new HashSet<String>();
		 int count=stockLedgerTable.size();
		 
		  System.err.println(count);
		 
		  for(int i=0 ; i < count ;i++) {
			  String style=
		  stockLedgerTable.get(i).getAttribute("style");
			  if(style.contains("overflow: visible; font-weight: bold; background-color:"))
			  { 
				  String data=stockLedgerTable.get(i).getText();
				  AllDatapage1.add(data); 
			  } 
		  }
		  
		  
		  Set<String> expAllDatapage1 = Set.of("H1 [H801]", "H2 [H802]", "CustomerACC [CAC001]");
		 
		 
		  System.out.println("actAllDatapage1"+AllDatapage1);
		  System.out.println("expAllDatapage1"+expAllDatapage1);


		Thread.sleep(1500);
		report_NextBtn.click();
		Thread.sleep(2500);
		
		
		

		int reportspage2Row1ListCount = reportsrow2List.size();
		
		String exppage2Row1List = "[1.00, 1.00, 1.00, 1.00, 1290, 16, 25/07/2022, 3.00, H2, H802, Pmt:1]";

		Boolean actpage2Row1List = ListComparisionWOOrder(reportsrow2List, exppage2Row1List);
		
		
		
		int reportspage2Row2ListCount = reportsrow3List.size();
		
		String exppage2Row2List = "[1.00, 1.00, 1.00, 1.00, 1289, 17, 26/07/2022, 4.00, CreNts:1, H2, H802]";

		Boolean actpage2Row2List = ListComparisionWOOrder(reportsrow3List, exppage2Row2List);
		

		
		int reportspage2Row4ListCount = reportsRow5List.size();
		
		String exppage2Row4List = "[1.00, 1.00, 1.00, 1.00, 15832, 19, 21.00, GrandTotal]";

		Boolean actpage2Row4List = ListComparisionWOOrder(reportsRow5List, exppage2Row4List);
		
	
		
		

		if (actRow1List && actRow3List && 
				actRow4List && actRow5List 
				&& actRow7List  && actpage2Row4List
				&& AllDatapage1.equals(expAllDatapage1) 
				)

		{
			return true;
		} 
		else 
		{
			return false;
		}

	}
	
	
	//Customer summary
	
	
	public static boolean checkCustomerAgeingSummaryReport() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerSummaryMenu));
		customerSummaryMenu.click();

		ClickUsingJs(customerSummaryCustomerAgeingSummaryReport);
		

		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(2500);
		
		
		
		Thread.sleep(3500);

		String expcol1List = "[H1, H2, CustomerACC, Grand Total]";
		boolean actcol1List = ListComparisionWOOrder(reportsCol1List, expcol1List);


		
		String expcol2List = "[5.00, 4.00, 2.00, 1.00]";
		boolean actcol2List = ListComparisionWOOrder(reportsCol2List, expcol2List);

		

		String expcol3List = "[5.00, 4.00, 2.00, 1.00]";
		boolean actcol3List = ListComparisionWOOrder(reportsCol3List, expcol3List);
		
		String expcol6List = "[5.00, 4.00, 2.00, 1.00]";
		boolean actcol6List = ListComparisionWOOrder(reportsCol6List, expcol6List);
		
		

		
		if (actcol1List && actcol2List
				&&actcol3List && actcol6List)
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
		
		ClickUsingJs(customerSummaryAgeingByDueDateReport);
		
		Thread.sleep(1500);
		

		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(2500);
		
	
		String expcol1List = "[H1, H2, CustomerACC, Grand Total]";
		boolean actcol1List = ListComparisionWOOrder(reportsCol1List, expcol1List);


		
		
		String expcol2List = "[5.00, 4.00, 2.00, 1.00]";
		boolean actcol2List = ListComparisionWOOrder(reportsCol2List, expcol2List);


		
		String expcol3List = "[5.00, 4.00, 2.00, 1.00]";
		boolean actcol3List = ListComparisionWOOrder(reportsCol3List, expcol3List);

		
		String expcol6List = "[5.00, 4.00, 2.00, 1.00]";
		boolean actcol6List = ListComparisionWOOrder(reportsCol6List, expcol6List);

		System.out.println(actcol1List);
		System.out.println(expcol1List);

		System.out.println(actcol2List);
		System.out.println(expcol2List);

		System.out.println(actcol3List);
		System.out.println(expcol3List);

		System.out.println(actcol6List);
		System.out.println(expcol6List);


		if (actcol1List&& actcol2List && actcol3List
				&& actcol6List)
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
		
		ClickUsingJs(customerSummaryCustomerOverDueSummeryReport);
		
		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3500);
		

		String expcol1List = "[H1, H2, CustomerACC, Grand Total]";
		boolean actcol1List = ListComparisionWOOrder(reportsCol1List, expcol1List);


		
		String expcol2List = "[5.00, 4.00, 2.00, 1.00]";
		boolean actcol2List = ListComparisionWOOrder(reportsCol2List, expcol2List);

		

		String expcol3List = "[5.00, 4.00, 2.00, 1.00]";
		boolean actcol3List = ListComparisionWOOrder(reportsCol3List, expcol3List);


		System.out.println(actcol1List);
		System.out.println(expcol1List);

		System.out.println(actcol2List);
		System.out.println(expcol2List);

		System.out.println(actcol3List);
		System.out.println(expcol3List);

		

		if (actcol1List&& actcol2List && actcol3List)
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
		
		ClickUsingJs(customerSummaryCustomerBillWiseSummeryReport);
		
		
		Thread.sleep(1500);
		

		
		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3500);

		String expcol1List = "[H1, H2, CustomerACC, Grand Total]";
		boolean actcol1List = ListComparisionWOOrder(reportsCol1List, expcol1List);


		
		String expcol2List = "[6.00, 4.00, 3.00, 13.00]";
		boolean actcol2List = ListComparisionWOOrder(reportsCol2List, expcol2List);

		

		String expcol3List = "[11.00, 1.00, 12.00]";
		boolean actcol3List = ListComparisionWOOrder(reportsCol3List, expcol3List);



		
		if (actcol1List && actcol2List && actcol3List)
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
		Thread.sleep(1500);
		ClickUsingJs(vendorDetailsVendorListingOfOutstandingBillsReport);

		Thread.sleep(1500);
		IsVisible(vendorListingOfOutstandingBills1stItem);
		Thread.sleep(1500);

		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		Thread.sleep(1500);

		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);

		Thread.sleep(3500);
		int reportsRow1ListCount = reportsCol1List.size();

		String expRow1List = "[D1D401, D2D402, DebNts:1, NJv:1, OpeBal:1, OpeBal:1, OpeBal:1, PurRet:1, PurVou:1, PurVou:10, PurVou:2, PurVou:6, SubTotal, SubTotal, VendorACCVAC001]";
		Boolean actRow1List = ListComparisionWOOrder(reportsCol1List, expRow1List);



		Thread.sleep(1500);
		int reportsRow3ListCount = reportsCol3List.size();

		String expRow3List = "[D1, D1, D1, D2, D2, D2, D2, VendorACC, VendorACC, VendorACC]";
		Boolean actRow3List = ListComparisionWOOrder(reportsCol3List, expRow3List);


		Thread.sleep(1500);

		int reportsRow4ListCount = reportsCol4List.size();


		String expRow4List = "[1.00, 29.00, 1.00, 29.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";
		Boolean actRow4List = ListComparisionWOOrder(reportsCol4List, expRow4List);

		Thread.sleep(1500);
		int reportsRow5ListCount = reportsCol5List.size();

		String expRow5List = "[1.00, 29.00, 1.00, 29.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";
		Boolean actRow5List = ListComparisionWOOrder(reportsCol5List, expRow5List);

		Thread.sleep(1500);

		Thread.sleep(1500);
		int reportsRow6ListCount = reportsCol6List.size();

		String expRow6List = "[1.00, 28.00, 29.00, 56.00, 1.00, 1.00, 2.00, 1.00, 1.00, 2.00]";
		Boolean actRow6List = ListComparisionWOOrder(reportsCol6List, expRow6List);

		HashSet<String> AllDatapage1 = new HashSet<String>();
		int count=stockLedgerTable.size();

		System.err.println(count);

		for(int i=0 ; i < count ;i++) {
			String style=
					stockLedgerTable.get(i).getAttribute("style");
			if(style.contains("overflow: visible; font-weight: bold; background-color:"))
			{ 
				String data=stockLedgerTable.get(i).getText();
				AllDatapage1.add(data); 
			} 
		}


		Set<String> expAllDatapage1 = Set.of("D1 [D401]", "D2 [D402]", "VendorACC [VAC001]");


		System.out.println("actAllDatapage1"+AllDatapage1);
		System.out.println("expAllDatapage1"+expAllDatapage1);



		int reportsRow5ListCount1 = reportsRow5List.size();

		String expRow5List1 = "[1.00, 1.00, 1.00, 1.00, 1.00, 1294, 2.00, 2.00, 5, SubTotal]";
		Boolean actRow5List1 = ListComparisionWOOrder(reportsRow5List, expRow5List1);

		int reportsRow11ListCount = reportsRow10List.size();

		String expRow11List = "[10, 2588, 29.00, 29.00, 29.00, 29.00, 29.00, 56.00, 56.00, SubTotal]";
		Boolean actRow11List = ListComparisionWOOrder(reportsRow10List, expRow11List);



		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_NextBtn));
		report_NextBtn.click();


		Thread.sleep(3500);

		String expP2Row1List = "[Sub Total, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 185]";
		Boolean actP2Row1List = ListComparisionWOOrder(reportsCol1List, expRow1List);


		Thread.sleep(2000);
		int reportsLastRowCount = reportsLastRowList.size();

		String expLastRowList = "[Grand Total, , , 28.00, 28.00, 52.00, , 26.00, 28.00, 28.00, , , , , , 577, , ]";
		Boolean actLastRowList = ListComparisionWOOrder(reportsLastRowList, expLastRowList);

		if (actRow1List&& actRow3List &&
				actRow4List &&
				actRow5List && actRow6List&& actRow5List1 && actRow11List
				&& actP2Row1List && AllDatapage1.equals(expAllDatapage1) 
				&& actLastRowList)

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
		
		ClickUsingJs(vendorDetailsVendorStatementsReport);
		Thread.sleep(1500);
		IsVisible(vendorListingOfOutstandingBills1stItem);
		Thread.sleep(1500);

		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		Thread.sleep(1500);

		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		
		Thread.sleep(2500);

		Thread.sleep(1500);
		int reportsRow1ListCount = reportsCol1List.size();
		
		String expRow1List = "[D1D401, D2D402, DebNts:1, NJv:1, OpeBal:1, OpeBal:1, OpeBal:1, PurRet:1, PurVou:1, PurVou:10, PurVou:2, PurVou:6, SubTotal, SubTotal, VendorACCVAC001]";
		Boolean actRow1List = ListComparisionWOOrder(reportsCol1List, expRow1List);
		
		Thread.sleep(1500);
		int reportsRow3ListCount = reportsCol3List.size();

		String expRow3List = "[D1, D1, D1, D2, D2, D2, D2, VendorACC, VendorACC, VendorACC]";
		Boolean actRow3List = ListComparisionWOOrder(reportsCol3List, expRow3List);

		Thread.sleep(1500);
		int reportsRow4ListCount = reportsCol4List.size();
		
		String expRow4List = "[1.00, 29.00, 1.00, 29.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";
		Boolean actRow4List = ListComparisionWOOrder(reportsCol4List, expRow4List);

		Thread.sleep(1500);
		int reportsRow7ListCount = reportsCol7List.size();
		
		String expRow7List = "[1.00, 29.00, 1.00, 29.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";
		Boolean actRow7List = ListComparisionWOOrder(reportsCol7List, expRow7List);

		Thread.sleep(1500);
		int reportsRow8ListCount = reportsCol8List.size();

		String expRow8List = "[1.00, 1.00, 1.00, 1.00, 1.00, 2.00, 28.00, 29.00, 56.00]";
		Boolean actRow8List = ListComparisionWOOrder(reportsCol8List, expRow8List);

		HashSet<String> AllDatapage1 = new HashSet<String>();
		 int count=stockLedgerTable.size();
		 
		  System.err.println(count);
		 
		  for(int i=0 ; i < count ;i++) {
			  String style=
		  stockLedgerTable.get(i).getAttribute("style");
			  if(style.contains("overflow: visible; font-weight: bold; background-color:"))
			  { 
				  String data=stockLedgerTable.get(i).getText();
				  AllDatapage1.add(data); 
			  } 
		  }
		  
		  
		  Set<String> expAllDatapage1 = Set.of("D1 [D401]", "D2 [D402]", "VendorACC [VAC001]");
		 
		 
		  System.out.println("actAllDatapage1"+AllDatapage1);
		  System.out.println("expAllDatapage1"+expAllDatapage1);

			

			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_NextBtn));
			report_NextBtn.click();
			
			
		
			Thread.sleep(2000);
			int reportsLastRowCount = reportsLastRowList.size();
			
			String expLastRowList = "[Grand Total, , , 28.00, 28.00, 52.00, , 26.00, 28.00, 28.00, , , , , , 577, , ]";
			String actLastRowList = GrandTotalListWithLimitedData(6);

			
			System.out.println("actLastRowList"+actLastRowList);
			System.out.println("expLastRowList"+expLastRowList);

		if (actRow1List&& actRow3List &&
				actRow4List  &&
				actRow7List && actRow8List
				 && AllDatapage1.equals(expAllDatapage1) 
				&& actLastRowList.equalsIgnoreCase(expLastRowList))

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
		
		ClickUsingJs(vendorDetailsVendorDueDateAnalysisReport);
		
		Thread.sleep(1500);
		IsVisible(vendorListingOfOutstandingBills1stItem);
		Thread.sleep(1500);

		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		Thread.sleep(1500);

		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);

		Thread.sleep(3500);
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
		String expRow1List = "[D1 [D401], OpeBal:1, PurVou:1, PurVou:6, Sub Total, D2 [D402], OpeBal:1, PurVou:10, PurRet:1, DebNts:1, Sub Total, VendorACC [VAC001], OpeBal:1, PurVou:2, NJv:1, Sub Total]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(1500);


		Thread.sleep(1500);
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

		Thread.sleep(1500);

		


		Thread.sleep(1500);
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
		String expRow4List = "[1.00, 29.00, 1.00, 29.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";

		System.out.println("Actaul Voucher  :"+actRow4List);
		System.out.println("Expected Voucher:"+expRow4List);

		Thread.sleep(1500);
		
		


		Thread.sleep(1500);
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
		String expRow7List = "[1.00, 29.00, 1.00, 29.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";

		System.out.println("Actaul Voucher  :"+actRow7List);
		System.out.println("Expected Voucher:"+expRow7List);

		Thread.sleep(1500);
		


		Thread.sleep(1500);
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
		String expRow8List = "[1.00, 28.00, 29.00, 56.00, 1.00, 1.00, 2.00, 1.00, 1.00, 2.00]";

		System.out.println("Actaul Voucher  :"+actRow8List);
		System.out.println("Expected Voucher:"+expRow8List);

		Thread.sleep(1500);



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



		String actRowList = GrandTotalListWithLimitedData(6);
		String expRowList = "[Grand Total, , , 28.00, 28.00, 52.00, , 26.00, 28.00, 28.00, , , , , , 577, , ]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);


		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List)&&actAllDatapage1.equalsIgnoreCase(expAllDatapage1) 
				&& actRowList.equalsIgnoreCase(expRowList))

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
		
		ClickUsingJs(vendorDetailsVendorAgeingDetailsReport);
		
		Thread.sleep(1500);
		IsVisible(vendorListingOfOutstandingBills1stItem);
		Thread.sleep(1500);

		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		Thread.sleep(1500);
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(3000);

		String expRow1List = "[D1D401, D2D402, DebNts:1, NJv:1, OpeBal:1, OpeBal:1, OpeBal:1, PurRet:1, PurVou:1, PurVou:10, PurVou:2, PurVou:6, SubTotal, SubTotal, SubTotal, VendorACCVAC001]";
		Boolean  actRow1List = ListComparisionWOOrder(reportsCol1List,expRow1List);
		
		Thread.sleep(1500);
		
		String expRow3List = "[D1, D1, D1, D2, D2, D2, D2, VendorACC, VendorACC, VendorACC]";
		Boolean  actRow3List = ListComparisionWOOrder(reportsCol3List,expRow3List);

		
		Thread.sleep(1500);
	
		String expRow4List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 29.00, 29.00]";
		Boolean actRow4List = ListComparisionWOOrder(reportsCol4List,expRow4List);

		Thread.sleep(1500);
	
		String expRow5List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 29.00, 29.00]";
		Boolean actRow5List = ListComparisionWOOrder(reportsCol5List,expRow5List);

		Thread.sleep(1500);
	
		String expRow6List = "[1.00, 29.00, 28.00, 1.00, 1.00, 2.00, 1.00, 1.00, 2.00, 24.00]";
		Boolean actRow6List = ListComparisionWOOrder(reportsCol7List,expRow6List);

		Thread.sleep(1500);

		String expAllDatapage1 = "[D1 [D401], D2 [D402], VendorACC [VAC001]]";
		 boolean actAllDatapage1 = ListComparisionWOOrderBold(stockLedgerTable,expAllDatapage1);
		
		
		Thread.sleep(1500);
		report_NextBtn.click();
		
		

		Thread.sleep(1500);
		String expRowList = "[Grand Total, , , 28.00, 28.00, 52.00, , 26.00, 28.00, 28.00, , , , , , 577, , ]";
		String actRowList = GrandTotalListWithLimitedData(6);

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);


		if (actRow1List && actRow3List && actRow4List &&
				actRow5List && actRow6List&& actAllDatapage1 
				&& actRowList.equalsIgnoreCase(expRowList))
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
		
		ClickUsingJs(vendorDetailsVendorDetailsAgeingByDueDateReport);
		Thread.sleep(1500);
		IsVisible(vendorListingOfOutstandingBills1stItem);
		Thread.sleep(1500);


		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		Thread.sleep(1500);
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);



		Thread.sleep(3500);
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
		String expRow1List = "[D1 [D401], OpeBal:1, PurVou:1, PurVou:6, Sub Total, D2 [D402], OpeBal:1, PurVou:10, PurRet:1, DebNts:1, Sub Total, VendorACC [VAC001], OpeBal:1, PurVou:2, NJv:1, Sub Total]";

		System.out.println("Actaul Voucher  :"+actRow1List);
		System.out.println("Expected Voucher:"+expRow1List);

		Thread.sleep(1500);
		Thread.sleep(1500);
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

		Thread.sleep(1500);
		Thread.sleep(1500);
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
		String expRow4List = "[1.00, 29.00, 1.00, 29.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";

		System.out.println("Actaul Voucher  :"+actRow4List);
		System.out.println("Expected Voucher:"+expRow4List);

		Thread.sleep(1500);
		
		


		Thread.sleep(1500);
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
		String expRow5List = "[1.00, 29.00, 1.00, 29.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";

		System.out.println("Actaul Voucher  :"+actRow5List);
		System.out.println("Expected Voucher:"+expRow5List);

		Thread.sleep(1500);
		


		Thread.sleep(1500);
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
		String expRow6List = "[1.00, 28.00, 29.00, 56.00, 1.00, 1.00, 2.00, 1.00, 1.00, 2.00]";

		System.out.println("Actaul Voucher  :"+actRow6List);
		System.out.println("Expected Voucher:"+expRow6List);

		Thread.sleep(1500);



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


		int reportsRow5ListCount1 = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray1 = new ArrayList<String>();
		for(int i=1;i<reportsRow5ListCount1;i++)
		{
			String data = reportsRow5List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportsRow5ListArray1.add(data);
			}

		}
		String actRow5List1 = reportsRow5ListArray1.toString();
		String expRow5List1 = "[Sub Total, 29.00, 29.00, 29.00, 29.00, 29.00, 29.00, 190]";


		System.out.println(actRow5List1);
		System.out.println(expRow5List1);


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


		int reportsLastRowCount = reportsLastRowList.size();
		ArrayList<String> lastRow = new ArrayList<String>();
		for(int i=1;i<reportsLastRowCount;i++)
		{
			String data = reportsLastRowList.get(i).getText();
			lastRow.add(data);
		}
		
		String actRowList =lastRow.toString();
		String expRowList = "[Grand Total, , , 28.00, 28.00, 52.00, , 26.00, 28.00, 28.00, , , , , , 577, , ]";

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);


		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)&& actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow16List.equalsIgnoreCase(expRow16List) && actAllDatapage1.equalsIgnoreCase(expAllDatapage1) 
				&& actRowList.equalsIgnoreCase(expRowList))

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
		
		ClickUsingJs(vendorDetailsVendorOverdueAnalysisReport);
		
		Thread.sleep(1500);
		IsVisible(vendorListingOfOutstandingBills1stItem);
		Thread.sleep(1500);

		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);

		Thread.sleep(1500);

		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(3000);

		String expRow1List = "[D1D401, D2D402, DebNts:1, NJv:1, OpeBal:1, OpeBal:1, OpeBal:1, PurRet:1, PurVou:1, PurVou:10, PurVou:2, PurVou:6, SubTotal, SubTotal, SubTotal, VendorACCVAC001]";
		Boolean  actRow1List = ListComparisionWOOrder(reportsCol1List,expRow1List);
		
		Thread.sleep(1500);
		
		String expRow3List = "[D1, D1, D1, D2, D2, D2, D2, VendorACC, VendorACC, VendorACC]";
		Boolean  actRow3List = ListComparisionWOOrder(reportsCol3List,expRow3List);

		
		Thread.sleep(1500);
	
		String expRow4List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 29.00, 29.00]";
		Boolean actRow4List = ListComparisionWOOrder(reportsCol4List,expRow4List);

		Thread.sleep(1500);
	
		String expRow5List = "[1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 29.00, 29.00]";
		Boolean actRow5List = ListComparisionWOOrder(reportsCol5List,expRow5List);

		Thread.sleep(1500);
	
		String expRow6List = "[1.00, 29.00, 28.00, 1.00, 1.00, 2.00, 1.00, 1.00, 2.00, 24.00]";
		Boolean actRow6List = ListComparisionWOOrder(reportsCol7List,expRow6List);

		Thread.sleep(1500);

		String expAllDatapage1 = "[D1 [D401], D2 [D402], VendorACC [VAC001]]";
		 boolean actAllDatapage1 = ListComparisionWOOrderBold(stockLedgerTable,expAllDatapage1);
		
		
		Thread.sleep(1500);
		report_NextBtn.click();
		
		

		Thread.sleep(1500);
		String expRowList = "[Grand Total, , , 28.00, 28.00, 52.00, , 26.00, 28.00, 28.00, , , , , , 577, , ]";
		String actRowList = GrandTotalListWithLimitedData(6);

		System.out.println("actRow1List"+actRowList);
		System.out.println("expRow1List"+expRowList);


		if (actRow1List && actRow3List && actRow4List &&
				actRow5List && actRow6List&& actAllDatapage1 
				&& actRowList.equalsIgnoreCase(expRowList))

		{
			return true;
		} 
		else 
		{
			return false;
		}

	
	}
	
	
	public static boolean checkVendorAgeingSummaryAnalysisReport() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummaryMenu));
		vendorSummaryMenu.click();
		
		ClickUsingJs(vendorSummeryVendorAgeingSummaryReport);
		Thread.sleep(1500);
		IsVisible(vendorListingOfOutstandingBills1stItem);
		Thread.sleep(1500);
		
		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		Thread.sleep(1500);
		
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);



		String expcol1List = "[D1, D2, VendorACC, Grand Total]";
		boolean actcol1List = ListComparisionWOOrder(reportsCol1List, expcol1List);


		
		String expcol2List = "[1.00, 29.00, 28.00]";
		boolean actcol2List = ListComparisionWOOrder(reportsCol2List, expcol2List);

		

		String expcol3List = "[29.00, 1.00, 28.00]";
		boolean actcol3List = ListComparisionWOOrder(reportsCol3List, expcol3List);
		
		String expcol6List = "[29.00, 1.00, 28.00]";
		boolean actcol6List = ListComparisionWOOrder(reportsCol6List, expcol6List);

	
	
		if (actcol1List&& actcol2List
				&& actcol3List && actcol6List)
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
	
	}
	
	public static boolean checkVendorSummaryAgeingByDueDateReport() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummaryMenu));
		vendorSummaryMenu.click();
		
		ClickUsingJs(vendorSummeryVendorSummaryAgeingByDueDateReport);
		Thread.sleep(1200);
		IsVisible(vendorListingOfOutstandingBills1stItem);
		Thread.sleep(1500);
		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);
		

		String expcol1List = "[D1, D2, VendorACC, Grand Total]";
		boolean actcol1List = ListComparisionWOOrder(reportsCol1List, expcol1List);


		
		String expcol2List = "[29.00, 1.00, 28.00]";
		boolean actcol2List = ListComparisionWOOrder(reportsCol2List, expcol2List);

		

		String expcol3List = "[29.00, 1.00, 28.00]";
		boolean actcol3List = ListComparisionWOOrder(reportsCol3List, expcol3List);
		
		String expcol6List = "[29.00, 1.00, 28.00]";
		boolean actcol6List = ListComparisionWOOrder(reportsCol6List, expcol6List);

	
	
		if (actcol1List&& actcol2List
				&& actcol3List && actcol6List)
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
	}
	
	public static boolean checkVendorOverDueSummaryReport() throws InterruptedException
	{


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummaryMenu));
		vendorSummaryMenu.click();
		
		ClickUsingJs(vendorSummeryVendorOverdueSummaryReport);
		Thread.sleep(1500);
		IsVisible(vendorListingOfOutstandingBills1stItem);
		Thread.sleep(1500);
		

		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);
		
		

		String expcol1List = "[D1, VendorACC, Grand Total]";
		boolean actcol1List = ListComparisionWOOrder(reportsCol1List, expcol1List);


		
		String expcol2List = "[28.00, 1.00, 27.00]";
		boolean actcol2List = ListComparisionWOOrder(reportsCol2List, expcol2List);

		

		String expcol3List = "[28.00, 1.00, 27.00]";
		boolean actcol3List = ListComparisionWOOrder(reportsCol3List, expcol3List);
		

		if (actcol1List&& actcol2List
				&& actcol3List)
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
		
		ClickUsingJs(vendorSummeryVendorBillWiseSummaryReport);	
		Thread.sleep(1500);
		IsVisible(vendorListingOfOutstandingBills1stItem);
		Thread.sleep(1500);
		
		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);
		
		int reportsRow1ListCount = reportsRow1List.size();
		
		String expcol1List = "[1, 1.00, 2.00, VAC001, VendorACC]";
		boolean actcol1List = ListComparisionWOOrder(reportsRow1List, expcol1List);

		String expcol2List = "[1.00, 2, 30.00, D1, D401]";
		boolean actcol2List = ListComparisionWOOrder(reportsRow2List, expcol2List);

		String expcol3List = "[2.00, 2.00, 3, D2, D402]";
		boolean actcol3List = ListComparisionWOOrder(reportsRow3List, expcol3List);
		
		String expcol4List = "[33.00, 4, 5.00, GrandTotal]";
		boolean actcol4List = ListComparisionWOOrder(reportsRow4List, expcol4List);
		

		if (actcol1List && actcol2List && actcol3List && actcol4List)
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
	}
	
	public static boolean checkLoginWithRER() throws InterruptedException
	{	
		Thread.sleep(2500);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(LogoutDropdown));
		LogoutDropdown.click();
		
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		Thread.sleep(1500);
		
		
		LoginPageOld lp=new LoginPageOld(getDriver()); 

		String unamelt="RER";

		String pawslt="su";

		boolean qflag=true;

		lp.enterUserName(unamelt);

		lp.enterPassword(pawslt);

		Thread.sleep(1600);

		String compname = "UserRestrictions";

		Select oSelect = new Select(companyDropDownList);

		List<WebElement> elementCount = oSelect.getOptions();

		int cqSize = elementCount.size();

		System.out.println("CompanyDropdownList Count :" + cqSize);

		int i;

		for (i = 0; i < elementCount.size(); i++) {

			elementCount.get(i).getText();

			String optionName = elementCount.get(i).getText();
			if (optionName.toUpperCase().startsWith(compname.toUpperCase())) {
				System.out.println("q" + elementCount.get(i).getText());
				elementCount.get(i).click();
			}

		}

		Thread.sleep(1600);

		lp.clickOnSignInBtn();

		Thread.sleep(1600);

		String actUserInfo1=userNameDisplay.getText();

		System.out.println("User Info  : "+actUserInfo1);

		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		companyLogo.click();
		Thread.sleep(1500);

		String getCompanyTxt1=companyName.getText();
		//String getLoginCompanyName1=getCompanyTxt1.substring(0, 16);
		System.out.println("company name  :  "+ getCompanyTxt1);
		companyLogo.click();

		String expUserInfo1           ="RER";
		String expLoginCompanyName1   ="UserRestrictions";
		
		Thread.sleep(1500);
		System.out.println("COMPANY NAME :"+getCompanyTxt1);

		System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
		System.out.println("LoginCompanyName1     : "+getCompanyTxt1    +" Value Expected : "+expLoginCompanyName1);

		if(actUserInfo1.equalsIgnoreCase(expUserInfo1) && getCompanyTxt1.contains(expLoginCompanyName1))
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
		Thread.sleep(1500);
		getDriver().navigate().refresh();
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		ClickUsingJs(trialBalanceReport);
	
		Thread.sleep(1500);
	
		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(5000);
	
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
		
		System.out.println("actRow1List    :"+actRow1List);
		System.out.println("expRow1List    :"+expRow1List);



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
		
		System.out.println("actRow2List    :"+actRow2List);
		System.out.println("expRow2List    :"+expRow2List);



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
		
		System.out.println("actRow3List    :"+actRow3List);
		System.out.println("expRow3List    :"+expRow3List);



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
		
		System.out.println("actRow4List    :"+actRow4List);
		System.out.println("expRow4List    :"+expRow4List);



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
		
		System.out.println("actRow5List    :"+actRow5List);
		System.out.println("expRow5List    :"+expRow5List);
		

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
		
		System.out.println("actRow6List    :"+actRow6List);
		System.out.println("expRow6List    :"+expRow6List);
		
		
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
		
		System.out.println("actRow7List    :"+actRow7List);
		System.out.println("expRow7List    :"+expRow7List);



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
		
		System.out.println("actRow8List    :"+actRow8List);
		System.out.println("expRow8List    :"+expRow8List);



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
		
		System.out.println("actRow9List    :"+actRow9List);
		System.out.println("expRow9List    :"+expRow9List);
		
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

		System.out.println("actRow10List    :"+actRow10List);
		System.out.println("expRow10List    :"+expRow10List);

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

		System.out.println("actRow11List    :"+actRow11List);
		System.out.println("expRow11List    :"+expRow11List);

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

		System.out.println("actRow12List    :"+actRow12List);
		System.out.println("expRow12List    :"+expRow12List);


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

		System.out.println("actRow13List    :"+actRow13List);
		System.out.println("expRow13List    :"+expRow13List);

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
		
		System.out.println("actRow14List    :"+actRow14List);
		System.out.println("expRow14List    :"+expRow14List);
		

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
		
		System.out.println("actRow15List    :"+actRow15List);
		System.out.println("expRow15List    :"+expRow15List);
		
		Thread.sleep(1500);
		report_NextBtn.click();
		Thread.sleep(1500);

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
		String exppage2Row1List = "[Direct Expenses, 091, Direct Expenses, 500.00, 500.00, 505.00, 5.00, 500.00, 500.00, 505.00, 5.00, 96.90, 96.90]";

		System.out.println("actpage2Row1List    :"+actpage2Row1List);
		System.out.println("exppage2Row1List    :"+exppage2Row1List);
				

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
		String exppage2Row2List = "[Purchase, 091-002, Purchase, 495.00, 495.00, 500.00, 5.00, 495.00, 495.00, 500.00, 5.00, 95.93, 95.93]";

		System.out.println("actpage2Row2List    :"+actpage2Row2List);
		System.out.println("exppage2Row2List    :"+exppage2Row2List);
				

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
		String exppage2Row3List = "[Cost of goods sold - Computers, 091-003, Cost of goods sold - Computers, 5.00, 5.00, 5.00, 5.00, 5.00, 5.00, 0.97, 0.97]";

		System.out.println("actpage2Row3List    :"+actpage2Row3List);
		System.out.println("exppage2Row3List    :"+exppage2Row3List);
		
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
		String exppage2Row4List = "[REVENUE, 007, REVENUE, 11.00, 11.00, 5.00, 16.00, 11.00, 11.00, 5.00, 16.00, 2.13, 2.13]";

		System.out.println("actpage2Row4List    :"+actpage2Row4List);
		System.out.println("exppage2Row4List    :"+exppage2Row4List);

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
		String exppage2Row5List = "[SALES, 071, SALES, 11.00, 11.00, 5.00, 16.00, 11.00, 11.00, 5.00, 16.00, 2.13, 2.13]";
		
		System.out.println("actpage2Row5List    :"+actpage2Row5List);
		System.out.println("actpage2Row5List    :"+actpage2Row5List);
		
		
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
		String exppage2Row6List = "[Sales - Computers, 071-001, Sales - Computers, 11.00, 11.00, 5.00, 16.00, 11.00, 11.00, 5.00, 16.00, 2.13, 2.13]";
		
		System.out.println("actpage2Row6List    :"+actpage2Row6List);
		System.out.println("exppage2Row6List    :"+exppage2Row6List);
		


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
		String exppage2Row7List = "[LIABILITIES, 003, LIABILITIES, 500.00, 500.00, 500.00, 500.00, 500.00, 500.00, 96.90, 96.90]";


		System.out.println("actpage2Row7List    :"+actpage2Row7List);
		System.out.println("exppage2Row7List    :"+exppage2Row7List);

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
		String exppage2Row8List = "[D, D400, D, 33.00, 2.00, 31.00, 1.00, 34.00, 33.00, 2.00, 31.00, 1.00, 34.00, 84.62, 84.62]";
		
		
		System.out.println("actpage2Row8List    :"+actpage2Row8List);
		System.out.println("exppage2Row8List    :"+exppage2Row8List);
		
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
		
		System.out.println("actpage2Row9List    :"+actpage2Row9List);
		System.out.println("exppage2Row9List    :"+exppage2Row9List);
		
		
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
		
		System.out.println("actpage2Row10List    :"+actpage2Row10List);
		System.out.println("exppage2Row10List    :"+exppage2Row10List);
		
		
		int reportspage2Row11ListCount = reportsRow11List.size();
		ArrayList<String> reportspage2Row11ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row11ListArray.add(data);
			}

		}
		String actpage2Row11List = reportspage2Row11ListArray.toString();
		String exppage2Row11List = "[VendorACC, VAC001, VendorACC, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00, 1.00]";
		
		System.out.println("actpage2Row11List    :"+actpage2Row11List);
		System.out.println("exppage2Row11List    :"+exppage2Row11List);
		
		int reportspage2Row12ListCount = reportsRow12List.size();
		ArrayList<String> reportspage2Row12ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row12ListCount;i++)
		{
			String data = reportsRow12List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row12ListArray.add(data);
			}

		}
		String actpage2Row12List = reportspage2Row12ListArray.toString();
		String exppage2Row12List = "[Grand Total, 39.00, 39.00, 18.00, 18.00, 51.00, 51.00, 62.00, 62.00, 39.00, 39.00, 18.00, 18.00, 51.00, 51.00, 62.00, 62.00]";
		
		System.out.println("actpage2Row12List    :"+actpage2Row12List);
		System.out.println("exppage2Row12List    :"+exppage2Row12List);
		
		int reportspage2Row13ListCount = reportsRow13List.size();
		ArrayList<String> reportspage2Row13ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row13ListCount;i++)
		{
			String data = reportsRow13List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row13ListArray.add(data);
			}

		}
		String actpage2Row13List = reportspage2Row13ListArray.toString();
		String exppage2Row13List = "";
		
		System.out.println("actpage2Row13List    :"+actpage2Row13List);
		System.out.println("exppage2Row13List    :"+exppage2Row13List);
		
		

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List)&& 
				actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List)&& 
				actRow9List.equalsIgnoreCase(expRow9List) &&
				actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow12List.equalsIgnoreCase(expRow12List) && actRow13List.equalsIgnoreCase(expRow13List)
				&& actRow14List.equalsIgnoreCase(expRow14List) && actRow15List.equalsIgnoreCase(expRow15List)
				
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
	
		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(5000);
		

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
	
	public static boolean checkTradingAccountReport() throws InterruptedException
	{


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tradingAccountReport));
		tradingAccountReport.click();
		
		Thread.sleep(1500);
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);

	
		Thread.sleep(1500);
	

		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(3500);

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
		String expRow2List = "[A, A100, A, 33.00, 4.00, 37.00, 35.00, 2.00, 33.00, 4.00, 37.00, 35.00, 2.00, 84.62, 84.62]";

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
		String expRow3List = "[A1, A101, A1, 33.00, 1.00, 34.00, 34.00, 1.00, 33.00, 1.00, 34.00, 34.00, 1.00, 84.62, 84.62]";



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
		String expRow9List = "[E, E500, E, 6.00, 2.00, 8.00, 12.00, 6.00, 6.00, 2.00, 8.00, 12.00, 6.00, 15.38, 15.38]";
		
		
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
		String expRow10List = "[E1, E501, E1, 6.00, 1.00, 7.00, 11.00, 5.00, 6.00, 1.00, 7.00, 11.00, 5.00, 15.38, 15.38]";



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
		String expRow12List = "[F, F600, F]";



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
		String expRow15List = "[Gross loss, (36.00), (8.00), (44.00), (36.00), (36.00), (8.00), (44.00), (36.00)]";
		
		

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
		String expRow16List = "[Grand Total, 39.00, 39.00, 8.00, 8.00, 45.00, 45.00, 47.00, 47.00, 39.00, 39.00, 8.00, 8.00, 45.00, 45.00, 47.00, 47.00]";
		
		
		
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
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		ClickUsingJs(tradingandProfitAndLossReport);
		

	
		Thread.sleep(1500);
	

		
		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3500);
		

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

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		ClickUsingJs(balanceSheetReport);
	
	
		Thread.sleep(1500);
	

		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(1500);
		
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
		String expRow15List = "[Loss for the period, 34.00, 10.00, 44.00, 34.00, 34.00, 10.00, 44.00, 34.00]";
		
		

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
		
		ClickUsingJs(finalAccountSchedulesReport);
		

		Thread.sleep(1500);
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);
	

		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(3600);

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

		Thread.sleep(1500);
		report_NextBtn.click();
		Thread.sleep(3500);

	

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
		String exppage2Row1List = "[SalesACC, SAC001, SalesACC, 2.00, 1.00, 1.00, 2.00, 2.00, 1.00, 1.00, 2.00, 5.13, 5.13]";
		
		
		System.out.println("actpage2Row1List   :"+actpage2Row1List);
		System.out.println("exppage2Row1List   :"+exppage2Row1List);
		
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
		String exppage2Row2List = "";
		
		System.out.println("actpage2Row2List   :"+actpage2Row2List);
		System.out.println("exppage2Row2List   :"+exppage2Row2List);
		
		

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
		String exppage2Row3List = "";
		
		System.out.println("actpage2Row3List   :"+actpage2Row3List);
		System.out.println("exppage2Row3List   :"+exppage2Row3List);



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
		String exppage2Row4List = "";
		
		System.out.println("actpage2Row4List   :"+actpage2Row4List);
		System.out.println("exppage2Row4List   :"+exppage2Row4List);



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
		String exppage2Row5List = "";
		
		System.out.println("actpage2Row5List   :"+actpage2Row5List);
		System.out.println("exppage2Row5List   :"+exppage2Row5List);



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
		String exppage2Row6List = "";
		
		System.out.println("actpage2Row6List   :"+actpage2Row6List);
		System.out.println("exppage2Row6List   :"+exppage2Row6List);



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
		String exppage2Row7List = "";
		
		System.out.println("actpage2Row7List   :"+actpage2Row7List);
		System.out.println("exppage2Row7List   :"+exppage2Row7List);
		

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
		String exppage2Row8List = "";
		
		System.out.println("actpage2Row8List   :"+actpage2Row8List);
		System.out.println("exppage2Row8List   :"+exppage2Row8List);
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
		String exppage2Row9List = "";
		
		System.out.println("actpage2Row9List   :"+actpage2Row9List);
		System.out.println("exppage2Row9List   :"+exppage2Row9List);



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
		String exppage2Row10List = "";
		
		System.out.println("actpage2Row10List   :"+actpage2Row10List);
		System.out.println("exppage2Row10List   :"+exppage2Row10List);
		
		int reportspage2Row11ListCount = reportsRow11List.size();
		ArrayList<String> reportspage2Row11ListArray = new ArrayList<String>();
		for(int i=1;i<reportspage2Row10ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText().trim();
			if(data.isEmpty() == false)
			{
				reportspage2Row10ListArray.add(data);
			}

		}
		String actpage2Row11List = reportspage2Row11ListArray.toString();
		String exppage2Row11List = "";
		
		System.out.println("actpage2Row11List   :"+actpage2Row11List);
		System.out.println("exppage2Row11List   :"+exppage2Row11List);



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
				&& actRow16List.equalsIgnoreCase(expRow16List) 		
				
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
		
		ClickUsingJs(fundFlowReport);
	
		Thread.sleep(1500);
	
		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(3500);

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
		Thread.sleep(1500);
		getDriver().navigate().refresh();
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		ClickUsingJs(cashFlowReport);
	
		Thread.sleep(1500);
	
		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(3500);
		

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
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(advanceCashFlowReport));
		advanceCashFlowReport.click();
		
		Thread.sleep(1500);

		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);

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
		

		ClickUsingJs(incomeExpenseTrendsReport);
		
		Thread.sleep(1500);
	
		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		Thread.sleep(1500);
		
		ClickUsingJs(selectAllItemsChkBox);
		Thread.sleep(2000);

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);

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
		String expRow1List = "[March-2022, 10.00]";

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
		String expRow2List = "[July-2022, 13.00, 45.00]";

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
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivablePayableReport));
		receivablePayableReport.click();

		Thread.sleep(1500);
	

		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		//sl_DateOptionDropdown.click();
		Thread.sleep(1200);
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
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
	
	public static boolean checkRestrictedLayoutVisibilityInPVForRestrictedVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucher));
		purchaseVoucher.click();
		Thread.sleep(1500);
		IsVisible(newBtn);
		Thread.sleep(2500);
	
		int count = grid_VoucherNoList.size();

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_VoucherNoList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase("1")) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					grid_CheckBoxList.get(i).click();
					break;
				}
			}
		}      

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(printBtn));
		printBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(LayoutNameTxt));
		LayoutNameTxt.click();
		Thread.sleep(1200);
		LayoutNameTxt.sendKeys(Keys.END);
		LayoutNameTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		Thread.sleep(1600);
		LayoutNameTxt.sendKeys("UserRestrictionLayoutFX");
		Thread.sleep(1600);
		LayoutNameTxt.sendKeys(Keys.TAB);
		Thread.sleep(1600);

		Thread.sleep(1600);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(footerPDFBtn));
		footerPDFBtn.click();
		
		
		String expMessage = "You do not have access to this document.";
		String actMessage = checkValidationMessage(expMessage);
		
	if (actMessage.equalsIgnoreCase(expMessage)) 
	{
		return true;
	} 
	else 
	{
		return false;
	}

	}
	
	
	public static boolean checkPrintPDFOfPVForRestrictedLayout() throws InterruptedException, AWTException, IOException
	{
		Thread.sleep(2500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucher));
		purchaseVoucher.click();
		Thread.sleep(2500);
		
		File Efile=new File(getBaseDir()+"\\autoIt\\ExportFiles\\UserRestrictionLayout.pdf");

		if(Efile.exists())
		{
			Efile.delete();
		}

	
		int count = grid_VoucherNoList.size();

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_VoucherNoList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase("9")) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					grid_CheckBoxList.get(i).click();
					break;
				}
			}
		}      

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(printBtn));
		printBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(LayoutNameTxt));
		LayoutNameTxt.click();
		Thread.sleep(1200);
		LayoutNameTxt.sendKeys(Keys.END);
		LayoutNameTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		Thread.sleep(1600);
		LayoutNameTxt.sendKeys("UserRestrictionLayoutFX");
		Thread.sleep(1600);
		LayoutNameTxt.sendKeys(Keys.TAB);
		Thread.sleep(1600);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(footerPDFBtn));
		footerPDFBtn.click();
		
		Thread.sleep(2000);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1600);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(1600);


		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1600);

		Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\UserRestrictionsLayout.exe");

		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1600);

		ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());

		int actOpenWindowsCount = getDriver().getWindowHandles().size();
		int expOpenWindowsCount = 3;

		System.out.println("Number of Windows  : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);

		Thread.sleep(1600);

		getDriver().switchTo().window(openTabs.get(2)).close();
		Thread.sleep(1600);
		getDriver().switchTo().window(openTabs.get(1)).close();
		Thread.sleep(1600);
		getDriver().switchTo().window(openTabs.get(0));


		String actPDF = getBaseDir()+"\\autoIt\\ExportFiles\\UserRestrictionLayout.pdf";
		String expPDF = getBaseDir()+"\\autoIt\\ImportFiles\\UserRestrictionLayout.pdf";

		PDFUtil pdfutil = new PDFUtil();

		boolean result = pdfutil.compare(actPDF, expPDF);

		String actData = pdfutil.getText(actPDF);
		String expData = pdfutil.getText(expPDF);

		System.err.println(actData);
		System.err.println(expData);

		System.out.println("Compared Result  : "+result);
		Thread.sleep(1500);

		if (actData.equalsIgnoreCase(expData) && result==true) 
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

		Thread.sleep(1500);
		
		getDriver().navigate().refresh();
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(LogoutDropdown));
		LogoutDropdown.click();
		 
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		  logoutOption.click();
		  
		  Thread.sleep(1500);
		  
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
