package com.CallReview.Action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.CallReview.Base.BaseClass;

public class Utilities extends BaseClass 
{
	public static Robot r;

	public static void ClosedWon_StageDropDown() throws AWTException, InterruptedException
	{
		  r = new Robot();
		 r.keyPress(KeyEvent.VK_C);
		 r.keyRelease(KeyEvent.VK_C);
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	public static void StageDropDown_RandomClick() throws AWTException, InterruptedException
	{
		  r = new Robot();
		  r.keyPress(KeyEvent.VK_C);
			 r.keyRelease(KeyEvent.VK_C);
			 Thread.sleep(2000);
			 r.keyPress(KeyEvent.VK_DOWN);
			 r.keyRelease(KeyEvent.VK_DOWN);
			 Thread.sleep(2000);
			 r.keyPress(KeyEvent.VK_ENTER);
			 r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	
	WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(100));
	
	
	
	
}
