package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass{

    
	
	@Test(groups = {"Regression","Master"})
	public void verify_account_registration()
	{
		//it will display in the log
		//it is log statement
		logger.info("*****Starting TC001_AccountRegistrationTest *****");
		
		try
		{
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on MyAccount Link");
		
		hp.clickRegister();
		logger.info("Clicked on Register Link");
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		
		logger.info("Providing customer details...");
		//regpage.setFirstName("John");
		//regpage.setLastName("David");
		//regpage.setEmail("abcjohndavifd@gmail.com");
		//regpage.setTelephone("23123123");
		//regpage.setPassword("xyz12356");
		//regpage.setConfirmPassword("xyz12356");
		
		//how to create random string
		//to change the mail randomly 
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeString() + "@gmail.com");
		regpage.setTelephone(randomeNumber());
		
		//the randomeAlphaNumberic is stored in string variable because the password and confirmpassword should be same
		//if we not stored then the setPassword and setConfirmPassword it will take different password
		String password = randomeAlphaNumberic(); 
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		
		
		//validation
		//it will return confirmation message in String format
		logger.info("Validating expected message..");
		String confmsg = regpage.getConfimationMsg();
		
		//now we need to apply validation on this confmsg is done by adding the assertion 
		//Assert.assertEquals(confmsg, "Your Account Has Been Created!");//it is correct one
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			//this is the error message logging
			logger.error("Test failed..");
			
			//it will capture all the debug level logs
			//if catch block is executed means our test is got failed
			logger.debug("Debug logs..");
			Assert.assertTrue(false);
		}
		//Assert.assertEquals(confmsg, "Your Account Has Been Created!!!");
		}
		catch(Exception e)
		{
			
			Assert.fail();
			
		}
		logger.info("*****Finished TC001_AccountRegistrationTest *****");
	}
	
	
}
