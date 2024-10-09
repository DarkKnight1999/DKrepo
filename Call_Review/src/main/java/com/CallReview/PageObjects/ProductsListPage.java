package com.CallReview.PageObjects;

import org.openqa.selenium.By;

import com.CallReview.Base.BaseClass;

public class ProductsListPage  extends BaseClass
{

	 public final static By ProductsFirstLink= By.xpath("//*[@id='brandBand_91']/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr/th/span/a\r\n");
	   
	   

	  
	   
	   public static void ProductsFirstLink_click()
	   {
	   	String Product_Added =driver.findElement(ProductsListPage.ProductsFirstLink).getText();
	   
	   System.out.println("Product_Added   -"+Product_Added);
	   }
	
	
}
