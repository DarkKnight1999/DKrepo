package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{

	@Test(groups = {"Sanity", "Master"})
	public void verify_login()
	{
		//logger information
		logger.info("*****Starting TC002_LoginTest *****");
		
		try
		{
			
		//Homepage
		//object for home page
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on MyAccount Link");
		
		hp.clickLogin();
		logger.info("Clicked on Register Link");
		
		//Login page
		//object for login page
		LoginPage lp = new LoginPage(driver);
		
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		//MyAccount page
		//we need to check MyAccount page is exists or not
		//object for MyAccount page
		MyAccountPage macc = new MyAccountPage(driver);
		
		//we are capturing that value in a variable by 
		//creating one more variabe called targetpage and type of the variable is boolean because it will returns true or false based on that we need to write one assertion
		boolean targetPage = macc.isMyAccountPageExists();
		//also we can add the description message in the third parameter 
		//so in the same Assert.assertEquals we can pass 3 parameter 
		//first two it will compare and if it is passed no problem  if it is failed then the login failed description message will be displayed in the console window
		//Assert.assertEquals(targetPage, true, "Login failed");
		//or we can use this one 
		Assert.assertTrue(targetPage);
		
		}
		catch(Exception e)
		{
			
			Assert.fail();
			
		}
		logger.info("*****Finished TC002_LoginTest *****");
		//last we will put everything in the try catch block because we can get exception anywhere else here
		
		
	}
}
 