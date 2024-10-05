package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	//constructor
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h2[text()='My Account']")//MyAccount Page heading
	WebElement msgHeading;
	
	@FindBy(xpath ="//div[@class='list-group']//a[text()='Logout']")//added in step number 6
	WebElement lnkLogout;

	//i want to check My Account header part is displayed  
	
	public boolean isMyAccountPageExists()
	{
		//if it is displayed returns true
		//if it is not displayed returns false 
		//if it is not displayed it will throw exception for that we will put in the try and catch block
		try
		{
			return (msgHeading.isDisplayed());
		}
		catch(Exception e)
		{
			return false;//if MyAccount is not displayed returns false  
		}
		
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
	
}
