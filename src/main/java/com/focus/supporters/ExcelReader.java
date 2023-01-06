package com.focus.supporters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.TableCell.BorderEdge;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xwpf.usermodel.Borders;

import com.focus.base.BaseEngine;

//import com.focus.base.BaseEngine;

public class ExcelReader extends BaseEngine
{
	private String filePath;
	private FileInputStream fip;
	private FileOutputStream fop;
	private Workbook workbook;
	private Sheet sheet;
	private Cell cell;
	private CellStyle style;
	private Row row;

	
	public ExcelReader(String filePath) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		this.filePath=filePath;
		fip=new FileInputStream(filePath);
		workbook=WorkbookFactory.create(fip);
	}
	

	public Sheet getSheet(String sheetName) 
	{
		sheet = workbook.getSheet(sheetName);
		return sheet;
	}
	
	public Sheet getSheet(int sheetIndex)
	{
		sheet=workbook.getSheetAt(sheetIndex);
		return sheet;
	}
	
	public Row getRow(String sheetName, int rowNum)
	{
		Row row=getSheet(sheetName).getRow(rowNum);
		return row;
	}
	
	public Row getRow(int sheetIndex, int rowNum)
	{
		row=getSheet(sheetIndex).getRow(rowNum);
		return row;
	}
	
	public Cell getCell(String sheetName,int rowNum, int cellNum)
	{
    
		cell =getSheet(sheetName).getRow(rowNum).getCell(cellNum);
		return cell;
		
	}
	
	public String getCellData(String sheetName, int rowNum,int cellNum)
	{
		String data=null;
		cell=getSheet(sheetName).getRow(rowNum).getCell(cellNum);
		if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
		{
			data=cell.getNumericCellValue()+"";
		}
		else if(cell.getCellType()==Cell.CELL_TYPE_STRING)
		{
			data=cell.getStringCellValue();
		}
		return data;
	}
	
	
   public List<String> getTotalExcelData(String sheetName)
   {
	   String data=null;
	   sheet=getSheet(sheetName);
	   List<String> excelData=new ArrayList<String>();
	   
	   for(int i=0;i<sheet.getLastRowNum();i++)
	   {
		   row=sheet.getRow(i);
		   
		   for(int j=0;j<row.getLastCellNum();j++)
		   {
			   cell=row.getCell(j);
			   if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
			   {
				   data=cell.getNumericCellValue()+"";
				   excelData.add(data);
			   }
			   else if(cell.getCellType()==Cell.CELL_TYPE_STRING)
			   {
				   data=cell.getStringCellValue();
				   excelData.add(data);
			   }
			   
		   }
	   }
	   
	   return excelData;
   }
   
   
   
   public List<String> getRowData(String sheetName, int rowNum)
   {
	   row=getSheet(sheetName).getRow(rowNum);
	   List<String> excelRowData=null;
	   String data=null;
	   
	   for(int i=0;i<row.getLastCellNum();i++)
	   {
		   cell=row.getCell(i);
		   
		   if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
		   {
			   data=cell.getNumericCellValue()+"";
			   excelRowData.add(data);
		   }
		   else if(cell.getCellType()==Cell.CELL_TYPE_STRING)
		   {
			   data=cell.getStringCellValue();
			   excelRowData.add(data);
		   }   
	   }
	   return excelRowData;
   }
   
   
   //To Write the data in the excel sheet
  
   public void setCellData(String filePath,String sheetName,int rowNum,int cellNum,String data) throws IOException, EncryptedDocumentException, InvalidFormatException
   {
       if(data.equalsIgnoreCase("pass") || data.equalsIgnoreCase("fail") )
       {
           if(data.equalsIgnoreCase("pass") )
           {
               this.filePath       =  filePath;
               FileInputStream fip = new FileInputStream(filePath);             
               workbook            = WorkbookFactory.create(fip);             
               Sheet sheet         = workbook.getSheet(sheetName);           
               Row row             = sheet.getRow(rowNum);           
               Cell cell           = row.createCell(cellNum);
               
               cell.setCellValue(data);
              
               style               = workbook.createCellStyle();
               style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
               style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                
               cell.setCellStyle(style);
    
               FileOutputStream fop = new FileOutputStream(filePath);
    
               workbook.write(fop);
               
               fip.close();
               
               fop.close();
           }
           else
           {
               this.filePath        = filePath;
               FileInputStream fip  = new FileInputStream(filePath);
               workbook             = WorkbookFactory.create(fip);
               Sheet sheet          = workbook.getSheet(sheetName);
               Row row              = sheet.getRow(rowNum);
               Cell cell            = row.createCell(cellNum);
               
               cell.setCellValue(data);
               
               style                = workbook.createCellStyle();
               style.setFillForegroundColor(IndexedColors.RED.getIndex());
               style.setFillPattern(FillPatternType.BIG_SPOTS);
                
               cell.setCellStyle(style);

               FileOutputStream fop = new FileOutputStream(filePath);

               workbook.write(fop);
               
               fip.close();
               
               fop.close();
           }
       }
       else
       {
           this.filePath            = filePath;
           FileInputStream fip      = new FileInputStream(filePath);
           workbook                 = WorkbookFactory.create(fip); 
           Sheet sheet              = workbook.getSheet(sheetName);
           Row row                  = sheet.getRow(rowNum);          
           Cell cell                =row.getCell(cellNum);
        
           cell.setCellValue(data);
           
           FileOutputStream fop     = new FileOutputStream(filePath);

           workbook.write(fop);
           
           fip.close();
           
           fop.close();
       }
     }
   
   
   public void copyExcelFile() throws IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException
   {
   	   //Provide the Path of excel file which we want to copy
   	   File inputFile=new File(getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestDataExcelBackup\\FocusTest.xlsx");
   	   File outputFile=new File(getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx");
   	   
   	   if(outputFile.exists())
   	   {
   	     outputFile.delete();
   	     System.out.println("The Backup File Previous Exits and Delete The Backup Test Data File");
   	   }
   	   
   	   Thread.sleep(3000);
   	   Files.copy(inputFile.toPath(), outputFile.toPath());
 	   System.out.println("Test Data Back Up File Copied Successfully");
   }
   
   
   
   public void setExceptionInExcel(String filePath,String sheetName,int rowNum,int cellNum,String data) throws IOException, EncryptedDocumentException, InvalidFormatException
   {
	   this.filePath=filePath;

	   FileInputStream fip=new FileInputStream(filePath);
	   workbook =WorkbookFactory.create(fip);
	   
	   Sheet sheet=workbook.getSheet(sheetName);
	   
	   Row row=sheet.getRow(rowNum);

	   Cell cell =row.createCell(cellNum);
	   cell.setCellValue(data);
	   
	   style = workbook.createCellStyle();
	   style.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
	   style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	   
	   cell.setCellStyle(style);
			
	   FileOutputStream fop=new FileOutputStream(filePath);
			
	   workbook.write(fop);
	   
	   fip.close();
	   
	   fop.close();
   }
   
}



