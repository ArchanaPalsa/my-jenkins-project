package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.FocusFinancialsReportPage;
//import com.focus.Pages.BillWisePage;
import com.focus.Pages.ReportDesignerPage;
import com.focus.base.BaseEngine;

public class ReportDesignerTest extends BaseEngine 
{
	ReportDesignerPage RDP ;

	@Test(priority=80)
	public void checkLogin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkLogin(), true);	
	}

/*
   @Test(priority=81)
	public void checkRestoreCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkRestoreCompany(), true);
	}

	@Test(priority=90)
	public void checkNavigateToReportDesginer() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkNavigateToReportDesginer(), true);	
	}


	@Test(priority=91)
	public void checkSavingReportDesignerOfAllTransactionsOfDocumentClass() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingReportDesignerOfAllTransactionsOfDocumentClass(), true);
	}

	@Test(priority=92)
	public void checkUpdatingTheSavedReportInreportDesinger() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkUpdatingTheSavedReportInreportDesinger(), true);
	}

	@Test(priority=93)
	public void checkPreviewTabInReportDesiging() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkPreviewTabInReportDesiging(), true);
	}

	@Test(priority=94)
	public void checkDeleteOptionInReportDesigner() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkDeleteOptionInReportDesigner(), true);
	}

	// Report Validation
	@Test(priority=95)
	public void checkReportAllTransactionsOfDocumentClassOfPurchaseType() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportAllTransactionsOfDocumentClassOfPurchaseType(), true);
	}

	@Test(priority=96)
	public void checkSavingAllTransactionsOfDocumentTypeOfPurchaseTypeToCubes() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingAllTransactionsOfDocumentTypeOfRecepitsTypeToCubes(), true);
	}

	@Test(priority=97)
	public void checkReportAllTransactionsOfDocumentTypeOfRecepitsVATType() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportAllTransactionsOfDocumentTypeOfRecepitsVATType(), true);
	}                   


	@Test(priority=98)
	public void checkSavingAccountingTransactionsOfAnAccountDetailsWithConditionUnauthorisedRecords() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingAccountingTransactionsOfAnAccountDetails(), true);
	} 


	@Test(priority=99)
	public void checkReportAccountingTransactionsOfAnAccountDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportAccountingTransactionsOfAnAccountDetails(), true);
	} 

	@Test(priority=100)
	public void checkSavingAccountingTransactionsOfAccountingTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingAccountingTransactionsOfAccountingTagDetails(), true);
	} */

	@Test(priority=101)
	public void checkReportAccountingTransactionsOfAnAccountingTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportAccountingTransactionsOfAnAccountingTagDetails(), true);
	} 


	@Test(priority=102)//COL
	public void checkSavingAccountingTrasactionsOfInventoryTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingAccountingTrasactionsOfInventoryTagDetails(), true);
	} 


	@Test(priority=103)//COL
	public void checkReportAccountingTrasactionsofInventoryTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportAccountingTrasactionsofInventoryTagDetails(), true);
	} 

	@Test(priority=104)
	public void checkSavingAccountingTransactionsoFTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingAccountingTransactionsoFTagDetails(), true);
	} 

	@Test(priority=105)
	public void checkReportAccountingTransactionsofTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportAccountingTransactionsofTagDetails(), true);
	} 


	@Test(priority=106)
	public void checkSavingAllAccountsByTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingAllAccountsByTagDetails(), true);
	} 


	@Test(priority=107)
	public void checkReportAllAccountsByTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportAllAccountsByTagDetails(), true);
	} 

	@Test(priority=109)
	public void checkSavingRDWithAllProductsDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingRDWithAllProductsDetails(), true);
	}

	@Test(priority=110)
	public void checkReportAllProductsDetailsDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportAllProductsDetailsDetails(), true);
	}

	@Test(priority=111)
	public void checkSavingRDWithAllProductsBTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingRDWithAllProductsBTagDetails(), true);
	}

	@Test(priority=112)
	public void checkReportAllProductsByTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportAllProductsByTagDetails(), true);
	}


	@Test(priority=114)
	public void checkSavingRDWithInventoryTransactionsDetailsDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingRDWithInventoryTransactionsDetailsDetails(), true);
	}

	@Test(priority=115)
	public void checkReportInventoryTransactionsDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportInventoryTransactionsDetails(), true);
	}

	@Test(priority=116)
	public void checkSavingRDWithInventoryTransactionsOfProductDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingRDWithInventoryTransactionsOfProductDetails(), true);
	}

	@Test(priority=117)
	public void checkReportInventoryTransactionsOfProductDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportInventoryTransactionsOfProductDetails(), true);
	}

	@Test(priority=118)
	public void checkSavingRDWithInventoryTransactionsOfAccountingTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingRDWithInventoryTransactionsOfAccountingTagDetails(), true);
	}

	@Test(priority=119)
	public void checkReportInventoryTransactionsOFAccountingTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportInventoryTransactionsOFAccountingTagDetails(), true);
	}

	@Test(priority=120)
	public void checkSavingRDWithInventoryTransactionsOfInventoryTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingRDWithInventoryTransactionsOfInventoryTagDetails(), true);
	}

	@Test(priority=121)
	public void checkReportInventoryTransactionsOFInventoryTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportInventoryTransactionsOFInventoryTagDetails(), true);
	}

	@Test(priority=122)
	public void checkSavingRDWithInventoryTransactionsOfTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingRDWithInventoryTransactionsOfTagDetails(), true);
	}

	@Test(priority=123)// issue
	public void checkReportInventoryTransactionsOFTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportInventoryTransactionsOFTagDetails(), true);
	}

	@Test(priority=124)
	public void checkSavingRDWithInventoryTransactionsOfSelectedAccountDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingRDWithInventoryTransactionsOfSelectedAccountDetails(), true);
	}

	@Test(priority=125)
	public void checkReportInventoryTransactionsSelectedAccountDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportInventoryTransactionsSelectedAccountDetails(), true);
	}


	@Test(priority=126)
	public void checkSavingReportThroughAnalysisInLedgerReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingReportThroughAnalysisInLedgerReport(), true);
	}

	@Test(priority=127)
	public void checkLedgerAnalysisreport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkLedgerAnalysisreport(), true);
	}


	@Test(priority=128)
	public void checkLedgerDetailsExportPdf() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkLedgerDetailsExportPdf(), true);
	}

	//@Test(priority=129)
	public void checkImportExcelFileInReportDesign() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkImportExcelFileInReportDesign(), true);
	}

	// @Test(priority=130)  
	public void checkExportOptionreportDesging() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkExportOptionreportDesging(), true);
	}

	@Test(priority=132)
	public void checkSavingRDReportsWihParameter() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		RDP=new ReportDesignerPage(
				getDriver());
		Assert.assertEquals(RDP.checkSavingRDReportsWihParameter(), true);
	}

	@Test(priority=133)
	public void checkAddingProgrammmingFiledInBillwiseRDReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkAddingProgrammmingFiledInBillwiseRDReport(), true);
	}


	@Test(priority=134)//col
	public void checkBillwiseDetailsreport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkBillwiseDetailsreport(), true);
	}

	//@Test(priority=135)
	public void checkParameterWithMultiplewayoptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkParameterWithMultiplewayoptions(), true);
	}


	@Test(priority=136)
	public void checkBillwiseReportAfterCheckingMultipleChkbox() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkBillwiseReportAfterCheckingMultipleChkbox(), true);
	}


	@Test(priority=140)
	public void checkSavingReportDesigningWithQuaeery() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingReportDesigningWithQuaeery(), true);
	}

	@Test(priority=141)
	public void checkReportWithQuaeryreport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportWithQuaeryreport(), true);
	}

	@Test(priority=142)
	public void checkCustomizeDateFormatInLedgerReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkCustomizeDateFormatInLedgerReport(), true);
	}

	@Test(priority=143)
	public void checkValidateDateFormatInLedgerReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkValidateDateFormatInLedgerReport(), true);
	}

	@Test(priority=144)
	public void checkSaveAReportForValidationRowFormattingTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSaveAReportForValidationRowFormattingTab(), true);
	}





	//Cubes

	@Test(priority=200)
	public void checkSavingAllTransactionsOfDocumentClassCube() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingAllTransactionsOfDocumentClassCube(), true);
	}

	@Test(priority=201)
	public void checkReportAlltransactionsofdocumentclasscube() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportAlltransactionsofdocumentclasscube(), true);
	}

	@Test(priority=202)
	public void checkReportExportingThroughPDFAndValidatePDF() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportExportingThroughPDFAndValidatePDF(), true);
	}


	@Test(priority=203)
	public void checkCustomizeReportOFAlltransactionsofdocumentclasscube() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkCustomizeReportOFAlltransactionsofdocumentclasscube(), true);
	}

	@Test(priority=204)
	public void checkInventoryTransactionsOfATagCubeReportWithMutipleLevelsOfRowGrouping() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkInventoryTransactionsOfATagCubeReportWithMutipleLevelsOfRowGrouping(), true);
	}

	@Test(priority=205)
	public void checkReportForCreatedInventoryTransactionsOfATagCube() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportForCreatedInventoryTransactionsOfATagCube(), true);
	}



	/*
	@Test(priority=204)
	public void checkSaveInventoryTransactionsOfInventoryTagCubes() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSaveInventoryTransactionsOfInventoryTagCubes(), true);
	}




	//@Test(priority=202)
	public void checkSavingAccountingTransactionsOfAnAccountCube() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingAccountingTransactionsOfAnAccountCube(), true);
	} 


	//@Test(priority=203)
	public void checkReportAccountingtransactionOfAnAccountCube() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportAccountingtransactionOfAnAccountCube(), true);
	} 


	@Test(priority=204)
	public void checkSavingAccountingTransactionsOfAnAccountingTagCube() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingAccountingTransactionsOfAnAccountingTagCube(), true);
	}


	@Test(priority=205)
	public void checkReportAccountingTransactionsofAnAccountingTag_cube() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportAccountingTransactionsofAnAccountingTag_cube(), true);
	}


	@Test(priority=206)
	public void checkAddingReportDesginerWithdataTypeCubeType() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkAddingReportDesginerWithdataTypeCubeType(), true);
	}


	@Test(priority=207)
	public void checkReportOFReportWithQuarryForCubeType() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportOFReportWithQuarryForCubeType(), true);
	}



//@Test(priority=208)
	public void checkSavingRDReportsWihParameterOFtypeCube() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingRDReportsWihParameterOFtypeCube(), true);
	}


	//@Test(priority=209)
	public void checkReportSavedWithCubeTypeParmeter() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportSavedWithCubeTypeParmeter(), true);
	}

	//@Test(priority=211)
	public void checkAddingAndDeletingParameterWithDataTypeCubes() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkAddingAndDeletingParameterWithDataTypeCubes(), true);
	}

	//@Test(priority=212)
	public void checkResetOptionAndSaveWithOutSelectingDisplayReportinReportDesginer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkResetOptionAndSaveWithOutSelectingDisplayReportinReportDesginer(), true);
	}


	//@Test(priority=213)
	public void checkRdWithCubesTypeAddingProgrammableFiled() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkRdWithCubesTypeAddingProgrammableFiled(), true);
	}



	 */

	@Test(priority=214)
	public void CheckAddingFilterInFiledsCreatedCustomizationTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.CheckAddingFilterInFiledsCreatedCustomizationTab(), true);
	}


	@Test(priority=215)
	public void checkReportMRWithFilter() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportMRWithFilter(), true);
	}

	@Test(priority=216)
	public void checkAddingProgrammableFiledWithColAttaributeAndEditingColName() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkAddingProgrammableFiledWithColAttaributeAndEditingColName(), true);
	}


	@Test(priority=217)
	public void checkReportMRAfterChangesInCustomizationtab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportMRAfterChangesInCustomizationtab(), true);
	}

	@Test(priority=218)
	public void checkAlignmentInReportDesgining() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkAlignmentInReportDesgining(), true);
	}


	@Test(priority=219)
	public void checkReportMRAfterChangesAlignmentAndSignInColoumnFiels() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportMRAfterChangesAlignmentAndSignInColoumnFiels(), true);
	}


	@Test(priority=220)
	public void checkSortingOptionInReportDesgining() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSortingOptionInReportDesgining(), true);
	}
	@Test(priority=221)
	public void checkReportMRAfterChangesAInSortingTAB() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkReportMRAfterChangesAInSortingTAB(), true);
	}


	@Test(priority=400)
	public void checklogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checklogout(), true);
	}


	// @Test(priority=225) In complete 
	public void checkSavingReportDesginerOnBasisOFCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		RDP=new ReportDesignerPage(getDriver());
		Assert.assertEquals(RDP.checkSavingReportDesginerOnBasisOFCustomization(), true);
	}


}