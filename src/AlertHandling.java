import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	WebDriver driver;
	private void ChromeOptionsopt();{
		// TODO Auto-generated method stub

	}
	
	@BeforeMethod
	public void setup()
	{
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https;//mail.rediff.com/cgibin/login.cgi");
		driver.manage().window().maximize();
		
		
		  
		@Test (priority=1)
		 public void longinNoUsernameNoPassordTest()throws InterruptedException
		 
		 {
		   
		 
	
		 
		       driver.findElement(By.xpath("//input[@name=\"proceed\"]")).click();
		    
		        
               Thread.sleep(3000);
		
                Alert a1=driver.switchTo().alert();
                
                assert.assertEquals(a1.getText(),"please enter a valid user name");
                		
                		
                		       a1.accept();
                     
               
