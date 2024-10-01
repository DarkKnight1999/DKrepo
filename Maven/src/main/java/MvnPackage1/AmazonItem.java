package MvnPackage1;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonItem {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary("F:\\Browser Drivers\\driverV-124\\chrome-win64\\chrome-win64\\chrome.exe");
		
		WebDriver driver1 = new ChromeDriver();	
//		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.get("https://www.amazon.in");
		driver1.manage().window().maximize();
		WebElement Search_box = driver1.findElement(By.id("twotabsearchtextbox"));
		Search_box.sendKeys("Iphone 15");
		Search_box.submit();
		driver1.findElement(By.linkText("Apple iPhone 15 (128 GB) - Black")).click();
		Thread.sleep(10000);
		
		Set<String> windowHandles = driver1.getWindowHandles();
	      for (String windowHandle : windowHandles) {
	          // Switch to the desired window
	          driver1.switchTo().window(windowHandle);
	          System.out.println("Title of the window: " + driver1.getTitle());
	       }
//	     String OriginalWindow = driver1.getWindowHandle();
//	     driver1.switchTo().window(OriginalWindow);
//		 driver1.switchTo().newWindow(WindowType.TAB);

	     JavascriptExecutor js = (JavascriptExecutor) driver1;
	     
	     WebElement Add_To_cart_Button = driver1.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
	     js.executeScript("arguments[0].scrollIntoView();", Add_To_cart_Button);
	     Thread.sleep(2000);
	     Add_To_cart_Button.click();

	}
}
