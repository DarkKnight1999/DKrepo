package com.CallReview.PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.CallReview.Action.Action;
import com.CallReview.Action.Utilities;
import com.CallReview.Base.BaseClass;

public class OpportunitiesHomePage extends BaseClass
{
	static String  Parent;

	public final static By DropDownButton = By.xpath("(//lightning-button-menu[@class='menu-button-item slds-dropdown-trigger slds-dropdown-trigger_click']//button)[2]");
	
    public final static By MaintainAgreementsOriginal =By.xpath("//*[contains(text(),'Maintain Agreements - Original')]");
	
    public final static By MaintainAggrementsOriginal_PopUp = By.xpath("//*[@id=\"wrapper-body\"]/footer/button[1]/span");
    
    public final static By MaintainAggrementsOriginal_Text = By.xpath("/html[1]/body[1]/span[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/div[1]/font[1]/b[1]");
  //div[@class='pbSubsection']//span[@id='j_id0:j_id4:i:f:pb:d:NotAuthorizedMessage']/child::div[1]//b
    
    
    public final static By PopUpCloseButton =By.xpath("//button[@title='Close this window']");
    
    public final static By Iframe= By.xpath("//iframe[@name='Opportunity.Maintain_Agreements_Billing']"); 
    
    public final static By AddorEditProducts = By.xpath("//*[contains(text(),'Add / Edit Products')]");
    
    public final static By SelectClassDropdown= By.xpath("//select[@class='slds-select']");
    
    public final static By SaveButton = By.xpath("//button[contains(text(),'Save')]");
    
    public final static By ReturnToOpportunity= By.xpath("//button[contains(text(),'Return To Opportunity')]");
    
    public final static By SelectOption = By.xpath("(//button[@class=\"slds-button slds-button_brand\"])[1]");
    
    public final static By CancelButton_MaintainAgreementsOriginal = By.xpath("//*[@id=\"wrapper-body\"]/footer/button[1]");
    
    public final static By Product = By.xpath("//slot[contains(text(),'Products')]//ancestor::a");
    
    public final static By EditButton = By.xpath("//button[@title='Edit Stage']"); 
    
    
    public final static By Checkbox_MaintainAgreements = By.xpath("//*[@id=\"checkbox-1345\"]"); 
    
   
  //    products  //div[@class='slds-card__body slds-card__body--inner']//child::ul[@class='slds-grid slds-wrap list']//child::slot[contains(text(),'Products')]//parent::span
   
    
    public final static By CloseFrameButton = By.xpath("//footer[@class='slds-modal__footer']//child::button[@class='slds-button slds-button_neutral cuf-publisherCancelButton uiButton--default uiButton--brand uiButton']");

    
    
    public final static By StageDropdown = By.xpath("//div[@class='slds-combobox_container']//button[@aria-label='Stage']");
    
    
    //  stage dropdown   //div[@class='slds-combobox_container']//button[@aria-label='Stage']
  
    public final static By StageDropdown_DetailsPage= By.xpath("//button[@title='Edit Stage']"); 
    
   
   public final static By ShowAll = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div/div[2]/div[2]/section[1]/div/div/section/div/div[2]/div/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-celigo_-opp___-opportunity___-v-i-e-w___-l-m-t___1699379999000/forcegenerated-flexipage_celigo_opp_opportunity__view_js___lmt___1699379999000/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-with-subheader-template-desktop2/div/div[3]/div[2]/slot/flexipage-component2[2]/slot/lst-related-list-quick-links-container/article/laf-progressive-container/slot/lst-related-list-quick-links-grid/div/div/div/a"); 
    
   public final static By Cases=By.xpath("//slot[contains(text(),'Cases')]//ancestor::a");
   
   
   
   

  public static void Checkbox_MaintainAgreements_click() throws InterruptedException
  {
	  OpportunitiesHomePage.EditButton_Click();
//	  Action.ScrollToElement(driver.findElement(By.xpath("//input[@name='Maintain_Agreements__c' and @type='checkbox']")));
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("scroll(0, 1500);");
      Thread.sleep(10000);
//	   	wait.until(ExpectedConditions.visibilityOfElementLocated(Checkbox_MaintainAgreements));		
//	      driver.findElement(OpportunitiesHomePage.Checkbox_MaintainAgreements).click();	 
		   
	  
  }
   
   
   
   public static void CloseFrameButton_click()
   {
   	driver.findElement(OpportunitiesHomePage.CloseFrameButton).click();
   }
   
   
   public static void Cases_Click()
   {
	   Action.ScrollToElement(driver.findElement(By.xpath("//records-hoverable-link[@class='rlql-label']//slot[contains(text(),'Cases')]//ancestor::a")));
		
   	wait.until(ExpectedConditions.visibilityOfElementLocated(Cases));		
      driver.findElement(OpportunitiesHomePage.Cases).click();	 
	   
   }
   
   
   
   public static void ShowAll_Click() throws InterruptedException
   {
	   Thread.sleep(5000);
//	   Action.ScrollToElement(driver.findElement(By.xpath("//div[@class='rlql-toggle slds-text-align_center']//child::a[contains(text(),'Show All')]")));
	   JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("scroll(0, 750);");
       Thread.sleep(5000);
   	wait.until(ExpectedConditions.visibilityOfElementLocated(ShowAll));		
      driver.findElement(OpportunitiesHomePage.ShowAll).click();	 
	 Thread.sleep(5000);
//	 JavascriptExecutor js1 = (JavascriptExecutor) driver;
//     js1.executeScript("scroll(0, 700);");
   }
    
    
    
    
    
    
    
    
    
    
    public static void EditButton_Click() throws InterruptedException
    {
    	Thread.sleep(5000);
//    	Action.ScrollToElement_JavaScript(driver.findElement(By.xpath("//span[contains(text(),'Booking Date')]//ancestor::button[@title='Select a date for Booking Date']")));
//    	Action.ScrollToElement(driver.findElement(By.xpath("//button[@title='Edit Close Date']")));
//    	Thread.sleep(5000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0, 750);");
        Thread.sleep(5000);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(EditButton));		
       driver.findElement(OpportunitiesHomePage.EditButton).click();	
    }
    
    
    
    public static void StageDropdown_DetailsPage_Click() throws AWTException, InterruptedException
    {
//    	Action.ScrollToElement(driver.findElement(By.xpath("//span[text()='Stage']//ancestor::div[@class=\"slds-grid slds-size_1-of-1 label-stacked undefined\"]//span//lightning-formatted-text")));
		Thread.sleep(3000);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(StageDropdown_DetailsPage));
		
		Action.ActionsCommon(driver.findElement(OpportunitiesHomePage.StageDropdown_DetailsPage));
		Thread.sleep(3000);
		OpportunitiesHomePage.StageDropdown_Click();
    }
    
    
    public static void StageDropdown_Click() throws AWTException, InterruptedException
    {
    	Action.ScrollToElement(driver.findElement(By.xpath("//div[@class='slds-combobox_container']//button[@aria-label='Stage']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(StageDropdown));
		driver.findElement(OpportunitiesHomePage.StageDropdown).click();
		Utilities.ClosedWon_StageDropDown();
    	
    }
    
    public final static void Product_Click() throws AWTException, InterruptedException
    {
		Action.ScrollToElement(driver.findElement(By.xpath("//span[@title='Products']//parent::a")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Product));
		driver.findElement(OpportunitiesHomePage.Product).click();
		Utilities.ClosedWon_StageDropDown();

    }
    
    
    public static void CancelButton_MaintainAgreementsOriginal() throws InterruptedException
    {
    	Thread.sleep(3000);
    	driver.findElement(OpportunitiesHomePage.CancelButton_MaintainAgreementsOriginal).click();
    }
    
    
    
    public static void SelectOption_Click()
    {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(SelectOption)); 
    
    	driver.findElement(OpportunitiesHomePage.SelectOption).click();
    }
    
    
    public static void ReturnToOpportunity_Click()
    {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(ReturnToOpportunity));

    	driver.findElement(OpportunitiesHomePage.ReturnToOpportunity).click();
    }
    
    
    
    public static void SaveButtonClick()
    {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(SaveButton));

    	driver.findElement(OpportunitiesHomePage.SaveButton).click();
    }
    
    public static void SelectClassDropdownClick()
    {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(SelectClassDropdown));
    	
//    	Action.SelectClassDropdown(driver.findElement(By.xpath("//select[@class='slds-select']")), 3);
    	Action.SelectClassDropdown(driver.findElement(By.xpath("//select[@class='slds-select']")));
    }
    	
    public static void AddorEditProductsClick()
    {
    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(AddorEditProducts));
    	driver.findElement(OpportunitiesHomePage.AddorEditProducts).click();
    }
    
	 public static void DropDownButtonClick() throws InterruptedException, AWTException
	 {
		 Thread.sleep(5000);
		Action.ScrollToElement(driver.findElement(By.xpath("(//lightning-button-menu[@class='menu-button-item slds-dropdown-trigger slds-dropdown-trigger_click']//button)[2]")));

		 wait.until(ExpectedConditions.visibilityOfElementLocated(DropDownButton));
		 driver.findElement(OpportunitiesHomePage.DropDownButton).click();
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MaintainAgreementsOriginal));

		 driver.findElement(OpportunitiesHomePage.MaintainAgreementsOriginal).click();
		
	 }

	 public static void GetText_MaintainAgreementsOriginal() throws InterruptedException
	 {
		 Thread.sleep(10000);
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='Opportunity.Maintain_Agreements_Billing']")));
		 Thread.sleep(15000);
		 System.out.println( driver.findElement(OpportunitiesHomePage.MaintainAggrementsOriginal_Text).getText());
//		 WebElement textarea = driver.findElement(OpportunitiesHomePage.MaintainAggrementsOriginal_Text);
//		 String selectedText = (String)((JavascriptExecutor)driver).executeScript("return arguments[0].value.substring(arguments[0].selectionStart, arguments[0].selectionEnd);", textarea);
//		 System.out.println("Selected Text: " + selectedText);
	 }
	 
	 
	 public static void MaintainAgreementsOriginalClick() throws InterruptedException, AWTException
	 {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MaintainAgreementsOriginal));
		 driver.findElement(OpportunitiesHomePage.MaintainAgreementsOriginal).click();
		 Thread.sleep(10000);
		 
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='Opportunity.Maintain_Agreements_Billing']")));
     	 Thread.sleep(10000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(MaintainAggrementsOriginal_Text));
		 System.out.println( driver.findElement(OpportunitiesHomePage.MaintainAggrementsOriginal_Text).getText());
         Robot r = new Robot();
         r.keyPress(KeyEvent.VK_ESCAPE);
         r.keyRelease(KeyEvent.VK_ESCAPE);

		 
	 }
	 
	 
	 public static void Text() throws InterruptedException
	 {
		 
		 driver.findElement(OpportunitiesHomePage.DropDownButton).click();
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MaintainAgreementsOriginal));
		 driver.findElement(OpportunitiesHomePage.MaintainAgreementsOriginal).click();
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='Opportunity.Maintain_Agreements_Billing']")));
		 Thread.sleep(50000);
		 System.out.println( driver.findElement(OpportunitiesHomePage.MaintainAggrementsOriginal_Text).getText());

		 
		 
	 }
	 
	 
	 
//	 public static void MaintainAgreementsOriginalClick_switch() throws InterruptedException
//	 {
//		
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MaintainAgreementsOriginal));
//		 driver.findElement(OpportunitiesHomePage.MaintainAgreementsOriginal).click();
//		 Thread.sleep(20000);
//		 
//		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='Opportunity.Maintain_Agreements_Billing']")));
////		 Thread.sleep(1000);
//		 wait.until(ExpectedConditions.visibilityOfElementLocated(MaintainAggrementsOriginal_Text));
//		 System.out.println( driver.findElement(OpportunitiesHomePage.MaintainAggrementsOriginal_Text).getText());
//          driver.switchTo().newWindow(WindowType.TAB);
//          driver.get(Link);
//		 
//		 
//		 //		driver.switchTo().defaultContent();
////		 driver.findElement(OpportunitiesHomePage.PopUpCloseButton).click();
////		 driver.close();
//	 }
	 
	
	 
}
