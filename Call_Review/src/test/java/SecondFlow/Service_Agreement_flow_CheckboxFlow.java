package SecondFlow;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.CallReview.PageObjects.HomePage;
import com.CallReview.PageObjects.LoginPage;
import com.CallReview.PageObjects.NewOpportunityRecordTypePage;
import com.CallReview.PageObjects.NewOpportunity_CreationPage;
import com.CallReview.PageObjects.OpportunitiesHomePage;

public class Service_Agreement_flow_CheckboxFlow extends LoginPage {

	LoginPage lp;
	public static String recordtype ;

		@Test(priority = 1)
		public void NotAunthorizedToMaintainAgreements() throws IOException, InterruptedException, AWTException
		{
			
		LoginPage.Login();
//        Thread.sleep(30000);
//		HomePage.ProfileIconClick();
//		HomePage.UserNameHyperLinkClick();
//		Thread.sleep(10000);
//		UserProfilePage.EditButtonClick();
//		Thread.sleep(20000);
		HomePage.SelectOpportynitiesObject();
		HomePage.NewButtonForOpportunityCreationClick();
		NewOpportunityRecordTypePage.NextButtonClick();
		NewOpportunity_CreationPage.OpportunityNameTextField_EnterText();
		Thread.sleep(2000);
        NewOpportunity_CreationPage.ClickAccountName();		
	    
	    NewOpportunity_CreationPage.CloseDateDropdownClick();
	    Thread.sleep(10000);
//		NewOpportunity_CreationPage.CloseWon_stageDropDownClick();
		
		NewOpportunity_CreationPage.BillToAccount();
		
		NewOpportunity_CreationPage.SaveButtonClick();
		 Thread.sleep(10000);
		OpportunitiesHomePage.Checkbox_MaintainAgreements_click();
	    NewOpportunity_CreationPage.SaveButtonClick();

			
		}
		
		
		@Test(priority = 2)
		public static void NotificationOnOpportunityisProceeded() throws InterruptedException, AWTException
		{
		LoginPage.Login();
		HomePage.SelectOpportynitiesObject();
		HomePage.OpportunitieClick();
		OpportunitiesHomePage.Checkbox_MaintainAgreements_click();
	    NewOpportunity_CreationPage.SaveButtonClick();


//		OpportunitiesHomePage.MaintainAgreementsOriginalClick();
//		Thread.sleep(5000);
//		NewOpportunity_CreationPage.CloseDateDropdownClick();
		
		}
	
		@Test(priority = 3)
		public static void MustHaveBillToAccountToProcessTheOpportunity() throws InterruptedException, AWTException
		{
			
			Login();
			HomePage.SelectOpportynitiesObject();
			HomePage.NewButtonForOpportunityCreationClick();
			NewOpportunityRecordTypePage.NextButtonClick();
			NewOpportunity_CreationPage.OpportunityNameTextField_EnterText();
			NewOpportunity_CreationPage.ClickAccountName();	
			NewOpportunity_CreationPage.CloseDateDropdownClick();
			Thread.sleep(10000);
//			NewOpportunity_CreationPage.stageDropDownClick_ClosedWon();			
			NewOpportunity_CreationPage.SaveButtonClick();			
//			OpportunitiesHomePage.DropDownButtonClick();
//			OpportunitiesHomePage.MaintainAgreementsOriginalClick();
			OpportunitiesHomePage.Checkbox_MaintainAgreements_click();
		    NewOpportunity_CreationPage.SaveButtonClick();
		}
		
		
    	@Test(priority = 4)
		public static void OpportunitymustbeClosedWon() throws InterruptedException, AWTException
		{
			Login();
			HomePage.SelectOpportynitiesObject();
			HomePage.NewButtonForOpportunityCreationClick();
			NewOpportunityRecordTypePage.NextButtonClick();
			NewOpportunity_CreationPage.OpportunityNameTextField_EnterText();
			NewOpportunity_CreationPage.ClickAccountName();				
			NewOpportunity_CreationPage.CloseDateDropdownClick();
			Thread.sleep(10000);
//            NewOpportunity_CreationPage.stageDropDownClick();
			NewOpportunity_CreationPage.BillToAccount();			
			NewOpportunity_CreationPage.SaveButtonClick();
			Thread.sleep(10000);
			OpportunitiesHomePage.Checkbox_MaintainAgreements_click();
		    NewOpportunity_CreationPage.SaveButtonClick();
//			OpportunitiesHomePage.DropDownButtonClick();
//			OpportunitiesHomePage.MaintainAgreementsOriginalClick();
					
		}
		
		@Test(priority = 5)
		public static void YouCannotProcessNewOpportunitywithCurrentServiceAgreement() throws InterruptedException, AWTException
		{
			Login();
			HomePage.SelectOpportynitiesObject();
			HomePage.NewButtonForOpportunityCreationClick();
			NewOpportunityRecordTypePage.NextButtonClick();
//			Thread.sleep(10000);
			NewOpportunity_CreationPage.OpportunityNameTextField_EnterText();
			NewOpportunity_CreationPage.ClickAccountName();	
			NewOpportunity_CreationPage.CloseDateDropdownClick();
			Thread.sleep(10000);
//            NewOpportunity_CreationPage.stageDropDownClick_ClosedWon();	
			NewOpportunity_CreationPage.BillToAccount();
			NewOpportunity_CreationPage.OrderTypeClick();//			
			NewOpportunity_CreationPage.ServiceAgreementClick();
			NewOpportunity_CreationPage.SaveButtonClick();
			Thread.sleep(10000);
			OpportunitiesHomePage.Checkbox_MaintainAgreements_click();
		    NewOpportunity_CreationPage.SaveButtonClick();			
//			HomePage.SelectOpportynitiesObject();
//			Thread.sleep(2000);
//			OpportunitiesHomePage.DropDownButtonClick();
//			Thread.sleep(2000);
//			OpportunitiesHomePage.MaintainAgreementsOriginalClick();
					
		}
		
		
		
		@Test(priority = 6)
		public static void missingInformation() throws InterruptedException, AWTException
		{
			Login();
			HomePage.SelectOpportynitiesObject();
			HomePage.NewButtonForOpportunityCreationClick();
			NewOpportunityRecordTypePage.NextButtonClick();
//			Thread.sleep(10000);
			NewOpportunity_CreationPage.OpportunityNameTextField_EnterText();
			NewOpportunity_CreationPage.ClickAccountName();	
			NewOpportunity_CreationPage.CloseDateDropdownClick();
			Thread.sleep(10000);
//            NewOpportunity_CreationPage.stageDropDownClick();			
			NewOpportunity_CreationPage.BillToAccount();			
			NewOpportunity_CreationPage.OrderTypeClick_ChangeOrder();			
//			NewOpportunity_CreationPage.ServiceAgreementClick();
			NewOpportunity_CreationPage.SaveButtonClick();
			Thread.sleep(10000);
			OpportunitiesHomePage.Checkbox_MaintainAgreements_click();
		    NewOpportunity_CreationPage.SaveButtonClick();
			
			
//			HomePage.SelectOpportynitiesObject();
//			Thread.sleep(2000);
//			OpportunitiesHomePage.DropDownButtonClick();
//			Thread.sleep(2000);
//			OpportunitiesHomePage.MaintainAgreementsOriginalClick();
					
		}
	
		
//		@Test(priority = 6)
//		public static void Checkbox() throws InterruptedException, AWTException
//		{
//			Login();
//			HomePage.SelectOpportynitiesObject();
//			HomePage.NewButtonForOpportunityCreationClick();
//			NewOpportunityRecordTypePage.NextButtonClick();
////			Thread.sleep(10000);
//			NewOpportunity_CreationPage.OpportunityNameTextField_EnterText();
//			NewOpportunity_CreationPage.ClickAccountName();	
//			NewOpportunity_CreationPage.CloseDateDropdownClick();
//			Thread.sleep(10000);
////            NewOpportunity_CreationPage.stageDropDownClick();			
//			NewOpportunity_CreationPage.BillToAccount();			
//			NewOpportunity_CreationPage.OrderTypeClick();			
////			NewOpportunity_CreationPage.ServiceAgreementClick();
//			NewOpportunity_CreationPage.SaveButtonClick();
//			Thread.sleep(10000);
//			OpportunitiesHomePage.Checkbox_MaintainAgreements_click();
//		    NewOpportunity_CreationPage.SaveButtonClick();
//		
//		}
		
		
}
		
		
		