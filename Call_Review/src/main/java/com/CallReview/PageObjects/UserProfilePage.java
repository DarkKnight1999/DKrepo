package com.CallReview.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.CallReview.Base.BaseClass;

public class UserProfilePage extends BaseClass
{

	public final static By EditButton= By.xpath("//div[@title='Edit']");
	 
	 public static void EditButtonClick()
	 {wait.until(ExpectedConditions.visibilityOfElementLocated(EditButton));
		 driver.findElement(UserProfilePage.EditButton).click();
	 }
	
}
