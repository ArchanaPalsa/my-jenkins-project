package com.focus.Pages;

import java.io.IOException;
import java.security.PublicKey;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.focus.base.BaseEngine;

public class TransactionImportPage extends BaseEngine
{
	
	
	
	public static boolean checkTransactionImportofOpeningBalances() throws InterruptedException, IOException
	{
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		ClickUsingJs(homeMenu);
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
		utilities.click();
		
		
		getAction().moveToElement(transactionImport).build().perform();
		Thread.sleep(1200);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
		transactionImport.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
		voucherTypeComboBox.click();
		voucherTypeComboBox.sendKeys("Opening Balances");
		Thread.sleep(2000);
		voucherTypeComboBox.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
		transImpFileNameBtn.click();
		
		Thread.sleep(8000);

  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\OpeningBalancesImport.exe");

  		Thread.sleep(8000);
  		
  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
  		transImpImportBtn.click();
  		
  		
  		getWaitForAlert();
  		
  		String actAlertText = getAlert().getText();
  		String expAlertText1 = "1 Vouchers imported successfully";
  								
  		
  		System.err.println("actAlertText:"+actAlertText);
  		
  		getAlert().accept();
  		
  		if (actAlertText.startsWith(expAlertText1)) 
  		{
			return true;
		} 
  		else 
  		{
  			return false;
		}
  		
	}
	
	
	
	
	
	public static boolean checkImportedOpeningBalances() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(JournalsExpandBtn));
		JournalsExpandBtn.click();

		Thread.sleep(2000);
		scrollToElementJSE(openingBalancesVoucher);
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingBalancesVoucher));
		openingBalancesVoucher.click();
		
		Thread.sleep(20000);

		int count = grid_VoucherNoList.size();
        
        for (int i = 0; i < count; i++) 
        {
            String VoucherNo = grid_VoucherNoList.get(i).getText();
            
            if (VoucherNo.equalsIgnoreCase("1")) 
            {
            	if (grid_CheckBoxList.get(i).isSelected()==false) 
            	{
            		getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
                    break;
				}
            }
        } 
        
       // checkValidationMessage("");
        Thread.sleep(5000);
        String actList1 = listOfElements(VoucherRow1List);
        String expList1 = "[1, Vendor A, 500.00, New Reference]";
        
        String actList2 = listOfElements(VoucherRow2List);
        String expList2 = "[2, Bank, 500.00]";
        
        System.out.println("actList1: "+actList1 +"value expected: "+expList1);
        
        System.out.println("actList2: "+actList2 +"value expected: "+expList2);
        
       if (actList1.equalsIgnoreCase(expList1) && actList2.equalsIgnoreCase(expList2)) 
       {
		 return true;
       } 
       else 
       {
    	   return false;
       }
	}
	
	
	public static boolean checkTransactionImportOfOpeningStocks() throws InterruptedException, IOException
	{

		Thread.sleep(4000);
		getAction().moveToElement(homeMenu).build().perform();
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		ClickUsingJs(homeMenu);
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
		utilities.click();
		
		getAction().moveToElement(transactionImport).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
		transactionImport.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
		voucherTypeComboBox.click();
		voucherTypeComboBox.sendKeys("Opening Stocks");
		Thread.sleep(2000);
		voucherTypeComboBox.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
		transImpFileNameBtn.click();
		
		Thread.sleep(8000);

  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\OpeningStocksImport.exe");

  		Thread.sleep(8000);
  		
  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
  		transImpImportBtn.click();
  		
  		
  		getWaitForAlert();
  		
  		String actAlertText = getAlert().getText();
  		String expAlertText1 = "1 Vouchers imported successfully";
  								
  		
  		System.err.println("actAlertText:"+actAlertText);
  		
  		getAlert().accept();
  		
  		if (actAlertText.startsWith(expAlertText1)) 
  		{
			return true;
		} 
  		else 
  		{
  			return false;
		}
  		
	
	}
	
	
	
	public static boolean checkImportedOpeningStocks() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
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

		int count = grid_VoucherNoList.size();

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_VoucherNoList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase("1")) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
					break;
				}
			}
		} 

		checkValidationMessage("");
		Thread.sleep(2500);
		String actList1 = listOfElements(VoucherRow1List);
		String expList1 = "[1, HYDERABAD, STD RATE COGS ITEM, Dozs, 10.00, 10.00, 100.00]";

		String actList2 = listOfElements(VoucherRow2List);
		String expList2 = "[2, HYDERABAD, STOCK ITEM, Dozs, 10.00, 10.00, 100.00]";

		System.out.println("actList1: "+actList1 +"value expected: "+expList1);

		System.out.println("actList2: "+actList2 +"value expected: "+expList2);

		if (actList1.equalsIgnoreCase(expList1) && actList2.equalsIgnoreCase(expList2)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}

	}
	
	@FindBy(xpath="//a[@id='1']")
	public static WebElement home;
	
	public static boolean checkTransactionImportofNon_StandardJournalEntries() throws InterruptedException, IOException
	{
		Thread.sleep(4000);
		
		//getAction().moveToElement(homeMenu).build().perform();
		getFluentWebDriverWaitN().until(ExpectedConditions.elementToBeClickable(home));
		home.click();
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
		utilities.click();
		
		getAction().moveToElement(transactionImport).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
		transactionImport.click();
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
		voucherTypeComboBox.click();
		voucherTypeComboBox.sendKeys("Non-Standard Journal Entries");
		Thread.sleep(2000);
		voucherTypeComboBox.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
		transImpFileNameBtn.click();
		
		Thread.sleep(8000);

  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\NonStandardJE.exe");

  		Thread.sleep(8000);
  		
  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
  		transImpImportBtn.click();
  		
  		
  		getWaitForAlert();
  		
  		String actAlertText = getAlert().getText();
  		String expAlertText1 = "1 Vouchers imported successfully";
  		
  		System.err.println(" actAlertText "+actAlertText);
  		
  		getAlert().accept();
  		
  		if (actAlertText.startsWith(expAlertText1)) 
  		{
			return true;
		} 
  		else 
  		{
  			return false;
		}
  		
  		
		
	}
	
	
	public static boolean checkNonStandardJEVoucherImported() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(JournalsExpandBtn));
		JournalsExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(non_StandardJournalsExpandBtn));
		non_StandardJournalsExpandBtn.click();
		
		Thread.sleep(2000);

		int count = grid_VoucherNoList.size();
        
        for (int i = 0; i < count; i++) 
        {
            String VoucherNo = grid_VoucherNoList.get(i).getText();
            
            if (VoucherNo.equalsIgnoreCase("1")) 
            {
            	if (grid_CheckBoxList.get(i).isSelected()==false) 
            	{
            		getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
                    break;
				}
            }
        }  
        
    	checkValidationMessage("");
    	
    	Thread.sleep(2500);

		String actList1 = listOfElements(VoucherRow1List);
		String expList1 = "[1, Vendor A, 500.00, New Reference]";

		String actList2 = listOfElements(VoucherRow2List);
		String expList2 = "[2, Bank, 500.00]";

		System.out.println("actList1: "+actList1 +"value expected: "+expList1);

		System.out.println("actList2: "+actList2 +"value expected: "+expList2);

		if (actList1.equalsIgnoreCase(expList1) && actList2.equalsIgnoreCase(expList2)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}


	}

	
	public static boolean checkTransactionImportOfForexJV() throws InterruptedException, IOException
	{
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(home));
		home.click();
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
		utilities.click();
	
		getAction().moveToElement(transactionImport).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
		transactionImport.click();
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
		voucherTypeComboBox.click();
		voucherTypeComboBox.sendKeys("Forex JV");
		Thread.sleep(2000);
		voucherTypeComboBox.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
		transImpFileNameBtn.click();
		
		Thread.sleep(8000);

  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\ForexJVImport.exe");

  		Thread.sleep(8000);
  	
  		ScrollToElement(TIBodyAccountField);
  		Thread.sleep(2000);
  		TIBodyAccountField.click();
  		Thread.sleep(1200);
  		Select account = new Select(BodyAccountField);
  		account.selectByVisibleText("Account-Body");
  		
  	/*
  		Thread.sleep(1200);
  		ScrollToElement(transImpFileNameBtn);
  		
  		Thread.sleep(1200);
  		transImpFileNameBtn.click();*/
  	
  		getAction().moveToElement(transImpImportBtn).build().perform();
  		Thread.sleep(1000);
  		
  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
  		transImpImportBtn.click();
  		
  		
  		getWaitForAlert();
  		
  		String actAlertText = getAlert().getText();
  		String expAlertText1 = "1 Vouchers imported successfully";
  		
  		System.err.println(" actAlertText "+actAlertText);
  		
  		getAlert().accept();
  		
  		if (actAlertText.startsWith(expAlertText1)) 
  		{
			return true;
		} 
  		else 
  		{
  			return false;
		}
  		
  		
		
	}
	
	
	public static boolean checkForexJVImported() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(JournalsExpandBtn));
		JournalsExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ForexJVVoucher));
		ForexJVVoucher.click();
		
		Thread.sleep(2000);

		int count = grid_VoucherNoList.size();
        
        for (int i = 0; i < count; i++) 
        {
            String VoucherNo = grid_VoucherNoList.get(i).getText();
            
            if (VoucherNo.equalsIgnoreCase("1")) 
            {
            	if (grid_CheckBoxList.get(i).isSelected()==false) 
            	{
            		getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
                    break;
				}
            }
        }  
        
    	checkValidationMessage("");
    	Thread.sleep(2500);
		String actList1 = listOfElements(VoucherRow1List);
		String expList1 = "[1, Vendor A, 500.00, New Reference]";

		String actList2 = listOfElements(VoucherRow2List);
		String expList2 = "[2, Cash, 500.00]";

		System.out.println("actList1: "+actList1 +"value expected: "+expList1);

		System.out.println("actList2: "+actList2 +"value expected: "+expList2);

		if (actList1.equalsIgnoreCase(expList1) && actList2.equalsIgnoreCase(expList2)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}


	}

	
	public static boolean checkTransactionImportOfPayments() throws InterruptedException, IOException
	{
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		ClickUsingJs(homeMenu);
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
		utilities.click();
	
		getAction().moveToElement(transactionImport).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
		transactionImport.click();
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
		voucherTypeComboBox.click();
		voucherTypeComboBox.sendKeys("Payments");
		Thread.sleep(2000);
		voucherTypeComboBox.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
		transImpFileNameBtn.click();
		
		Thread.sleep(8000);

  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\PaymentsImport.exe");

  		Thread.sleep(8000);
  	
  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
  		transImpImportBtn.click();
  		
  		
  		getWaitForAlert();
  		
  		String actAlertText = getAlert().getText();
  		String expAlertText1 = "1 Vouchers imported successfully";
  		
  		System.err.println(" actAlertText "+actAlertText);
  		
  		getAlert().accept();
  		
  		if (actAlertText.startsWith(expAlertText1)) 
  		{
			return true;
		} 
  		else 
  		{
  			return false;
		}
  		
  		
		
	}
	
	
	public static boolean checkPaymentsImported() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(paymentsVoucher));
		paymentsVoucher.click();

		Thread.sleep(10000);


		int count = grid_VoucherNoList.size();
        
        for (int i = 0; i < count; i++) 
        {
            String VoucherNo = grid_VoucherNoList.get(i).getText();
            
            if (VoucherNo.equalsIgnoreCase("1")) 
            {
            	if (grid_CheckBoxList.get(i).isSelected()==false) 
            	{
            		getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
                    break;
				}
            }
        }  
        
    	checkValidationMessage("");
    	Thread.sleep(2500);
		String actList1 = listOfElements(VoucherRow1List);
		String expList1 = "[1, STD RATE COGS ACC INV, 1,000.00]";

		String actList2 = listOfElements(VoucherRow2List);
		String expList2 = "[2, Customer A, 100.00, New Reference]";

		System.out.println("actList1: "+actList1 +"value expected: "+expList1);

		System.out.println("actList2: "+actList2 +"value expected: "+expList2);

		if (actList1.equalsIgnoreCase(expList1) && actList2.equalsIgnoreCase(expList2)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}


	}



	public static boolean checkTransactionImportOfReceipts() throws InterruptedException, IOException
	{
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		ClickUsingJs(homeMenu);
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
		utilities.click();
	
		getAction().moveToElement(transactionImport).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
		transactionImport.click();
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
		voucherTypeComboBox.click();
		voucherTypeComboBox.sendKeys("Receipts");
		Thread.sleep(2000);
		voucherTypeComboBox.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
		transImpFileNameBtn.click();
		
		Thread.sleep(8000);

  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\ReceiptsImport.exe");

  		Thread.sleep(8000);
  	
  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
  		transImpImportBtn.click();
  		
  		
  		getWaitForAlert();
  		
  		String actAlertText = getAlert().getText();
  		String expAlertText1 = "1 Vouchers imported successfully";
  		
  		System.err.println(" actAlertText "+actAlertText);
  		
  		getAlert().accept();
  		
  		if (actAlertText.startsWith(expAlertText1)) 
  		{
			return true;
		} 
  		else 
  		{
  			return false;
		}
  		
  		
		
	}
	
	
	public static boolean checkReceiptsImported() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsVoucher));
		receiptsVoucher.click();

		Thread.sleep(2000);


		int count = grid_VoucherNoList.size();
        
        for (int i = 0; i < count; i++) 
        {
            String VoucherNo = grid_VoucherNoList.get(i).getText();
            
            if (VoucherNo.equalsIgnoreCase("1")) 
            {
            	if (grid_CheckBoxList.get(i).isSelected()==false) 
            	{
            		getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
                    break;
				}
            }
        }  
        
    	checkValidationMessage("");
    	Thread.sleep(2500);
		String actList1 = listOfElements(VoucherRow1List);
		String expList1 = "[1, STD RATE COGS ACC INV, 1,000.00]";

		String actList2 = listOfElements(VoucherRow2List);
		String expList2 = "[2, Customer A, 100.00, New Reference]";

		System.out.println("actList1: "+actList1 +"value expected: "+expList1);

		System.out.println("actList2: "+actList2 +"value expected: "+expList2);

		if (actList1.equalsIgnoreCase(expList1) && actList2.equalsIgnoreCase(expList2)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}


	}

	
	public static boolean checkTransactionImportOfSalesInvoices() throws InterruptedException, IOException
	{
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		ClickUsingJs(homeMenu);
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
		utilities.click();
	
		getAction().moveToElement(transactionImport).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
		transactionImport.click();
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
		voucherTypeComboBox.click();
		voucherTypeComboBox.sendKeys("Sales Invoices");
		Thread.sleep(2000);
		voucherTypeComboBox.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
		transImpFileNameBtn.click();
		
		Thread.sleep(8000);

  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\SalesInvoiceImport.exe");

  		Thread.sleep(8000);
  	
  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
  		transImpImportBtn.click();
  		
  		
  		getWaitForAlert();
  		
  		String actAlertText = getAlert().getText();
  		String expAlertText1 = "1 Vouchers imported successfully";
  		
  		System.err.println(" actAlertText "+actAlertText);
  		
  		getAlert().accept();
  		
  		if (actAlertText.startsWith(expAlertText1)) 
  		{
			return true;
		} 
  		else 
  		{
  			return false;
		}
  		
  		
		
	}
	
	
	public static boolean checkSalesInvoicesImported() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialMenu));
		financialMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSales));
		financialsTransactionsSales.click();

		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVoucher));
		salesInvoiceVoucher.click();
		Thread.sleep(8000);

		int count = grid_VoucherNoList.size();
        
        for (int i = 0; i < count; i++) 
        {
            String VoucherNo = grid_VoucherNoList.get(i).getText();
            
            if (VoucherNo.equalsIgnoreCase("1")) 
            {
            	if (grid_CheckBoxList.get(i).isSelected()==false) 
            	{
            		getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
                    break;
				}
            }
        }  
        
    	checkValidationMessage("");
    	Thread.sleep(2500);
		String actList1 = listOfElements(VoucherRow1List);
		String expList1 = "[1, STD RATE COGS ITEM, Sales - Computers, Pcs, 0.00, 5.00, 5.00, 10.00, 10.00, 10.00, 0.00, 10.00, 100.00, 0.00]";

		String actList2 = listOfElements(VoucherRow2List);
		String expList2 = "[2, STOCK ITEM, Sales - Computers, Pcs, 0.00, 5.00, 0.00, 0.83, 0.83, 5.00, 0.00, 10.00, 50.00, 0.00]";

		System.out.println("actList1: "+actList1);
		System.out.println("expList1: "+expList1);

		System.out.println("actList2: "+actList2);
		System.out.println("expList2: "+expList2);

		if (actList1.equalsIgnoreCase(expList1) && actList2.equalsIgnoreCase(expList2)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}


	}
	
	public static boolean checkImportExcessessInStocks() throws IOException, InterruptedException
	{

		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		ClickUsingJs(homeMenu);
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
		utilities.click();
	
		getAction().moveToElement(transactionImport).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
		transactionImport.click();
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
		voucherTypeComboBox.click();
		voucherTypeComboBox.sendKeys("Excesses in Stocks");
		Thread.sleep(2000);
		voucherTypeComboBox.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
		transImpFileNameBtn.click();
		
		Thread.sleep(8000);

  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\ExcessInStocksImport.exe");

  		Thread.sleep(8000);
  	
  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
  		transImpImportBtn.click();
  		
  		
  		getWaitForAlert();
  		
  		String actAlertText = getAlert().getText();
  		String expAlertText1 = "1 Vouchers imported successfully";
  		
  		System.err.println(" actAlertText "+actAlertText);
  		
  		getAlert().accept();
  		
  		if (actAlertText.startsWith(expAlertText1)) 
  		{
			return true;
		} 
  		else 
  		{
  			return false;
		}
  	
	}
	
	public static boolean checkImportedExcessInStocks() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorystocks));
		inventorystocks.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryExcessInStocks));
		inventoryExcessInStocks.click();
		
		Thread.sleep(2000);

		int count = grid_VoucherNoList.size();
        
        for (int i = 0; i < count; i++) 
        {
            String VoucherNo = grid_VoucherNoList.get(i).getText();
            
            if (VoucherNo.equalsIgnoreCase("1")) 
            {
            	if (grid_CheckBoxList.get(i).isSelected()==false) 
            	{
            		getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
                    break;
				}
            }
        } 
        
        checkValidationMessage("");
        
        String actList1 = listOfElements(VoucherRow1List);
        String expList1 = "[1, HYDERABAD, STD RATE COGS ITEM, Dozs, 10.00, 100.00, 1,000.00]";
        
        String actList2 = listOfElements(VoucherRow2List);
        String expList2 = "[2, HYDERABAD, BATCH BR ITEM, Dozs, 10.00, 100.00, 1,000.00, 12]";
        
        String actList3 = listOfElements(VoucherRow3List);
        String expList3 = "[3, HYDERABAD, STD RATE COGS ITEM, Dozs, 10.00, 10.00, 100.00]";
        
        String actList4 = listOfElements(VoucherRow4List);
        String expList4 = "[4, HYDERABAD, WA COGS ITEM, Pcs, 3.00, 10.00, 30.00, rma1,rma2,rma3]";
        
        String actList5 = listOfElements(VoucherRow5List);
        String expList5 = "[5, HYDERABAD, FIFO COGS ITEM, Dozs, 2.00, 20.00, 40.00, Bin4]";
        
        System.out.println("actList1: "+actList1);
        System.out.println("expList1: "+expList1);

        System.out.println("actList2: "+actList2);
        System.out.println("expList2: "+expList2);


        System.out.println("actList3: "+actList3);
        System.out.println("expList3: "+expList3);

        System.out.println("actList4: "+actList4);
        System.out.println("expList4: "+expList4);
        
        System.out.println("actList5: "+actList5);
        System.out.println("expList5: "+expList5);

       if (actList1.equalsIgnoreCase(expList1) && actList2.equalsIgnoreCase(expList2) 
    		   && actList3.equalsIgnoreCase(expList3) && actList4.equalsIgnoreCase(expList4)
    		   && actList5.equalsIgnoreCase(expList5)) 
       {
		 return true;
       } 
       else 
       {
    	   return false;
       }
	}

	
	public static boolean checkImportSalesInvoicesWithSpecialChars() throws IOException, InterruptedException
	{

		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		ClickUsingJs(homeMenu);
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
		utilities.click();
	
		getAction().moveToElement(transactionImport).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
		transactionImport.click();
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
		voucherTypeComboBox.click();
		voucherTypeComboBox.sendKeys("Sales Invoices");
		Thread.sleep(2000);
		voucherTypeComboBox.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
		transImpFileNameBtn.click();
		
		Thread.sleep(8000);

  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\SalesInvoicesSpclImport.exe");

  		Thread.sleep(8000);
  	
  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
  		transImpImportBtn.click();
  		
  		
  		getWaitForAlert();
  		
  		String actAlertText = getAlert().getText();
  		String expAlertText1 = "1 Vouchers imported successfully";
  		
  		System.err.println(" actAlertText "+actAlertText);
  		
  		getAlert().accept();
  		
  		if (actAlertText.startsWith(expAlertText1)) 
  		{
			return true;
		} 
  		else 
  		{
  			return false;
		}
  		
  		
	}
	
	
	@FindBy(xpath="//*[@id='id_header_67108884']")
	public static WebElement narrationTxt;
	
	
	public static boolean checkImportedSalesInvoicesWithSpclChars() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialMenu));
		financialMenu.click();

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSales));
		financialsTransactionsSales.click();

		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVoucher));
		salesInvoiceVoucher.click();

		Thread.sleep(10000);
		
		int count = grid_VoucherNoList.size();
        
        for (int i = 0; i < count; i++) 
        {
            String VoucherNo = grid_VoucherNoList.get(i).getText();
            
            if (VoucherNo.equalsIgnoreCase("2")) 
            {
            	if (grid_CheckBoxList.get(i).isSelected()==false) 
            	{
            		getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
                    break;
				}
            }
        }  
        
        Thread.sleep(2500);
    	checkValidationMessage("");
    	
    	String ActNarrationTxt = narrationTxt.getAttribute("value");
    	String ExpNarrationTxt = "SalInv:2";
    	
    	
    	
    	System.out.println("ActNarrationTxt:"+ActNarrationTxt);
    	System.out.println("ExpNarrationTxt:"+ExpNarrationTxt);
    	

		String actList1 = listOfElements(VoucherRow1List);
		String expList1 = "[1, STD RATE COGS ITEM, Sales - Computers, Pcs, 0.00, 5.00, 5.00, 10.00, 10.00, 10.00, 0.00, 10.00, 100.00, 0.00]";

		String actList2 = listOfElements(VoucherRow2List);
		String expList2 = "[2, STOCK ITEM, Sales - Computers, Pcs, 0.00, 5.00, 0.00, 0.83, 0.83, 5.00, 0.00, 10.00, 50.00, 0.00]";

		System.out.println("actList1: "+actList1);
		System.out.println("expList1: "+expList1);

		System.out.println("actList2: "+actList2);
		System.out.println("expList2: "+expList2);
		
		if (ActNarrationTxt.equalsIgnoreCase(ExpNarrationTxt) && actList1.equalsIgnoreCase(expList1) && actList2.equalsIgnoreCase(expList2)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	
	public static boolean checkTransactionImportOfOpeningStocksofAllItems() throws InterruptedException, IOException
	{

		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		ClickUsingJs(homeMenu);
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
		utilities.click();
		
		getAction().moveToElement(transactionImport).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
		transactionImport.click();
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
		voucherTypeComboBox.click();
		voucherTypeComboBox.sendKeys("Opening Stocks");
		Thread.sleep(2000);
		voucherTypeComboBox.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
		transImpFileNameBtn.click();
		
		Thread.sleep(8000);

  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\OpeningStocksImportofAlItems.exe");

  		Thread.sleep(8000);
  		
  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
  		transImpImportBtn.click();
  		
  		
  		getWaitForAlert();
  		
  		String actAlertText = getAlert().getText();
  		String expAlertText1 = "1 Vouchers imported successfully";
  								
  		
  		System.err.println("actAlertText:"+actAlertText);
  		
  		getAlert().accept();
  		
  		if (actAlertText.startsWith(expAlertText1)) 
  		{
			return true;
		} 
  		else 
  		{
  			return false;
		}
  		
	
	}
	
	
	
	public static boolean checkImportedOpeningStocksofAllItems() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
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

		int count = grid_VoucherNoList.size();

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_VoucherNoList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase("2")) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
					break;
				}
			}
		} 

		checkValidationMessage("");

		String actList1 = listOfElements(VoucherRow1List);
		String expList1 = "[1, HYDERABAD, STD RATE COGS ITEM, Dozs, 10.00, 10.00, 100.00]";

		String actList2 = listOfElements(VoucherRow2List);
		String expList2 = "[2, HYDERABAD, BATCH BR ITEM, Dozs, 10.00, 10.00, 100.00, B5, 03/03/2025]";

		String actList3 = listOfElements(VoucherRow3List);
		String expList3 = "[3, HYDERABAD, WA COGS ITEM, Pcs, 3.00, 10.00, 30.00, rmaOS1, rmaOS2, rmaOS3]";

		String actList4 = listOfElements(VoucherRow4List);
		String expList4 = "[4, HYDERABAD, FIFO COGS ITEM, Dozs, 2.00, 10.00, 20.00, Bin4]";



		System.out.println("actList1: "+actList1);
		System.out.println("expList1: "+expList1);

		System.out.println("actList2: "+actList2);
		System.out.println("expList2: "+expList2);


		System.out.println("actList3: "+actList3);
		System.out.println("expList3: "+expList3);

		System.out.println("actList4: "+actList4);
		System.out.println("expList4: "+expList4);

		
		if (actList1.equalsIgnoreCase(expList1) && actList2.equalsIgnoreCase(expList2) 
				&& actList3.equalsIgnoreCase(expList3) && actList4.equalsIgnoreCase(expList4)
				) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}

	
	public static boolean checkTransactionImportOfOpeningStocksNewofAllItems() throws InterruptedException, IOException
	{

		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		ClickUsingJs(homeMenu);
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
		utilities.click();
		
		getAction().moveToElement(transactionImport).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
		transactionImport.click();
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
		voucherTypeComboBox.click();
		voucherTypeComboBox.sendKeys("Opening Stocks New");
		Thread.sleep(2000);
		voucherTypeComboBox.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
		transImpFileNameBtn.click();
		
		Thread.sleep(8000);

  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\OpeningStocksNewImport.exe");

  		Thread.sleep(8000);
  		
  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
  		transImpImportBtn.click();
  		
  		
  		getWaitForAlert();
  		
  		String actAlertText = getAlert().getText();
  		String expAlertText1 = "1 Vouchers imported successfully";
  								
  		
  		System.err.println("actAlertText:"+actAlertText);
  		
  		getAlert().accept();
  		
  		if (actAlertText.startsWith(expAlertText1)) 
  		{
			return true;
		} 
  		else 
  		{
  			return false;
		}
  		
	
	}
	
	
	
	public static boolean checkImportedOpeningStocksNewofAllItems() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorystocks));
		inventorystocks.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryopeningstocksNew));
		inventoryopeningstocksNew.click();

		Thread.sleep(8000);

		int count = grid_VoucherNoList.size();

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_VoucherNoList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase("1")) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
					break;
				}
			}
		} 
		
		Thread.sleep(4200);

		checkValidationMessage("");

		String actList1 = listOfElements(VoucherRow1List);
		String expList1 = "[1, STD RATE COGS ITEM, Dozs, 10.00, 10.00, 100.00]";

		String actList2 = listOfElements(VoucherRow2List);
		String expList2 = "[2, BATCH BR ITEM, Dozs, 10.00, 10.00, 100.00, B5, 03/03/2025]";

		String actList3 = listOfElements(VoucherRow3List);
		String expList3 = "[3, WA COGS ITEM, Pcs, 3.00, 10.00, 30.00, rmaOSN1, rmaOSN2, rmaOSN3]";

		String actList4 = listOfElements(VoucherRow4List);
		String expList4 = "[4, FIFO COGS ITEM, Dozs, 2.00, 10.00, 20.00, Bin4]";



		System.out.println("actList1: "+actList1);
		System.out.println("expList1: "+expList1);

		System.out.println("actList2: "+actList2);
		System.out.println("expList2: "+expList2);


		System.out.println("actList3: "+actList3);
		System.out.println("expList3: "+expList3);

		System.out.println("actList4: "+actList4);
		System.out.println("expList4: "+expList4);

		
		if (actList1.equalsIgnoreCase(expList1) && actList2.equalsIgnoreCase(expList2) 
				&& actList3.equalsIgnoreCase(expList3) && actList4.equalsIgnoreCase(expList4)
				) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}

	
	
	public static boolean checkTransactionImportOfPurchasesVouchers() throws InterruptedException, IOException
	{

		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		ClickUsingJs(homeMenu);
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
		utilities.click();
		
		getAction().moveToElement(transactionImport).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
		transactionImport.click();
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
		voucherTypeComboBox.click();
		voucherTypeComboBox.sendKeys("Purchases Vouchers");
		Thread.sleep(2000);
		voucherTypeComboBox.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
		transImpFileNameBtn.click();
		
		Thread.sleep(8000);

  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\PurchaseVoucherImport.exe");

  		Thread.sleep(8000);
  		
  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
  		transImpImportBtn.click();
  		
  		
  		getWaitForAlert();
  		
  		String actAlertText = getAlert().getText();
  		String expAlertText1 = "1 Vouchers imported successfully";
  								
  		
  		System.err.println("actAlertText:"+actAlertText);
  		
  		getAlert().accept();
  		
  		if (actAlertText.startsWith(expAlertText1)) 
  		{
			return true;
		} 
  		else 
  		{
  			return false;
		}
  		
	
	}
	
	
	
	public static boolean checkImportedPurchasesVoucher() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(2500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesVouchersMenu));
		purchasesVouchersMenu.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersBtn));
		purchaseVouchersBtn.click();

		Thread.sleep(8000);

		Thread.sleep(2000);

		int count = grid_VoucherNoList.size();

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_VoucherNoList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase("1")) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
					break;
				}
			}
		} 

		Thread.sleep(3500);
		checkValidationMessage("");

		String actList1 = listOfElements(VoucherRow1List);
		String expList1 = "[1, HYDERABAD, STD RATE COGS ITEM, Dozs, 0.00, 10.00, 10.00, 100.00, 0.00]";

		String actList2 = listOfElements(VoucherRow2List);
		String expList2 = "[2, HYDERABAD, BATCH BR ITEM, Dozs, 0.00, 10.00, 5.00, 50.00, 0.00, BATCHPV, "+getCurrentDateF2()+"]";

		String actList3 = listOfElements(VoucherRow3List);
		String expList3 = "[3, HYDERABAD, WA COGS ITEM, Pcs, 0.00, 5.00, 5.00, 50.00, 0.00, pvrma1,pvrma2,pvrma3,pvrma4,pvrma5]";

		String actList4 = listOfElements(VoucherRow4List);
		String expList4 = "[4, HYDERABAD, FIFO COGS ITEM, Dozs, 0.00, 2.00, 10.00, 20.00, 0.00, Bin4]";



		System.out.println("actList1: "+actList1);
		System.out.println("expList1: "+expList1);

		System.out.println("actList2: "+actList2);
		System.out.println("expList2: "+expList2);


		System.out.println("actList3: "+actList3);
		System.out.println("expList3: "+expList3);

		System.out.println("actList4: "+actList4);
		System.out.println("expList4: "+expList4);

		
		if (actList1.equalsIgnoreCase(expList1) && actList2.equalsIgnoreCase(expList2) 
				&& actList3.equalsIgnoreCase(expList3) && actList4.equalsIgnoreCase(expList4)
				) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}


	public static boolean checkTransactionImportOfPurchasesVouchersN() throws InterruptedException, IOException
	{

		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		ClickUsingJs(homeMenu);
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
		utilities.click();
		
		getAction().moveToElement(transactionImport).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
		transactionImport.click();
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
		voucherTypeComboBox.click();
		voucherTypeComboBox.sendKeys("Purchase Vouchers N");
		Thread.sleep(2000);
		voucherTypeComboBox.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
		transImpFileNameBtn.click();
		
		Thread.sleep(8000);

  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\PurchaseVoucherNImport.exe");

  		Thread.sleep(8000);
  		
  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
  		transImpImportBtn.click();
  		
  		
  		getWaitForAlert();
  		
  		String actAlertText = getAlert().getText();
  		String expAlertText1 = "1 Vouchers imported successfully";
  								
  		
  		System.err.println("actAlertText:"+actAlertText);
  		
  		getAlert().accept();
  		
  		if (actAlertText.startsWith(expAlertText1)) 
  		{
			return true;
		} 
  		else 
  		{
  			return false;
		}
  		
	
	}
	
	
	
	public static boolean checkImportedPurchasesVoucherN() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		Thread.sleep(2500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesVouchersMenu));
		purchasesVouchersMenu.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchasesVoucherN));
		financialsTransactionsPurchasesVoucherN.click();

		Thread.sleep(3500);

		Thread.sleep(2000);

		int count = grid_VoucherNoList.size();

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_VoucherNoList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase("1")) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
					break;
				}
			}
		} 

		checkValidationMessage("");

		String actList1 = listOfElements(VoucherRow1List);
		String expList1 = "[1, STD RATE COGS ITEM, Dozs, 0.00, 10.00, 10.00, 10.00, 100.00, 0.00]";

		String actList2 = listOfElements(VoucherRow2List);
		String expList2 = "[2, BATCH BR ITEM, Dozs, 0.00, 0.00, 10.00, 5.00, 50.00, 0.00]";

		String actList3 = listOfElements(VoucherRow3List);
		String expList3 = "[3, WA COGS ITEM, Pcs, 0.00, 36.25, 5.00, 5.00, 50.00, 0.00]";

		String actList4 = listOfElements(VoucherRow4List);
		String expList4 = "[4, FIFO COGS ITEM, Dozs, 0.00, 1.04, 2.00, 10.00, 20.00, 0.00]";



		System.out.println("actList1: "+actList1);
		System.out.println("expList1: "+expList1);

		System.out.println("actList2: "+actList2);
		System.out.println("expList2: "+expList2);


		System.out.println("actList3: "+actList3);
		System.out.println("expList3: "+expList3);

		System.out.println("actList4: "+actList4);
		System.out.println("expList4: "+expList4);

		
		if (actList1.equalsIgnoreCase(expList1) && actList2.equalsIgnoreCase(expList2) 
				&& actList3.equalsIgnoreCase(expList3) && actList4.equalsIgnoreCase(expList4)
				) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}

	public static boolean checkTransactionImportOfMaterialReceiptsNotes() throws InterruptedException, IOException
	{

		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		ClickUsingJs(homeMenu);
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
		utilities.click();
		
		getAction().moveToElement(transactionImport).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
		transactionImport.click();
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
		voucherTypeComboBox.click();
		voucherTypeComboBox.sendKeys("Material Receipt Notes");
		Thread.sleep(2000);
		voucherTypeComboBox.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
		transImpFileNameBtn.click();
		
		Thread.sleep(8000);

  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\MaterialReceiptsNotesImport.exe");

  		Thread.sleep(8000);
  		
  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
  		transImpImportBtn.click();
  		
  		
  		getWaitForAlert();
  		
  		String actAlertText = getAlert().getText();
  		String expAlertText1 = "1 Vouchers imported successfully";
  								
  		
  		System.err.println("actAlertText:"+actAlertText);
  		
  		getAlert().accept();
  		
  		if (actAlertText.startsWith(expAlertText1)) 
  		{
			return true;
		} 
  		else 
  		{
  			return false;
		}
  		
	
	}
	
	
	
	public static boolean checkImportedMaterialReceiptsNotes() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(materialReceiptNotesVoucher));
		materialReceiptNotesVoucher.click();

		Thread.sleep(3500);

		Thread.sleep(2000);

		int count = grid_VoucherNoList.size();

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_VoucherNoList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase("1")) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
					break;
				}
			}
		} 

		checkValidationMessage("");

		String actList1 = listOfElements(VoucherRow1List);
		String expList1 = "[1, HYDERABAD, STD RATE COGS ITEM, Dozs, 0.00, 10.00, 10.00, 100.00]";

		String actList2 = listOfElements(VoucherRow2List);
		String expList2 = "[2, HYDERABAD, BATCH BR ITEM, Dozs, 0.00, 10.00, 5.00, 50.00, BATCHMRN, "+getCurrentDateF2()+"]";

		String actList3 = listOfElements(VoucherRow3List);
		String expList3 = "[3, HYDERABAD, WA COGS ITEM, Pcs, 0.00, 5.00, 5.00, 50.00, MR1,MR2,MR3,MR4,MR5]";

		String actList4 = listOfElements(VoucherRow4List);
		String expList4 = "[4, HYDERABAD, FIFO COGS ITEM, Dozs, 0.00, 2.00, 10.00, 20.00, Bin4]";



		System.out.println("actList1: "+actList1);
		System.out.println("expList1: "+expList1);

		System.out.println("actList2: "+actList2);
		System.out.println("expList2: "+expList2);


		System.out.println("actList3: "+actList3);
		System.out.println("expList3: "+expList3);

		System.out.println("actList4: "+actList4);
		System.out.println("expList4: "+expList4);

		
		if (actList1.equalsIgnoreCase(expList1) && actList2.equalsIgnoreCase(expList2) 
				&& actList3.equalsIgnoreCase(expList3) && actList4.equalsIgnoreCase(expList4)
				) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}

	
	public static boolean checkImportRMAWithSpaceBeforeRmaNumberOdOpeningStockV() throws IOException, InterruptedException
	{

		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		ClickUsingJs(homeMenu);
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
		utilities.click();
		
		
		getAction().moveToElement(transactionImport).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
		transactionImport.click();
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
		voucherTypeComboBox.click();
		voucherTypeComboBox.sendKeys("Opening Stocks New");
		Thread.sleep(2000);
		voucherTypeComboBox.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
		transImpFileNameBtn.click();
		
		Thread.sleep(8000);

  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\SpaceBeforeRmaNos.exe");

  		Thread.sleep(8000);
  		
  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
  		transImpImportBtn.click();
  		
  		
  		getWaitForAlert();
  		
  		String actAlertText = getAlert().getText();
  		String expAlertText1 = "1 Vouchers imported successfully";
  								
  		
  		System.err.println("actAlertText:"+actAlertText);
  		
  		getAlert().accept();
  		
  		if (actAlertText.startsWith(expAlertText1)) 
  		{
			return true;
		} 
  		else 
  		{
  			return false;
		}
  		
	}
	
	public static boolean checkImportedOpeningStocksNewVoucher() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorystocks));
		inventorystocks.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryopeningstocksNew));
		inventoryopeningstocksNew.click();

		Thread.sleep(2000);

		int count = grid_VoucherNoList.size();

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_VoucherNoList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase("2")) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
					break;
				}
			}
		} 

		checkValidationMessage("");

		String actList1 = listOfElements(VoucherRow1List);
		String expList1 = "[1, STD RATE COGS ITEM, Dozs, 10.00, 10.00, 100.00]";

		String actList2 = listOfElements(VoucherRow2List);
		String expList2 = "[2, BATCH BR ITEM, Dozs, 10.00, 10.00, 100.00, B5, 29/01/2024]";

		String actList3 = listOfElements(VoucherRow3List);
		String expList3 = "[3, WA COGS ITEM, Pcs, 2.00, 10.00, 20.00, Rma@2, Rma@1]";

		String actList4 = listOfElements(VoucherRow4List);
		String expList4 = "[4, FIFO COGS ITEM, Dozs, 2.00, 10.00, 20.00, Bin4]";



		System.out.println("actList1: "+actList1);
		System.out.println("expList1: "+expList1);

		System.out.println("actList2: "+actList2);
		System.out.println("expList2: "+expList2);


		System.out.println("actList3: "+actList3);
		System.out.println("expList3: "+expList3);

		System.out.println("actList4: "+actList4);
		System.out.println("expList4: "+expList4);

		
		if (actList1.equalsIgnoreCase(expList1) && actList2.equalsIgnoreCase(expList2) 
				&& actList3.equalsIgnoreCase(expList3) && actList4.equalsIgnoreCase(expList4)
				) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
	}
	
	

	public static boolean checkImportRMAWithoutGivingRmaNumberOpeningStockV() throws IOException, InterruptedException
	{

		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		ClickUsingJs(homeMenu);
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
		utilities.click();
		
		
		getAction().moveToElement(transactionImport).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
		transactionImport.click();
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
		voucherTypeComboBox.click();
		voucherTypeComboBox.sendKeys("Opening Stocks New");
		Thread.sleep(2000);
		voucherTypeComboBox.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
		transImpFileNameBtn.click();
		
		Thread.sleep(8000);

  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\ImportOSVchrWithoutRmaNos.exe");

  		Thread.sleep(8000);
  		
  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
  		transImpImportBtn.click();
  		
  		Thread.sleep(2000);
  		
  		getWaitForAlert();
  		
  		String actAlertText = getAlert().getText();
  		String expAlertText1 = "                   "
  				               + "1 Vouchers importing failed : 1"+"\r\n"
  				               + "Failed Details : RMA not provided for item - WA COGS ITEM."+"\r\n"
  				               + "RMANotProvided";
  							
  		
  		System.err.println("actAlertText:"+actAlertText);
  		
  		System.err.println("expAlertText:"+expAlertText1);
  		
  		
  		
  		getAlert().accept();
  		
  		Thread.sleep(2800);
  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\logpopupBalnkRMA.exe");

  		Thread.sleep(2800);
  		
  		if (actAlertText.equals(expAlertText1)) 
  		{
			return true;
		} 
  		else 
  		{
  			return false;
		}
  		
	}
	
	public static boolean checkImportedOpeningStocksNewVoucher2() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorystocks));
		inventorystocks.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryopeningstocksNew));
		inventoryopeningstocksNew.click();

		Thread.sleep(2000);

		int count = grid_VoucherNoList.size();

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_VoucherNoList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase("3")) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
					break;
				}
			}
		} 

		checkValidationMessage("");

		String actList1 = listOfElements(VoucherRow1List);
		String expList1 = "[1, STD RATE COGS ITEM, Dozs, 10.00, 10.00, 100.00]";

		String actList2 = listOfElements(VoucherRow2List);
		String expList2 = "[2, BATCH BR ITEM, Dozs, 10.00, 10.00, 100.00, B5, 29/01/2024]";

		String actList3 = listOfElements(VoucherRow3List);
		String expList3 = "[3, WA COGS ITEM, Pcs, 4.00, 10.00, 40.00]";

		String actList4 = listOfElements(VoucherRow4List);
		String expList4 = "[4, FIFO COGS ITEM, Dozs, 2.00, 10.00, 20.00, Bin4]";



		System.out.println("actList1: "+actList1);
		System.out.println("expList1: "+expList1);

		System.out.println("actList2: "+actList2);
		System.out.println("expList2: "+expList2);


		System.out.println("actList3: "+actList3);
		System.out.println("expList3: "+expList3);

		System.out.println("actList4: "+actList4);
		System.out.println("expList4: "+expList4);

		
		if (actList1.equalsIgnoreCase(expList1) && actList2.equalsIgnoreCase(expList2) 
				&& actList3.equalsIgnoreCase(expList3) && actList4.equalsIgnoreCase(expList4)
				) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
	}
	
	
	public static boolean checkImportRMAWithSpclCharRmaNumberOpeningStockV() throws IOException, InterruptedException
	{

		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		ClickUsingJs(homeMenu);
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
		utilities.click();
		
		getAction().moveToElement(transactionImport).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionImport));
		transactionImport.click();
		
		Thread.sleep(5000);
		
		getWebDriverWaitEle(voucherTypeComboBox);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeComboBox));
		voucherTypeComboBox.click();
		voucherTypeComboBox.sendKeys("Opening Stocks New");
		Thread.sleep(2000);
		voucherTypeComboBox.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpFileNameBtn));
		transImpFileNameBtn.click();
		
		Thread.sleep(8000);

  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\SpecialCharsRmaImport.exe");

  		Thread.sleep(8000);
  		
  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transImpImportBtn));
  		transImpImportBtn.click();
  		
  		
  		getWaitForAlert();
  		
  		String actAlertText = getAlert().getText();
  		String expAlertText1 = "1 Vouchers imported successfully";
  								
  		
  		System.err.println("actAlertText:"+actAlertText);
  		
  		getAlert().accept();
  		
  		if (actAlertText.startsWith(expAlertText1)) 
  		{
			return true;
		} 
  		else 
  		{
  			return false;
		}
  		
	}
	
	public static boolean checkImportedOpeningStocksNewVoucher3() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorystocks));
		inventorystocks.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryopeningstocksNew));
		inventoryopeningstocksNew.click();

		Thread.sleep(2000);

		int count = grid_VoucherNoList.size();

		for (int i = 0; i < count; i++) 
		{
			String VoucherNo = grid_VoucherNoList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase("4")) 
			{
				if (grid_CheckBoxList.get(i).isSelected()==false) 
				{
					getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
					break;
				}
			}
		} 

		checkValidationMessage("");

		String actList1 = listOfElements(VoucherRow1List);
		String expList1 = "[1, STD RATE COGS ITEM, Dozs, 10.00, 10.00, 100.00]";

		String actList2 = listOfElements(VoucherRow2List);
		String expList2 = "[2, BATCH BR ITEM, Dozs, 10.00, 10.00, 100.00, B5, 29/01/2024]";

		String actList3 = listOfElements(VoucherRow3List);
		String expList3 = "[3, WA COGS ITEM, Pcs, 1.00, 10.00, 10.00, 4578412]";

		String actList4 = listOfElements(VoucherRow4List);
		String expList4 = "[4, FIFO COGS ITEM, Dozs, 2.00, 10.00, 20.00, Bin4]";



		System.out.println("actList1: "+actList1);
		System.out.println("expList1: "+expList1);

		System.out.println("actList2: "+actList2);
		System.out.println("expList2: "+expList2);


		System.out.println("actList3: "+actList3);
		System.out.println("expList3: "+expList3);

		System.out.println("actList4: "+actList4);
		System.out.println("expList4: "+expList4);

		
		if (actList1.equalsIgnoreCase(expList1) && actList2.equalsIgnoreCase(expList2) 
				&& actList3.equalsIgnoreCase(expList3) && actList4.equalsIgnoreCase(expList4)
				) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
	}
	
	public static boolean checkWhetherIncludePendingSalesOrdersValueChckbxAndCreditLimitInOrdersEnabled() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(1000);
		ClickUsingJs(settingsmenuBtn);		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PreferencesBtn));
		PreferencesBtn.click();		
		Thread.sleep(1000);
		
		Thread.sleep(1500);
		ClickUsingJs(ARAPBtn);
		Thread.sleep(1500);

		if (enableCreditCheckBoxS.isSelected() == false) {
			enableCreditCheckBox.click();
		}		
	
	
		Thread.sleep(1000);
		if(IncludePendingSalesOrderValueInCreditLimitCheckchckbx.isSelected() == false) 
		{
			IncludePendingSalesOrderValueInCreditLimitCheckchckbx.click();
		}
		
		Thread.sleep(1000);
		if(CheckcreditlimitinordersCheckbx.isSelected() == false) 
		{
			CheckcreditlimitinordersCheckbx.click();
		}
		
		Thread.sleep(1200);
		whenCreditLimitexceeded_WarnAndAllowRadio.click();
		
		ClickUsingJs(updateBtnInDc);
		Thread.sleep(1200);

		String actAlertMgs  =getAlert().getText();
		String expAlertMgs="There are entries in Reference table, You are not allow to change the preference for AR/AP fields";
		Thread.sleep(1200);
		System.out.println("actAlertMgs   :"+actAlertMgs);
		System.out.println("expAlertMgs   :"+expAlertMgs);
		Thread.sleep(1200);
		getAlert().accept();
		
		
		Thread.sleep(2500);
		getAlert().accept();

		Thread.sleep(1500);
		
		String expSaveMessage = "Data saved Successfully";
		String actSaveMessage = checkValidationMessage(expSaveMessage);
		
		if (actSaveMessage.equalsIgnoreCase(expSaveMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
		
	}
	

	public static boolean checkCreateAnAccountWithSomeCreditLimit() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		ClickUsingJs(homeMenu);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(3000);
		
		checkValidationMessage("");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));		
		masterNewBtn.click();

		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		nameTxt.clear();
		nameTxt.sendKeys("CreditLimitSales");
		nameTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("CLS");
		codeTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);


		Select actype = new Select(accountTypeDropdown);
		actype.selectByVisibleText("Customer");	
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditLimitTxt));
		creditLimitTxt.click();
		creditLimitTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(1000);
		creditLimitTxt.sendKeys("150");
		creditLimitTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();

		String expMessage="Saved Successfully";

		String actMessage=checkValidationMessage(expMessage);


		Thread.sleep(2500);
		closeBtn.click();
		Thread.sleep(2500);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	public static boolean checkCreateOpeningStockVoucher() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
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

		Thread.sleep(2000);getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();


		
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.sendKeys("Hyderabad");
		Thread.sleep(1800); 	
		enter_WarehouseTxt.sendKeys(Keys.TAB);

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
		Thread.sleep(1800);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		Thread.sleep(1800);
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("50");
		Thread.sleep(1800); 	
		enter_Quantity.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(2000);
		enter_Rate.sendKeys("10");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(1000);
		
		String expCreditLimitMsg = "Voucher saved successfully";
		String actCreditLimitMsg = checkValidationMessage(expCreditLimitMsg);
		
		
		if (actCreditLimitMsg.startsWith(expCreditLimitMsg)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
		


	}
		

	  public static boolean checkCreateSalesOrderVoucherWithCreditLimitAccount() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
	  
			Thread.sleep(3500);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();

			Thread.sleep(1500);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
			inventoryTransactionsMenu.click();

			Thread.sleep(1500);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsSalesMenu));
			inventoryTransactionsSalesMenu.click();

			Thread.sleep(1500);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrderVoucher));
			salesOrderVoucher.click();
			
			Thread.sleep(2000);getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
	
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.sendKeys("CreditLimitSales");
			Thread.sleep(1800);
			customerAccountTxt.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
			enter_WarehouseTxt.sendKeys("Hyderabad");
			Thread.sleep(1800); 	
			enter_WarehouseTxt.sendKeys(Keys.TAB);

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(1800);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			Thread.sleep(1800);
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SalesOrderenter_AQTxt));
			SalesOrderenter_AQTxt.sendKeys("1");
			Thread.sleep(1800); 	
			SalesOrderenter_AQTxt.sendKeys(Keys.TAB);

			Thread.sleep(1500);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_10thColumn));
			select1stRow_10thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.click();
			enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			Thread.sleep(2000);
			enter_Rate.sendKeys("150");
			Thread.sleep(1000);
			enter_Rate.sendKeys(Keys.TAB);

			Thread.sleep(1500);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
			voucherSaveBtn.click();
			
			Thread.sleep(1000);
			
			String expCreditLimitMsg = "Voucher saved successfully";
			String actCreditLimitMsg = checkValidationMessage(expCreditLimitMsg);
			
			
			if (actCreditLimitMsg.startsWith(expCreditLimitMsg)) 
			{
				return true;
			} 
			else 
			{
				return false;
			}
			
		
	  }
	  
	  public static boolean checkRaiseSalesInvoiceVoucherWithCosumingSalesOrderLink() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	  {
	  
			Thread.sleep(4000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			ClickUsingJs(financialsMenu);

			Thread.sleep(1500);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();

			Thread.sleep(1500);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSales));
			financialsTransactionsSales.click();

			Thread.sleep(1500);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
			salesInvoiceVATVoucher.click();

			Thread.sleep(6000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingSalesOrderLink));
			pendingSalesOrderLink.click();
			
			Thread.sleep(1600);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));

			int count = grid_VoucherNoList.size();

			for (int i = 0; i < count; i++) 
			{
				String VoucherNo = grid_VoucherNoList.get(i).getText();

				if (VoucherNo.equalsIgnoreCase("1")) 
				{
					if (grid_CheckBoxList.get(i).isSelected()==false) 
					{
						getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
						
						break;
					}
				}
			}      

			Thread.sleep(2600);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("Dubai");
			Thread.sleep(2000);
			departmentTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_3rdColumn));
			select1stRow_3rdColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_taxcode));
			enter_taxcode.sendKeys("Std Rate");
			Thread.sleep(1800); 	
			enter_taxcode.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
			voucherSaveBtn.click();
			
			new WebDriverWait(getDriver(), 300).until(ExpectedConditions.visibilityOf(newReferenceTxt));

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
	  
	  public static void checkSalesInvoiceVATHeader(String CustAcc,String dept, String placeOfSupply, String jurisdiction) throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
			
			Thread.sleep(4000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			ClickUsingJs(financialsMenu);

			Thread.sleep(1500);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();

			Thread.sleep(1500);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSales));
			financialsTransactionsSales.click();

			Thread.sleep(1500);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
			salesInvoiceVATVoucher.click();

			Thread.sleep(6000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();

			
			Thread.sleep(3000);
			
			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.sendKeys(CustAcc);
			Thread.sleep(2000);
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

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
			salesInvoiceVATPlaceOFSupply.click();
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);


			int placeOFSupplyListCount=placeOFSupplyList.size();

			System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);

			for(int i=0 ; i < placeOFSupplyListCount ;i++)
			{
				String data=placeOFSupplyList.get(i).getText();

				if(data.equalsIgnoreCase(placeOfSupply))
				{
					placeOFSupplyList.get(i).click();

					break;
				}
			}

			Thread.sleep(1500);

			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
			jurisdictionTxt.click();
			jurisdictionTxt.sendKeys(Keys.END);
			jurisdictionTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			jurisdictionTxt.sendKeys(jurisdiction);
			Thread.sleep(1500);
			jurisdictionTxt.sendKeys(Keys.TAB);

			Thread.sleep(1500);
		}
		
		
	  
	  public static boolean checkSaveAnotherSalesInvoiceVoucherWithSameAccount() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	  {

		  checkSalesInvoiceVATHeader("CreditLimitSales","India", "Abu Dhabi", "DUBAI");
		  Thread.sleep(1500);

		  AccountPropertiesPage.checkSaveSalesInvoiceVAT(1, 2,"Hyderabad","STD RATE COGS ITEM",6, 9,"1",15,"150",18);

		  Thread.sleep(1500);

		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		  voucherSaveBtn.click();

		  Thread.sleep(1500);

		  String actCreditMessage = checkValidationMessage("This Transaction will make the Credit Limit Negative Credit Limit is 150.00 whereas this transaction will make the balance as 307.50");
		  String expCreditMessage = "This Transaction will make the Credit Limit Negative Credit Limit is 150.00 whereas this transaction will make the balance as 307.50";

		  Thread.sleep(3500);
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

		  if (actMessage.startsWith(expMessage)) 
		  {
			  return true;
		  } 
		  else 
		  {
			  return false;
		  }

	  }
	 
	  
		
		  public static boolean checkStopCreditLimitWarning() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		  {

				Thread.sleep(1000);
				ClickUsingJs(settingsmenuBtn);		
				Thread.sleep(1500);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PreferencesBtn));
				PreferencesBtn.click();		
				Thread.sleep(1000);
				
				Thread.sleep(1500);
				ClickUsingJs(ARAPBtn);
				Thread.sleep(1500);

				whenCreditLimitexceeded_StopRadio.click();
				
				Thread.sleep(1200);
				ClickUsingJs(updateBtnInDc);
				Thread.sleep(1200);
				
				Thread.sleep(2500);
				  getIsAlertPresent(); 
				  String actAlertMgs =getAlert().getText() ;
				  String expAlertMgs="There are entries in Reference table, You are not allow to change the preference for AR/AP fields"; 
				  Thread.sleep(1200);
				  System.out.println("actAlertMgs   :"+actAlertMgs);
				  System.out.println("expAlertMgs   :"+expAlertMgs); 
				  Thread.sleep(1200);
				  getAlert().accept();
				 
				
				
				Thread.sleep(2500);
				getAlert().accept();

				Thread.sleep(1500);
				
				String expSaveMessage = "Data saved Successfully";
				String actSaveMessage = checkValidationMessage(expSaveMessage);
				
				if (actSaveMessage.equalsIgnoreCase(expSaveMessage)) 
				{
					return true;
				} 
				else 
				{
					return false;
				}
				
				
		  }
		 
		  
		  public static boolean checkTrySavingSalesInvoiceVatWithSameCreditLimitAccount() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException 
		  {


			  checkSalesInvoiceVATHeader("CreditLimitSales","India", "Abu Dhabi", "DUBAI");
			  Thread.sleep(1500);

			  AccountPropertiesPage.checkSaveSalesInvoiceVAT(1, 2,"Hyderabad","STD RATE COGS ITEM",6, 9,"1",15,"150",18);

			  Thread.sleep(1500);

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
			  voucherSaveBtn.click();

			  Thread.sleep(1500);

			  String actCreditMessage = checkValidationMessage("This Transaction will make the Credit limit Negative. It cannot be saved Credit Limit is 150.00 whereas this transaction will make the balance as 465.00");
			  String expCreditMessage = "This Transaction will make the Credit limit Negative. It cannot be saved Credit Limit is 150.00 whereas this transaction will make the balance as 465.00";

			  Thread.sleep(1500);
			  VoucherEntryCloseBtn.click();
			  
			  Thread.sleep(1500);
			  voucherchanges_Yes.click();
			  
			  if (actCreditMessage.equalsIgnoreCase(expCreditMessage)) 
			  {
				  return true;
			  } 
			  else 
			  {
				  return false;
			  }
		  }
	
		  
		  public static boolean checkSaveAccountMasterWithCreditLimitForAutoCloseOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException 
		  {
			  
			  	Thread.sleep(2000);
			  	getDriver().navigate().refresh();
			  	Thread.sleep(2000);
				
				ClickUsingJs(homeMenu);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
				mastersMenu.click();

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
				accounts.click();

				Thread.sleep(3000);
				
				checkValidationMessage("");

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));		
				masterNewBtn.click();

				Thread.sleep(1500);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
				nameTxt.click();
				nameTxt.clear();
				nameTxt.sendKeys("SOAutoClose");
				nameTxt.sendKeys(Keys.TAB);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
				codeTxt.sendKeys("SAC");
				codeTxt.sendKeys(Keys.TAB);

				Thread.sleep(2000);


				Select actype = new Select(accountTypeDropdown);
				actype.selectByVisibleText("Customer");	
				Thread.sleep(1500);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditLimitTxt));
				creditLimitTxt.click();
				creditLimitTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
				Thread.sleep(1000);
				creditLimitTxt.sendKeys("200");
				creditLimitTxt.sendKeys(Keys.TAB);


				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
				SaveBtn.click();

				String expMessage="Saved Successfully";

				String actMessage=checkValidationMessage(expMessage);


				Thread.sleep(2500);
				closeBtn.click();
				Thread.sleep(2500);
				
				if (actMessage.equalsIgnoreCase(expMessage)) 
				{
					return true;
				} 
				else 
				{
					return false;
				}
			
		  }


		  public static boolean checkDefineAndSaveAutoCloseOptionInDesignWorkFlow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
			  	ClickUsingJs(settingsmenuBtn);
				Thread.sleep(2000);
				ClickUsingJs(DesignWorkFlowBtn);
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
				workflowNameTxt.click();
				Thread.sleep(1500);
				workflowNameTxt.sendKeys("Sales Flow");
				Thread.sleep(1500);

				workflowNameTxt.sendKeys(Keys.TAB);

				Thread.sleep(2000);
				
				JavascriptExecutor js = (JavascriptExecutor) getDriver();
				js.executeScript("document.querySelector('#line5>path').setAttribute('stroke-width', '20')");

				boolean actlinkSalOrdTOSalesInv = linkSalOrdTOSalesInv.isDisplayed();
				boolean explinkSalOrdTOSalesInv = true;

				Thread.sleep(2000);
				System.err.println("actlinkSalOrdTOSalesInv is :" + actlinkSalOrdTOSalesInv);

			    getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(linkSalOrdTOSalesInv));
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkSalOrdTOSalesInv));
				linkSalOrdTOSalesInv.click();
				
				Thread.sleep(2000);			
				click(settingTab);
				
				Thread.sleep(2000);

				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(autoCloseTxt));
				autoCloseTxt.click();
				autoCloseTxt.sendKeys(Keys.END);
				autoCloseTxt.sendKeys(Keys.SHIFT, Keys.HOME);
				autoCloseTxt.sendKeys("5");
				
				Thread.sleep(2000);
				
				 Thread.sleep(2000);                
			        
			        ClickUsingJs(OkBtn);

			        Thread.sleep(2000);

			        click(DWsaveBtn);

			        String expMessage = "WorkFlow Saved Successfully";

			        String actMessage = checkValidationMessage(expMessage);                
			        
			        System.out.println("actMessage     :"+actMessage);
			        System.out.println("expMessage     :"+expMessage);
			        
			        
			        if (actMessage.equalsIgnoreCase(expMessage)) {

			                return true;
			        } else {

			                return false;
			        }


				
				
		  }
		  
		  public  static  boolean checkSaveSalesOrderVoucherWithPreviousWeekDate() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		  {
			  
			  Thread.sleep(3500);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
				inventoryMenu.click();

				Thread.sleep(1500);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
				inventoryTransactionsMenu.click();

				Thread.sleep(1500);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsSalesMenu));
				inventoryTransactionsSalesMenu.click();

				Thread.sleep(1500);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrderVoucher));
				salesOrderVoucher.click();
				
				Thread.sleep(2000);getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
				newBtn.click();
		
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateText));
				 dateText.sendKeys(Keys.CONTROL,"a");
				  Thread.sleep(1500);
				  dateText.sendKeys(Keys.BACK_SPACE);
				  Thread.sleep(1500);

				dateText.sendKeys(PreviousWeek(-1));
				Thread.sleep(1800);
				dateText.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
				customerAccountTxt.sendKeys("SOAutoClose");
				Thread.sleep(1800);
				customerAccountTxt.sendKeys(Keys.TAB);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
				select1stRow_1stColumn.click();
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
				enter_WarehouseTxt.sendKeys("Hyderabad");
				Thread.sleep(1800); 	
				enter_WarehouseTxt.sendKeys(Keys.TAB);

				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
				enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
				Thread.sleep(1800);
				enter_ItemTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
				Thread.sleep(1800);
				enter_UnitTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
				select1stRow_5thColumn.click();
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SalesOrderenter_AQTxt));
				SalesOrderenter_AQTxt.sendKeys("1");
				Thread.sleep(1800); 	
				SalesOrderenter_AQTxt.sendKeys(Keys.TAB);

				Thread.sleep(1500);
			
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_10thColumn));
				select1stRow_10thColumn.click();
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.click();
				enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
				Thread.sleep(2000);
				enter_Rate.sendKeys("200");
				Thread.sleep(1000);
				enter_Rate.sendKeys(Keys.TAB);

				Thread.sleep(1500);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);
				
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
				voucherSaveBtn.click();
				
				Thread.sleep(1000);
				
				String expCreditLimitMsg = "Voucher saved successfully";
				String actCreditLimitMsg = checkValidationMessage(expCreditLimitMsg);
				
				
				if (actCreditLimitMsg.startsWith(expCreditLimitMsg)) 
				{
					return true;
				} 
				else 
				{
					return false;
				}
				
		  }
		  
		  
		  public static boolean checkSaveSalesOrderVoucherAgainWithInAutoCloseDay5() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		  {


			  Thread.sleep(3500);

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			  inventoryMenu.click();

			  Thread.sleep(1500);

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
			  inventoryTransactionsMenu.click();

			  Thread.sleep(1500);

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsSalesMenu));
			  inventoryTransactionsSalesMenu.click();

			  Thread.sleep(1500);

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrderVoucher));
			  salesOrderVoucher.click();

			  Thread.sleep(2000);getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			  newBtn.click();

			  

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateText));
			  dateText.sendKeys(Keys.CONTROL,"a");
			  Thread.sleep(1500);
			  dateText.sendKeys(Keys.BACK_SPACE);
			  Thread.sleep(1500);

			  dateText.sendKeys(minusDays(6));
			  Thread.sleep(1800);
			  dateText.sendKeys(Keys.TAB);

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			  customerAccountTxt.sendKeys("SOAutoClose");
			  Thread.sleep(1800);
			  customerAccountTxt.sendKeys(Keys.TAB);

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			  select1stRow_1stColumn.click();
			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
			  enter_WarehouseTxt.sendKeys("Hyderabad");
			  Thread.sleep(1800); 	
			  enter_WarehouseTxt.sendKeys(Keys.TAB);


			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			  enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			  Thread.sleep(1800);
			  enter_ItemTxt.sendKeys(Keys.TAB);

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			  Thread.sleep(1800);
			  enter_UnitTxt.sendKeys(Keys.TAB);

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			  select1stRow_5thColumn.click();
			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SalesOrderenter_AQTxt));
			  SalesOrderenter_AQTxt.sendKeys("1");
			  Thread.sleep(1800); 	
			  SalesOrderenter_AQTxt.sendKeys(Keys.TAB);

			  Thread.sleep(1500);

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_10thColumn));
			  select1stRow_10thColumn.click();
			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			  enter_Rate.click();
			  enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			  Thread.sleep(2000);
			  enter_Rate.sendKeys("200");
			  Thread.sleep(1000);
			  enter_Rate.sendKeys(Keys.TAB);

			  Thread.sleep(1500);

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			  enter_Gross.sendKeys(Keys.TAB);


			  Thread.sleep(2000);
			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
			  voucherSaveBtn.click();

			  Thread.sleep(1000);

			  String expCreditLimitMsg = "Voucher saved successfully";
			  String actCreditLimitMsg = checkValidationMessage(expCreditLimitMsg);


			  if (actCreditLimitMsg.startsWith(expCreditLimitMsg)) 
			  {
				  return true;
			  } 
			  else 
			  {
				  return false;
			  }


		  }
		  
		  public static boolean checkSaveSalesOrderVoucherWithTheCurrentDateToCheckAutoCloseExpiredOrNot() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		  {



			  Thread.sleep(3500);

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			  inventoryMenu.click();

			  Thread.sleep(1500);

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
			  inventoryTransactionsMenu.click();

			  Thread.sleep(1500);

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsSalesMenu));
			  inventoryTransactionsSalesMenu.click();

			  Thread.sleep(1500);

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrderVoucher));
			  salesOrderVoucher.click();

			  Thread.sleep(2000);getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			  newBtn.click();

			  
			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			  customerAccountTxt.sendKeys("SOAutoClose");
			  Thread.sleep(1800);
			  customerAccountTxt.sendKeys(Keys.TAB);

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			  select1stRow_1stColumn.click();
			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
			  enter_WarehouseTxt.sendKeys("Hyderabad");
			  Thread.sleep(1800); 	
			  enter_WarehouseTxt.sendKeys(Keys.TAB);


			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			  enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			  Thread.sleep(1800);
			  enter_ItemTxt.sendKeys(Keys.TAB);

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			  Thread.sleep(1800);
			  enter_UnitTxt.sendKeys(Keys.TAB);

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			  select1stRow_5thColumn.click();
			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SalesOrderenter_AQTxt));
			  SalesOrderenter_AQTxt.sendKeys("2");
			  Thread.sleep(1800); 	
			  SalesOrderenter_AQTxt.sendKeys(Keys.TAB);

			  Thread.sleep(1500);

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_10thColumn));
			  select1stRow_10thColumn.click();
			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			  enter_Rate.click();
			  enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			  Thread.sleep(2000);
			  enter_Rate.sendKeys("200");
			  Thread.sleep(1000);
			  enter_Rate.sendKeys(Keys.TAB);

			  Thread.sleep(1500);

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			  enter_Gross.sendKeys(Keys.TAB);


			  Thread.sleep(2000);
			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
			  voucherSaveBtn.click();

			  Thread.sleep(1000);

			  String expCreditLimitMsg = "This Transaction will make the Credit limit Negative. It cannot be saved Credit Limit is 200.00 whereas this transaction will make the balance as 400.00";
			  String actCreditLimitMsg = checkValidationMessage(expCreditLimitMsg);


			  if (actCreditLimitMsg.startsWith(expCreditLimitMsg)) 
			  {
				  return true;
			  } 
			  else 
			  {
				  return false;
			  }



		  }
		  
		  
		  
		  
	
 public TransactionImportPage(WebDriver driver)
 {
	PageFactory.initElements(driver, this);
	
 }

}
