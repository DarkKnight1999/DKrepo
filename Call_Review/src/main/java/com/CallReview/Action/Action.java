package com.CallReview.Action;
 
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
 
import com.CallReview.Base.BaseClass;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
 
public class Action extends BaseClass
{
	
	WebDriverWait wait;
 
	public static Robot r;
	
	
	public static void ActionClick(WebDriver ldriver, WebElement locaterName)
	{
		Actions act = new Actions(ldriver);
		act.moveToElement(locaterName);
	}
	
	
	public static void scrollByVisibilityOfElement(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguement{0}.scrollIntoView();", element);
	}
 
	
	public static boolean type(WebElement element, String text)
	{
		boolean flag= false;
		
		try {
			flag= element.isDisplayed();
			element.clear();
			element.sendKeys(text);
			flag = true;
		    } catch (Exception e)
		    {
			// TODO: handle exception
			System.out.println("Location not found");
			 flag= false;
		    }finally
		    {
			if(flag)
			{
			System.out.println("Successfully entered the value");	
			}else{
				System.out.println("Unable to enter the value");
			}
		}
		return flag;
	}
	
		public static void ImplicitWait(int Seconds)
		{
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
		
		
		public static void pageloadTimeOut(int Seconds)
		{
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
		
//		public static void explicitwait()
//		{
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		}
		
		public static void MoveToElement(WebElement element)
		{
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
						
		}
		public static void RobotClassEnter() throws AWTException
		{
		  r = new Robot();
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		}
		public static void RobotclassDownArrow() throws AWTException
		{
			  r = new Robot();
			 r.keyPress(KeyEvent.VK_DOWN);
			 r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		
		
		public static void scrollUp() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("scroll(1000, 0);");
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		
		public static void ScrollToElement_JavaScript(WebElement element) {
	        // used to select certain field by scrolling the page
 
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView();", element);// will scroll until the element is in view
	        scrollUp();
	        scrollUp();
//	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
	    }
		
			
		public static void selectAutoSuggestedValue(String dropdpownXpath, String dropdpownValXpath) throws InterruptedException
		{
			WebElement ele = driver.findElement(By.xpath(dropdpownXpath));
			ele.click();
//			WebDriverWait wd = new WebDriverWait(driver,3);
			WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(100));
 
			wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dropdpownValXpath)));
			driver.findElement(By.xpath(dropdpownValXpath)).click();
		}
		
		public static void javaClick(WebElement element) {
			int attempts = 0;
			int maxAttempts = 5; // Limit the maximum number of attempts to avoid infinite loops
 
			while (attempts < maxAttempts) {
				try {
					// Use an explicit wait to ensure the element is clickable
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
					wait.until(ExpectedConditions.elementToBeClickable(element));
 
					// Perform the click using WebDriver's click method
					element.click();
					break; // Exit the loop if the click is successful
				} catch (StaleElementReferenceException e) {
					// If a StaleElementReferenceException occurs, increment the attempts and retry
					attempts++;
				}
			}
		}
		
		private static void ScrollToTop() {
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		}
		
		
		public static void selectDropdownDynamically(String dropdownXpath, String label) {
			try {
				ScrollToTop();
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
 
				// Wait for the dropdown button to be clickable
				WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dropdownXpath)));
				javaClick(dropdown);
				Thread.sleep(1000);  // Consider using WebDriverWait instead of Thread.sleep
 
				String listXpath = "//label[text()='" + label + "']//following-sibling::div//div[@role='listbox']/lightning-base-combobox-item/span/span";
 
				// Wait for the dropdown values to be present
				List<WebElement> dropdownValues = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(listXpath)));
 
				for (WebElement drop : dropdownValues) {
					if (drop.getText().equals("--None--")) {
						continue;
					} else {
						javaClick(drop);
						break;
					}
				}
			} catch (Exception e) {
				System.out.println("Exception: " + e);
			}}
		
		public static String getTomorrowDate()
		{
			SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
			Calendar c = Calendar.getInstance();
			c.add(Calendar.DAY_OF_MONTH, 1); // Add one day to the current date
			Date tomorrow = c.getTime();
			String tomorrowFormatted = sdf.format(tomorrow);
 
			// Extract the month part and format it with three characters
			String month = new SimpleDateFormat("MMM", Locale.ENGLISH).format(c.getTime());
 
			// Replace the first 3 characters in the original formatted date with the formatted month
			return month + tomorrowFormatted.substring(3);
          
		}
		
		
		public static String generateRandomString(int length) {
	        // Define the characters to choose from
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
 
	        // Create a StringBuilder to store the random string
	        StringBuilder randomString = new StringBuilder();
 
	        // Create a Random object
	        Random random = new Random();
 
	        // Generate random characters and append them to the StringBuilder
	        for (int i = 0; i < length; i++) {
	            char randomChar = characters.charAt(random.nextInt(characters.length()));
	            randomString.append(randomChar);
	        }
 
	        // Convert StringBuilder to String and return
	        return randomString.toString();
	    }
		
		
		public static void javaScriptClick(By locator) throws Exception {
	        try {
	        		            
//	            wait.until(ExpectedConditions.elementToBeClickable(locator));
	            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
	                    driver.findElement(locator));
	            Thread.sleep(1000);
	        } catch (Exception e) {
//	            screenshot = captureWebScreenshot(driver);
//	            extentLoggerFail("Click failed");
//	            Assert.fail("Element not found in the application");
	            e.printStackTrace();
	        }
	    }
		
		public static void selectRandomValueFromDropdown(String xpath) {
	        try {
	            javaScriptClick(By.xpath(xpath));
	            Thread.sleep(2000);
	            List<WebElement> listOfOptions = driver.findElements(
	                    By.xpath(xpath + "/../following-sibling::div/lightning-base-combobox-item"));
	            Random rand = new Random();
	            int randomIndex = rand.nextInt(listOfOptions.size());
	
	            WebElement randomOption = listOfOptions.get(randomIndex);
	            randomOption.click();
	            Thread.sleep(2000);
	            javaScriptClick(By.xpath(xpath));
	            randomOption.click();
	            Thread.sleep(2000);
	
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
		
		
		public static void SelectClassDropdown(WebElement element)
		{
			Select select= new Select(element);
//			select.selectByIndex(index);
			select.selectByVisibleText("Supplemental Minute Packages");
		}
		
	
		public static void ActionsCommon(WebElement element)
		{
		Actions action = new Actions(driver);
		action.doubleClick(element);
		
		}
		
		
//		public void select_dropdownValue(String elementTagName, String sheetname) throws IOException {
//	        try {
//	           
//	            String dropdown_xpath = elementTagName;
//	            String dropwdown_Value ="// flexipage-field[@data-field-id='RecordStageNameField']//div[@class='slds-listbox slds-listbox_vertical slds-dropdown slds-dropdown_fluid slds-dropdown_left']//lightning-base-combobox-item//span[@class='slds-truncate']";
//	            new WebDriverWait(driver, 30);
//	            javaclick();
//	           
//	            
//	            List<WebElement> Text = driver.findElements(By.xpath(dropwdown_Value));
//	            
//	            click();
//	            
//	            .until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(dropdown_xpath))));
//	            javaClick(dropdown_xpath);
////	            waitTillPageLoaded(40000);
//	            try {
////	                waitTillPageLoaded(20000);
//	                ScrollToElement("//span[@title= '" + dropwdown_Value + "']");
//	                javaClick("//span[@title= '" + dropwdown_Value + "']");
////	                waitTillPageLoaded(20000);
//	            } catch (Exception e) {
////	                waitTillPageLoaded(20000);
//	                javaClick("//span[text()= '" + dropwdown_Value + "']");
////	                waitTillPageLoaded(20000);
//	                Thread.sleep(3000);
//	            }
//
//	        } catch (Exception e) {
//	            screenshot = capture(driver);
//	            logger.fail(e.getMessage(), MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot).build());
//	            Assert.fail(e.getMessage());
//
//	        }
//	    }
		
//		
		
		
		 public static void ScrollToElement(WebElement element) {
		        // used to select certain field by scrolling the page
 
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].scrollIntoView();", element);// will scroll until the element is in view
		        scrollUp();
		        scrollUp();
			     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    }
 
		
		
		
		 public static void javaClick(String Xpath) throws InterruptedException {
 
		        // used to click certain fields using javascript on span and div tag
 
		        int attempts = 0;
		        while (attempts < 10) {
		            try {
		                // new WebDriverWait(driver,
		                // WebDriverWait).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
		            	Thread.sleep(2000);
//		            	Action.MoveToElement(Xpath);
//		                ScrollToElement(Xpath);
		                ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
		                        driver.findElement(By.xpath(Xpath)));// clicking on dropdown
		                break;
		            } catch (StaleElementReferenceException e) {
		            }
		            attempts++;
		        }
 
		    }
		
		
		
//		public  static void select_dropdownValueDynamic(String element,String sheetname) throws InterruptedException {
//		    
//			Thread.sleep(2000);
////	        waitTillPageLoaded(20000);
//			String dropdown_xpath =driver.findElement(By.xpath(element));
////			String dropwdown_Value = readData(sheetname, "//root/"+elementTagName+"/values/value");     
//	        javaClick(dropdown_xpath);
//	        Thread.sleep(2000);
//	        Thread.sleep(2000);
//	        javaClick("//span[@title= '"+sheetname+"']");
//	        //javaClick("//span[text() = '"+dropwdown_Value+"']/parent::lightning-base-combobox-item");
//	        
//	    }
		
	
		 public static void LoginConfigProperties() throws IOException 
		 {
		 	FileInputStream fs = new FileInputStream("D:\\Call Review\\Call_Review\\Configuration\\Config.properties");
		 	Properties p = new Properties();
		 	p.load(fs);
		 
		 }
		 
		 
		 
		 
}
		