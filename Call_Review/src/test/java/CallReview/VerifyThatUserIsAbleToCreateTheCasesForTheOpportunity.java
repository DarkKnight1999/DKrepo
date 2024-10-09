package CallReview;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.CallReview.Base.BaseClass;
import com.CallReview.PageObjects.HomePage;
import com.CallReview.PageObjects.LoginPage;
import com.CallReview.PageObjects.NewOpportunityRecordTypePage;
import com.CallReview.PageObjects.NewOpportunity_CreationPage;
import com.CallReview.PageObjects.OpportunitiesHomePage;

public class VerifyThatUserIsAbleToCreateTheCasesForTheOpportunity extends BaseClass
{

	@Test(priority = 1)
	public void EnrollementCaseIsCreatedForTheOpportunityWhenTheAgreementworkflowtypeisselectedAsSendToEnrollment() throws IOException, InterruptedException, AWTException
	{
	LoginPage.Login();
	HomePage.SelectOpportynitiesObject();
	HomePage.NewButtonForOpportunityCreationClick();
	NewOpportunityRecordTypePage.NextButtonClick();
	NewOpportunity_CreationPage.OpportunityNameTextField_EnterText();
	Thread.sleep(2000);
    NewOpportunity_CreationPage.ClickAccountName();		
//    Thread.sleep(10000);
    NewOpportunity_CreationPage.CloseDateDropdownClick();
	NewOpportunity_CreationPage.stageDropDownClick();
	Thread.sleep(10000);
	
	NewOpportunity_CreationPage.BillToAccount();
	Thread.sleep(5000);
	NewOpportunity_CreationPage.OrderTypeClick_ChangeOrder();
	Thread.sleep(5000);
	NewOpportunity_CreationPage.AgreementWorkFlowDropDown_Click();
	Thread.sleep(2000);
	NewOpportunity_CreationPage.SaveButtonClick();
	
    OpportunitiesHomePage.DropDownButtonClick();
	
    OpportunitiesHomePage.AddorEditProductsClick();
    Thread.sleep(3000);
    OpportunitiesHomePage.SelectClassDropdownClick();
    Thread.sleep(5000);
    OpportunitiesHomePage.SelectOption_Click();
    Thread.sleep(5000);
    OpportunitiesHomePage.SaveButtonClick();
    Thread.sleep(5000);
    OpportunitiesHomePage.ReturnToOpportunity_Click();
    Thread.sleep(10000);
    OpportunitiesHomePage.EditButton_Click();
    Thread.sleep(5000);
    NewOpportunity_CreationPage.CloseWon_stageDropDownClick();
    NewOpportunity_CreationPage.SaveButtonClick();
	
	OpportunitiesHomePage.DropDownButtonClick();
	Thread.sleep(2000);
	OpportunitiesHomePage.MaintainAgreementsOriginalClick();
		
	}
	
	
	
	
	@Test(priority = 2)
	public void SupportCaseIsCreatedForTheOpportunityWhenTheAgreementWorkFlowTypeIsSelectedAsSendToSupport() throws IOException, InterruptedException, AWTException
	{
	LoginPage.Login();
	HomePage.SelectOpportynitiesObject();
	HomePage.NewButtonForOpportunityCreationClick();
	NewOpportunityRecordTypePage.NextButtonClick();
	NewOpportunity_CreationPage.OpportunityNameTextField_EnterText();
	Thread.sleep(2000);
    NewOpportunity_CreationPage.ClickAccountName();		
//    Thread.sleep(10000);
    NewOpportunity_CreationPage.CloseDateDropdownClick();
	NewOpportunity_CreationPage.stageDropDownClick();
	Thread.sleep(10000);
	
	NewOpportunity_CreationPage.BillToAccount();
	Thread.sleep(5000);
	NewOpportunity_CreationPage.OrderTypeClick_New();
	Thread.sleep(5000);
	NewOpportunity_CreationPage.AgreementWorkFlowDropDownClick_SendToSupport();
	Thread.sleep(2000);
	NewOpportunity_CreationPage.SaveButtonClick();
	
    OpportunitiesHomePage.DropDownButtonClick();
	
    OpportunitiesHomePage.AddorEditProductsClick();
    Thread.sleep(3000);
    OpportunitiesHomePage.SelectClassDropdownClick();
    Thread.sleep(5000);
    OpportunitiesHomePage.SelectOption_Click();
    Thread.sleep(5000);
    OpportunitiesHomePage.SaveButtonClick();
    Thread.sleep(5000);
    OpportunitiesHomePage.ReturnToOpportunity_Click();
    Thread.sleep(10000);
    OpportunitiesHomePage.EditButton_Click();
    Thread.sleep(5000);
    NewOpportunity_CreationPage.CloseWon_stageDropDownClick();
    NewOpportunity_CreationPage.SaveButtonClick();
    Thread.sleep(2000);
	OpportunitiesHomePage.DropDownButtonClick();
	Thread.sleep(2000);
	OpportunitiesHomePage.MaintainAgreementsOriginalClick();
//	System.out.println("------------");
//	Thread.sleep(10000);
//
//	OpportunitiesHomePage.ShowAll_Click();
//	OpportunitiesHomePage.Cases_Click();
//	Thread.sleep(10000);	
	}
	
	
	@Test(priority = 3)
	public void SupportAndEnrollmentCreatedWhereWorkFlowTypeIsSendtoSupportandEnrollment() throws IOException, InterruptedException, AWTException
	{
	LoginPage.Login();
	HomePage.SelectOpportynitiesObject();
	HomePage.NewButtonForOpportunityCreationClick();
	NewOpportunityRecordTypePage.NextButtonClick();
	NewOpportunity_CreationPage.OpportunityNameTextField_EnterText();
	Thread.sleep(2000);
    NewOpportunity_CreationPage.ClickAccountName();		
//    Thread.sleep(10000);
    NewOpportunity_CreationPage.CloseDateDropdownClick();
	NewOpportunity_CreationPage.stageDropDownClick();
	Thread.sleep(10000);
	
	NewOpportunity_CreationPage.BillToAccount();
	Thread.sleep(5000);
	NewOpportunity_CreationPage.OrderTypeClick_New();
	Thread.sleep(5000);
	NewOpportunity_CreationPage.AgreementWorkFlowDropDownClick_SendToSupport();
	Thread.sleep(2000);
	NewOpportunity_CreationPage.SaveButtonClick();
	
    OpportunitiesHomePage.DropDownButtonClick();
	
    OpportunitiesHomePage.AddorEditProductsClick();
    Thread.sleep(3000);
    OpportunitiesHomePage.SelectClassDropdownClick();
    Thread.sleep(5000);
    OpportunitiesHomePage.SelectOption_Click();
    Thread.sleep(5000);
    OpportunitiesHomePage.SaveButtonClick();
    Thread.sleep(5000);
    OpportunitiesHomePage.ReturnToOpportunity_Click();
    Thread.sleep(10000);
    OpportunitiesHomePage.EditButton_Click();
    Thread.sleep(5000);
    NewOpportunity_CreationPage.CloseWon_stageDropDownClick();
    NewOpportunity_CreationPage.SaveButtonClick();
    Thread.sleep(2000);
	OpportunitiesHomePage.DropDownButtonClick();
	Thread.sleep(2000);
	OpportunitiesHomePage.MaintainAgreementsOriginalClick();

//
//	OpportunitiesHomePage.ShowAll_Click();
//	OpportunitiesHomePage.Cases_Click();
//	Thread.sleep(10000);	
	}

	@Test(priority = 4)
	public void Addendum_Workflow() throws IOException, InterruptedException, AWTException
	{
	LoginPage.Login();
	HomePage.SelectOpportynitiesObject();
	HomePage.NewButtonForOpportunityCreationClick();
	NewOpportunityRecordTypePage.NextButtonClick();
	NewOpportunity_CreationPage.OpportunityNameTextField_EnterText();
	Thread.sleep(2000);
    NewOpportunity_CreationPage.ClickAccountName();		
//    Thread.sleep(10000);
    NewOpportunity_CreationPage.CloseDateDropdownClick();
	NewOpportunity_CreationPage.stageDropDownClick();
	Thread.sleep(10000);
	
	NewOpportunity_CreationPage.BillToAccount();
	Thread.sleep(5000);
	NewOpportunity_CreationPage.OrderTypeClick_ChangeOrder();
	Thread.sleep(5000);
	NewOpportunity_CreationPage.AgreementWorkFlowDropDown_Click();
	Thread.sleep(2000);
	NewOpportunity_CreationPage.SaveButtonClick();
	
    OpportunitiesHomePage.DropDownButtonClick();
	
    OpportunitiesHomePage.AddorEditProductsClick();
    Thread.sleep(3000);
    OpportunitiesHomePage.SelectClassDropdownClick();
    Thread.sleep(5000);
    OpportunitiesHomePage.SelectOption_Click();
    Thread.sleep(5000);
    OpportunitiesHomePage.SaveButtonClick();
    Thread.sleep(5000);
    OpportunitiesHomePage.ReturnToOpportunity_Click();
    Thread.sleep(10000);
    OpportunitiesHomePage.EditButton_Click();
    Thread.sleep(5000);
    NewOpportunity_CreationPage.CloseWon_stageDropDownClick();
    NewOpportunity_CreationPage.SaveButtonClick();
	
	OpportunitiesHomePage.DropDownButtonClick();
	Thread.sleep(2000);
	OpportunitiesHomePage.MaintainAgreementsOriginalClick();
		
	}
	

	@Test(priority = 5)
	public void DNICaseIsCreatedAgreementWorkFlowTypeIsSlectedAsDNIOnly() throws IOException, InterruptedException, AWTException
	{
	LoginPage.Login();
	HomePage.SelectOpportynitiesObject();
	HomePage.NewButtonForOpportunityCreationClick();
	NewOpportunityRecordTypePage.NextButtonClick();
	NewOpportunity_CreationPage.OpportunityNameTextField_EnterText();
	Thread.sleep(2000);
    NewOpportunity_CreationPage.ClickAccountName();		
//    Thread.sleep(10000);
    NewOpportunity_CreationPage.CloseDateDropdownClick();
	NewOpportunity_CreationPage.stageDropDownClick();
	Thread.sleep(10000);
	
	NewOpportunity_CreationPage.BillToAccount();
	Thread.sleep(5000);
	NewOpportunity_CreationPage.OrderTypeClick_ChangeOrder();
	Thread.sleep(5000);
	NewOpportunity_CreationPage.AgreementWorkFlowDropDown_Click();
	Thread.sleep(2000);
	NewOpportunity_CreationPage.SaveButtonClick();
	
    OpportunitiesHomePage.DropDownButtonClick();
	
    OpportunitiesHomePage.AddorEditProductsClick();
    Thread.sleep(3000);
    OpportunitiesHomePage.SelectClassDropdownClick();
    Thread.sleep(5000);
    OpportunitiesHomePage.SelectOption_Click();
    Thread.sleep(5000);
    OpportunitiesHomePage.SaveButtonClick();
    Thread.sleep(5000);
    OpportunitiesHomePage.ReturnToOpportunity_Click();
    Thread.sleep(10000);
    OpportunitiesHomePage.EditButton_Click();
    Thread.sleep(5000);
    NewOpportunity_CreationPage.CloseWon_stageDropDownClick();
    NewOpportunity_CreationPage.SaveButtonClick();
	
	OpportunitiesHomePage.DropDownButtonClick();
	Thread.sleep(2000);
	OpportunitiesHomePage.MaintainAgreementsOriginalClick();
		
	}
	
	
}
