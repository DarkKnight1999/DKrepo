package com.CallReview.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.CallReview.Action.Action;
import com.CallReview.Base.BaseClass;

public class HomePage extends BaseClass
{

	 public final static By AppLauncher = By.xpath("//button[@title='App Launcher']");
	 
	 public final static By ShowNavigationDropdownButton = By.xpath("//div[@class='navMenu oneAppNavMenu slds-context-bar__item--divider-right navigationMark navexAppNavMenu']");
	 
	 public final static By OpportunitiesObject= By.xpath("//a[@data-label='Opportunities']");
	 
	 public final static By FirstOpportunitie = By.xpath("//*[@id=\"brandBand_1\"]/div/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr[1]/th/span/a");
	 
	 
	 public final static By ProfileIcon= By.xpath("//div[@data-aura-class='forceEntityIcon']");
	 
	 public final static By UserNameHyperLink= By.xpath("//h1[@class='profile-card-name']//a");
	 
	 public final static By NewButtonForOpportunityCreation= By.xpath("//*[@id=\"brandBand_1\"]/div/div/div/div/div[1]/div[1]/div[2]/ul/li[1]");
	
	 
	 public static void NewButtonForOpportunityCreationClick()
	 {
		 driver.findElement(HomePage.NewButtonForOpportunityCreation).click();
	 }
	 
	 
	 public static void UserNameHyperLinkClick()
	 {
		 driver.findElement(HomePage.UserNameHyperLink).click();
	 }
	 
	 public static void ProfileIconClick()
	 {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(ProfileIcon));
		 driver.findElement(HomePage.ProfileIcon).click();
	 }
	 
	 
	 public static void ApplauncherClick()
	 {
		 driver.findElement(HomePage.AppLauncher).click();
	 }
	
	 public static void ShowNavigationDropDownButtonClick()
	 {
		 driver.findElement(HomePage.ShowNavigationDropdownButton).click();
	 }
	 
	 public static void SelectOpportynitiesObject()
	 {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(ShowNavigationDropdownButton));
		 driver.findElement(HomePage.ShowNavigationDropdownButton).click();
			Action.ScrollToElement(driver.findElement(By.xpath("//a[@data-label='Opportunities']")));

		 wait.until(ExpectedConditions.visibilityOfElementLocated(OpportunitiesObject));
		 driver.findElement(HomePage.OpportunitiesObject).click();
	 }
	 
	 public static void OpportunitieClick()
	 {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(FirstOpportunitie));

		 driver.findElement(HomePage.FirstOpportunitie).click();
	 }

	 
	 
	 
	 
}
