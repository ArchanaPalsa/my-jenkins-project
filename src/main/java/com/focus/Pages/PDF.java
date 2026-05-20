package com.focus.Pages;

import java.io.IOException;

import com.focus.base.BaseEngine;
import com.testautomationguru.utility.PDFUtil;

public class PDF extends BaseEngine{

	public static void main(String[] args) throws InterruptedException, IOException {
	
		String actPDF = "F:\\FocusXAllProjectsSuite\\FocusAI\\autoIt\\ExportFiles\\ItemImageLayoutPDF.pdf";
		String expPDF = "F:\\FocusXAllProjectsSuite\\FocusAI\\autoIt\\ImportFiles\\ItemImageLayoutPDF.pdf";
		
		Thread.sleep(3902);

		PDFUtil pdfutil = new PDFUtil();
		Thread.sleep(3902);

		boolean result = pdfutil.compare(actPDF, expPDF);
		
		Thread.sleep(3902);
		
		System.out.println("Compared Result  : "+result);
		
		
		Thread.sleep(5500);
		
		

		String actData = pdfutil.getText(actPDF);
		Thread.sleep(2900);
		String expData = pdfutil.getText(expPDF);
		
		Thread.sleep(5500);
		
		
		System.err.println(actData);
		Thread.sleep(2900);
		System.err.println(expData);
		
		Thread.sleep(2500);
	}

}
