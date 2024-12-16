package com.CallReview.Base;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class BaseClass
{ 
	
public static Properties prop;
public static WebDriver driver;

public static WebDriverWait wait;


@BeforeMethod(alwaysRun = true)
public static void LoadConfig() throws IOException 
{
	FileInputStream fs = new FileInputStream("D:\\Call Review\\Call_Review\\Configuration\\Config.properties");
	Properties p = new Properties();
	p.load(fs);

	String MyBrowser = p.getProperty("browser");
	System.out.println(MyBrowser);
	String URL = p.getProperty("url");

	if (MyBrowser.equals("chrome"))
	{
		ChromeDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		
	}else if(MyBrowser.equals("firefox"))
	{
		ChromeDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get(URL);
	
    }	
//Action.ImplicitWait(50);
 wait = new WebDriverWait(driver,Duration.ofSeconds(50));

}

@AfterMethod(alwaysRun = true)
public static void browserQuit()
{
    if (driver != null) {
        driver.quit();
        driver=null;
    }
    
}


}
	
