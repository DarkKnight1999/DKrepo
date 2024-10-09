package com.CallReview.PageObjects;

import org.openqa.selenium.By;

import com.CallReview.Action.Action;
import com.CallReview.Base.BaseClass;

public class LoginPage extends BaseClass 
{
	
	 public final static By UserNameTextField = By.xpath("//input[@id='username']");
	 
	 public final static By PasswordTextField = By.xpath("//input[@id='password']");
	 
	 public final static By LoginButton = By.xpath("//input[@id='Login']");
	 

		
	public static void Login() throws InterruptedException 
	{
		driver.findElement(LoginPage.UserNameTextField).click();
		System.out.println("Usename click");
		driver.findElement(LoginPage.UserNameTextField).sendKeys("soumyakalmath@callrevu.com");//vividhakulkarni@callrevu.com.partial
		driver.findElement(LoginPage.PasswordTextField).click();                               //soumyakalmath@callrevu.com
		System.out.println("Pwd click");

		driver.findElement(LoginPage.PasswordTextField).sendKeys("Soukal@123");//Vk@1234#$$
		driver.findElement(LoginButton).click();                               //Soukal@123
	
	
	}
}
