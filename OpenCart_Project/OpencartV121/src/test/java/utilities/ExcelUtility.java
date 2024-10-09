package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	//Creating the non static variable by that we can we use it
		//we are created in once because we are using this in every method so instead of creating these variables multiple  
	    //all these are class we are make them as Non static
	//if we want access any method from this utility file we want to create an object of the ExcelUtility class and through that object we can access because these method are not static method
	
		public  FileInputStream fi;
	    public  FileOutputStream fo;
	    public  XSSFWorkbook workbook;
	    public  XSSFSheet sheet;
	    public  XSSFRow row;
	    public  XSSFCell cell;
	    public  CellStyle style;//through these we can apply some style in the excel like colour of the cell, fountstyle
	    String path;
	    
	    //is a constructor  here we are directly passing the path of the excel whenever 
	    //we create an object for this ExcelUtility class we will immediatly  pass the location of the excel path
	    //now we no need to pass excel sheet path
	    public ExcelUtility(String path)
	    {
	    	this.path = path;
	    }
	    
	    //When i call these method it will written the row count
	    //in x1file we need to pass the path where we need to create the excel file
	    //x1sheet is for to provide the sheet name
	    public int getRowCount(String sheetName) throws IOException
	    {
	    	fi = new FileInputStream(path);
	    	workbook = new XSSFWorkbook(fi);
	    	sheet = workbook.getSheet(sheetName);
	    	//getLastRowNum() method is used to finding the last row number
	    	int rowcount = sheet.getLastRowNum();
	    	workbook.close();
	    	fi.close();
	    	return rowcount;
	    }
	    
	    //When i call these method it will written the cell count in a perticular row
	    //rownum is used to pass the row number
	    public int getCellCount(String sheetName, int rownum) throws IOException
	    {
	    	fi = new FileInputStream(path);
	    	workbook = new XSSFWorkbook(fi);
	    	sheet = workbook.getSheet(sheetName);
	    	row = sheet.getRow(rownum);
	    	//getLastRowNum() method is used to finding the last cell number
	    	int cellcount = row.getLastCellNum();
	    	workbook.close();
	    	fi.close();
	    	return cellcount;
	    }
	    
	    //when in need to read the data from the perticular cell 
	    //colnum is used to pass the col(cell) number
	    //it will return data from the perticular cell
	    //if we need data from multiple cells use these method in a loop statement by passing different row number and cell number
	    public  String getCellData(String sheetName, int rownum, int colnum) throws IOException
	    {
	    	fi = new FileInputStream(path);
	    	workbook = new XSSFWorkbook(fi);
	    	sheet = workbook.getSheet(sheetName);
	    	row = sheet.getRow(rownum);
	    	cell = row.getCell(colnum);
	    	
	    	String data;
	    	//Why we need to put this in try catch block
	    	//while reading the data from cell if the cell is empty then it will throw an exception to over come these we are using the try and catch block
	    	
	    	try
	    	{
	    		//data = cell.toString();
	    		//DataFormatter class is used instead of (data = cell.toString());
	    		//we can use any one below one or upper one
	    		//apachi poi provided special class called  DataFormatter in these we have one method called formatCellValue
	    		//formatCellValue() method it will return data in the form of string from the cell
	    		//both will read data in string format
	    		DataFormatter formatter = new DataFormatter();
	    		data = formatter.formatCellValue(cell);//Returns the formated value of the cell as a string 
	    	}
	    	catch(Exception e)
	    	{
	    		//it will treat the empty cell as empty
	    		data = "";
	    	}
	    	
	    	workbook.close();
	    	fi.close();
	    	return data;
	    }
	    
	    //these method is used for writing the data into cell 
	    //we are doing combination of both reading and writing both are doing inthe parallel
	    //in the same sheet we are reading the data and writing the data because
	    //because in the data driven testing you have some column and in the last column sometimes it will be empty because
	    //because in the last column  we have to update the result after excusion is completed
	    //then it used to update the data in the cell
	    //here we are not creating new row and we creating a new cell in the existing row
	    public  void setCellData(String sheetName, int rownum, int colnum, String data) throws IOException
	    {
	    	File xlfile = new File(path);
	    	if(!xlfile.exists())//if file not exists then create new file
	    	{
	    		workbook = new XSSFWorkbook();
	    		fo = new FileOutputStream(path);
	    		workbook.write(fo);
	    	}
	    	fi = new FileInputStream(path);
	    	workbook = new XSSFWorkbook(fi);
	    	
	    	if(workbook.getSheetIndex(sheetName) ==-1)//if sheet not exists then create new sheet
	    	{
	    		workbook.createSheet(sheetName);
	    		sheet=workbook.getSheet(sheetName);
	    	}
	    	
	    	if(sheet.getRow(rownum) == null)//if row not exists then create new row
	    	{
	    		sheet.createRow(rownum);
	    		row=sheet.getRow(rownum);
	    	}
	    	
	    	//here we are creating the new cell in the same row  and updating the cell value and uploading in the workbook
	    	cell = row.createCell(colnum);
	    	cell.setCellValue(data);
	    	//update or writing mode
	    	fo = new FileOutputStream(path);
	    	workbook.write(fo);
	    	workbook.close();
	    	fi.close();
	    	fo.close();
	    }
	    
	    //giving green colour to the cell if result is pass
	    public void fillGreenColor(String sheetName, int rownum, int colnum) throws IOException
	    {
	    	fi = new FileInputStream(path);
	    	workbook = new XSSFWorkbook(fi);
	    	sheet = workbook.getSheet(sheetName);
	    	row = sheet.getRow(rownum);
	    	//here we are creating the new cell in the same row  and updating the cell value and uploading in the workbook
	    	cell = row.getCell(colnum);
	    	
	    	//Style is a class
	    	style = workbook.createCellStyle();
	    	style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
	    	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	    	
	    	cell.setCellStyle(style);
	    	fo = new FileOutputStream(path);
	    	workbook.write(fo);
	    	workbook.close();
	    	fi.close();
	    	fo.close();
	    }
	    
	  //giving RED colour to the cell if result is pass
	    public  void fillRedColor(String sheetName, int rownum, int colnum) throws IOException
	    {
	    	fi = new FileInputStream(path);
	    	workbook = new XSSFWorkbook(fi);
	    	sheet = workbook.getSheet(sheetName);
	    	row = sheet.getRow(rownum);
	    	//here we are creating the new cell in the same row  and updating the cell value and uploading in the workbook
	    	cell = row.getCell(colnum);
	    	
	    	//Style is a class
	    	style = workbook.createCellStyle();
	    	style.setFillForegroundColor(IndexedColors.RED.getIndex());
	    	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	    	
	    	cell.setCellStyle(style);
	    	fo = new FileOutputStream(path);
	    	workbook.write(fo);
	    	workbook.close();
	    	fi.close();
	    	fo.close();
	    }
}
