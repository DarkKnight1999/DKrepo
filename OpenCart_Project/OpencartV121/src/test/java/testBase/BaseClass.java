package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
//this two packages for log4j 
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseClass {

public static WebDriver driver;

//this logger variable is used to generate a log for every testcase
public Logger logger;

//config properties class
public Properties p;
	
	@BeforeClass(groups = {"Sanity", "Regression", "Master"})
	@Parameters({"os", "browser"})
	public void setup(String os, String br) throws IOException
	{
		
		//loading config.properties file
		FileReader file =new FileReader("./src//test//resources//congif.properties");
		p=new Properties();
		p.load(file);
		
		
		//this logger variable is used to generate a log for every testcase
		//this is the statement which we have to use to load  the log for log4j2.xml file
		//this will automatically get the log4j2.xml file because it will automatically always fetch in the resources folder
		//there is default path which is already configured in the log4j2.xml 
		//so log4j2.xml file will get automatically get into the logger variable
		//this is the log4j2 configuration
		logger = LogManager.getLogger(this.getClass());
		
		switch(br.toLowerCase())
		{
		case "chrome" : driver = new ChromeDriver(); break;
		case "edge" : driver = new EdgeDriver(); break;
		case "firefox" : driver = new FirefoxDriver(); break;
		default : System.out.println("Invalid browser name.."); return;
		}
		
		//this will delete all our cookies if we stored some cookies
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://tutorialsninja.com/demo/");
		
		//READING url from properties file
		driver.get(p.getProperty("appURL2"));
		driver.manage().window().maximize();
	}
	
	@AfterClass(groups = {"Sanity", "Regression", "Master"})
	public void tearDown()
	{
		driver.quit();
	}
	
	public String randomeString()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
	}
	
	//for random number
	public String randomeNumber()
	{
		String generatednumber = RandomStringUtils.randomNumeric(10);
		return generatednumber;
	}
	
	//for random combination of number and alphabetic together
	public String randomeAlphaNumberic()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(3);
		String generatednumber = RandomStringUtils.randomNumeric(3);
			
		return (generatedstring + "@" + generatednumber);
	}
	
	//it will capture screenshot of the test
	//it will name to screenshot by tname
	public String captureScreen(String tname) throws IOException
	{
		String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());//time stamp
		
		//to take screenshot we have special type of interface is there right so we have  assigned the driver to the screenshot
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath = System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp +".png";
		File targetFile = new File(targetFilePath);
		
		//this is need to copy  the source file into target file for that we have touse this command
		sourceFile.renameTo(targetFile);
		
		//returning the path where exactly the screenshot is located 
		return targetFilePath;
		
	}
}
