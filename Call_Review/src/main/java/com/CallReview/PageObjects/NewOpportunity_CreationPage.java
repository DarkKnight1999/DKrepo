package com.CallReview.PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.CallReview.Action.Action;
import com.CallReview.Action.Utilities;
import com.CallReview.Base.BaseClass;


public class NewOpportunity_CreationPage extends BaseClass
{
	//input[@id='input-960']
	
	public final static By OpportunityNameTextField= By.xpath("//input[@name='Name']");
	
	public final static By AccountNameTextField= By.xpath("//label[contains(text(),'Account Name')]//ancestor::records-record-layout-lookup[@data-input-element-id='input-field']//input[@placeholder='Search Accounts...']");
	
	public final static By AccountNameSuggesion = By.xpath("(//div[@class='slds-listbox slds-listbox_vertical slds-dropdown slds-dropdown_fluid slds-dropdown_left']//span[@class=\"slds-media__body\"])[1]");
	
	public final static By SaveButton= By.xpath("//button[@name='SaveEdit']");
	 
	public final static By CloseDateDropDown = By.xpath("//input[@name='CloseDate']");
	
	public final static By StageDropDown = By.xpath("//label[contains(text(),'Stage')]//parent::div[@part='combobox']//div[@class='slds-combobox_container']//child::div//child::div//child::button[@aria-label='Stage']");
	
	//label[contains(text(),'Stage')]//parent::div//button[@aria-label='Stage']
	//label[contains(text(),'Stage')]//parent::div[@part='combobox']//div[@class='slds-combobox_container']//child::div//child::div//child::button[@aria-label='Stage']
	
	//div[@class='slds-combobox_container']//button[@aria-label='Stage']
	
	public final static By StageDropDownList = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div/div[2]/div[2]/section[28]/div/div/section/div/div[2]/div/div/div/div[1]/one-record-action-flexipage/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-celigo_-opp___-opportunity___create___-l-m-t___1699379999000/forcegenerated-flexipage_celigo_opp_opportunity__create_js___lmt___1699379999000/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-single-col-no-header-template-desktop2/div/div/div/slot/flexipage-component2[1]/slot/flexipage-field-section2/div/div/div/laf-progressive-container/slot/dl/slot/flexipage-column2[2]/div/slot/flexipage-field[5]/slot/record_flexipage-record-field/div/div[2]/slot/sfa-input-stage-name/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div/div[1]/lightning-base-combobox/div/div/div[2]/lightning-base-combobox-item[5]");
//	public final static By StageDropDownList= By.xpath("(//span[@title=\"2a - Discovery\"])[2]");
	
	public final static By BillToAccount = By.xpath("//label[contains(text(),'Bill To Account')]//ancestor::records-record-layout-lookup[@data-input-element-id='input-field']//input[@placeholder=\"Search Accounts...\"]");
	
	public final static By ServiceAgreement = By.xpath("//label[contains(text(),'Service Agreement')]//ancestor::records-record-layout-lookup[@data-input-element-id=\"input-field\"]//input[@placeholder='Search Service Agreements...']");
	
	public final static By OrderType= By.xpath("//div[@class='slds-combobox_container']//button[@aria-label='Order Type']");
	
	public final static By AgreementWorkFlowDropDown = By.xpath("//label[contains(text(),'Agreement Workflow')]//parent::div[@part=\"combobox\"]//following::button[@aria-label='Agreement Workflow']");
	
	public final static By AddendumType =By.xpath("//div[@class='slds-combobox_container']//button[@aria-label='Addendum Type']");
	
	
	public static void AddendumType_Click() throws InterruptedException, AWTException
	{
		Action.ScrollToElement(driver.findElement(By.xpath("//div[@class='slds-combobox_container']//button[@aria-label='Addendum Type']")));
		driver.findElement(NewOpportunity_CreationPage.AddendumType).click();
		 Thread.sleep(5000); 
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_A);
		 r.keyRelease(KeyEvent.VK_A);
		 Action.RobotClassEnter();
	}
	
	
	
	public static void  AgreementWorkFlowDropDown_Click() throws AWTException, InterruptedException
	{
		Action.ScrollToElement(driver.findElement(By.xpath("//label[contains(text(),'Agreement Workflow')]//parent::div[@part=\"combobox\"]//following::button[@aria-label='Agreement Workflow']")));
		driver.findElement(NewOpportunity_CreationPage.AgreementWorkFlowDropDown).click();
		 Thread.sleep(5000); 
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_S);
		 r.keyRelease(KeyEvent.VK_S);
		 Action.RobotClassEnter();
	}
	
	
	public static void  AgreementWorkFlowDropDownClick_SendToSupport() throws AWTException, InterruptedException
	{
		Action.ScrollToElement(driver.findElement(By.xpath("//label[contains(text(),'Agreement Workflow')]//parent::div[@part=\"combobox\"]//following::button[@aria-label='Agreement Workflow']")));
		driver.findElement(NewOpportunity_CreationPage.AgreementWorkFlowDropDown).click();
		 Thread.sleep(5000); 
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_S);
		 r.keyRelease(KeyEvent.VK_S);
		 Thread.sleep(2000); 
		 Action.RobotclassDownArrow();
		 Thread.sleep(2000); 
		 Action.RobotClassEnter();
	}
	
	
	
	public static void  OrderTypeClick() throws AWTException, InterruptedException
	{
		Action.ScrollToElement(driver.findElement(By.xpath("//div[@class='slds-combobox_container']//button[@aria-label='Order Type']")));
		driver.findElement(NewOpportunity_CreationPage.OrderType).click();
		 Thread.sleep(2000); 
		Action.RobotclassDownArrow();
		 Thread.sleep(2000);
		 Action.RobotClassEnter();
	}
	
	
	public static void  OrderTypeClick_ChangeOrder() throws AWTException, InterruptedException
	{
		Action.ScrollToElement(driver.findElement(By.xpath("//div[@class='slds-combobox_container']//button[@aria-label='Order Type']")));
		driver.findElement(NewOpportunity_CreationPage.OrderType).click();
		Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_C);
		 r.keyRelease(KeyEvent.VK_C);
		 Thread.sleep(2000); 
		Action.RobotclassDownArrow();
		 Thread.sleep(2000);
		 Action.RobotClassEnter();
	}
	
	
	public static void  OrderTypeClick_New() throws AWTException, InterruptedException
	{
		Action.ScrollToElement(driver.findElement(By.xpath("//div[@class='slds-combobox_container']//button[@aria-label='Order Type']")));
		driver.findElement(NewOpportunity_CreationPage.OrderType).click();
		Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_N);
		 r.keyRelease(KeyEvent.VK_N);
		 Thread.sleep(5000); 
//		Action.RobotclassDownArrow();
//		 Thread.sleep(2000);
		 Action.RobotClassEnter();
	}
	
	
	public static void ServiceAgreementClick() throws AWTException, InterruptedException
	{
		Action.ScrollToElement(driver.findElement(By.xpath("//label[contains(text(),'Service Agreement')]//ancestor::records-record-layout-lookup[@data-input-element-id=\"input-field\"]//input[@placeholder='Search Service Agreements...']")));
		driver.findElement(NewOpportunity_CreationPage.ServiceAgreement).click();
		Thread.sleep(2000);
		driver.findElement(NewOpportunity_CreationPage.ServiceAgreement).click();
		Thread.sleep(2000);
		 Action.RobotclassDownArrow();
		 Action.RobotClassEnter();
	}
	
	
	
	public static void BillToAccount() throws AWTException, InterruptedException
	{
		Action.ScrollToElement(driver.findElement(By.xpath("//label[contains(text(),'Bill To Account')]//ancestor::records-record-layout-lookup[@data-input-element-id='input-field']//input[@placeholder=\"Search Accounts...\"]")));
		driver.findElement(NewOpportunity_CreationPage.BillToAccount).click();
		Thread.sleep(2000);
		driver.findElement(NewOpportunity_CreationPage.BillToAccount).click();
		Thread.sleep(2000);
		 Action.RobotclassDownArrow();
		 Action.RobotClassEnter();
	}
	
	
	
	public static void SaveButtonClick() throws InterruptedException
	{
		driver.findElement(NewOpportunity_CreationPage.SaveButton).click();
		Thread.sleep(5000);
	}
	
	
	 public static void OpportunityNameTextField_EnterText()
	 {
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(OpportunityNameTextField));
		 String random = Action.generateRandomString(10);		 
		 driver.findElement(NewOpportunity_CreationPage.OpportunityNameTextField).sendKeys("AutoText"+random);
	 }
	 
	 public static void CloseDateDropdownClick() throws InterruptedException
	 {
//		 JavascriptExecutor js = (JavascriptExecutor)driver;
//		 js.executeScript("arguments[0].scrollIntoView();", CloseDateDropDown);
//		 js.executeScript("window.scrollBy(0,200)", "");
		String Date= Action.getTomorrowDate();
		 
		 Action.ScrollToElement(driver.findElement(By.xpath("//input[@name='CloseDate']")));
//		 Action.scrollByVisibilityOfElement(driver,driver.findElement(By.xpath("//input[@name='CloseDate']")));
		 driver.findElement(NewOpportunity_CreationPage.CloseDateDropDown).click();
		 Thread.sleep(2000);
		 driver.findElement(NewOpportunity_CreationPage.CloseDateDropDown).sendKeys(Date);
	 }
	 
	 
	
	 public static void stageDropDownClick() throws AWTException, InterruptedException
	 {
		 
		 
		 Action.ScrollToElement(driver.findElement(By.xpath("//label[contains(text(),'Stage')]//parent::div[@part='combobox']//div[@class='slds-combobox_container']//child::div//child::div//child::button[@aria-label='Stage']")));
		
		 driver.findElement(NewOpportunity_CreationPage.StageDropDown).click();
		 Thread.sleep(5000);
		 WebElement option = driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div/div[2]/div[2]/section[28]/div/div/section/div/div[2]/div/div/div/div[1]/one-record-action-flexipage/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-celigo_-opp___-opportunity___create___-l-m-t___1699379999000/forcegenerated-flexipage_celigo_opp_opportunity__create_js___lmt___1699379999000/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-single-col-no-header-template-desktop2/div/div/div/slot/flexipage-component2[1]/slot/flexipage-field-section2/div/div/div/laf-progressive-container/slot/dl/slot/flexipage-column2[2]/div/slot/flexipage-field[5]/slot/record_flexipage-record-field/div/div[2]/slot/sfa-input-stage-name/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div/div[1]/lightning-base-combobox/div/div/div[2]/lightning-base-combobox-item[5]"));
Action.MoveToElement(option);
Thread.sleep(5000);
option.click();
		 
		 //		 Action.javaClick(driver.findElement(By.xpath("// flexipage-field[@data-field-id='RecordStageNameField']//div[@class='slds-listbox slds-listbox_vertical slds-dropdown slds-dropdown_fluid slds-dropdown_left']//lightning-base-combobox-item//span[@class='slds-truncate'])[3]")));
////		 driver.findElement(By.xpath("(// flexipage-field[@data-field-id='RecordStageNameField']//div[@class='slds-listbox slds-listbox_vertical slds-dropdown slds-dropdown_fluid slds-dropdown_left']//lightning-base-combobox-item//span[@class='slds-truncate'])[3]")).click();
//		List<WebElement> options = driver.findElements(By.xpath("// flexipage-field[@data-field-id='RecordStageNameField']//div[@class='slds-listbox slds-listbox_vertical slds-dropdown slds-dropdown_fluid slds-dropdown_left']//lightning-base-combobox-item//span[@class='slds-truncate']"));
//		
//		for (WebElement list : options)
//		{
//			System.out.println(list);
//if (list.getText().equals("2a - Discovery"))
//{
//	list.click();
//}}
//			String dropdownList=list.getText();
//			System.out.println(dropdownList);
//			if(dropdownList.contains("Opportunity"));
//					{
//						list.click();
//						System.out.println("element is Clicked");
//
//					}
//				
//		}
//		System.out.println("end of stage");

		}
	 
	 
	 public static void stageDropDownClick_ClosedWon() throws AWTException, InterruptedException
	 {
		 Action.ScrollToElement(driver.findElement(By.xpath("//label[contains(text(),'Stage')]//parent::div[@part='combobox']//div[@class='slds-combobox_container']//child::div//child::div//child::button[@aria-label='Stage']")));

//		 Action.MoveToElement(driver.findElement(StageDropDown));
//		 wait.until(ExpectedConditions.visibilityOfElementLocated(StageDropDown));
		 driver.findElement(NewOpportunity_CreationPage.StageDropDown).click();
		 Thread.sleep(2000);
		 WebElement option = driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div/div[2]/div[2]/section[30]/div/div/section/div/div[2]/div/div/div/div[1]/one-record-action-flexipage/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-celigo_-opp___-opportunity___create___-l-m-t___1699379999000/forcegenerated-flexipage_celigo_opp_opportunity__create_js___lmt___1699379999000/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-single-col-no-header-template-desktop2/div/div/div/slot/flexipage-component2[1]/slot/flexipage-field-section2/div/div/div/laf-progressive-container/slot/dl/slot/flexipage-column2[2]/div/slot/flexipage-field[5]/slot/record_flexipage-record-field/div/div[2]/slot/sfa-input-stage-name/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div/div[1]/lightning-base-combobox/div/div/div[2]/lightning-base-combobox-item[9]"));
		 Action.ScrollToElement(driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div/div[2]/div[2]/section[30]/div/div/section/div/div[2]/div/div/div/div[1]/one-record-action-flexipage/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-celigo_-opp___-opportunity___create___-l-m-t___1699379999000/forcegenerated-flexipage_celigo_opp_opportunity__create_js___lmt___1699379999000/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-single-col-no-header-template-desktop2/div/div/div/slot/flexipage-component2[1]/slot/flexipage-field-section2/div/div/div/laf-progressive-container/slot/dl/slot/flexipage-column2[2]/div/slot/flexipage-field[5]/slot/record_flexipage-record-field/div/div[2]/slot/sfa-input-stage-name/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div/div[1]/lightning-base-combobox/div/div/div[2]/lightning-base-combobox-item[9]")));
		 Action.MoveToElement(option);
		 Thread.sleep(5000);
		 option.click();
//		 driver.findElement(NewOpportunity_CreationPage.StageDropDownList).click();
//		 Utilities.ClosedWon_StageDropDown();
//		List<WebElement> options = driver.findElements(StageDropDownList);
////		
//		for (WebElement list : options)
//		{
//			String dropdownList=list.getText();
//			System.out.println(dropdownList);
//			if(dropdownList.equals("1 - Sales Qualified Opportunity"));
//					{
//						list.click();
//					}
//				
//		}
		}
	 	 
	 
	 public static void ClickAccountName() throws InterruptedException, AWTException
	 {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(AccountNameTextField));
		 driver.findElement(NewOpportunity_CreationPage.AccountNameTextField).click();
		 Thread.sleep(5000);
//		 WebElement suggesion=driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div/div[2]/div[2]/section[29]/div/div/section/div/div[2]/div/div/div/div[1]/one-record-action-flexipage/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-celigo_-opp___-opportunity___create___-l-m-t___1699379999000/forcegenerated-flexipage_celigo_opp_opportunity__create_js___lmt___1699379999000/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-single-col-no-header-template-desktop2/div/div/div/slot/flexipage-component2[1]/slot/flexipage-field-section2/div/div/div/laf-progressive-container/slot/dl/slot/flexipage-column2[1]/div/slot/flexipage-field[2]/slot/record_flexipage-record-field/div/div[2]/slot/records-record-layout-lookup/lightning-lookup/lightning-lookup-desktop/lightning-grouped-combobox/div/div/lightning-base-combobox/div/div/div[2]/ul/li[2]"));
//		 Action.MoveToElement(suggesion);
//		 Thread.sleep(5000);
//		 suggesion.click();
//		 driver.findElement(NewOpportunity_CreationPage.AccountNameTextField).click();
		 Thread.sleep(2000);
		 Action.RobotclassDownArrow();
		 Thread.sleep(2000);
		 Action.RobotClassEnter();
		
	 }
	 
	
	 public static void CloseWon_stageDropDownClick() throws AWTException, InterruptedException
	 {
		 Action.ScrollToElement(driver.findElement(By.xpath("//label[contains(text(),'Stage')]//parent::div[@part='combobox']//div[@class='slds-combobox_container']//child::div//child::div//child::button[@aria-label='Stage']")));

//		 Action.MoveToElement(driver.findElement(StageDropDown));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(StageDropDown));
		 driver.findElement(NewOpportunity_CreationPage.StageDropDown).click();
		 Thread.sleep(2000);
//		 driver.findElement(NewOpportunity_CreationPage.StageDropDownList).click();
		 Utilities.ClosedWon_StageDropDown();
		}
	 
	 
	 
	 
	 }

	 
	 

