package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.VoucherPrintOptionsPage;
import com.focus.base.BaseEngine;

public class VoucherPrintOptionsTest extends BaseEngine
{
	VoucherPrintOptionsPage VPO;


	// Buyer Pricebook Validations
	/*
	 @Test(priority=10050)
	 public void checkSavingPurchaseVoucherVATVoucher1WithAllItems() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 VPO=new VoucherPrintOptionsPage(getDriver());
		 Assert.assertEquals(VPO.checkSavingPurchaseVoucherVATVoucher1WithAllItems(), true);
	 }

	  @Test(priority=10051)
	  public void checkSavingPurchaseVoucherVATVoucher2() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkSavingPurchaseVoucherVATVoucher2(), true);
	  }*/

	
	
	@Test(priority=10051)
	public void checkAccouncreatedForPrintEmailOne() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkAccouncreatedForPrintEmailOne(), true);
	}

	@Test(priority=10052)
	public void checkAccouncreatedForPrintEmailTwo() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkAccouncreatedForPrintEmailTwo(), true);
	}

	@Test(priority=10053)
	public void checkAccouncreatedForPrintEmailThree() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkAccouncreatedForPrintEmailThree(), true);
	}
	
	@Test(priority=10054)
	public void checkSavingReceiptsVoucherForEmailAccountOne() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSavingReceiptsVoucherForEmailAccountOne(), true);
	}

	@Test(priority=10055)
	public void checkSavingReceiptsvoucherForEmailAccountTwo() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSavingReceiptsvoucherForEmailAccountTwo(), true);
	}

	@Test(priority=10056)
	public void checkSavingReceiptsVoucherForEmailAccountThree() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSavingReceiptsVoucherForEmailAccountThree(), true);
	}


	@Test(priority=10057)
	public void checkSendingReceiptsEmailsForEveryAccount() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSendingReceiptsEmailsForEveryAccount(), true);
	}

	//@Test(priority=10058)
	public void checkPrintEmailOneOptionInReceiptsVoucherVAT() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintEmailOneOptionInReceiptsVoucherVAT(), true);
	}

	//@Test(priority=10059)
	public void checkPrintEmailTwoOptionInReceiptsVoucherVAT() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintEmailTwoOptionInReceiptsVoucherVAT(), true);
	}

	//@Test(priority=10060)
	public void checkPrintEmailThreeOptionInReceiptsVoucherVAT() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintEmailThreeOptionInReceiptsVoucherVAT(), true);
	}


	// @Test(priority=10070)
	public void checkVoucherEmailDetailsInInfoBtn() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkVoucherEmailDetailsInInfoBtn(), true);
	}
	

	// Voucher Print Validations

	@Test(priority=10101)
	public void checkPrintScreenOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintScreenOptions(), true);
	}

	//@Test(priority=10102)
	public void checkLayoutOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkLayoutOptions(), true);
	}

	@Test(priority=10103)
	public void checkInvoiceDesignOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkInvoiceDesignOptions(), true);
	}

	@Test(priority=10104)
	public void checkFieldsTabOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkFieldsTabOptions(), true);
	}

	//1
	@Test(priority=10110)
	public void checkCreatingLayoutforGridPropertiesForClubByItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkCreatingLayoutforGridProperties(), true);
	}

	@Test(priority=10111)
	public void checkLayoutFieldProperties() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkLayoutFieldProperties(), true);
	}

	@Test(priority=10112)
	public void checkGridProperties_ClubByItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkGridProperties_ClubByItem(), true);
	}

	
	@Test(priority=10113)
	public void checkPrintPdfWithEnablingDontClubIfRatesAreDiff() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfWithEnablingDontClubIfRatesAreDiff(), true);
	}

	@Test(priority=10114)
	public void checkDisablingIfRatesAreNotDifferentInLayout() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkDisablingIfRatesAreNotDifferentInLayout(), true);
	}

	@Test(priority=10115)
	public void checkPrintPdfAfterDisablingRatesCheckBox() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfAfterDisablingRatesCheckBox(), true);
	}


	
	
	@Test(priority=10116)
	public void checkGridProperties_ClubByWarehouse() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkGridProperties_ClubByWarehouse(), true);
	}

	@Test(priority=10117)
	public void checkPrintpdfForLayoutWithClubByWarehouse() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintpdfForLayoutWithClubByWarehouse(), true);
	}

	//2
	@Test(priority=10120)
	public void checkLayoutForGridPropertiesGroupByItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkLayoutForGridPropertiesGroupBy(), true);
	}


	@Test(priority=10121)
	public void checkLayoutForFieldPropertiesGroupByItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkLayoutForFieldPropertiesGroupBy(), true);
	}

	@Test(priority=10122)
	public void checkGridproperties_GroupByItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkGridproperties_GroupByItem(), true);
	}


	@Test(priority=10123)
	public void checkPrintPdfGridPropertiesGroupByItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfGridPropertiesGroupByItem(), true);
	}

	@Test(priority=10124)
	public void checkEnableCheckboxesInGroupBy() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkEnableCheckboxesInGroupBy(), true);
	}

	@Test(priority=10125)
	public void checkPrintPdfAfterEnablingCheckboexInGroupBy() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfAfterEnablingCheckboexInGroupBy(), true);
	}


	//3
	@Test(priority=10126)
	public void checkLayoutForGridPropertiesOrderByItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkLayoutForGridPropertiesOrderByItem(), true);
	}


	@Test(priority=10127)
	public void checkLayoutForFieldPropertiesOrderByItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkLayoutForFieldPropertiesOrderByItem(), true);
	}

	@Test(priority=10128)
	public void checkGridproperties_OrderbyItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkGridproperties_OrderbyItem(), true);
	}
	
	@Test(priority=10129)
	public void checkPrintPdfGridPropertiesOrderByItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfGridPropertiesOrderByItem(), true);
	}

	//issue
	//  @Test(priority=10130)
	public void checkEnableCheckboxesInOderBy() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkEnableCheckboxesInOderBy(), true);
	}


	//@Test(priority=10131)
	public void checkPrintPdfAfterEnablingCheckboexInOderBy() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfAfterEnablingCheckboexInOderBy(), true);
	}


	//4
	@Test(priority=10132)
	public void checkLayoutGridProperties() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkLayoutGridProperties(), true);
	}

	@Test(priority=10133)
	public void checkLayoutFieldPropries() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkLayoutFieldPropries(), true);
	}


	@Test(priority=10134)
	public void checkGridPropertiesInPvVatLayout() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkGridPropertiesInPvVatLayout(), true);
	}

	@Test(priority=10135)
	public void checkPrintPdfAfterGridPropertiesEnabledToTrue() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfAfterGridPropertiesEnabledToTrue(), true);
	}

	@Test(priority=10140)
	public void checkAccountsCreationForMulipleandSinglePrintLayoutAssign() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkAccountsCreationForMulipleandSinglePrintLayoutAssign(), true);
	}

	@Test(priority=10141)
	public void checkAccountRadiobtnAndPrintUsingCheckboxinbothPrefAndDocCust() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkAccountRadiobtnAndPrintUsingCheckboxinbothPrefAndDocCust(), true);
	}

	@Test(priority=10142)
	public void checkSavingPvVatForMultiplePrintLayoutAccount() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSavingPvVatForMultiplePrintLayoutAccount(), true);
	}

	@Test(priority=10143)
	public void checkSavingPvVatForSinglePrintLayoutAccount() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSavingPvVatForSinglePrintLayoutAccount(), true);
	}

	@Test(priority=10144)
	public void chechPrintPdfForMultipleLayoutVoucher() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.chechPrintPdfForMultipleLayoutVoucher(), true);
	}
	

	//6
	@Test(priority=10145)
	public void checkAddingPrintLayoutForNoofCopies() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkAddingPrintLayoutForNoofCopies(), true);
	}


	@Test(priority=10146)
	public void checkLayoutPropertiesPageType() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkLayoutPropertiesPageType(), true);
	}

	@Test(priority=10147)
	public void checkPrintPdfWithoutChangingNamesInReports() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfWithoutChangingNamesInReports(), true);
	}


	@Test(priority=10148)
	public void checkSettingLayoutLayoutNamesInReports() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSettingLayoutLayoutNamesInReports(), true);
	}

	@Test(priority=10149)
	public void checkPrintPDFAfterChangingNamesInReports() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPDFAfterChangingNamesInReports(), true);
	}



	@Test(priority=10150)
	public void checkAddingFieldsInPvVatHeader() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkAddingFieldsInPvVatHeader(), true);
	}

	@Test(priority=10151)
	public void checkSaveHeaderPictureField() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSaveHeaderPictureField(), true);
	}

	@Test(priority=10152)
	public void checkAddingFieldsInPvVATBody() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkAddingFieldsInPvVATBody(), true);
	}

	@Test(priority=10153)
	public void checkSavePictureFieldInBodyTab() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSavePictureFieldInBodyTab(), true);
	}

	@Test(priority=10154)
	public void checkSavingPvVATWithDocAndPictures() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSavingPvVATWithDocAndPictures(), true);
	}

	
	  //7
	  
	  @Test(priority=10155)
	  public void checkSavingDesignLayourForAttachments() throws AWTException, Exception
	  {
	  VPO=new VoucherPrintOptionsPage(getDriver());
	  Assert.assertEquals(VPO.checkSavingDesignLayourForAttachments(), true); 
	  }
	 

	@Test(priority=10156)
	public void checkPropertiesForLayoutAttachments() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		
		Assert.assertEquals(VPO.checkPropertiesForLayoutAttachments(), true);
	}


	@Test(priority=10157)
	public void checkPrintPDFForAttachmentsLayout() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPDFForAttachmentsLayout(), true);
	}
	
	@Test(priority=10158)
	public void checkDragandDropHeaderFiledsAndBodyFiledsIntoLayout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkDragandDropHeaderFiledsAndBodyFiledsIntoLayout(), true);
	}

	//@Test(priority=10159)
	public void checkChangeFieldPropertiesInLyout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkChangeFieldPropertiesInLyout(), true);
	}

	@Test(priority=10160)
	public void checkPrintPdfOfPurchaseVoucherVATWithCreatedLayout() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfOfPurchaseVoucherVATWithCreatedLayout(), true);
	}


	@Test(priority=10161)
	public void checkCreatingLayoutWithTwoPages() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkCreatingLayoutWithTwoPages(), true);
	}


	@Test(priority=10162)
	public void checkChangeFieldPropertiesInLayoutForMultiplePages() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkChangeFieldPropertiesInLayoutForMultiplePages(), true);
	}	  


	@Test(priority=10163)
	public void checkPrintPdfOfLayoutForMultiplePages() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfOfLayoutForMultiplePages(), true);
	}
	
	
	
	//5

	@Test(priority=10165)
	public void checkPrintPDFForAreaLayoutAfterChangingToRealtive() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPDFForAreaLayoutAfterChangingToRealtive(), true);
	}
	
	@Test(priority=10166)
	public void checkPrintPDFForImageGridLayout() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPDFForImageGridLayout(), true);
	}
	
	@Test(priority=10167)
	public void checkPrintPDFForFormaulaLayout() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPDFForFormaulaLayout(), true);
	}
	
	@Test(priority=10168)
	public void checkPrintPDFForGroupBy() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPDFForGroupBy(), true);
	}
	
	
	@Test(priority=10169)
	public void checkPintPDFForRollerLayout() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPintPDFForRollerLayout(), true);
	}
	
	@Test(priority=10170)
	public void checkPrintPDFValidationForBodyGridInArea() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPDFValidationForBodyGridInArea(), true);
	}
	

	@Test(priority=10171)//getting exception message
	public void checkFilterInPurchasesVoucherHomePage() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkFilterInPurchasesVoucherHomePage(), true);
	}
	//////////
	@Test(priority=10172)
	public void checkPurchasesAccountAndVendorAccInFilter() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPurchasesAccountAndVendorAccInFilter(), true);
	}


	@Test(priority=10177)
	public void checkPreviewOptionInPVVAT() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPreviewOptionInPVVAT(), true);
	}

	@Test(priority=10179)
	public void checkPrintAndEmailOutputOptionInPvVAT() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintAndEmailOutputOptionInPvVAT(), true);
	}
	
	@Test(priority=10180)
	public void checkEnableDoNotOpenPrintFileInNewWindowOptionInReports() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkEnableDoNotOpenPrintFileInNewWindowOptionInReports(), true);
	}

	@Test(priority=10181)
	public void checkVerifyDoNotOpenPrintFileInNewWindow() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkVerifyDoNotOpenPrintFileInNewWindow(), true);
	}
	
	@Test(priority=10182)
	public void checkMergMultipleVouchersInSingleFileOptionInReports() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkMergMultipleVouchersInSingleFileOptionInReports(), true);
	}

	@Test(priority=10183)
	public void checkVerifyMergMultipleVouchersInSingleFileOption() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkVerifyMergMultipleVouchersInSingleFileOption(), true);
	}
	
	@Test(priority=10184)
	public void checkPrintDocumentSetForTagwisePrintLayout() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintDocumentSetForTagwisePrintLayout(), true);
	}
	
	@Test(priority=21110)
	public void checkValidateCustomerStatementsReport() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkValidateCustomerStatementsReport(), true);
	}


	//Send Multiple emails to multiple customers and check any customer email data for verification
	@Test(priority=21111)
	public void checkSendCustomerStatementsReportsEmailVerificationsCreatedAccounts() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSendCustomerStatementsReportsEmailVerificationsCreatedAccounts(), true);
	}


	//@Test(priority=21112)
	public void checkValidateEmailAccountOneInBothCustomerStatementsAndEmailAccountOne() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkValidateEmailAccountOneInBothCustomerStatementsAndEmailAccountOne(), true);
	}
	
	//@Test(priority=21113)
	public void checkValidateEmailAccountTwoInBothCustomerStatementsAndEmailAccountTwo() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkValidateEmailAccountTwoInBothCustomerStatementsAndEmailAccountTwo(), true);
	}
	
	@Test(priority=21120)
	public void checkSaveSalesInvoiceNVoucherWithDescription() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSaveSalesInvoiceNVoucherWithDescription(), true);
	}
	
	@Test(priority=21121)
	public void checkPrintPDFForSalesInvoicesNForDescription() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPDFForSalesInvoicesNForDescription(), true);
	}
	
	

	@Test(priority=21125)
	public void checkPrintPDFOfSalesQuotationWithNoApprovalOfAnyUsers() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPDFOfSalesQuotationWithNoApprovalOfAnyUsers(), true);
	}
	
	@Test(priority=21126)
	public void checkPrintPDFForSaleaQuotationWithUser1ApprovalOnly() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPDFForSaleaQuotationWithUser1ApprovalOnly(), true);
	}
	
	@Test(priority=21127)
	public void checkPrintPDFForSalesQuotationsWithUser1Nd2Approval() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPDFForSalesQuotationsWithUser1Nd2Approval(), true);
	}
	
	@Test(priority=21128)
	public void checkPrintPDFForSalesQuotationWithUser12Nd3Approval() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPDFForSalesQuotationWithUser12Nd3Approval(), true);
	}
	
	@Test(priority=21129)
	public void checkPrintPDFForSalesQuotationWithUser123ND4Approval() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPDFForSalesQuotationWithUser123ND4Approval(), true);
	}
	
	@Test(priority=21130)
	public void checkPrintPDFWithAll5UsersApproval() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPDFWithAll5UsersApproval(), true);
	}
	
	@Test(priority=21131)
	public void checkPrintPDFForTheRejectedDocumentInUser1Level() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPDFForTheRejectedDocumentInUser1Level(), true);
	}
	
	@Test(priority=21132)
	public void checkPrintPDFForTheRejectedDocumentInUser2Level() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPDFForTheRejectedDocumentInUser2Level(), true);
	}
	
	@Test(priority=21133)
	public void checkPrintPDFForTheRejectedDocumentInUser123Level() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPDFForTheRejectedDocumentInUser123Level(), true);
	}
	
	
	@Test(priority=21134)
	public void checkEnableAccountNameInPostingDetailsOnScreenAndInPrint() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkEnableAccountNameInPostingDetailsOnScreenAndInPrint(), true);
	}
	
	@Test(priority=21135)
	public void checkValidateAccountNameInPostingDetailsInBothScreenAndPrint() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkValidateAccountNameInPostingDetailsInBothScreenAndPrint(), true);
	}
	
	@Test(priority=21136)
	public void checkPostingDetailsInPrintLayoutWhenAccountNameIsEnabled() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPostingDetailsInPrintLayoutWhenAccountNameIsEnabled(), true);
	}
	
	@Test(priority=21137)
	public void checkEnableAccountCodeInPostingDetailsOnScreenAndInPrint() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkEnableAccountCodeInPostingDetailsOnScreenAndInPrint(), true);
	}
	
	@Test(priority=21138)
	public void checkValidateAccountCodeInPostingDetailsInBothScreenAndPrint() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkValidateAccountCodeInPostingDetailsInBothScreenAndPrint(), true);
	}
	
	@Test(priority=21139)
	public void checkPostingDetailsInPrintLayoutWhenAccountCodeIsEnabled() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPostingDetailsInPrintLayoutWhenAccountCodeIsEnabled(), true);
	}
	
	@Test(priority=21140)
	public void checkEnableAccountNameAndCodeInPostingDetailsOnScreenAndInPrint() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkEnableAccountNameAndCodeInPostingDetailsOnScreenAndInPrint(), true);
	}
	
	@Test(priority=21141)
	public void checkValidateAccountNameAndCodeInPostingDetailsInBothScreenAndPrint() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkValidateAccountNameAndCodeInPostingDetailsInBothScreenAndPrint(), true);
	}
	
	@Test(priority=21142)
	public void checkPostingDetailsInPrintLayoutWhenAccountNameAndCodeIsEnabled() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPostingDetailsInPrintLayoutWhenAccountNameAndCodeIsEnabled(), true);
	}
	
	
	@Test(priority=21143)
	public void checkPrintCreatedDateFieldInPVVATVoucher() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintCreatedDateFieldInPVVATVoucher(), true);
	}
	
	
	
	
	
	@Test(priority=40000)
	public void checkLogoutFromVoucherPrintPage() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkLogoutFromVoucherPrintPage(), true);
	}
	
	
	/*
	
	
	//Not needed

	/*@Test(priority=10176)
	  public void checkCreatingLayoutForShapesLayout() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkCreatingLayoutForShapesLayout(), true);
	  }

	   @Test(priority=10177)
	  public void CheckShapesPropertiesInPurchaseVatDesignLayout() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.CheckShapesPropertiesInPurchaseVatDesignLayout(), true);
	  }

	  @Test(priority=10178)
	  public void checkPrintPdfofShapesLayout() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkPrintPdfofShapesLayout(), true);
	  }

	/* @Test(priority=10061)
	  public void checkSendCustomerStatementsReportsEmailVerificationsCreatedAccounts() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkSendCustomerStatementsReportsEmailVerificationsCreatedAccounts(), true);
	  }

	  @Test(priority=10062)
	  public void checkSendCustomerDueDateAnalysisReportEmailVeriForCreatedAccounts() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkSendCustomerDueDateAnalysisReportEmailVeriForCreatedAccounts(), true);
	  }

	  @Test(priority=10063)
	  public void checkSendVendorAgeingSummaryAnalysisReportEmailVerForCreatedAccounts() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkSendVendorAgeingSummaryAnalysisReportEmailVerForCreatedAccounts(), true);
	  }

	  @Test(priority=10064)
	  public void checkSendVendorSummaryAgeingByDueDateReportEmailVer() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkSendVendorSummaryAgeingByDueDateReportEmailVer(), true);
	  }


	  @Test(priority=10065)
	  public void checkSendStockMovementReportEmailVerForCreatedAccounts() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkSendStockMovementReportEmailVerForCreatedAccounts(), true);
	  }
	 
	//no need
	/*  //area
	  @Test(priority=10170)
	  public void checkAreaInPurchaseVatLayout() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkAreaInPurchaseVatLayout(), true);
	  }


	  @Test(priority=10171)
	  public void checkFiledProperitesForArea() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkFiledProperitesForArea(), true);
	  }

	  @Test(priority=10172)
	  public void checkDragnetVouchernetAndAreaItoLayout() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkDragnetVouchernetAndAreaItoLayout(), true);
	  }

	 
*/


}