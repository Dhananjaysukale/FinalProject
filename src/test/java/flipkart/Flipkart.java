package flipkart;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.ConfigReader;

public class Flipkart 
{

	public static ConfigReader config;
	public static WebDriver driver=null;
	public static Hashtable<String, Object> outputParameters=new Hashtable<String, Object>();
	
	public static  Hashtable<String, Object> browserLaunch(Object[]InputParameters)
	{
		try{
		String bname=(String) InputParameters[0];
		
		if(bname.equalsIgnoreCase("chrome"))
		{	
			config=new ConfigReader();
		System.setProperty("webdriver.chrome.driver",config.getDriverPathChrome());
		
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		}
		else if (bname.equalsIgnoreCase("FF"))
		{
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
			System.setProperty("webdriver.geckodriver.driver",config.getDriverPathFF());
			
		    driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed: browserLaunch, Input Given: " + InputParameters[0].toString() );
		
		}
	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "methodUsed: browserLaunch, Input Given: " + InputParameters[0].toString() );
	}
		return outputParameters;
		
	}
	public static Hashtable<String, Object> openApplication()
	{
		try{
		
		driver.get(config.getApplicationUrl());
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed: openApplication, Input Given: " +config.getApplicationUrl().toString() );
		
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed: openApplication, Input Given: " + config.getApplicationUrl().toString() );
		}
		
		return outputParameters;
	}
	public static Hashtable<String, Object> clickOnElement(Object[]InputParameters)
	{
		try{
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		String XPATH=(String) InputParameters[0];
	    driver.findElement(By.xpath(XPATH)).click();
	    
	    outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed: clickOnElement, Input Given: " + InputParameters[0].toString() );
	    
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed: clickOnElement, Input Given: " + InputParameters[0].toString() );
		}
		
		return outputParameters;
	}
	public static Hashtable<String, Object> moveToElement(Object[]InputParameters)
	{
		try{
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		String XPATH= (String) InputParameters[0];
		Actions act=new Actions(driver);
		WebElement a= driver.findElement(By.xpath(XPATH));
		act.moveToElement(a).build().perform();
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed: moveToElement, Input Given: " + InputParameters[0].toString() );
		
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed: moveToElement, Input Given: " + InputParameters[0].toString() );;
		}
		
		return outputParameters;
	}
	public static Hashtable<String, Object> sendKeys(Object[]InputParameters) 
	{
		try{
		
		String XPATH= (String) InputParameters[0];
		String USERNAME=(String) InputParameters[1];
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		 driver.findElement(By.xpath(XPATH)).sendKeys(USERNAME);
		 
		 outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed: sendKeys, Input Given: " + InputParameters[1].toString() );
		 
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed: sendKeys, Input Given: " + InputParameters[1].toString() );
		}
		
		return outputParameters;
	}

	public static Hashtable<String, Object> validation(Object[]InputParameters) 
	{
		try{
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		String XPATH= (String) InputParameters[0];                     //namexpath
		String text=(String) InputParameters[1];                      //name
		
		 String actualText=driver.findElement(By.xpath(XPATH)).getText();    //name
		 
		 if(actualText.equalsIgnoreCase(text))
		 {
			System.out.println("Test Case Passed"); 
		 }else
		 {
			 System.out.println("Test Case Failed"); 
		 }	
		 
		 outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed: validation, Input Given: " + InputParameters[1].toString() );
		 
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed: validation, Input Given: " + InputParameters[1].toString() );
		}
		
		return outputParameters;
	}
	
	public static Hashtable<String, Object> validationForInvalid(Object[]InputParameters) 
	{
		try{
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		String XPATH= (String) InputParameters[0];                     //namexpath
		String text=(String) InputParameters[1];                      //name
		
		 String actualText=driver.findElement(By.xpath(XPATH)).getText();    //name
		 
		 if(actualText.equalsIgnoreCase(text))
		 {
			System.out.println("Test Case Pass"); 
		 }
		 else
		 {
			 System.out.println("Test Case Fail"); 
		 }	
		 
		 outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed: validationForInvalid, Input Given: " + InputParameters[1].toString() );
		
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed: validationForInvalid, Input Given: " + InputParameters[1].toString() );
		}
		
		return outputParameters;
	}
	
	

	public static Hashtable<String, Object> browserClose()
	{
		
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		driver.close();
	
		
		
		return outputParameters;
	}
	
	
	public static Hashtable<String, Object> takeScreenshot() throws IOException
	{
		Date currentdate= new Date();
		String screenshotfilename=currentdate.toString().replace(" ", "-").replace(":","-");
		System.out.println(screenshotfilename);

		File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("P://screenshot//"+ screenshotfilename + ".png"));
		
		return outputParameters;
	}
}
