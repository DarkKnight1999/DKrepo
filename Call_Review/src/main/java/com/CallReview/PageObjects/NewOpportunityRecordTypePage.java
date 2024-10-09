package com.CallReview.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.CallReview.Base.BaseClass;

public class NewOpportunityRecordTypePage extends BaseClass
{
	
	
	
	//button[@type='button' and @class='slds-button slds-button_neutral slds-button slds-button_brand uiButton']
	
	public final static By NextButton= By.xpath("//button[@type='button' and @class='slds-button slds-button_neutral slds-button slds-button_brand uiButton']");
	
	public final static By RadioButtonRecordType= By.xpath("//div[@class='changeRecordTypeTopDownOneColumn']//label[@class='slds-radio topdown-radio-container slds-clearfix']//span[contains(text(),'OEM Enterprise')]/preceding-sibling::span");
	//div[@class='changeRecordTypeTopDownOneColumn']//label[@class='slds-radio topdown-radio-container slds-clearfix']//span[contains(text(),'Partnership')]/preceding-sibling::span
	 
	 public static void NextButtonClick()
	 {wait.until(ExpectedConditions.visibilityOfElementLocated(NextButton));
		 driver.findElement(NewOpportunityRecordTypePage.NextButton).click();
	 }
	 
	public static void RadioButtonRecordType_Click() throws InterruptedException
	{
		driver.findElement(RadioButtonRecordType).click();
		Thread.sleep(2000);
	}
	
}
