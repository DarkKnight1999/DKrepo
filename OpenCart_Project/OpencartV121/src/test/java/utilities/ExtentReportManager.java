package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.BaseClass;

public class ExtentReportManager implements ITestListener {

	//in extent report is mainly provided 3 classes and are
		//ExtentSparkReporter
		//ExtentReport
		//ExtentTest 
		//this are the 3 class mainly provided by extent report
		//every class has there own methods and story and every class is responsible for some thing
		
		//ExtentSparkReporter-> which is responsible for UI of the report means user interface 
		
		//the 3 class are
		public ExtentSparkReporter sparkReporter;//UI of the report
		public ExtentReports extent;//resposible for populate common information on the report
		public ExtentTest test;//responsible for creating test case entries in the report and update status of the test methods
		
		//it will represents the report name
		String repName;
		//TestNG listener class methods
		
		//testContext means -> which test method we got executed so that test method details will be stored in the variable   
	    public void onStart(ITestContext testContext) {
	    	
	    	//first step 
	    
	    	
	    	//we need to create a date timestamp then we will append  the date to the report so 
	    	//to create a date time stamp this is the piece of code
	    	/*SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	    	Date dt = new Date();
	    	//It will write date in string format
	    	String currentdatetimestamp = df.format(dt);
	    	*/
	    	
	    	//instead of writing 3 steps we can also write in single step 
	    	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
	    	
	    	//by using this timestamp we have to generate the name of the report
	    	//report name ="Test-Report-" + timeStamp + ".html"; 
	    	repName = "Test-Report-" + timeStamp + ".html"; 
	    	 
	    	//Specifying the location of the report
	    	sparkReporter = new ExtentSparkReporter(".\\reports\\" + repName);
		    
			//in sparkReporter we will pass location of the report, where exactly we want to generate the report
	    	//specify the location of the report
	    	//sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+ "/reports/myReport.html");
	    	
	    	sparkReporter.config().setDocumentTitle("opencart Automation Report");//title of the report
	    	sparkReporter.config().setReportName("opencart Functional Testing");//name of the report
	    	sparkReporter.config().setTheme(Theme.DARK);
	 
	    	
	    	//This extent is the extent Report  class object so by using this we can do populate common information on the report
	    	extent  = new ExtentReports();
	    	
	    	//this is used to connect the UI to the ExtentReports
	    	extent.attachReporter(sparkReporter);
	    	
	    	//the setSystemInfo is a method and this method will take two parameter like key and value pair
	    	//Computer name is key and Localhost is the value
	    	//there we are just hardcoded these details
	    	//these details will be populated in the report
	    	extent.setSystemInfo("Application","opencart");
	    	extent.setSystemInfo("Module","Admin");
	    	extent.setSystemInfo("Sub Module","Customers");
	    	extent.setSystemInfo("User Name", System.getProperty("user.name"));
	    	extent.setSystemInfo("Environment","QA");
	    	//these things should happen before exection for that we are added in the onStart method
	    	//once the report is created
	    	
	    	//how to capture this values from the xml file dynamically for that this is the process
	    	//testContext --> Means which text method  we got executed so that test method  details will be stored in this testContext variable
	    	//so by the help of this testContext variable iam getting the current xml test so
	    	//this perticular getCurrentXmlTest() test is executed by which xml file so we will getting that xml file  and from that xml file we are getting the parameter os 
	    	//for operating system
	    	String os = testContext.getCurrentXmlTest().getParameter("os");
	    	extent.setSystemInfo("Operating System",os);
	    	
	    	//how to capture this values from the xml file dynamically for that this is the process
	    	//for browser
	    	String browser = testContext.getCurrentXmlTest().getParameter("browser");
	    	extent.setSystemInfo("Browser",browser);
	    	
	    	//this is for group information like sanity, regression , etc
	    	//it will capture the group and display in the report
	    	List<String> includedGroups = testContext.getCurrentXmlTest().getIncludedGroups();
	    	if(!includedGroups.isEmpty())
	    	{
	    		extent.setSystemInfo("Groups",includedGroups.toString());
	    	}
		  }
	    
	     //this method will trigger whenever my test method is got passed
	  	 public void onTestSuccess(ITestResult result) {
	  	    
	  		//this test method will do 
	  		 //by using extent in the extent report we are creating the new entry because
	  		 //as soon as test method got passed that entry we have to create in the report 
	  		 //by result  we can capture the name of the methods 
	  		 //result.getName() is the name of the test method
	  		 //we can capture the name of the test method by using result (public void onTestSuccess(ITestResult result))
	  		test = extent.createTest(result.getTestClass().getName());//create a new entry in the report from result object because
	  		//whenever on test success method is got triggered the result will capture the all the result information from the test method so
	  		//from that result we getting the which class we have executed from the result we will extract the class which class we have executed from that class we are getting the name of the class
	  		test.assignCategory (result.getMethod().getGroups());//to display groups in report
	  		test.log(Status.PASS,result.getName() + " got successfully executed");//it will update the status p/f/s
	  		
	  	  }
	  	 
	  	//this method will trigger whenever my test method is got failed
	 	public void onTestFailure(ITestResult result) {
	 	   
	 		//from the result it is getting the getTestClass and from that class we are getting the Name of the class with that name it is creating the new test entry in the report that is the meaning of it
	 		test = extent.createTest(result.getTestClass().getName());//create a new entry in the report
	 		
	 		//from the result it is getting the getMethod() whichever we executed and from that test method it is getting the groups 
	 		//in which group the test method is belongs to it is capturing those  groups and it will attach to the report as a assignCategory 
	 		test.assignCategory (result.getMethod().getGroups());//to display groups in report
	 		
	 		//this is we are updating the test cases failure information 
	 		test.log(Status.FAIL,result.getName() + " got failed");
	  		//Whenever over test method is failed we will get some exception  right will get some error messages 
	  		//those error message also we can log into the report additionaly for that we have writen below statement
	  		//result.getThrowable()  this method is used to get error message
	  		//will display in the report
	 		//printing the error message
	  		test.log(Status.INFO,result.getThrowable().getMessage());
	  		
	  		//attaching the screenshot of the failure 
	  		//on the screen wherever the failure is happened we need to capture the screenshot and attach the screenshot to the report
	  		try
	  		{
	  			//what this statement will do is 
	  			//in base class whatever we created in the baseclass we should also add one more a method which will capture the screen for that
	  			//first we will go back to the base class add that captureScreen() method because
	  			//capture screenshot method is common for all the testcase 
	  			String imgPath = new BaseClass().captureScreen(result.getName());
	  			test.addScreenCaptureFromPath(imgPath);
	  			
	  		}
	  		catch(IOException e1)
	  		{
	  			e1.printStackTrace();//it will display the exception message
	  		}
	 	  }
	 	
	 	//this method will trigger whenever my test method is got skipped
	      public void onTestSkipped(ITestResult result) {
		    
	    	    test = extent.createTest(result.getTestClass().getName());//create a new entry in the report
	    	    test.assignCategory (result.getMethod().getGroups());//to display groups in report
	    		test.log(Status.SKIP,result.getName() + " got skipped");
	    		//printing the error message
		  		test.log(Status.INFO,result.getThrowable().getMessage());
	    		
			
		  }
	      

	  	//this method will execute whenever all my tests are got finished  
	      //Only onfinish method will update the whole thing in the report
	  	public void onFinish(ITestContext textContext) {
	  	   //we need to call flush method from extend object
	  		//what will do flush method
	  		//it will write all the test information from the standard reportes to the output view 
	  		extent.flush();
	  		
	  		//to open report automatically for that we need to add this piece of code
	  		//What this will do means
	  		//from the project location , from the report folder and whatever report name we passed here that we are going to store in a variable  basically 
	  		//this is the path of the report
	  		//System.getProperty("user.dir")-> it will represents the location of the current project
	  		String pathOfExtentReport = System.getProperty("user.dir") + "\\reports\\"+ repName;
	  		File extentReport = new File(pathOfExtentReport);
	  		
	  		
	  		//why i put in the try catch block
	  		//for ex if this external report is not available this will throw the exception so that's the reason i put in the try catch block
	  		try
	  		{
	  			//Desktop  is a predefined class in this we have a method called getDesktop().browse (extentReport.toURI())
	  			//what this  method will do is 
	  			//this method will open the extentReport report on the browser automatically
	  			Desktop.getDesktop().browse(extentReport.toURI());
	  			
	  		}
	  		catch(IOException e)
	  		{
	  			e.printStackTrace();//it will display the exception message
	  		}
	  		
	  		
	  	  }
	 	
}
