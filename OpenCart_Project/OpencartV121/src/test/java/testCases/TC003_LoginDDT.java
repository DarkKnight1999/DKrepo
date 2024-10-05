package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

/*Data is valid --> login sucess --> test pass -->logout
 Data is valid --> login failed --> test fail
 
 Data is invalid --> login sucess --> test fail -->logout
 Data is invalid --> login failed --> test pass
 */

public class TC003_LoginDDT extends BaseClass {
	
	 //how this method will get  the data from the data provider so
	//this method should know right from which data provider is providing the data so 
	//in the test annotation we have to specify the name of the data provider by using the parameter dataprovider
	//dataProviderClass = DataProviders.class --> this parmeter is required because where the data provider is in different class and package so 
	//in that case we need to add one more additional parameter in the @test
	//dataProviderClass = DataProviders.class --> is used to get the data  provider from different class
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class, groups="DataDriven")
	public void verify_loginDDT(String email, String pwd, String exp) throws InterruptedException
	
	{
		
		//logger information
		logger.info("*****Starting TC_003_LoginDDT *****");
				
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
				
				lp.setEmail(email);
				lp.setPassword(pwd);
				lp.clickLogin();
				
				//MyAccount page
				//we need to check MyAccount page is exists or not
				//object for MyAccount page
				MyAccountPage macc = new MyAccountPage(driver);
				
				//we are capturing that value in a variable by 
				//creating one more variabe called targetpage and type of the variable is boolean because it will returns true or false based on that we need to write one assertion
				boolean targetPage = macc.isMyAccountPageExists();
				
				
				//Data is valid --> login sucess --> test pass -->logout
				//              --> login failed --> test fail
				 
				//exp -> means expected result
				if(exp.equalsIgnoreCase("Valid"))//data is valid
				{
					if(targetPage == true)//targetpage is true means login is successful then what does it means then test is passed
					//so we will put one assertaion here
					{
						macc.clickLogout();
						Assert.assertTrue(true);//my test is passed
						//once it login we need to logout where is the logout--> is in myAccount page
						//the assertion should be after the action because after assertion no other statement will be executed so we have added logout before the assertion 
					}
					else
					{
						Assert.assertTrue(false);//my test is failed
					}
				
				}
				
				
				//Data is invalid --> login sucess --> test fail -->logout
				//                --> login failed --> test pass
				
				if(exp.equalsIgnoreCase("Invalid"))//data is valid
				{
					if(targetPage == true)//targetpage is true means login is successful then what does it means then test is passed
					//so we will put one assertaion here
					{
						macc.clickLogout();
						Assert.assertTrue(false);//my test is failed
						//once it login we need to logout where is the logout--> is in myAccount page
						//the assertion should be after the action because after assertion no other statement will be executed so we have added logout before the assertion 
					}
					else
					{
						Assert.assertTrue(true);//my test is passed
					}
				
				}
				}
				catch(Exception e)
				{
					
					Assert.fail();
					
				}
				Thread.sleep(3000);
				//logger information
				logger.info("*****Finished TC_003_LoginDDT *****");
	}

}
