package MvnPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomationSbyS {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary("F:\\Browser Drivers\\driverV-124\\chrome-win64\\chrome-win64\\chrome.exe");
		
		WebDriver driver1 = new ChromeDriver();
		driver1.navigate().to("https://selenium.dev/");
		String fetched_url = driver1.getCurrentUrl();
		System.out.print(fetched_url);
		
		driver1.get("https://google.com");
		WebElement Searchbox1 = driver1.findElement(By.name("q"));
		Searchbox1.sendKeys("Automation Step by step", Keys.ENTER);
		Thread.sleep(2000);
//		driver1.close();
		
	}
}
