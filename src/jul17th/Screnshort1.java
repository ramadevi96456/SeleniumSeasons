package jul17th;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screnshort1 

{	

	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp()
	{

		      WebDriverManager.chromedriver();

	          driver=new ChromeDriver();
	          driver.get("https;//adactionhotelapp.com/");
	          driver.manage().window().maximize();
	         
	}                                   
	
	     
         
  
         @Test
         public void screenshotTest() throws IOException
         {   
         
              File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        	  FileUtils.copyFile(srcFile, new File("Adactin.com - Hotel Reservation System"));
         }				
        				
         @AfterMethod			
         public void teardown() throws InterruptedException
         {				
         Thread.sleep(3000);
        		      
         driver.quit();
         
      } 
         
}        
         