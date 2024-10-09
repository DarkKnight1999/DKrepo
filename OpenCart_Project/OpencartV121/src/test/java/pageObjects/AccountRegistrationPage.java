package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
    @FindBy(xpath="//input[@id='input-firstname']") 
    WebElement txtFirstname;
    
    @FindBy(xpath="//input[@id='input-lastname']") 
    WebElement txtLastname;
    
    @FindBy(xpath="//input[@id='input-email']") 
    WebElement txtEmail;
    
    @FindBy(xpath="//input[@id='input-telephone']") 
    WebElement txtTelephone;
    
    @FindBy(xpath="//input[@id='input-password']") 
    WebElement txtPassword;
    
    @FindBy(xpath="//input[@id='input-confirm']") 
    WebElement txtConfirmPassword;
    
    @FindBy(xpath="//input[@name='agree']") 
    WebElement chkPolicy;
    
    @FindBy(xpath="//input[@value='Continue']") 
    WebElement btnContinue;
    
    @FindBy(xpath="//h1[normalize-space()= 'Your Account Has Been Created!']") 
    WebElement msgConfirmation;
    
    public void setFirstName(String fname)
    {
    	txtFirstname.sendKeys(fname);
    }
    
    public void setLastName(String lname)
    {
    	txtLastname.sendKeys(lname);
    }
    
    public void setEmail(String email)
    {
    	txtEmail.sendKeys(email);
    }
    
    public void setTelephone(String tel)
    {
    	txtTelephone.sendKeys(tel);
    }
    
    public void setPassword(String pwd)
    {
    	txtPassword.sendKeys(pwd);
    }
    
    public void setConfirmPassword(String pwd)
    {
    	txtConfirmPassword.sendKeys(pwd);
    }
    
    public void setPrivacyPolicy()
    {
    	chkPolicy.click();
    }
    
    public void clickContinue()
    {
    	//sol1
    	btnContinue.click();
    	
    	//sol2
    	//btnContinue.submit();

    	//sol3
    	//Actions act = new Actions(driver);
    	//act.moveToElement(btnContinue).click().perform();

    	//sol4
    	//JavascriptExecutor js = (JavascriptExecutor)driver;
    	//js.executeScript("arguments[0].click(); ", btnContinue);

    	//sol5
    	//btnContinue.sendKeys(Keys.RETURN);
    	
    	//sol6
    	//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
    }
    
    //this method capture the text value and it will return it and it will not do any validation just it will capture the text value  of the cpnfirmation message and then  it is just returning the message
    //suppose  if the confirmation message is not displayed because sometimes account registration is got failed then it will throw the exception
    //this is used for validation purpose
    //it will return confirmation message in String format
    public String getConfimationMsg()
    {
    	try
    	{
    		return (msgConfirmation.getText());
    	}
    	catch(Exception e)
    	{
    		return (e.getMessage());
    		
    	}
    }
    
    
    
}
