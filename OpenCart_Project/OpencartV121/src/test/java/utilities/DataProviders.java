package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	//Data provider is a class which contains only data provider methods
	//as of now we need only one data provider method 
	
	//DataProvider 1
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{
		String path =".\\testData\\Opencart_LoginData.xlsx";//taking xl file from testdata
		
		ExcelUtility xlutil = new ExcelUtility(path);//creating an object for XlUtility
		
		int totalrows = xlutil.getRowCount("Sheet1");
		int totalcols = xlutil.getCellCount("Sheet1", 1);
		
		String logindata[][] = new String[totalrows][totalcols];
		
		
		//this for loop for storing the data in the 2 dimensional array
		for(int i=1; i<=totalrows; i++)//started with 1 because the row1 is the header
		{
			for(int j=0; j<totalcols; j++)
			{
				//it will read all the data From the excel getting the cell data 	passing the row number and cell number and getting the data and store that in the two dimensional array
				//in the two dimensional array again same row same cloumn we are storing
				//why i-1 because array index will start from 0 so that the reason
				logindata[i-1][j] = xlutil.getCellData("Sheet1", i, j);
			}
		}
		return logindata;
	}
}
