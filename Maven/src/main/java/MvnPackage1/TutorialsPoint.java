package MvnPackage1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TutorialsPoint {

   public static void main(String[] args) {
      // Set the path to the ChromeDriver executable
	   ChromeOptions options = new ChromeOptions();
	   options.setBinary("F:\\Browser Drivers\\driverV-124\\chrome-win64\\chrome-win64\\chrome.exe");

      // Create an instance of ChromeDriver
      WebDriver driver = new ChromeDriver();

      // Navigate to the webpage with multiple windows
      driver.get("https://www.tutorialspoint.com");

      // Perform an action that opens a new window, such as clicking a link
      driver.findElement(By.linkText("Open New Window")).click();

      // Get all window handles
      Set<String> windowHandles = driver.getWindowHandles();

      // Iterate through each window handle
      for (String windowHandle : windowHandles) {
         // Switch to the desired window
         driver.switchTo().window(windowHandle);
         // Perform actions on the window
         System.out.println("Title of the window: " + driver.getTitle());
      }

      // Close the driver instance
      driver.quit();
   }
}