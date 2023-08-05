package browserluanch1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;





public class LinksTesting1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.icicibank.com/personal-banking/insta-banking/internet-banking");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	
	WebElement bl=driver.findElement(By.xpath("//h5[text()='POPULAR PRODUCTS']/parent::div"));
	List<WebElement> allLinks=bl.findElements(By.tagName("a"));
	System.out.println(allLinks.size());
	for(int i=0;i<allLinks.size();i++) {
		WebElement link = allLinks.get(i);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView(true);",bl );
		js.executeScript("window.scrollBy(0,4000);");
		Thread.sleep(2000);
		link.click();
		Thread.sleep(2000);
		driver.navigate().back();
		try
		{
			Thread.sleep(2000);
	
			driver.findElement(By.xpath("//img[contains(@src,'images/corporate/white_close-icon.svg')]")).click();
		}
		catch(Exception e)
		{
			
		}
		js.executeScript("window.scrollBy(0,-6000);");
		bl=driver.findElement(By.xpath("//h5[text()='POPULAR PRODUCTS']/parent::div"));
		 allLinks=bl.findElements(By.tagName("a"));
		 
	}
	driver.quit();
	

}}
