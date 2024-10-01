package MvnPackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Mvn_Class {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("F:\\Browser Drivers\\driverV-124\\chrome-win64\\chrome-win64\\chrome.exe");
		
		
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.gmail.com");
		driver1.findElement(By.id("identifierId")).sendKeys("asdf");
		Thread.sleep(2000);
	
		
		driver1.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement orangeHRM_Login_button = driver1.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
		driver1.findElement(RelativeLocator.with(By.name("password")).above(orangeHRM_Login_button)).sendKeys("Orange HRM");
		Thread.sleep(1000);
		driver1.close();
	}

}

