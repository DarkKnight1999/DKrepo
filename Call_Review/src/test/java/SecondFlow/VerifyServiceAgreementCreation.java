package SecondFlow;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.CallReview.Base.BaseClass;
import com.CallReview.PageObjects.HomePage;
import com.CallReview.PageObjects.LoginPage;
import com.CallReview.PageObjects.NewOpportunityRecordTypePage;
import com.CallReview.PageObjects.NewOpportunity_CreationPage;
import com.CallReview.PageObjects.OpportunitiesHomePage;

public class VerifyServiceAgreementCreation extends BaseClass
{

	@Test(priority = 1)
	public void UserAbleToCreateOpportunity() throws IOException, InterruptedException, AWTException
	{
	LoginPage.Login();
	HomePage.SelectOpportynitiesObject();
	HomePage.NewButtonForOpportunityCreationClick();
	NewOpportunityRecordTypePage.NextButtonClick();
	NewOpportunity_CreationPage.OpportunityNameTextField_EnterText();
	Thread.sleep(2000);
    NewOpportunity_CreationPage.ClickAccountName();		
    Thread.sleep(10000);
    NewOpportunity_CreationPage.CloseDateDropdownClick();
    Thread.sleep(10000);
//	NewOpportunity_CreationPage.stageDropDownClick();
	
	NewOpportunity_CreationPage.BillToAccount();
	
	
	NewOpportunity_CreationPage.SaveButtonClick();
	
	
	OpportunitiesHomePage.Checkbox_MaintainAgreements_click();
    NewOpportunity_CreationPage.SaveButtonClick();
		
	}
	
	@Test(priority = 2)
	public static void UserAbleToUpdateTheOpportunity() throws InterruptedException, AWTException
	{
	LoginPage.Login();
	HomePage.SelectOpportynitiesObject();
	HomePage.OpportunitieClick();
	OpportunitiesHomePage.Checkbox_MaintainAgreements_click();
    NewOpportunity_CreationPage.SaveButtonClick();
//	NewOpportunity_CreationPage.CloseDateDropdownClick();
	
	}
	
	@Test(priority = 3)
	public void UserAbleToAddTheProducts() throws IOException, InterruptedException, AWTException
	{
	LoginPage.Login();
	HomePage.SelectOpportynitiesObject();
	HomePage.NewButtonForOpportunityCreationClick();
	NewOpportunityRecordTypePage.NextButtonClick();
	NewOpportunity_CreationPage.OpportunityNameTextField_EnterText();
	
    NewOpportunity_CreationPage.ClickAccountName();		
    
    NewOpportunity_CreationPage.CloseDateDropdownClick();
    Thread.sleep(10000);
//	NewOpportunity_CreationPage.stageDropDownClick();
	
	NewOpportunity_CreationPage.BillToAccount();
	
	NewOpportunity_CreationPage.SaveButtonClick();
	
	
	OpportunitiesHomePage.DropDownButtonClick();
	
    
	OpportunitiesHomePage.AddorEditProductsClick();

	
    
	OpportunitiesHomePage.SelectClassDropdownClick();
    
	Thread.sleep(10000);
    
	OpportunitiesHomePage.SelectOption_Click();
    
	Thread.sleep(10000);
    
	OpportunitiesHomePage.SaveButtonClick();
    Thread.sleep(10000);
    OpportunitiesHomePage.ReturnToOpportunity_Click();
//    OpportunitiesHomePage.Product_Click();

	}
	
	
	
	@Test(priority = 4)
	
	public static void OrderTypeValueisSetToNew() throws InterruptedException, AWTException
	{
		LoginPage.Login();
		HomePage.SelectOpportynitiesObject();
		HomePage.NewButtonForOpportunityCreationClick();
		NewOpportunityRecordTypePage.NextButtonClick();
		NewOpportunity_CreationPage.OpportunityNameTextField_EnterText();
		NewOpportunity_CreationPage.ClickAccountName();	
		NewOpportunity_CreationPage.CloseDateDropdownClick();
		Thread.sleep(10000);
		NewOpportunity_CreationPage.CloseWon_stageDropDownClick();
//        NewOpportunity_CreationPage.stageDropDownClick_ClosedWon();
		
		NewOpportunity_CreationPage.BillToAccount();
		
		NewOpportunity_CreationPage.OrderTypeClick();
//		
//		NewOpportunity_CreationPage.ServiceAgreementClick();
		NewOpportunity_CreationPage.SaveButtonClick();
		Thread.sleep(5000);
		OpportunitiesHomePage.Checkbox_MaintainAgreements_click();
	    NewOpportunity_CreationPage.SaveButtonClick();
		
//		OpportunitiesHomePage.CancelButton_MaintainAgreementsOriginal();
		
		
		
//		HomePage.SelectOpportynitiesObject();
//		Thread.sleep(2000);
//		OpportunitiesHomePage.DropDownButtonClick();
//		Thread.sleep(2000);
//		OpportunitiesHomePage.MaintainAgreementsOriginalClick();
				
	}
	
	
	@Test(priority = 5)
	public void OrderTypevalueisNew() throws IOException, InterruptedException, AWTException
	{
		
	LoginPage.Login();
	HomePage.SelectOpportynitiesObject();
	HomePage.NewButtonForOpportunityCreationClick();
	NewOpportunityRecordTypePage.NextButtonClick();
	NewOpportunity_CreationPage.OpportunityNameTextField_EnterText();
	Thread.sleep(3000);
    NewOpportunity_CreationPage.ClickAccountName();		
    
    NewOpportunity_CreationPage.CloseDateDropdownClick();
    Thread.sleep(10000);
//	NewOpportunity_CreationPage.stageDropDownClick();
	
	NewOpportunity_CreationPage.BillToAccount();
	
	NewOpportunity_CreationPage.SaveButtonClick();
	
	
	Thread.sleep(5000);
	OpportunitiesHomePage.DropDownButtonClick();
	Thread.sleep(5000);
    OpportunitiesHomePage.AddorEditProductsClick();
    Thread.sleep(5000);
    OpportunitiesHomePage.SelectClassDropdownClick();
    Thread.sleep(10000);
    OpportunitiesHomePage.SelectOption_Click();
   
    OpportunitiesHomePage.SaveButtonClick();
   
    OpportunitiesHomePage.ReturnToOpportunity_Click();
   
//    OpportunitiesHomePage.Product_Click();
//    Thread.sleep(10000);
    OpportunitiesHomePage.EditButton_Click();
    Thread.sleep(5000);
    NewOpportunity_CreationPage.CloseWon_stageDropDownClick();
    OpportunitiesHomePage.Checkbox_MaintainAgreements_click();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("scroll(0, 1500);");
    Thread.sleep(10000);
    NewOpportunity_CreationPage.SaveButtonClick();
       
	}
	
	
	
	@Test(priority = 6)
	public void missingInformationNotificationWhenAnyInformationIsMissed() throws IOException, InterruptedException, AWTException
	{
	LoginPage.Login();
	HomePage.SelectOpportynitiesObject();
	HomePage.NewButtonForOpportunityCreationClick();
	NewOpportunityRecordTypePage.NextButtonClick();
	NewOpportunity_CreationPage.OpportunityNameTextField_EnterText();
	Thread.sleep(3000);
    NewOpportunity_CreationPage.ClickAccountName();		
    Thread.sleep(3000);
    
//	NewOpportunity_CreationPage.CloseWon_stageDropDownClick();
	Thread.sleep(3000);
	NewOpportunity_CreationPage.CloseDateDropdownClick();
    Thread.sleep(10000);
	NewOpportunity_CreationPage.BillToAccount();

	NewOpportunity_CreationPage.OrderTypeClick();
	
	NewOpportunity_CreationPage.BillToAccount();
	
	NewOpportunity_CreationPage.SaveButtonClick();
	
	OpportunitiesHomePage.DropDownButtonClick();
	
    OpportunitiesHomePage.AddorEditProductsClick();

    OpportunitiesHomePage.SelectClassDropdownClick();
    Thread.sleep(10000);
    OpportunitiesHomePage.SelectOption_Click();
   
    OpportunitiesHomePage.SaveButtonClick();
    Thread.sleep(5000);
    OpportunitiesHomePage.Checkbox_MaintainAgreements_click();
    NewOpportunity_CreationPage.SaveButtonClick();
    
	}
	
	
	@Test(priority = 7)
	public void OrderTypeValueIsSetToChangeOrder() throws IOException, InterruptedException, AWTException
	{
	LoginPage.Login();
	HomePage.SelectOpportynitiesObject();
	HomePage.NewButtonForOpportunityCreationClick();
	NewOpportunityRecordTypePage.NextButtonClick();
	NewOpportunity_CreationPage.OpportunityNameTextField_EnterText();
	Thread.sleep(3000);
    NewOpportunity_CreationPage.ClickAccountName();		
    
    NewOpportunity_CreationPage.CloseDateDropdownClick();
    Thread.sleep(10000);
//	NewOpportunity_CreationPage.stageDropDownClick();
	
	NewOpportunity_CreationPage.BillToAccount();
	NewOpportunity_CreationPage.OrderTypeClick_ChangeOrder();
	NewOpportunity_CreationPage.ServiceAgreementClick();
	NewOpportunity_CreationPage.SaveButtonClick();
		
	OpportunitiesHomePage.DropDownButtonClick();
    OpportunitiesHomePage.AddorEditProductsClick();
    OpportunitiesHomePage.SelectClassDropdownClick();
    Thread.sleep(10000);
    OpportunitiesHomePage.SelectOption_Click();
    Thread.sleep(10000);
    OpportunitiesHomePage.SaveButtonClick();
    Thread.sleep(10000);
    OpportunitiesHomePage.ReturnToOpportunity_Click();
   
//    OpportunitiesHomePage.Product_Click();
    Thread.sleep(10000);
    OpportunitiesHomePage.EditButton_Click();
    Thread.sleep(5000);
    NewOpportunity_CreationPage.CloseWon_stageDropDownClick();
    NewOpportunity_CreationPage.SaveButtonClick();
    Thread.sleep(5000);
    OpportunitiesHomePage.Checkbox_MaintainAgreements_click();
    NewOpportunity_CreationPage.SaveButtonClick();
	
	}
	
	
	
	
}
